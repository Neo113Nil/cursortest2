package expo.modules.filesystem;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Dispatchers;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jacoco.core.runtime.AgentOptions;

/* compiled from: FileSystemDownload.kt */
@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0087\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2K\u0010\r\u001aG\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u000eH\u0086@¢\u0006\u0002\u0010\u0016\u001a(\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0082@¢\u0006\u0002\u0010\u001b\u001a\u008b\u0001\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\n2K\u0010\r\u001aG\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u000e2\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00120$H\u0080@¢\u0006\u0002\u0010%\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"sharedHttpClient", "Lokhttp3/OkHttpClient;", "downloadFileWithStore", "Ljava/net/URI;", "url", "to", "Lexpo/modules/filesystem/FileSystemPath;", "options", "Lexpo/modules/filesystem/DownloadOptions;", "downloadUUID", "", "downloadStore", "Lexpo/modules/filesystem/DownloadTaskStore;", "emitProgress", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "uuid", "", "bytesWritten", "totalBytes", "", "(Ljava/net/URI;Lexpo/modules/filesystem/FileSystemPath;Lexpo/modules/filesystem/DownloadOptions;Ljava/lang/String;Lexpo/modules/filesystem/DownloadTaskStore;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeRequest", "Lokhttp3/Response;", "request", "Lokhttp3/Request;", "(Lokhttp3/Request;Ljava/lang/String;Lexpo/modules/filesystem/DownloadTaskStore;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PROGRESS_THROTTLE_MS", "streamWithProgress", MetricTracker.Object.INPUT, "Ljava/io/InputStream;", AgentOptions.OUTPUT, "Ljava/io/FileOutputStream;", "contentLength", "currentTimeProvider", "Lkotlin/Function0;", "(Ljava/io/InputStream;Ljava/io/FileOutputStream;JLjava/lang/String;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expo-file-system_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FileSystemDownloadKt {
    private static final long PROGRESS_THROTTLE_MS = 100;
    private static final OkHttpClient sharedHttpClient = new OkHttpClient();

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    public static final java.lang.Object downloadFileWithStore(java.net.URI r19, expo.modules.filesystem.FileSystemPath r20, expo.modules.filesystem.DownloadOptions r21, java.lang.String r22, expo.modules.filesystem.DownloadTaskStore r23, kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.Long, ? super java.lang.Long, kotlin.Unit> r24, kotlin.coroutines.Continuation<? super java.net.URI> r25) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.filesystem.FileSystemDownloadKt.downloadFileWithStore(java.net.URI, expo.modules.filesystem.FileSystemPath, expo.modules.filesystem.DownloadOptions, java.lang.String, expo.modules.filesystem.DownloadTaskStore, kotlin.jvm.functions.Function3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object streamWithProgress$default(InputStream inputStream, FileOutputStream fileOutputStream, long j, String str, Function3 function3, Function0 function0, Continuation continuation, int i, Object obj) {
        if ((i & 32) != 0) {
            function0 = FileSystemDownloadKt$streamWithProgress$2.INSTANCE;
        }
        return streamWithProgress(inputStream, fileOutputStream, j, str, function3, function0, continuation);
    }

    public static final Object streamWithProgress(InputStream inputStream, FileOutputStream fileOutputStream, long j, String str, Function3<? super String, ? super Long, ? super Long, Unit> function3, Function0<Long> function0, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new FileSystemDownloadKt$streamWithProgress$3(inputStream, fileOutputStream, function0, function3, str, j, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object executeRequest(Request request, final String str, final DownloadTaskStore downloadTaskStore, Continuation<? super Response> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        final Call newCall = sharedHttpClient.newCall(request);
        if (str != null) {
            downloadTaskStore.store(newCall, str);
        }
        cancellableContinuationImpl2.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: expo.modules.filesystem.FileSystemDownloadKt$executeRequest$2$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                Call.this.cancel();
                String str2 = str;
                if (str2 != null) {
                    downloadTaskStore.remove(str2);
                }
            }
        });
        newCall.enqueue(new Callback() { // from class: expo.modules.filesystem.FileSystemDownloadKt$executeRequest$2$2
            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                CancellableContinuation<Response> cancellableContinuation = cancellableContinuationImpl2;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m13470constructorimpl(response));
            }

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException e) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(e, "e");
                if (cancellableContinuationImpl2.isCancelled()) {
                    return;
                }
                CancellableContinuation<Response> cancellableContinuation = cancellableContinuationImpl2;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m13470constructorimpl(ResultKt.createFailure(e)));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
