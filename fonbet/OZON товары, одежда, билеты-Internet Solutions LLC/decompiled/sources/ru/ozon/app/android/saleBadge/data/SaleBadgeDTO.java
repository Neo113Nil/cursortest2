package ru.ozon.app.android.saleBadge.data;

import B0.A0;
import G.g;
import K00.b;
import N3.C3660k;
import Pk0.h;
import T7.E;
import Xc.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u00069:;<=>Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010+\u001a\u00020\bHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010.\u001a\u00020\rHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0013HÆ\u0003Jy\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006?"}, d2 = {"Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO;", "", "text", "", "textColor", DynamicElementDTO.TIMER, "Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO$Timer;", "size", "Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO$BadgeSize;", "leftIcon", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "rightIcon", "background", "Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO$Background;", "backgroundOverlay", "Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO$BackgroundOverlay;", "common", "Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO$Common;", "animationFrames", "Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO$AnimationFrames;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO$Timer;Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO$BadgeSize;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO$Background;Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO$BackgroundOverlay;Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO$Common;Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO$AnimationFrames;)V", "getText", "()Ljava/lang/String;", "getTextColor", "getTimer", "()Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO$Timer;", "getSize", "()Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO$BadgeSize;", "getLeftIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getRightIcon", "getBackground", "()Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO$Background;", "getBackgroundOverlay", "()Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO$BackgroundOverlay;", "getCommon", "()Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO$Common;", "getAnimationFrames", "()Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO$AnimationFrames;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "Timer", "Background", "BackgroundOverlay", "Common", "AnimationFrames", "BadgeSize", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SaleBadgeDTO {
    public static final int $stable = 8;
    private final AnimationFrames animationFrames;

    @NotNull
    private final Background background;
    private final BackgroundOverlay backgroundOverlay;
    private final Common common;
    private final CommonAtomIconDTO leftIcon;
    private final CommonAtomIconDTO rightIcon;

    @NotNull
    private final BadgeSize size;

    @NotNull
    private final String text;

    @NotNull
    private final String textColor;
    private final Timer timer;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO$AnimationFrames;", "", "animationBGFrame", "Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO$AnimationFrames$BGOverlayFrame;", "animationLabelFrame", "Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO$AnimationFrames$LabelFrame;", "<init>", "(Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO$AnimationFrames$BGOverlayFrame;Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO$AnimationFrames$LabelFrame;)V", "getAnimationBGFrame", "()Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO$AnimationFrames$BGOverlayFrame;", "getAnimationLabelFrame", "()Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO$AnimationFrames$LabelFrame;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "BGOverlayFrame", "LabelFrame", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class AnimationFrames {
        public static final int $stable = 8;
        private final BGOverlayFrame animationBGFrame;
        private final LabelFrame animationLabelFrame;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO$AnimationFrames$BGOverlayFrame;", "", "overlayProgress", "", "<init>", "(I)V", "getOverlayProgress", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class BGOverlayFrame {
            public static final int $stable = 0;
            private final int overlayProgress;

            public BGOverlayFrame(int i11) {
                this.overlayProgress = i11;
            }

            public static /* synthetic */ BGOverlayFrame copy$default(BGOverlayFrame bGOverlayFrame, int i11, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    i11 = bGOverlayFrame.overlayProgress;
                }
                return bGOverlayFrame.copy(i11);
            }

            /* renamed from: component1, reason: from getter */
            public final int getOverlayProgress() {
                return this.overlayProgress;
            }

            @NotNull
            public final BGOverlayFrame copy(int overlayProgress) {
                return new BGOverlayFrame(overlayProgress);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof BGOverlayFrame) && this.overlayProgress == ((BGOverlayFrame) other).overlayProgress;
            }

            public final int getOverlayProgress() {
                return this.overlayProgress;
            }

            public int hashCode() {
                return Integer.hashCode(this.overlayProgress);
            }

            @NotNull
            public String toString() {
                return E.a(this.overlayProgress, "BGOverlayFrame(overlayProgress=", ")");
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO$AnimationFrames$LabelFrame;", "", "text", "", DynamicElementDTO.TIMER, "Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO$Timer;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO$Timer;)V", "getText", "()Ljava/lang/String;", "getTimer", "()Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO$Timer;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class LabelFrame {
            public static final int $stable = 8;

            @NotNull
            private final String text;
            private final Timer timer;

            public LabelFrame(@NotNull String text, Timer timer) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
                this.timer = timer;
            }

            public static /* synthetic */ LabelFrame copy$default(LabelFrame labelFrame, String str, Timer timer, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = labelFrame.text;
                }
                if ((i11 & 2) != 0) {
                    timer = labelFrame.timer;
                }
                return labelFrame.copy(str, timer);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getText() {
                return this.text;
            }

            /* renamed from: component2, reason: from getter */
            public final Timer getTimer() {
                return this.timer;
            }

            @NotNull
            public final LabelFrame copy(@NotNull String text, Timer timer) {
                Intrinsics.checkNotNullParameter(text, "text");
                return new LabelFrame(text, timer);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LabelFrame)) {
                    return false;
                }
                LabelFrame labelFrame = (LabelFrame) other;
                return Intrinsics.d(this.text, labelFrame.text) && Intrinsics.d(this.timer, labelFrame.timer);
            }

            @NotNull
            public final String getText() {
                return this.text;
            }

            public final Timer getTimer() {
                return this.timer;
            }

            public int hashCode() {
                int hashCode = this.text.hashCode() * 31;
                Timer timer = this.timer;
                return hashCode + (timer == null ? 0 : timer.hashCode());
            }

            @NotNull
            public String toString() {
                return "LabelFrame(text=" + this.text + ", timer=" + this.timer + ")";
            }
        }

        public AnimationFrames(BGOverlayFrame bGOverlayFrame, LabelFrame labelFrame) {
            this.animationBGFrame = bGOverlayFrame;
            this.animationLabelFrame = labelFrame;
        }

        public static /* synthetic */ AnimationFrames copy$default(AnimationFrames animationFrames, BGOverlayFrame bGOverlayFrame, LabelFrame labelFrame, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bGOverlayFrame = animationFrames.animationBGFrame;
            }
            if ((i11 & 2) != 0) {
                labelFrame = animationFrames.animationLabelFrame;
            }
            return animationFrames.copy(bGOverlayFrame, labelFrame);
        }

        /* renamed from: component1, reason: from getter */
        public final BGOverlayFrame getAnimationBGFrame() {
            return this.animationBGFrame;
        }

        /* renamed from: component2, reason: from getter */
        public final LabelFrame getAnimationLabelFrame() {
            return this.animationLabelFrame;
        }

        @NotNull
        public final AnimationFrames copy(BGOverlayFrame animationBGFrame, LabelFrame animationLabelFrame) {
            return new AnimationFrames(animationBGFrame, animationLabelFrame);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AnimationFrames)) {
                return false;
            }
            AnimationFrames animationFrames = (AnimationFrames) other;
            return Intrinsics.d(this.animationBGFrame, animationFrames.animationBGFrame) && Intrinsics.d(this.animationLabelFrame, animationFrames.animationLabelFrame);
        }

        public final BGOverlayFrame getAnimationBGFrame() {
            return this.animationBGFrame;
        }

        public final LabelFrame getAnimationLabelFrame() {
            return this.animationLabelFrame;
        }

        public int hashCode() {
            BGOverlayFrame bGOverlayFrame = this.animationBGFrame;
            int hashCode = (bGOverlayFrame == null ? 0 : bGOverlayFrame.hashCode()) * 31;
            LabelFrame labelFrame = this.animationLabelFrame;
            return hashCode + (labelFrame != null ? labelFrame.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "AnimationFrames(animationBGFrame=" + this.animationBGFrame + ", animationLabelFrame=" + this.animationLabelFrame + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO$Background;", "", "color", "", "<init>", "(Ljava/lang/String;)V", "getColor", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Background {
        public static final int $stable = 0;

        @NotNull
        private final String color;

        public Background(@NotNull String color) {
            Intrinsics.checkNotNullParameter(color, "color");
            this.color = color;
        }

        public static /* synthetic */ Background copy$default(Background background, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = background.color;
            }
            return background.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        @NotNull
        public final Background copy(@NotNull String color) {
            Intrinsics.checkNotNullParameter(color, "color");
            return new Background(color);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Background) && Intrinsics.d(this.color, ((Background) other).color);
        }

        @NotNull
        public final String getColor() {
            return this.color;
        }

        public int hashCode() {
            return this.color.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("Background(color=", this.color, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO$BackgroundOverlay;", "", "color", "", "darkColor", "overlayProgress", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getColor", "()Ljava/lang/String;", "getDarkColor", "getOverlayProgress", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BackgroundOverlay {
        public static final int $stable = 0;

        @NotNull
        private final String color;
        private final String darkColor;
        private final int overlayProgress;

        public BackgroundOverlay(@NotNull String color, String str, int i11) {
            Intrinsics.checkNotNullParameter(color, "color");
            this.color = color;
            this.darkColor = str;
            this.overlayProgress = i11;
        }

        public static /* synthetic */ BackgroundOverlay copy$default(BackgroundOverlay backgroundOverlay, String str, String str2, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = backgroundOverlay.color;
            }
            if ((i12 & 2) != 0) {
                str2 = backgroundOverlay.darkColor;
            }
            if ((i12 & 4) != 0) {
                i11 = backgroundOverlay.overlayProgress;
            }
            return backgroundOverlay.copy(str, str2, i11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDarkColor() {
            return this.darkColor;
        }

        /* renamed from: component3, reason: from getter */
        public final int getOverlayProgress() {
            return this.overlayProgress;
        }

        @NotNull
        public final BackgroundOverlay copy(@NotNull String color, String darkColor, int overlayProgress) {
            Intrinsics.checkNotNullParameter(color, "color");
            return new BackgroundOverlay(color, darkColor, overlayProgress);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BackgroundOverlay)) {
                return false;
            }
            BackgroundOverlay backgroundOverlay = (BackgroundOverlay) other;
            return Intrinsics.d(this.color, backgroundOverlay.color) && Intrinsics.d(this.darkColor, backgroundOverlay.darkColor) && this.overlayProgress == backgroundOverlay.overlayProgress;
        }

        @NotNull
        public final String getColor() {
            return this.color;
        }

        public final String getDarkColor() {
            return this.darkColor;
        }

        public final int getOverlayProgress() {
            return this.overlayProgress;
        }

        public int hashCode() {
            int hashCode = this.color.hashCode() * 31;
            String str = this.darkColor;
            return Integer.hashCode(this.overlayProgress) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            return b.e(this.overlayProgress, ")", C3660k.d("BackgroundOverlay(color=", this.color, ", darkColor=", this.darkColor, ", overlayProgress="));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO$BadgeSize;", "", "<init>", "(Ljava/lang/String;I)V", "SIZE_INVALID", "SIZE_400", "SIZE_500", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BadgeSize {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ BadgeSize[] $VALUES;
        public static final BadgeSize SIZE_INVALID = new BadgeSize("SIZE_INVALID", 0);
        public static final BadgeSize SIZE_400 = new BadgeSize("SIZE_400", 1);
        public static final BadgeSize SIZE_500 = new BadgeSize("SIZE_500", 2);

        private static final /* synthetic */ BadgeSize[] $values() {
            return new BadgeSize[]{SIZE_INVALID, SIZE_400, SIZE_500};
        }

        static {
            BadgeSize[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private BadgeSize(String str, int i11) {
        }

        public static BadgeSize valueOf(String str) {
            return (BadgeSize) Enum.valueOf(BadgeSize.class, str);
        }

        public static BadgeSize[] values() {
            return (BadgeSize[]) $VALUES.clone();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO$Common;", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Common {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final TestInfo testInfo;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public Common(AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
            this.action = atomActionDTO;
            this.trackingInfo = map;
            this.testInfo = testInfo;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Common copy$default(Common common, AtomActionDTO atomActionDTO, Map map, TestInfo testInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                atomActionDTO = common.action;
            }
            if ((i11 & 2) != 0) {
                map = common.trackingInfo;
            }
            if ((i11 & 4) != 0) {
                testInfo = common.testInfo;
            }
            return common.copy(atomActionDTO, map, testInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component2() {
            return this.trackingInfo;
        }

        /* renamed from: component3, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final Common copy(AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
            return new Common(action, trackingInfo, testInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Common)) {
                return false;
            }
            Common common = (Common) other;
            return Intrinsics.d(this.action, common.action) && Intrinsics.d(this.trackingInfo, common.trackingInfo) && Intrinsics.d(this.testInfo, common.testInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            AtomActionDTO atomActionDTO = this.action;
            int hashCode = (atomActionDTO == null ? 0 : atomActionDTO.hashCode()) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            return hashCode2 + (testInfo != null ? testInfo.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            TestInfo testInfo = this.testInfo;
            StringBuilder sb2 = new StringBuilder("Common(action=");
            sb2.append(atomActionDTO);
            sb2.append(", trackingInfo=");
            sb2.append(map);
            sb2.append(", testInfo=");
            return h.c(sb2, testInfo, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO$Timer;", "", "serverTimestamp", "Lorg/joda/time/DateTime;", "dateEnd", "<init>", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "getServerTimestamp", "()Lorg/joda/time/DateTime;", "getDateEnd", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Timer {
        public static final int $stable = 8;

        @NotNull
        private final DateTime dateEnd;

        @NotNull
        private final DateTime serverTimestamp;

        public Timer(@NotNull DateTime serverTimestamp, @NotNull DateTime dateEnd) {
            Intrinsics.checkNotNullParameter(serverTimestamp, "serverTimestamp");
            Intrinsics.checkNotNullParameter(dateEnd, "dateEnd");
            this.serverTimestamp = serverTimestamp;
            this.dateEnd = dateEnd;
        }

        public static /* synthetic */ Timer copy$default(Timer timer, DateTime dateTime, DateTime dateTime2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                dateTime = timer.serverTimestamp;
            }
            if ((i11 & 2) != 0) {
                dateTime2 = timer.dateEnd;
            }
            return timer.copy(dateTime, dateTime2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final DateTime getServerTimestamp() {
            return this.serverTimestamp;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final DateTime getDateEnd() {
            return this.dateEnd;
        }

        @NotNull
        public final Timer copy(@NotNull DateTime serverTimestamp, @NotNull DateTime dateEnd) {
            Intrinsics.checkNotNullParameter(serverTimestamp, "serverTimestamp");
            Intrinsics.checkNotNullParameter(dateEnd, "dateEnd");
            return new Timer(serverTimestamp, dateEnd);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Timer)) {
                return false;
            }
            Timer timer = (Timer) other;
            return Intrinsics.d(this.serverTimestamp, timer.serverTimestamp) && Intrinsics.d(this.dateEnd, timer.dateEnd);
        }

        @NotNull
        public final DateTime getDateEnd() {
            return this.dateEnd;
        }

        @NotNull
        public final DateTime getServerTimestamp() {
            return this.serverTimestamp;
        }

        public int hashCode() {
            return this.dateEnd.hashCode() + (this.serverTimestamp.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Timer(serverTimestamp=" + this.serverTimestamp + ", dateEnd=" + this.dateEnd + ")";
        }
    }

    public SaleBadgeDTO(@NotNull String text, @NotNull String textColor, Timer timer, @NotNull BadgeSize size, CommonAtomIconDTO commonAtomIconDTO, CommonAtomIconDTO commonAtomIconDTO2, @NotNull Background background, BackgroundOverlay backgroundOverlay, Common common, AnimationFrames animationFrames) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(background, "background");
        this.text = text;
        this.textColor = textColor;
        this.timer = timer;
        this.size = size;
        this.leftIcon = commonAtomIconDTO;
        this.rightIcon = commonAtomIconDTO2;
        this.background = background;
        this.backgroundOverlay = backgroundOverlay;
        this.common = common;
        this.animationFrames = animationFrames;
    }

    public static /* synthetic */ SaleBadgeDTO copy$default(SaleBadgeDTO saleBadgeDTO, String str, String str2, Timer timer, BadgeSize badgeSize, CommonAtomIconDTO commonAtomIconDTO, CommonAtomIconDTO commonAtomIconDTO2, Background background, BackgroundOverlay backgroundOverlay, Common common, AnimationFrames animationFrames, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = saleBadgeDTO.text;
        }
        if ((i11 & 2) != 0) {
            str2 = saleBadgeDTO.textColor;
        }
        if ((i11 & 4) != 0) {
            timer = saleBadgeDTO.timer;
        }
        if ((i11 & 8) != 0) {
            badgeSize = saleBadgeDTO.size;
        }
        if ((i11 & 16) != 0) {
            commonAtomIconDTO = saleBadgeDTO.leftIcon;
        }
        if ((i11 & 32) != 0) {
            commonAtomIconDTO2 = saleBadgeDTO.rightIcon;
        }
        if ((i11 & 64) != 0) {
            background = saleBadgeDTO.background;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            backgroundOverlay = saleBadgeDTO.backgroundOverlay;
        }
        if ((i11 & 256) != 0) {
            common = saleBadgeDTO.common;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            animationFrames = saleBadgeDTO.animationFrames;
        }
        Common common2 = common;
        AnimationFrames animationFrames2 = animationFrames;
        Background background2 = background;
        BackgroundOverlay backgroundOverlay2 = backgroundOverlay;
        CommonAtomIconDTO commonAtomIconDTO3 = commonAtomIconDTO;
        CommonAtomIconDTO commonAtomIconDTO4 = commonAtomIconDTO2;
        return saleBadgeDTO.copy(str, str2, timer, badgeSize, commonAtomIconDTO3, commonAtomIconDTO4, background2, backgroundOverlay2, common2, animationFrames2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component10, reason: from getter */
    public final AnimationFrames getAnimationFrames() {
        return this.animationFrames;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    /* renamed from: component3, reason: from getter */
    public final Timer getTimer() {
        return this.timer;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final BadgeSize getSize() {
        return this.size;
    }

    /* renamed from: component5, reason: from getter */
    public final CommonAtomIconDTO getLeftIcon() {
        return this.leftIcon;
    }

    /* renamed from: component6, reason: from getter */
    public final CommonAtomIconDTO getRightIcon() {
        return this.rightIcon;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final Background getBackground() {
        return this.background;
    }

    /* renamed from: component8, reason: from getter */
    public final BackgroundOverlay getBackgroundOverlay() {
        return this.backgroundOverlay;
    }

    /* renamed from: component9, reason: from getter */
    public final Common getCommon() {
        return this.common;
    }

    @NotNull
    public final SaleBadgeDTO copy(@NotNull String text, @NotNull String textColor, Timer timer, @NotNull BadgeSize size, CommonAtomIconDTO leftIcon, CommonAtomIconDTO rightIcon, @NotNull Background background, BackgroundOverlay backgroundOverlay, Common common, AnimationFrames animationFrames) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(background, "background");
        return new SaleBadgeDTO(text, textColor, timer, size, leftIcon, rightIcon, background, backgroundOverlay, common, animationFrames);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SaleBadgeDTO)) {
            return false;
        }
        SaleBadgeDTO saleBadgeDTO = (SaleBadgeDTO) other;
        return Intrinsics.d(this.text, saleBadgeDTO.text) && Intrinsics.d(this.textColor, saleBadgeDTO.textColor) && Intrinsics.d(this.timer, saleBadgeDTO.timer) && this.size == saleBadgeDTO.size && Intrinsics.d(this.leftIcon, saleBadgeDTO.leftIcon) && Intrinsics.d(this.rightIcon, saleBadgeDTO.rightIcon) && Intrinsics.d(this.background, saleBadgeDTO.background) && Intrinsics.d(this.backgroundOverlay, saleBadgeDTO.backgroundOverlay) && Intrinsics.d(this.common, saleBadgeDTO.common) && Intrinsics.d(this.animationFrames, saleBadgeDTO.animationFrames);
    }

    public final AnimationFrames getAnimationFrames() {
        return this.animationFrames;
    }

    @NotNull
    public final Background getBackground() {
        return this.background;
    }

    public final BackgroundOverlay getBackgroundOverlay() {
        return this.backgroundOverlay;
    }

    public final Common getCommon() {
        return this.common;
    }

    public final CommonAtomIconDTO getLeftIcon() {
        return this.leftIcon;
    }

    public final CommonAtomIconDTO getRightIcon() {
        return this.rightIcon;
    }

    @NotNull
    public final BadgeSize getSize() {
        return this.size;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final String getTextColor() {
        return this.textColor;
    }

    public final Timer getTimer() {
        return this.timer;
    }

    public int hashCode() {
        int a11 = g.a(this.text.hashCode() * 31, 31, this.textColor);
        Timer timer = this.timer;
        int hashCode = (this.size.hashCode() + ((a11 + (timer == null ? 0 : timer.hashCode())) * 31)) * 31;
        CommonAtomIconDTO commonAtomIconDTO = this.leftIcon;
        int hashCode2 = (hashCode + (commonAtomIconDTO == null ? 0 : commonAtomIconDTO.hashCode())) * 31;
        CommonAtomIconDTO commonAtomIconDTO2 = this.rightIcon;
        int hashCode3 = (this.background.hashCode() + ((hashCode2 + (commonAtomIconDTO2 == null ? 0 : commonAtomIconDTO2.hashCode())) * 31)) * 31;
        BackgroundOverlay backgroundOverlay = this.backgroundOverlay;
        int hashCode4 = (hashCode3 + (backgroundOverlay == null ? 0 : backgroundOverlay.hashCode())) * 31;
        Common common = this.common;
        int hashCode5 = (hashCode4 + (common == null ? 0 : common.hashCode())) * 31;
        AnimationFrames animationFrames = this.animationFrames;
        return hashCode5 + (animationFrames != null ? animationFrames.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.text;
        String str2 = this.textColor;
        Timer timer = this.timer;
        BadgeSize badgeSize = this.size;
        CommonAtomIconDTO commonAtomIconDTO = this.leftIcon;
        CommonAtomIconDTO commonAtomIconDTO2 = this.rightIcon;
        Background background = this.background;
        BackgroundOverlay backgroundOverlay = this.backgroundOverlay;
        Common common = this.common;
        AnimationFrames animationFrames = this.animationFrames;
        StringBuilder d11 = C3660k.d("SaleBadgeDTO(text=", str, ", textColor=", str2, ", timer=");
        d11.append(timer);
        d11.append(", size=");
        d11.append(badgeSize);
        d11.append(", leftIcon=");
        d11.append(commonAtomIconDTO);
        d11.append(", rightIcon=");
        d11.append(commonAtomIconDTO2);
        d11.append(", background=");
        d11.append(background);
        d11.append(", backgroundOverlay=");
        d11.append(backgroundOverlay);
        d11.append(", common=");
        d11.append(common);
        d11.append(", animationFrames=");
        d11.append(animationFrames);
        d11.append(")");
        return d11.toString();
    }

    public /* synthetic */ SaleBadgeDTO(String str, String str2, Timer timer, BadgeSize badgeSize, CommonAtomIconDTO commonAtomIconDTO, CommonAtomIconDTO commonAtomIconDTO2, Background background, BackgroundOverlay backgroundOverlay, Common common, AnimationFrames animationFrames, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, timer, (i11 & 8) != 0 ? BadgeSize.SIZE_500 : badgeSize, commonAtomIconDTO, commonAtomIconDTO2, background, backgroundOverlay, common, animationFrames);
    }
}
