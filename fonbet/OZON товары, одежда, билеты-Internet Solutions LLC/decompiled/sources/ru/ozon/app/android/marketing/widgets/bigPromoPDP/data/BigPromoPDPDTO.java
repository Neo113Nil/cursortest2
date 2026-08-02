package ru.ozon.app.android.marketing.widgets.bigPromoPDP.data;

import C.o0;
import D40.d;
import Ep.a;
import F3.G;
import G.g;
import Kk.c;
import Tl.b;
import Ul.C4070a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0003DEFB\u0089\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0007HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0017\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017HÆ\u0003J£\u0001\u0010=\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017HÆ\u0001J\u0013\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020BHÖ\u0001J\t\u0010C\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u001f\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b/\u00100¨\u0006G"}, d2 = {"Lru/ozon/app/android/marketing/widgets/bigPromoPDP/data/BigPromoPDPDTO;", "", "logo", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "counter", "Lru/ozon/app/android/marketing/widgets/bigPromoPDP/data/BigPromoPDPDTO$AnimatedCounterDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "stockText", "stockNumber", "chevronIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "rightButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "timerBadge", "Lru/ozon/app/android/marketing/widgets/bigPromoPDP/data/BigPromoPDPDTO$TimerBadgeDTO;", "paddings", "Lru/ozon/app/android/marketing/widgets/bigPromoPDP/data/BigPromoPDPDTO$PaddingsDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "widgetBackgroundColor", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/app/android/marketing/widgets/bigPromoPDP/data/BigPromoPDPDTO$AnimatedCounterDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/marketing/widgets/bigPromoPDP/data/BigPromoPDPDTO$TimerBadgeDTO;Lru/ozon/app/android/marketing/widgets/bigPromoPDP/data/BigPromoPDPDTO$PaddingsDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Ljava/util/Map;)V", "getLogo", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getCounter", "()Lru/ozon/app/android/marketing/widgets/bigPromoPDP/data/BigPromoPDPDTO$AnimatedCounterDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getStockText", "getStockNumber", "getChevronIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getRightButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getTimerBadge", "()Lru/ozon/app/android/marketing/widgets/bigPromoPDP/data/BigPromoPDPDTO$TimerBadgeDTO;", "getPaddings", "()Lru/ozon/app/android/marketing/widgets/bigPromoPDP/data/BigPromoPDPDTO$PaddingsDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getWidgetBackgroundColor", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "", "toString", "TimerBadgeDTO", "PaddingsDTO", "AnimatedCounterDTO", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BigPromoPDPDTO {
    public static final int $stable = 8;
    private final AtomActionDTO action;
    private final IconDTO chevronIcon;
    private final AnimatedCounterDTO counter;
    private final ImageDTO logo;
    private final PaddingsDTO paddings;
    private final ButtonV3DTO rightButton;
    private final TextDTO stockNumber;
    private final TextDTO stockText;
    private final TimerBadgeDTO timerBadge;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final String widgetBackgroundColor;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/marketing/widgets/bigPromoPDP/data/BigPromoPDPDTO$AnimatedCounterDTO;", "", "percentage", "", "circleAccentColor", "", "circleBackgroundColor", "<init>", "(FLjava/lang/String;Ljava/lang/String;)V", "getPercentage", "()F", "getCircleAccentColor", "()Ljava/lang/String;", "getCircleBackgroundColor", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AnimatedCounterDTO {
        public static final int $stable = 0;

        @NotNull
        private final String circleAccentColor;

        @NotNull
        private final String circleBackgroundColor;
        private final float percentage;

        public AnimatedCounterDTO(float f7, @NotNull String circleAccentColor, @NotNull String circleBackgroundColor) {
            Intrinsics.checkNotNullParameter(circleAccentColor, "circleAccentColor");
            Intrinsics.checkNotNullParameter(circleBackgroundColor, "circleBackgroundColor");
            this.percentage = f7;
            this.circleAccentColor = circleAccentColor;
            this.circleBackgroundColor = circleBackgroundColor;
        }

        public static /* synthetic */ AnimatedCounterDTO copy$default(AnimatedCounterDTO animatedCounterDTO, float f7, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f7 = animatedCounterDTO.percentage;
            }
            if ((i11 & 2) != 0) {
                str = animatedCounterDTO.circleAccentColor;
            }
            if ((i11 & 4) != 0) {
                str2 = animatedCounterDTO.circleBackgroundColor;
            }
            return animatedCounterDTO.copy(f7, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final float getPercentage() {
            return this.percentage;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getCircleAccentColor() {
            return this.circleAccentColor;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getCircleBackgroundColor() {
            return this.circleBackgroundColor;
        }

        @NotNull
        public final AnimatedCounterDTO copy(float percentage, @NotNull String circleAccentColor, @NotNull String circleBackgroundColor) {
            Intrinsics.checkNotNullParameter(circleAccentColor, "circleAccentColor");
            Intrinsics.checkNotNullParameter(circleBackgroundColor, "circleBackgroundColor");
            return new AnimatedCounterDTO(percentage, circleAccentColor, circleBackgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AnimatedCounterDTO)) {
                return false;
            }
            AnimatedCounterDTO animatedCounterDTO = (AnimatedCounterDTO) other;
            return Float.compare(this.percentage, animatedCounterDTO.percentage) == 0 && Intrinsics.d(this.circleAccentColor, animatedCounterDTO.circleAccentColor) && Intrinsics.d(this.circleBackgroundColor, animatedCounterDTO.circleBackgroundColor);
        }

        @NotNull
        public final String getCircleAccentColor() {
            return this.circleAccentColor;
        }

        @NotNull
        public final String getCircleBackgroundColor() {
            return this.circleBackgroundColor;
        }

        public final float getPercentage() {
            return this.percentage;
        }

        public int hashCode() {
            return this.circleBackgroundColor.hashCode() + g.a(Float.hashCode(this.percentage) * 31, 31, this.circleAccentColor);
        }

        @NotNull
        public String toString() {
            float f7 = this.percentage;
            String str = this.circleAccentColor;
            String str2 = this.circleBackgroundColor;
            StringBuilder sb2 = new StringBuilder("AnimatedCounterDTO(percentage=");
            sb2.append(f7);
            sb2.append(", circleAccentColor=");
            sb2.append(str);
            sb2.append(", circleBackgroundColor=");
            return o0.c(sb2, str2, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/marketing/widgets/bigPromoPDP/data/BigPromoPDPDTO$PaddingsDTO;", "", "topPadding", "", "bottomPadding", "titleStartPadding", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getTopPadding", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBottomPadding", "getTitleStartPadding", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lru/ozon/app/android/marketing/widgets/bigPromoPDP/data/BigPromoPDPDTO$PaddingsDTO;", "equals", "", "other", "hashCode", "toString", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaddingsDTO {
        public static final int $stable = 0;
        private final Integer bottomPadding;
        private final Integer titleStartPadding;
        private final Integer topPadding;

        public PaddingsDTO(Integer num, Integer num2, Integer num3) {
            this.topPadding = num;
            this.bottomPadding = num2;
            this.titleStartPadding = num3;
        }

        public static /* synthetic */ PaddingsDTO copy$default(PaddingsDTO paddingsDTO, Integer num, Integer num2, Integer num3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                num = paddingsDTO.topPadding;
            }
            if ((i11 & 2) != 0) {
                num2 = paddingsDTO.bottomPadding;
            }
            if ((i11 & 4) != 0) {
                num3 = paddingsDTO.titleStartPadding;
            }
            return paddingsDTO.copy(num, num2, num3);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getTopPadding() {
            return this.topPadding;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getBottomPadding() {
            return this.bottomPadding;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getTitleStartPadding() {
            return this.titleStartPadding;
        }

        @NotNull
        public final PaddingsDTO copy(Integer topPadding, Integer bottomPadding, Integer titleStartPadding) {
            return new PaddingsDTO(topPadding, bottomPadding, titleStartPadding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaddingsDTO)) {
                return false;
            }
            PaddingsDTO paddingsDTO = (PaddingsDTO) other;
            return Intrinsics.d(this.topPadding, paddingsDTO.topPadding) && Intrinsics.d(this.bottomPadding, paddingsDTO.bottomPadding) && Intrinsics.d(this.titleStartPadding, paddingsDTO.titleStartPadding);
        }

        public final Integer getBottomPadding() {
            return this.bottomPadding;
        }

        public final Integer getTitleStartPadding() {
            return this.titleStartPadding;
        }

        public final Integer getTopPadding() {
            return this.topPadding;
        }

        public int hashCode() {
            Integer num = this.topPadding;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.bottomPadding;
            int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.titleStartPadding;
            return hashCode2 + (num3 != null ? num3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Integer num = this.topPadding;
            Integer num2 = this.bottomPadding;
            return a.c(c.f("PaddingsDTO(topPadding=", ", bottomPadding=", num, num2, ", titleStartPadding="), this.titleStartPadding, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\""}, d2 = {"Lru/ozon/app/android/marketing/widgets/bigPromoPDP/data/BigPromoPDPDTO$TimerBadgeDTO;", "", "timerText", "Lru/ozon/uni/atoms/data/text/TextDTO;", "secondsLeft", "", "timerStyle", "backgroundColor", "", "onExpiredText", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Long;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getTimerText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSecondsLeft", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTimerStyle", "getBackgroundColor", "()Ljava/lang/String;", "getOnExpiredText", "component1", "component2", "component3", "component4", "component5", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Long;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;)Lru/ozon/app/android/marketing/widgets/bigPromoPDP/data/BigPromoPDPDTO$TimerBadgeDTO;", "equals", "", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TimerBadgeDTO {
        public static final int $stable = 0;
        private final String backgroundColor;
        private final TextDTO onExpiredText;
        private final Long secondsLeft;
        private final TextDTO timerStyle;
        private final TextDTO timerText;

        public TimerBadgeDTO(TextDTO textDTO, Long l11, TextDTO textDTO2, String str, TextDTO textDTO3) {
            this.timerText = textDTO;
            this.secondsLeft = l11;
            this.timerStyle = textDTO2;
            this.backgroundColor = str;
            this.onExpiredText = textDTO3;
        }

        public static /* synthetic */ TimerBadgeDTO copy$default(TimerBadgeDTO timerBadgeDTO, TextDTO textDTO, Long l11, TextDTO textDTO2, String str, TextDTO textDTO3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = timerBadgeDTO.timerText;
            }
            if ((i11 & 2) != 0) {
                l11 = timerBadgeDTO.secondsLeft;
            }
            if ((i11 & 4) != 0) {
                textDTO2 = timerBadgeDTO.timerStyle;
            }
            if ((i11 & 8) != 0) {
                str = timerBadgeDTO.backgroundColor;
            }
            if ((i11 & 16) != 0) {
                textDTO3 = timerBadgeDTO.onExpiredText;
            }
            TextDTO textDTO4 = textDTO3;
            TextDTO textDTO5 = textDTO2;
            return timerBadgeDTO.copy(textDTO, l11, textDTO5, str, textDTO4);
        }

        /* renamed from: component1, reason: from getter */
        public final TextDTO getTimerText() {
            return this.timerText;
        }

        /* renamed from: component2, reason: from getter */
        public final Long getSecondsLeft() {
            return this.secondsLeft;
        }

        /* renamed from: component3, reason: from getter */
        public final TextDTO getTimerStyle() {
            return this.timerStyle;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component5, reason: from getter */
        public final TextDTO getOnExpiredText() {
            return this.onExpiredText;
        }

        @NotNull
        public final TimerBadgeDTO copy(TextDTO timerText, Long secondsLeft, TextDTO timerStyle, String backgroundColor, TextDTO onExpiredText) {
            return new TimerBadgeDTO(timerText, secondsLeft, timerStyle, backgroundColor, onExpiredText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimerBadgeDTO)) {
                return false;
            }
            TimerBadgeDTO timerBadgeDTO = (TimerBadgeDTO) other;
            return Intrinsics.d(this.timerText, timerBadgeDTO.timerText) && Intrinsics.d(this.secondsLeft, timerBadgeDTO.secondsLeft) && Intrinsics.d(this.timerStyle, timerBadgeDTO.timerStyle) && Intrinsics.d(this.backgroundColor, timerBadgeDTO.backgroundColor) && Intrinsics.d(this.onExpiredText, timerBadgeDTO.onExpiredText);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final TextDTO getOnExpiredText() {
            return this.onExpiredText;
        }

        public final Long getSecondsLeft() {
            return this.secondsLeft;
        }

        public final TextDTO getTimerStyle() {
            return this.timerStyle;
        }

        public final TextDTO getTimerText() {
            return this.timerText;
        }

        public int hashCode() {
            TextDTO textDTO = this.timerText;
            int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
            Long l11 = this.secondsLeft;
            int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
            TextDTO textDTO2 = this.timerStyle;
            int hashCode3 = (hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
            String str = this.backgroundColor;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            TextDTO textDTO3 = this.onExpiredText;
            return hashCode4 + (textDTO3 != null ? textDTO3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.timerText;
            Long l11 = this.secondsLeft;
            TextDTO textDTO2 = this.timerStyle;
            String str = this.backgroundColor;
            TextDTO textDTO3 = this.onExpiredText;
            StringBuilder sb2 = new StringBuilder("TimerBadgeDTO(timerText=");
            sb2.append(textDTO);
            sb2.append(", secondsLeft=");
            sb2.append(l11);
            sb2.append(", timerStyle=");
            sb2.append(textDTO2);
            sb2.append(", backgroundColor=");
            sb2.append(str);
            sb2.append(", onExpiredText=");
            return b.e(sb2, textDTO3, ")");
        }
    }

    public BigPromoPDPDTO(ImageDTO imageDTO, AnimatedCounterDTO animatedCounterDTO, @NotNull TextDTO title, TextDTO textDTO, TextDTO textDTO2, IconDTO iconDTO, ButtonV3DTO buttonV3DTO, TimerBadgeDTO timerBadgeDTO, PaddingsDTO paddingsDTO, AtomActionDTO atomActionDTO, String str, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.logo = imageDTO;
        this.counter = animatedCounterDTO;
        this.title = title;
        this.stockText = textDTO;
        this.stockNumber = textDTO2;
        this.chevronIcon = iconDTO;
        this.rightButton = buttonV3DTO;
        this.timerBadge = timerBadgeDTO;
        this.paddings = paddingsDTO;
        this.action = atomActionDTO;
        this.widgetBackgroundColor = str;
        this.trackingInfo = map;
    }

    public static /* synthetic */ BigPromoPDPDTO copy$default(BigPromoPDPDTO bigPromoPDPDTO, ImageDTO imageDTO, AnimatedCounterDTO animatedCounterDTO, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, IconDTO iconDTO, ButtonV3DTO buttonV3DTO, TimerBadgeDTO timerBadgeDTO, PaddingsDTO paddingsDTO, AtomActionDTO atomActionDTO, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            imageDTO = bigPromoPDPDTO.logo;
        }
        if ((i11 & 2) != 0) {
            animatedCounterDTO = bigPromoPDPDTO.counter;
        }
        if ((i11 & 4) != 0) {
            textDTO = bigPromoPDPDTO.title;
        }
        if ((i11 & 8) != 0) {
            textDTO2 = bigPromoPDPDTO.stockText;
        }
        if ((i11 & 16) != 0) {
            textDTO3 = bigPromoPDPDTO.stockNumber;
        }
        if ((i11 & 32) != 0) {
            iconDTO = bigPromoPDPDTO.chevronIcon;
        }
        if ((i11 & 64) != 0) {
            buttonV3DTO = bigPromoPDPDTO.rightButton;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            timerBadgeDTO = bigPromoPDPDTO.timerBadge;
        }
        if ((i11 & 256) != 0) {
            paddingsDTO = bigPromoPDPDTO.paddings;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            atomActionDTO = bigPromoPDPDTO.action;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            str = bigPromoPDPDTO.widgetBackgroundColor;
        }
        if ((i11 & 2048) != 0) {
            map = bigPromoPDPDTO.trackingInfo;
        }
        String str2 = str;
        Map map2 = map;
        PaddingsDTO paddingsDTO2 = paddingsDTO;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
        TimerBadgeDTO timerBadgeDTO2 = timerBadgeDTO;
        TextDTO textDTO4 = textDTO3;
        IconDTO iconDTO2 = iconDTO;
        return bigPromoPDPDTO.copy(imageDTO, animatedCounterDTO, textDTO, textDTO2, textDTO4, iconDTO2, buttonV3DTO2, timerBadgeDTO2, paddingsDTO2, atomActionDTO2, str2, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final ImageDTO getLogo() {
        return this.logo;
    }

    /* renamed from: component10, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component11, reason: from getter */
    public final String getWidgetBackgroundColor() {
        return this.widgetBackgroundColor;
    }

    public final Map<String, TokenizedTrackingInfo> component12() {
        return this.trackingInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final AnimatedCounterDTO getCounter() {
        return this.counter;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final TextDTO getStockText() {
        return this.stockText;
    }

    /* renamed from: component5, reason: from getter */
    public final TextDTO getStockNumber() {
        return this.stockNumber;
    }

    /* renamed from: component6, reason: from getter */
    public final IconDTO getChevronIcon() {
        return this.chevronIcon;
    }

    /* renamed from: component7, reason: from getter */
    public final ButtonV3DTO getRightButton() {
        return this.rightButton;
    }

    /* renamed from: component8, reason: from getter */
    public final TimerBadgeDTO getTimerBadge() {
        return this.timerBadge;
    }

    /* renamed from: component9, reason: from getter */
    public final PaddingsDTO getPaddings() {
        return this.paddings;
    }

    @NotNull
    public final BigPromoPDPDTO copy(ImageDTO logo, AnimatedCounterDTO counter, @NotNull TextDTO title, TextDTO stockText, TextDTO stockNumber, IconDTO chevronIcon, ButtonV3DTO rightButton, TimerBadgeDTO timerBadge, PaddingsDTO paddings, AtomActionDTO action, String widgetBackgroundColor, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new BigPromoPDPDTO(logo, counter, title, stockText, stockNumber, chevronIcon, rightButton, timerBadge, paddings, action, widgetBackgroundColor, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BigPromoPDPDTO)) {
            return false;
        }
        BigPromoPDPDTO bigPromoPDPDTO = (BigPromoPDPDTO) other;
        return Intrinsics.d(this.logo, bigPromoPDPDTO.logo) && Intrinsics.d(this.counter, bigPromoPDPDTO.counter) && Intrinsics.d(this.title, bigPromoPDPDTO.title) && Intrinsics.d(this.stockText, bigPromoPDPDTO.stockText) && Intrinsics.d(this.stockNumber, bigPromoPDPDTO.stockNumber) && Intrinsics.d(this.chevronIcon, bigPromoPDPDTO.chevronIcon) && Intrinsics.d(this.rightButton, bigPromoPDPDTO.rightButton) && Intrinsics.d(this.timerBadge, bigPromoPDPDTO.timerBadge) && Intrinsics.d(this.paddings, bigPromoPDPDTO.paddings) && Intrinsics.d(this.action, bigPromoPDPDTO.action) && Intrinsics.d(this.widgetBackgroundColor, bigPromoPDPDTO.widgetBackgroundColor) && Intrinsics.d(this.trackingInfo, bigPromoPDPDTO.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final IconDTO getChevronIcon() {
        return this.chevronIcon;
    }

    public final AnimatedCounterDTO getCounter() {
        return this.counter;
    }

    public final ImageDTO getLogo() {
        return this.logo;
    }

    public final PaddingsDTO getPaddings() {
        return this.paddings;
    }

    public final ButtonV3DTO getRightButton() {
        return this.rightButton;
    }

    public final TextDTO getStockNumber() {
        return this.stockNumber;
    }

    public final TextDTO getStockText() {
        return this.stockText;
    }

    public final TimerBadgeDTO getTimerBadge() {
        return this.timerBadge;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final String getWidgetBackgroundColor() {
        return this.widgetBackgroundColor;
    }

    public int hashCode() {
        ImageDTO imageDTO = this.logo;
        int hashCode = (imageDTO == null ? 0 : imageDTO.hashCode()) * 31;
        AnimatedCounterDTO animatedCounterDTO = this.counter;
        int a11 = Ns.b.a(this.title, (hashCode + (animatedCounterDTO == null ? 0 : animatedCounterDTO.hashCode())) * 31, 31);
        TextDTO textDTO = this.stockText;
        int hashCode2 = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.stockNumber;
        int hashCode3 = (hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        IconDTO iconDTO = this.chevronIcon;
        int hashCode4 = (hashCode3 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.rightButton;
        int hashCode5 = (hashCode4 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        TimerBadgeDTO timerBadgeDTO = this.timerBadge;
        int hashCode6 = (hashCode5 + (timerBadgeDTO == null ? 0 : timerBadgeDTO.hashCode())) * 31;
        PaddingsDTO paddingsDTO = this.paddings;
        int hashCode7 = (hashCode6 + (paddingsDTO == null ? 0 : paddingsDTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode8 = (hashCode7 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        String str = this.widgetBackgroundColor;
        int hashCode9 = (hashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode9 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ImageDTO imageDTO = this.logo;
        AnimatedCounterDTO animatedCounterDTO = this.counter;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.stockText;
        TextDTO textDTO3 = this.stockNumber;
        IconDTO iconDTO = this.chevronIcon;
        ButtonV3DTO buttonV3DTO = this.rightButton;
        TimerBadgeDTO timerBadgeDTO = this.timerBadge;
        PaddingsDTO paddingsDTO = this.paddings;
        AtomActionDTO atomActionDTO = this.action;
        String str = this.widgetBackgroundColor;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("BigPromoPDPDTO(logo=");
        sb2.append(imageDTO);
        sb2.append(", counter=");
        sb2.append(animatedCounterDTO);
        sb2.append(", title=");
        d.e(", stockText=", ", stockNumber=", sb2, textDTO, textDTO2);
        G.f(sb2, textDTO3, ", chevronIcon=", iconDTO, ", rightButton=");
        sb2.append(buttonV3DTO);
        sb2.append(", timerBadge=");
        sb2.append(timerBadgeDTO);
        sb2.append(", paddings=");
        sb2.append(paddingsDTO);
        sb2.append(", action=");
        sb2.append(atomActionDTO);
        sb2.append(", widgetBackgroundColor=");
        return C4070a.a(sb2, str, ", trackingInfo=", map, ")");
    }
}
