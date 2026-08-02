package com.usercentrics.sdk.services.tcf;

import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.usercentrics.sdk.services.deviceStorage.models.StorageVendor;
import com.usercentrics.sdk.services.tcf.interfaces.TCFData;
import com.usercentrics.sdk.services.tcf.interfaces.TCFUserDecisions;
import io.sentry.protocol.Device;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: TCFUseCase.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\b\u001a\u00020\tH¦@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0003H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u000fH&J\b\u0010\u0011\u001a\u00020\u000fH&J\b\u0010\u0012\u001a\u00020\u000fH&J\b\u0010\u0013\u001a\u00020\u000fH&J\b\u0010\u0014\u001a\u00020\u000fH&J\b\u0010\u0015\u001a\u00020\u0016H&J\b\u0010\u0017\u001a\u00020\u0016H&J\b\u0010\u0018\u001a\u00020\u0019H&J$\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\u001b\u001a\u00020\tH¦@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u000bJ,\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\"0!H&J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0016H&J\u0018\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020'2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010(\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\tH&\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Lcom/usercentrics/sdk/services/tcf/TCFUseCase;", "", "acceptAllDisclosed", "", "fromLayer", "Lcom/usercentrics/sdk/services/tcf/TCFDecisionUILayer;", "changeLanguage", "Lkotlin/Result;", Device.JsonKeys.LANGUAGE, "", "changeLanguage-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearTCFConsentsData", "denyAllDisclosed", "getGdprAppliesOnTCF", "", "getHideNonIabOnFirstLayer", "getResurfaceATPChanged", "getResurfacePeriodEnded", "getResurfacePurposeChanged", "getResurfaceVendorAdded", "getSettingsTCFPolicyVersion", "", "getStoredTcStringPolicyVersion", "getTCFData", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;", MobileAdsBridgeBase.initializeMethodName, "settingsId", "initialize-gIAlu-s", "restore", "tcString", "acString", "vendorsDisclosed", "", "Lcom/usercentrics/sdk/services/deviceStorage/models/StorageVendor;", "setCmpId", "id", "updateChoices", "decisions", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFUserDecisions;", "updateIABTCFKeys", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface TCFUseCase {
    void acceptAllDisclosed(TCFDecisionUILayer fromLayer);

    /* renamed from: changeLanguage-gIAlu-s */
    Object mo10608changeLanguagegIAlus(String str, Continuation<? super Result<Unit>> continuation);

    void clearTCFConsentsData();

    void denyAllDisclosed(TCFDecisionUILayer fromLayer);

    boolean getGdprAppliesOnTCF();

    boolean getHideNonIabOnFirstLayer();

    boolean getResurfaceATPChanged();

    boolean getResurfacePeriodEnded();

    boolean getResurfacePurposeChanged();

    boolean getResurfaceVendorAdded();

    int getSettingsTCFPolicyVersion();

    int getStoredTcStringPolicyVersion();

    TCFData getTCFData();

    /* renamed from: initialize-gIAlu-s */
    Object mo10609initializegIAlus(String str, Continuation<? super Result<Unit>> continuation);

    void restore(String tcString, String acString, Map<Integer, StorageVendor> vendorsDisclosed);

    void setCmpId(int id);

    void updateChoices(TCFUserDecisions decisions, TCFDecisionUILayer fromLayer);

    void updateIABTCFKeys(String tcString);
}
