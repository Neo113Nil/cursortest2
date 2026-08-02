package Le;

import com.zoho.livechat.android.modules.conversations.data.local.entities.SalesIQConversationAttributes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class a {
    public static final Pe.b a(SalesIQConversationAttributes salesIQConversationAttributes) {
        Intrinsics.checkNotNullParameter(salesIQConversationAttributes, "<this>");
        return new Pe.b(salesIQConversationAttributes.getName(), salesIQConversationAttributes.getAdditionalInfo(), salesIQConversationAttributes.getDisplayPicture(), salesIQConversationAttributes.getDepartments(), salesIQConversationAttributes.getEncodedDisplayPicture(), salesIQConversationAttributes.getCustomSecretFields());
    }
}
