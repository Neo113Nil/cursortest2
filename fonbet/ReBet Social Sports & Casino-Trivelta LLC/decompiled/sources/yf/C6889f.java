package yf;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import xf.InterfaceC6823a;

/* renamed from: yf.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6889f {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6823a f68385a;

    public C6889f(InterfaceC6823a messagesRepository) {
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        this.f68385a = messagesRepository;
    }

    public final Object a(String str, Continuation continuation) {
        return this.f68385a.O(str, continuation);
    }
}
