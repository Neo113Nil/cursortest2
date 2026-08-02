package expo.modules.contacts.next.domain.model.headers.starred;

import android.content.ContentProviderOperation;
import android.content.ContentValues;
import expo.modules.contacts.Columns;
import expo.modules.contacts.next.domain.model.Updatable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExistingStarred.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lexpo/modules/contacts/next/domain/model/headers/starred/ExistingStarred;", "Lexpo/modules/contacts/next/domain/model/Updatable$Contacts;", "contactId", "Lexpo/modules/contacts/next/domain/wrappers/ContactId;", Columns.STARRED, "", "<init>", "(Ljava/lang/String;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getContactId-S9XCBSM", "()Ljava/lang/String;", "Ljava/lang/String;", "contentValues", "Landroid/content/ContentValues;", "getContentValues", "()Landroid/content/ContentValues;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ExistingStarred implements Updatable.Contacts {
    private final String contactId;
    private final ContentValues contentValues;

    public /* synthetic */ ExistingStarred(String str, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z);
    }

    private ExistingStarred(String contactId, boolean z) {
        Intrinsics.checkNotNullParameter(contactId, "contactId");
        this.contactId = contactId;
        ContentValues contentValues = new ContentValues();
        contentValues.put(Columns.STARRED, Integer.valueOf(z ? 1 : 0));
        this.contentValues = contentValues;
    }

    @Override // expo.modules.contacts.next.domain.model.Updatable.Contacts, expo.modules.contacts.next.domain.model.Updatable
    public ContentProviderOperation toUpdateOperation() {
        return Updatable.Contacts.DefaultImpls.toUpdateOperation(this);
    }

    @Override // expo.modules.contacts.next.domain.model.Updatable.Contacts
    /* renamed from: getContactId-S9XCBSM, reason: from getter */
    public String getContactId() {
        return this.contactId;
    }

    @Override // expo.modules.contacts.next.domain.model.Updatable
    public ContentValues getContentValues() {
        return this.contentValues;
    }
}
