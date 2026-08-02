package expo.modules.contacts.next.domain;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import expo.modules.contacts.next.domain.model.ExtractableField;
import expo.modules.contacts.next.domain.wrappers.DataId;
import expo.modules.contacts.next.extensions.ContentResolverExtensionsKt;
import expo.modules.contacts.next.extensions.CursorExtensionsKt;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: ContactRepository.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lexpo/modules/contacts/next/domain/wrappers/DataId;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.contacts.next.domain.ContactRepository$getDataIds$2", f = "ContactRepository.kt", i = {0}, l = {70}, m = "invokeSuspend", n = {"$this$withContext"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class ContactRepository$getDataIds$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends DataId>>, Object> {
    final /* synthetic */ String $contactId;
    final /* synthetic */ Set<ExtractableField.Data<?>> $extractableFields;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ContactRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ContactRepository$getDataIds$2(Set<? extends ExtractableField.Data<?>> set, ContactRepository contactRepository, String str, Continuation<? super ContactRepository$getDataIds$2> continuation) {
        super(2, continuation);
        this.$extractableFields = set;
        this.this$0 = contactRepository;
        this.$contactId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ContactRepository$getDataIds$2 contactRepository$getDataIds$2 = new ContactRepository$getDataIds$2(this.$extractableFields, this.this$0, this.$contactId, continuation);
        contactRepository$getDataIds$2.L$0 = obj;
        return contactRepository$getDataIds$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends DataId>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<DataId>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<DataId>> continuation) {
        return ((ContactRepository$getDataIds$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            Set<ExtractableField.Data<?>> set = this.$extractableFields;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(((ExtractableField.Data) it.next()).getMimeType());
            }
            List distinct = CollectionsKt.distinct(arrayList);
            String joinToString$default = CollectionsKt.joinToString$default(distinct, ",", null, null, 0, null, new Function1() { // from class: expo.modules.contacts.next.domain.ContactRepository$getDataIds$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    CharSequence invokeSuspend$lambda$1;
                    invokeSuspend$lambda$1 = ContactRepository$getDataIds$2.invokeSuspend$lambda$1((String) obj2);
                    return invokeSuspend$lambda$1;
                }
            }, 30, null);
            ContentResolver contentResolver = this.this$0.getContentResolver();
            Uri CONTENT_URI = ContactsContract.Data.CONTENT_URI;
            Intrinsics.checkNotNullExpressionValue(CONTENT_URI, "CONTENT_URI");
            this.L$0 = coroutineScope2;
            this.label = 1;
            Object safeQuery$default = ContentResolverExtensionsKt.safeQuery$default(contentResolver, CONTENT_URI, new String[]{"_id"}, "contact_id = ? AND mimetype IN (" + joinToString$default + ")", (String[]) ArraysKt.plus((Object[]) new String[]{this.$contactId}, distinct.toArray(new String[0])), null, this, 16, null);
            if (safeQuery$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            coroutineScope = coroutineScope2;
            obj = safeQuery$default;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Closeable closeable = (Closeable) obj;
        try {
            CoroutineScopeKt.ensureActive(coroutineScope);
            List list = SequencesKt.toList(SequencesKt.map(SequencesKt.map(CursorExtensionsKt.asSequence((Cursor) closeable), new Function1() { // from class: expo.modules.contacts.next.domain.ContactRepository$getDataIds$2$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    String invokeSuspend$lambda$3$lambda$2;
                    invokeSuspend$lambda$3$lambda$2 = ContactRepository$getDataIds$2.invokeSuspend$lambda$3$lambda$2((Cursor) obj2);
                    return invokeSuspend$lambda$3$lambda$2;
                }
            }), new Function1<String, DataId>() { // from class: expo.modules.contacts.next.domain.ContactRepository$getDataIds$2$1$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ DataId invoke(String str) {
                    return DataId.m11738boximpl(m11653invokefkdkgzA(str));
                }

                /* renamed from: invoke-fkdkgzA, reason: not valid java name */
                public final String m11653invokefkdkgzA(String str) {
                    Intrinsics.checkNotNull(str);
                    return DataId.m11739constructorimpl(str);
                }
            }));
            CloseableKt.closeFinally(closeable, null);
            return list;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence invokeSuspend$lambda$1(String str) {
        return "?";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeSuspend$lambda$3$lambda$2(Cursor cursor) {
        return cursor.getString(0);
    }
}
