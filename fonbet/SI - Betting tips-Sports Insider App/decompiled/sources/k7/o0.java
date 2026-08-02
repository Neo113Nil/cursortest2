package k7;

import j$.util.Objects;
import java.util.Comparator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Comparator f18903a;

    static {
        Comparator comparator;
        try {
            Object[] enumConstants = Class.forName(o0.class.getName().concat("$UnsafeComparator")).getEnumConstants();
            Objects.requireNonNull(enumConstants);
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = n0.f18899a;
        }
        f18903a = comparator;
    }
}
