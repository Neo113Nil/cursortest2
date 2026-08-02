package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.models;

import Ak.b;
import Gl.C3124a;
import Kk.C3532b;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.dto.shiftedPreviewIcons.ShiftedPreviewIconsDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\fHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/CarriageDetailsDTO;", "", "servicesIcon", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "enableLastIconFade", "", "shiftedPreviewIcons", "Lru/ozon/app/android/travel/molecules/dto/shiftedPreviewIcons/ShiftedPreviewIconsDTO;", "detailsBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Ljava/util/List;ZLru/ozon/app/android/travel/molecules/dto/shiftedPreviewIcons/ShiftedPreviewIconsDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getServicesIcon", "()Ljava/util/List;", "getEnableLastIconFade", "()Z", "getShiftedPreviewIcons", "()Lru/ozon/app/android/travel/molecules/dto/shiftedPreviewIcons/ShiftedPreviewIconsDTO;", "getDetailsBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CarriageDetailsDTO {
    public static final int $stable = 8;

    @NotNull
    private final CommonControlSettings common;

    @NotNull
    private final BadgeDTO detailsBadge;
    private final boolean enableLastIconFade;
    private final List<IconDTO> servicesIcon;
    private final ShiftedPreviewIconsDTO shiftedPreviewIcons;

    public CarriageDetailsDTO(List<IconDTO> list, boolean z11, ShiftedPreviewIconsDTO shiftedPreviewIconsDTO, @NotNull BadgeDTO detailsBadge, @NotNull CommonControlSettings common) {
        Intrinsics.checkNotNullParameter(detailsBadge, "detailsBadge");
        Intrinsics.checkNotNullParameter(common, "common");
        this.servicesIcon = list;
        this.enableLastIconFade = z11;
        this.shiftedPreviewIcons = shiftedPreviewIconsDTO;
        this.detailsBadge = detailsBadge;
        this.common = common;
    }

    public static /* synthetic */ CarriageDetailsDTO copy$default(CarriageDetailsDTO carriageDetailsDTO, List list, boolean z11, ShiftedPreviewIconsDTO shiftedPreviewIconsDTO, BadgeDTO badgeDTO, CommonControlSettings commonControlSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = carriageDetailsDTO.servicesIcon;
        }
        if ((i11 & 2) != 0) {
            z11 = carriageDetailsDTO.enableLastIconFade;
        }
        if ((i11 & 4) != 0) {
            shiftedPreviewIconsDTO = carriageDetailsDTO.shiftedPreviewIcons;
        }
        if ((i11 & 8) != 0) {
            badgeDTO = carriageDetailsDTO.detailsBadge;
        }
        if ((i11 & 16) != 0) {
            commonControlSettings = carriageDetailsDTO.common;
        }
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        ShiftedPreviewIconsDTO shiftedPreviewIconsDTO2 = shiftedPreviewIconsDTO;
        return carriageDetailsDTO.copy(list, z11, shiftedPreviewIconsDTO2, badgeDTO, commonControlSettings2);
    }

    public final List<IconDTO> component1() {
        return this.servicesIcon;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnableLastIconFade() {
        return this.enableLastIconFade;
    }

    /* renamed from: component3, reason: from getter */
    public final ShiftedPreviewIconsDTO getShiftedPreviewIcons() {
        return this.shiftedPreviewIcons;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final BadgeDTO getDetailsBadge() {
        return this.detailsBadge;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final CarriageDetailsDTO copy(List<IconDTO> servicesIcon, boolean enableLastIconFade, ShiftedPreviewIconsDTO shiftedPreviewIcons, @NotNull BadgeDTO detailsBadge, @NotNull CommonControlSettings common) {
        Intrinsics.checkNotNullParameter(detailsBadge, "detailsBadge");
        Intrinsics.checkNotNullParameter(common, "common");
        return new CarriageDetailsDTO(servicesIcon, enableLastIconFade, shiftedPreviewIcons, detailsBadge, common);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CarriageDetailsDTO)) {
            return false;
        }
        CarriageDetailsDTO carriageDetailsDTO = (CarriageDetailsDTO) other;
        return Intrinsics.d(this.servicesIcon, carriageDetailsDTO.servicesIcon) && this.enableLastIconFade == carriageDetailsDTO.enableLastIconFade && Intrinsics.d(this.shiftedPreviewIcons, carriageDetailsDTO.shiftedPreviewIcons) && Intrinsics.d(this.detailsBadge, carriageDetailsDTO.detailsBadge) && Intrinsics.d(this.common, carriageDetailsDTO.common);
    }

    @NotNull
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final BadgeDTO getDetailsBadge() {
        return this.detailsBadge;
    }

    public final boolean getEnableLastIconFade() {
        return this.enableLastIconFade;
    }

    public final List<IconDTO> getServicesIcon() {
        return this.servicesIcon;
    }

    public final ShiftedPreviewIconsDTO getShiftedPreviewIcons() {
        return this.shiftedPreviewIcons;
    }

    public int hashCode() {
        List<IconDTO> list = this.servicesIcon;
        int a11 = C3532b.a((list == null ? 0 : list.hashCode()) * 31, 31, this.enableLastIconFade);
        ShiftedPreviewIconsDTO shiftedPreviewIconsDTO = this.shiftedPreviewIcons;
        return this.common.hashCode() + C3124a.c(this.detailsBadge, (a11 + (shiftedPreviewIconsDTO != null ? shiftedPreviewIconsDTO.hashCode() : 0)) * 31, 31);
    }

    @NotNull
    public String toString() {
        List<IconDTO> list = this.servicesIcon;
        boolean z11 = this.enableLastIconFade;
        ShiftedPreviewIconsDTO shiftedPreviewIconsDTO = this.shiftedPreviewIcons;
        BadgeDTO badgeDTO = this.detailsBadge;
        CommonControlSettings commonControlSettings = this.common;
        StringBuilder sb2 = new StringBuilder("CarriageDetailsDTO(servicesIcon=");
        sb2.append(list);
        sb2.append(", enableLastIconFade=");
        sb2.append(z11);
        sb2.append(", shiftedPreviewIcons=");
        sb2.append(shiftedPreviewIconsDTO);
        sb2.append(", detailsBadge=");
        sb2.append(badgeDTO);
        sb2.append(", common=");
        return b.g(sb2, commonControlSettings, ")");
    }

    public /* synthetic */ CarriageDetailsDTO(List list, boolean z11, ShiftedPreviewIconsDTO shiftedPreviewIconsDTO, BadgeDTO badgeDTO, CommonControlSettings commonControlSettings, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? false : z11, shiftedPreviewIconsDTO, badgeDTO, commonControlSettings);
    }
}
