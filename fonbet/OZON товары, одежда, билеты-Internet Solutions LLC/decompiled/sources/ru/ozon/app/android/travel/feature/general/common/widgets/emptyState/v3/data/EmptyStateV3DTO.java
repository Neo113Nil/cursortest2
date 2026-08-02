package ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.data;

import B90.C2616s;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003456Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u0017\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0003J\t\u0010*\u001a\u00020\u000fHÆ\u0003J\t\u0010+\u001a\u00020\u0011HÆ\u0003J\t\u0010,\u001a\u00020\u0013HÆ\u0003Jq\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00067"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/data/EmptyStateV3DTO;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "message", "buttons", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "appearance", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/data/EmptyStateV3DTO$ViewAppearance;", "buttonsPosition", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/data/EmptyStateV3DTO$ButtonsPosition;", "contentAlign", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/data/EmptyStateV3DTO$ContentAlign;", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/util/Map;Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/data/EmptyStateV3DTO$ViewAppearance;Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/data/EmptyStateV3DTO$ButtonsPosition;Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/data/EmptyStateV3DTO$ContentAlign;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getMessage", "getButtons", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "getAppearance", "()Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/data/EmptyStateV3DTO$ViewAppearance;", "getButtonsPosition", "()Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/data/EmptyStateV3DTO$ButtonsPosition;", "getContentAlign", "()Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/data/EmptyStateV3DTO$ContentAlign;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "ViewAppearance", "ButtonsPosition", "ContentAlign", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EmptyStateV3DTO {
    public static final int $stable = 8;

    @EnumNullFallback
    @NotNull
    private final ViewAppearance appearance;
    private final List<ButtonV3DTO> buttons;

    @EnumNullFallback
    @NotNull
    private final ButtonsPosition buttonsPosition;

    @EnumNullFallback
    @NotNull
    private final ContentAlign contentAlign;

    @NotNull
    private final ImageDTO image;
    private final TextDTO message;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/data/EmptyStateV3DTO$ButtonsPosition;", "", "<init>", "(Ljava/lang/String;I)V", "UNDER_TEXT", "AT_BOTTOM", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ButtonsPosition {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ButtonsPosition[] $VALUES;

        @i(name = "UNDER_TEXT")
        public static final ButtonsPosition UNDER_TEXT = new ButtonsPosition("UNDER_TEXT", 0);

        @i(name = "AT_BOTTOM")
        public static final ButtonsPosition AT_BOTTOM = new ButtonsPosition("AT_BOTTOM", 1);

        private static final /* synthetic */ ButtonsPosition[] $values() {
            return new ButtonsPosition[]{UNDER_TEXT, AT_BOTTOM};
        }

        static {
            ButtonsPosition[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ButtonsPosition(String str, int i11) {
        }

        public static ButtonsPosition valueOf(String str) {
            return (ButtonsPosition) Enum.valueOf(ButtonsPosition.class, str);
        }

        public static ButtonsPosition[] values() {
            return (ButtonsPosition[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/data/EmptyStateV3DTO$ContentAlign;", "", "<init>", "(Ljava/lang/String;I)V", "BOTTOM", "TOP", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ContentAlign {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ContentAlign[] $VALUES;

        @i(name = "BOTTOM")
        public static final ContentAlign BOTTOM = new ContentAlign("BOTTOM", 0);

        @i(name = "TOP")
        public static final ContentAlign TOP = new ContentAlign("TOP", 1);

        private static final /* synthetic */ ContentAlign[] $values() {
            return new ContentAlign[]{BOTTOM, TOP};
        }

        static {
            ContentAlign[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ContentAlign(String str, int i11) {
        }

        public static ContentAlign valueOf(String str) {
            return (ContentAlign) Enum.valueOf(ContentAlign.class, str);
        }

        public static ContentAlign[] values() {
            return (ContentAlign[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/data/EmptyStateV3DTO$ViewAppearance;", "", "<init>", "(Ljava/lang/String;I)V", "VIEW_APPEARANCE_FULL", "VIEW_APPEARANCE_WRAP", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ViewAppearance {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ViewAppearance[] $VALUES;

        @i(name = "VIEW_APPEARANCE_FULL")
        public static final ViewAppearance VIEW_APPEARANCE_FULL = new ViewAppearance("VIEW_APPEARANCE_FULL", 0);

        @i(name = "VIEW_APPEARANCE_WRAP")
        public static final ViewAppearance VIEW_APPEARANCE_WRAP = new ViewAppearance("VIEW_APPEARANCE_WRAP", 1);

        private static final /* synthetic */ ViewAppearance[] $values() {
            return new ViewAppearance[]{VIEW_APPEARANCE_FULL, VIEW_APPEARANCE_WRAP};
        }

        static {
            ViewAppearance[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ViewAppearance(String str, int i11) {
        }

        public static ViewAppearance valueOf(String str) {
            return (ViewAppearance) Enum.valueOf(ViewAppearance.class, str);
        }

        public static ViewAppearance[] values() {
            return (ViewAppearance[]) $VALUES.clone();
        }
    }

    public EmptyStateV3DTO(@NotNull ImageDTO image, @NotNull TextDTO title, TextDTO textDTO, List<ButtonV3DTO> list, Map<String, TokenizedTrackingInfo> map, @NotNull ViewAppearance appearance, @NotNull ButtonsPosition buttonsPosition, @NotNull ContentAlign contentAlign) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(appearance, "appearance");
        Intrinsics.checkNotNullParameter(buttonsPosition, "buttonsPosition");
        Intrinsics.checkNotNullParameter(contentAlign, "contentAlign");
        this.image = image;
        this.title = title;
        this.message = textDTO;
        this.buttons = list;
        this.trackingInfo = map;
        this.appearance = appearance;
        this.buttonsPosition = buttonsPosition;
        this.contentAlign = contentAlign;
    }

    public static /* synthetic */ EmptyStateV3DTO copy$default(EmptyStateV3DTO emptyStateV3DTO, ImageDTO imageDTO, TextDTO textDTO, TextDTO textDTO2, List list, Map map, ViewAppearance viewAppearance, ButtonsPosition buttonsPosition, ContentAlign contentAlign, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            imageDTO = emptyStateV3DTO.image;
        }
        if ((i11 & 2) != 0) {
            textDTO = emptyStateV3DTO.title;
        }
        if ((i11 & 4) != 0) {
            textDTO2 = emptyStateV3DTO.message;
        }
        if ((i11 & 8) != 0) {
            list = emptyStateV3DTO.buttons;
        }
        if ((i11 & 16) != 0) {
            map = emptyStateV3DTO.trackingInfo;
        }
        if ((i11 & 32) != 0) {
            viewAppearance = emptyStateV3DTO.appearance;
        }
        if ((i11 & 64) != 0) {
            buttonsPosition = emptyStateV3DTO.buttonsPosition;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            contentAlign = emptyStateV3DTO.contentAlign;
        }
        ButtonsPosition buttonsPosition2 = buttonsPosition;
        ContentAlign contentAlign2 = contentAlign;
        Map map2 = map;
        ViewAppearance viewAppearance2 = viewAppearance;
        return emptyStateV3DTO.copy(imageDTO, textDTO, textDTO2, list, map2, viewAppearance2, buttonsPosition2, contentAlign2);
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
    public final TextDTO getMessage() {
        return this.message;
    }

    public final List<ButtonV3DTO> component4() {
        return this.buttons;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final ViewAppearance getAppearance() {
        return this.appearance;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final ButtonsPosition getButtonsPosition() {
        return this.buttonsPosition;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final ContentAlign getContentAlign() {
        return this.contentAlign;
    }

    @NotNull
    public final EmptyStateV3DTO copy(@NotNull ImageDTO image, @NotNull TextDTO title, TextDTO message, List<ButtonV3DTO> buttons, Map<String, TokenizedTrackingInfo> trackingInfo, @NotNull ViewAppearance appearance, @NotNull ButtonsPosition buttonsPosition, @NotNull ContentAlign contentAlign) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(appearance, "appearance");
        Intrinsics.checkNotNullParameter(buttonsPosition, "buttonsPosition");
        Intrinsics.checkNotNullParameter(contentAlign, "contentAlign");
        return new EmptyStateV3DTO(image, title, message, buttons, trackingInfo, appearance, buttonsPosition, contentAlign);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmptyStateV3DTO)) {
            return false;
        }
        EmptyStateV3DTO emptyStateV3DTO = (EmptyStateV3DTO) other;
        return Intrinsics.d(this.image, emptyStateV3DTO.image) && Intrinsics.d(this.title, emptyStateV3DTO.title) && Intrinsics.d(this.message, emptyStateV3DTO.message) && Intrinsics.d(this.buttons, emptyStateV3DTO.buttons) && Intrinsics.d(this.trackingInfo, emptyStateV3DTO.trackingInfo) && this.appearance == emptyStateV3DTO.appearance && this.buttonsPosition == emptyStateV3DTO.buttonsPosition && this.contentAlign == emptyStateV3DTO.contentAlign;
    }

    @NotNull
    public final ViewAppearance getAppearance() {
        return this.appearance;
    }

    public final List<ButtonV3DTO> getButtons() {
        return this.buttons;
    }

    @NotNull
    public final ButtonsPosition getButtonsPosition() {
        return this.buttonsPosition;
    }

    @NotNull
    public final ContentAlign getContentAlign() {
        return this.contentAlign;
    }

    @NotNull
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

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = Ns.b.a(this.title, this.image.hashCode() * 31, 31);
        TextDTO textDTO = this.message;
        int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        List<ButtonV3DTO> list = this.buttons;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return this.contentAlign.hashCode() + ((this.buttonsPosition.hashCode() + ((this.appearance.hashCode() + ((hashCode2 + (map != null ? map.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        ImageDTO imageDTO = this.image;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.message;
        List<ButtonV3DTO> list = this.buttons;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        ViewAppearance viewAppearance = this.appearance;
        ButtonsPosition buttonsPosition = this.buttonsPosition;
        ContentAlign contentAlign = this.contentAlign;
        StringBuilder d11 = C2616s.d("EmptyStateV3DTO(image=", imageDTO, ", title=", textDTO, ", message=");
        Tl.a.e(d11, textDTO2, ", buttons=", list, ", trackingInfo=");
        d11.append(map);
        d11.append(", appearance=");
        d11.append(viewAppearance);
        d11.append(", buttonsPosition=");
        d11.append(buttonsPosition);
        d11.append(", contentAlign=");
        d11.append(contentAlign);
        d11.append(")");
        return d11.toString();
    }

    public /* synthetic */ EmptyStateV3DTO(ImageDTO imageDTO, TextDTO textDTO, TextDTO textDTO2, List list, Map map, ViewAppearance viewAppearance, ButtonsPosition buttonsPosition, ContentAlign contentAlign, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageDTO, textDTO, textDTO2, list, map, (i11 & 32) != 0 ? ViewAppearance.VIEW_APPEARANCE_FULL : viewAppearance, (i11 & 64) != 0 ? ButtonsPosition.AT_BOTTOM : buttonsPosition, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? ContentAlign.BOTTOM : contentAlign);
    }
}
