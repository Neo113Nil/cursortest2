package expo.modules.contacts.next.services.properties;

import expo.modules.contacts.next.RawContactIdNotFoundException;
import expo.modules.contacts.next.domain.ContactRepository;
import expo.modules.contacts.next.domain.model.Appendable;
import expo.modules.contacts.next.domain.model.Extractable;
import expo.modules.contacts.next.domain.model.Extractable.Data;
import expo.modules.contacts.next.domain.model.ExtractableField;
import expo.modules.contacts.next.domain.wrappers.DataId;
import expo.modules.contacts.next.domain.wrappers.RawContactId;
import expo.modules.contacts.next.mappers.domain.data.list.ListDataPropertyMapper;
import expo.modules.contacts.next.records.ExistingRecord;
import expo.modules.contacts.next.records.NewRecord;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ListDataProperty.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u0004*\b\b\u0002\u0010\u0005*\u00020\u00062\u00020\u0007B?\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0086@¢\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00028\u0002H\u0086@¢\u0006\u0002\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00028\u0001H\u0086@¢\u0006\u0002\u0010\u001cJ\u0016\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00028\u0001H\u0086@¢\u0006\u0002\u0010\u001cR\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lexpo/modules/contacts/next/services/properties/ListDataProperty;", "TDomain", "Lexpo/modules/contacts/next/domain/model/Extractable$Data;", "TExistingDto", "Lexpo/modules/contacts/next/records/ExistingRecord;", "TNewDto", "Lexpo/modules/contacts/next/records/NewRecord;", "", "extractableField", "Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;", "mapper", "Lexpo/modules/contacts/next/mappers/domain/data/list/ListDataPropertyMapper;", "contactId", "Lexpo/modules/contacts/next/domain/wrappers/ContactId;", "repository", "Lexpo/modules/contacts/next/domain/ContactRepository;", "<init>", "(Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;Lexpo/modules/contacts/next/mappers/domain/data/list/ListDataPropertyMapper;Ljava/lang/String;Lexpo/modules/contacts/next/domain/ContactRepository;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Ljava/lang/String;", "getAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "add", "", "record", "(Lexpo/modules/contacts/next/records/NewRecord;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "", "(Lexpo/modules/contacts/next/records/ExistingRecord;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ListDataProperty<TDomain extends Extractable.Data, TExistingDto extends ExistingRecord, TNewDto extends NewRecord> {
    private final String contactId;
    private final ExtractableField.Data<TDomain> extractableField;
    private final ListDataPropertyMapper<TDomain, TExistingDto, TNewDto> mapper;
    private final ContactRepository repository;

    public /* synthetic */ ListDataProperty(ExtractableField.Data data, ListDataPropertyMapper listDataPropertyMapper, String str, ContactRepository contactRepository, DefaultConstructorMarker defaultConstructorMarker) {
        this(data, listDataPropertyMapper, str, contactRepository);
    }

    private ListDataProperty(ExtractableField.Data<TDomain> extractableField, ListDataPropertyMapper<TDomain, TExistingDto, TNewDto> mapper, String contactId, ContactRepository repository) {
        Intrinsics.checkNotNullParameter(extractableField, "extractableField");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(contactId, "contactId");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.extractableField = extractableField;
        this.mapper = mapper;
        this.contactId = contactId;
        this.repository = repository;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005d A[LOOP:0: B:11:0x0057->B:13:0x005d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getAll(Continuation<? super List<? extends TExistingDto>> continuation) {
        ListDataProperty$getAll$1 listDataProperty$getAll$1;
        int i;
        Iterator it;
        if (continuation instanceof ListDataProperty$getAll$1) {
            listDataProperty$getAll$1 = (ListDataProperty$getAll$1) continuation;
            if ((listDataProperty$getAll$1.label & Integer.MIN_VALUE) != 0) {
                listDataProperty$getAll$1.label -= Integer.MIN_VALUE;
                Object obj = listDataProperty$getAll$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = listDataProperty$getAll$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ContactRepository contactRepository = this.repository;
                    ExtractableField.Data<TDomain> data = this.extractableField;
                    String str = this.contactId;
                    listDataProperty$getAll$1.label = 1;
                    obj = contactRepository.m11646getFieldFromDatam7AL99Q(data, str, listDataProperty$getAll$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.mapper.toDto((Extractable.Data) it.next()));
                }
                return arrayList;
            }
        }
        listDataProperty$getAll$1 = new ListDataProperty$getAll$1(this, continuation);
        Object obj2 = listDataProperty$getAll$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = listDataProperty$getAll$1.label;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
    
        if (r8 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object add(TNewDto tnewdto, Continuation<? super String> continuation) {
        ListDataProperty$add$1 listDataProperty$add$1;
        int i;
        Object m11648getRawContactIdK3SHF88;
        String str;
        Object m11641append4zbj8jY;
        if (continuation instanceof ListDataProperty$add$1) {
            listDataProperty$add$1 = (ListDataProperty$add$1) continuation;
            if ((listDataProperty$add$1.label & Integer.MIN_VALUE) != 0) {
                listDataProperty$add$1.label -= Integer.MIN_VALUE;
                Object obj = listDataProperty$add$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = listDataProperty$add$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ContactRepository contactRepository = this.repository;
                    String str2 = this.contactId;
                    listDataProperty$add$1.L$0 = tnewdto;
                    listDataProperty$add$1.label = 1;
                    m11648getRawContactIdK3SHF88 = contactRepository.m11648getRawContactIdK3SHF88(str2, listDataProperty$add$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        m11641append4zbj8jY = ((DataId) obj).m11744unboximpl();
                        return (String) m11641append4zbj8jY;
                    }
                    tnewdto = (TNewDto) listDataProperty$add$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    RawContactId rawContactId = (RawContactId) obj;
                    m11648getRawContactIdK3SHF88 = rawContactId != null ? rawContactId.m11751unboximpl() : null;
                }
                str = (String) m11648getRawContactIdK3SHF88;
                if (str != null) {
                    throw new RawContactIdNotFoundException(null, 1, null);
                }
                ContactRepository contactRepository2 = this.repository;
                Appendable mo11806toAppendableMYK5hZQ = this.mapper.mo11806toAppendableMYK5hZQ(tnewdto, str);
                listDataProperty$add$1.L$0 = null;
                listDataProperty$add$1.label = 2;
                m11641append4zbj8jY = contactRepository2.m11641append4zbj8jY(mo11806toAppendableMYK5hZQ, listDataProperty$add$1);
            }
        }
        listDataProperty$add$1 = new ListDataProperty$add$1(this, continuation);
        Object obj2 = listDataProperty$add$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = listDataProperty$add$1.label;
        if (i != 0) {
        }
        str = (String) m11648getRawContactIdK3SHF88;
        if (str != null) {
        }
    }

    public final Object update(TExistingDto texistingdto, Continuation<? super Boolean> continuation) {
        return this.repository.update(this.mapper.toUpdatable(texistingdto), continuation);
    }

    public final Object delete(TExistingDto texistingdto, Continuation<? super Boolean> continuation) {
        return this.repository.m11643deleteFieldEntrybM46d30(DataId.m11739constructorimpl(texistingdto.getId()), continuation);
    }
}
