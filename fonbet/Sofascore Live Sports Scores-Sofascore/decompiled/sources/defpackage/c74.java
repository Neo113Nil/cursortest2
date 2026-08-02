package defpackage;

import android.media.MediaCodec;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class c74 {
    public final MediaCodec.CryptoInfo a;
    public final MediaCodec.CryptoInfo.Pattern b;

    public c74(MediaCodec.CryptoInfo cryptoInfo, int i) {
        switch (i) {
            case 1:
                this.a = cryptoInfo;
                this.b = new MediaCodec.CryptoInfo.Pattern(0, 0);
                break;
            case 2:
                this.a = cryptoInfo;
                this.b = new MediaCodec.CryptoInfo.Pattern(0, 0);
                break;
            default:
                this.a = cryptoInfo;
                this.b = new MediaCodec.CryptoInfo.Pattern(0, 0);
                break;
        }
    }
}
