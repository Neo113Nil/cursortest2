package yf;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import xf.InterfaceC6823a;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6823a f68398a;

    public s(InterfaceC6823a messagesRepository) {
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        this.f68398a = messagesRepository;
    }

    public final Object a(Continuation continuation) {
        return this.f68398a.k(continuation);
    }
}
