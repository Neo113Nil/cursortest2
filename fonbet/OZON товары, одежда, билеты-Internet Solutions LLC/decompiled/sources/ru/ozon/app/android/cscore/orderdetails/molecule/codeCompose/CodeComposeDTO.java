package ru.ozon.app.android.cscore.orderdetails.molecule.codeCompose;

import Ns.b;
import Pk0.h;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cscore.padding.PaddingCompose;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001#B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003J?\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, d2 = {"Lru/ozon/app/android/cscore/orderdetails/molecule/codeCompose/CodeComposeDTO;", "", "settings", "Lru/ozon/app/android/cscore/orderdetails/molecule/codeCompose/CodeComposeDTO$IslandSettings;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "titleIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "subtitle", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Lru/ozon/app/android/cscore/orderdetails/molecule/codeCompose/CodeComposeDTO$IslandSettings;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/TestInfo;)V", "getSettings", "()Lru/ozon/app/android/cscore/orderdetails/molecule/codeCompose/CodeComposeDTO$IslandSettings;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitleIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getSubtitle", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "IslandSettings", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CodeComposeDTO {
    public static final int $stable = 8;

    @NotNull
    private final IslandSettings settings;

    @NotNull
    private final TextDTO subtitle;
    private final TestInfo testInfo;

    @NotNull
    private final TextDTO title;
    private final IconDTO titleIcon;

    public CodeComposeDTO(@NotNull IslandSettings settings, @NotNull TextDTO title, IconDTO iconDTO, @NotNull TextDTO subtitle, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.settings = settings;
        this.title = title;
        this.titleIcon = iconDTO;
        this.subtitle = subtitle;
        this.testInfo = testInfo;
    }

    public static /* synthetic */ CodeComposeDTO copy$default(CodeComposeDTO codeComposeDTO, IslandSettings islandSettings, TextDTO textDTO, IconDTO iconDTO, TextDTO textDTO2, TestInfo testInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            islandSettings = codeComposeDTO.settings;
        }
        if ((i11 & 2) != 0) {
            textDTO = codeComposeDTO.title;
        }
        if ((i11 & 4) != 0) {
            iconDTO = codeComposeDTO.titleIcon;
        }
        if ((i11 & 8) != 0) {
            textDTO2 = codeComposeDTO.subtitle;
        }
        if ((i11 & 16) != 0) {
            testInfo = codeComposeDTO.testInfo;
        }
        TestInfo testInfo2 = testInfo;
        IconDTO iconDTO2 = iconDTO;
        return codeComposeDTO.copy(islandSettings, textDTO, iconDTO2, textDTO2, testInfo2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final IslandSettings getSettings() {
        return this.settings;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final IconDTO getTitleIcon() {
        return this.titleIcon;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component5, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final CodeComposeDTO copy(@NotNull IslandSettings settings, @NotNull TextDTO title, IconDTO titleIcon, @NotNull TextDTO subtitle, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        return new CodeComposeDTO(settings, title, titleIcon, subtitle, testInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeComposeDTO)) {
            return false;
        }
        CodeComposeDTO codeComposeDTO = (CodeComposeDTO) other;
        return Intrinsics.d(this.settings, codeComposeDTO.settings) && Intrinsics.d(this.title, codeComposeDTO.title) && Intrinsics.d(this.titleIcon, codeComposeDTO.titleIcon) && Intrinsics.d(this.subtitle, codeComposeDTO.subtitle) && Intrinsics.d(this.testInfo, codeComposeDTO.testInfo);
    }

    @NotNull
    public final IslandSettings getSettings() {
        return this.settings;
    }

    @NotNull
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final IconDTO getTitleIcon() {
        return this.titleIcon;
    }

    public int hashCode() {
        int a11 = b.a(this.title, this.settings.hashCode() * 31, 31);
        IconDTO iconDTO = this.titleIcon;
        int a12 = b.a(this.subtitle, (a11 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31, 31);
        TestInfo testInfo = this.testInfo;
        return a12 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        IslandSettings islandSettings = this.settings;
        TextDTO textDTO = this.title;
        IconDTO iconDTO = this.titleIcon;
        TextDTO textDTO2 = this.subtitle;
        TestInfo testInfo = this.testInfo;
        StringBuilder sb2 = new StringBuilder("CodeComposeDTO(settings=");
        sb2.append(islandSettings);
        sb2.append(", title=");
        sb2.append(textDTO);
        sb2.append(", titleIcon=");
        sb2.append(iconDTO);
        sb2.append(", subtitle=");
        sb2.append(textDTO2);
        sb2.append(", testInfo=");
        return h.c(sb2, testInfo, ")");
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003JM\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lru/ozon/app/android/cscore/orderdetails/molecule/codeCompose/CodeComposeDTO$IslandSettings;", "", "islandColor", "", "islandCornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "padding", "Lru/ozon/app/android/cscore/padding/PaddingCompose;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/app/android/cscore/padding/PaddingCompose;Ljava/util/Map;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getIslandColor", "()Ljava/lang/String;", "getIslandCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getPadding", "()Lru/ozon/app/android/cscore/padding/PaddingCompose;", "getTrackingInfo", "()Ljava/util/Map;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IslandSettings {
        public static final int $stable = 8;
        private final CommonControlSettings common;
        private final String islandColor;

        @NotNull
        private final CornerRadius islandCornerRadius;

        @NotNull
        private final PaddingCompose padding;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public IslandSettings(String str, @NotNull CornerRadius islandCornerRadius, @NotNull PaddingCompose padding, Map<String, TokenizedTrackingInfo> map, CommonControlSettings commonControlSettings) {
            Intrinsics.checkNotNullParameter(islandCornerRadius, "islandCornerRadius");
            Intrinsics.checkNotNullParameter(padding, "padding");
            this.islandColor = str;
            this.islandCornerRadius = islandCornerRadius;
            this.padding = padding;
            this.trackingInfo = map;
            this.common = commonControlSettings;
        }

        public static /* synthetic */ IslandSettings copy$default(IslandSettings islandSettings, String str, CornerRadius cornerRadius, PaddingCompose paddingCompose, Map map, CommonControlSettings commonControlSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = islandSettings.islandColor;
            }
            if ((i11 & 2) != 0) {
                cornerRadius = islandSettings.islandCornerRadius;
            }
            if ((i11 & 4) != 0) {
                paddingCompose = islandSettings.padding;
            }
            if ((i11 & 8) != 0) {
                map = islandSettings.trackingInfo;
            }
            if ((i11 & 16) != 0) {
                commonControlSettings = islandSettings.common;
            }
            CommonControlSettings commonControlSettings2 = commonControlSettings;
            PaddingCompose paddingCompose2 = paddingCompose;
            return islandSettings.copy(str, cornerRadius, paddingCompose2, map, commonControlSettings2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getIslandColor() {
            return this.islandColor;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final CornerRadius getIslandCornerRadius() {
            return this.islandCornerRadius;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final PaddingCompose getPadding() {
            return this.padding;
        }

        public final Map<String, TokenizedTrackingInfo> component4() {
            return this.trackingInfo;
        }

        /* renamed from: component5, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final IslandSettings copy(String islandColor, @NotNull CornerRadius islandCornerRadius, @NotNull PaddingCompose padding, Map<String, TokenizedTrackingInfo> trackingInfo, CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(islandCornerRadius, "islandCornerRadius");
            Intrinsics.checkNotNullParameter(padding, "padding");
            return new IslandSettings(islandColor, islandCornerRadius, padding, trackingInfo, common);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IslandSettings)) {
                return false;
            }
            IslandSettings islandSettings = (IslandSettings) other;
            return Intrinsics.d(this.islandColor, islandSettings.islandColor) && this.islandCornerRadius == islandSettings.islandCornerRadius && Intrinsics.d(this.padding, islandSettings.padding) && Intrinsics.d(this.trackingInfo, islandSettings.trackingInfo) && Intrinsics.d(this.common, islandSettings.common);
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        public final String getIslandColor() {
            return this.islandColor;
        }

        @NotNull
        public final CornerRadius getIslandCornerRadius() {
            return this.islandCornerRadius;
        }

        @NotNull
        public final PaddingCompose getPadding() {
            return this.padding;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            String str = this.islandColor;
            int hashCode = (this.padding.hashCode() + Tl.b.b(this.islandCornerRadius, (str == null ? 0 : str.hashCode()) * 31, 31)) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
            CommonControlSettings commonControlSettings = this.common;
            return hashCode2 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.islandColor;
            CornerRadius cornerRadius = this.islandCornerRadius;
            PaddingCompose paddingCompose = this.padding;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            CommonControlSettings commonControlSettings = this.common;
            StringBuilder sb2 = new StringBuilder("IslandSettings(islandColor=");
            sb2.append(str);
            sb2.append(", islandCornerRadius=");
            sb2.append(cornerRadius);
            sb2.append(", padding=");
            sb2.append(paddingCompose);
            sb2.append(", trackingInfo=");
            sb2.append(map);
            sb2.append(", common=");
            return Ak.b.g(sb2, commonControlSettings, ")");
        }

        public /* synthetic */ IslandSettings(String str, CornerRadius cornerRadius, PaddingCompose paddingCompose, Map map, CommonControlSettings commonControlSettings, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? CornerRadius.RADIUS_500 : cornerRadius, paddingCompose, map, commonControlSettings);
        }
    }
}
