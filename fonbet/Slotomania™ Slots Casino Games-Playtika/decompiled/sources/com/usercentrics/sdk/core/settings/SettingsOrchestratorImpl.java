package com.usercentrics.sdk.core.settings;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.usercentrics.sdk.Observable;
import com.usercentrics.sdk.UsercentricsOptions;
import com.usercentrics.sdk.acm.service.AdditionalConsentModeService;
import com.usercentrics.sdk.core.application.MainApplication;
import com.usercentrics.sdk.core.settings.SettingsOrchestrator;
import com.usercentrics.sdk.errors.UsercentricsException;
import com.usercentrics.sdk.log.UsercentricsLogger;
import com.usercentrics.sdk.models.api.ApiConstants;
import com.usercentrics.sdk.models.api.ApiErrors;
import com.usercentrics.sdk.models.settings.LegacyExtendedSettings;
import com.usercentrics.sdk.models.settings.PredefinedUILanguage;
import com.usercentrics.sdk.services.ccpa.ICcpa;
import com.usercentrics.sdk.services.deviceStorage.DeviceStorage;
import com.usercentrics.sdk.services.initialValues.InitialValuesStrategy;
import com.usercentrics.sdk.services.settings.ISettingsLegacy;
import com.usercentrics.sdk.services.tcf.TCFUseCase;
import com.usercentrics.sdk.v2.location.data.LocationAwareResponse;
import com.usercentrics.sdk.v2.location.service.ILocationService;
import com.usercentrics.sdk.v2.ruleset.data.SessionGeoRule;
import com.usercentrics.sdk.v2.ruleset.service.IRuleSetService;
import io.sentry.protocol.Device;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.JobKt;

