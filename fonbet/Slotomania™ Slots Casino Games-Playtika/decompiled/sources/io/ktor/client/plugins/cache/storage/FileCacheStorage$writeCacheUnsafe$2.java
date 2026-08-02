package io.ktor.client.plugins.cache.storage;

import io.ktor.client.plugins.cache.HttpCacheKt;
import io.ktor.util.logging.LoggerJvmKt;
import io.ktor.utils.io.ByteChannel;
import io.ktor.utils.io.jvm.javaio.WritingKt;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;
import kotlin.ExceptionsKt;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.slf4j.Logger;

/* compiled from: FileCacheStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCacheUnsafe$2", f = "FileCacheStorage.kt", i = {}, l = {157}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class FileCacheStorage$writeCacheUnsafe$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> {
    final /* synthetic */ List<CachedResponseData> $caches;
    final /* synthetic */ String $urlHex;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FileCacheStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileCacheStorage$writeCacheUnsafe$2(FileCacheStorage fileCacheStorage, String str, List<CachedResponseData> list, Continuation<? super FileCacheStorage$writeCacheUnsafe$2> continuation) {
        super(2, continuation);
        this.this$0 = fileCacheStorage;
        this.$urlHex = str;
        this.$caches = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FileCacheStorage$writeCacheUnsafe$2 fileCacheStorage$writeCacheUnsafe$2 = new FileCacheStorage$writeCacheUnsafe$2(this.this$0, this.$urlHex, this.$caches, continuation);
        fileCacheStorage$writeCacheUnsafe$2.L$0 = obj;
        return fileCacheStorage$writeCacheUnsafe$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Object> continuation) {
        return invoke2(coroutineScope, (Continuation<Object>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<Object> continuation) {
        return ((FileCacheStorage$writeCacheUnsafe$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.io.Closeable] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        File file;
        BufferedOutputStream bufferedOutputStream;
        Object copyTo$default;
        ?? r1;
        Throwable th;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            ByteChannel byteChannel = new ByteChannel(false, 1, null);
            try {
                file = this.this$0.directory;
                OutputStream fileOutputStream = new FileOutputStream(new File(file, this.$urlHex));
                bufferedOutputStream = fileOutputStream instanceof BufferedOutputStream ? (BufferedOutputStream) fileOutputStream : new BufferedOutputStream(fileOutputStream, 8192);
                try {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new FileCacheStorage$writeCacheUnsafe$2$1$1(byteChannel, this.$caches, this.this$0, null), 3, null);
                    this.L$0 = bufferedOutputStream;
                    this.label = 1;
                    copyTo$default = WritingKt.copyTo$default(byteChannel, bufferedOutputStream, 0L, this, 2, null);
                    if (copyTo$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    r1 = bufferedOutputStream;
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    throw th;
                }
            } catch (Exception e) {
                Logger logger = HttpCacheKt.getLOGGER();
                if (LoggerJvmKt.isTraceEnabled(logger)) {
                    logger.trace("Exception during saving a cache to a file: " + ExceptionsKt.stackTraceToString(e));
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r1 = (Closeable) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                copyTo$default = obj;
                r1 = r1;
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream = r1;
                th = th;
                try {
                    throw th;
                } catch (Throwable th4) {
                    CloseableKt.closeFinally(bufferedOutputStream, th);
                    throw th4;
                }
            }
        }
        Long boxLong = Boxing.boxLong(((Number) copyTo$default).longValue());
        CloseableKt.closeFinally(r1, null);
        return boxLong;
    }
}
