package expo.modules.contacts.next.domain;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import androidx.exifinterface.media.ExifInterface;
import expo.modules.contacts.next.domain.model.Extractable;
import expo.modules.contacts.next.domain.model.ExtractableField;
import expo.modules.contacts.next.domain.query.QueryAggregator;
import expo.modules.contacts.next.extensions.ContentResolverExtensionsKt;
import java.io.Closeable;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: ContactRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u0003H\n"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "Lexpo/modules/contacts/next/domain/model/Extractable;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.contacts.next.domain.ContactRepository$getFieldFromContacts$2", f = "ContactRepository.kt", i = {0}, l = {250}, m = "invokeSuspend", n = {"$this$withContext"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class ContactRepository$getFieldFromContacts$2<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
    final /* synthetic */ String $contactId;
    final /* synthetic */ ExtractableField.Contacts<T> $extractableField;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ContactRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactRepository$getFieldFromContacts$2(ContactRepository contactRepository, ExtractableField.Contacts<T> contacts, String str, Continuation<? super ContactRepository$getFieldFromContacts$2> continuation) {
        super(2, continuation);
        this.this$0 = contactRepository;
        this.$extractableField = contacts;
        this.$contactId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ContactRepository$getFieldFromContacts$2 contactRepository$getFieldFromContacts$2 = new ContactRepository$getFieldFromContacts$2(this.this$0, this.$extractableField, this.$contactId, continuation);
        contactRepository$getFieldFromContacts$2.L$0 = obj;
        return contactRepository$getFieldFromContacts$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
        return ((ContactRepository$getFieldFromContacts$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            ContentResolver contentResolver = this.this$0.getContentResolver();
            Uri CONTENT_URI = ContactsContract.Contacts.CONTENT_URI;
            Intrinsics.checkNotNullExpressionValue(CONTENT_URI, "CONTENT_URI");
            this.L$0 = coroutineScope2;
            this.label = 1;
            Object safeQuery$default = ContentResolverExtensionsKt.safeQuery$default(contentResolver, CONTENT_URI, this.$extractableField.getProjection(), "_id = ?", new String[]{this.$contactId}, null, this, 16, null);
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
        ExtractableField.Contacts<T> contacts = this.$extractableField;
        try {
            CoroutineScopeKt.ensureActive(coroutineScope);
            Extractable aggregateOneFieldFromContacts = QueryAggregator.INSTANCE.aggregateOneFieldFromContacts((Cursor) closeable, contacts);
            CloseableKt.closeFinally(closeable, null);
            return aggregateOneFieldFromContacts;
        } finally {
        }
    }
}
