package Re;

import com.zoho.livechat.android.models.SalesIQChat;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Qe.a f10227a;

    public o(Qe.a conversationsRepository) {
        Intrinsics.checkNotNullParameter(conversationsRepository, "conversationsRepository");
        this.f10227a = conversationsRepository;
    }

    public static /* synthetic */ Object b(o oVar, String str, Integer num, Long l10, Long l11, SalesIQChat.Extras extras, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        if ((i10 & 4) != 0) {
            l10 = null;
        }
        if ((i10 & 8) != 0) {
            l11 = null;
        }
        if ((i10 & 16) != 0) {
            extras = null;
        }
        return oVar.a(str, num, l10, l11, extras, continuation);
    }

    public final Object a(String str, Integer num, Long l10, Long l11, SalesIQChat.Extras extras, Continuation continuation) {
        return this.f10227a.f(str, num, l10, l11, extras, continuation);
    }
}
