package le;

import B3.D;
import Bd.InterfaceC2627a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.K;
import kotlin.collections.M;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9842h;
import td.InterfaceC9845k;

/* loaded from: classes.dex */
public class g implements ce.l {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f73255b;

    public g(@NotNull h kind, @NotNull String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        String a11 = kind.a();
        Object[] copyOf = Arrays.copyOf(formatParams, formatParams.length);
        this.f73255b = V.e.b(copyOf, copyOf.length, a11, "format(...)");
    }

    @Override // ce.l
    @NotNull
    public Set<Sd.f> a() {
        return M.f71699a;
    }

    @Override // ce.l
    @NotNull
    public Set<Sd.f> c() {
        return M.f71699a;
    }

    @Override // ce.o
    @NotNull
    public InterfaceC9842h d(@NotNull Sd.f name, @NotNull InterfaceC2627a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        String format = String.format(EnumC7939b.ERROR_CLASS.a(), Arrays.copyOf(new Object[]{name}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        Sd.f i11 = Sd.f.i(format);
        Intrinsics.checkNotNullExpressionValue(i11, "special(...)");
        return new C7938a(i11);
    }

    @Override // ce.o
    @NotNull
    public Collection<InterfaceC9845k> e(@NotNull ce.d kindFilter, @NotNull Function1<? super Sd.f, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return K.f71697a;
    }

    @Override // ce.l
    @NotNull
    public Set<Sd.f> f() {
        return M.f71699a;
    }

    @Override // ce.l
    @NotNull
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Set g(@NotNull Sd.f name, @NotNull Bd.c location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        int i11 = l.f73271f;
        return e0.h(new C7940c(l.f()));
    }

    @Override // ce.l
    @NotNull
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set b(@NotNull Sd.f name, @NotNull Bd.c location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        int i11 = l.f73271f;
        return l.h();
    }

    @NotNull
    protected final String j() {
        return this.f73255b;
    }

    @NotNull
    public String toString() {
        return D.c(new StringBuilder("ErrorScope{"), this.f73255b, '}');
    }
}
