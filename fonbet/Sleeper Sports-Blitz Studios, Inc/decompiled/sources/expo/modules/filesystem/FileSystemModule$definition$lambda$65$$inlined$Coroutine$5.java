package expo.modules.filesystem;

import java.net.URI;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AsyncFunctionBuilder.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004H\n¨\u0006\u0005"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "<destruct>", "", "expo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$9"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.filesystem.FileSystemModule$definition$lambda$65$$inlined$Coroutine$5", f = "FileSystemModule.kt", i = {}, l = {271}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class FileSystemModule$definition$lambda$65$$inlined$Coroutine$5 extends SuspendLambda implements Function3<CoroutineScope, Object[], Continuation<? super Object>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FileSystemModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystemModule$definition$lambda$65$$inlined$Coroutine$5(Continuation continuation, FileSystemModule fileSystemModule) {
        super(3, continuation);
        this.this$0 = fileSystemModule;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Object[] objArr, Continuation<? super Object> continuation) {
        return invoke2(coroutineScope, objArr, (Continuation<Object>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Object[] objArr, Continuation<Object> continuation) {
        FileSystemModule$definition$lambda$65$$inlined$Coroutine$5 fileSystemModule$definition$lambda$65$$inlined$Coroutine$5 = new FileSystemModule$definition$lambda$65$$inlined$Coroutine$5(continuation, this.this$0);
        fileSystemModule$definition$lambda$65$$inlined$Coroutine$5.L$0 = objArr;
        return fileSystemModule$definition$lambda$65$$inlined$Coroutine$5.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DownloadTaskStore downloadTaskStore;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Object[] objArr = (Object[]) this.L$0;
        Object obj2 = objArr[0];
        Object obj3 = objArr[1];
        Object obj4 = objArr[2];
        String str = (String) objArr[3];
        URI uri = (URI) obj2;
        downloadTaskStore = this.this$0.downloadStore;
        final FileSystemModule fileSystemModule = this.this$0;
        Function3<String, Long, Long, Unit> function3 = new Function3<String, Long, Long, Unit>() { // from class: expo.modules.filesystem.FileSystemModule$definition$1$6$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(String str2, Long l, Long l2) {
                invoke(str2, l.longValue(), l2.longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(String uuid, long j, long j2) {
                Intrinsics.checkNotNullParameter(uuid, "uuid");
                FileSystemModule.this.sendEvent("downloadProgress", MapsKt.mapOf(TuplesKt.to("uuid", uuid), TuplesKt.to("data", MapsKt.mapOf(TuplesKt.to("bytesWritten", Long.valueOf(j)), TuplesKt.to("totalBytes", Long.valueOf(j2))))));
            }
        };
        this.label = 1;
        Object downloadFileWithStore = FileSystemDownloadKt.downloadFileWithStore(uri, (FileSystemPath) obj3, (DownloadOptions) obj4, str, downloadTaskStore, function3, this);
        return downloadFileWithStore == coroutine_suspended ? coroutine_suspended : downloadFileWithStore;
    }
}
