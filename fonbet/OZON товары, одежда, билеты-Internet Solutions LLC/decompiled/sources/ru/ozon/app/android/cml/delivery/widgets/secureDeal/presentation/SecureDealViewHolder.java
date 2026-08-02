package ru.ozon.app.android.cml.delivery.widgets.secureDeal.presentation;

import Vg.d;
import W10.c;
import WZ.l;
import WZ.t;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.K;
import jk0.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.cml.delivery.molecules.secureDeal.data.SecureDealMoleculeDTO;
import ru.ozon.app.android.cml.delivery.molecules.secureDeal.presentation.SecureDealMoleculeView;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 32\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u00013B3\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00120#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/secureDeal/presentation/SecureDealViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/cml/delivery/widgets/secureDeal/presentation/SecureDealVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "LWZ/l;", "tokenizedAnalytics", "Landroid/widget/FrameLayout;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "<init>", "(LWZ/l;Landroid/widget/FrameLayout;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "item", "", "scrollToBottomBlockIfNeed", "(Lru/ozon/app/android/cml/delivery/widgets/secureDeal/presentation/SecureDealVO;)V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/cml/delivery/widgets/secureDeal/presentation/SecureDealVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/cml/delivery/widgets/secureDeal/presentation/SecureDealVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onRecycle", "()V", "LWZ/l;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/cml/delivery/molecules/secureDeal/presentation/SecureDealMoleculeView;", "secureDealView", "Lru/ozon/app/android/cml/delivery/molecules/secureDeal/presentation/SecureDealMoleculeView;", "Landroid/graphics/Rect;", "viewVisibleRect", "Landroid/graphics/Rect;", "Lxe/B0;", "scrollJob", "Lxe/B0;", "", "initialState", "Z", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SecureDealViewHolder extends k<SecureDealVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private boolean initialState;

    @NotNull
    private final ComposerReferences refs;
    private B0 scrollJob;

    @NotNull
    private final SecureDealMoleculeView secureDealView;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private Rect viewVisibleRect;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "event", "Landroid/view/MotionEvent;", "invoke", "(Landroid/view/MotionEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.cml.delivery.widgets.secureDeal.presentation.SecureDealViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<MotionEvent, Boolean> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(MotionEvent event) {
            SecureDealMoleculeDTO secureDeal;
            CommonControlSettings commonControlSettings;
            AtomActionDTO action;
            Intrinsics.checkNotNullParameter(event, "event");
            int action2 = event.getAction();
            boolean z11 = true;
            if (action2 == 0) {
                SecureDealVO boundData = SecureDealViewHolder.this.getBoundData();
                if (boundData != null && (secureDeal = boundData.getSecureDeal()) != null && (commonControlSettings = secureDeal.getCommonControlSettings()) != null && (action = commonControlSettings.getAction()) != null) {
                    SecureDealViewHolder.this.actionHandler.invoke(AtomActionMapperKt.toAtomAction(action, null));
                }
            } else if (action2 != 1) {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/secureDeal/presentation/SecureDealViewHolder$Companion;", "", "<init>", "()V", "MIN_PERCENT_NOT_SCROLL", "", "SCROLL_DELAY", "", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecureDealViewHolder(@NotNull l tokenizedAnalytics, @NotNull FrameLayout containerView, @NotNull ComposerReferences refs, @NotNull d customActionHandlersStoreFactory, @NotNull HandlersInhibitor handlersInhibitor) {
        super(containerView);
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.refs = refs;
        this.actionHandler = new ActionHandler.Builder(refs, this).enableClickThrottling(handlersInhibitor).customActionHandlers(new SecureDealViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        SecureDealMoleculeView secureDealMoleculeView = new SecureDealMoleculeView(getContext(), null, 0, 6, null);
        secureDealMoleculeView.setId(View.generateViewId());
        secureDealMoleculeView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.secureDealView = secureDealMoleculeView;
        this.viewVisibleRect = new Rect();
        this.initialState = true;
        containerView.addView(secureDealMoleculeView);
        secureDealMoleculeView.setOnToggleTouchEvent(new AnonymousClass1());
    }

    private final void scrollToBottomBlockIfNeed(SecureDealVO item) {
        if (this.initialState) {
            this.initialState = false;
            return;
        }
        B0 b02 = this.scrollJob;
        if (b02 != null) {
            b02.j(null);
        }
        if (Intrinsics.d(item.getSecureDeal().getToggle().isSelected(), Boolean.TRUE) && (item.getSecureDeal().getBottomBlock() instanceof CellDTO) && o.b(getViewHolderPositionInfo().a(), this.secureDealView.getCellView(), this.viewVisibleRect, true) < 1.0d) {
            this.scrollJob = C10727i.c(K.a(this), null, null, new SecureDealViewHolder$scrollToBottomBlockIfNeed$1(this, item, null), 3);
        }
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        B0 b02 = this.scrollJob;
        if (b02 != null) {
            b02.j(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SecureDealVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.secureDealView.bind(item.getSecureDeal(), this.actionHandler);
        scrollToBottomBlockIfNeed(item);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull SecureDealVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((SecureDealViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
