package ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.data;

import Bi.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.dto.travelWidgetSettings.TravelWidgetSettingsDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003JT\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/data/BonusExpirationRemainderDTO;", "", "key", "", "keyValue", "", "widgetSettings", "Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;", "cell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "closeButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "settings", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getKey", "()Ljava/lang/String;", "getKeyValue", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getWidgetSettings", "()Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCloseButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getSettings", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Long;Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/data/BonusExpirationRemainderDTO;", "equals", "", "other", "hashCode", "", "toString", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BonusExpirationRemainderDTO {
    public static final int $stable = 8;

    @NotNull
    private final CellDTO cell;
    private final IconButtonV3DTO closeButton;
    private final String key;
    private final Long keyValue;
    private final CommonControlSettings settings;
    private final TravelWidgetSettingsDTO widgetSettings;

    public BonusExpirationRemainderDTO(String str, Long l11, TravelWidgetSettingsDTO travelWidgetSettingsDTO, @NotNull CellDTO cell, IconButtonV3DTO iconButtonV3DTO, CommonControlSettings commonControlSettings) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        this.key = str;
        this.keyValue = l11;
        this.widgetSettings = travelWidgetSettingsDTO;
        this.cell = cell;
        this.closeButton = iconButtonV3DTO;
        this.settings = commonControlSettings;
    }

    public static /* synthetic */ BonusExpirationRemainderDTO copy$default(BonusExpirationRemainderDTO bonusExpirationRemainderDTO, String str, Long l11, TravelWidgetSettingsDTO travelWidgetSettingsDTO, CellDTO cellDTO, IconButtonV3DTO iconButtonV3DTO, CommonControlSettings commonControlSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bonusExpirationRemainderDTO.key;
        }
        if ((i11 & 2) != 0) {
            l11 = bonusExpirationRemainderDTO.keyValue;
        }
        if ((i11 & 4) != 0) {
            travelWidgetSettingsDTO = bonusExpirationRemainderDTO.widgetSettings;
        }
        if ((i11 & 8) != 0) {
            cellDTO = bonusExpirationRemainderDTO.cell;
        }
        if ((i11 & 16) != 0) {
            iconButtonV3DTO = bonusExpirationRemainderDTO.closeButton;
        }
        if ((i11 & 32) != 0) {
            commonControlSettings = bonusExpirationRemainderDTO.settings;
        }
        IconButtonV3DTO iconButtonV3DTO2 = iconButtonV3DTO;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        return bonusExpirationRemainderDTO.copy(str, l11, travelWidgetSettingsDTO, cellDTO, iconButtonV3DTO2, commonControlSettings2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getKeyValue() {
        return this.keyValue;
    }

    /* renamed from: component3, reason: from getter */
    public final TravelWidgetSettingsDTO getWidgetSettings() {
        return this.widgetSettings;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final CellDTO getCell() {
        return this.cell;
    }

    /* renamed from: component5, reason: from getter */
    public final IconButtonV3DTO getCloseButton() {
        return this.closeButton;
    }

    /* renamed from: component6, reason: from getter */
    public final CommonControlSettings getSettings() {
        return this.settings;
    }

    @NotNull
    public final BonusExpirationRemainderDTO copy(String key, Long keyValue, TravelWidgetSettingsDTO widgetSettings, @NotNull CellDTO cell, IconButtonV3DTO closeButton, CommonControlSettings settings) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        return new BonusExpirationRemainderDTO(key, keyValue, widgetSettings, cell, closeButton, settings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BonusExpirationRemainderDTO)) {
            return false;
        }
        BonusExpirationRemainderDTO bonusExpirationRemainderDTO = (BonusExpirationRemainderDTO) other;
        return Intrinsics.d(this.key, bonusExpirationRemainderDTO.key) && Intrinsics.d(this.keyValue, bonusExpirationRemainderDTO.keyValue) && Intrinsics.d(this.widgetSettings, bonusExpirationRemainderDTO.widgetSettings) && Intrinsics.d(this.cell, bonusExpirationRemainderDTO.cell) && Intrinsics.d(this.closeButton, bonusExpirationRemainderDTO.closeButton) && Intrinsics.d(this.settings, bonusExpirationRemainderDTO.settings);
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }

    public final IconButtonV3DTO getCloseButton() {
        return this.closeButton;
    }

    public final String getKey() {
        return this.key;
    }

    public final Long getKeyValue() {
        return this.keyValue;
    }

    public final CommonControlSettings getSettings() {
        return this.settings;
    }

    public final TravelWidgetSettingsDTO getWidgetSettings() {
        return this.widgetSettings;
    }

    public int hashCode() {
        String str = this.key;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l11 = this.keyValue;
        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        TravelWidgetSettingsDTO travelWidgetSettingsDTO = this.widgetSettings;
        int c11 = b.c(this.cell, (hashCode2 + (travelWidgetSettingsDTO == null ? 0 : travelWidgetSettingsDTO.hashCode())) * 31, 31);
        IconButtonV3DTO iconButtonV3DTO = this.closeButton;
        int hashCode3 = (c11 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.settings;
        return hashCode3 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BonusExpirationRemainderDTO(key=" + this.key + ", keyValue=" + this.keyValue + ", widgetSettings=" + this.widgetSettings + ", cell=" + this.cell + ", closeButton=" + this.closeButton + ", settings=" + this.settings + ")";
    }
}
