package io.agora.rtc2;

import android.opengl.EGLContext;

/* loaded from: classes3.dex */
public abstract class RtcEngineInternal extends RtcEngineEx {
    public abstract int enableTransportQualityIndication(boolean z10);

    public abstract String makeQualityReportUrl(String str, String str2, String str3, int i10);

    public abstract int monitorAudioRouteChange(boolean z10);

    public abstract int setApiCallMode(int i10);

    public abstract int setProfile(String str, boolean z10);

    public abstract int setTextureId(int i10, EGLContext eGLContext, int i11, int i12, long j10);

    public abstract int setTextureId(int i10, javax.microedition.khronos.egl.EGLContext eGLContext, int i11, int i12, long j10);

    public abstract int updateSharedContext(EGLContext eGLContext);

    public abstract int updateSharedContext(javax.microedition.khronos.egl.EGLContext eGLContext);
}
