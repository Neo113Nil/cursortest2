package defpackage;

import com.google.android.gms.internal.ads.zzifa;
import com.ironsource.U3;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class pqo implements Map.Entry, Comparable {
    public final zzifa a;
    public Object b;
    public final /* synthetic */ oqo c;

    public pqo(oqo oqoVar, zzifa zzifaVar, Object obj) {
        this.c = oqoVar;
        this.a = zzifaVar;
        this.b = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.a.compareTo(((pqo) obj).a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                zzifa zzifaVar = this.a;
                if (zzifaVar == null ? key == null : zzifaVar.equals(key)) {
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
        zzifa zzifaVar = this.a;
        int hashCode = zzifaVar == null ? 0 : zzifaVar.hashCode();
        Object obj = this.b;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.c.g();
        Object obj2 = this.b;
        this.b = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        return wt3.m(valueOf, U3.j.b, new StringBuilder(valueOf.length() + 1 + valueOf2.length()), valueOf2);
    }
}
