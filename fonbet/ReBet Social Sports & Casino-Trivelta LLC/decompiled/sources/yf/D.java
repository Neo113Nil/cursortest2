package yf;

import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import xf.InterfaceC6823a;

/* loaded from: classes4.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6823a f68376a;

    public D(InterfaceC6823a messagesRepository) {
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        this.f68376a = messagesRepository;
    }

    public final Object a(String str, Message.g gVar, Message.f fVar, Continuation continuation) {
        return this.f68376a.v(str, gVar, fVar, continuation);
    }

    public final Object b(String str, String str2, Message.f fVar, Continuation continuation) {
        return this.f68376a.B(str, str2, fVar, continuation);
    }
}
