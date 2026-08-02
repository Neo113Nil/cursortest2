package ru.ozon.app.android.fresh.unsorted.widgets.courierTips.di;

import At.C2445a;
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
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.fresh.unsorted.widgets.courierTips.data.CourierTipsApi;
import ru.ozon.app.android.fresh.unsorted.widgets.courierTips.presentation.CourierTipsMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.courierTips.presentation.CourierTipsViewModel;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.returns.ui.domain.PostRefreshHandlerFactory;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00192\u00060\u0001j\u0002`\u0002:\u0001\u0019R\u0018\u0010\u0007\u001a\u00060\u0003j\u0002`\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0010\u001a\u00060\fj\u0002`\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/di/CourierTipsComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/presentation/CourierTipsViewModel;", "getViewModel", "()Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/presentation/CourierTipsViewModel;", "viewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersFactory", "()LVg/d;", "customActionHandlersFactory", "Lru/ozon/app/android/returns/ui/domain/PostRefreshHandlerFactory;", "getPostRefreshHandlerFactory", "()Lru/ozon/app/android/returns/ui/domain/PostRefreshHandlerFactory;", "postRefreshHandlerFactory", "Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/presentation/CourierTipsMapper;", "getMapper", "()Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/presentation/CourierTipsMapper;", "mapper", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CourierTipsComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/di/CourierTipsComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/di/CourierTipsComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CourierTipsComponent create$lambda$0(final C7475g c7475g) {
            return new CourierTipsComponent() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.courierTips.di.CourierTipsComponent$Companion$create$1$1

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(CourierTipsComponent$Companion$create$1$1$mapper$2.INSTANCE);

                /* renamed from: postRefreshHandlerFactory$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j postRefreshHandlerFactory;
                private final CourierTipsViewModel viewModel;

                {
                    this.viewModel = new CourierTipsViewModel(((ComposerWidgetAsyncComponentApi) C7475g.this.getComponent(ComposerWidgetAsyncComponentApi.class)).getComposerAsyncWidgetRepository(), getCourierTipsApi());
                    this.postRefreshHandlerFactory = k.b(new CourierTipsComponent$Companion$create$1$1$postRefreshHandlerFactory$2(C7475g.this));
                }

                public CourierTipsApi getCourierTipsApi() {
                    Object create = ((NetworkComponentApi) C7475g.this.getComponent(NetworkComponentApi.class)).getRetrofit().create(CourierTipsApi.class);
                    Intrinsics.checkNotNullExpressionValue(create, "create(...)");
                    return (CourierTipsApi) create;
                }

                @Override // ru.ozon.app.android.fresh.unsorted.widgets.courierTips.di.CourierTipsComponent
                public d getCustomActionHandlersFactory() {
                    return ((CustomActionHandlersComponentApi) C7475g.this.getComponent(CustomActionHandlersComponentApi.class)).getCustomActionHandlersStoreFactory();
                }

                @Override // ru.ozon.app.android.fresh.unsorted.widgets.courierTips.di.CourierTipsComponent
                public CourierTipsMapper getMapper() {
                    return (CourierTipsMapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.fresh.unsorted.widgets.courierTips.di.CourierTipsComponent
                public PostRefreshHandlerFactory getPostRefreshHandlerFactory() {
                    return (PostRefreshHandlerFactory) this.postRefreshHandlerFactory.getValue();
                }

                @Override // ru.ozon.app.android.fresh.unsorted.widgets.courierTips.di.CourierTipsComponent
                public l getTokenizedAnalytics() {
                    return ((RetainComposerComponentApi) C7475g.this.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
                }

                @Override // ru.ozon.app.android.fresh.unsorted.widgets.courierTips.di.CourierTipsComponent
                public CourierTipsViewModel getViewModel() {
                    return this.viewModel;
                }
            };
        }

        @NotNull
        public final C7473e<CourierTipsComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(CourierTipsComponent.class), new C2445a(storage, 5));
        }
    }

    @NotNull
    d getCustomActionHandlersFactory();

    @NotNull
    CourierTipsMapper getMapper();

    @NotNull
    PostRefreshHandlerFactory getPostRefreshHandlerFactory();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    CourierTipsViewModel getViewModel();
}
