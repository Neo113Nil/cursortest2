package yf;

import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import me.C5582a;
import xf.InterfaceC6823a;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6823a f68390a;

    public k(InterfaceC6823a messagesRepository) {
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        this.f68390a = messagesRepository;
    }

    public final Object a(String str, String str2, Message.g gVar, Continuation continuation) {
        return this.f68390a.j(str, str2, gVar, continuation);
    }

    public final C5582a b(String str, String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        return this.f68390a.a(str, chatId);
    }
}
