package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteOrder;
import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzagu {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final zzagt k;
    public final zzap l;

    public zzagu(byte[] bArr, int i) {
        zzet zzetVar = new zzet(bArr, bArr.length);
        zzetVar.d(i * 8);
        this.a = zzetVar.h(16);
        this.b = zzetVar.h(16);
        this.c = zzetVar.h(24);
        this.d = zzetVar.h(24);
        int h = zzetVar.h(20);
        this.e = h;
        this.f = c(h);
        this.g = zzetVar.h(3) + 1;
        int h2 = zzetVar.h(5) + 1;
        this.h = h2;
        this.i = d(h2);
        this.j = zzetVar.i(36);
        this.k = null;
        this.l = null;
    }

    public static int c(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public static int d(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    public final long a() {
        long j = this.j;
        return j == 0 ? C.TIME_UNSET : (j * 1000000) / this.e;
    }

    public final zzv b(byte[] bArr, zzap zzapVar) {
        bArr[4] = Byte.MIN_VALUE;
        zzap zzapVar2 = this.l;
        if (zzapVar2 != null) {
            zzapVar = zzapVar2.a(zzapVar);
        }
        zzt zztVar = new zzt();
        zztVar.d(MimeTypes.AUDIO_FLAC);
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        zztVar.o = i;
        zztVar.G = this.g;
        zztVar.I = this.e;
        zztVar.J = zzfm.b(this.h, ByteOrder.LITTLE_ENDIAN);
        zztVar.q = Collections.singletonList(bArr);
        zztVar.k = zzapVar;
        return new zzv(zztVar);
    }

    public zzagu(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, zzagt zzagtVar, zzap zzapVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = c(i5);
        this.g = i6;
        this.h = i7;
        this.i = d(i7);
        this.j = j;
        this.k = zzagtVar;
        this.l = zzapVar;
    }
}
