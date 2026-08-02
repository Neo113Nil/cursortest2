package yf;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import xf.InterfaceC6823a;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6823a f68395a;

    public p(InterfaceC6823a messagesRepository) {
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        this.f68395a = messagesRepository;
    }

    public final Object a(String str, String str2, Continuation continuation) {
        return this.f68395a.p(str, str2, continuation);
    }
}
