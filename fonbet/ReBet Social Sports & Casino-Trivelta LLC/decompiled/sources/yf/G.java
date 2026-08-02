package yf;

import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import xf.InterfaceC6823a;

/* loaded from: classes4.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6823a f68379a;

    public G(InterfaceC6823a messagesRepository) {
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        this.f68379a = messagesRepository;
    }

    public final Object a(String str, String str2, Message.RespondedMessage respondedMessage, Continuation continuation) {
        return this.f68379a.Q(str, str2, respondedMessage, continuation);
    }
}
