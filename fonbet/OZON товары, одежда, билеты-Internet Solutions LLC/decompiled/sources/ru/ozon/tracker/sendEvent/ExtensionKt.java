package ru.ozon.tracker.sendEvent;

import Ae.C;
import Ae.G;
import Ae.InterfaceC2395h;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.sendEvent.EventUpdateHandler;
import ve.EnumC10311b;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\n\u001a_\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042*\b\u0002\u0010\f\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0006H\u0000¢\u0006\u0004\b\r\u0010\u000e\"6\u0010\u0010\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"LAe/h;", "Lru/ozon/tracker/sendEvent/EventUpdateHandler$UpdateState;", "Lkotlin/time/b;", "retryTimeout", "", "maxRetry", "Lkotlin/Function3;", "Lkotlin/coroutines/CoroutineContext;", "", "Lkotlin/coroutines/d;", "", "", "catch", "asSafeFlow-dWUq8MI", "(LAe/h;JILfd/n;)LAe/h;", "asSafeFlow", "DEFAULT_CATCH", "Lfd/n;", "DEFAULT_RETRY_TIMEOUT", "I", "DEFAULT_MAX_RETRY_ATTEMPTS", "tracker-sdk_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExtensionKt {

    @NotNull
    private static final InterfaceC6511n<CoroutineContext, Throwable, d<? super Unit>, Object> DEFAULT_CATCH = new ExtensionKt$DEFAULT_CATCH$1(null);
    private static final int DEFAULT_MAX_RETRY_ATTEMPTS = 10;
    private static final int DEFAULT_RETRY_TIMEOUT = 5;

    @NotNull
    /* renamed from: asSafeFlow-dWUq8MI, reason: not valid java name */
    public static final InterfaceC2395h<EventUpdateHandler.UpdateState> m1668asSafeFlowdWUq8MI(@NotNull InterfaceC2395h<? extends EventUpdateHandler.UpdateState> asSafeFlow, long j11, int i11, @NotNull InterfaceC6511n<? super CoroutineContext, ? super Throwable, ? super d<? super Unit>, ? extends Object> interfaceC6511n) {
        Intrinsics.checkNotNullParameter(asSafeFlow, "$this$asSafeFlow");
        Intrinsics.checkNotNullParameter(interfaceC6511n, "catch");
        return new C(new G(asSafeFlow, new ExtensionKt$asSafeFlow$1(i11, j11, null)), new ExtensionKt$asSafeFlow$2(interfaceC6511n, null));
    }

    /* renamed from: asSafeFlow-dWUq8MI$default, reason: not valid java name */
    public static /* synthetic */ InterfaceC2395h m1669asSafeFlowdWUq8MI$default(InterfaceC2395h interfaceC2395h, long j11, int i11, InterfaceC6511n interfaceC6511n, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            b.Companion companion = b.INSTANCE;
            j11 = c.g(5, EnumC10311b.SECONDS);
        }
        if ((i12 & 2) != 0) {
            i11 = 10;
        }
        if ((i12 & 4) != 0) {
            interfaceC6511n = DEFAULT_CATCH;
        }
        return m1668asSafeFlowdWUq8MI(interfaceC2395h, j11, i11, interfaceC6511n);
    }
}
