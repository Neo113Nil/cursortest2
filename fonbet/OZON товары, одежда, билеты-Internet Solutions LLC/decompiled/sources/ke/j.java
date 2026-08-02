package ke;

import java.util.List;
import je.K0;
import je.Y;
import je.o0;
import je.s0;
import je.y0;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import ne.EnumC8580b;
import ne.InterfaceC8581c;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class j extends Y implements InterfaceC8581c {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final EnumC8580b f71490b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final o f71491c;

    /* renamed from: d, reason: collision with root package name */
    private final K0 f71492d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final o0 f71493e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f71494f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f71495g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j(EnumC8580b enumC8580b, o oVar, K0 k02, o0 o0Var, boolean z11, int i11) {
        this(enumC8580b, oVar, k02, o0Var, (i11 & 16) != 0 ? false : z11, false);
        if ((i11 & 8) != 0) {
            o0.f69907b.getClass();
            o0Var = o0.f69908c;
        }
    }

    @Override // je.N
    @NotNull
    public final List<y0> F0() {
        return K.f71697a;
    }

    @Override // je.N
    @NotNull
    public final o0 G0() {
        return this.f71493e;
    }

    @Override // je.N
    public final s0 H0() {
        return this.f71491c;
    }

    @Override // je.N
    public final boolean I0() {
        return this.f71494f;
    }

    @Override // je.Y, je.K0
    public final K0 L0(boolean z11) {
        return new j(this.f71490b, this.f71491c, this.f71492d, this.f71493e, z11, 32);
    }

    @Override // je.Y
    /* renamed from: O0 */
    public final Y L0(boolean z11) {
        return new j(this.f71490b, this.f71491c, this.f71492d, this.f71493e, z11, 32);
    }

    @Override // je.Y
    @NotNull
    /* renamed from: P0 */
    public final Y N0(@NotNull o0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new j(this.f71490b, this.f71491c, this.f71492d, newAttributes, this.f71494f, this.f71495g);
    }

    @NotNull
    public final EnumC8580b Q0() {
        return this.f71490b;
    }

    @NotNull
    public final o R0() {
        return this.f71491c;
    }

    public final K0 S0() {
        return this.f71492d;
    }

    public final boolean T0() {
        return this.f71495g;
    }

    @Override // je.K0
    @NotNull
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public final j M0(@NotNull h kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        o e11 = this.f71491c.e(kotlinTypeRefiner);
        K0 k02 = this.f71492d;
        return new j(this.f71490b, e11, k02 != null ? kotlinTypeRefiner.a(k02).K0() : null, this.f71493e, this.f71494f, 32);
    }

    @Override // je.N
    @NotNull
    public final ce.l p() {
        return le.l.a(le.h.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    public j(@NotNull EnumC8580b captureStatus, @NotNull o constructor, K0 k02, @NotNull o0 attributes, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(captureStatus, "captureStatus");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f71490b = captureStatus;
        this.f71491c = constructor;
        this.f71492d = k02;
        this.f71493e = attributes;
        this.f71494f = z11;
        this.f71495g = z12;
    }
}
