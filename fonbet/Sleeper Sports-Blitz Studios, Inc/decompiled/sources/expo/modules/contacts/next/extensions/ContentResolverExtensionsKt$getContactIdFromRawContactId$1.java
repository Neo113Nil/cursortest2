package expo.modules.contacts.next.extensions;

import expo.modules.contacts.next.domain.wrappers.ContactId;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ContentResolverExtensions.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.contacts.next.extensions.ContentResolverExtensionsKt", f = "ContentResolverExtensions.kt", i = {}, l = {49}, m = "getContactIdFromRawContactId-5WPtcSs", n = {}, s = {})
/* loaded from: classes8.dex */
final class ContentResolverExtensionsKt$getContactIdFromRawContactId$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    ContentResolverExtensionsKt$getContactIdFromRawContactId$1(Continuation<? super ContentResolverExtensionsKt$getContactIdFromRawContactId$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m11753getContactIdFromRawContactId5WPtcSs = ContentResolverExtensionsKt.m11753getContactIdFromRawContactId5WPtcSs(null, null, this);
        if (m11753getContactIdFromRawContactId5WPtcSs == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return m11753getContactIdFromRawContactId5WPtcSs;
        }
        String str = (String) m11753getContactIdFromRawContactId5WPtcSs;
        if (str != null) {
            return ContactId.m11731boximpl(str);
        }
        return null;
    }
}
