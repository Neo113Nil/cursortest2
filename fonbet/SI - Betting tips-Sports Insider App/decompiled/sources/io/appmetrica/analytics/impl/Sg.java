package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Sg implements InterfaceC0094d6 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12875a;

    /* renamed from: b, reason: collision with root package name */
    public final C0014a4 f12876b;

    /* renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f12877c = C0353na.k().w().d();

    public Sg(@NotNull Context context, @NotNull C0014a4 c0014a4) {
        this.f12875a = context;
        this.f12876b = c0014a4;
    }

    public final void a(@NotNull P5 p52, @Nullable Bundle bundle) {
        if (p52.m()) {
            return;
        }
        this.f12877c.execute(new RunnableC0310lh(this.f12875a, p52, bundle, this.f12876b));
    }

    public final void a(@NotNull P3 p32, @NotNull P5 p52, @NotNull C0397p4 c0397p4) {
        this.f12876b.a(p32, c0397p4).a(p52, c0397p4);
        this.f12876b.a(p32.f12723b, p32.f12724c, p32.f12725d);
    }
}
