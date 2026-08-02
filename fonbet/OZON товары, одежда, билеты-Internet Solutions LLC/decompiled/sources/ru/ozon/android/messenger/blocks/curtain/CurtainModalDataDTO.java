package ru.ozon.android.messenger.blocks.curtain;

import Ul.C4070a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Ja\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, d2 = {"Lru/ozon/android/messenger/blocks/curtain/CurtainModalDataDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "message", "buttons", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "backgroundColor", "", "trackingInfo", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getMessage", "getButtons", "()Ljava/util/List;", "getBackgroundColor", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CurtainModalDataDTO {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final List<ButtonV3DTO> buttons;
    private final ImageDTO image;
    private final TextDTO message;

    @NotNull
    private final TextDTO title;
    private final Map<String, MessengerTrackingInfo> trackingInfo;

    public CurtainModalDataDTO(@NotNull TextDTO title, ImageDTO imageDTO, TextDTO textDTO, List<ButtonV3DTO> list, String str, Map<String, MessengerTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.image = imageDTO;
        this.message = textDTO;
        this.buttons = list;
        this.backgroundColor = str;
        this.trackingInfo = map;
    }

    public static /* synthetic */ CurtainModalDataDTO copy$default(CurtainModalDataDTO curtainModalDataDTO, TextDTO textDTO, ImageDTO imageDTO, TextDTO textDTO2, List list, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = curtainModalDataDTO.title;
        }
        if ((i11 & 2) != 0) {
            imageDTO = curtainModalDataDTO.image;
        }
        if ((i11 & 4) != 0) {
            textDTO2 = curtainModalDataDTO.message;
        }
        if ((i11 & 8) != 0) {
            list = curtainModalDataDTO.buttons;
        }
        if ((i11 & 16) != 0) {
            str = curtainModalDataDTO.backgroundColor;
        }
        if ((i11 & 32) != 0) {
            map = curtainModalDataDTO.trackingInfo;
        }
        String str2 = str;
        Map map2 = map;
        return curtainModalDataDTO.copy(textDTO, imageDTO, textDTO2, list, str2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final ImageDTO getImage() {
        return this.image;
    }

    /* renamed from: component3, reason: from getter */
    public final TextDTO getMessage() {
        return this.message;
    }

    public final List<ButtonV3DTO> component4() {
        return this.buttons;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Map<String, MessengerTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final CurtainModalDataDTO copy(@NotNull TextDTO title, ImageDTO image, TextDTO message, List<ButtonV3DTO> buttons, String backgroundColor, Map<String, MessengerTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new CurtainModalDataDTO(title, image, message, buttons, backgroundColor, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurtainModalDataDTO)) {
            return false;
        }
        CurtainModalDataDTO curtainModalDataDTO = (CurtainModalDataDTO) other;
        return Intrinsics.d(this.title, curtainModalDataDTO.title) && Intrinsics.d(this.image, curtainModalDataDTO.image) && Intrinsics.d(this.message, curtainModalDataDTO.message) && Intrinsics.d(this.buttons, curtainModalDataDTO.buttons) && Intrinsics.d(this.backgroundColor, curtainModalDataDTO.backgroundColor) && Intrinsics.d(this.trackingInfo, curtainModalDataDTO.trackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final List<ButtonV3DTO> getButtons() {
        return this.buttons;
    }

    public final ImageDTO getImage() {
        return this.image;
    }

    public final TextDTO getMessage() {
        return this.message;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, MessengerTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        ImageDTO imageDTO = this.image;
        int hashCode2 = (hashCode + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31;
        TextDTO textDTO = this.message;
        int hashCode3 = (hashCode2 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        List<ButtonV3DTO> list = this.buttons;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        return hashCode5 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        ImageDTO imageDTO = this.image;
        TextDTO textDTO2 = this.message;
        List<ButtonV3DTO> list = this.buttons;
        String str = this.backgroundColor;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("CurtainModalDataDTO(title=");
        sb2.append(textDTO);
        sb2.append(", image=");
        sb2.append(imageDTO);
        sb2.append(", message=");
        Tl.a.e(sb2, textDTO2, ", buttons=", list, ", backgroundColor=");
        return C4070a.a(sb2, str, ", trackingInfo=", map, ")");
    }
}
