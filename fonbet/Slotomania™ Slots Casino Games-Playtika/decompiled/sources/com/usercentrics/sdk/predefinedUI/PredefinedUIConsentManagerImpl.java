package com.usercentrics.sdk.predefinedUI;

import com.usercentrics.sdk.UserDecision;
import com.usercentrics.sdk.UsercentricsAnalyticsEventType;
import com.usercentrics.sdk.UsercentricsSDK;
import com.usercentrics.sdk.UsercentricsServiceConsent;
import com.usercentrics.sdk.models.common.UsercentricsVariant;
import com.usercentrics.sdk.models.settings.PredefinedUIDecision;
import com.usercentrics.sdk.models.settings.ServicesIdStrategy;
import com.usercentrics.sdk.models.settings.UsercentricsConsentType;
import com.usercentrics.sdk.services.tcf.TCFDecisionUILayer;
import com.usercentrics.sdk.services.tcf.interfaces.TCFUserDecisions;
import com.usercentrics.sdk.ui.PredefinedUIInteraction;
import com.usercentrics.sdk.ui.PredefinedUIResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PredefinedUIConsentManagerImpl.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010\u0012\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u001e\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000eH\u0016J\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000eH\u0002J&\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/usercentrics/sdk/predefinedUI/PredefinedUIConsentManagerImpl;", "Lcom/usercentrics/sdk/predefinedUI/PredefinedUIConsentManager;", "usercentricsSDK", "Lcom/usercentrics/sdk/UsercentricsSDK;", "variant", "Lcom/usercentrics/sdk/models/common/UsercentricsVariant;", "controllerId", "", "(Lcom/usercentrics/sdk/UsercentricsSDK;Lcom/usercentrics/sdk/models/common/UsercentricsVariant;Ljava/lang/String;)V", "acceptAll", "Lcom/usercentrics/sdk/ui/PredefinedUIResponse;", "fromLayer", "Lcom/usercentrics/sdk/services/tcf/TCFDecisionUILayer;", "acceptAllCCPA", "", "Lcom/usercentrics/sdk/UsercentricsServiceConsent;", "acceptAllDefault", "acceptAllTCF", "close", "denyAll", "denyAllCCPA", "denyAllDefault", "denyAllTCF", "save", "userDecisions", "Lcom/usercentrics/sdk/models/settings/PredefinedUIDecision;", "saveDecisionsDefault", "saveDecisionsTCF", "trackAnalyticsEvent", "", "eventType", "Lcom/usercentrics/sdk/UsercentricsAnalyticsEventType;", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PredefinedUIConsentManagerImpl implements PredefinedUIConsentManager {
    private final String controllerId;
    private final UsercentricsSDK usercentricsSDK;
    private final UsercentricsVariant variant;

    /* compiled from: PredefinedUIConsentManagerImpl.kt */
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
                iArr[UsercentricsVariant.CCPA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UsercentricsVariant.TCF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PredefinedUIConsentManagerImpl(UsercentricsSDK usercentricsSDK, UsercentricsVariant variant, String controllerId) {
        Intrinsics.checkNotNullParameter(usercentricsSDK, "usercentricsSDK");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(controllerId, "controllerId");
        this.usercentricsSDK = usercentricsSDK;
        this.variant = variant;
        this.controllerId = controllerId;
    }

    @Override // com.usercentrics.sdk.predefinedUI.PredefinedUIConsentManager
    public PredefinedUIResponse acceptAll(TCFDecisionUILayer fromLayer) {
        List<UsercentricsServiceConsent> acceptAllDefault;
        UsercentricsAnalyticsEventType usercentricsAnalyticsEventType;
        Intrinsics.checkNotNullParameter(fromLayer, "fromLayer");
        int i = WhenMappings.$EnumSwitchMapping$0[this.variant.ordinal()];
        if (i == 1) {
            acceptAllDefault = acceptAllDefault();
        } else if (i == 2) {
            acceptAllDefault = acceptAllCCPA();
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            acceptAllDefault = acceptAllTCF(fromLayer);
        }
        if (fromLayer == TCFDecisionUILayer.FIRST_LAYER) {
            usercentricsAnalyticsEventType = UsercentricsAnalyticsEventType.ACCEPT_ALL_FIRST_LAYER;
        } else {
            usercentricsAnalyticsEventType = UsercentricsAnalyticsEventType.ACCEPT_ALL_SECOND_LAYER;
        }
        trackAnalyticsEvent(usercentricsAnalyticsEventType);
        return new PredefinedUIResponse(PredefinedUIInteraction.ACCEPT_ALL, acceptAllDefault, this.controllerId);
    }

    private final List<UsercentricsServiceConsent> acceptAllDefault() {
        return this.usercentricsSDK.acceptAll(UsercentricsConsentType.EXPLICIT);
    }

    private final List<UsercentricsServiceConsent> acceptAllCCPA() {
        return this.usercentricsSDK.saveOptOutForCCPA(false, UsercentricsConsentType.EXPLICIT);
    }

    private final List<UsercentricsServiceConsent> acceptAllTCF(TCFDecisionUILayer fromLayer) {
        UsercentricsSDK usercentricsSDK = this.usercentricsSDK;
        if (fromLayer == null) {
            fromLayer = TCFDecisionUILayer.FIRST_LAYER;
        }
        return usercentricsSDK.acceptAllForTCF(fromLayer, UsercentricsConsentType.EXPLICIT);
    }

    @Override // com.usercentrics.sdk.predefinedUI.PredefinedUIConsentManager
    public PredefinedUIResponse denyAll(TCFDecisionUILayer fromLayer) {
        List<UsercentricsServiceConsent> denyAllDefault;
        UsercentricsAnalyticsEventType usercentricsAnalyticsEventType;
        Intrinsics.checkNotNullParameter(fromLayer, "fromLayer");
        int i = WhenMappings.$EnumSwitchMapping$0[this.variant.ordinal()];
        if (i == 1) {
            denyAllDefault = denyAllDefault();
        } else if (i == 2) {
            denyAllDefault = denyAllCCPA();
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            denyAllDefault = denyAllTCF(fromLayer);
        }
        if (fromLayer == TCFDecisionUILayer.FIRST_LAYER) {
            usercentricsAnalyticsEventType = UsercentricsAnalyticsEventType.DENY_ALL_FIRST_LAYER;
        } else {
            usercentricsAnalyticsEventType = UsercentricsAnalyticsEventType.DENY_ALL_SECOND_LAYER;
        }
        trackAnalyticsEvent(usercentricsAnalyticsEventType);
        return new PredefinedUIResponse(PredefinedUIInteraction.DENY_ALL, denyAllDefault, this.controllerId);
    }

    private final List<UsercentricsServiceConsent> denyAllDefault() {
        return this.usercentricsSDK.denyAll(UsercentricsConsentType.EXPLICIT);
    }

    private final List<UsercentricsServiceConsent> denyAllCCPA() {
        return this.usercentricsSDK.saveOptOutForCCPA(true, UsercentricsConsentType.EXPLICIT);
    }

    private final List<UsercentricsServiceConsent> denyAllTCF(TCFDecisionUILayer fromLayer) {
        UsercentricsSDK usercentricsSDK = this.usercentricsSDK;
        if (fromLayer == null) {
            fromLayer = TCFDecisionUILayer.FIRST_LAYER;
        }
        return usercentricsSDK.denyAllForTCF(fromLayer, UsercentricsConsentType.EXPLICIT);
    }

    @Override // com.usercentrics.sdk.predefinedUI.PredefinedUIConsentManager
    public PredefinedUIResponse save(TCFDecisionUILayer fromLayer, List<PredefinedUIDecision> userDecisions) {
        List<UsercentricsServiceConsent> saveDecisionsDefault;
        UsercentricsAnalyticsEventType usercentricsAnalyticsEventType;
        Intrinsics.checkNotNullParameter(fromLayer, "fromLayer");
        Intrinsics.checkNotNullParameter(userDecisions, "userDecisions");
        userDecisions.isEmpty();
        int i = WhenMappings.$EnumSwitchMapping$0[this.variant.ordinal()];
        if (i == 1) {
            saveDecisionsDefault = saveDecisionsDefault(userDecisions);
        } else if (i == 2) {
            saveDecisionsDefault = saveDecisionsDefault(userDecisions);
        } else if (i == 3) {
            saveDecisionsDefault = saveDecisionsTCF(userDecisions, fromLayer);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (fromLayer == TCFDecisionUILayer.FIRST_LAYER) {
            usercentricsAnalyticsEventType = UsercentricsAnalyticsEventType.SAVE_FIRST_LAYER;
        } else {
            usercentricsAnalyticsEventType = UsercentricsAnalyticsEventType.SAVE_SECOND_LAYER;
        }
        trackAnalyticsEvent(usercentricsAnalyticsEventType);
        return new PredefinedUIResponse(PredefinedUIInteraction.GRANULAR, saveDecisionsDefault, this.controllerId);
    }

    private final List<UsercentricsServiceConsent> saveDecisionsDefault(List<PredefinedUIDecision> userDecisions) {
        return this.usercentricsSDK.saveDecisions(ServicesIdStrategy.INSTANCE.userDecisionsGDPR(userDecisions), UsercentricsConsentType.EXPLICIT);
    }

    private final List<UsercentricsServiceConsent> saveDecisionsTCF(List<PredefinedUIDecision> userDecisions, TCFDecisionUILayer fromLayer) {
        UsercentricsSDK usercentricsSDK = this.usercentricsSDK;
        TCFUserDecisions userDecisionsTCF = ServicesIdStrategy.INSTANCE.userDecisionsTCF(userDecisions);
        List<UserDecision> userDecisionsGDPR = ServicesIdStrategy.INSTANCE.userDecisionsGDPR(userDecisions);
        if (fromLayer == null) {
            fromLayer = TCFDecisionUILayer.FIRST_LAYER;
        }
        return usercentricsSDK.saveDecisionsForTCF(userDecisionsTCF, fromLayer, userDecisionsGDPR, UsercentricsConsentType.EXPLICIT);
    }

    @Override // com.usercentrics.sdk.predefinedUI.PredefinedUIConsentManager
    public PredefinedUIResponse close() {
        return new PredefinedUIResponse(PredefinedUIInteraction.NO_INTERACTION, this.usercentricsSDK.getConsents(), this.controllerId);
    }

    private final void trackAnalyticsEvent(UsercentricsAnalyticsEventType eventType) {
        this.usercentricsSDK.track(eventType);
    }
}
