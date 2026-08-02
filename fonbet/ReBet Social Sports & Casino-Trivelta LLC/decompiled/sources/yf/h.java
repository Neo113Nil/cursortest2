package yf;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import xf.InterfaceC6823a;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6823a f68387a;

    public h(InterfaceC6823a messagesRepository) {
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        this.f68387a = messagesRepository;
    }

    public static /* synthetic */ Object d(h hVar, String str, String str2, boolean z10, Continuation continuation, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return hVar.b(str, str2, z10, continuation);
    }

    public final Object a(Continuation continuation) {
        return this.f68387a.c(continuation);
    }

    public final Object b(String str, String str2, boolean z10, Continuation continuation) {
        return this.f68387a.r(str, str2, Boxing.boxBoolean(z10), continuation);
    }

    public final Object c(Continuation continuation) {
        return this.f68387a.N(continuation);
    }
}
