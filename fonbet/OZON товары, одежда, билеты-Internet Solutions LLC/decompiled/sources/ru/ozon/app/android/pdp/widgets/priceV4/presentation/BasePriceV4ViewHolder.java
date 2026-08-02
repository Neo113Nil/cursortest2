package ru.ozon.app.android.pdp.widgets.priceV4.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingCutConfig;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateExtKt;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateImpl;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0012\u0012\u0004\u0012\u00028\u00000\u0003j\b\u0012\u0004\u0012\u00028\u0000`\u0004B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J?\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0016H\u0004¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceV4/presentation/BasePriceV4ViewHolder;", "Ll20/c;", "T", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "view", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "onBoardingViewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "", "onboardingKey", "", "initOnboardingDelegate", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Ljava/lang/String;)V", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingCutConfig;", "cutConfig", "Lkotlin/Function0;", "onCropAreaClick", "bindOnboarding", "(Ljava/lang/String;Landroid/view/View;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingCutConfig;Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "onboardingDelegate", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class BasePriceV4ViewHolder<T extends c> extends k<T> {

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final BaseOnBoardingViewModel onBoardingViewModel;
    private OnBoardingDelegate onboardingDelegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePriceV4ViewHolder(@NotNull View view, @NotNull BaseOnBoardingViewModel onBoardingViewModel, @NotNull ComposerReferences composerReferences) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onBoardingViewModel, "onBoardingViewModel");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        this.onBoardingViewModel = onBoardingViewModel;
        this.composerReferences = composerReferences;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initOnboardingDelegate(OnBoardingDTO onboarding, String onboardingKey) {
        OnBoardingDelegateImpl onBoardingDelegateImpl = new OnBoardingDelegateImpl(onboardingKey, this.composerReferences, this.itemView, onboarding, this, this.onBoardingViewModel, null, 0.0f, 192, null);
        onBoardingDelegateImpl.setOnShownListener(new BasePriceV4ViewHolder$initOnboardingDelegate$1$1(this));
        this.onboardingDelegate = onBoardingDelegateImpl;
    }

    protected final void bindOnboarding(@NotNull String onboardingKey, @NotNull View view, @NotNull OnBoardingDTO onboarding, @NotNull OnBoardingCutConfig cutConfig, Function0<Unit> onCropAreaClick) {
        Intrinsics.checkNotNullParameter(onboardingKey, "onboardingKey");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onboarding, "onboarding");
        Intrinsics.checkNotNullParameter(cutConfig, "cutConfig");
        OnBoardingDelegateExtKt.checkForBindDelegate(this.composerReferences.getContainer(), onboardingKey, this.onBoardingViewModel, view, new BasePriceV4ViewHolder$bindOnboarding$1(this, onboarding, onboardingKey, cutConfig, onCropAreaClick));
    }
}
