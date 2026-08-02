package com.unity3d.ads.core.domain;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.drm0;
import xsna.jvo0;
import xsna.k830;
import xsna.spj;

/* compiled from: CommonGetIsFileCache.kt */
/* loaded from: classes14.dex */
public final class CommonGetIsFileCache implements GetIsFileCache {
    private final CacheRepository cacheRepository;
    private final GetAssetFileName getAssetFileName;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    public CommonGetIsFileCache(CacheRepository cacheRepository, SessionRepository sessionRepository, SendDiagnosticEvent sendDiagnosticEvent, GetAssetFileName getAssetFileName) {
        this.cacheRepository = cacheRepository;
        this.sessionRepository = sessionRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getAssetFileName = getAssetFileName;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.unity3d.ads.core.domain.GetIsFileCache
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(String str, spj<? super Boolean> spjVar) {
        CommonGetIsFileCache$invoke$1 commonGetIsFileCache$invoke$1;
        int i;
        long j;
        if (spjVar instanceof CommonGetIsFileCache$invoke$1) {
            commonGetIsFileCache$invoke$1 = (CommonGetIsFileCache$invoke$1) spjVar;
            int i2 = commonGetIsFileCache$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonGetIsFileCache$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = commonGetIsFileCache$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = commonGetIsFileCache$invoke$1.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    long b = k830.b();
                    String invoke = this.sessionRepository.getFeatureFlags().getDisableCustomScheme() ? this.getAssetFileName.invoke(str) : drm0.j0(str, DomExceptionUtils.SEPARATOR, str);
                    CacheRepository cacheRepository = this.cacheRepository;
                    commonGetIsFileCache$invoke$1.J$0 = b;
                    commonGetIsFileCache$invoke$1.label = 1;
                    obj = cacheRepository.doesFileExist(invoke, commonGetIsFileCache$invoke$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    j = b;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = commonGetIsFileCache$invoke$1.J$0;
                    kotlin.a.a(obj);
                }
                Boolean bool = (Boolean) obj;
                SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, !bool.booleanValue() ? "native_show_is_file_cached_success_time" : "native_show_is_file_cached_failure_time", new Double(TimeExtensionsKt.elapsedMillis(new jvo0.a(j))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, (Object) null);
                return bool;
            }
        }
        commonGetIsFileCache$invoke$1 = new CommonGetIsFileCache$invoke$1(this, spjVar);
        Object obj2 = commonGetIsFileCache$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = commonGetIsFileCache$invoke$1.label;
        if (i != 0) {
        }
        Boolean bool2 = (Boolean) obj2;
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, !bool2.booleanValue() ? "native_show_is_file_cached_success_time" : "native_show_is_file_cached_failure_time", new Double(TimeExtensionsKt.elapsedMillis(new jvo0.a(j))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, (Object) null);
        return bool2;
    }
}
