package defpackage;

import com.google.android.gms.internal.ads.zzgwz;
import com.google.android.gms.internal.ads.zzng;
import com.google.android.gms.internal.ads.zzv;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class o5n implements Comparable {
    public final boolean a;
    public final boolean b;

    public o5n(zzv zzvVar, int i) {
        this.a = 1 == (zzvVar.e & 1);
        this.b = zzng.d(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        o5n o5nVar = (o5n) obj;
        return zzgwz.a.d(this.b, o5nVar.b).d(this.a, o5nVar.a).e();
    }
}
