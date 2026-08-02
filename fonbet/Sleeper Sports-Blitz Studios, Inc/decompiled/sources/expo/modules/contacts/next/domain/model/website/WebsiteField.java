package expo.modules.contacts.next.domain.model.website;

import android.database.Cursor;
import expo.modules.contacts.Columns;
import expo.modules.contacts.next.domain.model.ExtractableField;
import expo.modules.contacts.next.domain.model.website.WebsiteLabel;
import expo.modules.contacts.next.domain.model.website.operations.ExistingWebsite;
import expo.modules.contacts.next.domain.wrappers.DataId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebsiteField.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0010H\u0002R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0096\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lexpo/modules/contacts/next/domain/model/website/WebsiteField;", "Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;", "Lexpo/modules/contacts/next/domain/model/website/operations/ExistingWebsite;", "<init>", "()V", "projection", "", "", "getProjection", "()[Ljava/lang/String;", "[Ljava/lang/String;", "mimeType", "getMimeType", "()Ljava/lang/String;", "extract", "cursor", "Landroid/database/Cursor;", "extractLabel", "Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class WebsiteField implements ExtractableField.Data<ExistingWebsite> {
    public static final WebsiteField INSTANCE = new WebsiteField();
    private static final String[] projection = {"_id", Columns.DATA, Columns.TYPE, Columns.LABEL};
    private static final String mimeType = "vnd.android.cursor.item/website";

    private WebsiteField() {
    }

    @Override // expo.modules.contacts.next.domain.model.ExtractableField
    public String[] getProjection() {
        return projection;
    }

    @Override // expo.modules.contacts.next.domain.model.ExtractableField.Data
    public String getMimeType() {
        return mimeType;
    }

    @Override // expo.modules.contacts.next.domain.model.ExtractableField
    public ExistingWebsite extract(Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        String string = cursor.getString(cursor.getColumnIndexOrThrow("_id"));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new ExistingWebsite(DataId.m11739constructorimpl(string), cursor.getString(cursor.getColumnIndexOrThrow(Columns.DATA)), INSTANCE.extractLabel(cursor), null);
    }

    private final WebsiteLabel extractLabel(Cursor cursor) {
        switch (cursor.getInt(cursor.getColumnIndexOrThrow(Columns.TYPE))) {
            case 1:
                return WebsiteLabel.Homepage.INSTANCE;
            case 2:
                return WebsiteLabel.Blog.INSTANCE;
            case 3:
                return WebsiteLabel.Profile.INSTANCE;
            case 4:
                return WebsiteLabel.Home.INSTANCE;
            case 5:
                return WebsiteLabel.Work.INSTANCE;
            case 6:
                return WebsiteLabel.Ftp.INSTANCE;
            case 7:
                return WebsiteLabel.Other.INSTANCE;
            default:
                String string = cursor.getString(cursor.getColumnIndexOrThrow(Columns.LABEL));
                Intrinsics.checkNotNull(string);
                return new WebsiteLabel.Custom(string);
        }
    }
}
