package ru.ozon.app.android.marketing.widgets.badgeTimer.presentation;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.a;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.P;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.R$id;
import ru.ozon.app.android.marketing.databinding.WidgetBadgeTimerLayoutBinding;
import ru.ozon.app.android.storefrontcommonwidgets.core.appType.AppTypeResolver;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 *2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001*B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00022\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\r0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010)\u001a\u0004\u0018\u00010&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lru/ozon/app/android/marketing/widgets/badgeTimer/presentation/BadgeTimerWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/marketing/widgets/badgeTimer/presentation/BadgeTimerVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Landroidx/lifecycle/J;", "owner", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Landroidx/lifecycle/J;)V", "lifecycle", "", "observeTimer", "(Landroidx/lifecycle/J;)Lkotlin/Unit;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "timerView", "applyTimerStyle", "(Lru/ozon/uni/android/atom/badge/BadgeView;)V", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/marketing/widgets/badgeTimer/presentation/BadgeTimerVO;Ll20/d;)V", "", "dp16", "I", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/marketing/databinding/WidgetBadgeTimerLayoutBinding;", "binding", "Lru/ozon/app/android/marketing/databinding/WidgetBadgeTimerLayoutBinding;", "Lru/ozon/app/android/marketing/widgets/badgeTimer/presentation/BadgeTimerViewModel;", "getViewModel", "()Lru/ozon/app/android/marketing/widgets/badgeTimer/presentation/BadgeTimerViewModel;", "viewModel", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BadgeTimerWidgetViewHolder extends k<BadgeTimerVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetBadgeTimerLayoutBinding binding;
    private final int dp16;
    public static final int $stable = 8;
    private static final int MIN_WIDTH = ResourceExtKt.toPx(92);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeTimerWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull J owner) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.dp16 = ResourceExtKt.toPx(16);
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        WidgetBadgeTimerLayoutBinding bind = WidgetBadgeTimerLayoutBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        bind.getConstraintLayout().setTag(R$id.skip_composer_default_widget_background, Unit.f71690a);
        owner.getLifecycle().a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.marketing.widgets.badgeTimer.presentation.BadgeTimerWidgetViewHolder.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onPause(J owner2) {
                Intrinsics.checkNotNullParameter(owner2, "owner");
                BadgeTimerViewModel viewModel = BadgeTimerWidgetViewHolder.this.getViewModel();
                if (viewModel != null) {
                    viewModel.clear();
                }
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(J owner2) {
                Long timestampEnd;
                Intrinsics.checkNotNullParameter(owner2, "owner");
                BadgeTimerVO boundedData = BadgeTimerWidgetViewHolder.this.getBoundedData();
                if (boundedData == null || (timestampEnd = boundedData.getTimestampEnd()) == null) {
                    return;
                }
                BadgeTimerWidgetViewHolder badgeTimerWidgetViewHolder = BadgeTimerWidgetViewHolder.this;
                long longValue = timestampEnd.longValue();
                BadgeTimerViewModel viewModel = badgeTimerWidgetViewHolder.getViewModel();
                if (viewModel != null) {
                    viewModel.calculateMillisRemain(longValue);
                }
            }
        });
        BadgeView countdownTv = bind.countdownTv;
        Intrinsics.checkNotNullExpressionValue(countdownTv, "countdownTv");
        applyTimerStyle(countdownTv);
        if (AppTypeResolver.INSTANCE.isSelect(getContext())) {
            return;
        }
        bind.getConstraintLayout().setBackgroundColor(a.getColor(getContext(), UniColors.LAYER_FLOOR_1.getResId()));
    }

    private final void applyTimerStyle(BadgeView timerView) {
        AppTypeResolver appTypeResolver = AppTypeResolver.INSTANCE;
        int themeColor = appTypeResolver.isSelect(getContext()) ? ThemeExtKt.themeColor(getContext(), R$attr.textPrimaryOnDark) : ThemeExtKt.themeColor(getContext(), R$attr.textPrimary);
        timerView.setBackColor(new Color.Solid(ThemeExtKt.themeColor(getContext(), appTypeResolver.isSelect(getContext()) ? R$attr.clearLightKey300 : R$attr.layerFloor0)));
        timerView.setTextColor(themeColor);
        timerView.setSize(BadgeDTO.BadgeSize.SIZE_500);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BadgeTimerViewModel getViewModel() {
        return (BadgeTimerViewModel) getWidgetViewModel();
    }

    private final Unit observeTimer(J lifecycle) {
        P<String> countdown;
        WidgetBadgeTimerLayoutBinding widgetBadgeTimerLayoutBinding = this.binding;
        BadgeTimerViewModel viewModel = getViewModel();
        if (viewModel == null || (countdown = viewModel.getCountdown()) == null) {
            return null;
        }
        countdown.observe(lifecycle, new BadgeTimerWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new BadgeTimerWidgetViewHolder$observeTimer$1$1(widgetBadgeTimerLayoutBinding)));
        return Unit.f71690a;
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        BadgeTimerVO boundedData = getBoundedData();
        if ((boundedData != null ? boundedData.getTimestampEnd() : null) != null) {
            observeTimer(lifecycle);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull BadgeTimerVO item, @NotNull d info) {
        Unit unit;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetBadgeTimerLayoutBinding widgetBadgeTimerLayoutBinding = this.binding;
        BadgeView badgeBV = widgetBadgeTimerLayoutBinding.badgeBV;
        Intrinsics.checkNotNullExpressionValue(badgeBV, "badgeBV");
        BadgeHolderKt.bind(badgeBV, item.getBadge(), this.actionHandler);
        Long timestampEnd = item.getTimestampEnd();
        if (timestampEnd != null) {
            long longValue = timestampEnd.longValue();
            BadgeView badgeBV2 = widgetBadgeTimerLayoutBinding.badgeBV;
            Intrinsics.checkNotNullExpressionValue(badgeBV2, "badgeBV");
            ViewGroup.LayoutParams layoutParams = badgeBV2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginEnd(0);
            badgeBV2.setLayoutParams(layoutParams2);
            widgetBadgeTimerLayoutBinding.countdownTv.setMinimumWidth(MIN_WIDTH);
            BadgeView countdownTv = widgetBadgeTimerLayoutBinding.countdownTv;
            Intrinsics.checkNotNullExpressionValue(countdownTv, "countdownTv");
            ViewGroup.LayoutParams layoutParams3 = countdownTv.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
            layoutParams4.gravity = 17;
            countdownTv.setLayoutParams(layoutParams4);
            BadgeTimerViewModel viewModel = getViewModel();
            if (viewModel != null) {
                viewModel.calculateMillisRemain(longValue);
                unit = Unit.f71690a;
            } else {
                unit = null;
            }
            if (unit != null) {
                return;
            }
        }
        BadgeView countdownTv2 = widgetBadgeTimerLayoutBinding.countdownTv;
        Intrinsics.checkNotNullExpressionValue(countdownTv2, "countdownTv");
        ViewExtKt.gone(countdownTv2);
        BadgeView badgeBV3 = widgetBadgeTimerLayoutBinding.badgeBV;
        Intrinsics.checkNotNullExpressionValue(badgeBV3, "badgeBV");
        ViewGroup.LayoutParams layoutParams5 = badgeBV3.getLayoutParams();
        if (layoutParams5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
        layoutParams6.setMarginEnd(this.dp16);
        badgeBV3.setLayoutParams(layoutParams6);
    }
}
