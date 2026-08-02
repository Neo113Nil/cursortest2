package ru.ozon.app.android.storefront.widgets.profile.presentation;

import W10.c;
import WZ.l;
import WZ.t;
import android.view.ViewTreeObserver;
import androidx.fragment.app.ComponentCallbacksC5392m;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateImpl;
import ru.ozon.app.android.storefront.domain.onboarding.CommonOnboardingRepository;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 22\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u00012B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00022\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010$\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010)R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R \u00100\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00170.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, d2 = {"Lru/ozon/app/android/storefront/widgets/profile/presentation/ProfileCellViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/storefront/widgets/profile/presentation/ProfileCellVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/uni/android/cell/CellView;", "containerView", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "onBoardingViewModel", "Lru/ozon/app/android/storefront/domain/onboarding/CommonOnboardingRepository;", "onboardingRepository", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/uni/android/cell/CellView;Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;Lru/ozon/app/android/storefront/domain/onboarding/CommonOnboardingRepository;LWZ/l;)V", "", "onboardingKey", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "showOnboardingIfExist", "(Ljava/lang/String;)Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onBoarding", "", "initDelegate", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Ljava/lang/String;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/storefront/widgets/profile/presentation/ProfileCellVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/storefront/widgets/profile/presentation/ProfileCellVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/uni/android/cell/CellView;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "Lru/ozon/app/android/storefront/domain/onboarding/CommonOnboardingRepository;", "LWZ/l;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "onboardingDelegate", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "handler", "Lkotlin/jvm/functions/Function1;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProfileCellViewHolder extends k<ProfileCellVO> {

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final CellView containerView;

    @NotNull
    private final Function1<AtomAction, Unit> handler;

    @NotNull
    private final BaseOnBoardingViewModel onBoardingViewModel;
    private OnBoardingDelegate onboardingDelegate;

    @NotNull
    private final CommonOnboardingRepository onboardingRepository;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final float ONBOARDING_CORNER_RADIUS = ResourceExtKt.toPxF(16);
    private static final int ONBOARDING_HORIZONTAL_MARGIN = UiExtKt.toPx(8);
    private static final int ONBOARDING_VERTICAL_MARGIN = -UiExtKt.toPx(6);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/storefront/widgets/profile/presentation/ProfileCellViewHolder$Companion;", "", "<init>", "()V", "ONBOARDING_CORNER_RADIUS", "", "getONBOARDING_CORNER_RADIUS", "()F", "ONBOARDING_HORIZONTAL_MARGIN", "", "getONBOARDING_HORIZONTAL_MARGIN", "()I", "ONBOARDING_VERTICAL_MARGIN", "getONBOARDING_VERTICAL_MARGIN", "AVATAR_UPLOADED", "", "AVATAR_IS_NOT_LOADED", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getONBOARDING_CORNER_RADIUS() {
            return ProfileCellViewHolder.ONBOARDING_CORNER_RADIUS;
        }

        public final int getONBOARDING_HORIZONTAL_MARGIN() {
            return ProfileCellViewHolder.ONBOARDING_HORIZONTAL_MARGIN;
        }

        public final int getONBOARDING_VERTICAL_MARGIN() {
            return ProfileCellViewHolder.ONBOARDING_VERTICAL_MARGIN;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileCellViewHolder(@NotNull ComposerReferences composerReferences, @NotNull CellView containerView, @NotNull BaseOnBoardingViewModel onBoardingViewModel, @NotNull CommonOnboardingRepository onboardingRepository, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(onBoardingViewModel, "onBoardingViewModel");
        Intrinsics.checkNotNullParameter(onboardingRepository, "onboardingRepository");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.composerReferences = composerReferences;
        this.containerView = containerView;
        this.onBoardingViewModel = onBoardingViewModel;
        this.onboardingRepository = onboardingRepository;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.handler = new ActionHandler.Builder(composerReferences, this).buildHandler();
    }

    private final void initDelegate(OnBoardingDTO onBoarding, String onboardingKey) {
        if (this.onboardingDelegate != null || onBoarding == null) {
            return;
        }
        OnBoardingDelegateImpl onBoardingDelegateImpl = new OnBoardingDelegateImpl(onboardingKey, this.composerReferences, this.containerView, onBoarding, this, this.onBoardingViewModel, this.tokenizedAnalytics, 0.0f, UserVerificationMethods.USER_VERIFY_PATTERN, null);
        onBoardingDelegateImpl.setOnShownListener(new ProfileCellViewHolder$initDelegate$1$1(this, onboardingKey));
        this.onboardingDelegate = onBoardingDelegateImpl;
    }

    private final ViewTreeObserver.OnGlobalLayoutListener showOnboardingIfExist(final String onboardingKey) {
        final CellView cellView = this.containerView;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.app.android.storefront.widgets.profile.presentation.ProfileCellViewHolder$showOnboardingIfExist$$inlined$afterMeasured$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                ComposerReferences composerReferences;
                OnBoardingDelegate onBoardingDelegate;
                BaseOnBoardingViewModel baseOnBoardingViewModel;
                if (cellView.getMeasuredWidth() <= 0 || cellView.getMeasuredHeight() <= 0) {
                    return;
                }
                cellView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                composerReferences = this.composerReferences;
                ComponentCallbacksC5392m c11 = composerReferences.getContainer().c();
                String tag = c11 != null ? c11.getTag() : null;
                onBoardingDelegate = this.onboardingDelegate;
                if (onBoardingDelegate == null || tag == null) {
                    return;
                }
                baseOnBoardingViewModel = this.onBoardingViewModel;
                baseOnBoardingViewModel.showIfNeed(tag, onboardingKey, new ProfileCellViewHolder$showOnboardingIfExist$1$1(this));
            }
        };
        cellView.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        return onGlobalLayoutListener;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ProfileCellVO item, @NotNull d info) {
        IconDTO icon;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        CellDTO.LeftBlock leftBlock = item.getDsCell().getLeftBlock();
        this.containerView.getLeftBlock().getIconView().setLocatorTag((leftBlock == null || (icon = leftBlock.getIcon()) == null || icon.getBackgroundImage() == null) ? "backgroundImageView" : "icon.backgroundImageView");
        CellHolderKt.bind(this.containerView, item.getDsCell(), this.handler);
        initDelegate(item.getOnBoardingDTO(), item.getOnboardingKey());
        showOnboardingIfExist(item.getOnboardingKey());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull ProfileCellVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
