package expo.modules.contacts.next.mappers.domain.data;

import expo.modules.contacts.next.domain.model.Appendable;
import expo.modules.contacts.next.domain.model.Extractable;
import expo.modules.contacts.next.domain.model.Extractable.Data;
import expo.modules.contacts.next.domain.model.Updatable;
import kotlin.Metadata;

/* compiled from: MutableDataPropertyMapper.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004J\u001f\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0001H&¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00028\u00012\u0006\u0010\u000e\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lexpo/modules/contacts/next/mappers/domain/data/MutableDataPropertyMapper;", "TDomain", "Lexpo/modules/contacts/next/domain/model/Extractable$Data;", "TDto", "Lexpo/modules/contacts/next/mappers/domain/data/DataPropertyMapper;", "toUpdatable", "Lexpo/modules/contacts/next/domain/model/Updatable$Data;", "dataId", "Lexpo/modules/contacts/next/domain/wrappers/DataId;", "newValue", "toUpdatable-bM46d30", "(Ljava/lang/String;Ljava/lang/Object;)Lexpo/modules/contacts/next/domain/model/Updatable$Data;", "toAppendable", "Lexpo/modules/contacts/next/domain/model/Appendable;", "rawContactId", "Lexpo/modules/contacts/next/domain/wrappers/RawContactId;", "toAppendable-MYK5hZQ", "(Ljava/lang/Object;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/Appendable;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface MutableDataPropertyMapper<TDomain extends Extractable.Data, TDto> extends DataPropertyMapper<TDomain, TDto> {
    /* renamed from: toAppendable-MYK5hZQ, reason: not valid java name */
    Appendable mo11776toAppendableMYK5hZQ(TDto newValue, String rawContactId);

    /* renamed from: toUpdatable-bM46d30, reason: not valid java name */
    Updatable.Data mo11777toUpdatablebM46d30(String dataId, TDto newValue);
}
