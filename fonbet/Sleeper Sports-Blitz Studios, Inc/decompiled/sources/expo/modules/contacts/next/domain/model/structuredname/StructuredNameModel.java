package expo.modules.contacts.next.domain.model.structuredname;

import android.content.ContentValues;
import expo.modules.contacts.Columns;
import kotlin.Metadata;

/* compiled from: StructuredNameModel.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0014\u0010\u0016\u001a\u00020\u0003X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000eR\u0014\u0010\u0018\u001a\u00020\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lexpo/modules/contacts/next/domain/model/structuredname/StructuredNameModel;", "", "givenName", "", "middleName", "familyName", "prefix", "suffix", "phoneticGivenName", "phoneticMiddleName", "phoneticFamilyName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getGivenName", "()Ljava/lang/String;", "getMiddleName", "getFamilyName", "getPrefix", "getSuffix", "getPhoneticGivenName", "getPhoneticMiddleName", "getPhoneticFamilyName", "mimeType", "getMimeType", "contentValues", "Landroid/content/ContentValues;", "getContentValues", "()Landroid/content/ContentValues;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class StructuredNameModel {
    private final ContentValues contentValues;
    private final String familyName;
    private final String givenName;
    private final String middleName;
    private final String mimeType = "vnd.android.cursor.item/name";
    private final String phoneticFamilyName;
    private final String phoneticGivenName;
    private final String phoneticMiddleName;
    private final String prefix;
    private final String suffix;

    public StructuredNameModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.givenName = str;
        this.middleName = str2;
        this.familyName = str3;
        this.prefix = str4;
        this.suffix = str5;
        this.phoneticGivenName = str6;
        this.phoneticMiddleName = str7;
        this.phoneticFamilyName = str8;
        ContentValues contentValues = new ContentValues();
        contentValues.put(Columns.MIMETYPE, "vnd.android.cursor.item/name");
        contentValues.put(Columns.TYPE, str);
        contentValues.put(Columns.TYPE, str);
        contentValues.put(Columns.DATA_5, str2);
        contentValues.put(Columns.LABEL, str3);
        contentValues.put(Columns.DATA_4, str4);
        contentValues.put(Columns.DATA_6, str5);
        contentValues.put(Columns.DATA_7, str6);
        contentValues.put(Columns.DATA_8, str7);
        contentValues.put(Columns.DATA_9, str8);
        this.contentValues = contentValues;
    }

    public final String getGivenName() {
        return this.givenName;
    }

    public final String getMiddleName() {
        return this.middleName;
    }

    public final String getFamilyName() {
        return this.familyName;
    }

    public final String getPrefix() {
        return this.prefix;
    }

    public final String getSuffix() {
        return this.suffix;
    }

    public final String getPhoneticGivenName() {
        return this.phoneticGivenName;
    }

    public final String getPhoneticMiddleName() {
        return this.phoneticMiddleName;
    }

    public final String getPhoneticFamilyName() {
        return this.phoneticFamilyName;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public ContentValues getContentValues() {
        return this.contentValues;
    }
}
