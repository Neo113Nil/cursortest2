package io.appmetrica.analytics.impl;

import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Ec implements F8 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0531ue f12193a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f12194b;

    public Ec(@NotNull InterfaceC0531ue interfaceC0531ue, @NotNull Function0<Integer> function0) {
        this.f12193a = interfaceC0531ue;
        this.f12194b = function0;
    }

    @Override // io.appmetrica.analytics.impl.F8
    public final boolean b() {
        return ((C0506te) this.f12193a).f14680b.get() >= ((long) ((Number) this.f12194b.invoke()).intValue());
    }
}
