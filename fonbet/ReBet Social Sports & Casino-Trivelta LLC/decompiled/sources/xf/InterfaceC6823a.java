package xf;

import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.common.domain.entities.Form;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import java.util.List;
import kotlin.coroutines.Continuation;
import me.C5582a;
import uf.C6550a;
import wf.EnumC6745a;
import yf.y;

/* renamed from: xf.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC6823a {
    static /* synthetic */ Object M(InterfaceC6823a interfaceC6823a, String str, String str2, String str3, List list, C6550a.EnumC6551b enumC6551b, Continuation continuation, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendAsSingleMessage");
        }
        if ((i10 & 16) != 0) {
            enumC6551b = null;
        }
        return interfaceC6823a.z(str, str2, str3, list, enumC6551b, continuation);
    }

    static /* synthetic */ Object R(InterfaceC6823a interfaceC6823a, String str, String str2, String str3, String str4, String str5, String str6, Message.g gVar, Message.Attachment attachment, Message.Extras extras, Message.RespondedMessage respondedMessage, List list, C6550a.EnumC6551b enumC6551b, boolean z10, boolean z11, Continuation continuation, int i10, Object obj) {
        boolean z12;
        InterfaceC6823a interfaceC6823a2;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        Message.g gVar2;
        Message.Attachment attachment2;
        Message.Extras extras2;
        Message.RespondedMessage respondedMessage2;
        List list2;
        Continuation continuation2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendMessage");
        }
        C6550a.EnumC6551b enumC6551b2 = (i10 & 2048) != 0 ? null : enumC6551b;
        boolean z13 = (i10 & 4096) != 0 ? false : z10;
        if ((i10 & 8192) != 0) {
            z12 = false;
            str7 = str;
            str8 = str2;
            str9 = str3;
            str10 = str4;
            str11 = str5;
            str12 = str6;
            gVar2 = gVar;
            attachment2 = attachment;
            extras2 = extras;
            respondedMessage2 = respondedMessage;
            list2 = list;
            continuation2 = continuation;
            interfaceC6823a2 = interfaceC6823a;
        } else {
            z12 = z11;
            interfaceC6823a2 = interfaceC6823a;
            str7 = str;
            str8 = str2;
            str9 = str3;
            str10 = str4;
            str11 = str5;
            str12 = str6;
            gVar2 = gVar;
            attachment2 = attachment;
            extras2 = extras;
            respondedMessage2 = respondedMessage;
            list2 = list;
            continuation2 = continuation;
        }
        return interfaceC6823a2.P(str7, str8, str9, str10, str11, str12, gVar2, attachment2, extras2, respondedMessage2, list2, enumC6551b2, z13, z12, continuation2);
    }

    static /* synthetic */ Object n(InterfaceC6823a interfaceC6823a, String str, String str2, String str3, String str4, String str5, Long l10, Long l11, boolean z10, y.a aVar, boolean z11, boolean z12, Continuation continuation, int i10, Object obj) {
        if (obj == null) {
            return interfaceC6823a.L(str, str2, str3, str4, str5, l10, l11, z10, aVar, (i10 & 512) != 0 ? true : z11, (i10 & 1024) != 0 ? false : z12, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: syncMessages");
    }

    Object A(List list, Boolean bool, Continuation continuation);

    Object B(String str, String str2, Message.f fVar, Continuation continuation);

    Object C(Message message, Continuation continuation);

    Object D(String str, Continuation continuation);

    Object E(String str, Continuation continuation);

    Object F(Continuation continuation);

    C5582a G(String str, String str2, Integer num);

    Object H(String str, String str2, Continuation continuation);

    C5582a I(String str);

    Object J(String str, String str2, Message.Extras extras, Continuation continuation);

    Object K(String str, String str2, boolean z10, Continuation continuation);

    Object L(String str, String str2, String str3, String str4, String str5, Long l10, Long l11, boolean z10, y.a aVar, boolean z11, boolean z12, Continuation continuation);

    Object N(Continuation continuation);

    Object O(String str, Continuation continuation);

    Object P(String str, String str2, String str3, String str4, String str5, String str6, Message.g gVar, Message.Attachment attachment, Message.Extras extras, Message.RespondedMessage respondedMessage, List list, C6550a.EnumC6551b enumC6551b, boolean z10, boolean z11, Continuation continuation);

    Object Q(String str, String str2, Message.RespondedMessage respondedMessage, Continuation continuation);

    C5582a a(String str, String str2);

    Object b(String str, String str2, Boolean bool, Continuation continuation);

    Object c(Continuation continuation);

    Object d(String str, String str2, Continuation continuation);

    Object e(String str, String str2, Continuation continuation);

    Object f(String str, String str2, String str3, Continuation continuation);

    Object g(String str, String str2, String str3, String str4, Message.g gVar, boolean z10, boolean z11, boolean z12, Continuation continuation);

    Object h(String str, Continuation continuation);

    Object i(String str, Message.g gVar, Continuation continuation);

    Object j(String str, String str2, Message.g gVar, Continuation continuation);

    Object k(Continuation continuation);

    Object l(String str, String str2, Continuation continuation);

    Object m(String str, String str2, Continuation continuation);

    Object o(SalesIQChat salesIQChat, Form.Message message, boolean z10, Continuation continuation);

    Object p(String str, String str2, Continuation continuation);

    C5582a q(EnumC6745a enumC6745a);

    Object r(String str, String str2, Boolean bool, Continuation continuation);

    Object s(String str, String str2, Message.g gVar, Continuation continuation);

    Object t(String str, boolean z10, Continuation continuation);

    Object u(String str, String str2, Message.e eVar, Continuation continuation);

    Object v(String str, Message.g gVar, Message.f fVar, Continuation continuation);

    Object w(String str, String str2, Continuation continuation);

    Object x(Message message, boolean z10, Continuation continuation);

    Object y(String str, Message.g gVar, Continuation continuation);

    Object z(String str, String str2, String str3, List list, C6550a.EnumC6551b enumC6551b, Continuation continuation);
}
