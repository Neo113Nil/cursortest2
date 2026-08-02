package yf;

import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import xf.InterfaceC6823a;

/* renamed from: yf.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6888e {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6823a f68384a;

    public C6888e(InterfaceC6823a messagesRepository) {
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        this.f68384a = messagesRepository;
    }

    public final Object a(String str, String str2, boolean z10, Continuation continuation) {
        return this.f68384a.K(str, str2, z10, continuation);
    }

    public final Object b(String str, String str2, Continuation continuation) {
        return this.f68384a.H(str, str2, continuation);
    }

    public final Object c(String str, Message.g gVar, Continuation continuation) {
        return this.f68384a.i(str, gVar, continuation);
    }

    public final Object d(String str, String str2, Continuation continuation) {
        return this.f68384a.l(str, str2, continuation);
    }
}
