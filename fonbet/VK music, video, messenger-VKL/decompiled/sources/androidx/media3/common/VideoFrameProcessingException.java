package androidx.media3.common;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.k0;
import xsna.fo8;

/* loaded from: classes12.dex */
public final class VideoFrameProcessingException extends Exception {
    public final long presentationTimeUs;

    public VideoFrameProcessingException(Throwable th) {
        this(C.TIME_UNSET, th);
    }

    public static VideoFrameProcessingException a(long j, Exception exc) {
        return exc instanceof VideoFrameProcessingException ? (VideoFrameProcessingException) exc : new VideoFrameProcessingException(j, exc);
    }

    public VideoFrameProcessingException(long j, Throwable th) {
        super(j == C.TIME_UNSET ? " @UNSET" : k0.a(j, " @"), th);
        this.presentationTimeUs = j;
    }

    public VideoFrameProcessingException(String str) {
        super(fo8.a(str, " @UNSET"));
        this.presentationTimeUs = C.TIME_UNSET;
    }
}
