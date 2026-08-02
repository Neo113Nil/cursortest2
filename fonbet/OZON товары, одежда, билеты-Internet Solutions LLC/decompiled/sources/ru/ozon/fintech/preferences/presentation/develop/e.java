package ru.ozon.fintech.preferences.presentation.develop;

import A30.m;
import B90.v0;
import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesViewModel$logOut$1", f = "FintechPreferencesViewModel.kt", l = {94}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class e extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f96766d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ v0 f96767e;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesViewModel$logOut$1$1", f = "FintechPreferencesViewModel.kt", l = {96}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96768d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ v0 f96769e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(v0 v0Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f96769e = v0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f96769e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            m mVar;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96768d;
            try {
                if (i11 == 0) {
                    s.b(obj);
                    mVar = this.f96769e.f3203e;
                    this.f96768d = 1;
                    if (mVar.w(false, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
            } catch (Exception e11) {
                L80.a.c("FintechPreferencesViewModel", null, e11);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(v0 v0Var, kotlin.coroutines.d<? super e> dVar) {
        super(2, dVar);
        this.f96767e = v0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new e(this.f96767e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f96766d;
        v0 v0Var = this.f96767e;
        if (i11 == 0) {
            s.b(obj);
            C10720e0 c10720e0 = C10720e0.f105451a;
            He.b bVar = He.b.f10879b;
            a aVar2 = new a(v0Var, null);
            this.f96766d = 1;
            if (C10727i.f(bVar, aVar2, this) == aVar) {
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
