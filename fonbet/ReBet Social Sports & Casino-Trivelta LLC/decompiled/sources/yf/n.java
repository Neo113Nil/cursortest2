package yf;

import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import xf.InterfaceC6823a;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6823a f68393a;

    public n(InterfaceC6823a messagesRepository) {
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        this.f68393a = messagesRepository;
    }

    public final Object a(String str, Continuation continuation) {
        return this.f68393a.E(str, continuation);
    }

    public final Object b(String str, Message.g gVar, Continuation continuation) {
        return this.f68393a.y(str, gVar, continuation);
    }
}
