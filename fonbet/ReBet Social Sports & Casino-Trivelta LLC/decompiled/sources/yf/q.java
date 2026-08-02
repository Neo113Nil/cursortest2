package yf;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import xf.InterfaceC6823a;

/* loaded from: classes4.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6823a f68396a;

    public q(InterfaceC6823a messagesRepository) {
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        this.f68396a = messagesRepository;
    }

    public final Object a(String str, Continuation continuation) {
        return this.f68396a.D(str, continuation);
    }
}
