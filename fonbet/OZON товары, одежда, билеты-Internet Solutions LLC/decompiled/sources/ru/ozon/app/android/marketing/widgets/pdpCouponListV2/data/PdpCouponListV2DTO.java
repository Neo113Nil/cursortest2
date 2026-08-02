package ru.ozon.app.android.marketing.widgets.pdpCouponListV2.data;

import B90.C2619v;
import Co.a;
import G.g;
import Kk.C3532b;
import Kk.c;
import N3.C3660k;
import T7.P;
import V.e;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0005\u0018\u0019\u001a\u001b\u001cB+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/data/PdpCouponListV2DTO;", "", "coupons", "", "Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/data/PdpCouponListV2DTO$PdpCouponV2DTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "getCoupons", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "PdpCouponV2DTO", "Promocode", "CouponText", "CouponAction", "Gradient", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PdpCouponListV2DTO {
    public static final int $stable = 8;

    @NotNull
    private final List<PdpCouponV2DTO> coupons;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/data/PdpCouponListV2DTO$CouponAction;", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CouponAction {
        public static final int $stable = 8;

        @NotNull
        private final AtomActionDTO action;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public CouponAction(@NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.action = action;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CouponAction copy$default(CouponAction couponAction, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                atomActionDTO = couponAction.action;
            }
            if ((i11 & 2) != 0) {
                map = couponAction.trackingInfo;
            }
            return couponAction.copy(atomActionDTO, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component2() {
            return this.trackingInfo;
        }

        @NotNull
        public final CouponAction copy(@NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(action, "action");
            return new CouponAction(action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CouponAction)) {
                return false;
            }
            CouponAction couponAction = (CouponAction) other;
            return Intrinsics.d(this.action, couponAction.action) && Intrinsics.d(this.trackingInfo, couponAction.trackingInfo);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.action.hashCode() * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode + (map == null ? 0 : map.hashCode());
        }

        @NotNull
        public String toString() {
            return "CouponAction(action=" + this.action + ", trackingInfo=" + this.trackingInfo + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/data/PdpCouponListV2DTO$CouponText;", "", "primaryText", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "secondaryText", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getPrimaryText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSecondaryText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CouponText {
        public static final int $stable = TextAtom.$stable;

        @NotNull
        private final TextAtom primaryText;
        private final TextAtom secondaryText;

        public CouponText(@NotNull TextAtom primaryText, TextAtom textAtom) {
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            this.primaryText = primaryText;
            this.secondaryText = textAtom;
        }

        public static /* synthetic */ CouponText copy$default(CouponText couponText, TextAtom textAtom, TextAtom textAtom2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = couponText.primaryText;
            }
            if ((i11 & 2) != 0) {
                textAtom2 = couponText.secondaryText;
            }
            return couponText.copy(textAtom, textAtom2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getPrimaryText() {
            return this.primaryText;
        }

        /* renamed from: component2, reason: from getter */
        public final TextAtom getSecondaryText() {
            return this.secondaryText;
        }

        @NotNull
        public final CouponText copy(@NotNull TextAtom primaryText, TextAtom secondaryText) {
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            return new CouponText(primaryText, secondaryText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CouponText)) {
                return false;
            }
            CouponText couponText = (CouponText) other;
            return Intrinsics.d(this.primaryText, couponText.primaryText) && Intrinsics.d(this.secondaryText, couponText.secondaryText);
        }

        @NotNull
        public final TextAtom getPrimaryText() {
            return this.primaryText;
        }

        public final TextAtom getSecondaryText() {
            return this.secondaryText;
        }

        public int hashCode() {
            int hashCode = this.primaryText.hashCode() * 31;
            TextAtom textAtom = this.secondaryText;
            return hashCode + (textAtom == null ? 0 : textAtom.hashCode());
        }

        @NotNull
        public String toString() {
            return a.a("CouponText(primaryText=", this.primaryText, ", secondaryText=", this.secondaryText, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/data/PdpCouponListV2DTO$Gradient;", "", "startColor", "", "endColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getStartColor", "()Ljava/lang/String;", "getEndColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0003JK\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/data/PdpCouponListV2DTO$PdpCouponV2DTO;", "", "gradient", "Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/data/PdpCouponListV2DTO$Gradient;", "promocode", "Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/data/PdpCouponListV2DTO$Promocode;", "couponText", "Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/data/PdpCouponListV2DTO$CouponText;", "couponAction", "Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/data/PdpCouponListV2DTO$CouponAction;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/data/PdpCouponListV2DTO$Gradient;Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/data/PdpCouponListV2DTO$Promocode;Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/data/PdpCouponListV2DTO$CouponText;Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/data/PdpCouponListV2DTO$CouponAction;Ljava/util/Map;)V", "getGradient", "()Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/data/PdpCouponListV2DTO$Gradient;", "getPromocode", "()Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/data/PdpCouponListV2DTO$Promocode;", "getCouponText", "()Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/data/PdpCouponListV2DTO$CouponText;", "getCouponAction", "()Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/data/PdpCouponListV2DTO$CouponAction;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PdpCouponV2DTO {
        public static final int $stable = 8;
        private final CouponAction couponAction;

        @NotNull
        private final CouponText couponText;

        @NotNull
        private final Gradient gradient;

        @NotNull
        private final Promocode promocode;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public PdpCouponV2DTO(@NotNull Gradient gradient, @NotNull Promocode promocode, @NotNull CouponText couponText, CouponAction couponAction, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(gradient, "gradient");
            Intrinsics.checkNotNullParameter(promocode, "promocode");
            Intrinsics.checkNotNullParameter(couponText, "couponText");
            this.gradient = gradient;
            this.promocode = promocode;
            this.couponText = couponText;
            this.couponAction = couponAction;
            this.trackingInfo = map;
        }

        public static /* synthetic */ PdpCouponV2DTO copy$default(PdpCouponV2DTO pdpCouponV2DTO, Gradient gradient, Promocode promocode, CouponText couponText, CouponAction couponAction, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                gradient = pdpCouponV2DTO.gradient;
            }
            if ((i11 & 2) != 0) {
                promocode = pdpCouponV2DTO.promocode;
            }
            if ((i11 & 4) != 0) {
                couponText = pdpCouponV2DTO.couponText;
            }
            if ((i11 & 8) != 0) {
                couponAction = pdpCouponV2DTO.couponAction;
            }
            if ((i11 & 16) != 0) {
                map = pdpCouponV2DTO.trackingInfo;
            }
            Map map2 = map;
            CouponText couponText2 = couponText;
            return pdpCouponV2DTO.copy(gradient, promocode, couponText2, couponAction, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Gradient getGradient() {
            return this.gradient;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Promocode getPromocode() {
            return this.promocode;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final CouponText getCouponText() {
            return this.couponText;
        }

        /* renamed from: component4, reason: from getter */
        public final CouponAction getCouponAction() {
            return this.couponAction;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.trackingInfo;
        }

        @NotNull
        public final PdpCouponV2DTO copy(@NotNull Gradient gradient, @NotNull Promocode promocode, @NotNull CouponText couponText, CouponAction couponAction, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(gradient, "gradient");
            Intrinsics.checkNotNullParameter(promocode, "promocode");
            Intrinsics.checkNotNullParameter(couponText, "couponText");
            return new PdpCouponV2DTO(gradient, promocode, couponText, couponAction, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PdpCouponV2DTO)) {
                return false;
            }
            PdpCouponV2DTO pdpCouponV2DTO = (PdpCouponV2DTO) other;
            return Intrinsics.d(this.gradient, pdpCouponV2DTO.gradient) && Intrinsics.d(this.promocode, pdpCouponV2DTO.promocode) && Intrinsics.d(this.couponText, pdpCouponV2DTO.couponText) && Intrinsics.d(this.couponAction, pdpCouponV2DTO.couponAction) && Intrinsics.d(this.trackingInfo, pdpCouponV2DTO.trackingInfo);
        }

        public final CouponAction getCouponAction() {
            return this.couponAction;
        }

        @NotNull
        public final CouponText getCouponText() {
            return this.couponText;
        }

        @NotNull
        public final Gradient getGradient() {
            return this.gradient;
        }

        @NotNull
        public final Promocode getPromocode() {
            return this.promocode;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = (this.couponText.hashCode() + ((this.promocode.hashCode() + (this.gradient.hashCode() * 31)) * 31)) * 31;
            CouponAction couponAction = this.couponAction;
            int hashCode2 = (hashCode + (couponAction == null ? 0 : couponAction.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Gradient gradient = this.gradient;
            Promocode promocode = this.promocode;
            CouponText couponText = this.couponText;
            CouponAction couponAction = this.couponAction;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("PdpCouponV2DTO(gradient=");
            sb2.append(gradient);
            sb2.append(", promocode=");
            sb2.append(promocode);
            sb2.append(", couponText=");
            sb2.append(couponText);
            sb2.append(", couponAction=");
            sb2.append(couponAction);
            sb2.append(", trackingInfo=");
            return P.f(sb2, map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003JU\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u0010!\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/data/PdpCouponListV2DTO$Promocode;", "", "promocode", "", "appliedColor", "applyText", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "isApplied", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;ZLru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getPromocode", "()Ljava/lang/String;", "getAppliedColor", "getApplyText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "()Z", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Promocode {
        public static final int $stable = 8;
        private final AtomActionDTO action;

        @NotNull
        private final String appliedColor;

        @NotNull
        private final TextAtom applyText;
        private final boolean isApplied;

        @NotNull
        private final String promocode;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public Promocode(@NotNull String promocode, @NotNull String appliedColor, @NotNull TextAtom applyText, boolean z11, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(promocode, "promocode");
            Intrinsics.checkNotNullParameter(appliedColor, "appliedColor");
            Intrinsics.checkNotNullParameter(applyText, "applyText");
            this.promocode = promocode;
            this.appliedColor = appliedColor;
            this.applyText = applyText;
            this.isApplied = z11;
            this.action = atomActionDTO;
            this.trackingInfo = map;
        }

        public static /* synthetic */ Promocode copy$default(Promocode promocode, String str, String str2, TextAtom textAtom, boolean z11, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = promocode.promocode;
            }
            if ((i11 & 2) != 0) {
                str2 = promocode.appliedColor;
            }
            if ((i11 & 4) != 0) {
                textAtom = promocode.applyText;
            }
            if ((i11 & 8) != 0) {
                z11 = promocode.isApplied;
            }
            if ((i11 & 16) != 0) {
                atomActionDTO = promocode.action;
            }
            if ((i11 & 32) != 0) {
                map = promocode.trackingInfo;
            }
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Map map2 = map;
            return promocode.copy(str, str2, textAtom, z11, atomActionDTO2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getPromocode() {
            return this.promocode;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getAppliedColor() {
            return this.appliedColor;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextAtom getApplyText() {
            return this.applyText;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsApplied() {
            return this.isApplied;
        }

        /* renamed from: component5, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.trackingInfo;
        }

        @NotNull
        public final Promocode copy(@NotNull String promocode, @NotNull String appliedColor, @NotNull TextAtom applyText, boolean isApplied, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(promocode, "promocode");
            Intrinsics.checkNotNullParameter(appliedColor, "appliedColor");
            Intrinsics.checkNotNullParameter(applyText, "applyText");
            return new Promocode(promocode, appliedColor, applyText, isApplied, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Promocode)) {
                return false;
            }
            Promocode promocode = (Promocode) other;
            return Intrinsics.d(this.promocode, promocode.promocode) && Intrinsics.d(this.appliedColor, promocode.appliedColor) && Intrinsics.d(this.applyText, promocode.applyText) && this.isApplied == promocode.isApplied && Intrinsics.d(this.action, promocode.action) && Intrinsics.d(this.trackingInfo, promocode.trackingInfo);
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
        public final String getPromocode() {
            return this.promocode;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = C3532b.a(C2619v.b(g.a(this.promocode.hashCode() * 31, 31, this.appliedColor), 31, this.applyText), 31, this.isApplied);
            AtomActionDTO atomActionDTO = this.action;
            int hashCode = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode + (map != null ? map.hashCode() : 0);
        }

        public final boolean isApplied() {
            return this.isApplied;
        }

        @NotNull
        public String toString() {
            String str = this.promocode;
            String str2 = this.appliedColor;
            TextAtom textAtom = this.applyText;
            boolean z11 = this.isApplied;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder d11 = C3660k.d("Promocode(promocode=", str, ", appliedColor=", str2, ", applyText=");
            d11.append(textAtom);
            d11.append(", isApplied=");
            d11.append(z11);
            d11.append(", action=");
            return D40.a.d(d11, atomActionDTO, ", trackingInfo=", map, ")");
        }
    }

    public PdpCouponListV2DTO(@NotNull List<PdpCouponV2DTO> coupons, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(coupons, "coupons");
        this.coupons = coupons;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PdpCouponListV2DTO copy$default(PdpCouponListV2DTO pdpCouponListV2DTO, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = pdpCouponListV2DTO.coupons;
        }
        if ((i11 & 2) != 0) {
            map = pdpCouponListV2DTO.trackingInfo;
        }
        return pdpCouponListV2DTO.copy(list, map);
    }

    @NotNull
    public final List<PdpCouponV2DTO> component1() {
        return this.coupons;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.trackingInfo;
    }

    @NotNull
    public final PdpCouponListV2DTO copy(@NotNull List<PdpCouponV2DTO> coupons, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(coupons, "coupons");
        return new PdpCouponListV2DTO(coupons, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PdpCouponListV2DTO)) {
            return false;
        }
        PdpCouponListV2DTO pdpCouponListV2DTO = (PdpCouponListV2DTO) other;
        return Intrinsics.d(this.coupons, pdpCouponListV2DTO.coupons) && Intrinsics.d(this.trackingInfo, pdpCouponListV2DTO.trackingInfo);
    }

    @NotNull
    public final List<PdpCouponV2DTO> getCoupons() {
        return this.coupons;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.coupons.hashCode() * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return c.d("PdpCouponListV2DTO(coupons=", ", trackingInfo=", ")", this.coupons, this.trackingInfo);
    }
}
