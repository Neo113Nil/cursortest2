package expo.modules.contacts.next.domain.model;

import android.content.ContentProviderOperation;
import android.content.ContentValues;
import android.provider.ContactsContract;
import expo.modules.contacts.next.domain.wrappers.RawContactId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Appendable.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0005R\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lexpo/modules/contacts/next/domain/model/Appendable;", "", "rawContactId", "Lexpo/modules/contacts/next/domain/wrappers/RawContactId;", "getRawContactId-WW_a-ig", "()Ljava/lang/String;", "mimeType", "", "getMimeType", "contentValues", "Landroid/content/ContentValues;", "getContentValues", "()Landroid/content/ContentValues;", "toAppendOperation", "Landroid/content/ContentProviderOperation;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface Appendable {
    ContentValues getContentValues();

    String getMimeType();

    /* renamed from: getRawContactId-WW_a-ig, reason: not valid java name */
    String mo11654getRawContactIdWW_aig();

    ContentProviderOperation toAppendOperation();

    /* compiled from: Appendable.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static ContentProviderOperation toAppendOperation(Appendable appendable) {
            ContentProviderOperation.Builder newInsert = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
            newInsert.withValue(RawContactId.COLUMN_IN_DATA_TABLE, appendable.mo11654getRawContactIdWW_aig());
            newInsert.withValues(appendable.getContentValues());
            ContentProviderOperation build = newInsert.build();
            Intrinsics.checkNotNullExpressionValue(build, "with(...)");
            return build;
        }
    }
}
