package androidx.media3.exoplayer.video;

import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import xsna.hq10;

/* loaded from: classes12.dex */
public class MediaCodecVideoDecoderException extends MediaCodecDecoderException {
    public final boolean isSurfaceValid;
    public final int surfaceIdentityHashCode;

    public MediaCodecVideoDecoderException(IllegalStateException illegalStateException, @Nullable hq10 hq10Var, @Nullable Surface surface) {
        super(illegalStateException, hq10Var);
        this.surfaceIdentityHashCode = System.identityHashCode(surface);
        this.isSurfaceValid = surface == null || surface.isValid();
    }
}
