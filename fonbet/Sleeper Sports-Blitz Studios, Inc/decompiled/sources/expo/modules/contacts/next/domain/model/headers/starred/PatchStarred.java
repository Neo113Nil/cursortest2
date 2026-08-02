package expo.modules.contacts.next.domain.model.headers.starred;

import android.content.ContentProviderOperation;
import android.content.ContentValues;
import expo.modules.contacts.Columns;
import expo.modules.contacts.next.domain.model.Updatable;
import expo.modules.kotlin.types.ValueOrUndefined;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PatchStarred.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lexpo/modules/contacts/next/domain/model/headers/starred/PatchStarred;", "Lexpo/modules/contacts/next/domain/model/Updatable$Contacts;", "contactId", "Lexpo/modules/contacts/next/domain/wrappers/ContactId;", Columns.STARRED, "Lexpo/modules/kotlin/types/ValueOrUndefined;", "", "<init>", "(Ljava/lang/String;Lexpo/modules/kotlin/types/ValueOrUndefined;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getContactId-S9XCBSM", "()Ljava/lang/String;", "Ljava/lang/String;", "contentValues", "Landroid/content/ContentValues;", "getContentValues", "()Landroid/content/ContentValues;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PatchStarred implements Updatable.Contacts {
    private final String contactId;
    private final ContentValues contentValues;

    public /* synthetic */ PatchStarred(String str, ValueOrUndefined valueOrUndefined, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, valueOrUndefined);
    }

    private PatchStarred(String contactId, ValueOrUndefined<Boolean> starred) {
        Intrinsics.checkNotNullParameter(contactId, "contactId");
        Intrinsics.checkNotNullParameter(starred, "starred");
        this.contactId = contactId;
        ContentValues contentValues = new ContentValues();
        if (!starred.isUndefined()) {
            contentValues.put(Columns.STARRED, Integer.valueOf(Intrinsics.areEqual((Object) starred.getOptional(), (Object) true) ? 1 : 0));
        }
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
