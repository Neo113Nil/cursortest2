package ru.ozon.android.messenger.framework.data.requests;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.DataButtonDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@com.squareup.moshi.j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003\u0015\u0016\u0017B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lru/ozon/android/messenger/framework/data/requests/CouponActionResponseDTO;", "", "data", "Lru/ozon/android/messenger/framework/data/requests/CouponActionResponseDTO$Data;", "error", "", "<init>", "(Lru/ozon/android/messenger/framework/data/requests/CouponActionResponseDTO$Data;Ljava/lang/String;)V", "getData", "()Lru/ozon/android/messenger/framework/data/requests/CouponActionResponseDTO$Data;", "getError", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Data", "CouponModalDTO", "AppAnimationDTO", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CouponActionResponseDTO {
    public static final int $stable = 8;
    private final Data data;
    private final String error;

    @com.squareup.moshi.j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/android/messenger/framework/data/requests/CouponActionResponseDTO$AppAnimationDTO;", "", "lottie", "", "backgroundLottie", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLottie", "()Ljava/lang/String;", "getBackgroundLottie", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AppAnimationDTO {
        public static final int $stable = 0;

        @NotNull
        private final String backgroundLottie;

        @NotNull
        private final String lottie;

        public AppAnimationDTO(@NotNull String lottie, @NotNull String backgroundLottie) {
            Intrinsics.checkNotNullParameter(lottie, "lottie");
            Intrinsics.checkNotNullParameter(backgroundLottie, "backgroundLottie");
            this.lottie = lottie;
            this.backgroundLottie = backgroundLottie;
        }

        public static /* synthetic */ AppAnimationDTO copy$default(AppAnimationDTO appAnimationDTO, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = appAnimationDTO.lottie;
            }
            if ((i11 & 2) != 0) {
                str2 = appAnimationDTO.backgroundLottie;
            }
            return appAnimationDTO.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getLottie() {
            return this.lottie;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getBackgroundLottie() {
            return this.backgroundLottie;
        }

        @NotNull
        public final AppAnimationDTO copy(@NotNull String lottie, @NotNull String backgroundLottie) {
            Intrinsics.checkNotNullParameter(lottie, "lottie");
            Intrinsics.checkNotNullParameter(backgroundLottie, "backgroundLottie");
            return new AppAnimationDTO(lottie, backgroundLottie);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AppAnimationDTO)) {
                return false;
            }
            AppAnimationDTO appAnimationDTO = (AppAnimationDTO) other;
            return Intrinsics.d(this.lottie, appAnimationDTO.lottie) && Intrinsics.d(this.backgroundLottie, appAnimationDTO.backgroundLottie);
        }

        @NotNull
        public final String getBackgroundLottie() {
            return this.backgroundLottie;
        }

        @NotNull
        public final String getLottie() {
            return this.lottie;
        }

        public int hashCode() {
            return this.backgroundLottie.hashCode() + (this.lottie.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return V.e.a("AppAnimationDTO(lottie=", this.lottie, ", backgroundLottie=", this.backgroundLottie, ")");
        }
    }

    @com.squareup.moshi.j(generateAdapter = true)
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J]\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, d2 = {"Lru/ozon/android/messenger/framework/data/requests/CouponActionResponseDTO$CouponModalDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "imageUrl", "", "animations", "Lru/ozon/android/messenger/framework/data/requests/CouponActionResponseDTO$AppAnimationDTO;", "button", "Lru/ozon/uni/atoms/data/controls/button/DataButtonDTO;", "trackingInfo", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lru/ozon/android/messenger/framework/data/requests/CouponActionResponseDTO$AppAnimationDTO;Lru/ozon/uni/atoms/data/controls/button/DataButtonDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getImageUrl", "()Ljava/lang/String;", "getAnimations", "()Lru/ozon/android/messenger/framework/data/requests/CouponActionResponseDTO$AppAnimationDTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/DataButtonDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CouponModalDTO {
        public static final int $stable = 8;
        private final AppAnimationDTO animations;
        private final DataButtonDTO button;
        private final String imageUrl;
        private final TextAtom subtitle;
        private final TextAtom title;
        private final Map<String, MessengerTrackingInfo> trackingInfo;

        public CouponModalDTO(TextAtom textAtom, TextAtom textAtom2, String str, AppAnimationDTO appAnimationDTO, DataButtonDTO dataButtonDTO, Map<String, MessengerTrackingInfo> map) {
            this.title = textAtom;
            this.subtitle = textAtom2;
            this.imageUrl = str;
            this.animations = appAnimationDTO;
            this.button = dataButtonDTO;
            this.trackingInfo = map;
        }

        public static /* synthetic */ CouponModalDTO copy$default(CouponModalDTO couponModalDTO, TextAtom textAtom, TextAtom textAtom2, String str, AppAnimationDTO appAnimationDTO, DataButtonDTO dataButtonDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = couponModalDTO.title;
            }
            if ((i11 & 2) != 0) {
                textAtom2 = couponModalDTO.subtitle;
            }
            if ((i11 & 4) != 0) {
                str = couponModalDTO.imageUrl;
            }
            if ((i11 & 8) != 0) {
                appAnimationDTO = couponModalDTO.animations;
            }
            if ((i11 & 16) != 0) {
                dataButtonDTO = couponModalDTO.button;
            }
            if ((i11 & 32) != 0) {
                map = couponModalDTO.trackingInfo;
            }
            DataButtonDTO dataButtonDTO2 = dataButtonDTO;
            Map map2 = map;
            return couponModalDTO.copy(textAtom, textAtom2, str, appAnimationDTO, dataButtonDTO2, map2);
        }

        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        /* renamed from: component4, reason: from getter */
        public final AppAnimationDTO getAnimations() {
            return this.animations;
        }

        /* renamed from: component5, reason: from getter */
        public final DataButtonDTO getButton() {
            return this.button;
        }

        public final Map<String, MessengerTrackingInfo> component6() {
            return this.trackingInfo;
        }

        @NotNull
        public final CouponModalDTO copy(TextAtom title, TextAtom subtitle, String imageUrl, AppAnimationDTO animations, DataButtonDTO button, Map<String, MessengerTrackingInfo> trackingInfo) {
            return new CouponModalDTO(title, subtitle, imageUrl, animations, button, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CouponModalDTO)) {
                return false;
            }
            CouponModalDTO couponModalDTO = (CouponModalDTO) other;
            return Intrinsics.d(this.title, couponModalDTO.title) && Intrinsics.d(this.subtitle, couponModalDTO.subtitle) && Intrinsics.d(this.imageUrl, couponModalDTO.imageUrl) && Intrinsics.d(this.animations, couponModalDTO.animations) && Intrinsics.d(this.button, couponModalDTO.button) && Intrinsics.d(this.trackingInfo, couponModalDTO.trackingInfo);
        }

        public final AppAnimationDTO getAnimations() {
            return this.animations;
        }

        public final DataButtonDTO getButton() {
            return this.button;
        }

        public final String getImageUrl() {
            return this.imageUrl;
        }

        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        public final TextAtom getTitle() {
            return this.title;
        }

        public final Map<String, MessengerTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            TextAtom textAtom = this.title;
            int hashCode = (textAtom == null ? 0 : textAtom.hashCode()) * 31;
            TextAtom textAtom2 = this.subtitle;
            int hashCode2 = (hashCode + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
            String str = this.imageUrl;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            AppAnimationDTO appAnimationDTO = this.animations;
            int hashCode4 = (hashCode3 + (appAnimationDTO == null ? 0 : appAnimationDTO.hashCode())) * 31;
            DataButtonDTO dataButtonDTO = this.button;
            int hashCode5 = (hashCode4 + (dataButtonDTO == null ? 0 : dataButtonDTO.hashCode())) * 31;
            Map<String, MessengerTrackingInfo> map = this.trackingInfo;
            return hashCode5 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.title;
            TextAtom textAtom2 = this.subtitle;
            String str = this.imageUrl;
            AppAnimationDTO appAnimationDTO = this.animations;
            DataButtonDTO dataButtonDTO = this.button;
            Map<String, MessengerTrackingInfo> map = this.trackingInfo;
            StringBuilder a11 = HY.a.a("CouponModalDTO(title=", textAtom, ", subtitle=", textAtom2, ", imageUrl=");
            a11.append(str);
            a11.append(", animations=");
            a11.append(appAnimationDTO);
            a11.append(", button=");
            a11.append(dataButtonDTO);
            a11.append(", trackingInfo=");
            a11.append(map);
            a11.append(")");
            return a11.toString();
        }
    }

    @com.squareup.moshi.j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/android/messenger/framework/data/requests/CouponActionResponseDTO$Data;", "", "modal", "Lru/ozon/android/messenger/framework/data/requests/CouponActionResponseDTO$CouponModalDTO;", "<init>", "(Lru/ozon/android/messenger/framework/data/requests/CouponActionResponseDTO$CouponModalDTO;)V", "getModal", "()Lru/ozon/android/messenger/framework/data/requests/CouponActionResponseDTO$CouponModalDTO;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Data {
        public static final int $stable = 8;

        @NotNull
        private final CouponModalDTO modal;

        public Data(@NotNull CouponModalDTO modal) {
            Intrinsics.checkNotNullParameter(modal, "modal");
            this.modal = modal;
        }

        public static /* synthetic */ Data copy$default(Data data, CouponModalDTO couponModalDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                couponModalDTO = data.modal;
            }
            return data.copy(couponModalDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CouponModalDTO getModal() {
            return this.modal;
        }

        @NotNull
        public final Data copy(@NotNull CouponModalDTO modal) {
            Intrinsics.checkNotNullParameter(modal, "modal");
            return new Data(modal);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Data) && Intrinsics.d(this.modal, ((Data) other).modal);
        }

        @NotNull
        public final CouponModalDTO getModal() {
            return this.modal;
        }

        public int hashCode() {
            return this.modal.hashCode();
        }

        @NotNull
        public String toString() {
            return "Data(modal=" + this.modal + ")";
        }
    }

    public CouponActionResponseDTO(Data data, String str) {
        this.data = data;
        this.error = str;
    }

    public static /* synthetic */ CouponActionResponseDTO copy$default(CouponActionResponseDTO couponActionResponseDTO, Data data, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            data = couponActionResponseDTO.data;
        }
        if ((i11 & 2) != 0) {
            str = couponActionResponseDTO.error;
        }
        return couponActionResponseDTO.copy(data, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    /* renamed from: component2, reason: from getter */
    public final String getError() {
        return this.error;
    }

    @NotNull
    public final CouponActionResponseDTO copy(Data data, String error) {
        return new CouponActionResponseDTO(data, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CouponActionResponseDTO)) {
            return false;
        }
        CouponActionResponseDTO couponActionResponseDTO = (CouponActionResponseDTO) other;
        return Intrinsics.d(this.data, couponActionResponseDTO.data) && Intrinsics.d(this.error, couponActionResponseDTO.error);
    }

    public final Data getData() {
        return this.data;
    }

    public final String getError() {
        return this.error;
    }

    public int hashCode() {
        Data data = this.data;
        int hashCode = (data == null ? 0 : data.hashCode()) * 31;
        String str = this.error;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CouponActionResponseDTO(data=" + this.data + ", error=" + this.error + ")";
    }
}
