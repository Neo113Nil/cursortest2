package ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.di;

import AV.a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation.BottomCartWidgetMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation.BottomCartWidgetViewModelImpl;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00172\u00060\u0001j\u0002`\u0002:\u0001\u0017R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/bottomCartWidget/di/BottomCartComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/fresh/unsorted/widgets/bottomCartWidget/presentation/BottomCartWidgetMapper;", "getMapper", "()Lru/ozon/app/android/fresh/unsorted/widgets/bottomCartWidget/presentation/BottomCartWidgetMapper;", "mapper", "Lru/ozon/app/android/fresh/unsorted/widgets/bottomCartWidget/presentation/BottomCartWidgetViewModelImpl;", "getViewModel", "()Lru/ozon/app/android/fresh/unsorted/widgets/bottomCartWidget/presentation/BottomCartWidgetViewModelImpl;", "viewModel", "Lru/ozon/app/android/composer/ComposerNavigator;", "getComposerNavigator", "()Lru/ozon/app/android/composer/ComposerNavigator;", "composerNavigator", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface BottomCartComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/bottomCartWidget/di/BottomCartComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/fresh/unsorted/widgets/bottomCartWidget/di/BottomCartComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BottomCartComponent create$lambda$0(final C7475g c7475g) {
            return new BottomCartComponent() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.di.BottomCartComponent$Companion$create$1$1

                /* renamed from: composerNavigator$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j composerNavigator;

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(BottomCartComponent$Companion$create$1$1$mapper$2.INSTANCE);
                private final l tokenizedAnalytics;

                /* renamed from: viewModel$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j viewModel;

                {
                    this.tokenizedAnalytics = ((RetainComposerComponentApi) C7475g.this.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
                    this.viewModel = k.b(new BottomCartComponent$Companion$create$1$1$viewModel$2(C7475g.this));
                    this.composerNavigator = k.b(new BottomCartComponent$Companion$create$1$1$composerNavigator$2(C7475g.this));
                }

                @Override // ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.di.BottomCartComponent
                public ComposerNavigator getComposerNavigator() {
                    return (ComposerNavigator) this.composerNavigator.getValue();
                }

                @Override // ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.di.BottomCartComponent
                public FeatureChecker getFeatureChecker() {
                    return ((NetworkComponentApi) C7475g.this.getComponent(NetworkComponentApi.class)).getFeatureChecker();
                }

                @Override // ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.di.BottomCartComponent
                public BottomCartWidgetMapper getMapper() {
                    return (BottomCartWidgetMapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.di.BottomCartComponent
                public l getTokenizedAnalytics() {
                    return this.tokenizedAnalytics;
                }

                @Override // ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.di.BottomCartComponent
                public BottomCartWidgetViewModelImpl getViewModel() {
                    return (BottomCartWidgetViewModelImpl) this.viewModel.getValue();
                }
            };
        }

        @NotNull
        public final C7473e<BottomCartComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(BottomCartComponent.class), new a(storage, 9));
        }
    }

    @NotNull
    ComposerNavigator getComposerNavigator();

    @NotNull
    FeatureChecker getFeatureChecker();

    @NotNull
    BottomCartWidgetMapper getMapper();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    BottomCartWidgetViewModelImpl getViewModel();
}
