package ru.ozon.app.android.fresh.main.widgets.header.data;

import B3.p;
import C.o0;
import D3.g;
import GR.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.common.widgets.header.HeaderState;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u00016Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\t\u0010+\u001a\u00020\u000fHÆ\u0003J\t\u0010,\u001a\u00020\u0011HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\bHÆ\u0003J{\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001b¨\u00067"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/header/data/HeaderDTO;", "Lru/ozon/app/android/fresh/common/widgets/header/HeaderState;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "backgroundColor", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "topCornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "margins", "Lru/ozon/app/android/fresh/main/widgets/header/data/HeaderDTO$MarginsDTO;", "widgetScrollKey", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/app/android/fresh/main/widgets/header/data/HeaderDTO$MarginsDTO;Ljava/lang/String;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTopCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getMargins", "()Lru/ozon/app/android/fresh/main/widgets/header/data/HeaderDTO$MarginsDTO;", "getWidgetScrollKey", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "MarginsDTO", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class HeaderDTO implements HeaderState {
    private final AtomActionDTO action;
    private final String backgroundColor;
    private final BadgeDTO badge;

    @NotNull
    private final MarginsDTO margins;
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;

    @NotNull
    private final CornerRadius topCornerRadius;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final String widgetScrollKey;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/header/data/HeaderDTO$MarginsDTO;", "", "leftMargin", "Lru/ozon/uni/atoms/data/common/Paddings;", "topMargin", "rightMargin", "bottomMargin", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getLeftMargin", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getTopMargin", "getRightMargin", "getBottomMargin", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MarginsDTO {

        @NotNull
        private final Paddings bottomMargin;

        @NotNull
        private final Paddings leftMargin;

        @NotNull
        private final Paddings rightMargin;

        @NotNull
        private final Paddings topMargin;

        public MarginsDTO() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ MarginsDTO copy$default(MarginsDTO marginsDTO, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = marginsDTO.leftMargin;
            }
            if ((i11 & 2) != 0) {
                paddings2 = marginsDTO.topMargin;
            }
            if ((i11 & 4) != 0) {
                paddings3 = marginsDTO.rightMargin;
            }
            if ((i11 & 8) != 0) {
                paddings4 = marginsDTO.bottomMargin;
            }
            return marginsDTO.copy(paddings, paddings2, paddings3, paddings4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Paddings getLeftMargin() {
            return this.leftMargin;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Paddings getTopMargin() {
            return this.topMargin;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Paddings getRightMargin() {
            return this.rightMargin;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final Paddings getBottomMargin() {
            return this.bottomMargin;
        }

        @NotNull
        public final MarginsDTO copy(@NotNull Paddings leftMargin, @NotNull Paddings topMargin, @NotNull Paddings rightMargin, @NotNull Paddings bottomMargin) {
            Intrinsics.checkNotNullParameter(leftMargin, "leftMargin");
            Intrinsics.checkNotNullParameter(topMargin, "topMargin");
            Intrinsics.checkNotNullParameter(rightMargin, "rightMargin");
            Intrinsics.checkNotNullParameter(bottomMargin, "bottomMargin");
            return new MarginsDTO(leftMargin, topMargin, rightMargin, bottomMargin);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MarginsDTO)) {
                return false;
            }
            MarginsDTO marginsDTO = (MarginsDTO) other;
            return this.leftMargin == marginsDTO.leftMargin && this.topMargin == marginsDTO.topMargin && this.rightMargin == marginsDTO.rightMargin && this.bottomMargin == marginsDTO.bottomMargin;
        }

        @NotNull
        public final Paddings getBottomMargin() {
            return this.bottomMargin;
        }

        @NotNull
        public final Paddings getLeftMargin() {
            return this.leftMargin;
        }

        @NotNull
        public final Paddings getRightMargin() {
            return this.rightMargin;
        }

        @NotNull
        public final Paddings getTopMargin() {
            return this.topMargin;
        }

        public int hashCode() {
            return this.bottomMargin.hashCode() + b.b(this.rightMargin, b.b(this.topMargin, this.leftMargin.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.leftMargin;
            Paddings paddings2 = this.topMargin;
            return b.e(p.b("MarginsDTO(leftMargin=", paddings, ", topMargin=", paddings2, ", rightMargin="), this.rightMargin, ", bottomMargin=", this.bottomMargin, ")");
        }

        public MarginsDTO(@NotNull Paddings leftMargin, @NotNull Paddings topMargin, @NotNull Paddings rightMargin, @NotNull Paddings bottomMargin) {
            Intrinsics.checkNotNullParameter(leftMargin, "leftMargin");
            Intrinsics.checkNotNullParameter(topMargin, "topMargin");
            Intrinsics.checkNotNullParameter(rightMargin, "rightMargin");
            Intrinsics.checkNotNullParameter(bottomMargin, "bottomMargin");
            this.leftMargin = leftMargin;
            this.topMargin = topMargin;
            this.rightMargin = rightMargin;
            this.bottomMargin = bottomMargin;
        }

        public /* synthetic */ MarginsDTO(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? Paddings.NONE : paddings, (i11 & 2) != 0 ? Paddings.NONE : paddings2, (i11 & 4) != 0 ? Paddings.NONE : paddings3, (i11 & 8) != 0 ? Paddings.NONE : paddings4);
        }
    }

    public HeaderDTO(@NotNull TextDTO title, TextDTO textDTO, BadgeDTO badgeDTO, String str, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, @NotNull CornerRadius topCornerRadius, @NotNull MarginsDTO margins, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(topCornerRadius, "topCornerRadius");
        Intrinsics.checkNotNullParameter(margins, "margins");
        this.title = title;
        this.subtitle = textDTO;
        this.badge = badgeDTO;
        this.backgroundColor = str;
        this.action = atomActionDTO;
        this.trackingInfo = map;
        this.topCornerRadius = topCornerRadius;
        this.margins = margins;
        this.widgetScrollKey = str2;
    }

    public static /* synthetic */ HeaderDTO copy$default(HeaderDTO headerDTO, TextDTO textDTO, TextDTO textDTO2, BadgeDTO badgeDTO, String str, AtomActionDTO atomActionDTO, Map map, CornerRadius cornerRadius, MarginsDTO marginsDTO, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = headerDTO.title;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = headerDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            badgeDTO = headerDTO.badge;
        }
        if ((i11 & 8) != 0) {
            str = headerDTO.backgroundColor;
        }
        if ((i11 & 16) != 0) {
            atomActionDTO = headerDTO.action;
        }
        if ((i11 & 32) != 0) {
            map = headerDTO.trackingInfo;
        }
        if ((i11 & 64) != 0) {
            cornerRadius = headerDTO.topCornerRadius;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            marginsDTO = headerDTO.margins;
        }
        if ((i11 & 256) != 0) {
            str2 = headerDTO.widgetScrollKey;
        }
        MarginsDTO marginsDTO2 = marginsDTO;
        String str3 = str2;
        Map map2 = map;
        CornerRadius cornerRadius2 = cornerRadius;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        BadgeDTO badgeDTO2 = badgeDTO;
        return headerDTO.copy(textDTO, textDTO2, badgeDTO2, str, atomActionDTO2, map2, cornerRadius2, marginsDTO2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component5, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final CornerRadius getTopCornerRadius() {
        return this.topCornerRadius;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final MarginsDTO getMargins() {
        return this.margins;
    }

    /* renamed from: component9, reason: from getter */
    public final String getWidgetScrollKey() {
        return this.widgetScrollKey;
    }

    @NotNull
    public final HeaderDTO copy(@NotNull TextDTO title, TextDTO subtitle, BadgeDTO badge, String backgroundColor, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, @NotNull CornerRadius topCornerRadius, @NotNull MarginsDTO margins, String widgetScrollKey) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(topCornerRadius, "topCornerRadius");
        Intrinsics.checkNotNullParameter(margins, "margins");
        return new HeaderDTO(title, subtitle, badge, backgroundColor, action, trackingInfo, topCornerRadius, margins, widgetScrollKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderDTO)) {
            return false;
        }
        HeaderDTO headerDTO = (HeaderDTO) other;
        return Intrinsics.d(this.title, headerDTO.title) && Intrinsics.d(this.subtitle, headerDTO.subtitle) && Intrinsics.d(this.badge, headerDTO.badge) && Intrinsics.d(this.backgroundColor, headerDTO.backgroundColor) && Intrinsics.d(this.action, headerDTO.action) && Intrinsics.d(this.trackingInfo, headerDTO.trackingInfo) && this.topCornerRadius == headerDTO.topCornerRadius && Intrinsics.d(this.margins, headerDTO.margins) && Intrinsics.d(this.widgetScrollKey, headerDTO.widgetScrollKey);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    @NotNull
    public final MarginsDTO getMargins() {
        return this.margins;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    public final CornerRadius getTopCornerRadius() {
        return this.topCornerRadius;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final String getWidgetScrollKey() {
        return this.widgetScrollKey;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        TextDTO textDTO = this.subtitle;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        BadgeDTO badgeDTO = this.badge;
        int hashCode3 = (hashCode2 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode5 = (hashCode4 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode6 = (this.margins.hashCode() + Tl.b.b(this.topCornerRadius, (hashCode5 + (map == null ? 0 : map.hashCode())) * 31, 31)) * 31;
        String str2 = this.widgetScrollKey;
        return hashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        BadgeDTO badgeDTO = this.badge;
        String str = this.backgroundColor;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        CornerRadius cornerRadius = this.topCornerRadius;
        MarginsDTO marginsDTO = this.margins;
        String str2 = this.widgetScrollKey;
        StringBuilder g10 = g.g("HeaderDTO(title=", textDTO, ", subtitle=", textDTO2, ", badge=");
        g10.append(badgeDTO);
        g10.append(", backgroundColor=");
        g10.append(str);
        g10.append(", action=");
        Sh.b.f(g10, atomActionDTO, ", trackingInfo=", map, ", topCornerRadius=");
        g10.append(cornerRadius);
        g10.append(", margins=");
        g10.append(marginsDTO);
        g10.append(", widgetScrollKey=");
        return o0.c(g10, str2, ")");
    }

    public /* synthetic */ HeaderDTO(TextDTO textDTO, TextDTO textDTO2, BadgeDTO badgeDTO, String str, AtomActionDTO atomActionDTO, Map map, CornerRadius cornerRadius, MarginsDTO marginsDTO, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textDTO, textDTO2, badgeDTO, str, atomActionDTO, map, (i11 & 64) != 0 ? CornerRadius.NO_RADIUS : cornerRadius, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? new MarginsDTO(null, null, null, null, 15, null) : marginsDTO, str2);
    }
}
