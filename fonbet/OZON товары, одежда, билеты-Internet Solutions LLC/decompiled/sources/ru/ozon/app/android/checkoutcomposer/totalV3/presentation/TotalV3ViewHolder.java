package ru.ozon.app.android.checkoutcomposer.totalV3.presentation;

import Vg.d;
import W10.c;
import WZ.l;
import WZ.t;
import android.graphics.Rect;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import e00.C6247a;
import i10.l;
import jk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.cart.common.presentation.TotalVisibilityViewModel;
import ru.ozon.app.android.checkoutcomposer.utils.ExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewState;
import ru.ozon.app.android.payment.ui.createorder.HandledState;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00019B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 J)\u0010%\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010*R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010+R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010,R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010-R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R \u00104\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u0014028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006:"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/TotalV3ViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/TotalV3VO;", "Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/TotalV3View;", "view", "Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;", "totalVisibilityViewModel", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "createAndPayViewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LWZ/l;", "tokenizedAnalytics", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/TotalV3View;Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;LVg/d;)V", "Landroidx/lifecycle/v$a;", "event", "", "handleLifecycleEvent", "(Landroidx/lifecycle/v$a;)V", "Lru/ozon/app/android/payment/ui/createorder/HandledState;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewState;", "handledState", "observePaymentLoader", "(Lru/ozon/app/android/payment/ui/createorder/HandledState;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/TotalV3VO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/TotalV3VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ljk0/q;", "onVisibleAreaChanged", "(Ljk0/q;)V", "Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/TotalV3View;", "Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Landroid/graphics/Rect;", "viewVisibleRect", "Landroid/graphics/Rect;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroidx/lifecycle/G;", "lifecycleObserver", "Landroidx/lifecycle/G;", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TotalV3ViewHolder extends k<TotalV3VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final CreateAndPayViewModel createAndPayViewModel;

    @NotNull
    private final G lifecycleObserver;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final TotalVisibilityViewModel totalVisibilityViewModel;

    @NotNull
    private final TotalV3View view;

    @NotNull
    private final Rect viewVisibleRect;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/TotalV3ViewHolder$Companion;", "", "<init>", "()V", "TOTAL_VISIBILITY_PERCENT", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AbstractC5434v.a.values().length];
            try {
                iArr[AbstractC5434v.a.ON_DESTROY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC5434v.a.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC5434v.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotalV3ViewHolder(@NotNull TotalV3View view, @NotNull TotalVisibilityViewModel totalVisibilityViewModel, @NotNull CreateAndPayViewModel createAndPayViewModel, @NotNull ComposerReferences composerReferences, @NotNull l tokenizedAnalytics, @NotNull d customActionHandlersStoreFactory) {
        super(view);
        AbstractC5434v lifecycle;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(totalVisibilityViewModel, "totalVisibilityViewModel");
        Intrinsics.checkNotNullParameter(createAndPayViewModel, "createAndPayViewModel");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.view = view;
        this.totalVisibilityViewModel = totalVisibilityViewModel;
        this.createAndPayViewModel = createAndPayViewModel;
        this.composerReferences = composerReferences;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.viewVisibleRect = new Rect();
        this.actionHandler = new ActionHandler.Builder(composerReferences, this).configureBottomSheetWrapContent(true).customActionHandlers(new TotalV3ViewHolder$actionHandler$1(customActionHandlersStoreFactory)).onComposerAction(new TotalV3ViewHolder$actionHandler$2(this)).buildHandler();
        C6247a c6247a = new C6247a(this, 1);
        this.lifecycleObserver = c6247a;
        ComponentCallbacksC5392m c11 = composerReferences.getContainer().c();
        if (c11 == null || (lifecycle = c11.getLifecycle()) == null) {
            return;
        }
        lifecycle.a(c6247a);
    }

    private final void handleLifecycleEvent(AbstractC5434v.a event) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i11 == 1) {
            getLifecycle().e(this.lifecycleObserver);
        } else if (i11 == 2) {
            this.composerReferences.getController().e(new l.a.C1079a(0L, null, 2));
        } else {
            if (i11 != 3) {
                return;
            }
            this.createAndPayViewModel.getViewState().observe(this.composerReferences.getContainer().g(), new TotalV3ViewHolder$sam$androidx_lifecycle_Observer$0(new TotalV3ViewHolder$handleLifecycleEvent$1(this)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lifecycleObserver$lambda$0(TotalV3ViewHolder totalV3ViewHolder, J j11, AbstractC5434v.a event) {
        Intrinsics.checkNotNullParameter(j11, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        totalV3ViewHolder.handleLifecycleEvent(event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void observePaymentLoader(HandledState<CreateAndPayViewState> handledState) {
        handledState.state(new TotalV3ViewHolder$observePaymentLoader$1(this));
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull q info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onVisibleAreaChanged(info);
        this.totalVisibilityViewModel.notifyVisibility(ExtensionsKt.getViewVisiblePercentIgnoreBottomContainer(info.a(), this.view.getButtonView(), this.viewVisibleRect) >= 0.5f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TotalV3VO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.view.bind(item, this.actionHandler);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull TotalV3VO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((TotalV3ViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
