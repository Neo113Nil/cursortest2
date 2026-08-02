package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class x7d extends b8d {
    public final Class r;

    public x7d(Class cls) {
        super(true);
        if (!Parcelable.class.isAssignableFrom(cls)) {
            is8.b(cls, " does not implement Parcelable.");
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
        return (Parcelable[]) bundle.get(str);
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

    @Override // defpackage.b8d
    public final void e(Bundle bundle, String str, Object obj) {
        Parcelable[] parcelableArr = (Parcelable[]) obj;
        str.getClass();
        this.r.cast(parcelableArr);
        bundle.putParcelableArray(str, parcelableArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !x7d.class.equals(obj.getClass())) {
            return false;
        }
        return Intrinsics.c(this.r, ((x7d) obj).r);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }
}
