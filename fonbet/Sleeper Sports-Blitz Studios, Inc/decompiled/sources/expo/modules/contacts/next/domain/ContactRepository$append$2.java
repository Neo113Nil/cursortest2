package expo.modules.contacts.next.domain;

import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import expo.modules.contacts.next.domain.model.Appendable;
import expo.modules.contacts.next.domain.wrappers.DataId;
import expo.modules.contacts.next.extensions.ContentProviderResultExtensionsKt;
import expo.modules.contacts.next.extensions.ContentResolverExtensionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ContactRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lexpo/modules/contacts/next/domain/wrappers/DataId;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.contacts.next.domain.ContactRepository$append$2", f = "ContactRepository.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class ContactRepository$append$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DataId>, Object> {
    final /* synthetic */ Appendable $appendable;
    int label;
    final /* synthetic */ ContactRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactRepository$append$2(Appendable appendable, ContactRepository contactRepository, Continuation<? super ContactRepository$append$2> continuation) {
        super(2, continuation);
        this.$appendable = appendable;
        this.this$0 = contactRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ContactRepository$append$2(this.$appendable, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super DataId> continuation) {
        return ((ContactRepository$append$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ContentProviderOperation appendOperation = this.$appendable.toAppendOperation();
            this.label = 1;
            obj = ContentResolverExtensionsKt.safeApplyBatch(this.this$0.getContentResolver(), "com.android.contacts", appendOperation, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return DataId.m11738boximpl(DataId.m11739constructorimpl(ContentProviderResultExtensionsKt.extractId((ContentProviderResult[]) obj)));
    }
}
