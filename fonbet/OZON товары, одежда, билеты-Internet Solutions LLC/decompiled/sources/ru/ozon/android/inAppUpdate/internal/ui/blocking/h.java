package ru.ozon.android.inAppUpdate.internal.ui.blocking;

import Ae.B0;
import Ae.C2399j;
import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.inAppUpdate.internal.ui.blocking.OzonInAppUpdateSdkBlockingActivity$setupSubscriptions$2", f = "OzonInAppUpdateSdkBlockingActivity.kt", l = {84}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class h extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f83873d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ OzonInAppUpdateSdkBlockingActivity f83874e;

    /* synthetic */ class a extends C7719a implements Function2<i, kotlin.coroutines.d<? super Unit>, Object> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(i iVar, kotlin.coroutines.d<? super Unit> dVar) {
            OzonInAppUpdateSdkBlockingActivity.L((OzonInAppUpdateSdkBlockingActivity) this.receiver, iVar);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(OzonInAppUpdateSdkBlockingActivity ozonInAppUpdateSdkBlockingActivity, kotlin.coroutines.d<? super h> dVar) {
        super(2, dVar);
        this.f83874e = ozonInAppUpdateSdkBlockingActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new h(this.f83874e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        j M11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f83873d;
        if (i11 == 0) {
            s.b(obj);
            OzonInAppUpdateSdkBlockingActivity ozonInAppUpdateSdkBlockingActivity = this.f83874e;
            M11 = ozonInAppUpdateSdkBlockingActivity.M();
            B0<i> f02 = M11.f0();
            a aVar2 = new a(2, ozonInAppUpdateSdkBlockingActivity, OzonInAppUpdateSdkBlockingActivity.class, "handleCommand", "handleCommand(Lru/ozon/android/inAppUpdate/internal/ui/blocking/OzonInAppUpdateSdkBlockingCommand;)V", 4);
            this.f83873d = 1;
            if (C2399j.h(f02, aVar2, this) == aVar) {
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
