package ru.ozon.app.android.marketing.widgets.coupon.data;

import B3.p;
import B90.C2619v;
import G.g;
import T7.P;
import V.e;
import Ve.C4636t5;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.data.HighlightsCurrentMiniWidget;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u00011BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Ja\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u00062"}, d2 = {"Lru/ozon/app/android/marketing/widgets/coupon/data/CouponDTO;", "", "gradient", "Lru/ozon/app/android/marketing/widgets/coupon/data/CouponDTO$Gradient;", "code", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "applyText", "subtitle", "appliedColor", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/marketing/widgets/coupon/data/CouponDTO$Gradient;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getGradient", "()Lru/ozon/app/android/marketing/widgets/coupon/data/CouponDTO$Gradient;", "getCode", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getApplyText", "getSubtitle", "getAppliedColor", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "currentMiniWidget", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsCurrentMiniWidget;", "getCurrentMiniWidget", "()Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsCurrentMiniWidget;", "setCurrentMiniWidget", "(Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsCurrentMiniWidget;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "Gradient", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CouponDTO {
    public static final int $stable = 8;
    private final AtomActionDTO action;

    @NotNull
    private final String appliedColor;

    @NotNull
    private final TextAtom applyText;

    @NotNull
    private final TextAtom code;
    private HighlightsCurrentMiniWidget currentMiniWidget;

    @NotNull
    private final Gradient gradient;
    private final TextAtom subtitle;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/marketing/widgets/coupon/data/CouponDTO$Gradient;", "", "startColor", "", "endColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getStartColor", "()Ljava/lang/String;", "getEndColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Gradient {
        public static final int $stable = 0;

        @NotNull
        private final String endColor;

        @NotNull
        private final String startColor;

        public Gradient(@NotNull String startColor, @NotNull String endColor) {
            Intrinsics.checkNotNullParameter(startColor, "startColor");
            Intrinsics.checkNotNullParameter(endColor, "endColor");
            this.startColor = startColor;
            this.endColor = endColor;
        }

        public static /* synthetic */ Gradient copy$default(Gradient gradient, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = gradient.startColor;
            }
            if ((i11 & 2) != 0) {
                str2 = gradient.endColor;
            }
            return gradient.copy(str, str2);
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
        public final Gradient copy(@NotNull String startColor, @NotNull String endColor) {
            Intrinsics.checkNotNullParameter(startColor, "startColor");
            Intrinsics.checkNotNullParameter(endColor, "endColor");
            return new Gradient(startColor, endColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Gradient)) {
                return false;
            }
            Gradient gradient = (Gradient) other;
            return Intrinsics.d(this.startColor, gradient.startColor) && Intrinsics.d(this.endColor, gradient.endColor);
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
            return e.a("Gradient(startColor=", this.startColor, ", endColor=", this.endColor, ")");
        }
    }

    public CouponDTO(@NotNull Gradient gradient, @NotNull TextAtom code, @NotNull TextAtom applyText, TextAtom textAtom, @NotNull String appliedColor, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(gradient, "gradient");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(applyText, "applyText");
        Intrinsics.checkNotNullParameter(appliedColor, "appliedColor");
        this.gradient = gradient;
        this.code = code;
        this.applyText = applyText;
        this.subtitle = textAtom;
        this.appliedColor = appliedColor;
        this.action = atomActionDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ CouponDTO copy$default(CouponDTO couponDTO, Gradient gradient, TextAtom textAtom, TextAtom textAtom2, TextAtom textAtom3, String str, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            gradient = couponDTO.gradient;
        }
        if ((i11 & 2) != 0) {
            textAtom = couponDTO.code;
        }
        if ((i11 & 4) != 0) {
            textAtom2 = couponDTO.applyText;
        }
        if ((i11 & 8) != 0) {
            textAtom3 = couponDTO.subtitle;
        }
        if ((i11 & 16) != 0) {
            str = couponDTO.appliedColor;
        }
        if ((i11 & 32) != 0) {
            atomActionDTO = couponDTO.action;
        }
        if ((i11 & 64) != 0) {
            map = couponDTO.trackingInfo;
        }
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        Map map2 = map;
        String str2 = str;
        TextAtom textAtom4 = textAtom2;
        return couponDTO.copy(gradient, textAtom, textAtom4, textAtom3, str2, atomActionDTO2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Gradient getGradient() {
        return this.gradient;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextAtom getCode() {
        return this.code;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextAtom getApplyText() {
        return this.applyText;
    }

    /* renamed from: component4, reason: from getter */
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getAppliedColor() {
        return this.appliedColor;
    }

    /* renamed from: component6, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    public final CouponDTO copy(@NotNull Gradient gradient, @NotNull TextAtom code, @NotNull TextAtom applyText, TextAtom subtitle, @NotNull String appliedColor, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(gradient, "gradient");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(applyText, "applyText");
        Intrinsics.checkNotNullParameter(appliedColor, "appliedColor");
        return new CouponDTO(gradient, code, applyText, subtitle, appliedColor, action, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CouponDTO)) {
            return false;
        }
        CouponDTO couponDTO = (CouponDTO) other;
        return Intrinsics.d(this.gradient, couponDTO.gradient) && Intrinsics.d(this.code, couponDTO.code) && Intrinsics.d(this.applyText, couponDTO.applyText) && Intrinsics.d(this.subtitle, couponDTO.subtitle) && Intrinsics.d(this.appliedColor, couponDTO.appliedColor) && Intrinsics.d(this.action, couponDTO.action) && Intrinsics.d(this.trackingInfo, couponDTO.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final String getAppliedColor() {
        return this.appliedColor;
    }

    @NotNull
    public final TextAtom getApplyText() {
        return this.applyText;
    }

    @NotNull
    public final TextAtom getCode() {
        return this.code;
    }

    public final HighlightsCurrentMiniWidget getCurrentMiniWidget() {
        return this.currentMiniWidget;
    }

    @NotNull
    public final Gradient getGradient() {
        return this.gradient;
    }

    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = C2619v.b(C2619v.b(this.gradient.hashCode() * 31, 31, this.code), 31, this.applyText);
        TextAtom textAtom = this.subtitle;
        int a11 = g.a((b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31, this.appliedColor);
        AtomActionDTO atomActionDTO = this.action;
        int hashCode = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    public final void setCurrentMiniWidget(HighlightsCurrentMiniWidget highlightsCurrentMiniWidget) {
        this.currentMiniWidget = highlightsCurrentMiniWidget;
    }

    @NotNull
    public String toString() {
        Gradient gradient = this.gradient;
        TextAtom textAtom = this.code;
        TextAtom textAtom2 = this.applyText;
        TextAtom textAtom3 = this.subtitle;
        String str = this.appliedColor;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("CouponDTO(gradient=");
        sb2.append(gradient);
        sb2.append(", code=");
        sb2.append(textAtom);
        sb2.append(", applyText=");
        C4636t5.c(", subtitle=", ", appliedColor=", sb2, textAtom2, textAtom3);
        p.c(str, ", action=", ", trackingInfo=", sb2, atomActionDTO);
        return P.f(sb2, map, ")");
    }
}
