package ru.ozon.app.android.travel.molecules.dto.emptyState.v2;

import Co.a;
import G.g;
import Ns.b;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Jb\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u000bHÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/emptyState/v2/EmptyStateV2DTO;", "", "imageURL", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "message", "buttons", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "imageSize", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/lang/Integer;Ljava/util/Map;)V", "getImageURL", "()Ljava/lang/String;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getMessage", "getButtons", "()Ljava/util/List;", "getImageSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/lang/Integer;Ljava/util/Map;)Lru/ozon/app/android/travel/molecules/dto/emptyState/v2/EmptyStateV2DTO;", "equals", "", "other", "hashCode", "toString", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class EmptyStateV2DTO {

    @NotNull
    private final List<ButtonV3DTO> buttons;
    private final Integer imageSize;

    @NotNull
    private final String imageURL;
    private final TextDTO message;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public EmptyStateV2DTO(@NotNull String imageURL, @NotNull TextDTO title, TextDTO textDTO, @NotNull List<ButtonV3DTO> buttons, Integer num, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(imageURL, "imageURL");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.imageURL = imageURL;
        this.title = title;
        this.message = textDTO;
        this.buttons = buttons;
        this.imageSize = num;
        this.trackingInfo = map;
    }

    public static /* synthetic */ EmptyStateV2DTO copy$default(EmptyStateV2DTO emptyStateV2DTO, String str, TextDTO textDTO, TextDTO textDTO2, List list, Integer num, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = emptyStateV2DTO.imageURL;
        }
        if ((i11 & 2) != 0) {
            textDTO = emptyStateV2DTO.title;
        }
        if ((i11 & 4) != 0) {
            textDTO2 = emptyStateV2DTO.message;
        }
        if ((i11 & 8) != 0) {
            list = emptyStateV2DTO.buttons;
        }
        if ((i11 & 16) != 0) {
            num = emptyStateV2DTO.imageSize;
        }
        if ((i11 & 32) != 0) {
            map = emptyStateV2DTO.trackingInfo;
        }
        Integer num2 = num;
        Map map2 = map;
        return emptyStateV2DTO.copy(str, textDTO, textDTO2, list, num2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getImageURL() {
        return this.imageURL;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final TextDTO getMessage() {
        return this.message;
    }

    @NotNull
    public final List<ButtonV3DTO> component4() {
        return this.buttons;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getImageSize() {
        return this.imageSize;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final EmptyStateV2DTO copy(@NotNull String imageURL, @NotNull TextDTO title, TextDTO message, @NotNull List<ButtonV3DTO> buttons, Integer imageSize, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(imageURL, "imageURL");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        return new EmptyStateV2DTO(imageURL, title, message, buttons, imageSize, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmptyStateV2DTO)) {
            return false;
        }
        EmptyStateV2DTO emptyStateV2DTO = (EmptyStateV2DTO) other;
        return Intrinsics.d(this.imageURL, emptyStateV2DTO.imageURL) && Intrinsics.d(this.title, emptyStateV2DTO.title) && Intrinsics.d(this.message, emptyStateV2DTO.message) && Intrinsics.d(this.buttons, emptyStateV2DTO.buttons) && Intrinsics.d(this.imageSize, emptyStateV2DTO.imageSize) && Intrinsics.d(this.trackingInfo, emptyStateV2DTO.trackingInfo);
    }

    @NotNull
    public final List<ButtonV3DTO> getButtons() {
        return this.buttons;
    }

    public final Integer getImageSize() {
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
        int a11 = b.a(this.title, this.imageURL.hashCode() * 31, 31);
        TextDTO textDTO = this.message;
        int b11 = g.b((a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.buttons);
        Integer num = this.imageSize;
        int hashCode = (b11 + (num == null ? 0 : num.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.imageURL;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.message;
        List<ButtonV3DTO> list = this.buttons;
        Integer num = this.imageSize;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder b11 = a.b("EmptyStateV2DTO(imageURL=", textDTO, str, ", title=", ", message=");
        Tl.a.e(b11, textDTO2, ", buttons=", list, ", imageSize=");
        b11.append(num);
        b11.append(", trackingInfo=");
        b11.append(map);
        b11.append(")");
        return b11.toString();
    }

    public EmptyStateV2DTO(String str, TextDTO textDTO, TextDTO textDTO2, List list, Integer num, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textDTO, textDTO2, (i11 & 8) != 0 ? K.f71697a : list, num, map);
    }
}
