package ru.ozon.composer.compose.widget.scrollable;

import D1.AbstractC2810k0;
import D1.C2805i;
import D1.InterfaceC2803h;
import D1.InterfaceC2821v;
import D1.r0;
import D1.s0;
import S0.G0;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
final class g extends e.c implements InterfaceC2803h, r0, InterfaceC2821v {

    /* renamed from: a, reason: collision with root package name */
    private o f94739a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private l f94740b;

    static final class a extends AbstractC7737t implements Function0<Unit> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            G0<o> a11 = p.a();
            g gVar = g.this;
            gVar.f94739a = (o) C2805i.a(gVar, a11);
            return Unit.f71690a;
        }
    }

    public g(@NotNull Function1<? super h, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f94740b = new l(callback);
    }

    public final void J1(@NotNull Function1<? super h, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        o oVar = this.f94739a;
        if (oVar != null) {
            oVar.c(this.f94740b);
        }
        l lVar = new l(callback);
        this.f94740b = lVar;
        o oVar2 = this.f94739a;
        if (oVar2 != null) {
            oVar2.a(lVar);
        }
    }

    @Override // androidx.compose.ui.e.c
    public final void onAttach() {
        onObservedReadsChanged();
    }

    @Override // androidx.compose.ui.e.c
    public final void onDetach() {
        this.f94740b.b();
        o oVar = this.f94739a;
        if (oVar != null) {
            oVar.c(this.f94740b);
        }
        this.f94739a = null;
    }

    @Override // D1.r0
    public final void onObservedReadsChanged() {
        o oVar = this.f94739a;
        if (oVar != null) {
            oVar.c(this.f94740b);
        }
        s0.a(this, new a());
        o oVar2 = this.f94739a;
        if (oVar2 != null) {
            oVar2.a(this.f94740b);
        }
    }

    @Override // D1.InterfaceC2821v
    public final void s(@NotNull AbstractC2810k0 coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.f94740b.d(coordinates);
    }
}
