package expo.modules.contacts.next.mappers.domain.data.list;

import expo.modules.contacts.next.domain.model.nickname.operations.AppendableNickname;
import expo.modules.contacts.next.domain.model.nickname.operations.ExistingNickname;
import expo.modules.contacts.next.domain.model.nickname.operations.NewNickname;
import expo.modules.contacts.next.domain.model.nickname.operations.PatchNickname;
import expo.modules.contacts.next.domain.wrappers.DataId;
import expo.modules.contacts.next.mappers.domain.data.list.label.NicknameLabelMapper;
import expo.modules.contacts.next.records.fields.ExtraNameRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NicknameMapper.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004J\u001f\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0016J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¨\u0006\u0017"}, d2 = {"Lexpo/modules/contacts/next/mappers/domain/data/list/NicknameMapper;", "Lexpo/modules/contacts/next/mappers/domain/data/list/ListDataPropertyMapper;", "Lexpo/modules/contacts/next/domain/model/nickname/operations/ExistingNickname;", "Lexpo/modules/contacts/next/records/fields/ExtraNameRecord$Existing;", "Lexpo/modules/contacts/next/records/fields/ExtraNameRecord$New;", "<init>", "()V", "toNew", "Lexpo/modules/contacts/next/domain/model/nickname/operations/NewNickname;", "record", "toAppendable", "Lexpo/modules/contacts/next/domain/model/nickname/operations/AppendableNickname;", "newValue", "rawContactId", "Lexpo/modules/contacts/next/domain/wrappers/RawContactId;", "toAppendable-MYK5hZQ", "(Lexpo/modules/contacts/next/records/fields/ExtraNameRecord$New;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/nickname/operations/AppendableNickname;", "toUpdatable", "toPatch", "Lexpo/modules/contacts/next/domain/model/nickname/operations/PatchNickname;", "Lexpo/modules/contacts/next/records/fields/ExtraNameRecord$Patch;", "toDto", "model", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NicknameMapper implements ListDataPropertyMapper<ExistingNickname, ExtraNameRecord.Existing, ExtraNameRecord.New> {
    public static final NicknameMapper INSTANCE = new NicknameMapper();

    private NicknameMapper() {
    }

    public final NewNickname toNew(ExtraNameRecord.New record) {
        Intrinsics.checkNotNullParameter(record, "record");
        return new NewNickname(record.getName(), NicknameLabelMapper.INSTANCE.toDomain(record.getLabel()));
    }

    @Override // expo.modules.contacts.next.mappers.domain.data.list.ListDataPropertyMapper
    /* renamed from: toAppendable-MYK5hZQ, reason: avoid collision after fix types in other method and not valid java name and merged with bridge method [inline-methods] */
    public AppendableNickname mo11806toAppendableMYK5hZQ(ExtraNameRecord.New newValue, String rawContactId) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        Intrinsics.checkNotNullParameter(rawContactId, "rawContactId");
        return new AppendableNickname(rawContactId, newValue.getName(), NicknameLabelMapper.INSTANCE.toDomain(newValue.getLabel()), null);
    }

    @Override // expo.modules.contacts.next.mappers.domain.data.list.ListDataPropertyMapper
    public ExistingNickname toUpdatable(ExtraNameRecord.Existing newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        return new ExistingNickname(DataId.m11739constructorimpl(newValue.getId()), newValue.getName(), NicknameLabelMapper.INSTANCE.toDomain(newValue.getLabel()), null);
    }

    public final PatchNickname toPatch(ExtraNameRecord.Patch record) {
        Intrinsics.checkNotNullParameter(record, "record");
        return new PatchNickname(DataId.m11739constructorimpl(record.getId()), record.getName(), NicknameLabelMapper.INSTANCE.toDomain(record.getLabel()), null);
    }

    @Override // expo.modules.contacts.next.mappers.domain.data.list.ListDataPropertyMapper
    public ExtraNameRecord.Existing toDto(ExistingNickname model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return new ExtraNameRecord.Existing(model.getDataId(), NicknameLabelMapper.INSTANCE.toRecord(model.getLabel()), model.getName());
    }
}
