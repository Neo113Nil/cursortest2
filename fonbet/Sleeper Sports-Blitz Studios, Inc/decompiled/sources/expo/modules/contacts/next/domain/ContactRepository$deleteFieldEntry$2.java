package expo.modules.contacts.next.domain;

import android.content.ContentProviderOperation;
import android.provider.ContactsContract;
import expo.modules.contacts.next.extensions.ContentResolverExtensionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ContactRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.contacts.next.domain.ContactRepository$deleteFieldEntry$2", f = "ContactRepository.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class ContactRepository$deleteFieldEntry$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ String $dataId;
    int label;
    final /* synthetic */ ContactRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactRepository$deleteFieldEntry$2(String str, ContactRepository contactRepository, Continuation<? super ContactRepository$deleteFieldEntry$2> continuation) {
        super(2, continuation);
        this.$dataId = str;
        this.this$0 = contactRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ContactRepository$deleteFieldEntry$2(this.$dataId, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((ContactRepository$deleteFieldEntry$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ContentProviderOperation build = ContentProviderOperation.newDelete(ContactsContract.Data.CONTENT_URI).withSelection("_id = ?", new String[]{this.$dataId}).build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            this.label = 1;
            if (ContentResolverExtensionsKt.safeApplyBatch(this.this$0.getContentResolver(), "com.android.contacts", build, this) == coroutine_suspended) {
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
