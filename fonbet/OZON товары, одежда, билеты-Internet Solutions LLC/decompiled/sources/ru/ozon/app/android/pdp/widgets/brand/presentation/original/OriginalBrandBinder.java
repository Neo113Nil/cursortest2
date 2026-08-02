package ru.ozon.app.android.pdp.widgets.brand.presentation.original;

import WZ.l;
import WZ.t;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import cA.ViewOnTouchListenerC5778a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import jk0.q;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
import ru.ozon.app.android.pdp.widgets.brand.presentation.OriginalBrandVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.cell.disclosure.disclosureIconTitleSubtitleCell.DisclosureIconTitleSubtitleCellView;
import ru.ozon.uni.android.cell.label.SmartLabel;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.cell.DisclosureIconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.v3.holders.cell.disclosureCell.DisclosureIconTitleSubtitleCellHolderKt;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u0000 =2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001=BK\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00020\bj\b\u0012\u0004\u0012\u00020\u0002`\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0017\u001a\u00020\u0016*\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ;\u0010%\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00162\u0006\u0010 \u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R*\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00020\bj\b\u0012\u0004\u0012\u00020\u0002`\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010.R\u0018\u0010\r\u001a\u00060\u000bj\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010/R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00100R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00101R \u00104\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u0016028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010:\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010<¨\u0006>"}, d2 = {"Lru/ozon/app/android/pdp/widgets/brand/presentation/original/OriginalBrandBinder;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/BaseWidgetPlaceholderBinder;", "Lru/ozon/app/android/pdp/widgets/brand/presentation/OriginalBrandVO;", "Lru/ozon/app/android/pdp/utils/IconViewImageLoader;", "Lru/ozon/uni/android/cell/disclosure/disclosureIconTitleSubtitleCell/DisclosureIconTitleSubtitleCellView;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "viewHolderOwner", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/PDPOnBoardingViewModel;", "viewModel", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;", "widgetImagePlaceholderAdapter", "<init>", "(Lru/ozon/uni/android/cell/disclosure/disclosureIconTitleSubtitleCell/DisclosureIconTitleSubtitleCellView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/composer/ui/widget/k;LWZ/l;Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/PDPOnBoardingViewModel;Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;)V", "Lru/ozon/uni/atoms/data/cell/DisclosureIconTitleSubtitleCellDTO;", "item", "", "appendLocators", "(Lru/ozon/uni/android/cell/disclosure/disclosureIconTitleSubtitleCell/DisclosureIconTitleSubtitleCellView;Lru/ozon/uni/atoms/data/cell/DisclosureIconTitleSubtitleCellDTO;)V", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "bindOnboarding", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "initDelegate", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/PDPOnBoardingViewModel;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "Ll20/d;", "info", "", "payload", "Lkotlin/Function0;", "onFinish", "bind", "(Lru/ozon/app/android/pdp/widgets/brand/presentation/OriginalBrandVO;Ll20/d;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)V", "Ljk0/q;", "onVisibleAreaChanged", "(Ljk0/q;)V", "Lru/ozon/uni/android/cell/disclosure/disclosureIconTitleSubtitleCell/DisclosureIconTitleSubtitleCellView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "getViewHolderOwner", "()Lru/ozon/composer/ui/widget/k;", "LWZ/l;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/PDPOnBoardingViewModel;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "onBoardingDelegate", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "", "isFirstBind", "Z", "Lru/ozon/app/android/pdp/widgets/brand/presentation/OriginalBrandVO;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes13.dex */
public final class OriginalBrandBinder extends BaseWidgetPlaceholderBinder<OriginalBrandVO> implements IconViewImageLoader {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final DisclosureIconTitleSubtitleCellView containerView;
    private boolean isFirstBind;
    private OriginalBrandVO item;
    private OnBoardingDelegate onBoardingDelegate;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final k<OriginalBrandVO> viewHolderOwner;

    @NotNull
    private final PDPOnBoardingViewModel viewModel;

