package com.unity3d.ads.core.data.datasource;

import com.google.common.net.HttpHeaders;
import com.unity3d.ads.core.data.model.CacheError;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CacheSource;
import com.unity3d.ads.core.data.model.CachedFile;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.GetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.HttpClientProvider;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.HttpResponseKt;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import okio.BufferedSink;
import okio.Okio;

/* compiled from: AndroidRemoteCacheDataSource.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/model/CacheResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource$getFile$2", f = "AndroidRemoteCacheDataSource.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1}, l = {51, 52}, m = "invokeSuspend", n = {"$this$withContext", "file", "etagFile", "request", "fileSizeBefore", "$this$withContext", "file", "etagFile", "fileSizeBefore"}, s = {"L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "L$1", "L$2", "J$0"})
/* loaded from: classes8.dex */
final class AndroidRemoteCacheDataSource$getFile$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CacheResult>, Object> {
    final /* synthetic */ File $cachePath;
    final /* synthetic */ String $fileName;
    final /* synthetic */ Integer $priority;
    final /* synthetic */ String $url;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ AndroidRemoteCacheDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidRemoteCacheDataSource$getFile$2(String str, AndroidRemoteCacheDataSource androidRemoteCacheDataSource, File file, String str2, Integer num, Continuation<? super AndroidRemoteCacheDataSource$getFile$2> continuation) {
        super(2, continuation);
        this.$url = str;
        this.this$0 = androidRemoteCacheDataSource;
        this.$cachePath = file;
        this.$fileName = str2;
        this.$priority = num;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AndroidRemoteCacheDataSource$getFile$2 androidRemoteCacheDataSource$getFile$2 = new AndroidRemoteCacheDataSource$getFile$2(this.$url, this.this$0, this.$cachePath, this.$fileName, this.$priority, continuation);
        androidRemoteCacheDataSource$getFile$2.L$0 = obj;
        return androidRemoteCacheDataSource$getFile$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CacheResult> continuation) {
        return ((AndroidRemoteCacheDataSource$getFile$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x0182, code lost:
    
        if (r2 == r0) goto L41;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        CreateFile createFile;
        long length;
        CreateFile createFile2;
        File invoke;
        long j;
        HttpClientProvider httpClientProvider;
        Object invoke2;
        File file;
        HttpRequest httpRequest;
        Object execute;
        String str;
        Object m11180constructorimpl;
        Object m11180constructorimpl2;
        GetFileExtensionFromUrl getFileExtensionFromUrl;
        BufferedSink bufferedSink;
        String str2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            String str3 = this.$url;
            if (str3 != null && str3.length() != 0) {
                createFile = this.this$0.createFile;
                File invoke3 = createFile.invoke(this.$cachePath, this.$fileName + ".part");
                if (!invoke3.exists()) {
                    invoke3.createNewFile();
                }
                length = invoke3.length();
                createFile2 = this.this$0.createFile;
                invoke = createFile2.invoke(this.$cachePath, this.$fileName + ".etag");
                File file2 = invoke.exists() ? invoke : null;
                String readText$default = file2 != null ? FilesKt.readText$default(file2, null, 1, null) : null;
                Map createMapBuilder = MapsKt.createMapBuilder();
                if (length > 0) {
                    j = 0;
                    createMapBuilder.put(HttpHeaders.RANGE, CollectionsKt.listOf("bytes=" + length + '-'));
                } else {
                    j = 0;
                }
                if (readText$default != null) {
                    createMapBuilder.put(HttpHeaders.IF_RANGE, CollectionsKt.listOf("\"" + readText$default + '\"'));
                }
                Map build = MapsKt.build(createMapBuilder);
                Integer num = this.$priority;
                HttpRequest httpRequest2 = new HttpRequest(this.$url, null, null, null, build, null, null, null, null, 0, 0, 0, 0, false, null, null, num != null ? num.intValue() : Integer.MAX_VALUE, 65518, null);
                httpClientProvider = this.this$0.httpClientProvider;
                this.L$0 = coroutineScope;
                this.L$1 = invoke3;
                this.L$2 = invoke;
                this.L$3 = httpRequest2;
                this.J$0 = length;
                this.label = 1;
                invoke2 = httpClientProvider.invoke(this);
                if (invoke2 != coroutine_suspended) {
                    file = invoke3;
                    httpRequest = httpRequest2;
                }
                return coroutine_suspended;
            }
            return new CacheResult.Failure(CacheError.MALFORMED_URL, CacheSource.REMOTE, null, 4, null);
        }
        if (i == 1) {
            length = this.J$0;
            httpRequest = (HttpRequest) this.L$3;
            File file3 = (File) this.L$2;
            file = (File) this.L$1;
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            j = 0;
            invoke = file3;
            invoke2 = obj;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            length = this.J$0;
            File file4 = (File) this.L$2;
            File file5 = (File) this.L$1;
            ResultKt.throwOnFailure(obj);
            invoke = file4;
            file = file5;
            j = 0;
            execute = obj;
            HttpResponse httpResponse = (HttpResponse) execute;
            if (!HttpResponseKt.isSuccessful(httpResponse)) {
                return new CacheResult.Failure(CacheError.NETWORK_ERROR, CacheSource.REMOTE, new Exception("Request failed with status code " + httpResponse.getStatusCode()));
            }
            List<String> list = httpResponse.getHeaders().get(HttpHeaders.ETAG);
            if (list == null || (str2 = (String) CollectionsKt.firstOrNull((List) list)) == null || (str = StringsKt.trim(str2, '\"')) == null) {
                str = "";
            }
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                FilesKt.writeText$default(invoke, str, null, 2, null);
            }
            if (length > j && httpResponse.getStatusCode() == 200) {
                file.delete();
                file.createNewFile();
            }
            Object body = httpResponse.getBody();
            InputStream inputStream = body instanceof InputStream ? (InputStream) body : null;
            if (inputStream == null) {
                return new CacheResult.Failure(CacheError.NETWORK_ERROR, CacheSource.REMOTE, new Exception("Response body is not an InputStream"));
            }
            Ref.IntRef intRef = new Ref.IntRef();
            try {
                Result.Companion companion = Result.INSTANCE;
                bufferedSink = inputStream;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
            }
            try {
                InputStream inputStream2 = bufferedSink;
                byte[] bArr = new byte[8192];
                bufferedSink = Okio.appendingSink(file);
                try {
                    bufferedSink = Okio.buffer(bufferedSink);
                    try {
                        BufferedSink bufferedSink2 = bufferedSink;
                        while (true) {
                            int read = inputStream2.read(bArr);
                            InputStream inputStream3 = inputStream2;
                            if (read == -1) {
                                break;
                            }
                            bufferedSink2.write(bArr, 0, read);
                            bufferedSink2.flush();
                            intRef.element += read;
                            inputStream2 = inputStream3;
                        }
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(bufferedSink, null);
                        Unit unit2 = Unit.INSTANCE;
                        CloseableKt.closeFinally(bufferedSink, null);
                        Unit unit3 = Unit.INSTANCE;
                        CloseableKt.closeFinally(bufferedSink, null);
                        m11180constructorimpl = Result.m11180constructorimpl(Unit.INSTANCE);
                        Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m11180constructorimpl);
                        if (m11183exceptionOrNullimpl != null) {
                            return new CacheResult.Failure(CacheError.NETWORK_ERROR, CacheSource.REMOTE, m11183exceptionOrNullimpl);
                        }
                        if (httpResponse.getStatusCode() != 206 ? httpResponse.getContentSize() == -1 ? file.length() <= j : file.length() != httpResponse.getContentSize() : file.length() != httpResponse.getContentSize() + length) {
                            return new CacheResult.Failure(CacheError.NETWORK_ERROR, CacheSource.REMOTE, null, 4, null);
                        }
                        File file6 = new File(this.$cachePath, this.$fileName);
                        try {
                            Result.Companion companion3 = Result.INSTANCE;
                            if (file6.exists() && !file6.delete()) {
                                throw new IllegalStateException("Final file exists and could not be deleted before overwriting".toString());
                            }
                        } catch (Throwable th2) {
                            Result.Companion companion4 = Result.INSTANCE;
                            m11180constructorimpl2 = Result.m11180constructorimpl(ResultKt.createFailure(th2));
                        }
                        if (!file.renameTo(file6)) {
                            throw new IllegalStateException("Could not rename temporary file to final file".toString());
                        }
                        if (invoke.exists() && !invoke.delete()) {
                            throw new IllegalStateException("Could not delete Etag file after successful download".toString());
                        }
                        m11180constructorimpl2 = Result.m11180constructorimpl(Unit.INSTANCE);
                        Throwable m11183exceptionOrNullimpl2 = Result.m11183exceptionOrNullimpl(m11180constructorimpl2);
                        if (m11183exceptionOrNullimpl2 != null) {
                            return new CacheResult.Failure(CacheError.FILE_STATE_WRONG, CacheSource.REMOTE, m11183exceptionOrNullimpl2);
                        }
                        String str4 = this.$url;
                        String str5 = this.$fileName;
                        getFileExtensionFromUrl = this.this$0.getFileExtensionFromUrl;
                        String invoke4 = getFileExtensionFromUrl.invoke(this.$url);
                        String str6 = invoke4 == null ? "" : invoke4;
                        long j2 = intRef.element;
                        String protocol = httpResponse.getProtocol();
                        Integer num2 = this.$priority;
                        return new CacheResult.Success(new CachedFile(str4, str5, file6, str6, j2, protocol, num2 != null ? num2.intValue() : Integer.MAX_VALUE), CacheSource.REMOTE);
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        }
        this.L$0 = coroutineScope;
        this.L$1 = file;
        this.L$2 = invoke;
        this.L$3 = null;
        this.J$0 = length;
        this.label = 2;
        execute = ((HttpClient) invoke2).execute(httpRequest, true, this);
    }
}
