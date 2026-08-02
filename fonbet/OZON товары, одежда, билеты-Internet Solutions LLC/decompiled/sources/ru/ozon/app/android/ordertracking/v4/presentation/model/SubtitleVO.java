package ru.ozon.app.android.ordertracking.v4.presentation.model;

import G.g;
import N3.C3660k;
import Nh.a;
import Ns.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.csma.orderTracking.data.AnimationParamsDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ordertracking/v4/presentation/model/SubtitleVO;", "", "SubtitleTextVO", "AddressVO", "MarqueeAddressVO", "Lru/ozon/app/android/ordertracking/v4/presentation/model/SubtitleVO$AddressVO;", "Lru/ozon/app/android/ordertracking/v4/presentation/model/SubtitleVO$MarqueeAddressVO;", "Lru/ozon/app/android/ordertracking/v4/presentation/model/SubtitleVO$SubtitleTextVO;", "orderTracking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface SubtitleVO {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u001a\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/ordertracking/v4/presentation/model/SubtitleVO$MarqueeAddressVO;", "Lru/ozon/app/android/ordertracking/v4/presentation/model/SubtitleVO;", "", "deliveryVariantNameText", "streetText", "houseText", "textColor", "Lru/ozon/app/android/csma/orderTracking/data/AnimationParamsDTO;", "animationParams", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/csma/orderTracking/data/AnimationParamsDTO;)V", "getUnitedAddress", "()Ljava/lang/String;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeliveryVariantNameText", "getStreetText", "getHouseText", "getTextColor", "Lru/ozon/app/android/csma/orderTracking/data/AnimationParamsDTO;", "getAnimationParams", "()Lru/ozon/app/android/csma/orderTracking/data/AnimationParamsDTO;", "orderTracking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MarqueeAddressVO implements SubtitleVO {
        private final AnimationParamsDTO animationParams;

        @NotNull
        private final String deliveryVariantNameText;
        private final String houseText;

        @NotNull
        private final String streetText;
        private final String textColor;

        public MarqueeAddressVO(@NotNull String deliveryVariantNameText, @NotNull String streetText, String str, String str2, AnimationParamsDTO animationParamsDTO) {
            Intrinsics.checkNotNullParameter(deliveryVariantNameText, "deliveryVariantNameText");
            Intrinsics.checkNotNullParameter(streetText, "streetText");
            this.deliveryVariantNameText = deliveryVariantNameText;
            this.streetText = streetText;
            this.houseText = str;
            this.textColor = str2;
            this.animationParams = animationParamsDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MarqueeAddressVO)) {
                return false;
            }
            MarqueeAddressVO marqueeAddressVO = (MarqueeAddressVO) other;
            return Intrinsics.d(this.deliveryVariantNameText, marqueeAddressVO.deliveryVariantNameText) && Intrinsics.d(this.streetText, marqueeAddressVO.streetText) && Intrinsics.d(this.houseText, marqueeAddressVO.houseText) && Intrinsics.d(this.textColor, marqueeAddressVO.textColor) && Intrinsics.d(this.animationParams, marqueeAddressVO.animationParams);
        }

        public final AnimationParamsDTO getAnimationParams() {
            return this.animationParams;
        }

        public final String getTextColor() {
            return this.textColor;
        }

        @NotNull
        public final String getUnitedAddress() {
            String str = this.deliveryVariantNameText;
            String str2 = this.streetText;
            String str3 = this.houseText;
            if (str3 == null) {
                str3 = "";
            }
            return g.c(str, str2, str3);
        }

        public int hashCode() {
            int a11 = g.a(this.deliveryVariantNameText.hashCode() * 31, 31, this.streetText);
            String str = this.houseText;
            int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.textColor;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            AnimationParamsDTO animationParamsDTO = this.animationParams;
            return hashCode2 + (animationParamsDTO != null ? animationParamsDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.deliveryVariantNameText;
            String str2 = this.streetText;
            String str3 = this.houseText;
            String str4 = this.textColor;
            AnimationParamsDTO animationParamsDTO = this.animationParams;
            StringBuilder d11 = C3660k.d("MarqueeAddressVO(deliveryVariantNameText=", str, ", streetText=", str2, ", houseText=");
            a.h(d11, str3, ", textColor=", str4, ", animationParams=");
            d11.append(animationParamsDTO);
            d11.append(")");
            return d11.toString();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ordertracking/v4/presentation/model/SubtitleVO$SubtitleTextVO;", "Lru/ozon/app/android/ordertracking/v4/presentation/model/SubtitleVO;", "", "text", "color", "", "breakPosition", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "getColor", "Ljava/lang/Integer;", "getBreakPosition", "()Ljava/lang/Integer;", "orderTracking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SubtitleTextVO implements SubtitleVO {
        private final Integer breakPosition;
        private final String color;

        @NotNull
        private final String text;

        public SubtitleTextVO(@NotNull String text, String str, Integer num) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.color = str;
            this.breakPosition = num;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SubtitleTextVO)) {
                return false;
            }
            SubtitleTextVO subtitleTextVO = (SubtitleTextVO) other;
            return Intrinsics.d(this.text, subtitleTextVO.text) && Intrinsics.d(this.color, subtitleTextVO.color) && Intrinsics.d(this.breakPosition, subtitleTextVO.breakPosition);
        }

        public final Integer getBreakPosition() {
            return this.breakPosition;
        }

        public final String getColor() {
            return this.color;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            String str = this.color;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.breakPosition;
            return hashCode2 + (num != null ? num.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.text;
            String str2 = this.color;
            return Ep.a.c(C3660k.d("SubtitleTextVO(text=", str, ", color=", str2, ", breakPosition="), this.breakPosition, ")");
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ<\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/ordertracking/v4/presentation/model/SubtitleVO$AddressVO;", "Lru/ozon/app/android/ordertracking/v4/presentation/model/SubtitleVO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "deliveryVariantName", "street", "house", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/af/AtomAction;)V", "withAction", "(Lru/ozon/uni/atoms/af/AtomAction;)Lru/ozon/app/android/ordertracking/v4/presentation/model/SubtitleVO$AddressVO;", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/af/AtomAction;)Lru/ozon/app/android/ordertracking/v4/presentation/model/SubtitleVO$AddressVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getDeliveryVariantName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getStreet", "getHouse", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "orderTracking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AddressVO implements SubtitleVO {
        private final AtomAction action;

        @NotNull
        private final TextDTO deliveryVariantName;
        private final TextDTO house;

        @NotNull
        private final TextDTO street;

        public AddressVO(@NotNull TextDTO deliveryVariantName, @NotNull TextDTO street, TextDTO textDTO, AtomAction atomAction) {
            Intrinsics.checkNotNullParameter(deliveryVariantName, "deliveryVariantName");
            Intrinsics.checkNotNullParameter(street, "street");
            this.deliveryVariantName = deliveryVariantName;
            this.street = street;
            this.house = textDTO;
            this.action = atomAction;
        }

        public static /* synthetic */ AddressVO copy$default(AddressVO addressVO, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, AtomAction atomAction, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = addressVO.deliveryVariantName;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = addressVO.street;
            }
            if ((i11 & 4) != 0) {
                textDTO3 = addressVO.house;
            }
            if ((i11 & 8) != 0) {
                atomAction = addressVO.action;
            }
            return addressVO.copy(textDTO, textDTO2, textDTO3, atomAction);
        }

        @NotNull
        public final AddressVO copy(@NotNull TextDTO deliveryVariantName, @NotNull TextDTO street, TextDTO house, AtomAction action) {
            Intrinsics.checkNotNullParameter(deliveryVariantName, "deliveryVariantName");
            Intrinsics.checkNotNullParameter(street, "street");
            return new AddressVO(deliveryVariantName, street, house, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AddressVO)) {
                return false;
            }
            AddressVO addressVO = (AddressVO) other;
            return Intrinsics.d(this.deliveryVariantName, addressVO.deliveryVariantName) && Intrinsics.d(this.street, addressVO.street) && Intrinsics.d(this.house, addressVO.house) && Intrinsics.d(this.action, addressVO.action);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final TextDTO getDeliveryVariantName() {
            return this.deliveryVariantName;
        }

        public final TextDTO getHouse() {
            return this.house;
        }

        @NotNull
        public final TextDTO getStreet() {
            return this.street;
        }

        public int hashCode() {
            int a11 = b.a(this.street, this.deliveryVariantName.hashCode() * 31, 31);
            TextDTO textDTO = this.house;
            int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            AtomAction atomAction = this.action;
            return hashCode + (atomAction != null ? atomAction.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.deliveryVariantName;
            TextDTO textDTO2 = this.street;
            TextDTO textDTO3 = this.house;
            AtomAction atomAction = this.action;
            StringBuilder g10 = D3.g.g("AddressVO(deliveryVariantName=", textDTO, ", street=", textDTO2, ", house=");
            g10.append(textDTO3);
            g10.append(", action=");
            g10.append(atomAction);
            g10.append(")");
            return g10.toString();
        }

        @NotNull
        public final AddressVO withAction(AtomAction action) {
            return copy$default(this, null, null, null, action, 7, null);
        }

        public /* synthetic */ AddressVO(TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, AtomAction atomAction, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(textDTO, textDTO2, textDTO3, (i11 & 8) != 0 ? null : atomAction);
        }
    }
}
