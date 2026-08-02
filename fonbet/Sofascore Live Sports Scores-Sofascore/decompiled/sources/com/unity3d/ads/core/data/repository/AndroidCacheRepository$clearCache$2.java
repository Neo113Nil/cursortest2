package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.sub;
import defpackage.tub;
import defpackage.whj;
import defpackage.xhj;
import defpackage.xuc;
import defpackage.y6a;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$clearCache$2", f = "AndroidCacheRepository.kt", l = {144}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class AndroidCacheRepository$clearCache$2 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
    long J$0;
    boolean Z$0;
    int label;
    final /* synthetic */ AndroidCacheRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCacheRepository$clearCache$2(AndroidCacheRepository androidCacheRepository, rq3<? super AndroidCacheRepository$clearCache$2> rq3Var) {
        super(2, rq3Var);
        this.this$0 = androidCacheRepository;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new AndroidCacheRepository$clearCache$2(this.this$0, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
        return ((AndroidCacheRepository$clearCache$2) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x01a4 A[Catch: Exception -> 0x0196, TryCatch #0 {Exception -> 0x0196, blocks: (B:36:0x015f, B:39:0x0170, B:24:0x01af, B:18:0x0198, B:20:0x01a4, B:22:0x01a7), top: B:35:0x015f }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SessionRepository sessionRepository;
        boolean cleanCache;
        long b;
        Object cacheSize;
        long j;
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
        lu3 lu3Var = lu3.a;
        int i = this.label;
        if (i == 0) {
            y6a.M(obj);
            sessionRepository = this.this$0.sessionRepository;
            cleanCache = sessionRepository.getNativeConfiguration().getDebugSettings().getCleanCache();
            xhj.a.getClass();
            xuc.a.getClass();
            b = xuc.b();
            AndroidCacheRepository androidCacheRepository = this.this$0;
            this.Z$0 = cleanCache;
            this.J$0 = b;
            this.label = 1;
            cacheSize = androidCacheRepository.getCacheSize(this);
            if (cacheSize == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j2 = this.J$0;
            boolean z = this.Z$0;
            y6a.M(obj);
            b = j2;
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
                j = 1024;
                sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
                DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_ASSETS_FAILURE_TIME;
                double elapsedMillis = TimeExtensionsKt.elapsedMillis(new whj(b));
                Map d = sub.d(new Pair("size_kb", new Integer((int) (longValue / j))));
                Pair pair = new Pair("reason", th.getClass().getSimpleName());
                String message = th.getMessage();
                if (message == null) {
                    message = th.getClass().getSimpleName();
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, new Double(elapsedMillis), tub.h(pair, new Pair("reason_debug", message)), d, (AdObject) null, (Integer) null, (ByteString) null, 112, (Object) null);
                xhj.a.getClass();
                xuc.a.getClass();
                long b2 = xuc.b();
                if (!cleanCache) {
                }
                webviewCacheDir2 = this.this$0.getWebviewCacheDir();
                listFiles = webviewCacheDir2.listFiles();
                if (listFiles != null) {
                }
                sendDiagnosticEvent3 = this.this$0.sendDiagnosticEvent;
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent3, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_WEBVIEW_SUCCESS_TIME, new Double(TimeExtensionsKt.elapsedMillis(new whj(b2))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, (Object) null);
                return Unit.a;
            }
            if (sessionRepository4.getNativeConfiguration().hasCachedAssetsConfiguration()) {
                sessionRepository5 = this.this$0.sessionRepository;
                NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration = sessionRepository5.getNativeConfiguration().getCachedAssetsConfiguration();
                cleanupDirectory2 = this.this$0.cleanupDirectory;
                cacheDir = this.this$0.getCacheDir();
                j = 1024;
                cleanupDirectory2.invoke(cacheDir, cachedAssetsConfiguration.getMaxCachedAssetSizeMb(), cachedAssetsConfiguration.getMaxCachedAssetAgeMs());
                sendDiagnosticEvent4 = this.this$0.sendDiagnosticEvent;
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent4, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_ASSETS_SUCCESS_TIME, new Double(TimeExtensionsKt.elapsedMillis(new whj(b))), (Map) null, sub.d(new Pair("size_kb", new Integer((int) (longValue / j)))), (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE, (Object) null);
                xhj.a.getClass();
                xuc.a.getClass();
                long b22 = xuc.b();
                if (!cleanCache) {
                    try {
                        sessionRepository2 = this.this$0.sessionRepository;
                    } catch (Exception e) {
                        sendDiagnosticEvent2 = this.this$0.sendDiagnosticEvent;
                        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType2 = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_WEBVIEW_FAILURE_TIME;
                        Double d2 = new Double(TimeExtensionsKt.elapsedMillis(new whj(b22)));
                        Pair pair2 = new Pair("reason", e.getClass().getSimpleName());
                        String message2 = e.getMessage();
                        if (message2 == null) {
                            message2 = e.getClass().getSimpleName();
                        }
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, diagnosticEventType2, d2, tub.h(pair2, new Pair("reason_debug", message2)), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
                    }
                    if (sessionRepository2.getNativeConfiguration().hasCachedWebviewFilesConfiguration()) {
                        sessionRepository3 = this.this$0.sessionRepository;
                        NativeConfigurationOuterClass.CachedAssetsConfiguration cachedWebviewFilesConfiguration = sessionRepository3.getNativeConfiguration().getCachedWebviewFilesConfiguration();
                        cleanupDirectory = this.this$0.cleanupDirectory;
                        webviewCacheDir = this.this$0.getWebviewCacheDir();
                        cleanupDirectory.invoke(webviewCacheDir, cachedWebviewFilesConfiguration.getMaxCachedAssetSizeMb(), cachedWebviewFilesConfiguration.getMaxCachedAssetAgeMs());
                        sendDiagnosticEvent3 = this.this$0.sendDiagnosticEvent;
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent3, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_WEBVIEW_SUCCESS_TIME, new Double(TimeExtensionsKt.elapsedMillis(new whj(b22))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, (Object) null);
                        return Unit.a;
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
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent3, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_WEBVIEW_SUCCESS_TIME, new Double(TimeExtensionsKt.elapsedMillis(new whj(b22))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, (Object) null);
                return Unit.a;
            }
        }
        j = 1024;
        cacheDir2 = this.this$0.getCacheDir();
        File[] listFiles2 = cacheDir2.listFiles();
        if (listFiles2 != null) {
            for (File file2 : listFiles2) {
                file2.delete();
            }
        }
        sendDiagnosticEvent4 = this.this$0.sendDiagnosticEvent;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent4, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_ASSETS_SUCCESS_TIME, new Double(TimeExtensionsKt.elapsedMillis(new whj(b))), (Map) null, sub.d(new Pair("size_kb", new Integer((int) (longValue / j)))), (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE, (Object) null);
        xhj.a.getClass();
        xuc.a.getClass();
        long b222 = xuc.b();
        if (!cleanCache) {
        }
        webviewCacheDir2 = this.this$0.getWebviewCacheDir();
        listFiles = webviewCacheDir2.listFiles();
        if (listFiles != null) {
        }
        sendDiagnosticEvent3 = this.this$0.sendDiagnosticEvent;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent3, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_WEBVIEW_SUCCESS_TIME, new Double(TimeExtensionsKt.elapsedMillis(new whj(b222))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, (Object) null);
        return Unit.a;
    }
}