    @NotNull
    private final WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/pdp/widgets/brand/presentation/original/OriginalBrandBinder$Companion;", "", "<init>", "()V", "IMAGE_LOCATOR", "", "DISCLOSURE_LOCATOR", "TITLE_LOCATOR", "SUBTITLE_LOCATOR", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public OriginalBrandBinder(@NotNull DisclosureIconTitleSubtitleCellView containerView, @NotNull ComposerReferences refs, @NotNull k<OriginalBrandVO> viewHolderOwner, @NotNull l tokenizedAnalytics, @NotNull PDPOnBoardingViewModel viewModel, @NotNull WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter) {
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
        this.isFirstBind = true;
        containerView.setOnTouchListener(new ViewOnTouchListenerC5778a(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$1(OriginalBrandBinder originalBrandBinder, View view, MotionEvent motionEvent) {
        OriginalBrandVO originalBrandVO;
        t tokenizedEvent;
        DisclosureIconTitleSubtitleCellDTO disclosureCell;
        if (motionEvent.getAction() != 1) {
            return false;
        }
        OriginalBrandVO originalBrandVO2 = originalBrandBinder.item;
        if (((originalBrandVO2 == null || (disclosureCell = originalBrandVO2.getDisclosureCell()) == null) ? null : disclosureCell.getTrackingInfo()) != null || (originalBrandVO = originalBrandBinder.item) == null || (tokenizedEvent = originalBrandVO.getTokenizedEvent()) == null) {
            return false;
        }
        TokenizedAnalyticsExtensionsKt.processClickEvents$default(originalBrandBinder.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        return false;
    }

    private final void appendLocators(DisclosureIconTitleSubtitleCellView disclosureIconTitleSubtitleCellView, DisclosureIconTitleSubtitleCellDTO disclosureIconTitleSubtitleCellDTO) {
        String str;
        String str2;
        String str3;
        TestInfo testInfo;
        TestInfo testInfo2;
        IconDTO icon = disclosureIconTitleSubtitleCellDTO.getIcon();
        if (icon == null || (testInfo2 = icon.getTestInfo()) == null || (str = testInfo2.getAutomatizationId()) == null) {
            str = "brandImage";
        }
        TestInfo testInfo3 = disclosureIconTitleSubtitleCellDTO.getTitle().getTestInfo();
        if (testInfo3 == null || (str2 = testInfo3.getAutomatizationId()) == null) {
            str2 = "brandTitle";
        }
        CommonAtomLabelDTO subtitle = disclosureIconTitleSubtitleCellDTO.getSubtitle();
        if (subtitle == null || (testInfo = subtitle.getTestInfo()) == null || (str3 = testInfo.getAutomatizationId()) == null) {
            str3 = "brandSubtitle";
        }
        int childCount = disclosureIconTitleSubtitleCellView.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = disclosureIconTitleSubtitleCellView.getChildAt(i11);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            if (childAt instanceof IconView) {
                ((IconView) childAt).setContentDescription(str);
            } else if (childAt instanceof AppCompatImageView) {
                ((AppCompatImageView) childAt).setContentDescription("brandDisclosureIcon");
            } else if (childAt instanceof SmartLabel) {
                SmartLabel smartLabel = (SmartLabel) childAt;
                String obj = smartLabel.getText().toString();
                CommonAtomLabelDTO subtitle2 = disclosureIconTitleSubtitleCellDTO.getSubtitle();
                smartLabel.setContentDescription(Intrinsics.d(obj, String.valueOf(subtitle2 != null ? subtitle2.getText() : null)) ? str3 : str2);
            }
        }
    }

    private final void bindOnboarding(OnBoardingDTO onboarding) {
        PDPOnBoardingViewModel pDPOnBoardingViewModel = (PDPOnBoardingViewModel) new z0(this.refs.getViewModelOwnerProvider().b(), new z0.c() { // from class: ru.ozon.app.android.pdp.widgets.brand.presentation.original.OriginalBrandBinder$bindOnboarding$$inlined$sharedViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                PDPOnBoardingViewModel pDPOnBoardingViewModel2;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                pDPOnBoardingViewModel2 = OriginalBrandBinder.this.viewModel;
                Intrinsics.g(pDPOnBoardingViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return pDPOnBoardingViewModel2;
            }
        }).a(PDPOnBoardingViewModel.class);
        OnBoardingDelegateExtKt.checkForBindDelegate(this.refs.getContainer(), "brand", pDPOnBoardingViewModel, this.containerView, new OriginalBrandBinder$bindOnboarding$1(this, pDPOnBoardingViewModel, onboarding));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initDelegate(PDPOnBoardingViewModel viewModel, OnBoardingDTO onboarding) {
        this.onBoardingDelegate = new OnBoardingDelegateImpl("brand", this.refs, this.containerView, onboarding, getViewHolderOwner(), viewModel, this.tokenizedAnalytics, 0.0f, UserVerificationMethods.USER_VERIFY_PATTERN, null);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.BaseWidgetPlaceholderBinder
    public /* bridge */ /* synthetic */ void bind(OriginalBrandVO originalBrandVO, d dVar, Object obj, Function0 function0) {
        bind2(originalBrandVO, dVar, obj, (Function0<Unit>) function0);
    }

    @NotNull
    public k<OriginalBrandVO> getViewHolderOwner() {
        return this.viewHolderOwner;
    }

    public void loadIcon(@NotNull IconView iconView, IconDTO iconDTO, String str, Function0<Unit> function0) {
        IconViewImageLoader.DefaultImpls.loadIcon(this, iconView, iconDTO, str, function0);
    }

    public void onVisibleAreaChanged(@NotNull q info) {
        String stateId;
        Intrinsics.checkNotNullParameter(info, "info");
        String json = getJson();
        if (json == null || (stateId = getStateId()) == null) {
            return;
        }
        Pair pair = new Pair(json, stateId);
        this.widgetImagePlaceholderAdapter.cacheViewIfNeeded(this.containerView, "OriginalBrandWidget", (String) pair.b(), info, (String) pair.a(), new OriginalBrandBinder$onVisibleAreaChanged$1(this));
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(@NotNull OriginalBrandVO item, d info, Object payload, Function0<Unit> onFinish) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.bind((OriginalBrandBinder) item, info, payload, onFinish);
        Context context = this.containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.containerView.setBackgroundColor(ContextExtKt.parseColor(context, item.getBackground()));
        DisclosureIconTitleSubtitleCellHolderKt.bind(this.containerView, item.getDisclosureCell(), this.actionHandler);
        if (this.isFirstBind) {
            appendLocators(this.containerView, item.getDisclosureCell());
        }
        OnBoardingDTO onBoarding = item.getOnBoarding();
        if (onBoarding != null) {
            bindOnboarding(onBoarding);
        }
        this.isFirstBind = false;
        loadIcon(this.containerView.getMainView().getAddonView(), item.getDisclosureCell().getIcon(), item.getBackgroundIconImage(), onFinish);
    }
}
