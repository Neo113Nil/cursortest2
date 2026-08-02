package expo.modules.contacts.next.mappers;

import expo.modules.contacts.next.records.contact.PatchContactRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: isChangingAnything.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0004"}, d2 = {"isChangingStructuredName", "", "Lexpo/modules/contacts/next/records/contact/PatchContactRecord;", "isChangingOrganization", "expo-contacts_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IsChangingAnythingKt {
    public static final boolean isChangingStructuredName(PatchContactRecord patchContactRecord) {
        Intrinsics.checkNotNullParameter(patchContactRecord, "<this>");
        return (patchContactRecord.getGivenName().isUndefined() && patchContactRecord.getMiddleName().isUndefined() && patchContactRecord.getFamilyName().isUndefined() && patchContactRecord.getPrefix().isUndefined() && patchContactRecord.getSuffix().isUndefined() && patchContactRecord.getPhoneticGivenName().isUndefined() && patchContactRecord.getPhoneticMiddleName().isUndefined() && patchContactRecord.getPhoneticFamilyName().isUndefined()) ? false : true;
    }

    public static final boolean isChangingOrganization(PatchContactRecord patchContactRecord) {
        Intrinsics.checkNotNullParameter(patchContactRecord, "<this>");
        return (patchContactRecord.getCompany().isUndefined() && patchContactRecord.getDepartment().isUndefined() && patchContactRecord.getJobTitle().isUndefined() && patchContactRecord.getPhoneticCompanyName().isUndefined()) ? false : true;
    }
}
