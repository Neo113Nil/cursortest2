package ru.ozon.fintech.preferences.presentation.nativebridge;

import Ae.C0;
import Ae.InterfaceC2397i;
import Sc.C4005g;
import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;
import kotlin.text.f;
import kotlin.text.h;
import ru.ozon.fintech.preferences.ui.nativebridge.StatusResultView;
import xe.M;

@e(c = "ru.ozon.fintech.preferences.presentation.nativebridge.FintechNativeBridgeTestingFragment$setupResults$1", f = "FintechNativeBridgeTestingFragment.kt", l = {95}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f96861d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ FintechNativeBridgeTestingFragment f96862e;

    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FintechNativeBridgeTestingFragment f96863a;

        a(FintechNativeBridgeTestingFragment fintechNativeBridgeTestingFragment) {
            this.f96863a = fintechNativeBridgeTestingFragment;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            v90.j jVar;
            StatusResultView.a aVar;
            v90.j jVar2;
            String str = (String) obj;
            FintechNativeBridgeTestingFragment fintechNativeBridgeTestingFragment = this.f96863a;
            jVar = fintechNativeBridgeTestingFragment.f96849f;
            if (jVar != null) {
                jVar.f102690l.f(str);
            }
            String obj2 = h.z0(str).toString();
            if (h.K(str)) {
                aVar = StatusResultView.a.IDLE;
            } else {
                f fVar = f.IGNORE_CASE;
                aVar = new Regex("\\.failure\\s*\\(", fVar).a(obj2) ? StatusResultView.a.ERROR : new Regex("\\.success\\s*\\(", fVar).a(obj2) ? StatusResultView.a.SUCCESS : StatusResultView.a.IN_PROGRESS;
            }
            jVar2 = fintechNativeBridgeTestingFragment.f96849f;
            if (jVar2 != null) {
                jVar2.f102690l.g(aVar);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(FintechNativeBridgeTestingFragment fintechNativeBridgeTestingFragment, kotlin.coroutines.d<? super b> dVar) {
        super(2, dVar);
        this.f96862e = fintechNativeBridgeTestingFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new b(this.f96862e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f96861d;
        if (i11 == 0) {
            s.b(obj);
            FintechNativeBridgeTestingFragment fintechNativeBridgeTestingFragment = this.f96862e;
            C0 h02 = FintechNativeBridgeTestingFragment.A(fintechNativeBridgeTestingFragment).h0();
            a aVar2 = new a(fintechNativeBridgeTestingFragment);
            this.f96861d = 1;
            if (h02.collect(aVar2, this) == aVar) {
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
