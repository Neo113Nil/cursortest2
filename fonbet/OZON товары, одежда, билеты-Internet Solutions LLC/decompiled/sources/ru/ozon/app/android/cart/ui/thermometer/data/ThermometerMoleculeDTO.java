package ru.ozon.app.android.cart.ui.thermometer.data;

import Bi.b;
import C.o0;
import G.g;
import N3.C3660k;
import T7.Z;
import Ul.C4070a;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0003*+,BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003JY\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u000bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006-"}, d2 = {"Lru/ozon/app/android/cart/ui/thermometer/data/ThermometerMoleculeDTO;", "", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "thermometer", "Lru/ozon/app/android/cart/ui/thermometer/data/ThermometerMoleculeDTO$ThermometerDTO;", "cell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "backgroundColor", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/TestInfo;Lru/ozon/app/android/cart/ui/thermometer/data/ThermometerMoleculeDTO$ThermometerDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Ljava/util/Map;)V", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getThermometer", "()Lru/ozon/app/android/cart/ui/thermometer/data/ThermometerMoleculeDTO$ThermometerDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "ThermometerDTO", "StatusDTO", "ProgressDTO", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ThermometerMoleculeDTO {
    private final AtomActionDTO action;
    private final String backgroundColor;

    @NotNull
    private final CellDTO cell;
    private final TestInfo testInfo;

    @NotNull
    private final ThermometerDTO thermometer;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J.\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/cart/ui/thermometer/data/ThermometerMoleculeDTO$ProgressDTO;", "", "progress", "", "ringProgressColor", "", "ringBackgroundColor", "<init>", "(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;)V", "getProgress", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getRingProgressColor", "()Ljava/lang/String;", "getRingBackgroundColor", "component1", "component2", "component3", "copy", "(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/cart/ui/thermometer/data/ThermometerMoleculeDTO$ProgressDTO;", "equals", "", "other", "hashCode", "", "toString", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProgressDTO {
        private final Float progress;

        @NotNull
        private final String ringBackgroundColor;

        @NotNull
        private final String ringProgressColor;

        public ProgressDTO(Float f7, @NotNull String ringProgressColor, @NotNull String ringBackgroundColor) {
            Intrinsics.checkNotNullParameter(ringProgressColor, "ringProgressColor");
            Intrinsics.checkNotNullParameter(ringBackgroundColor, "ringBackgroundColor");
            this.progress = f7;
            this.ringProgressColor = ringProgressColor;
            this.ringBackgroundColor = ringBackgroundColor;
        }

        public static /* synthetic */ ProgressDTO copy$default(ProgressDTO progressDTO, Float f7, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f7 = progressDTO.progress;
            }
            if ((i11 & 2) != 0) {
                str = progressDTO.ringProgressColor;
            }
            if ((i11 & 4) != 0) {
                str2 = progressDTO.ringBackgroundColor;
            }
            return progressDTO.copy(f7, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final Float getProgress() {
            return this.progress;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getRingProgressColor() {
            return this.ringProgressColor;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getRingBackgroundColor() {
            return this.ringBackgroundColor;
        }

        @NotNull
        public final ProgressDTO copy(Float progress, @NotNull String ringProgressColor, @NotNull String ringBackgroundColor) {
            Intrinsics.checkNotNullParameter(ringProgressColor, "ringProgressColor");
            Intrinsics.checkNotNullParameter(ringBackgroundColor, "ringBackgroundColor");
            return new ProgressDTO(progress, ringProgressColor, ringBackgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProgressDTO)) {
                return false;
            }
            ProgressDTO progressDTO = (ProgressDTO) other;
            return Intrinsics.d(this.progress, progressDTO.progress) && Intrinsics.d(this.ringProgressColor, progressDTO.ringProgressColor) && Intrinsics.d(this.ringBackgroundColor, progressDTO.ringBackgroundColor);
        }

        public final Float getProgress() {
            return this.progress;
        }

        @NotNull
        public final String getRingBackgroundColor() {
            return this.ringBackgroundColor;
        }

        @NotNull
        public final String getRingProgressColor() {
            return this.ringProgressColor;
        }

        public int hashCode() {
            Float f7 = this.progress;
            return this.ringBackgroundColor.hashCode() + g.a((f7 == null ? 0 : f7.hashCode()) * 31, 31, this.ringProgressColor);
        }

        @NotNull
        public String toString() {
            Float f7 = this.progress;
            String str = this.ringProgressColor;
            String str2 = this.ringBackgroundColor;
            StringBuilder sb2 = new StringBuilder("ProgressDTO(progress=");
            sb2.append(f7);
            sb2.append(", ringProgressColor=");
            sb2.append(str);
            sb2.append(", ringBackgroundColor=");
            return o0.c(sb2, str2, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/cart/ui/thermometer/data/ThermometerMoleculeDTO$StatusDTO;", "", "icon", "", "iconColor", "circleColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIcon", "()Ljava/lang/String;", "getIconColor", "getCircleColor", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StatusDTO {
        private final String circleColor;

        @NotNull
        private final String icon;
        private final String iconColor;

        public StatusDTO(@NotNull String icon, String str, String str2) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.icon = icon;
            this.iconColor = str;
            this.circleColor = str2;
        }

        public static /* synthetic */ StatusDTO copy$default(StatusDTO statusDTO, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = statusDTO.icon;
            }
            if ((i11 & 2) != 0) {
                str2 = statusDTO.iconColor;
            }
            if ((i11 & 4) != 0) {
                str3 = statusDTO.circleColor;
            }
            return statusDTO.copy(str, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* renamed from: component2, reason: from getter */
        public final String getIconColor() {
            return this.iconColor;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCircleColor() {
            return this.circleColor;
        }

        @NotNull
        public final StatusDTO copy(@NotNull String icon, String iconColor, String circleColor) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new StatusDTO(icon, iconColor, circleColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StatusDTO)) {
                return false;
            }
            StatusDTO statusDTO = (StatusDTO) other;
            return Intrinsics.d(this.icon, statusDTO.icon) && Intrinsics.d(this.iconColor, statusDTO.iconColor) && Intrinsics.d(this.circleColor, statusDTO.circleColor);
        }

        public final String getCircleColor() {
            return this.circleColor;
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        public final String getIconColor() {
            return this.iconColor;
        }

        public int hashCode() {
            int hashCode = this.icon.hashCode() * 31;
            String str = this.iconColor;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.circleColor;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.icon;
            String str2 = this.iconColor;
            return o0.c(C3660k.d("StatusDTO(icon=", str, ", iconColor=", str2, ", circleColor="), this.circleColor, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J<\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/cart/ui/thermometer/data/ThermometerMoleculeDTO$ThermometerDTO;", "", "progress", "Lru/ozon/app/android/cart/ui/thermometer/data/ThermometerMoleculeDTO$ProgressDTO;", "status", "Lru/ozon/app/android/cart/ui/thermometer/data/ThermometerMoleculeDTO$StatusDTO;", "verticalPadding", "", "horizontalPadding", "<init>", "(Lru/ozon/app/android/cart/ui/thermometer/data/ThermometerMoleculeDTO$ProgressDTO;Lru/ozon/app/android/cart/ui/thermometer/data/ThermometerMoleculeDTO$StatusDTO;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getProgress", "()Lru/ozon/app/android/cart/ui/thermometer/data/ThermometerMoleculeDTO$ProgressDTO;", "getStatus", "()Lru/ozon/app/android/cart/ui/thermometer/data/ThermometerMoleculeDTO$StatusDTO;", "getVerticalPadding", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHorizontalPadding", "component1", "component2", "component3", "component4", "copy", "(Lru/ozon/app/android/cart/ui/thermometer/data/ThermometerMoleculeDTO$ProgressDTO;Lru/ozon/app/android/cart/ui/thermometer/data/ThermometerMoleculeDTO$StatusDTO;Ljava/lang/Integer;Ljava/lang/Integer;)Lru/ozon/app/android/cart/ui/thermometer/data/ThermometerMoleculeDTO$ThermometerDTO;", "equals", "", "other", "hashCode", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ThermometerDTO {
        private final Integer horizontalPadding;

        @NotNull
        private final ProgressDTO progress;
        private final StatusDTO status;
        private final Integer verticalPadding;

        public ThermometerDTO(@NotNull ProgressDTO progress, StatusDTO statusDTO, Integer num, Integer num2) {
            Intrinsics.checkNotNullParameter(progress, "progress");
            this.progress = progress;
            this.status = statusDTO;
            this.verticalPadding = num;
            this.horizontalPadding = num2;
        }

        public static /* synthetic */ ThermometerDTO copy$default(ThermometerDTO thermometerDTO, ProgressDTO progressDTO, StatusDTO statusDTO, Integer num, Integer num2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                progressDTO = thermometerDTO.progress;
            }
            if ((i11 & 2) != 0) {
                statusDTO = thermometerDTO.status;
            }
            if ((i11 & 4) != 0) {
                num = thermometerDTO.verticalPadding;
            }
            if ((i11 & 8) != 0) {
                num2 = thermometerDTO.horizontalPadding;
            }
            return thermometerDTO.copy(progressDTO, statusDTO, num, num2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ProgressDTO getProgress() {
            return this.progress;
        }

        /* renamed from: component2, reason: from getter */
        public final StatusDTO getStatus() {
            return this.status;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getVerticalPadding() {
            return this.verticalPadding;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getHorizontalPadding() {
            return this.horizontalPadding;
        }

        @NotNull
        public final ThermometerDTO copy(@NotNull ProgressDTO progress, StatusDTO status, Integer verticalPadding, Integer horizontalPadding) {
            Intrinsics.checkNotNullParameter(progress, "progress");
            return new ThermometerDTO(progress, status, verticalPadding, horizontalPadding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ThermometerDTO)) {
                return false;
            }
            ThermometerDTO thermometerDTO = (ThermometerDTO) other;
            return Intrinsics.d(this.progress, thermometerDTO.progress) && Intrinsics.d(this.status, thermometerDTO.status) && Intrinsics.d(this.verticalPadding, thermometerDTO.verticalPadding) && Intrinsics.d(this.horizontalPadding, thermometerDTO.horizontalPadding);
        }

        public final Integer getHorizontalPadding() {
            return this.horizontalPadding;
        }

        @NotNull
        public final ProgressDTO getProgress() {
            return this.progress;
        }

        public final StatusDTO getStatus() {
            return this.status;
        }

        public final Integer getVerticalPadding() {
            return this.verticalPadding;
        }

        public int hashCode() {
            int hashCode = this.progress.hashCode() * 31;
            StatusDTO statusDTO = this.status;
            int hashCode2 = (hashCode + (statusDTO == null ? 0 : statusDTO.hashCode())) * 31;
            Integer num = this.verticalPadding;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.horizontalPadding;
            return hashCode3 + (num2 != null ? num2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ProgressDTO progressDTO = this.progress;
            StatusDTO statusDTO = this.status;
            Integer num = this.verticalPadding;
            Integer num2 = this.horizontalPadding;
            StringBuilder sb2 = new StringBuilder("ThermometerDTO(progress=");
            sb2.append(progressDTO);
            sb2.append(", status=");
            sb2.append(statusDTO);
            sb2.append(", verticalPadding=");
            return Z.c(sb2, num, ", horizontalPadding=", num2, ")");
        }
    }

    public ThermometerMoleculeDTO(TestInfo testInfo, @NotNull ThermometerDTO thermometer, @NotNull CellDTO cell, AtomActionDTO atomActionDTO, String str, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(thermometer, "thermometer");
        Intrinsics.checkNotNullParameter(cell, "cell");
        this.testInfo = testInfo;
        this.thermometer = thermometer;
        this.cell = cell;
        this.action = atomActionDTO;
        this.backgroundColor = str;
        this.trackingInfo = map;
    }

    public static /* synthetic */ ThermometerMoleculeDTO copy$default(ThermometerMoleculeDTO thermometerMoleculeDTO, TestInfo testInfo, ThermometerDTO thermometerDTO, CellDTO cellDTO, AtomActionDTO atomActionDTO, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            testInfo = thermometerMoleculeDTO.testInfo;
        }
        if ((i11 & 2) != 0) {
            thermometerDTO = thermometerMoleculeDTO.thermometer;
        }
        if ((i11 & 4) != 0) {
            cellDTO = thermometerMoleculeDTO.cell;
        }
        if ((i11 & 8) != 0) {
            atomActionDTO = thermometerMoleculeDTO.action;
        }
        if ((i11 & 16) != 0) {
            str = thermometerMoleculeDTO.backgroundColor;
        }
        if ((i11 & 32) != 0) {
            map = thermometerMoleculeDTO.trackingInfo;
        }
        String str2 = str;
        Map map2 = map;
        return thermometerMoleculeDTO.copy(testInfo, thermometerDTO, cellDTO, atomActionDTO, str2, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ThermometerDTO getThermometer() {
        return this.thermometer;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final CellDTO getCell() {
        return this.cell;
    }

    /* renamed from: component4, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final ThermometerMoleculeDTO copy(TestInfo testInfo, @NotNull ThermometerDTO thermometer, @NotNull CellDTO cell, AtomActionDTO action, String backgroundColor, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(thermometer, "thermometer");
        Intrinsics.checkNotNullParameter(cell, "cell");
        return new ThermometerMoleculeDTO(testInfo, thermometer, cell, action, backgroundColor, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThermometerMoleculeDTO)) {
            return false;
        }
        ThermometerMoleculeDTO thermometerMoleculeDTO = (ThermometerMoleculeDTO) other;
        return Intrinsics.d(this.testInfo, thermometerMoleculeDTO.testInfo) && Intrinsics.d(this.thermometer, thermometerMoleculeDTO.thermometer) && Intrinsics.d(this.cell, thermometerMoleculeDTO.cell) && Intrinsics.d(this.action, thermometerMoleculeDTO.action) && Intrinsics.d(this.backgroundColor, thermometerMoleculeDTO.backgroundColor) && Intrinsics.d(this.trackingInfo, thermometerMoleculeDTO.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final ThermometerDTO getThermometer() {
        return this.thermometer;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        TestInfo testInfo = this.testInfo;
        int c11 = b.c(this.cell, (this.thermometer.hashCode() + ((testInfo == null ? 0 : testInfo.hashCode()) * 31)) * 31, 31);
        AtomActionDTO atomActionDTO = this.action;
        int hashCode = (c11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TestInfo testInfo = this.testInfo;
        ThermometerDTO thermometerDTO = this.thermometer;
        CellDTO cellDTO = this.cell;
        AtomActionDTO atomActionDTO = this.action;
        String str = this.backgroundColor;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("ThermometerMoleculeDTO(testInfo=");
        sb2.append(testInfo);
        sb2.append(", thermometer=");
        sb2.append(thermometerDTO);
        sb2.append(", cell=");
        sb2.append(cellDTO);
        sb2.append(", action=");
        sb2.append(atomActionDTO);
        sb2.append(", backgroundColor=");
        return C4070a.a(sb2, str, ", trackingInfo=", map, ")");
    }
}
