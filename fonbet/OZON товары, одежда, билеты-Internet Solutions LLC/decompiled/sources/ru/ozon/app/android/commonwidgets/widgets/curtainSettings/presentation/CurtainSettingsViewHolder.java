package ru.ozon.app.android.commonwidgets.widgets.curtainSettings.presentation;

import Vg.d;
import W10.c;
import WZ.l;
import WZ.t;
import android.app.Dialog;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import d20.AbstractC6065b;
import hL.ViewOnLayoutChangeListenerC6887a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.android.component.sheet.SheetDialog;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u001c\u0010$\u001a\u0004\u0018\u00010#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R$\u0010)\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtainSettings/presentation/CurtainSettingsViewHolder;", "Ld20/b;", "Lru/ozon/app/android/commonwidgets/widgets/curtainSettings/presentation/CurtainSettingsVO;", "Ll10/i;", "container", "LWZ/l;", "tokenizedAnalytics", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Ll10/i;LWZ/l;LVg/d;)V", "Lkotlin/Function1;", "Lru/ozon/uni/android/component/sheet/SheetDialog;", "", "configuration", "configureSheet", "(Lkotlin/jvm/functions/Function1;)V", "item", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/commonwidgets/widgets/curtainSettings/presentation/CurtainSettingsVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "bind", "(Lru/ozon/app/android/commonwidgets/widgets/curtainSettings/presentation/CurtainSettingsVO;)V", "onWidgetCreated", "()V", "onWidgetDestroyed", "Ll10/i;", "getContainer", "()Ll10/i;", "LWZ/l;", "LVg/d;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroid/view/View$OnLayoutChangeListener;", "onContainerLayoutChanged", "Landroid/view/View$OnLayoutChangeListener;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CurtainSettingsViewHolder extends AbstractC6065b<CurtainSettingsVO> {
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final i container;

    @NotNull
    private final d customActionHandlersStoreFactory;
    private final View metricView;

    @NotNull
    private final View.OnLayoutChangeListener onContainerLayoutChanged;

    @NotNull
    private final l tokenizedAnalytics;

    public CurtainSettingsViewHolder(@NotNull i container, @NotNull l tokenizedAnalytics, @NotNull d customActionHandlersStoreFactory) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.container = container;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.onContainerLayoutChanged = new ViewOnLayoutChangeListenerC6887a(this, 2);
    }

    private final void configureSheet(Function1<? super SheetDialog, Unit> configuration) {
        ComponentCallbacksC5392m c11 = this.container.Q().c();
        ComponentCallbacksC5392m parentFragment = c11 != null ? c11.getParentFragment() : null;
        if (parentFragment instanceof BottomSheetComposerFragment) {
            Dialog dialog = ((BottomSheetComposerFragment) parentFragment).getDialog();
            if (dialog instanceof SheetDialog) {
                configuration.invoke(dialog);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onContainerLayoutChanged$lambda$1(CurtainSettingsViewHolder curtainSettingsViewHolder, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        CurtainSettingsVO boundData = curtainSettingsViewHolder.getBoundData();
        if (boundData != null) {
            curtainSettingsViewHolder.configureSheet(new CurtainSettingsViewHolder$onContainerLayoutChanged$1$1$1(boundData));
        }
    }

    @NotNull
    public final i getContainer() {
        return this.container;
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        this.container.Y().addOnLayoutChangeListener(this.onContainerLayoutChanged);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        this.container.Y().removeOnLayoutChangeListener(this.onContainerLayoutChanged);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull CurtainSettingsVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        configureSheet(new CurtainSettingsViewHolder$bind$1(item, this));
    }

    @Override // d20.AbstractC6065b
    public void trackView(@NotNull CurtainSettingsVO item, @NotNull c trackingData, @NotNull f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        super.trackView((CurtainSettingsViewHolder) item, trackingData, viewedPond);
        t trackingInfo = item.getTrackingInfo();
        if (trackingInfo != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, trackingInfo, null, 2, null);
        }
    }
}
