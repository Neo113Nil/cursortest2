package com.unity3d.ads.core.domain;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsErrorKt;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.model.exception.InitializationException;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.AwaitInitialization;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import defpackage.zzl;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "Lcom/unity3d/ads/core/data/model/LoadResult;", "<anonymous>", "(Lku3;)Lcom/unity3d/ads/core/data/model/LoadResult;"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$loadResult$1", f = "LegacyLoadUseCase.kt", l = {Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, 142, 143}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class LegacyLoadUseCase$invoke$loadResult$1 extends hoi implements Function2<ku3, rq3<? super LoadResult>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ AdRequestOuterClass.BannerSize $gatewayBannerSize;
    final /* synthetic */ UnityAdsLoadOptions $loadOptions;
    final /* synthetic */ String $opportunityId;
    final /* synthetic */ String $placement;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ LegacyLoadUseCase this$0;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InitializationState.values().length];
            try {
                iArr[InitializationState.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InitializationState.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InitializationState.NOT_INITIALIZED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InitializationState.INITIALIZING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyLoadUseCase$invoke$loadResult$1(String str, LegacyLoadUseCase legacyLoadUseCase, Context context, String str2, AdRequestOuterClass.BannerSize bannerSize, UnityAdsLoadOptions unityAdsLoadOptions, rq3<? super LegacyLoadUseCase$invoke$loadResult$1> rq3Var) {
        super(2, rq3Var);
        this.$opportunityId = str;
        this.this$0 = legacyLoadUseCase;
        this.$context = context;
        this.$placement = str2;
        this.$gatewayBannerSize = bannerSize;
        this.$loadOptions = unityAdsLoadOptions;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new LegacyLoadUseCase$invoke$loadResult$1(this.$opportunityId, this.this$0, this.$context, this.$placement, this.$gatewayBannerSize, this.$loadOptions, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super LoadResult> rq3Var) {
        return ((LegacyLoadUseCase$invoke$loadResult$1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0147, code lost:
    
        if (r0 == r8) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01b6, code lost:
    
        if (r0 == r8) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AdRepository adRepository;
        String str;
        HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup;
        GetInitializationState getInitializationState;
        Load load;
        Object invoke;
        SessionRepository sessionRepository;
        AwaitInitialization awaitInitialization;
        Object invoke$default;
        ByteString byteString;
        HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup2;
        int i;
        Load load2;
        Object invoke2;
        SessionRepository sessionRepository2;
        lu3 lu3Var = lu3.a;
        int i2 = this.label;
        if (i2 == 0) {
            y6a.M(obj);
            UUID fromString = UUID.fromString(this.$opportunityId);
            fromString.getClass();
            ByteString byteString2 = ProtobufExtensionsKt.toByteString(fromString);
            this.this$0.opportunity = byteString2;
            adRepository = this.this$0.adRepository;
            if (adRepository.hasOpportunityId(byteString2)) {
                new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED, LoadResult.MSG_OPPORTUNITY_ID_USED, null, "opportunity_id_used", null, null, 52, null);
            }
            LegacyLoadUseCase legacyLoadUseCase = this.this$0;
            str = legacyLoadUseCase.adMarkup;
            headerBiddingAdMarkup = legacyLoadUseCase.getHeaderBiddingAdMarkup(str);
            if (headerBiddingAdMarkup == null) {
                ErrorOuterClass.PublicErrorCode publicErrorCode = ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_ADVIEWER;
                return new LoadResult.Failure(publicErrorCode, UnityAdsErrorKt.getLoadErrorMsg(publicErrorCode), null, "invalid_admarkup", null, null, 52, null);
            }
            getInitializationState = this.this$0.getInitializationState;
            int i3 = WhenMappings.$EnumSwitchMapping$0[GetInitializationState.DefaultImpls.invoke$default(getInitializationState, false, 1, null).ordinal()];
            if (i3 == 1) {
                load = this.this$0.load;
                Context context = this.$context;
                String str2 = this.$placement;
                if (str2 == null) {
                    str2 = "";
                }
                AdRequestOuterClass.BannerSize bannerSize = this.$gatewayBannerSize;
                UnityAdsLoadOptions unityAdsLoadOptions = this.$loadOptions;
                this.label = 1;
                invoke = load.invoke(context, str2, byteString2, headerBiddingAdMarkup, bannerSize, unityAdsLoadOptions, this);
            } else {
                if (i3 == 2) {
                    sessionRepository = this.this$0.sessionRepository;
                    InitializationException initializationError = sessionRepository.getInitializationError();
                    if (initializationError == null) {
                        return new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NOT_INITIALIZED, UnityAdsErrorKt.MSG_BOLD_LOAD_FAIL_SDK_NOT_INITIALIZED, null, "not_initialized", null, null, 52, null);
                    }
                    ErrorOuterClass.PublicErrorCode errorCode = initializationError.getErrorCode();
                    if (errorCode == null) {
                        errorCode = ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED;
                    }
                    return new LoadResult.Failure(errorCode, initializationError.getMessage(), null, initializationError.getReason(), null, null, 52, null);
                }
                if (i3 == 3) {
                    return new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NOT_INITIALIZED, UnityAdsErrorKt.MSG_BOLD_LOAD_FAIL_SDK_NOT_INITIALIZED, null, "not_initialized", null, null, 52, null);
                }
                if (i3 != 4) {
                    zzl.b();
                    return null;
                }
                awaitInitialization = this.this$0.awaitInitialization;
                this.L$0 = byteString2;
                this.L$1 = headerBiddingAdMarkup;
                this.label = 2;
                invoke$default = AwaitInitialization.DefaultImpls.invoke$default(awaitInitialization, 0L, this, 1, null);
                if (invoke$default != lu3Var) {
                    byteString = byteString2;
                    headerBiddingAdMarkup2 = headerBiddingAdMarkup;
                    InitializationState initializationState = (InitializationState) invoke$default;
                    if (initializationState != null) {
                    }
                    if (i == 1) {
                    }
                }
            }
            return lu3Var;
        }
        if (i2 == 1) {
            y6a.M(obj);
            invoke = obj;
            return (LoadResult) invoke;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
            invoke2 = obj;
            return (LoadResult) invoke2;
        }
        HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup3 = (HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup) this.L$1;
        ByteString byteString3 = (ByteString) this.L$0;
        y6a.M(obj);
        headerBiddingAdMarkup2 = headerBiddingAdMarkup3;
        byteString = byteString3;
        invoke$default = obj;
        InitializationState initializationState2 = (InitializationState) invoke$default;
        i = initializationState2 != null ? -1 : WhenMappings.$EnumSwitchMapping$0[initializationState2.ordinal()];
        if (i == 1) {
            if (i != 2) {
                return new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_TIMEOUT, UnityAdsErrorKt.MSG_BOLD_LOAD_FAIL_TIME_OUT, null, "timeout_initialization", null, null, 52, null);
            }
            sessionRepository2 = this.this$0.sessionRepository;
            InitializationException initializationError2 = sessionRepository2.getInitializationError();
            if (initializationError2 == null) {
                return new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NOT_INITIALIZED, UnityAdsErrorKt.MSG_BOLD_LOAD_FAIL_SDK_NOT_INITIALIZED, null, "not_initialized", null, null, 52, null);
            }
            ErrorOuterClass.PublicErrorCode errorCode2 = initializationError2.getErrorCode();
            if (errorCode2 == null) {
                errorCode2 = ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED;
            }
            return new LoadResult.Failure(errorCode2, initializationError2.getMessage(), null, initializationError2.getReason(), null, null, 52, null);
        }
        load2 = this.this$0.load;
        Context context2 = this.$context;
        String str3 = this.$placement;
        if (str3 == null) {
            str3 = "";
        }
        AdRequestOuterClass.BannerSize bannerSize2 = this.$gatewayBannerSize;
        UnityAdsLoadOptions unityAdsLoadOptions2 = this.$loadOptions;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 3;
        invoke2 = load2.invoke(context2, str3, byteString, headerBiddingAdMarkup2, bannerSize2, unityAdsLoadOptions2, this);
    }
}
