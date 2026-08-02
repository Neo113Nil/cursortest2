package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.data;

import C.o0;
import G.g;
import K1.G;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003\"#$B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\b\b\u0003\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/data/DeliveryWidgetV2DTO;", "", "lifetime", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "state", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/data/DeliveryWidgetV2DTO$StateDTO;", "availableDeliverySchemas", "", "", "<init>", "(FLjava/util/Map;Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/data/DeliveryWidgetV2DTO$StateDTO;Ljava/util/List;)V", "getLifetime", "()F", "getTrackingInfo", "()Ljava/util/Map;", "getState", "()Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/data/DeliveryWidgetV2DTO$StateDTO;", "getAvailableDeliverySchemas", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ProgressDTO", "MethodDTO", "StateDTO", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DeliveryWidgetV2DTO {
    public static final int $stable = 8;

    @NotNull
    private final List<Long> availableDeliverySchemas;
    private final float lifetime;

    @NotNull
    private final StateDTO state;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/data/DeliveryWidgetV2DTO$MethodDTO;", "", "<init>", "(Ljava/lang/String;I)V", "GROSS", "NON_GROSS", "UNDEFINED", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MethodDTO {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ MethodDTO[] $VALUES;

        @i(name = "GROSS")
        public static final MethodDTO GROSS = new MethodDTO("GROSS", 0);

        @i(name = "NON_GROSS")
        public static final MethodDTO NON_GROSS = new MethodDTO("NON_GROSS", 1);

        @i(name = "UNDEFINE")
        public static final MethodDTO UNDEFINED = new MethodDTO("UNDEFINED", 2);

        private static final /* synthetic */ MethodDTO[] $values() {
            return new MethodDTO[]{GROSS, NON_GROSS, UNDEFINED};
        }

        static {
            MethodDTO[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private MethodDTO(String str, int i11) {
        }

        public static MethodDTO valueOf(String str) {
            return (MethodDTO) Enum.valueOf(MethodDTO.class, str);
        }

        public static MethodDTO[] values() {
            return (MethodDTO[]) $VALUES.clone();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J.\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/data/DeliveryWidgetV2DTO$ProgressDTO;", "", "progress", "", "ringProgressColor", "", "ringBackgroundColor", "<init>", "(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;)V", "getProgress", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getRingProgressColor", "()Ljava/lang/String;", "getRingBackgroundColor", "component1", "component2", "component3", "copy", "(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/data/DeliveryWidgetV2DTO$ProgressDTO;", "equals", "", "other", "hashCode", "", "toString", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProgressDTO {
        public static final int $stable = 0;
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

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/data/DeliveryWidgetV2DTO$StateDTO;", "", "<init>", "()V", "HiddenDTO", "SellerDTO", "OzonDTO", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/data/DeliveryWidgetV2DTO$StateDTO$HiddenDTO;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/data/DeliveryWidgetV2DTO$StateDTO$OzonDTO;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/data/DeliveryWidgetV2DTO$StateDTO$SellerDTO;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class StateDTO {
        public static final int $stable = 0;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/data/DeliveryWidgetV2DTO$StateDTO$HiddenDTO;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/data/DeliveryWidgetV2DTO$StateDTO;", "<init>", "()V", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class HiddenDTO extends StateDTO {
            public static final int $stable = 0;

            public HiddenDTO() {
                super(null);
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\u000eHÆ\u0003J\t\u0010*\u001a\u00020\u0010HÆ\u0003Jc\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00063"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/data/DeliveryWidgetV2DTO$StateDTO$OzonDTO;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/data/DeliveryWidgetV2DTO$StateDTO;", "method", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/data/DeliveryWidgetV2DTO$MethodDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "progress", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/data/DeliveryWidgetV2DTO$ProgressDTO;", "statusIcon", "", "statusIconColor", "statusCircleColor", "infoIcon", "Lru/ozon/uni/atoms/data/button/Icon;", "onWidgetClickAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/data/DeliveryWidgetV2DTO$MethodDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/data/DeliveryWidgetV2DTO$ProgressDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getMethod", "()Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/data/DeliveryWidgetV2DTO$MethodDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getProgress", "()Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/data/DeliveryWidgetV2DTO$ProgressDTO;", "getStatusIcon", "()Ljava/lang/String;", "getStatusIconColor", "getStatusCircleColor", "getInfoIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getOnWidgetClickAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OzonDTO extends StateDTO {
            public static final int $stable = Icon.$stable;

            @NotNull
            private final Icon infoIcon;

            @NotNull
            private final MethodDTO method;

            @NotNull
            private final AtomActionDTO onWidgetClickAction;

            @NotNull
            private final ProgressDTO progress;

            @NotNull
            private final String statusCircleColor;

            @NotNull
            private final String statusIcon;

            @NotNull
            private final String statusIconColor;

            @NotNull
            private final TextDTO subtitle;

            @NotNull
            private final TextDTO title;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OzonDTO(@NotNull MethodDTO method, @NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull ProgressDTO progress, @NotNull String statusIcon, @NotNull String statusIconColor, @NotNull String statusCircleColor, @NotNull Icon infoIcon, @NotNull AtomActionDTO onWidgetClickAction) {
                super(null);
                Intrinsics.checkNotNullParameter(method, "method");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(progress, "progress");
                Intrinsics.checkNotNullParameter(statusIcon, "statusIcon");
                Intrinsics.checkNotNullParameter(statusIconColor, "statusIconColor");
                Intrinsics.checkNotNullParameter(statusCircleColor, "statusCircleColor");
                Intrinsics.checkNotNullParameter(infoIcon, "infoIcon");
                Intrinsics.checkNotNullParameter(onWidgetClickAction, "onWidgetClickAction");
                this.method = method;
                this.title = title;
                this.subtitle = subtitle;
                this.progress = progress;
                this.statusIcon = statusIcon;
                this.statusIconColor = statusIconColor;
                this.statusCircleColor = statusCircleColor;
                this.infoIcon = infoIcon;
                this.onWidgetClickAction = onWidgetClickAction;
            }

            public static /* synthetic */ OzonDTO copy$default(OzonDTO ozonDTO, MethodDTO methodDTO, TextDTO textDTO, TextDTO textDTO2, ProgressDTO progressDTO, String str, String str2, String str3, Icon icon, AtomActionDTO atomActionDTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    methodDTO = ozonDTO.method;
                }
                if ((i11 & 2) != 0) {
                    textDTO = ozonDTO.title;
                }
                if ((i11 & 4) != 0) {
                    textDTO2 = ozonDTO.subtitle;
                }
                if ((i11 & 8) != 0) {
                    progressDTO = ozonDTO.progress;
                }
                if ((i11 & 16) != 0) {
                    str = ozonDTO.statusIcon;
                }
                if ((i11 & 32) != 0) {
                    str2 = ozonDTO.statusIconColor;
                }
                if ((i11 & 64) != 0) {
                    str3 = ozonDTO.statusCircleColor;
                }
                if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    icon = ozonDTO.infoIcon;
                }
                if ((i11 & 256) != 0) {
                    atomActionDTO = ozonDTO.onWidgetClickAction;
                }
                Icon icon2 = icon;
                AtomActionDTO atomActionDTO2 = atomActionDTO;
                String str4 = str2;
                String str5 = str3;
                String str6 = str;
                TextDTO textDTO3 = textDTO2;
                return ozonDTO.copy(methodDTO, textDTO, textDTO3, progressDTO, str6, str4, str5, icon2, atomActionDTO2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final MethodDTO getMethod() {
                return this.method;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final TextDTO getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final TextDTO getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final ProgressDTO getProgress() {
                return this.progress;
            }

            @NotNull
            /* renamed from: component5, reason: from getter */
            public final String getStatusIcon() {
                return this.statusIcon;
            }

            @NotNull
            /* renamed from: component6, reason: from getter */
            public final String getStatusIconColor() {
                return this.statusIconColor;
            }

            @NotNull
            /* renamed from: component7, reason: from getter */
            public final String getStatusCircleColor() {
                return this.statusCircleColor;
            }

            @NotNull
            /* renamed from: component8, reason: from getter */
            public final Icon getInfoIcon() {
                return this.infoIcon;
            }

            @NotNull
            /* renamed from: component9, reason: from getter */
            public final AtomActionDTO getOnWidgetClickAction() {
                return this.onWidgetClickAction;
            }

            @NotNull
            public final OzonDTO copy(@NotNull MethodDTO method, @NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull ProgressDTO progress, @NotNull String statusIcon, @NotNull String statusIconColor, @NotNull String statusCircleColor, @NotNull Icon infoIcon, @NotNull AtomActionDTO onWidgetClickAction) {
                Intrinsics.checkNotNullParameter(method, "method");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(progress, "progress");
                Intrinsics.checkNotNullParameter(statusIcon, "statusIcon");
                Intrinsics.checkNotNullParameter(statusIconColor, "statusIconColor");
                Intrinsics.checkNotNullParameter(statusCircleColor, "statusCircleColor");
                Intrinsics.checkNotNullParameter(infoIcon, "infoIcon");
                Intrinsics.checkNotNullParameter(onWidgetClickAction, "onWidgetClickAction");
                return new OzonDTO(method, title, subtitle, progress, statusIcon, statusIconColor, statusCircleColor, infoIcon, onWidgetClickAction);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OzonDTO)) {
                    return false;
                }
                OzonDTO ozonDTO = (OzonDTO) other;
                return this.method == ozonDTO.method && Intrinsics.d(this.title, ozonDTO.title) && Intrinsics.d(this.subtitle, ozonDTO.subtitle) && Intrinsics.d(this.progress, ozonDTO.progress) && Intrinsics.d(this.statusIcon, ozonDTO.statusIcon) && Intrinsics.d(this.statusIconColor, ozonDTO.statusIconColor) && Intrinsics.d(this.statusCircleColor, ozonDTO.statusCircleColor) && Intrinsics.d(this.infoIcon, ozonDTO.infoIcon) && Intrinsics.d(this.onWidgetClickAction, ozonDTO.onWidgetClickAction);
            }

            @NotNull
            public final Icon getInfoIcon() {
                return this.infoIcon;
            }

            @NotNull
            public final MethodDTO getMethod() {
                return this.method;
            }

            @NotNull
            public final AtomActionDTO getOnWidgetClickAction() {
                return this.onWidgetClickAction;
            }

            @NotNull
            public final ProgressDTO getProgress() {
                return this.progress;
            }

            @NotNull
            public final String getStatusCircleColor() {
                return this.statusCircleColor;
            }

            @NotNull
            public final String getStatusIcon() {
                return this.statusIcon;
            }

            @NotNull
            public final String getStatusIconColor() {
                return this.statusIconColor;
            }

            @NotNull
            public final TextDTO getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.onWidgetClickAction.hashCode() + Lc.a.a(this.infoIcon, g.a(g.a(g.a((this.progress.hashCode() + Ns.b.a(this.subtitle, Ns.b.a(this.title, this.method.hashCode() * 31, 31), 31)) * 31, 31, this.statusIcon), 31, this.statusIconColor), 31, this.statusCircleColor), 31);
            }

            @NotNull
            public String toString() {
                MethodDTO methodDTO = this.method;
                TextDTO textDTO = this.title;
                TextDTO textDTO2 = this.subtitle;
                ProgressDTO progressDTO = this.progress;
                String str = this.statusIcon;
                String str2 = this.statusIconColor;
                String str3 = this.statusCircleColor;
                Icon icon = this.infoIcon;
                AtomActionDTO atomActionDTO = this.onWidgetClickAction;
                StringBuilder sb2 = new StringBuilder("OzonDTO(method=");
                sb2.append(methodDTO);
                sb2.append(", title=");
                sb2.append(textDTO);
                sb2.append(", subtitle=");
                sb2.append(textDTO2);
                sb2.append(", progress=");
                sb2.append(progressDTO);
                sb2.append(", statusIcon=");
                Nh.a.h(sb2, str, ", statusIconColor=", str2, ", statusCircleColor=");
                sb2.append(str3);
                sb2.append(", infoIcon=");
                sb2.append(icon);
                sb2.append(", onWidgetClickAction=");
                return G.c(sb2, atomActionDTO, ")");
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\t\u0010+\u001a\u00020\u000eHÆ\u0003J\t\u0010,\u001a\u00020\u0010HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jo\u0010.\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"¨\u00066"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/data/DeliveryWidgetV2DTO$StateDTO$SellerDTO;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/data/DeliveryWidgetV2DTO$StateDTO;", "sellerId", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "progress", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/data/DeliveryWidgetV2DTO$ProgressDTO;", "statusIcon", "", "statusIconColor", "statusCircleColor", "infoIcon", "Lru/ozon/uni/atoms/data/button/Icon;", "onWidgetClickAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "forceAction", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/data/DeliveryWidgetV2DTO$ProgressDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getSellerId", "()J", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getProgress", "()Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/data/DeliveryWidgetV2DTO$ProgressDTO;", "getStatusIcon", "()Ljava/lang/String;", "getStatusIconColor", "getStatusCircleColor", "getInfoIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getOnWidgetClickAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getForceAction", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "", "hashCode", "", "toString", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SellerDTO extends StateDTO {
            public static final int $stable = Icon.$stable;
            private final AtomActionDTO forceAction;

            @NotNull
            private final Icon infoIcon;

            @NotNull
            private final AtomActionDTO onWidgetClickAction;

            @NotNull
            private final ProgressDTO progress;
            private final long sellerId;

            @NotNull
            private final String statusCircleColor;

            @NotNull
            private final String statusIcon;

            @NotNull
            private final String statusIconColor;

            @NotNull
            private final TextDTO subtitle;

            @NotNull
            private final TextDTO title;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SellerDTO(@i(name = "sellerID") long j11, @NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull ProgressDTO progress, @NotNull String statusIcon, @NotNull String statusIconColor, @NotNull String statusCircleColor, @NotNull Icon infoIcon, @NotNull AtomActionDTO onWidgetClickAction, AtomActionDTO atomActionDTO) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(progress, "progress");
                Intrinsics.checkNotNullParameter(statusIcon, "statusIcon");
                Intrinsics.checkNotNullParameter(statusIconColor, "statusIconColor");
                Intrinsics.checkNotNullParameter(statusCircleColor, "statusCircleColor");
                Intrinsics.checkNotNullParameter(infoIcon, "infoIcon");
                Intrinsics.checkNotNullParameter(onWidgetClickAction, "onWidgetClickAction");
                this.sellerId = j11;
                this.title = title;
                this.subtitle = subtitle;
                this.progress = progress;
                this.statusIcon = statusIcon;
                this.statusIconColor = statusIconColor;
                this.statusCircleColor = statusCircleColor;
                this.infoIcon = infoIcon;
                this.onWidgetClickAction = onWidgetClickAction;
                this.forceAction = atomActionDTO;
            }

            public static /* synthetic */ SellerDTO copy$default(SellerDTO sellerDTO, long j11, TextDTO textDTO, TextDTO textDTO2, ProgressDTO progressDTO, String str, String str2, String str3, Icon icon, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    j11 = sellerDTO.sellerId;
                }
                long j12 = j11;
                if ((i11 & 2) != 0) {
                    textDTO = sellerDTO.title;
                }
                return sellerDTO.copy(j12, textDTO, (i11 & 4) != 0 ? sellerDTO.subtitle : textDTO2, (i11 & 8) != 0 ? sellerDTO.progress : progressDTO, (i11 & 16) != 0 ? sellerDTO.statusIcon : str, (i11 & 32) != 0 ? sellerDTO.statusIconColor : str2, (i11 & 64) != 0 ? sellerDTO.statusCircleColor : str3, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? sellerDTO.infoIcon : icon, (i11 & 256) != 0 ? sellerDTO.onWidgetClickAction : atomActionDTO, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? sellerDTO.forceAction : atomActionDTO2);
            }

            /* renamed from: component1, reason: from getter */
            public final long getSellerId() {
                return this.sellerId;
            }

            /* renamed from: component10, reason: from getter */
            public final AtomActionDTO getForceAction() {
                return this.forceAction;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final TextDTO getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final TextDTO getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final ProgressDTO getProgress() {
                return this.progress;
            }

            @NotNull
            /* renamed from: component5, reason: from getter */
            public final String getStatusIcon() {
                return this.statusIcon;
            }

            @NotNull
            /* renamed from: component6, reason: from getter */
            public final String getStatusIconColor() {
                return this.statusIconColor;
            }

            @NotNull
            /* renamed from: component7, reason: from getter */
            public final String getStatusCircleColor() {
                return this.statusCircleColor;
            }

            @NotNull
            /* renamed from: component8, reason: from getter */
            public final Icon getInfoIcon() {
                return this.infoIcon;
            }

            @NotNull
            /* renamed from: component9, reason: from getter */
            public final AtomActionDTO getOnWidgetClickAction() {
                return this.onWidgetClickAction;
            }

            @NotNull
            public final SellerDTO copy(@i(name = "sellerID") long sellerId, @NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull ProgressDTO progress, @NotNull String statusIcon, @NotNull String statusIconColor, @NotNull String statusCircleColor, @NotNull Icon infoIcon, @NotNull AtomActionDTO onWidgetClickAction, AtomActionDTO forceAction) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(progress, "progress");
                Intrinsics.checkNotNullParameter(statusIcon, "statusIcon");
                Intrinsics.checkNotNullParameter(statusIconColor, "statusIconColor");
                Intrinsics.checkNotNullParameter(statusCircleColor, "statusCircleColor");
                Intrinsics.checkNotNullParameter(infoIcon, "infoIcon");
                Intrinsics.checkNotNullParameter(onWidgetClickAction, "onWidgetClickAction");
                return new SellerDTO(sellerId, title, subtitle, progress, statusIcon, statusIconColor, statusCircleColor, infoIcon, onWidgetClickAction, forceAction);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SellerDTO)) {
                    return false;
                }
                SellerDTO sellerDTO = (SellerDTO) other;
                return this.sellerId == sellerDTO.sellerId && Intrinsics.d(this.title, sellerDTO.title) && Intrinsics.d(this.subtitle, sellerDTO.subtitle) && Intrinsics.d(this.progress, sellerDTO.progress) && Intrinsics.d(this.statusIcon, sellerDTO.statusIcon) && Intrinsics.d(this.statusIconColor, sellerDTO.statusIconColor) && Intrinsics.d(this.statusCircleColor, sellerDTO.statusCircleColor) && Intrinsics.d(this.infoIcon, sellerDTO.infoIcon) && Intrinsics.d(this.onWidgetClickAction, sellerDTO.onWidgetClickAction) && Intrinsics.d(this.forceAction, sellerDTO.forceAction);
            }

            public final AtomActionDTO getForceAction() {
                return this.forceAction;
            }

            @NotNull
            public final Icon getInfoIcon() {
                return this.infoIcon;
            }

            @NotNull
            public final AtomActionDTO getOnWidgetClickAction() {
                return this.onWidgetClickAction;
            }

            @NotNull
            public final ProgressDTO getProgress() {
                return this.progress;
            }

            public final long getSellerId() {
                return this.sellerId;
            }

            @NotNull
            public final String getStatusCircleColor() {
                return this.statusCircleColor;
            }

            @NotNull
            public final String getStatusIcon() {
                return this.statusIcon;
            }

            @NotNull
            public final String getStatusIconColor() {
                return this.statusIconColor;
            }

            @NotNull
            public final TextDTO getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            public int hashCode() {
                int b11 = Ih.a.b(this.onWidgetClickAction, Lc.a.a(this.infoIcon, g.a(g.a(g.a((this.progress.hashCode() + Ns.b.a(this.subtitle, Ns.b.a(this.title, Long.hashCode(this.sellerId) * 31, 31), 31)) * 31, 31, this.statusIcon), 31, this.statusIconColor), 31, this.statusCircleColor), 31), 31);
                AtomActionDTO atomActionDTO = this.forceAction;
                return b11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode());
            }

            @NotNull
            public String toString() {
                long j11 = this.sellerId;
                TextDTO textDTO = this.title;
                TextDTO textDTO2 = this.subtitle;
                ProgressDTO progressDTO = this.progress;
                String str = this.statusIcon;
                String str2 = this.statusIconColor;
                String str3 = this.statusCircleColor;
                Icon icon = this.infoIcon;
                AtomActionDTO atomActionDTO = this.onWidgetClickAction;
                AtomActionDTO atomActionDTO2 = this.forceAction;
                StringBuilder b11 = TY.a.b("SellerDTO(sellerId=", j11, ", title=", textDTO);
                b11.append(", subtitle=");
                b11.append(textDTO2);
                b11.append(", progress=");
                b11.append(progressDTO);
                Nh.a.h(b11, ", statusIcon=", str, ", statusIconColor=", str2);
                b11.append(", statusCircleColor=");
                b11.append(str3);
                b11.append(", infoIcon=");
                b11.append(icon);
                b11.append(", onWidgetClickAction=");
                b11.append(atomActionDTO);
                b11.append(", forceAction=");
                b11.append(atomActionDTO2);
                b11.append(")");
                return b11.toString();
            }
        }

        public /* synthetic */ StateDTO(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateDTO() {
        }
    }

    public DeliveryWidgetV2DTO(float f7, Map<String, TokenizedTrackingInfo> map, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "deliveryOzon", type = StateDTO.OzonDTO.class), @ProtoOneOfSignature(name = "deliverySeller", type = StateDTO.SellerDTO.class), @ProtoOneOfSignature(name = "hiddenState", type = StateDTO.HiddenDTO.class)}) @NotNull @ProtoOneOf(label = "type") StateDTO state, @NotNull List<Long> availableDeliverySchemas) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(availableDeliverySchemas, "availableDeliverySchemas");
        this.lifetime = f7;
        this.trackingInfo = map;
        this.state = state;
        this.availableDeliverySchemas = availableDeliverySchemas;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeliveryWidgetV2DTO copy$default(DeliveryWidgetV2DTO deliveryWidgetV2DTO, float f7, Map map, StateDTO stateDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f7 = deliveryWidgetV2DTO.lifetime;
        }
        if ((i11 & 2) != 0) {
            map = deliveryWidgetV2DTO.trackingInfo;
        }
        if ((i11 & 4) != 0) {
            stateDTO = deliveryWidgetV2DTO.state;
        }
        if ((i11 & 8) != 0) {
            list = deliveryWidgetV2DTO.availableDeliverySchemas;
        }
        return deliveryWidgetV2DTO.copy(f7, map, stateDTO, list);
    }

    /* renamed from: component1, reason: from getter */
    public final float getLifetime() {
        return this.lifetime;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.trackingInfo;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final StateDTO getState() {
        return this.state;
    }

    @NotNull
    public final List<Long> component4() {
        return this.availableDeliverySchemas;
    }

    @NotNull
    public final DeliveryWidgetV2DTO copy(float lifetime, Map<String, TokenizedTrackingInfo> trackingInfo, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "deliveryOzon", type = StateDTO.OzonDTO.class), @ProtoOneOfSignature(name = "deliverySeller", type = StateDTO.SellerDTO.class), @ProtoOneOfSignature(name = "hiddenState", type = StateDTO.HiddenDTO.class)}) @NotNull @ProtoOneOf(label = "type") StateDTO state, @NotNull List<Long> availableDeliverySchemas) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(availableDeliverySchemas, "availableDeliverySchemas");
        return new DeliveryWidgetV2DTO(lifetime, trackingInfo, state, availableDeliverySchemas);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryWidgetV2DTO)) {
            return false;
        }
        DeliveryWidgetV2DTO deliveryWidgetV2DTO = (DeliveryWidgetV2DTO) other;
        return Float.compare(this.lifetime, deliveryWidgetV2DTO.lifetime) == 0 && Intrinsics.d(this.trackingInfo, deliveryWidgetV2DTO.trackingInfo) && Intrinsics.d(this.state, deliveryWidgetV2DTO.state) && Intrinsics.d(this.availableDeliverySchemas, deliveryWidgetV2DTO.availableDeliverySchemas);
    }

    @NotNull
    public final List<Long> getAvailableDeliverySchemas() {
        return this.availableDeliverySchemas;
    }

    public final float getLifetime() {
        return this.lifetime;
    }

    @NotNull
    public final StateDTO getState() {
        return this.state;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = Float.hashCode(this.lifetime) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return this.availableDeliverySchemas.hashCode() + ((this.state.hashCode() + ((hashCode + (map == null ? 0 : map.hashCode())) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "DeliveryWidgetV2DTO(lifetime=" + this.lifetime + ", trackingInfo=" + this.trackingInfo + ", state=" + this.state + ", availableDeliverySchemas=" + this.availableDeliverySchemas + ")";
    }

    public DeliveryWidgetV2DTO(float f7, Map map, StateDTO stateDTO, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f7, map, stateDTO, (i11 & 8) != 0 ? K.f71697a : list);
    }
}
