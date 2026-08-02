package l0;

import Kk.C3532b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    private final a0 f72120a;

    /* renamed from: b, reason: collision with root package name */
    private final k0 f72121b;

    /* renamed from: c, reason: collision with root package name */
    private final J f72122c;

    /* renamed from: d, reason: collision with root package name */
    private final g0 f72123d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f72124e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Map<Object, Object> f72125f;

    public n0() {
        this((a0) null, (k0) null, (J) null, (g0) null, (LinkedHashMap) null, 63);
    }

    public final J a() {
        return this.f72122c;
    }

    @NotNull
    public final Map<Object, Object> b() {
        return this.f72125f;
    }

    public final a0 c() {
        return this.f72120a;
    }

    public final boolean d() {
        return this.f72124e;
    }

    public final g0 e() {
        return this.f72123d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return Intrinsics.d(this.f72120a, n0Var.f72120a) && Intrinsics.d(this.f72121b, n0Var.f72121b) && Intrinsics.d(this.f72122c, n0Var.f72122c) && Intrinsics.d(this.f72123d, n0Var.f72123d) && this.f72124e == n0Var.f72124e && Intrinsics.d(this.f72125f, n0Var.f72125f);
    }

    public final k0 f() {
        return this.f72121b;
    }

    public final int hashCode() {
        a0 a0Var = this.f72120a;
        int hashCode = (a0Var == null ? 0 : a0Var.hashCode()) * 31;
        k0 k0Var = this.f72121b;
        int hashCode2 = (hashCode + (k0Var == null ? 0 : k0Var.hashCode())) * 31;
        J j11 = this.f72122c;
        int hashCode3 = (hashCode2 + (j11 == null ? 0 : j11.hashCode())) * 31;
        g0 g0Var = this.f72123d;
        return this.f72125f.hashCode() + C3532b.a((hashCode3 + (g0Var != null ? g0Var.hashCode() : 0)) * 31, 31, this.f72124e);
    }

    @NotNull
    public final String toString() {
        return "TransitionData(fade=" + this.f72120a + ", slide=" + this.f72121b + ", changeSize=" + this.f72122c + ", scale=" + this.f72123d + ", hold=" + this.f72124e + ", effectsMap=" + this.f72125f + ')';
    }

    public n0(a0 a0Var, k0 k0Var, J j11, g0 g0Var, boolean z11, @NotNull Map<Object, Object> map) {
        this.f72120a = a0Var;
        this.f72121b = k0Var;
        this.f72122c = j11;
        this.f72123d = g0Var;
        this.f72124e = z11;
        this.f72125f = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.Map] */
    public /* synthetic */ n0(a0 a0Var, k0 k0Var, J j11, g0 g0Var, LinkedHashMap linkedHashMap, int i11) {
        this((i11 & 1) != 0 ? null : a0Var, (i11 & 2) != 0 ? null : k0Var, (i11 & 4) != 0 ? null : j11, (i11 & 8) != 0 ? null : g0Var, (i11 & 16) == 0, (i11 & 32) != 0 ? kotlin.collections.U.c() : linkedHashMap);
    }
}
