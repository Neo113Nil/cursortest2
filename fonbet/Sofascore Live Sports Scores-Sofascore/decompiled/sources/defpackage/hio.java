package defpackage;

import com.google.android.gms.internal.ads.zzgwz;
import java.util.Comparator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class hio extends zzgwz {
    public static final zzgwz f(int i) {
        return i < 0 ? zzgwz.b : i > 0 ? zzgwz.c : zzgwz.a;
    }

    @Override // com.google.android.gms.internal.ads.zzgwz
    public final zzgwz a(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzgwz
    public final zzgwz b(int i, int i2) {
        return f(Integer.compare(i, i2));
    }

    @Override // com.google.android.gms.internal.ads.zzgwz
    public final zzgwz c(boolean z, boolean z2) {
        return f(Boolean.compare(z2, z));
    }

    @Override // com.google.android.gms.internal.ads.zzgwz
    public final zzgwz d(boolean z, boolean z2) {
        return f(Boolean.compare(z, z2));
    }

    @Override // com.google.android.gms.internal.ads.zzgwz
    public final int e() {
        return 0;
    }
}
