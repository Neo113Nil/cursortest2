package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.data;

import B3.p;
import Bl.C2639a;
import D40.b;
import Nh.a;
import Pk0.c;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u000489:;Bi\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010-\u001a\u00020\rHÆ\u0003J\t\u0010.\u001a\u00020\u000fHÆ\u0003J\t\u0010/\u001a\u00020\u0011HÆ\u0003J\u0017\u00100\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003J}\u00101\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\nHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001f\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006<"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/data/DeliveryWidgetV4DTO;", "", "deliveryConditionsBlocks", "", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/data/DeliveryWidgetV4DTO$ContentBlock;", "progress", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/data/DeliveryWidgetV4DTO$Progress;", "chevron", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/data/DeliveryWidgetV4DTO$Chevron;", "borderColor", "", "backgroundColor", "spacers", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/data/DeliveryWidgetV4DTO$Spacers;", "widgetUpdatePeriod", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/data/DeliveryWidgetV4DTO$Progress;Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/data/DeliveryWidgetV4DTO$Chevron;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/data/DeliveryWidgetV4DTO$Spacers;JLru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getDeliveryConditionsBlocks", "()Ljava/util/List;", "getProgress", "()Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/data/DeliveryWidgetV4DTO$Progress;", "getChevron", "()Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/data/DeliveryWidgetV4DTO$Chevron;", "getBorderColor", "()Ljava/lang/String;", "getBackgroundColor", "getSpacers", "()Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/data/DeliveryWidgetV4DTO$Spacers;", "getWidgetUpdatePeriod", "()J", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "ContentBlock", "Chevron", "Progress", "Spacers", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DeliveryWidgetV4DTO {
    public static final int $stable = 8;

    @NotNull
    private final AtomActionDTO action;
    private final String backgroundColor;
    private final String borderColor;

    @NotNull
    private final Chevron chevron;

    @NotNull
    private final List<ContentBlock> deliveryConditionsBlocks;
    private final Progress progress;

    @NotNull
    private final Spacers spacers;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final long widgetUpdatePeriod;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/data/DeliveryWidgetV4DTO$Chevron;", "", "chevronIcon", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "rightPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "<init>", "(Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getChevronIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getRightPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Chevron {
        public static final int $stable = CommonAtomIconDTO.$stable;

        @NotNull
        private final CommonAtomIconDTO chevronIcon;
        private final Paddings rightPadding;

        public Chevron(@NotNull CommonAtomIconDTO chevronIcon, Paddings paddings) {
            Intrinsics.checkNotNullParameter(chevronIcon, "chevronIcon");
            this.chevronIcon = chevronIcon;
            this.rightPadding = paddings;
        }

        public static /* synthetic */ Chevron copy$default(Chevron chevron, CommonAtomIconDTO commonAtomIconDTO, Paddings paddings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                commonAtomIconDTO = chevron.chevronIcon;
            }
            if ((i11 & 2) != 0) {
                paddings = chevron.rightPadding;
            }
            return chevron.copy(commonAtomIconDTO, paddings);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CommonAtomIconDTO getChevronIcon() {
            return this.chevronIcon;
        }

        /* renamed from: component2, reason: from getter */
        public final Paddings getRightPadding() {
            return this.rightPadding;
        }

        @NotNull
        public final Chevron copy(@NotNull CommonAtomIconDTO chevronIcon, Paddings rightPadding) {
            Intrinsics.checkNotNullParameter(chevronIcon, "chevronIcon");
            return new Chevron(chevronIcon, rightPadding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Chevron)) {
                return false;
            }
            Chevron chevron = (Chevron) other;
            return Intrinsics.d(this.chevronIcon, chevron.chevronIcon) && this.rightPadding == chevron.rightPadding;
        }

        @NotNull
        public final CommonAtomIconDTO getChevronIcon() {
            return this.chevronIcon;
        }

        public final Paddings getRightPadding() {
            return this.rightPadding;
        }

        public int hashCode() {
            int hashCode = this.chevronIcon.hashCode() * 31;
            Paddings paddings = this.rightPadding;
            return hashCode + (paddings == null ? 0 : paddings.hashCode());
        }

        @NotNull
        public String toString() {
            return "Chevron(chevronIcon=" + this.chevronIcon + ", rightPadding=" + this.rightPadding + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/data/DeliveryWidgetV4DTO$ContentBlock;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "icon", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "rightPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getRightPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ContentBlock {
        public static final int $stable = CommonAtomIconDTO.$stable;
        private final CommonAtomIconDTO icon;
        private final Paddings rightPadding;
        private final TextDTO text;

        public ContentBlock(TextDTO textDTO, CommonAtomIconDTO commonAtomIconDTO, Paddings paddings) {
            this.text = textDTO;
            this.icon = commonAtomIconDTO;
            this.rightPadding = paddings;
        }

        public static /* synthetic */ ContentBlock copy$default(ContentBlock contentBlock, TextDTO textDTO, CommonAtomIconDTO commonAtomIconDTO, Paddings paddings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = contentBlock.text;
            }
            if ((i11 & 2) != 0) {
                commonAtomIconDTO = contentBlock.icon;
            }
            if ((i11 & 4) != 0) {
                paddings = contentBlock.rightPadding;
            }
            return contentBlock.copy(textDTO, commonAtomIconDTO, paddings);
        }

        /* renamed from: component1, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final CommonAtomIconDTO getIcon() {
            return this.icon;
        }

        /* renamed from: component3, reason: from getter */
        public final Paddings getRightPadding() {
            return this.rightPadding;
        }

        @NotNull
        public final ContentBlock copy(TextDTO text, CommonAtomIconDTO icon, Paddings rightPadding) {
            return new ContentBlock(text, icon, rightPadding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContentBlock)) {
                return false;
            }
            ContentBlock contentBlock = (ContentBlock) other;
            return Intrinsics.d(this.text, contentBlock.text) && Intrinsics.d(this.icon, contentBlock.icon) && this.rightPadding == contentBlock.rightPadding;
        }

        public final CommonAtomIconDTO getIcon() {
            return this.icon;
        }

        public final Paddings getRightPadding() {
            return this.rightPadding;
        }

        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            TextDTO textDTO = this.text;
            int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
            CommonAtomIconDTO commonAtomIconDTO = this.icon;
            int hashCode2 = (hashCode + (commonAtomIconDTO == null ? 0 : commonAtomIconDTO.hashCode())) * 31;
            Paddings paddings = this.rightPadding;
            return hashCode2 + (paddings != null ? paddings.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.text;
            CommonAtomIconDTO commonAtomIconDTO = this.icon;
            Paddings paddings = this.rightPadding;
            StringBuilder sb2 = new StringBuilder("ContentBlock(text=");
            sb2.append(textDTO);
            sb2.append(", icon=");
            sb2.append(commonAtomIconDTO);
            sb2.append(", rightPadding=");
            return b.b(sb2, paddings, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/data/DeliveryWidgetV4DTO$Progress;", "", "percentage", "", "color", "", "<init>", "(ILjava/lang/String;)V", "getPercentage", "()I", "getColor", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Progress {
        public static final int $stable = 0;

        @NotNull
        private final String color;
        private final int percentage;

        public Progress(int i11, @NotNull String color) {
            Intrinsics.checkNotNullParameter(color, "color");
            this.percentage = i11;
            this.color = color;
        }

        public static /* synthetic */ Progress copy$default(Progress progress, int i11, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = progress.percentage;
            }
            if ((i12 & 2) != 0) {
                str = progress.color;
            }
            return progress.copy(i11, str);
        }

        /* renamed from: component1, reason: from getter */
        public final int getPercentage() {
            return this.percentage;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        @NotNull
        public final Progress copy(int percentage, @NotNull String color) {
            Intrinsics.checkNotNullParameter(color, "color");
            return new Progress(percentage, color);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Progress)) {
                return false;
            }
            Progress progress = (Progress) other;
            return this.percentage == progress.percentage && Intrinsics.d(this.color, progress.color);
        }

        @NotNull
        public final String getColor() {
            return this.color;
        }

        public final int getPercentage() {
            return this.percentage;
        }

        public int hashCode() {
            return this.color.hashCode() + (Integer.hashCode(this.percentage) * 31);
        }

        @NotNull
        public String toString() {
            return a.c(this.percentage, "Progress(percentage=", ", color=", this.color, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/data/DeliveryWidgetV4DTO$Spacers;", "", "top", "Lru/ozon/uni/atoms/data/common/Paddings;", "bottom", "horizontal", "between", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getTop", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottom", "getHorizontal", "getBetween", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Spacers {
        public static final int $stable = 0;
        private final Paddings between;
        private final Paddings bottom;
        private final Paddings horizontal;
        private final Paddings top;

        public Spacers(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4) {
            this.top = paddings;
            this.bottom = paddings2;
            this.horizontal = paddings3;
            this.between = paddings4;
        }

        public static /* synthetic */ Spacers copy$default(Spacers spacers, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = spacers.top;
            }
            if ((i11 & 2) != 0) {
                paddings2 = spacers.bottom;
            }
            if ((i11 & 4) != 0) {
                paddings3 = spacers.horizontal;
            }
            if ((i11 & 8) != 0) {
                paddings4 = spacers.between;
            }
            return spacers.copy(paddings, paddings2, paddings3, paddings4);
        }

        /* renamed from: component1, reason: from getter */
        public final Paddings getTop() {
            return this.top;
        }

        /* renamed from: component2, reason: from getter */
        public final Paddings getBottom() {
            return this.bottom;
        }

        /* renamed from: component3, reason: from getter */
        public final Paddings getHorizontal() {
            return this.horizontal;
        }

        /* renamed from: component4, reason: from getter */
        public final Paddings getBetween() {
            return this.between;
        }

        @NotNull
        public final Spacers copy(Paddings top, Paddings bottom, Paddings horizontal, Paddings between) {
            return new Spacers(top, bottom, horizontal, between);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Spacers)) {
                return false;
            }
            Spacers spacers = (Spacers) other;
            return this.top == spacers.top && this.bottom == spacers.bottom && this.horizontal == spacers.horizontal && this.between == spacers.between;
        }

        public final Paddings getBetween() {
            return this.between;
        }

        public final Paddings getBottom() {
            return this.bottom;
        }

        public final Paddings getHorizontal() {
            return this.horizontal;
        }

        public final Paddings getTop() {
            return this.top;
        }

        public int hashCode() {
            Paddings paddings = this.top;
            int hashCode = (paddings == null ? 0 : paddings.hashCode()) * 31;
            Paddings paddings2 = this.bottom;
            int hashCode2 = (hashCode + (paddings2 == null ? 0 : paddings2.hashCode())) * 31;
            Paddings paddings3 = this.horizontal;
            int hashCode3 = (hashCode2 + (paddings3 == null ? 0 : paddings3.hashCode())) * 31;
            Paddings paddings4 = this.between;
            return hashCode3 + (paddings4 != null ? paddings4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.top;
            Paddings paddings2 = this.bottom;
            return GR.b.e(p.b("Spacers(top=", paddings, ", bottom=", paddings2, ", horizontal="), this.horizontal, ", between=", this.between, ")");
        }
    }

    public DeliveryWidgetV4DTO(@NotNull List<ContentBlock> deliveryConditionsBlocks, Progress progress, @NotNull Chevron chevron, String str, String str2, @NotNull Spacers spacers, long j11, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(deliveryConditionsBlocks, "deliveryConditionsBlocks");
        Intrinsics.checkNotNullParameter(chevron, "chevron");
        Intrinsics.checkNotNullParameter(spacers, "spacers");
        Intrinsics.checkNotNullParameter(action, "action");
        this.deliveryConditionsBlocks = deliveryConditionsBlocks;
        this.progress = progress;
        this.chevron = chevron;
        this.borderColor = str;
        this.backgroundColor = str2;
        this.spacers = spacers;
        this.widgetUpdatePeriod = j11;
        this.action = action;
        this.trackingInfo = map;
    }

    public static /* synthetic */ DeliveryWidgetV4DTO copy$default(DeliveryWidgetV4DTO deliveryWidgetV4DTO, List list, Progress progress, Chevron chevron, String str, String str2, Spacers spacers, long j11, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = deliveryWidgetV4DTO.deliveryConditionsBlocks;
        }
        if ((i11 & 2) != 0) {
            progress = deliveryWidgetV4DTO.progress;
        }
        if ((i11 & 4) != 0) {
            chevron = deliveryWidgetV4DTO.chevron;
        }
        if ((i11 & 8) != 0) {
            str = deliveryWidgetV4DTO.borderColor;
        }
        if ((i11 & 16) != 0) {
            str2 = deliveryWidgetV4DTO.backgroundColor;
        }
        if ((i11 & 32) != 0) {
            spacers = deliveryWidgetV4DTO.spacers;
        }
        if ((i11 & 64) != 0) {
            j11 = deliveryWidgetV4DTO.widgetUpdatePeriod;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            atomActionDTO = deliveryWidgetV4DTO.action;
        }
        if ((i11 & 256) != 0) {
            map = deliveryWidgetV4DTO.trackingInfo;
        }
        long j12 = j11;
        String str3 = str2;
        Spacers spacers2 = spacers;
        Chevron chevron2 = chevron;
        String str4 = str;
        return deliveryWidgetV4DTO.copy(list, progress, chevron2, str4, str3, spacers2, j12, atomActionDTO, map);
    }

    @NotNull
    public final List<ContentBlock> component1() {
        return this.deliveryConditionsBlocks;
    }

    /* renamed from: component2, reason: from getter */
    public final Progress getProgress() {
        return this.progress;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Chevron getChevron() {
        return this.chevron;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBorderColor() {
        return this.borderColor;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final Spacers getSpacers() {
        return this.spacers;
    }

    /* renamed from: component7, reason: from getter */
    public final long getWidgetUpdatePeriod() {
        return this.widgetUpdatePeriod;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component9() {
        return this.trackingInfo;
    }

    @NotNull
    public final DeliveryWidgetV4DTO copy(@NotNull List<ContentBlock> deliveryConditionsBlocks, Progress progress, @NotNull Chevron chevron, String borderColor, String backgroundColor, @NotNull Spacers spacers, long widgetUpdatePeriod, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(deliveryConditionsBlocks, "deliveryConditionsBlocks");
        Intrinsics.checkNotNullParameter(chevron, "chevron");
        Intrinsics.checkNotNullParameter(spacers, "spacers");
        Intrinsics.checkNotNullParameter(action, "action");
        return new DeliveryWidgetV4DTO(deliveryConditionsBlocks, progress, chevron, borderColor, backgroundColor, spacers, widgetUpdatePeriod, action, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryWidgetV4DTO)) {
            return false;
        }
        DeliveryWidgetV4DTO deliveryWidgetV4DTO = (DeliveryWidgetV4DTO) other;
        return Intrinsics.d(this.deliveryConditionsBlocks, deliveryWidgetV4DTO.deliveryConditionsBlocks) && Intrinsics.d(this.progress, deliveryWidgetV4DTO.progress) && Intrinsics.d(this.chevron, deliveryWidgetV4DTO.chevron) && Intrinsics.d(this.borderColor, deliveryWidgetV4DTO.borderColor) && Intrinsics.d(this.backgroundColor, deliveryWidgetV4DTO.backgroundColor) && Intrinsics.d(this.spacers, deliveryWidgetV4DTO.spacers) && this.widgetUpdatePeriod == deliveryWidgetV4DTO.widgetUpdatePeriod && Intrinsics.d(this.action, deliveryWidgetV4DTO.action) && Intrinsics.d(this.trackingInfo, deliveryWidgetV4DTO.trackingInfo);
    }

    @NotNull
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBorderColor() {
        return this.borderColor;
    }

    @NotNull
    public final Chevron getChevron() {
        return this.chevron;
    }

    @NotNull
    public final List<ContentBlock> getDeliveryConditionsBlocks() {
        return this.deliveryConditionsBlocks;
    }

    public final Progress getProgress() {
        return this.progress;
    }

    @NotNull
    public final Spacers getSpacers() {
        return this.spacers;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final long getWidgetUpdatePeriod() {
        return this.widgetUpdatePeriod;
    }

    public int hashCode() {
        int hashCode = this.deliveryConditionsBlocks.hashCode() * 31;
        Progress progress = this.progress;
        int hashCode2 = (this.chevron.hashCode() + ((hashCode + (progress == null ? 0 : progress.hashCode())) * 31)) * 31;
        String str = this.borderColor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundColor;
        int b11 = Ih.a.b(this.action, c.a((this.spacers.hashCode() + ((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.widgetUpdatePeriod), 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return b11 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<ContentBlock> list = this.deliveryConditionsBlocks;
        Progress progress = this.progress;
        Chevron chevron = this.chevron;
        String str = this.borderColor;
        String str2 = this.backgroundColor;
        Spacers spacers = this.spacers;
        long j11 = this.widgetUpdatePeriod;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("DeliveryWidgetV4DTO(deliveryConditionsBlocks=");
        sb2.append(list);
        sb2.append(", progress=");
        sb2.append(progress);
        sb2.append(", chevron=");
        sb2.append(chevron);
        sb2.append(", borderColor=");
        sb2.append(str);
        sb2.append(", backgroundColor=");
        sb2.append(str2);
        sb2.append(", spacers=");
        sb2.append(spacers);
        sb2.append(", widgetUpdatePeriod=");
        sb2.append(j11);
        sb2.append(", action=");
        sb2.append(atomActionDTO);
        return C2639a.b(sb2, ", trackingInfo=", map, ")");
    }
}
