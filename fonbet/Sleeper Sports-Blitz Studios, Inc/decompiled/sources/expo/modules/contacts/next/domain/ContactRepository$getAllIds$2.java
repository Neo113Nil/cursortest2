package expo.modules.contacts.next.domain;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import expo.modules.contacts.next.domain.wrappers.ContactId;
import expo.modules.contacts.next.extensions.ContentResolverExtensionsKt;
import expo.modules.contacts.next.extensions.CursorExtensionsKt;
import expo.modules.contacts.next.records.SortOrder;
import java.io.Closeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lexpo/modules/contacts/next/domain/wrappers/ContactId;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.contacts.next.domain.ContactRepository$getAllIds$2", f = "ContactRepository.kt", i = {0}, l = {137}, m = "invokeSuspend", n = {"$this$withContext"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class ContactRepository$getAllIds$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends ContactId>>, Object> {
    final /* synthetic */ Integer $limit;
    final /* synthetic */ Integer $offset;
    final /* synthetic */ String $searchedDisplayName;
    final /* synthetic */ SortOrder $sortOrder;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ContactRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactRepository$getAllIds$2(ContactRepository contactRepository, String str, SortOrder sortOrder, Integer num, Integer num2, Continuation<? super ContactRepository$getAllIds$2> continuation) {
        super(2, continuation);
        this.this$0 = contactRepository;
        this.$searchedDisplayName = str;
        this.$sortOrder = sortOrder;
        this.$offset = num;
        this.$limit = num2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ContactRepository$getAllIds$2 contactRepository$getAllIds$2 = new ContactRepository$getAllIds$2(this.this$0, this.$searchedDisplayName, this.$sortOrder, this.$offset, this.$limit, continuation);
        contactRepository$getAllIds$2.L$0 = obj;
        return contactRepository$getAllIds$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends ContactId>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<ContactId>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<ContactId>> continuation) {
        return ((ContactRepository$getAllIds$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String[] strArr;
        CoroutineScope coroutineScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            ContentResolver contentResolver = this.this$0.getContentResolver();
            Uri CONTENT_URI = ContactsContract.Contacts.CONTENT_URI;
            Intrinsics.checkNotNullExpressionValue(CONTENT_URI, "CONTENT_URI");
            String[] strArr2 = {"_id"};
            String str = this.$searchedDisplayName;
            String str2 = str != null ? "display_name LIKE ?" : null;
            if (str != null) {
                strArr = new String[]{"%" + str + "%"};
            } else {
                strArr = null;
            }
            SortOrder sortOrder = this.$sortOrder;
            String column = sortOrder != null ? sortOrder.toColumn() : null;
            this.L$0 = coroutineScope2;
            this.label = 1;
            Object safeQuery = ContentResolverExtensionsKt.safeQuery(contentResolver, CONTENT_URI, strArr2, str2, strArr, column, this);
            if (safeQuery == coroutine_suspended) {
                return coroutine_suspended;
            }
            coroutineScope = coroutineScope2;
            obj = safeQuery;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Closeable closeable = (Closeable) obj;
        Integer num = this.$offset;
        Integer num2 = this.$limit;
        try {
            Cursor cursor = (Cursor) closeable;
            CoroutineScopeKt.ensureActive(coroutineScope);
            cursor.moveToPosition((num != null ? num.intValue() : 0) - 1);
            List list = SequencesKt.toList(SequencesKt.map(SequencesKt.map(SequencesKt.take(CursorExtensionsKt.asSequence(cursor), num2 != null ? num2.intValue() : Integer.MAX_VALUE), new Function1() { // from class: expo.modules.contacts.next.domain.ContactRepository$getAllIds$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    String invokeSuspend$lambda$3$lambda$2;
                    invokeSuspend$lambda$3$lambda$2 = ContactRepository$getAllIds$2.invokeSuspend$lambda$3$lambda$2((Cursor) obj2);
                    return invokeSuspend$lambda$3$lambda$2;
                }
            }), new Function1<String, ContactId>() { // from class: expo.modules.contacts.next.domain.ContactRepository$getAllIds$2$3$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ ContactId invoke(String str3) {
                    return ContactId.m11731boximpl(m11651invokeOAciUqU(str3));
                }

                /* renamed from: invoke-OAciUqU, reason: not valid java name */
                public final String m11651invokeOAciUqU(String str3) {
                    Intrinsics.checkNotNull(str3);
                    return ContactId.m11732constructorimpl(str3);
                }
            }));
            CloseableKt.closeFinally(closeable, null);
            return list;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeSuspend$lambda$3$lambda$2(Cursor cursor) {
        return cursor.getString(cursor.getColumnIndexOrThrow("_id"));
    }
}
