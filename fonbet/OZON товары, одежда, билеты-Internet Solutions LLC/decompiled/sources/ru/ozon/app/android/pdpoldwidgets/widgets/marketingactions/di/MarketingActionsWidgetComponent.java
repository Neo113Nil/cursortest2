package ru.ozon.app.android.pdpoldwidgets.widgets.marketingactions.di;

import GN.a;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdpoldwidgets.widgets.marketingactions.core.MarketingActionsMapper;
import ru.ozon.app.android.pdpoldwidgets.widgets.marketingactions.presentation.MarketingActionsPresenter;
import ru.ozon.app.android.pdpoldwidgets.widgets.marketingactions.presentation.actions.ActionsAdapter;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u000f2\u00060\u0001j\u0002`\u0002:\u0001\u000fR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/di/MarketingActionsWidgetComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/core/MarketingActionsMapper;", "getMapper", "()Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/core/MarketingActionsMapper;", "mapper", "Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/presentation/MarketingActionsPresenter;", "getPresenter", "()Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/presentation/MarketingActionsPresenter;", "presenter", "Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/presentation/actions/ActionsAdapter;", "getActionsAdapter", "()Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/presentation/actions/ActionsAdapter;", "actionsAdapter", "Companion", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface MarketingActionsWidgetComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/di/MarketingActionsWidgetComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/di/MarketingActionsWidgetComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MarketingActionsWidgetComponent create$lambda$0(C7475g c7475g) {
            return new MarketingActionsWidgetComponent$Companion$create$1$1(c7475g);
        }

        @NotNull
        public final C7473e<MarketingActionsWidgetComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(MarketingActionsWidgetComponent.class), new a(storage, 6));
        }
    }

    @NotNull
    ActionsAdapter getActionsAdapter();

    @NotNull
    MarketingActionsMapper getMapper();

    @NotNull
    MarketingActionsPresenter getPresenter();
}
