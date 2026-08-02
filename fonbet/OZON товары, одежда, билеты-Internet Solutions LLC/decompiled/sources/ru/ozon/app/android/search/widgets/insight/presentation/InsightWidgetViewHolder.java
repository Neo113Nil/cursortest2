package ru.ozon.app.android.search.widgets.insight.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import WZ.t;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.RecyclerView;
import b20.C5521a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.c;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.product.tiles.tilescroll.data.InsightTileScrollPlaceholder;
import ru.ozon.app.android.search.widgets.insight.data.InsightDTO;
import ru.ozon.app.android.search.widgets.insight.presentation.badges.InsightBadgesAdapter;
import ru.ozon.app.android.search.widgets.insight.presentation.badges.InsightBadgesDecorator;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.core.UniColors;
import xe.B0;

@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 ^2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004:\u0001^B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\r*\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\r*\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J5\u0010\u001f\u001a\u00020\u001e*\u00020\u00122\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u001bH\u0002¢\u0006\u0004\b%\u0010&J\u0013\u0010'\u001a\u00020\r*\u00020\u0012H\u0002¢\u0006\u0004\b'\u0010(J\u001b\u0010-\u001a\u00020,2\n\u0010+\u001a\u00060)j\u0002`*H\u0002¢\u0006\u0004\b-\u0010.J#\u00101\u001a\u00020\r2\n\u0010/\u001a\u00060)j\u0002`*2\u0006\u00100\u001a\u00020\u001bH\u0002¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020\u001b*\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\rH\u0002¢\u0006\u0004\b5\u0010\u000fJ#\u00109\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u00022\n\u00108\u001a\u000606j\u0002`7H\u0014¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\rH\u0016¢\u0006\u0004\b;\u0010\u000fJ\u000f\u0010<\u001a\u00020\rH\u0016¢\u0006\u0004\b<\u0010\u000fJ3\u0010C\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u00022\n\u0010?\u001a\u00060=j\u0002`>2\u000e\u0010B\u001a\n\u0018\u00010@j\u0004\u0018\u0001`AH\u0016¢\u0006\u0004\bC\u0010DR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010E\u001a\u0004\bF\u0010GR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010HR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010IR \u0010L\u001a\u000e\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\r0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001e\u0010S\u001a\n\u0012\u0004\u0012\u00020R\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u001e\u0010U\u001a\n\u0018\u00010)j\u0004\u0018\u0001`*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u001e\u0010W\u001a\n\u0018\u00010)j\u0004\u0018\u0001`*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010VR\u0014\u0010Y\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0018\u0010\\\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]¨\u0006_"}, d2 = {"Lru/ozon/app/android/search/widgets/insight/presentation/InsightWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/search/widgets/insight/presentation/InsightWidgetVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "", "Lru/ozon/app/android/search/widgets/insight/presentation/InsightWidgetView;", "containerView", "Ll10/i;", "screenContainer", "Lru/ozon/app/android/search/widgets/insight/presentation/DeleteSearchInsightViewModel;", "viewModel", "<init>", "(Lru/ozon/app/android/search/widgets/insight/presentation/InsightWidgetView;Ll10/i;Lru/ozon/app/android/search/widgets/insight/presentation/DeleteSearchInsightViewModel;)V", "", "subscribeDeleteInsightEvents", "()V", "subscribeToViewholderLifecycle", "unsubscribeDeleteInsightEvents", "Lru/ozon/app/android/search/widgets/insight/presentation/InsightIslandView;", "Lru/ozon/app/android/search/widgets/insight/data/InsightDTO$FooterDTO;", CommentV3DTO.FOOTER_FIELD_NAME, "bindFooterOrGone", "(Lru/ozon/app/android/search/widgets/insight/presentation/InsightIslandView;Lru/ozon/app/android/search/widgets/insight/data/InsightDTO$FooterDTO;)V", "updateFooterWithoutBadges", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badges", "", "paddingTop", "paddingBottom", "Landroidx/recyclerview/widget/RecyclerView;", "bindFooter", "(Lru/ozon/app/android/search/widgets/insight/presentation/InsightIslandView;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)Landroidx/recyclerview/widget/RecyclerView;", "item", "setRoundedBackground", "(Lru/ozon/app/android/search/widgets/insight/presentation/InsightWidgetVO;)V", "indexOfNestedWidget", "parsePlaceholders", "(I)V", "removeOldPlaceholder", "(Lru/ozon/app/android/search/widgets/insight/presentation/InsightIslandView;)V", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "newPlaceholder", "", "arePlaceHoldersTheSame", "(Lru/ozon/composer/ui/widget/l;)Z", "viewObject", "index", "addNestedWidget", "(Lru/ozon/composer/ui/widget/l;I)V", "paddingOrZero", "(Ljava/lang/Integer;)I", "showNotification", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/search/widgets/insight/presentation/InsightWidgetVO;Ll20/d;)V", "onAttach", "onDetach", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/search/widgets/insight/presentation/InsightWidgetVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/search/widgets/insight/presentation/InsightWidgetView;", "getContainerView", "()Lru/ozon/app/android/search/widgets/insight/presentation/InsightWidgetView;", "Ll10/i;", "Lru/ozon/app/android/search/widgets/insight/presentation/DeleteSearchInsightViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/search/widgets/insight/presentation/badges/InsightBadgesAdapter;", "badgesAdapter", "Lru/ozon/app/android/search/widgets/insight/presentation/badges/InsightBadgesAdapter;", "Lb20/a;", "Ll20/c;", "nestedViewHolder", "Lru/ozon/composer/ui/widget/k;", "oldPlaceholderViewItem", "Lru/ozon/composer/ui/widget/l;", "newPlaceholderViewItem", "Lru/ozon/app/android/search/widgets/insight/presentation/badges/InsightBadgesDecorator;", "insightBadgesDecorator", "Lru/ozon/app/android/search/widgets/insight/presentation/badges/InsightBadgesDecorator;", "Lxe/B0;", "job", "Lxe/B0;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InsightWidgetViewHolder extends k<InsightWidgetVO> {
    private static int additionalBottomPadding;

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final InsightBadgesAdapter badgesAdapter;

    @NotNull
    private final InsightWidgetView containerView;

    @NotNull
    private final InsightBadgesDecorator insightBadgesDecorator;
    private B0 job;
    private k nestedViewHolder;
    private l newPlaceholderViewItem;
    private l oldPlaceholderViewItem;

    @NotNull
    private final i screenContainer;

    @NotNull
    private final DeleteSearchInsightViewModel viewModel;
    public static final int $stable = 8;
    private static final int dp4 = ResourceExtKt.toPx(4);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsightWidgetViewHolder(@NotNull InsightWidgetView containerView, @NotNull i screenContainer, @NotNull DeleteSearchInsightViewModel viewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(screenContainer, "screenContainer");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.containerView = containerView;
        this.screenContainer = screenContainer;
        this.viewModel = viewModel;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(screenContainer, this).onPreProcess(new InsightWidgetViewHolder$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        InsightBadgesAdapter insightBadgesAdapter = new InsightBadgesAdapter(buildHandler, this);
        this.badgesAdapter = insightBadgesAdapter;
        this.insightBadgesDecorator = new InsightBadgesDecorator();
        getContainerView().getIslandView().getFooterRv().setAdapter(insightBadgesAdapter);
        final AbstractC5434v lifecycle = screenContainer.Q().g().getLifecycle();
        AbstractC5434v.b b11 = lifecycle.b();
        AbstractC5434v.b bVar = AbstractC5434v.b.DESTROYED;
        if (b11 == bVar) {
            k kVar = this.nestedViewHolder;
            if (kVar != null) {
                C5521a.c(kVar, bVar);
            }
            this.nestedViewHolder = null;
        } else {
            lifecycle.a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.search.widgets.insight.presentation.InsightWidgetViewHolder$special$$inlined$whenDestroyed$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(J owner) {
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    k kVar2 = this.nestedViewHolder;
                    if (kVar2 != null) {
                        C5521a.c(kVar2, AbstractC5434v.b.DESTROYED);
                    }
                    this.nestedViewHolder = null;
                    AbstractC5434v.this.e(this);
                }
            });
        }
        subscribeDeleteInsightEvents();
        subscribeToViewholderLifecycle();
    }

    private final void addNestedWidget(l viewObject, int index) {
        InsightIslandView islandView = getContainerView().getIslandView();
        ru.ozon.composer.ui.widget.i iVar = new ru.ozon.composer.ui.widget.i(islandView, this.screenContainer);
        this.screenContainer.d0().c(iVar, viewObject);
        k<c> source = this.screenContainer.d0().f(iVar, viewObject.j());
        if (source != null) {
            Intrinsics.checkNotNullParameter(source, "source");
            C5521a.c(source, AbstractC5434v.b.CREATED);
            Intrinsics.checkNotNullParameter(viewObject, "widgetViewItem");
            source.track(viewObject);
            C5521a.a(source, viewObject, this.screenContainer.c0());
            this.nestedViewHolder = source;
            islandView.addView(source.itemView, index);
        }
        this.oldPlaceholderViewItem = viewObject;
    }

    private final boolean arePlaceHoldersTheSame(l newPlaceholder) {
        l lVar = this.oldPlaceholderViewItem;
        return lVar != null && lVar.f() == newPlaceholder.f();
    }

    private final RecyclerView bindFooter(InsightIslandView insightIslandView, List<BadgeDTO> list, Integer num, Integer num2) {
        RecyclerView footerRv = insightIslandView.getFooterRv();
        footerRv.removeItemDecoration(this.insightBadgesDecorator);
        footerRv.addItemDecoration(this.insightBadgesDecorator);
        footerRv.setPadding(0, paddingOrZero(num), 0, paddingOrZero(num2));
        this.badgesAdapter.submitList(list);
        ViewExtKt.show(footerRv);
        return footerRv;
    }

    private final void bindFooterOrGone(InsightIslandView insightIslandView, InsightDTO.FooterDTO footerDTO) {
        if ((footerDTO != null ? footerDTO.getBadges() : null) == null) {
            return;
        }
        bindFooter(insightIslandView, footerDTO.getBadges(), footerDTO.getPaddingTop(), footerDTO.getPaddingBottom());
    }

    private final int paddingOrZero(Integer num) {
        if (num != null) {
            return ResourceExtKt.toPx(num.intValue());
        }
        return 0;
    }

    private final void parsePlaceholders(int indexOfNestedWidget) {
        List<l> list;
        Map<String, List<l>> nestedWidgets = getNestedWidgets();
        l lVar = (nestedWidgets == null || (list = nestedWidgets.get("default")) == null) ? null : (l) C7714v.Q(0, list);
        this.newPlaceholderViewItem = lVar;
        if (lVar == null) {
            return;
        }
        additionalBottomPadding = lVar.d() instanceof InsightTileScrollPlaceholder ? dp4 : 0;
        InsightIslandView islandView = getContainerView().getIslandView();
        InsightWidgetVO boundData = getBoundData();
        updateFooterWithoutBadges(islandView, boundData != null ? boundData.getFooter() : null);
        if (!arePlaceHoldersTheSame(lVar)) {
            removeOldPlaceholder(getContainerView().getIslandView());
            addNestedWidget(lVar, indexOfNestedWidget);
        } else {
            k kVar = this.nestedViewHolder;
            if (kVar != null) {
                C5521a.a(kVar, lVar, this.screenContainer.c0());
            }
        }
    }

    private final void removeOldPlaceholder(InsightIslandView insightIslandView) {
        for (View view : ViewGroupExtKt.children(insightIslandView)) {
            if (view.getId() != insightIslandView.getFooterRv().getId() && view.getId() != insightIslandView.getHeaderCell().getId()) {
                insightIslandView.removeView(view);
            }
        }
        k kVar = this.nestedViewHolder;
        if (kVar != null) {
            C5521a.c(kVar, AbstractC5434v.b.DESTROYED);
        }
    }

    private final void setRoundedBackground(InsightWidgetVO item) {
        int parseColor = StyleParser.INSTANCE.parseColor(getContext(), item.getBackgroundColor(), UniColors.LAYER_FLOOR_1.getResId());
        Integer borderRadius = item.getBorderRadius();
        int intValue = borderRadius != null ? borderRadius.intValue() : 0;
        int paddingOrZero = paddingOrZero(item.getMarginTop());
        int paddingOrZero2 = paddingOrZero(item.getMarginBottom());
        InsightWidgetView containerView = getContainerView();
        if (intValue == 0) {
            containerView.setNotRoundedBg(parseColor);
        } else {
            containerView.setIsland(parseColor, intValue);
        }
        if (containerView.getPaddingTop() == paddingOrZero && containerView.getPaddingBottom() == paddingOrZero2) {
            return;
        }
        containerView.setPadding(0, paddingOrZero, 0, paddingOrZero2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotification() {
        NotificationDTO deleteErrorNotification;
        NotificationLayoutManager asNotificationLayoutManager$default;
        InsightWidgetVO boundData = getBoundData();
        if (boundData == null || (deleteErrorNotification = boundData.getDeleteErrorNotification()) == null) {
            return;
        }
        ComponentCallbacksC5392m c11 = this.screenContainer.Q().c();
        View view = c11 != null ? c11.getView() : null;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(viewGroup, null, 1, null)) == null) {
            return;
        }
        NotificationBar.INSTANCE.make(asNotificationLayoutManager$default, deleteErrorNotification, this.screenContainer.K().f(), this.actionHandler).show();
    }

    private final void subscribeDeleteInsightEvents() {
        unsubscribeDeleteInsightEvents();
        this.job = C2399j.C(new C2408n0(C5427n.a(this.viewModel.observeResultFlow(), this.screenContainer.K().f().getLifecycle(), AbstractC5434v.b.STARTED), new InsightWidgetViewHolder$subscribeDeleteInsightEvents$1(this, null)), K.a(this.screenContainer.Q().g()));
    }

    private final void subscribeToViewholderLifecycle() {
        C2399j.C(new C2408n0(getLifecycle().c(), new InsightWidgetViewHolder$subscribeToViewholderLifecycle$1(this, null)), K.a(this));
    }

    private final void unsubscribeDeleteInsightEvents() {
        B0 b02 = this.job;
        if (b02 != null) {
            b02.j(null);
        }
        this.job = null;
    }

    private final void updateFooterWithoutBadges(InsightIslandView insightIslandView, InsightDTO.FooterDTO footerDTO) {
        if ((footerDTO != null ? footerDTO.getBadges() : null) == null) {
            ViewExtKt.gone(insightIslandView.getFooterRv());
            insightIslandView.setPadding(0, 0, 0, additionalBottomPadding);
        }
    }

    @NotNull
    public InsightWidgetView getContainerView() {
        return this.containerView;
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        k kVar = this.nestedViewHolder;
        if (kVar != null) {
            C5521a.c(kVar, AbstractC5434v.b.CREATED);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        k kVar = this.nestedViewHolder;
        if (kVar != null) {
            C5521a.c(kVar, AbstractC5434v.b.DESTROYED);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull InsightWidgetVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        InsightBadgesDecorator insightBadgesDecorator = this.insightBadgesDecorator;
        InsightDTO.FooterDTO footer = item.getFooter();
        int paddingOrZero = paddingOrZero(footer != null ? footer.getPaddingLeft() : null);
        InsightDTO.FooterDTO footer2 = item.getFooter();
        insightBadgesDecorator.setOffset(paddingOrZero, paddingOrZero(footer2 != null ? footer2.getPaddingRight() : null));
        setRoundedBackground(item);
        InsightIslandView islandView = getContainerView().getIslandView();
        CellHolderKt.bindOrGone(islandView.getHeaderCell(), item.getHeader(), this.actionHandler);
        bindFooterOrGone(islandView, item.getFooter());
        parsePlaceholders(item.getHeader() == null ? 0 : 1);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull InsightWidgetVO item, @NotNull W10.c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.screenContainer.X(), tokenizedEvent, null, 2, null);
        }
    }
}
