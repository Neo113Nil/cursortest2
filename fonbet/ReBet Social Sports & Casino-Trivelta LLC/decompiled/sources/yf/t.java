package yf;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import xf.InterfaceC6823a;

/* loaded from: classes4.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6823a f68399a;

    public t(InterfaceC6823a messagesRepository) {
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        this.f68399a = messagesRepository;
    }

    public final Object a(String str, String str2, Continuation continuation) {
        return this.f68399a.m(str, str2, continuation);
    }
}
