package Le;

import com.zoho.livechat.android.modules.conversations.data.local.entities.SalesIQConversationAttributes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class b {
    public static final SalesIQConversationAttributes a(Pe.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return new SalesIQConversationAttributes(bVar.i(), bVar.c(), bVar.f(), bVar.g(), bVar.e(), bVar.d());
    }
}
