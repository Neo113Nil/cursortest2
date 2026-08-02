package ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.data;

import Ak.b;
import Ih.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.data.IslandSeparatorDTO;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.data.SignedLinkDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u000278B[\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\t\u0010+\u001a\u00020\u000bHÆ\u0003J\t\u0010,\u001a\u00020\rHÆ\u0003J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\t\u0010.\u001a\u00020\tHÆ\u0003J\t\u0010/\u001a\u00020\u0013HÆ\u0003Jm\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\u0003HÖ\u0001J\t\u00105\u001a\u000206HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0011\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u00069"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/data/ItemDTO;", "", "groupId", "", "islandSeparator", "Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;", "cell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "subtitle", "Lru/ozon/uni/atoms/data/text/TextDTO;", "addPhotoButton", "Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/data/ItemDTO$AddPhotoButtonDTO;", "uploadImageAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "existingImages", "", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/data/SignedLinkDTO;", "errorDescription", "settings", "Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/data/ItemDTO$SettingsDTO;", "<init>", "(ILru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/data/ItemDTO$AddPhotoButtonDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/data/ItemDTO$SettingsDTO;)V", "getGroupId", "()I", "getIslandSeparator", "()Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getSubtitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getAddPhotoButton", "()Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/data/ItemDTO$AddPhotoButtonDTO;", "getUploadImageAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getExistingImages", "()Ljava/util/List;", "getErrorDescription", "getSettings", "()Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/data/ItemDTO$SettingsDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "", "AddPhotoButtonDTO", "SettingsDTO", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ItemDTO {
    public static final int $stable = 8;

    @NotNull
    private final AddPhotoButtonDTO addPhotoButton;

    @NotNull
    private final CellDTO cell;

    @NotNull
    private final TextDTO errorDescription;
    private final List<SignedLinkDTO> existingImages;
    private final transient int groupId;
    private final IslandSeparatorDTO islandSeparator;

    @NotNull
    private final SettingsDTO settings;

    @NotNull
    private final TextDTO subtitle;

    @NotNull
    private final AtomActionDTO uploadImageAction;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/data/ItemDTO$AddPhotoButtonDTO;", "", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "backgroundColor", "", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AddPhotoButtonDTO {
        public static final int $stable = IconDTO.$stable;
        private final String backgroundColor;

        @NotNull
        private final CommonControlSettings common;

        @NotNull
        private final IconDTO icon;

        public AddPhotoButtonDTO(@NotNull IconDTO icon, String str, @NotNull CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(common, "common");
            this.icon = icon;
            this.backgroundColor = str;
            this.common = common;
        }

        public static /* synthetic */ AddPhotoButtonDTO copy$default(AddPhotoButtonDTO addPhotoButtonDTO, IconDTO iconDTO, String str, CommonControlSettings commonControlSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                iconDTO = addPhotoButtonDTO.icon;
            }
            if ((i11 & 2) != 0) {
                str = addPhotoButtonDTO.backgroundColor;
            }
            if ((i11 & 4) != 0) {
                commonControlSettings = addPhotoButtonDTO.common;
            }
            return addPhotoButtonDTO.copy(iconDTO, str, commonControlSettings);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final AddPhotoButtonDTO copy(@NotNull IconDTO icon, String backgroundColor, @NotNull CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(common, "common");
            return new AddPhotoButtonDTO(icon, backgroundColor, common);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AddPhotoButtonDTO)) {
                return false;
            }
            AddPhotoButtonDTO addPhotoButtonDTO = (AddPhotoButtonDTO) other;
            return Intrinsics.d(this.icon, addPhotoButtonDTO.icon) && Intrinsics.d(this.backgroundColor, addPhotoButtonDTO.backgroundColor) && Intrinsics.d(this.common, addPhotoButtonDTO.common);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        public int hashCode() {
            int hashCode = this.icon.hashCode() * 31;
            String str = this.backgroundColor;
            return this.common.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            IconDTO iconDTO = this.icon;
            String str = this.backgroundColor;
            CommonControlSettings commonControlSettings = this.common;
            StringBuilder sb2 = new StringBuilder("AddPhotoButtonDTO(icon=");
            sb2.append(iconDTO);
            sb2.append(", backgroundColor=");
            sb2.append(str);
            sb2.append(", common=");
            return b.g(sb2, commonControlSettings, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J$\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/data/ItemDTO$SettingsDTO;", "", "minCount", "", "maxCount", "<init>", "(Ljava/lang/Integer;I)V", "getMinCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaxCount", "()I", "component1", "component2", "copy", "(Ljava/lang/Integer;I)Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/data/ItemDTO$SettingsDTO;", "equals", "", "other", "hashCode", "toString", "", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SettingsDTO {
        public static final int $stable = 0;
        private final int maxCount;
        private final Integer minCount;

        public SettingsDTO(Integer num, int i11) {
            this.minCount = num;
            this.maxCount = i11;
        }

        public static /* synthetic */ SettingsDTO copy$default(SettingsDTO settingsDTO, Integer num, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                num = settingsDTO.minCount;
            }
            if ((i12 & 2) != 0) {
                i11 = settingsDTO.maxCount;
            }
            return settingsDTO.copy(num, i11);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getMinCount() {
            return this.minCount;
        }

        /* renamed from: component2, reason: from getter */
        public final int getMaxCount() {
            return this.maxCount;
        }

        @NotNull
        public final SettingsDTO copy(Integer minCount, int maxCount) {
            return new SettingsDTO(minCount, maxCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SettingsDTO)) {
                return false;
            }
            SettingsDTO settingsDTO = (SettingsDTO) other;
            return Intrinsics.d(this.minCount, settingsDTO.minCount) && this.maxCount == settingsDTO.maxCount;
        }

        public final int getMaxCount() {
            return this.maxCount;
        }

        public final Integer getMinCount() {
            return this.minCount;
        }

        public int hashCode() {
            Integer num = this.minCount;
            return Integer.hashCode(this.maxCount) + ((num == null ? 0 : num.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "SettingsDTO(minCount=" + this.minCount + ", maxCount=" + this.maxCount + ")";
        }
    }

    public ItemDTO(int i11, IslandSeparatorDTO islandSeparatorDTO, @NotNull CellDTO cell, @NotNull TextDTO subtitle, @NotNull AddPhotoButtonDTO addPhotoButton, @NotNull AtomActionDTO uploadImageAction, List<SignedLinkDTO> list, @NotNull TextDTO errorDescription, @NotNull SettingsDTO settings) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(addPhotoButton, "addPhotoButton");
        Intrinsics.checkNotNullParameter(uploadImageAction, "uploadImageAction");
        Intrinsics.checkNotNullParameter(errorDescription, "errorDescription");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.groupId = i11;
        this.islandSeparator = islandSeparatorDTO;
        this.cell = cell;
        this.subtitle = subtitle;
        this.addPhotoButton = addPhotoButton;
        this.uploadImageAction = uploadImageAction;
        this.existingImages = list;
        this.errorDescription = errorDescription;
        this.settings = settings;
    }

    public static /* synthetic */ ItemDTO copy$default(ItemDTO itemDTO, int i11, IslandSeparatorDTO islandSeparatorDTO, CellDTO cellDTO, TextDTO textDTO, AddPhotoButtonDTO addPhotoButtonDTO, AtomActionDTO atomActionDTO, List list, TextDTO textDTO2, SettingsDTO settingsDTO, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = itemDTO.groupId;
        }
        if ((i12 & 2) != 0) {
            islandSeparatorDTO = itemDTO.islandSeparator;
        }
        if ((i12 & 4) != 0) {
            cellDTO = itemDTO.cell;
        }
        if ((i12 & 8) != 0) {
            textDTO = itemDTO.subtitle;
        }
        if ((i12 & 16) != 0) {
            addPhotoButtonDTO = itemDTO.addPhotoButton;
        }
        if ((i12 & 32) != 0) {
            atomActionDTO = itemDTO.uploadImageAction;
        }
        if ((i12 & 64) != 0) {
            list = itemDTO.existingImages;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            textDTO2 = itemDTO.errorDescription;
        }
        if ((i12 & 256) != 0) {
            settingsDTO = itemDTO.settings;
        }
        TextDTO textDTO3 = textDTO2;
        SettingsDTO settingsDTO2 = settingsDTO;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        List list2 = list;
        AddPhotoButtonDTO addPhotoButtonDTO2 = addPhotoButtonDTO;
        CellDTO cellDTO2 = cellDTO;
        return itemDTO.copy(i11, islandSeparatorDTO, cellDTO2, textDTO, addPhotoButtonDTO2, atomActionDTO2, list2, textDTO3, settingsDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getGroupId() {
        return this.groupId;
    }

    /* renamed from: component2, reason: from getter */
    public final IslandSeparatorDTO getIslandSeparator() {
        return this.islandSeparator;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final CellDTO getCell() {
        return this.cell;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final AddPhotoButtonDTO getAddPhotoButton() {
        return this.addPhotoButton;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final AtomActionDTO getUploadImageAction() {
        return this.uploadImageAction;
    }

    public final List<SignedLinkDTO> component7() {
        return this.existingImages;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final TextDTO getErrorDescription() {
        return this.errorDescription;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final SettingsDTO getSettings() {
        return this.settings;
    }

    @NotNull
    public final ItemDTO copy(int groupId, IslandSeparatorDTO islandSeparator, @NotNull CellDTO cell, @NotNull TextDTO subtitle, @NotNull AddPhotoButtonDTO addPhotoButton, @NotNull AtomActionDTO uploadImageAction, List<SignedLinkDTO> existingImages, @NotNull TextDTO errorDescription, @NotNull SettingsDTO settings) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(addPhotoButton, "addPhotoButton");
        Intrinsics.checkNotNullParameter(uploadImageAction, "uploadImageAction");
        Intrinsics.checkNotNullParameter(errorDescription, "errorDescription");
        Intrinsics.checkNotNullParameter(settings, "settings");
        return new ItemDTO(groupId, islandSeparator, cell, subtitle, addPhotoButton, uploadImageAction, existingImages, errorDescription, settings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemDTO)) {
            return false;
        }
        ItemDTO itemDTO = (ItemDTO) other;
        return this.groupId == itemDTO.groupId && Intrinsics.d(this.islandSeparator, itemDTO.islandSeparator) && Intrinsics.d(this.cell, itemDTO.cell) && Intrinsics.d(this.subtitle, itemDTO.subtitle) && Intrinsics.d(this.addPhotoButton, itemDTO.addPhotoButton) && Intrinsics.d(this.uploadImageAction, itemDTO.uploadImageAction) && Intrinsics.d(this.existingImages, itemDTO.existingImages) && Intrinsics.d(this.errorDescription, itemDTO.errorDescription) && Intrinsics.d(this.settings, itemDTO.settings);
    }

    @NotNull
    public final AddPhotoButtonDTO getAddPhotoButton() {
        return this.addPhotoButton;
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }

    @NotNull
    public final TextDTO getErrorDescription() {
        return this.errorDescription;
    }

    public final List<SignedLinkDTO> getExistingImages() {
        return this.existingImages;
    }

    public final int getGroupId() {
        return this.groupId;
    }

    public final IslandSeparatorDTO getIslandSeparator() {
        return this.islandSeparator;
    }

    @NotNull
    public final SettingsDTO getSettings() {
        return this.settings;
    }

    @NotNull
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final AtomActionDTO getUploadImageAction() {
        return this.uploadImageAction;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.groupId) * 31;
        IslandSeparatorDTO islandSeparatorDTO = this.islandSeparator;
        int b11 = a.b(this.uploadImageAction, (this.addPhotoButton.hashCode() + Ns.b.a(this.subtitle, Bi.b.c(this.cell, (hashCode + (islandSeparatorDTO == null ? 0 : islandSeparatorDTO.hashCode())) * 31, 31), 31)) * 31, 31);
        List<SignedLinkDTO> list = this.existingImages;
        return this.settings.hashCode() + Ns.b.a(this.errorDescription, (b11 + (list != null ? list.hashCode() : 0)) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "ItemDTO(groupId=" + this.groupId + ", islandSeparator=" + this.islandSeparator + ", cell=" + this.cell + ", subtitle=" + this.subtitle + ", addPhotoButton=" + this.addPhotoButton + ", uploadImageAction=" + this.uploadImageAction + ", existingImages=" + this.existingImages + ", errorDescription=" + this.errorDescription + ", settings=" + this.settings + ")";
    }

    public /* synthetic */ ItemDTO(int i11, IslandSeparatorDTO islandSeparatorDTO, CellDTO cellDTO, TextDTO textDTO, AddPhotoButtonDTO addPhotoButtonDTO, AtomActionDTO atomActionDTO, List list, TextDTO textDTO2, SettingsDTO settingsDTO, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i11, islandSeparatorDTO, cellDTO, textDTO, addPhotoButtonDTO, atomActionDTO, list, textDTO2, settingsDTO);
    }
}
