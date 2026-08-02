package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class o5k implements KType {

    @NotNull
    public static final m5k d = new m5k(null);
    public final KClassifier a;
    public final List b;
    public final int c;

    public o5k(KClassifier kClassifier, List list, int i) {
        kClassifier.getClass();
        list.getClass();
        this.a = kClassifier;
        this.b = list;
        this.c = i;
    }

    public final String a(boolean z) {
        KClassifier kClassifier = this.a;
        KClass kClass = kClassifier instanceof KClass ? (KClass) kClassifier : null;
        Class x = kClass != null ? sha.x(kClass) : null;
        return wv8.i(x == null ? kClassifier.toString() : (this.c & 4) != 0 ? "kotlin.Nothing" : x.isArray() ? x.equals(boolean[].class) ? "kotlin.BooleanArray" : x.equals(char[].class) ? "kotlin.CharArray" : x.equals(byte[].class) ? "kotlin.ByteArray" : x.equals(short[].class) ? "kotlin.ShortArray" : x.equals(int[].class) ? "kotlin.IntArray" : x.equals(float[].class) ? "kotlin.FloatArray" : x.equals(long[].class) ? "kotlin.LongArray" : x.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array" : (z && x.isPrimitive()) ? sha.y((KClass) kClassifier).getName() : x.getName(), this.b.isEmpty() ? "" : CollectionsKt.f0(this.b, ", ", "<", ">", new crj(this), 24), isMarkedNullable() ? "?" : "");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o5k)) {
            return false;
        }
        o5k o5kVar = (o5k) obj;
        return Intrinsics.c(this.a, o5kVar.a) && Intrinsics.c(this.b, o5kVar.b) && this.c == o5kVar.c;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public final List getAnnotations() {
        return km5.a;
    }

    @Override // kotlin.reflect.KType
    public final List getArguments() {
        return this.b;
    }

    @Override // kotlin.reflect.KType
    public final KClassifier getClassifier() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + dmi.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // kotlin.reflect.KType
    public final boolean isMarkedNullable() {
        return (this.c & 1) != 0;
    }

    public final String toString() {
        return a(false).concat(" (Kotlin reflection is not available)");
    }
}
