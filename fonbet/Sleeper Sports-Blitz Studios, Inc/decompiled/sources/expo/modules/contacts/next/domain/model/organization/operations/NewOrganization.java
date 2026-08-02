package expo.modules.contacts.next.domain.model.organization.operations;

import android.content.ContentProviderOperation;
import expo.modules.contacts.next.domain.model.Insertable;
import expo.modules.contacts.next.domain.model.organization.OrganizationModel;
import kotlin.Metadata;

/* compiled from: NewOrganization.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lexpo/modules/contacts/next/domain/model/organization/operations/NewOrganization;", "Lexpo/modules/contacts/next/domain/model/organization/OrganizationModel;", "Lexpo/modules/contacts/next/domain/model/Insertable;", "company", "", "department", "jobTitle", "phoneticName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NewOrganization extends OrganizationModel implements Insertable {
    @Override // expo.modules.contacts.next.domain.model.Insertable
    public ContentProviderOperation toInsertOperation() {
        return Insertable.DefaultImpls.toInsertOperation(this);
    }

    public NewOrganization(String str, String str2, String str3, String str4) {
        super(str, str2, str3, str4);
    }
}
