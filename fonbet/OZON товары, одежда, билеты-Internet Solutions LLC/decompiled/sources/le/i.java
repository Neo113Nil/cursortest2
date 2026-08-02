package le;

import java.util.Arrays;
import java.util.List;
import je.K0;
import je.N;
import je.Y;
import je.o0;
import je.s0;
import je.y0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class i extends Y {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final s0 f73256b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final g f73257c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final k f73258d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final List<y0> f73259e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f73260f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final String[] f73261g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final String f73262h;

    public i(@NotNull s0 constructor, @NotNull g memberScope, @NotNull k kind, @NotNull List arguments, boolean z11, @NotNull String... formatParams) {
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(memberScope, "memberScope");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        this.f73256b = constructor;
        this.f73257c = memberScope;
        this.f73258d = kind;
        this.f73259e = arguments;
        this.f73260f = z11;
        this.f73261g = formatParams;
        String a11 = kind.a();
        Object[] copyOf = Arrays.copyOf(formatParams, formatParams.length);
        this.f73262h = V.e.b(copyOf, copyOf.length, a11, "format(...)");
    }

    @Override // je.N
    @NotNull
    public final List<y0> F0() {
        return this.f73259e;
    }

    @Override // je.N
    @NotNull
    public final o0 G0() {
        o0.f69907b.getClass();
        return o0.f69908c;
    }

    @Override // je.N
    @NotNull
    public final s0 H0() {
        return this.f73256b;
    }

    @Override // je.N
    public final boolean I0() {
        return this.f73260f;
    }

    @Override // je.N
    /* renamed from: J0 */
    public final N M0(ke.h kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // je.K0
    public final K0 M0(ke.h kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // je.Y, je.K0
    public final K0 N0(o0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return this;
    }

    @Override // je.Y
    @NotNull
    /* renamed from: O0 */
    public final Y L0(boolean z11) {
        String[] strArr = this.f73261g;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        return new i(this.f73256b, this.f73257c, this.f73258d, this.f73259e, z11, strArr2);
    }

    @Override // je.Y
    @NotNull
    /* renamed from: P0 */
    public final Y N0(@NotNull o0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return this;
    }

    @NotNull
    public final String Q0() {
        return this.f73262h;
    }

    @NotNull
    public final k R0() {
        return this.f73258d;
    }

    @NotNull
    public final i S0(@NotNull List<? extends y0> newArguments) {
        Intrinsics.checkNotNullParameter(newArguments, "newArguments");
        String[] strArr = this.f73261g;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        return new i(this.f73256b, this.f73257c, this.f73258d, newArguments, this.f73260f, strArr2);
    }

    @Override // je.N
    @NotNull
    public final ce.l p() {
        return this.f73257c;
    }
}
