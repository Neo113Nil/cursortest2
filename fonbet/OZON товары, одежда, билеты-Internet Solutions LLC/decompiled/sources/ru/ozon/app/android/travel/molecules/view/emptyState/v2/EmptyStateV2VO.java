package ru.ozon.app.android.travel.molecules.view.emptyState.v2;

import B0.C2454a;
import D40.d;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import Ns.b;
import T7.P;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b!\u0010 R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b\r\u0010&R%\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/emptyState/v2/EmptyStateV2VO;", "", "", "imageURL", "", "imageSize", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "message", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttons", "", "isButtonsVisible", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(Ljava/lang/String;ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;ZLjava/util/Map;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImageURL", "I", "getImageSize", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getMessage", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "Z", "()Z", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class EmptyStateV2VO {
    public static final int $stable = 8;

    @NotNull
    private final List<ButtonV3DTO> buttons;
    private final int imageSize;

    @NotNull
    private final String imageURL;
    private final boolean isButtonsVisible;
    private final TextDTO message;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public EmptyStateV2VO(@NotNull String imageURL, int i11, @NotNull TextDTO title, TextDTO textDTO, @NotNull List<ButtonV3DTO> buttons, boolean z11, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(imageURL, "imageURL");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.imageURL = imageURL;
        this.imageSize = i11;
        this.title = title;
        this.message = textDTO;
        this.buttons = buttons;
        this.isButtonsVisible = z11;
        this.trackingInfo = map;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmptyStateV2VO)) {
            return false;
        }
        EmptyStateV2VO emptyStateV2VO = (EmptyStateV2VO) other;
        return Intrinsics.d(this.imageURL, emptyStateV2VO.imageURL) && this.imageSize == emptyStateV2VO.imageSize && Intrinsics.d(this.title, emptyStateV2VO.title) && Intrinsics.d(this.message, emptyStateV2VO.message) && Intrinsics.d(this.buttons, emptyStateV2VO.buttons) && this.isButtonsVisible == emptyStateV2VO.isButtonsVisible && Intrinsics.d(this.trackingInfo, emptyStateV2VO.trackingInfo);
    }

    @NotNull
    public final List<ButtonV3DTO> getButtons() {
        return this.buttons;
    }

    public final int getImageSize() {
        return this.imageSize;
    }

    @NotNull
    public final String getImageURL() {
        return this.imageURL;
    }

    public final TextDTO getMessage() {
        return this.message;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = b.a(this.title, C2454a.a(this.imageSize, this.imageURL.hashCode() * 31, 31), 31);
        TextDTO textDTO = this.message;
        int a12 = C3532b.a(g.b((a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.buttons), 31, this.isButtonsVisible);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return a12 + (map != null ? map.hashCode() : 0);
    }

    /* renamed from: isButtonsVisible, reason: from getter */
    public final boolean getIsButtonsVisible() {
        return this.isButtonsVisible;
    }

    @NotNull
    public String toString() {
        String str = this.imageURL;
        int i11 = this.imageSize;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.message;
        List<ButtonV3DTO> list = this.buttons;
        boolean z11 = this.isButtonsVisible;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder c11 = C3660k.c(i11, "EmptyStateV2VO(imageURL=", str, ", imageSize=", ", title=");
        d.e(", message=", ", buttons=", c11, textDTO, textDTO2);
        c11.append(list);
        c11.append(", isButtonsVisible=");
        c11.append(z11);
        c11.append(", trackingInfo=");
        return P.f(c11, map, ")");
    }
}
