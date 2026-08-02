package expo.modules.contacts.next.mappers.domain.data.list;

import com.google.android.material.timepicker.TimeModel;
import expo.modules.contacts.next.domain.model.event.operations.AppendableEvent;
import expo.modules.contacts.next.domain.model.event.operations.ExistingEvent;
import expo.modules.contacts.next.domain.model.event.operations.NewEvent;
import expo.modules.contacts.next.domain.model.event.operations.PatchEvent;
import expo.modules.contacts.next.domain.wrappers.ContactDate;
import expo.modules.contacts.next.domain.wrappers.DataId;
import expo.modules.contacts.next.mappers.domain.data.list.label.EventLabelMapper;
import expo.modules.contacts.next.records.fields.DateRecord;
import expo.modules.kotlin.types.ValueOrUndefined;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventMapper.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004J\u001f\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0016J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\t\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lexpo/modules/contacts/next/mappers/domain/data/list/EventMapper;", "Lexpo/modules/contacts/next/mappers/domain/data/list/ListDataPropertyMapper;", "Lexpo/modules/contacts/next/domain/model/event/operations/ExistingEvent;", "Lexpo/modules/contacts/next/records/fields/DateRecord$Existing;", "Lexpo/modules/contacts/next/records/fields/DateRecord$New;", "<init>", "()V", "toNew", "Lexpo/modules/contacts/next/domain/model/event/operations/NewEvent;", "record", "toAppendable", "Lexpo/modules/contacts/next/domain/model/event/operations/AppendableEvent;", "newValue", "rawContactId", "Lexpo/modules/contacts/next/domain/wrappers/RawContactId;", "toAppendable-MYK5hZQ", "(Lexpo/modules/contacts/next/records/fields/DateRecord$New;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/event/operations/AppendableEvent;", "toUpdatable", "toPatch", "Lexpo/modules/contacts/next/domain/model/event/operations/PatchEvent;", "Lexpo/modules/contacts/next/records/fields/DateRecord$Patch;", "toDto", "model", "toDomain", "Lexpo/modules/contacts/next/domain/wrappers/ContactDate;", "Lexpo/modules/contacts/next/records/fields/DateRecord$ContactDateRecord;", "toDomain-xjsikGQ", "(Lexpo/modules/contacts/next/records/fields/DateRecord$ContactDateRecord;)Ljava/lang/String;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class EventMapper implements ListDataPropertyMapper<ExistingEvent, DateRecord.Existing, DateRecord.New> {
    public static final EventMapper INSTANCE = new EventMapper();

    private EventMapper() {
    }

    public final NewEvent toNew(DateRecord.New record) {
        Intrinsics.checkNotNullParameter(record, "record");
        return new NewEvent(m11808toDomainxjsikGQ(record.getDate()), EventLabelMapper.INSTANCE.toDomain(record.getLabel()), null);
    }

    @Override // expo.modules.contacts.next.mappers.domain.data.list.ListDataPropertyMapper
    /* renamed from: toAppendable-MYK5hZQ, reason: avoid collision after fix types in other method and not valid java name and merged with bridge method [inline-methods] */
    public AppendableEvent mo11806toAppendableMYK5hZQ(DateRecord.New newValue, String rawContactId) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        Intrinsics.checkNotNullParameter(rawContactId, "rawContactId");
        return new AppendableEvent(rawContactId, m11808toDomainxjsikGQ(newValue.getDate()), EventLabelMapper.INSTANCE.toDomain(newValue.getLabel()), null);
    }

    @Override // expo.modules.contacts.next.mappers.domain.data.list.ListDataPropertyMapper
    public ExistingEvent toUpdatable(DateRecord.Existing newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        return new ExistingEvent(DataId.m11739constructorimpl(newValue.getId()), m11808toDomainxjsikGQ(newValue.getDate()), EventLabelMapper.INSTANCE.toDomain(newValue.getLabel()), null);
    }

    public final PatchEvent toPatch(DateRecord.Patch record) {
        ValueOrUndefined.Undefined undefined;
        Intrinsics.checkNotNullParameter(record, "record");
        String m11739constructorimpl = DataId.m11739constructorimpl(record.getId());
        ValueOrUndefined<DateRecord.ContactDateRecord> date = record.getDate();
        if (date instanceof ValueOrUndefined.Value) {
            String m11808toDomainxjsikGQ = INSTANCE.m11808toDomainxjsikGQ((DateRecord.ContactDateRecord) ((ValueOrUndefined.Value) date).getValue());
            undefined = new ValueOrUndefined.Value(m11808toDomainxjsikGQ != null ? ContactDate.m11721boximpl(m11808toDomainxjsikGQ) : null);
        } else {
            if (!(date instanceof ValueOrUndefined.Undefined)) {
                throw new NoWhenBranchMatchedException();
            }
            ValueOrUndefined.Companion companion = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined2 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined2, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            undefined = undefined2;
        }
        return new PatchEvent(m11739constructorimpl, undefined, EventLabelMapper.INSTANCE.toDomain(record.getLabel()), null);
    }

    @Override // expo.modules.contacts.next.mappers.domain.data.list.ListDataPropertyMapper
    public DateRecord.Existing toDto(ExistingEvent model) {
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.getStartDate();
        DateRecord.ContactDateRecord contactDateRecord = null;
        if (str != null) {
            String m11727getYearimpl = ContactDate.m11727getYearimpl(str);
            contactDateRecord = new DateRecord.ContactDateRecord(m11727getYearimpl != null ? Integer.valueOf(Integer.parseInt(m11727getYearimpl)) : null, Integer.parseInt(ContactDate.m11726getMonthimpl(str)), Integer.parseInt(ContactDate.m11725getDayimpl(str)));
        }
        return new DateRecord.Existing(model.getDataId(), EventLabelMapper.INSTANCE.toRecord(model.getLabel()), contactDateRecord);
    }

    /* renamed from: toDomain-xjsikGQ, reason: not valid java name */
    private final String m11808toDomainxjsikGQ(DateRecord.ContactDateRecord record) {
        if (record == null) {
            return null;
        }
        Integer year = record.getYear();
        int month = record.getMonth();
        int day = record.getDay();
        String format = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{year}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        String format2 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(month)}, 1));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        String format3 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(day)}, 1));
        Intrinsics.checkNotNullExpressionValue(format3, "format(...)");
        if (year != null) {
            return ContactDate.m11722constructorimpl(format + "-" + format2 + "-" + format3);
        }
        return ContactDate.m11722constructorimpl("--" + format2 + "-" + format3);
    }
}
