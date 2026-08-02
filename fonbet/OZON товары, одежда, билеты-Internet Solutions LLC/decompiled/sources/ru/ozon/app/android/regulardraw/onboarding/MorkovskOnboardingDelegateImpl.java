package ru.ozon.app.android.regulardraw.onboarding;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import android.content.SharedPreferences;
import androidx.fragment.app.G;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingDelegate;
import ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingDelegateImpl$lotteryOnboardingPart$2;
import ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingDelegateImpl$morkovksOnboardingPart$2;
import ru.ozon.app.android.regulardraw.onboarding.lottery.LotteryOnboardingManager;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0006\n\u0002\b\u0006*\u0002\"(\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegateImpl;", "Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate;", "Landroid/content/SharedPreferences;", "sharedPreferences", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Landroid/content/SharedPreferences;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "Landroidx/fragment/app/G;", "fragmentManager", "LWZ/l;", "tokenizedAnalytics", "", "init", "(Landroidx/fragment/app/G;LWZ/l;)V", "Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate$MorkovskOnboarding;", "provideMorokvskOnboarding", "()Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate$MorkovskOnboarding;", "Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate$LotteryOnboarding;", "provideLotteryOnboarding", "()Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate$LotteryOnboarding;", "clear", "()V", "Landroid/content/SharedPreferences;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingManager;", "morkovskOnboardingManager", "Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingManager;", "Lru/ozon/app/android/regulardraw/onboarding/lottery/LotteryOnboardingManager;", "lotteryOnboardingManager", "Lru/ozon/app/android/regulardraw/onboarding/lottery/LotteryOnboardingManager;", "", "checkSkipOnboarding", "Z", "ru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegateImpl$morkovksOnboardingPart$2$1", "morkovksOnboardingPart$delegate", "LSc/j;", "getMorkovksOnboardingPart", "()Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegateImpl$morkovksOnboardingPart$2$1;", "morkovksOnboardingPart", "ru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegateImpl$lotteryOnboardingPart$2$1", "lotteryOnboardingPart$delegate", "getLotteryOnboardingPart", "()Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegateImpl$lotteryOnboardingPart$2$1;", "lotteryOnboardingPart", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MorkovskOnboardingDelegateImpl implements MorkovskOnboardingDelegate {
    private boolean checkSkipOnboarding;

    @NotNull
    private final FeatureChecker featureChecker;
    private LotteryOnboardingManager lotteryOnboardingManager;

    /* renamed from: lotteryOnboardingPart$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j lotteryOnboardingPart;

    /* renamed from: morkovksOnboardingPart$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j morkovksOnboardingPart;
    private MorkovskOnboardingManager morkovskOnboardingManager;

    @NotNull
    private final SharedPreferences sharedPreferences;

    public MorkovskOnboardingDelegateImpl(@NotNull SharedPreferences sharedPreferences, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.sharedPreferences = sharedPreferences;
        this.featureChecker = featureChecker;
        this.checkSkipOnboarding = true;
        this.morkovksOnboardingPart = k.b(new MorkovskOnboardingDelegateImpl$morkovksOnboardingPart$2(this));
        this.lotteryOnboardingPart = k.b(new MorkovskOnboardingDelegateImpl$lotteryOnboardingPart$2(this));
    }

    private final MorkovskOnboardingDelegateImpl$lotteryOnboardingPart$2.AnonymousClass1 getLotteryOnboardingPart() {
        return (MorkovskOnboardingDelegateImpl$lotteryOnboardingPart$2.AnonymousClass1) this.lotteryOnboardingPart.getValue();
    }

    private final MorkovskOnboardingDelegateImpl$morkovksOnboardingPart$2.AnonymousClass1 getMorkovksOnboardingPart() {
        return (MorkovskOnboardingDelegateImpl$morkovksOnboardingPart$2.AnonymousClass1) this.morkovksOnboardingPart.getValue();
    }

    @Override // ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingDelegate
    public void clear() {
        this.morkovskOnboardingManager = null;
        this.lotteryOnboardingManager = null;
    }

    @Override // ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingDelegate
    public void init(@NotNull G fragmentManager, l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.morkovskOnboardingManager = new MorkovskOnboardingManager(this.sharedPreferences, tokenizedAnalytics, this.featureChecker, this.checkSkipOnboarding, new MorkovskOnboardingDelegateImpl$init$1(fragmentManager));
        this.lotteryOnboardingManager = new LotteryOnboardingManager(this.sharedPreferences, tokenizedAnalytics, this.featureChecker, this.checkSkipOnboarding, new MorkovskOnboardingDelegateImpl$init$2(fragmentManager));
    }

    @Override // ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingDelegate
    @NotNull
    public MorkovskOnboardingDelegate.LotteryOnboarding provideLotteryOnboarding() {
        return getLotteryOnboardingPart();
    }

    @Override // ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingDelegate
    @NotNull
    public MorkovskOnboardingDelegate.MorkovskOnboarding provideMorokvskOnboarding() {
        return getMorkovksOnboardingPart();
    }
}
