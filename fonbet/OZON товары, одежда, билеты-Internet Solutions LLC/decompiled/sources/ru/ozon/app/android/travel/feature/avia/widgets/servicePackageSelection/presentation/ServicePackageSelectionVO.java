package ru.ozon.app.android.travel.feature.avia.widgets.servicePackageSelection.presentation;

import B0.C2454a;
import B6.b;
import El.C2971a;
import Fm.C3051a;
import G.g;
import Kk.C3532b;
import TY.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001)BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b'\u0010 R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b(\u0010#¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/servicePackageSelection/presentation/ServicePackageSelectionVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/travel/feature/avia/widgets/servicePackageSelection/presentation/ServicePackageSelectionVO$PackageTabVO;", "packageTabs", "", "hasExtraTopPadding", "description", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cells", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;ZLru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getPackageTabs", "()Ljava/util/List;", "Z", "getHasExtraTopPadding", "()Z", "getDescription", "getCells", "PackageTabVO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ServicePackageSelectionVO implements c {

    @NotNull
    private final List<CellDTO> cells;

    @NotNull
    private final TextDTO description;
    private final boolean hasExtraTopPadding;
    private final long id;

    @NotNull
    private final List<PackageTabVO> packageTabs;

    @NotNull
    private final TextDTO title;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/servicePackageSelection/presentation/ServicePackageSelectionVO$PackageTabVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "Lru/ozon/uni/android/uikitsdk/Color;", "strokeColor", "", "strokeThickness", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "discountBadge", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/android/uikitsdk/Color;ILru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "Lru/ozon/uni/android/uikitsdk/Color;", "getStrokeColor", "()Lru/ozon/uni/android/uikitsdk/Color;", "I", "getStrokeThickness", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getDiscountBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PackageTabVO {
        public static final int $stable = (AtomAction.$stable | IconDTO.$stable) | PriceDTO.$stable;
        private final AtomAction action;
        private final BadgeDTO discountBadge;

        @NotNull
        private final IconDTO icon;

        @NotNull
        private final PriceDTO price;

        @NotNull
        private final Color strokeColor;
        private final int strokeThickness;

        @NotNull
        private final TextDTO title;

        public PackageTabVO(@NotNull TextDTO title, @NotNull PriceDTO price, @NotNull Color strokeColor, int i11, @NotNull IconDTO icon, BadgeDTO badgeDTO, AtomAction atomAction) {
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
            this.action = atomAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PackageTabVO)) {
                return false;
            }
            PackageTabVO packageTabVO = (PackageTabVO) other;
            return Intrinsics.d(this.title, packageTabVO.title) && Intrinsics.d(this.price, packageTabVO.price) && Intrinsics.d(this.strokeColor, packageTabVO.strokeColor) && this.strokeThickness == packageTabVO.strokeThickness && Intrinsics.d(this.icon, packageTabVO.icon) && Intrinsics.d(this.discountBadge, packageTabVO.discountBadge) && Intrinsics.d(this.action, packageTabVO.action);
        }

        public final AtomAction getAction() {
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
        public final Color getStrokeColor() {
            return this.strokeColor;
        }

        public final int getStrokeThickness() {
            return this.strokeThickness;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int a11 = C2971a.a(this.icon, C2454a.a(this.strokeThickness, (this.strokeColor.hashCode() + C3051a.b(this.price, this.title.hashCode() * 31, 31)) * 31, 31), 31);
            BadgeDTO badgeDTO = this.discountBadge;
            int hashCode = (a11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            AtomAction atomAction = this.action;
            return hashCode + (atomAction != null ? atomAction.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            PriceDTO priceDTO = this.price;
            Color color = this.strokeColor;
            int i11 = this.strokeThickness;
            IconDTO iconDTO = this.icon;
            BadgeDTO badgeDTO = this.discountBadge;
            AtomAction atomAction = this.action;
            StringBuilder sb2 = new StringBuilder("PackageTabVO(title=");
            sb2.append(textDTO);
            sb2.append(", price=");
            sb2.append(priceDTO);
            sb2.append(", strokeColor=");
            sb2.append(color);
            sb2.append(", strokeThickness=");
            sb2.append(i11);
            sb2.append(", icon=");
            sb2.append(iconDTO);
            sb2.append(", discountBadge=");
            sb2.append(badgeDTO);
            sb2.append(", action=");
            return b.b(sb2, atomAction, ")");
        }
    }

    public ServicePackageSelectionVO(long j11, @NotNull TextDTO title, @NotNull List<PackageTabVO> packageTabs, boolean z11, @NotNull TextDTO description, @NotNull List<CellDTO> cells) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(packageTabs, "packageTabs");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(cells, "cells");
        this.id = j11;
        this.title = title;
        this.packageTabs = packageTabs;
        this.hasExtraTopPadding = z11;
        this.description = description;
        this.cells = cells;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServicePackageSelectionVO)) {
            return false;
        }
        ServicePackageSelectionVO servicePackageSelectionVO = (ServicePackageSelectionVO) other;
        return this.id == servicePackageSelectionVO.id && Intrinsics.d(this.title, servicePackageSelectionVO.title) && Intrinsics.d(this.packageTabs, servicePackageSelectionVO.packageTabs) && this.hasExtraTopPadding == servicePackageSelectionVO.hasExtraTopPadding && Intrinsics.d(this.description, servicePackageSelectionVO.description) && Intrinsics.d(this.cells, servicePackageSelectionVO.cells);
    }

    @NotNull
    public final List<CellDTO> getCells() {
        return this.cells;
    }

    @NotNull
    public final TextDTO getDescription() {
        return this.description;
    }

    public final boolean getHasExtraTopPadding() {
        return this.hasExtraTopPadding;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<PackageTabVO> getPackageTabs() {
        return this.packageTabs;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.cells.hashCode() + Ns.b.a(this.description, C3532b.a(g.b(Ns.b.a(this.title, Long.hashCode(this.id) * 31, 31), 31, this.packageTabs), 31, this.hasExtraTopPadding), 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        List<PackageTabVO> list = this.packageTabs;
        boolean z11 = this.hasExtraTopPadding;
        TextDTO textDTO2 = this.description;
        List<CellDTO> list2 = this.cells;
        StringBuilder b11 = a.b("ServicePackageSelectionVO(id=", j11, ", title=", textDTO);
        AZ.c.c(b11, ", packageTabs=", list, ", hasExtraTopPadding=", z11);
        b11.append(", description=");
        b11.append(textDTO2);
        b11.append(", cells=");
        b11.append(list2);
        b11.append(")");
        return b11.toString();
    }
}
