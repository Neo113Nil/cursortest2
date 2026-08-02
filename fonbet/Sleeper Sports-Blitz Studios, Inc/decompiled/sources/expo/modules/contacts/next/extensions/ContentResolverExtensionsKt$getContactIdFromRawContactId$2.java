package expo.modules.contacts.next.extensions;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.ContactsContract;
import expo.modules.contacts.next.domain.wrappers.ContactId;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ContentResolverExtensions.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lexpo/modules/contacts/next/domain/wrappers/ContactId;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.contacts.next.extensions.ContentResolverExtensionsKt$getContactIdFromRawContactId$2", f = "ContentResolverExtensions.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class ContentResolverExtensionsKt$getContactIdFromRawContactId$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ContactId>, Object> {
    final /* synthetic */ String $rawContactId;
    final /* synthetic */ ContentResolver $this_getContactIdFromRawContactId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContentResolverExtensionsKt$getContactIdFromRawContactId$2(ContentResolver contentResolver, String str, Continuation<? super ContentResolverExtensionsKt$getContactIdFromRawContactId$2> continuation) {
        super(2, continuation);
        this.$this_getContactIdFromRawContactId = contentResolver;
        this.$rawContactId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ContentResolverExtensionsKt$getContactIdFromRawContactId$2(this.$this_getContactIdFromRawContactId, this.$rawContactId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ContactId> continuation) {
        return ((ContentResolverExtensionsKt$getContactIdFromRawContactId$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ContentResolver contentResolver = this.$this_getContactIdFromRawContactId;
            Uri CONTENT_URI = ContactsContract.RawContacts.CONTENT_URI;
            Intrinsics.checkNotNullExpressionValue(CONTENT_URI, "CONTENT_URI");
            this.label = 1;
            obj = ContentResolverExtensionsKt.queryOne$default(contentResolver, CONTENT_URI, "contact_id", ContentResolverExtensionsKt$getContactIdFromRawContactId$2$contactIdString$1.INSTANCE, "_id = ?", new String[]{this.$rawContactId}, null, this, 32, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        String str = (String) obj;
        String m11732constructorimpl = str != null ? ContactId.m11732constructorimpl(str) : null;
        if (m11732constructorimpl != null) {
            return ContactId.m11731boximpl(m11732constructorimpl);
        }
        return null;
    }
}
