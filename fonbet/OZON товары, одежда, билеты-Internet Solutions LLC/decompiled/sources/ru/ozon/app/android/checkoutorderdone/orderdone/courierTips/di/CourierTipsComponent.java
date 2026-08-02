package ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.di;

import Du.C2881a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.presentation.CourierTipsViewModel;
import ru.ozon.app.android.composer.di.ComposerComponentApi;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u000e2\u00060\u0001j\u0002`\u0002:\u0001\u000eJ\u0013\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/di/CourierTipsComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/CourierTipsViewModel;", "getViewModel", "()Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/CourierTipsViewModel;", "viewModel", "Companion", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CourierTipsComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/di/CourierTipsComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/di/CourierTipsComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CourierTipsComponent create$lambda$0(final C7475g c7475g) {
            return new CourierTipsComponent() { // from class: ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.di.CourierTipsComponent$Companion$create$1$1

                /* renamed from: viewModel$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j viewModel;

                {
                    this.viewModel = k.b(new CourierTipsComponent$Companion$create$1$1$viewModel$2(C7475g.this));
                }

                @Override // ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.di.CourierTipsComponent
                public d getCustomActionHandlersStoreFactory() {
                    return ((CustomActionHandlersComponentApi) C7475g.this.getComponent(CustomActionHandlersComponentApi.class)).getCustomActionHandlersStoreFactory();
                }

                @Override // ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.di.CourierTipsComponent
                public l getTokenizedAnalytics() {
                    return ((ComposerComponentApi) C7475g.this.getComponent(ComposerComponentApi.class)).getTokenizedAnalytics();
                }

                @Override // ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.di.CourierTipsComponent
                public CourierTipsViewModel getViewModel() {
                    return (CourierTipsViewModel) this.viewModel.getValue();
                }
            };
        }

        @NotNull
        public final C7473e<CourierTipsComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(CourierTipsComponent.class), new C2881a(storage, 11));
        }
    }

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    CourierTipsViewModel getViewModel();
}
