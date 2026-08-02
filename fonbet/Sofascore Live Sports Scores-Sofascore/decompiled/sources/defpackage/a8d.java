package defpackage;

import android.os.Bundle;
import java.io.Serializable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class a8d extends b8d {
    public final Class r;

    public a8d(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            is8.b(cls, " does not implement Serializable.");
            throw null;
        }
        if (cls.isEnum()) {
            is8.b(cls, " is an Enum. You should use EnumType instead.");
            throw null;
        }
        this.r = cls;
    }

    @Override // defpackage.b8d
    public final Object a(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        return (Serializable) bundle.get(str);
    }

    @Override // defpackage.b8d
    public String b() {
        return this.r.getName();
    }

    @Override // defpackage.b8d
    public final void e(Bundle bundle, String str, Object obj) {
        Serializable serializable = (Serializable) obj;
        str.getClass();
        serializable.getClass();
        this.r.cast(serializable);
        bundle.putSerializable(str, serializable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8d)) {
            return false;
        }
        return this.r.equals(((a8d) obj).r);
    }

    @Override // defpackage.b8d
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Serializable d(String str) {
        str.getClass();
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public a8d(int i, Class cls) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.r = cls;
        } else {
            is8.b(cls, " does not implement Serializable.");
            throw null;
        }
    }
}
