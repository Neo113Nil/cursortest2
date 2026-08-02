package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class y7d extends b8d {
    public final Class r;

    public y7d(Class cls) {
        super(true);
        if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
            this.r = cls;
        } else {
            is8.b(cls, " does not implement Parcelable or Serializable.");
            throw null;
        }
    }

    @Override // defpackage.b8d
    public final Object a(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        return bundle.get(str);
    }

    @Override // defpackage.b8d
    public final String b() {
        return this.r.getName();
    }

    @Override // defpackage.b8d
    public final Object d(String str) {
        str.getClass();
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // defpackage.b8d
    public final void e(Bundle bundle, String str, Object obj) {
        str.getClass();
        this.r.cast(obj);
        if (obj == null || (obj instanceof Parcelable)) {
            bundle.putParcelable(str, (Parcelable) obj);
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !y7d.class.equals(obj.getClass())) {
            return false;
        }
        return this.r.equals(((y7d) obj).r);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }
}
