package Qe;

import Re.f;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.common.domain.entities.Form;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import me.C5582a;

/* loaded from: classes4.dex */
public interface a {
    C5582a a(String str);

    C5582a b(De.a aVar, boolean z10);

    Object c(String str, String str2, Continuation continuation);

    Object d(String str, Continuation continuation);

    Object e(List list, Continuation continuation);

    Object f(String str, Integer num, Long l10, Long l11, SalesIQChat.Extras extras, Continuation continuation);

    Object g(String str, String str2, String str3, Pe.a aVar, boolean z10, boolean z11, String str4, String str5, String str6, Message message, Bg.a aVar2, Function0 function0, Continuation continuation);

    Object h(String str, String str2, Continuation continuation);

    Object i(String str, Continuation continuation);

    C5582a j(Form.Message.Meta.InputCard.a aVar);

    C5582a k(String str);

    C5582a l(String str, f.a aVar);

    Object m(String str, String str2, String str3, String str4, String str5, Pe.a aVar, Continuation continuation);

    C5582a n(De.a aVar, boolean z10);

    C5582a o(String str, long j10);
}
