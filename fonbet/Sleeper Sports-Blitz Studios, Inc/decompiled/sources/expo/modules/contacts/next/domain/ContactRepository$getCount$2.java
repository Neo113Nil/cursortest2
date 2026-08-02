package expo.modules.contacts.next.domain;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import expo.modules.contacts.next.extensions.ContentResolverExtensionsKt;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: ContactRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.contacts.next.domain.ContactRepository$getCount$2", f = "ContactRepository.kt", i = {0}, l = {262}, m = "invokeSuspend", n = {"$this$withContext"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class ContactRepository$getCount$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ContactRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactRepository$getCount$2(ContactRepository contactRepository, Continuation<? super ContactRepository$getCount$2> continuation) {
        super(2, continuation);
        this.this$0 = contactRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ContactRepository$getCount$2 contactRepository$getCount$2 = new ContactRepository$getCount$2(this.this$0, continuation);
        contactRepository$getCount$2.L$0 = obj;
        return contactRepository$getCount$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
        return ((ContactRepository$getCount$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Object safeQuery$default = ContentResolverExtensionsKt.safeQuery$default(contentResolver, CONTENT_URI, new String[]{"_id"}, null, null, null, this, 28, null);
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
            Integer boxInt = Boxing.boxInt(((Cursor) closeable).getCount());
            CloseableKt.closeFinally(closeable, null);
            return boxInt;
        } finally {
        }
    }
}
