package yf;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import xf.InterfaceC6823a;

/* renamed from: yf.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6886c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6823a f68382a;

    public C6886c(InterfaceC6823a messagesRepository) {
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        this.f68382a = messagesRepository;
    }

    public final Object a(String str, String str2, Continuation continuation) {
        return this.f68382a.w(str, str2, continuation);
    }
}
