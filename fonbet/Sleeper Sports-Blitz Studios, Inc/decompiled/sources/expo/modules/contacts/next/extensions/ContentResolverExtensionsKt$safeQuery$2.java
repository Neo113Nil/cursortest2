package expo.modules.contacts.next.extensions;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import expo.modules.contacts.next.CouldNotExecuteQueryException;
import expo.modules.contacts.next.PermissionException;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/database/Cursor;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.contacts.next.extensions.ContentResolverExtensionsKt$safeQuery$2", f = "ContentResolverExtensions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class ContentResolverExtensionsKt$safeQuery$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Cursor>, Object> {
    final /* synthetic */ String[] $projection;
    final /* synthetic */ String $selection;
    final /* synthetic */ String[] $selectionArgs;
    final /* synthetic */ String $sortOrder;
    final /* synthetic */ ContentResolver $this_safeQuery;
    final /* synthetic */ Uri $uri;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContentResolverExtensionsKt$safeQuery$2(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Continuation<? super ContentResolverExtensionsKt$safeQuery$2> continuation) {
        super(2, continuation);
        this.$this_safeQuery = contentResolver;
        this.$uri = uri;
        this.$projection = strArr;
        this.$selection = str;
        this.$selectionArgs = strArr2;
        this.$sortOrder = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ContentResolverExtensionsKt$safeQuery$2(this.$this_safeQuery, this.$uri, this.$projection, this.$selection, this.$selectionArgs, this.$sortOrder, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Cursor> continuation) {
        return ((ContentResolverExtensionsKt$safeQuery$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            Cursor query = this.$this_safeQuery.query(this.$uri, this.$projection, this.$selection, this.$selectionArgs, this.$sortOrder);
            if (query != null) {
                return query;
            }
            throw new CouldNotExecuteQueryException("Cursor returned by query is null", null, 2, null);
        } catch (SecurityException e) {
            throw new PermissionException("android.permission.READ_CONTACTS", e);
        }
    }
}
