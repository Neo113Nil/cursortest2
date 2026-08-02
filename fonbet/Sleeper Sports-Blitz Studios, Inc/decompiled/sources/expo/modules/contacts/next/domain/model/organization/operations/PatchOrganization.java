package expo.modules.contacts.next.domain.model.organization.operations;

import android.content.ContentProviderOperation;
import android.content.ContentValues;
import expo.modules.contacts.Columns;
import expo.modules.contacts.next.domain.model.Updatable;
import expo.modules.contacts.next.domain.model.organization.OrganizationModel;
import expo.modules.kotlin.types.ValueOrUndefined;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PatchOrganization.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002BW\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lexpo/modules/contacts/next/domain/model/organization/operations/PatchOrganization;", "Lexpo/modules/contacts/next/domain/model/Updatable$Data;", "Lexpo/modules/contacts/next/domain/model/organization/OrganizationModel;", "dataId", "Lexpo/modules/contacts/next/domain/wrappers/DataId;", "company", "Lexpo/modules/kotlin/types/ValueOrUndefined;", "", "department", "jobTitle", "phoneticName", "<init>", "(Ljava/lang/String;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDataId-sXKVoX8", "()Ljava/lang/String;", "Ljava/lang/String;", "contentValues", "Landroid/content/ContentValues;", "getContentValues", "()Landroid/content/ContentValues;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PatchOrganization extends OrganizationModel implements Updatable.Data {
    private final ContentValues contentValues;
    private final String dataId;

    public /* synthetic */ PatchOrganization(String str, ValueOrUndefined valueOrUndefined, ValueOrUndefined valueOrUndefined2, ValueOrUndefined valueOrUndefined3, ValueOrUndefined valueOrUndefined4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, valueOrUndefined, valueOrUndefined2, valueOrUndefined3, valueOrUndefined4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ PatchOrganization(String str, ValueOrUndefined valueOrUndefined, ValueOrUndefined valueOrUndefined2, ValueOrUndefined valueOrUndefined3, ValueOrUndefined valueOrUndefined4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, r3, r4, r5, valueOrUndefined4, null);
        if ((i & 2) != 0) {
            ValueOrUndefined.Companion companion = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            valueOrUndefined = undefined;
        }
        ValueOrUndefined valueOrUndefined5 = valueOrUndefined;
        if ((i & 4) != 0) {
            ValueOrUndefined.Companion companion2 = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined2 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined2, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            valueOrUndefined2 = undefined2;
        }
        ValueOrUndefined valueOrUndefined6 = valueOrUndefined2;
        if ((i & 8) != 0) {
            ValueOrUndefined.Companion companion3 = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined3 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined3, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            valueOrUndefined3 = undefined3;
        }
        ValueOrUndefined valueOrUndefined7 = valueOrUndefined3;
        if ((i & 16) != 0) {
            ValueOrUndefined.Companion companion4 = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined4 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined4, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            valueOrUndefined4 = undefined4;
        }
    }

    @Override // expo.modules.contacts.next.domain.model.Updatable.Data, expo.modules.contacts.next.domain.model.Updatable
    public ContentProviderOperation toUpdateOperation() {
        return Updatable.Data.DefaultImpls.toUpdateOperation(this);
    }

    @Override // expo.modules.contacts.next.domain.model.Updatable.Data, expo.modules.contacts.next.domain.model.Extractable.Data
    /* renamed from: getDataId-sXKVoX8, reason: from getter */
    public String getDataId() {
        return this.dataId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private PatchOrganization(String dataId, ValueOrUndefined<String> company, ValueOrUndefined<String> department, ValueOrUndefined<String> jobTitle, ValueOrUndefined<String> phoneticName) {
        super(company.getOptional(), department.getOptional(), jobTitle.getOptional(), phoneticName.getOptional());
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(company, "company");
        Intrinsics.checkNotNullParameter(department, "department");
        Intrinsics.checkNotNullParameter(jobTitle, "jobTitle");
        Intrinsics.checkNotNullParameter(phoneticName, "phoneticName");
        this.dataId = dataId;
        ContentValues contentValues = new ContentValues();
        if (!company.isUndefined()) {
            contentValues.put(Columns.DATA, company.getOptional());
        }
        if (!department.isUndefined()) {
            contentValues.put(Columns.DATA_5, department.getOptional());
        }
        if (!jobTitle.isUndefined()) {
            contentValues.put(Columns.DATA_4, jobTitle.getOptional());
        }
        if (!phoneticName.isUndefined()) {
            contentValues.put(Columns.DATA_8, phoneticName.getOptional());
        }
        this.contentValues = contentValues;
    }

    @Override // expo.modules.contacts.next.domain.model.organization.OrganizationModel, expo.modules.contacts.next.domain.model.Updatable
    public ContentValues getContentValues() {
        return this.contentValues;
    }
}
