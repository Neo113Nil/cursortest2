package yf;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import xf.InterfaceC6823a;

/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6823a f68400a;

    public u(InterfaceC6823a messagesRepository) {
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        this.f68400a = messagesRepository;
    }

    public final Object a(String str, String str2, String str3, List list, Continuation continuation) {
        return InterfaceC6823a.M(this.f68400a, str, str2, str3, list, null, continuation, 16, null);
    }
}
