package ru.ozon.app.android.pdp.widgets.installmentPurchase.presentation.periods;

import DG.a;
import W10.c;
import WZ.l;
import android.view.View;
import jk0.o;
import jk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.widgets.installmentPurchase.core.purchase.InstallmentPurchaseViewMapper$OnboardingEvent$Show;
import ru.ozon.app.android.pdp.widgets.installmentPurchase.presentation.InstallmentVO;
import ru.ozon.app.android.pdp.widgets.installmentPurchase.presentation.periods.recycler.InstallmentPeriodsAdapter;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000f0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/periods/InstallmentPeriodsViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/InstallmentVO$Periods;", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/periods/InstallmentPeriodsView;", "installmentPeriodsView", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel$Default;", "onBoardingViewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/periods/InstallmentPeriodsView;Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel$Default;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "Ljk0/q;", "info", "", "onVisibleAreaChanged", "(Ljk0/q;)V", "item", "Ll20/d;", "bind", "(Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/InstallmentVO$Periods;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/InstallmentVO$Periods;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/periods/InstallmentPeriodsView;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel$Default;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "", "canShowOnboarding", "Z", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InstallmentPeriodsViewHolder extends k<InstallmentVO.Periods> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private boolean canShowOnboarding;

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final InstallmentPeriodsView installmentPeriodsView;

    @NotNull
    private final BaseOnBoardingViewModel.Default onBoardingViewModel;

    @NotNull
    private final l tokenizedAnalytics;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "pageTag", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.installmentPurchase.presentation.periods.InstallmentPeriodsViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<String, Unit> {

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.pdp.widgets.installmentPurchase.presentation.periods.InstallmentPeriodsViewHolder$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
            final /* synthetic */ InstallmentPeriodsViewHolder this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(InstallmentPeriodsViewHolder installmentPeriodsViewHolder) {
                super(0);
                this.this$0 = installmentPeriodsViewHolder;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.canShowOnboarding = true;
            }
        }

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String pageTag) {
            Intrinsics.checkNotNullParameter(pageTag, "pageTag");
            InstallmentPeriodsViewHolder.this.onBoardingViewModel.showIfNeed(pageTag, "installment_onboarding_is_shown", new AnonymousClass1(InstallmentPeriodsViewHolder.this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallmentPeriodsViewHolder(@NotNull InstallmentPeriodsView installmentPeriodsView, @NotNull BaseOnBoardingViewModel.Default onBoardingViewModel, @NotNull ComposerReferences composerReferences, @NotNull l tokenizedAnalytics) {
        super(installmentPeriodsView);
        Intrinsics.checkNotNullParameter(installmentPeriodsView, "installmentPeriodsView");
        Intrinsics.checkNotNullParameter(onBoardingViewModel, "onBoardingViewModel");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.installmentPeriodsView = installmentPeriodsView;
        this.onBoardingViewModel = onBoardingViewModel;
        this.composerReferences = composerReferences;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = new ActionHandler.Builder(composerReferences, this).buildHandler();
        installmentPeriodsView.setOnClickListener(new a(this, 9));
        installmentPeriodsView.setInstallmentPeriodsAdapter(new InstallmentPeriodsAdapter());
        ComposerExtKt.withPageTag(composerReferences.getContainer(), new AnonymousClass2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(InstallmentPeriodsViewHolder installmentPeriodsViewHolder, View view) {
        AtomAction action;
        InstallmentVO.Periods boundData = installmentPeriodsViewHolder.getBoundData();
        if (boundData == null || (action = boundData.getAction()) == null) {
            return;
        }
        installmentPeriodsViewHolder.actionHandler.invoke(action);
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull q info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onVisibleAreaChanged(info);
        if (this.canShowOnboarding) {
            View itemView = this.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            if (o.a(itemView, info, false) == 1.0f) {
                this.composerReferences.getController().update(new InstallmentPurchaseViewMapper$OnboardingEvent$Show(this.itemView.getHeight()));
                this.canShowOnboarding = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull InstallmentVO.Periods item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.installmentPeriodsView.submitList(item.getPeriods(), item.getBackground());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull InstallmentVO.Periods item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        TokenizedAnalyticsExtKt.processViewEvents(this.tokenizedAnalytics, item.getTokenizedEvent());
    }
}
