package yf;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import xf.InterfaceC6823a;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6823a f68391a;

    public l(InterfaceC6823a messagesRepository) {
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        this.f68391a = messagesRepository;
    }

    public final Object a(String str, Continuation continuation) {
        return this.f68391a.h(str, continuation);
    }
}
