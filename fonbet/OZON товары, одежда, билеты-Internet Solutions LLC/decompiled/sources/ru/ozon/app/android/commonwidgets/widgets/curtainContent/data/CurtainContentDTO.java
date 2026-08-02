package ru.ozon.app.android.commonwidgets.widgets.curtainContent.data;

import Hj.C3143a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003JQ\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u000bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtainContent/data/CurtainContentDTO;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "titles", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "buttons", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getTitles", "()Ljava/util/List;", "getButtons", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CurtainContentDTO {
    private final List<ButtonV3DTO> buttons;
    private final ImageDTO image;
    private final List<TextDTO> titles;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public CurtainContentDTO(ImageDTO imageDTO, List<TextDTO> list, List<ButtonV3DTO> list2, Map<String, TokenizedTrackingInfo> map) {
        this.image = imageDTO;
        this.titles = list;
        this.buttons = list2;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CurtainContentDTO copy$default(CurtainContentDTO curtainContentDTO, ImageDTO imageDTO, List list, List list2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            imageDTO = curtainContentDTO.image;
        }
        if ((i11 & 2) != 0) {
            list = curtainContentDTO.titles;
        }
        if ((i11 & 4) != 0) {
            list2 = curtainContentDTO.buttons;
        }
        if ((i11 & 8) != 0) {
            map = curtainContentDTO.trackingInfo;
        }
        return curtainContentDTO.copy(imageDTO, list, list2, map);
    }

    /* renamed from: component1, reason: from getter */
    public final ImageDTO getImage() {
        return this.image;
    }

    public final List<TextDTO> component2() {
        return this.titles;
    }

    public final List<ButtonV3DTO> component3() {
        return this.buttons;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final CurtainContentDTO copy(ImageDTO image, List<TextDTO> titles, List<ButtonV3DTO> buttons, Map<String, TokenizedTrackingInfo> trackingInfo) {
        return new CurtainContentDTO(image, titles, buttons, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurtainContentDTO)) {
            return false;
        }
        CurtainContentDTO curtainContentDTO = (CurtainContentDTO) other;
        return Intrinsics.d(this.image, curtainContentDTO.image) && Intrinsics.d(this.titles, curtainContentDTO.titles) && Intrinsics.d(this.buttons, curtainContentDTO.buttons) && Intrinsics.d(this.trackingInfo, curtainContentDTO.trackingInfo);
    }

    public final List<ButtonV3DTO> getButtons() {
        return this.buttons;
    }

    public final ImageDTO getImage() {
        return this.image;
    }

    public final List<TextDTO> getTitles() {
        return this.titles;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        ImageDTO imageDTO = this.image;
        int hashCode = (imageDTO == null ? 0 : imageDTO.hashCode()) * 31;
        List<TextDTO> list = this.titles;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<ButtonV3DTO> list2 = this.buttons;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ImageDTO imageDTO = this.image;
        List<TextDTO> list = this.titles;
        List<ButtonV3DTO> list2 = this.buttons;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("CurtainContentDTO(image=");
        sb2.append(imageDTO);
        sb2.append(", titles=");
        sb2.append(list);
        sb2.append(", buttons=");
        return C3143a.h(sb2, list2, ", trackingInfo=", map, ")");
    }

    public /* synthetic */ CurtainContentDTO(ImageDTO imageDTO, List list, List list2, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageDTO, (i11 & 2) != 0 ? null : list, (i11 & 4) != 0 ? null : list2, (i11 & 8) != 0 ? null : map);
    }
}