/* compiled from: SettingsOrchestratorImpl.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0096@¢\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\u001dH\u0002J$\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0#2\u0006\u0010$\u001a\u00020\u0006H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&J\b\u0010'\u001a\u00020\u001dH\u0002J$\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001d0#2\u0006\u0010$\u001a\u00020\u0006H\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010&J\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001d0#H\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,J$\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001d0#2\u0006\u0010$\u001a\u00020\u0006H\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010&J,\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001d0#2\u0006\u00100\u001a\u0002012\u0006\u0010$\u001a\u00020\u0006H\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u00122\u0006\u00105\u001a\u00020\u0006H\u0016J\u0010\u00106\u001a\u00020\u00122\u0006\u00105\u001a\u00020\u0006H\u0016J.\u00107\u001a\b\u0012\u0004\u0012\u00020\u001d0#2\u0006\u0010$\u001a\u00020\u00062\b\u00105\u001a\u0004\u0018\u00010\u0006H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b8\u00109J2\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001d0#2\u0006\u0010$\u001a\u00020\u00062\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00060<H\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b=\u0010>J\u001e\u0010\t\u001a\u00020\u001d2\u0006\u0010?\u001a\u00020\u00062\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0002J\u0016\u0010A\u001a\u00020\u001d2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00060<H\u0002J\b\u0010B\u001a\u00020\u001dH\u0002J\b\u0010C\u001a\u00020\u001dH\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\b\"\u0004\b\u000f\u0010\nR\u000e\u0010\u0010\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0012X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006D"}, d2 = {"Lcom/usercentrics/sdk/core/settings/SettingsOrchestratorImpl;", "Lcom/usercentrics/sdk/core/settings/SettingsOrchestrator;", "application", "Lcom/usercentrics/sdk/core/application/MainApplication;", "(Lcom/usercentrics/sdk/core/application/MainApplication;)V", "activeSettingsId", "", "getActiveSettingsId", "()Ljava/lang/String;", "setActiveSettingsId", "(Ljava/lang/String;)V", "allSettingsIds", "", "jsonFileLanguage", "getJsonFileLanguage", "setJsonFileLanguage", "jsonFileVersion", "languageEtagChanged", "", "noShow", "getNoShow", "()Z", "setNoShow", "(Z)V", "settingsIdObservable", "Lcom/usercentrics/sdk/Observable;", "getSettingsIdObservable", "()Lcom/usercentrics/sdk/Observable;", "boot", "", "options", "Lcom/usercentrics/sdk/UsercentricsOptions;", "(Lcom/usercentrics/sdk/UsercentricsOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkValidState", "coldInitialize", "Lkotlin/Result;", "controllerId", "coldInitialize-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteDeprecatedSettingsIds", "finishInitialization", "finishInitialization-gIAlu-s", "initAdditionalConsentMode", "initAdditionalConsentMode-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initSettingsCallback", "initSettingsCallback-gIAlu-s", "initTCFAndAdditionalConsentMode", "settingsInstance", "Lcom/usercentrics/sdk/services/settings/ISettingsLegacy;", "initTCFAndAdditionalConsentMode-0E7RQCE", "(Lcom/usercentrics/sdk/services/settings/ISettingsLegacy;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isLanguageAlreadySelected", Device.JsonKeys.LANGUAGE, "isLanguageAvailable", "loadSettings", "loadSettings-0E7RQCE", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadSettingsFromAdmin", "locationAwareResponse", "Lcom/usercentrics/sdk/v2/location/data/LocationAwareResponse;", "loadSettingsFromAdmin-0E7RQCE", "(Ljava/lang/String;Lcom/usercentrics/sdk/v2/location/data/LocationAwareResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "allSettingIds", "updateLocationServiceIfNeeded", "wipeLocalStorageForNonTCFSettingsId", "wipeStorage", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SettingsOrchestratorImpl implements SettingsOrchestrator {
    private String activeSettingsId;
    private Set<String> allSettingsIds;
    private final MainApplication application;
    private String jsonFileLanguage;
    private String jsonFileVersion;
    private boolean languageEtagChanged;
    private boolean noShow;
    private final Observable<String> settingsIdObservable;

    public SettingsOrchestratorImpl(MainApplication application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.application = application;
        this.jsonFileVersion = "";
        this.settingsIdObservable = new Observable<>();
        this.activeSettingsId = "";
        this.jsonFileLanguage = "";
        this.allSettingsIds = SetsKt.emptySet();
    }

    @Override // com.usercentrics.sdk.core.settings.SettingsOrchestrator
    public Observable<String> getSettingsIdObservable() {
        return this.settingsIdObservable;
    }

    @Override // com.usercentrics.sdk.core.settings.SettingsOrchestrator
    public String getActiveSettingsId() {
        return this.activeSettingsId;
    }

    public void setActiveSettingsId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.activeSettingsId = str;
    }

    @Override // com.usercentrics.sdk.core.settings.SettingsOrchestrator
    public String getJsonFileLanguage() {
        return this.jsonFileLanguage;
    }

    public void setJsonFileLanguage(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.jsonFileLanguage = str;
    }

    @Override // com.usercentrics.sdk.core.settings.SettingsOrchestrator
    public boolean getNoShow() {
        return this.noShow;
    }

    public void setNoShow(boolean z) {
        this.noShow = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.usercentrics.sdk.core.settings.SettingsOrchestrator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object boot(UsercentricsOptions usercentricsOptions, Continuation<? super Unit> continuation) {
        SettingsOrchestratorImpl$boot$1 settingsOrchestratorImpl$boot$1;
        int i;
        SettingsOrchestratorImpl settingsOrchestratorImpl;
        if (continuation instanceof SettingsOrchestratorImpl$boot$1) {
            settingsOrchestratorImpl$boot$1 = (SettingsOrchestratorImpl$boot$1) continuation;
            if ((settingsOrchestratorImpl$boot$1.label & Integer.MIN_VALUE) != 0) {
                settingsOrchestratorImpl$boot$1.label -= Integer.MIN_VALUE;
                Object obj = settingsOrchestratorImpl$boot$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = settingsOrchestratorImpl$boot$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    setJsonFileLanguage(usercentricsOptions.getDefaultLanguage());
                    String version = usercentricsOptions.getVersion();
                    if (StringsKt.isBlank(version)) {
                        version = ApiConstants.FALLBACK_VERSION;
                    }
                    this.jsonFileVersion = version;
                    String settingsId = usercentricsOptions.getSettingsId();
                    if (!StringsKt.isBlank(settingsId)) {
                        setActiveSettingsId(settingsId, SetsKt.setOf(settingsId));
                        return Unit.INSTANCE;
                    }
                    IRuleSetService value = this.application.getRuleSetService().getValue();
                    String ruleSetId = usercentricsOptions.getRuleSetId();
                    settingsOrchestratorImpl$boot$1.L$0 = this;
                    settingsOrchestratorImpl$boot$1.label = 1;
                    obj = value.getActiveSettingsId(ruleSetId, settingsOrchestratorImpl$boot$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    settingsOrchestratorImpl = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    settingsOrchestratorImpl = (SettingsOrchestratorImpl) settingsOrchestratorImpl$boot$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                SessionGeoRule sessionGeoRule = (SessionGeoRule) obj;
                settingsOrchestratorImpl.setActiveSettingsId(sessionGeoRule.getActiveSettingsId(), sessionGeoRule.getAllSettingsIds());
                settingsOrchestratorImpl.setNoShow(sessionGeoRule.getNoShow());
                settingsOrchestratorImpl.application.getLocationService().getValue().set(sessionGeoRule.getLocation());
                return Unit.INSTANCE;
            }
        }
        settingsOrchestratorImpl$boot$1 = new SettingsOrchestratorImpl$boot$1(this, continuation);
        Object obj2 = settingsOrchestratorImpl$boot$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = settingsOrchestratorImpl$boot$1.label;
        if (i != 0) {
        }
        SessionGeoRule sessionGeoRule2 = (SessionGeoRule) obj2;
        settingsOrchestratorImpl.setActiveSettingsId(sessionGeoRule2.getActiveSettingsId(), sessionGeoRule2.getAllSettingsIds());
        settingsOrchestratorImpl.setNoShow(sessionGeoRule2.getNoShow());
        settingsOrchestratorImpl.application.getLocationService().getValue().set(sessionGeoRule2.getLocation());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c6, code lost:
    
        if (r9 == r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.usercentrics.sdk.core.settings.SettingsOrchestrator
    /* renamed from: coldInitialize-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo10590coldInitializegIAlus(String str, Continuation<? super Result<Unit>> continuation) {
        SettingsOrchestratorImpl$coldInitialize$1 settingsOrchestratorImpl$coldInitialize$1;
        int i;
        Object mo10623resolveLanguageyxL6bBk;
        SettingsOrchestratorImpl settingsOrchestratorImpl;
        LocationAwareResponse<String> locationAwareResponse;
        Object m10602loadSettingsFromAdmin0E7RQCE;
        if (continuation instanceof SettingsOrchestratorImpl$coldInitialize$1) {
            settingsOrchestratorImpl$coldInitialize$1 = (SettingsOrchestratorImpl$coldInitialize$1) continuation;
            if ((settingsOrchestratorImpl$coldInitialize$1.label & Integer.MIN_VALUE) != 0) {
                settingsOrchestratorImpl$coldInitialize$1.label -= Integer.MIN_VALUE;
                SettingsOrchestratorImpl$coldInitialize$1 settingsOrchestratorImpl$coldInitialize$12 = settingsOrchestratorImpl$coldInitialize$1;
                Object obj = settingsOrchestratorImpl$coldInitialize$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = settingsOrchestratorImpl$coldInitialize$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    deleteDeprecatedSettingsIds();
                    boolean loadLocation = this.application.getLocationService().getValue().loadLocation();
                    settingsOrchestratorImpl$coldInitialize$12.L$0 = this;
                    settingsOrchestratorImpl$coldInitialize$12.L$1 = str;
                    settingsOrchestratorImpl$coldInitialize$12.label = 1;
                    mo10623resolveLanguageyxL6bBk = this.application.getLanguageFacade().getValue().mo10623resolveLanguageyxL6bBk(getActiveSettingsId(), this.jsonFileVersion, getJsonFileLanguage(), !loadLocation, settingsOrchestratorImpl$coldInitialize$12);
                    if (mo10623resolveLanguageyxL6bBk != coroutine_suspended) {
                        settingsOrchestratorImpl = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    m10602loadSettingsFromAdmin0E7RQCE = ((Result) obj).getValue();
                    Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m10602loadSettingsFromAdmin0E7RQCE);
                    if (m11183exceptionOrNullimpl != null) {
                        Result.Companion companion = Result.INSTANCE;
                        return Result.m11180constructorimpl(ResultKt.createFailure(m11183exceptionOrNullimpl));
                    }
                    Result.Companion companion2 = Result.INSTANCE;
                    return Result.m11180constructorimpl(Unit.INSTANCE);
                }
                str = (String) settingsOrchestratorImpl$coldInitialize$12.L$1;
                settingsOrchestratorImpl = (SettingsOrchestratorImpl) settingsOrchestratorImpl$coldInitialize$12.L$0;
                ResultKt.throwOnFailure(obj);
                mo10623resolveLanguageyxL6bBk = ((Result) obj).getValue();
                locationAwareResponse = (LocationAwareResponse) (!Result.m11186isFailureimpl(mo10623resolveLanguageyxL6bBk) ? null : mo10623resolveLanguageyxL6bBk);
                if (locationAwareResponse != null) {
                    Result.Companion companion3 = Result.INSTANCE;
                    UsercentricsException m11183exceptionOrNullimpl2 = Result.m11183exceptionOrNullimpl(mo10623resolveLanguageyxL6bBk);
                    if (m11183exceptionOrNullimpl2 == null) {
                        m11183exceptionOrNullimpl2 = new UsercentricsException(ApiErrors.FETCH_AVAILABLE_LANGUAGES, null, 2, null);
                    }
                    return Result.m11180constructorimpl(ResultKt.createFailure(m11183exceptionOrNullimpl2));
                }
                settingsOrchestratorImpl.languageEtagChanged = locationAwareResponse.getLanguageEtagChanged();
                settingsOrchestratorImpl$coldInitialize$12.L$0 = null;
                settingsOrchestratorImpl$coldInitialize$12.L$1 = null;
                settingsOrchestratorImpl$coldInitialize$12.label = 2;
                m10602loadSettingsFromAdmin0E7RQCE = settingsOrchestratorImpl.m10602loadSettingsFromAdmin0E7RQCE(str, locationAwareResponse, settingsOrchestratorImpl$coldInitialize$12);
            }
        }
        settingsOrchestratorImpl$coldInitialize$1 = new SettingsOrchestratorImpl$coldInitialize$1(this, continuation);
        SettingsOrchestratorImpl$coldInitialize$1 settingsOrchestratorImpl$coldInitialize$122 = settingsOrchestratorImpl$coldInitialize$1;
        Object obj2 = settingsOrchestratorImpl$coldInitialize$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = settingsOrchestratorImpl$coldInitialize$122.label;
        if (i != 0) {
        }
        locationAwareResponse = (LocationAwareResponse) (!Result.m11186isFailureimpl(mo10623resolveLanguageyxL6bBk) ? null : mo10623resolveLanguageyxL6bBk);
        if (locationAwareResponse != null) {
        }
    }

    private final void deleteDeprecatedSettingsIds() {
        this.application.getStorageInstance().getValue().deleteSettingsThatDoNotMatch(this.allSettingsIds);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.usercentrics.sdk.core.settings.SettingsOrchestrator
    /* renamed from: loadSettings-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo10591loadSettings0E7RQCE(String str, String str2, Continuation<? super Result<Unit>> continuation) {
        SettingsOrchestratorImpl$loadSettings$1 settingsOrchestratorImpl$loadSettings$1;
        int i;
        Object mo10603initSettingsgIAlus;
        SettingsOrchestratorImpl settingsOrchestratorImpl;
        Throwable m11183exceptionOrNullimpl;
        if (continuation instanceof SettingsOrchestratorImpl$loadSettings$1) {
            settingsOrchestratorImpl$loadSettings$1 = (SettingsOrchestratorImpl$loadSettings$1) continuation;
            if ((settingsOrchestratorImpl$loadSettings$1.label & Integer.MIN_VALUE) != 0) {
                settingsOrchestratorImpl$loadSettings$1.label -= Integer.MIN_VALUE;
                Object obj = settingsOrchestratorImpl$loadSettings$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = settingsOrchestratorImpl$loadSettings$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    SettingsInitializationParameters settingsInitializationParameters = new SettingsInitializationParameters(getActiveSettingsId(), this.jsonFileVersion, str2 == null ? getJsonFileLanguage() : str2, str, this.languageEtagChanged);
                    ISettingsLegacy value = this.application.getSettingsInstance().getValue();
                    settingsOrchestratorImpl$loadSettings$1.L$0 = this;
                    settingsOrchestratorImpl$loadSettings$1.L$1 = str2;
                    settingsOrchestratorImpl$loadSettings$1.label = 1;
                    mo10603initSettingsgIAlus = value.mo10603initSettingsgIAlus(settingsInitializationParameters, settingsOrchestratorImpl$loadSettings$1);
                    if (mo10603initSettingsgIAlus == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    settingsOrchestratorImpl = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (String) settingsOrchestratorImpl$loadSettings$1.L$1;
                    settingsOrchestratorImpl = (SettingsOrchestratorImpl) settingsOrchestratorImpl$loadSettings$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    mo10603initSettingsgIAlus = ((Result) obj).getValue();
                }
                m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(mo10603initSettingsgIAlus);
                if (m11183exceptionOrNullimpl == null) {
                    Result.Companion companion = Result.INSTANCE;
                    return Result.m11180constructorimpl(ResultKt.createFailure(m11183exceptionOrNullimpl));
                }
                if (str2 != null) {
                    settingsOrchestratorImpl.setJsonFileLanguage(str2);
                }
                return mo10603initSettingsgIAlus;
            }
        }
        settingsOrchestratorImpl$loadSettings$1 = new SettingsOrchestratorImpl$loadSettings$1(this, continuation);
        Object obj2 = settingsOrchestratorImpl$loadSettings$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = settingsOrchestratorImpl$loadSettings$1.label;
        if (i != 0) {
        }
        m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(mo10603initSettingsgIAlus);
        if (m11183exceptionOrNullimpl == null) {
        }
    }

    @Override // com.usercentrics.sdk.core.settings.SettingsOrchestrator
    public boolean isLanguageAlreadySelected(String language) {
        Intrinsics.checkNotNullParameter(language, "language");
        return Intrinsics.areEqual(language, getJsonFileLanguage());
    }

    @Override // com.usercentrics.sdk.core.settings.SettingsOrchestrator
    public boolean isLanguageAvailable(String language) {
        ArrayList emptyList;
        Intrinsics.checkNotNullParameter(language, "language");
        LegacyExtendedSettings settings = this.application.getSettingsInstance().getValue().getSettings();
        if (settings.getUi() == null) {
            if (settings.getTcfui() == null) {
                emptyList = CollectionsKt.emptyList();
            } else {
                List<PredefinedUILanguage> available = settings.getTcfui().getLanguage().getAvailable();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(available, 10));
                Iterator<T> it = available.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PredefinedUILanguage) it.next()).getIsoCode());
                }
                emptyList = arrayList;
            }
        } else {
            List<PredefinedUILanguage> available2 = settings.getUi().getLanguage().getAvailable();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(available2, 10));
            Iterator<T> it2 = available2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((PredefinedUILanguage) it2.next()).getIsoCode());
            }
            emptyList = arrayList2;
        }
        return emptyList.contains(language);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a8, code lost:
    
        if (r10 == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: loadSettingsFromAdmin-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m10602loadSettingsFromAdmin0E7RQCE(String str, LocationAwareResponse<String> locationAwareResponse, Continuation<? super Result<Unit>> continuation) {
        SettingsOrchestratorImpl$loadSettingsFromAdmin$1 settingsOrchestratorImpl$loadSettingsFromAdmin$1;
        int i;
        Object m10592loadSettings0E7RQCE$default;
        SettingsOrchestratorImpl settingsOrchestratorImpl;
        String str2;
        Throwable m11183exceptionOrNullimpl;
        Object m10600initSettingsCallbackgIAlus;
        if (continuation instanceof SettingsOrchestratorImpl$loadSettingsFromAdmin$1) {
            settingsOrchestratorImpl$loadSettingsFromAdmin$1 = (SettingsOrchestratorImpl$loadSettingsFromAdmin$1) continuation;
            if ((settingsOrchestratorImpl$loadSettingsFromAdmin$1.label & Integer.MIN_VALUE) != 0) {
                settingsOrchestratorImpl$loadSettingsFromAdmin$1.label -= Integer.MIN_VALUE;
                SettingsOrchestratorImpl$loadSettingsFromAdmin$1 settingsOrchestratorImpl$loadSettingsFromAdmin$12 = settingsOrchestratorImpl$loadSettingsFromAdmin$1;
                Object obj = settingsOrchestratorImpl$loadSettingsFromAdmin$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = settingsOrchestratorImpl$loadSettingsFromAdmin$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    updateLocationServiceIfNeeded(locationAwareResponse);
                    String data = locationAwareResponse.getData();
                    setJsonFileLanguage(data);
                    UsercentricsLogger.DefaultImpls.debug$default(this.application.getLogger(), "Language: " + data, null, 2, null);
                    settingsOrchestratorImpl$loadSettingsFromAdmin$12.L$0 = this;
                    settingsOrchestratorImpl$loadSettingsFromAdmin$12.L$1 = str;
                    settingsOrchestratorImpl$loadSettingsFromAdmin$12.label = 1;
                    m10592loadSettings0E7RQCE$default = SettingsOrchestrator.DefaultImpls.m10592loadSettings0E7RQCE$default(this, str, null, settingsOrchestratorImpl$loadSettingsFromAdmin$12, 2, null);
                    if (m10592loadSettings0E7RQCE$default != coroutine_suspended) {
                        settingsOrchestratorImpl = this;
                        str2 = str;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    m10600initSettingsCallbackgIAlus = ((Result) obj).getValue();
                    Throwable m11183exceptionOrNullimpl2 = Result.m11183exceptionOrNullimpl(m10600initSettingsCallbackgIAlus);
                    if (m11183exceptionOrNullimpl2 != null) {
                        Result.Companion companion = Result.INSTANCE;
                        return Result.m11180constructorimpl(ResultKt.createFailure(m11183exceptionOrNullimpl2));
                    }
                    Result.Companion companion2 = Result.INSTANCE;
                    return Result.m11180constructorimpl(Unit.INSTANCE);
                }
                str2 = (String) settingsOrchestratorImpl$loadSettingsFromAdmin$12.L$1;
                settingsOrchestratorImpl = (SettingsOrchestratorImpl) settingsOrchestratorImpl$loadSettingsFromAdmin$12.L$0;
                ResultKt.throwOnFailure(obj);
                m10592loadSettings0E7RQCE$default = ((Result) obj).getValue();
                m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m10592loadSettings0E7RQCE$default);
                if (m11183exceptionOrNullimpl == null) {
                    Result.Companion companion3 = Result.INSTANCE;
                    return Result.m11180constructorimpl(ResultKt.createFailure(m11183exceptionOrNullimpl));
                }
                settingsOrchestratorImpl$loadSettingsFromAdmin$12.L$0 = null;
                settingsOrchestratorImpl$loadSettingsFromAdmin$12.L$1 = null;
                settingsOrchestratorImpl$loadSettingsFromAdmin$12.label = 2;
                m10600initSettingsCallbackgIAlus = settingsOrchestratorImpl.m10600initSettingsCallbackgIAlus(str2, settingsOrchestratorImpl$loadSettingsFromAdmin$12);
            }
        }
        settingsOrchestratorImpl$loadSettingsFromAdmin$1 = new SettingsOrchestratorImpl$loadSettingsFromAdmin$1(this, continuation);
        SettingsOrchestratorImpl$loadSettingsFromAdmin$1 settingsOrchestratorImpl$loadSettingsFromAdmin$122 = settingsOrchestratorImpl$loadSettingsFromAdmin$1;
        Object obj2 = settingsOrchestratorImpl$loadSettingsFromAdmin$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = settingsOrchestratorImpl$loadSettingsFromAdmin$122.label;
        if (i != 0) {
        }
        m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m10592loadSettings0E7RQCE$default);
        if (m11183exceptionOrNullimpl == null) {
        }
    }

    private final void updateLocationServiceIfNeeded(LocationAwareResponse<String> locationAwareResponse) {
        ILocationService value = this.application.getLocationService().getValue();
        value.loadLocation();
        if (locationAwareResponse.getLocation().isEmpty()) {
            return;
        }
        value.set(locationAwareResponse.getLocation());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: initSettingsCallback-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m10600initSettingsCallbackgIAlus(String str, Continuation<? super Result<Unit>> continuation) {
        SettingsOrchestratorImpl$initSettingsCallback$1 settingsOrchestratorImpl$initSettingsCallback$1;
        int i;
        SettingsOrchestratorImpl settingsOrchestratorImpl;
        boolean z;
        Object m10601initTCFAndAdditionalConsentMode0E7RQCE;
        if (continuation instanceof SettingsOrchestratorImpl$initSettingsCallback$1) {
            settingsOrchestratorImpl$initSettingsCallback$1 = (SettingsOrchestratorImpl$initSettingsCallback$1) continuation;
            if ((settingsOrchestratorImpl$initSettingsCallback$1.label & Integer.MIN_VALUE) != 0) {
                settingsOrchestratorImpl$initSettingsCallback$1.label -= Integer.MIN_VALUE;
                Object obj = settingsOrchestratorImpl$initSettingsCallback$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = settingsOrchestratorImpl$initSettingsCallback$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ISettingsLegacy value = this.application.getSettingsInstance().getValue();
                    boolean isTCFEnabled = value.isTCFEnabled();
                    try {
                        if (isTCFEnabled) {
                            settingsOrchestratorImpl$initSettingsCallback$1.L$0 = this;
                            settingsOrchestratorImpl$initSettingsCallback$1.Z$0 = isTCFEnabled;
                            settingsOrchestratorImpl$initSettingsCallback$1.label = 1;
                            m10601initTCFAndAdditionalConsentMode0E7RQCE = m10601initTCFAndAdditionalConsentMode0E7RQCE(value, str, settingsOrchestratorImpl$initSettingsCallback$1);
                            isTCFEnabled = isTCFEnabled;
                            if (m10601initTCFAndAdditionalConsentMode0E7RQCE != coroutine_suspended) {
                                settingsOrchestratorImpl = this;
                                z = isTCFEnabled ? 1 : 0;
                            }
                        } else {
                            wipeLocalStorageForNonTCFSettingsId();
                            if (JobKt.getJob(settingsOrchestratorImpl$initSettingsCallback$1.getContext()).isCancelled() && !isTCFEnabled) {
                                wipeLocalStorageForNonTCFSettingsId();
                            }
                            boolean isCCPAEnabled = value.isCCPAEnabled();
                            boolean z2 = isCCPAEnabled;
                            if (isCCPAEnabled) {
                                ICcpa value2 = this.application.getCcpaInstance().getValue();
                                value2.initialize(value.getCCPAIABAgreementExists());
                                z2 = value2;
                            }
                            settingsOrchestratorImpl$initSettingsCallback$1.label = 2;
                            Object m10598finishInitializationgIAlus = m10598finishInitializationgIAlus(str, settingsOrchestratorImpl$initSettingsCallback$1);
                            isTCFEnabled = z2;
                            if (m10598finishInitializationgIAlus != coroutine_suspended) {
                                return m10598finishInitializationgIAlus;
                            }
                        }
                        return coroutine_suspended;
                    } catch (Throwable th) {
                        th = th;
                        settingsOrchestratorImpl = this;
                        z = isTCFEnabled;
                        if (JobKt.getJob(settingsOrchestratorImpl$initSettingsCallback$1.getContext()).isCancelled()) {
                            settingsOrchestratorImpl.wipeLocalStorageForNonTCFSettingsId();
                        }
                        throw th;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((Result) obj).getValue();
                }
                z = settingsOrchestratorImpl$initSettingsCallback$1.Z$0;
                settingsOrchestratorImpl = (SettingsOrchestratorImpl) settingsOrchestratorImpl$initSettingsCallback$1.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    m10601initTCFAndAdditionalConsentMode0E7RQCE = ((Result) obj).getValue();
                } catch (Throwable th2) {
                    th = th2;
                    if (JobKt.getJob(settingsOrchestratorImpl$initSettingsCallback$1.getContext()).isCancelled() && !z) {
                        settingsOrchestratorImpl.wipeLocalStorageForNonTCFSettingsId();
                    }
                    throw th;
                }
                if (JobKt.getJob(settingsOrchestratorImpl$initSettingsCallback$1.getContext()).isCancelled() && !z) {
                    settingsOrchestratorImpl.wipeLocalStorageForNonTCFSettingsId();
                }
                return m10601initTCFAndAdditionalConsentMode0E7RQCE;
            }
        }
        settingsOrchestratorImpl$initSettingsCallback$1 = new SettingsOrchestratorImpl$initSettingsCallback$1(this, continuation);
        Object obj2 = settingsOrchestratorImpl$initSettingsCallback$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = settingsOrchestratorImpl$initSettingsCallback$1.label;
        if (i != 0) {
        }
        if (JobKt.getJob(settingsOrchestratorImpl$initSettingsCallback$1.getContext()).isCancelled()) {
            settingsOrchestratorImpl.wipeLocalStorageForNonTCFSettingsId();
        }
        return m10601initTCFAndAdditionalConsentMode0E7RQCE;
    }

    private final void wipeLocalStorageForNonTCFSettingsId() {
        DeviceStorage value = this.application.getStorageInstance().getValue();
        value.saveActualTCFSettingsId("");
        value.clearTCFStorageEntries();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: initTCFAndAdditionalConsentMode-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m10601initTCFAndAdditionalConsentMode0E7RQCE(ISettingsLegacy iSettingsLegacy, String str, Continuation<? super Result<Unit>> continuation) {
        SettingsOrchestratorImpl$initTCFAndAdditionalConsentMode$1 settingsOrchestratorImpl$initTCFAndAdditionalConsentMode$1;
        int i;
        Object obj;
        String str2;
        SettingsOrchestratorImpl settingsOrchestratorImpl;
        Throwable m11183exceptionOrNullimpl;
        Object obj2;
        String str3;
        Throwable m11183exceptionOrNullimpl2;
        if (continuation instanceof SettingsOrchestratorImpl$initTCFAndAdditionalConsentMode$1) {
            settingsOrchestratorImpl$initTCFAndAdditionalConsentMode$1 = (SettingsOrchestratorImpl$initTCFAndAdditionalConsentMode$1) continuation;
            if ((settingsOrchestratorImpl$initTCFAndAdditionalConsentMode$1.label & Integer.MIN_VALUE) != 0) {
                settingsOrchestratorImpl$initTCFAndAdditionalConsentMode$1.label -= Integer.MIN_VALUE;
                Object obj3 = settingsOrchestratorImpl$initTCFAndAdditionalConsentMode$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = settingsOrchestratorImpl$initTCFAndAdditionalConsentMode$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj3);
                    TCFUseCase value = this.application.getTcfInstance().getValue();
                    String activeSettingsId = getActiveSettingsId();
                    settingsOrchestratorImpl$initTCFAndAdditionalConsentMode$1.L$0 = this;
                    settingsOrchestratorImpl$initTCFAndAdditionalConsentMode$1.L$1 = iSettingsLegacy;
                    settingsOrchestratorImpl$initTCFAndAdditionalConsentMode$1.L$2 = str;
                    settingsOrchestratorImpl$initTCFAndAdditionalConsentMode$1.label = 1;
                    Object mo10609initializegIAlus = value.mo10609initializegIAlus(activeSettingsId, settingsOrchestratorImpl$initTCFAndAdditionalConsentMode$1);
                    if (mo10609initializegIAlus != coroutine_suspended) {
                        obj = mo10609initializegIAlus;
                        str2 = str;
                        settingsOrchestratorImpl = this;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj3);
                        return ((Result) obj3).getValue();
                    }
                    str3 = (String) settingsOrchestratorImpl$initTCFAndAdditionalConsentMode$1.L$1;
                    settingsOrchestratorImpl = (SettingsOrchestratorImpl) settingsOrchestratorImpl$initTCFAndAdditionalConsentMode$1.L$0;
                    ResultKt.throwOnFailure(obj3);
                    obj2 = ((Result) obj3).getValue();
                    m11183exceptionOrNullimpl2 = Result.m11183exceptionOrNullimpl(obj2);
                    if (m11183exceptionOrNullimpl2 == null) {
                        Result.Companion companion = Result.INSTANCE;
                        return Result.m11180constructorimpl(ResultKt.createFailure(m11183exceptionOrNullimpl2));
                    }
                    str2 = str3;
                    settingsOrchestratorImpl$initTCFAndAdditionalConsentMode$1.L$0 = null;
                    settingsOrchestratorImpl$initTCFAndAdditionalConsentMode$1.L$1 = null;
                    settingsOrchestratorImpl$initTCFAndAdditionalConsentMode$1.L$2 = null;
                    settingsOrchestratorImpl$initTCFAndAdditionalConsentMode$1.label = 3;
                    Object m10598finishInitializationgIAlus = settingsOrchestratorImpl.m10598finishInitializationgIAlus(str2, settingsOrchestratorImpl$initTCFAndAdditionalConsentMode$1);
                    return m10598finishInitializationgIAlus != coroutine_suspended ? coroutine_suspended : m10598finishInitializationgIAlus;
                }
                String str4 = (String) settingsOrchestratorImpl$initTCFAndAdditionalConsentMode$1.L$2;
                iSettingsLegacy = (ISettingsLegacy) settingsOrchestratorImpl$initTCFAndAdditionalConsentMode$1.L$1;
                SettingsOrchestratorImpl settingsOrchestratorImpl2 = (SettingsOrchestratorImpl) settingsOrchestratorImpl$initTCFAndAdditionalConsentMode$1.L$0;
                ResultKt.throwOnFailure(obj3);
                Object value2 = ((Result) obj3).getValue();
                str2 = str4;
                settingsOrchestratorImpl = settingsOrchestratorImpl2;
                obj = value2;
                m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(obj);
                if (m11183exceptionOrNullimpl == null) {
                    Result.Companion companion2 = Result.INSTANCE;
                    return Result.m11180constructorimpl(ResultKt.createFailure(m11183exceptionOrNullimpl));
                }
                if (iSettingsLegacy.isAdditionalConsentModeEnabled()) {
                    settingsOrchestratorImpl$initTCFAndAdditionalConsentMode$1.L$0 = settingsOrchestratorImpl;
                    settingsOrchestratorImpl$initTCFAndAdditionalConsentMode$1.L$1 = str2;
                    settingsOrchestratorImpl$initTCFAndAdditionalConsentMode$1.L$2 = null;
                    settingsOrchestratorImpl$initTCFAndAdditionalConsentMode$1.label = 2;
                    Object m10599initAdditionalConsentModeIoAF18A = settingsOrchestratorImpl.m10599initAdditionalConsentModeIoAF18A(settingsOrchestratorImpl$initTCFAndAdditionalConsentMode$1);
                    if (m10599initAdditionalConsentModeIoAF18A != coroutine_suspended) {
                        String str5 = str2;
                        obj2 = m10599initAdditionalConsentModeIoAF18A;
                        str3 = str5;
                        m11183exceptionOrNullimpl2 = Result.m11183exceptionOrNullimpl(obj2);
                        if (m11183exceptionOrNullimpl2 == null) {
                        }
                    }
                }
                settingsOrchestratorImpl$initTCFAndAdditionalConsentMode$1.L$0 = null;
                settingsOrchestratorImpl$initTCFAndAdditionalConsentMode$1.L$1 = null;
                settingsOrchestratorImpl$initTCFAndAdditionalConsentMode$1.L$2 = null;
                settingsOrchestratorImpl$initTCFAndAdditionalConsentMode$1.label = 3;
                Object m10598finishInitializationgIAlus2 = settingsOrchestratorImpl.m10598finishInitializationgIAlus(str2, settingsOrchestratorImpl$initTCFAndAdditionalConsentMode$1);
                if (m10598finishInitializationgIAlus2 != coroutine_suspended) {
                }
            }
        }
        settingsOrchestratorImpl$initTCFAndAdditionalConsentMode$1 = new SettingsOrchestratorImpl$initTCFAndAdditionalConsentMode$1(this, continuation);
        Object obj32 = settingsOrchestratorImpl$initTCFAndAdditionalConsentMode$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = settingsOrchestratorImpl$initTCFAndAdditionalConsentMode$1.label;
        if (i != 0) {
        }
        m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(obj);
        if (m11183exceptionOrNullimpl == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* renamed from: initAdditionalConsentMode-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m10599initAdditionalConsentModeIoAF18A(Continuation<? super Result<Unit>> continuation) {
        SettingsOrchestratorImpl$initAdditionalConsentMode$1 settingsOrchestratorImpl$initAdditionalConsentMode$1;
        int i;
        try {
            if (continuation instanceof SettingsOrchestratorImpl$initAdditionalConsentMode$1) {
                settingsOrchestratorImpl$initAdditionalConsentMode$1 = (SettingsOrchestratorImpl$initAdditionalConsentMode$1) continuation;
                if ((settingsOrchestratorImpl$initAdditionalConsentMode$1.label & Integer.MIN_VALUE) != 0) {
                    settingsOrchestratorImpl$initAdditionalConsentMode$1.label -= Integer.MIN_VALUE;
                    Object obj = settingsOrchestratorImpl$initAdditionalConsentMode$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = settingsOrchestratorImpl$initAdditionalConsentMode$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        List<Integer> selectedAdTechProviders = this.application.getSettingsInstance().getValue().selectedAdTechProviders();
                        AdditionalConsentModeService value = this.application.getAdditionalConsentModeService().getValue();
                        settingsOrchestratorImpl$initAdditionalConsentMode$1.label = 1;
                        if (value.load(selectedAdTechProviders, settingsOrchestratorImpl$initAdditionalConsentMode$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    Result.Companion companion = Result.INSTANCE;
                    return Result.m11180constructorimpl(Unit.INSTANCE);
                }
            }
            if (i != 0) {
            }
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m11180constructorimpl(Unit.INSTANCE);
        } catch (Exception e) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m11180constructorimpl(ResultKt.createFailure(new UsercentricsException(ApiErrors.FETCH_TCF_DATA, e)));
        }
        settingsOrchestratorImpl$initAdditionalConsentMode$1 = new SettingsOrchestratorImpl$initAdditionalConsentMode$1(this, continuation);
        Object obj2 = settingsOrchestratorImpl$initAdditionalConsentMode$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = settingsOrchestratorImpl$initAdditionalConsentMode$1.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* renamed from: finishInitialization-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m10598finishInitializationgIAlus(String str, Continuation<? super Result<Unit>> continuation) {
        SettingsOrchestratorImpl$finishInitialization$1 settingsOrchestratorImpl$finishInitialization$1;
        int i;
        Exception e;
        boolean z;
        SettingsOrchestratorImpl settingsOrchestratorImpl;
        try {
            if (continuation instanceof SettingsOrchestratorImpl$finishInitialization$1) {
                settingsOrchestratorImpl$finishInitialization$1 = (SettingsOrchestratorImpl$finishInitialization$1) continuation;
                if ((settingsOrchestratorImpl$finishInitialization$1.label & Integer.MIN_VALUE) != 0) {
                    settingsOrchestratorImpl$finishInitialization$1.label -= Integer.MIN_VALUE;
                    Object obj = settingsOrchestratorImpl$finishInitialization$1.result;
                    SettingsOrchestratorImpl coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = settingsOrchestratorImpl$finishInitialization$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        boolean isBlank = StringsKt.isBlank(str);
                        try {
                            InitialValuesStrategy value = this.application.getInitialValuesStrategy().getValue();
                            settingsOrchestratorImpl$finishInitialization$1.L$0 = this;
                            settingsOrchestratorImpl$finishInitialization$1.Z$0 = isBlank;
                            settingsOrchestratorImpl$finishInitialization$1.label = 1;
                            if (value.boot(isBlank, str, settingsOrchestratorImpl$finishInitialization$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            settingsOrchestratorImpl = this;
                            z = isBlank ? 1 : 0;
                        } catch (Exception e2) {
                            e = e2;
                            z = isBlank ? 1 : 0;
                            settingsOrchestratorImpl = this;
                            Result.Companion companion = Result.INSTANCE;
                            Object m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(new UsercentricsException("There was a failure during the initialization", e)));
                            if (JobKt.getJob(settingsOrchestratorImpl$finishInitialization$1.getContext()).isCancelled()) {
                                settingsOrchestratorImpl.wipeStorage();
                            }
                            return m11180constructorimpl;
                        } catch (Throwable th) {
                            th = th;
                            str = isBlank ? 1 : 0;
                            coroutine_suspended = this;
                            if (JobKt.getJob(settingsOrchestratorImpl$finishInitialization$1.getContext()).isCancelled() && str != null) {
                                coroutine_suspended.wipeStorage();
                            }
                            throw th;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z = settingsOrchestratorImpl$finishInitialization$1.Z$0;
                        settingsOrchestratorImpl = (SettingsOrchestratorImpl) settingsOrchestratorImpl$finishInitialization$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (Exception e3) {
                            e = e3;
                            Result.Companion companion2 = Result.INSTANCE;
                            Object m11180constructorimpl2 = Result.m11180constructorimpl(ResultKt.createFailure(new UsercentricsException("There was a failure during the initialization", e)));
                            if (JobKt.getJob(settingsOrchestratorImpl$finishInitialization$1.getContext()).isCancelled() && z) {
                                settingsOrchestratorImpl.wipeStorage();
                            }
                            return m11180constructorimpl2;
                        }
                    }
                    settingsOrchestratorImpl.checkValidState();
                    Result.Companion companion3 = Result.INSTANCE;
                    Object m11180constructorimpl3 = Result.m11180constructorimpl(Unit.INSTANCE);
                    if (JobKt.getJob(settingsOrchestratorImpl$finishInitialization$1.getContext()).isCancelled() && z) {
                        settingsOrchestratorImpl.wipeStorage();
                    }
                    return m11180constructorimpl3;
                }
            }
            if (i != 0) {
            }
            settingsOrchestratorImpl.checkValidState();
            Result.Companion companion32 = Result.INSTANCE;
            Object m11180constructorimpl32 = Result.m11180constructorimpl(Unit.INSTANCE);
            if (JobKt.getJob(settingsOrchestratorImpl$finishInitialization$1.getContext()).isCancelled()) {
                settingsOrchestratorImpl.wipeStorage();
            }
            return m11180constructorimpl32;
        } catch (Throwable th2) {
            th = th2;
        }
        settingsOrchestratorImpl$finishInitialization$1 = new SettingsOrchestratorImpl$finishInitialization$1(this, continuation);
        Object obj2 = settingsOrchestratorImpl$finishInitialization$1.result;
        SettingsOrchestratorImpl coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = settingsOrchestratorImpl$finishInitialization$1.label;
    }

    private final void wipeStorage() {
        UsercentricsLogger.DefaultImpls.debug$default(this.application.getLogger(), "Storage wiped out, given failed initialization and 1st interaction with SDK", null, 2, null);
        this.application.getStorageInstance().getValue().clear();
    }

    private final void checkValidState() {
        if (this.application.getLocationService().getValue().getLocation().isEmpty()) {
            throw new IllegalStateException("Location cannot be empty");
        }
        if (this.application.getInitialValuesStrategy().getValue().getVariant() == null) {
            throw new IllegalStateException("No variant value");
        }
    }

    private final void setActiveSettingsId(String active, Set<String> allSettingIds) {
        setActiveSettingsId(active);
        this.allSettingsIds = allSettingIds;
        this.application.getStorageInstance().getValue().bootSettings(getActiveSettingsId());
        getSettingsIdObservable().emit(active);
    }
}
