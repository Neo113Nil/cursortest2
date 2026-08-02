package ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.single;

import Vg.c;
import WZ.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.NavLikezoneCaruselVI;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.single.view.NavLikezoneCaruselBannerSingle;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.view.BannerItem;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00022\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u0018\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00140 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/single/NavLikezoneCaruselSingleViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/NavLikezoneCaruselVI$Single;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/single/view/NavLikezoneCaruselBannerSingle$View;", "navLikezoneCaruselBannerSingle", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "<init>", "(Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/single/view/NavLikezoneCaruselBannerSingle$View;LWZ/l;LVg/c;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/NavLikezoneCaruselVI$Single;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/NavLikezoneCaruselVI$Single;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/single/view/NavLikezoneCaruselBannerSingle$View;", "LWZ/l;", "LVg/c;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavLikezoneCaruselSingleViewHolder extends k<NavLikezoneCaruselVI.Single> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final c customActionHandlersStore;

    @NotNull
    private final NavLikezoneCaruselBannerSingle.View navLikezoneCaruselBannerSingle;

    @NotNull
    private final l tokenizedAnalytics;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.single.NavLikezoneCaruselSingleViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            BannerItem banner;
            NavLikezoneCaruselVI.Single boundData = NavLikezoneCaruselSingleViewHolder.this.getBoundData();
            if (boundData == null || (banner = boundData.getBanner()) == null) {
                return;
            }
            banner.onClick(NavLikezoneCaruselSingleViewHolder.this.actionHandler);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavLikezoneCaruselSingleViewHolder(@NotNull NavLikezoneCaruselBannerSingle.View navLikezoneCaruselBannerSingle, @NotNull l tokenizedAnalytics, @NotNull c customActionHandlersStore, @NotNull ComposerReferences composerReferences) {
        super(navLikezoneCaruselBannerSingle);
        Intrinsics.checkNotNullParameter(navLikezoneCaruselBannerSingle, "navLikezoneCaruselBannerSingle");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        this.navLikezoneCaruselBannerSingle = navLikezoneCaruselBannerSingle;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.customActionHandlersStore = customActionHandlersStore;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(composerReferences, this).customActionHandlers(new NavLikezoneCaruselSingleViewHolder$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        navLikezoneCaruselBannerSingle.attachActionHandler(buildHandler);
        navLikezoneCaruselBannerSingle.onClickListener(new AnonymousClass1());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull NavLikezoneCaruselVI.Single item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        item.applyState(this.navLikezoneCaruselBannerSingle);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull NavLikezoneCaruselVI.Single item, @NotNull W10.c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        item.getBanner().trackView(this.tokenizedAnalytics);
    }
}
