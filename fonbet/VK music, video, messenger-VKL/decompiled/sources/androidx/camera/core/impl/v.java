package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.Config;
import xsna.g8s0;
import xsna.jqo0;

/* compiled from: VideoCaptureConfig.java */
/* loaded from: classes11.dex */
public final class v implements u<g8s0>, l, jqo0 {
    public static final a A;
    public static final a t;
    public static final a u;
    public static final a v;
    public static final a w;
    public static final a x;
    public static final a y;
    public static final a z;
    public final o s;

    static {
        Class cls = Integer.TYPE;
        t = Config.a.a(cls, "camerax.core.videoCapture.recordingFrameRate");
        u = Config.a.a(cls, "camerax.core.videoCapture.bitRate");
        v = Config.a.a(cls, "camerax.core.videoCapture.intraFrameInterval");
        w = Config.a.a(cls, "camerax.core.videoCapture.audioBitRate");
        x = Config.a.a(cls, "camerax.core.videoCapture.audioSampleRate");
        y = Config.a.a(cls, "camerax.core.videoCapture.audioChannelCount");
        z = Config.a.a(cls, "camerax.core.videoCapture.audioRecordSource");
        A = Config.a.a(cls, "camerax.core.videoCapture.audioMinBufferSize");
    }

    public v(@NonNull o oVar) {
        this.s = oVar;
    }

    @Override // androidx.camera.core.impl.q
    @NonNull
    public final Config getConfig() {
        return this.s;
    }

    @Override // androidx.camera.core.impl.k
    public final int getInputFormat() {
        return 34;
    }
}
