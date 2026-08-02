package expo.modules.contacts.next.extensions;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import androidx.exifinterface.media.ExifInterface;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: ContentResolverExtensions.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.contacts.next.extensions.ContentResolverExtensionsKt$queryOne$2", f = "ContentResolverExtensions.kt", i = {0}, l = {71}, m = "invokeSuspend", n = {"$this$withContext"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class ContentResolverExtensionsKt$queryOne$2<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
    final /* synthetic */ String $column;
    final /* synthetic */ Function2<Cursor, Integer, T> $extractor;
    final /* synthetic */ String $selection;
    final /* synthetic */ String[] $selectionArgs;
    final /* synthetic */ String $sortOrder;
    final /* synthetic */ ContentResolver $this_queryOne;
    final /* synthetic */ Uri $uri;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ContentResolverExtensionsKt$queryOne$2(String str, ContentResolver contentResolver, Uri uri, String str2, String[] strArr, String str3, Function2<? super Cursor, ? super Integer, ? extends T> function2, Continuation<? super ContentResolverExtensionsKt$queryOne$2> continuation) {
        super(2, continuation);
        this.$column = str;
        this.$this_queryOne = contentResolver;
        this.$uri = uri;
        this.$selection = str2;
        this.$selectionArgs = strArr;
        this.$sortOrder = str3;
        this.$extractor = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ContentResolverExtensionsKt$queryOne$2 contentResolverExtensionsKt$queryOne$2 = new ContentResolverExtensionsKt$queryOne$2(this.$column, this.$this_queryOne, this.$uri, this.$selection, this.$selectionArgs, this.$sortOrder, this.$extractor, continuation);
        contentResolverExtensionsKt$queryOne$2.L$0 = obj;
        return contentResolverExtensionsKt$queryOne$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
        return ((ContentResolverExtensionsKt$queryOne$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            String[] strArr = {this.$column};
            this.L$0 = coroutineScope2;
            this.label = 1;
            Object safeQuery = ContentResolverExtensionsKt.safeQuery(this.$this_queryOne, this.$uri, strArr, this.$selection, this.$selectionArgs, this.$sortOrder, this);
            if (safeQuery == coroutine_suspended) {
                return coroutine_suspended;
            }
            coroutineScope = coroutineScope2;
            obj = safeQuery;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Closeable closeable = (Closeable) obj;
        String str = this.$column;
        Function2<Cursor, Integer, T> function2 = this.$extractor;
        try {
            Cursor cursor = (Cursor) closeable;
            CoroutineScopeKt.ensureActive(coroutineScope);
            T invoke = cursor.moveToFirst() ? function2.invoke(cursor, Boxing.boxInt(cursor.getColumnIndexOrThrow(str))) : null;
            CloseableKt.closeFinally(closeable, null);
            return invoke;
        } finally {
        }
    }
}
