package expo.modules.contacts.next.domain.model.organization;

import android.database.Cursor;
import expo.modules.contacts.Columns;
import expo.modules.contacts.next.domain.model.ExtractableField;
import expo.modules.contacts.next.domain.model.organization.operations.ExistingOrganization;
import expo.modules.contacts.next.domain.wrappers.DataId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrganizationField.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nX\u0096\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lexpo/modules/contacts/next/domain/model/organization/OrganizationField;", "Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;", "Lexpo/modules/contacts/next/domain/model/organization/operations/ExistingOrganization;", "<init>", "()V", "mimeType", "", "getMimeType", "()Ljava/lang/String;", "projection", "", "getProjection", "()[Ljava/lang/String;", "[Ljava/lang/String;", "extract", "cursor", "Landroid/database/Cursor;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OrganizationField implements ExtractableField.Data<ExistingOrganization> {
    public static final OrganizationField INSTANCE = new OrganizationField();
    private static final String mimeType = "vnd.android.cursor.item/organization";
    private static final String[] projection = {"_id", Columns.DATA, Columns.DATA_5, Columns.DATA_4, Columns.DATA_8};

    private OrganizationField() {
    }

    @Override // expo.modules.contacts.next.domain.model.ExtractableField.Data
    public String getMimeType() {
        return mimeType;
    }

    @Override // expo.modules.contacts.next.domain.model.ExtractableField
    public String[] getProjection() {
        return projection;
    }

    @Override // expo.modules.contacts.next.domain.model.ExtractableField
    public ExistingOrganization extract(Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        String string = cursor.getString(cursor.getColumnIndexOrThrow("_id"));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new ExistingOrganization(DataId.m11739constructorimpl(string), cursor.getString(cursor.getColumnIndexOrThrow(Columns.DATA)), cursor.getString(cursor.getColumnIndexOrThrow(Columns.DATA_5)), cursor.getString(cursor.getColumnIndexOrThrow(Columns.DATA_4)), cursor.getString(cursor.getColumnIndexOrThrow(Columns.DATA_8)), null);
    }
}
