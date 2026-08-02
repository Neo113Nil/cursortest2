package v8;

import T7.Z;
import com.facebook.share.model.GameRequestContent;

/* renamed from: v8.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6654c {
    public static void a(GameRequestContent gameRequestContent) {
        Z.m(gameRequestContent.getMessage(), "message");
        if ((gameRequestContent.getObjectId() != null) ^ (gameRequestContent.getActionType() == GameRequestContent.a.ASKFOR || gameRequestContent.getActionType() == GameRequestContent.a.SEND)) {
            throw new IllegalArgumentException("Object id should be provided if and only if action type is send or askfor");
        }
        int i10 = gameRequestContent.getRecipients() != null ? 1 : 0;
        if (gameRequestContent.getSuggestions() != null) {
            i10++;
        }
        if (gameRequestContent.getFilters() != null) {
            i10++;
        }
        if (i10 > 1) {
            throw new IllegalArgumentException("Parameters to, filters and suggestions are mutually exclusive");
        }
    }
}
