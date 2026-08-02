package yf;

import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import xf.InterfaceC6823a;

/* loaded from: classes4.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6823a f68401a;

    public v(InterfaceC6823a messagesRepository) {
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        this.f68401a = messagesRepository;
    }

    public final Object a(String str, String str2, String str3, String str4, Message.g gVar, boolean z10, boolean z11, boolean z12, Continuation continuation) {
        return this.f68401a.g(str, str2, str3, str4, gVar, z10, z11, z12, continuation);
    }
}
