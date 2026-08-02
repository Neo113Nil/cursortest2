package ru.ozon.composer.ui.widget;

import h20.C6787b;
import kotlin.jvm.internal.Intrinsics;
import m20.InterfaceC8046a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class o implements f10.b<l> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final n20.k<? extends InterfaceC8046a<?, ?>> f94892a;

    /* renamed from: b, reason: collision with root package name */
    private final C6787b f94893b;

    /* renamed from: c, reason: collision with root package name */
    private final X10.f f94894c;

    public o(@NotNull n20.k<? extends InterfaceC8046a<?, ?>> widgetStore, C6787b c6787b, X10.f fVar) {
        Intrinsics.checkNotNullParameter(widgetStore, "widgetStore");
        this.f94892a = widgetStore;
        this.f94893b = c6787b;
        this.f94894c = fVar;
    }

    @Override // f10.b
    @NotNull
    public final n a(L00.i iVar) {
        d dVar = new d();
        n20.k<? extends InterfaceC8046a<?, ?>> kVar = this.f94892a;
        C6787b c6787b = this.f94893b;
        n nVar = new n(kVar, c6787b, dVar);
        nVar.e(new m(iVar, c6787b, this.f94894c));
        return nVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(@NotNull n20.k<? extends InterfaceC8046a<?, ?>> widgetStore) {
        this(widgetStore, null, null);
        Intrinsics.checkNotNullParameter(widgetStore, "widgetStore");
    }
}
