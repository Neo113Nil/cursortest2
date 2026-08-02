package ru.ozon.app.android.regulardraw.onboarding;

import G.g;
import N3.C3660k;
import Nh.a;
import Tl.b;
import WZ.t;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.ui.button.MorkovskShadowButtonDTO;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.MorkovskCurrencyBadgeVO;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00042\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel;", "Lru/ozon/app/android/regulardraw/onboarding/BaseOnboardingModel;", "<init>", "()V", "Companion", "FirstScreenImageModel", "SecondBalanceWithToolTipModel", "ThirdPrizeProgressTooltipModel", "FourthNavbarTooltipModel", "MainDrawMajorScreenModel", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$FirstScreenImageModel;", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$FourthNavbarTooltipModel;", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$MainDrawMajorScreenModel;", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$SecondBalanceWithToolTipModel;", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$ThirdPrizeProgressTooltipModel;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class OnboardingModel implements BaseOnboardingModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\b\u001a\u00020\u0007J\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b0\nJ\u0014\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b0\n¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$Companion;", "", "<init>", "()V", "createGetViewReferenceCallback", "Lkotlin/Function0;", "Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "view", "getFirstShowOnboardingModels", "", "Ljava/lang/Class;", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel;", "getMainDrawMajorScreenOnboardingModels", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Function0<WeakReference<View>> createGetViewReferenceCallback(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            return new OnboardingModel$Companion$createGetViewReferenceCallback$1(new WeakReference(view));
        }

        @NotNull
        public final Set<Class<? extends OnboardingModel>> getFirstShowOnboardingModels() {
            Class[] elements = {FirstScreenImageModel.class, SecondBalanceWithToolTipModel.BalanceModel.class, SecondBalanceWithToolTipModel.ScreenInfoModel.class, ThirdPrizeProgressTooltipModel.PrizeModel.class, ThirdPrizeProgressTooltipModel.ProgressModel.class, ThirdPrizeProgressTooltipModel.ScreenInfoModel.class, FourthNavbarTooltipModel.FirstNavbarItemModel.class, FourthNavbarTooltipModel.SecondNavbarItemModel.class, FourthNavbarTooltipModel.ScreenInfoModel.class, MainDrawMajorScreenModel.class};
            Intrinsics.checkNotNullParameter(elements, "elements");
            return C7705l.j0(elements);
        }

        @NotNull
        public final Set<Class<? extends OnboardingModel>> getMainDrawMajorScreenOnboardingModels() {
            return e0.h(MainDrawMajorScreenModel.class);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$FirstScreenImageModel;", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel;", "", "imageUrl", "actionText", "LWZ/t;", "welcomeScreenViewEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImageUrl", "getActionText", "LWZ/t;", "getWelcomeScreenViewEvent", "()LWZ/t;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FirstScreenImageModel extends OnboardingModel {

        @NotNull
        private final String actionText;

        @NotNull
        private final String imageUrl;
        private final t welcomeScreenViewEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FirstScreenImageModel(@NotNull String imageUrl, @NotNull String actionText, t tVar) {
            super(null);
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(actionText, "actionText");
            this.imageUrl = imageUrl;
            this.actionText = actionText;
            this.welcomeScreenViewEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FirstScreenImageModel)) {
                return false;
            }
            FirstScreenImageModel firstScreenImageModel = (FirstScreenImageModel) other;
            return Intrinsics.d(this.imageUrl, firstScreenImageModel.imageUrl) && Intrinsics.d(this.actionText, firstScreenImageModel.actionText) && Intrinsics.d(this.welcomeScreenViewEvent, firstScreenImageModel.welcomeScreenViewEvent);
        }

        @NotNull
        public final String getActionText() {
            return this.actionText;
        }

        @NotNull
        public final String getImageUrl() {
            return this.imageUrl;
        }

        public final t getWelcomeScreenViewEvent() {
            return this.welcomeScreenViewEvent;
        }

        public int hashCode() {
            int a11 = g.a(this.imageUrl.hashCode() * 31, 31, this.actionText);
            t tVar = this.welcomeScreenViewEvent;
            return a11 + (tVar == null ? 0 : tVar.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.imageUrl;
            String str2 = this.actionText;
            return b.d(C3660k.d("FirstScreenImageModel(imageUrl=", str, ", actionText=", str2, ", welcomeScreenViewEvent="), this.welcomeScreenViewEvent, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$FourthNavbarTooltipModel;", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel;", "<init>", "()V", "FirstNavbarItemModel", "SecondNavbarItemModel", "ScreenInfoModel", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$FourthNavbarTooltipModel$FirstNavbarItemModel;", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$FourthNavbarTooltipModel$ScreenInfoModel;", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$FourthNavbarTooltipModel$SecondNavbarItemModel;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class FourthNavbarTooltipModel extends OnboardingModel {

        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$FourthNavbarTooltipModel$FirstNavbarItemModel;", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$FourthNavbarTooltipModel;", "Lkotlin/Function0;", "Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "firstNavbarView", "", "onItemClick", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/jvm/functions/Function0;", "getFirstNavbarView", "()Lkotlin/jvm/functions/Function0;", "getOnItemClick", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class FirstNavbarItemModel extends FourthNavbarTooltipModel {

            @NotNull
            private final Function0<WeakReference<View>> firstNavbarView;

            @NotNull
            private final Function0<Unit> onItemClick;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public FirstNavbarItemModel(@NotNull Function0<? extends WeakReference<View>> firstNavbarView, @NotNull Function0<Unit> onItemClick) {
                super(null);
                Intrinsics.checkNotNullParameter(firstNavbarView, "firstNavbarView");
                Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
                this.firstNavbarView = firstNavbarView;
                this.onItemClick = onItemClick;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FirstNavbarItemModel)) {
                    return false;
                }
                FirstNavbarItemModel firstNavbarItemModel = (FirstNavbarItemModel) other;
                return Intrinsics.d(this.firstNavbarView, firstNavbarItemModel.firstNavbarView) && Intrinsics.d(this.onItemClick, firstNavbarItemModel.onItemClick);
            }

            @NotNull
            public final Function0<WeakReference<View>> getFirstNavbarView() {
                return this.firstNavbarView;
            }

            @NotNull
            public final Function0<Unit> getOnItemClick() {
                return this.onItemClick;
            }

            public int hashCode() {
                return this.onItemClick.hashCode() + (this.firstNavbarView.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "FirstNavbarItemModel(firstNavbarView=" + this.firstNavbarView + ", onItemClick=" + this.onItemClick + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$FourthNavbarTooltipModel$ScreenInfoModel;", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$FourthNavbarTooltipModel;", "", "tooltipImage", "tooltipText", "skipButtonText", "LWZ/t;", "skipButtonClickEvent", "routeScreenViewEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LWZ/t;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTooltipImage", "getTooltipText", "getSkipButtonText", "LWZ/t;", "getSkipButtonClickEvent", "()LWZ/t;", "getRouteScreenViewEvent", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ScreenInfoModel extends FourthNavbarTooltipModel {
            private final t routeScreenViewEvent;
            private final t skipButtonClickEvent;

            @NotNull
            private final String skipButtonText;

            @NotNull
            private final String tooltipImage;

            @NotNull
            private final String tooltipText;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ScreenInfoModel(@NotNull String tooltipImage, @NotNull String tooltipText, @NotNull String skipButtonText, t tVar, t tVar2) {
                super(null);
                Intrinsics.checkNotNullParameter(tooltipImage, "tooltipImage");
                Intrinsics.checkNotNullParameter(tooltipText, "tooltipText");
                Intrinsics.checkNotNullParameter(skipButtonText, "skipButtonText");
                this.tooltipImage = tooltipImage;
                this.tooltipText = tooltipText;
                this.skipButtonText = skipButtonText;
                this.skipButtonClickEvent = tVar;
                this.routeScreenViewEvent = tVar2;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ScreenInfoModel)) {
                    return false;
                }
                ScreenInfoModel screenInfoModel = (ScreenInfoModel) other;
                return Intrinsics.d(this.tooltipImage, screenInfoModel.tooltipImage) && Intrinsics.d(this.tooltipText, screenInfoModel.tooltipText) && Intrinsics.d(this.skipButtonText, screenInfoModel.skipButtonText) && Intrinsics.d(this.skipButtonClickEvent, screenInfoModel.skipButtonClickEvent) && Intrinsics.d(this.routeScreenViewEvent, screenInfoModel.routeScreenViewEvent);
            }

            public final t getRouteScreenViewEvent() {
                return this.routeScreenViewEvent;
            }

            public final t getSkipButtonClickEvent() {
                return this.skipButtonClickEvent;
            }

            @NotNull
            public final String getSkipButtonText() {
                return this.skipButtonText;
            }

            @NotNull
            public final String getTooltipImage() {
                return this.tooltipImage;
            }

            @NotNull
            public final String getTooltipText() {
                return this.tooltipText;
            }

            public int hashCode() {
                int a11 = g.a(g.a(this.tooltipImage.hashCode() * 31, 31, this.tooltipText), 31, this.skipButtonText);
                t tVar = this.skipButtonClickEvent;
                int hashCode = (a11 + (tVar == null ? 0 : tVar.hashCode())) * 31;
                t tVar2 = this.routeScreenViewEvent;
                return hashCode + (tVar2 != null ? tVar2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.tooltipImage;
                String str2 = this.tooltipText;
                String str3 = this.skipButtonText;
                t tVar = this.skipButtonClickEvent;
                t tVar2 = this.routeScreenViewEvent;
                StringBuilder d11 = C3660k.d("ScreenInfoModel(tooltipImage=", str, ", tooltipText=", str2, ", skipButtonText=");
                d11.append(str3);
                d11.append(", skipButtonClickEvent=");
                d11.append(tVar);
                d11.append(", routeScreenViewEvent=");
                return b.d(d11, tVar2, ")");
            }
        }

        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$FourthNavbarTooltipModel$SecondNavbarItemModel;", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$FourthNavbarTooltipModel;", "Lkotlin/Function0;", "Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "secondNavbarView", "", "onItemClick", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/jvm/functions/Function0;", "getSecondNavbarView", "()Lkotlin/jvm/functions/Function0;", "getOnItemClick", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SecondNavbarItemModel extends FourthNavbarTooltipModel {

            @NotNull
            private final Function0<Unit> onItemClick;

            @NotNull
            private final Function0<WeakReference<View>> secondNavbarView;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public SecondNavbarItemModel(@NotNull Function0<? extends WeakReference<View>> secondNavbarView, @NotNull Function0<Unit> onItemClick) {
                super(null);
                Intrinsics.checkNotNullParameter(secondNavbarView, "secondNavbarView");
                Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
                this.secondNavbarView = secondNavbarView;
                this.onItemClick = onItemClick;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SecondNavbarItemModel)) {
                    return false;
                }
                SecondNavbarItemModel secondNavbarItemModel = (SecondNavbarItemModel) other;
                return Intrinsics.d(this.secondNavbarView, secondNavbarItemModel.secondNavbarView) && Intrinsics.d(this.onItemClick, secondNavbarItemModel.onItemClick);
            }

            @NotNull
            public final Function0<Unit> getOnItemClick() {
                return this.onItemClick;
            }

            @NotNull
            public final Function0<WeakReference<View>> getSecondNavbarView() {
                return this.secondNavbarView;
            }

            public int hashCode() {
                return this.onItemClick.hashCode() + (this.secondNavbarView.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "SecondNavbarItemModel(secondNavbarView=" + this.secondNavbarView + ", onItemClick=" + this.onItemClick + ")";
            }
        }

        public /* synthetic */ FourthNavbarTooltipModel(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private FourthNavbarTooltipModel() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b!\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b%\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$MainDrawMajorScreenModel;", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel;", "", "prizeText", "prizeImage", "tooltipImage", "tooltipText", "Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeVO;", "carrotsExchangeRate", "ticketsExchangeRate", "Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;", "finishButton", "LWZ/t;", "prizeScreenViewEvent", "Lkotlin/Function0;", "", "onMainDrawMajorScreenClosed", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeVO;Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeVO;Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;LWZ/t;Lkotlin/jvm/functions/Function0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPrizeText", "getPrizeImage", "getTooltipImage", "getTooltipText", "Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeVO;", "getCarrotsExchangeRate", "()Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeVO;", "getTicketsExchangeRate", "Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;", "getFinishButton", "()Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;", "LWZ/t;", "getPrizeScreenViewEvent", "()LWZ/t;", "Lkotlin/jvm/functions/Function0;", "getOnMainDrawMajorScreenClosed", "()Lkotlin/jvm/functions/Function0;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MainDrawMajorScreenModel extends OnboardingModel {

        @NotNull
        private final MorkovskCurrencyBadgeVO carrotsExchangeRate;

        @NotNull
        private final MorkovskShadowButtonDTO finishButton;

        @NotNull
        private final Function0<Unit> onMainDrawMajorScreenClosed;

        @NotNull
        private final String prizeImage;
        private final t prizeScreenViewEvent;

        @NotNull
        private final String prizeText;

        @NotNull
        private final MorkovskCurrencyBadgeVO ticketsExchangeRate;

        @NotNull
        private final String tooltipImage;

        @NotNull
        private final String tooltipText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MainDrawMajorScreenModel(@NotNull String prizeText, @NotNull String prizeImage, @NotNull String tooltipImage, @NotNull String tooltipText, @NotNull MorkovskCurrencyBadgeVO carrotsExchangeRate, @NotNull MorkovskCurrencyBadgeVO ticketsExchangeRate, @NotNull MorkovskShadowButtonDTO finishButton, t tVar, @NotNull Function0<Unit> onMainDrawMajorScreenClosed) {
            super(null);
            Intrinsics.checkNotNullParameter(prizeText, "prizeText");
            Intrinsics.checkNotNullParameter(prizeImage, "prizeImage");
            Intrinsics.checkNotNullParameter(tooltipImage, "tooltipImage");
            Intrinsics.checkNotNullParameter(tooltipText, "tooltipText");
            Intrinsics.checkNotNullParameter(carrotsExchangeRate, "carrotsExchangeRate");
            Intrinsics.checkNotNullParameter(ticketsExchangeRate, "ticketsExchangeRate");
            Intrinsics.checkNotNullParameter(finishButton, "finishButton");
            Intrinsics.checkNotNullParameter(onMainDrawMajorScreenClosed, "onMainDrawMajorScreenClosed");
            this.prizeText = prizeText;
            this.prizeImage = prizeImage;
            this.tooltipImage = tooltipImage;
            this.tooltipText = tooltipText;
            this.carrotsExchangeRate = carrotsExchangeRate;
            this.ticketsExchangeRate = ticketsExchangeRate;
            this.finishButton = finishButton;
            this.prizeScreenViewEvent = tVar;
            this.onMainDrawMajorScreenClosed = onMainDrawMajorScreenClosed;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MainDrawMajorScreenModel)) {
                return false;
            }
            MainDrawMajorScreenModel mainDrawMajorScreenModel = (MainDrawMajorScreenModel) other;
            return Intrinsics.d(this.prizeText, mainDrawMajorScreenModel.prizeText) && Intrinsics.d(this.prizeImage, mainDrawMajorScreenModel.prizeImage) && Intrinsics.d(this.tooltipImage, mainDrawMajorScreenModel.tooltipImage) && Intrinsics.d(this.tooltipText, mainDrawMajorScreenModel.tooltipText) && Intrinsics.d(this.carrotsExchangeRate, mainDrawMajorScreenModel.carrotsExchangeRate) && Intrinsics.d(this.ticketsExchangeRate, mainDrawMajorScreenModel.ticketsExchangeRate) && Intrinsics.d(this.finishButton, mainDrawMajorScreenModel.finishButton) && Intrinsics.d(this.prizeScreenViewEvent, mainDrawMajorScreenModel.prizeScreenViewEvent) && Intrinsics.d(this.onMainDrawMajorScreenClosed, mainDrawMajorScreenModel.onMainDrawMajorScreenClosed);
        }

        @NotNull
        public final MorkovskCurrencyBadgeVO getCarrotsExchangeRate() {
            return this.carrotsExchangeRate;
        }

        @NotNull
        public final MorkovskShadowButtonDTO getFinishButton() {
            return this.finishButton;
        }

        @NotNull
        public final Function0<Unit> getOnMainDrawMajorScreenClosed() {
            return this.onMainDrawMajorScreenClosed;
        }

        @NotNull
        public final String getPrizeImage() {
            return this.prizeImage;
        }

        public final t getPrizeScreenViewEvent() {
            return this.prizeScreenViewEvent;
        }

        @NotNull
        public final String getPrizeText() {
            return this.prizeText;
        }

        @NotNull
        public final MorkovskCurrencyBadgeVO getTicketsExchangeRate() {
            return this.ticketsExchangeRate;
        }

        @NotNull
        public final String getTooltipImage() {
            return this.tooltipImage;
        }

        @NotNull
        public final String getTooltipText() {
            return this.tooltipText;
        }

        public int hashCode() {
            int hashCode = (this.finishButton.hashCode() + ((this.ticketsExchangeRate.hashCode() + ((this.carrotsExchangeRate.hashCode() + g.a(g.a(g.a(this.prizeText.hashCode() * 31, 31, this.prizeImage), 31, this.tooltipImage), 31, this.tooltipText)) * 31)) * 31)) * 31;
            t tVar = this.prizeScreenViewEvent;
            return this.onMainDrawMajorScreenClosed.hashCode() + ((hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.prizeText;
            String str2 = this.prizeImage;
            String str3 = this.tooltipImage;
            String str4 = this.tooltipText;
            MorkovskCurrencyBadgeVO morkovskCurrencyBadgeVO = this.carrotsExchangeRate;
            MorkovskCurrencyBadgeVO morkovskCurrencyBadgeVO2 = this.ticketsExchangeRate;
            MorkovskShadowButtonDTO morkovskShadowButtonDTO = this.finishButton;
            t tVar = this.prizeScreenViewEvent;
            Function0<Unit> function0 = this.onMainDrawMajorScreenClosed;
            StringBuilder d11 = C3660k.d("MainDrawMajorScreenModel(prizeText=", str, ", prizeImage=", str2, ", tooltipImage=");
            a.h(d11, str3, ", tooltipText=", str4, ", carrotsExchangeRate=");
            d11.append(morkovskCurrencyBadgeVO);
            d11.append(", ticketsExchangeRate=");
            d11.append(morkovskCurrencyBadgeVO2);
            d11.append(", finishButton=");
            d11.append(morkovskShadowButtonDTO);
            d11.append(", prizeScreenViewEvent=");
            d11.append(tVar);
            d11.append(", onMainDrawMajorScreenClosed=");
            d11.append(function0);
            d11.append(")");
            return d11.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$SecondBalanceWithToolTipModel;", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel;", "<init>", "()V", "BalanceModel", "ScreenInfoModel", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$SecondBalanceWithToolTipModel$BalanceModel;", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$SecondBalanceWithToolTipModel$ScreenInfoModel;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class SecondBalanceWithToolTipModel extends OnboardingModel {

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$SecondBalanceWithToolTipModel$BalanceModel;", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$SecondBalanceWithToolTipModel;", "Lkotlin/Function0;", "Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "balanceView", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/jvm/functions/Function0;", "getBalanceView", "()Lkotlin/jvm/functions/Function0;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class BalanceModel extends SecondBalanceWithToolTipModel {

            @NotNull
            private final Function0<WeakReference<View>> balanceView;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public BalanceModel(@NotNull Function0<? extends WeakReference<View>> balanceView) {
                super(null);
                Intrinsics.checkNotNullParameter(balanceView, "balanceView");
                this.balanceView = balanceView;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof BalanceModel) && Intrinsics.d(this.balanceView, ((BalanceModel) other).balanceView);
            }

            @NotNull
            public final Function0<WeakReference<View>> getBalanceView() {
                return this.balanceView;
            }

            public int hashCode() {
                return this.balanceView.hashCode();
            }

            @NotNull
            public String toString() {
                return "BalanceModel(balanceView=" + this.balanceView + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0017\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$SecondBalanceWithToolTipModel$ScreenInfoModel;", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$SecondBalanceWithToolTipModel;", "", "tooltipImage", "tooltipText", "actionText", "LWZ/t;", "balanceScreenViewEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTooltipImage", "getTooltipText", "getActionText", "LWZ/t;", "getBalanceScreenViewEvent", "()LWZ/t;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ScreenInfoModel extends SecondBalanceWithToolTipModel {

            @NotNull
            private final String actionText;
            private final t balanceScreenViewEvent;

            @NotNull
            private final String tooltipImage;

            @NotNull
            private final String tooltipText;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ScreenInfoModel(@NotNull String tooltipImage, @NotNull String tooltipText, @NotNull String actionText, t tVar) {
                super(null);
                Intrinsics.checkNotNullParameter(tooltipImage, "tooltipImage");
                Intrinsics.checkNotNullParameter(tooltipText, "tooltipText");
                Intrinsics.checkNotNullParameter(actionText, "actionText");
                this.tooltipImage = tooltipImage;
                this.tooltipText = tooltipText;
                this.actionText = actionText;
                this.balanceScreenViewEvent = tVar;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ScreenInfoModel)) {
                    return false;
                }
                ScreenInfoModel screenInfoModel = (ScreenInfoModel) other;
                return Intrinsics.d(this.tooltipImage, screenInfoModel.tooltipImage) && Intrinsics.d(this.tooltipText, screenInfoModel.tooltipText) && Intrinsics.d(this.actionText, screenInfoModel.actionText) && Intrinsics.d(this.balanceScreenViewEvent, screenInfoModel.balanceScreenViewEvent);
            }

            @NotNull
            public final String getActionText() {
                return this.actionText;
            }

            public final t getBalanceScreenViewEvent() {
                return this.balanceScreenViewEvent;
            }

            @NotNull
            public final String getTooltipImage() {
                return this.tooltipImage;
            }

            @NotNull
            public final String getTooltipText() {
                return this.tooltipText;
            }

            public int hashCode() {
                int a11 = g.a(g.a(this.tooltipImage.hashCode() * 31, 31, this.tooltipText), 31, this.actionText);
                t tVar = this.balanceScreenViewEvent;
                return a11 + (tVar == null ? 0 : tVar.hashCode());
            }

            @NotNull
            public String toString() {
                String str = this.tooltipImage;
                String str2 = this.tooltipText;
                String str3 = this.actionText;
                t tVar = this.balanceScreenViewEvent;
                StringBuilder d11 = C3660k.d("ScreenInfoModel(tooltipImage=", str, ", tooltipText=", str2, ", actionText=");
                d11.append(str3);
                d11.append(", balanceScreenViewEvent=");
                d11.append(tVar);
                d11.append(")");
                return d11.toString();
            }
        }

        public /* synthetic */ SecondBalanceWithToolTipModel(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private SecondBalanceWithToolTipModel() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$ThirdPrizeProgressTooltipModel;", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel;", "<init>", "()V", "PrizeModel", "ProgressModel", "ScreenInfoModel", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$ThirdPrizeProgressTooltipModel$PrizeModel;", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$ThirdPrizeProgressTooltipModel$ProgressModel;", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$ThirdPrizeProgressTooltipModel$ScreenInfoModel;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ThirdPrizeProgressTooltipModel extends OnboardingModel {

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$ThirdPrizeProgressTooltipModel$PrizeModel;", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$ThirdPrizeProgressTooltipModel;", "Lkotlin/Function0;", "Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "prizeView", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/jvm/functions/Function0;", "getPrizeView", "()Lkotlin/jvm/functions/Function0;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PrizeModel extends ThirdPrizeProgressTooltipModel {

            @NotNull
            private final Function0<WeakReference<View>> prizeView;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public PrizeModel(@NotNull Function0<? extends WeakReference<View>> prizeView) {
                super(null);
                Intrinsics.checkNotNullParameter(prizeView, "prizeView");
                this.prizeView = prizeView;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PrizeModel) && Intrinsics.d(this.prizeView, ((PrizeModel) other).prizeView);
            }

            @NotNull
            public final Function0<WeakReference<View>> getPrizeView() {
                return this.prizeView;
            }

            public int hashCode() {
                return this.prizeView.hashCode();
            }

            @NotNull
            public String toString() {
                return "PrizeModel(prizeView=" + this.prizeView + ")";
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$ThirdPrizeProgressTooltipModel$ProgressModel;", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$ThirdPrizeProgressTooltipModel;", "Lkotlin/Function0;", "Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "progressView", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/jvm/functions/Function0;", "getProgressView", "()Lkotlin/jvm/functions/Function0;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ProgressModel extends ThirdPrizeProgressTooltipModel {

            @NotNull
            private final Function0<WeakReference<View>> progressView;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public ProgressModel(@NotNull Function0<? extends WeakReference<View>> progressView) {
                super(null);
                Intrinsics.checkNotNullParameter(progressView, "progressView");
                this.progressView = progressView;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ProgressModel) && Intrinsics.d(this.progressView, ((ProgressModel) other).progressView);
            }

            @NotNull
            public final Function0<WeakReference<View>> getProgressView() {
                return this.progressView;
            }

            public int hashCode() {
                return this.progressView.hashCode();
            }

            @NotNull
            public String toString() {
                return "ProgressModel(progressView=" + this.progressView + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$ThirdPrizeProgressTooltipModel$ScreenInfoModel;", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel$ThirdPrizeProgressTooltipModel;", "", "tooltipImage", "tooltipText", "LWZ/t;", "progressScreenViewEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTooltipImage", "getTooltipText", "LWZ/t;", "getProgressScreenViewEvent", "()LWZ/t;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ScreenInfoModel extends ThirdPrizeProgressTooltipModel {
            private final t progressScreenViewEvent;

            @NotNull
            private final String tooltipImage;

            @NotNull
            private final String tooltipText;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ScreenInfoModel(@NotNull String tooltipImage, @NotNull String tooltipText, t tVar) {
                super(null);
                Intrinsics.checkNotNullParameter(tooltipImage, "tooltipImage");
                Intrinsics.checkNotNullParameter(tooltipText, "tooltipText");
                this.tooltipImage = tooltipImage;
                this.tooltipText = tooltipText;
                this.progressScreenViewEvent = tVar;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ScreenInfoModel)) {
                    return false;
                }
                ScreenInfoModel screenInfoModel = (ScreenInfoModel) other;
                return Intrinsics.d(this.tooltipImage, screenInfoModel.tooltipImage) && Intrinsics.d(this.tooltipText, screenInfoModel.tooltipText) && Intrinsics.d(this.progressScreenViewEvent, screenInfoModel.progressScreenViewEvent);
            }

            public final t getProgressScreenViewEvent() {
                return this.progressScreenViewEvent;
            }

            @NotNull
            public final String getTooltipImage() {
                return this.tooltipImage;
            }

            @NotNull
            public final String getTooltipText() {
                return this.tooltipText;
            }

            public int hashCode() {
                int a11 = g.a(this.tooltipImage.hashCode() * 31, 31, this.tooltipText);
                t tVar = this.progressScreenViewEvent;
                return a11 + (tVar == null ? 0 : tVar.hashCode());
            }

            @NotNull
            public String toString() {
                String str = this.tooltipImage;
                String str2 = this.tooltipText;
                return b.d(C3660k.d("ScreenInfoModel(tooltipImage=", str, ", tooltipText=", str2, ", progressScreenViewEvent="), this.progressScreenViewEvent, ")");
            }
        }

        public /* synthetic */ ThirdPrizeProgressTooltipModel(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ThirdPrizeProgressTooltipModel() {
            super(null);
        }
    }

    public /* synthetic */ OnboardingModel(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OnboardingModel() {
    }
}
