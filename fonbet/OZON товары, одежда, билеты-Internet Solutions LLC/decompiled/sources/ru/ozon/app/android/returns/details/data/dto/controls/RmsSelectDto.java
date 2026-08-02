package ru.ozon.app.android.returns.details.data.dto.controls;

import Tl.b;
import V.e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!B=\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0014JD\u0010\u001a\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lru/ozon/app/android/returns/details/data/dto/controls/RmsSelectDto;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "options", "", "Lru/ozon/app/android/returns/details/data/dto/controls/RmsSelectDto$Option;", "size", "Lru/ozon/app/android/returns/details/data/dto/controls/RmsSizeDto;", "filterable", "", "<init>", "(Ljava/lang/String;Ljava/util/List;Lru/ozon/app/android/returns/details/data/dto/controls/RmsSizeDto;Ljava/lang/Boolean;)V", "getValue", "()Ljava/lang/String;", "getOptions", "()Ljava/util/List;", "getSize", "()Lru/ozon/app/android/returns/details/data/dto/controls/RmsSizeDto;", "getFilterable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/util/List;Lru/ozon/app/android/returns/details/data/dto/controls/RmsSizeDto;Ljava/lang/Boolean;)Lru/ozon/app/android/returns/details/data/dto/controls/RmsSelectDto;", "equals", "other", "hashCode", "", "toString", "Option", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class RmsSelectDto {
    public static final int $stable = 8;
    private final Boolean filterable;
    private final List<Option> options;
    private final RmsSizeDto size;
    private final String value;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/returns/details/data/dto/controls/RmsSelectDto$Option;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "label", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getLabel", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Option {
        public static final int $stable = 0;

        @NotNull
        private final String label;

        @NotNull
        private final String value;

        public Option(@i(name = "value") @NotNull String value, @i(name = "label") @NotNull String label) {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(label, "label");
            this.value = value;
            this.label = label;
        }

        public static /* synthetic */ Option copy$default(Option option, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = option.value;
            }
            if ((i11 & 2) != 0) {
                str2 = option.label;
            }
            return option.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        @NotNull
        public final Option copy(@i(name = "value") @NotNull String value, @i(name = "label") @NotNull String label) {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(label, "label");
            return new Option(value, label);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Option)) {
                return false;
            }
            Option option = (Option) other;
            return Intrinsics.d(this.value, option.value) && Intrinsics.d(this.label, option.label);
        }

        @NotNull
        public final String getLabel() {
            return this.label;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.label.hashCode() + (this.value.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("Option(value=", this.value, ", label=", this.label, ")");
        }
    }

    public RmsSelectDto(@i(name = "value") String str, @i(name = "options") List<Option> list, @i(name = "size") RmsSizeDto rmsSizeDto, @i(name = "filterable") Boolean bool) {
        this.value = str;
        this.options = list;
        this.size = rmsSizeDto;
        this.filterable = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RmsSelectDto copy$default(RmsSelectDto rmsSelectDto, String str, List list, RmsSizeDto rmsSizeDto, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = rmsSelectDto.value;
        }
        if ((i11 & 2) != 0) {
            list = rmsSelectDto.options;
        }
        if ((i11 & 4) != 0) {
            rmsSizeDto = rmsSelectDto.size;
        }
        if ((i11 & 8) != 0) {
            bool = rmsSelectDto.filterable;
        }
        return rmsSelectDto.copy(str, list, rmsSizeDto, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final List<Option> component2() {
        return this.options;
    }

    /* renamed from: component3, reason: from getter */
    public final RmsSizeDto getSize() {
        return this.size;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getFilterable() {
        return this.filterable;
    }

    @NotNull
    public final RmsSelectDto copy(@i(name = "value") String value, @i(name = "options") List<Option> options, @i(name = "size") RmsSizeDto size, @i(name = "filterable") Boolean filterable) {
        return new RmsSelectDto(value, options, size, filterable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RmsSelectDto)) {
            return false;
        }
        RmsSelectDto rmsSelectDto = (RmsSelectDto) other;
        return Intrinsics.d(this.value, rmsSelectDto.value) && Intrinsics.d(this.options, rmsSelectDto.options) && this.size == rmsSelectDto.size && Intrinsics.d(this.filterable, rmsSelectDto.filterable);
    }

    public final Boolean getFilterable() {
        return this.filterable;
    }

    public final List<Option> getOptions() {
        return this.options;
    }

    public final RmsSizeDto getSize() {
        return this.size;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.value;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Option> list = this.options;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        RmsSizeDto rmsSizeDto = this.size;
        int hashCode3 = (hashCode2 + (rmsSizeDto == null ? 0 : rmsSizeDto.hashCode())) * 31;
        Boolean bool = this.filterable;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.value;
        List<Option> list = this.options;
        RmsSizeDto rmsSizeDto = this.size;
        Boolean bool = this.filterable;
        StringBuilder f7 = b.f("RmsSelectDto(value=", str, ", options=", ", size=", list);
        f7.append(rmsSizeDto);
        f7.append(", filterable=");
        f7.append(bool);
        f7.append(")");
        return f7.toString();
    }
}
