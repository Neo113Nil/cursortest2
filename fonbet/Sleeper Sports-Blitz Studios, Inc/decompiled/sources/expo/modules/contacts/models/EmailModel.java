package expo.modules.contacts.models;

import android.database.Cursor;
import com.google.firebase.messaging.Constants;
import expo.modules.contacts.Columns;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmailModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u0010"}, d2 = {"Lexpo/modules/contacts/models/EmailModel;", "Lexpo/modules/contacts/models/BaseModel;", "<init>", "()V", "contentType", "", "getContentType", "()Ljava/lang/String;", "dataAlias", "getDataAlias", "mapStringToType", "", Constants.ScionAnalytics.PARAM_LABEL, "getLabelFromCursor", "cursor", "Landroid/database/Cursor;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class EmailModel extends BaseModel {
    private final String contentType = "vnd.android.cursor.item/email_v2";
    private final String dataAlias = "email";

    @Override // expo.modules.contacts.CommonProvider
    public String getContentType() {
        return this.contentType;
    }

    @Override // expo.modules.contacts.models.BaseModel, expo.modules.contacts.CommonProvider
    public String getDataAlias() {
        return this.dataAlias;
    }

    @Override // expo.modules.contacts.models.BaseModel
    public int mapStringToType(String label) {
        if (label == null) {
            return 0;
        }
        switch (label.hashCode()) {
            case -1068855134:
                return !label.equals("mobile") ? 0 : 2;
            case 3208415:
                return label.equals("home") ? 1 : 0;
            case 3655441:
                return !label.equals("work") ? 0 : 3;
            case 106069776:
                return !label.equals("other") ? 0 : 7;
            default:
                return 0;
        }
    }

    @Override // expo.modules.contacts.models.BaseModel
    protected String getLabelFromCursor(Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        String labelFromCursor = super.getLabelFromCursor(cursor);
        if (labelFromCursor != null) {
            return labelFromCursor;
        }
        int i = cursor.getInt(cursor.getColumnIndexOrThrow(Columns.TYPE));
        if (i == 1) {
            return "home";
        }
        if (i == 2) {
            return "work";
        }
        if (i == 3) {
            return "other";
        }
        if (i == 4) {
            return "mobile";
        }
        return "unknown";
    }
}
