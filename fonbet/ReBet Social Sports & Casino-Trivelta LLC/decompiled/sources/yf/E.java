package yf;

import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import xf.InterfaceC6823a;

/* loaded from: classes4.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6823a f68377a;

    public E(InterfaceC6823a messagesRepository) {
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        this.f68377a = messagesRepository;
    }

    public final Object a(String str, String str2, Message.g gVar, Continuation continuation) {
        return this.f68377a.s(str, str2, gVar, continuation);
    }
}
