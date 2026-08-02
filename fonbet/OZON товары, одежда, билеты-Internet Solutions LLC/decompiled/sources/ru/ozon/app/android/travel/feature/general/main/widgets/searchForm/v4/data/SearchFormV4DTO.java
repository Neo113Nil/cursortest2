package ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.data;

import B90.C2618u;
import Bi.a;
import De.C2859b;
import G.g;
import Tl.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.iconField.IconFieldDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003@ABB\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00101\u001a\u00020\tHÆ\u0003J\t\u00102\u001a\u00020\u000bHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0017\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\t\u00107\u001a\u00020\u0014HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u009d\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020>HÖ\u0001J\t\u0010?\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u0006C"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/data/SearchFormV4DTO;", "", "locations", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/data/SearchFormV4DTO$Locations;", "dateField", "Lru/ozon/app/android/travel/molecules/dto/iconField/IconFieldDTO;", "rightField", "touristField", "searchButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "backgroundColor", "", "leftPatchColor", "rightPatchColor", "toggleCell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "asyncFetchConfig", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/data/SearchFormV4DTO$AsyncFetchConfig;", "<init>", "(Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/data/SearchFormV4DTO$Locations;Lru/ozon/app/android/travel/molecules/dto/iconField/IconFieldDTO;Lru/ozon/app/android/travel/molecules/dto/iconField/IconFieldDTO;Lru/ozon/app/android/travel/molecules/dto/iconField/IconFieldDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/data/SearchFormV4DTO$AsyncFetchConfig;)V", "getLocations", "()Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/data/SearchFormV4DTO$Locations;", "getDateField", "()Lru/ozon/app/android/travel/molecules/dto/iconField/IconFieldDTO;", "getRightField", "getTouristField", "getSearchButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getBackgroundColor", "()Ljava/lang/String;", "getLeftPatchColor", "getRightPatchColor", "getToggleCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getAsyncFetchConfig", "()Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/data/SearchFormV4DTO$AsyncFetchConfig;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "", "toString", "Locations", "TextField", "AsyncFetchConfig", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SearchFormV4DTO {
    public static final int $stable = 8;
    private final AsyncFetchConfig asyncFetchConfig;

    @NotNull
    private final String backgroundColor;

    @EnumNullFallback
    @NotNull
    private final CornerRadius cornerRadius;
    private final IconFieldDTO dateField;
    private final String leftPatchColor;

    @NotNull
    private final Locations locations;
    private final IconFieldDTO rightField;
    private final String rightPatchColor;

    @NotNull
    private final ButtonV3DTO searchButton;
    private final CellDTO toggleCell;
    private final IconFieldDTO touristField;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0017\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/data/SearchFormV4DTO$AsyncFetchConfig;", "", "delay", "", "asyncSwapParams", "", "", "<init>", "(Ljava/lang/Integer;Ljava/util/Map;)V", "getDelay", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAsyncSwapParams", "()Ljava/util/Map;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/util/Map;)Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/data/SearchFormV4DTO$AsyncFetchConfig;", "equals", "", "other", "hashCode", "toString", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AsyncFetchConfig {
        public static final int $stable = 8;
        private final Map<String, String> asyncSwapParams;
        private final Integer delay;

        public AsyncFetchConfig(Integer num, Map<String, String> map) {
            this.delay = num;
            this.asyncSwapParams = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AsyncFetchConfig copy$default(AsyncFetchConfig asyncFetchConfig, Integer num, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                num = asyncFetchConfig.delay;
            }
            if ((i11 & 2) != 0) {
                map = asyncFetchConfig.asyncSwapParams;
            }
            return asyncFetchConfig.copy(num, map);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getDelay() {
            return this.delay;
        }

        public final Map<String, String> component2() {
            return this.asyncSwapParams;
        }

        @NotNull
        public final AsyncFetchConfig copy(Integer delay, Map<String, String> asyncSwapParams) {
            return new AsyncFetchConfig(delay, asyncSwapParams);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AsyncFetchConfig)) {
                return false;
            }
            AsyncFetchConfig asyncFetchConfig = (AsyncFetchConfig) other;
            return Intrinsics.d(this.delay, asyncFetchConfig.delay) && Intrinsics.d(this.asyncSwapParams, asyncFetchConfig.asyncSwapParams);
        }

        public final Map<String, String> getAsyncSwapParams() {
            return this.asyncSwapParams;
        }

        public final Integer getDelay() {
            return this.delay;
        }

        public int hashCode() {
            Integer num = this.delay;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Map<String, String> map = this.asyncSwapParams;
            return hashCode + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "AsyncFetchConfig(delay=" + this.delay + ", asyncSwapParams=" + this.asyncSwapParams + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/data/SearchFormV4DTO$TextField;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "commonControlSettings", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "destinations", "", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/util/List;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCommonControlSettings", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getDestinations", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextField {
        public static final int $stable = 8;

        @NotNull
        private final CommonControlSettings commonControlSettings;
        private final List<TextDTO> destinations;

        @NotNull
        private final TextDTO text;

        public TextField(@NotNull TextDTO text, @NotNull CommonControlSettings commonControlSettings, List<TextDTO> list) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(commonControlSettings, "commonControlSettings");
            this.text = text;
            this.commonControlSettings = commonControlSettings;
            this.destinations = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TextField copy$default(TextField textField, TextDTO textDTO, CommonControlSettings commonControlSettings, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = textField.text;
            }
            if ((i11 & 2) != 0) {
                commonControlSettings = textField.commonControlSettings;
            }
            if ((i11 & 4) != 0) {
                list = textField.destinations;
            }
            return textField.copy(textDTO, commonControlSettings, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final CommonControlSettings getCommonControlSettings() {
            return this.commonControlSettings;
        }

        public final List<TextDTO> component3() {
            return this.destinations;
        }

        @NotNull
        public final TextField copy(@NotNull TextDTO text, @NotNull CommonControlSettings commonControlSettings, List<TextDTO> destinations) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(commonControlSettings, "commonControlSettings");
            return new TextField(text, commonControlSettings, destinations);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextField)) {
                return false;
            }
            TextField textField = (TextField) other;
            return Intrinsics.d(this.text, textField.text) && Intrinsics.d(this.commonControlSettings, textField.commonControlSettings) && Intrinsics.d(this.destinations, textField.destinations);
        }

        @NotNull
        public final CommonControlSettings getCommonControlSettings() {
            return this.commonControlSettings;
        }

        public final List<TextDTO> getDestinations() {
            return this.destinations;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            int a11 = a.a(this.commonControlSettings, this.text.hashCode() * 31, 31);
            List<TextDTO> list = this.destinations;
            return a11 + (list == null ? 0 : list.hashCode());
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.text;
            CommonControlSettings commonControlSettings = this.commonControlSettings;
            List<TextDTO> list = this.destinations;
            StringBuilder sb2 = new StringBuilder("TextField(text=");
            sb2.append(textDTO);
            sb2.append(", commonControlSettings=");
            sb2.append(commonControlSettings);
            sb2.append(", destinations=");
            return C2618u.h(sb2, list, ")");
        }
    }

    public SearchFormV4DTO(@NotNull Locations locations, IconFieldDTO iconFieldDTO, IconFieldDTO iconFieldDTO2, IconFieldDTO iconFieldDTO3, @NotNull ButtonV3DTO searchButton, @NotNull String backgroundColor, String str, String str2, CellDTO cellDTO, Map<String, TokenizedTrackingInfo> map, @NotNull CornerRadius cornerRadius, AsyncFetchConfig asyncFetchConfig) {
        Intrinsics.checkNotNullParameter(locations, "locations");
        Intrinsics.checkNotNullParameter(searchButton, "searchButton");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        this.locations = locations;
        this.dateField = iconFieldDTO;
        this.rightField = iconFieldDTO2;
        this.touristField = iconFieldDTO3;
        this.searchButton = searchButton;
        this.backgroundColor = backgroundColor;
        this.leftPatchColor = str;
        this.rightPatchColor = str2;
        this.toggleCell = cellDTO;
        this.trackingInfo = map;
        this.cornerRadius = cornerRadius;
        this.asyncFetchConfig = asyncFetchConfig;
    }

    public static /* synthetic */ SearchFormV4DTO copy$default(SearchFormV4DTO searchFormV4DTO, Locations locations, IconFieldDTO iconFieldDTO, IconFieldDTO iconFieldDTO2, IconFieldDTO iconFieldDTO3, ButtonV3DTO buttonV3DTO, String str, String str2, String str3, CellDTO cellDTO, Map map, CornerRadius cornerRadius, AsyncFetchConfig asyncFetchConfig, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            locations = searchFormV4DTO.locations;
        }
        if ((i11 & 2) != 0) {
            iconFieldDTO = searchFormV4DTO.dateField;
        }
        if ((i11 & 4) != 0) {
            iconFieldDTO2 = searchFormV4DTO.rightField;
        }
        if ((i11 & 8) != 0) {
            iconFieldDTO3 = searchFormV4DTO.touristField;
        }
        if ((i11 & 16) != 0) {
            buttonV3DTO = searchFormV4DTO.searchButton;
        }
        if ((i11 & 32) != 0) {
            str = searchFormV4DTO.backgroundColor;
        }
        if ((i11 & 64) != 0) {
            str2 = searchFormV4DTO.leftPatchColor;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str3 = searchFormV4DTO.rightPatchColor;
        }
        if ((i11 & 256) != 0) {
            cellDTO = searchFormV4DTO.toggleCell;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            map = searchFormV4DTO.trackingInfo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            cornerRadius = searchFormV4DTO.cornerRadius;
        }
        if ((i11 & 2048) != 0) {
            asyncFetchConfig = searchFormV4DTO.asyncFetchConfig;
        }
        CornerRadius cornerRadius2 = cornerRadius;
        AsyncFetchConfig asyncFetchConfig2 = asyncFetchConfig;
        CellDTO cellDTO2 = cellDTO;
        Map map2 = map;
        String str4 = str2;
        String str5 = str3;
        ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
        String str6 = str;
        return searchFormV4DTO.copy(locations, iconFieldDTO, iconFieldDTO2, iconFieldDTO3, buttonV3DTO2, str6, str4, str5, cellDTO2, map2, cornerRadius2, asyncFetchConfig2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Locations getLocations() {
        return this.locations;
    }

    public final Map<String, TokenizedTrackingInfo> component10() {
        return this.trackingInfo;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: component12, reason: from getter */
    public final AsyncFetchConfig getAsyncFetchConfig() {
        return this.asyncFetchConfig;
    }

    /* renamed from: component2, reason: from getter */
    public final IconFieldDTO getDateField() {
        return this.dateField;
    }

    /* renamed from: component3, reason: from getter */
    public final IconFieldDTO getRightField() {
        return this.rightField;
    }

    /* renamed from: component4, reason: from getter */
    public final IconFieldDTO getTouristField() {
        return this.touristField;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final ButtonV3DTO getSearchButton() {
        return this.searchButton;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component7, reason: from getter */
    public final String getLeftPatchColor() {
        return this.leftPatchColor;
    }

    /* renamed from: component8, reason: from getter */
    public final String getRightPatchColor() {
        return this.rightPatchColor;
    }

    /* renamed from: component9, reason: from getter */
    public final CellDTO getToggleCell() {
        return this.toggleCell;
    }

    @NotNull
    public final SearchFormV4DTO copy(@NotNull Locations locations, IconFieldDTO dateField, IconFieldDTO rightField, IconFieldDTO touristField, @NotNull ButtonV3DTO searchButton, @NotNull String backgroundColor, String leftPatchColor, String rightPatchColor, CellDTO toggleCell, Map<String, TokenizedTrackingInfo> trackingInfo, @NotNull CornerRadius cornerRadius, AsyncFetchConfig asyncFetchConfig) {
        Intrinsics.checkNotNullParameter(locations, "locations");
        Intrinsics.checkNotNullParameter(searchButton, "searchButton");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        return new SearchFormV4DTO(locations, dateField, rightField, touristField, searchButton, backgroundColor, leftPatchColor, rightPatchColor, toggleCell, trackingInfo, cornerRadius, asyncFetchConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchFormV4DTO)) {
            return false;
        }
        SearchFormV4DTO searchFormV4DTO = (SearchFormV4DTO) other;
        return Intrinsics.d(this.locations, searchFormV4DTO.locations) && Intrinsics.d(this.dateField, searchFormV4DTO.dateField) && Intrinsics.d(this.rightField, searchFormV4DTO.rightField) && Intrinsics.d(this.touristField, searchFormV4DTO.touristField) && Intrinsics.d(this.searchButton, searchFormV4DTO.searchButton) && Intrinsics.d(this.backgroundColor, searchFormV4DTO.backgroundColor) && Intrinsics.d(this.leftPatchColor, searchFormV4DTO.leftPatchColor) && Intrinsics.d(this.rightPatchColor, searchFormV4DTO.rightPatchColor) && Intrinsics.d(this.toggleCell, searchFormV4DTO.toggleCell) && Intrinsics.d(this.trackingInfo, searchFormV4DTO.trackingInfo) && this.cornerRadius == searchFormV4DTO.cornerRadius && Intrinsics.d(this.asyncFetchConfig, searchFormV4DTO.asyncFetchConfig);
    }

    public final AsyncFetchConfig getAsyncFetchConfig() {
        return this.asyncFetchConfig;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    public final IconFieldDTO getDateField() {
        return this.dateField;
    }

    public final String getLeftPatchColor() {
        return this.leftPatchColor;
    }

    @NotNull
    public final Locations getLocations() {
        return this.locations;
    }

    public final IconFieldDTO getRightField() {
        return this.rightField;
    }

    public final String getRightPatchColor() {
        return this.rightPatchColor;
    }

    @NotNull
    public final ButtonV3DTO getSearchButton() {
        return this.searchButton;
    }

    public final CellDTO getToggleCell() {
        return this.toggleCell;
    }

    public final IconFieldDTO getTouristField() {
        return this.touristField;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.locations.hashCode() * 31;
        IconFieldDTO iconFieldDTO = this.dateField;
        int hashCode2 = (hashCode + (iconFieldDTO == null ? 0 : iconFieldDTO.hashCode())) * 31;
        IconFieldDTO iconFieldDTO2 = this.rightField;
        int hashCode3 = (hashCode2 + (iconFieldDTO2 == null ? 0 : iconFieldDTO2.hashCode())) * 31;
        IconFieldDTO iconFieldDTO3 = this.touristField;
        int a11 = g.a(C2859b.c(this.searchButton, (hashCode3 + (iconFieldDTO3 == null ? 0 : iconFieldDTO3.hashCode())) * 31, 31), 31, this.backgroundColor);
        String str = this.leftPatchColor;
        int hashCode4 = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.rightPatchColor;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CellDTO cellDTO = this.toggleCell;
        int hashCode6 = (hashCode5 + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int b11 = b.b(this.cornerRadius, (hashCode6 + (map == null ? 0 : map.hashCode())) * 31, 31);
        AsyncFetchConfig asyncFetchConfig = this.asyncFetchConfig;
        return b11 + (asyncFetchConfig != null ? asyncFetchConfig.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Locations locations = this.locations;
        IconFieldDTO iconFieldDTO = this.dateField;
        IconFieldDTO iconFieldDTO2 = this.rightField;
        IconFieldDTO iconFieldDTO3 = this.touristField;
        ButtonV3DTO buttonV3DTO = this.searchButton;
        String str = this.backgroundColor;
        String str2 = this.leftPatchColor;
        String str3 = this.rightPatchColor;
        CellDTO cellDTO = this.toggleCell;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        CornerRadius cornerRadius = this.cornerRadius;
        AsyncFetchConfig asyncFetchConfig = this.asyncFetchConfig;
        StringBuilder sb2 = new StringBuilder("SearchFormV4DTO(locations=");
        sb2.append(locations);
        sb2.append(", dateField=");
        sb2.append(iconFieldDTO);
        sb2.append(", rightField=");
        sb2.append(iconFieldDTO2);
        sb2.append(", touristField=");
        sb2.append(iconFieldDTO3);
        sb2.append(", searchButton=");
        sb2.append(buttonV3DTO);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", leftPatchColor=");
        Nh.a.h(sb2, str2, ", rightPatchColor=", str3, ", toggleCell=");
        sb2.append(cellDTO);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", cornerRadius=");
        sb2.append(cornerRadius);
        sb2.append(", asyncFetchConfig=");
        sb2.append(asyncFetchConfig);
        sb2.append(")");
        return sb2.toString();
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JK\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/data/SearchFormV4DTO$Locations;", "", "topLocation", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/data/SearchFormV4DTO$TextField;", "bottomLocation", "backgroundColor", "", "swapButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "separatorColor", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "<init>", "(Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/data/SearchFormV4DTO$TextField;Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/data/SearchFormV4DTO$TextField;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "getTopLocation", "()Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/data/SearchFormV4DTO$TextField;", "getBottomLocation", "getBackgroundColor", "()Ljava/lang/String;", "getSwapButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getSeparatorColor", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Locations {
        public static final int $stable = 8;

        @NotNull
        private final String backgroundColor;
        private final TextField bottomLocation;

        @EnumNullFallback
        @NotNull
        private final CornerRadius cornerRadius;
        private final String separatorColor;
        private final IconButtonV3DTO swapButton;

        @NotNull
        private final TextField topLocation;

        public Locations(@NotNull TextField topLocation, TextField textField, @NotNull String backgroundColor, IconButtonV3DTO iconButtonV3DTO, String str, @NotNull CornerRadius cornerRadius) {
            Intrinsics.checkNotNullParameter(topLocation, "topLocation");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
            this.topLocation = topLocation;
            this.bottomLocation = textField;
            this.backgroundColor = backgroundColor;
            this.swapButton = iconButtonV3DTO;
            this.separatorColor = str;
            this.cornerRadius = cornerRadius;
        }

        public static /* synthetic */ Locations copy$default(Locations locations, TextField textField, TextField textField2, String str, IconButtonV3DTO iconButtonV3DTO, String str2, CornerRadius cornerRadius, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textField = locations.topLocation;
            }
            if ((i11 & 2) != 0) {
                textField2 = locations.bottomLocation;
            }
            if ((i11 & 4) != 0) {
                str = locations.backgroundColor;
            }
            if ((i11 & 8) != 0) {
                iconButtonV3DTO = locations.swapButton;
            }
            if ((i11 & 16) != 0) {
                str2 = locations.separatorColor;
            }
            if ((i11 & 32) != 0) {
                cornerRadius = locations.cornerRadius;
            }
            String str3 = str2;
            CornerRadius cornerRadius2 = cornerRadius;
            return locations.copy(textField, textField2, str, iconButtonV3DTO, str3, cornerRadius2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextField getTopLocation() {
            return this.topLocation;
        }

        /* renamed from: component2, reason: from getter */
        public final TextField getBottomLocation() {
            return this.bottomLocation;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component4, reason: from getter */
        public final IconButtonV3DTO getSwapButton() {
            return this.swapButton;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSeparatorColor() {
            return this.separatorColor;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        @NotNull
        public final Locations copy(@NotNull TextField topLocation, TextField bottomLocation, @NotNull String backgroundColor, IconButtonV3DTO swapButton, String separatorColor, @NotNull CornerRadius cornerRadius) {
            Intrinsics.checkNotNullParameter(topLocation, "topLocation");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
            return new Locations(topLocation, bottomLocation, backgroundColor, swapButton, separatorColor, cornerRadius);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Locations)) {
                return false;
            }
            Locations locations = (Locations) other;
            return Intrinsics.d(this.topLocation, locations.topLocation) && Intrinsics.d(this.bottomLocation, locations.bottomLocation) && Intrinsics.d(this.backgroundColor, locations.backgroundColor) && Intrinsics.d(this.swapButton, locations.swapButton) && Intrinsics.d(this.separatorColor, locations.separatorColor) && this.cornerRadius == locations.cornerRadius;
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final TextField getBottomLocation() {
            return this.bottomLocation;
        }

        @NotNull
        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        public final String getSeparatorColor() {
            return this.separatorColor;
        }

        public final IconButtonV3DTO getSwapButton() {
            return this.swapButton;
        }

        @NotNull
        public final TextField getTopLocation() {
            return this.topLocation;
        }

        public int hashCode() {
            int hashCode = this.topLocation.hashCode() * 31;
            TextField textField = this.bottomLocation;
            int a11 = g.a((hashCode + (textField == null ? 0 : textField.hashCode())) * 31, 31, this.backgroundColor);
            IconButtonV3DTO iconButtonV3DTO = this.swapButton;
            int hashCode2 = (a11 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
            String str = this.separatorColor;
            return this.cornerRadius.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            return "Locations(topLocation=" + this.topLocation + ", bottomLocation=" + this.bottomLocation + ", backgroundColor=" + this.backgroundColor + ", swapButton=" + this.swapButton + ", separatorColor=" + this.separatorColor + ", cornerRadius=" + this.cornerRadius + ")";
        }

        public /* synthetic */ Locations(TextField textField, TextField textField2, String str, IconButtonV3DTO iconButtonV3DTO, String str2, CornerRadius cornerRadius, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(textField, textField2, str, iconButtonV3DTO, str2, (i11 & 32) != 0 ? CornerRadius.NO_RADIUS : cornerRadius);
        }
    }

    public /* synthetic */ SearchFormV4DTO(Locations locations, IconFieldDTO iconFieldDTO, IconFieldDTO iconFieldDTO2, IconFieldDTO iconFieldDTO3, ButtonV3DTO buttonV3DTO, String str, String str2, String str3, CellDTO cellDTO, Map map, CornerRadius cornerRadius, AsyncFetchConfig asyncFetchConfig, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(locations, iconFieldDTO, iconFieldDTO2, iconFieldDTO3, buttonV3DTO, str, str2, str3, cellDTO, map, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? CornerRadius.NO_RADIUS : cornerRadius, asyncFetchConfig);
    }
}
