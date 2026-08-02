package ru.ozon.app.android.storefront.onboardingscreen.domain;

import Ae.O0;
import Ae.x0;
import De.s;
import Ge.f;
import Sc.r;
import Xc.a;
import Xc.b;
import android.net.Uri;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.reactivex.x;
import io.reactivex.y;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.storefront.onboardingscreen.onboardingv2.OnBoardingPagesDTO;
import ru.ozon.app.android.storefront.onboardingscreen.onboardingv2.OnboardingAtomActionState;
import ru.ozon.uni.atoms.af.AtomAction;
import sc.C9656b;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 62\u00020\u0001:\u00016B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\r\u0010\bJ\u0010\u0010\u000e\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011H\u0096@¢\u0006\u0004\b\u0013\u0010\bJ#\u0010\u0018\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R*\u0010)\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R4\u00100\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010/8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u00067"}, d2 = {"Lru/ozon/app/android/storefront/onboardingscreen/domain/OnboardingInteractorImpl;", "Lru/ozon/app/android/storefront/onboardingscreen/domain/OnboardingInteractor;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "", "onNextStepAction", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "flowAction", "onPushAllAction", "(Lru/ozon/uni/atoms/af/AtomAction$Click;Lkotlin/coroutines/d;)Ljava/lang/Object;", "onPushOrdersAction", "emitCloseFlowState", "setFlowAction", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "LSc/r;", "", "callOnBoardingCheckerWithAction-IoAF18A", "callOnBoardingCheckerWithAction", "Landroid/net/Uri;", "link", "referrer", "setUriData", "(Landroid/net/Uri;Landroid/net/Uri;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lxe/B0;", "flowActionJob", "Lxe/B0;", "Lxe/M;", "scope", "Lxe/M;", "LAe/x0;", "Lru/ozon/app/android/storefront/onboardingscreen/onboardingv2/OnboardingAtomActionState;", "onboardingAtomStateListener", "LAe/x0;", "getOnboardingAtomStateListener", "()LAe/x0;", "", "Lru/ozon/app/android/storefront/onboardingscreen/onboardingv2/OnBoardingPagesDTO$OnBoardingPageDTO;", "pageList", "Ljava/util/List;", "getPageList", "()Ljava/util/List;", "setPageList", "(Ljava/util/List;)V", "Lkotlin/Pair;", "deeplinkData", "Lkotlin/Pair;", "getDeeplinkData", "()Lkotlin/Pair;", "setDeeplinkData", "(Lkotlin/Pair;)V", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OnboardingInteractorImpl implements OnboardingInteractor {

    @NotNull
    private final ActionV2Repository actionV2Repository;
    private Pair<? extends Uri, ? extends Uri> deeplinkData;
    private B0 flowActionJob;

    @NotNull
    private final x0<OnboardingAtomActionState> onboardingAtomStateListener;
    private List<OnBoardingPagesDTO.OnBoardingPageDTO> pageList;

    @NotNull
    private final M scope;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/storefront/onboardingscreen/domain/OnboardingInteractorImpl$Companion;", "", "<init>", "()V", "ONBOARDING_URL", "", "ONBOARDING_ACTION_KEY", "TIMEOUT_MILLIS", "", "OnboardingFlowAction", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/storefront/onboardingscreen/domain/OnboardingInteractorImpl$Companion$OnboardingFlowAction;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PUSH_ACTION_PARAM", "PUSH_ORDERS_PARAM", "NEXT_STEP_PARAM", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class OnboardingFlowAction {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ OnboardingFlowAction[] $VALUES;

            @NotNull
            private final String value;
            public static final OnboardingFlowAction PUSH_ACTION_PARAM = new OnboardingFlowAction("PUSH_ACTION_PARAM", 0, "pushAll");
            public static final OnboardingFlowAction PUSH_ORDERS_PARAM = new OnboardingFlowAction("PUSH_ORDERS_PARAM", 1, "pushOrders");
            public static final OnboardingFlowAction NEXT_STEP_PARAM = new OnboardingFlowAction("NEXT_STEP_PARAM", 2, "nextStep");

            private static final /* synthetic */ OnboardingFlowAction[] $values() {
                return new OnboardingFlowAction[]{PUSH_ACTION_PARAM, PUSH_ORDERS_PARAM, NEXT_STEP_PARAM};
            }

            static {
                OnboardingFlowAction[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private OnboardingFlowAction(String str, int i11, String str2) {
                this.value = str2;
            }

            public static OnboardingFlowAction valueOf(String str) {
                return (OnboardingFlowAction) Enum.valueOf(OnboardingFlowAction.class, str);
            }

            public static OnboardingFlowAction[] values() {
                return (OnboardingFlowAction[]) $VALUES.clone();
            }

            @NotNull
            public final String getValue() {
                return this.value;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public OnboardingInteractorImpl(@NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.actionV2Repository = actionV2Repository;
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.scope = N.a(CoroutineContext.Element.a.d(s.f6650a.x(), (H0) b11));
        this.onboardingAtomStateListener = O0.a(OnboardingAtomActionState.Init.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object emitCloseFlowState(d<? super Unit> dVar) {
        Object emit = getOnboardingAtomStateListener().emit(OnboardingAtomActionState.CloseFlowState.INSTANCE, dVar);
        return emit == Wc.a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onNextStepAction(d<? super Unit> dVar) {
        Object emit = getOnboardingAtomStateListener().emit(OnboardingAtomActionState.MoveToNextState.INSTANCE, dVar);
        return emit == Wc.a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onPushAllAction(AtomAction.Click click, d<? super Unit> dVar) {
        String link;
        Object emit;
        return (click == null || (link = click.getLink()) == null || (emit = getOnboardingAtomStateListener().emit(new OnboardingAtomActionState.EnableAllPushState(link, click.getParams()), dVar)) != Wc.a.COROUTINE_SUSPENDED) ? Unit.f71690a : emit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onPushOrdersAction(d<? super Unit> dVar) {
        Object emit = getOnboardingAtomStateListener().emit(OnboardingAtomActionState.EnableOrderPushState.INSTANCE, dVar);
        return emit == Wc.a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:3|(12:5|6|7|(1:(2:10|11)(2:30|31))(3:32|33|(1:35)(1:36))|12|(1:29)(1:16)|17|(1:21)|22|23|(1:25)|26))|40|6|7|(0)(0)|12|(1:14)|29|17|(2:19|21)|22|23|(0)|26) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x002b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a5, code lost:
    
        r0 = Sc.r.INSTANCE;
        r1 = Sc.s.a(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // ru.ozon.app.android.storefront.onboardingscreen.domain.OnboardingInteractor
    /* renamed from: callOnBoardingCheckerWithAction-IoAF18A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo1021callOnBoardingCheckerWithActionIoAF18A(@NotNull d<? super r<String>> dVar) {
        OnboardingInteractorImpl$callOnBoardingCheckerWithAction$1 onboardingInteractorImpl$callOnBoardingCheckerWithAction$1;
        int i11;
        Object a11;
        Throwable b11;
        OnboardingInteractorImpl onboardingInteractorImpl;
        List<OnBoardingPagesDTO.OnBoardingPageDTO> pageList;
        OnBoardingPagesDTO.OnBoardingPageDTO onBoardingPageDTO;
        OnBoardingPagesDTO onBoardingPagesDTO;
        if (dVar instanceof OnboardingInteractorImpl$callOnBoardingCheckerWithAction$1) {
            onboardingInteractorImpl$callOnBoardingCheckerWithAction$1 = (OnboardingInteractorImpl$callOnBoardingCheckerWithAction$1) dVar;
            int i12 = onboardingInteractorImpl$callOnBoardingCheckerWithAction$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                onboardingInteractorImpl$callOnBoardingCheckerWithAction$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = onboardingInteractorImpl$callOnBoardingCheckerWithAction$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = onboardingInteractorImpl$callOnBoardingCheckerWithAction$1.label;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    ActionV2Request actionV2Request = new ActionV2Request(null, "getOnboardingPages", false, 4, null);
                    r.Companion companion = r.INSTANCE;
                    y callAction = this.actionV2Repository.callAction(actionV2Request, OnBoardingPagesDTO.class);
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    callAction.getClass();
                    x a12 = Mc.a.a();
                    C9656b.c(timeUnit, "unit is null");
                    C9656b.c(a12, "scheduler is null");
                    Bc.x xVar = new Bc.x(callAction, 1500L, a12);
                    Intrinsics.checkNotNullExpressionValue(xVar, "timeout(...)");
                    onboardingInteractorImpl$callOnBoardingCheckerWithAction$1.L$0 = this;
                    onboardingInteractorImpl$callOnBoardingCheckerWithAction$1.label = 1;
                    obj = f.b(xVar, onboardingInteractorImpl$callOnBoardingCheckerWithAction$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                    onboardingInteractorImpl = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    onboardingInteractorImpl = (OnboardingInteractorImpl) onboardingInteractorImpl$callOnBoardingCheckerWithAction$1.L$0;
                    Sc.s.b(obj);
                }
                ActionV2Response actionV2Response = (ActionV2Response) obj;
                a11 = null;
                onboardingInteractorImpl.setPageList((actionV2Response != null || (onBoardingPagesDTO = (OnBoardingPagesDTO) actionV2Response.getData()) == null) ? null : onBoardingPagesDTO.getPages());
                pageList = onboardingInteractorImpl.getPageList();
                if (pageList != null && (onBoardingPageDTO = (OnBoardingPagesDTO.OnBoardingPageDTO) C7714v.M(pageList)) != null) {
                    a11 = onBoardingPageDTO.getDeeplink();
                }
                r.Companion companion2 = r.INSTANCE;
                b11 = r.b(a11);
                if (b11 != null) {
                    Lm0.a.f17149a.e(b11.getMessage(), new Object[0]);
                }
                return a11;
            }
        }
        onboardingInteractorImpl$callOnBoardingCheckerWithAction$1 = new OnboardingInteractorImpl$callOnBoardingCheckerWithAction$1(this, dVar);
        Object obj2 = onboardingInteractorImpl$callOnBoardingCheckerWithAction$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = onboardingInteractorImpl$callOnBoardingCheckerWithAction$1.label;
        if (i11 != 0) {
        }
        ActionV2Response actionV2Response2 = (ActionV2Response) obj2;
        a11 = null;
        onboardingInteractorImpl.setPageList((actionV2Response2 != null || (onBoardingPagesDTO = (OnBoardingPagesDTO) actionV2Response2.getData()) == null) ? null : onBoardingPagesDTO.getPages());
        pageList = onboardingInteractorImpl.getPageList();
        if (pageList != null) {
            a11 = onBoardingPageDTO.getDeeplink();
        }
        r.Companion companion22 = r.INSTANCE;
        b11 = r.b(a11);
        if (b11 != null) {
        }
        return a11;
    }

    @Override // ru.ozon.app.android.storefront.onboardingscreen.domain.OnboardingInteractor
    public Pair<Uri, Uri> getDeeplinkData() {
        return this.deeplinkData;
    }

    @Override // ru.ozon.app.android.storefront.onboardingscreen.domain.OnboardingInteractor
    public List<OnBoardingPagesDTO.OnBoardingPageDTO> getPageList() {
        return this.pageList;
    }

    public void setDeeplinkData(Pair<? extends Uri, ? extends Uri> pair) {
        this.deeplinkData = pair;
    }

    @Override // ru.ozon.app.android.storefront.onboardingscreen.domain.OnboardingInteractor
    public void setFlowAction(@NotNull AtomAction.Click flowAction) {
        Intrinsics.checkNotNullParameter(flowAction, "flowAction");
        B0 b02 = this.flowActionJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.flowActionJob = C10727i.c(this.scope, null, null, new OnboardingInteractorImpl$setFlowAction$1(flowAction, this, null), 3);
    }

    public void setPageList(List<OnBoardingPagesDTO.OnBoardingPageDTO> list) {
        this.pageList = list;
    }

    @Override // ru.ozon.app.android.storefront.onboardingscreen.domain.OnboardingInteractor
    public void setUriData(Uri link, Uri referrer) {
        setDeeplinkData(new Pair<>(link, referrer));
    }

    @Override // ru.ozon.app.android.storefront.onboardingscreen.domain.OnboardingInteractor
    @NotNull
    public x0<OnboardingAtomActionState> getOnboardingAtomStateListener() {
        return this.onboardingAtomStateListener;
    }
}
