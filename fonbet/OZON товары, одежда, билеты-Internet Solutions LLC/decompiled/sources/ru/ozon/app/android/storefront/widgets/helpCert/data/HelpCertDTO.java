package ru.ozon.app.android.storefront.widgets.helpCert.data;

import De.C2859b;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001&BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0003JM\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lru/ozon/app/android/storefront/widgets/helpCert/data/HelpCertDTO;", "", "cell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "description", "Lru/ozon/uni/atoms/data/text/TextDTO;", "settings", "Lru/ozon/app/android/storefront/widgets/helpCert/data/HelpCertDTO$Settings;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/storefront/widgets/helpCert/data/HelpCertDTO$Settings;Ljava/util/Map;)V", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getDescription", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSettings", "()Lru/ozon/app/android/storefront/widgets/helpCert/data/HelpCertDTO$Settings;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Settings", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class HelpCertDTO {
    public static final int $stable = 8;

    @NotNull
    private final ButtonV3DTO button;

    @NotNull
    private final CellDTO cell;
    private final TextDTO description;
    private final Settings settings;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/storefront/widgets/helpCert/data/HelpCertDTO$Settings;", "", "horizontalOffset", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "<init>", "(Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)V", "getHorizontalOffset", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Settings {
        public static final int $stable = 0;

        @NotNull
        private final CommonCellSettings.LayoutPadding horizontalOffset;

        public Settings(@NotNull CommonCellSettings.LayoutPadding horizontalOffset) {
            Intrinsics.checkNotNullParameter(horizontalOffset, "horizontalOffset");
            this.horizontalOffset = horizontalOffset;
        }

        public static /* synthetic */ Settings copy$default(Settings settings, CommonCellSettings.LayoutPadding layoutPadding, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                layoutPadding = settings.horizontalOffset;
            }
            return settings.copy(layoutPadding);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CommonCellSettings.LayoutPadding getHorizontalOffset() {
            return this.horizontalOffset;
        }

        @NotNull
        public final Settings copy(@NotNull CommonCellSettings.LayoutPadding horizontalOffset) {
            Intrinsics.checkNotNullParameter(horizontalOffset, "horizontalOffset");
            return new Settings(horizontalOffset);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Settings) && this.horizontalOffset == ((Settings) other).horizontalOffset;
        }

        @NotNull
        public final CommonCellSettings.LayoutPadding getHorizontalOffset() {
            return this.horizontalOffset;
        }

        public int hashCode() {
            return this.horizontalOffset.hashCode();
        }

        @NotNull
        public String toString() {
            return "Settings(horizontalOffset=" + this.horizontalOffset + ")";
        }
    }

    public HelpCertDTO(@NotNull CellDTO cell, @NotNull ButtonV3DTO button, TextDTO textDTO, Settings settings, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(button, "button");
        this.cell = cell;
        this.button = button;
        this.description = textDTO;
        this.settings = settings;
        this.trackingInfo = map;
    }

    public static /* synthetic */ HelpCertDTO copy$default(HelpCertDTO helpCertDTO, CellDTO cellDTO, ButtonV3DTO buttonV3DTO, TextDTO textDTO, Settings settings, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cellDTO = helpCertDTO.cell;
        }
        if ((i11 & 2) != 0) {
            buttonV3DTO = helpCertDTO.button;
        }
        if ((i11 & 4) != 0) {
            textDTO = helpCertDTO.description;
        }
        if ((i11 & 8) != 0) {
            settings = helpCertDTO.settings;
        }
        if ((i11 & 16) != 0) {
            map = helpCertDTO.trackingInfo;
        }
        Map map2 = map;
        TextDTO textDTO2 = textDTO;
        return helpCertDTO.copy(cellDTO, buttonV3DTO, textDTO2, settings, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CellDTO getCell() {
        return this.cell;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    /* renamed from: component3, reason: from getter */
    public final TextDTO getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final Settings getSettings() {
        return this.settings;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final HelpCertDTO copy(@NotNull CellDTO cell, @NotNull ButtonV3DTO button, TextDTO description, Settings settings, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(button, "button");
        return new HelpCertDTO(cell, button, description, settings, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HelpCertDTO)) {
            return false;
        }
        HelpCertDTO helpCertDTO = (HelpCertDTO) other;
        return Intrinsics.d(this.cell, helpCertDTO.cell) && Intrinsics.d(this.button, helpCertDTO.button) && Intrinsics.d(this.description, helpCertDTO.description) && Intrinsics.d(this.settings, helpCertDTO.settings) && Intrinsics.d(this.trackingInfo, helpCertDTO.trackingInfo);
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }

    public final TextDTO getDescription() {
        return this.description;
    }

    public final Settings getSettings() {
        return this.settings;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int c11 = C2859b.c(this.button, this.cell.hashCode() * 31, 31);
        TextDTO textDTO = this.description;
        int hashCode = (c11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        Settings settings = this.settings;
        int hashCode2 = (hashCode + (settings == null ? 0 : settings.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        CellDTO cellDTO = this.cell;
        ButtonV3DTO buttonV3DTO = this.button;
        TextDTO textDTO = this.description;
        Settings settings = this.settings;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("HelpCertDTO(cell=");
        sb2.append(cellDTO);
        sb2.append(", button=");
        sb2.append(buttonV3DTO);
        sb2.append(", description=");
        sb2.append(textDTO);
        sb2.append(", settings=");
        sb2.append(settings);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
