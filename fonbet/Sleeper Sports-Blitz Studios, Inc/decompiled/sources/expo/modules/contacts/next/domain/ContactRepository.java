package expo.modules.contacts.next.domain;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.net.Uri;
import android.provider.ContactsContract;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import expo.modules.contacts.next.domain.model.Appendable;
import expo.modules.contacts.next.domain.model.Extractable;
import expo.modules.contacts.next.domain.model.ExtractableField;
import expo.modules.contacts.next.domain.model.Updatable;
import expo.modules.contacts.next.domain.model.contact.ContactPatch;
import expo.modules.contacts.next.domain.model.contact.ExistingContact;
import expo.modules.contacts.next.domain.model.contact.NewContact;
import expo.modules.contacts.next.domain.model.contact.UpdateContact;
import expo.modules.contacts.next.domain.wrappers.ContactId;
import expo.modules.contacts.next.domain.wrappers.DataId;
import expo.modules.contacts.next.domain.wrappers.RawContactId;
import expo.modules.contacts.next.extensions.ContentResolverExtensionsKt;
import expo.modules.contacts.next.records.SortOrder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import org.jacoco.core.runtime.AgentOptions;

/* compiled from: ContactRepository.kt */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u0010\u0012J0\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\t2\u0010\u0010\u0017\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00190\u0018H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001eH\u0086@¢\u0006\u0002\u0010\u001fJ\u0018\u0010 \u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\tH\u0086@¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020%H\u0086@¢\u0006\u0004\b&\u0010'J\u0016\u0010\u001c\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020)H\u0086@¢\u0006\u0002\u0010*J\u0018\u0010+\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b-\u0010\"JD\u0010.\u001a\b\u0012\u0004\u0012\u00020\t0\u00142\n\b\u0002\u0010/\u001a\u0004\u0018\u0001002\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\n\b\u0002\u00102\u001a\u0004\u0018\u0001032\n\b\u0002\u00104\u001a\u0004\u0018\u000105H\u0086@¢\u0006\u0002\u00106J,\u00107\u001a\u0004\u0018\u0001082\u0010\u0010\u0017\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003090\u00182\u0006\u0010\u0016\u001a\u00020\tH\u0086@¢\u0006\u0004\b:\u0010;JV\u0010<\u001a\b\u0012\u0004\u0012\u0002080=2\u0010\u0010\u0017\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003090\u00182\n\b\u0002\u0010/\u001a\u0004\u0018\u0001002\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\n\b\u0002\u00102\u001a\u0004\u0018\u0001032\n\b\u0002\u00104\u001a\u0004\u0018\u000105H\u0086@¢\u0006\u0002\u0010>J6\u0010?\u001a\b\u0012\u0004\u0012\u0002H@0\u0014\"\b\b\u0000\u0010@*\u00020A2\f\u0010B\u001a\b\u0012\u0004\u0012\u0002H@0\u00192\u0006\u0010\u0016\u001a\u00020\tH\u0086@¢\u0006\u0004\bC\u0010DJ2\u0010E\u001a\u0004\u0018\u0001H@\"\b\b\u0000\u0010@*\u00020F2\f\u0010B\u001a\b\u0012\u0004\u0012\u0002H@0G2\u0006\u0010\u0016\u001a\u00020\tH\u0086@¢\u0006\u0004\bH\u0010IJ\u000e\u0010J\u001a\u000200H\u0086@¢\u0006\u0002\u0010KJ\u001a\u0010L\u001a\u0004\u0018\u0001032\u0006\u0010\u0016\u001a\u00020\tH\u0086@¢\u0006\u0004\bM\u0010\"J\u001a\u0010N\u001a\u0004\u0018\u00010O2\u0006\u0010\u0016\u001a\u00020\tH\u0086@¢\u0006\u0004\bP\u0010\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006Q"}, d2 = {"Lexpo/modules/contacts/next/domain/ContactRepository;", "", "contentResolver", "Landroid/content/ContentResolver;", "<init>", "(Landroid/content/ContentResolver;)V", "getContentResolver", "()Landroid/content/ContentResolver;", "insert", "Lexpo/modules/contacts/next/domain/wrappers/ContactId;", "contact", "Lexpo/modules/contacts/next/domain/model/contact/NewContact;", "insert-Hoartsk", "(Lexpo/modules/contacts/next/domain/model/contact/NewContact;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "patch", "", "contactPatch", "Lexpo/modules/contacts/next/domain/model/contact/ContactPatch;", "(Lexpo/modules/contacts/next/domain/model/contact/ContactPatch;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDataIds", "", "Lexpo/modules/contacts/next/domain/wrappers/DataId;", "contactId", "extractableFields", "", "Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;", "getDataIds-0xh38yw", "(Ljava/lang/String;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "updateContact", "Lexpo/modules/contacts/next/domain/model/contact/UpdateContact;", "(Lexpo/modules/contacts/next/domain/model/contact/UpdateContact;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "delete-D2TBaGg", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", AgentOptions.APPEND, "appendable", "Lexpo/modules/contacts/next/domain/model/Appendable;", "append-4zbj8jY", "(Lexpo/modules/contacts/next/domain/model/Appendable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatable", "Lexpo/modules/contacts/next/domain/model/Updatable;", "(Lexpo/modules/contacts/next/domain/model/Updatable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFieldEntry", "dataId", "deleteFieldEntry-bM46d30", "getAllIds", "limit", "", TypedValues.CycleType.S_WAVE_OFFSET, "searchedDisplayName", "", SDKConstants.PARAM_SORT_ORDER, "Lexpo/modules/contacts/next/records/SortOrder;", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lexpo/modules/contacts/next/records/SortOrder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getById", "Lexpo/modules/contacts/next/domain/model/contact/ExistingContact;", "Lexpo/modules/contacts/next/domain/model/ExtractableField;", "getById-m7AL99Q", "(Ljava/util/Set;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllPaginated", "", "(Ljava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lexpo/modules/contacts/next/records/SortOrder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFieldFromData", ExifInterface.GPS_DIRECTION_TRUE, "Lexpo/modules/contacts/next/domain/model/Extractable$Data;", "extractableField", "getFieldFromData-m7AL99Q", "(Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFieldFromContacts", "Lexpo/modules/contacts/next/domain/model/Extractable;", "Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;", "getFieldFromContacts-m7AL99Q", "(Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCount", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLookupKey", "getLookupKey-D2TBaGg", "getRawContactId", "Lexpo/modules/contacts/next/domain/wrappers/RawContactId;", "getRawContactId-K3SHF88", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ContactRepository {
    private final ContentResolver contentResolver;

    public ContactRepository(ContentResolver contentResolver) {
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        this.contentResolver = contentResolver;
    }

    public final ContentResolver getContentResolver() {
        return this.contentResolver;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: insert-Hoartsk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m11649insertHoartsk(NewContact newContact, Continuation<? super ContactId> continuation) {
        ContactRepository$insert$1 contactRepository$insert$1;
        int i;
        if (continuation instanceof ContactRepository$insert$1) {
            contactRepository$insert$1 = (ContactRepository$insert$1) continuation;
            if ((contactRepository$insert$1.label & Integer.MIN_VALUE) != 0) {
                contactRepository$insert$1.label -= Integer.MIN_VALUE;
                Object obj = contactRepository$insert$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = contactRepository$insert$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    ContactRepository$insert$2 contactRepository$insert$2 = new ContactRepository$insert$2(newContact, this, null);
                    contactRepository$insert$1.label = 1;
                    obj = BuildersKt.withContext(io2, contactRepository$insert$2, contactRepository$insert$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((ContactId) obj).m11737unboximpl();
            }
        }
        contactRepository$insert$1 = new ContactRepository$insert$1(this, continuation);
        Object obj2 = contactRepository$insert$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = contactRepository$insert$1.label;
        if (i != 0) {
        }
        return ((ContactId) obj2).m11737unboximpl();
    }

    public final Object patch(ContactPatch contactPatch, Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new ContactRepository$patch$2(contactPatch, this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getDataIds-0xh38yw, reason: not valid java name */
    public final Object m11640getDataIds0xh38yw(String str, Set<? extends ExtractableField.Data<?>> set, Continuation<? super List<DataId>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new ContactRepository$getDataIds$2(set, this, str, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object update(UpdateContact updateContact, Continuation<? super Boolean> continuation) {
        ContactRepository$update$1 contactRepository$update$1;
        int i;
        if (continuation instanceof ContactRepository$update$1) {
            contactRepository$update$1 = (ContactRepository$update$1) continuation;
            if ((contactRepository$update$1.label & Integer.MIN_VALUE) != 0) {
                contactRepository$update$1.label -= Integer.MIN_VALUE;
                Object obj = contactRepository$update$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = contactRepository$update$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ContentProviderOperation build = ContentProviderOperation.newDelete(ContactsContract.Data.CONTENT_URI).withSelection("raw_contact_id = ?", new String[]{updateContact.getRawContactId()}).build();
                    Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                    List createListBuilder = CollectionsKt.createListBuilder();
                    createListBuilder.add(build);
                    List<Appendable> toAppend = updateContact.getToAppend();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(toAppend, 10));
                    Iterator<T> it = toAppend.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Appendable) it.next()).toAppendOperation());
                    }
                    createListBuilder.addAll(arrayList);
                    createListBuilder.add(updateContact.getStarred().toUpdateOperation());
                    List build2 = CollectionsKt.build(createListBuilder);
                    ContentResolver contentResolver = this.contentResolver;
                    contactRepository$update$1.label = 1;
                    if (ContentResolverExtensionsKt.safeApplyBatch(contentResolver, "com.android.contacts", (List<? extends ContentProviderOperation>) build2, contactRepository$update$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(true);
            }
        }
        contactRepository$update$1 = new ContactRepository$update$1(this, continuation);
        Object obj2 = contactRepository$update$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = contactRepository$update$1.label;
        if (i != 0) {
        }
        return Boxing.boxBoolean(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: delete-D2TBaGg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m11642deleteD2TBaGg(String str, Continuation<? super Boolean> continuation) {
        ContactRepository$delete$1 contactRepository$delete$1;
        int i;
        if (continuation instanceof ContactRepository$delete$1) {
            contactRepository$delete$1 = (ContactRepository$delete$1) continuation;
            if ((contactRepository$delete$1.label & Integer.MIN_VALUE) != 0) {
                contactRepository$delete$1.label -= Integer.MIN_VALUE;
                Object obj = contactRepository$delete$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = contactRepository$delete$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ContentResolver contentResolver = this.contentResolver;
                    Uri CONTENT_URI = ContactsContract.RawContacts.CONTENT_URI;
                    Intrinsics.checkNotNullExpressionValue(CONTENT_URI, "CONTENT_URI");
                    contactRepository$delete$1.label = 1;
                    obj = ContentResolverExtensionsKt.safeDelete(contentResolver, CONTENT_URI, "contact_id = ?", new String[]{str}, contactRepository$delete$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(((Number) obj).intValue() > 0);
            }
        }
        contactRepository$delete$1 = new ContactRepository$delete$1(this, continuation);
        Object obj2 = contactRepository$delete$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = contactRepository$delete$1.label;
        if (i != 0) {
        }
        return Boxing.boxBoolean(((Number) obj2).intValue() > 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: append-4zbj8jY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m11641append4zbj8jY(Appendable appendable, Continuation<? super DataId> continuation) {
        ContactRepository$append$1 contactRepository$append$1;
        int i;
        if (continuation instanceof ContactRepository$append$1) {
            contactRepository$append$1 = (ContactRepository$append$1) continuation;
            if ((contactRepository$append$1.label & Integer.MIN_VALUE) != 0) {
                contactRepository$append$1.label -= Integer.MIN_VALUE;
                Object obj = contactRepository$append$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = contactRepository$append$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    ContactRepository$append$2 contactRepository$append$2 = new ContactRepository$append$2(appendable, this, null);
                    contactRepository$append$1.label = 1;
                    obj = BuildersKt.withContext(io2, contactRepository$append$2, contactRepository$append$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((DataId) obj).m11744unboximpl();
            }
        }
        contactRepository$append$1 = new ContactRepository$append$1(this, continuation);
        Object obj2 = contactRepository$append$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = contactRepository$append$1.label;
        if (i != 0) {
        }
        return ((DataId) obj2).m11744unboximpl();
    }

    public final Object update(Updatable updatable, Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new ContactRepository$update$3(updatable, this, null), continuation);
    }

    /* renamed from: deleteFieldEntry-bM46d30, reason: not valid java name */
    public final Object m11643deleteFieldEntrybM46d30(String str, Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new ContactRepository$deleteFieldEntry$2(str, this, null), continuation);
    }

    public static /* synthetic */ Object getAllIds$default(ContactRepository contactRepository, Integer num, Integer num2, String str, SortOrder sortOrder, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            sortOrder = SortOrder.UserDefault;
        }
        return contactRepository.getAllIds(num, num2, str, sortOrder, continuation);
    }

    public final Object getAllIds(Integer num, Integer num2, String str, SortOrder sortOrder, Continuation<? super List<ContactId>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new ContactRepository$getAllIds$2(this, str, sortOrder, num2, num, null), continuation);
    }

    /* renamed from: getById-m7AL99Q, reason: not valid java name */
    public final Object m11644getByIdm7AL99Q(Set<? extends ExtractableField<?>> set, String str, Continuation<? super ExistingContact> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new ContactRepository$getById$2(set, this, str, null), continuation);
    }

    public static /* synthetic */ Object getAllPaginated$default(ContactRepository contactRepository, Set set, Integer num, Integer num2, String str, SortOrder sortOrder, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            str = null;
        }
        if ((i & 16) != 0) {
            sortOrder = null;
        }
        return contactRepository.getAllPaginated(set, num, num2, str, sortOrder, continuation);
    }

    public final Object getAllPaginated(Set<? extends ExtractableField<?>> set, Integer num, Integer num2, String str, SortOrder sortOrder, Continuation<? super Collection<ExistingContact>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new ContactRepository$getAllPaginated$2(set, this, str, sortOrder, num, num2, null), continuation);
    }

    /* renamed from: getFieldFromData-m7AL99Q, reason: not valid java name */
    public final <T extends Extractable.Data> Object m11646getFieldFromDatam7AL99Q(ExtractableField.Data<T> data, String str, Continuation<? super List<? extends T>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new ContactRepository$getFieldFromData$2(this, data, str, null), continuation);
    }

    /* renamed from: getFieldFromContacts-m7AL99Q, reason: not valid java name */
    public final <T extends Extractable> Object m11645getFieldFromContactsm7AL99Q(ExtractableField.Contacts<T> contacts, String str, Continuation<? super T> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new ContactRepository$getFieldFromContacts$2(this, contacts, str, null), continuation);
    }

    public final Object getCount(Continuation<? super Integer> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new ContactRepository$getCount$2(this, null), continuation);
    }

    /* renamed from: getLookupKey-D2TBaGg, reason: not valid java name */
    public final Object m11647getLookupKeyD2TBaGg(String str, Continuation<? super String> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new ContactRepository$getLookupKey$2(this, str, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: getRawContactId-K3SHF88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m11648getRawContactIdK3SHF88(String str, Continuation<? super RawContactId> continuation) {
        ContactRepository$getRawContactId$1 contactRepository$getRawContactId$1;
        int i;
        RawContactId rawContactId;
        if (continuation instanceof ContactRepository$getRawContactId$1) {
            contactRepository$getRawContactId$1 = (ContactRepository$getRawContactId$1) continuation;
            if ((contactRepository$getRawContactId$1.label & Integer.MIN_VALUE) != 0) {
                contactRepository$getRawContactId$1.label -= Integer.MIN_VALUE;
                Object obj = contactRepository$getRawContactId$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = contactRepository$getRawContactId$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    ContactRepository$getRawContactId$2 contactRepository$getRawContactId$2 = new ContactRepository$getRawContactId$2(this, str, null);
                    contactRepository$getRawContactId$1.label = 1;
                    obj = BuildersKt.withContext(io2, contactRepository$getRawContactId$2, contactRepository$getRawContactId$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                rawContactId = (RawContactId) obj;
                if (rawContactId == null) {
                    return rawContactId.m11751unboximpl();
                }
                return null;
            }
        }
        contactRepository$getRawContactId$1 = new ContactRepository$getRawContactId$1(this, continuation);
        Object obj2 = contactRepository$getRawContactId$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = contactRepository$getRawContactId$1.label;
        if (i != 0) {
        }
        rawContactId = (RawContactId) obj2;
        if (rawContactId == null) {
        }
    }
}
