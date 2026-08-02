package com.unity3d.ads.core.data.repository;

import android.webkit.WebView;
import com.google.protobuf.ByteString;
import com.iab.omid.library.unity3d.adsession.AdSession;
import com.iab.omid.library.unity3d.adsession.AdSessionConfiguration;
import com.iab.omid.library.unity3d.adsession.AdSessionContext;
import com.iab.omid.library.unity3d.adsession.CreativeType;
import com.iab.omid.library.unity3d.adsession.ImpressionType;
import com.iab.omid.library.unity3d.adsession.Owner;
import com.iab.omid.library.unity3d.adsession.Partner;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.model.OMResult;
import com.unity3d.ads.core.data.model.OmidOptions;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import defpackage.a70;
import defpackage.f1d;
import defpackage.fdi;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "Lcom/unity3d/ads/core/data/model/OMResult;", "<anonymous>", "(Lku3;)Lcom/unity3d/ads/core/data/model/OMResult;"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$startSession$2", f = "AndroidOpenMeasurementRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class AndroidOpenMeasurementRepository$startSession$2 extends hoi implements Function2<ku3, rq3<? super OMResult>, Object> {
    final /* synthetic */ ByteString $opportunityId;
    final /* synthetic */ OmidOptions $options;
    final /* synthetic */ WebView $webView;
    int label;
    final /* synthetic */ AndroidOpenMeasurementRepository this$0;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CreativeType.values().length];
            try {
                iArr[CreativeType.HTML_DISPLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CreativeType.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidOpenMeasurementRepository$startSession$2(AndroidOpenMeasurementRepository androidOpenMeasurementRepository, ByteString byteString, OmidOptions omidOptions, WebView webView, rq3<? super AndroidOpenMeasurementRepository$startSession$2> rq3Var) {
        super(2, rq3Var);
        this.this$0 = androidOpenMeasurementRepository;
        this.$opportunityId = byteString;
        this.$options = omidOptions;
        this.$webView = webView;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new AndroidOpenMeasurementRepository$startSession$2(this.this$0, this.$opportunityId, this.$options, this.$webView, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super OMResult> rq3Var) {
        return ((AndroidOpenMeasurementRepository$startSession$2) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        f1d f1dVar;
        OmidManager omidManager;
        OmidManager omidManager2;
        Partner partner;
        AdSessionContext createHtmlAdSessionContext;
        OmidManager omidManager3;
        OmidManager omidManager4;
        Partner partner2;
        lu3 lu3Var = lu3.a;
        if (this.label != 0) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        try {
            if (!this.this$0.isOMActive()) {
                return new OMResult.Failure("om_not_active", null, 2, null);
            }
            f1dVar = this.this$0.activeSessions;
            if (((Map) ((fdi) f1dVar).getValue()).containsKey(this.$opportunityId.toStringUtf8())) {
                return new OMResult.Failure("om_session_already_exists", null, 2, null);
            }
            CreativeType creativeType = this.$options.getCreativeType();
            if (creativeType == null) {
                return new OMResult.Failure("om_creative_type_null", null, 2, null);
            }
            omidManager = this.this$0.omidManager;
            ImpressionType impressionType = this.$options.getImpressionType();
            if (impressionType == null) {
                impressionType = ImpressionType.DEFINED_BY_JAVASCRIPT;
            }
            ImpressionType impressionType2 = impressionType;
            Owner impressionOwner = this.$options.getImpressionOwner();
            if (impressionOwner == null) {
                impressionOwner = Owner.JAVASCRIPT;
            }
            Owner owner = impressionOwner;
            Owner videoEventsOwner = this.$options.getVideoEventsOwner();
            if (videoEventsOwner == null) {
                videoEventsOwner = Owner.JAVASCRIPT;
            }
            AdSessionConfiguration createAdSessionConfiguration = omidManager.createAdSessionConfiguration(creativeType, impressionType2, owner, videoEventsOwner, this.$options.getIsolateVerificationScripts());
            int i = WhenMappings.$EnumSwitchMapping$0[creativeType.ordinal()];
            if (i == 1) {
                omidManager2 = this.this$0.omidManager;
                partner = this.this$0.partner;
                createHtmlAdSessionContext = omidManager2.createHtmlAdSessionContext(partner, this.$webView, null, this.$options.getCustomReferenceData());
            } else {
                if (i != 2) {
                    return new OMResult.Failure("om_creative_type_invalid", null, 2, null);
                }
                omidManager4 = this.this$0.omidManager;
                partner2 = this.this$0.partner;
                createHtmlAdSessionContext = omidManager4.createJavaScriptAdSessionContext(partner2, this.$webView, null, this.$options.getCustomReferenceData());
            }
            omidManager3 = this.this$0.omidManager;
            AdSession createAdSession = omidManager3.createAdSession(createAdSessionConfiguration, createHtmlAdSessionContext);
            createAdSession.registerAdView(this.$webView);
            createAdSession.start();
            this.this$0.addSession(this.$opportunityId, createAdSession);
            return OMResult.Success.INSTANCE;
        } catch (Throwable th) {
            return new OMResult.Failure("uncaught_exception", ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null));
        }
    }
}
