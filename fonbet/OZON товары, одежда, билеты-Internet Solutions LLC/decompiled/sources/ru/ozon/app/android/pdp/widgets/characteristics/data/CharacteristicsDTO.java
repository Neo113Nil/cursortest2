package ru.ozon.app.android.pdp.widgets.characteristics.data;

import B90.C2619v;
import HY.a;
import J.d;
import T7.P;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002$%BI\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JU\u0010\u001d\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lru/ozon/app/android/pdp/widgets/characteristics/data/CharacteristicsDTO;", "", "characteristics", "", "Lru/ozon/app/android/pdp/widgets/characteristics/data/CharacteristicsDTO$Characteristics;", "shortHeightButton", "Lru/ozon/app/android/pdp/widgets/characteristics/data/CharacteristicsDTO$ShortHeightButton;", "tabGroupId", "", "backgroundColor", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/pdp/widgets/characteristics/data/CharacteristicsDTO$ShortHeightButton;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getCharacteristics", "()Ljava/util/List;", "getShortHeightButton", "()Lru/ozon/app/android/pdp/widgets/characteristics/data/CharacteristicsDTO$ShortHeightButton;", "getTabGroupId", "()Ljava/lang/String;", "getBackgroundColor", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Characteristics", "ShortHeightButton", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CharacteristicsDTO {
    public static final int $stable = 8;
    private final String backgroundColor;

    @NotNull
    private final List<Characteristics> characteristics;
    private final ShortHeightButton shortHeightButton;
    private final String tabGroupId;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/pdp/widgets/characteristics/data/CharacteristicsDTO$Characteristics;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "values", "", "Lru/ozon/app/android/pdp/widgets/characteristics/data/CharacteristicsDTO$Characteristics$ValuesDto;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;)V", "getHeader", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getValues", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ValuesDto", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Characteristics {
        public static final int $stable = 8;

        @NotNull
        private final TextAtom header;

        @NotNull
        private final List<ValuesDto> values;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003JM\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lru/ozon/app/android/pdp/widgets/characteristics/data/CharacteristicsDTO$Characteristics$ValuesDto;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getName", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getValue", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ValuesDto {
            public static final int $stable = 8;
            private final AtomActionDTO action;
            private final Icon icon;

            @NotNull
            private final TextAtom name;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            @NotNull
            private final TextAtom value;

            public ValuesDto(@NotNull TextAtom name, @NotNull TextAtom value, Icon icon, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(value, "value");
                this.name = name;
                this.value = value;
                this.icon = icon;
                this.action = atomActionDTO;
                this.trackingInfo = map;
            }

            public static /* synthetic */ ValuesDto copy$default(ValuesDto valuesDto, TextAtom textAtom, TextAtom textAtom2, Icon icon, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    textAtom = valuesDto.name;
                }
                if ((i11 & 2) != 0) {
                    textAtom2 = valuesDto.value;
                }
                if ((i11 & 4) != 0) {
                    icon = valuesDto.icon;
                }
                if ((i11 & 8) != 0) {
                    atomActionDTO = valuesDto.action;
                }
                if ((i11 & 16) != 0) {
                    map = valuesDto.trackingInfo;
                }
                Map map2 = map;
                Icon icon2 = icon;
                return valuesDto.copy(textAtom, textAtom2, icon2, atomActionDTO, map2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final TextAtom getName() {
                return this.name;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final TextAtom getValue() {
                return this.value;
            }

            /* renamed from: component3, reason: from getter */
            public final Icon getIcon() {
                return this.icon;
            }

            /* renamed from: component4, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final Map<String, TokenizedTrackingInfo> component5() {
                return this.trackingInfo;
            }

            @NotNull
            public final ValuesDto copy(@NotNull TextAtom name, @NotNull TextAtom value, Icon icon, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(value, "value");
                return new ValuesDto(name, value, icon, action, trackingInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ValuesDto)) {
                    return false;
                }
                ValuesDto valuesDto = (ValuesDto) other;
                return Intrinsics.d(this.name, valuesDto.name) && Intrinsics.d(this.value, valuesDto.value) && Intrinsics.d(this.icon, valuesDto.icon) && Intrinsics.d(this.action, valuesDto.action) && Intrinsics.d(this.trackingInfo, valuesDto.trackingInfo);
            }

            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final Icon getIcon() {
                return this.icon;
            }

            @NotNull
            public final TextAtom getName() {
                return this.name;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            @NotNull
            public final TextAtom getValue() {
                return this.value;
            }

            public int hashCode() {
                int b11 = C2619v.b(this.name.hashCode() * 31, 31, this.value);
                Icon icon = this.icon;
                int hashCode = (b11 + (icon == null ? 0 : icon.hashCode())) * 31;
                AtomActionDTO atomActionDTO = this.action;
                int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return hashCode2 + (map != null ? map.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                TextAtom textAtom = this.name;
                TextAtom textAtom2 = this.value;
                Icon icon = this.icon;
                AtomActionDTO atomActionDTO = this.action;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                StringBuilder a11 = a.a("ValuesDto(name=", textAtom, ", value=", textAtom2, ", icon=");
                a11.append(icon);
                a11.append(", action=");
                a11.append(atomActionDTO);
                a11.append(", trackingInfo=");
                return P.f(a11, map, ")");
            }
        }

        public Characteristics(@NotNull TextAtom header, @NotNull List<ValuesDto> values) {
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(values, "values");
            this.header = header;
            this.values = values;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Characteristics copy$default(Characteristics characteristics, TextAtom textAtom, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = characteristics.header;
            }
            if ((i11 & 2) != 0) {
                list = characteristics.values;
            }
            return characteristics.copy(textAtom, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getHeader() {
            return this.header;
        }

        @NotNull
        public final List<ValuesDto> component2() {
            return this.values;
        }

        @NotNull
        public final Characteristics copy(@NotNull TextAtom header, @NotNull List<ValuesDto> values) {
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(values, "values");
            return new Characteristics(header, values);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Characteristics)) {
                return false;
            }
            Characteristics characteristics = (Characteristics) other;
            return Intrinsics.d(this.header, characteristics.header) && Intrinsics.d(this.values, characteristics.values);
        }

        @NotNull
        public final TextAtom getHeader() {
            return this.header;
        }

        @NotNull
        public final List<ValuesDto> getValues() {
            return this.values;
        }

        public int hashCode() {
            return this.values.hashCode() + (this.header.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return d.c("Characteristics(header=", this.header, ", values=", this.values, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003J?\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lru/ozon/app/android/pdp/widgets/characteristics/data/CharacteristicsDTO$ShortHeightButton;", "", "characteristicsLimit", "", "text", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(ILru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/Icon;Ljava/util/Map;)V", "getCharacteristicsLimit", "()I", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShortHeightButton {
        public static final int $stable = 8;
        private final int characteristicsLimit;

        @NotNull
        private final Icon icon;

        @NotNull
        private final TextAtom text;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public ShortHeightButton(int i11, @NotNull TextAtom text, @NotNull Icon icon, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.characteristicsLimit = i11;
            this.text = text;
            this.icon = icon;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ShortHeightButton copy$default(ShortHeightButton shortHeightButton, int i11, TextAtom textAtom, Icon icon, Map map, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = shortHeightButton.characteristicsLimit;
            }
            if ((i12 & 2) != 0) {
                textAtom = shortHeightButton.text;
            }
            if ((i12 & 4) != 0) {
                icon = shortHeightButton.icon;
            }
            if ((i12 & 8) != 0) {
                map = shortHeightButton.trackingInfo;
            }
            return shortHeightButton.copy(i11, textAtom, icon, map);
        }

        /* renamed from: component1, reason: from getter */
        public final int getCharacteristicsLimit() {
            return this.characteristicsLimit;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Icon getIcon() {
            return this.icon;
        }

        public final Map<String, TokenizedTrackingInfo> component4() {
            return this.trackingInfo;
        }

        @NotNull
        public final ShortHeightButton copy(int characteristicsLimit, @NotNull TextAtom text, @NotNull Icon icon, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new ShortHeightButton(characteristicsLimit, text, icon, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShortHeightButton)) {
                return false;
            }
            ShortHeightButton shortHeightButton = (ShortHeightButton) other;
            return this.characteristicsLimit == shortHeightButton.characteristicsLimit && Intrinsics.d(this.text, shortHeightButton.text) && Intrinsics.d(this.icon, shortHeightButton.icon) && Intrinsics.d(this.trackingInfo, shortHeightButton.trackingInfo);
        }

        public final int getCharacteristicsLimit() {
            return this.characteristicsLimit;
        }

        @NotNull
        public final Icon getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextAtom getText() {
            return this.text;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = Lc.a.a(this.icon, C2619v.b(Integer.hashCode(this.characteristicsLimit) * 31, 31, this.text), 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return a11 + (map == null ? 0 : map.hashCode());
        }

        @NotNull
        public String toString() {
            return "ShortHeightButton(characteristicsLimit=" + this.characteristicsLimit + ", text=" + this.text + ", icon=" + this.icon + ", trackingInfo=" + this.trackingInfo + ")";
        }
    }

    public CharacteristicsDTO(@NotNull List<Characteristics> characteristics, ShortHeightButton shortHeightButton, String str, String str2, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(characteristics, "characteristics");
        this.characteristics = characteristics;
        this.shortHeightButton = shortHeightButton;
        this.tabGroupId = str;
        this.backgroundColor = str2;
        this.trackingInfo = map;
    }

    public static /* synthetic */ CharacteristicsDTO copy$default(CharacteristicsDTO characteristicsDTO, List list, ShortHeightButton shortHeightButton, String str, String str2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = characteristicsDTO.characteristics;
        }
        if ((i11 & 2) != 0) {
            shortHeightButton = characteristicsDTO.shortHeightButton;
        }
        if ((i11 & 4) != 0) {
            str = characteristicsDTO.tabGroupId;
        }
        if ((i11 & 8) != 0) {
            str2 = characteristicsDTO.backgroundColor;
        }
        if ((i11 & 16) != 0) {
            map = characteristicsDTO.trackingInfo;
        }
        Map map2 = map;
        String str3 = str;
        return characteristicsDTO.copy(list, shortHeightButton, str3, str2, map2);
    }

    @NotNull
    public final List<Characteristics> component1() {
        return this.characteristics;
    }

    /* renamed from: component2, reason: from getter */
    public final ShortHeightButton getShortHeightButton() {
        return this.shortHeightButton;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTabGroupId() {
        return this.tabGroupId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final CharacteristicsDTO copy(@NotNull List<Characteristics> characteristics, ShortHeightButton shortHeightButton, String tabGroupId, String backgroundColor, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(characteristics, "characteristics");
        return new CharacteristicsDTO(characteristics, shortHeightButton, tabGroupId, backgroundColor, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CharacteristicsDTO)) {
            return false;
        }
        CharacteristicsDTO characteristicsDTO = (CharacteristicsDTO) other;
        return Intrinsics.d(this.characteristics, characteristicsDTO.characteristics) && Intrinsics.d(this.shortHeightButton, characteristicsDTO.shortHeightButton) && Intrinsics.d(this.tabGroupId, characteristicsDTO.tabGroupId) && Intrinsics.d(this.backgroundColor, characteristicsDTO.backgroundColor) && Intrinsics.d(this.trackingInfo, characteristicsDTO.trackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<Characteristics> getCharacteristics() {
        return this.characteristics;
    }

    public final ShortHeightButton getShortHeightButton() {
        return this.shortHeightButton;
    }

    public final String getTabGroupId() {
        return this.tabGroupId;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.characteristics.hashCode() * 31;
        ShortHeightButton shortHeightButton = this.shortHeightButton;
        int hashCode2 = (hashCode + (shortHeightButton == null ? 0 : shortHeightButton.hashCode())) * 31;
        String str = this.tabGroupId;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundColor;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<Characteristics> list = this.characteristics;
        ShortHeightButton shortHeightButton = this.shortHeightButton;
        String str = this.tabGroupId;
        String str2 = this.backgroundColor;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("CharacteristicsDTO(characteristics=");
        sb2.append(list);
        sb2.append(", shortHeightButton=");
        sb2.append(shortHeightButton);
        sb2.append(", tabGroupId=");
        Nh.a.h(sb2, str, ", backgroundColor=", str2, ", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
