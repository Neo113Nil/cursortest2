package io.agora.base.internal.voiceengine.earmonitor;

import io.agora.base.internal.Logging;
import io.agora.base.internal.voiceengine.BuildInfo;

/* loaded from: classes2.dex */
public class HardwareEarMonitorController implements HardwareEarMonitorListener {
    private static final String TAG = "HardwareEarMonitorController";
    private IHardwareEarMonitor mHardwareEarMonitor;
    private int mHardwareEarMonitorState = 0;
    private boolean mHardwareEarMonitorSupported = false;
    private int mVolume = 0;

    public HardwareEarMonitorController(boolean z10) {
        this.mHardwareEarMonitor = null;
        if (!z10) {
            Logging.w(TAG, "config to disable hw earmonitor success");
            return;
        }
        String deviceManufacturer = BuildInfo.getDeviceManufacturer();
        Logging.w(TAG, "device manufacturer is: " + deviceManufacturer);
        this.mHardwareEarMonitor = HardwareEarMonitorFactory.create(deviceManufacturer.trim().toLowerCase(), this);
    }

    public int enableHardwareEarMonitor(boolean z10) {
        IHardwareEarMonitor iHardwareEarMonitor = this.mHardwareEarMonitor;
        if (iHardwareEarMonitor == null) {
            return -7;
        }
        int enableHardwareEarMonitor = iHardwareEarMonitor.enableHardwareEarMonitor(z10);
        if (enableHardwareEarMonitor == 0 && z10) {
            int i10 = this.mVolume;
            setHardwareEarMonitorVolume(i10 - 1);
            setHardwareEarMonitorVolume(i10);
        }
        return enableHardwareEarMonitor;
    }

    public void initialize() {
        if (this.mHardwareEarMonitorState == 3) {
            Logging.w(TAG, "already initialized, ignore");
            return;
        }
        IHardwareEarMonitor iHardwareEarMonitor = this.mHardwareEarMonitor;
        if (iHardwareEarMonitor != null) {
            this.mHardwareEarMonitorState = 1;
            iHardwareEarMonitor.initialize();
        }
    }

    public boolean isHardwareEarMonitorSupported() {
        Logging.w(TAG, HardwareEarMonitorUtils.getDescriptionByState(this.mHardwareEarMonitorState));
        if (this.mHardwareEarMonitorState == 3) {
            return this.mHardwareEarMonitorSupported;
        }
        return false;
    }

    @Override // io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorListener
    public void onHardwareEarMonitorSupported(boolean z10) {
        this.mHardwareEarMonitorSupported = z10;
    }

    @Override // io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorListener
    public void onInitResult(int i10) {
        Logging.w(TAG, "onInitResult: " + i10);
        this.mHardwareEarMonitorState = 3;
        if (i10 == 2) {
            this.mHardwareEarMonitorState = 2;
            this.mHardwareEarMonitorSupported = false;
        }
    }

    public void setHardwareEarMonitor(IHardwareEarMonitor iHardwareEarMonitor) {
        this.mHardwareEarMonitor = iHardwareEarMonitor;
    }

    public int setHardwareEarMonitorVolume(int i10) {
        IHardwareEarMonitor iHardwareEarMonitor = this.mHardwareEarMonitor;
        if (iHardwareEarMonitor == null) {
            return -7;
        }
        this.mVolume = i10;
        return iHardwareEarMonitor.setHardwareEarMonitorVolume(i10);
    }

    public void terminate() {
        IHardwareEarMonitor iHardwareEarMonitor = this.mHardwareEarMonitor;
        if (iHardwareEarMonitor != null) {
            iHardwareEarMonitor.destroy();
            this.mHardwareEarMonitor = null;
        }
    }
}
