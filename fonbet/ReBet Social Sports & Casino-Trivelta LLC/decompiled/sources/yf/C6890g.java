package yf;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import xf.InterfaceC6823a;

/* renamed from: yf.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6890g {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6823a f68386a;

    public C6890g(InterfaceC6823a messagesRepository) {
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        this.f68386a = messagesRepository;
    }

    public final Object a(Continuation continuation) {
        return this.f68386a.F(continuation);
    }
}
