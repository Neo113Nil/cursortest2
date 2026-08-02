package com.unity3d.ads.core.domain.scar;

import com.google.protobuf.ByteString;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import gatewayprotocol.v1.AdFormatOuterClass;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AndroidFetchSignalsAndSendUseCase.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\"\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J+\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u001bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/unity3d/ads/core/domain/scar/AndroidFetchSignalsAndSendUseCase;", "Lcom/unity3d/ads/core/domain/scar/FetchSignalsAndSendUseCase;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "scarManager", "Lcom/unity3d/ads/core/data/manager/ScarManager;", "handleGetTokenRequest", "Lcom/unity3d/ads/core/domain/scar/HandleGetTokenRequest;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "scarEligibleEffectiveUseCase", "Lcom/unity3d/ads/core/domain/scar/ScarEligibleEffectiveUseCase;", "(Lkotlinx/coroutines/CoroutineScope;Lcom/unity3d/ads/core/data/manager/ScarManager;Lcom/unity3d/ads/core/domain/scar/HandleGetTokenRequest;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/scar/ScarEligibleEffectiveUseCase;)V", "getTags", "", "", "formats", "", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "invoke", "", "tokenNumber", "", "tokenId", "Lcom/google/protobuf/ByteString;", "tokenConfiguration", "Lcom/unity3d/ads/TokenConfiguration;", "(ILcom/google/protobuf/ByteString;Lcom/unity3d/ads/TokenConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AndroidFetchSignalsAndSendUseCase implements FetchSignalsAndSendUseCase {
    private final HandleGetTokenRequest handleGetTokenRequest;
    private final ScarEligibleEffectiveUseCase scarEligibleEffectiveUseCase;
    private final ScarManager scarManager;
    private final CoroutineScope scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidFetchSignalsAndSendUseCase(CoroutineScope scope, ScarManager scarManager, HandleGetTokenRequest handleGetTokenRequest, SendDiagnosticEvent sendDiagnosticEvent, ScarEligibleEffectiveUseCase scarEligibleEffectiveUseCase) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(scarManager, "scarManager");
        Intrinsics.checkNotNullParameter(handleGetTokenRequest, "handleGetTokenRequest");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        Intrinsics.checkNotNullParameter(scarEligibleEffectiveUseCase, "scarEligibleEffectiveUseCase");
        this.scope = scope;
        this.scarManager = scarManager;
        this.handleGetTokenRequest = handleGetTokenRequest;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.scarEligibleEffectiveUseCase = scarEligibleEffectiveUseCase;
    }

    @Override // com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase
    public Object invoke(int i, ByteString byteString, TokenConfiguration tokenConfiguration, Continuation<? super Unit> continuation) {
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new AndroidFetchSignalsAndSendUseCase$invoke$2(this, tokenConfiguration, i, byteString, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> getTags(List<? extends AdFormatOuterClass.AdFormat> formats) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (formats.contains(AdFormatOuterClass.AdFormat.AD_FORMAT_BANNER)) {
            linkedHashMap.put("banner", "true");
        }
        if (formats.contains(AdFormatOuterClass.AdFormat.AD_FORMAT_REWARDED)) {
            linkedHashMap.put("rewarded", "true");
        }
        if (formats.contains(AdFormatOuterClass.AdFormat.AD_FORMAT_INTERSTITIAL)) {
            linkedHashMap.put("interstitial", "true");
        }
        return linkedHashMap;
    }
}
