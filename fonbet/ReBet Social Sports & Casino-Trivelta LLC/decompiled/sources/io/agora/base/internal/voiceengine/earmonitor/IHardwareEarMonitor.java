package io.agora.base.internal.voiceengine.earmonitor;

/* loaded from: classes2.dex */
public interface IHardwareEarMonitor {
    void destroy();

    int enableHardwareEarMonitor(boolean z10);

    void initialize();

    boolean isHardwareEarMonitorSupported();

    int setHardwareEarMonitorVolume(int i10);
}
