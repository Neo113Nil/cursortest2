package expo.modules.contacts.next.services.properties;

import expo.modules.contacts.next.domain.ContactRepository;
import expo.modules.contacts.next.domain.model.Extractable;
import expo.modules.contacts.next.domain.model.ExtractableField;
import expo.modules.contacts.next.mappers.domain.contacts.ContactsPropertyMapper;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContactsProperty.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u00032\u00020\u0004B9\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0018\u001a\u0004\u0018\u00018\u0001H\u0086@¢\u0006\u0002\u0010\u0019R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\nX\u0084\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u000b\u001a\u00020\fX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lexpo/modules/contacts/next/services/properties/ContactsProperty;", "TDomain", "Lexpo/modules/contacts/next/domain/model/Extractable;", "TDto", "", "field", "Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;", "readMapper", "Lexpo/modules/contacts/next/mappers/domain/contacts/ContactsPropertyMapper;", "contactId", "Lexpo/modules/contacts/next/domain/wrappers/ContactId;", "repository", "Lexpo/modules/contacts/next/domain/ContactRepository;", "<init>", "(Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;Lexpo/modules/contacts/next/mappers/domain/contacts/ContactsPropertyMapper;Ljava/lang/String;Lexpo/modules/contacts/next/domain/ContactRepository;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getField", "()Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;", "getReadMapper", "()Lexpo/modules/contacts/next/mappers/domain/contacts/ContactsPropertyMapper;", "getContactId-S9XCBSM", "()Ljava/lang/String;", "Ljava/lang/String;", "getRepository", "()Lexpo/modules/contacts/next/domain/ContactRepository;", "get", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public class ContactsProperty<TDomain extends Extractable, TDto> {
    private final String contactId;
    private final ExtractableField.Contacts<TDomain> field;
    private final ContactsPropertyMapper<TDomain, TDto> readMapper;
    private final ContactRepository repository;

    public /* synthetic */ ContactsProperty(ExtractableField.Contacts contacts, ContactsPropertyMapper contactsPropertyMapper, String str, ContactRepository contactRepository, DefaultConstructorMarker defaultConstructorMarker) {
        this(contacts, contactsPropertyMapper, str, contactRepository);
    }

    private ContactsProperty(ExtractableField.Contacts<TDomain> field, ContactsPropertyMapper<TDomain, TDto> readMapper, String contactId, ContactRepository repository) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(readMapper, "readMapper");
        Intrinsics.checkNotNullParameter(contactId, "contactId");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.field = field;
        this.readMapper = readMapper;
        this.contactId = contactId;
        this.repository = repository;
    }

    protected final ExtractableField.Contacts<TDomain> getField() {
        return this.field;
    }

    protected final ContactsPropertyMapper<TDomain, TDto> getReadMapper() {
        return this.readMapper;
    }

    /* renamed from: getContactId-S9XCBSM, reason: not valid java name and from getter */
    protected final String getContactId() {
        return this.contactId;
    }

    protected final ContactRepository getRepository() {
        return this.repository;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Continuation<? super TDto> continuation) {
        ContactsProperty$get$1 contactsProperty$get$1;
        int i;
        Extractable extractable;
        if (continuation instanceof ContactsProperty$get$1) {
            contactsProperty$get$1 = (ContactsProperty$get$1) continuation;
            if ((contactsProperty$get$1.label & Integer.MIN_VALUE) != 0) {
                contactsProperty$get$1.label -= Integer.MIN_VALUE;
                Object obj = contactsProperty$get$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = contactsProperty$get$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ContactRepository contactRepository = this.repository;
                    ExtractableField.Contacts<TDomain> contacts = this.field;
                    String str = this.contactId;
                    contactsProperty$get$1.label = 1;
                    obj = contactRepository.m11645getFieldFromContactsm7AL99Q(contacts, str, contactsProperty$get$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                extractable = (Extractable) obj;
                if (extractable != null) {
                    return null;
                }
                return this.readMapper.toDto(extractable);
            }
        }
        contactsProperty$get$1 = new ContactsProperty$get$1(this, continuation);
        Object obj2 = contactsProperty$get$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = contactsProperty$get$1.label;
        if (i != 0) {
        }
        extractable = (Extractable) obj2;
        if (extractable != null) {
        }
    }
}
