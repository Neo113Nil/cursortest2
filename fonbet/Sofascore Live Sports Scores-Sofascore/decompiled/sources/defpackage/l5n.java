package defpackage;

import com.google.android.gms.internal.ads.zzaaq;
import com.google.android.gms.internal.ads.zzbg;
import com.google.android.gms.internal.ads.zzng;
import com.google.android.gms.internal.ads.zzv;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class l5n extends y5n implements Comparable {
    public final int e;
    public final int f;

    public l5n(int i, zzbg zzbgVar, int i2, zzaaq zzaaqVar, int i3) {
        super(i, zzbgVar, i2);
        int i4;
        this.e = zzng.d(i3, zzaaqVar.B) ? 1 : 0;
        zzv zzvVar = this.d;
        int i5 = zzvVar.v;
        int i6 = -1;
        if (i5 != -1 && (i4 = zzvVar.w) != -1) {
            i6 = i5 * i4;
        }
        this.f = i6;
    }

    @Override // defpackage.y5n
    public final /* bridge */ /* synthetic */ boolean a(y5n y5nVar) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f, ((l5n) obj).f);
    }

    @Override // defpackage.y5n
    public final int zza() {
        return this.e;
    }
}
