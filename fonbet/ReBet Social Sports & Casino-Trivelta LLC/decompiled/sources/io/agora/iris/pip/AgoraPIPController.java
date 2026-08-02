package io.agora.iris.pip;

import android.app.PictureInPictureParams;
import android.app.PictureInPictureUiState;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Rational;
import java.lang.ref.WeakReference;
import u4.G;

/* loaded from: classes2.dex */
public class AgoraPIPController implements AgoraPIPActivityListener {
    private static final long CHECK_INTERVAL_MS = 100;
    private final WeakReference<AgoraPIPActivityProxy> mActivityProxy;
    private Runnable mCheckStateTask;
    private boolean mIsAutoEnterSupported;
    private boolean mIsSupported;
    private final PIPStateChangedListener mListener;
    private PIPParams mPIPParams;
    private PictureInPictureParams.Builder mParamsBuilder;
    private boolean mLastPIPState = false;
    private Handler mHandler = new Handler(Looper.getMainLooper());

    public static class PIPParams {
        private final Rational aspectRatio;
        private final Boolean autoEnterEnabled;
        private final Integer externalStateMonitorInterval;
        private final Boolean seamlessResizeEnabled;
        private final Rect sourceRectHint;
        private final Boolean useExternalStateMonitor;

        public PIPParams(Rational rational, Boolean bool, Rect rect, Boolean bool2, Boolean bool3, Integer num) {
            this.aspectRatio = rational;
            this.autoEnterEnabled = bool;
            this.sourceRectHint = rect;
            this.seamlessResizeEnabled = bool2;
            this.useExternalStateMonitor = bool3;
            this.externalStateMonitorInterval = num;
        }
    }

    public enum PIPState {
        Started(0),
        Stopped(1),
        Failed(2);

        private final int value;

        PIPState(int i10) {
            this.value = i10;
        }

        public int getValue() {
            return this.value;
        }
    }

    public interface PIPStateChangedListener {
        void onPIPStateChangedListener(PIPState pIPState, String str);
    }

    public AgoraPIPController(AgoraPIPActivityProxy agoraPIPActivityProxy, PIPStateChangedListener pIPStateChangedListener) {
        this.mIsSupported = false;
        this.mIsAutoEnterSupported = false;
        this.mListener = pIPStateChangedListener;
        if (agoraPIPActivityProxy == null) {
            this.mIsSupported = false;
            this.mIsAutoEnterSupported = false;
            this.mActivityProxy = new WeakReference<>(null);
        } else {
            this.mActivityProxy = new WeakReference<>(agoraPIPActivityProxy);
            agoraPIPActivityProxy.setAgoraPIPActivityListener(this);
            this.mIsSupported = checkPIPSupport();
            this.mIsAutoEnterSupported = checkAutoEnterSupport();
        }
    }

