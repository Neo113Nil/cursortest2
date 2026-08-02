package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.json.JSONArray;
import xsna.jvo0;
import xsna.k830;
import xsna.on00;
import xsna.pn00;
import xsna.s3q0;
import xsna.spj;
import xsna.yzs;

/* compiled from: CommonCacheFile.kt */
/* loaded from: classes14.dex */
public final class CommonCacheFile implements CacheFile {
    private final CacheRepository cacheRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public CommonCacheFile(CacheRepository cacheRepository, SendDiagnosticEvent sendDiagnosticEvent) {
        this.cacheRepository = cacheRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // com.unity3d.ads.core.domain.CacheFile
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(String str, AdObject adObject, JSONArray jSONArray, int i, int i2, yzs<? super Long, ? super Long, ? super spj<? super s3q0>, ? extends Object> yzsVar, spj<? super CacheResult> spjVar) {
        CommonCacheFile$invoke$1 commonCacheFile$invoke$1;
        int i3;
        AdObject adObject2;
        long j;
        CacheResult cacheResult;
        String str2;
        if (spjVar instanceof CommonCacheFile$invoke$1) {
            commonCacheFile$invoke$1 = (CommonCacheFile$invoke$1) spjVar;
            int i4 = commonCacheFile$invoke$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                commonCacheFile$invoke$1.label = i4 - Integer.MIN_VALUE;
                CommonCacheFile$invoke$1 commonCacheFile$invoke$12 = commonCacheFile$invoke$1;
                Object obj = commonCacheFile$invoke$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = commonCacheFile$invoke$12.label;
                if (i3 != 0) {
                    kotlin.a.a(obj);
                    long b = k830.b();
                    CacheRepository cacheRepository = this.cacheRepository;
                    commonCacheFile$invoke$12.L$0 = adObject;
                    commonCacheFile$invoke$12.J$0 = b;
                    commonCacheFile$invoke$12.label = 1;
                    Object file = cacheRepository.getFile(str, jSONArray, i, i2, yzsVar, commonCacheFile$invoke$12);
                    if (file == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    adObject2 = adObject;
                    obj = file;
                    j = b;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = commonCacheFile$invoke$12.J$0;
                    AdObject adObject3 = (AdObject) commonCacheFile$invoke$12.L$0;
                    kotlin.a.a(obj);
                    adObject2 = adObject3;
                }
                cacheResult = (CacheResult) obj;
                if (!(cacheResult instanceof CacheResult.Success)) {
                    SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
                    DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_CACHE_SUCCESS_TIME;
                    Double d = new Double(TimeExtensionsKt.elapsedMillis(new jvo0.a(j)));
                    CacheResult.Success success = (CacheResult.Success) cacheResult;
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, d, pn00.k(new Pair("cache_source", success.getSource().toString()), new Pair("protocol", success.getCachedFile().getProtocol())), on00.f(new Pair("size_kb", new Integer((int) (success.getCachedFile().getContentLength() / 1024)))), adObject2, (Integer) null, (ByteString) null, 96, (Object) null);
                    return cacheResult;
                }
                if (!(cacheResult instanceof CacheResult.Failure)) {
                    throw new NoWhenBranchMatchedException();
                }
                SendDiagnosticEvent sendDiagnosticEvent2 = this.sendDiagnosticEvent;
                DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType2 = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_CACHE_FAILURE_TIME;
                Double d2 = new Double(TimeExtensionsKt.elapsedMillis(new jvo0.a(j)));
                CacheResult.Failure failure = (CacheResult.Failure) cacheResult;
                Pair pair = new Pair("cache_source", failure.getSource().toString());
                Pair pair2 = new Pair("reason", failure.getError().toString());
                Throwable reason = failure.getReason();
                if (reason == null || (str2 = reason.getMessage()) == null) {
                    str2 = "";
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, diagnosticEventType2, d2, pn00.k(pair, pair2, new Pair("reason_debug", str2)), (Map) null, adObject2, (Integer) null, (ByteString) null, 104, (Object) null);
                return cacheResult;
            }
        }
        commonCacheFile$invoke$1 = new CommonCacheFile$invoke$1(this, spjVar);
        CommonCacheFile$invoke$1 commonCacheFile$invoke$122 = commonCacheFile$invoke$1;
        Object obj2 = commonCacheFile$invoke$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = commonCacheFile$invoke$122.label;
        if (i3 != 0) {
        }
        cacheResult = (CacheResult) obj2;
        if (!(cacheResult instanceof CacheResult.Success)) {
        }
    }
}
