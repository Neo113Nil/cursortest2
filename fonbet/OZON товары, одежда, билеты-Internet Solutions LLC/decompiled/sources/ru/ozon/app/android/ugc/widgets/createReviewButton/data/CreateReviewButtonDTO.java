package ru.ozon.app.android.ugc.widgets.createReviewButton.data;

import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J9\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/ugc/widgets/createReviewButton/data/CreateReviewButtonDTO;", "", "writeReviewButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "subtitle", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/Map;)V", "getWriteReviewButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getSubtitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CreateReviewButtonDTO {
    public static final int $stable = 8;
    private final TextAtom subtitle;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final ButtonV3Atom.LargeButton writeReviewButton;

    public CreateReviewButtonDTO(ButtonV3Atom.LargeButton largeButton, TextAtom textAtom, Map<String, TokenizedTrackingInfo> map) {
        this.writeReviewButton = largeButton;
        this.subtitle = textAtom;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateReviewButtonDTO copy$default(CreateReviewButtonDTO createReviewButtonDTO, ButtonV3Atom.LargeButton largeButton, TextAtom textAtom, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            largeButton = createReviewButtonDTO.writeReviewButton;
        }
        if ((i11 & 2) != 0) {
            textAtom = createReviewButtonDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            map = createReviewButtonDTO.trackingInfo;
        }
        return createReviewButtonDTO.copy(largeButton, textAtom, map);
    }

    /* renamed from: component1, reason: from getter */
    public final ButtonV3Atom.LargeButton getWriteReviewButton() {
        return this.writeReviewButton;
    }

    /* renamed from: component2, reason: from getter */
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final CreateReviewButtonDTO copy(ButtonV3Atom.LargeButton writeReviewButton, TextAtom subtitle, Map<String, TokenizedTrackingInfo> trackingInfo) {
        return new CreateReviewButtonDTO(writeReviewButton, subtitle, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateReviewButtonDTO)) {
            return false;
        }
        CreateReviewButtonDTO createReviewButtonDTO = (CreateReviewButtonDTO) other;
        return Intrinsics.d(this.writeReviewButton, createReviewButtonDTO.writeReviewButton) && Intrinsics.d(this.subtitle, createReviewButtonDTO.subtitle) && Intrinsics.d(this.trackingInfo, createReviewButtonDTO.trackingInfo);
    }

    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final ButtonV3Atom.LargeButton getWriteReviewButton() {
        return this.writeReviewButton;
    }

    public int hashCode() {
        ButtonV3Atom.LargeButton largeButton = this.writeReviewButton;
        int hashCode = (largeButton == null ? 0 : largeButton.hashCode()) * 31;
        TextAtom textAtom = this.subtitle;
        int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ButtonV3Atom.LargeButton largeButton = this.writeReviewButton;
        TextAtom textAtom = this.subtitle;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("CreateReviewButtonDTO(writeReviewButton=");
        sb2.append(largeButton);
        sb2.append(", subtitle=");
        sb2.append(textAtom);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
