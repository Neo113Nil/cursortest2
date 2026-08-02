package com.usercentrics.sdk.v2.cookie.service;

import com.usercentrics.sdk.models.settings.PredefinedUICookieInformationLabels;
import com.usercentrics.sdk.models.settings.PredefinedUIDeviceStorageContent;
import com.usercentrics.sdk.models.tcf.TCFLabels;
import com.usercentrics.sdk.models.tcf.TCFUISettings;
import com.usercentrics.sdk.services.settings.ISettingsLegacy;
import com.usercentrics.sdk.v2.async.dispatcher.Dispatcher;
import com.usercentrics.sdk.v2.cookie.repository.ICookieInformationRepository;
import com.usercentrics.sdk.v2.tcf.service.ITCFService;
import com.usercentrics.tcf.core.model.gvl.Declarations;
import com.usercentrics.tcf.core.model.gvl.Purpose;
import com.usercentrics.tcf.core.model.gvl.VendorList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CookieInformationService.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J8\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0004\u0012\u00020\u000e0\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016H\u0016J\u0016\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/usercentrics/sdk/v2/cookie/service/CookieInformationService;", "Lcom/usercentrics/sdk/v2/cookie/service/UsercentricsCookieInformationService;", "dispatcher", "Lcom/usercentrics/sdk/v2/async/dispatcher/Dispatcher;", "tcfService", "Lcom/usercentrics/sdk/v2/tcf/service/ITCFService;", "cookieInformationRepository", "Lcom/usercentrics/sdk/v2/cookie/repository/ICookieInformationRepository;", "settingsLegacy", "Lcom/usercentrics/sdk/services/settings/ISettingsLegacy;", "(Lcom/usercentrics/sdk/v2/async/dispatcher/Dispatcher;Lcom/usercentrics/sdk/v2/tcf/service/ITCFService;Lcom/usercentrics/sdk/v2/cookie/repository/ICookieInformationRepository;Lcom/usercentrics/sdk/services/settings/ISettingsLegacy;)V", "cookieInformationLabels", "Lcom/usercentrics/sdk/models/settings/PredefinedUICookieInformationLabels;", "fetchCookieInfo", "", "cookieInfoURL", "", "onSuccess", "Lkotlin/Function1;", "", "Lcom/usercentrics/sdk/models/settings/PredefinedUIDeviceStorageContent;", "onError", "Lkotlin/Function0;", "getVendorListOrTranslatedDeclarationsPurposes", "", "Lcom/usercentrics/tcf/core/model/gvl/Purpose;", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CookieInformationService implements UsercentricsCookieInformationService {
    private final ICookieInformationRepository cookieInformationRepository;
    private final Dispatcher dispatcher;
    private final ISettingsLegacy settingsLegacy;
    private final ITCFService tcfService;

    public CookieInformationService(Dispatcher dispatcher, ITCFService tcfService, ICookieInformationRepository cookieInformationRepository, ISettingsLegacy settingsLegacy) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(tcfService, "tcfService");
        Intrinsics.checkNotNullParameter(cookieInformationRepository, "cookieInformationRepository");
        Intrinsics.checkNotNullParameter(settingsLegacy, "settingsLegacy");
        this.dispatcher = dispatcher;
        this.tcfService = tcfService;
        this.cookieInformationRepository = cookieInformationRepository;
        this.settingsLegacy = settingsLegacy;
    }

    @Override // com.usercentrics.sdk.v2.cookie.service.UsercentricsCookieInformationService
    public void fetchCookieInfo(String cookieInfoURL, final Function1<? super List<PredefinedUIDeviceStorageContent>, Unit> onSuccess, final Function0<Unit> onError) {
        Intrinsics.checkNotNullParameter(cookieInfoURL, "cookieInfoURL");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.dispatcher.dispatch(new CookieInformationService$fetchCookieInfo$1(this, cookieInfoURL, null)).onSuccess(new Function1<List<? extends PredefinedUIDeviceStorageContent>, Unit>() { // from class: com.usercentrics.sdk.v2.cookie.service.CookieInformationService$fetchCookieInfo$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends PredefinedUIDeviceStorageContent> list) {
                invoke2((List<PredefinedUIDeviceStorageContent>) list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(final List<PredefinedUIDeviceStorageContent> it) {
                Dispatcher dispatcher;
                Intrinsics.checkNotNullParameter(it, "it");
                dispatcher = CookieInformationService.this.dispatcher;
                final Function1<List<PredefinedUIDeviceStorageContent>, Unit> function1 = onSuccess;
                dispatcher.dispatchMain(new Function0<Unit>() { // from class: com.usercentrics.sdk.v2.cookie.service.CookieInformationService$fetchCookieInfo$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        function1.invoke(it);
                    }
                });
            }
        }).onFailure(new Function1<Throwable, Unit>() { // from class: com.usercentrics.sdk.v2.cookie.service.CookieInformationService$fetchCookieInfo$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable it) {
                Dispatcher dispatcher;
                Intrinsics.checkNotNullParameter(it, "it");
                dispatcher = CookieInformationService.this.dispatcher;
                final Function0<Unit> function0 = onError;
                dispatcher.dispatchMain(new Function0<Unit>() { // from class: com.usercentrics.sdk.v2.cookie.service.CookieInformationService$fetchCookieInfo$3.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        function0.invoke();
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Purpose> getVendorListOrTranslatedDeclarationsPurposes() {
        VendorList vendorList = this.tcfService.getVendorList();
        Intrinsics.checkNotNull(vendorList);
        Declarations declarations = this.tcfService.getDeclarations();
        if (declarations != null) {
            return declarations.getPurposes();
        }
        return vendorList.getPurposes();
    }

    @Override // com.usercentrics.sdk.v2.cookie.service.UsercentricsCookieInformationService
    public PredefinedUICookieInformationLabels cookieInformationLabels() {
        TCFLabels labels;
        TCFUISettings tcfui = this.settingsLegacy.getSettings().getTcfui();
        if (tcfui == null || (labels = tcfui.getLabels()) == null) {
            return null;
        }
        return labels.getCookieInformation();
    }
}
