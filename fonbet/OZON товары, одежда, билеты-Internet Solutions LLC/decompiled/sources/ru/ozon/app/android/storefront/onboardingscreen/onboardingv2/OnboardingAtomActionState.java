package ru.ozon.app.android.storefront.onboardingscreen.onboardingv2;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/storefront/onboardingscreen/onboardingv2/OnboardingAtomActionState;", "", "<init>", "()V", "Init", "CloseFlowState", "MoveToNextState", "EnableOrderPushState", "EnableAllPushState", "Lru/ozon/app/android/storefront/onboardingscreen/onboardingv2/OnboardingAtomActionState$CloseFlowState;", "Lru/ozon/app/android/storefront/onboardingscreen/onboardingv2/OnboardingAtomActionState$EnableAllPushState;", "Lru/ozon/app/android/storefront/onboardingscreen/onboardingv2/OnboardingAtomActionState$EnableOrderPushState;", "Lru/ozon/app/android/storefront/onboardingscreen/onboardingv2/OnboardingAtomActionState$Init;", "Lru/ozon/app/android/storefront/onboardingscreen/onboardingv2/OnboardingAtomActionState$MoveToNextState;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class OnboardingAtomActionState {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/storefront/onboardingscreen/onboardingv2/OnboardingAtomActionState$CloseFlowState;", "Lru/ozon/app/android/storefront/onboardingscreen/onboardingv2/OnboardingAtomActionState;", "<init>", "()V", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class CloseFlowState extends OnboardingAtomActionState {

        @NotNull
        public static final CloseFlowState INSTANCE = new CloseFlowState();

        private CloseFlowState() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/storefront/onboardingscreen/onboardingv2/OnboardingAtomActionState$EnableAllPushState;", "Lru/ozon/app/android/storefront/onboardingscreen/onboardingv2/OnboardingAtomActionState;", "link", "", "params", "", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getLink", "()Ljava/lang/String;", "getParams", "()Ljava/util/Map;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class EnableAllPushState extends OnboardingAtomActionState {

        @NotNull
        private final String link;
        private final Map<String, Object> params;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnableAllPushState(@NotNull String link, Map<String, ? extends Object> map) {
            super(null);
            Intrinsics.checkNotNullParameter(link, "link");
            this.link = link;
            this.params = map;
        }

        @NotNull
        public final String getLink() {
            return this.link;
        }

        public final Map<String, Object> getParams() {
            return this.params;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/storefront/onboardingscreen/onboardingv2/OnboardingAtomActionState$EnableOrderPushState;", "Lru/ozon/app/android/storefront/onboardingscreen/onboardingv2/OnboardingAtomActionState;", "<init>", "()V", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class EnableOrderPushState extends OnboardingAtomActionState {

        @NotNull
        public static final EnableOrderPushState INSTANCE = new EnableOrderPushState();

        private EnableOrderPushState() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/storefront/onboardingscreen/onboardingv2/OnboardingAtomActionState$Init;", "Lru/ozon/app/android/storefront/onboardingscreen/onboardingv2/OnboardingAtomActionState;", "<init>", "()V", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Init extends OnboardingAtomActionState {

        @NotNull
        public static final Init INSTANCE = new Init();

        private Init() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/storefront/onboardingscreen/onboardingv2/OnboardingAtomActionState$MoveToNextState;", "Lru/ozon/app/android/storefront/onboardingscreen/onboardingv2/OnboardingAtomActionState;", "<init>", "()V", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class MoveToNextState extends OnboardingAtomActionState {

        @NotNull
        public static final MoveToNextState INSTANCE = new MoveToNextState();

        private MoveToNextState() {
            super(null);
        }
    }

    public /* synthetic */ OnboardingAtomActionState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OnboardingAtomActionState() {
    }
}
