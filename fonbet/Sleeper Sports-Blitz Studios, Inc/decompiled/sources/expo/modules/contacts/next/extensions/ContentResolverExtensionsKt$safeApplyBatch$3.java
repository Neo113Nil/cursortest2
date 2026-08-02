package expo.modules.contacts.next.extensions;

import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import expo.modules.contacts.next.PermissionException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ContentResolverExtensions.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a0\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0017\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001¢\u0006\u0002\b\u00040\u0001¢\u0006\u0002\b\u0004*\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "Landroid/content/ContentProviderResult;", "kotlin.jvm.PlatformType", "Lkotlin/jvm/internal/EnhancedNullability;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.contacts.next.extensions.ContentResolverExtensionsKt$safeApplyBatch$3", f = "ContentResolverExtensions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class ContentResolverExtensionsKt$safeApplyBatch$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ContentProviderResult[]>, Object> {
    final /* synthetic */ String $authority;
    final /* synthetic */ List<ContentProviderOperation> $operations;
    final /* synthetic */ ContentResolver $this_safeApplyBatch;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ContentResolverExtensionsKt$safeApplyBatch$3(ContentResolver contentResolver, String str, List<? extends ContentProviderOperation> list, Continuation<? super ContentResolverExtensionsKt$safeApplyBatch$3> continuation) {
        super(2, continuation);
        this.$this_safeApplyBatch = contentResolver;
        this.$authority = str;
        this.$operations = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ContentResolverExtensionsKt$safeApplyBatch$3(this.$this_safeApplyBatch, this.$authority, this.$operations, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ContentProviderResult[]> continuation) {
        return ((ContentResolverExtensionsKt$safeApplyBatch$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            return this.$this_safeApplyBatch.applyBatch(this.$authority, new ArrayList<>(this.$operations));
        } catch (SecurityException e) {
            throw new PermissionException("android.permission.WRITE_CONTACTS", e);
        }
    }
}
