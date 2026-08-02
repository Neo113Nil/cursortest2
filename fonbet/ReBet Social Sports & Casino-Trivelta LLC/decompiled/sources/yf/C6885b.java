package yf;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import xf.InterfaceC6823a;

/* renamed from: yf.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6885b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6823a f68381a;

    public C6885b(InterfaceC6823a messagesRepository) {
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        this.f68381a = messagesRepository;
    }

    public final Object a(List list, Boolean bool, Continuation continuation) {
        return this.f68381a.A(list, bool, continuation);
    }
}
