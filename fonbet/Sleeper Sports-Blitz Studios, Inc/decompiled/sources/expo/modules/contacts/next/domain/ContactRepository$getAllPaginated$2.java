package expo.modules.contacts.next.domain;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import com.facebook.imageutils.JfifUtil;
import expo.modules.contacts.next.domain.model.ExtractableField;
import expo.modules.contacts.next.domain.model.contact.ExistingContact;
import expo.modules.contacts.next.domain.query.QueryAggregator;
import expo.modules.contacts.next.domain.query.QueryBuilder;
import expo.modules.contacts.next.domain.wrappers.ContactId;
import expo.modules.contacts.next.extensions.ContentResolverExtensionsKt;
import expo.modules.contacts.next.extensions.CursorExtensionsKt;
import expo.modules.contacts.next.records.SortOrder;
import java.io.Closeable;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.objectweb.asm.Opcodes;

/* compiled from: ContactRepository.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lexpo/modules/contacts/next/domain/model/contact/ExistingContact;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.contacts.next.domain.ContactRepository$getAllPaginated$2", f = "ContactRepository.kt", i = {0, 0, 0, 1, 1}, l = {Opcodes.MULTIANEWARRAY, JfifUtil.MARKER_EOI}, m = "invokeSuspend", n = {"$this$withContext", "queryAggregator", "queryBuilder", "$this$withContext", "queryAggregator"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
/* loaded from: classes8.dex */
final class ContactRepository$getAllPaginated$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends ExistingContact>>, Object> {
    final /* synthetic */ Set<ExtractableField<?>> $extractableFields;
    final /* synthetic */ Integer $limit;
    final /* synthetic */ Integer $offset;
    final /* synthetic */ String $searchedDisplayName;
    final /* synthetic */ SortOrder $sortOrder;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ContactRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ContactRepository$getAllPaginated$2(Set<? extends ExtractableField<?>> set, ContactRepository contactRepository, String str, SortOrder sortOrder, Integer num, Integer num2, Continuation<? super ContactRepository$getAllPaginated$2> continuation) {
        super(2, continuation);
        this.$extractableFields = set;
        this.this$0 = contactRepository;
        this.$searchedDisplayName = str;
        this.$sortOrder = sortOrder;
        this.$limit = num;
        this.$offset = num2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ContactRepository$getAllPaginated$2 contactRepository$getAllPaginated$2 = new ContactRepository$getAllPaginated$2(this.$extractableFields, this.this$0, this.$searchedDisplayName, this.$sortOrder, this.$limit, this.$offset, continuation);
        contactRepository$getAllPaginated$2.L$0 = obj;
        return contactRepository$getAllPaginated$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends ExistingContact>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<ExistingContact>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<ExistingContact>> continuation) {
        return ((ContactRepository$getAllPaginated$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ac, code lost:
    
        if (r3 == r0) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0150 A[Catch: all -> 0x0164, LOOP:0: B:9:0x014a->B:11:0x0150, LOOP_END, TryCatch #0 {all -> 0x0164, blocks: (B:8:0x013c, B:9:0x014a, B:11:0x0150, B:13:0x015a), top: B:7:0x013c }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        QueryAggregator queryAggregator;
        QueryBuilder queryBuilder;
        int i;
        String[] strArr;
        Object safeQuery;
        Closeable closeable;
        Integer num;
        Integer num2;
        Object safeQuery$default;
        QueryAggregator queryAggregator2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                queryAggregator = new QueryAggregator(this.$extractableFields);
                queryBuilder = new QueryBuilder(this.$extractableFields);
                ContentResolver contentResolver = this.this$0.getContentResolver();
                Uri CONTENT_URI = ContactsContract.Contacts.CONTENT_URI;
                Intrinsics.checkNotNullExpressionValue(CONTENT_URI, "CONTENT_URI");
                String[] buildContactsProjection = queryBuilder.buildContactsProjection();
                String str = this.$searchedDisplayName;
                String str2 = str != null ? "display_name LIKE ?" : null;
                if (str != null) {
                    i = 0;
                    strArr = new String[]{"%" + str + "%"};
                } else {
                    i = 0;
                    strArr = null;
                }
                SortOrder sortOrder = this.$sortOrder;
                String column = sortOrder != null ? sortOrder.toColumn() : null;
                this.L$0 = coroutineScope;
                this.L$1 = queryAggregator;
                this.L$2 = queryBuilder;
                this.label = 1;
                safeQuery = ContentResolverExtensionsKt.safeQuery(contentResolver, CONTENT_URI, buildContactsProjection, str2, strArr, column, this);
            } else if (i2 == 1) {
                QueryBuilder queryBuilder2 = (QueryBuilder) this.L$2;
                queryAggregator = (QueryAggregator) this.L$1;
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                queryBuilder = queryBuilder2;
                coroutineScope = coroutineScope2;
                safeQuery = obj;
                i = 0;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                queryAggregator2 = (QueryAggregator) this.L$1;
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                safeQuery$default = obj;
                closeable = (Closeable) safeQuery$default;
                try {
                    Cursor cursor = (Cursor) closeable;
                    CoroutineScopeKt.ensureActive(coroutineScope);
                    for (Cursor cursor2 : CursorExtensionsKt.asSequence(cursor)) {
                        queryAggregator2.aggregateDataRow(cursor);
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(closeable, null);
                    return queryAggregator2.buildContacts();
                } finally {
                }
            }
            Cursor cursor3 = (Cursor) closeable;
            CoroutineScopeKt.ensureActive(coroutineScope);
            if (num != null) {
                i = num.intValue();
            }
            cursor3.moveToPosition(i - 1);
            for (Cursor cursor4 : SequencesKt.take(CursorExtensionsKt.asSequence(cursor3), num2 != null ? num2.intValue() : Integer.MAX_VALUE)) {
                queryAggregator.aggregateContactsRow(cursor3);
            }
            Unit unit2 = Unit.INSTANCE;
            CloseableKt.closeFinally(closeable, null);
            List<ContactId> contactIdsFromBuilders = (this.$limit == null && this.$offset == null && this.$searchedDisplayName == null) ? null : queryAggregator.getContactIdsFromBuilders();
            ContentResolver contentResolver2 = this.this$0.getContentResolver();
            Uri CONTENT_URI2 = ContactsContract.Data.CONTENT_URI;
            Intrinsics.checkNotNullExpressionValue(CONTENT_URI2, "CONTENT_URI");
            List<ContactId> list = contactIdsFromBuilders;
            this.L$0 = coroutineScope;
            this.L$1 = queryAggregator;
            this.L$2 = null;
            this.label = 2;
            safeQuery$default = ContentResolverExtensionsKt.safeQuery$default(contentResolver2, CONTENT_URI2, queryBuilder.buildDataProjection(), queryBuilder.buildSelection(list), queryBuilder.buildSelectionArgs(list), null, this, 16, null);
            if (safeQuery$default != coroutine_suspended) {
                queryAggregator2 = queryAggregator;
                closeable = (Closeable) safeQuery$default;
                Cursor cursor5 = (Cursor) closeable;
                CoroutineScopeKt.ensureActive(coroutineScope);
                while (r2.hasNext()) {
                }
                Unit unit3 = Unit.INSTANCE;
                CloseableKt.closeFinally(closeable, null);
                return queryAggregator2.buildContacts();
            }
            return coroutine_suspended;
        } finally {
            try {
                throw th;
            } finally {
            }
        }
        closeable = (Closeable) safeQuery;
        num = this.$offset;
        num2 = this.$limit;
    }
}
