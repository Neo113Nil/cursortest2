package yf;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import xf.InterfaceC6823a;

/* renamed from: yf.A, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6881A {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6823a f68373a;

    public C6881A(InterfaceC6823a messagesRepository) {
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        this.f68373a = messagesRepository;
    }

    public static /* synthetic */ Object b(C6881A c6881a, String str, String str2, String str3, Continuation continuation, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = null;
        }
        return c6881a.a(str, str2, str3, continuation);
    }

    public final Object a(String str, String str2, String str3, Continuation continuation) {
        return this.f68373a.f(str, str2, str3, continuation);
    }
}
