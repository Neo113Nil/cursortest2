package com.usercentrics.sdk.ui.components.cookie;

import com.usercentrics.sdk.models.settings.PredefinedUICookieInformationLabels;
import com.usercentrics.sdk.models.settings.PredefinedUIDeviceStorageContent;
import com.usercentrics.sdk.models.settings.PredefinedUIStorageInformationButtonInfo;
import com.usercentrics.sdk.ui.PredefinedUIDependencyManager;
import com.usercentrics.sdk.v2.cookie.service.UsercentricsCookieInformationService;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UCCookiesViewModel.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007JG\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00142'\u0010\u001f\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\"0!¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u00060 2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J?\u0010'\u001a\u00020\u00062'\u0010\u001f\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\"0!¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u00060 2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\b\u0010(\u001a\u00020\u0006H\u0016R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016¨\u0006)"}, d2 = {"Lcom/usercentrics/sdk/ui/components/cookie/UCCookiesViewModelImpl;", "Lcom/usercentrics/sdk/ui/components/cookie/UCCookiesViewModel;", "storageInformation", "Lcom/usercentrics/sdk/models/settings/PredefinedUIStorageInformationButtonInfo;", "dismissCallback", "Lkotlin/Function0;", "", "(Lcom/usercentrics/sdk/models/settings/PredefinedUIStorageInformationButtonInfo;Lkotlin/jvm/functions/Function0;)V", "cookieInformationService", "Lcom/usercentrics/sdk/v2/cookie/service/UsercentricsCookieInformationService;", "getCookieInformationService", "()Lcom/usercentrics/sdk/v2/cookie/service/UsercentricsCookieInformationService;", "cookieInformationService$delegate", "Lkotlin/Lazy;", "cookieLabels", "Lcom/usercentrics/sdk/models/settings/PredefinedUICookieInformationLabels;", "getCookieLabels", "()Lcom/usercentrics/sdk/models/settings/PredefinedUICookieInformationLabels;", "cookieLabels$delegate", "error", "", "getError", "()Ljava/lang/String;", "loading", "getLoading", "titleDetailed", "getTitleDetailed", "tryAgain", "getTryAgain", "loadFromUrl", "url", "onSuccess", "Lkotlin/Function1;", "", "Lcom/usercentrics/sdk/models/settings/PredefinedUIDeviceStorageContent;", "Lkotlin/ParameterName;", "name", "disclosures", "onError", "loadInformation", "onDismiss", "usercentrics-ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UCCookiesViewModelImpl implements UCCookiesViewModel {

    /* renamed from: cookieInformationService$delegate, reason: from kotlin metadata */
    private final Lazy cookieInformationService;

    /* renamed from: cookieLabels$delegate, reason: from kotlin metadata */
    private final Lazy cookieLabels;
    private final Function0<Unit> dismissCallback;
    private final PredefinedUIStorageInformationButtonInfo storageInformation;

    public UCCookiesViewModelImpl(PredefinedUIStorageInformationButtonInfo storageInformation, Function0<Unit> dismissCallback) {
        Intrinsics.checkNotNullParameter(storageInformation, "storageInformation");
        Intrinsics.checkNotNullParameter(dismissCallback, "dismissCallback");
        this.storageInformation = storageInformation;
        this.dismissCallback = dismissCallback;
        this.cookieInformationService = LazyKt.lazy(new Function0<UsercentricsCookieInformationService>() { // from class: com.usercentrics.sdk.ui.components.cookie.UCCookiesViewModelImpl$cookieInformationService$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final UsercentricsCookieInformationService invoke() {
                return PredefinedUIDependencyManager.INSTANCE.getCookieInformationService();
            }
        });
        this.cookieLabels = LazyKt.lazy(new Function0<PredefinedUICookieInformationLabels>() { // from class: com.usercentrics.sdk.ui.components.cookie.UCCookiesViewModelImpl$cookieLabels$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final PredefinedUICookieInformationLabels invoke() {
                UsercentricsCookieInformationService cookieInformationService;
                cookieInformationService = UCCookiesViewModelImpl.this.getCookieInformationService();
                return cookieInformationService.cookieInformationLabels();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UsercentricsCookieInformationService getCookieInformationService() {
        return (UsercentricsCookieInformationService) this.cookieInformationService.getValue();
    }

    private final PredefinedUICookieInformationLabels getCookieLabels() {
        return (PredefinedUICookieInformationLabels) this.cookieLabels.getValue();
    }

    @Override // com.usercentrics.sdk.ui.components.cookie.UCCookiesViewModel
    public String getTitleDetailed() {
        String titleDetailed;
        PredefinedUICookieInformationLabels cookieLabels = getCookieLabels();
        return (cookieLabels == null || (titleDetailed = cookieLabels.getTitleDetailed()) == null) ? "" : titleDetailed;
    }

    @Override // com.usercentrics.sdk.ui.components.cookie.UCCookiesViewModel
    public String getLoading() {
        String loading;
        PredefinedUICookieInformationLabels cookieLabels = getCookieLabels();
        return (cookieLabels == null || (loading = cookieLabels.getLoading()) == null) ? "" : loading;
    }

    @Override // com.usercentrics.sdk.ui.components.cookie.UCCookiesViewModel
    public String getError() {
        String error;
        PredefinedUICookieInformationLabels cookieLabels = getCookieLabels();
        return (cookieLabels == null || (error = cookieLabels.getError()) == null) ? "" : error;
    }

    @Override // com.usercentrics.sdk.ui.components.cookie.UCCookiesViewModel
    public String getTryAgain() {
        String tryAgain;
        PredefinedUICookieInformationLabels cookieLabels = getCookieLabels();
        return (cookieLabels == null || (tryAgain = cookieLabels.getTryAgain()) == null) ? "" : tryAgain;
    }

    @Override // com.usercentrics.sdk.ui.components.cookie.UCCookiesViewModel
    public void onDismiss() {
        this.dismissCallback.invoke();
    }

    @Override // com.usercentrics.sdk.ui.components.cookie.UCCookiesViewModel
    public void loadInformation(Function1<? super List<PredefinedUIDeviceStorageContent>, Unit> onSuccess, Function0<Unit> onError) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        List<PredefinedUIDeviceStorageContent> deviceStorage = this.storageInformation.getDeviceStorage();
        String url = this.storageInformation.getUrl();
        String str = url;
        if (str != null && str.length() != 0) {
            loadFromUrl(url, onSuccess, onError);
            return;
        }
        List<PredefinedUIDeviceStorageContent> list = deviceStorage;
        if (list == null || list.isEmpty()) {
            return;
        }
        onSuccess.invoke(deviceStorage);
    }

    private final void loadFromUrl(String url, final Function1<? super List<PredefinedUIDeviceStorageContent>, Unit> onSuccess, final Function0<Unit> onError) {
        getCookieInformationService().fetchCookieInfo(url, new Function1<List<? extends PredefinedUIDeviceStorageContent>, Unit>() { // from class: com.usercentrics.sdk.ui.components.cookie.UCCookiesViewModelImpl$loadFromUrl$1
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
            public final void invoke2(List<PredefinedUIDeviceStorageContent> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                onSuccess.invoke(it);
            }
        }, new Function0<Unit>() { // from class: com.usercentrics.sdk.ui.components.cookie.UCCookiesViewModelImpl$loadFromUrl$2
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
                onError.invoke();
            }
        });
    }
}
