package expo.modules.contacts.next.domain.model.photo;

import android.content.ContentValues;
import com.facebook.internal.AnalyticsEvents;
import expo.modules.contacts.Columns;
import kotlin.Metadata;

/* compiled from: PhotoModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lexpo/modules/contacts/next/domain/model/photo/PhotoModel;", "", AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO, "", "<init>", "([B)V", "getPhoto", "()[B", "mimeType", "", "getMimeType", "()Ljava/lang/String;", "contentValues", "Landroid/content/ContentValues;", "getContentValues", "()Landroid/content/ContentValues;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class PhotoModel {
    private final ContentValues contentValues;
    private final String mimeType = "vnd.android.cursor.item/photo";
    private final byte[] photo;

    public PhotoModel(byte[] bArr) {
        this.photo = bArr;
        ContentValues contentValues = new ContentValues();
        contentValues.put(Columns.MIMETYPE, "vnd.android.cursor.item/photo");
        contentValues.put("data15", bArr);
        this.contentValues = contentValues;
    }

    public final byte[] getPhoto() {
        return this.photo;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public ContentValues getContentValues() {
        return this.contentValues;
    }
}
