package expo.modules.contacts.next.mappers.domain.data.list;

import expo.modules.contacts.next.domain.model.Appendable;
import expo.modules.contacts.next.domain.model.Extractable;
import expo.modules.contacts.next.domain.model.Extractable.Data;
import expo.modules.contacts.next.domain.model.Updatable;
import expo.modules.contacts.next.records.ExistingRecord;
import expo.modules.contacts.next.records.NewRecord;
import kotlin.Metadata;

/* compiled from: ListDataPropertyMapper.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u0004*\b\b\u0002\u0010\u0005*\u00020\u00062\u00020\u0007J\u0015\u0010\b\u001a\u00028\u00012\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0002\u0010\nJ\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00028\u00022\u0006\u0010\u0011\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lexpo/modules/contacts/next/mappers/domain/data/list/ListDataPropertyMapper;", "TDomain", "Lexpo/modules/contacts/next/domain/model/Extractable$Data;", "TExistingDto", "Lexpo/modules/contacts/next/records/ExistingRecord;", "TNewDto", "Lexpo/modules/contacts/next/records/NewRecord;", "", "toDto", "model", "(Lexpo/modules/contacts/next/domain/model/Extractable$Data;)Lexpo/modules/contacts/next/records/ExistingRecord;", "toUpdatable", "Lexpo/modules/contacts/next/domain/model/Updatable$Data;", "newValue", "(Lexpo/modules/contacts/next/records/ExistingRecord;)Lexpo/modules/contacts/next/domain/model/Updatable$Data;", "toAppendable", "Lexpo/modules/contacts/next/domain/model/Appendable;", "rawContactId", "Lexpo/modules/contacts/next/domain/wrappers/RawContactId;", "toAppendable-MYK5hZQ", "(Lexpo/modules/contacts/next/records/NewRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/Appendable;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface ListDataPropertyMapper<TDomain extends Extractable.Data, TExistingDto extends ExistingRecord, TNewDto extends NewRecord> {
    /* renamed from: toAppendable-MYK5hZQ */
    Appendable mo11806toAppendableMYK5hZQ(TNewDto newValue, String rawContactId);

    TExistingDto toDto(TDomain model);

    Updatable.Data toUpdatable(TExistingDto newValue);
}
