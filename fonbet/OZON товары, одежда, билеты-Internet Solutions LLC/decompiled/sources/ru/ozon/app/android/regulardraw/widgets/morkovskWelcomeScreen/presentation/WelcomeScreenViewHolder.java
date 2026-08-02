package ru.ozon.app.android.regulardraw.widgets.morkovskWelcomeScreen.presentation;

import W10.c;
import WZ.t;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import d20.AbstractC6065b;
import j.C7232a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.regulardraw.R$drawable;
import ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingDelegate;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\rJ'\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u000b0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010*\u001a\u00020)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskWelcomeScreen/presentation/WelcomeScreenViewHolder;", "Ld20/b;", "Lru/ozon/app/android/regulardraw/widgets/morkovskWelcomeScreen/presentation/WelcomeScreenVO;", "Ll10/i;", "container", "Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate;", "morkovskOnboardingDelegate", "Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "<init>", "(Ll10/i;Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate;Lru/ozon/app/android/composer/ComposerNavigator;)V", "", "setBackground", "()V", "item", "bind", "(Lru/ozon/app/android/regulardraw/widgets/morkovskWelcomeScreen/presentation/WelcomeScreenVO;)V", "addView", "removeView", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/regulardraw/widgets/morkovskWelcomeScreen/presentation/WelcomeScreenVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll10/i;", "Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate;", "Lru/ozon/app/android/composer/ComposerNavigator;", "Landroid/view/ViewGroup;", "composerRoot", "Landroid/view/ViewGroup;", "Lru/ozon/app/android/regulardraw/widgets/morkovskWelcomeScreen/presentation/WelcomeScreenView;", "welcomeScreenView", "Lru/ozon/app/android/regulardraw/widgets/morkovskWelcomeScreen/presentation/WelcomeScreenView;", "", "isBackgroundSet", "Z", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class WelcomeScreenViewHolder extends AbstractC6065b<WelcomeScreenVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ViewGroup composerRoot;

    @NotNull
    private final i container;
    private boolean isBackgroundSet;

    @NotNull
    private final View metricView;

    @NotNull
    private final MorkovskOnboardingDelegate morkovskOnboardingDelegate;

    @NotNull
    private final ComposerNavigator navigator;

    @NotNull
    private final WelcomeScreenView welcomeScreenView;

    public WelcomeScreenViewHolder(@NotNull i container, @NotNull MorkovskOnboardingDelegate morkovskOnboardingDelegate, @NotNull ComposerNavigator navigator) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(morkovskOnboardingDelegate, "morkovskOnboardingDelegate");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.container = container;
        this.morkovskOnboardingDelegate = morkovskOnboardingDelegate;
        this.navigator = navigator;
        this.composerRoot = container.Z();
        Context L11 = container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        WelcomeScreenView welcomeScreenView = new WelcomeScreenView(L11, null, 0, 6, null);
        this.welcomeScreenView = welcomeScreenView;
        this.actionHandler = new ActionHandler.Builder(container, this).onPreProcess(new WelcomeScreenViewHolder$actionHandler$1(this)).buildHandler();
        this.metricView = welcomeScreenView;
    }

    private final void setBackground() {
        if (this.isBackgroundSet) {
            return;
        }
        ComposerViewExtensionKt.composerContainer(this.container.Y()).setBackground(C7232a.a(this.container.L(), R$drawable.img_welcome_bg));
        ComposerViewExtensionKt.composerRecyclerView(this.container.Y()).setBackgroundColor(0);
        this.isBackgroundSet = true;
    }

    @Override // d20.AbstractC6065b
    public void addView() {
        this.composerRoot.addView(this.welcomeScreenView);
    }

    @Override // d20.AbstractC6065b
    @NotNull
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void removeView() {
        this.composerRoot.removeView(this.welcomeScreenView);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull WelcomeScreenVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getForceShow()) {
            setBackground();
            this.welcomeScreenView.bind((item.getWithWelcomeBonus() == null || !this.morkovskOnboardingDelegate.provideMorokvskOnboarding().shouldShowWelcomeScreen()) ? item.getWithoutWelcomeBonus() : item.getWithWelcomeBonus(), this.actionHandler);
            return;
        }
        AtomActionDTO action = item.getWithoutWelcomeBonus().getButton().getAction();
        String link = action != null ? action.getLink() : null;
        if (link != null) {
            this.navigator.popBackStack();
            ComposerNavigator.DefaultImpls.openDeeplink$default(this.navigator, link, null, 2, null);
        }
    }

    @Override // d20.AbstractC6065b
    public void trackView(@NotNull WelcomeScreenVO item, @NotNull c trackingData, @NotNull f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.container.X(), tokenizedEvent, null, 2, null);
        }
    }
}
