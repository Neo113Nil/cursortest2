package defpackage;

import com.google.android.gms.internal.ads.zzagg;
import com.google.android.gms.internal.ads.zzaht;
import com.google.android.gms.internal.ads.zzamx;
import com.google.android.gms.internal.ads.zzamz;
import com.google.android.gms.internal.ads.zzeu;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zzv;
import com.inmobi.media.core.config.models.AdConfig;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class hhn {
    public final zzaht a;
    public zzamz d;
    public zgn e;
    public int f;
    public int g;
    public int h;
    public int i;
    public zzv l;
    public zzv m;
    public boolean n;
    public final msj b = new msj(2);
    public final zzeu c = new zzeu();
    public final zzeu j = new zzeu(1);
    public final zzeu k = new zzeu();

    public hhn(zzaht zzahtVar, zzamz zzamzVar, zgn zgnVar, zzv zzvVar) {
        this.a = zzahtVar;
        this.d = zzamzVar;
        this.e = zgnVar;
        this.m = zzvVar;
        if (zzagg.a(zzvVar.o)) {
            this.l = zzvVar;
        }
        this.d = zzamzVar;
        this.e = zgnVar;
        if (this.l == null) {
            zzahtVar.e(this.m);
        }
        a();
    }

    public final void a() {
        msj msjVar = this.b;
        msjVar.c = 0;
        msjVar.m = 0L;
        msjVar.n = false;
        msjVar.j = false;
        msjVar.l = false;
        msjVar.p = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.n = false;
    }

    public final int b() {
        int i = !this.n ? this.d.g[this.f] : this.b.i[this.f] ? 1 : 0;
        return e() != null ? 1073741824 | i : i;
    }

    public final boolean c() {
        this.f++;
        if (!this.n) {
            return false;
        }
        int i = this.g + 1;
        this.g = i;
        int[] iArr = this.b.f;
        int i2 = this.h;
        if (i != iArr[i2]) {
            return true;
        }
        this.h = i2 + 1;
        this.g = 0;
        return false;
    }

    public final int d(int i, int i2) {
        zzeu zzeuVar;
        zzamx e = e();
        if (e == null) {
            return 0;
        }
        int i3 = e.d;
        msj msjVar = this.b;
        if (i3 != 0) {
            zzeuVar = (zzeu) msjVar.q;
        } else {
            byte[] bArr = e.e;
            String str = zzfm.a;
            i3 = bArr.length;
            zzeu zzeuVar2 = this.k;
            zzeuVar2.z(i3, bArr);
            zzeuVar = zzeuVar2;
        }
        boolean z = msjVar.j && msjVar.k[this.f];
        boolean z2 = z || i2 != 0;
        int i4 = true != z2 ? 0 : 128;
        zzeu zzeuVar3 = this.j;
        zzeuVar3.a[0] = (byte) (i4 | i3);
        zzeuVar3.D(0);
        zzaht zzahtVar = this.a;
        zzahtVar.g(zzeuVar3, 1, 1);
        zzahtVar.g(zzeuVar, i3, 1);
        if (!z2) {
            return i3 + 1;
        }
        zzeu zzeuVar4 = this.c;
        if (!z) {
            zzeuVar4.y(8);
            byte[] bArr2 = zzeuVar4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = 0;
            bArr2[3] = (byte) i2;
            bArr2[4] = (byte) ((i >> 24) & 255);
            bArr2[5] = (byte) ((i >> 16) & 255);
            bArr2[6] = (byte) ((i >> 8) & 255);
            bArr2[7] = (byte) (i & 255);
            zzahtVar.g(zzeuVar4, 8, 1);
            return i3 + 9;
        }
        int i5 = i3 + 1;
        zzeu zzeuVar5 = (zzeu) msjVar.q;
        int J = zzeuVar5.J();
        zzeuVar5.E(-2);
        int i6 = (J * 6) + 2;
        if (i2 != 0) {
            zzeuVar4.y(i6);
            byte[] bArr3 = zzeuVar4.a;
            zzeuVar5.F(0, i6, bArr3);
            int i7 = (((bArr3[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr3[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) + i2;
            bArr3[2] = (byte) ((i7 >> 8) & 255);
            bArr3[3] = (byte) (i7 & 255);
        } else {
            zzeuVar4 = zzeuVar5;
        }
        zzahtVar.g(zzeuVar4, i6, 1);
        return i5 + i6;
    }

    public final zzamx e() {
        if (this.n) {
            msj msjVar = this.b;
            zgn zgnVar = (zgn) msjVar.o;
            String str = zzfm.a;
            int i = zgnVar.a;
            zzamx zzamxVar = (zzamx) msjVar.p;
            if (zzamxVar == null) {
                zzamx[] zzamxVarArr = this.d.a.n;
                zzamxVar = zzamxVarArr == null ? null : zzamxVarArr[i];
            }
            if (zzamxVar != null && zzamxVar.a) {
                return zzamxVar;
            }
        }
        return null;
    }
}
