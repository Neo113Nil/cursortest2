package expo.modules.contacts.next.services.properties;

import expo.modules.contacts.next.RawContactIdNotFoundException;
import expo.modules.contacts.next.domain.ContactRepository;
import expo.modules.contacts.next.domain.model.Appendable;
import expo.modules.contacts.next.domain.model.Extractable;
import expo.modules.contacts.next.domain.model.Extractable.Data;
import expo.modules.contacts.next.domain.model.ExtractableField;
import expo.modules.contacts.next.domain.model.Updatable;
import expo.modules.contacts.next.domain.wrappers.DataId;
import expo.modules.contacts.next.domain.wrappers.RawContactId;
import expo.modules.contacts.next.mappers.domain.data.MutableDataPropertyMapper;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MutableDataProperty.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004B9\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00028\u0001H\u0086@¢\u0006\u0002\u0010\u0012R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lexpo/modules/contacts/next/services/properties/MutableDataProperty;", "TDomain", "Lexpo/modules/contacts/next/domain/model/Extractable$Data;", "TDto", "Lexpo/modules/contacts/next/services/properties/DataProperty;", "field", "Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;", "mapper", "Lexpo/modules/contacts/next/mappers/domain/data/MutableDataPropertyMapper;", "contactId", "Lexpo/modules/contacts/next/domain/wrappers/ContactId;", "repository", "Lexpo/modules/contacts/next/domain/ContactRepository;", "<init>", "(Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;Lexpo/modules/contacts/next/mappers/domain/data/MutableDataPropertyMapper;Ljava/lang/String;Lexpo/modules/contacts/next/domain/ContactRepository;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "set", "", "newValue", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MutableDataProperty<TDomain extends Extractable.Data, TDto> extends DataProperty<TDomain, TDto> {
    private final MutableDataPropertyMapper<TDomain, TDto> mapper;

    public /* synthetic */ MutableDataProperty(ExtractableField.Data data, MutableDataPropertyMapper mutableDataPropertyMapper, String str, ContactRepository contactRepository, DefaultConstructorMarker defaultConstructorMarker) {
        this(data, mutableDataPropertyMapper, str, contactRepository);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private MutableDataProperty(ExtractableField.Data<TDomain> field, MutableDataPropertyMapper<TDomain, TDto> mapper, String contactId, ContactRepository repository) {
        super(field, mapper, contactId, repository, null);
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(contactId, "contactId");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.mapper = mapper;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ca, code lost:
    
        if (r10 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b1, code lost:
    
        if (r11 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0074, code lost:
    
        if (r11 == r1) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object set(TDto tdto, Continuation<? super Boolean> continuation) {
        MutableDataProperty$set$1 mutableDataProperty$set$1;
        int i;
        TDto tdto2;
        String dataId;
        Object m11648getRawContactIdK3SHF88;
        TDto tdto3;
        Object m11641append4zbj8jY;
        if (continuation instanceof MutableDataProperty$set$1) {
            mutableDataProperty$set$1 = (MutableDataProperty$set$1) continuation;
            if ((mutableDataProperty$set$1.label & Integer.MIN_VALUE) != 0) {
                mutableDataProperty$set$1.label -= Integer.MIN_VALUE;
                Object obj = mutableDataProperty$set$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mutableDataProperty$set$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ContactRepository repository = getRepository();
                    ExtractableField.Data<TDomain> field = getField();
                    String str = getContactId();
                    mutableDataProperty$set$1.L$0 = tdto;
                    mutableDataProperty$set$1.label = 1;
                    obj = repository.m11646getFieldFromDatam7AL99Q(field, str, mutableDataProperty$set$1);
                    tdto2 = tdto;
                } else if (i == 1) {
                    TDto tdto4 = (TDto) mutableDataProperty$set$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    tdto2 = tdto4;
                } else {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        m11641append4zbj8jY = ((DataId) obj).m11744unboximpl();
                        return Boxing.boxBoolean(true);
                    }
                    Object obj2 = mutableDataProperty$set$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    RawContactId rawContactId = (RawContactId) obj;
                    if (rawContactId != null) {
                        m11648getRawContactIdK3SHF88 = rawContactId.m11751unboximpl();
                        tdto3 = obj2;
                    } else {
                        m11648getRawContactIdK3SHF88 = null;
                        tdto3 = obj2;
                    }
                    String str2 = (String) m11648getRawContactIdK3SHF88;
                    if (str2 == null) {
                        throw new RawContactIdNotFoundException(null, 1, null);
                    }
                    Appendable mo11776toAppendableMYK5hZQ = this.mapper.mo11776toAppendableMYK5hZQ(tdto3, str2);
                    ContactRepository repository2 = getRepository();
                    mutableDataProperty$set$1.L$0 = null;
                    mutableDataProperty$set$1.label = 4;
                    m11641append4zbj8jY = repository2.m11641append4zbj8jY(mo11776toAppendableMYK5hZQ, mutableDataProperty$set$1);
                }
                Extractable.Data data = (Extractable.Data) CollectionsKt.firstOrNull((List) obj);
                dataId = data == null ? data.getDataId() : null;
                if (dataId == null) {
                    Updatable.Data mo11777toUpdatablebM46d30 = this.mapper.mo11777toUpdatablebM46d30(dataId, tdto2);
                    mutableDataProperty$set$1.L$0 = null;
                    mutableDataProperty$set$1.label = 2;
                    Object update = getRepository().update(mo11777toUpdatablebM46d30, mutableDataProperty$set$1);
                    if (update != coroutine_suspended) {
                        return update;
                    }
                } else {
                    ContactRepository repository3 = getRepository();
                    String str3 = getContactId();
                    mutableDataProperty$set$1.L$0 = tdto2;
                    mutableDataProperty$set$1.label = 3;
                    m11648getRawContactIdK3SHF88 = repository3.m11648getRawContactIdK3SHF88(str3, mutableDataProperty$set$1);
                    tdto3 = tdto2;
                }
                return coroutine_suspended;
            }
        }
        mutableDataProperty$set$1 = new MutableDataProperty$set$1(this, continuation);
        Object obj3 = mutableDataProperty$set$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mutableDataProperty$set$1.label;
        if (i != 0) {
        }
        Extractable.Data data2 = (Extractable.Data) CollectionsKt.firstOrNull((List) obj3);
        if (data2 == null) {
        }
        if (dataId == null) {
        }
        return coroutine_suspended2;
    }
}
