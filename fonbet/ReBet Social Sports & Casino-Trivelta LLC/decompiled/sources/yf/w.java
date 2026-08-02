package yf;

import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import xf.InterfaceC6823a;

/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6823a f68402a;

    public w(InterfaceC6823a messagesRepository) {
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        this.f68402a = messagesRepository;
    }

    public final Object a(String str, String str2, String str3, String str4, String str5, String str6, Message.g gVar, Message.Attachment attachment, Message.Extras extras, Message.RespondedMessage respondedMessage, List list, boolean z10, boolean z11, Continuation continuation) {
        return InterfaceC6823a.R(this.f68402a, str, str2, str3, str4, str5, str6, gVar, attachment, extras, respondedMessage, list, null, z10, z11, continuation, 2048, null);
    }
}
