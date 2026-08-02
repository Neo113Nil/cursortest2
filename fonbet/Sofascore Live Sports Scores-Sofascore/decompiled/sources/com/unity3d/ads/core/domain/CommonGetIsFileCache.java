package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.whj;
import defpackage.xhj;
import defpackage.xuc;
import defpackage.y6a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonGetIsFileCache;", "Lcom/unity3d/ads/core/domain/GetIsFileCache;", "Lcom/unity3d/ads/core/data/repository/CacheRepository;", "cacheRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/GetAssetFileName;", "getAssetFileName", "<init>", "(Lcom/unity3d/ads/core/data/repository/CacheRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/GetAssetFileName;)V", "", "url", "", "invoke", "(Ljava/lang/String;Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/repository/CacheRepository;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/ads/core/domain/GetAssetFileName;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonGetIsFileCache implements GetIsFileCache {

    @NotNull
    private final CacheRepository cacheRepository;

    @NotNull
    private final GetAssetFileName getAssetFileName;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final SessionRepository sessionRepository;

    public CommonGetIsFileCache(@NotNull CacheRepository cacheRepository, @NotNull SessionRepository sessionRepository, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull GetAssetFileName getAssetFileName) {
        cacheRepository.getClass();
        sessionRepository.getClass();
        sendDiagnosticEvent.getClass();
        getAssetFileName.getClass();
        this.cacheRepository = cacheRepository;
        this.sessionRepository = sessionRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getAssetFileName = getAssetFileName;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.unity3d.ads.core.domain.GetIsFileCache
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(@NotNull String str, @NotNull rq3<? super Boolean> rq3Var) {
        CommonGetIsFileCache$invoke$1 commonGetIsFileCache$invoke$1;
        int i;
        long j;
        if (rq3Var instanceof CommonGetIsFileCache$invoke$1) {
            commonGetIsFileCache$invoke$1 = (CommonGetIsFileCache$invoke$1) rq3Var;
            int i2 = commonGetIsFileCache$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonGetIsFileCache$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = commonGetIsFileCache$invoke$1.result;
                lu3 lu3Var = lu3.a;
                i = commonGetIsFileCache$invoke$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    xhj.a.getClass();
                    xuc.a.getClass();
                    long b = xuc.b();
                    String invoke = this.sessionRepository.getFeatureFlags().getDisableCustomScheme() ? this.getAssetFileName.invoke(str) : StringsKt.f0(str, "/");
                    CacheRepository cacheRepository = this.cacheRepository;
                    commonGetIsFileCache$invoke$1.J$0 = b;
                    commonGetIsFileCache$invoke$1.label = 1;
                    obj = cacheRepository.doesFileExist(invoke, commonGetIsFileCache$invoke$1);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                    j = b;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = commonGetIsFileCache$invoke$1.J$0;
                    y6a.M(obj);
                }
                Boolean bool = (Boolean) obj;
                SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, !bool.booleanValue() ? "native_show_is_file_cached_success_time" : "native_show_is_file_cached_failure_time", new Double(TimeExtensionsKt.elapsedMillis(new whj(j))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, (Object) null);
                return bool;
            }
        }
        commonGetIsFileCache$invoke$1 = new CommonGetIsFileCache$invoke$1(this, rq3Var);
        Object obj2 = commonGetIsFileCache$invoke$1.result;
        lu3 lu3Var2 = lu3.a;
        i = commonGetIsFileCache$invoke$1.label;
        if (i != 0) {
        }
        Boolean bool2 = (Boolean) obj2;
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, !bool2.booleanValue() ? "native_show_is_file_cached_success_time" : "native_show_is_file_cached_failure_time", new Double(TimeExtensionsKt.elapsedMillis(new whj(j))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, (Object) null);
        return bool2;
    }
}
