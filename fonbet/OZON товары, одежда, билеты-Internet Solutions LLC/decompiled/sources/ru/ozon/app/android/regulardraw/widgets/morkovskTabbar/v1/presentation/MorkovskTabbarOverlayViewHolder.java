package ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v1.presentation;

import Sc.InterfaceC4008j;
import W10.c;
import WZ.m;
import WZ.t;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.regulardraw.databinding.MorkovskTabbarLayoutBinding;
import ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingDelegate;
import ru.ozon.app.android.regulardraw.utils.UtilKt;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v1.core.IndicatorDisableShowAnimationEvent;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v1.presentation.adapter.MorkovskTabItemViewHolder;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v1.presentation.adapter.MorkovskTabbarAdapter;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v1.presentation.adapter.MorkovskTabsDecoration;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010!\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010\u0019J\u000f\u0010$\u001a\u00020\u0010H\u0016¢\u0006\u0004\b$\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010%R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010&R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00100'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u001b\u00102\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/presentation/MorkovskTabbarOverlayViewHolder;", "Ld20/a;", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/presentation/MorkovskTabbarVO;", "Ll10/i;", "container", "Lru/ozon/app/android/regulardraw/databinding/MorkovskTabbarLayoutBinding;", "binding", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate;", "onboardingDelegate", "<init>", "(Ll10/i;Lru/ozon/app/android/regulardraw/databinding/MorkovskTabbarLayoutBinding;Ld20/e;Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate;)V", "", "isRefresh", "", "clearAnimations", "(Z)V", "", "pos", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/presentation/adapter/MorkovskTabItemViewHolder;", "getItemViewHolder", "(I)Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/presentation/adapter/MorkovskTabItemViewHolder;", "onWidgetCreated", "()V", "item", "bind", "(Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/presentation/MorkovskTabbarVO;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/presentation/MorkovskTabbarVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onRefresh", "onWidgetDestroyed", "Ll10/i;", "Lru/ozon/app/android/regulardraw/databinding/MorkovskTabbarLayoutBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/presentation/adapter/MorkovskTabbarAdapter;", "tabsAdapter", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/presentation/adapter/MorkovskTabbarAdapter;", "bottomContainer$delegate", "LSc/j;", "getBottomContainer", "()Landroid/widget/LinearLayout;", "bottomContainer", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MorkovskTabbarOverlayViewHolder extends AbstractC6064a<MorkovskTabbarVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final MorkovskTabbarLayoutBinding binding;

    /* renamed from: bottomContainer$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j bottomContainer;

    @NotNull
    private final i container;
    private MorkovskTabbarAdapter tabsAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MorkovskTabbarOverlayViewHolder(@NotNull i container, @NotNull MorkovskTabbarLayoutBinding binding, @NotNull InterfaceC6068e<LinearLayout> viewFactory, @NotNull MorkovskOnboardingDelegate onboardingDelegate) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        Intrinsics.checkNotNullParameter(onboardingDelegate, "onboardingDelegate");
        this.container = container;
        this.binding = binding;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(container, this).buildHandler();
        this.actionHandler = buildHandler;
        this.tabsAdapter = new MorkovskTabbarAdapter(container.X(), buildHandler, onboardingDelegate);
        this.bottomContainer = LazyUtilsKt.unsafeLazy(new MorkovskTabbarOverlayViewHolder$bottomContainer$2(this));
    }

    private final void clearAnimations(boolean isRefresh) {
        MorkovskTabbarAdapter morkovskTabbarAdapter = this.tabsAdapter;
        int shimmersCount = morkovskTabbarAdapter != null ? morkovskTabbarAdapter.getShimmersCount() : 0;
        for (int i11 = 0; i11 < shimmersCount; i11++) {
            MorkovskTabItemViewHolder itemViewHolder = getItemViewHolder(i11);
            if (itemViewHolder != null) {
                itemViewHolder.cancelAnimations(isRefresh);
            }
        }
    }

    private final LinearLayout getBottomContainer() {
        return (LinearLayout) this.bottomContainer.getValue();
    }

    private final MorkovskTabItemViewHolder getItemViewHolder(int pos) {
        RecyclerView.C findViewHolderForAdapterPosition = this.binding.morkovskTabbarRv.findViewHolderForAdapterPosition(pos);
        if (findViewHolderForAdapterPosition instanceof MorkovskTabItemViewHolder) {
            return (MorkovskTabItemViewHolder) findViewHolderForAdapterPosition;
        }
        return null;
    }

    @Override // d20.AbstractC6065b
    public void onRefresh() {
        super.onRefresh();
        clearAnimations(true);
        this.container.M().update(IndicatorDisableShowAnimationEvent.INSTANCE);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        super.onWidgetCreated();
        RecyclerView recyclerView = this.binding.morkovskTabbarRv;
        recyclerView.setAdapter(this.tabsAdapter);
        final Context context = recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(context) { // from class: ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v1.presentation.MorkovskTabbarOverlayViewHolder$onWidgetCreated$1$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
            /* renamed from: canScrollHorizontally */
            public boolean get$canScrollHorizontally() {
                return false;
            }
        });
        recyclerView.addItemDecoration(new MorkovskTabsDecoration());
        getBottomContainer().setGravity(17);
        getBottomContainer().setFitsSystemWindows(true);
        getBottomContainer().requestApplyInsets();
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        super.onWidgetDestroyed();
        clearAnimations(false);
        this.tabsAdapter = null;
        this.container.M().update(IndicatorDisableShowAnimationEvent.INSTANCE);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull MorkovskTabbarVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        MorkovskTabbarAdapter morkovskTabbarAdapter = this.tabsAdapter;
        if (morkovskTabbarAdapter != null) {
            morkovskTabbarAdapter.setShouldAnimate(item.getShouldAnimateShow());
        }
        MorkovskTabbarAdapter morkovskTabbarAdapter2 = this.tabsAdapter;
        if (morkovskTabbarAdapter2 != null) {
            morkovskTabbarAdapter2.setItems(item.getTabs());
        }
        List<String> bgGradientColors = item.getBgGradientColors();
        if (bgGradientColors != null) {
            List<String> list = bgGradientColors;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            for (String str : list) {
                Context L11 = this.container.L();
                Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
                arrayList.add(Integer.valueOf(UtilKt.parseColor(str, L11)));
            }
            int[] T02 = C7714v.T0(arrayList);
            LinearLayout bottomContainer = getBottomContainer();
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setGradientType(0);
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            gradientDrawable.setColors(T02);
            bottomContainer.setBackground(gradientDrawable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d20.AbstractC6065b
    public void trackView(@NotNull MorkovskTabbarVO item, @NotNull c trackingData, @NotNull f viewedPond) {
        t tokenizedEvent;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        MorkovskTabbarVO morkovskTabbarVO = (MorkovskTabbarVO) getBoundData();
        if (morkovskTabbarVO == null || (tokenizedEvent = morkovskTabbarVO.getTokenizedEvent()) == null) {
            return;
        }
        m.c(this.container.X(), tokenizedEvent, null);
    }
}
