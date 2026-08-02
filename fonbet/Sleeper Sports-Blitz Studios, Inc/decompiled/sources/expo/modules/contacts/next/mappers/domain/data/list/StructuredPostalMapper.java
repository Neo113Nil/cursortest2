package expo.modules.contacts.next.mappers.domain.data.list;

import expo.modules.contacts.next.domain.model.structuredpostal.operations.AppendableStructuredPostal;
import expo.modules.contacts.next.domain.model.structuredpostal.operations.ExistingStructuredPostal;
import expo.modules.contacts.next.domain.model.structuredpostal.operations.NewStructuredPostal;
import expo.modules.contacts.next.domain.model.structuredpostal.operations.PatchStructuredPostal;
import expo.modules.contacts.next.domain.wrappers.DataId;
import expo.modules.contacts.next.mappers.domain.data.list.label.StructuredPostalLabelMapper;
import expo.modules.contacts.next.records.fields.AddressRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StructuredPostalMapper.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004J\u001f\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0016J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¨\u0006\u0017"}, d2 = {"Lexpo/modules/contacts/next/mappers/domain/data/list/StructuredPostalMapper;", "Lexpo/modules/contacts/next/mappers/domain/data/list/ListDataPropertyMapper;", "Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/ExistingStructuredPostal;", "Lexpo/modules/contacts/next/records/fields/AddressRecord$Existing;", "Lexpo/modules/contacts/next/records/fields/AddressRecord$New;", "<init>", "()V", "toNew", "Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/NewStructuredPostal;", "record", "toAppendable", "Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/AppendableStructuredPostal;", "newValue", "rawContactId", "Lexpo/modules/contacts/next/domain/wrappers/RawContactId;", "toAppendable-MYK5hZQ", "(Lexpo/modules/contacts/next/records/fields/AddressRecord$New;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/AppendableStructuredPostal;", "toUpdatable", "toPatch", "Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/PatchStructuredPostal;", "Lexpo/modules/contacts/next/records/fields/AddressRecord$Patch;", "toDto", "model", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StructuredPostalMapper implements ListDataPropertyMapper<ExistingStructuredPostal, AddressRecord.Existing, AddressRecord.New> {
    public static final StructuredPostalMapper INSTANCE = new StructuredPostalMapper();

    private StructuredPostalMapper() {
    }

    public final NewStructuredPostal toNew(AddressRecord.New record) {
        Intrinsics.checkNotNullParameter(record, "record");
        return new NewStructuredPostal(record.getStreet(), record.getCity(), record.getRegion(), record.getPostcode(), record.getCountry(), StructuredPostalLabelMapper.INSTANCE.toDomain(record.getLabel()));
    }

    @Override // expo.modules.contacts.next.mappers.domain.data.list.ListDataPropertyMapper
    /* renamed from: toAppendable-MYK5hZQ, reason: avoid collision after fix types in other method and not valid java name and merged with bridge method [inline-methods] */
    public AppendableStructuredPostal mo11806toAppendableMYK5hZQ(AddressRecord.New newValue, String rawContactId) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        Intrinsics.checkNotNullParameter(rawContactId, "rawContactId");
        return new AppendableStructuredPostal(rawContactId, newValue.getStreet(), newValue.getCity(), newValue.getRegion(), newValue.getPostcode(), newValue.getCountry(), StructuredPostalLabelMapper.INSTANCE.toDomain(newValue.getLabel()), null);
    }

    @Override // expo.modules.contacts.next.mappers.domain.data.list.ListDataPropertyMapper
    public ExistingStructuredPostal toUpdatable(AddressRecord.Existing newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        return new ExistingStructuredPostal(DataId.m11739constructorimpl(newValue.getId()), newValue.getStreet(), newValue.getCity(), newValue.getRegion(), newValue.getPostcode(), newValue.getCountry(), StructuredPostalLabelMapper.INSTANCE.toDomain(newValue.getLabel()), null);
    }

    public final PatchStructuredPostal toPatch(AddressRecord.Patch record) {
        Intrinsics.checkNotNullParameter(record, "record");
        return new PatchStructuredPostal(DataId.m11739constructorimpl(record.getId()), record.getStreet(), record.getCity(), record.getRegion(), record.getPostcode(), record.getCountry(), StructuredPostalLabelMapper.INSTANCE.toDomain(record.getLabel()), null);
    }

    @Override // expo.modules.contacts.next.mappers.domain.data.list.ListDataPropertyMapper
    public AddressRecord.Existing toDto(ExistingStructuredPostal model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return new AddressRecord.Existing(model.getDataId(), StructuredPostalLabelMapper.INSTANCE.toRecord(model.getLabel()), model.getStreet(), model.getCity(), model.getRegion(), model.getPostcode(), model.getCountry());
    }
}
