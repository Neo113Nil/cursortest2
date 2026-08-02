package ru.ozon.app.android.fresh.geo.widgets.geotrackingBottomButton.data;

import F3.G;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingBottomButton/data/GeotrackingBottomButtonDTO;", "", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class GeotrackingBottomButtonDTO {

    @NotNull
    private final ButtonV3DTO button;

    public GeotrackingBottomButtonDTO(@NotNull ButtonV3DTO button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.button = button;
    }

    public static /* synthetic */ GeotrackingBottomButtonDTO copy$default(GeotrackingBottomButtonDTO geotrackingBottomButtonDTO, ButtonV3DTO buttonV3DTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            buttonV3DTO = geotrackingBottomButtonDTO.button;
        }
        return geotrackingBottomButtonDTO.copy(buttonV3DTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final GeotrackingBottomButtonDTO copy(@NotNull ButtonV3DTO button) {
        Intrinsics.checkNotNullParameter(button, "button");
        return new GeotrackingBottomButtonDTO(button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GeotrackingBottomButtonDTO) && Intrinsics.d(this.button, ((GeotrackingBottomButtonDTO) other).button);
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    public int hashCode() {
        return this.button.hashCode();
    }

    @NotNull
    public String toString() {
        return G.b(this.button, "GeotrackingBottomButtonDTO(button=", ")");
    }
}
