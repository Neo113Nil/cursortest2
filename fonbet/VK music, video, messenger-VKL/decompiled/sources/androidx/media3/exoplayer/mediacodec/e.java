package androidx.media3.exoplayer.mediacodec;

import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import java.util.List;
import xsna.hq10;
import xsna.qq;

/* compiled from: MediaCodecSelector.java */
/* loaded from: classes12.dex */
public interface e {
    public static final qq T6 = new qq(15);

    List<hq10> getDecoderInfos(String str, boolean z, boolean z2) throws MediaCodecUtil.DecoderQueryException;
}
