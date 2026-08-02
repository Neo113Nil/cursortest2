package yf;

import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import xf.InterfaceC6823a;

/* loaded from: classes4.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6823a f68403a;

    public x(InterfaceC6823a messagesRepository) {
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        this.f68403a = messagesRepository;
    }

    public static /* synthetic */ Object b(x xVar, Message message, boolean z10, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return xVar.a(message, z10, continuation);
    }

    public final Object a(Message message, boolean z10, Continuation continuation) {
        return this.f68403a.x(message, z10, continuation);
    }
}
