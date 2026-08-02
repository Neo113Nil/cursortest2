package expo.modules.contacts.next.mappers.domain.data;

import expo.modules.contacts.next.domain.model.organization.operations.AppendableOrganization;
import expo.modules.contacts.next.domain.model.organization.operations.ExistingOrganization;
import expo.modules.contacts.next.domain.model.organization.operations.PatchOrganization;
import expo.modules.kotlin.types.ValueOrUndefined;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrganizationPropertyMapper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lexpo/modules/contacts/next/mappers/domain/data/OrganizationPropertyMapper;", "", "<init>", "()V", "Company", "Department", "JobTitle", "PhoneticName", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class OrganizationPropertyMapper {
    public /* synthetic */ OrganizationPropertyMapper(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: OrganizationPropertyMapper.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J!\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lexpo/modules/contacts/next/mappers/domain/data/OrganizationPropertyMapper$Company;", "Lexpo/modules/contacts/next/mappers/domain/data/MutableDataPropertyMapper;", "Lexpo/modules/contacts/next/domain/model/organization/operations/ExistingOrganization;", "", "<init>", "()V", "toDto", "model", "toUpdatable", "Lexpo/modules/contacts/next/domain/model/organization/operations/PatchOrganization;", "dataId", "Lexpo/modules/contacts/next/domain/wrappers/DataId;", "newValue", "toUpdatable-bM46d30", "(Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/organization/operations/PatchOrganization;", "toAppendable", "Lexpo/modules/contacts/next/domain/model/organization/operations/AppendableOrganization;", "rawContactId", "Lexpo/modules/contacts/next/domain/wrappers/RawContactId;", "toAppendable-MYK5hZQ", "(Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/organization/operations/AppendableOrganization;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Company implements MutableDataPropertyMapper<ExistingOrganization, String> {
        public static final Company INSTANCE = new Company();

        private Company() {
        }

        @Override // expo.modules.contacts.next.mappers.domain.data.DataPropertyMapper
        public String toDto(ExistingOrganization model) {
            Intrinsics.checkNotNullParameter(model, "model");
            return model.getCompany();
        }

        @Override // expo.modules.contacts.next.mappers.domain.data.MutableDataPropertyMapper
        /* renamed from: toUpdatable-bM46d30, reason: avoid collision after fix types in other method and not valid java name and merged with bridge method [inline-methods] */
        public PatchOrganization mo11777toUpdatablebM46d30(String dataId, String newValue) {
            Intrinsics.checkNotNullParameter(dataId, "dataId");
            return new PatchOrganization(dataId, new ValueOrUndefined.Value(newValue), null, null, null, 28, null);
        }

        @Override // expo.modules.contacts.next.mappers.domain.data.MutableDataPropertyMapper
        /* renamed from: toAppendable-MYK5hZQ, reason: avoid collision after fix types in other method and not valid java name and merged with bridge method [inline-methods] */
        public AppendableOrganization mo11776toAppendableMYK5hZQ(String newValue, String rawContactId) {
            Intrinsics.checkNotNullParameter(rawContactId, "rawContactId");
            return new AppendableOrganization(rawContactId, newValue, null, null, null, 28, null);
        }
    }

    private OrganizationPropertyMapper() {
    }

    /* compiled from: OrganizationPropertyMapper.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J!\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lexpo/modules/contacts/next/mappers/domain/data/OrganizationPropertyMapper$Department;", "Lexpo/modules/contacts/next/mappers/domain/data/MutableDataPropertyMapper;", "Lexpo/modules/contacts/next/domain/model/organization/operations/ExistingOrganization;", "", "<init>", "()V", "toDto", "model", "toUpdatable", "Lexpo/modules/contacts/next/domain/model/organization/operations/PatchOrganization;", "dataId", "Lexpo/modules/contacts/next/domain/wrappers/DataId;", "newValue", "toUpdatable-bM46d30", "(Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/organization/operations/PatchOrganization;", "toAppendable", "Lexpo/modules/contacts/next/domain/model/organization/operations/AppendableOrganization;", "rawContactId", "Lexpo/modules/contacts/next/domain/wrappers/RawContactId;", "toAppendable-MYK5hZQ", "(Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/organization/operations/AppendableOrganization;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Department implements MutableDataPropertyMapper<ExistingOrganization, String> {
        public static final Department INSTANCE = new Department();

        private Department() {
        }

        @Override // expo.modules.contacts.next.mappers.domain.data.DataPropertyMapper
        public String toDto(ExistingOrganization model) {
            Intrinsics.checkNotNullParameter(model, "model");
            return model.getDepartment();
        }

        @Override // expo.modules.contacts.next.mappers.domain.data.MutableDataPropertyMapper
        /* renamed from: toUpdatable-bM46d30, reason: avoid collision after fix types in other method and not valid java name and merged with bridge method [inline-methods] */
        public PatchOrganization mo11777toUpdatablebM46d30(String dataId, String newValue) {
            Intrinsics.checkNotNullParameter(dataId, "dataId");
            return new PatchOrganization(dataId, null, new ValueOrUndefined.Value(newValue), null, null, 26, null);
        }

        @Override // expo.modules.contacts.next.mappers.domain.data.MutableDataPropertyMapper
        /* renamed from: toAppendable-MYK5hZQ, reason: avoid collision after fix types in other method and not valid java name and merged with bridge method [inline-methods] */
        public AppendableOrganization mo11776toAppendableMYK5hZQ(String newValue, String rawContactId) {
            Intrinsics.checkNotNullParameter(rawContactId, "rawContactId");
            return new AppendableOrganization(rawContactId, null, newValue, null, null, 26, null);
        }
    }

    /* compiled from: OrganizationPropertyMapper.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J!\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lexpo/modules/contacts/next/mappers/domain/data/OrganizationPropertyMapper$JobTitle;", "Lexpo/modules/contacts/next/mappers/domain/data/MutableDataPropertyMapper;", "Lexpo/modules/contacts/next/domain/model/organization/operations/ExistingOrganization;", "", "<init>", "()V", "toDto", "model", "toUpdatable", "Lexpo/modules/contacts/next/domain/model/organization/operations/PatchOrganization;", "dataId", "Lexpo/modules/contacts/next/domain/wrappers/DataId;", "newValue", "toUpdatable-bM46d30", "(Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/organization/operations/PatchOrganization;", "toAppendable", "Lexpo/modules/contacts/next/domain/model/organization/operations/AppendableOrganization;", "rawContactId", "Lexpo/modules/contacts/next/domain/wrappers/RawContactId;", "toAppendable-MYK5hZQ", "(Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/organization/operations/AppendableOrganization;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class JobTitle implements MutableDataPropertyMapper<ExistingOrganization, String> {
        public static final JobTitle INSTANCE = new JobTitle();

        private JobTitle() {
        }

        @Override // expo.modules.contacts.next.mappers.domain.data.DataPropertyMapper
        public String toDto(ExistingOrganization model) {
            Intrinsics.checkNotNullParameter(model, "model");
            return model.getJobTitle();
        }

        @Override // expo.modules.contacts.next.mappers.domain.data.MutableDataPropertyMapper
        /* renamed from: toUpdatable-bM46d30, reason: avoid collision after fix types in other method and not valid java name and merged with bridge method [inline-methods] */
        public PatchOrganization mo11777toUpdatablebM46d30(String dataId, String newValue) {
            Intrinsics.checkNotNullParameter(dataId, "dataId");
            return new PatchOrganization(dataId, null, null, new ValueOrUndefined.Value(newValue), null, 22, null);
        }

        @Override // expo.modules.contacts.next.mappers.domain.data.MutableDataPropertyMapper
        /* renamed from: toAppendable-MYK5hZQ, reason: avoid collision after fix types in other method and not valid java name and merged with bridge method [inline-methods] */
        public AppendableOrganization mo11776toAppendableMYK5hZQ(String newValue, String rawContactId) {
            Intrinsics.checkNotNullParameter(rawContactId, "rawContactId");
            return new AppendableOrganization(rawContactId, null, null, newValue, null, 22, null);
        }
    }

    /* compiled from: OrganizationPropertyMapper.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J!\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lexpo/modules/contacts/next/mappers/domain/data/OrganizationPropertyMapper$PhoneticName;", "Lexpo/modules/contacts/next/mappers/domain/data/MutableDataPropertyMapper;", "Lexpo/modules/contacts/next/domain/model/organization/operations/ExistingOrganization;", "", "<init>", "()V", "toDto", "model", "toUpdatable", "Lexpo/modules/contacts/next/domain/model/organization/operations/PatchOrganization;", "dataId", "Lexpo/modules/contacts/next/domain/wrappers/DataId;", "newValue", "toUpdatable-bM46d30", "(Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/organization/operations/PatchOrganization;", "toAppendable", "Lexpo/modules/contacts/next/domain/model/organization/operations/AppendableOrganization;", "rawContactId", "Lexpo/modules/contacts/next/domain/wrappers/RawContactId;", "toAppendable-MYK5hZQ", "(Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/organization/operations/AppendableOrganization;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PhoneticName implements MutableDataPropertyMapper<ExistingOrganization, String> {
        public static final PhoneticName INSTANCE = new PhoneticName();

        private PhoneticName() {
        }

        @Override // expo.modules.contacts.next.mappers.domain.data.DataPropertyMapper
        public String toDto(ExistingOrganization model) {
            Intrinsics.checkNotNullParameter(model, "model");
            return model.getPhoneticName();
        }

        @Override // expo.modules.contacts.next.mappers.domain.data.MutableDataPropertyMapper
        /* renamed from: toUpdatable-bM46d30, reason: avoid collision after fix types in other method and not valid java name and merged with bridge method [inline-methods] */
        public PatchOrganization mo11777toUpdatablebM46d30(String dataId, String newValue) {
            Intrinsics.checkNotNullParameter(dataId, "dataId");
            return new PatchOrganization(dataId, null, null, null, new ValueOrUndefined.Value(newValue), 14, null);
        }

        @Override // expo.modules.contacts.next.mappers.domain.data.MutableDataPropertyMapper
        /* renamed from: toAppendable-MYK5hZQ, reason: avoid collision after fix types in other method and not valid java name and merged with bridge method [inline-methods] */
        public AppendableOrganization mo11776toAppendableMYK5hZQ(String newValue, String rawContactId) {
            Intrinsics.checkNotNullParameter(rawContactId, "rawContactId");
            return new AppendableOrganization(rawContactId, null, null, null, newValue, 14, null);
        }
    }
}
