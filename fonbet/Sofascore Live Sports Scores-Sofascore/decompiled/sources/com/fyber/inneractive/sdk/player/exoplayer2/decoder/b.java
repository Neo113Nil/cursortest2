package com.fyber.inneractive.sdk.player.exoplayer2.decoder;

import android.media.MediaCodec;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class b {
    public byte[] a;
    public int[] b;
    public int[] c;
    public final MediaCodec.CryptoInfo d;
    public final a e;

    public b() {
        int i = z.a;
        MediaCodec.CryptoInfo cryptoInfo = i >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.d = cryptoInfo;
        this.e = i >= 24 ? new a(cryptoInfo) : null;
    }

    public final void a(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2) {
        this.b = iArr;
        this.c = iArr2;
        this.a = bArr2;
        int i2 = z.a;
        if (i2 >= 16) {
            MediaCodec.CryptoInfo cryptoInfo = this.d;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr;
            cryptoInfo.iv = bArr2;
            cryptoInfo.mode = 1;
            if (i2 >= 24) {
                a.a(this.e);
            }
        }
    }
}
