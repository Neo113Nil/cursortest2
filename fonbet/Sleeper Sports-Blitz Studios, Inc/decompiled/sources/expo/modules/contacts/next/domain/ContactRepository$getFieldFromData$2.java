package expo.modules.contacts.next.domain;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import androidx.exifinterface.media.ExifInterface;
import expo.modules.contacts.next.domain.model.ExtractableField;
import expo.modules.contacts.next.domain.query.QueryAggregator;
import expo.modules.contacts.next.extensions.ContentResolverExtensionsKt;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: ContactRepository.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\n"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lexpo/modules/contacts/next/domain/model/Extractable$Data;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.contacts.next.domain.ContactRepository$getFieldFromData$2", f = "ContactRepository.kt", i = {0}, l = {235}, m = "invokeSuspend", n = {"$this$withContext"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class ContactRepository$getFieldFromData$2<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends T>>, Object> {
    final /* synthetic */ String $contactId;
    final /* synthetic */ ExtractableField.Data<T> $extractableField;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ContactRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactRepository$getFieldFromData$2(ContactRepository contactRepository, ExtractableField.Data<T> data, String str, Continuation<? super ContactRepository$getFieldFromData$2> continuation) {
        super(2, continuation);
        this.this$0 = contactRepository;
        this.$extractableField = data;
        this.$contactId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ContactRepository$getFieldFromData$2 contactRepository$getFieldFromData$2 = new ContactRepository$getFieldFromData$2(this.this$0, this.$extractableField, this.$contactId, continuation);
        contactRepository$getFieldFromData$2.L$0 = obj;
        return contactRepository$getFieldFromData$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends T>> continuation) {
        return ((ContactRepository$getFieldFromData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Uri CONTENT_URI = ContactsContract.Data.CONTENT_URI;
            Intrinsics.checkNotNullExpressionValue(CONTENT_URI, "CONTENT_URI");
            this.L$0 = coroutineScope2;
            this.label = 1;
            Object safeQuery$default = ContentResolverExtensionsKt.safeQuery$default(contentResolver, CONTENT_URI, this.$extractableField.getProjection(), "contact_id = ? AND mimetype = ?", new String[]{this.$contactId, this.$extractableField.getMimeType()}, null, this, 16, null);
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
        ExtractableField.Data<T> data = this.$extractableField;
        try {
            CoroutineScopeKt.ensureActive(coroutineScope);
            List aggregateOneField = QueryAggregator.INSTANCE.aggregateOneField((Cursor) closeable, data);
            CloseableKt.closeFinally(closeable, null);
            return aggregateOneField;
        } finally {
        }
    }
}
