package ru.ozon.app.android.travel.feature.tours.widgets.toursBookInformer.data;

import J0.C3349u1;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursBookInformer/data/ToursBookInformerDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "infoButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getInfoButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ToursBookInformerDTO {
    public static final int $stable = 8;
    private final Icon icon;

    @NotNull
    private final ButtonV3Atom.SmallIconButton infoButton;

    @NotNull
    private final TextAtom title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public ToursBookInformerDTO(@NotNull TextAtom title, Icon icon, @NotNull ButtonV3Atom.SmallIconButton infoButton, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(infoButton, "infoButton");
        this.title = title;
        this.icon = icon;
        this.infoButton = infoButton;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ToursBookInformerDTO copy$default(ToursBookInformerDTO toursBookInformerDTO, TextAtom textAtom, Icon icon, ButtonV3Atom.SmallIconButton smallIconButton, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = toursBookInformerDTO.title;
        }
        if ((i11 & 2) != 0) {
            icon = toursBookInformerDTO.icon;
        }
        if ((i11 & 4) != 0) {
            smallIconButton = toursBookInformerDTO.infoButton;
        }
        if ((i11 & 8) != 0) {
            map = toursBookInformerDTO.trackingInfo;
        }
        return toursBookInformerDTO.copy(textAtom, icon, smallIconButton, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final Icon getIcon() {
        return this.icon;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ButtonV3Atom.SmallIconButton getInfoButton() {
        return this.infoButton;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final ToursBookInformerDTO copy(@NotNull TextAtom title, Icon icon, @NotNull ButtonV3Atom.SmallIconButton infoButton, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(infoButton, "infoButton");
        return new ToursBookInformerDTO(title, icon, infoButton, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToursBookInformerDTO)) {
            return false;
        }
        ToursBookInformerDTO toursBookInformerDTO = (ToursBookInformerDTO) other;
        return Intrinsics.d(this.title, toursBookInformerDTO.title) && Intrinsics.d(this.icon, toursBookInformerDTO.icon) && Intrinsics.d(this.infoButton, toursBookInformerDTO.infoButton) && Intrinsics.d(this.trackingInfo, toursBookInformerDTO.trackingInfo);
    }

    public final Icon getIcon() {
        return this.icon;
    }

    @NotNull
    public final ButtonV3Atom.SmallIconButton getInfoButton() {
        return this.infoButton;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        Icon icon = this.icon;
        int d11 = C3349u1.d(this.infoButton, (hashCode + (icon == null ? 0 : icon.hashCode())) * 31, 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return d11 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ToursBookInformerDTO(title=" + this.title + ", icon=" + this.icon + ", infoButton=" + this.infoButton + ", trackingInfo=" + this.trackingInfo + ")";
    }
}
