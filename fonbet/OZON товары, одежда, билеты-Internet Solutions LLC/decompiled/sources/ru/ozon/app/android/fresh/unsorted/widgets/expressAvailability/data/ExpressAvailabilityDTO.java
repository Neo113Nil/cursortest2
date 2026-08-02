package ru.ozon.app.android.fresh.unsorted.widgets.expressAvailability.data;

import G.g;
import N3.C3660k;
import T7.P;
import Tl.b;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JK\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/expressAvailability/data/ExpressAvailabilityDTO;", "", "image", "", "description", "changeCategoryButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "changeAddressButton", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/util/Map;)V", "getImage", "()Ljava/lang/String;", "getDescription", "getChangeCategoryButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getChangeAddressButton", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ExpressAvailabilityDTO {
    public static final int $stable = 8;

    @NotNull
    private final ButtonV3Atom.LargeButton changeAddressButton;
    private final ButtonV3Atom.LargeButton changeCategoryButton;

    @NotNull
    private final String description;

    @NotNull
    private final String image;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public ExpressAvailabilityDTO(@NotNull String image, @NotNull String description, ButtonV3Atom.LargeButton largeButton, @NotNull ButtonV3Atom.LargeButton changeAddressButton, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(changeAddressButton, "changeAddressButton");
        this.image = image;
        this.description = description;
        this.changeCategoryButton = largeButton;
        this.changeAddressButton = changeAddressButton;
        this.trackingInfo = map;
    }

    public static /* synthetic */ ExpressAvailabilityDTO copy$default(ExpressAvailabilityDTO expressAvailabilityDTO, String str, String str2, ButtonV3Atom.LargeButton largeButton, ButtonV3Atom.LargeButton largeButton2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = expressAvailabilityDTO.image;
        }
        if ((i11 & 2) != 0) {
            str2 = expressAvailabilityDTO.description;
        }
        if ((i11 & 4) != 0) {
            largeButton = expressAvailabilityDTO.changeCategoryButton;
        }
        if ((i11 & 8) != 0) {
            largeButton2 = expressAvailabilityDTO.changeAddressButton;
        }
        if ((i11 & 16) != 0) {
            map = expressAvailabilityDTO.trackingInfo;
        }
        Map map2 = map;
        ButtonV3Atom.LargeButton largeButton3 = largeButton;
        return expressAvailabilityDTO.copy(str, str2, largeButton3, largeButton2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final ButtonV3Atom.LargeButton getChangeCategoryButton() {
        return this.changeCategoryButton;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ButtonV3Atom.LargeButton getChangeAddressButton() {
        return this.changeAddressButton;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final ExpressAvailabilityDTO copy(@NotNull String image, @NotNull String description, ButtonV3Atom.LargeButton changeCategoryButton, @NotNull ButtonV3Atom.LargeButton changeAddressButton, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(changeAddressButton, "changeAddressButton");
        return new ExpressAvailabilityDTO(image, description, changeCategoryButton, changeAddressButton, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpressAvailabilityDTO)) {
            return false;
        }
        ExpressAvailabilityDTO expressAvailabilityDTO = (ExpressAvailabilityDTO) other;
        return Intrinsics.d(this.image, expressAvailabilityDTO.image) && Intrinsics.d(this.description, expressAvailabilityDTO.description) && Intrinsics.d(this.changeCategoryButton, expressAvailabilityDTO.changeCategoryButton) && Intrinsics.d(this.changeAddressButton, expressAvailabilityDTO.changeAddressButton) && Intrinsics.d(this.trackingInfo, expressAvailabilityDTO.trackingInfo);
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getChangeAddressButton() {
        return this.changeAddressButton;
    }

    public final ButtonV3Atom.LargeButton getChangeCategoryButton() {
        return this.changeCategoryButton;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = g.a(this.image.hashCode() * 31, 31, this.description);
        ButtonV3Atom.LargeButton largeButton = this.changeCategoryButton;
        int a12 = b.a(this.changeAddressButton, (a11 + (largeButton == null ? 0 : largeButton.hashCode())) * 31, 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return a12 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.image;
        String str2 = this.description;
        ButtonV3Atom.LargeButton largeButton = this.changeCategoryButton;
        ButtonV3Atom.LargeButton largeButton2 = this.changeAddressButton;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C3660k.d("ExpressAvailabilityDTO(image=", str, ", description=", str2, ", changeCategoryButton=");
        d11.append(largeButton);
        d11.append(", changeAddressButton=");
        d11.append(largeButton2);
        d11.append(", trackingInfo=");
        return P.f(d11, map, ")");
    }
}
