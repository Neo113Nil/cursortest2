package ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.presentation.info;

import WZ.l;
import android.content.Context;
import androidx.fragment.app.r;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateExtKt;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateImpl;
import ru.ozon.app.android.pdp.ui.configurators.pdp.onboarding.PDPOnBoardingViewModel;
import ru.ozon.app.android.pdp.ui.configurators.pdp.price.InfoCardView;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.presentation.drawables.PriceV2ShapeDrawableStorage;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\"R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010#R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010$R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00130%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/info/PriceV2InfoWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/info/PriceV2InfoVO;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/InfoCardView;", "infoCardView", "Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/PDPOnBoardingViewModel;", "onBoardingViewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/drawables/PriceV2ShapeDrawableStorage;", "drawableStorage", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/price/InfoCardView;Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/PDPOnBoardingViewModel;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/drawables/PriceV2ShapeDrawableStorage;LWZ/l;)V", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "", "bottomPadding", "", "bindInfoCardOnboarding", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;I)V", "", "key", "viewModel", "initDelegate", "(Ljava/lang/String;Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/PDPOnBoardingViewModel;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/info/PriceV2InfoVO;Ll20/d;)V", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/InfoCardView;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/PDPOnBoardingViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/drawables/PriceV2ShapeDrawableStorage;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "onBoardingDelegateInfoCards", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "", "isDarkTheme", "()Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PriceV2InfoWidgetViewHolder extends k<PriceV2InfoVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final PriceV2ShapeDrawableStorage drawableStorage;

    @NotNull
    private final InfoCardView infoCardView;
    private OnBoardingDelegate onBoardingDelegateInfoCards;

    @NotNull
    private final PDPOnBoardingViewModel onBoardingViewModel;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceV2InfoWidgetViewHolder(@NotNull InfoCardView infoCardView, @NotNull PDPOnBoardingViewModel onBoardingViewModel, @NotNull ComposerReferences refs, @NotNull PriceV2ShapeDrawableStorage drawableStorage, @NotNull l tokenizedAnalytics) {
        super(infoCardView);
        Intrinsics.checkNotNullParameter(infoCardView, "infoCardView");
        Intrinsics.checkNotNullParameter(onBoardingViewModel, "onBoardingViewModel");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(drawableStorage, "drawableStorage");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.infoCardView = infoCardView;
        this.onBoardingViewModel = onBoardingViewModel;
        this.refs = refs;
        this.drawableStorage = drawableStorage;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
    }

    private final void bindInfoCardOnboarding(OnBoardingDTO onboarding, int bottomPadding) {
        PDPOnBoardingViewModel pDPOnBoardingViewModel = (PDPOnBoardingViewModel) new z0(this.refs.getViewModelOwnerProvider().b(), new z0.c() { // from class: ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.presentation.info.PriceV2InfoWidgetViewHolder$bindInfoCardOnboarding$$inlined$sharedViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                PDPOnBoardingViewModel pDPOnBoardingViewModel2;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                pDPOnBoardingViewModel2 = PriceV2InfoWidgetViewHolder.this.onBoardingViewModel;
                Intrinsics.g(pDPOnBoardingViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return pDPOnBoardingViewModel2;
            }
        }).a(PDPOnBoardingViewModel.class);
        String onboardingKey = onboarding.getOnboardingKey();
        if (onboardingKey == null) {
            onboardingKey = "PriceV2InfoWidgetViewHolder";
        }
        String str = onboardingKey;
        OnBoardingDelegateExtKt.checkForBindDelegate(this.refs.getContainer(), str, pDPOnBoardingViewModel, this.infoCardView, new PriceV2InfoWidgetViewHolder$bindInfoCardOnboarding$1(this, str, pDPOnBoardingViewModel, onboarding, bottomPadding));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initDelegate(String key, PDPOnBoardingViewModel viewModel, OnBoardingDTO onboarding) {
        this.onBoardingDelegateInfoCards = new OnBoardingDelegateImpl(key, this.refs, this.infoCardView, onboarding, this, viewModel, this.tokenizedAnalytics, 0.0f, UserVerificationMethods.USER_VERIFY_PATTERN, null);
    }

    private final boolean isDarkTheme() {
        r a11 = this.refs.getContainer().a();
        if (a11 != null) {
            return ThemeExtKt.isDarkThemeActive(a11);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull PriceV2InfoVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        InfoCardView infoCardView = this.infoCardView;
        infoCardView.bind(item.getInfo(), this.actionHandler);
        PriceV2ShapeDrawableStorage priceV2ShapeDrawableStorage = this.drawableStorage;
        Context context = infoCardView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        infoCardView.setBackground(priceV2ShapeDrawableStorage.background(context, item.getBackgroundCornersConfig(), isDarkTheme()));
        int dp_12 = item.getIsLastItem() ? Dimens.INSTANCE.getDP_12() : 0;
        infoCardView.setPadding(infoCardView.getPaddingLeft(), infoCardView.getPaddingTop(), infoCardView.getPaddingRight(), dp_12);
        OnBoardingDTO onboarding = item.getOnboarding();
        if (onboarding != null) {
            bindInfoCardOnboarding(onboarding, dp_12);
        }
    }
}
