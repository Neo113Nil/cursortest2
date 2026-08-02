package ru.ozon.app.android.pdp.widgets.markdown.data;

import An.C2439a;
import C.o0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB+\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\bHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdp/widgets/markdown/data/MarkdownDTO;", "", "characteristics", "", "Lru/ozon/app/android/pdp/widgets/markdown/data/MarkdownDTO$Characteristic;", "description", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "deeplink", "", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;)V", "getCharacteristics", "()Ljava/util/List;", "getDescription", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getDeeplink", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Characteristic", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class MarkdownDTO {
    public static final int $stable = 8;
    private final List<Characteristic> characteristics;
    private final String deeplink;
    private final OzonSpannableString description;

    public MarkdownDTO(List<Characteristic> list, OzonSpannableString ozonSpannableString, String str) {
        this.characteristics = list;
        this.description = ozonSpannableString;
        this.deeplink = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarkdownDTO copy$default(MarkdownDTO markdownDTO, List list, OzonSpannableString ozonSpannableString, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = markdownDTO.characteristics;
        }
        if ((i11 & 2) != 0) {
            ozonSpannableString = markdownDTO.description;
        }
        if ((i11 & 4) != 0) {
            str = markdownDTO.deeplink;
        }
        return markdownDTO.copy(list, ozonSpannableString, str);
    }

    public final List<Characteristic> component1() {
        return this.characteristics;
    }

    /* renamed from: component2, reason: from getter */
    public final OzonSpannableString getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    public final MarkdownDTO copy(List<Characteristic> characteristics, OzonSpannableString description, String deeplink) {
        return new MarkdownDTO(characteristics, description, deeplink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarkdownDTO)) {
            return false;
        }
        MarkdownDTO markdownDTO = (MarkdownDTO) other;
        return Intrinsics.d(this.characteristics, markdownDTO.characteristics) && Intrinsics.d(this.description, markdownDTO.description) && Intrinsics.d(this.deeplink, markdownDTO.deeplink);
    }

    public final List<Characteristic> getCharacteristics() {
        return this.characteristics;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final OzonSpannableString getDescription() {
        return this.description;
    }

    public int hashCode() {
        List<Characteristic> list = this.characteristics;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        OzonSpannableString ozonSpannableString = this.description;
        int hashCode2 = (hashCode + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31;
        String str = this.deeplink;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<Characteristic> list = this.characteristics;
        OzonSpannableString ozonSpannableString = this.description;
        String str = this.deeplink;
        StringBuilder sb2 = new StringBuilder("MarkdownDTO(characteristics=");
        sb2.append(list);
        sb2.append(", description=");
        sb2.append((Object) ozonSpannableString);
        sb2.append(", deeplink=");
        return o0.c(sb2, str, ")");
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdp/widgets/markdown/data/MarkdownDTO$Characteristic;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getValue", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Characteristic {
        public static final int $stable = 8;

        @NotNull
        private final String name;

        @NotNull
        private final List<String> value;

        public Characteristic(@NotNull String name, @NotNull List<String> value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.name = name;
            this.value = value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Characteristic copy$default(Characteristic characteristic, String str, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = characteristic.name;
            }
            if ((i11 & 2) != 0) {
                list = characteristic.value;
            }
            return characteristic.copy(str, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final List<String> component2() {
            return this.value;
        }

        @NotNull
        public final Characteristic copy(@NotNull String name, @NotNull List<String> value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            return new Characteristic(name, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Characteristic)) {
                return false;
            }
            Characteristic characteristic = (Characteristic) other;
            return Intrinsics.d(this.name, characteristic.name) && Intrinsics.d(this.value, characteristic.value);
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final List<String> getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode() + (this.name.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return C2439a.a("Characteristic(name=", this.name, ", value=", ")", this.value);
        }

        public Characteristic(String str, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? K.f71697a : list);
        }
    }
}
