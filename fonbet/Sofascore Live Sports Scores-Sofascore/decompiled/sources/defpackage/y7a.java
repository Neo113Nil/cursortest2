package defpackage;

import android.os.Bundle;
import java.io.Serializable;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class y7a extends b8d {
    public final Class r;
    public final Class s;

    public y7a(Class cls) {
        super(true);
        this.r = cls;
        if (!Serializable.class.isAssignableFrom(cls)) {
            is8.b(cls, " does not implement Serializable.");
            throw null;
        }
        if (cls.isEnum()) {
            this.s = cls;
        } else {
            is8.b(cls, " is not an Enum type.");
            throw null;
        }
    }

    @Override // defpackage.b8d
    public final Object a(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        Object obj = bundle.get(str);
        if (obj instanceof Serializable) {
            return (Serializable) obj;
        }
        return null;
    }

    @Override // defpackage.b8d
    public final String b() {
        return this.s.getName();
    }

    @Override // defpackage.b8d
    public final Object d(String str) {
        str.getClass();
        Object obj = null;
        if (str.equals("null")) {
            return null;
        }
        Class cls = this.s;
        Object[] enumConstants = cls.getEnumConstants();
        enumConstants.getClass();
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Object obj2 = enumConstants[i];
            Enum r5 = (Enum) obj2;
            r5.getClass();
            if (c.o(r5.name(), str, true)) {
                obj = obj2;
                break;
            }
            i++;
        }
        Enum r1 = (Enum) obj;
        if (r1 != null) {
            return r1;
        }
        StringBuilder q = wt3.q("Enum value ", str, " not found for type ");
        q.append(cls.getName());
        q.append('.');
        throw new IllegalArgumentException(q.toString());
    }

    @Override // defpackage.b8d
    public final void e(Bundle bundle, String str, Object obj) {
        str.getClass();
        bundle.putSerializable(str, (Serializable) this.r.cast((Serializable) obj));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7a)) {
            return false;
        }
        return this.r.equals(((y7a) obj).r);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }
}
