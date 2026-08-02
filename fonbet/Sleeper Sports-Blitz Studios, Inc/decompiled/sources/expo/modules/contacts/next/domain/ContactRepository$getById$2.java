package expo.modules.contacts.next.domain;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import expo.modules.contacts.next.domain.model.ExtractableField;
import expo.modules.contacts.next.domain.model.contact.ExistingContact;
import expo.modules.contacts.next.domain.query.QueryAggregator;
import expo.modules.contacts.next.domain.query.QueryBuilder;
import expo.modules.contacts.next.domain.wrappers.ContactId;
import expo.modules.contacts.next.extensions.ContentResolverExtensionsKt;
import expo.modules.contacts.next.extensions.CursorExtensionsKt;
import java.io.Closeable;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.objectweb.asm.Opcodes;

/* compiled from: ContactRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lexpo/modules/contacts/next/domain/model/contact/ExistingContact;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.contacts.next.domain.ContactRepository$getById$2", f = "ContactRepository.kt", i = {0, 0, 0, 1, 1}, l = {Opcodes.IF_ICMPGE, Opcodes.LRETURN}, m = "invokeSuspend", n = {"$this$withContext", "queryAggregator", "queryBuilder", "$this$withContext", "queryAggregator"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
/* loaded from: classes8.dex */
final class ContactRepository$getById$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ExistingContact>, Object> {
    final /* synthetic */ String $contactId;
    final /* synthetic */ Set<ExtractableField<?>> $extractableFields;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ContactRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ContactRepository$getById$2(Set<? extends ExtractableField<?>> set, ContactRepository contactRepository, String str, Continuation<? super ContactRepository$getById$2> continuation) {
        super(2, continuation);
        this.$extractableFields = set;
        this.this$0 = contactRepository;
        this.$contactId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ContactRepository$getById$2 contactRepository$getById$2 = new ContactRepository$getById$2(this.$extractableFields, this.this$0, this.$contactId, continuation);
        contactRepository$getById$2.L$0 = obj;
        return contactRepository$getById$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ExistingContact> continuation) {
        return ((ContactRepository$getById$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0084, code lost:
    
        if (r5 == r0) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0106 A[Catch: all -> 0x012b, LOOP:0: B:9:0x0100->B:11:0x0106, LOOP_END, TryCatch #2 {all -> 0x012b, blocks: (B:8:0x00f2, B:9:0x0100, B:11:0x0106, B:13:0x0110), top: B:7:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x012a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        QueryAggregator queryAggregator;
        QueryBuilder queryBuilder;
        Object safeQuery$default;
        Closeable closeable;
        Object safeQuery$default2;
        QueryAggregator queryAggregator2;
        List<ExistingContact> buildContacts;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                queryAggregator = new QueryAggregator(this.$extractableFields);
                queryBuilder = new QueryBuilder(this.$extractableFields);
                ContentResolver contentResolver = this.this$0.getContentResolver();
                Uri CONTENT_URI = ContactsContract.Contacts.CONTENT_URI;
                Intrinsics.checkNotNullExpressionValue(CONTENT_URI, "CONTENT_URI");
                this.L$0 = coroutineScope;
                this.L$1 = queryAggregator;
                this.L$2 = queryBuilder;
                this.label = 1;
                safeQuery$default = ContentResolverExtensionsKt.safeQuery$default(contentResolver, CONTENT_URI, queryBuilder.buildContactsProjection(), "_id = ?", new String[]{this.$contactId}, null, this, 16, null);
            } else if (i == 1) {
                QueryBuilder queryBuilder2 = (QueryBuilder) this.L$2;
                QueryAggregator queryAggregator3 = (QueryAggregator) this.L$1;
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                queryBuilder = queryBuilder2;
                coroutineScope = coroutineScope2;
                queryAggregator = queryAggregator3;
                safeQuery$default = obj;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                queryAggregator2 = (QueryAggregator) this.L$1;
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                safeQuery$default2 = obj;
                closeable = (Closeable) safeQuery$default2;
                try {
                    Cursor cursor = (Cursor) closeable;
                    CoroutineScopeKt.ensureActive(coroutineScope);
                    for (Cursor cursor2 : CursorExtensionsKt.asSequence(cursor)) {
                        queryAggregator2.aggregateDataRow(cursor);
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(closeable, null);
                    buildContacts = queryAggregator2.buildContacts();
                    if (buildContacts.isEmpty()) {
                        return buildContacts.get(0);
                    }
                    return null;
                } finally {
                }
            }
            Cursor cursor3 = (Cursor) closeable;
            for (Cursor cursor4 : CursorExtensionsKt.asSequence(cursor3)) {
                queryAggregator.aggregateContactsRow(cursor3);
            }
            Unit unit2 = Unit.INSTANCE;
            CloseableKt.closeFinally(closeable, null);
            ContentResolver contentResolver2 = this.this$0.getContentResolver();
            Uri CONTENT_URI2 = ContactsContract.Data.CONTENT_URI;
            Intrinsics.checkNotNullExpressionValue(CONTENT_URI2, "CONTENT_URI");
            this.L$0 = coroutineScope;
            this.L$1 = queryAggregator;
            this.L$2 = null;
            this.label = 2;
            safeQuery$default2 = ContentResolverExtensionsKt.safeQuery$default(contentResolver2, CONTENT_URI2, queryBuilder.buildDataProjection(), queryBuilder.buildSelection(CollectionsKt.listOf(ContactId.m11731boximpl(this.$contactId))), queryBuilder.buildSelectionArgs(CollectionsKt.listOf(ContactId.m11731boximpl(this.$contactId))), null, this, 16, null);
            if (safeQuery$default2 != coroutine_suspended) {
                queryAggregator2 = queryAggregator;
                closeable = (Closeable) safeQuery$default2;
                Cursor cursor5 = (Cursor) closeable;
                CoroutineScopeKt.ensureActive(coroutineScope);
                while (r2.hasNext()) {
                }
                Unit unit3 = Unit.INSTANCE;
                CloseableKt.closeFinally(closeable, null);
                buildContacts = queryAggregator2.buildContacts();
                if (buildContacts.isEmpty()) {
                }
            }
            return coroutine_suspended;
        } finally {
            try {
                throw th;
            } finally {
            }
        }
        closeable = (Closeable) safeQuery$default;
    }
}
