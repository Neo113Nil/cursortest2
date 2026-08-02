package yf;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import xf.InterfaceC6823a;

/* loaded from: classes4.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6823a f68378a;

    public F(InterfaceC6823a messagesRepository) {
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        this.f68378a = messagesRepository;
    }

    public static /* synthetic */ Object b(F f10, String str, String str2, Boolean bool, Continuation continuation, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            bool = null;
        }
        return f10.a(str, str2, bool, continuation);
    }

    public final Object a(String str, String str2, Boolean bool, Continuation continuation) {
        return this.f68378a.b(str, str2, bool, continuation);
    }
}
