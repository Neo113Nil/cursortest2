package ru.ozon.app.android.storefront.widgets.feedback.rateWidget.di;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.core.RateMapper;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.RateViewModelImpl;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR%\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0015\u0010\u001c\u001a\u00060\u0018j\u0002`\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/di/RateComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "<init>", "(Lk20/g;)V", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/core/RateMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/core/RateMapper;", "mapper", "LPc/a;", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/RateViewModelImpl;", "kotlin.jvm.PlatformType", "viewModelProvider", "LPc/a;", "getViewModelProvider", "()LPc/a;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RateComponent implements InterfaceC6958a {

    @NotNull
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mapper;

    @NotNull
    private final a<RateViewModelImpl> viewModelProvider;

    public RateComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.mapper = k.b(new RateComponent$mapper$2(storage));
        this.viewModelProvider = new KK.a(0);
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) storage.getComponent(CustomActionHandlersComponentApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RateViewModelImpl viewModelProvider$lambda$0() {
        return new RateViewModelImpl();
    }

    @NotNull
    public final d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
    }

    @NotNull
    public final RateMapper getMapper() {
        return (RateMapper) this.mapper.getValue();
    }

    @NotNull
    public final a<RateViewModelImpl> getViewModelProvider() {
        return this.viewModelProvider;
    }
}
