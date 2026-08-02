package ru.ozon.ozonSentryHelper.internal.ui.debugActivity;

import Ae.B0;
import Ae.InterfaceC2397i;
import Sc.C4005g;
import Sc.o;
import Sc.s;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import wg0.InterfaceC10556c;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.ozonSentryHelper.internal.ui.debugActivity.SentryHelperDebugActivity$subscribeEvents$1", f = "SentryHelperDebugActivity.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class e extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f97621d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ SentryHelperDebugActivity f97622e;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.ozonSentryHelper.internal.ui.debugActivity.SentryHelperDebugActivity$subscribeEvents$1$1", f = "SentryHelperDebugActivity.kt", l = {57}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f97623d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ SentryHelperDebugActivity f97624e;

        /* renamed from: ru.ozon.ozonSentryHelper.internal.ui.debugActivity.e$a$a, reason: collision with other inner class name */
        static final class C2141a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ SentryHelperDebugActivity f97625a;

            C2141a(SentryHelperDebugActivity sentryHelperDebugActivity) {
                this.f97625a = sentryHelperDebugActivity;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                if (!(((InterfaceC10556c) obj) instanceof InterfaceC10556c.a)) {
                    throw new o();
                }
                this.f97625a.finish();
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(SentryHelperDebugActivity sentryHelperDebugActivity, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f97624e = sentryHelperDebugActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f97624e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f97623d;
            if (i11 == 0) {
                s.b(obj);
                SentryHelperDebugActivity sentryHelperDebugActivity = this.f97624e;
                B0<InterfaceC10556c> g02 = SentryHelperDebugActivity.K(sentryHelperDebugActivity).g0();
                C2141a c2141a = new C2141a(sentryHelperDebugActivity);
                this.f97623d = 1;
                if (g02.collect(c2141a, this) == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(SentryHelperDebugActivity sentryHelperDebugActivity, kotlin.coroutines.d<? super e> dVar) {
        super(2, dVar);
        this.f97622e = sentryHelperDebugActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new e(this.f97622e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f97621d;
        if (i11 == 0) {
            s.b(obj);
            AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
            SentryHelperDebugActivity sentryHelperDebugActivity = this.f97622e;
            a aVar2 = new a(sentryHelperDebugActivity, null);
            this.f97621d = 1;
            if (C5412d0.b(sentryHelperDebugActivity, bVar, aVar2, this) == aVar) {
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
