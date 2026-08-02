package ru.ozon.fintech.features.webbank.presentation.fintechwebview.base;

import Ae.InterfaceC2397i;
import Ae.x0;
import D30.f;
import Sc.C4005g;
import Sc.s;
import e40.d;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewViewModelBase$initDeeplinkJob$1", f = "FintechWebViewViewModelBase.kt", l = {1456}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class e extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f96580d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a f96581e;

    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a f96582a;

        a(ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a aVar) {
            this.f96582a = aVar;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            String str = (String) obj;
            ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a aVar = this.f96582a;
            boolean z11 = (aVar.R0().getNeedOzonId() && !(aVar.P0().q() instanceof f.c)) || !aVar.R0().getNeedOzonId();
            if (!aVar.Q0().Q() && z11 && aVar.N0().n() != null) {
                boolean K02 = aVar.K0(str);
                if (str != null && K02) {
                    x0<String> L11 = aVar.Q0().L();
                    if (L11 != null) {
                        L11.setValue(null);
                    }
                    aVar.N0().A(null);
                    L80.a.a("TABSFLOW", "deepLinkToOpen url=" + str + " tabId=" + aVar.S0().d());
                    aVar.f96470J = new e40.d(str, d.a.DEEPLINK);
                    aVar.f1();
                }
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a aVar, kotlin.coroutines.d<? super e> dVar) {
        super(2, dVar);
        this.f96581e = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new e(this.f96581e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f96580d;
        if (i11 == 0) {
            s.b(obj);
            ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a aVar2 = this.f96581e;
            x0<String> L11 = aVar2.Q0().L();
            if (L11 == null) {
                return Unit.f71690a;
            }
            a aVar3 = new a(aVar2);
            this.f96580d = 1;
            if (L11.collect(aVar3, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        throw new C4005g();
    }
}
