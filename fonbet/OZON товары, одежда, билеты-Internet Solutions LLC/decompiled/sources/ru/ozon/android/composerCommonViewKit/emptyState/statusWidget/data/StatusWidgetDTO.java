package ru.ozon.android.composerCommonViewKit.emptyState.statusWidget.data;

import D40.d;
import Xc.a;
import Xc.b;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0003-./BO\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003J_\u0010&\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\rHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00060"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/statusWidget/data/StatusWidgetDTO;", "", "newButtons", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "imageAtom", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "titleAtom", "Lru/ozon/uni/atoms/data/text/TextDTO;", "messageAtom", "size", "Lru/ozon/android/composerCommonViewKit/emptyState/statusWidget/data/StatusWidgetDTO$StatusWidgetSize;", "backgroundColor", "", "buttonLayout", "Lru/ozon/android/composerCommonViewKit/emptyState/statusWidget/data/StatusWidgetDTO$ButtonLayout;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/android/composerCommonViewKit/emptyState/statusWidget/data/StatusWidgetDTO$StatusWidgetSize;Ljava/lang/String;Lru/ozon/android/composerCommonViewKit/emptyState/statusWidget/data/StatusWidgetDTO$ButtonLayout;)V", "getNewButtons", "()Ljava/util/List;", "getImageAtom", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getTitleAtom", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getMessageAtom", "getSize", "()Lru/ozon/android/composerCommonViewKit/emptyState/statusWidget/data/StatusWidgetDTO$StatusWidgetSize;", "getBackgroundColor", "()Ljava/lang/String;", "getButtonLayout", "()Lru/ozon/android/composerCommonViewKit/emptyState/statusWidget/data/StatusWidgetDTO$ButtonLayout;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "ButtonLayout", "StatusWidgetSize", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class StatusWidgetDTO {

    @NotNull
    public static final String DEFAULT_BACKGROUND_COLOR = "layerFloor1";
    public static final int ZERO_MARGIN = 0;
    private final String backgroundColor;
    private final ButtonLayout buttonLayout;

    @NotNull
    private final ImageDTO imageAtom;
    private final TextDTO messageAtom;
    private final List<ButtonV3DTO> newButtons;
    private final StatusWidgetSize size;

    @NotNull
    private final TextDTO titleAtom;
    public static final int $stable = 8;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/statusWidget/data/StatusWidgetDTO$ButtonLayout;", "", "<init>", "(Ljava/lang/String;I)V", "BUTTON_LAYOUT_HORIZONTAL", "BUTTON_LAYOUT_VERTICAL", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = false)
    public static final class ButtonLayout {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ButtonLayout[] $VALUES;

        @i(name = "BUTTON_LAYOUT_HORIZONTAL")
        public static final ButtonLayout BUTTON_LAYOUT_HORIZONTAL = new ButtonLayout("BUTTON_LAYOUT_HORIZONTAL", 0);

        @i(name = "BUTTON_LAYOUT_VERTICAL")
        public static final ButtonLayout BUTTON_LAYOUT_VERTICAL = new ButtonLayout("BUTTON_LAYOUT_VERTICAL", 1);

        private static final /* synthetic */ ButtonLayout[] $values() {
            return new ButtonLayout[]{BUTTON_LAYOUT_HORIZONTAL, BUTTON_LAYOUT_VERTICAL};
        }

        static {
            ButtonLayout[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ButtonLayout(String str, int i11) {
        }

        @NotNull
        public static a<ButtonLayout> getEntries() {
            return $ENTRIES;
        }

        public static ButtonLayout valueOf(String str) {
            return (ButtonLayout) Enum.valueOf(ButtonLayout.class, str);
        }

        public static ButtonLayout[] values() {
            return (ButtonLayout[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/statusWidget/data/StatusWidgetDTO$StatusWidgetSize;", "", "<init>", "(Ljava/lang/String;I)V", "WRAP", "FULLSCREEN", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = false)
    public static final class StatusWidgetSize {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ StatusWidgetSize[] $VALUES;

        @i(name = "SIZE_WRAP")
        public static final StatusWidgetSize WRAP = new StatusWidgetSize("WRAP", 0);

        @i(name = "SIZE_FULLSCREEN")
        public static final StatusWidgetSize FULLSCREEN = new StatusWidgetSize("FULLSCREEN", 1);

        private static final /* synthetic */ StatusWidgetSize[] $values() {
            return new StatusWidgetSize[]{WRAP, FULLSCREEN};
        }

        static {
            StatusWidgetSize[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private StatusWidgetSize(String str, int i11) {
        }

        @NotNull
        public static a<StatusWidgetSize> getEntries() {
            return $ENTRIES;
        }

        public static StatusWidgetSize valueOf(String str) {
            return (StatusWidgetSize) Enum.valueOf(StatusWidgetSize.class, str);
        }

        public static StatusWidgetSize[] values() {
            return (StatusWidgetSize[]) $VALUES.clone();
        }
    }

    public StatusWidgetDTO(List<ButtonV3DTO> list, @NotNull ImageDTO imageAtom, @NotNull TextDTO titleAtom, TextDTO textDTO, StatusWidgetSize statusWidgetSize, String str, ButtonLayout buttonLayout) {
        Intrinsics.checkNotNullParameter(imageAtom, "imageAtom");
        Intrinsics.checkNotNullParameter(titleAtom, "titleAtom");
        this.newButtons = list;
        this.imageAtom = imageAtom;
        this.titleAtom = titleAtom;
        this.messageAtom = textDTO;
        this.size = statusWidgetSize;
        this.backgroundColor = str;
        this.buttonLayout = buttonLayout;
    }

    public static /* synthetic */ StatusWidgetDTO copy$default(StatusWidgetDTO statusWidgetDTO, List list, ImageDTO imageDTO, TextDTO textDTO, TextDTO textDTO2, StatusWidgetSize statusWidgetSize, String str, ButtonLayout buttonLayout, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = statusWidgetDTO.newButtons;
        }
        if ((i11 & 2) != 0) {
            imageDTO = statusWidgetDTO.imageAtom;
        }
        if ((i11 & 4) != 0) {
            textDTO = statusWidgetDTO.titleAtom;
        }
        if ((i11 & 8) != 0) {
            textDTO2 = statusWidgetDTO.messageAtom;
        }
        if ((i11 & 16) != 0) {
            statusWidgetSize = statusWidgetDTO.size;
        }
        if ((i11 & 32) != 0) {
            str = statusWidgetDTO.backgroundColor;
        }
        if ((i11 & 64) != 0) {
            buttonLayout = statusWidgetDTO.buttonLayout;
        }
        String str2 = str;
        ButtonLayout buttonLayout2 = buttonLayout;
        StatusWidgetSize statusWidgetSize2 = statusWidgetSize;
        TextDTO textDTO3 = textDTO;
        return statusWidgetDTO.copy(list, imageDTO, textDTO3, textDTO2, statusWidgetSize2, str2, buttonLayout2);
    }

    public final List<ButtonV3DTO> component1() {
        return this.newButtons;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ImageDTO getImageAtom() {
        return this.imageAtom;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextDTO getTitleAtom() {
        return this.titleAtom;
    }

    /* renamed from: component4, reason: from getter */
    public final TextDTO getMessageAtom() {
        return this.messageAtom;
    }

    /* renamed from: component5, reason: from getter */
    public final StatusWidgetSize getSize() {
        return this.size;
    }

    /* renamed from: component6, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component7, reason: from getter */
    public final ButtonLayout getButtonLayout() {
        return this.buttonLayout;
    }

    @NotNull
    public final StatusWidgetDTO copy(List<ButtonV3DTO> newButtons, @NotNull ImageDTO imageAtom, @NotNull TextDTO titleAtom, TextDTO messageAtom, StatusWidgetSize size, String backgroundColor, ButtonLayout buttonLayout) {
        Intrinsics.checkNotNullParameter(imageAtom, "imageAtom");
        Intrinsics.checkNotNullParameter(titleAtom, "titleAtom");
        return new StatusWidgetDTO(newButtons, imageAtom, titleAtom, messageAtom, size, backgroundColor, buttonLayout);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatusWidgetDTO)) {
            return false;
        }
        StatusWidgetDTO statusWidgetDTO = (StatusWidgetDTO) other;
        return Intrinsics.d(this.newButtons, statusWidgetDTO.newButtons) && Intrinsics.d(this.imageAtom, statusWidgetDTO.imageAtom) && Intrinsics.d(this.titleAtom, statusWidgetDTO.titleAtom) && Intrinsics.d(this.messageAtom, statusWidgetDTO.messageAtom) && this.size == statusWidgetDTO.size && Intrinsics.d(this.backgroundColor, statusWidgetDTO.backgroundColor) && this.buttonLayout == statusWidgetDTO.buttonLayout;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final ButtonLayout getButtonLayout() {
        return this.buttonLayout;
    }

    @NotNull
    public final ImageDTO getImageAtom() {
        return this.imageAtom;
    }

    public final TextDTO getMessageAtom() {
        return this.messageAtom;
    }

    public final List<ButtonV3DTO> getNewButtons() {
        return this.newButtons;
    }

    public final StatusWidgetSize getSize() {
        return this.size;
    }

    @NotNull
    public final TextDTO getTitleAtom() {
        return this.titleAtom;
    }

    public int hashCode() {
        List<ButtonV3DTO> list = this.newButtons;
        int a11 = Ns.b.a(this.titleAtom, Nh.a.b(this.imageAtom, (list == null ? 0 : list.hashCode()) * 31, 31), 31);
        TextDTO textDTO = this.messageAtom;
        int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        StatusWidgetSize statusWidgetSize = this.size;
        int hashCode2 = (hashCode + (statusWidgetSize == null ? 0 : statusWidgetSize.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        ButtonLayout buttonLayout = this.buttonLayout;
        return hashCode3 + (buttonLayout != null ? buttonLayout.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<ButtonV3DTO> list = this.newButtons;
        ImageDTO imageDTO = this.imageAtom;
        TextDTO textDTO = this.titleAtom;
        TextDTO textDTO2 = this.messageAtom;
        StatusWidgetSize statusWidgetSize = this.size;
        String str = this.backgroundColor;
        ButtonLayout buttonLayout = this.buttonLayout;
        StringBuilder sb2 = new StringBuilder("StatusWidgetDTO(newButtons=");
        sb2.append(list);
        sb2.append(", imageAtom=");
        sb2.append(imageDTO);
        sb2.append(", titleAtom=");
        d.e(", messageAtom=", ", size=", sb2, textDTO, textDTO2);
        sb2.append(statusWidgetSize);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", buttonLayout=");
        sb2.append(buttonLayout);
        sb2.append(")");
        return sb2.toString();
    }
}
