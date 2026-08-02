package yf;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import xf.InterfaceC6823a;

/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6823a f68397a;

    public r(InterfaceC6823a messagesRepository) {
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        this.f68397a = messagesRepository;
    }

    public final Object a(String str, String str2, Continuation continuation) {
        return this.f68397a.d(str, str2, continuation);
    }
}
