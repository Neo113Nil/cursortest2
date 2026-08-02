package defpackage;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzaht;
import com.google.android.gms.internal.ads.zzeu;
import com.google.android.gms.internal.ads.zzguk;
import com.google.android.gms.internal.ads.zzhs;
import com.google.android.gms.internal.ads.zzhw;
import com.google.android.gms.internal.ads.zziq;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wbp implements zzhs {
    public final zzhs a;
    public final int b;
    public final vdp c;
    public final byte[] d;
    public int e;

    public wbp(zzhs zzhsVar, int i, vdp vdpVar) {
        zzguk.a(i > 0);
        this.a = zzhsVar;
        this.b = i;
        this.c = vdpVar;
        this.d = new byte[1];
        this.e = i;
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final long a(zzhw zzhwVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int b(int i, int i2, byte[] bArr) {
        int i3 = this.e;
        zzhs zzhsVar = this.a;
        if (i3 == 0) {
            int i4 = 0;
            byte[] bArr2 = this.d;
            if (zzhsVar.b(0, 1, bArr2) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int b = zzhsVar.b(i4, i6, bArr3);
                        if (b != -1) {
                            i4 += b;
                            i6 -= b;
                        }
                    }
                    while (i5 > 0) {
                        int i7 = i5 - 1;
                        if (bArr3[i7] != 0) {
                            break;
                        }
                        i5 = i7;
                    }
                    if (i5 > 0) {
                        zzeu zzeuVar = new zzeu(bArr3, i5);
                        vdp vdpVar = this.c;
                        long max = !vdpVar.l ? vdpVar.i : Math.max(vdpVar.m.r(true), vdpVar.i);
                        int B = zzeuVar.B();
                        zzaht zzahtVar = vdpVar.k;
                        zzahtVar.getClass();
                        zzahtVar.b(B, zzeuVar);
                        zzahtVar.f(max, 1, B, 0, null);
                        vdpVar.l = true;
                    }
                }
                i3 = this.b;
                this.e = i3;
            }
            return -1;
        }
        int b2 = zzhsVar.b(i, Math.min(i3, i2), bArr);
        if (b2 != -1) {
            this.e -= b2;
        }
        return b2;
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final void c(zziq zziqVar) {
        zziqVar.getClass();
        this.a.c(zziqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final Uri zzc() {
        return this.a.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final void zzd() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final Map zzj() {
        return this.a.zzj();
    }
}
