package ru.ozon.app.android.travel.molecules.dto.priceCard;

import B3.p;
import Fm.C3051a;
import GR.b;
import Lh.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001)BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003JO\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/priceCard/PriceCardDTO;", "", "settings", "Lru/ozon/app/android/travel/molecules/dto/priceCard/PriceCardDTO$Settings;", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "subtitle", "Lru/ozon/uni/atoms/data/text/TextDTO;", "backgroundColor", "", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "commonControlSettings", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/app/android/travel/molecules/dto/priceCard/PriceCardDTO$Settings;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getSettings", "()Lru/ozon/app/android/travel/molecules/dto/priceCard/PriceCardDTO$Settings;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getSubtitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getCommonControlSettings", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Settings", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PriceCardDTO {
    private final String backgroundColor;
    private final CommonControlSettings commonControlSettings;
    private final IconDTO icon;

    @NotNull
    private final PriceDTO price;
    private final Settings settings;
    private final TextDTO subtitle;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/priceCard/PriceCardDTO$Settings;", "", "topPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "bottomPadding", "leftPadding", "rightPadding", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "getTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottomPadding", "getLeftPadding", "getRightPadding", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Settings {

        @EnumNullFallback
        @NotNull
        private final Paddings bottomPadding;

        @EnumNullFallback
        @NotNull
        private final CornerRadius cornerRadius;

        @EnumNullFallback
        @NotNull
        private final Paddings leftPadding;

        @EnumNullFallback
        @NotNull
        private final Paddings rightPadding;

        @EnumNullFallback
        @NotNull
        private final Paddings topPadding;

        public Settings() {
            this(null, null, null, null, null, 31, null);
        }

        public static /* synthetic */ Settings copy$default(Settings settings, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, CornerRadius cornerRadius, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = settings.topPadding;
            }
            if ((i11 & 2) != 0) {
                paddings2 = settings.bottomPadding;
            }
            if ((i11 & 4) != 0) {
                paddings3 = settings.leftPadding;
            }
            if ((i11 & 8) != 0) {
                paddings4 = settings.rightPadding;
            }
            if ((i11 & 16) != 0) {
                cornerRadius = settings.cornerRadius;
            }
            CornerRadius cornerRadius2 = cornerRadius;
            Paddings paddings5 = paddings3;
            return settings.copy(paddings, paddings2, paddings5, paddings4, cornerRadius2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Paddings getTopPadding() {
            return this.topPadding;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Paddings getBottomPadding() {
            return this.bottomPadding;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Paddings getLeftPadding() {
            return this.leftPadding;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final Paddings getRightPadding() {
            return this.rightPadding;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        @NotNull
        public final Settings copy(@NotNull Paddings topPadding, @NotNull Paddings bottomPadding, @NotNull Paddings leftPadding, @NotNull Paddings rightPadding, @NotNull CornerRadius cornerRadius) {
            Intrinsics.checkNotNullParameter(topPadding, "topPadding");
            Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
            Intrinsics.checkNotNullParameter(leftPadding, "leftPadding");
            Intrinsics.checkNotNullParameter(rightPadding, "rightPadding");
            Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
            return new Settings(topPadding, bottomPadding, leftPadding, rightPadding, cornerRadius);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Settings)) {
                return false;
            }
            Settings settings = (Settings) other;
            return this.topPadding == settings.topPadding && this.bottomPadding == settings.bottomPadding && this.leftPadding == settings.leftPadding && this.rightPadding == settings.rightPadding && this.cornerRadius == settings.cornerRadius;
        }

        @NotNull
        public final Paddings getBottomPadding() {
            return this.bottomPadding;
        }

        @NotNull
        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        @NotNull
        public final Paddings getLeftPadding() {
            return this.leftPadding;
        }

        @NotNull
        public final Paddings getRightPadding() {
            return this.rightPadding;
        }

        @NotNull
        public final Paddings getTopPadding() {
            return this.topPadding;
        }

        public int hashCode() {
            return this.cornerRadius.hashCode() + b.b(this.rightPadding, b.b(this.leftPadding, b.b(this.bottomPadding, this.topPadding.hashCode() * 31, 31), 31), 31);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.topPadding;
            Paddings paddings2 = this.bottomPadding;
            Paddings paddings3 = this.leftPadding;
            Paddings paddings4 = this.rightPadding;
            CornerRadius cornerRadius = this.cornerRadius;
            StringBuilder b11 = p.b("Settings(topPadding=", paddings, ", bottomPadding=", paddings2, ", leftPadding=");
            a.e(b11, paddings3, ", rightPadding=", paddings4, ", cornerRadius=");
            b11.append(cornerRadius);
            b11.append(")");
            return b11.toString();
        }

        public Settings(@NotNull Paddings topPadding, @NotNull Paddings bottomPadding, @NotNull Paddings leftPadding, @NotNull Paddings rightPadding, @NotNull CornerRadius cornerRadius) {
            Intrinsics.checkNotNullParameter(topPadding, "topPadding");
            Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
            Intrinsics.checkNotNullParameter(leftPadding, "leftPadding");
            Intrinsics.checkNotNullParameter(rightPadding, "rightPadding");
            Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
            this.topPadding = topPadding;
            this.bottomPadding = bottomPadding;
            this.leftPadding = leftPadding;
            this.rightPadding = rightPadding;
            this.cornerRadius = cornerRadius;
        }

        public /* synthetic */ Settings(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, CornerRadius cornerRadius, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? Paddings.NONE : paddings, (i11 & 2) != 0 ? Paddings.NONE : paddings2, (i11 & 4) != 0 ? Paddings.NONE : paddings3, (i11 & 8) != 0 ? Paddings.NONE : paddings4, (i11 & 16) != 0 ? CornerRadius.NO_RADIUS : cornerRadius);
        }
    }

    public PriceCardDTO(Settings settings, @NotNull PriceDTO price, TextDTO textDTO, String str, IconDTO iconDTO, CommonControlSettings commonControlSettings) {
        Intrinsics.checkNotNullParameter(price, "price");
        this.settings = settings;
        this.price = price;
        this.subtitle = textDTO;
        this.backgroundColor = str;
        this.icon = iconDTO;
        this.commonControlSettings = commonControlSettings;
    }

    public static /* synthetic */ PriceCardDTO copy$default(PriceCardDTO priceCardDTO, Settings settings, PriceDTO priceDTO, TextDTO textDTO, String str, IconDTO iconDTO, CommonControlSettings commonControlSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            settings = priceCardDTO.settings;
        }
        if ((i11 & 2) != 0) {
            priceDTO = priceCardDTO.price;
        }
        if ((i11 & 4) != 0) {
            textDTO = priceCardDTO.subtitle;
        }
        if ((i11 & 8) != 0) {
            str = priceCardDTO.backgroundColor;
        }
        if ((i11 & 16) != 0) {
            iconDTO = priceCardDTO.icon;
        }
        if ((i11 & 32) != 0) {
            commonControlSettings = priceCardDTO.commonControlSettings;
        }
        IconDTO iconDTO2 = iconDTO;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        return priceCardDTO.copy(settings, priceDTO, textDTO, str, iconDTO2, commonControlSettings2);
    }

    /* renamed from: component1, reason: from getter */
    public final Settings getSettings() {
        return this.settings;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final PriceDTO getPrice() {
        return this.price;
    }

    /* renamed from: component3, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component5, reason: from getter */
    public final IconDTO getIcon() {
        return this.icon;
    }

    /* renamed from: component6, reason: from getter */
    public final CommonControlSettings getCommonControlSettings() {
        return this.commonControlSettings;
    }

    @NotNull
    public final PriceCardDTO copy(Settings settings, @NotNull PriceDTO price, TextDTO subtitle, String backgroundColor, IconDTO icon, CommonControlSettings commonControlSettings) {
        Intrinsics.checkNotNullParameter(price, "price");
        return new PriceCardDTO(settings, price, subtitle, backgroundColor, icon, commonControlSettings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceCardDTO)) {
            return false;
        }
        PriceCardDTO priceCardDTO = (PriceCardDTO) other;
        return Intrinsics.d(this.settings, priceCardDTO.settings) && Intrinsics.d(this.price, priceCardDTO.price) && Intrinsics.d(this.subtitle, priceCardDTO.subtitle) && Intrinsics.d(this.backgroundColor, priceCardDTO.backgroundColor) && Intrinsics.d(this.icon, priceCardDTO.icon) && Intrinsics.d(this.commonControlSettings, priceCardDTO.commonControlSettings);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final CommonControlSettings getCommonControlSettings() {
        return this.commonControlSettings;
    }

    public final IconDTO getIcon() {
        return this.icon;
    }

    @NotNull
    public final PriceDTO getPrice() {
        return this.price;
    }

    public final Settings getSettings() {
        return this.settings;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        Settings settings = this.settings;
        int b11 = C3051a.b(this.price, (settings == null ? 0 : settings.hashCode()) * 31, 31);
        TextDTO textDTO = this.subtitle;
        int hashCode = (b11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        IconDTO iconDTO = this.icon;
        int hashCode3 = (hashCode2 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.commonControlSettings;
        return hashCode3 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PriceCardDTO(settings=" + this.settings + ", price=" + this.price + ", subtitle=" + this.subtitle + ", backgroundColor=" + this.backgroundColor + ", icon=" + this.icon + ", commonControlSettings=" + this.commonControlSettings + ")";
    }
}
