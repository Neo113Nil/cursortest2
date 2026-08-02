package expo.modules.contacts.next.domain.model.note;

import android.content.ContentValues;
import expo.modules.contacts.Columns;
import kotlin.Metadata;

/* compiled from: NoteModel.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0003X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lexpo/modules/contacts/next/domain/model/note/NoteModel;", "", "note", "", "<init>", "(Ljava/lang/String;)V", "getNote", "()Ljava/lang/String;", "mimeType", "getMimeType", "contentValues", "Landroid/content/ContentValues;", "getContentValues", "()Landroid/content/ContentValues;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class NoteModel {
    private final ContentValues contentValues;
    private final String mimeType = "vnd.android.cursor.item/note";
    private final String note;

    public NoteModel(String str) {
        this.note = str;
        ContentValues contentValues = new ContentValues();
        contentValues.put(Columns.MIMETYPE, "vnd.android.cursor.item/note");
        contentValues.put(Columns.DATA, str);
        this.contentValues = contentValues;
    }

    public final String getNote() {
        return this.note;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public ContentValues getContentValues() {
        return this.contentValues;
    }
}
