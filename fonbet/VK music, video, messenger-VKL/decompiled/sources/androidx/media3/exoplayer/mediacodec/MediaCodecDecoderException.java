package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import androidx.media3.decoder.DecoderException;
import xsna.hq10;

/* loaded from: classes12.dex */
public class MediaCodecDecoderException extends DecoderException {

    @Nullable
    public final hq10 codecInfo;

    @Nullable
    public final String diagnosticInfo;
    public final int errorCode;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MediaCodecDecoderException(IllegalStateException illegalStateException, @Nullable hq10 hq10Var) {
        super(r0.toString(), illegalStateException);
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(hq10Var == null ? null : hq10Var.a);
        this.codecInfo = hq10Var;
        boolean z = illegalStateException instanceof MediaCodec.CodecException;
        this.diagnosticInfo = z ? ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo() : null;
        this.errorCode = z ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0;
    }
}
