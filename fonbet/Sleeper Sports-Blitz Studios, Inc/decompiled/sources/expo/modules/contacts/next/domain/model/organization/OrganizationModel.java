package expo.modules.contacts.next.domain.model.organization;

import android.content.ContentValues;
import expo.modules.contacts.Columns;
import kotlin.Metadata;

/* compiled from: OrganizationModel.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u0003X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lexpo/modules/contacts/next/domain/model/organization/OrganizationModel;", "", "company", "", "department", "jobTitle", "phoneticName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCompany", "()Ljava/lang/String;", "getDepartment", "getJobTitle", "getPhoneticName", "mimeType", "getMimeType", "contentValues", "Landroid/content/ContentValues;", "getContentValues", "()Landroid/content/ContentValues;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class OrganizationModel {
    private final String company;
    private final ContentValues contentValues;
    private final String department;
    private final String jobTitle;
    private final String mimeType = "vnd.android.cursor.item/organization";
    private final String phoneticName;

    public OrganizationModel(String str, String str2, String str3, String str4) {
        this.company = str;
        this.department = str2;
        this.jobTitle = str3;
        this.phoneticName = str4;
        ContentValues contentValues = new ContentValues();
        contentValues.put(Columns.MIMETYPE, "vnd.android.cursor.item/organization");
        contentValues.put(Columns.DATA, str);
        contentValues.put(Columns.DATA_5, str2);
        contentValues.put(Columns.DATA_4, str3);
        contentValues.put(Columns.DATA_8, str4);
        this.contentValues = contentValues;
    }

    public final String getCompany() {
        return this.company;
    }

    public final String getDepartment() {
        return this.department;
    }

    public final String getJobTitle() {
        return this.jobTitle;
    }

    public final String getPhoneticName() {
        return this.phoneticName;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public ContentValues getContentValues() {
        return this.contentValues;
    }
}
