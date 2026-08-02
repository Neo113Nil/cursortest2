package ru.ozon.fintech.preferences.presentation.develop;

import B90.v0;
import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.fintech.features.cbottombase.models.cbottom.CbottomType;
import xe.C10720e0;
import xe.C10727i;
import xe.L0;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesViewModel$copyDeviceUuidId$1", f = "FintechPreferencesViewModel.kt", l = {142}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f96755d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ v0 f96756e;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesViewModel$copyDeviceUuidId$1$1", f = "FintechPreferencesViewModel.kt", l = {}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ v0 f96757d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f96758e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(v0 v0Var, String str, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f96757d = v0Var;
            this.f96758e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f96757d, this.f96758e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            K40.a aVar;
            K40.a aVar2;
            Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            v0 v0Var = this.f96757d;
            String str = this.f96758e;
            v0Var.L0(str);
            aVar = v0Var.f3205g;
            aVar2 = v0Var.f3205g;
            aVar.g(K40.b.h(aVar2.creator(), "DeviceUUID скопирован: ".concat(str), 0, 30), CbottomType.SNACK, "", null);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(v0 v0Var, kotlin.coroutines.d<? super b> dVar) {
        super(2, dVar);
        this.f96756e = v0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new b(this.f96756e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        S30.a aVar;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f96755d;
        if (i11 == 0) {
            s.b(obj);
            v0 v0Var = this.f96756e;
            aVar = v0Var.f3202d;
            String uniqueApplicationId = aVar.getUniqueApplicationId();
            C10720e0 c10720e0 = C10720e0.f105451a;
            L0 l02 = De.s.f6650a;
            a aVar3 = new a(v0Var, uniqueApplicationId, null);
            this.f96755d = 1;
            if (C10727i.f(l02, aVar3, this) == aVar2) {
                return aVar2;
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
