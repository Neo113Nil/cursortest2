package le;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import je.N;
import je.s0;
import kotlin.collections.K;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9815F;
import td.InterfaceC9831W;
import td.InterfaceC9845k;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C7942e f73266a = C7942e.f73250a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final C7938a f73267b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final i f73268c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final i f73269d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final Set<InterfaceC9831W> f73270e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f73271f = 0;

    static {
        String format = String.format(EnumC7939b.ERROR_CLASS.a(), Arrays.copyOf(new Object[]{"unknown class"}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        Sd.f i11 = Sd.f.i(format);
        Intrinsics.checkNotNullExpressionValue(i11, "special(...)");
        f73267b = new C7938a(i11);
        f73268c = c(k.CYCLIC_SUPERTYPES, new String[0]);
        f73269d = c(k.ERROR_PROPERTY_TYPE, new String[0]);
        f73270e = e0.h(new C7943f());
    }

    @NotNull
    public static final g a(@NotNull h kind, boolean z11, @NotNull String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        return z11 ? new m(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length)) : new g(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    @NotNull
    public static final g b(@NotNull h kind, @NotNull String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        return a(kind, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    @NotNull
    public static final i c(@NotNull k kind, @NotNull String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        K arguments = K.f71697a;
        String[] formatParams2 = (String[]) Arrays.copyOf(formatParams, formatParams.length);
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(formatParams2, "formatParams");
        return e(kind, arguments, d(kind, (String[]) Arrays.copyOf(formatParams2, formatParams2.length)), (String[]) Arrays.copyOf(formatParams2, formatParams2.length));
    }

    @NotNull
    public static j d(@NotNull k kind, @NotNull String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        return new j(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    @NotNull
    public static i e(@NotNull k kind, @NotNull List arguments, @NotNull s0 typeConstructor, @NotNull String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(typeConstructor, "typeConstructor");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        return new i(typeConstructor, b(h.ERROR_TYPE_SCOPE, typeConstructor.toString()), kind, arguments, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    @NotNull
    public static C7938a f() {
        return f73267b;
    }

    @NotNull
    public static InterfaceC9815F g() {
        return f73266a;
    }

    @NotNull
    public static Set h() {
        return f73270e;
    }

    @NotNull
    public static N i() {
        return f73269d;
    }

    @NotNull
    public static i j() {
        return f73268c;
    }

    public static final boolean k(InterfaceC9845k interfaceC9845k) {
        if (interfaceC9845k != null) {
            return (interfaceC9845k instanceof C7938a) || (interfaceC9845k.d() instanceof C7938a) || interfaceC9845k == f73266a;
        }
        return false;
    }
}
