package com.unity3d.ads.core.data.datasource;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.mbridge.msdk.foundation.download.Command;
import com.unity3d.ads.core.data.model.CacheError;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CacheSource;
import com.unity3d.ads.core.data.model.CachedFile;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.GetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.HttpClientProvider;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.HttpResponseKt;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;
import kotlin.Result;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.time.DurationUnit;
import xsna.an8;
import xsna.b6l;
import xsna.d8f0;
import xsna.drm0;
import xsna.emb;
import xsna.eoo;
import xsna.ez70;
import xsna.j5g;
import xsna.jvo0;
import xsna.k830;
import xsna.mq9;
import xsna.nbr;
import xsna.p190;
import xsna.ro;
import xsna.s3q0;
import xsna.spj;
import xsna.t500;
import xsna.wzs;
import xsna.yvj;
import xsna.yzs;
import xsna.zno;

/* compiled from: AndroidRemoteCacheDataSource.kt */
@b6l(c = "com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource$getFileInternal$2", f = "AndroidRemoteCacheDataSource.kt", l = {TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER, 79, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidRemoteCacheDataSource$getFileInternal$2 extends SuspendLambda implements wzs<yvj, spj<? super CacheResult>, Object> {
    final /* synthetic */ File $cachePath;
    final /* synthetic */ String $fileName;
    final /* synthetic */ int $intervalMs;
    final /* synthetic */ yzs<Long, Long, spj<? super s3q0>, Object> $onProgress;
    final /* synthetic */ Integer $priority;
    final /* synthetic */ String $url;
    int I$0;
    long J$0;
    long J$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ AndroidRemoteCacheDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidRemoteCacheDataSource$getFileInternal$2(String str, AndroidRemoteCacheDataSource androidRemoteCacheDataSource, File file, String str2, Integer num, int i, yzs<? super Long, ? super Long, ? super spj<? super s3q0>, ? extends Object> yzsVar, spj<? super AndroidRemoteCacheDataSource$getFileInternal$2> spjVar) {
        super(2, spjVar);
        this.$url = str;
        this.this$0 = androidRemoteCacheDataSource;
        this.$cachePath = file;
        this.$fileName = str2;
        this.$priority = num;
        this.$intervalMs = i;
        this.$onProgress = yzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        AndroidRemoteCacheDataSource$getFileInternal$2 androidRemoteCacheDataSource$getFileInternal$2 = new AndroidRemoteCacheDataSource$getFileInternal$2(this.$url, this.this$0, this.$cachePath, this.$fileName, this.$priority, this.$intervalMs, this.$onProgress, spjVar);
        androidRemoteCacheDataSource$getFileInternal$2.L$0 = obj;
        return androidRemoteCacheDataSource$getFileInternal$2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x0432, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0433, code lost:
    
        r12 = r2;
        r11 = r3;
        r13 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0439, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x043d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0443, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0447, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x048a, code lost:
    
        r5 = r28;
        r28 = r2;
        r2 = r24;
        r24 = r3;
        r3 = r30;
        r30 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0496, code lost:
    
        r0 = xsna.s3q0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0499, code lost:
    
        xsna.ro.e(r3, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x049c, code lost:
    
        xsna.ro.e(r2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x049f, code lost:
    
        xsna.ro.e(r5, null);
        r0 = xsna.s3q0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x04a4, code lost:
    
        r3 = r24;
        r13 = r26;
        r2 = r28;
        r6 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x04ae, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x04af, code lost:
    
        r3 = r24;
        r13 = r26;
        r2 = r28;
        r6 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x04b9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x04ba, code lost:
    
        r2 = r0;
        r12 = r5;
        r4 = r24;
        r23 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x04c5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x04c6, code lost:
    
        r11 = r2;
        r12 = r5;
        r4 = r24;
        r6 = r26;
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x038c, code lost:
    
        r0 = new java.lang.Long(r26 + r2.element);
        r4 = new java.lang.Long(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0396, code lost:
    
        r45.L$0 = r8;
        r45.L$1 = r10;
        r45.L$2 = r6;
        r45.L$3 = r3;
        r45.L$4 = r2;
        r45.L$5 = r9;
        r45.L$6 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x03a4, code lost:
    
        r5 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x03a6, code lost:
    
        r45.L$7 = r5;
        r45.L$8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x03aa, code lost:
    
        r28 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x03ae, code lost:
    
        r45.L$9 = r0;
        r45.L$10 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x03b2, code lost:
    
        r2 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x03b6, code lost:
    
        r45.L$11 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x03b8, code lost:
    
        r24 = r3;
        r3 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x03bc, code lost:
    
        r45.L$12 = r3;
        r45.L$13 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x03c0, code lost:
    
        r30 = r6;
        r31 = r7;
        r6 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x03c6, code lost:
    
        r45.J$0 = r6;
        r45.J$1 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x03ca, code lost:
    
        r26 = r6;
        r6 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x03ce, code lost:
    
        r45.I$0 = r6;
        r45.label = 3;
        r0 = r11.invoke(r0, r4, r45);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x03d7, code lost:
    
        r4 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x03d9, code lost:
    
        if (r0 != r4) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x03dc, code lost:
    
        r5 = r0;
        r46 = r28;
        r28 = r5;
        r7 = r6;
        r0 = r11;
        r23 = r24;
        r6 = r30;
        r24 = r2;
        r11 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0429, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:173:0x048a A[EDGE_INSN: B:173:0x048a->B:174:0x048a BREAK  A[LOOP:0: B:14:0x0357->B:31:0x0473], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0525  */
    /* JADX WARN: Type inference failed for: r11v26, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r12v38, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r13v24, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v17, types: [xsna.an8] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x03dc -> B:10:0x03ec). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        int i;
        SessionRepository sessionRepository;
        CreateFile createFile;
        CreateFile createFile2;
        HttpClientProvider httpClientProvider;
        Object invoke;
        File file;
        HttpRequest httpRequest;
        yvj yvjVar;
        File file2;
        long j2;
        Object execute;
        yvj yvjVar2;
        HttpResponse httpResponse;
        String str;
        InputStream inputStream;
        long contentSize;
        Ref$IntRef ref$IntRef;
        Ref$LongRef ref$LongRef;
        long j3;
        String str2;
        HttpResponse httpResponse2;
        Throwable th;
        p190 b;
        Throwable th2;
        File file3;
        Ref$IntRef ref$IntRef2;
        long j4;
        d8f0 d8f0Var;
        CoroutineSingletons coroutineSingletons;
        InputStream inputStream2;
        long j5;
        int i2;
        p190 p190Var;
        HttpResponse httpResponse3;
        yzs<Long, Long, spj<? super s3q0>, Object> yzsVar;
        Ref$IntRef ref$IntRef3;
        Ref$IntRef ref$IntRef4;
        byte[] bArr;
        d8f0 d8f0Var2;
        String str3;
        Object failure;
        GetFileExtensionFromUrl getFileExtensionFromUrl;
        HttpResponse httpResponse4;
        InputStream inputStream3;
        p190 p190Var2;
        d8f0 d8f0Var3;
        Throwable th3;
        InputStream inputStream4;
        p190 p190Var3;
        d8f0 d8f0Var4;
        int read;
        d8f0 d8f0Var5;
        byte[] bArr2;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            j = 0;
            i = 0;
            kotlin.a.a(obj);
            yvj yvjVar3 = (yvj) this.L$0;
            String str4 = this.$url;
            if (str4 == null || str4.length() == 0) {
                return new CacheResult.Failure(CacheError.MALFORMED_URL, CacheSource.REMOTE, null, 4, null);
            }
            sessionRepository = this.this$0.sessionRepository;
            if (sessionRepository.getFeatureFlags().getEnsureCacheFolderExistences()) {
                if (this.$cachePath.exists()) {
                    if (!this.$cachePath.isDirectory()) {
                        return new CacheResult.Failure(CacheError.FILE_IO_ERROR, CacheSource.REMOTE, null, 4, null);
                    }
                } else if (!this.$cachePath.mkdirs() && !this.$cachePath.isDirectory()) {
                    return new CacheResult.Failure(CacheError.FILE_IO_ERROR, CacheSource.REMOTE, null, 4, null);
                }
            }
            createFile = this.this$0.createFile;
            File invoke2 = createFile.invoke(this.$cachePath, this.$fileName + ".part");
            if (!invoke2.exists()) {
                invoke2.createNewFile();
            }
            long length = invoke2.length();
            createFile2 = this.this$0.createFile;
            File invoke3 = createFile2.invoke(this.$cachePath, this.$fileName + ".etag");
            File file4 = invoke3.exists() ? invoke3 : null;
            String r = file4 != null ? nbr.r(file4, emb.b) : null;
            MapBuilder mapBuilder = new MapBuilder();
            if (length > 0) {
                mapBuilder.put(Command.HTTP_HEADER_RANGE, Collections.singletonList("bytes=" + length + '-'));
            }
            if (r != null) {
                mapBuilder.put("If-Range", Collections.singletonList("\"" + r + '\"'));
            }
            MapBuilder h = mapBuilder.h();
            Integer num = this.$priority;
            HttpRequest httpRequest2 = new HttpRequest(this.$url, null, null, null, h, null, null, null, null, 0, 0, 0, 0, false, null, null, num != null ? num.intValue() : Integer.MAX_VALUE, 65518, null);
            httpClientProvider = this.this$0.httpClientProvider;
            this.L$0 = yvjVar3;
            this.L$1 = invoke2;
            this.L$2 = invoke3;
            this.L$3 = httpRequest2;
            this.J$0 = length;
            this.label = 1;
            invoke = httpClientProvider.invoke(this);
            if (invoke != coroutineSingletons2) {
                file = invoke3;
                httpRequest = httpRequest2;
                yvjVar = yvjVar3;
                file2 = invoke2;
                j2 = length;
            }
            return coroutineSingletons2;
        }
        if (i3 == 1) {
            j = 0;
            i = 0;
            j2 = this.J$0;
            httpRequest = (HttpRequest) this.L$3;
            file = (File) this.L$2;
            File file5 = (File) this.L$1;
            yvj yvjVar4 = (yvj) this.L$0;
            kotlin.a.a(obj);
            yvjVar = yvjVar4;
            file2 = file5;
            invoke = obj;
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i4 = this.I$0;
                long j6 = this.J$1;
                j4 = this.J$0;
                ?? r9 = (an8) this.L$13;
                j = 0;
                ?? r11 = (Closeable) this.L$12;
                ?? r12 = (Closeable) this.L$11;
                Ref$IntRef ref$IntRef5 = (Ref$IntRef) this.L$10;
                byte[] bArr3 = (byte[]) this.L$9;
                InputStream inputStream5 = (InputStream) this.L$8;
                ?? r13 = (Closeable) this.L$7;
                yzs<Long, Long, spj<? super s3q0>, Object> yzsVar2 = (yzs) this.L$6;
                Ref$LongRef ref$LongRef2 = (Ref$LongRef) this.L$5;
                Ref$IntRef ref$IntRef6 = (Ref$IntRef) this.L$4;
                HttpResponse httpResponse5 = (HttpResponse) this.L$3;
                File file6 = (File) this.L$2;
                File file7 = (File) this.L$1;
                yvj yvjVar5 = (yvj) this.L$0;
                try {
                    kotlin.a.a(obj);
                    CoroutineSingletons coroutineSingletons3 = coroutineSingletons2;
                    yzs<Long, Long, spj<? super s3q0>, Object> yzsVar3 = yzsVar2;
                    file2 = file7;
                    inputStream2 = r13;
                    contentSize = j6;
                    d8f0Var = r9;
                    ref$LongRef = ref$LongRef2;
                    p190Var = r12;
                    inputStream = inputStream5;
                    Ref$IntRef ref$IntRef7 = ref$IntRef5;
                    Ref$IntRef ref$IntRef8 = ref$IntRef6;
                    yvjVar2 = yvjVar5;
                    str2 = "";
                    byte[] bArr4 = bArr3;
                    int i5 = i4;
                    HttpResponse httpResponse6 = httpResponse5;
                    file = file6;
                    j5 = j4;
                    d8f0 d8f0Var6 = r11;
                    try {
                        long b2 = k830.b();
                        zno.a aVar = zno.c;
                        yzs<Long, Long, spj<? super s3q0>, Object> yzsVar4 = yzsVar3;
                        CoroutineSingletons coroutineSingletons4 = coroutineSingletons3;
                        byte[] bArr5 = bArr4;
                        ref$LongRef.element = t500.b(b2, eoo.e(i5, DurationUnit.MILLISECONDS), DurationUnit.NANOSECONDS);
                        ref$IntRef3 = ref$IntRef8;
                        d8f0Var2 = d8f0Var6;
                        httpResponse3 = httpResponse6;
                        yzsVar = yzsVar4;
                        bArr = bArr5;
                        coroutineSingletons = coroutineSingletons4;
                        i = 0;
                        i2 = i5;
                        ref$IntRef4 = ref$IntRef7;
                        while (true) {
                            try {
                                read = inputStream.read(bArr);
                                ref$IntRef4.element = read;
                                d8f0Var5 = d8f0Var2;
                                if (read != -1) {
                                    break;
                                }
                                try {
                                    d8f0Var.a4(i, read, bArr);
                                    d8f0Var.flush();
                                    ref$IntRef3.element += ref$IntRef4.element;
                                    if (yzsVar != null) {
                                        byte[] bArr6 = bArr;
                                        try {
                                            long b3 = jvo0.a.b(ref$LongRef.element);
                                            zno.a aVar2 = zno.c;
                                            if (!(b3 < j)) {
                                                break;
                                            }
                                            bArr2 = bArr6;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            inputStream4 = inputStream2;
                                            ref$IntRef2 = ref$IntRef3;
                                            p190Var3 = p190Var;
                                            httpResponse4 = httpResponse3;
                                            d8f0Var4 = d8f0Var5;
                                        }
                                    } else {
                                        bArr2 = bArr;
                                    }
                                    d8f0Var2 = d8f0Var5;
                                    i2 = i2;
                                    httpResponse3 = httpResponse3;
                                    file = file;
                                    ref$IntRef4 = ref$IntRef4;
                                    coroutineSingletons = coroutineSingletons;
                                    i = 0;
                                    p190Var = p190Var;
                                    ref$IntRef3 = ref$IntRef3;
                                    inputStream2 = inputStream2;
                                    bArr = bArr2;
                                } catch (Throwable th5) {
                                    th = th5;
                                    inputStream4 = inputStream2;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                file3 = file;
                                inputStream4 = inputStream2;
                                ref$IntRef2 = ref$IntRef3;
                                p190Var3 = p190Var;
                                httpResponse4 = httpResponse3;
                                d8f0Var4 = d8f0Var2;
                            }
                        }
                        ref$IntRef2 = ref$IntRef3;
                        p190Var3 = p190Var;
                        httpResponse4 = httpResponse3;
                        d8f0Var4 = d8f0Var5;
                        file3 = file;
                        p190 p190Var4 = p190Var3;
                        d8f0 d8f0Var7 = d8f0Var4;
                        InputStream inputStream6 = inputStream4;
                        j4 = j5;
                        th3 = th;
                        d8f0Var3 = d8f0Var7;
                        p190Var2 = p190Var4;
                        inputStream3 = inputStream6;
                    } catch (Throwable th7) {
                        th3 = th7;
                        file3 = file;
                        p190Var2 = p190Var;
                        j4 = j5;
                        inputStream3 = inputStream2;
                        ref$IntRef2 = ref$IntRef8;
                        httpResponse4 = httpResponse6;
                        d8f0Var3 = d8f0Var6;
                    }
                } catch (Throwable th8) {
                    th3 = th8;
                    httpResponse4 = httpResponse5;
                    file3 = file6;
                    file2 = file7;
                    ref$IntRef2 = ref$IntRef6;
                    str2 = "";
                    d8f0Var3 = r11;
                    p190Var2 = r12;
                    inputStream3 = r13;
                }
                try {
                    throw th3;
                } catch (Throwable th9) {
                    try {
                        ro.e(d8f0Var3, th3);
                        throw th9;
                    } catch (Throwable th10) {
                        th2 = th10;
                        b = p190Var2;
                        inputStream = inputStream3;
                        httpResponse2 = httpResponse4;
                        try {
                            throw th2;
                        } catch (Throwable th11) {
                            try {
                                ro.e(b, th2);
                                throw th11;
                            } catch (Throwable th12) {
                                th = th12;
                                j3 = j4;
                                ref$IntRef = ref$IntRef2;
                                file = file3;
                                try {
                                    throw th;
                                } catch (Throwable th13) {
                                    try {
                                        ro.e(inputStream, th);
                                        throw th13;
                                    } catch (Throwable th14) {
                                        Throwable th15 = th14;
                                        HttpResponse httpResponse7 = httpResponse2;
                                        Ref$IntRef ref$IntRef9 = ref$IntRef;
                                        long j7 = j3;
                                        Object obj2 = new Result.Failure(th15);
                                        Throwable a = Result.a(obj2);
                                        if (a == null) {
                                            return new CacheResult.Failure(CacheError.NETWORK_ERROR, CacheSource.REMOTE, a);
                                        }
                                        if (httpResponse7.getStatusCode() != 206 ? httpResponse7.getContentSize() == -1 ? file2.length() <= j : file2.length() != httpResponse7.getContentSize() : file2.length() != httpResponse7.getContentSize() + j7) {
                                            return new CacheResult.Failure(CacheError.NETWORK_ERROR, CacheSource.REMOTE, null, 4, null);
                                        }
                                        File file8 = new File(this.$cachePath, this.$fileName);
                                        try {
                                            if (file8.exists() && !file8.delete()) {
                                                throw new IllegalStateException("Final file exists and could not be deleted before overwriting");
                                            }
                                        } catch (Throwable th16) {
                                            failure = new Result.Failure(th16);
                                        }
                                        if (!file2.renameTo(file8)) {
                                            throw new IllegalStateException("Could not rename temporary file to final file");
                                        }
                                        if (file.exists() && !file.delete()) {
                                            throw new IllegalStateException("Could not delete Etag file after successful download");
                                        }
                                        failure = s3q0.a;
                                        Throwable a2 = Result.a(failure);
                                        if (a2 != null) {
                                            return new CacheResult.Failure(CacheError.FILE_STATE_WRONG, CacheSource.REMOTE, a2);
                                        }
                                        String str5 = this.$url;
                                        String str6 = this.$fileName;
                                        getFileExtensionFromUrl = this.this$0.getFileExtensionFromUrl;
                                        String invoke4 = getFileExtensionFromUrl.invoke(this.$url);
                                        String str7 = invoke4 == null ? str2 : invoke4;
                                        long j8 = ref$IntRef9.element;
                                        String protocol = httpResponse7.getProtocol();
                                        Integer num2 = this.$priority;
                                        return new CacheResult.Success(new CachedFile(str5, str6, file8, str7, j8, protocol, num2 != null ? num2.intValue() : Integer.MAX_VALUE), CacheSource.REMOTE);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            j = 0;
            i = 0;
            j2 = this.J$0;
            File file9 = (File) this.L$2;
            File file10 = (File) this.L$1;
            yvjVar2 = (yvj) this.L$0;
            kotlin.a.a(obj);
            file2 = file10;
            file = file9;
            execute = obj;
            httpResponse = (HttpResponse) execute;
            if (HttpResponseKt.isSuccessful(httpResponse)) {
                return new CacheResult.Failure(CacheError.NETWORK_ERROR, CacheSource.REMOTE, new Exception("Request failed with status code " + httpResponse.getStatusCode()));
            }
            List<String> list = httpResponse.getHeaders().get(Command.HTTP_HEADER_ETAG);
            if (list != null && (str3 = (String) j5g.a0(list)) != null) {
                char[] cArr = new char[1];
                cArr[i] = '\"';
                String q0 = drm0.q0(str3, cArr);
                if (q0 != null) {
                    str = q0;
                    if (str.length() <= 0) {
                        str = null;
                    }
                    if (str != null) {
                        nbr.w(file, str, emb.b);
                        s3q0 s3q0Var = s3q0.a;
                    }
                    if (j2 > j && httpResponse.getStatusCode() == 200) {
                        file2.delete();
                        file2.createNewFile();
                        j2 = j;
                    }
                    Object body = httpResponse.getBody();
                    inputStream = !(body instanceof InputStream) ? (InputStream) body : null;
                    if (inputStream != null) {
                        return new CacheResult.Failure(CacheError.NETWORK_ERROR, CacheSource.REMOTE, new Exception("Response body is not an InputStream"));
                    }
                    contentSize = (httpResponse.getStatusCode() != 206 || httpResponse.getContentSize() <= j) ? httpResponse.getContentSize() : httpResponse.getContentSize() + j2;
                    ref$IntRef = new Ref$IntRef();
                    ref$LongRef = new Ref$LongRef();
                    j3 = j2;
                    long b4 = k830.b();
                    zno.a aVar3 = zno.c;
                    str2 = "";
                    ref$LongRef.element = t500.b(b4, eoo.e(this.$intervalMs, DurationUnit.MILLISECONDS), DurationUnit.NANOSECONDS);
                    yzs<Long, Long, spj<? super s3q0>, Object> yzsVar5 = this.$onProgress;
                    int i6 = this.$intervalMs;
                    try {
                        byte[] bArr7 = new byte[8192];
                        Ref$IntRef ref$IntRef10 = new Ref$IntRef();
                        Logger logger = ez70.a;
                        b = mq9.b(new FileOutputStream(file2, true));
                        try {
                            d8f0Var = new d8f0(b);
                            coroutineSingletons = coroutineSingletons2;
                            inputStream2 = inputStream;
                            j5 = j3;
                            i2 = i6;
                            p190Var = b;
                            httpResponse3 = httpResponse;
                            yzsVar = yzsVar5;
                            ref$IntRef3 = ref$IntRef;
                            ref$IntRef4 = ref$IntRef10;
                            bArr = bArr7;
                            d8f0Var2 = d8f0Var;
                            while (true) {
                                read = inputStream.read(bArr);
                                ref$IntRef4.element = read;
                                d8f0Var5 = d8f0Var2;
                                if (read != -1) {
                                }
                                d8f0Var2 = d8f0Var5;
                                i2 = i2;
                                httpResponse3 = httpResponse3;
                                file = file;
                                ref$IntRef4 = ref$IntRef4;
                                coroutineSingletons = coroutineSingletons;
                                i = 0;
                                p190Var = p190Var;
                                ref$IntRef3 = ref$IntRef3;
                                inputStream2 = inputStream2;
                                bArr = bArr2;
                            }
                            ref$IntRef2 = ref$IntRef3;
                            p190Var3 = p190Var;
                            httpResponse4 = httpResponse3;
                            d8f0Var4 = d8f0Var5;
                            file3 = file;
                            p190 p190Var42 = p190Var3;
                            d8f0 d8f0Var72 = d8f0Var4;
                            InputStream inputStream62 = inputStream4;
                            j4 = j5;
                            th3 = th;
                            d8f0Var3 = d8f0Var72;
                            p190Var2 = p190Var42;
                            inputStream3 = inputStream62;
                        } catch (Throwable th17) {
                            httpResponse2 = httpResponse;
                            th2 = th17;
                            file3 = file;
                            ref$IntRef2 = ref$IntRef;
                            j4 = j3;
                            throw th2;
                        }
                    } catch (Throwable th18) {
                        httpResponse2 = httpResponse;
                        th = th18;
                        throw th;
                    }
                    throw th3;
                }
            }
            str = "";
            if (str.length() <= 0) {
            }
            if (str != null) {
            }
            if (j2 > j) {
                file2.delete();
                file2.createNewFile();
                j2 = j;
            }
            Object body2 = httpResponse.getBody();
            if (!(body2 instanceof InputStream)) {
            }
            if (inputStream != null) {
            }
        }
        this.L$0 = yvjVar;
        this.L$1 = file2;
        this.L$2 = file;
        this.L$3 = null;
        this.J$0 = j2;
        this.label = 2;
        execute = ((HttpClient) invoke).execute(httpRequest, true, this);
        if (execute != coroutineSingletons2) {
            yvjVar2 = yvjVar;
            httpResponse = (HttpResponse) execute;
            if (HttpResponseKt.isSuccessful(httpResponse)) {
            }
        }
        return coroutineSingletons2;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super CacheResult> spjVar) {
        return ((AndroidRemoteCacheDataSource$getFileInternal$2) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
