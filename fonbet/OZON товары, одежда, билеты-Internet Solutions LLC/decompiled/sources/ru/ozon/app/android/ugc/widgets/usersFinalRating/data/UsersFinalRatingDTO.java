package ru.ozon.app.android.ugc.widgets.usersFinalRating.data;

import B90.C2619v;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lru/ozon/app/android/ugc/widgets/usersFinalRating/data/UsersFinalRatingDTO;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "showDetailsButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "valueText", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(FLru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/Map;)V", "getValue", "()F", "getShowDetailsButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getValueText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UsersFinalRatingDTO {
    public static final int $stable = 8;
    private final ButtonV3Atom.SmallIconButton showDetailsButton;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final float value;

    @NotNull
    private final TextAtom valueText;

    public UsersFinalRatingDTO(float f7, ButtonV3Atom.SmallIconButton smallIconButton, @NotNull TextAtom valueText, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(valueText, "valueText");
        this.value = f7;
        this.showDetailsButton = smallIconButton;
        this.valueText = valueText;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UsersFinalRatingDTO copy$default(UsersFinalRatingDTO usersFinalRatingDTO, float f7, ButtonV3Atom.SmallIconButton smallIconButton, TextAtom textAtom, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f7 = usersFinalRatingDTO.value;
        }
        if ((i11 & 2) != 0) {
            smallIconButton = usersFinalRatingDTO.showDetailsButton;
        }
        if ((i11 & 4) != 0) {
            textAtom = usersFinalRatingDTO.valueText;
        }
        if ((i11 & 8) != 0) {
            map = usersFinalRatingDTO.trackingInfo;
        }
        return usersFinalRatingDTO.copy(f7, smallIconButton, textAtom, map);
    }

    /* renamed from: component1, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    /* renamed from: component2, reason: from getter */
    public final ButtonV3Atom.SmallIconButton getShowDetailsButton() {
        return this.showDetailsButton;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextAtom getValueText() {
        return this.valueText;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final UsersFinalRatingDTO copy(float value, ButtonV3Atom.SmallIconButton showDetailsButton, @NotNull TextAtom valueText, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(valueText, "valueText");
        return new UsersFinalRatingDTO(value, showDetailsButton, valueText, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UsersFinalRatingDTO)) {
            return false;
        }
        UsersFinalRatingDTO usersFinalRatingDTO = (UsersFinalRatingDTO) other;
        return Float.compare(this.value, usersFinalRatingDTO.value) == 0 && Intrinsics.d(this.showDetailsButton, usersFinalRatingDTO.showDetailsButton) && Intrinsics.d(this.valueText, usersFinalRatingDTO.valueText) && Intrinsics.d(this.trackingInfo, usersFinalRatingDTO.trackingInfo);
    }

    public final ButtonV3Atom.SmallIconButton getShowDetailsButton() {
        return this.showDetailsButton;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final float getValue() {
        return this.value;
    }

    @NotNull
    public final TextAtom getValueText() {
        return this.valueText;
    }

    public int hashCode() {
        int hashCode = Float.hashCode(this.value) * 31;
        ButtonV3Atom.SmallIconButton smallIconButton = this.showDetailsButton;
        int b11 = C2619v.b((hashCode + (smallIconButton == null ? 0 : smallIconButton.hashCode())) * 31, 31, this.valueText);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return b11 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UsersFinalRatingDTO(value=" + this.value + ", showDetailsButton=" + this.showDetailsButton + ", valueText=" + this.valueText + ", trackingInfo=" + this.trackingInfo + ")";
    }
}
