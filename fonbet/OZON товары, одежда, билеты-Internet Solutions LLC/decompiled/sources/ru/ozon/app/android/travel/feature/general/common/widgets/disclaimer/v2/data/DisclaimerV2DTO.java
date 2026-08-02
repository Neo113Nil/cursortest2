package ru.ozon.app.android.travel.feature.general.common.widgets.disclaimer.v2.data;

import B3.p;
import C.o0;
import Lh.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/disclaimer/v2/data/DisclaimerV2DTO;", "", "disclaimerContent", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "settings", "Lru/ozon/app/android/travel/feature/general/common/widgets/disclaimer/v2/data/DisclaimerV2DTO$Settings;", "<init>", "(Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;Lru/ozon/app/android/travel/feature/general/common/widgets/disclaimer/v2/data/DisclaimerV2DTO$Settings;)V", "getDisclaimerContent", "()Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "getSettings", "()Lru/ozon/app/android/travel/feature/general/common/widgets/disclaimer/v2/data/DisclaimerV2DTO$Settings;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Settings", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DisclaimerV2DTO {
    public static final int $stable = DisclaimerDTO.$stable;

    @NotNull
    private final DisclaimerDTO disclaimerContent;
    private final Settings settings;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\bHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/disclaimer/v2/data/DisclaimerV2DTO$Settings;", "", "topPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "bottomPadding", "leftPadding", "rightPadding", "backgroundColor", "", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Ljava/lang/String;)V", "getTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottomPadding", "getLeftPadding", "getRightPadding", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Settings {
        public static final int $stable = 0;
        private final String backgroundColor;

        @EnumNullFallback
        private final Paddings bottomPadding;

        @EnumNullFallback
        private final Paddings leftPadding;

        @EnumNullFallback
        private final Paddings rightPadding;

        @EnumNullFallback
        private final Paddings topPadding;

        public Settings(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, String str) {
            this.topPadding = paddings;
            this.bottomPadding = paddings2;
            this.leftPadding = paddings3;
            this.rightPadding = paddings4;
            this.backgroundColor = str;
        }

        public static /* synthetic */ Settings copy$default(Settings settings, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, String str, int i11, Object obj) {
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
                str = settings.backgroundColor;
            }
            String str2 = str;
            Paddings paddings5 = paddings3;
            return settings.copy(paddings, paddings2, paddings5, paddings4, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final Paddings getTopPadding() {
            return this.topPadding;
        }

        /* renamed from: component2, reason: from getter */
        public final Paddings getBottomPadding() {
            return this.bottomPadding;
        }

        /* renamed from: component3, reason: from getter */
        public final Paddings getLeftPadding() {
            return this.leftPadding;
        }

        /* renamed from: component4, reason: from getter */
        public final Paddings getRightPadding() {
            return this.rightPadding;
        }

        /* renamed from: component5, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final Settings copy(Paddings topPadding, Paddings bottomPadding, Paddings leftPadding, Paddings rightPadding, String backgroundColor) {
            return new Settings(topPadding, bottomPadding, leftPadding, rightPadding, backgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Settings)) {
                return false;
            }
            Settings settings = (Settings) other;
            return this.topPadding == settings.topPadding && this.bottomPadding == settings.bottomPadding && this.leftPadding == settings.leftPadding && this.rightPadding == settings.rightPadding && Intrinsics.d(this.backgroundColor, settings.backgroundColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final Paddings getBottomPadding() {
            return this.bottomPadding;
        }

        public final Paddings getLeftPadding() {
            return this.leftPadding;
        }

        public final Paddings getRightPadding() {
            return this.rightPadding;
        }

        public final Paddings getTopPadding() {
            return this.topPadding;
        }

        public int hashCode() {
            Paddings paddings = this.topPadding;
            int hashCode = (paddings == null ? 0 : paddings.hashCode()) * 31;
            Paddings paddings2 = this.bottomPadding;
            int hashCode2 = (hashCode + (paddings2 == null ? 0 : paddings2.hashCode())) * 31;
            Paddings paddings3 = this.leftPadding;
            int hashCode3 = (hashCode2 + (paddings3 == null ? 0 : paddings3.hashCode())) * 31;
            Paddings paddings4 = this.rightPadding;
            int hashCode4 = (hashCode3 + (paddings4 == null ? 0 : paddings4.hashCode())) * 31;
            String str = this.backgroundColor;
            return hashCode4 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.topPadding;
            Paddings paddings2 = this.bottomPadding;
            Paddings paddings3 = this.leftPadding;
            Paddings paddings4 = this.rightPadding;
            String str = this.backgroundColor;
            StringBuilder b11 = p.b("Settings(topPadding=", paddings, ", bottomPadding=", paddings2, ", leftPadding=");
            a.e(b11, paddings3, ", rightPadding=", paddings4, ", backgroundColor=");
            return o0.c(b11, str, ")");
        }
    }

    public DisclaimerV2DTO(@NotNull DisclaimerDTO disclaimerContent, Settings settings) {
        Intrinsics.checkNotNullParameter(disclaimerContent, "disclaimerContent");
        this.disclaimerContent = disclaimerContent;
        this.settings = settings;
    }

    public static /* synthetic */ DisclaimerV2DTO copy$default(DisclaimerV2DTO disclaimerV2DTO, DisclaimerDTO disclaimerDTO, Settings settings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            disclaimerDTO = disclaimerV2DTO.disclaimerContent;
        }
        if ((i11 & 2) != 0) {
            settings = disclaimerV2DTO.settings;
        }
        return disclaimerV2DTO.copy(disclaimerDTO, settings);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final DisclaimerDTO getDisclaimerContent() {
        return this.disclaimerContent;
    }

    /* renamed from: component2, reason: from getter */
    public final Settings getSettings() {
        return this.settings;
    }

    @NotNull
    public final DisclaimerV2DTO copy(@NotNull DisclaimerDTO disclaimerContent, Settings settings) {
        Intrinsics.checkNotNullParameter(disclaimerContent, "disclaimerContent");
        return new DisclaimerV2DTO(disclaimerContent, settings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisclaimerV2DTO)) {
            return false;
        }
        DisclaimerV2DTO disclaimerV2DTO = (DisclaimerV2DTO) other;
        return Intrinsics.d(this.disclaimerContent, disclaimerV2DTO.disclaimerContent) && Intrinsics.d(this.settings, disclaimerV2DTO.settings);
    }

    @NotNull
    public final DisclaimerDTO getDisclaimerContent() {
        return this.disclaimerContent;
    }

    public final Settings getSettings() {
        return this.settings;
    }

    public int hashCode() {
        int hashCode = this.disclaimerContent.hashCode() * 31;
        Settings settings = this.settings;
        return hashCode + (settings == null ? 0 : settings.hashCode());
    }

    @NotNull
    public String toString() {
        return "DisclaimerV2DTO(disclaimerContent=" + this.disclaimerContent + ", settings=" + this.settings + ")";
    }
}
