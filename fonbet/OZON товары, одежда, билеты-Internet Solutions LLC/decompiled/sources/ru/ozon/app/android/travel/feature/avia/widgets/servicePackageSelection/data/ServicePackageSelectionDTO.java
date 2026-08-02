package ru.ozon.app.android.travel.feature.avia.widgets.servicePackageSelection.data;

import B0.C2454a;
import D40.a;
import De.C2859b;
import El.C2971a;
import Fm.C3051a;
import G.g;
import K1.G;
import Ns.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001(BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\rHÆ\u0003JS\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/servicePackageSelection/data/ServicePackageSelectionDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "packageTabs", "", "Lru/ozon/app/android/travel/feature/avia/widgets/servicePackageSelection/data/ServicePackageSelectionDTO$PackageTabDTO;", "description", "cells", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "confirmButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "milesBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPackageTabs", "()Ljava/util/List;", "getDescription", "getCells", "getConfirmButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getMilesBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "PackageTabDTO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ServicePackageSelectionDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<CellDTO> cells;

    @NotNull
    private final ButtonV3DTO confirmButton;

    @NotNull
    private final TextDTO description;
    private final BadgeDTO milesBadge;

    @NotNull
    private final List<PackageTabDTO> packageTabs;

    @NotNull
    private final TextDTO title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\t\u0010)\u001a\u00020\u000bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0017\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003Jk\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\tHÖ\u0001J\t\u00102\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00063"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/servicePackageSelection/data/ServicePackageSelectionDTO$PackageTabDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "strokeColor", "", "strokeThickness", "", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "discountBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Ljava/lang/String;ILru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getStrokeColor", "()Ljava/lang/String;", "getStrokeThickness", "()I", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getDiscountBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PackageTabDTO {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final BadgeDTO discountBadge;

        @NotNull
        private final IconDTO icon;

        @NotNull
        private final PriceDTO price;

        @NotNull
        private final String strokeColor;
        private final int strokeThickness;

        @NotNull
        private final TextDTO title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public PackageTabDTO(@NotNull TextDTO title, @NotNull PriceDTO price, @NotNull String strokeColor, int i11, @NotNull IconDTO icon, BadgeDTO badgeDTO, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(strokeColor, "strokeColor");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.title = title;
            this.price = price;
            this.strokeColor = strokeColor;
            this.strokeThickness = i11;
            this.icon = icon;
            this.discountBadge = badgeDTO;
            this.action = atomActionDTO;
            this.trackingInfo = map;
        }

        public static /* synthetic */ PackageTabDTO copy$default(PackageTabDTO packageTabDTO, TextDTO textDTO, PriceDTO priceDTO, String str, int i11, IconDTO iconDTO, BadgeDTO badgeDTO, AtomActionDTO atomActionDTO, Map map, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                textDTO = packageTabDTO.title;
            }
            if ((i12 & 2) != 0) {
                priceDTO = packageTabDTO.price;
            }
            if ((i12 & 4) != 0) {
                str = packageTabDTO.strokeColor;
            }
            if ((i12 & 8) != 0) {
                i11 = packageTabDTO.strokeThickness;
            }
            if ((i12 & 16) != 0) {
                iconDTO = packageTabDTO.icon;
            }
            if ((i12 & 32) != 0) {
                badgeDTO = packageTabDTO.discountBadge;
            }
            if ((i12 & 64) != 0) {
                atomActionDTO = packageTabDTO.action;
            }
            if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                map = packageTabDTO.trackingInfo;
            }
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Map map2 = map;
            IconDTO iconDTO2 = iconDTO;
            BadgeDTO badgeDTO2 = badgeDTO;
            return packageTabDTO.copy(textDTO, priceDTO, str, i11, iconDTO2, badgeDTO2, atomActionDTO2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final PriceDTO getPrice() {
            return this.price;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getStrokeColor() {
            return this.strokeColor;
        }

        /* renamed from: component4, reason: from getter */
        public final int getStrokeThickness() {
            return this.strokeThickness;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        /* renamed from: component6, reason: from getter */
        public final BadgeDTO getDiscountBadge() {
            return this.discountBadge;
        }

        /* renamed from: component7, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component8() {
            return this.trackingInfo;
        }

        @NotNull
        public final PackageTabDTO copy(@NotNull TextDTO title, @NotNull PriceDTO price, @NotNull String strokeColor, int strokeThickness, @NotNull IconDTO icon, BadgeDTO discountBadge, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(strokeColor, "strokeColor");
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new PackageTabDTO(title, price, strokeColor, strokeThickness, icon, discountBadge, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PackageTabDTO)) {
                return false;
            }
            PackageTabDTO packageTabDTO = (PackageTabDTO) other;
            return Intrinsics.d(this.title, packageTabDTO.title) && Intrinsics.d(this.price, packageTabDTO.price) && Intrinsics.d(this.strokeColor, packageTabDTO.strokeColor) && this.strokeThickness == packageTabDTO.strokeThickness && Intrinsics.d(this.icon, packageTabDTO.icon) && Intrinsics.d(this.discountBadge, packageTabDTO.discountBadge) && Intrinsics.d(this.action, packageTabDTO.action) && Intrinsics.d(this.trackingInfo, packageTabDTO.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final BadgeDTO getDiscountBadge() {
            return this.discountBadge;
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final PriceDTO getPrice() {
            return this.price;
        }

        @NotNull
        public final String getStrokeColor() {
            return this.strokeColor;
        }

        public final int getStrokeThickness() {
            return this.strokeThickness;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = C2971a.a(this.icon, C2454a.a(this.strokeThickness, g.a(C3051a.b(this.price, this.title.hashCode() * 31, 31), 31, this.strokeColor), 31), 31);
            BadgeDTO badgeDTO = this.discountBadge;
            int hashCode = (a11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            PriceDTO priceDTO = this.price;
            String str = this.strokeColor;
            int i11 = this.strokeThickness;
            IconDTO iconDTO = this.icon;
            BadgeDTO badgeDTO = this.discountBadge;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("PackageTabDTO(title=");
            sb2.append(textDTO);
            sb2.append(", price=");
            sb2.append(priceDTO);
            sb2.append(", strokeColor=");
            Pk0.g.d(i11, str, ", strokeThickness=", ", icon=", sb2);
            sb2.append(iconDTO);
            sb2.append(", discountBadge=");
            sb2.append(badgeDTO);
            sb2.append(", action=");
            return a.d(sb2, atomActionDTO, ", trackingInfo=", map, ")");
        }
    }

    public ServicePackageSelectionDTO(@NotNull TextDTO title, @NotNull List<PackageTabDTO> packageTabs, @NotNull TextDTO description, @NotNull List<CellDTO> cells, @NotNull ButtonV3DTO confirmButton, BadgeDTO badgeDTO) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(packageTabs, "packageTabs");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(confirmButton, "confirmButton");
        this.title = title;
        this.packageTabs = packageTabs;
        this.description = description;
        this.cells = cells;
        this.confirmButton = confirmButton;
        this.milesBadge = badgeDTO;
    }

    public static /* synthetic */ ServicePackageSelectionDTO copy$default(ServicePackageSelectionDTO servicePackageSelectionDTO, TextDTO textDTO, List list, TextDTO textDTO2, List list2, ButtonV3DTO buttonV3DTO, BadgeDTO badgeDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = servicePackageSelectionDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = servicePackageSelectionDTO.packageTabs;
        }
        if ((i11 & 4) != 0) {
            textDTO2 = servicePackageSelectionDTO.description;
        }
        if ((i11 & 8) != 0) {
            list2 = servicePackageSelectionDTO.cells;
        }
        if ((i11 & 16) != 0) {
            buttonV3DTO = servicePackageSelectionDTO.confirmButton;
        }
        if ((i11 & 32) != 0) {
            badgeDTO = servicePackageSelectionDTO.milesBadge;
        }
        ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
        BadgeDTO badgeDTO2 = badgeDTO;
        return servicePackageSelectionDTO.copy(textDTO, list, textDTO2, list2, buttonV3DTO2, badgeDTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    public final List<PackageTabDTO> component2() {
        return this.packageTabs;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextDTO getDescription() {
        return this.description;
    }

    @NotNull
    public final List<CellDTO> component4() {
        return this.cells;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final ButtonV3DTO getConfirmButton() {
        return this.confirmButton;
    }

    /* renamed from: component6, reason: from getter */
    public final BadgeDTO getMilesBadge() {
        return this.milesBadge;
    }

    @NotNull
    public final ServicePackageSelectionDTO copy(@NotNull TextDTO title, @NotNull List<PackageTabDTO> packageTabs, @NotNull TextDTO description, @NotNull List<CellDTO> cells, @NotNull ButtonV3DTO confirmButton, BadgeDTO milesBadge) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(packageTabs, "packageTabs");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(confirmButton, "confirmButton");
        return new ServicePackageSelectionDTO(title, packageTabs, description, cells, confirmButton, milesBadge);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServicePackageSelectionDTO)) {
            return false;
        }
        ServicePackageSelectionDTO servicePackageSelectionDTO = (ServicePackageSelectionDTO) other;
        return Intrinsics.d(this.title, servicePackageSelectionDTO.title) && Intrinsics.d(this.packageTabs, servicePackageSelectionDTO.packageTabs) && Intrinsics.d(this.description, servicePackageSelectionDTO.description) && Intrinsics.d(this.cells, servicePackageSelectionDTO.cells) && Intrinsics.d(this.confirmButton, servicePackageSelectionDTO.confirmButton) && Intrinsics.d(this.milesBadge, servicePackageSelectionDTO.milesBadge);
    }

    @NotNull
    public final List<CellDTO> getCells() {
        return this.cells;
    }

    @NotNull
    public final ButtonV3DTO getConfirmButton() {
        return this.confirmButton;
    }

    @NotNull
    public final TextDTO getDescription() {
        return this.description;
    }

    public final BadgeDTO getMilesBadge() {
        return this.milesBadge;
    }

    @NotNull
    public final List<PackageTabDTO> getPackageTabs() {
        return this.packageTabs;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int c11 = C2859b.c(this.confirmButton, g.b(b.a(this.description, g.b(this.title.hashCode() * 31, 31, this.packageTabs), 31), 31, this.cells), 31);
        BadgeDTO badgeDTO = this.milesBadge;
        return c11 + (badgeDTO == null ? 0 : badgeDTO.hashCode());
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        List<PackageTabDTO> list = this.packageTabs;
        TextDTO textDTO2 = this.description;
        List<CellDTO> list2 = this.cells;
        ButtonV3DTO buttonV3DTO = this.confirmButton;
        BadgeDTO badgeDTO = this.milesBadge;
        StringBuilder e11 = G.e("ServicePackageSelectionDTO(title=", textDTO, ", packageTabs=", list, ", description=");
        Tl.a.e(e11, textDTO2, ", cells=", list2, ", confirmButton=");
        e11.append(buttonV3DTO);
        e11.append(", milesBadge=");
        e11.append(badgeDTO);
        e11.append(")");
        return e11.toString();
    }
}
