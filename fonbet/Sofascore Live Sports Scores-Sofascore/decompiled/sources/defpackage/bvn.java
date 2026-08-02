package defpackage;

import com.google.android.gms.internal.fido.zzcs;
import java.io.Serializable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class bvn extends zzcs implements Serializable {
    public static final bvn a = new bvn();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    @Override // com.google.android.gms.internal.fido.zzcs
    public final zzcs d() {
        return zwn.a;
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
