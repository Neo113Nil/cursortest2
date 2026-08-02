package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import defpackage.c74;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zziv {
    public byte[] a;
    public byte[] b;
    public int c;
    public int[] d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    public final MediaCodec.CryptoInfo i;
    public final c74 j;

    public zziv() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.i = cryptoInfo;
        this.j = new c74(cryptoInfo, 2);
    }

    public final void a(int i) {
        if (i == 0) {
            return;
        }
        int[] iArr = this.d;
        if (iArr == null) {
            iArr = new int[1];
            this.d = iArr;
            this.i.numBytesOfClearData = iArr;
        }
        iArr[0] = iArr[0] + i;
    }
}
