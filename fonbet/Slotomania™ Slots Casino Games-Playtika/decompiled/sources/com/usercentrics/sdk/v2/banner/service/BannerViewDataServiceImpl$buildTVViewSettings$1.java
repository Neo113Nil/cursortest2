package com.usercentrics.sdk.v2.banner.service;

import com.usercentrics.sdk.models.common.UsercentricsVariant;
import com.usercentrics.sdk.models.settings.LegacyExtendedSettings;
import com.usercentrics.sdk.models.settings.PredefinedTVViewSettings;
import com.usercentrics.sdk.services.tcf.TCFUseCase;
import com.usercentrics.sdk.v2.async.dispatcher.DispatcherScope;
import com.usercentrics.sdk.v2.banner.service.mapper.gdpr.GDPRViewSettingsMapper;
import com.usercentrics.sdk.v2.banner.service.mapper.tcf.TCFViewSettingsMapper;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: BannerViewDataServiceImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/usercentrics/sdk/models/settings/PredefinedTVViewSettings;", "Lcom/usercentrics/sdk/v2/async/dispatcher/DispatcherScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.v2.banner.service.BannerViewDataServiceImpl$buildTVViewSettings$1", f = "BannerViewDataServiceImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class BannerViewDataServiceImpl$buildTVViewSettings$1 extends SuspendLambda implements Function2<DispatcherScope, Continuation<? super PredefinedTVViewSettings>, Object> {
    final /* synthetic */ LegacyExtendedSettings $settingsLegacyData;
    int label;
    final /* synthetic */ BannerViewDataServiceImpl this$0;

    /* compiled from: BannerViewDataServiceImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UsercentricsVariant.values().length];
            try {
                iArr[UsercentricsVariant.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UsercentricsVariant.TCF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UsercentricsVariant.CCPA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BannerViewDataServiceImpl$buildTVViewSettings$1(BannerViewDataServiceImpl bannerViewDataServiceImpl, LegacyExtendedSettings legacyExtendedSettings, Continuation<? super BannerViewDataServiceImpl$buildTVViewSettings$1> continuation) {
        super(2, continuation);
        this.this$0 = bannerViewDataServiceImpl;
        this.$settingsLegacyData = legacyExtendedSettings;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BannerViewDataServiceImpl$buildTVViewSettings$1(this.this$0, this.$settingsLegacyData, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DispatcherScope dispatcherScope, Continuation<? super PredefinedTVViewSettings> continuation) {
        return ((BannerViewDataServiceImpl$buildTVViewSettings$1) create(dispatcherScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UsercentricsVariant usercentricsVariant;
        GDPRViewSettingsMapper gDPRMapper;
        TCFUseCase tCFUseCase;
        TCFViewSettingsMapper tCFMapper;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            usercentricsVariant = this.this$0.variant;
            int i = WhenMappings.$EnumSwitchMapping$0[usercentricsVariant.ordinal()];
            if (i == 1) {
                gDPRMapper = this.this$0.getGDPRMapper(this.$settingsLegacyData);
                return gDPRMapper.mapTV();
            }
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("CCPA is not supported for TV");
            }
            tCFUseCase = this.this$0.tcfInstance;
            tCFMapper = this.this$0.getTCFMapper(this.$settingsLegacyData, tCFUseCase.getTCFData());
            return tCFMapper.mapTV();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
