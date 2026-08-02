package ru.ozon.app.android.travel.molecules.dto.emptyState.v1;

import Ak.C2436a;
import B90.C2619v;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JS\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/emptyState/v1/EmptyStateDTO;", "", "imageURL", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "message", "buttons", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Ljava/util/Map;)V", "getImageURL", "()Ljava/lang/String;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getMessage", "getButtons", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class EmptyStateDTO {
    private final List<AtomDTO> buttons;

    @NotNull
    private final String imageURL;
    private final TextAtom message;

    @NotNull
    private final TextAtom title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public EmptyStateDTO(@NotNull String imageURL, @NotNull TextAtom title, TextAtom textAtom, List<? extends AtomDTO> list, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(imageURL, "imageURL");
        Intrinsics.checkNotNullParameter(title, "title");
        this.imageURL = imageURL;
        this.title = title;
        this.message = textAtom;
        this.buttons = list;
        this.trackingInfo = map;
    }

    public static /* synthetic */ EmptyStateDTO copy$default(EmptyStateDTO emptyStateDTO, String str, TextAtom textAtom, TextAtom textAtom2, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = emptyStateDTO.imageURL;
        }
        if ((i11 & 2) != 0) {
            textAtom = emptyStateDTO.title;
        }
        if ((i11 & 4) != 0) {
            textAtom2 = emptyStateDTO.message;
        }
        if ((i11 & 8) != 0) {
            list = emptyStateDTO.buttons;
        }
        if ((i11 & 16) != 0) {
            map = emptyStateDTO.trackingInfo;
        }
        Map map2 = map;
        TextAtom textAtom3 = textAtom2;
        return emptyStateDTO.copy(str, textAtom, textAtom3, list, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getImageURL() {
        return this.imageURL;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final TextAtom getMessage() {
        return this.message;
    }

    public final List<AtomDTO> component4() {
        return this.buttons;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final EmptyStateDTO copy(@NotNull String imageURL, @NotNull TextAtom title, TextAtom message, List<? extends AtomDTO> buttons, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(imageURL, "imageURL");
        Intrinsics.checkNotNullParameter(title, "title");
        return new EmptyStateDTO(imageURL, title, message, buttons, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmptyStateDTO)) {
            return false;
        }
        EmptyStateDTO emptyStateDTO = (EmptyStateDTO) other;
        return Intrinsics.d(this.imageURL, emptyStateDTO.imageURL) && Intrinsics.d(this.title, emptyStateDTO.title) && Intrinsics.d(this.message, emptyStateDTO.message) && Intrinsics.d(this.buttons, emptyStateDTO.buttons) && Intrinsics.d(this.trackingInfo, emptyStateDTO.trackingInfo);
    }

    public final List<AtomDTO> getButtons() {
        return this.buttons;
    }

    @NotNull
    public final String getImageURL() {
        return this.imageURL;
    }

    public final TextAtom getMessage() {
        return this.message;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = C2619v.b(this.imageURL.hashCode() * 31, 31, this.title);
        TextAtom textAtom = this.message;
        int hashCode = (b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        List<AtomDTO> list = this.buttons;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.imageURL;
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.message;
        List<AtomDTO> list = this.buttons;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C2436a.d("EmptyStateDTO(imageURL=", str, ", title=", ", message=", textAtom);
        d11.append(textAtom2);
        d11.append(", buttons=");
        d11.append(list);
        d11.append(", trackingInfo=");
        return P.f(d11, map, ")");
    }
}
