package expo.modules.filesystem;

import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

/* compiled from: FileSystemDownload.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.filesystem.FileSystemDownloadKt$streamWithProgress$3", f = "FileSystemDownload.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class FileSystemDownloadKt$streamWithProgress$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $contentLength;
    final /* synthetic */ Function0<Long> $currentTimeProvider;
    final /* synthetic */ Function3<String, Long, Long, Unit> $emitProgress;
    final /* synthetic */ InputStream $input;
    final /* synthetic */ FileOutputStream $output;
    final /* synthetic */ String $uuid;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FileSystemDownloadKt$streamWithProgress$3(InputStream inputStream, FileOutputStream fileOutputStream, Function0<Long> function0, Function3<? super String, ? super Long, ? super Long, Unit> function3, String str, long j, Continuation<? super FileSystemDownloadKt$streamWithProgress$3> continuation) {
        super(2, continuation);
        this.$input = inputStream;
        this.$output = fileOutputStream;
        this.$currentTimeProvider = function0;
        this.$emitProgress = function3;
        this.$uuid = str;
        this.$contentLength = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FileSystemDownloadKt$streamWithProgress$3(this.$input, this.$output, this.$currentTimeProvider, this.$emitProgress, this.$uuid, this.$contentLength, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FileSystemDownloadKt$streamWithProgress$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        byte[] bArr = new byte[8192];
        Ref.IntRef intRef = new Ref.IntRef();
        long j = 0;
        long j2 = 0;
        while (true) {
            int read = this.$input.read(bArr);
            intRef.element = read;
            if (read != -1) {
                JobKt.ensureActive(getContext());
                this.$output.write(bArr, 0, intRef.element);
                j += intRef.element;
                long longValue = this.$currentTimeProvider.invoke().longValue();
                if (longValue - j2 >= 100) {
                    this.$emitProgress.invoke(this.$uuid, Boxing.boxLong(j), Boxing.boxLong(this.$contentLength));
                    j2 = longValue;
                }
            } else {
                this.$emitProgress.invoke(this.$uuid, Boxing.boxLong(j), Boxing.boxLong(this.$contentLength));
                return Unit.INSTANCE;
            }
        }
    }
}
