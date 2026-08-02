package ru.ozon.app.android.travel.feature.general.common.widgets.travelTextWithBadge.presentation;

import Sc.o;
import WZ.l;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.Y;
import androidx.lifecycle.K;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateImpl;
import ru.ozon.app.android.travel.feature.general.common.databinding.WidgetTravelTextWithBadgeBinding;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelTextWithBadge.presentation.TravelTextWithBadgeVO;
import ru.ozon.app.android.travel.utils.extensions.OnboardingExtensionsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;
import xe.B0;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0013J#\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00022\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0018\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00110'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithBadge/presentation/TravelTextWithBadgeWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithBadge/presentation/TravelTextWithBadgeVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "onboardingViewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;LWZ/l;)V", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "vo", "", "bindOnBoarding", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "onBoarding", "initDelegate", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithBadge/presentation/TravelTextWithBadgeVO;Ll20/d;)V", "onDetach", "()V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "LWZ/l;", "Lru/ozon/app/android/travel/feature/general/common/databinding/WidgetTravelTextWithBadgeBinding;", "binding", "Lru/ozon/app/android/travel/feature/general/common/databinding/WidgetTravelTextWithBadgeBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "onBoardingDelegate", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "Lxe/B0;", "onboardingJob", "Lxe/B0;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelTextWithBadgeWidgetViewHolder extends k<TravelTextWithBadgeVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetTravelTextWithBadgeBinding binding;

    @NotNull
    private final View containerView;
    private OnBoardingDelegate onBoardingDelegate;
    private B0 onboardingJob;

    @NotNull
    private final BaseOnBoardingViewModel onboardingViewModel;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final l tokenizedAnalytics;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TravelTextWithBadgeVO.Gravity.values().length];
            try {
                iArr[TravelTextWithBadgeVO.Gravity.TEXT_END.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TravelTextWithBadgeVO.Gravity.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelTextWithBadgeWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references, @NotNull BaseOnBoardingViewModel onboardingViewModel, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(onboardingViewModel, "onboardingViewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.containerView = containerView;
        this.references = references;
        this.onboardingViewModel = onboardingViewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        WidgetTravelTextWithBadgeBinding bind = WidgetTravelTextWithBadgeBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(references, this).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindOnBoarding(final OnBoardingDTO vo) {
        final BadgeView travelTextWithBadgeBv = this.binding.travelTextWithBadgeBv;
        Intrinsics.checkNotNullExpressionValue(travelTextWithBadgeBv, "travelTextWithBadgeBv");
        int i11 = Y.f42258g;
        if (!travelTextWithBadgeBv.isLaidOut() || travelTextWithBadgeBv.isLayoutRequested()) {
            travelTextWithBadgeBv.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.travelTextWithBadge.presentation.TravelTextWithBadgeWidgetViewHolder$bindOnBoarding$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    ComposerExtKt.withPageTag(TravelTextWithBadgeWidgetViewHolder.this.references.getContainer(), new TravelTextWithBadgeWidgetViewHolder$bindOnBoarding$1$1(TravelTextWithBadgeWidgetViewHolder.this, vo, travelTextWithBadgeBv));
                }
            });
        } else {
            ComposerExtKt.withPageTag(this.references.getContainer(), new TravelTextWithBadgeWidgetViewHolder$bindOnBoarding$1$1(this, vo, travelTextWithBadgeBv));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initDelegate(OnBoardingDTO onBoarding) {
        String onboardingKey = onBoarding.getOnboardingKey();
        if (onboardingKey == null) {
            onboardingKey = "travel_text_with_badge_onboarding_key";
        }
        OnBoardingDelegateImpl onBoardingDelegateImpl = new OnBoardingDelegateImpl(onboardingKey, this.references, this.binding.travelTextWithBadgeBv, onBoarding, this, this.onboardingViewModel, this.tokenizedAnalytics, 0.0f, UserVerificationMethods.USER_VERIFY_PATTERN, null);
        onBoardingDelegateImpl.setOnShownListener(new TravelTextWithBadgeWidgetViewHolder$initDelegate$1$1(this));
        this.onBoardingDelegate = onBoardingDelegateImpl;
    }

    @NotNull
    public final View getContainerView() {
        return this.containerView;
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        ComposerExtKt.withPageTag(this.references.getContainer(), new TravelTextWithBadgeWidgetViewHolder$onDetach$1(this));
        B0 b02 = this.onboardingJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.onboardingJob = null;
        this.onBoardingDelegate = null;
        super.onDetach();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelTextWithBadgeVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextAtomView travelTextWithBadgeTAV = this.binding.travelTextWithBadgeTAV;
        Intrinsics.checkNotNullExpressionValue(travelTextWithBadgeTAV, "travelTextWithBadgeTAV");
        TextAtomHolderKt.bind(travelTextWithBadgeTAV, item.getText(), this.actionHandler);
        this.binding.travelTextWithBadgeTAV.setTextAlignment(item.getIsCentered() ? 4 : 2);
        BadgeView travelTextWithBadgeBv = this.binding.travelTextWithBadgeBv;
        Intrinsics.checkNotNullExpressionValue(travelTextWithBadgeBv, "travelTextWithBadgeBv");
        BadgeHolderKt.bindOrGone(travelTextWithBadgeBv, item.getBadge(), this.actionHandler);
        int parseColor = StyleParser.INSTANCE.parseColor(getContext(), item.getBackgroundColor(), R$color.transparent);
        ConstraintLayout constraintLayout = this.binding.travelTextWithBadgeRootCl;
        constraintLayout.setPadding(item.getOffsetHorizontal(), item.getOffsetTop(), item.getOffsetHorizontal(), item.getOffsetBottom());
        constraintLayout.setBackgroundColor(parseColor);
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.p(constraintLayout);
        dVar.c0(item.getIsCentered() ? 0.5f : 0.0f, this.binding.travelTextWithBadgeTAV.getId());
        int i11 = WhenMappings.$EnumSwitchMapping$0[item.getBadgeGravity().ordinal()];
        if (i11 == 1) {
            ConstraintSetExtKt.startToEnd$default(dVar, this.binding.travelTextWithBadgeBv.getId(), this.binding.travelTextWithBadgeTAV.getId(), 0, 4, null);
        } else {
            if (i11 != 2) {
                throw new o();
            }
            ConstraintSetExtKt.clearStart(dVar, this.binding.travelTextWithBadgeBv.getId());
        }
        dVar.f(constraintLayout);
        B0 b02 = this.onboardingJob;
        if (b02 != null) {
            b02.j(null);
        }
        OnBoardingDTO onboarding = item.getOnboarding();
        this.onboardingJob = onboarding != null ? OnboardingExtensionsKt.showOnboardingWithDelay(onboarding, U7.d.c(this.references), K.a(this), new TravelTextWithBadgeWidgetViewHolder$bind$2(this)) : null;
    }
}
