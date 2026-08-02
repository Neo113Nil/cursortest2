package ru.ozon.app.android.storefront.onboardingscreen.domain;

import Ae.M0;
import Sc.r;
import android.net.Uri;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.onboardingscreen.onboardingv2.OnBoardingPagesDTO;
import ru.ozon.app.android.storefront.onboardingscreen.onboardingv2.OnboardingAtomActionState;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\fH¦@¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR.\u0010\"\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u001d8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/storefront/onboardingscreen/domain/OnboardingInteractor;", "", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "flowAction", "", "setFlowAction", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "Landroid/net/Uri;", "link", "referrer", "setUriData", "(Landroid/net/Uri;Landroid/net/Uri;)V", "LSc/r;", "", "callOnBoardingCheckerWithAction-IoAF18A", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "callOnBoardingCheckerWithAction", "LAe/M0;", "Lru/ozon/app/android/storefront/onboardingscreen/onboardingv2/OnboardingAtomActionState;", "getOnboardingAtomStateListener", "()LAe/M0;", "onboardingAtomStateListener", "", "Lru/ozon/app/android/storefront/onboardingscreen/onboardingv2/OnBoardingPagesDTO$OnBoardingPageDTO;", "getPageList", "()Ljava/util/List;", "setPageList", "(Ljava/util/List;)V", "pageList", "Lkotlin/Pair;", "getDeeplinkData", "()Lkotlin/Pair;", "setDeeplinkData", "(Lkotlin/Pair;)V", "deeplinkData", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface OnboardingInteractor {
    /* renamed from: callOnBoardingCheckerWithAction-IoAF18A, reason: not valid java name */
    Object mo1021callOnBoardingCheckerWithActionIoAF18A(@NotNull d<? super r<String>> dVar);

    Pair<Uri, Uri> getDeeplinkData();

    @NotNull
    M0<OnboardingAtomActionState> getOnboardingAtomStateListener();

    List<OnBoardingPagesDTO.OnBoardingPageDTO> getPageList();

    void setFlowAction(@NotNull AtomAction.Click flowAction);

    void setUriData(Uri link, Uri referrer);
}
