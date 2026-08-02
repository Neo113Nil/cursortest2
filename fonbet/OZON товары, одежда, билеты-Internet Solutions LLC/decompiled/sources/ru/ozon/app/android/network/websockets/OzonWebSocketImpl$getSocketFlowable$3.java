package ru.ozon.app.android.network.websockets;

import hg.InterfaceC6948a;
import io.reactivex.h;
import io.reactivex.x;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import sc.C9656b;
import wc.C10491l;
import wc.w;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/reactivex/h;", "", "handler", "Lhg/a;", "kotlin.jvm.PlatformType", "invoke", "(Lio/reactivex/h;)Lhg/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class OzonWebSocketImpl$getSocketFlowable$3 extends AbstractC7737t implements Function1<h<Object>, InterfaceC6948a<?>> {
    final /* synthetic */ AtomicLong $retryDelay;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OzonWebSocketImpl$getSocketFlowable$3(AtomicLong atomicLong) {
        super(1);
        this.$retryDelay = atomicLong;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6948a invoke$lambda$0(AtomicLong atomicLong, Object signal) {
        Intrinsics.checkNotNullParameter(signal, "signal");
        int i11 = h.f66520b;
        C9656b.c(signal, "item is null");
        w wVar = new w(signal);
        long andSet = atomicLong.getAndSet(10L);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        x a11 = Mc.a.a();
        C9656b.c(timeUnit, "unit is null");
        C9656b.c(a11, "scheduler is null");
        return new C10491l(wVar, Math.max(0L, andSet), a11);
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC6948a<?> invoke(h<Object> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        return handler.e(new a(this.$retryDelay));
    }
}
