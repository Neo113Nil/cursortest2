package defpackage;

import com.google.android.gms.internal.play_billing.zzgg;
import com.ironsource.U3;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class fpo implements Map.Entry, Comparable {
    public final zzgg a;
    public Object b;
    public final /* synthetic */ apo c;

    public fpo(apo apoVar, zzgg zzggVar, Object obj) {
        this.c = apoVar;
        this.a = zzggVar;
        this.b = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.a.compareTo(((fpo) obj).a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                zzgg zzggVar = this.a;
                if (zzggVar == null ? key == null : zzggVar.equals(key)) {
                    Object obj2 = this.b;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        zzgg zzggVar = this.a;
        int hashCode = zzggVar == null ? 0 : zzggVar.hashCode();
        Object obj = this.b;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.c.h();
        Object obj2 = this.b;
        this.b = obj;
        return obj2;
    }

    public final String toString() {
        return lnb.o(String.valueOf(this.a), U3.j.b, String.valueOf(this.b));
    }
}
