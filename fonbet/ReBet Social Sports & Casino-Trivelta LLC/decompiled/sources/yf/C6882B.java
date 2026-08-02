package yf;

import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import xf.InterfaceC6823a;

/* renamed from: yf.B, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6882B {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6823a f68374a;

    public C6882B(InterfaceC6823a messagesRepository) {
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        this.f68374a = messagesRepository;
    }

    public final Object a(String str, String str2, Message.Extras extras, Continuation continuation) {
        return this.f68374a.J(str, str2, extras, continuation);
    }
}
