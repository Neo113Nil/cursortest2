package ru.ozon.fintech.features.updatewall.presentation;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.x0;
import K30.a;
import Sc.s;
import androidx.fragment.app.r;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o40.InterfaceC8640a;
import p40.EnumC8852a;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.button.large.FinLargeButtonState;
import t80.h;
import xe.C10727i;
import xe.M;

@e(c = "ru.ozon.fintech.features.updatewall.presentation.UpdateWallViewModel$initState$1", f = "UpdateWallViewModel.kt", l = {47}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class a extends j implements Function2<M, d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f96355d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ h f96356e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ r f96357f;

    /* renamed from: ru.ozon.fintech.features.updatewall.presentation.a$a, reason: collision with other inner class name */
    static final class C2084a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f96358a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f96359b;

        C2084a(h hVar, r rVar) {
            this.f96358a = hVar;
            this.f96359b = rVar;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, d dVar) {
            ArrayList arrayList;
            boolean z11 = ((EnumC8852a) obj) == EnumC8852a.OZON_SDK;
            final h hVar = this.f96358a;
            x0<t80.e> viewState = hVar.getViewState();
            final r rVar = this.f96359b;
            String string = rVar.getString(R.string.updatewall_update_button);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            FinLargeButtonState finLargeButtonState = new FinLargeButtonState("refresh", string, new Function0() { // from class: t80.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    h hVar2 = h.this;
                    C10727i.c(androidx.lifecycle.x0.a(hVar2), null, null, new g(hVar2, rVar, null), 3);
                    return Unit.f71690a;
                }
            }, null, FinLargeButtonState.Type.PRIMARY, null, null, null, null, 488, null);
            String string2 = rVar.getString(R.string.updatewall_title_view);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String string3 = z11 ? rVar.getString(R.string.updatewall_description_view_without_permission) : rVar.getString(R.string.updatewall_description_view_with_permission);
            Intrinsics.f(string3);
            if (z11) {
                String[] stringArray = rVar.getResources().getStringArray(R.array.updatewall_update_steps);
                Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
                arrayList = C7705l.i0(stringArray);
            } else {
                arrayList = null;
            }
            viewState.setValue(new t80.e(finLargeButtonState, string2, string3, arrayList, z11 ? 8388611 : 1));
            hVar.f99278b = a.b.f15169a;
            hVar.handleState();
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(h hVar, r rVar, d<? super a> dVar) {
        super(2, dVar);
        this.f96356e = hVar;
        this.f96357f = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new a(this.f96356e, this.f96357f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC8640a interfaceC8640a;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f96355d;
        if (i11 == 0) {
            s.b(obj);
            h hVar = this.f96356e;
            interfaceC8640a = hVar.f99277a;
            InterfaceC2395h<EnumC8852a> a11 = interfaceC8640a.a(true);
            C2084a c2084a = new C2084a(hVar, this.f96357f);
            this.f96355d = 1;
            if (a11.collect(c2084a, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}
