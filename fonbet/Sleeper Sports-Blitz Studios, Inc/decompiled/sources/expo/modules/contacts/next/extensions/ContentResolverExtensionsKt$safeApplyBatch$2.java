package expo.modules.contacts.next.extensions;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ContentResolverExtensions.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.contacts.next.extensions.ContentResolverExtensionsKt", f = "ContentResolverExtensions.kt", i = {}, l = {39}, m = "safeApplyBatch", n = {}, s = {})
/* loaded from: classes8.dex */
final class ContentResolverExtensionsKt$safeApplyBatch$2 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    ContentResolverExtensionsKt$safeApplyBatch$2(Continuation<? super ContentResolverExtensionsKt$safeApplyBatch$2> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ContentResolverExtensionsKt.safeApplyBatch((ContentResolver) null, (String) null, (List<? extends ContentProviderOperation>) null, this);
    }
}