    private boolean checkAutoEnterSupport() {
        return Build.VERSION.SDK_INT >= 31 || this.mActivityProxy.get() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkPIPState() {
        boolean isActivated = isActivated();
        if (isActivated != this.mLastPIPState) {
            this.mLastPIPState = isActivated;
            notifyPIPStateChanged(isActivated ? PIPState.Started : PIPState.Stopped, null);
        }
    }

    private boolean checkPIPSupport() {
        PackageManager packageManager;
        AgoraPIPActivityProxy agoraPIPActivityProxy = this.mActivityProxy.get();
        if (agoraPIPActivityProxy == null || Build.VERSION.SDK_INT < 26 || (packageManager = agoraPIPActivityProxy.getApplicationContext().getPackageManager()) == null) {
            return false;
        }
        return packageManager.hasSystemFeature("android.software.picture_in_picture");
    }

    private boolean isPIPEnabled() {
        return (this.mPIPParams == null || this.mParamsBuilder == null) ? false : true;
    }

    private void notifyPIPStateChanged(PIPState pIPState, String str) {
        PIPStateChangedListener pIPStateChangedListener = this.mListener;
        if (pIPStateChangedListener != null) {
            pIPStateChangedListener.onPIPStateChangedListener(pIPState, str);
        }
    }

    private void startStateMonitoring() {
        if (this.mActivityProxy.get() == null || Boolean.TRUE.equals(this.mPIPParams.useExternalStateMonitor)) {
            if (this.mHandler == null) {
                this.mHandler = new Handler(Looper.getMainLooper());
            }
            if (this.mCheckStateTask != null) {
                return;
            }
            Runnable runnable = new Runnable() { // from class: io.agora.iris.pip.AgoraPIPController.1
                @Override // java.lang.Runnable
                public void run() {
                    AgoraPIPController.this.checkPIPState();
                    AgoraPIPController.this.mHandler.postDelayed(this, AgoraPIPController.this.mPIPParams.externalStateMonitorInterval != null ? AgoraPIPController.this.mPIPParams.externalStateMonitorInterval.longValue() : AgoraPIPController.CHECK_INTERVAL_MS);
                }
            };
            this.mCheckStateTask = runnable;
            this.mHandler.post(runnable);
        }
    }

    private void stopStateMonitoring() {
        Runnable runnable;
        Handler handler = this.mHandler;
        if (handler == null || (runnable = this.mCheckStateTask) == null) {
            return;
        }
        handler.removeCallbacks(runnable);
    }

    public void dispose() {
        PictureInPictureParams.Builder autoEnterEnabled;
        PictureInPictureParams build;
        stopStateMonitoring();
        AgoraPIPActivityProxy agoraPIPActivityProxy = this.mActivityProxy.get();
        if (agoraPIPActivityProxy != null && Build.VERSION.SDK_INT >= 31) {
            autoEnterEnabled = G.a().setAutoEnterEnabled(false);
            build = autoEnterEnabled.build();
            agoraPIPActivityProxy.setPictureInPictureParams(build);
        }
        this.mPIPParams = null;
        this.mParamsBuilder = null;
        this.mHandler = null;
        this.mLastPIPState = false;
        this.mCheckStateTask = null;
    }

    public boolean isActivated() {
        AgoraPIPActivityProxy agoraPIPActivityProxy = this.mActivityProxy.get();
        return agoraPIPActivityProxy != null && isSupported() && agoraPIPActivityProxy.isInPictureInPictureMode();
    }

    public boolean isAutoEnterSupported() {
        return this.mIsAutoEnterSupported;
    }

    public boolean isSupported() {
        return this.mIsSupported;
    }

    @Override // io.agora.iris.pip.AgoraPIPActivityListener
    public void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        PIPParams pIPParams = this.mPIPParams;
        if (pIPParams == null || !Boolean.TRUE.equals(pIPParams.useExternalStateMonitor)) {
            if (z10) {
                notifyPIPStateChanged(PIPState.Started, null);
            } else {
                notifyPIPStateChanged(PIPState.Stopped, null);
            }
        }
    }

    @Override // io.agora.iris.pip.AgoraPIPActivityListener
    public boolean onPictureInPictureRequested() {
        return false;
    }

