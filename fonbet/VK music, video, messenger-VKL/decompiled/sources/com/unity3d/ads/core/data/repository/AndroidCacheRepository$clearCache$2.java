package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.io.File;
import java.util.Map;
import kotlin.Pair;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.jvo0;
import xsna.k830;
import xsna.on00;
import xsna.pn00;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: AndroidCacheRepository.kt */
@b6l(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$clearCache$2", f = "AndroidCacheRepository.kt", l = {144}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidCacheRepository$clearCache$2 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    long J$0;
    boolean Z$0;
    int label;
    final /* synthetic */ AndroidCacheRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCacheRepository$clearCache$2(AndroidCacheRepository androidCacheRepository, spj<? super AndroidCacheRepository$clearCache$2> spjVar) {
        super(2, spjVar);
        this.this$0 = androidCacheRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new AndroidCacheRepository$clearCache$2(this.this$0, spjVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0193 A[Catch: Exception -> 0x0185, TryCatch #1 {Exception -> 0x0185, blocks: (B:36:0x014e, B:39:0x015f, B:24:0x019e, B:18:0x0187, B:20:0x0193, B:22:0x0196), top: B:35:0x014e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SessionRepository sessionRepository;
        boolean cleanCache;
        long b;
        Object cacheSize;
        Object obj2;
        SendDiagnosticEvent sendDiagnosticEvent;
        SessionRepository sessionRepository2;
        SessionRepository sessionRepository3;
        CleanupDirectory cleanupDirectory;
        File webviewCacheDir;
        SendDiagnosticEvent sendDiagnosticEvent2;
        SendDiagnosticEvent sendDiagnosticEvent3;
        File webviewCacheDir2;
        File[] listFiles;
        SessionRepository sessionRepository4;
        SessionRepository sessionRepository5;
        CleanupDirectory cleanupDirectory2;
        File cacheDir;
        SendDiagnosticEvent sendDiagnosticEvent4;
        File cacheDir2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            a.a(obj);
            sessionRepository = this.this$0.sessionRepository;
            cleanCache = sessionRepository.getNativeConfiguration().getDebugSettings().getCleanCache();
            b = k830.b();
            AndroidCacheRepository androidCacheRepository = this.this$0;
            this.Z$0 = cleanCache;
            this.J$0 = b;
            this.label = 1;
            cacheSize = androidCacheRepository.getCacheSize(this);
            if (cacheSize == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j = this.J$0;
            boolean z = this.Z$0;
            a.a(obj);
            b = j;
            cacheSize = obj;
            cleanCache = z;
        }
        long longValue = ((Number) cacheSize).longValue();
        try {
        } catch (Throwable th) {
            th = th;
        }
        if (!cleanCache) {
            try {
                sessionRepository4 = this.this$0.sessionRepository;
            } catch (Throwable th2) {
                th = th2;
                obj2 = "size_kb";
                sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
                DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_ASSETS_FAILURE_TIME;
                double elapsedMillis = TimeExtensionsKt.elapsedMillis(new jvo0.a(b));
                Map f = on00.f(new Pair(obj2, new Integer((int) (longValue / 1024))));
                Pair pair = new Pair("reason", th.getClass().getSimpleName());
                String message = th.getMessage();
                if (message == null) {
                    message = th.getClass().getSimpleName();
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, new Double(elapsedMillis), pn00.k(pair, new Pair("reason_debug", message)), f, (AdObject) null, (Integer) null, (ByteString) null, 112, (Object) null);
                long b2 = k830.b();
                if (!cleanCache) {
                }
                webviewCacheDir2 = this.this$0.getWebviewCacheDir();
                listFiles = webviewCacheDir2.listFiles();
                if (listFiles != null) {
                }
                sendDiagnosticEvent3 = this.this$0.sendDiagnosticEvent;
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent3, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_WEBVIEW_SUCCESS_TIME, new Double(TimeExtensionsKt.elapsedMillis(new jvo0.a(b2))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, (Object) null);
                return s3q0.a;
            }
            if (sessionRepository4.getNativeConfiguration().hasCachedAssetsConfiguration()) {
                sessionRepository5 = this.this$0.sessionRepository;
                NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration = sessionRepository5.getNativeConfiguration().getCachedAssetsConfiguration();
                cleanupDirectory2 = this.this$0.cleanupDirectory;
                cacheDir = this.this$0.getCacheDir();
                obj2 = "size_kb";
                cleanupDirectory2.invoke(cacheDir, cachedAssetsConfiguration.getMaxCachedAssetSizeMb(), cachedAssetsConfiguration.getMaxCachedAssetAgeMs());
                sendDiagnosticEvent4 = this.this$0.sendDiagnosticEvent;
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent4, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_ASSETS_SUCCESS_TIME, new Double(TimeExtensionsKt.elapsedMillis(new jvo0.a(b))), (Map) null, on00.f(new Pair(obj2, new Integer((int) (longValue / 1024)))), (AdObject) null, (Integer) null, (ByteString) null, 116, (Object) null);
                long b22 = k830.b();
                if (!cleanCache) {
                    try {
                        sessionRepository2 = this.this$0.sessionRepository;
                    } catch (Exception e) {
                        sendDiagnosticEvent2 = this.this$0.sendDiagnosticEvent;
                        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType2 = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_WEBVIEW_FAILURE_TIME;
                        Double d = new Double(TimeExtensionsKt.elapsedMillis(new jvo0.a(b22)));
                        Pair pair2 = new Pair("reason", e.getClass().getSimpleName());
                        String message2 = e.getMessage();
                        if (message2 == null) {
                            message2 = e.getClass().getSimpleName();
                        }
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, diagnosticEventType2, d, pn00.k(pair2, new Pair("reason_debug", message2)), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
                    }
                    if (sessionRepository2.getNativeConfiguration().hasCachedWebviewFilesConfiguration()) {
                        sessionRepository3 = this.this$0.sessionRepository;
                        NativeConfigurationOuterClass.CachedAssetsConfiguration cachedWebviewFilesConfiguration = sessionRepository3.getNativeConfiguration().getCachedWebviewFilesConfiguration();
                        cleanupDirectory = this.this$0.cleanupDirectory;
                        webviewCacheDir = this.this$0.getWebviewCacheDir();
                        cleanupDirectory.invoke(webviewCacheDir, cachedWebviewFilesConfiguration.getMaxCachedAssetSizeMb(), cachedWebviewFilesConfiguration.getMaxCachedAssetAgeMs());
                        sendDiagnosticEvent3 = this.this$0.sendDiagnosticEvent;
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent3, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_WEBVIEW_SUCCESS_TIME, new Double(TimeExtensionsKt.elapsedMillis(new jvo0.a(b22))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, (Object) null);
                        return s3q0.a;
                    }
                }
                webviewCacheDir2 = this.this$0.getWebviewCacheDir();
                listFiles = webviewCacheDir2.listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        file.delete();
                    }
                }
                sendDiagnosticEvent3 = this.this$0.sendDiagnosticEvent;
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent3, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_WEBVIEW_SUCCESS_TIME, new Double(TimeExtensionsKt.elapsedMillis(new jvo0.a(b22))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, (Object) null);
                return s3q0.a;
            }
        }
        obj2 = "size_kb";
        cacheDir2 = this.this$0.getCacheDir();
        File[] listFiles2 = cacheDir2.listFiles();
        if (listFiles2 != null) {
            for (File file2 : listFiles2) {
                file2.delete();
            }
        }
        sendDiagnosticEvent4 = this.this$0.sendDiagnosticEvent;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent4, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_ASSETS_SUCCESS_TIME, new Double(TimeExtensionsKt.elapsedMillis(new jvo0.a(b))), (Map) null, on00.f(new Pair(obj2, new Integer((int) (longValue / 1024)))), (AdObject) null, (Integer) null, (ByteString) null, 116, (Object) null);
        long b222 = k830.b();
        if (!cleanCache) {
        }
        webviewCacheDir2 = this.this$0.getWebviewCacheDir();
        listFiles = webviewCacheDir2.listFiles();
        if (listFiles != null) {
        }
        sendDiagnosticEvent3 = this.this$0.sendDiagnosticEvent;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent3, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_WEBVIEW_SUCCESS_TIME, new Double(TimeExtensionsKt.elapsedMillis(new jvo0.a(b222))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, (Object) null);
        return s3q0.a;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((AndroidCacheRepository$clearCache$2) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
