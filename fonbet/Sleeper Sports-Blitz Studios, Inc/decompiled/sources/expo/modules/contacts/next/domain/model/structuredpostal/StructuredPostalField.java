package expo.modules.contacts.next.domain.model.structuredpostal;

import android.database.Cursor;
import expo.modules.contacts.Columns;
import expo.modules.contacts.next.domain.model.ExtractableField;
import expo.modules.contacts.next.domain.model.structuredpostal.StructuredPostalLabel;
import expo.modules.contacts.next.domain.model.structuredpostal.operations.ExistingStructuredPostal;
import expo.modules.contacts.next.domain.wrappers.DataId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StructuredPostalField.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0010H\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nX\u0096\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalField;", "Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;", "Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/ExistingStructuredPostal;", "<init>", "()V", "mimeType", "", "getMimeType", "()Ljava/lang/String;", "projection", "", "getProjection", "()[Ljava/lang/String;", "[Ljava/lang/String;", "extract", "cursor", "Landroid/database/Cursor;", "extractLabel", "Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StructuredPostalField implements ExtractableField.Data<ExistingStructuredPostal> {
    public static final StructuredPostalField INSTANCE = new StructuredPostalField();
    private static final String mimeType = "vnd.android.cursor.item/postal-address_v2";
    private static final String[] projection = {"_id", Columns.DATA_4, Columns.DATA_7, Columns.DATA_8, Columns.DATA_9, Columns.DATA_10, Columns.TYPE, Columns.LABEL};

    private StructuredPostalField() {
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
    public ExistingStructuredPostal extract(Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        String string = cursor.getString(cursor.getColumnIndexOrThrow("_id"));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new ExistingStructuredPostal(DataId.m11739constructorimpl(string), cursor.getString(cursor.getColumnIndexOrThrow(Columns.DATA_4)), cursor.getString(cursor.getColumnIndexOrThrow(Columns.DATA_7)), cursor.getString(cursor.getColumnIndexOrThrow(Columns.DATA_8)), cursor.getString(cursor.getColumnIndexOrThrow(Columns.DATA_9)), cursor.getString(cursor.getColumnIndexOrThrow(Columns.DATA_10)), INSTANCE.extractLabel(cursor), null);
    }

    private final StructuredPostalLabel extractLabel(Cursor cursor) {
        int i = cursor.getInt(cursor.getColumnIndexOrThrow(Columns.TYPE));
        if (i == 1) {
            return StructuredPostalLabel.Home.INSTANCE;
        }
        if (i == 2) {
            return StructuredPostalLabel.Work.INSTANCE;
        }
        if (i == 3) {
            return StructuredPostalLabel.Other.INSTANCE;
        }
        String string = cursor.getString(cursor.getColumnIndexOrThrow(Columns.LABEL));
        Intrinsics.checkNotNull(string);
        return new StructuredPostalLabel.Custom(string);
    }
}
