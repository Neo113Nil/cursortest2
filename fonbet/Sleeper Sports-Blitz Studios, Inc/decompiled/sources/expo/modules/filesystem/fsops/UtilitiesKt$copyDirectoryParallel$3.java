package expo.modules.filesystem.fsops;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import expo.modules.filesystem.unifiedfile.UnifiedFileInterface;
import expo.modules.kotlin.exception.Exceptions;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;
import org.objectweb.asm.Opcodes;

/* compiled from: Utilities.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.filesystem.fsops.UtilitiesKt$copyDirectoryParallel$3", f = "Utilities.kt", i = {}, l = {Opcodes.PUTFIELD}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class UtilitiesKt$copyDirectoryParallel$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<UnifiedFileInterface, UnifiedFileInterface, Unit> $copyFile;
    final /* synthetic */ UnifiedFileInterface $dest;
    final /* synthetic */ int $parallelism;
    final /* synthetic */ UnifiedFileInterface $source;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UtilitiesKt$copyDirectoryParallel$3(UnifiedFileInterface unifiedFileInterface, UnifiedFileInterface unifiedFileInterface2, int i, Function2<? super UnifiedFileInterface, ? super UnifiedFileInterface, Unit> function2, Continuation<? super UtilitiesKt$copyDirectoryParallel$3> continuation) {
        super(2, continuation);
        this.$source = unifiedFileInterface;
        this.$dest = unifiedFileInterface2;
        this.$parallelism = i;
        this.$copyFile = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UtilitiesKt$copyDirectoryParallel$3 utilitiesKt$copyDirectoryParallel$3 = new UtilitiesKt$copyDirectoryParallel$3(this.$source, this.$dest, this.$parallelism, this.$copyFile, continuation);
        utilitiesKt$copyDirectoryParallel$3.L$0 = obj;
        return utilitiesKt$copyDirectoryParallel$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UtilitiesKt$copyDirectoryParallel$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            if (!this.$source.isDirectory()) {
                throw new IllegalArgumentException("Source must be directory".toString());
            }
            if (!this.$dest.isDirectory()) {
                throw new IllegalArgumentException("Dest must be directory".toString());
            }
            this.label = 1;
            if (invokeSuspend$walk(SemaphoreKt.Semaphore$default(this.$parallelism, 0, 2, null), coroutineScope, this.$copyFile, this.$source, this.$dest, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x011b A[Catch: all -> 0x016a, TRY_LEAVE, TryCatch #0 {all -> 0x016a, blocks: (B:12:0x010d, B:15:0x0115, B:17:0x011b, B:22:0x0133, B:57:0x0153, B:58:0x0169), top: B:11:0x010d }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0153 A[Catch: all -> 0x016a, TryCatch #0 {all -> 0x016a, blocks: (B:12:0x010d, B:15:0x0115, B:17:0x011b, B:22:0x0133, B:57:0x0153, B:58:0x0169), top: B:11:0x010d }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0107 -> B:11:0x010d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object invokeSuspend$walk(Semaphore semaphore, CoroutineScope coroutineScope, Function2<? super UnifiedFileInterface, ? super UnifiedFileInterface, Unit> function2, UnifiedFileInterface unifiedFileInterface, UnifiedFileInterface unifiedFileInterface2, Continuation<? super Unit> continuation) {
        UtilitiesKt$copyDirectoryParallel$3$walk$1 utilitiesKt$copyDirectoryParallel$3$walk$1;
        int i;
        Function2<? super UnifiedFileInterface, ? super UnifiedFileInterface, Unit> function22;
        UnifiedFileInterface unifiedFileInterface3;
        Iterator it;
        UtilitiesKt$copyDirectoryParallel$3$walk$1 utilitiesKt$copyDirectoryParallel$3$walk$12;
        Semaphore semaphore2;
        CoroutineScope coroutineScope2;
        Semaphore semaphore3;
        Function2<? super UnifiedFileInterface, ? super UnifiedFileInterface, Unit> function23;
        CoroutineScope coroutineScope3;
        String str;
        Iterator it2;
        UnifiedFileInterface unifiedFileInterface4;
        UnifiedFileInterface unifiedFileInterface5;
        String type;
        UnifiedFileInterface createFile;
        Semaphore semaphore4;
        if (continuation instanceof UtilitiesKt$copyDirectoryParallel$3$walk$1) {
            utilitiesKt$copyDirectoryParallel$3$walk$1 = (UtilitiesKt$copyDirectoryParallel$3$walk$1) continuation;
            if ((utilitiesKt$copyDirectoryParallel$3$walk$1.label & Integer.MIN_VALUE) != 0) {
                utilitiesKt$copyDirectoryParallel$3$walk$1.label -= Integer.MIN_VALUE;
                Object obj = utilitiesKt$copyDirectoryParallel$3$walk$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = utilitiesKt$copyDirectoryParallel$3$walk$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    function22 = function2;
                    unifiedFileInterface3 = unifiedFileInterface2;
                    it = unifiedFileInterface.listFilesAsUnified().iterator();
                    utilitiesKt$copyDirectoryParallel$3$walk$12 = utilitiesKt$copyDirectoryParallel$3$walk$1;
                    semaphore2 = semaphore;
                    coroutineScope2 = coroutineScope;
                } else if (i == 1) {
                    Iterator it3 = (Iterator) utilitiesKt$copyDirectoryParallel$3$walk$1.L$4;
                    unifiedFileInterface3 = (UnifiedFileInterface) utilitiesKt$copyDirectoryParallel$3$walk$1.L$3;
                    Function2<? super UnifiedFileInterface, ? super UnifiedFileInterface, Unit> function24 = (Function2) utilitiesKt$copyDirectoryParallel$3$walk$1.L$2;
                    CoroutineScope coroutineScope4 = (CoroutineScope) utilitiesKt$copyDirectoryParallel$3$walk$1.L$1;
                    Semaphore semaphore5 = (Semaphore) utilitiesKt$copyDirectoryParallel$3$walk$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    utilitiesKt$copyDirectoryParallel$3$walk$12 = utilitiesKt$copyDirectoryParallel$3$walk$1;
                    coroutineScope2 = coroutineScope4;
                    it = it3;
                    function22 = function24;
                    semaphore2 = semaphore5;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) utilitiesKt$copyDirectoryParallel$3$walk$1.L$6;
                    unifiedFileInterface5 = (UnifiedFileInterface) utilitiesKt$copyDirectoryParallel$3$walk$1.L$5;
                    it2 = (Iterator) utilitiesKt$copyDirectoryParallel$3$walk$1.L$4;
                    unifiedFileInterface4 = (UnifiedFileInterface) utilitiesKt$copyDirectoryParallel$3$walk$1.L$3;
                    function23 = (Function2) utilitiesKt$copyDirectoryParallel$3$walk$1.L$2;
                    coroutineScope3 = (CoroutineScope) utilitiesKt$copyDirectoryParallel$3$walk$1.L$1;
                    semaphore3 = (Semaphore) utilitiesKt$copyDirectoryParallel$3$walk$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    try {
                        type = unifiedFileInterface5.getType();
                        if (type == null) {
                            type = ApiConstant.ALL_MEDIA_TYPE;
                        }
                        createFile = unifiedFileInterface4.createFile(type, str);
                        if (createFile != null) {
                            throw new Exceptions.IllegalStateException("Failed to create file: " + str, null, 2, null);
                        }
                        try {
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope3, Dispatchers.getIO(), null, new UtilitiesKt$copyDirectoryParallel$3$walk$2$1(function23, unifiedFileInterface5, createFile, semaphore4, null), 2, null);
                            unifiedFileInterface3 = unifiedFileInterface4;
                            function22 = function23;
                            semaphore2 = semaphore3;
                            it = it2;
                            utilitiesKt$copyDirectoryParallel$3$walk$12 = utilitiesKt$copyDirectoryParallel$3$walk$1;
                            coroutineScope2 = coroutineScope3;
                        } catch (Throwable th) {
                            th = th;
                            semaphore3 = semaphore4;
                            semaphore3.release();
                            throw th;
                        }
                        semaphore4 = semaphore3;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                while (it.hasNext()) {
                    UnifiedFileInterface unifiedFileInterface6 = (UnifiedFileInterface) it.next();
                    String fileName = unifiedFileInterface6.getFileName();
                    if (fileName == null) {
                        throw new Exceptions.IllegalArgument("Child has no file name", null, 2, null);
                    }
                    if (unifiedFileInterface6.isDirectory()) {
                        UnifiedFileInterface createDirectory = unifiedFileInterface3.createDirectory(fileName);
                        if (createDirectory == null) {
                            throw new Exceptions.IllegalStateException("Failed to create directory: " + fileName, null, 2, null);
                        }
                        utilitiesKt$copyDirectoryParallel$3$walk$12.L$0 = semaphore2;
                        utilitiesKt$copyDirectoryParallel$3$walk$12.L$1 = coroutineScope2;
                        utilitiesKt$copyDirectoryParallel$3$walk$12.L$2 = function22;
                        utilitiesKt$copyDirectoryParallel$3$walk$12.L$3 = unifiedFileInterface3;
                        utilitiesKt$copyDirectoryParallel$3$walk$12.L$4 = it;
                        utilitiesKt$copyDirectoryParallel$3$walk$12.L$5 = null;
                        utilitiesKt$copyDirectoryParallel$3$walk$12.L$6 = null;
                        utilitiesKt$copyDirectoryParallel$3$walk$12.label = 1;
                        Semaphore semaphore6 = semaphore2;
                        CoroutineScope coroutineScope5 = coroutineScope2;
                        Function2<? super UnifiedFileInterface, ? super UnifiedFileInterface, Unit> function25 = function22;
                        UtilitiesKt$copyDirectoryParallel$3$walk$1 utilitiesKt$copyDirectoryParallel$3$walk$13 = utilitiesKt$copyDirectoryParallel$3$walk$12;
                        if (invokeSuspend$walk(semaphore6, coroutineScope5, function25, unifiedFileInterface6, createDirectory, utilitiesKt$copyDirectoryParallel$3$walk$13) != coroutine_suspended) {
                            utilitiesKt$copyDirectoryParallel$3$walk$12 = utilitiesKt$copyDirectoryParallel$3$walk$13;
                            coroutineScope2 = coroutineScope5;
                            it = it;
                            function22 = function25;
                            semaphore2 = semaphore6;
                        }
                    } else {
                        semaphore3 = semaphore2;
                        function23 = function22;
                        CoroutineScope coroutineScope6 = coroutineScope2;
                        utilitiesKt$copyDirectoryParallel$3$walk$1 = utilitiesKt$copyDirectoryParallel$3$walk$12;
                        utilitiesKt$copyDirectoryParallel$3$walk$1.L$0 = semaphore3;
                        utilitiesKt$copyDirectoryParallel$3$walk$1.L$1 = coroutineScope6;
                        utilitiesKt$copyDirectoryParallel$3$walk$1.L$2 = function23;
                        utilitiesKt$copyDirectoryParallel$3$walk$1.L$3 = unifiedFileInterface3;
                        utilitiesKt$copyDirectoryParallel$3$walk$1.L$4 = it;
                        utilitiesKt$copyDirectoryParallel$3$walk$1.L$5 = unifiedFileInterface6;
                        utilitiesKt$copyDirectoryParallel$3$walk$1.L$6 = fileName;
                        utilitiesKt$copyDirectoryParallel$3$walk$1.label = 2;
                        if (semaphore3.acquire(utilitiesKt$copyDirectoryParallel$3$walk$1) != coroutine_suspended) {
                            coroutineScope3 = coroutineScope6;
                            str = fileName;
                            it2 = it;
                            unifiedFileInterface4 = unifiedFileInterface3;
                            unifiedFileInterface5 = unifiedFileInterface6;
                            type = unifiedFileInterface5.getType();
                            if (type == null) {
                            }
                            createFile = unifiedFileInterface4.createFile(type, str);
                            if (createFile != null) {
                            }
                        }
                    }
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        utilitiesKt$copyDirectoryParallel$3$walk$1 = new UtilitiesKt$copyDirectoryParallel$3$walk$1(continuation);
        Object obj2 = utilitiesKt$copyDirectoryParallel$3$walk$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = utilitiesKt$copyDirectoryParallel$3$walk$1.label;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }
}
