package ru.ozon.android.composerCommonViewKit.header.data;

import B3.p;
import D3.g;
import GR.b;
import Kk.C3532b;
import Lh.a;
import Sc.InterfaceC3999a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u00101\u001a\u00020\bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0017\u00104\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\t\u00105\u001a\u00020\u0011HÆ\u0003J\t\u00106\u001a\u00020\u0013HÆ\u0003J\t\u00107\u001a\u00020\u0013HÆ\u0003J\t\u00108\u001a\u00020\u0013HÆ\u0003J\t\u00109\u001a\u00020\u0013HÆ\u0003J\u0097\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0013HÆ\u0001J\u0013\u0010;\u001a\u00020\b2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020>HÖ\u0001J\t\u0010?\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0007\u0010 R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0014\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0011\u0010\u0015\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b,\u0010*R\u0011\u0010\u0016\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b-\u0010*¨\u0006@"}, d2 = {"Lru/ozon/android/composerCommonViewKit/header/data/HeaderDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "isTopRounded", "", "backgroundColor", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "topIslandCornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "leftMargin", "Lru/ozon/uni/atoms/data/common/Paddings;", "topMargin", "rightMargin", "bottomMargin", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;ZLjava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "isTopRounded$annotations", "()V", "()Z", "getBackgroundColor", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTopIslandCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getLeftMargin", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getTopMargin", "getRightMargin", "getBottomMargin", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "", "toString", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class HeaderDTO {
    public static final int $stable = 8;
    private final AtomActionDTO action;
    private final String backgroundColor;
    private final BadgeDTO badge;

    @NotNull
    private final Paddings bottomMargin;
    private final transient boolean isTopRounded;

    @NotNull
    private final Paddings leftMargin;

    @NotNull
    private final Paddings rightMargin;
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;

    @NotNull
    private final CornerRadius topIslandCornerRadius;

    @NotNull
    private final Paddings topMargin;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public HeaderDTO(@NotNull TextDTO title, TextDTO textDTO, BadgeDTO badgeDTO, boolean z11, String str, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, @NotNull CornerRadius topIslandCornerRadius, @NotNull Paddings leftMargin, @NotNull Paddings topMargin, @NotNull Paddings rightMargin, @NotNull Paddings bottomMargin) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(topIslandCornerRadius, "topIslandCornerRadius");
        Intrinsics.checkNotNullParameter(leftMargin, "leftMargin");
        Intrinsics.checkNotNullParameter(topMargin, "topMargin");
        Intrinsics.checkNotNullParameter(rightMargin, "rightMargin");
        Intrinsics.checkNotNullParameter(bottomMargin, "bottomMargin");
        this.title = title;
        this.subtitle = textDTO;
        this.badge = badgeDTO;
        this.isTopRounded = z11;
        this.backgroundColor = str;
        this.action = atomActionDTO;
        this.trackingInfo = map;
        this.topIslandCornerRadius = topIslandCornerRadius;
        this.leftMargin = leftMargin;
        this.topMargin = topMargin;
        this.rightMargin = rightMargin;
        this.bottomMargin = bottomMargin;
    }

    public static /* synthetic */ HeaderDTO copy$default(HeaderDTO headerDTO, TextDTO textDTO, TextDTO textDTO2, BadgeDTO badgeDTO, boolean z11, String str, AtomActionDTO atomActionDTO, Map map, CornerRadius cornerRadius, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj) {
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
            z11 = headerDTO.isTopRounded;
        }
        if ((i11 & 16) != 0) {
            str = headerDTO.backgroundColor;
        }
        if ((i11 & 32) != 0) {
            atomActionDTO = headerDTO.action;
        }
        if ((i11 & 64) != 0) {
            map = headerDTO.trackingInfo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            cornerRadius = headerDTO.topIslandCornerRadius;
        }
        if ((i11 & 256) != 0) {
            paddings = headerDTO.leftMargin;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            paddings2 = headerDTO.topMargin;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            paddings3 = headerDTO.rightMargin;
        }
        if ((i11 & 2048) != 0) {
            paddings4 = headerDTO.bottomMargin;
        }
        Paddings paddings5 = paddings3;
        Paddings paddings6 = paddings4;
        Paddings paddings7 = paddings;
        Paddings paddings8 = paddings2;
        Map map2 = map;
        CornerRadius cornerRadius2 = cornerRadius;
        String str2 = str;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        return headerDTO.copy(textDTO, textDTO2, badgeDTO, z11, str2, atomActionDTO2, map2, cornerRadius2, paddings7, paddings8, paddings5, paddings6);
    }

    @InterfaceC3999a
    public static /* synthetic */ void isTopRounded$annotations() {
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final Paddings getTopMargin() {
        return this.topMargin;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final Paddings getRightMargin() {
        return this.rightMargin;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final Paddings getBottomMargin() {
        return this.bottomMargin;
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
    public final boolean getIsTopRounded() {
        return this.isTopRounded;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component6, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final CornerRadius getTopIslandCornerRadius() {
        return this.topIslandCornerRadius;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final Paddings getLeftMargin() {
        return this.leftMargin;
    }

    @NotNull
    public final HeaderDTO copy(@NotNull TextDTO title, TextDTO subtitle, BadgeDTO badge, boolean isTopRounded, String backgroundColor, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, @NotNull CornerRadius topIslandCornerRadius, @NotNull Paddings leftMargin, @NotNull Paddings topMargin, @NotNull Paddings rightMargin, @NotNull Paddings bottomMargin) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(topIslandCornerRadius, "topIslandCornerRadius");
        Intrinsics.checkNotNullParameter(leftMargin, "leftMargin");
        Intrinsics.checkNotNullParameter(topMargin, "topMargin");
        Intrinsics.checkNotNullParameter(rightMargin, "rightMargin");
        Intrinsics.checkNotNullParameter(bottomMargin, "bottomMargin");
        return new HeaderDTO(title, subtitle, badge, isTopRounded, backgroundColor, action, trackingInfo, topIslandCornerRadius, leftMargin, topMargin, rightMargin, bottomMargin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderDTO)) {
            return false;
        }
        HeaderDTO headerDTO = (HeaderDTO) other;
        return Intrinsics.d(this.title, headerDTO.title) && Intrinsics.d(this.subtitle, headerDTO.subtitle) && Intrinsics.d(this.badge, headerDTO.badge) && this.isTopRounded == headerDTO.isTopRounded && Intrinsics.d(this.backgroundColor, headerDTO.backgroundColor) && Intrinsics.d(this.action, headerDTO.action) && Intrinsics.d(this.trackingInfo, headerDTO.trackingInfo) && this.topIslandCornerRadius == headerDTO.topIslandCornerRadius && this.leftMargin == headerDTO.leftMargin && this.topMargin == headerDTO.topMargin && this.rightMargin == headerDTO.rightMargin && this.bottomMargin == headerDTO.bottomMargin;
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

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    public final CornerRadius getTopIslandCornerRadius() {
        return this.topIslandCornerRadius;
    }

    @NotNull
    public final Paddings getTopMargin() {
        return this.topMargin;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        TextDTO textDTO = this.subtitle;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        BadgeDTO badgeDTO = this.badge;
        int a11 = C3532b.a((hashCode2 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31, 31, this.isTopRounded);
        String str = this.backgroundColor;
        int hashCode3 = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode4 = (hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return this.bottomMargin.hashCode() + b.b(this.rightMargin, b.b(this.topMargin, b.b(this.leftMargin, Tl.b.b(this.topIslandCornerRadius, (hashCode4 + (map != null ? map.hashCode() : 0)) * 31, 31), 31), 31), 31);
    }

    public final boolean isTopRounded() {
        return this.isTopRounded;
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        BadgeDTO badgeDTO = this.badge;
        boolean z11 = this.isTopRounded;
        String str = this.backgroundColor;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        CornerRadius cornerRadius = this.topIslandCornerRadius;
        Paddings paddings = this.leftMargin;
        Paddings paddings2 = this.topMargin;
        Paddings paddings3 = this.rightMargin;
        Paddings paddings4 = this.bottomMargin;
        StringBuilder g10 = g.g("HeaderDTO(title=", textDTO, ", subtitle=", textDTO2, ", badge=");
        g10.append(badgeDTO);
        g10.append(", isTopRounded=");
        g10.append(z11);
        g10.append(", backgroundColor=");
        p.c(str, ", action=", ", trackingInfo=", g10, atomActionDTO);
        g10.append(map);
        g10.append(", topIslandCornerRadius=");
        g10.append(cornerRadius);
        g10.append(", leftMargin=");
        a.e(g10, paddings, ", topMargin=", paddings2, ", rightMargin=");
        return b.e(g10, paddings3, ", bottomMargin=", paddings4, ")");
    }

    public /* synthetic */ HeaderDTO(TextDTO textDTO, TextDTO textDTO2, BadgeDTO badgeDTO, boolean z11, String str, AtomActionDTO atomActionDTO, Map map, CornerRadius cornerRadius, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textDTO, textDTO2, badgeDTO, (i11 & 8) != 0 ? false : z11, str, atomActionDTO, map, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? CornerRadius.NO_RADIUS : cornerRadius, (i11 & 256) != 0 ? Paddings.NONE : paddings, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? Paddings.NONE : paddings2, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? Paddings.NONE : paddings3, (i11 & 2048) != 0 ? Paddings.NONE : paddings4);
    }
}