    @Override // io.agora.iris.pip.AgoraPIPActivityListener
    public void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
    }

    @Override // io.agora.iris.pip.AgoraPIPActivityListener
    public void onUserLeaveHint() {
        PIPParams pIPParams;
        if (Build.VERSION.SDK_INT >= 31 || (pIPParams = this.mPIPParams) == null || !Boolean.TRUE.equals(pIPParams.autoEnterEnabled)) {
            return;
        }
        start();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v2 java.lang.Integer, still in use, count: 2, list:
          (r9v2 java.lang.Integer) from 0x0070: INVOKE 
          (wrap:java.lang.Integer:0x006a: IGET 
          (wrap:io.agora.iris.pip.AgoraPIPController$PIPParams:0x0068: IGET (r10v0 'this' io.agora.iris.pip.AgoraPIPController A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] (LINE:105) io.agora.iris.pip.AgoraPIPController.mPIPParams io.agora.iris.pip.AgoraPIPController$PIPParams)
         A[MD:(io.agora.iris.pip.AgoraPIPController$PIPParams):java.lang.Integer (m), WRAPPED] (LINE:1) io.agora.iris.pip.AgoraPIPController.PIPParams.externalStateMonitorInterval java.lang.Integer)
          (r9v2 java.lang.Integer)
         STATIC call: java.util.Objects.equals(java.lang.Object, java.lang.Object):boolean A[MD:(java.lang.Object, java.lang.Object):boolean (c), WRAPPED] (LINE:113)
          (r9v2 java.lang.Integer) from 0x0079: PHI (r9v1 java.lang.Integer) = (r9v2 java.lang.Integer) binds: [B:27:0x0074] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public boolean setup(android.util.Rational r11, java.lang.Boolean r12, android.graphics.Rect r13, java.lang.Boolean r14, java.lang.Boolean r15, java.lang.Integer r16) {
        /*
            r10 = this;
            boolean r0 = r10.isSupported()
            r1 = 0
            if (r0 != 0) goto Lf
            io.agora.iris.pip.AgoraPIPController$PIPState r11 = io.agora.iris.pip.AgoraPIPController.PIPState.Failed
            java.lang.String r12 = "PIP is not supported"
            r10.notifyPIPStateChanged(r11, r12)
            return r1
        Lf:
            java.lang.ref.WeakReference<io.agora.iris.pip.AgoraPIPActivityProxy> r0 = r10.mActivityProxy
            java.lang.Object r0 = r0.get()
            io.agora.iris.pip.AgoraPIPActivityProxy r0 = (io.agora.iris.pip.AgoraPIPActivityProxy) r0
            if (r0 != 0) goto L1a
            return r1
        L1a:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto Le4
            android.app.PictureInPictureParams$Builder r2 = r10.mParamsBuilder
            if (r2 != 0) goto L2a
            android.app.PictureInPictureParams$Builder r2 = u4.G.a()
            r10.mParamsBuilder = r2
        L2a:
            io.agora.iris.pip.AgoraPIPController$PIPParams r2 = r10.mPIPParams
            if (r2 == 0) goto L77
            android.util.Rational r2 = io.agora.iris.pip.AgoraPIPController.PIPParams.access$000(r2)
            boolean r2 = java.util.Objects.equals(r2, r11)
            if (r2 == 0) goto L77
            io.agora.iris.pip.AgoraPIPController$PIPParams r2 = r10.mPIPParams
            java.lang.Boolean r2 = io.agora.iris.pip.AgoraPIPController.PIPParams.access$100(r2)
            boolean r2 = java.util.Objects.equals(r2, r12)
            if (r2 == 0) goto L77
            io.agora.iris.pip.AgoraPIPController$PIPParams r2 = r10.mPIPParams
            android.graphics.Rect r2 = io.agora.iris.pip.AgoraPIPController.PIPParams.access$200(r2)
            boolean r2 = java.util.Objects.equals(r2, r13)
            if (r2 == 0) goto L77
            io.agora.iris.pip.AgoraPIPController$PIPParams r2 = r10.mPIPParams
            java.lang.Boolean r2 = io.agora.iris.pip.AgoraPIPController.PIPParams.access$300(r2)
            boolean r2 = java.util.Objects.equals(r2, r14)
            if (r2 == 0) goto L77
            io.agora.iris.pip.AgoraPIPController$PIPParams r2 = r10.mPIPParams
            java.lang.Boolean r2 = io.agora.iris.pip.AgoraPIPController.PIPParams.access$400(r2)
            boolean r2 = java.util.Objects.equals(r2, r15)
            if (r2 == 0) goto L77
            io.agora.iris.pip.AgoraPIPController$PIPParams r2 = r10.mPIPParams
            java.lang.Integer r2 = io.agora.iris.pip.AgoraPIPController.PIPParams.access$500(r2)
            r9 = r16
            boolean r2 = java.util.Objects.equals(r2, r9)
            if (r2 != 0) goto L85
            goto L79
        L77:
            r9 = r16
        L79:
            io.agora.iris.pip.AgoraPIPController$PIPParams r3 = new io.agora.iris.pip.AgoraPIPController$PIPParams
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r10.mPIPParams = r3
        L85:
            io.agora.iris.pip.AgoraPIPController$PIPParams r11 = r10.mPIPParams
            android.util.Rational r11 = io.agora.iris.pip.AgoraPIPController.PIPParams.access$000(r11)
            if (r11 == 0) goto L98
            android.app.PictureInPictureParams$Builder r11 = r10.mParamsBuilder
            io.agora.iris.pip.AgoraPIPController$PIPParams r12 = r10.mPIPParams
            android.util.Rational r12 = io.agora.iris.pip.AgoraPIPController.PIPParams.access$000(r12)
            u4.AbstractC6494E.a(r11, r12)
        L98:
            r11 = 31
            if (r1 < r11) goto Lad
            android.app.PictureInPictureParams$Builder r12 = r10.mParamsBuilder
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            io.agora.iris.pip.AgoraPIPController$PIPParams r14 = r10.mPIPParams
            java.lang.Boolean r14 = io.agora.iris.pip.AgoraPIPController.PIPParams.access$100(r14)
            boolean r13 = r13.equals(r14)
            u4.AbstractC6508n.a(r12, r13)
        Lad:
            io.agora.iris.pip.AgoraPIPController$PIPParams r12 = r10.mPIPParams
            android.graphics.Rect r12 = io.agora.iris.pip.AgoraPIPController.PIPParams.access$200(r12)
            if (r12 == 0) goto Lc0
            android.app.PictureInPictureParams$Builder r12 = r10.mParamsBuilder
            io.agora.iris.pip.AgoraPIPController$PIPParams r13 = r10.mPIPParams
            android.graphics.Rect r13 = io.agora.iris.pip.AgoraPIPController.PIPParams.access$200(r13)
            u4.AbstractC6513t.a(r12, r13)
        Lc0:
            if (r1 < r11) goto Ldb
            io.agora.iris.pip.AgoraPIPController$PIPParams r11 = r10.mPIPParams
            java.lang.Boolean r11 = io.agora.iris.pip.AgoraPIPController.PIPParams.access$300(r11)
            if (r11 == 0) goto Ldb
            android.app.PictureInPictureParams$Builder r11 = r10.mParamsBuilder
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            io.agora.iris.pip.AgoraPIPController$PIPParams r13 = r10.mPIPParams
            java.lang.Boolean r13 = io.agora.iris.pip.AgoraPIPController.PIPParams.access$300(r13)
            boolean r12 = r12.equals(r13)
            io.agora.iris.pip.a.a(r11, r12)
        Ldb:
            android.app.PictureInPictureParams$Builder r11 = r10.mParamsBuilder
            android.app.PictureInPictureParams r11 = u4.AbstractC6509o.a(r11)
            r0.setPictureInPictureParams(r11)
        Le4:
            r10.startStateMonitoring()
            r11 = 1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.iris.pip.AgoraPIPController.setup(android.util.Rational, java.lang.Boolean, android.graphics.Rect, java.lang.Boolean, java.lang.Boolean, java.lang.Integer):boolean");
    }

    public boolean start() {
        PictureInPictureParams build;
        if (!isSupported()) {
            notifyPIPStateChanged(PIPState.Failed, "PIP is not supported");
            return false;
        }
        boolean z10 = true;
        if (isActivated()) {
            return true;
        }
        AgoraPIPActivityProxy agoraPIPActivityProxy = this.mActivityProxy.get();
        if (agoraPIPActivityProxy == null) {
            return false;
        }
        if (!isPIPEnabled()) {
            notifyPIPStateChanged(PIPState.Failed, "PIP is not setup");
            return false;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            build = this.mParamsBuilder.build();
            z10 = agoraPIPActivityProxy.enterPictureInPictureMode(build);
        } else {
            agoraPIPActivityProxy.enterPictureInPictureMode();
        }
        if (!z10) {
            notifyPIPStateChanged(PIPState.Failed, "Failed to enter PiP mode");
        }
        return z10;
    }

    public void stop() {
        if (!isSupported() || !isActivated()) {
            notifyPIPStateChanged(PIPState.Failed, "PIP is not supported or not activated");
            return;
        }
        AgoraPIPActivityProxy agoraPIPActivityProxy = this.mActivityProxy.get();
        if (agoraPIPActivityProxy == null) {
            return;
        }
        agoraPIPActivityProxy.moveTaskToBack(false);
    }
}
