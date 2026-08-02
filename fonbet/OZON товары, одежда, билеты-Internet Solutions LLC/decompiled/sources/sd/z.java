package sd;

import Ld.G;
import ae.EnumC5003e;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qd.s;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final LinkedHashSet f98623a = e0.g(G.d("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final LinkedHashSet f98624b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final LinkedHashSet f98625c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final LinkedHashSet f98626d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final LinkedHashSet f98627e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final LinkedHashSet f98628f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final LinkedHashSet f98629g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f98630h = 0;

    static {
        List<EnumC5003e> b02 = C7714v.b0(EnumC5003e.BOOLEAN, EnumC5003e.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (EnumC5003e enumC5003e : b02) {
            String b11 = enumC5003e.h().g().b();
            Intrinsics.checkNotNullExpressionValue(b11, "asString(...)");
            C7714v.p(G.c(b11, enumC5003e.f() + "Value()" + enumC5003e.e()), linkedHashSet);
        }
        f98624b = e0.f(e0.f(e0.f(e0.f(e0.f(e0.f(linkedHashSet, G.d("List", "sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;")), G.c("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), G.c("Double", "isInfinite()Z", "isNaN()Z")), G.c("Float", "isInfinite()Z", "isNaN()Z")), G.c("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), G.c("CharSequence", "isEmpty()Z"));
        f98625c = G.d("List", "getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;");
        f98626d = e0.f(e0.f(e0.f(e0.f(e0.f(e0.f(G.c("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), G.d("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), G.c("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), G.c("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), G.d("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), G.d("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), G.d("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f98627e = e0.f(e0.f(G.d("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), G.d("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), G.d("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        EnumC5003e enumC5003e2 = EnumC5003e.BOOLEAN;
        EnumC5003e enumC5003e3 = EnumC5003e.BYTE;
        List b03 = C7714v.b0(enumC5003e2, enumC5003e3, EnumC5003e.DOUBLE, EnumC5003e.FLOAT, enumC5003e3, EnumC5003e.INT, EnumC5003e.LONG, EnumC5003e.SHORT);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = b03.iterator();
        while (it.hasNext()) {
            String b12 = ((EnumC5003e) it.next()).h().g().b();
            Intrinsics.checkNotNullExpressionValue(b12, "asString(...)");
            String[] a11 = G.a("Ljava/lang/String;");
            C7714v.p(G.c(b12, (String[]) Arrays.copyOf(a11, a11.length)), linkedHashSet2);
        }
        String[] a12 = G.a("D");
        LinkedHashSet f7 = e0.f(linkedHashSet2, G.c("Float", (String[]) Arrays.copyOf(a12, a12.length)));
        String[] a13 = G.a("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f98628f = e0.f(f7, G.c("String", (String[]) Arrays.copyOf(a13, a13.length)));
        String[] a14 = G.a("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f98629g = G.c("Throwable", (String[]) Arrays.copyOf(a14, a14.length));
    }

    @NotNull
    public static LinkedHashSet a() {
        return f98625c;
    }

    @NotNull
    public static LinkedHashSet b() {
        return f98623a;
    }

    @NotNull
    public static LinkedHashSet c() {
        return f98628f;
    }

    @NotNull
    public static LinkedHashSet d() {
        return f98624b;
    }

    @NotNull
    public static LinkedHashSet e() {
        return f98627e;
    }

    @NotNull
    public static LinkedHashSet f() {
        return f98629g;
    }

    @NotNull
    public static LinkedHashSet g() {
        return f98626d;
    }

    public static boolean h(@NotNull Sd.d arrayFqName) {
        Intrinsics.checkNotNullParameter(arrayFqName, "fqName");
        if (Intrinsics.d(arrayFqName, s.a.f81907g)) {
            return true;
        }
        Intrinsics.checkNotNullParameter(arrayFqName, "arrayFqName");
        return s.a.f81904d0.get(arrayFqName) != null;
    }
}
