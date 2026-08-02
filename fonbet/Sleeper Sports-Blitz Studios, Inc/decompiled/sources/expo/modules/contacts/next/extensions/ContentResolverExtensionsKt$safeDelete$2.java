package expo.modules.contacts.next.extensions;

import android.content.ContentResolver;
import android.net.Uri;
import expo.modules.contacts.next.PermissionException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ContentResolverExtensions.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.contacts.next.extensions.ContentResolverExtensionsKt$safeDelete$2", f = "ContentResolverExtensions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class ContentResolverExtensionsKt$safeDelete$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
    final /* synthetic */ String[] $selectionArgs;
    final /* synthetic */ ContentResolver $this_safeDelete;
    final /* synthetic */ Uri $uri;
    final /* synthetic */ String $where;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContentResolverExtensionsKt$safeDelete$2(ContentResolver contentResolver, Uri uri, String str, String[] strArr, Continuation<? super ContentResolverExtensionsKt$safeDelete$2> continuation) {
        super(2, continuation);
        this.$this_safeDelete = contentResolver;
        this.$uri = uri;
        this.$where = str;
        this.$selectionArgs = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ContentResolverExtensionsKt$safeDelete$2(this.$this_safeDelete, this.$uri, this.$where, this.$selectionArgs, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
        return ((ContentResolverExtensionsKt$safeDelete$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            return Boxing.boxInt(this.$this_safeDelete.delete(this.$uri, this.$where, this.$selectionArgs));
        } catch (SecurityException e) {
            throw new PermissionException("android.permission.WRITE_CONTACTS", e);
        }
    }
}
