package defpackage;

import android.os.Bundle;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class z7d extends b8d {
    public final Class r;

    public z7d(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            is8.b(cls, " does not implement Serializable.");
            throw null;
        }
        try {
            this.r = Class.forName("[L" + cls.getName() + ';');
        } catch (ClassNotFoundException e) {
            is8.h(e);
            throw null;
        }
    }

    @Override // defpackage.b8d
    public final Object a(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        return (Serializable[]) bundle.get(str);
    }

    @Override // defpackage.b8d
    public final String b() {
        return this.r.getName();
    }

    @Override // defpackage.b8d
    public final Object d(String str) {
        str.getClass();
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Serializable, java.io.Serializable[], java.lang.Object] */
    @Override // defpackage.b8d
    public final void e(Bundle bundle, String str, Object obj) {
        ?? r3 = (Serializable[]) obj;
        str.getClass();
        this.r.cast(r3);
        bundle.putSerializable(str, r3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !z7d.class.equals(obj.getClass())) {
            return false;
        }
        return Intrinsics.c(this.r, ((z7d) obj).r);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }
}
