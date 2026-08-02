package expo.modules.contacts.next.services.properties;

import expo.modules.contacts.next.domain.ContactRepository;
import expo.modules.contacts.next.domain.model.Extractable;
import expo.modules.contacts.next.domain.model.ExtractableField;
import expo.modules.contacts.next.mappers.domain.contacts.MutableContactsPropertyMapper;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MutableContactsProperty.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004B9\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00028\u0001H\u0086@¢\u0006\u0002\u0010\u0012R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lexpo/modules/contacts/next/services/properties/MutableContactsProperty;", "TDomain", "Lexpo/modules/contacts/next/domain/model/Extractable;", "TDto", "Lexpo/modules/contacts/next/services/properties/ContactsProperty;", "field", "Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;", "mapper", "Lexpo/modules/contacts/next/mappers/domain/contacts/MutableContactsPropertyMapper;", "contactId", "Lexpo/modules/contacts/next/domain/wrappers/ContactId;", "repository", "Lexpo/modules/contacts/next/domain/ContactRepository;", "<init>", "(Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;Lexpo/modules/contacts/next/mappers/domain/contacts/MutableContactsPropertyMapper;Ljava/lang/String;Lexpo/modules/contacts/next/domain/ContactRepository;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "set", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MutableContactsProperty<TDomain extends Extractable, TDto> extends ContactsProperty<TDomain, TDto> {
    private final MutableContactsPropertyMapper<TDomain, TDto> mapper;

    public /* synthetic */ MutableContactsProperty(ExtractableField.Contacts contacts, MutableContactsPropertyMapper mutableContactsPropertyMapper, String str, ContactRepository contactRepository, DefaultConstructorMarker defaultConstructorMarker) {
        this(contacts, mutableContactsPropertyMapper, str, contactRepository);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private MutableContactsProperty(ExtractableField.Contacts<TDomain> field, MutableContactsPropertyMapper<TDomain, TDto> mapper, String contactId, ContactRepository repository) {
        super(field, mapper, contactId, repository, null);
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(contactId, "contactId");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.mapper = mapper;
    }

    public final Object set(TDto tdto, Continuation<? super Boolean> continuation) {
        return getRepository().update(this.mapper.mo11771toUpdatableD2TBaGg(getContactId(), tdto), continuation);
    }
}
