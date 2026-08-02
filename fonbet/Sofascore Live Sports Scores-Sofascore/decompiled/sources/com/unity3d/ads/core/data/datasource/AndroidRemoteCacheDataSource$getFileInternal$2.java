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
import defpackage.a70;
import defpackage.b28;
import defpackage.be5;
import defpackage.ct8;
import defpackage.dsf;
import defpackage.esf;
import defpackage.haa;
import defpackage.hoi;
import defpackage.il4;
import defpackage.k62;
import defpackage.kof;
import defpackage.ku3;
import defpackage.ltb;
import defpackage.lu3;
import defpackage.n4o;
import defpackage.p2g;
import defpackage.pij;
import defpackage.rq3;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.wd5;
import defpackage.whj;
import defpackage.wk0;
import defpackage.wkn;
import defpackage.xd5;
import defpackage.xhj;
import defpackage.xuc;
import defpackage.y6a;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "Lcom/unity3d/ads/core/data/model/CacheResult;", "<anonymous>", "(Lku3;)Lcom/unity3d/ads/core/data/model/CacheResult;"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource$getFileInternal$2", f = "AndroidRemoteCacheDataSource.kt", l = {TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER, 79, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class AndroidRemoteCacheDataSource$getFileInternal$2 extends hoi implements Function2<ku3, rq3<? super CacheResult>, Object> {
    final /* synthetic */ File $cachePath;
    final /* synthetic */ String $fileName;
    final /* synthetic */ int $intervalMs;
    final /* synthetic */ ct8 $onProgress;
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
    public AndroidRemoteCacheDataSource$getFileInternal$2(String str, AndroidRemoteCacheDataSource androidRemoteCacheDataSource, File file, String str2, Integer num, int i, ct8 ct8Var, rq3<? super AndroidRemoteCacheDataSource$getFileInternal$2> rq3Var) {
        super(2, rq3Var);
        this.$url = str;
        this.this$0 = androidRemoteCacheDataSource;
        this.$cachePath = file;
        this.$fileName = str2;
        this.$priority = num;
        this.$intervalMs = i;
        this.$onProgress = ct8Var;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        AndroidRemoteCacheDataSource$getFileInternal$2 androidRemoteCacheDataSource$getFileInternal$2 = new AndroidRemoteCacheDataSource$getFileInternal$2(this.$url, this.this$0, this.$cachePath, this.$fileName, this.$priority, this.$intervalMs, this.$onProgress, rq3Var);
        androidRemoteCacheDataSource$getFileInternal$2.L$0 = obj;
        return androidRemoteCacheDataSource$getFileInternal$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super CacheResult> rq3Var) {
        return ((AndroidRemoteCacheDataSource$getFileInternal$2) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x045c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x045d, code lost:
    
        r27 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0460, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0461, code lost:
    
        r31 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0464, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0465, code lost:
    
        r29 = r3;
        r31 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x04ae, code lost:
    
        r30 = r2;
        r31 = r6;
        r2 = r29;
        r29 = r3;
        r3 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x04b8, code lost:
    
        r0 = kotlin.Unit.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x04bb, code lost:
    
        defpackage.n4o.x(r3, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x04be, code lost:
    
        defpackage.n4o.x(r2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x04c1, code lost:
    
        defpackage.n4o.x(r13, null);
        r0 = kotlin.Unit.a;
        r2 = defpackage.w2g.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x04c8, code lost:
    
        r13 = r27;
        r3 = r29;
        r2 = r30;
        r6 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x04d2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x04d3, code lost:
    
        r2 = r27;
        r4 = r29;
        r7 = r30;
        r6 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x04dd, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x04de, code lost:
    
        r2 = r0;
        r12 = r13;
        r23 = r27;
        r4 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x04e9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x04ea, code lost:
    
        r15 = r2;
        r12 = r13;
        r6 = r27;
        r4 = r29;
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x03a7, code lost:
    
        r4 = new java.lang.Long(r27 + r2.a);
        r11 = new java.lang.Long(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x03b1, code lost:
    
        r45.L$0 = r8;
        r45.L$1 = r10;
        r45.L$2 = r6;
        r45.L$3 = r3;
        r45.L$4 = r2;
        r45.L$5 = r9;
        r45.L$6 = r0;
        r45.L$7 = r13;
        r12 = r30;
        r45.L$8 = r12;
        r45.L$9 = r5;
        r45.L$10 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x03c9, code lost:
    
        r30 = r2;
        r2 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x03cd, code lost:
    
        r45.L$11 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x03cf, code lost:
    
        r29 = r3;
        r3 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x03d3, code lost:
    
        r45.L$12 = r3;
        r24 = r5;
        r45.L$13 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x03db, code lost:
    
        r31 = r6;
        r5 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x03e1, code lost:
    
        r45.J$0 = r5;
        r45.J$1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x03e5, code lost:
    
        r27 = r5;
        r5 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x03e9, code lost:
    
        r45.I$0 = r5;
        r45.label = 3;
        r4 = r0.invoke(r4, r11, r45);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x03f2, code lost:
    
        r11 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x03f4, code lost:
    
        if (r4 != r11) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x03f7, code lost:
    
        r4 = r4;
        r6 = r5;
        r5 = r24;
        r24 = r3;
        r3 = r29;
        r29 = r2;
        r2 = r30;
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0455, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04ae A[EDGE_INSN: B:158:0x04ae->B:159:0x04ae BREAK  A[LOOP:0: B:17:0x0372->B:31:0x0498], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x037d A[Catch: all -> 0x046c, TryCatch #8 {all -> 0x046c, blocks: (B:18:0x0372, B:20:0x037d, B:22:0x038e, B:33:0x03a0, B:36:0x03b1), top: B:17:0x0372 }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0543  */
    /* JADX WARN: Type inference failed for: r10v20, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v31, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r13v19, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v16, types: [k62] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x03f7 -> B:10:0x0404). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        int i;
        Object obj2;
        SessionRepository sessionRepository;
        CreateFile createFile;
        CreateFile createFile2;
        HttpClientProvider httpClientProvider;
        Object invoke;
        File file;
        HttpRequest httpRequest;
        ku3 ku3Var;
        File file2;
        long j2;
        Object execute;
        ku3 ku3Var2;
        HttpResponse httpResponse;
        String str;
        InputStream inputStream;
        dsf dsfVar;
        esf esfVar;
        long j3;
        String str2;
        HttpResponse httpResponse2;
        Throwable th;
        wk0 wk0Var;
        Throwable th2;
        File file3;
        dsf dsfVar2;
        long j4;
        lu3 lu3Var;
        ct8 ct8Var;
        kof kofVar;
        wk0 wk0Var2;
        long j5;
        kof kofVar2;
        int i2;
        dsf dsfVar3;
        long j6;
        HttpResponse httpResponse3;
        dsf dsfVar4;
        InputStream inputStream2;
        byte[] bArr;
        String str3;
        Throwable a;
        Object u2gVar;
        GetFileExtensionFromUrl getFileExtensionFromUrl;
        HttpResponse httpResponse4;
        InputStream inputStream3;
        wk0 wk0Var3;
        kof kofVar3;
        Throwable th3;
        wk0 wk0Var4;
        int read;
        kof kofVar4;
        dsf dsfVar5;
        HttpResponse httpResponse5;
        lu3 lu3Var2 = lu3.a;
        int i3 = this.label;
        if (i3 == 0) {
            j = 0;
            i = 0;
            obj2 = null;
            y6a.M(obj);
            ku3 ku3Var3 = (ku3) this.L$0;
            String str4 = this.$url;
            if (str4 == null || str4.length() == 0) {
                return new CacheResult.Failure(CacheError.MALFORMED_URL, CacheSource.REMOTE, null, 4, null);
            }
            sessionRepository = this.this$0.sessionRepository;
            if (sessionRepository.getFeatureFlags().getEnsureCacheFolderExistences()) {
                boolean exists = this.$cachePath.exists();
                File file4 = this.$cachePath;
                if (exists) {
                    if (!file4.isDirectory()) {
                        return new CacheResult.Failure(CacheError.FILE_IO_ERROR, CacheSource.REMOTE, null, 4, null);
                    }
                } else if (!file4.mkdirs() && !this.$cachePath.isDirectory()) {
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
            File file5 = invoke3.exists() ? invoke3 : null;
            String a2 = file5 != null ? b28.a(file5) : null;
            ltb ltbVar = new ltb();
            if (length > 0) {
                ltbVar.put(Command.HTTP_HEADER_RANGE, kotlin.collections.a.c("bytes=" + length + '-'));
            }
            if (a2 != null) {
                ltbVar.put("If-Range", kotlin.collections.a.c("\"" + a2 + '\"'));
            }
            ltb d = ltbVar.d();
            Integer num = this.$priority;
            HttpRequest httpRequest2 = new HttpRequest(this.$url, null, null, null, d, null, null, null, null, 0, 0, 0, 0, false, null, null, num != null ? num.intValue() : Integer.MAX_VALUE, 65518, null);
            httpClientProvider = this.this$0.httpClientProvider;
            this.L$0 = ku3Var3;
            this.L$1 = invoke2;
            this.L$2 = invoke3;
            this.L$3 = httpRequest2;
            this.J$0 = length;
            this.label = 1;
            invoke = httpClientProvider.invoke(this);
            if (invoke != lu3Var2) {
                file = invoke3;
                httpRequest = httpRequest2;
                ku3Var = ku3Var3;
                file2 = invoke2;
                j2 = length;
            }
            return lu3Var2;
        }
        if (i3 == 1) {
            j = 0;
            i = 0;
            obj2 = null;
            j2 = this.J$0;
            httpRequest = (HttpRequest) this.L$3;
            file = (File) this.L$2;
            File file6 = (File) this.L$1;
            ku3 ku3Var4 = (ku3) this.L$0;
            y6a.M(obj);
            ku3Var = ku3Var4;
            file2 = file6;
            invoke = obj;
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i4 = this.I$0;
                j6 = this.J$1;
                j4 = this.J$0;
                ?? r9 = (k62) this.L$13;
                j = 0;
                ?? r10 = (Closeable) this.L$12;
                ?? r11 = (Closeable) this.L$11;
                dsf dsfVar6 = (dsf) this.L$10;
                byte[] bArr2 = (byte[]) this.L$9;
                InputStream inputStream4 = (InputStream) this.L$8;
                ?? r13 = (Closeable) this.L$7;
                ct8 ct8Var2 = (ct8) this.L$6;
                esf esfVar2 = (esf) this.L$5;
                dsf dsfVar7 = (dsf) this.L$4;
                HttpResponse httpResponse6 = (HttpResponse) this.L$3;
                File file7 = (File) this.L$2;
                File file8 = (File) this.L$1;
                ku3 ku3Var5 = (ku3) this.L$0;
                try {
                    y6a.M(obj);
                    wk0Var2 = r11;
                    file3 = file7;
                    lu3 lu3Var3 = lu3Var2;
                    ct8Var = ct8Var2;
                    inputStream = inputStream4;
                    kof kofVar5 = r9;
                    esfVar = esfVar2;
                    kofVar2 = r10;
                    file2 = file8;
                    j5 = j4;
                    dsfVar4 = dsfVar6;
                    int i5 = i4;
                    ku3Var2 = ku3Var5;
                    dsf dsfVar8 = dsfVar7;
                    str2 = "";
                    byte[] bArr3 = bArr2;
                    HttpResponse httpResponse7 = httpResponse6;
                    InputStream inputStream5 = r13;
                    try {
                        try {
                            xhj.a.getClass();
                            xuc xucVar = xuc.a;
                            xucVar.getClass();
                            long b = xuc.b();
                            wd5 wd5Var = xd5.b;
                            ct8 ct8Var3 = ct8Var;
                            kof kofVar6 = kofVar5;
                            byte[] bArr4 = bArr3;
                            long R = wkn.R(i5, be5.MILLISECONDS);
                            xucVar.getClass();
                            esfVar.a = haa.w(b, R);
                            dsfVar3 = dsfVar5;
                            i2 = i5;
                            httpResponse3 = httpResponse5;
                            ct8Var = ct8Var3;
                            file = file3;
                            bArr = bArr4;
                            i = 0;
                            lu3Var = lu3Var3;
                            kofVar = kofVar6;
                            inputStream2 = inputStream5;
                            while (true) {
                                try {
                                    read = inputStream.read(bArr);
                                    dsfVar4.a = read;
                                    InputStream inputStream6 = inputStream;
                                    if (read != -1) {
                                        break;
                                    }
                                    kofVar.R0(i, read, bArr);
                                    kofVar.flush();
                                    dsfVar3.a += dsfVar4.a;
                                    if (ct8Var != null) {
                                        kof kofVar7 = kofVar;
                                        try {
                                            long b2 = whj.b(esfVar.a);
                                            wd5 wd5Var2 = xd5.b;
                                            if (!(b2 < j)) {
                                                break;
                                            }
                                            kofVar4 = kofVar7;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            dsfVar2 = dsfVar3;
                                            file3 = file;
                                            wk0Var4 = wk0Var2;
                                            httpResponse4 = httpResponse3;
                                        }
                                    } else {
                                        kofVar4 = kofVar;
                                    }
                                    inputStream = inputStream6;
                                    i2 = i2;
                                    lu3Var = lu3Var;
                                    bArr = bArr;
                                    file = file;
                                    i = 0;
                                    kofVar = kofVar4;
                                    kofVar2 = kofVar2;
                                    httpResponse3 = httpResponse3;
                                    wk0Var2 = wk0Var2;
                                    dsfVar3 = dsfVar3;
                                } catch (Throwable th5) {
                                    th = th5;
                                    dsfVar2 = dsfVar3;
                                    file3 = file;
                                    wk0Var4 = wk0Var2;
                                    httpResponse4 = httpResponse3;
                                }
                            }
                            kofVar3 = kofVar2;
                            wk0Var3 = wk0Var4;
                            j4 = j5;
                            th3 = th;
                            inputStream3 = inputStream2;
                        } catch (Throwable th6) {
                            th = th6;
                            dsfVar2 = dsfVar5;
                            th3 = th;
                            kofVar3 = kofVar2;
                            j4 = j5;
                            wk0Var3 = wk0Var2;
                            httpResponse4 = httpResponse5;
                            inputStream3 = inputStream5;
                            throw th3;
                        }
                        dsfVar5 = dsfVar8;
                        httpResponse5 = httpResponse7;
                    } catch (Throwable th7) {
                        th = th7;
                        dsfVar5 = dsfVar8;
                        httpResponse5 = httpResponse7;
                    }
                } catch (Throwable th8) {
                    th3 = th8;
                    kofVar3 = r10;
                    dsfVar2 = dsfVar7;
                    httpResponse4 = httpResponse6;
                    file3 = file7;
                    file2 = file8;
                    str2 = "";
                    wk0Var3 = r11;
                    inputStream3 = r13;
                }
                try {
                    throw th3;
                } catch (Throwable th9) {
                    try {
                        n4o.x(kofVar3, th3);
                        throw th9;
                    } catch (Throwable th10) {
                        th2 = th10;
                        wk0Var = wk0Var3;
                        inputStream = inputStream3;
                        httpResponse2 = httpResponse4;
                        try {
                            throw th2;
                        } catch (Throwable th11) {
                            try {
                                n4o.x(wk0Var, th2);
                                throw th11;
                            } catch (Throwable th12) {
                                th = th12;
                                j3 = j4;
                                dsfVar = dsfVar2;
                                file = file3;
                                try {
                                    throw th;
                                } catch (Throwable th13) {
                                    try {
                                        n4o.x(inputStream, th);
                                        throw th13;
                                    } catch (Throwable th14) {
                                        th = th14;
                                        long j7 = j3;
                                        p2g p2gVar = w2g.b;
                                        long j8 = j7;
                                        HttpResponse httpResponse8 = httpResponse2;
                                        Object obj3 = new u2g(th);
                                        dsf dsfVar9 = dsfVar;
                                        a = w2g.a(obj3);
                                        if (a != null) {
                                            return new CacheResult.Failure(CacheError.NETWORK_ERROR, CacheSource.REMOTE, a);
                                        }
                                        if (httpResponse8.getStatusCode() != 206 ? httpResponse8.getContentSize() == -1 ? file2.length() <= j : file2.length() != httpResponse8.getContentSize() : file2.length() != httpResponse8.getContentSize() + j8) {
                                            return new CacheResult.Failure(CacheError.NETWORK_ERROR, CacheSource.REMOTE, null, 4, null);
                                        }
                                        File file9 = new File(this.$cachePath, this.$fileName);
                                        try {
                                            if (file9.exists() && !file9.delete()) {
                                                throw new IllegalStateException("Final file exists and could not be deleted before overwriting");
                                            }
                                        } catch (Throwable th15) {
                                            p2g p2gVar2 = w2g.b;
                                            u2gVar = new u2g(th15);
                                        }
                                        if (!file2.renameTo(file9)) {
                                            throw new IllegalStateException("Could not rename temporary file to final file");
                                        }
                                        if (file.exists() && !file.delete()) {
                                            throw new IllegalStateException("Could not delete Etag file after successful download");
                                        }
                                        u2gVar = Unit.a;
                                        Throwable a3 = w2g.a(u2gVar);
                                        if (a3 != null) {
                                            return new CacheResult.Failure(CacheError.FILE_STATE_WRONG, CacheSource.REMOTE, a3);
                                        }
                                        String str5 = this.$url;
                                        String str6 = this.$fileName;
                                        getFileExtensionFromUrl = this.this$0.getFileExtensionFromUrl;
                                        String invoke4 = getFileExtensionFromUrl.invoke(this.$url);
                                        String str7 = invoke4 == null ? str2 : invoke4;
                                        long j9 = dsfVar9.a;
                                        String protocol = httpResponse8.getProtocol();
                                        Integer num2 = this.$priority;
                                        return new CacheResult.Success(new CachedFile(str5, str6, file9, str7, j9, protocol, num2 != null ? num2.intValue() : Integer.MAX_VALUE), CacheSource.REMOTE);
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
            File file10 = (File) this.L$2;
            File file11 = (File) this.L$1;
            ku3Var2 = (ku3) this.L$0;
            y6a.M(obj);
            file2 = file11;
            file = file10;
            execute = obj;
            httpResponse = (HttpResponse) execute;
            if (HttpResponseKt.isSuccessful(httpResponse)) {
                return new CacheResult.Failure(CacheError.NETWORK_ERROR, CacheSource.REMOTE, new Exception("Request failed with status code " + httpResponse.getStatusCode()));
            }
            List<String> list = httpResponse.getHeaders().get(Command.HTTP_HEADER_ETAG);
            if (list != null && (str3 = (String) CollectionsKt.firstOrNull(list)) != null) {
                char[] cArr = new char[1];
                cArr[i] = '\"';
                String m0 = StringsKt.m0(str3, cArr);
                if (m0 != null) {
                    str = m0;
                    if (str.length() <= 0) {
                        str = null;
                    }
                    if (str != null) {
                        b28.b(file, str, Charsets.UTF_8);
                        Unit unit = Unit.a;
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
                    long contentSize = (httpResponse.getStatusCode() != 206 || httpResponse.getContentSize() <= j) ? httpResponse.getContentSize() : httpResponse.getContentSize() + j2;
                    dsfVar = new dsf();
                    esfVar = new esf();
                    xhj.a.getClass();
                    xuc xucVar2 = xuc.a;
                    xucVar2.getClass();
                    j3 = j2;
                    long b3 = xuc.b();
                    wd5 wd5Var3 = xd5.b;
                    str2 = "";
                    long R2 = wkn.R(this.$intervalMs, be5.MILLISECONDS);
                    xucVar2.getClass();
                    esfVar.a = haa.w(b3, R2);
                    ct8 ct8Var4 = this.$onProgress;
                    int i6 = this.$intervalMs;
                    try {
                        p2g p2gVar3 = w2g.b;
                        try {
                            byte[] bArr5 = new byte[8192];
                            dsf dsfVar10 = new dsf();
                            file2.getClass();
                            wk0Var = new wk0(new FileOutputStream(file2, true), new pij());
                            try {
                                lu3Var = lu3Var2;
                                ct8Var = ct8Var4;
                                kofVar = new kof(wk0Var);
                                wk0Var2 = wk0Var;
                                j5 = j3;
                                kofVar2 = kofVar;
                                i2 = i6;
                                dsfVar3 = dsfVar;
                                j6 = contentSize;
                                httpResponse3 = httpResponse;
                                dsfVar4 = dsfVar10;
                                inputStream2 = inputStream;
                                bArr = bArr5;
                                while (true) {
                                    read = inputStream.read(bArr);
                                    dsfVar4.a = read;
                                    InputStream inputStream62 = inputStream;
                                    if (read != -1) {
                                    }
                                    i2 = i2;
                                    lu3Var = lu3Var;
                                    bArr = bArr;
                                    file = file;
                                    i = 0;
                                    kofVar = kofVar4;
                                    kofVar2 = kofVar2;
                                    httpResponse3 = httpResponse3;
                                    wk0Var2 = wk0Var2;
                                    dsfVar3 = dsfVar3;
                                }
                                kofVar3 = kofVar2;
                                wk0Var3 = wk0Var4;
                                j4 = j5;
                                th3 = th;
                                inputStream3 = inputStream2;
                            } catch (Throwable th16) {
                                httpResponse2 = httpResponse;
                                th2 = th16;
                                file3 = file;
                                dsfVar2 = dsfVar;
                                j4 = j3;
                                throw th2;
                            }
                        } catch (Throwable th17) {
                            httpResponse2 = httpResponse;
                            th = th17;
                            throw th;
                        }
                    } catch (Throwable th18) {
                        th = th18;
                        httpResponse2 = httpResponse;
                        long j72 = j3;
                        p2g p2gVar4 = w2g.b;
                        long j82 = j72;
                        HttpResponse httpResponse82 = httpResponse2;
                        Object obj32 = new u2g(th);
                        dsf dsfVar92 = dsfVar;
                        a = w2g.a(obj32);
                        if (a != null) {
                        }
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
        this.L$0 = ku3Var;
        this.L$1 = file2;
        this.L$2 = file;
        this.L$3 = obj2;
        this.J$0 = j2;
        this.label = 2;
        execute = ((HttpClient) invoke).execute(httpRequest, true, this);
        if (execute != lu3Var2) {
            ku3Var2 = ku3Var;
            httpResponse = (HttpResponse) execute;
            if (HttpResponseKt.isSuccessful(httpResponse)) {
            }
        }
        return lu3Var2;
    }
}
