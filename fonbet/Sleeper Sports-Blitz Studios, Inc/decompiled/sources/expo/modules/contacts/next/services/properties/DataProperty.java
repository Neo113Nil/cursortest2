package expo.modules.contacts.next.services.properties;

import expo.modules.contacts.next.domain.ContactRepository;
import expo.modules.contacts.next.domain.model.Extractable;
import expo.modules.contacts.next.domain.model.Extractable.Data;
import expo.modules.contacts.next.domain.model.ExtractableField;
import expo.modules.contacts.next.mappers.domain.data.DataPropertyMapper;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DataProperty.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u00032\u00020\u0004B9\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0018\u001a\u0004\u0018\u00018\u0001H\u0086@¢\u0006\u0002\u0010\u0019R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\nX\u0084\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u000b\u001a\u00020\fX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lexpo/modules/contacts/next/services/properties/DataProperty;", "TDomain", "Lexpo/modules/contacts/next/domain/model/Extractable$Data;", "TDto", "", "field", "Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;", "readMapper", "Lexpo/modules/contacts/next/mappers/domain/data/DataPropertyMapper;", "contactId", "Lexpo/modules/contacts/next/domain/wrappers/ContactId;", "repository", "Lexpo/modules/contacts/next/domain/ContactRepository;", "<init>", "(Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;Lexpo/modules/contacts/next/mappers/domain/data/DataPropertyMapper;Ljava/lang/String;Lexpo/modules/contacts/next/domain/ContactRepository;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getField", "()Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;", "getReadMapper", "()Lexpo/modules/contacts/next/mappers/domain/data/DataPropertyMapper;", "getContactId-S9XCBSM", "()Ljava/lang/String;", "Ljava/lang/String;", "getRepository", "()Lexpo/modules/contacts/next/domain/ContactRepository;", "get", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public class DataProperty<TDomain extends Extractable.Data, TDto> {
    private final String contactId;
    private final ExtractableField.Data<TDomain> field;
    private final DataPropertyMapper<TDomain, TDto> readMapper;
    private final ContactRepository repository;

    public /* synthetic */ DataProperty(ExtractableField.Data data, DataPropertyMapper dataPropertyMapper, String str, ContactRepository contactRepository, DefaultConstructorMarker defaultConstructorMarker) {
        this(data, dataPropertyMapper, str, contactRepository);
    }

    private DataProperty(ExtractableField.Data<TDomain> field, DataPropertyMapper<TDomain, TDto> readMapper, String contactId, ContactRepository repository) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(readMapper, "readMapper");
        Intrinsics.checkNotNullParameter(contactId, "contactId");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.field = field;
        this.readMapper = readMapper;
        this.contactId = contactId;
        this.repository = repository;
    }

    protected final ExtractableField.Data<TDomain> getField() {
        return this.field;
    }

    protected final DataPropertyMapper<TDomain, TDto> getReadMapper() {
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
    /* JADX WARN: Removed duplicated region for block: B:12:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Continuation<? super TDto> continuation) {
        DataProperty$get$1 dataProperty$get$1;
        int i;
        Extractable.Data data;
        if (continuation instanceof DataProperty$get$1) {
            dataProperty$get$1 = (DataProperty$get$1) continuation;
            if ((dataProperty$get$1.label & Integer.MIN_VALUE) != 0) {
                dataProperty$get$1.label -= Integer.MIN_VALUE;
                Object obj = dataProperty$get$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dataProperty$get$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ContactRepository contactRepository = this.repository;
                    ExtractableField.Data<TDomain> data2 = this.field;
                    String str = this.contactId;
                    dataProperty$get$1.label = 1;
                    obj = contactRepository.m11646getFieldFromDatam7AL99Q(data2, str, dataProperty$get$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                data = (Extractable.Data) CollectionsKt.firstOrNull((List) obj);
                if (data != null) {
                    return null;
                }
                return this.readMapper.toDto(data);
            }
        }
        dataProperty$get$1 = new DataProperty$get$1(this, continuation);
        Object obj2 = dataProperty$get$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dataProperty$get$1.label;
        if (i != 0) {
        }
        data = (Extractable.Data) CollectionsKt.firstOrNull((List) obj2);
        if (data != null) {
        }
    }
}
