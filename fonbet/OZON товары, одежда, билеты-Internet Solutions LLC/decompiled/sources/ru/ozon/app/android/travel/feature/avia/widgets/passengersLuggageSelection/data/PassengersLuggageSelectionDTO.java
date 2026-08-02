package ru.ozon.app.android.travel.feature.avia.widgets.passengersLuggageSelection.data;

import AZ.c;
import D3.g;
import K1.G;
import Xc.a;
import Xc.b;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002!\"B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/data/PassengersLuggageSelectionDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "passengers", "", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/data/PassengersLuggageSelectionDTO$PassengerDTO;", "asyncBehaviorType", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/data/PassengersLuggageSelectionDTO$AsyncBehaviorType;", "asyncParams", "", "", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/data/PassengersLuggageSelectionDTO$AsyncBehaviorType;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPassengers", "()Ljava/util/List;", "getAsyncBehaviorType", "()Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/data/PassengersLuggageSelectionDTO$AsyncBehaviorType;", "getAsyncParams", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "AsyncBehaviorType", "PassengerDTO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PassengersLuggageSelectionDTO {
    public static final int $stable = 8;

    @NotNull
    private final AsyncBehaviorType asyncBehaviorType;
    private final Map<String, String> asyncParams;

    @NotNull
    private final List<PassengerDTO> passengers;

    @NotNull
    private final TextDTO title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/data/PassengersLuggageSelectionDTO$AsyncBehaviorType;", "", "<init>", "(Ljava/lang/String;I)V", "NO_ACTION", "FETCH_STATE", "REFRESH_STATE", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AsyncBehaviorType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ AsyncBehaviorType[] $VALUES;

        @i(name = "NO_ACTION")
        public static final AsyncBehaviorType NO_ACTION = new AsyncBehaviorType("NO_ACTION", 0);

        @i(name = "FETCH_STATE")
        public static final AsyncBehaviorType FETCH_STATE = new AsyncBehaviorType("FETCH_STATE", 1);

        @i(name = "REFRESH_STATE")
        public static final AsyncBehaviorType REFRESH_STATE = new AsyncBehaviorType("REFRESH_STATE", 2);

        private static final /* synthetic */ AsyncBehaviorType[] $values() {
            return new AsyncBehaviorType[]{NO_ACTION, FETCH_STATE, REFRESH_STATE};
        }

        static {
            AsyncBehaviorType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private AsyncBehaviorType(String str, int i11) {
        }

        public static AsyncBehaviorType valueOf(String str) {
            return (AsyncBehaviorType) Enum.valueOf(AsyncBehaviorType.class, str);
        }

        public static AsyncBehaviorType[] values() {
            return (AsyncBehaviorType[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/data/PassengersLuggageSelectionDTO$PassengerDTO;", "", "id", "", "cell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "luggageThere", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/data/PassengersLuggageSelectionDTO$PassengerDTO$LuggageDTO;", "luggageBack", "bonusCardBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "<init>", "(ILru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/data/PassengersLuggageSelectionDTO$PassengerDTO$LuggageDTO;Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/data/PassengersLuggageSelectionDTO$PassengerDTO$LuggageDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "getId", "()I", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getLuggageThere", "()Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/data/PassengersLuggageSelectionDTO$PassengerDTO$LuggageDTO;", "getLuggageBack", "getBonusCardBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "LuggageDTO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class PassengerDTO {
        public static final int $stable = 8;
        private final BadgeDTO bonusCardBadge;

        @NotNull
        private final CellDTO cell;
        private final int id;
        private final LuggageDTO luggageBack;
        private final LuggageDTO luggageThere;

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/data/PassengersLuggageSelectionDTO$PassengerDTO$LuggageDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "tariffs", "", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/data/PassengersLuggageSelectionDTO$PassengerDTO$LuggageDTO$TariffDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTariffs", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "TariffDTO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class LuggageDTO {
            public static final int $stable = 8;
            private final List<TariffDTO> tariffs;
            private final TextDTO title;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/data/PassengersLuggageSelectionDTO$PassengerDTO$LuggageDTO$TariffDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "aspect", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/aspect/AspectDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getAspect", "()Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class TariffDTO {
                public static final int $stable = AspectDTO.$stable;

                @NotNull
                private final AspectDTO aspect;
                private final TextDTO subtitle;

                @NotNull
                private final TextDTO title;

                public TariffDTO(@NotNull TextDTO title, TextDTO textDTO, @NotNull AspectDTO aspect) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(aspect, "aspect");
                    this.title = title;
                    this.subtitle = textDTO;
                    this.aspect = aspect;
                }

                public static /* synthetic */ TariffDTO copy$default(TariffDTO tariffDTO, TextDTO textDTO, TextDTO textDTO2, AspectDTO aspectDTO, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        textDTO = tariffDTO.title;
                    }
                    if ((i11 & 2) != 0) {
                        textDTO2 = tariffDTO.subtitle;
                    }
                    if ((i11 & 4) != 0) {
                        aspectDTO = tariffDTO.aspect;
                    }
                    return tariffDTO.copy(textDTO, textDTO2, aspectDTO);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final TextDTO getTitle() {
                    return this.title;
                }

                /* renamed from: component2, reason: from getter */
                public final TextDTO getSubtitle() {
                    return this.subtitle;
                }

                @NotNull
                /* renamed from: component3, reason: from getter */
                public final AspectDTO getAspect() {
                    return this.aspect;
                }

                @NotNull
                public final TariffDTO copy(@NotNull TextDTO title, TextDTO subtitle, @NotNull AspectDTO aspect) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(aspect, "aspect");
                    return new TariffDTO(title, subtitle, aspect);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof TariffDTO)) {
                        return false;
                    }
                    TariffDTO tariffDTO = (TariffDTO) other;
                    return Intrinsics.d(this.title, tariffDTO.title) && Intrinsics.d(this.subtitle, tariffDTO.subtitle) && Intrinsics.d(this.aspect, tariffDTO.aspect);
                }

                @NotNull
                public final AspectDTO getAspect() {
                    return this.aspect;
                }

                public final TextDTO getSubtitle() {
                    return this.subtitle;
                }

                @NotNull
                public final TextDTO getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    int hashCode = this.title.hashCode() * 31;
                    TextDTO textDTO = this.subtitle;
                    return this.aspect.hashCode() + ((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31);
                }

                @NotNull
                public String toString() {
                    TextDTO textDTO = this.title;
                    TextDTO textDTO2 = this.subtitle;
                    AspectDTO aspectDTO = this.aspect;
                    StringBuilder g10 = g.g("TariffDTO(title=", textDTO, ", subtitle=", textDTO2, ", aspect=");
                    g10.append(aspectDTO);
                    g10.append(")");
                    return g10.toString();
                }
            }

            public LuggageDTO(TextDTO textDTO, List<TariffDTO> list) {
                this.title = textDTO;
                this.tariffs = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ LuggageDTO copy$default(LuggageDTO luggageDTO, TextDTO textDTO, List list, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    textDTO = luggageDTO.title;
                }
                if ((i11 & 2) != 0) {
                    list = luggageDTO.tariffs;
                }
                return luggageDTO.copy(textDTO, list);
            }

            /* renamed from: component1, reason: from getter */
            public final TextDTO getTitle() {
                return this.title;
            }

            public final List<TariffDTO> component2() {
                return this.tariffs;
            }

            @NotNull
            public final LuggageDTO copy(TextDTO title, List<TariffDTO> tariffs) {
                return new LuggageDTO(title, tariffs);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LuggageDTO)) {
                    return false;
                }
                LuggageDTO luggageDTO = (LuggageDTO) other;
                return Intrinsics.d(this.title, luggageDTO.title) && Intrinsics.d(this.tariffs, luggageDTO.tariffs);
            }

            public final List<TariffDTO> getTariffs() {
                return this.tariffs;
            }

            public final TextDTO getTitle() {
                return this.title;
            }

            public int hashCode() {
                TextDTO textDTO = this.title;
                int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
                List<TariffDTO> list = this.tariffs;
                return hashCode + (list != null ? list.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "LuggageDTO(title=" + this.title + ", tariffs=" + this.tariffs + ")";
            }
        }

        public PassengerDTO(int i11, @NotNull CellDTO cell, LuggageDTO luggageDTO, LuggageDTO luggageDTO2, BadgeDTO badgeDTO) {
            Intrinsics.checkNotNullParameter(cell, "cell");
            this.id = i11;
            this.cell = cell;
            this.luggageThere = luggageDTO;
            this.luggageBack = luggageDTO2;
            this.bonusCardBadge = badgeDTO;
        }

        public static /* synthetic */ PassengerDTO copy$default(PassengerDTO passengerDTO, int i11, CellDTO cellDTO, LuggageDTO luggageDTO, LuggageDTO luggageDTO2, BadgeDTO badgeDTO, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = passengerDTO.id;
            }
            if ((i12 & 2) != 0) {
                cellDTO = passengerDTO.cell;
            }
            if ((i12 & 4) != 0) {
                luggageDTO = passengerDTO.luggageThere;
            }
            if ((i12 & 8) != 0) {
                luggageDTO2 = passengerDTO.luggageBack;
            }
            if ((i12 & 16) != 0) {
                badgeDTO = passengerDTO.bonusCardBadge;
            }
            BadgeDTO badgeDTO2 = badgeDTO;
            LuggageDTO luggageDTO3 = luggageDTO;
            return passengerDTO.copy(i11, cellDTO, luggageDTO3, luggageDTO2, badgeDTO2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final CellDTO getCell() {
            return this.cell;
        }

        /* renamed from: component3, reason: from getter */
        public final LuggageDTO getLuggageThere() {
            return this.luggageThere;
        }

        /* renamed from: component4, reason: from getter */
        public final LuggageDTO getLuggageBack() {
            return this.luggageBack;
        }

        /* renamed from: component5, reason: from getter */
        public final BadgeDTO getBonusCardBadge() {
            return this.bonusCardBadge;
        }

        @NotNull
        public final PassengerDTO copy(int id2, @NotNull CellDTO cell, LuggageDTO luggageThere, LuggageDTO luggageBack, BadgeDTO bonusCardBadge) {
            Intrinsics.checkNotNullParameter(cell, "cell");
            return new PassengerDTO(id2, cell, luggageThere, luggageBack, bonusCardBadge);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PassengerDTO)) {
                return false;
            }
            PassengerDTO passengerDTO = (PassengerDTO) other;
            return this.id == passengerDTO.id && Intrinsics.d(this.cell, passengerDTO.cell) && Intrinsics.d(this.luggageThere, passengerDTO.luggageThere) && Intrinsics.d(this.luggageBack, passengerDTO.luggageBack) && Intrinsics.d(this.bonusCardBadge, passengerDTO.bonusCardBadge);
        }

        public final BadgeDTO getBonusCardBadge() {
            return this.bonusCardBadge;
        }

        @NotNull
        public final CellDTO getCell() {
            return this.cell;
        }

        public final int getId() {
            return this.id;
        }

        public final LuggageDTO getLuggageBack() {
            return this.luggageBack;
        }

        public final LuggageDTO getLuggageThere() {
            return this.luggageThere;
        }

        public int hashCode() {
            int c11 = Bi.b.c(this.cell, Integer.hashCode(this.id) * 31, 31);
            LuggageDTO luggageDTO = this.luggageThere;
            int hashCode = (c11 + (luggageDTO == null ? 0 : luggageDTO.hashCode())) * 31;
            LuggageDTO luggageDTO2 = this.luggageBack;
            int hashCode2 = (hashCode + (luggageDTO2 == null ? 0 : luggageDTO2.hashCode())) * 31;
            BadgeDTO badgeDTO = this.bonusCardBadge;
            return hashCode2 + (badgeDTO != null ? badgeDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            CellDTO cellDTO = this.cell;
            LuggageDTO luggageDTO = this.luggageThere;
            LuggageDTO luggageDTO2 = this.luggageBack;
            BadgeDTO badgeDTO = this.bonusCardBadge;
            StringBuilder sb2 = new StringBuilder("PassengerDTO(id=");
            sb2.append(i11);
            sb2.append(", cell=");
            sb2.append(cellDTO);
            sb2.append(", luggageThere=");
            sb2.append(luggageDTO);
            sb2.append(", luggageBack=");
            sb2.append(luggageDTO2);
            sb2.append(", bonusCardBadge=");
            return c.b(sb2, badgeDTO, ")");
        }
    }

    public PassengersLuggageSelectionDTO(@NotNull TextDTO title, @NotNull List<PassengerDTO> passengers, @NotNull AsyncBehaviorType asyncBehaviorType, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(passengers, "passengers");
        Intrinsics.checkNotNullParameter(asyncBehaviorType, "asyncBehaviorType");
        this.title = title;
        this.passengers = passengers;
        this.asyncBehaviorType = asyncBehaviorType;
        this.asyncParams = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PassengersLuggageSelectionDTO copy$default(PassengersLuggageSelectionDTO passengersLuggageSelectionDTO, TextDTO textDTO, List list, AsyncBehaviorType asyncBehaviorType, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = passengersLuggageSelectionDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = passengersLuggageSelectionDTO.passengers;
        }
        if ((i11 & 4) != 0) {
            asyncBehaviorType = passengersLuggageSelectionDTO.asyncBehaviorType;
        }
        if ((i11 & 8) != 0) {
            map = passengersLuggageSelectionDTO.asyncParams;
        }
        return passengersLuggageSelectionDTO.copy(textDTO, list, asyncBehaviorType, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    public final List<PassengerDTO> component2() {
        return this.passengers;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final AsyncBehaviorType getAsyncBehaviorType() {
        return this.asyncBehaviorType;
    }

    public final Map<String, String> component4() {
        return this.asyncParams;
    }

    @NotNull
    public final PassengersLuggageSelectionDTO copy(@NotNull TextDTO title, @NotNull List<PassengerDTO> passengers, @NotNull AsyncBehaviorType asyncBehaviorType, Map<String, String> asyncParams) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(passengers, "passengers");
        Intrinsics.checkNotNullParameter(asyncBehaviorType, "asyncBehaviorType");
        return new PassengersLuggageSelectionDTO(title, passengers, asyncBehaviorType, asyncParams);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassengersLuggageSelectionDTO)) {
            return false;
        }
        PassengersLuggageSelectionDTO passengersLuggageSelectionDTO = (PassengersLuggageSelectionDTO) other;
        return Intrinsics.d(this.title, passengersLuggageSelectionDTO.title) && Intrinsics.d(this.passengers, passengersLuggageSelectionDTO.passengers) && this.asyncBehaviorType == passengersLuggageSelectionDTO.asyncBehaviorType && Intrinsics.d(this.asyncParams, passengersLuggageSelectionDTO.asyncParams);
    }

    @NotNull
    public final AsyncBehaviorType getAsyncBehaviorType() {
        return this.asyncBehaviorType;
    }

    public final Map<String, String> getAsyncParams() {
        return this.asyncParams;
    }

    @NotNull
    public final List<PassengerDTO> getPassengers() {
        return this.passengers;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = (this.asyncBehaviorType.hashCode() + G.g.b(this.title.hashCode() * 31, 31, this.passengers)) * 31;
        Map<String, String> map = this.asyncParams;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        List<PassengerDTO> list = this.passengers;
        AsyncBehaviorType asyncBehaviorType = this.asyncBehaviorType;
        Map<String, String> map = this.asyncParams;
        StringBuilder e11 = G.e("PassengersLuggageSelectionDTO(title=", textDTO, ", passengers=", list, ", asyncBehaviorType=");
        e11.append(asyncBehaviorType);
        e11.append(", asyncParams=");
        e11.append(map);
        e11.append(")");
        return e11.toString();
    }

    public PassengersLuggageSelectionDTO(TextDTO textDTO, List list, AsyncBehaviorType asyncBehaviorType, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textDTO, (i11 & 2) != 0 ? K.f71697a : list, asyncBehaviorType, map);
    }
}
