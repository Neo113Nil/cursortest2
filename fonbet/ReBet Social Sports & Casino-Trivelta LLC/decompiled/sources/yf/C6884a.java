package yf;

import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.common.domain.entities.Form;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import xf.InterfaceC6823a;

/* renamed from: yf.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6884a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6823a f68380a;

    public C6884a(InterfaceC6823a messagesRepository) {
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        this.f68380a = messagesRepository;
    }

    public static /* synthetic */ Object b(C6884a c6884a, SalesIQChat salesIQChat, Form.Message message, boolean z10, Continuation continuation, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return c6884a.a(salesIQChat, message, z10, continuation);
    }

    public final Object a(SalesIQChat salesIQChat, Form.Message message, boolean z10, Continuation continuation) {
        return this.f68380a.o(salesIQChat, message, z10, continuation);
    }
}
