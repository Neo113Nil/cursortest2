package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zzahy implements zzagh {
    public static final int[] l = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] m = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] n;
    public static final byte[] o;
    public final byte[] a;
    public boolean b;
    public long c;
    public int d;
    public int e;
    public int f;
    public zzagk g;
    public zzaht h;
    public zzaht i;
    public zzahj j;
    public boolean k;

    static {
        String str = zzfm.a;
        Charset charset = StandardCharsets.UTF_8;
        n = "#!AMR\n".getBytes(charset);
        o = "#!AMR-WB\n".getBytes(charset);
    }

    public zzahy(int i) {
        this.a = new byte[1];
        this.f = -1;
        this.i = new zzage();
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void a(long j, long j2) {
        this.c = 0L;
        this.d = 0;
        this.e = 0;
    }

    public final boolean b(zzagi zzagiVar) {
        zzagiVar.zzl();
        byte[] bArr = n;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        zzagiVar.h(0, length, bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            this.b = false;
            zzagiVar.zzf(bArr.length);
            return true;
        }
        zzagiVar.zzl();
        byte[] bArr3 = o;
        int length2 = bArr3.length;
        byte[] bArr4 = new byte[length2];
        zzagiVar.h(0, length2, bArr4);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.b = true;
        zzagiVar.zzf(bArr3.length);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean c(zzagi zzagiVar) {
        return b(zzagiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void d(zzagk zzagkVar) {
        this.g = zzagkVar;
        zzaht b = zzagkVar.b(0, 1);
        this.h = b;
        this.i = b;
        zzagkVar.zzv();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a1 A[Catch: EOFException -> 0x00fa, TryCatch #0 {EOFException -> 0x00fa, blocks: (B:39:0x006f, B:41:0x007f, B:49:0x00a1, B:50:0x00a6, B:54:0x00a4, B:64:0x00b8, B:65:0x00db, B:66:0x00dc, B:67:0x00f9), top: B:38:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a4 A[Catch: EOFException -> 0x00fa, TryCatch #0 {EOFException -> 0x00fa, blocks: (B:39:0x006f, B:41:0x007f, B:49:0x00a1, B:50:0x00a6, B:54:0x00a4, B:64:0x00b8, B:65:0x00db, B:66:0x00dc, B:67:0x00f9), top: B:38:0x006f }] */
    @Override // com.google.android.gms.internal.ads.zzagh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(zzagi zzagiVar, zzahh zzahhVar) {
        char c;
        this.h.getClass();
        String str = zzfm.a;
        if (zzagiVar.zzn() == 0 && !b(zzagiVar)) {
            throw zzat.a(null, "Could not find AMR header.");
        }
        boolean z = this.k;
        int[] iArr = l;
        int[] iArr2 = m;
        if (!z) {
            this.k = true;
            boolean z2 = this.b;
            String str2 = MimeTypes.AUDIO_AMR_WB;
            String str3 = true != z2 ? "audio/amr" : MimeTypes.AUDIO_AMR_WB;
            if (true != z2) {
                str2 = MimeTypes.AUDIO_AMR_NB;
            }
            int i = true != z2 ? 8000 : 16000;
            int i2 = z2 ? iArr2[8] : iArr[7];
            zzaht zzahtVar = this.h;
            zzt zztVar = new zzt();
            zztVar.c(str3);
            zztVar.d(str2);
            zztVar.o = i2;
            zztVar.G = 1;
            zztVar.I = i;
            zzahtVar.e(new zzv(zztVar));
        }
        int i3 = this.e;
        if (i3 == 0) {
            try {
                zzagiVar.zzl();
                byte[] bArr = this.a;
                zzagiVar.h(0, 1, bArr);
                byte b = bArr[0];
                if ((b & 131) > 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf((int) b).length() + 38);
                    sb.append("Invalid padding bits for frame header ");
                    sb.append((int) b);
                    throw zzat.a(null, sb.toString());
                }
                boolean z3 = this.b;
                int i4 = (b >> 3) & 15;
                if (z3) {
                    if (i4 >= 10) {
                        if (i4 > 13) {
                        }
                    }
                    i3 = !z3 ? iArr2[i4] : iArr[i4];
                    this.d = i3;
                    this.e = i3;
                    if (this.f == -1) {
                        this.f = i3;
                    }
                }
                if (!z3) {
                    if (i4 >= 12 && i4 <= 14) {
                    }
                    if (!z3) {
                    }
                    this.d = i3;
                    this.e = i3;
                    if (this.f == -1) {
                    }
                }
                String str4 = true != z3 ? "NB" : "WB";
                StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 26);
                sb2.append("Illegal AMR ");
                sb2.append(str4);
                sb2.append(" frame type ");
                sb2.append(i4);
                throw zzat.a(null, sb2.toString());
            } catch (EOFException unused) {
            }
        }
        int d = this.i.d(zzagiVar, i3, true);
        if (d != -1) {
            int i5 = this.e - d;
            this.e = i5;
            if (i5 <= 0) {
                this.i.f(this.c, 1, this.d, 0, null);
                this.c += 20000;
            }
            c = 0;
            if (this.j == null) {
                zzahj zzahjVar = new zzahj(C.TIME_UNSET, 0L);
                this.j = zzahjVar;
                this.g.c(zzahjVar);
            }
            return c != 65535 ? -1 : 0;
        }
        c = 65535;
        if (this.j == null) {
        }
        if (c != 65535) {
        }
    }

    public zzahy() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }
}
