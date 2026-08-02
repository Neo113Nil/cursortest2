package ru.ozon.app.android.travel.molecules.dto.railwayServices;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/railwayServices/RailwayServicesDTO;", "", "icons", "", "Lru/ozon/uni/atoms/data/button/Icon;", "infoButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;)V", "getIcons", "()Ljava/util/List;", "getInfoButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RailwayServicesDTO {

    @NotNull
    private final List<Icon> icons;

    @NotNull
    private final ButtonV3Atom.SmallIconButton infoButton;

    public RailwayServicesDTO(@NotNull List<Icon> icons, @NotNull ButtonV3Atom.SmallIconButton infoButton) {
        Intrinsics.checkNotNullParameter(icons, "icons");
        Intrinsics.checkNotNullParameter(infoButton, "infoButton");
        this.icons = icons;
        this.infoButton = infoButton;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RailwayServicesDTO copy$default(RailwayServicesDTO railwayServicesDTO, List list, ButtonV3Atom.SmallIconButton smallIconButton, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = railwayServicesDTO.icons;
        }
        if ((i11 & 2) != 0) {
            smallIconButton = railwayServicesDTO.infoButton;
        }
        return railwayServicesDTO.copy(list, smallIconButton);
    }

    @NotNull
    public final List<Icon> component1() {
        return this.icons;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ButtonV3Atom.SmallIconButton getInfoButton() {
        return this.infoButton;
    }

    @NotNull
    public final RailwayServicesDTO copy(@NotNull List<Icon> icons, @NotNull ButtonV3Atom.SmallIconButton infoButton) {
        Intrinsics.checkNotNullParameter(icons, "icons");
        Intrinsics.checkNotNullParameter(infoButton, "infoButton");
        return new RailwayServicesDTO(icons, infoButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RailwayServicesDTO)) {
            return false;
        }
        RailwayServicesDTO railwayServicesDTO = (RailwayServicesDTO) other;
        return Intrinsics.d(this.icons, railwayServicesDTO.icons) && Intrinsics.d(this.infoButton, railwayServicesDTO.infoButton);
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
        return "RailwayServicesDTO(icons=" + this.icons + ", infoButton=" + this.infoButton + ")";
    }

    public RailwayServicesDTO(List list, ButtonV3Atom.SmallIconButton smallIconButton, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? K.f71697a : list, smallIconButton);
    }
}
