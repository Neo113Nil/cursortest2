package com.usercentrics.sdk.services.settings;

import com.usercentrics.sdk.core.settings.SettingsInitializationParameters;
import com.usercentrics.sdk.errors.NotInitializedException;
import com.usercentrics.sdk.models.settings.LegacyConsent;
import com.usercentrics.sdk.models.settings.LegacyExtendedSettings;
import com.usercentrics.sdk.models.settings.LegacyService;
import com.usercentrics.sdk.models.tcf.TCFUISettings;
import com.usercentrics.sdk.v2.settings.data.CCPASettings;
import com.usercentrics.sdk.v2.settings.facade.ISettingsFacade;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SettingsLegacy.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u000f\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\bH\u0016J$\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\fH\u0016J\b\u0010\u0016\u001a\u00020\fH\u0016J\b\u0010\u0017\u001a\u00020\fH\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016J\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Lcom/usercentrics/sdk/services/settings/SettingsLegacy;", "Lcom/usercentrics/sdk/services/settings/ISettingsLegacy;", "settingsFacade", "Lcom/usercentrics/sdk/v2/settings/facade/ISettingsFacade;", "generatorIds", "Lcom/usercentrics/sdk/services/settings/IGeneratorIds;", "(Lcom/usercentrics/sdk/v2/settings/facade/ISettingsFacade;Lcom/usercentrics/sdk/services/settings/IGeneratorIds;)V", "settings", "Lcom/usercentrics/sdk/models/settings/LegacyExtendedSettings;", "clearConsents", "", "getCCPAIABAgreementExists", "", "()Ljava/lang/Boolean;", "getSettings", "initSettings", "Lkotlin/Result;", "settingsInitParameters", "Lcom/usercentrics/sdk/core/settings/SettingsInitializationParameters;", "initSettings-gIAlu-s", "(Lcom/usercentrics/sdk/core/settings/SettingsInitializationParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isAdditionalConsentModeEnabled", "isCCPAEnabled", "isTCFEnabled", "selectedAdTechProviders", "", "", "setControllerId", "controllerId", "", "setSettings", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SettingsLegacy implements ISettingsLegacy {
    private final IGeneratorIds generatorIds;
    private LegacyExtendedSettings settings;
    private final ISettingsFacade settingsFacade;

    public SettingsLegacy(ISettingsFacade settingsFacade, IGeneratorIds generatorIds) {
        Intrinsics.checkNotNullParameter(settingsFacade, "settingsFacade");
        Intrinsics.checkNotNullParameter(generatorIds, "generatorIds");
        this.settingsFacade = settingsFacade;
        this.generatorIds = generatorIds;
        this.settings = new LegacyExtendedSettings(null, null, null, null, null, null, false, null, null, null, null, null, null, null, 16383, null);
    }

    @Override // com.usercentrics.sdk.services.settings.ISettingsLegacy
    public void setSettings(LegacyExtendedSettings settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.settings = settings;
    }

    @Override // com.usercentrics.sdk.services.settings.ISettingsLegacy
    public void setControllerId(String controllerId) {
        LegacyExtendedSettings copy;
        Intrinsics.checkNotNullParameter(controllerId, "controllerId");
        copy = r2.copy((r29 & 1) != 0 ? r2.categories : null, (r29 & 2) != 0 ? r2.services : null, (r29 & 4) != 0 ? r2.gdpr : null, (r29 & 8) != 0 ? r2.ccpa : null, (r29 & 16) != 0 ? r2.controllerId : controllerId, (r29 & 32) != 0 ? r2.id : null, (r29 & 64) != 0 ? r2.isTcfEnabled : false, (r29 & 128) != 0 ? r2.showFirstLayerOnVersionChange : null, (r29 & 256) != 0 ? r2.tcfui : null, (r29 & 512) != 0 ? r2.ui : null, (r29 & 1024) != 0 ? r2.version : null, (r29 & 2048) != 0 ? r2.framework : null, (r29 & 4096) != 0 ? r2.restoredSessionLastInteractionTimestamp : null, (r29 & 8192) != 0 ? this.settings.renewConsentsTimestampInSeconds : null);
        setSettings(copy);
    }

    @Override // com.usercentrics.sdk.services.settings.ISettingsLegacy
    public LegacyExtendedSettings getSettings() {
        return this.settings;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0059 A[Catch: Exception -> 0x009b, CancellationException -> 0x00b8, TryCatch #2 {CancellationException -> 0x00b8, Exception -> 0x009b, blocks: (B:11:0x002e, B:12:0x0053, B:14:0x0059, B:17:0x0081, B:22:0x0043), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081 A[Catch: Exception -> 0x009b, CancellationException -> 0x00b8, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00b8, Exception -> 0x009b, blocks: (B:11:0x002e, B:12:0x0053, B:14:0x0059, B:17:0x0081, B:22:0x0043), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // com.usercentrics.sdk.services.settings.ISettingsLegacy
    /* renamed from: initSettings-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo10603initSettingsgIAlus(SettingsInitializationParameters settingsInitializationParameters, Continuation<? super Result<Unit>> continuation) {
        SettingsLegacy$initSettings$1 settingsLegacy$initSettings$1;
        int i;
        Object mo10625loadSettingsgIAlus;
        SettingsLegacy settingsLegacy;
        Throwable m11183exceptionOrNullimpl;
        LegacyExtendedSettings copy;
        try {
            if (continuation instanceof SettingsLegacy$initSettings$1) {
                settingsLegacy$initSettings$1 = (SettingsLegacy$initSettings$1) continuation;
                if ((settingsLegacy$initSettings$1.label & Integer.MIN_VALUE) != 0) {
                    settingsLegacy$initSettings$1.label -= Integer.MIN_VALUE;
                    Object obj = settingsLegacy$initSettings$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = settingsLegacy$initSettings$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        ISettingsFacade iSettingsFacade = this.settingsFacade;
                        settingsLegacy$initSettings$1.L$0 = this;
                        settingsLegacy$initSettings$1.label = 1;
                        mo10625loadSettingsgIAlus = iSettingsFacade.mo10625loadSettingsgIAlus(settingsInitializationParameters, settingsLegacy$initSettings$1);
                        if (mo10625loadSettingsgIAlus == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        settingsLegacy = this;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        settingsLegacy = (SettingsLegacy) settingsLegacy$initSettings$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        mo10625loadSettingsgIAlus = ((Result) obj).getValue();
                    }
                    m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(mo10625loadSettingsgIAlus);
                    if (m11183exceptionOrNullimpl != null) {
                        copy = r4.copy((r29 & 1) != 0 ? r4.categories : null, (r29 & 2) != 0 ? r4.services : null, (r29 & 4) != 0 ? r4.gdpr : null, (r29 & 8) != 0 ? r4.ccpa : null, (r29 & 16) != 0 ? r4.controllerId : null, (r29 & 32) != 0 ? r4.id : null, (r29 & 64) != 0 ? r4.isTcfEnabled : false, (r29 & 128) != 0 ? r4.showFirstLayerOnVersionChange : null, (r29 & 256) != 0 ? r4.tcfui : null, (r29 & 512) != 0 ? r4.ui : null, (r29 & 1024) != 0 ? r4.version : null, (r29 & 2048) != 0 ? r4.framework : null, (r29 & 4096) != 0 ? r4.restoredSessionLastInteractionTimestamp : null, (r29 & 8192) != 0 ? ((LegacyExtendedSettings) mo10625loadSettingsgIAlus).renewConsentsTimestampInSeconds : null);
                        settingsLegacy.setSettings(copy);
                        Result.Companion companion = Result.INSTANCE;
                        return Result.m11180constructorimpl(Unit.INSTANCE);
                    }
                    Result.Companion companion2 = Result.INSTANCE;
                    return Result.m11180constructorimpl(ResultKt.createFailure(new NotInitializedException(String.valueOf(m11183exceptionOrNullimpl.getMessage()), m11183exceptionOrNullimpl)));
                }
            }
            if (i != 0) {
            }
            m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(mo10625loadSettingsgIAlus);
            if (m11183exceptionOrNullimpl != null) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m11180constructorimpl(ResultKt.createFailure(new NotInitializedException(String.valueOf(e2.getMessage()), e2)));
        }
        settingsLegacy$initSettings$1 = new SettingsLegacy$initSettings$1(this, continuation);
        Object obj2 = settingsLegacy$initSettings$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = settingsLegacy$initSettings$1.label;
    }

    @Override // com.usercentrics.sdk.services.settings.ISettingsLegacy
    public boolean isTCFEnabled() {
        return this.settings.isTcfEnabled();
    }

    @Override // com.usercentrics.sdk.services.settings.ISettingsLegacy
    public boolean isAdditionalConsentModeEnabled() {
        TCFUISettings tcfui = this.settings.getTcfui();
        if (tcfui != null) {
            return tcfui.getIsAdditionalConsentModeEnabled();
        }
        return false;
    }

    @Override // com.usercentrics.sdk.services.settings.ISettingsLegacy
    public List<Integer> selectedAdTechProviders() {
        List<Integer> selectedAdTechProvidersIds;
        TCFUISettings tcfui = this.settings.getTcfui();
        return (tcfui == null || (selectedAdTechProvidersIds = tcfui.getSelectedAdTechProvidersIds()) == null) ? CollectionsKt.emptyList() : selectedAdTechProvidersIds;
    }

    @Override // com.usercentrics.sdk.services.settings.ISettingsLegacy
    public boolean isCCPAEnabled() {
        CCPASettings ccpa = this.settings.getCcpa();
        if (ccpa != null) {
            return ccpa.isActive();
        }
        return false;
    }

    @Override // com.usercentrics.sdk.services.settings.ISettingsLegacy
    public Boolean getCCPAIABAgreementExists() {
        CCPASettings ccpa = this.settings.getCcpa();
        if (ccpa != null) {
            return Boolean.valueOf(ccpa.getIabAgreementExists());
        }
        return null;
    }

    @Override // com.usercentrics.sdk.services.settings.ISettingsLegacy
    public void clearConsents() {
        LegacyExtendedSettings legacyExtendedSettings = this.settings;
        legacyExtendedSettings.setControllerId(this.generatorIds.generateControllerId());
        Iterator<T> it = legacyExtendedSettings.getServices().iterator();
        while (it.hasNext()) {
            ((LegacyService) it.next()).setConsent(new LegacyConsent(CollectionsKt.emptyList(), false));
        }
    }
}
