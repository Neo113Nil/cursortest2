package ru.ozon.app.android.returns.creation.widgets.activeDeliveries.presentation.element.viewItem;

import Bi.b;
import D3.h;
import G.g;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImagesVO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b\u0007\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010\u0011R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/activeDeliveries/presentation/element/viewItem/ElementVI;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "", "isActive", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "", "backgroundColor", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImagesVO;", "itemImages", "<init>", "(JLru/ozon/uni/atoms/data/dsCell/CellDTO;ZLru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/String;Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImagesVO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Z", "()Z", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImagesVO;", "getItemImages", "()Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImagesVO;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ElementVI implements c {
    public static final int $stable = ImagesVO.$stable | CellDTO.$stable;

    @NotNull
    private final String backgroundColor;
    private final BadgeDTO badge;

    @NotNull
    private final CellDTO cell;
    private final long id;
    private final boolean isActive;

    @NotNull
    private final ImagesVO itemImages;

    public ElementVI(long j11, @NotNull CellDTO cell, boolean z11, BadgeDTO badgeDTO, @NotNull String backgroundColor, @NotNull ImagesVO itemImages) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(itemImages, "itemImages");
        this.id = j11;
        this.cell = cell;
        this.isActive = z11;
        this.badge = badgeDTO;
        this.backgroundColor = backgroundColor;
        this.itemImages = itemImages;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ElementVI)) {
            return false;
        }
        ElementVI elementVI = (ElementVI) other;
        return this.id == elementVI.id && Intrinsics.d(this.cell, elementVI.cell) && this.isActive == elementVI.isActive && Intrinsics.d(this.badge, elementVI.badge) && Intrinsics.d(this.backgroundColor, elementVI.backgroundColor) && Intrinsics.d(this.itemImages, elementVI.itemImages);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final ImagesVO getItemImages() {
        return this.itemImages;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C3532b.a(b.c(this.cell, Long.hashCode(this.id) * 31, 31), 31, this.isActive);
        BadgeDTO badgeDTO = this.badge;
        return this.itemImages.hashCode() + g.a((a11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31, 31, this.backgroundColor);
    }

    /* renamed from: isActive, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        CellDTO cellDTO = this.cell;
        boolean z11 = this.isActive;
        BadgeDTO badgeDTO = this.badge;
        String str = this.backgroundColor;
        ImagesVO imagesVO = this.itemImages;
        StringBuilder e11 = h.e("ElementVI(id=", j11, ", cell=", cellDTO);
        e11.append(", isActive=");
        e11.append(z11);
        e11.append(", badge=");
        e11.append(badgeDTO);
        e11.append(", backgroundColor=");
        e11.append(str);
        e11.append(", itemImages=");
        e11.append(imagesVO);
        e11.append(")");
        return e11.toString();
    }
}
