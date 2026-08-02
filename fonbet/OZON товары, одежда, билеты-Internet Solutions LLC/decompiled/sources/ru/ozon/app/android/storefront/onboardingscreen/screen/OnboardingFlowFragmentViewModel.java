package ru.ozon.app.android.storefront.onboardingscreen.screen;

import Ae.C2399j;
import Ae.C2408n0;
import Ob0.a;
import android.app.Activity;
import android.net.Uri;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.authEvents.AuthEventsCollector;
import ru.ozon.app.android.account.authEvents.AuthResultActions;
import ru.ozon.app.android.storefront.onboardingscreen.domain.OnboardingEnablePushInteractor;
import ru.ozon.app.android.storefront.onboardingscreen.domain.OnboardingInteractor;
import ru.ozon.app.android.storefront.onboardingscreen.onboardingv2.OnBoardingPagesDTO;
import ru.ozon.app.android.storefront.onboardingscreen.onboardingv2.OnboardingAtomActionState;
import ru.ozon.app.android.storefront.onboardingscreen.screen.NavigationState;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 52\u00020\u0001:\u00015B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8\u0006¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b(\u0010)R\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R(\u00100\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010/\u0012\u0006\u0012\u0004\u0018\u00010/\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00066"}, d2 = {"Lru/ozon/app/android/storefront/onboardingscreen/screen/OnboardingFlowFragmentViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/storefront/onboardingscreen/domain/OnboardingInteractor;", "onboardingInteractor", "LOb0/a;", "ozonIdAppApi", "Lru/ozon/app/android/storefront/onboardingscreen/domain/OnboardingEnablePushInteractor;", "onboardingEnablePushInteractor", "Lru/ozon/app/android/account/authEvents/AuthEventsCollector;", "authEventsCollector", "<init>", "(Lru/ozon/app/android/storefront/onboardingscreen/domain/OnboardingInteractor;LOb0/a;Lru/ozon/app/android/storefront/onboardingscreen/domain/OnboardingEnablePushInteractor;Lru/ozon/app/android/account/authEvents/AuthEventsCollector;)V", "Lru/ozon/app/android/storefront/onboardingscreen/onboardingv2/OnboardingAtomActionState;", "state", "", "updateStateFromFlowAction", "(Lru/ozon/app/android/storefront/onboardingscreen/onboardingv2/OnboardingAtomActionState;)V", "", "link", "", "", "params", "Lxe/B0;", "requestPushPermissions", "(Ljava/lang/String;Ljava/util/Map;)Lxe/B0;", "Landroid/app/Activity;", "activity", "signIn", "(Landroid/app/Activity;)V", "forceCloseFlowState", "()V", "moveThroughPageList", "LOb0/a;", "Lru/ozon/app/android/storefront/onboardingscreen/domain/OnboardingEnablePushInteractor;", "Lru/ozon/app/android/account/authEvents/AuthEventsCollector;", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/storefront/onboardingscreen/screen/NavigationState;", "navigationLiveData", "Landroidx/lifecycle/V;", "navigationStateLiveData", "getNavigationStateLiveData", "()Landroidx/lifecycle/V;", "", "Lru/ozon/app/android/storefront/onboardingscreen/onboardingv2/OnBoardingPagesDTO$OnBoardingPageDTO;", "pageList", "Ljava/util/List;", "Lkotlin/Pair;", "Landroid/net/Uri;", "deeplinkInfo", "Lkotlin/Pair;", "", "currentPageIndex", "I", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OnboardingFlowFragmentViewModel extends w0 {

    @NotNull
    private final AuthEventsCollector authEventsCollector;
    private int currentPageIndex;
    private Pair<? extends Uri, ? extends Uri> deeplinkInfo;

    @NotNull
    private final V<NavigationState> navigationLiveData;

    @NotNull
    private final V<NavigationState> navigationStateLiveData;

    @NotNull
    private final OnboardingEnablePushInteractor onboardingEnablePushInteractor;

    @NotNull
    private final a ozonIdAppApi;
    private List<OnBoardingPagesDTO.OnBoardingPageDTO> pageList;
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.storefront.onboardingscreen.screen.OnboardingFlowFragmentViewModel$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7719a implements Function2<OnboardingAtomActionState, d<? super Unit>, Object> {
        AnonymousClass1(Object obj) {
            super(2, obj, OnboardingFlowFragmentViewModel.class, "updateStateFromFlowAction", "updateStateFromFlowAction(Lru/ozon/app/android/storefront/onboardingscreen/onboardingv2/OnboardingAtomActionState;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OnboardingAtomActionState onboardingAtomActionState, d<? super Unit> dVar) {
            return OnboardingFlowFragmentViewModel._init_$updateStateFromFlowAction((OnboardingFlowFragmentViewModel) this.receiver, onboardingAtomActionState, dVar);
        }
    }

    public OnboardingFlowFragmentViewModel(@NotNull OnboardingInteractor onboardingInteractor, @NotNull a ozonIdAppApi, @NotNull OnboardingEnablePushInteractor onboardingEnablePushInteractor, @NotNull AuthEventsCollector authEventsCollector) {
        Intrinsics.checkNotNullParameter(onboardingInteractor, "onboardingInteractor");
        Intrinsics.checkNotNullParameter(ozonIdAppApi, "ozonIdAppApi");
        Intrinsics.checkNotNullParameter(onboardingEnablePushInteractor, "onboardingEnablePushInteractor");
        Intrinsics.checkNotNullParameter(authEventsCollector, "authEventsCollector");
        this.ozonIdAppApi = ozonIdAppApi;
        this.onboardingEnablePushInteractor = onboardingEnablePushInteractor;
        this.authEventsCollector = authEventsCollector;
        V<NavigationState> v11 = new V<>(NavigationState.InitialState.INSTANCE);
        this.navigationLiveData = v11;
        this.navigationStateLiveData = v11;
        this.pageList = onboardingInteractor.getPageList();
        this.deeplinkInfo = onboardingInteractor.getDeeplinkData();
        C2399j.C(new C2408n0(onboardingInteractor.getOnboardingAtomStateListener(), new AnonymousClass1(this)), x0.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object _init_$updateStateFromFlowAction(OnboardingFlowFragmentViewModel onboardingFlowFragmentViewModel, OnboardingAtomActionState onboardingAtomActionState, d dVar) {
        onboardingFlowFragmentViewModel.updateStateFromFlowAction(onboardingAtomActionState);
        return Unit.f71690a;
    }

    private final B0 requestPushPermissions(String link, Map<String, ? extends Object> params) {
        return C10727i.c(x0.a(this), null, null, new OnboardingFlowFragmentViewModel$requestPushPermissions$1(this, link, params, null), 3);
    }

    private final void updateStateFromFlowAction(OnboardingAtomActionState state) {
        if (state instanceof OnboardingAtomActionState.Init) {
            return;
        }
        if (state instanceof OnboardingAtomActionState.MoveToNextState) {
            moveThroughPageList();
            return;
        }
        if (state instanceof OnboardingAtomActionState.EnableOrderPushState) {
            this.navigationLiveData.setValue(new NavigationState.EnableSystemPermissions(false));
            return;
        }
        if (state instanceof OnboardingAtomActionState.EnableAllPushState) {
            this.navigationLiveData.setValue(new NavigationState.EnableSystemPermissions(false));
            if (this.ozonIdAppApi.getUserId() != 0) {
                OnboardingAtomActionState.EnableAllPushState enableAllPushState = (OnboardingAtomActionState.EnableAllPushState) state;
                requestPushPermissions(enableAllPushState.getLink(), enableAllPushState.getParams());
                return;
            }
            return;
        }
        V<NavigationState> v11 = this.navigationLiveData;
        Pair<? extends Uri, ? extends Uri> pair = this.deeplinkInfo;
        Uri e11 = pair != null ? pair.e() : null;
        Pair<? extends Uri, ? extends Uri> pair2 = this.deeplinkInfo;
        v11.setValue(new NavigationState.CloseScreenFlow(e11, pair2 != null ? pair2.f() : null));
    }

    public final void forceCloseFlowState() {
        V<NavigationState> v11 = this.navigationLiveData;
        Pair<? extends Uri, ? extends Uri> pair = this.deeplinkInfo;
        Uri e11 = pair != null ? pair.e() : null;
        Pair<? extends Uri, ? extends Uri> pair2 = this.deeplinkInfo;
        v11.setValue(new NavigationState.CloseScreenFlow(e11, pair2 != null ? pair2.f() : null));
    }

    @NotNull
    public final V<NavigationState> getNavigationStateLiveData() {
        return this.navigationStateLiveData;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void moveThroughPageList() {
        NavigationState navigationState;
        int i11 = this.currentPageIndex + 1;
        this.currentPageIndex = i11;
        List<OnBoardingPagesDTO.OnBoardingPageDTO> list = this.pageList;
        OnBoardingPagesDTO.OnBoardingPageDTO onBoardingPageDTO = list != null ? (OnBoardingPagesDTO.OnBoardingPageDTO) C7714v.Q(i11, list) : null;
        if (onBoardingPageDTO == null) {
            forceCloseFlowState();
            return;
        }
        V<NavigationState> v11 = this.navigationLiveData;
        String type = onBoardingPageDTO.getType();
        int hashCode = type.hashCode();
        if (hashCode == -1001047131) {
            if (type.equals("ozonID")) {
                navigationState = NavigationState.LaunchAuth.INSTANCE;
            }
            Pair<? extends Uri, ? extends Uri> pair = this.deeplinkInfo;
            if (pair != null) {
            }
            Pair<? extends Uri, ? extends Uri> pair2 = this.deeplinkInfo;
            navigationState = new NavigationState.CloseScreenFlow(r3, pair2 != null ? pair2.f() : null);
        } else if (hashCode != -353957937) {
            if (hashCode == 102225 && type.equals("geo")) {
                navigationState = NavigationState.LaunchGeo.INSTANCE;
            }
            Pair<? extends Uri, ? extends Uri> pair3 = this.deeplinkInfo;
            Uri e11 = pair3 != null ? pair3.e() : null;
            Pair<? extends Uri, ? extends Uri> pair22 = this.deeplinkInfo;
            navigationState = new NavigationState.CloseScreenFlow(e11, pair22 != null ? pair22.f() : null);
        } else {
            if (type.equals("composerPage")) {
                String deeplink = onBoardingPageDTO.getDeeplink();
                if (deeplink == null) {
                    deeplink = "";
                }
                navigationState = new NavigationState.LaunchComposerPage(deeplink);
            }
            Pair<? extends Uri, ? extends Uri> pair32 = this.deeplinkInfo;
            if (pair32 != null) {
            }
            Pair<? extends Uri, ? extends Uri> pair222 = this.deeplinkInfo;
            navigationState = new NavigationState.CloseScreenFlow(e11, pair222 != null ? pair222.f() : null);
        }
        v11.setValue(navigationState);
    }

    public final void signIn(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.authEventsCollector.setAuthResultActions(new AuthResultActions(null, null, null, null, null, null, new OnboardingFlowFragmentViewModel$signIn$1(this), 63, null));
        this.ozonIdAppApi.l(new OnboardingFlowFragmentViewModel$signIn$2(activity));
    }
}
