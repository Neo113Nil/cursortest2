package expo.modules.contacts.next.mappers.domain.data;

import expo.modules.contacts.next.domain.model.Extractable;
import expo.modules.contacts.next.domain.model.Extractable.Data;
import kotlin.Metadata;

/* compiled from: DataPropertyMapper.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u00032\u00020\u0004J\u0015\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/contacts/next/mappers/domain/data/DataPropertyMapper;", "TDomain", "Lexpo/modules/contacts/next/domain/model/Extractable$Data;", "TDto", "", "toDto", "model", "(Lexpo/modules/contacts/next/domain/model/Extractable$Data;)Ljava/lang/Object;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface DataPropertyMapper<TDomain extends Extractable.Data, TDto> {
    TDto toDto(TDomain model);
}
