package expo.modules.contacts.next.mappers.domain.data.list;

import expo.modules.contacts.next.domain.model.website.operations.AppendableWebsite;
import expo.modules.contacts.next.domain.model.website.operations.ExistingWebsite;
import expo.modules.contacts.next.domain.model.website.operations.NewWebsite;
import expo.modules.contacts.next.domain.model.website.operations.PatchWebsite;
import expo.modules.contacts.next.domain.wrappers.DataId;
import expo.modules.contacts.next.mappers.domain.data.list.label.WebsiteLabelMapper;
import expo.modules.contacts.next.records.fields.UrlAddressRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebsiteMapper.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004J\u001f\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0016J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¨\u0006\u0017"}, d2 = {"Lexpo/modules/contacts/next/mappers/domain/data/list/WebsiteMapper;", "Lexpo/modules/contacts/next/mappers/domain/data/list/ListDataPropertyMapper;", "Lexpo/modules/contacts/next/domain/model/website/operations/ExistingWebsite;", "Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$Existing;", "Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$New;", "<init>", "()V", "toNew", "Lexpo/modules/contacts/next/domain/model/website/operations/NewWebsite;", "record", "toAppendable", "Lexpo/modules/contacts/next/domain/model/website/operations/AppendableWebsite;", "newValue", "rawContactId", "Lexpo/modules/contacts/next/domain/wrappers/RawContactId;", "toAppendable-MYK5hZQ", "(Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$New;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/website/operations/AppendableWebsite;", "toUpdatable", "toPatch", "Lexpo/modules/contacts/next/domain/model/website/operations/PatchWebsite;", "Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$Patch;", "toDto", "model", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class WebsiteMapper implements ListDataPropertyMapper<ExistingWebsite, UrlAddressRecord.Existing, UrlAddressRecord.New> {
    public static final WebsiteMapper INSTANCE = new WebsiteMapper();

    private WebsiteMapper() {
    }

    public final NewWebsite toNew(UrlAddressRecord.New record) {
        Intrinsics.checkNotNullParameter(record, "record");
        return new NewWebsite(record.getUrl(), WebsiteLabelMapper.INSTANCE.toDomain(record.getLabel()));
    }

    @Override // expo.modules.contacts.next.mappers.domain.data.list.ListDataPropertyMapper
    /* renamed from: toAppendable-MYK5hZQ, reason: avoid collision after fix types in other method and not valid java name and merged with bridge method [inline-methods] */
    public AppendableWebsite mo11806toAppendableMYK5hZQ(UrlAddressRecord.New newValue, String rawContactId) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        Intrinsics.checkNotNullParameter(rawContactId, "rawContactId");
        return new AppendableWebsite(rawContactId, newValue.getUrl(), WebsiteLabelMapper.INSTANCE.toDomain(newValue.getLabel()), null);
    }

    @Override // expo.modules.contacts.next.mappers.domain.data.list.ListDataPropertyMapper
    public ExistingWebsite toUpdatable(UrlAddressRecord.Existing newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        return new ExistingWebsite(DataId.m11739constructorimpl(newValue.getId()), newValue.getUrl(), WebsiteLabelMapper.INSTANCE.toDomain(newValue.getLabel()), null);
    }

    public final PatchWebsite toPatch(UrlAddressRecord.Patch record) {
        Intrinsics.checkNotNullParameter(record, "record");
        return new PatchWebsite(DataId.m11739constructorimpl(record.getId()), record.getUrl(), WebsiteLabelMapper.INSTANCE.toDomain(record.getLabel()), null);
    }

    @Override // expo.modules.contacts.next.mappers.domain.data.list.ListDataPropertyMapper
    public UrlAddressRecord.Existing toDto(ExistingWebsite model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return new UrlAddressRecord.Existing(model.getDataId(), WebsiteLabelMapper.INSTANCE.toRecord(model.getLabel()), model.getUrl());
    }
}
