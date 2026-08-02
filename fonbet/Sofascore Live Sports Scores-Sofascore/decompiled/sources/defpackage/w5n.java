package defpackage;

import com.google.android.gms.internal.ads.zzaaq;
import com.google.android.gms.internal.ads.zzabc;
import com.google.android.gms.internal.ads.zzbg;
import com.google.android.gms.internal.ads.zzgwz;
import com.google.android.gms.internal.ads.zzgxm;
import com.google.android.gms.internal.ads.zzng;
import com.google.android.gms.internal.ads.zzv;
import java.util.Comparator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class w5n extends y5n implements Comparable {
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final boolean n;

    public w5n(int i, zzbg zzbgVar, int i2, zzaaq zzaaqVar, int i3, String str, String str2) {
        super(i, zzbgVar, i2);
        int i4;
        int i5 = 0;
        this.f = zzng.d(i3, false);
        int i6 = this.d.e;
        zzaaqVar.getClass();
        zzgxm zzgxmVar = zzaaqVar.r;
        this.g = 1 == (i6 & 1);
        this.h = (i6 & 2) != 0;
        zzgxm t = str2 != null ? zzgxm.t(str2) : zzgxmVar.isEmpty() ? zzgxm.t("") : zzgxmVar;
        int i7 = 0;
        while (true) {
            if (i7 >= t.size()) {
                i4 = 0;
                i7 = Integer.MAX_VALUE;
                break;
            } else {
                i4 = zzabc.k(this.d, (String) t.get(i7), false);
                if (i4 > 0) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        this.i = i7;
        this.j = i4;
        int i8 = str2 != null ? 1088 : 0;
        int i9 = this.d.f;
        gio gioVar = zzabc.k;
        int bitCount = (i9 == 0 || i9 != i8) ? Integer.bitCount(i8 & i9) : Integer.MAX_VALUE;
        this.k = bitCount;
        zzv zzvVar = this.d;
        this.n = (1088 & zzvVar.f) != 0;
        int l = zzabc.l(zzvVar, zzaaqVar.s);
        this.l = l;
        int k = zzabc.k(this.d, str, zzabc.j(str) == null);
        this.m = k;
        boolean z = i4 > 0 || (zzgxmVar.isEmpty() && bitCount > 0) || ((zzgxmVar.isEmpty() && l != Integer.MAX_VALUE) || this.g || (this.h && k > 0));
        if (zzng.d(i3, zzaaqVar.B) && z) {
            i5 = 1;
        }
        this.e = i5;
    }

    @Override // defpackage.y5n
    public final /* bridge */ /* synthetic */ boolean a(y5n y5nVar) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(w5n w5nVar) {
        zzgwz d = zzgwz.a.d(this.f, w5nVar.f);
        Integer valueOf = Integer.valueOf(this.i);
        Integer valueOf2 = Integer.valueOf(w5nVar.i);
        Comparator comparator = ijo.a;
        comparator.getClass();
        ojo ojoVar = ojo.a;
        zzgwz a = d.a(valueOf, valueOf2, ojoVar);
        int i = w5nVar.j;
        int i2 = this.j;
        zzgwz b = a.b(i2, i);
        int i3 = w5nVar.k;
        int i4 = this.k;
        zzgwz d2 = b.b(i4, i3).a(Integer.valueOf(this.l), Integer.valueOf(w5nVar.l), ojoVar).d(this.g, w5nVar.g);
        Boolean valueOf3 = Boolean.valueOf(this.h);
        Boolean valueOf4 = Boolean.valueOf(w5nVar.h);
        if (i2 != 0) {
            comparator = ojoVar;
        }
        zzgwz b2 = d2.a(valueOf3, valueOf4, comparator).b(this.m, w5nVar.m);
        if (i4 == 0) {
            b2 = b2.c(this.n, w5nVar.n);
        }
        return b2.e();
    }

    @Override // defpackage.y5n
    public final int zza() {
        return this.e;
    }
}
