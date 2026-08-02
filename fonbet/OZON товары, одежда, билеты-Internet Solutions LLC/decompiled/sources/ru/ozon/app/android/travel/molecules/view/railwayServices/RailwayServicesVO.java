package ru.ozon.app.android.travel.molecules.view.railwayServices;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/railwayServices/RailwayServicesVO;", "", "", "Lru/ozon/uni/atoms/data/button/Icon;", "icons", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "infoButton", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getIcons", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getInfoButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RailwayServicesVO {
    public static final int $stable = 8;

    @NotNull
    private final List<Icon> icons;

    @NotNull
    private final ButtonV3Atom.SmallIconButton infoButton;

    public RailwayServicesVO(@NotNull List<Icon> icons, @NotNull ButtonV3Atom.SmallIconButton infoButton) {
        Intrinsics.checkNotNullParameter(icons, "icons");
        Intrinsics.checkNotNullParameter(infoButton, "infoButton");
        this.icons = icons;
        this.infoButton = infoButton;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RailwayServicesVO)) {
            return false;
        }
        RailwayServicesVO railwayServicesVO = (RailwayServicesVO) other;
        return Intrinsics.d(this.icons, railwayServicesVO.icons) && Intrinsics.d(this.infoButton, railwayServicesVO.infoButton);
    }

    @NotNull
    public final List<Icon> getIcons() {
        return this.icons;
    }

    @NotNull
    public final ButtonV3Atom.SmallIconButton getInfoButton() {
        return this.infoButton;
    }

    public int hashCode() {
        return this.infoButton.hashCode() + (this.icons.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "RailwayServicesVO(icons=" + this.icons + ", infoButton=" + this.infoButton + ")";
    }
}
