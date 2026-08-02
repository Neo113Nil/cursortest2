package ru.ozon.android.messenger.blocks.emptystate.v2;

import B90.C2616s;
import Kk.C3532b;
import T7.P;
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

@com.squareup.moshi.j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001f\u0010 Jp\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b/\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b\b\u0010\u001aR\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b2\u0010\u001cR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b4\u0010\u001eR%\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u00105\u001a\u0004\b6\u0010 ¨\u00067"}, d2 = {"Lru/ozon/android/messenger/blocks/emptystate/v2/EmptyStateV2DTO;", "", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "description", "", "isFullScreen", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttons", "Lru/ozon/android/messenger/blocks/emptystate/v2/a;", "buttonLayout", "", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "trackingInfo", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;ZLjava/util/List;Lru/ozon/android/messenger/blocks/emptystate/v2/a;Ljava/util/Map;)V", "component1", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "component2", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component3", "component4", "()Z", "component5", "()Ljava/util/List;", "component6", "()Lru/ozon/android/messenger/blocks/emptystate/v2/a;", "component7", "()Ljava/util/Map;", "copy", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;ZLjava/util/List;Lru/ozon/android/messenger/blocks/emptystate/v2/a;Ljava/util/Map;)Lru/ozon/android/messenger/blocks/emptystate/v2/EmptyStateV2DTO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "getDescription", "Z", "Ljava/util/List;", "getButtons", "Lru/ozon/android/messenger/blocks/emptystate/v2/a;", "getButtonLayout", "Ljava/util/Map;", "getTrackingInfo", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class EmptyStateV2DTO {
    public static final int $stable = 8;
    private final a buttonLayout;
    private final List<ButtonV3DTO> buttons;
    private final TextDTO description;

    @NotNull
    private final ImageDTO image;
    private final boolean isFullScreen;

    @NotNull
    private final TextDTO title;
    private final Map<String, MessengerTrackingInfo> trackingInfo;

    public EmptyStateV2DTO(@NotNull ImageDTO image, @NotNull TextDTO title, TextDTO textDTO, boolean z11, List<ButtonV3DTO> list, a aVar, Map<String, MessengerTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        this.image = image;
        this.title = title;
        this.description = textDTO;
        this.isFullScreen = z11;
        this.buttons = list;
        this.buttonLayout = aVar;
        this.trackingInfo = map;
    }

    public static /* synthetic */ EmptyStateV2DTO copy$default(EmptyStateV2DTO emptyStateV2DTO, ImageDTO imageDTO, TextDTO textDTO, TextDTO textDTO2, boolean z11, List list, a aVar, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            imageDTO = emptyStateV2DTO.image;
        }
        if ((i11 & 2) != 0) {
            textDTO = emptyStateV2DTO.title;
        }
        if ((i11 & 4) != 0) {
            textDTO2 = emptyStateV2DTO.description;
        }
        if ((i11 & 8) != 0) {
            z11 = emptyStateV2DTO.isFullScreen;
        }
        if ((i11 & 16) != 0) {
            list = emptyStateV2DTO.buttons;
        }
        if ((i11 & 32) != 0) {
            aVar = emptyStateV2DTO.buttonLayout;
        }
        if ((i11 & 64) != 0) {
            map = emptyStateV2DTO.trackingInfo;
        }
        a aVar2 = aVar;
        Map map2 = map;
        List list2 = list;
        TextDTO textDTO3 = textDTO2;
        return emptyStateV2DTO.copy(imageDTO, textDTO, textDTO3, z11, list2, aVar2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ImageDTO getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final TextDTO getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsFullScreen() {
        return this.isFullScreen;
    }

    public final List<ButtonV3DTO> component5() {
        return this.buttons;
    }

    /* renamed from: component6, reason: from getter */
    public final a getButtonLayout() {
        return this.buttonLayout;
    }

    public final Map<String, MessengerTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    public final EmptyStateV2DTO copy(@NotNull ImageDTO image, @NotNull TextDTO title, TextDTO description, boolean isFullScreen, List<ButtonV3DTO> buttons, a buttonLayout, Map<String, MessengerTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        return new EmptyStateV2DTO(image, title, description, isFullScreen, buttons, buttonLayout, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmptyStateV2DTO)) {
            return false;
        }
        EmptyStateV2DTO emptyStateV2DTO = (EmptyStateV2DTO) other;
        return Intrinsics.d(this.image, emptyStateV2DTO.image) && Intrinsics.d(this.title, emptyStateV2DTO.title) && Intrinsics.d(this.description, emptyStateV2DTO.description) && this.isFullScreen == emptyStateV2DTO.isFullScreen && Intrinsics.d(this.buttons, emptyStateV2DTO.buttons) && this.buttonLayout == emptyStateV2DTO.buttonLayout && Intrinsics.d(this.trackingInfo, emptyStateV2DTO.trackingInfo);
    }

    public final a getButtonLayout() {
        return this.buttonLayout;
    }

    public final List<ButtonV3DTO> getButtons() {
        return this.buttons;
    }

    public final TextDTO getDescription() {
        return this.description;
    }

    @NotNull
    public final ImageDTO getImage() {
        return this.image;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, MessengerTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = Ns.b.a(this.title, this.image.hashCode() * 31, 31);
        TextDTO textDTO = this.description;
        int a12 = C3532b.a((a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.isFullScreen);
        List<ButtonV3DTO> list = this.buttons;
        int hashCode = (a12 + (list == null ? 0 : list.hashCode())) * 31;
        a aVar = this.buttonLayout;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final boolean isFullScreen() {
        return this.isFullScreen;
    }

    @NotNull
    public String toString() {
        ImageDTO imageDTO = this.image;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.description;
        boolean z11 = this.isFullScreen;
        List<ButtonV3DTO> list = this.buttons;
        a aVar = this.buttonLayout;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C2616s.d("EmptyStateV2DTO(image=", imageDTO, ", title=", textDTO, ", description=");
        d11.append(textDTO2);
        d11.append(", isFullScreen=");
        d11.append(z11);
        d11.append(", buttons=");
        d11.append(list);
        d11.append(", buttonLayout=");
        d11.append(aVar);
        d11.append(", trackingInfo=");
        return P.f(d11, map, ")");
    }
}
