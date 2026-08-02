package ru.ozon.app.android.travel.molecules.view.emptyState.v1;

import Ak.C2436a;
import B90.C2619v;
import Kk.C3532b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b\u000b\u0010#R%\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;", "", "", "imageURL", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "message", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "buttons", "", "isButtonsVisible", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;ZLjava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImageURL", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getMessage", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "Z", "()Z", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class EmptyStateVO {
    public static final int $stable = 8;
    private final List<AtomDTO> buttons;

    @NotNull
    private final String imageURL;
    private final boolean isButtonsVisible;
    private final TextAtom message;

    @NotNull
    private final TextAtom title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public EmptyStateVO(@NotNull String imageURL, @NotNull TextAtom title, TextAtom textAtom, List<? extends AtomDTO> list, boolean z11, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(imageURL, "imageURL");
        Intrinsics.checkNotNullParameter(title, "title");
        this.imageURL = imageURL;
        this.title = title;
        this.message = textAtom;
        this.buttons = list;
        this.isButtonsVisible = z11;
        this.trackingInfo = map;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmptyStateVO)) {
            return false;
        }
        EmptyStateVO emptyStateVO = (EmptyStateVO) other;
        return Intrinsics.d(this.imageURL, emptyStateVO.imageURL) && Intrinsics.d(this.title, emptyStateVO.title) && Intrinsics.d(this.message, emptyStateVO.message) && Intrinsics.d(this.buttons, emptyStateVO.buttons) && this.isButtonsVisible == emptyStateVO.isButtonsVisible && Intrinsics.d(this.trackingInfo, emptyStateVO.trackingInfo);
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
        int a11 = C3532b.a((hashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.isButtonsVisible);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return a11 + (map != null ? map.hashCode() : 0);
    }

    /* renamed from: isButtonsVisible, reason: from getter */
    public final boolean getIsButtonsVisible() {
        return this.isButtonsVisible;
    }

    @NotNull
    public String toString() {
        String str = this.imageURL;
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.message;
        List<AtomDTO> list = this.buttons;
        boolean z11 = this.isButtonsVisible;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C2436a.d("EmptyStateVO(imageURL=", str, ", title=", ", message=", textAtom);
        d11.append(textAtom2);
        d11.append(", buttons=");
        d11.append(list);
        d11.append(", isButtonsVisible=");
        d11.append(z11);
        d11.append(", trackingInfo=");
        d11.append(map);
        d11.append(")");
        return d11.toString();
    }
}
