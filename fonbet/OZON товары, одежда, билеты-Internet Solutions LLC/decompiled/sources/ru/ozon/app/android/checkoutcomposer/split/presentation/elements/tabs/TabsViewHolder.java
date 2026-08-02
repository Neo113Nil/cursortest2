package ru.ozon.app.android.checkoutcomposer.split.presentation.elements.tabs;

import Vg.d;
import W10.c;
import WZ.l;
import WZ.t;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.checkoutcomposer.split.presentation.elements.tabs.TabsVO;
import ru.ozon.app.android.checkoutcomposer.split.presentation.elements.tabs.TabsViewHolder;
import ru.ozon.app.android.checkoutgeo.checkout.data.PaddingsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.tabs.TabsView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.v3.holders.tabs.TabsHolderKt;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0018\u0010\u001b\u001a\u00060\u0019j\u0002`\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00110\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/tabs/TabsViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/tabs/TabsVO;", "Landroid/widget/FrameLayout;", "view", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Landroid/widget/FrameLayout;LVg/d;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "", "trackView", "(Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/tabs/TabsVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/tabs/TabsVO;Ll20/d;)V", "Landroid/widget/FrameLayout;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/android/atom/tabs/TabsView;", DynamicElementDTO.TABS, "Lru/ozon/uni/android/atom/tabs/TabsView;", "getTabs", "()Lru/ozon/uni/android/atom/tabs/TabsView;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TabsViewHolder extends k<TabsVO> {

    @NotNull
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final TabsView tabs;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final FrameLayout view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabsViewHolder(@NotNull FrameLayout view, @NotNull d customActionHandlersStoreFactory, @NotNull ComposerReferences refs) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.view = view;
        this.tokenizedAnalytics = refs.getTokenizedAnalytics();
        this.actionHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new TabsViewHolder$actionHandler$1(customActionHandlersStoreFactory)).onClick(new TabsViewHolder$actionHandler$2(refs)).buildHandler();
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TabsView tabsView = new TabsView(context, null, 0, 0, 14, null);
        tabsView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.tabs = tabsView;
        view.addView(tabsView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bind$lambda$3$lambda$2(TabsVO tabsVO, int i11, TabsViewHolder tabsViewHolder, View view, MotionEvent motionEvent) {
        CommonControlSettings common;
        AtomActionDTO action;
        if (motionEvent.getAction() == 1 && (common = tabsVO.getTabs().getTabs().get(i11).getCommon()) != null && (action = common.getAction()) != null) {
            CommonControlSettings common2 = tabsVO.getTabs().getTabs().get(i11).getCommon();
            AtomAction atomAction = AtomActionMapperKt.toAtomAction(action, common2 != null ? common2.getTrackingInfo() : null);
            if (atomAction != null) {
                tabsViewHolder.actionHandler.invoke(atomAction);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    @SuppressLint({"ClickableViewAccessibility"})
    public void bind(@NotNull final TabsVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TabsHolderKt.bind(this.tabs, item.getTabs(), null);
        PaddingsKt.updatePadding(this.view, item.getPaddings());
        Iterator<View> it = C5316f0.b(this.tabs).iterator();
        final int i11 = 0;
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                return;
            }
            Object next = c5314e0.next();
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            View view = (View) next;
            if (Intrinsics.d(item.getShouldDisableShadow(), Boolean.TRUE)) {
                view.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
                view.setElevation(0.0f);
            }
            view.setOnTouchListener(new View.OnTouchListener() { // from class: No.a
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    boolean bind$lambda$3$lambda$2;
                    bind$lambda$3$lambda$2 = TabsViewHolder.bind$lambda$3$lambda$2(TabsVO.this, i11, this, view2, motionEvent);
                    return bind$lambda$3$lambda$2;
                }
            });
            i11 = i12;
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull TabsVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((TabsViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
