package qe;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C7705l;
import kotlin.collections.U;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class w {

    /* renamed from: A, reason: collision with root package name */
    @NotNull
    public static final Set<Sd.f> f81978A;

    /* renamed from: B, reason: collision with root package name */
    @NotNull
    private static final Object f81979B;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Sd.f f81980a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Sd.f f81981b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Sd.f f81982c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Sd.f f81983d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Sd.f f81984e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Sd.f f81985f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Sd.f f81986g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    public static final Sd.f f81987h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    public static final Sd.f f81988i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    public static final Sd.f f81989j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    public static final Sd.f f81990k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    public static final Sd.f f81991l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    public static final Regex f81992m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    public static final Sd.f f81993n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    public static final Sd.f f81994o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    public static final Sd.f f81995p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    public static final Sd.f f81996q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    public static final Set<Sd.f> f81997r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    public static final Set<Sd.f> f81998s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    public static final Set<Sd.f> f81999t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    public static final Set<Sd.f> f82000u;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    public static final Set<Sd.f> f82001v;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    public static final Set<Sd.f> f82002w;

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    public static final Set<Sd.f> f82003x;

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    public static final Set<Sd.f> f82004y;

    /* renamed from: z, reason: collision with root package name */
    @NotNull
    public static final Object f82005z;

    static {
        Sd.f f7 = Sd.f.f("getValue");
        Intrinsics.checkNotNullExpressionValue(f7, "identifier(...)");
        f81980a = f7;
        Sd.f f11 = Sd.f.f("setValue");
        Intrinsics.checkNotNullExpressionValue(f11, "identifier(...)");
        f81981b = f11;
        Sd.f f12 = Sd.f.f("provideDelegate");
        Intrinsics.checkNotNullExpressionValue(f12, "identifier(...)");
        f81982c = f12;
        Sd.f f13 = Sd.f.f("equals");
        Intrinsics.checkNotNullExpressionValue(f13, "identifier(...)");
        f81983d = f13;
        Intrinsics.checkNotNullExpressionValue(Sd.f.f("hashCode"), "identifier(...)");
        Sd.f f14 = Sd.f.f("compareTo");
        Intrinsics.checkNotNullExpressionValue(f14, "identifier(...)");
        f81984e = f14;
        Sd.f f15 = Sd.f.f("contains");
        Intrinsics.checkNotNullExpressionValue(f15, "identifier(...)");
        f81985f = f15;
        Sd.f f16 = Sd.f.f("invoke");
        Intrinsics.checkNotNullExpressionValue(f16, "identifier(...)");
        f81986g = f16;
        Sd.f f17 = Sd.f.f("iterator");
        Intrinsics.checkNotNullExpressionValue(f17, "identifier(...)");
        f81987h = f17;
        Sd.f f18 = Sd.f.f("get");
        Intrinsics.checkNotNullExpressionValue(f18, "identifier(...)");
        f81988i = f18;
        Sd.f f19 = Sd.f.f("set");
        Intrinsics.checkNotNullExpressionValue(f19, "identifier(...)");
        f81989j = f19;
        Sd.f f21 = Sd.f.f("next");
        Intrinsics.checkNotNullExpressionValue(f21, "identifier(...)");
        f81990k = f21;
        Sd.f f22 = Sd.f.f("hasNext");
        Intrinsics.checkNotNullExpressionValue(f22, "identifier(...)");
        f81991l = f22;
        Intrinsics.checkNotNullExpressionValue(Sd.f.f("toString"), "identifier(...)");
        f81992m = new Regex("component\\d+");
        Sd.f f23 = Sd.f.f("and");
        Intrinsics.checkNotNullExpressionValue(f23, "identifier(...)");
        Sd.f f24 = Sd.f.f("or");
        Intrinsics.checkNotNullExpressionValue(f24, "identifier(...)");
        Sd.f f25 = Sd.f.f("xor");
        Intrinsics.checkNotNullExpressionValue(f25, "identifier(...)");
        Sd.f f26 = Sd.f.f("inv");
        Intrinsics.checkNotNullExpressionValue(f26, "identifier(...)");
        Sd.f f27 = Sd.f.f("shl");
        Intrinsics.checkNotNullExpressionValue(f27, "identifier(...)");
        Sd.f f28 = Sd.f.f("shr");
        Intrinsics.checkNotNullExpressionValue(f28, "identifier(...)");
        Sd.f f29 = Sd.f.f("ushr");
        Intrinsics.checkNotNullExpressionValue(f29, "identifier(...)");
        Sd.f f31 = Sd.f.f("inc");
        Intrinsics.checkNotNullExpressionValue(f31, "identifier(...)");
        f81993n = f31;
        Sd.f f32 = Sd.f.f("dec");
        Intrinsics.checkNotNullExpressionValue(f32, "identifier(...)");
        f81994o = f32;
        Sd.f f33 = Sd.f.f("plus");
        Intrinsics.checkNotNullExpressionValue(f33, "identifier(...)");
        Sd.f f34 = Sd.f.f("minus");
        Intrinsics.checkNotNullExpressionValue(f34, "identifier(...)");
        Sd.f f35 = Sd.f.f("not");
        Intrinsics.checkNotNullExpressionValue(f35, "identifier(...)");
        Sd.f f36 = Sd.f.f("unaryMinus");
        Intrinsics.checkNotNullExpressionValue(f36, "identifier(...)");
        Sd.f f37 = Sd.f.f("unaryPlus");
        Intrinsics.checkNotNullExpressionValue(f37, "identifier(...)");
        Sd.f f38 = Sd.f.f("times");
        Intrinsics.checkNotNullExpressionValue(f38, "identifier(...)");
        Sd.f f39 = Sd.f.f("div");
        Intrinsics.checkNotNullExpressionValue(f39, "identifier(...)");
        Sd.f f41 = Sd.f.f("mod");
        Intrinsics.checkNotNullExpressionValue(f41, "identifier(...)");
        Sd.f f42 = Sd.f.f("rem");
        Intrinsics.checkNotNullExpressionValue(f42, "identifier(...)");
        Sd.f f43 = Sd.f.f("rangeTo");
        Intrinsics.checkNotNullExpressionValue(f43, "identifier(...)");
        f81995p = f43;
        Sd.f f44 = Sd.f.f("rangeUntil");
        Intrinsics.checkNotNullExpressionValue(f44, "identifier(...)");
        f81996q = f44;
        Sd.f f45 = Sd.f.f("timesAssign");
        Intrinsics.checkNotNullExpressionValue(f45, "identifier(...)");
        Sd.f f46 = Sd.f.f("divAssign");
        Intrinsics.checkNotNullExpressionValue(f46, "identifier(...)");
        Sd.f f47 = Sd.f.f("modAssign");
        Intrinsics.checkNotNullExpressionValue(f47, "identifier(...)");
        Sd.f f48 = Sd.f.f("remAssign");
        Intrinsics.checkNotNullExpressionValue(f48, "identifier(...)");
        Sd.f f49 = Sd.f.f("plusAssign");
        Intrinsics.checkNotNullExpressionValue(f49, "identifier(...)");
        Sd.f f51 = Sd.f.f("minusAssign");
        Intrinsics.checkNotNullExpressionValue(f51, "identifier(...)");
        Sd.f f52 = Sd.f.f("toDouble");
        Intrinsics.checkNotNullExpressionValue(f52, "identifier(...)");
        Sd.f f53 = Sd.f.f("toFloat");
        Intrinsics.checkNotNullExpressionValue(f53, "identifier(...)");
        Sd.f f54 = Sd.f.f("toLong");
        Intrinsics.checkNotNullExpressionValue(f54, "identifier(...)");
        Sd.f f55 = Sd.f.f("toInt");
        Intrinsics.checkNotNullExpressionValue(f55, "identifier(...)");
        Sd.f f56 = Sd.f.f("toChar");
        Intrinsics.checkNotNullExpressionValue(f56, "identifier(...)");
        Sd.f f57 = Sd.f.f("toShort");
        Intrinsics.checkNotNullExpressionValue(f57, "identifier(...)");
        Sd.f f58 = Sd.f.f("toByte");
        Intrinsics.checkNotNullExpressionValue(f58, "identifier(...)");
        Sd.f[] elements = {f31, f32, f37, f36, f35, f26};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f81997r = C7705l.j0(elements);
        Sd.f[] elements2 = {f37, f36, f35, f26};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        f81998s = C7705l.j0(elements2);
        Sd.f[] elements3 = {f38, f33, f34, f39, f41, f42, f43, f44};
        Intrinsics.checkNotNullParameter(elements3, "elements");
        Set<Sd.f> j02 = C7705l.j0(elements3);
        f81999t = j02;
        Sd.f[] elements4 = {f38, f33, f34, f39, f41, f42};
        Intrinsics.checkNotNullParameter(elements4, "elements");
        f82000u = C7705l.j0(elements4);
        Sd.f[] elements5 = {f23, f24, f25, f26, f27, f28, f29};
        Intrinsics.checkNotNullParameter(elements5, "elements");
        Set<Sd.f> j03 = C7705l.j0(elements5);
        f82001v = j03;
        Sd.f[] elements6 = {f23, f24, f25, f27, f28, f29};
        Intrinsics.checkNotNullParameter(elements6, "elements");
        f82002w = C7705l.j0(elements6);
        LinkedHashSet f59 = e0.f(j02, j03);
        Sd.f[] elements7 = {f13, f15, f14};
        Intrinsics.checkNotNullParameter(elements7, "elements");
        e0.f(f59, C7705l.j0(elements7));
        Sd.f[] elements8 = {f45, f46, f47, f48, f49, f51};
        Intrinsics.checkNotNullParameter(elements8, "elements");
        Set<Sd.f> j04 = C7705l.j0(elements8);
        f82003x = j04;
        Sd.f[] elements9 = {f7, f11, f12};
        Intrinsics.checkNotNullParameter(elements9, "elements");
        f82004y = C7705l.j0(elements9);
        f82005z = U.j(new Pair(f41, f42), new Pair(f47, f48));
        e0.f(e0.h(f19), j04);
        Sd.f[] elements10 = {f52, f53, f54, f55, f57, f58, f56};
        Intrinsics.checkNotNullParameter(elements10, "elements");
        f81978A = C7705l.j0(elements10);
        f81979B = U.j(new Pair(f31, "++"), new Pair(f32, "--"), new Pair(f37, "+"), new Pair(f36, "-"), new Pair(f35, "!"), new Pair(f38, "*"), new Pair(f33, "+"), new Pair(f34, "-"), new Pair(f39, "/"), new Pair(f42, "%"), new Pair(f43, ".."), new Pair(f44, "..<"));
    }
}
