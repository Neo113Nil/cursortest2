package ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelPriceDetailInformation.v1.presentation.sticky;

import Ak.C2436a;
import G.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/presentation/sticky/TravelPriceDetailInformationStickyVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "totalPrice", "subtitle", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "smallButton", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTotalPrice", "getSubtitle", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getSmallButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelPriceDetailInformationStickyVO implements c {
    private final long id;

    @NotNull
    private final ButtonV3Atom.SmallButton smallButton;
    private final String subtitle;

    @NotNull
    private final String totalPrice;

    public TravelPriceDetailInformationStickyVO(long j11, @NotNull String totalPrice, String str, @NotNull ButtonV3Atom.SmallButton smallButton) {
        Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
        Intrinsics.checkNotNullParameter(smallButton, "smallButton");
        this.id = j11;
        this.totalPrice = totalPrice;
        this.subtitle = str;
        this.smallButton = smallButton;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelPriceDetailInformationStickyVO)) {
            return false;
        }
        TravelPriceDetailInformationStickyVO travelPriceDetailInformationStickyVO = (TravelPriceDetailInformationStickyVO) other;
        return this.id == travelPriceDetailInformationStickyVO.id && Intrinsics.d(this.totalPrice, travelPriceDetailInformationStickyVO.totalPrice) && Intrinsics.d(this.subtitle, travelPriceDetailInformationStickyVO.subtitle) && Intrinsics.d(this.smallButton, travelPriceDetailInformationStickyVO.smallButton);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final ButtonV3Atom.SmallButton getSmallButton() {
        return this.smallButton;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTotalPrice() {
        return this.totalPrice;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(Long.hashCode(this.id) * 31, 31, this.totalPrice);
        String str = this.subtitle;
        return this.smallButton.hashCode() + ((a11 + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.totalPrice;
        String str2 = this.subtitle;
        ButtonV3Atom.SmallButton smallButton = this.smallButton;
        StringBuilder c11 = C2436a.c(j11, "TravelPriceDetailInformationStickyVO(id=", ", totalPrice=", str);
        c11.append(", subtitle=");
        c11.append(str2);
        c11.append(", smallButton=");
        c11.append(smallButton);
        c11.append(")");
        return c11.toString();
    }
}
