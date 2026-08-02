package y1;

import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class k0 {
    public static q0 a(String str, String str2) {
        boolean areEqual = Intrinsics.areEqual("integer", str);
        f fVar = q0.f25621o;
        q0 q0Var = areEqual ? q0.f25609b : Intrinsics.areEqual("integer[]", str) ? q0.f25611d : Intrinsics.areEqual("List<Int>", str) ? q0.f25612e : Intrinsics.areEqual("long", str) ? q0.f25613f : Intrinsics.areEqual("long[]", str) ? q0.f25614g : Intrinsics.areEqual("List<Long>", str) ? q0.f25615h : Intrinsics.areEqual("boolean", str) ? q0.f25618l : Intrinsics.areEqual("boolean[]", str) ? q0.f25619m : Intrinsics.areEqual("List<Boolean>", str) ? q0.f25620n : Intrinsics.areEqual("string", str) ? fVar : Intrinsics.areEqual("string[]", str) ? q0.f25622p : Intrinsics.areEqual("List<String>", str) ? q0.q : Intrinsics.areEqual("float", str) ? q0.f25616i : Intrinsics.areEqual("float[]", str) ? q0.j : Intrinsics.areEqual("List<Float>", str) ? q0.f25617k : null;
        if (q0Var != null) {
            return q0Var;
        }
        if (Intrinsics.areEqual("reference", str)) {
            return q0.f25610c;
        }
        if (str == null || str.length() == 0) {
            return fVar;
        }
        try {
            String concat = (!kotlin.text.z.o(str, ".", false) || str2 == null) ? str : str2.concat(str);
            boolean i5 = kotlin.text.z.i(str, "[]", false);
            if (i5) {
                concat = concat.substring(0, concat.length() - 2);
                Intrinsics.checkNotNullExpressionValue(concat, "substring(...)");
            }
            Class<?> cls = Class.forName(concat);
            Intrinsics.checkNotNull(cls);
            q0 b10 = b(cls, i5);
            if (b10 != null) {
                return b10;
            }
            throw new IllegalArgumentException((concat + " is not Serializable or Parcelable.").toString());
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException(e7);
        }
    }

    public static q0 b(Class clazz, boolean z5) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (Parcelable.class.isAssignableFrom(clazz)) {
            return z5 ? new m0(clazz) : new n0(clazz);
        }
        if (Enum.class.isAssignableFrom(clazz) && !z5) {
            return new l0(clazz);
        }
        if (Serializable.class.isAssignableFrom(clazz)) {
            return z5 ? new o0(clazz) : new p0(clazz);
        }
        return null;
    }
}
