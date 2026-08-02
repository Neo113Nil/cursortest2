package le;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import je.N;
import je.s0;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qd.g;
import td.InterfaceC9842h;
import td.i0;

/* loaded from: classes.dex */
public final class j implements s0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final k f73263a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String[] f73264b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f73265c;

    public j(@NotNull k kind, @NotNull String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        this.f73263a = kind;
        this.f73264b = formatParams;
        String a11 = EnumC7939b.ERROR_TYPE.a();
        String a12 = kind.a();
        Object[] copyOf = Arrays.copyOf(formatParams, formatParams.length);
        this.f73265c = V.e.b(new Object[]{V.e.b(copyOf, copyOf.length, a12, "format(...)")}, 1, a11, "format(...)");
    }

    @NotNull
    public final k b() {
        return this.f73263a;
    }

    @NotNull
    public final String c() {
        return this.f73264b[0];
    }

    @Override // je.s0
    @NotNull
    public final List<i0> getParameters() {
        return K.f71697a;
    }

    @Override // je.s0
    @NotNull
    public final qd.m n() {
        int i11 = qd.g.f81833g;
        return g.a.a();
    }

    @Override // je.s0
    @NotNull
    public final Collection<N> o() {
        return K.f71697a;
    }

    @Override // je.s0
    @NotNull
    public final InterfaceC9842h p() {
        int i11 = l.f73271f;
        return l.f();
    }

    @Override // je.s0
    public final boolean q() {
        return false;
    }

    @NotNull
    public final String toString() {
        return this.f73265c;
    }
}
