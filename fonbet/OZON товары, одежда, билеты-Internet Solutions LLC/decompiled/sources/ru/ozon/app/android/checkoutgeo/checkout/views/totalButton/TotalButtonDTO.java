package ru.ozon.app.android.checkoutgeo.checkout.views.totalButton;

import D3.g;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.data.SelectionItemDescriptionDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002/0BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jg\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00061"}, d2 = {"Lru/ozon/app/android/checkoutgeo/checkout/views/totalButton/TotalButtonDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "titleSubtext", "subtitle", "badge", "Lru/ozon/app/android/checkoutgeo/checkout/views/totalButton/TotalButtonDTO$Badge;", "backgroundColor", "", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "priority", "Lru/ozon/app/android/checkoutgeo/checkout/views/totalButton/TotalButtonDTO$ExpandPriority;", "buttonCornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/checkoutgeo/checkout/views/totalButton/TotalButtonDTO$Badge;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/app/android/checkoutgeo/checkout/views/totalButton/TotalButtonDTO$ExpandPriority;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitleSubtext", "getSubtitle", "getBadge", "()Lru/ozon/app/android/checkoutgeo/checkout/views/totalButton/TotalButtonDTO$Badge;", "getBackgroundColor", "()Ljava/lang/String;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getPriority", "()Lru/ozon/app/android/checkoutgeo/checkout/views/totalButton/TotalButtonDTO$ExpandPriority;", "getButtonCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "Badge", "ExpandPriority", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TotalButtonDTO {
    private final String backgroundColor;
    private final Badge badge;
    private final CornerRadius buttonCornerRadius;
    private final CommonControlSettings common;
    private final ExpandPriority priority;
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final TextDTO titleSubtext;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/checkoutgeo/checkout/views/totalButton/TotalButtonDTO$Badge;", "", "icon", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtext", "backgroundColor", "", "<init>", "(Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;)V", "getIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtext", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Badge {
        private final String backgroundColor;
        private final CommonAtomIconDTO icon;
        private final TextDTO subtext;
        private final TextDTO text;

        public Badge(CommonAtomIconDTO commonAtomIconDTO, TextDTO textDTO, TextDTO textDTO2, String str) {
            this.icon = commonAtomIconDTO;
            this.text = textDTO;
            this.subtext = textDTO2;
            this.backgroundColor = str;
        }

        public static /* synthetic */ Badge copy$default(Badge badge, CommonAtomIconDTO commonAtomIconDTO, TextDTO textDTO, TextDTO textDTO2, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                commonAtomIconDTO = badge.icon;
            }
            if ((i11 & 2) != 0) {
                textDTO = badge.text;
            }
            if ((i11 & 4) != 0) {
                textDTO2 = badge.subtext;
            }
            if ((i11 & 8) != 0) {
                str = badge.backgroundColor;
            }
            return badge.copy(commonAtomIconDTO, textDTO, textDTO2, str);
        }

        /* renamed from: component1, reason: from getter */
        public final CommonAtomIconDTO getIcon() {
            return this.icon;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        /* renamed from: component3, reason: from getter */
        public final TextDTO getSubtext() {
            return this.subtext;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final Badge copy(CommonAtomIconDTO icon, TextDTO text, TextDTO subtext, String backgroundColor) {
            return new Badge(icon, text, subtext, backgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Badge)) {
                return false;
            }
            Badge badge = (Badge) other;
            return Intrinsics.d(this.icon, badge.icon) && Intrinsics.d(this.text, badge.text) && Intrinsics.d(this.subtext, badge.subtext) && Intrinsics.d(this.backgroundColor, badge.backgroundColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final CommonAtomIconDTO getIcon() {
            return this.icon;
        }

        public final TextDTO getSubtext() {
            return this.subtext;
        }

        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            CommonAtomIconDTO commonAtomIconDTO = this.icon;
            int hashCode = (commonAtomIconDTO == null ? 0 : commonAtomIconDTO.hashCode()) * 31;
            TextDTO textDTO = this.text;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            TextDTO textDTO2 = this.subtext;
            int hashCode3 = (hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
            String str = this.backgroundColor;
            return hashCode3 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Badge(icon=" + this.icon + ", text=" + this.text + ", subtext=" + this.subtext + ", backgroundColor=" + this.backgroundColor + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/checkoutgeo/checkout/views/totalButton/TotalButtonDTO$ExpandPriority;", "", "<init>", "(Ljava/lang/String;I)V", SelectionItemDescriptionDTO.TITLE, "BADGE", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ExpandPriority {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ExpandPriority[] $VALUES;
        public static final ExpandPriority TITLE = new ExpandPriority(SelectionItemDescriptionDTO.TITLE, 0);
        public static final ExpandPriority BADGE = new ExpandPriority("BADGE", 1);

        private static final /* synthetic */ ExpandPriority[] $values() {
            return new ExpandPriority[]{TITLE, BADGE};
        }

        static {
            ExpandPriority[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ExpandPriority(String str, int i11) {
        }

        public static ExpandPriority valueOf(String str) {
            return (ExpandPriority) Enum.valueOf(ExpandPriority.class, str);
        }

        public static ExpandPriority[] values() {
            return (ExpandPriority[]) $VALUES.clone();
        }
    }

    public TotalButtonDTO(@NotNull TextDTO title, TextDTO textDTO, TextDTO textDTO2, Badge badge, String str, CommonControlSettings commonControlSettings, ExpandPriority expandPriority, CornerRadius cornerRadius) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.titleSubtext = textDTO;
        this.subtitle = textDTO2;
        this.badge = badge;
        this.backgroundColor = str;
        this.common = commonControlSettings;
        this.priority = expandPriority;
        this.buttonCornerRadius = cornerRadius;
    }

    public static /* synthetic */ TotalButtonDTO copy$default(TotalButtonDTO totalButtonDTO, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, Badge badge, String str, CommonControlSettings commonControlSettings, ExpandPriority expandPriority, CornerRadius cornerRadius, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = totalButtonDTO.title;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = totalButtonDTO.titleSubtext;
        }
        if ((i11 & 4) != 0) {
            textDTO3 = totalButtonDTO.subtitle;
        }
        if ((i11 & 8) != 0) {
            badge = totalButtonDTO.badge;
        }
        if ((i11 & 16) != 0) {
            str = totalButtonDTO.backgroundColor;
        }
        if ((i11 & 32) != 0) {
            commonControlSettings = totalButtonDTO.common;
        }
        if ((i11 & 64) != 0) {
            expandPriority = totalButtonDTO.priority;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            cornerRadius = totalButtonDTO.buttonCornerRadius;
        }
        ExpandPriority expandPriority2 = expandPriority;
        CornerRadius cornerRadius2 = cornerRadius;
        String str2 = str;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        return totalButtonDTO.copy(textDTO, textDTO2, textDTO3, badge, str2, commonControlSettings2, expandPriority2, cornerRadius2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getTitleSubtext() {
        return this.titleSubtext;
    }

    /* renamed from: component3, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final Badge getBadge() {
        return this.badge;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component6, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    /* renamed from: component7, reason: from getter */
    public final ExpandPriority getPriority() {
        return this.priority;
    }

    /* renamed from: component8, reason: from getter */
    public final CornerRadius getButtonCornerRadius() {
        return this.buttonCornerRadius;
    }

    @NotNull
    public final TotalButtonDTO copy(@NotNull TextDTO title, TextDTO titleSubtext, TextDTO subtitle, Badge badge, String backgroundColor, CommonControlSettings common, ExpandPriority priority, CornerRadius buttonCornerRadius) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new TotalButtonDTO(title, titleSubtext, subtitle, badge, backgroundColor, common, priority, buttonCornerRadius);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TotalButtonDTO)) {
            return false;
        }
        TotalButtonDTO totalButtonDTO = (TotalButtonDTO) other;
        return Intrinsics.d(this.title, totalButtonDTO.title) && Intrinsics.d(this.titleSubtext, totalButtonDTO.titleSubtext) && Intrinsics.d(this.subtitle, totalButtonDTO.subtitle) && Intrinsics.d(this.badge, totalButtonDTO.badge) && Intrinsics.d(this.backgroundColor, totalButtonDTO.backgroundColor) && Intrinsics.d(this.common, totalButtonDTO.common) && this.priority == totalButtonDTO.priority && this.buttonCornerRadius == totalButtonDTO.buttonCornerRadius;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Badge getBadge() {
        return this.badge;
    }

    public final CornerRadius getButtonCornerRadius() {
        return this.buttonCornerRadius;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    public final ExpandPriority getPriority() {
        return this.priority;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final TextDTO getTitleSubtext() {
        return this.titleSubtext;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        TextDTO textDTO = this.titleSubtext;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.subtitle;
        int hashCode3 = (hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        Badge badge = this.badge;
        int hashCode4 = (hashCode3 + (badge == null ? 0 : badge.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        int hashCode6 = (hashCode5 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        ExpandPriority expandPriority = this.priority;
        int hashCode7 = (hashCode6 + (expandPriority == null ? 0 : expandPriority.hashCode())) * 31;
        CornerRadius cornerRadius = this.buttonCornerRadius;
        return hashCode7 + (cornerRadius != null ? cornerRadius.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.titleSubtext;
        TextDTO textDTO3 = this.subtitle;
        Badge badge = this.badge;
        String str = this.backgroundColor;
        CommonControlSettings commonControlSettings = this.common;
        ExpandPriority expandPriority = this.priority;
        CornerRadius cornerRadius = this.buttonCornerRadius;
        StringBuilder g10 = g.g("TotalButtonDTO(title=", textDTO, ", titleSubtext=", textDTO2, ", subtitle=");
        g10.append(textDTO3);
        g10.append(", badge=");
        g10.append(badge);
        g10.append(", backgroundColor=");
        g10.append(str);
        g10.append(", common=");
        g10.append(commonControlSettings);
        g10.append(", priority=");
        g10.append(expandPriority);
        g10.append(", buttonCornerRadius=");
        g10.append(cornerRadius);
        g10.append(")");
        return g10.toString();
    }

    public /* synthetic */ TotalButtonDTO(TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, Badge badge, String str, CommonControlSettings commonControlSettings, ExpandPriority expandPriority, CornerRadius cornerRadius, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textDTO, textDTO2, textDTO3, badge, str, commonControlSettings, (i11 & 64) != 0 ? ExpandPriority.TITLE : expandPriority, cornerRadius);
    }
}
