package y1;

import android.os.Bundle;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o0 extends q0 {

    /* renamed from: r, reason: collision with root package name */
    public final Class f25599r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(Class type) {
        super(true);
        Intrinsics.checkNotNullParameter(type, "type");
        if (!Serializable.class.isAssignableFrom(type)) {
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }
        try {
            Class<?> cls = Class.forName("[L" + type.getName() + ';');
            Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.SerializableArrayType>>");
            this.f25599r = cls;
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // y1.q0
    public final Object a(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        return (Serializable[]) bundle.get(key);
    }

    @Override // y1.q0
    public final String b() {
        String name = this.f25599r.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    @Override // y1.q0
    public final Object d(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Serializable, java.io.Serializable[], java.lang.Object] */
    @Override // y1.q0
    public final void e(Bundle bundle, String key, Object obj) {
        ?? r42 = (Serializable[]) obj;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        this.f25599r.cast(r42);
        bundle.putSerializable(key, r42);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(o0.class, obj.getClass())) {
            return false;
        }
        return Intrinsics.areEqual(this.f25599r, ((o0) obj).f25599r);
    }

    public final int hashCode() {
        return this.f25599r.hashCode();
    }
}
