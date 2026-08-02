package ru.ozon.app.android.switchUser;

import Ob0.a;
import Sc.s;
import Wc.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.h;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import od0.InterfaceC8695a;
import org.maplibre.android.log.Logger;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lod0/a;", "<anonymous>", "(Lxe/M;)Lod0/a;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.switchUser.SwitchUserDestinationInterceptor$blockingSwitchUser$1", f = "SwitchUserDestinationInterceptor.kt", l = {Logger.NONE}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SwitchUserDestinationInterceptor$blockingSwitchUser$1 extends j implements Function2<M, d<? super InterfaceC8695a>, Object> {
    final /* synthetic */ long $targetUserId;
    long J$0;
    Object L$0;
    int label;
    final /* synthetic */ SwitchUserDestinationInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwitchUserDestinationInterceptor$blockingSwitchUser$1(SwitchUserDestinationInterceptor switchUserDestinationInterceptor, long j11, d<? super SwitchUserDestinationInterceptor$blockingSwitchUser$1> dVar) {
        super(2, dVar);
        this.this$0 = switchUserDestinationInterceptor;
        this.$targetUserId = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SwitchUserDestinationInterceptor$blockingSwitchUser$1(this.this$0, this.$targetUserId, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a ozonIdAppApi;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        SwitchUserDestinationInterceptor switchUserDestinationInterceptor = this.this$0;
        long j11 = this.$targetUserId;
        this.L$0 = switchUserDestinationInterceptor;
        this.J$0 = j11;
        this.label = 1;
        h hVar = new h(b.b(this));
        ozonIdAppApi = switchUserDestinationInterceptor.getOzonIdAppApi();
        ozonIdAppApi.q(new SwitchUserDestinationInterceptor$blockingSwitchUser$1$1$1(j11, switchUserDestinationInterceptor, hVar));
        Object a11 = hVar.a();
        if (a11 == aVar) {
            Intrinsics.checkNotNullParameter(this, "frame");
        }
        return a11 == aVar ? aVar : a11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super InterfaceC8695a> dVar) {
        return ((SwitchUserDestinationInterceptor$blockingSwitchUser$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
