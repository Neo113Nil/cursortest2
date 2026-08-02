package expo.modules.contacts.next.domain.model.nickname;

import android.content.ContentValues;
import com.google.firebase.messaging.Constants;
import expo.modules.contacts.Columns;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NicknameModel.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u0003X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lexpo/modules/contacts/next/domain/model/nickname/NicknameModel;", "", "name", "", Constants.ScionAnalytics.PARAM_LABEL, "Lexpo/modules/contacts/next/domain/model/nickname/NicknameLabel;", "<init>", "(Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/nickname/NicknameLabel;)V", "getName", "()Ljava/lang/String;", "getLabel", "()Lexpo/modules/contacts/next/domain/model/nickname/NicknameLabel;", "mimeType", "getMimeType", "contentValues", "Landroid/content/ContentValues;", "getContentValues", "()Landroid/content/ContentValues;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class NicknameModel {
    private final ContentValues contentValues;
    private final NicknameLabel label;
    private final String mimeType;
    private final String name;

    public NicknameModel(String str, NicknameLabel label) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.name = str;
        this.label = label;
        this.mimeType = "vnd.android.cursor.item/nickname";
        ContentValues contentValues = new ContentValues();
        contentValues.put(Columns.MIMETYPE, "vnd.android.cursor.item/nickname");
        contentValues.put(Columns.DATA, str);
        contentValues.put(Columns.TYPE, Integer.valueOf(label.getType()));
        contentValues.put(Columns.LABEL, label.getLabel());
        this.contentValues = contentValues;
    }

    public final String getName() {
        return this.name;
    }

    public final NicknameLabel getLabel() {
        return this.label;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public ContentValues getContentValues() {
        return this.contentValues;
    }
}
