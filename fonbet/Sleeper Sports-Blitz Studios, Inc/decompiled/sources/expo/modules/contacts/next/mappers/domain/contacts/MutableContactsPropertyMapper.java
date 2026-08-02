package expo.modules.contacts.next.mappers.domain.contacts;

import expo.modules.contacts.next.domain.model.Extractable;
import expo.modules.contacts.next.domain.model.Updatable;
import kotlin.Metadata;

/* compiled from: MutableContactsPropertyMapper.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004J\u001f\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0001H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lexpo/modules/contacts/next/mappers/domain/contacts/MutableContactsPropertyMapper;", "TDomain", "Lexpo/modules/contacts/next/domain/model/Extractable;", "TDto", "Lexpo/modules/contacts/next/mappers/domain/contacts/ContactsPropertyMapper;", "toUpdatable", "Lexpo/modules/contacts/next/domain/model/Updatable$Contacts;", "contactId", "Lexpo/modules/contacts/next/domain/wrappers/ContactId;", "newValue", "toUpdatable-D2TBaGg", "(Ljava/lang/String;Ljava/lang/Object;)Lexpo/modules/contacts/next/domain/model/Updatable$Contacts;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface MutableContactsPropertyMapper<TDomain extends Extractable, TDto> extends ContactsPropertyMapper<TDomain, TDto> {
    /* renamed from: toUpdatable-D2TBaGg, reason: not valid java name */
    Updatable.Contacts mo11771toUpdatableD2TBaGg(String contactId, TDto newValue);
}
