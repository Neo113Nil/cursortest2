package ru.ozon.app.android.fresh.geo.ui.molecules.oldHeader;

import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/fresh/geo/ui/molecules/oldHeader/FreshHeaderDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FreshHeaderDTO {
    private final ButtonV3Atom.LargeBorderlessButton button;

    @NotNull
    private final TextAtom title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public FreshHeaderDTO(@NotNull TextAtom title, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.button = largeBorderlessButton;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FreshHeaderDTO copy$default(FreshHeaderDTO freshHeaderDTO, TextAtom textAtom, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = freshHeaderDTO.title;
        }
        if ((i11 & 2) != 0) {
            largeBorderlessButton = freshHeaderDTO.button;
        }
        if ((i11 & 4) != 0) {
            map = freshHeaderDTO.trackingInfo;
        }
        return freshHeaderDTO.copy(textAtom, largeBorderlessButton, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final ButtonV3Atom.LargeBorderlessButton getButton() {
        return this.button;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final FreshHeaderDTO copy(@NotNull TextAtom title, ButtonV3Atom.LargeBorderlessButton button, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new FreshHeaderDTO(title, button, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FreshHeaderDTO)) {
            return false;
        }
        FreshHeaderDTO freshHeaderDTO = (FreshHeaderDTO) other;
        return Intrinsics.d(this.title, freshHeaderDTO.title) && Intrinsics.d(this.button, freshHeaderDTO.button) && Intrinsics.d(this.trackingInfo, freshHeaderDTO.trackingInfo);
    }

    public final ButtonV3Atom.LargeBorderlessButton getButton() {
        return this.button;
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
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.button;
        int hashCode2 = (hashCode + (largeBorderlessButton == null ? 0 : largeBorderlessButton.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.button;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("FreshHeaderDTO(title=");
        sb2.append(textAtom);
        sb2.append(", button=");
        sb2.append(largeBorderlessButton);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }

    public /* synthetic */ FreshHeaderDTO(TextAtom textAtom, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAtom, largeBorderlessButton, (i11 & 4) != 0 ? null : map);
    }
}
