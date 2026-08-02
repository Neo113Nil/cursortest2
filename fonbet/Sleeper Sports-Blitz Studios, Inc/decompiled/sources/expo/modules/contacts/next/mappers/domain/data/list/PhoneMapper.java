package expo.modules.contacts.next.mappers.domain.data.list;

import expo.modules.contacts.next.domain.model.phone.operations.AppendablePhone;
import expo.modules.contacts.next.domain.model.phone.operations.ExistingPhone;
import expo.modules.contacts.next.domain.model.phone.operations.NewPhone;
import expo.modules.contacts.next.domain.model.phone.operations.PatchPhone;
import expo.modules.contacts.next.domain.wrappers.DataId;
import expo.modules.contacts.next.mappers.domain.data.list.label.PhoneLabelMapper;
import expo.modules.contacts.next.records.fields.PhoneRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PhoneMapper.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004J\u001f\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0016J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¨\u0006\u0017"}, d2 = {"Lexpo/modules/contacts/next/mappers/domain/data/list/PhoneMapper;", "Lexpo/modules/contacts/next/mappers/domain/data/list/ListDataPropertyMapper;", "Lexpo/modules/contacts/next/domain/model/phone/operations/ExistingPhone;", "Lexpo/modules/contacts/next/records/fields/PhoneRecord$Existing;", "Lexpo/modules/contacts/next/records/fields/PhoneRecord$New;", "<init>", "()V", "toNew", "Lexpo/modules/contacts/next/domain/model/phone/operations/NewPhone;", "record", "toAppendable", "Lexpo/modules/contacts/next/domain/model/phone/operations/AppendablePhone;", "newValue", "rawContactId", "Lexpo/modules/contacts/next/domain/wrappers/RawContactId;", "toAppendable-MYK5hZQ", "(Lexpo/modules/contacts/next/records/fields/PhoneRecord$New;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/phone/operations/AppendablePhone;", "toUpdatable", "toPatch", "Lexpo/modules/contacts/next/domain/model/phone/operations/PatchPhone;", "Lexpo/modules/contacts/next/records/fields/PhoneRecord$Patch;", "toDto", "model", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PhoneMapper implements ListDataPropertyMapper<ExistingPhone, PhoneRecord.Existing, PhoneRecord.New> {
    public static final PhoneMapper INSTANCE = new PhoneMapper();

    private PhoneMapper() {
    }

    public final NewPhone toNew(PhoneRecord.New record) {
        Intrinsics.checkNotNullParameter(record, "record");
        return new NewPhone(record.getNumber(), PhoneLabelMapper.INSTANCE.toDomain(record.getLabel()));
    }

    @Override // expo.modules.contacts.next.mappers.domain.data.list.ListDataPropertyMapper
    /* renamed from: toAppendable-MYK5hZQ, reason: avoid collision after fix types in other method and not valid java name and merged with bridge method [inline-methods] */
    public AppendablePhone mo11806toAppendableMYK5hZQ(PhoneRecord.New newValue, String rawContactId) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        Intrinsics.checkNotNullParameter(rawContactId, "rawContactId");
        return new AppendablePhone(rawContactId, newValue.getNumber(), PhoneLabelMapper.INSTANCE.toDomain(newValue.getLabel()), null);
    }

    @Override // expo.modules.contacts.next.mappers.domain.data.list.ListDataPropertyMapper
    public ExistingPhone toUpdatable(PhoneRecord.Existing newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        return new ExistingPhone(DataId.m11739constructorimpl(newValue.getId()), newValue.getNumber(), PhoneLabelMapper.INSTANCE.toDomain(newValue.getLabel()), null);
    }

    public final PatchPhone toPatch(PhoneRecord.Patch record) {
        Intrinsics.checkNotNullParameter(record, "record");
        return new PatchPhone(DataId.m11739constructorimpl(record.getId()), record.getNumber(), PhoneLabelMapper.INSTANCE.toDomain(record.getLabel()), null);
    }

    @Override // expo.modules.contacts.next.mappers.domain.data.list.ListDataPropertyMapper
    public PhoneRecord.Existing toDto(ExistingPhone model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return new PhoneRecord.Existing(model.getDataId(), PhoneLabelMapper.INSTANCE.toRecord(model.getLabel()), model.getNumber());
    }
}
