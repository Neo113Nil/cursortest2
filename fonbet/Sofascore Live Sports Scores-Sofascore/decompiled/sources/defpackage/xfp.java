package defpackage;

import com.ironsource.U3;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class xfp implements Map.Entry {
    public xfp a;
    public xfp b;
    public xfp c;
    public xfp d;
    public xfp e;
    public final Object f;
    public Object g;
    public int h;

    public xfp(xfp xfpVar, Object obj, xfp xfpVar2, xfp xfpVar3) {
        this.a = xfpVar;
        this.f = obj;
        this.h = 1;
        this.d = xfpVar2;
        this.e = xfpVar3;
        xfpVar3.d = this;
        xfpVar2.e = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.g;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.g;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.g;
        return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.g;
        this.g = obj;
        return obj2;
    }

    public final String toString() {
        return this.f + U3.j.b + this.g;
    }

    public xfp() {
        this.f = null;
        this.e = this;
        this.d = this;
    }
}
