package ru.ozon.fintech.preferences.presentation.develop;

import B90.v0;
import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.fintech.features.cbottombase.models.cbottom.CbottomType;
import xe.C10720e0;
import xe.L0;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesViewModel$copyDeviceAdId$1", f = "FintechPreferencesViewModel.kt", l = {159, 160}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f96751d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ v0 f96752e;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesViewModel$copyDeviceAdId$1$1", f = "FintechPreferencesViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.fintech.preferences.presentation.develop.a$a, reason: collision with other inner class name */
    static final class C2112a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ v0 f96753d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f96754e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2112a(v0 v0Var, String str, kotlin.coroutines.d<? super C2112a> dVar) {
            super(2, dVar);
            this.f96753d = v0Var;
            this.f96754e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C2112a(this.f96753d, this.f96754e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C2112a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            K40.a aVar;
            K40.a aVar2;
            Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            v0 v0Var = this.f96753d;
            String str = this.f96754e;
            v0Var.L0(str);
            aVar = v0Var.f3205g;
            aVar2 = v0Var.f3205g;
            aVar.g(K40.b.h(aVar2.creator(), "Device AD ID скопирован: ".concat(str), 0, 30), CbottomType.SNACK, "", null);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(v0 v0Var, kotlin.coroutines.d<? super a> dVar) {
        super(2, dVar);
        this.f96752e = v0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new a(this.f96752e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if (xe.C10727i.f(r1, r4, r6) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (r7 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        S30.a aVar;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f96751d;
        v0 v0Var = this.f96752e;
        if (i11 == 0) {
            s.b(obj);
            aVar = v0Var.f3202d;
            this.f96751d = 1;
            obj = aVar.b(this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        C10720e0 c10720e0 = C10720e0.f105451a;
        L0 l02 = De.s.f6650a;
        C2112a c2112a = new C2112a(v0Var, (String) obj, null);
        this.f96751d = 2;
    }
}
