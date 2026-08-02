package defpackage;

import android.media.MediaCodec;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d74 {
    public byte[] a;
    public byte[] b;
    public int c;
    public int[] d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    public final MediaCodec.CryptoInfo i;
    public final Object j;

    public d74(int i) {
        switch (i) {
            case 1:
                MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
                this.i = cryptoInfo;
                this.j = new c74(cryptoInfo, 1);
                break;
            default:
                MediaCodec.CryptoInfo cryptoInfo2 = new MediaCodec.CryptoInfo();
                this.i = cryptoInfo2;
                this.j = lik.a >= 24 ? new c74(cryptoInfo2, 0) : null;
                break;
        }
    }
}
