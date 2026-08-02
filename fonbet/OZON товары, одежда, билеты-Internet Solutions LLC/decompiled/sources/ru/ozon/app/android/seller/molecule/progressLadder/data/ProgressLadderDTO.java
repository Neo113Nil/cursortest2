package ru.ozon.app.android.seller.molecule.progressLadder.data;

import D40.d;
import G.g;
import V.e;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000bJ*\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/seller/molecule/progressLadder/data/ProgressLadderDTO;", "", "steps", "", "Lru/ozon/app/android/seller/molecule/progressLadder/data/ProgressLadderDTO$StepDTO;", "isCompact", "", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;)V", "getSteps", "()Ljava/util/List;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/lang/Boolean;)Lru/ozon/app/android/seller/molecule/progressLadder/data/ProgressLadderDTO;", "equals", "other", "hashCode", "", "toString", "", "StepDTO", "seller_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ProgressLadderDTO {
    private final Boolean isCompact;

    @NotNull
    private final List<StepDTO> steps;

    public ProgressLadderDTO(@NotNull List<StepDTO> steps, Boolean bool) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.steps = steps;
        this.isCompact = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProgressLadderDTO copy$default(ProgressLadderDTO progressLadderDTO, List list, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = progressLadderDTO.steps;
        }
        if ((i11 & 2) != 0) {
            bool = progressLadderDTO.isCompact;
        }
        return progressLadderDTO.copy(list, bool);
    }

    @NotNull
    public final List<StepDTO> component1() {
        return this.steps;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getIsCompact() {
        return this.isCompact;
    }

    @NotNull
    public final ProgressLadderDTO copy(@NotNull List<StepDTO> steps, Boolean isCompact) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        return new ProgressLadderDTO(steps, isCompact);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressLadderDTO)) {
            return false;
        }
        ProgressLadderDTO progressLadderDTO = (ProgressLadderDTO) other;
        return Intrinsics.d(this.steps, progressLadderDTO.steps) && Intrinsics.d(this.isCompact, progressLadderDTO.isCompact);
    }

    @NotNull
    public final List<StepDTO> getSteps() {
        return this.steps;
    }

    public int hashCode() {
        int hashCode = this.steps.hashCode() * 31;
        Boolean bool = this.isCompact;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final Boolean isCompact() {
        return this.isCompact;
    }

    @NotNull
    public String toString() {
        return "ProgressLadderDTO(steps=" + this.steps + ", isCompact=" + this.isCompact + ")";
    }

    public /* synthetic */ ProgressLadderDTO(List list, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? Boolean.FALSE : bool);
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001)BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003J`\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006*"}, d2 = {"Lru/ozon/app/android/seller/molecule/progressLadder/data/ProgressLadderDTO$StepDTO;", "", "percent", "", "backgroundColor", "", "fillColor", "discount", "Lru/ozon/uni/atoms/data/text/TextDTO;", "thresholdFirst", "thresholdSecond", "fillGradientColor", "Lru/ozon/app/android/seller/molecule/progressLadder/data/ProgressLadderDTO$StepDTO$GradientColor;", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/seller/molecule/progressLadder/data/ProgressLadderDTO$StepDTO$GradientColor;)V", "getPercent", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBackgroundColor", "()Ljava/lang/String;", "getFillColor", "getDiscount", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getThresholdFirst", "getThresholdSecond", "getFillGradientColor", "()Lru/ozon/app/android/seller/molecule/progressLadder/data/ProgressLadderDTO$StepDTO$GradientColor;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/seller/molecule/progressLadder/data/ProgressLadderDTO$StepDTO$GradientColor;)Lru/ozon/app/android/seller/molecule/progressLadder/data/ProgressLadderDTO$StepDTO;", "equals", "", "other", "hashCode", "toString", "GradientColor", "seller_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class StepDTO {

        @NotNull
        private final String backgroundColor;
        private final TextDTO discount;
        private final String fillColor;
        private final GradientColor fillGradientColor;
        private final Integer percent;
        private final TextDTO thresholdFirst;
        private final TextDTO thresholdSecond;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/seller/molecule/progressLadder/data/ProgressLadderDTO$StepDTO$GradientColor;", "", "startColor", "", "endColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getStartColor", "()Ljava/lang/String;", "getEndColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "seller_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class GradientColor {

            @NotNull
            private final String endColor;

            @NotNull
            private final String startColor;

            public GradientColor(@NotNull String startColor, @NotNull String endColor) {
                Intrinsics.checkNotNullParameter(startColor, "startColor");
                Intrinsics.checkNotNullParameter(endColor, "endColor");
                this.startColor = startColor;
                this.endColor = endColor;
            }

            public static /* synthetic */ GradientColor copy$default(GradientColor gradientColor, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = gradientColor.startColor;
                }
                if ((i11 & 2) != 0) {
                    str2 = gradientColor.endColor;
                }
                return gradientColor.copy(str, str2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getStartColor() {
                return this.startColor;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getEndColor() {
                return this.endColor;
            }

            @NotNull
            public final GradientColor copy(@NotNull String startColor, @NotNull String endColor) {
                Intrinsics.checkNotNullParameter(startColor, "startColor");
                Intrinsics.checkNotNullParameter(endColor, "endColor");
                return new GradientColor(startColor, endColor);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GradientColor)) {
                    return false;
                }
                GradientColor gradientColor = (GradientColor) other;
                return Intrinsics.d(this.startColor, gradientColor.startColor) && Intrinsics.d(this.endColor, gradientColor.endColor);
            }

            @NotNull
            public final String getEndColor() {
                return this.endColor;
            }

            @NotNull
            public final String getStartColor() {
                return this.startColor;
            }

            public int hashCode() {
                return this.endColor.hashCode() + (this.startColor.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return e.a("GradientColor(startColor=", this.startColor, ", endColor=", this.endColor, ")");
            }
        }

        public StepDTO(Integer num, @NotNull String backgroundColor, String str, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, GradientColor gradientColor) {
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            this.percent = num;
            this.backgroundColor = backgroundColor;
            this.fillColor = str;
            this.discount = textDTO;
            this.thresholdFirst = textDTO2;
            this.thresholdSecond = textDTO3;
            this.fillGradientColor = gradientColor;
        }

        public static /* synthetic */ StepDTO copy$default(StepDTO stepDTO, Integer num, String str, String str2, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, GradientColor gradientColor, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                num = stepDTO.percent;
            }
            if ((i11 & 2) != 0) {
                str = stepDTO.backgroundColor;
            }
            if ((i11 & 4) != 0) {
                str2 = stepDTO.fillColor;
            }
            if ((i11 & 8) != 0) {
                textDTO = stepDTO.discount;
            }
            if ((i11 & 16) != 0) {
                textDTO2 = stepDTO.thresholdFirst;
            }
            if ((i11 & 32) != 0) {
                textDTO3 = stepDTO.thresholdSecond;
            }
            if ((i11 & 64) != 0) {
                gradientColor = stepDTO.fillGradientColor;
            }
            TextDTO textDTO4 = textDTO3;
            GradientColor gradientColor2 = gradientColor;
            TextDTO textDTO5 = textDTO2;
            String str3 = str2;
            return stepDTO.copy(num, str, str3, textDTO, textDTO5, textDTO4, gradientColor2);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getPercent() {
            return this.percent;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component3, reason: from getter */
        public final String getFillColor() {
            return this.fillColor;
        }

        /* renamed from: component4, reason: from getter */
        public final TextDTO getDiscount() {
            return this.discount;
        }

        /* renamed from: component5, reason: from getter */
        public final TextDTO getThresholdFirst() {
            return this.thresholdFirst;
        }

        /* renamed from: component6, reason: from getter */
        public final TextDTO getThresholdSecond() {
            return this.thresholdSecond;
        }

        /* renamed from: component7, reason: from getter */
        public final GradientColor getFillGradientColor() {
            return this.fillGradientColor;
        }

        @NotNull
        public final StepDTO copy(Integer percent, @NotNull String backgroundColor, String fillColor, TextDTO discount, TextDTO thresholdFirst, TextDTO thresholdSecond, GradientColor fillGradientColor) {
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            return new StepDTO(percent, backgroundColor, fillColor, discount, thresholdFirst, thresholdSecond, fillGradientColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StepDTO)) {
                return false;
            }
            StepDTO stepDTO = (StepDTO) other;
            return Intrinsics.d(this.percent, stepDTO.percent) && Intrinsics.d(this.backgroundColor, stepDTO.backgroundColor) && Intrinsics.d(this.fillColor, stepDTO.fillColor) && Intrinsics.d(this.discount, stepDTO.discount) && Intrinsics.d(this.thresholdFirst, stepDTO.thresholdFirst) && Intrinsics.d(this.thresholdSecond, stepDTO.thresholdSecond) && Intrinsics.d(this.fillGradientColor, stepDTO.fillGradientColor);
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final TextDTO getDiscount() {
            return this.discount;
        }

        public final String getFillColor() {
            return this.fillColor;
        }

        public final GradientColor getFillGradientColor() {
            return this.fillGradientColor;
        }

        public final Integer getPercent() {
            return this.percent;
        }

        public final TextDTO getThresholdFirst() {
            return this.thresholdFirst;
        }

        public final TextDTO getThresholdSecond() {
            return this.thresholdSecond;
        }

        public int hashCode() {
            Integer num = this.percent;
            int a11 = g.a((num == null ? 0 : num.hashCode()) * 31, 31, this.backgroundColor);
            String str = this.fillColor;
            int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            TextDTO textDTO = this.discount;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            TextDTO textDTO2 = this.thresholdFirst;
            int hashCode3 = (hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
            TextDTO textDTO3 = this.thresholdSecond;
            int hashCode4 = (hashCode3 + (textDTO3 == null ? 0 : textDTO3.hashCode())) * 31;
            GradientColor gradientColor = this.fillGradientColor;
            return hashCode4 + (gradientColor != null ? gradientColor.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Integer num = this.percent;
            String str = this.backgroundColor;
            String str2 = this.fillColor;
            TextDTO textDTO = this.discount;
            TextDTO textDTO2 = this.thresholdFirst;
            TextDTO textDTO3 = this.thresholdSecond;
            GradientColor gradientColor = this.fillGradientColor;
            StringBuilder sb2 = new StringBuilder("StepDTO(percent=");
            sb2.append(num);
            sb2.append(", backgroundColor=");
            sb2.append(str);
            sb2.append(", fillColor=");
            sb2.append(str2);
            sb2.append(", discount=");
            sb2.append(textDTO);
            sb2.append(", thresholdFirst=");
            d.e(", thresholdSecond=", ", fillGradientColor=", sb2, textDTO2, textDTO3);
            sb2.append(gradientColor);
            sb2.append(")");
            return sb2.toString();
        }

        public /* synthetic */ StepDTO(Integer num, String str, String str2, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, GradientColor gradientColor, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 0 : num, str, str2, textDTO, textDTO2, textDTO3, gradientColor);
        }
    }
}
