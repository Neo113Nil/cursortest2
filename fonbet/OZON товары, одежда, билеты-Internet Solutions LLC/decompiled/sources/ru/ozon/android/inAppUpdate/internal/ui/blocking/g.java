package ru.ozon.android.inAppUpdate.internal.ui.blocking;

import Ae.C2399j;
import Ae.M0;
import Sc.s;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.inAppUpdate.internal.ui.blocking.OzonInAppUpdateSdkBlockingActivity$setupSubscriptions$1", f = "OzonInAppUpdateSdkBlockingActivity.kt", l = {79}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class g extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f83869d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ OzonInAppUpdateSdkBlockingActivity f83870e;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.inAppUpdate.internal.ui.blocking.OzonInAppUpdateSdkBlockingActivity$setupSubscriptions$1$1", f = "OzonInAppUpdateSdkBlockingActivity.kt", l = {80}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f83871d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ OzonInAppUpdateSdkBlockingActivity f83872e;

        /* renamed from: ru.ozon.android.inAppUpdate.internal.ui.blocking.g$a$a, reason: collision with other inner class name */
        /* synthetic */ class C1449a extends C7719a implements Function2<ru.ozon.android.inAppUpdate.internal.ui.blocking.a, kotlin.coroutines.d<? super Unit>, Object> {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ru.ozon.android.inAppUpdate.internal.ui.blocking.a aVar, kotlin.coroutines.d<? super Unit> dVar) {
                ((b) this.receiver).e(aVar);
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(OzonInAppUpdateSdkBlockingActivity ozonInAppUpdateSdkBlockingActivity, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f83872e = ozonInAppUpdateSdkBlockingActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f83872e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            j M11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f83871d;
            if (i11 == 0) {
                s.b(obj);
                OzonInAppUpdateSdkBlockingActivity ozonInAppUpdateSdkBlockingActivity = this.f83872e;
                M11 = ozonInAppUpdateSdkBlockingActivity.M();
                M0<ru.ozon.android.inAppUpdate.internal.ui.blocking.a> g02 = M11.g0();
                C1449a c1449a = new C1449a(2, OzonInAppUpdateSdkBlockingActivity.J(ozonInAppUpdateSdkBlockingActivity), b.class, "render", "render(Lru/ozon/android/inAppUpdate/internal/ui/blocking/OzonInAppUpdateBlockingUiState;)V", 4);
                this.f83871d = 1;
                if (C2399j.h(g02, c1449a, this) == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(OzonInAppUpdateSdkBlockingActivity ozonInAppUpdateSdkBlockingActivity, kotlin.coroutines.d<? super g> dVar) {
        super(2, dVar);
        this.f83870e = ozonInAppUpdateSdkBlockingActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new g(this.f83870e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f83869d;
        if (i11 == 0) {
            s.b(obj);
            AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
            OzonInAppUpdateSdkBlockingActivity ozonInAppUpdateSdkBlockingActivity = this.f83870e;
            a aVar2 = new a(ozonInAppUpdateSdkBlockingActivity, null);
            this.f83869d = 1;
            if (C5412d0.b(ozonInAppUpdateSdkBlockingActivity, bVar, aVar2, this) == aVar) {
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
