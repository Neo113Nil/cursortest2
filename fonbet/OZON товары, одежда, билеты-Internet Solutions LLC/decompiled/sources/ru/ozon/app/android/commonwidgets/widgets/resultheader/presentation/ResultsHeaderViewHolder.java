package ru.ozon.app.android.commonwidgets.widgets.resultheader.presentation;

import W10.c;
import WZ.t;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import com.google.android.flexbox.FlexboxLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.action.sheet.ActionSheetEventHandler;
import ru.ozon.app.android.action.sheet.DisposableActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.commonwidgets.R$drawable;
import ru.ozon.app.android.commonwidgets.databinding.WidgetResultsHeaderBinding;
import ru.ozon.app.android.commonwidgets.widgets.resultheader.domain.ResultHeaderAtomActionSheetHandler;
import ru.ozon.app.android.commonwidgets.widgets.resultheader.domain.ResultsHeaderRepository;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.ui.shoppinglists.ShoppingListsViewModel;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.HorizontalFlexAtomsDecorator;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@Metadata(d1 = {"\u0000\u0091\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u00011\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0019\u001a\u00020\u00172\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010\"\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00022\n\u0010\u001e\u001a\u00060\u001cj\u0002`\u001d2\u000e\u0010!\u001a\n\u0018\u00010\u001fj\u0004\u0018\u0001` H\u0016¢\u0006\u0004\b\"\u0010#J#\u0010'\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00022\n\u0010&\u001a\u00060$j\u0002`%H\u0014¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00067"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/resultheader/presentation/ResultsHeaderViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/commonwidgets/widgets/resultheader/presentation/ResultsHeaderVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "actionSheetEventHandler", "Lru/ozon/app/android/commonwidgets/widgets/resultheader/domain/ResultsHeaderRepository;", "repository", "Lru/ozon/app/android/favorites/ui/shoppinglists/ShoppingListsViewModel;", "shoppingListsViewModel", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;Lru/ozon/app/android/commonwidgets/widgets/resultheader/domain/ResultsHeaderRepository;Lru/ozon/app/android/favorites/ui/shoppinglists/ShoppingListsViewModel;Lru/ozon/app/android/account/adult/presenter/AdultHandler;)V", "", "Lru/ozon/uni/atoms/data/badge/Badge;", "badge", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "bindBadge", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "item", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/commonwidgets/widgets/resultheader/presentation/ResultsHeaderVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/commonwidgets/widgets/resultheader/presentation/ResultsHeaderVO;Ll20/d;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "Lru/ozon/app/android/commonwidgets/widgets/resultheader/domain/ResultHeaderAtomActionSheetHandler;", "favoritesListsActionHandler", "Lru/ozon/app/android/commonwidgets/widgets/resultheader/domain/ResultHeaderAtomActionSheetHandler;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "atomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "ru/ozon/app/android/commonwidgets/widgets/resultheader/presentation/ResultsHeaderViewHolder$adapterDecorator$1", "adapterDecorator", "Lru/ozon/app/android/commonwidgets/widgets/resultheader/presentation/ResultsHeaderViewHolder$adapterDecorator$1;", "Lru/ozon/app/android/commonwidgets/databinding/WidgetResultsHeaderBinding;", "binding", "Lru/ozon/app/android/commonwidgets/databinding/WidgetResultsHeaderBinding;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ResultsHeaderViewHolder extends k<ResultsHeaderVO> {

    @NotNull
    private final ActionSheetEventHandler actionSheetEventHandler;

    @NotNull
    private final ResultsHeaderViewHolder$adapterDecorator$1 adapterDecorator;

    @NotNull
    private final AtomsAdapter atomsAdapter;

    @NotNull
    private final WidgetResultsHeaderBinding binding;

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final ResultHeaderAtomActionSheetHandler favoritesListsActionHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r9v1, types: [ru.ozon.app.android.commonwidgets.widgets.resultheader.presentation.ResultsHeaderViewHolder$adapterDecorator$1] */
    public ResultsHeaderViewHolder(@NotNull View containerView, @NotNull ComposerReferences composerReferences, @NotNull ActionSheetEventHandler actionSheetEventHandler, @NotNull ResultsHeaderRepository repository, @NotNull ShoppingListsViewModel shoppingListsViewModel, @NotNull AdultHandler adultHandler) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(actionSheetEventHandler, "actionSheetEventHandler");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(shoppingListsViewModel, "shoppingListsViewModel");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        this.composerReferences = composerReferences;
        this.actionSheetEventHandler = actionSheetEventHandler;
        this.favoritesListsActionHandler = new ResultHeaderAtomActionSheetHandler(repository, shoppingListsViewModel, composerReferences, adultHandler);
        this.atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.adapterDecorator = new HorizontalFlexAtomsDecorator() { // from class: ru.ozon.app.android.commonwidgets.widgets.resultheader.presentation.ResultsHeaderViewHolder$adapterDecorator$1
            @Override // ru.ozon.uni.atoms.af.CommonAtomDecorator
            public void decorate(Canvas canvas, Rect rect, int i11, boolean z11) {
                HorizontalFlexAtomsDecorator.DefaultImpls.decorate(this, canvas, rect, i11, z11);
            }

            @Override // ru.ozon.uni.atoms.af.HorizontalFlexAtomsDecorator
            public int horizontalDividerDrawable() {
                return R$drawable.space_flexbox_results_header_badge;
            }

            @Override // ru.ozon.uni.atoms.af.HorizontalFlexAtomsDecorator
            public int justifyContent() {
                return HorizontalFlexAtomsDecorator.DefaultImpls.justifyContent(this);
            }

            @Override // ru.ozon.uni.atoms.af.HorizontalFlexAtomsDecorator
            public FlexboxLayout.a modifyVerticalLayoutParams(FlexboxLayout.a aVar, AtomDTO atomDTO, int i11, boolean z11) {
                return HorizontalFlexAtomsDecorator.DefaultImpls.modifyVerticalLayoutParams(this, aVar, atomDTO, i11, z11);
            }

            @Override // ru.ozon.uni.atoms.af.HorizontalFlexAtomsDecorator
            public int showDividerHorizontal() {
                return HorizontalFlexAtomsDecorator.DefaultImpls.showDividerHorizontal(this);
            }

            @Override // ru.ozon.uni.atoms.af.HorizontalFlexAtomsDecorator
            public int showDividerVertical() {
                return HorizontalFlexAtomsDecorator.DefaultImpls.showDividerVertical(this);
            }
        };
        WidgetResultsHeaderBinding bind = WidgetResultsHeaderBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
    }

    private final void bindBadge(List<Badge> badge, Function1<? super AtomAction, Unit> onAction) {
        WidgetResultsHeaderBinding widgetResultsHeaderBinding = this.binding;
        List<Badge> list = badge;
        if (list == null || list.isEmpty()) {
            BadgeView singleHeaderBadge = widgetResultsHeaderBinding.singleHeaderBadge;
            Intrinsics.checkNotNullExpressionValue(singleHeaderBadge, "singleHeaderBadge");
            ViewExtKt.gone(singleHeaderBadge);
            HorizontalFlexAtomsLayout multiplyFlexboxBages = widgetResultsHeaderBinding.multiplyFlexboxBages;
            Intrinsics.checkNotNullExpressionValue(multiplyFlexboxBages, "multiplyFlexboxBages");
            ViewExtKt.gone(multiplyFlexboxBages);
            return;
        }
        if (badge.size() == 1) {
            HorizontalFlexAtomsLayout multiplyFlexboxBages2 = widgetResultsHeaderBinding.multiplyFlexboxBages;
            Intrinsics.checkNotNullExpressionValue(multiplyFlexboxBages2, "multiplyFlexboxBages");
            ViewExtKt.gone(multiplyFlexboxBages2);
            BadgeView singleHeaderBadge2 = widgetResultsHeaderBinding.singleHeaderBadge;
            Intrinsics.checkNotNullExpressionValue(singleHeaderBadge2, "singleHeaderBadge");
            ViewExtKt.show(singleHeaderBadge2);
            BadgeView singleHeaderBadge3 = widgetResultsHeaderBinding.singleHeaderBadge;
            Intrinsics.checkNotNullExpressionValue(singleHeaderBadge3, "singleHeaderBadge");
            BadgeHolderKt.bind(singleHeaderBadge3, (Badge) C7714v.K(badge), onAction);
            return;
        }
        BadgeView singleHeaderBadge4 = widgetResultsHeaderBinding.singleHeaderBadge;
        Intrinsics.checkNotNullExpressionValue(singleHeaderBadge4, "singleHeaderBadge");
        ViewExtKt.gone(singleHeaderBadge4);
        HorizontalFlexAtomsLayout multiplyFlexboxBages3 = widgetResultsHeaderBinding.multiplyFlexboxBages;
        Intrinsics.checkNotNullExpressionValue(multiplyFlexboxBages3, "multiplyFlexboxBages");
        ViewExtKt.show(multiplyFlexboxBages3);
        this.atomsAdapter.setOnAction(onAction);
        widgetResultsHeaderBinding.multiplyFlexboxBages.setAdapter(this.atomsAdapter);
        widgetResultsHeaderBinding.multiplyFlexboxBages.setDecorator(this.adapterDecorator);
        this.atomsAdapter.bind(getContext(), badge);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ResultsHeaderVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetResultsHeaderBinding widgetResultsHeaderBinding = this.binding;
        widgetResultsHeaderBinding.titleTv.setText(item.getTitle());
        widgetResultsHeaderBinding.subtitleTv.setText(item.getSubtitle());
        SmallIconButtonView sharingVAL = widgetResultsHeaderBinding.sharingVAL;
        Intrinsics.checkNotNullExpressionValue(sharingVAL, "sharingVAL");
        ViewExtKt.showOrGone(sharingVAL, Boolean.valueOf(item.getActionButton() != null));
        DisposableActionHandler buildDisposableHandler = new ActionHandler.Builder(this.composerReferences, this).onPreProcess(new ResultsHeaderViewHolder$bind$1$actionHandler$1(this.favoritesListsActionHandler)).buildDisposableHandler(item.getId(), getLifecycle(), this.actionSheetEventHandler);
        ButtonV3Atom.SmallIconButton actionButton = item.getActionButton();
        if (actionButton != null) {
            SmallIconButtonView sharingVAL2 = widgetResultsHeaderBinding.sharingVAL;
            Intrinsics.checkNotNullExpressionValue(sharingVAL2, "sharingVAL");
            WrappedIconButtonHolderKt.bind(sharingVAL2, actionButton, buildDisposableHandler.getHandler());
        }
        bindBadge(item.getBadge(), buildDisposableHandler.getHandler());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull ResultsHeaderVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.composerReferences.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
