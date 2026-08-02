package yf;

import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import xf.InterfaceC6823a;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6823a f68389a;

    public j(InterfaceC6823a messagesRepository) {
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        this.f68389a = messagesRepository;
    }

    public final Object a(String str, String str2, Message.e eVar, Continuation continuation) {
        return this.f68389a.u(str, str2, eVar, continuation);
    }
}
