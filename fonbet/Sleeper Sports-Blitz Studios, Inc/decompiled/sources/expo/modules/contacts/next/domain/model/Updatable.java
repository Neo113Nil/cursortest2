package expo.modules.contacts.next.domain.model;

import android.content.ContentProviderOperation;
import android.content.ContentValues;
import android.provider.ContactsContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Updatable.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\b\tJ\b\u0010\u0006\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lexpo/modules/contacts/next/domain/model/Updatable;", "", "contentValues", "Landroid/content/ContentValues;", "getContentValues", "()Landroid/content/ContentValues;", "toUpdateOperation", "Landroid/content/ContentProviderOperation;", "Contacts", "Data", "Lexpo/modules/contacts/next/domain/model/Updatable$Contacts;", "Lexpo/modules/contacts/next/domain/model/Updatable$Data;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface Updatable {
    ContentValues getContentValues();

    ContentProviderOperation toUpdateOperation();

    /* compiled from: Updatable.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lexpo/modules/contacts/next/domain/model/Updatable$Contacts;", "Lexpo/modules/contacts/next/domain/model/Updatable;", "contactId", "Lexpo/modules/contacts/next/domain/wrappers/ContactId;", "getContactId-S9XCBSM", "()Ljava/lang/String;", "toUpdateOperation", "Landroid/content/ContentProviderOperation;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Contacts extends Updatable {
        /* renamed from: getContactId-S9XCBSM, reason: not valid java name */
        String mo11656getContactIdS9XCBSM();

        @Override // expo.modules.contacts.next.domain.model.Updatable
        ContentProviderOperation toUpdateOperation();

        /* compiled from: Updatable.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class DefaultImpls {
            public static ContentProviderOperation toUpdateOperation(Contacts contacts) {
                ContentProviderOperation.Builder newUpdate = ContentProviderOperation.newUpdate(ContactsContract.Contacts.CONTENT_URI);
                newUpdate.withSelection("_id=?", new String[]{contacts.mo11656getContactIdS9XCBSM()});
                newUpdate.withValues(contacts.getContentValues());
                ContentProviderOperation build = newUpdate.build();
                Intrinsics.checkNotNullExpressionValue(build, "with(...)");
                return build;
            }
        }
    }

    /* compiled from: Updatable.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\t\u001a\u00020\nH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0005¨\u0006\u000b"}, d2 = {"Lexpo/modules/contacts/next/domain/model/Updatable$Data;", "Lexpo/modules/contacts/next/domain/model/Updatable;", "dataId", "Lexpo/modules/contacts/next/domain/wrappers/DataId;", "getDataId-sXKVoX8", "()Ljava/lang/String;", "mimeType", "", "getMimeType", "toUpdateOperation", "Landroid/content/ContentProviderOperation;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Data extends Updatable {
        /* renamed from: getDataId-sXKVoX8 */
        String mo11655getDataIdsXKVoX8();

        String getMimeType();

        @Override // expo.modules.contacts.next.domain.model.Updatable
        ContentProviderOperation toUpdateOperation();

        /* compiled from: Updatable.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class DefaultImpls {
            public static ContentProviderOperation toUpdateOperation(Data data) {
                ContentProviderOperation.Builder newUpdate = ContentProviderOperation.newUpdate(ContactsContract.Data.CONTENT_URI);
                newUpdate.withSelection("_id = ? AND mimetype = ?", new String[]{data.mo11655getDataIdsXKVoX8(), data.getMimeType()});
                newUpdate.withValues(data.getContentValues());
                ContentProviderOperation build = newUpdate.build();
                Intrinsics.checkNotNullExpressionValue(build, "with(...)");
                return build;
            }
        }
    }
}
