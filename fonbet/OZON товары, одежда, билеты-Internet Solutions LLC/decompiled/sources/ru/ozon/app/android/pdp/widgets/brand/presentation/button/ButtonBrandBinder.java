package ru.ozon.app.android.pdp.widgets.brand.presentation.button;

import NC.a;
import Sc.InterfaceC4008j;
import WZ.l;
import WZ.t;
import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import jk0.q;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateExtKt;
import ru.ozon.app.android.pdp.ui.configurators.pdp.onboarding.PDPOnBoardingViewModel;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.BaseWidgetPlaceholderBinder;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderAdapter;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.widgets.brand.presentation.ButtonBrandVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000ej\b\u0012\u0004\u0012\u00020\u0002`\u000f¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 R\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010$R*\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000ej\b\u0012\u0004\u0012\u00020\u0002`\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b&\u0010'R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010(R\u001d\u0010.\u001a\u0004\u0018\u00010)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R \u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00190/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/pdp/widgets/brand/presentation/button/ButtonBrandBinder;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/BaseWidgetPlaceholderBinder;", "Lru/ozon/app/android/pdp/widgets/brand/presentation/ButtonBrandVO;", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "view", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/PDPOnBoardingViewModel;", "viewModel", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;", "widgetImagePlaceholderAdapter", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "viewHolderOwner", "<init>", "(Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;LWZ/l;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/PDPOnBoardingViewModel;Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;Lru/ozon/composer/ui/widget/k;)V", "item", "Ll20/d;", "info", "", "payload", "Lkotlin/Function0;", "", "onFinish", "bind", "(Lru/ozon/app/android/pdp/widgets/brand/presentation/ButtonBrandVO;Ll20/d;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)V", "Ljk0/q;", "onVisibleAreaChanged", "(Ljk0/q;)V", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "LWZ/l;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/PDPOnBoardingViewModel;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;", "Lru/ozon/composer/ui/widget/k;", "getViewHolderOwner", "()Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/pdp/widgets/brand/presentation/ButtonBrandVO;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "onBoardingDelegate$delegate", "LSc/j;", "getOnBoardingDelegate", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "onBoardingDelegate", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes13.dex */
public final class ButtonBrandBinder extends BaseWidgetPlaceholderBinder<ButtonBrandVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private ButtonBrandVO item;

    /* renamed from: onBoardingDelegate$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j onBoardingDelegate;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final ButtonV3View view;

    @NotNull
    private final k<ButtonBrandVO> viewHolderOwner;

    @NotNull
    private final PDPOnBoardingViewModel viewModel;

    @NotNull
    private final WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter;

    public ButtonBrandBinder(@NotNull ButtonV3View view, @NotNull l tokenizedAnalytics, @NotNull ComposerReferences refs, @NotNull PDPOnBoardingViewModel viewModel, @NotNull WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter, @NotNull k<ButtonBrandVO> viewHolderOwner) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(widgetImagePlaceholderAdapter, "widgetImagePlaceholderAdapter");
        Intrinsics.checkNotNullParameter(viewHolderOwner, "viewHolderOwner");
        this.view = view;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.refs = refs;
        this.viewModel = viewModel;
        this.widgetImagePlaceholderAdapter = widgetImagePlaceholderAdapter;
        this.viewHolderOwner = viewHolderOwner;
        this.onBoardingDelegate = DelegatesKt.lazyUnsafe(new ButtonBrandBinder$onBoardingDelegate$2(this));
        this.actionHandler = new ActionHandler.Builder(refs, getViewHolderOwner()).buildHandler();
        view.setOnTouchListener(new a(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$1(ButtonBrandBinder buttonBrandBinder, View view, MotionEvent motionEvent) {
        ButtonBrandVO buttonBrandVO;
        t tokenizedEvent;
        ButtonV3DTO button;
        if (motionEvent.getAction() != 1) {
            return false;
        }
        ButtonBrandVO buttonBrandVO2 = buttonBrandBinder.item;
        if (((buttonBrandVO2 == null || (button = buttonBrandVO2.getButton()) == null) ? null : button.getTrackingInfo()) != null || (buttonBrandVO = buttonBrandBinder.item) == null || (tokenizedEvent = buttonBrandVO.getTokenizedEvent()) == null) {
            return false;
        }
        TokenizedAnalyticsExtensionsKt.processClickEvents$default(buttonBrandBinder.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OnBoardingDelegate getOnBoardingDelegate() {
        return (OnBoardingDelegate) this.onBoardingDelegate.getValue();
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.BaseWidgetPlaceholderBinder
    public /* bridge */ /* synthetic */ void bind(ButtonBrandVO buttonBrandVO, d dVar, Object obj, Function0 function0) {
        bind2(buttonBrandVO, dVar, obj, (Function0<Unit>) function0);
    }

    @NotNull
    public k<ButtonBrandVO> getViewHolderOwner() {
        return this.viewHolderOwner;
    }

    public void onVisibleAreaChanged(@NotNull q info) {
        String stateId;
        Intrinsics.checkNotNullParameter(info, "info");
        String json = getJson();
        if (json == null || (stateId = getStateId()) == null) {
            return;
        }
        Pair pair = new Pair(json, stateId);
        WidgetImagePlaceholderAdapter.cacheViewIfNeeded$default(this.widgetImagePlaceholderAdapter, this.view, "ButtonBrandWidget", (String) pair.b(), info, (String) pair.a(), null, 32, null);
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(@NotNull ButtonBrandVO item, d info, Object payload, Function0<Unit> onFinish) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.bind((ButtonBrandBinder) item, info, payload, onFinish);
        this.item = item;
        ButtonV3HolderKt.bind(this.view, item.getButton(), this.actionHandler);
        OnBoardingDelegateExtKt.checkForBindDelegate(this.refs.getContainer(), "brand", this.viewModel, this.view, new ButtonBrandBinder$bind$1$1(this));
        if (onFinish != null) {
            onFinish.invoke();
        }
    }
}
