package defpackage;

import com.google.android.gms.internal.ads.zzahs;
import com.google.android.gms.internal.ads.zzaht;
import com.google.android.gms.internal.ads.zzanx;
import com.google.android.gms.internal.ads.zzanz;
import com.google.android.gms.internal.ads.zzas;
import com.google.android.gms.internal.ads.zzeh;
import com.google.android.gms.internal.ads.zzeu;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zzguk;
import com.google.android.gms.internal.ads.zzj;
import com.google.android.gms.internal.ads.zzt;
import com.google.android.gms.internal.ads.zzv;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class whn implements zzaht {
    public final zzaht a;
    public final zzanx b;
    public zzanz g;
    public zzv h;
    public boolean i;
    public int d = 0;
    public int e = 0;
    public byte[] f = zzfm.b;
    public final zzeu c = new zzeu();

    public whn(zzaht zzahtVar, zzanx zzanxVar) {
        this.a = zzahtVar;
        this.b = zzanxVar;
    }

    public final void a(int i) {
        int length = this.f.length;
        int i2 = this.e;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.d;
        int max = Math.max(i3 + i3, i + i3);
        byte[] bArr = this.f;
        byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
        System.arraycopy(bArr, this.d, bArr2, 0, i3);
        this.d = 0;
        this.e = i3;
        this.f = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public final int c(zzj zzjVar, int i, boolean z) {
        if (this.g == null) {
            return this.a.c(zzjVar, i, z);
        }
        a(i);
        int b = zzjVar.b(this.e, i, this.f);
        if (b != -1) {
            this.e += b;
            return b;
        }
        if (z) {
            return -1;
        }
        a70.q();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public final void e(zzv zzvVar) {
        String str = zzvVar.o;
        str.getClass();
        zzguk.a(zzas.f(str) == 3);
        boolean equals = zzvVar.equals(this.h);
        zzanx zzanxVar = this.b;
        if (!equals) {
            this.h = zzvVar;
            this.g = zzanxVar.b(zzvVar) ? zzanxVar.d(zzvVar) : null;
        }
        zzanz zzanzVar = this.g;
        zzaht zzahtVar = this.a;
        if (zzanzVar == null) {
            zzahtVar.e(zzvVar);
            return;
        }
        zzt zztVar = new zzt(zzvVar);
        zztVar.d("application/x-media3-cues");
        zztVar.j = str;
        zztVar.s = Long.MAX_VALUE;
        zztVar.N = zzanxVar.c(zzvVar);
        zzahtVar.e(new zzv(zztVar));
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public final void f(long j, int i, int i2, int i3, zzahs zzahsVar) {
        if (this.g == null) {
            this.a.f(j, i, i2, i3, zzahsVar);
            return;
        }
        zzguk.b("DRM on subtitles is not supported", zzahsVar == null);
        int i4 = (this.e - i3) - i2;
        try {
            this.g.a(i4, i2, new bm2(this, j, i), this.f);
        } catch (RuntimeException e) {
            if (!this.i) {
                throw e;
            }
            zzeh.d("Parsing subtitles failed, ignoring sample.", e);
        }
        int i5 = i4 + i2;
        this.d = i5;
        if (i5 == this.e) {
            this.d = 0;
            this.e = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public final void g(zzeu zzeuVar, int i, int i2) {
        if (this.g == null) {
            this.a.g(zzeuVar, i, i2);
            return;
        }
        a(i);
        zzeuVar.F(this.e, i, this.f);
        this.e += i;
    }
}
