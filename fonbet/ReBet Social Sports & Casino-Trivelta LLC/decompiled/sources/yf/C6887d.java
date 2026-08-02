package yf;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import xf.InterfaceC6823a;

/* renamed from: yf.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6887d {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6823a f68383a;

    public C6887d(InterfaceC6823a messagesRepository) {
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        this.f68383a = messagesRepository;
    }

    public final Object a(String str, boolean z10, Continuation continuation) {
        return this.f68383a.t(str, z10, continuation);
    }
}
