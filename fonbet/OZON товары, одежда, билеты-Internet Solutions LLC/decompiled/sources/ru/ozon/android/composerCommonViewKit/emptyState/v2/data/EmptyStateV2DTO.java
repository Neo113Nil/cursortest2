package ru.ozon.android.composerCommonViewKit.emptyState.v2.data;

import I1.w;
import Sc.InterfaceC3999a;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000278Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\t\u0010+\u001a\u00020\u000bHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jy\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J\t\u00106\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%¨\u00069"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/EmptyStateV2DTO;", "", "message", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "image", "buttons", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "size", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/EmptyStateV2DTO$EmptyStateSize;", "backgroundColor", "imageAtom", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "titleAtom", "Lru/ozon/uni/atoms/data/text/TextDTO;", "messageAtom", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/EmptyStateV2DTO$EmptyStateSize;Ljava/lang/String;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getMessage$annotations", "()V", "getMessage", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitle$annotations", "getTitle", "()Ljava/lang/String;", "getImage$annotations", "getImage", "getButtons", "()Ljava/util/List;", "getSize", "()Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/EmptyStateV2DTO$EmptyStateSize;", "getBackgroundColor", "getImageAtom", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getTitleAtom", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getMessageAtom", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "EmptyStateSize", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class EmptyStateV2DTO {
    private final String backgroundColor;
    private final List<AtomDTO> buttons;
    private final String image;
    private final ImageDTO imageAtom;
    private final OzonSpannableString message;
    private final TextDTO messageAtom;

    @NotNull
    private final EmptyStateSize size;
    private final String title;
    private final TextDTO titleAtom;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\t¨\u0006\n"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/EmptyStateV2DTO$Companion;", "", "<init>", "()V", "configureLegacyTitle", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "", "configureLegacySubtitle", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TextDTO configureLegacySubtitle(@NotNull OzonSpannableString text) {
            Intrinsics.checkNotNullParameter(text, "text");
            CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.PADDING_800;
            return new TextDTO(text, TextDTO.TextAlignment.CENTER, layoutPadding, layoutPadding, null, CommonCellSettings.LayoutPadding.PADDING_250, TextPreset.PRESET_CUSTOM, StyleParser.TextStyle.BODY_M.getStyleName(), StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_SECONDARY.getValue(), 0, null, null, null, false, null, null, null, null, null, 523280, null);
        }

        @NotNull
        public final TextDTO configureLegacyTitle(@NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(text);
            CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.PADDING_800;
            return new TextDTO(ozonSpannableString, TextDTO.TextAlignment.CENTER, layoutPadding, layoutPadding, CommonCellSettings.LayoutPadding.PADDING_600, CommonCellSettings.LayoutPadding.PADDING_250, TextPreset.PRESET_CUSTOM, StyleParser.TextStyle.BODY_L_BOLD.getStyleName(), StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY.getValue(), 0, null, null, null, false, null, null, null, null, null, 523264, null);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/EmptyStateV2DTO$EmptyStateSize;", "", "<init>", "(Ljava/lang/String;I)V", "WRAP", "FULLSCREEN", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = false)
    public static final class EmptyStateSize {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ EmptyStateSize[] $VALUES;

        @i(name = "wrap")
        public static final EmptyStateSize WRAP = new EmptyStateSize("WRAP", 0);

        @i(name = "fullscreen")
        public static final EmptyStateSize FULLSCREEN = new EmptyStateSize("FULLSCREEN", 1);

        private static final /* synthetic */ EmptyStateSize[] $values() {
            return new EmptyStateSize[]{WRAP, FULLSCREEN};
        }

        static {
            EmptyStateSize[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private EmptyStateSize(String str, int i11) {
        }

        @NotNull
        public static a<EmptyStateSize> getEntries() {
            return $ENTRIES;
        }

        public static EmptyStateSize valueOf(String str) {
            return (EmptyStateSize) Enum.valueOf(EmptyStateSize.class, str);
        }

        public static EmptyStateSize[] values() {
            return (EmptyStateSize[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EmptyStateV2DTO(OzonSpannableString ozonSpannableString, String str, String str2, List<? extends AtomDTO> list, @NotNull EmptyStateSize size, String str3, ImageDTO imageDTO, TextDTO textDTO, TextDTO textDTO2) {
        Intrinsics.checkNotNullParameter(size, "size");
        this.message = ozonSpannableString;
        this.title = str;
        this.image = str2;
        this.buttons = list;
        this.size = size;
        this.backgroundColor = str3;
        this.imageAtom = imageDTO;
        this.titleAtom = textDTO;
        this.messageAtom = textDTO2;
    }

    public static /* synthetic */ EmptyStateV2DTO copy$default(EmptyStateV2DTO emptyStateV2DTO, OzonSpannableString ozonSpannableString, String str, String str2, List list, EmptyStateSize emptyStateSize, String str3, ImageDTO imageDTO, TextDTO textDTO, TextDTO textDTO2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            ozonSpannableString = emptyStateV2DTO.message;
        }
        if ((i11 & 2) != 0) {
            str = emptyStateV2DTO.title;
        }
        if ((i11 & 4) != 0) {
            str2 = emptyStateV2DTO.image;
        }
        if ((i11 & 8) != 0) {
            list = emptyStateV2DTO.buttons;
        }
        if ((i11 & 16) != 0) {
            emptyStateSize = emptyStateV2DTO.size;
        }
        if ((i11 & 32) != 0) {
            str3 = emptyStateV2DTO.backgroundColor;
        }
        if ((i11 & 64) != 0) {
            imageDTO = emptyStateV2DTO.imageAtom;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            textDTO = emptyStateV2DTO.titleAtom;
        }
        if ((i11 & 256) != 0) {
            textDTO2 = emptyStateV2DTO.messageAtom;
        }
        TextDTO textDTO3 = textDTO;
        TextDTO textDTO4 = textDTO2;
        String str4 = str3;
        ImageDTO imageDTO2 = imageDTO;
        EmptyStateSize emptyStateSize2 = emptyStateSize;
        String str5 = str2;
        return emptyStateV2DTO.copy(ozonSpannableString, str, str5, list, emptyStateSize2, str4, imageDTO2, textDTO3, textDTO4);
    }

    @InterfaceC3999a
    public static /* synthetic */ void getImage$annotations() {
    }

    @InterfaceC3999a
    public static /* synthetic */ void getMessage$annotations() {
    }

    @InterfaceC3999a
    public static /* synthetic */ void getTitle$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final OzonSpannableString getMessage() {
        return this.message;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    public final List<AtomDTO> component4() {
        return this.buttons;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final EmptyStateSize getSize() {
        return this.size;
    }

    /* renamed from: component6, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component7, reason: from getter */
    public final ImageDTO getImageAtom() {
        return this.imageAtom;
    }

    /* renamed from: component8, reason: from getter */
    public final TextDTO getTitleAtom() {
        return this.titleAtom;
    }

    /* renamed from: component9, reason: from getter */
    public final TextDTO getMessageAtom() {
        return this.messageAtom;
    }

    @NotNull
    public final EmptyStateV2DTO copy(OzonSpannableString message, String title, String image, List<? extends AtomDTO> buttons, @NotNull EmptyStateSize size, String backgroundColor, ImageDTO imageAtom, TextDTO titleAtom, TextDTO messageAtom) {
        Intrinsics.checkNotNullParameter(size, "size");
        return new EmptyStateV2DTO(message, title, image, buttons, size, backgroundColor, imageAtom, titleAtom, messageAtom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmptyStateV2DTO)) {
            return false;
        }
        EmptyStateV2DTO emptyStateV2DTO = (EmptyStateV2DTO) other;
        return Intrinsics.d(this.message, emptyStateV2DTO.message) && Intrinsics.d(this.title, emptyStateV2DTO.title) && Intrinsics.d(this.image, emptyStateV2DTO.image) && Intrinsics.d(this.buttons, emptyStateV2DTO.buttons) && this.size == emptyStateV2DTO.size && Intrinsics.d(this.backgroundColor, emptyStateV2DTO.backgroundColor) && Intrinsics.d(this.imageAtom, emptyStateV2DTO.imageAtom) && Intrinsics.d(this.titleAtom, emptyStateV2DTO.titleAtom) && Intrinsics.d(this.messageAtom, emptyStateV2DTO.messageAtom);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final List<AtomDTO> getButtons() {
        return this.buttons;
    }

    public final String getImage() {
        return this.image;
    }

    public final ImageDTO getImageAtom() {
        return this.imageAtom;
    }

    public final OzonSpannableString getMessage() {
        return this.message;
    }

    public final TextDTO getMessageAtom() {
        return this.messageAtom;
    }

    @NotNull
    public final EmptyStateSize getSize() {
        return this.size;
    }

    public final String getTitle() {
        return this.title;
    }

    public final TextDTO getTitleAtom() {
        return this.titleAtom;
    }

    public int hashCode() {
        OzonSpannableString ozonSpannableString = this.message;
        int hashCode = (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode()) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.image;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<AtomDTO> list = this.buttons;
        int hashCode4 = (this.size.hashCode() + ((hashCode3 + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        String str3 = this.backgroundColor;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ImageDTO imageDTO = this.imageAtom;
        int hashCode6 = (hashCode5 + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31;
        TextDTO textDTO = this.titleAtom;
        int hashCode7 = (hashCode6 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.messageAtom;
        return hashCode7 + (textDTO2 != null ? textDTO2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        OzonSpannableString ozonSpannableString = this.message;
        String str = this.title;
        String str2 = this.image;
        List<AtomDTO> list = this.buttons;
        EmptyStateSize emptyStateSize = this.size;
        String str3 = this.backgroundColor;
        ImageDTO imageDTO = this.imageAtom;
        TextDTO textDTO = this.titleAtom;
        TextDTO textDTO2 = this.messageAtom;
        StringBuilder f7 = GR.b.f("EmptyStateV2DTO(message=", ozonSpannableString, ", title=", str, ", image=");
        w.d(str2, ", buttons=", ", size=", f7, list);
        f7.append(emptyStateSize);
        f7.append(", backgroundColor=");
        f7.append(str3);
        f7.append(", imageAtom=");
        f7.append(imageDTO);
        f7.append(", titleAtom=");
        f7.append(textDTO);
        f7.append(", messageAtom=");
        return Tl.b.e(f7, textDTO2, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ EmptyStateV2DTO(OzonSpannableString ozonSpannableString, String str, String str2, List list, EmptyStateSize emptyStateSize, String str3, ImageDTO imageDTO, TextDTO textDTO, TextDTO textDTO2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(ozonSpannableString, str, str2, list, r5, str3, imageDTO, r8, r9);
        TextDTO textDTO3;
        TextDTO textDTO4;
        EmptyStateSize emptyStateSize2 = (i11 & 16) != 0 ? EmptyStateSize.WRAP : emptyStateSize;
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            textDTO3 = str != null ? Companion.configureLegacyTitle(str) : null;
        } else {
            textDTO3 = textDTO;
        }
        if ((i11 & 256) != 0) {
            textDTO4 = ozonSpannableString != null ? Companion.configureLegacySubtitle(ozonSpannableString) : null;
        } else {
            textDTO4 = textDTO2;
        }
    }
}
