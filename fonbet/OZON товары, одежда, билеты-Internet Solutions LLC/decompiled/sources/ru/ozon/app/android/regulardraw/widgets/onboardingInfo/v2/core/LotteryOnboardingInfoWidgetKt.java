package ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.core;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import d00.C6020f;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingDelegate;
import ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.core.LotteryOnboardingInfoWidgetKt;
import ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.di.LotteryOnboardingInfoComponent;
import ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.presentation.LotteryOnboardingInfoVI;
import ru.ozon.app.android.utils.CoroutineUtilsKt;
import ru.ozon.composer.compose.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import xe.C10727i;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001aK\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\n0\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001f\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Ln20/i;", "LotteryOnboardingInfoWidget", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)Ln20/i;", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI;", "lotteryItem", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/di/LotteryOnboardingInfoComponent;", "component", "", "forceSendOnboardingViewRequest", "(Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI;Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/di/LotteryOnboardingInfoComponent;)V", "Landroidx/lifecycle/J;", "lifecycleOwner", "Landroidx/lifecycle/v;", "lifecycle", "Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate;", "onboardingDelegate", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Landroidx/lifecycle/G;", "createLifecycleObserver", "(Landroidx/lifecycle/J;Landroidx/lifecycle/v;Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI;Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/di/LotteryOnboardingInfoComponent;Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate;Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/G;", "", "actionName", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "sendOnboardingViewedRequest", "(Ljava/lang/String;Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "regulardraw_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LotteryOnboardingInfoWidgetKt {
    @NotNull
    public static final i LotteryOnboardingInfoWidget(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        return C6020f.a("regulardraw", "onboarding", k.a(2), new LotteryOnboardingInfoWidgetKt$LotteryOnboardingInfoWidget$1(jsonDeserializer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G createLifecycleObserver(final J j11, final AbstractC5434v abstractC5434v, final LotteryOnboardingInfoVI lotteryOnboardingInfoVI, final LotteryOnboardingInfoComponent lotteryOnboardingInfoComponent, final MorkovskOnboardingDelegate morkovskOnboardingDelegate, final Function1<? super AtomAction, Unit> function1) {
        return new G() { // from class: tG.a
            @Override // androidx.lifecycle.G
            public final void onStateChanged(J j12, AbstractC5434v.a aVar) {
                LotteryOnboardingInfoWidgetKt.createLifecycleObserver$lambda$2(J.this, abstractC5434v, morkovskOnboardingDelegate, lotteryOnboardingInfoVI, function1, lotteryOnboardingInfoComponent, j12, aVar);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createLifecycleObserver$lambda$2(J j11, AbstractC5434v abstractC5434v, MorkovskOnboardingDelegate morkovskOnboardingDelegate, LotteryOnboardingInfoVI lotteryOnboardingInfoVI, Function1 function1, LotteryOnboardingInfoComponent lotteryOnboardingInfoComponent, J j12, AbstractC5434v.a event) {
        Intrinsics.checkNotNullParameter(j12, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC5434v.a.ON_RESUME) {
            C10727i.c(K.a(j11), null, null, new LotteryOnboardingInfoWidgetKt$createLifecycleObserver$1$1(abstractC5434v, morkovskOnboardingDelegate, lotteryOnboardingInfoVI, function1, lotteryOnboardingInfoComponent, null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void forceSendOnboardingViewRequest(LotteryOnboardingInfoVI lotteryOnboardingInfoVI, LotteryOnboardingInfoComponent lotteryOnboardingInfoComponent) {
        Object obj;
        LotteryOnboardingInfoVI.OnboardingStep.CloseButton closeButton;
        AtomActionDTO firstPresentationCompletedAction;
        String link;
        Iterator<T> it = lotteryOnboardingInfoVI.getOnboardingItems().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((LotteryOnboardingInfoVI.OnboardingStep) obj).getCloseButton().getFirstPresentationCompletedAction() != null) {
                    break;
                }
            }
        }
        LotteryOnboardingInfoVI.OnboardingStep onboardingStep = (LotteryOnboardingInfoVI.OnboardingStep) obj;
        if (onboardingStep == null || (closeButton = onboardingStep.getCloseButton()) == null || (firstPresentationCompletedAction = closeButton.getFirstPresentationCompletedAction()) == null || (link = firstPresentationCompletedAction.getLink()) == null) {
            return;
        }
        sendOnboardingViewedRequest(link, lotteryOnboardingInfoComponent.getActionV2Repository());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendOnboardingViewedRequest(String str, ActionV2Repository actionV2Repository) {
        C10727i.c(CoroutineUtilsKt.getSafeScope(), null, null, new LotteryOnboardingInfoWidgetKt$sendOnboardingViewedRequest$1(actionV2Repository, str, null), 3);
    }
}
