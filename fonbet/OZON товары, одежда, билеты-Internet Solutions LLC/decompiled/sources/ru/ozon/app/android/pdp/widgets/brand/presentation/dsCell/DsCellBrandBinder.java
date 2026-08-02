package ru.ozon.app.android.pdp.widgets.brand.presentation.dsCell;

import WZ.l;
import WZ.t;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateExtKt;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateImpl;
import ru.ozon.app.android.pdp.ui.configurators.pdp.onboarding.PDPOnBoardingViewModel;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.BaseWidgetPlaceholderBinder;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderAdapter;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.pdp.utils.IconViewImageLoader;
import ru.ozon.app.android.pdp.widgets.brand.presentation.DsCellBrandVO;
import ru.ozon.app.android.pdp.widgets.brand.presentation.dsCell.DsCellBrandBinder;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003BK\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00020\bj\b\u0012\u0004\u0012\u00020\u0002`\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ;\u0010\"\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R*\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00020\bj\b\u0012\u0004\u0012\u00020\u0002`\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(R\u0018\u0010\r\u001a\u00060\u000bj\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010)R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010*R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010+R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010,R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00160-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, d2 = {"Lru/ozon/app/android/pdp/widgets/brand/presentation/dsCell/DsCellBrandBinder;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/BaseWidgetPlaceholderBinder;", "Lru/ozon/app/android/pdp/widgets/brand/presentation/DsCellBrandVO;", "Lru/ozon/app/android/pdp/utils/IconViewImageLoader;", "Lru/ozon/uni/android/cell/CellView;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "viewHolderOwner", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/PDPOnBoardingViewModel;", "viewModel", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;", "widgetImagePlaceholderAdapter", "<init>", "(Lru/ozon/uni/android/cell/CellView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/composer/ui/widget/k;LWZ/l;Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/PDPOnBoardingViewModel;Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;)V", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "", "bindOnboarding", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "initDelegate", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/PDPOnBoardingViewModel;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "item", "Ll20/d;", "info", "", "payload", "Lkotlin/Function0;", "onFinish", "bind", "(Lru/ozon/app/android/pdp/widgets/brand/presentation/DsCellBrandVO;Ll20/d;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/uni/android/cell/CellView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "getViewHolderOwner", "()Lru/ozon/composer/ui/widget/k;", "LWZ/l;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/PDPOnBoardingViewModel;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;", "Lru/ozon/app/android/pdp/widgets/brand/presentation/DsCellBrandVO;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "onBoardingDelegate", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes13.dex */
public final class DsCellBrandBinder extends BaseWidgetPlaceholderBinder<DsCellBrandVO> implements IconViewImageLoader {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final CellView containerView;
    private DsCellBrandVO item;
    private OnBoardingDelegate onBoardingDelegate;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final k<DsCellBrandVO> viewHolderOwner;

    @NotNull
    private final PDPOnBoardingViewModel viewModel;

    @NotNull
    private final WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter;

    public DsCellBrandBinder(@NotNull CellView containerView, @NotNull ComposerReferences refs, @NotNull k<DsCellBrandVO> viewHolderOwner, @NotNull l tokenizedAnalytics, @NotNull PDPOnBoardingViewModel viewModel, @NotNull WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(viewHolderOwner, "viewHolderOwner");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(widgetImagePlaceholderAdapter, "widgetImagePlaceholderAdapter");
        this.containerView = containerView;
        this.refs = refs;
        this.viewHolderOwner = viewHolderOwner;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.viewModel = viewModel;
        this.widgetImagePlaceholderAdapter = widgetImagePlaceholderAdapter;
        this.actionHandler = new ActionHandler.Builder(refs, getViewHolderOwner()).buildHandler();
        containerView.setOnTouchListener(new View.OnTouchListener() { // from class: eD.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean _init_$lambda$1;
                _init_$lambda$1 = DsCellBrandBinder._init_$lambda$1(DsCellBrandBinder.this, view, motionEvent);
                return _init_$lambda$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$1(DsCellBrandBinder dsCellBrandBinder, View view, MotionEvent motionEvent) {
        DsCellBrandVO dsCellBrandVO;
        t tokenizedEvent;
        CellDTO dsCell;
        if (motionEvent.getAction() != 1) {
            return false;
        }
        DsCellBrandVO dsCellBrandVO2 = dsCellBrandBinder.item;
        if (((dsCellBrandVO2 == null || (dsCell = dsCellBrandVO2.getDsCell()) == null) ? null : dsCell.getTrackingInfo()) != null || (dsCellBrandVO = dsCellBrandBinder.item) == null || (tokenizedEvent = dsCellBrandVO.getTokenizedEvent()) == null) {
            return false;
        }
        TokenizedAnalyticsExtensionsKt.processClickEvents$default(dsCellBrandBinder.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        return false;
    }

    private final void bindOnboarding(OnBoardingDTO onboarding) {
        PDPOnBoardingViewModel pDPOnBoardingViewModel = (PDPOnBoardingViewModel) new z0(this.refs.getViewModelOwnerProvider().b(), new z0.c() { // from class: ru.ozon.app.android.pdp.widgets.brand.presentation.dsCell.DsCellBrandBinder$bindOnboarding$$inlined$sharedViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                PDPOnBoardingViewModel pDPOnBoardingViewModel2;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                pDPOnBoardingViewModel2 = DsCellBrandBinder.this.viewModel;
                Intrinsics.g(pDPOnBoardingViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return pDPOnBoardingViewModel2;
            }
        }).a(PDPOnBoardingViewModel.class);
        OnBoardingDelegateExtKt.checkForBindDelegate(this.refs.getContainer(), "brand", pDPOnBoardingViewModel, this.containerView, new DsCellBrandBinder$bindOnboarding$1(this, pDPOnBoardingViewModel, onboarding));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initDelegate(PDPOnBoardingViewModel viewModel, OnBoardingDTO onboarding) {
        this.onBoardingDelegate = new OnBoardingDelegateImpl("brand", this.refs, this.containerView, onboarding, getViewHolderOwner(), viewModel, this.tokenizedAnalytics, 0.0f, UserVerificationMethods.USER_VERIFY_PATTERN, null);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.BaseWidgetPlaceholderBinder
    public /* bridge */ /* synthetic */ void bind(DsCellBrandVO dsCellBrandVO, d dVar, Object obj, Function0 function0) {
        bind2(dsCellBrandVO, dVar, obj, (Function0<Unit>) function0);
    }

    @NotNull
    public k<DsCellBrandVO> getViewHolderOwner() {
        return this.viewHolderOwner;
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(@NotNull DsCellBrandVO item, d info, Object payload, Function0<Unit> onFinish) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.bind((DsCellBrandBinder) item, info, payload, onFinish);
        this.item = item;
        Context context = this.containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.containerView.setBackgroundColor(ContextExtKt.parseColor(context, item.getBackground()));
        CellHolderKt.bind(this.containerView, item.getDsCell(), this.actionHandler);
        OnBoardingDTO onBoarding = item.getOnBoarding();
        if (onBoarding != null) {
            bindOnboarding(onBoarding);
        }
        if (onFinish != null) {
            onFinish.invoke();
        }
    }
}
