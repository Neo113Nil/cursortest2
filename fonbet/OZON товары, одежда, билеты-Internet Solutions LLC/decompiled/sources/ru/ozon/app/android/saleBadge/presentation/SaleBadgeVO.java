package ru.ozon.app.android.saleBadge.presentation;

import B4.V;
import G.g;
import I0.C3173b;
import N3.C3660k;
import Nh.a;
import Pk0.b;
import WZ.t;
import Z1.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.timerMolecule.presentation.TimerVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001:\u0003HIJB\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b1\u00100R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b2\u0010\u001eR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00109\u001a\u0004\b:\u0010;R\u001f\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010E\u001a\u0004\bF\u0010G¨\u0006K"}, d2 = {"Lru/ozon/app/android/saleBadge/presentation/SaleBadgeVO;", "", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/app/android/timerMolecule/presentation/TimerVO;", DynamicElementDTO.TIMER, "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "leftIcon", "rightIcon", "background", "Lru/ozon/app/android/saleBadge/presentation/SaleBadgeVO$BackgroundOverlay;", "backgroundOverlay", "Lru/ozon/app/android/saleBadge/presentation/SaleBadgeVO$BadgeParams;", "badgeParams", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "", "animationBgProgress", "Lru/ozon/app/android/saleBadge/presentation/SaleBadgeVO$LabelAnimation;", "labelAnimation", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/timerMolecule/presentation/TimerVO;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Ljava/lang/String;Lru/ozon/app/android/saleBadge/presentation/SaleBadgeVO$BackgroundOverlay;Lru/ozon/app/android/saleBadge/presentation/SaleBadgeVO$BadgeParams;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Lru/ozon/uni/atoms/data/TestInfo;Ljava/lang/Float;Lru/ozon/app/android/saleBadge/presentation/SaleBadgeVO$LabelAnimation;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/timerMolecule/presentation/TimerVO;", "getTimer", "()Lru/ozon/app/android/timerMolecule/presentation/TimerVO;", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getLeftIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getRightIcon", "getBackground", "Lru/ozon/app/android/saleBadge/presentation/SaleBadgeVO$BackgroundOverlay;", "getBackgroundOverlay", "()Lru/ozon/app/android/saleBadge/presentation/SaleBadgeVO$BackgroundOverlay;", "Lru/ozon/app/android/saleBadge/presentation/SaleBadgeVO$BadgeParams;", "getBadgeParams", "()Lru/ozon/app/android/saleBadge/presentation/SaleBadgeVO$BadgeParams;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "Ljava/lang/Float;", "getAnimationBgProgress", "()Ljava/lang/Float;", "Lru/ozon/app/android/saleBadge/presentation/SaleBadgeVO$LabelAnimation;", "getLabelAnimation", "()Lru/ozon/app/android/saleBadge/presentation/SaleBadgeVO$LabelAnimation;", "BadgeParams", "BackgroundOverlay", "LabelAnimation", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SaleBadgeVO {
    private final AtomAction action;
    private final Float animationBgProgress;

    @NotNull
    private final String background;
    private final BackgroundOverlay backgroundOverlay;

    @NotNull
    private final BadgeParams badgeParams;

    @NotNull
    private final String id;
    private final LabelAnimation labelAnimation;
    private final CommonAtomIconDTO leftIcon;
    private final CommonAtomIconDTO rightIcon;
    private final TestInfo testInfo;

    @NotNull
    private final TextDTO text;
    private final TimerVO timer;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/saleBadge/presentation/SaleBadgeVO$BackgroundOverlay;", "", "", "color", "darkColor", "", "overlayProgress", "<init>", "(Ljava/lang/String;Ljava/lang/String;F)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getColor", "getDarkColor", "F", "getOverlayProgress", "()F", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BackgroundOverlay {

        @NotNull
        private final String color;

        @NotNull
        private final String darkColor;
        private final float overlayProgress;

        public BackgroundOverlay(@NotNull String color, @NotNull String darkColor, float f7) {
            Intrinsics.checkNotNullParameter(color, "color");
            Intrinsics.checkNotNullParameter(darkColor, "darkColor");
            this.color = color;
            this.darkColor = darkColor;
            this.overlayProgress = f7;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BackgroundOverlay)) {
                return false;
            }
            BackgroundOverlay backgroundOverlay = (BackgroundOverlay) other;
            return Intrinsics.d(this.color, backgroundOverlay.color) && Intrinsics.d(this.darkColor, backgroundOverlay.darkColor) && Float.compare(this.overlayProgress, backgroundOverlay.overlayProgress) == 0;
        }

        @NotNull
        public final String getColor() {
            return this.color;
        }

        @NotNull
        public final String getDarkColor() {
            return this.darkColor;
        }

        public final float getOverlayProgress() {
            return this.overlayProgress;
        }

        public int hashCode() {
            return Float.hashCode(this.overlayProgress) + g.a(this.color.hashCode() * 31, 31, this.darkColor);
        }

        @NotNull
        public String toString() {
            return V.b(this.overlayProgress, ")", C3660k.d("BackgroundOverlay(color=", this.color, ", darkColor=", this.darkColor, ", overlayProgress="));
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018¨\u0006 "}, d2 = {"Lru/ozon/app/android/saleBadge/presentation/SaleBadgeVO$BadgeParams;", "", "LZ1/h;", "height", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadius", "leftPadding", "rightPadding", "leftIconGap", "rightIconGap", "<init>", "(FLru/ozon/uni/atoms/data/common/CornerRadius;FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getHeight-D9Ej5fM", "()F", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getLeftPadding-D9Ej5fM", "getRightPadding-D9Ej5fM", "getLeftIconGap-D9Ej5fM", "getRightIconGap-D9Ej5fM", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BadgeParams {

        @NotNull
        private final CornerRadius cornerRadius;
        private final float height;
        private final float leftIconGap;
        private final float leftPadding;
        private final float rightIconGap;
        private final float rightPadding;

        public /* synthetic */ BadgeParams(float f7, CornerRadius cornerRadius, float f11, float f12, float f13, float f14, DefaultConstructorMarker defaultConstructorMarker) {
            this(f7, cornerRadius, f11, f12, f13, f14);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BadgeParams)) {
                return false;
            }
            BadgeParams badgeParams = (BadgeParams) other;
            return h.b(this.height, badgeParams.height) && this.cornerRadius == badgeParams.cornerRadius && h.b(this.leftPadding, badgeParams.leftPadding) && h.b(this.rightPadding, badgeParams.rightPadding) && h.b(this.leftIconGap, badgeParams.leftIconGap) && h.b(this.rightIconGap, badgeParams.rightIconGap);
        }

        @NotNull
        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        /* renamed from: getHeight-D9Ej5fM, reason: not valid java name and from getter */
        public final float getHeight() {
            return this.height;
        }

        /* renamed from: getLeftIconGap-D9Ej5fM, reason: not valid java name and from getter */
        public final float getLeftIconGap() {
            return this.leftIconGap;
        }

        /* renamed from: getLeftPadding-D9Ej5fM, reason: not valid java name and from getter */
        public final float getLeftPadding() {
            return this.leftPadding;
        }

        /* renamed from: getRightIconGap-D9Ej5fM, reason: not valid java name and from getter */
        public final float getRightIconGap() {
            return this.rightIconGap;
        }

        /* renamed from: getRightPadding-D9Ej5fM, reason: not valid java name and from getter */
        public final float getRightPadding() {
            return this.rightPadding;
        }

        public int hashCode() {
            return Float.hashCode(this.rightIconGap) + b.a(this.leftIconGap, b.a(this.rightPadding, b.a(this.leftPadding, Tl.b.b(this.cornerRadius, Float.hashCode(this.height) * 31, 31), 31), 31), 31);
        }

        @NotNull
        public String toString() {
            String c11 = h.c(this.height);
            CornerRadius cornerRadius = this.cornerRadius;
            String c12 = h.c(this.leftPadding);
            String c13 = h.c(this.rightPadding);
            String c14 = h.c(this.leftIconGap);
            String c15 = h.c(this.rightIconGap);
            StringBuilder sb2 = new StringBuilder("BadgeParams(height=");
            sb2.append(c11);
            sb2.append(", cornerRadius=");
            sb2.append(cornerRadius);
            sb2.append(", leftPadding=");
            a.h(sb2, c12, ", rightPadding=", c13, ", leftIconGap=");
            return C3173b.c(sb2, c14, ", rightIconGap=", c15, ")");
        }

        private BadgeParams(float f7, CornerRadius cornerRadius, float f11, float f12, float f13, float f14) {
            Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
            this.height = f7;
            this.cornerRadius = cornerRadius;
            this.leftPadding = f11;
            this.rightPadding = f12;
            this.leftIconGap = f13;
            this.rightIconGap = f14;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/saleBadge/presentation/SaleBadgeVO$LabelAnimation;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/app/android/timerMolecule/presentation/TimerVO;", DynamicElementDTO.TIMER, "timerForMeasure", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/timerMolecule/presentation/TimerVO;Lru/ozon/app/android/timerMolecule/presentation/TimerVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/timerMolecule/presentation/TimerVO;", "getTimer", "()Lru/ozon/app/android/timerMolecule/presentation/TimerVO;", "getTimerForMeasure", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LabelAnimation {

        @NotNull
        private final TextDTO text;
        private final TimerVO timer;
        private final TimerVO timerForMeasure;

        public LabelAnimation(@NotNull TextDTO text, TimerVO timerVO, TimerVO timerVO2) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.timer = timerVO;
            this.timerForMeasure = timerVO2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LabelAnimation)) {
                return false;
            }
            LabelAnimation labelAnimation = (LabelAnimation) other;
            return Intrinsics.d(this.text, labelAnimation.text) && Intrinsics.d(this.timer, labelAnimation.timer) && Intrinsics.d(this.timerForMeasure, labelAnimation.timerForMeasure);
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public final TimerVO getTimer() {
            return this.timer;
        }

        public final TimerVO getTimerForMeasure() {
            return this.timerForMeasure;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            TimerVO timerVO = this.timer;
            int hashCode2 = (hashCode + (timerVO == null ? 0 : timerVO.hashCode())) * 31;
            TimerVO timerVO2 = this.timerForMeasure;
            return hashCode2 + (timerVO2 != null ? timerVO2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "LabelAnimation(text=" + this.text + ", timer=" + this.timer + ", timerForMeasure=" + this.timerForMeasure + ")";
        }
    }

    public SaleBadgeVO(@NotNull String id2, @NotNull TextDTO text, TimerVO timerVO, CommonAtomIconDTO commonAtomIconDTO, CommonAtomIconDTO commonAtomIconDTO2, @NotNull String background, BackgroundOverlay backgroundOverlay, @NotNull BadgeParams badgeParams, AtomAction atomAction, t tVar, TestInfo testInfo, Float f7, LabelAnimation labelAnimation) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(badgeParams, "badgeParams");
        this.id = id2;
        this.text = text;
        this.timer = timerVO;
        this.leftIcon = commonAtomIconDTO;
        this.rightIcon = commonAtomIconDTO2;
        this.background = background;
        this.backgroundOverlay = backgroundOverlay;
        this.badgeParams = badgeParams;
        this.action = atomAction;
        this.tokenizedEvent = tVar;
        this.testInfo = testInfo;
        this.animationBgProgress = f7;
        this.labelAnimation = labelAnimation;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SaleBadgeVO)) {
            return false;
        }
        SaleBadgeVO saleBadgeVO = (SaleBadgeVO) other;
        return Intrinsics.d(this.id, saleBadgeVO.id) && Intrinsics.d(this.text, saleBadgeVO.text) && Intrinsics.d(this.timer, saleBadgeVO.timer) && Intrinsics.d(this.leftIcon, saleBadgeVO.leftIcon) && Intrinsics.d(this.rightIcon, saleBadgeVO.rightIcon) && Intrinsics.d(this.background, saleBadgeVO.background) && Intrinsics.d(this.backgroundOverlay, saleBadgeVO.backgroundOverlay) && Intrinsics.d(this.badgeParams, saleBadgeVO.badgeParams) && Intrinsics.d(this.action, saleBadgeVO.action) && Intrinsics.d(this.tokenizedEvent, saleBadgeVO.tokenizedEvent) && Intrinsics.d(this.testInfo, saleBadgeVO.testInfo) && Intrinsics.d(this.animationBgProgress, saleBadgeVO.animationBgProgress) && Intrinsics.d(this.labelAnimation, saleBadgeVO.labelAnimation);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final Float getAnimationBgProgress() {
        return this.animationBgProgress;
    }

    @NotNull
    public final String getBackground() {
        return this.background;
    }

    public final BackgroundOverlay getBackgroundOverlay() {
        return this.backgroundOverlay;
    }

    @NotNull
    public final BadgeParams getBadgeParams() {
        return this.badgeParams;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final LabelAnimation getLabelAnimation() {
        return this.labelAnimation;
    }

    public final CommonAtomIconDTO getLeftIcon() {
        return this.leftIcon;
    }

    public final CommonAtomIconDTO getRightIcon() {
        return this.rightIcon;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final TextDTO getText() {
        return this.text;
    }

    public final TimerVO getTimer() {
        return this.timer;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public int hashCode() {
        int a11 = Ns.b.a(this.text, this.id.hashCode() * 31, 31);
        TimerVO timerVO = this.timer;
        int hashCode = (a11 + (timerVO == null ? 0 : timerVO.hashCode())) * 31;
        CommonAtomIconDTO commonAtomIconDTO = this.leftIcon;
        int hashCode2 = (hashCode + (commonAtomIconDTO == null ? 0 : commonAtomIconDTO.hashCode())) * 31;
        CommonAtomIconDTO commonAtomIconDTO2 = this.rightIcon;
        int a12 = g.a((hashCode2 + (commonAtomIconDTO2 == null ? 0 : commonAtomIconDTO2.hashCode())) * 31, 31, this.background);
        BackgroundOverlay backgroundOverlay = this.backgroundOverlay;
        int hashCode3 = (this.badgeParams.hashCode() + ((a12 + (backgroundOverlay == null ? 0 : backgroundOverlay.hashCode())) * 31)) * 31;
        AtomAction atomAction = this.action;
        int hashCode4 = (hashCode3 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode5 = (hashCode4 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode6 = (hashCode5 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Float f7 = this.animationBgProgress;
        int hashCode7 = (hashCode6 + (f7 == null ? 0 : f7.hashCode())) * 31;
        LabelAnimation labelAnimation = this.labelAnimation;
        return hashCode7 + (labelAnimation != null ? labelAnimation.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        TextDTO textDTO = this.text;
        TimerVO timerVO = this.timer;
        CommonAtomIconDTO commonAtomIconDTO = this.leftIcon;
        CommonAtomIconDTO commonAtomIconDTO2 = this.rightIcon;
        String str2 = this.background;
        BackgroundOverlay backgroundOverlay = this.backgroundOverlay;
        BadgeParams badgeParams = this.badgeParams;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        TestInfo testInfo = this.testInfo;
        Float f7 = this.animationBgProgress;
        LabelAnimation labelAnimation = this.labelAnimation;
        StringBuilder b11 = Co.a.b("SaleBadgeVO(id=", textDTO, str, ", text=", ", timer=");
        b11.append(timerVO);
        b11.append(", leftIcon=");
        b11.append(commonAtomIconDTO);
        b11.append(", rightIcon=");
        b11.append(commonAtomIconDTO2);
        b11.append(", background=");
        b11.append(str2);
        b11.append(", backgroundOverlay=");
        b11.append(backgroundOverlay);
        b11.append(", badgeParams=");
        b11.append(badgeParams);
        b11.append(", action=");
        b11.append(atomAction);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(", testInfo=");
        b11.append(testInfo);
        b11.append(", animationBgProgress=");
        b11.append(f7);
        b11.append(", labelAnimation=");
        b11.append(labelAnimation);
        b11.append(")");
        return b11.toString();
    }
}
