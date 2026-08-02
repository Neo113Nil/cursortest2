package ru.ozon.android.messenger.blocks.rateoperator;

import B90.C2618u;
import G.g;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001aB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/ozon/android/messenger/blocks/rateoperator/RateDTO;", "", "rate", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "reasons", "", "Lru/ozon/android/messenger/blocks/rateoperator/RateDTO$ReasonDTO;", "<init>", "(ILjava/lang/String;Ljava/util/List;)V", "getRate", "()I", "getName", "()Ljava/lang/String;", "getReasons", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "ReasonDTO", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class RateDTO {
    public static final int $stable = 0;

    @NotNull
    private final String name;
    private final int rate;
    private final List<ReasonDTO> reasons;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lru/ozon/android/messenger/blocks/rateoperator/RateDTO$ReasonDTO;", "", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "<init>", "(ILjava/lang/String;)V", "getId", "()I", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReasonDTO {
        public static final int $stable = 0;
        private final int id;

        @NotNull
        private final String name;

        public ReasonDTO(int i11, @NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.id = i11;
            this.name = name;
        }

        public static /* synthetic */ ReasonDTO copy$default(ReasonDTO reasonDTO, int i11, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = reasonDTO.id;
            }
            if ((i12 & 2) != 0) {
                str = reasonDTO.name;
            }
            return reasonDTO.copy(i11, str);
        }

        /* renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final ReasonDTO copy(int id2, @NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new ReasonDTO(id2, name);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReasonDTO)) {
                return false;
            }
            ReasonDTO reasonDTO = (ReasonDTO) other;
            return this.id == reasonDTO.id && Intrinsics.d(this.name, reasonDTO.name);
        }

        public final int getId() {
            return this.id;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode() + (Integer.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            return Nh.a.c(this.id, "ReasonDTO(id=", ", name=", this.name, ")");
        }
    }

    public RateDTO(int i11, @NotNull String name, List<ReasonDTO> list) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.rate = i11;
        this.name = name;
        this.reasons = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RateDTO copy$default(RateDTO rateDTO, int i11, String str, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = rateDTO.rate;
        }
        if ((i12 & 2) != 0) {
            str = rateDTO.name;
        }
        if ((i12 & 4) != 0) {
            list = rateDTO.reasons;
        }
        return rateDTO.copy(i11, str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getRate() {
        return this.rate;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<ReasonDTO> component3() {
        return this.reasons;
    }

    @NotNull
    public final RateDTO copy(int rate, @NotNull String name, List<ReasonDTO> reasons) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new RateDTO(rate, name, reasons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RateDTO)) {
            return false;
        }
        RateDTO rateDTO = (RateDTO) other;
        return this.rate == rateDTO.rate && Intrinsics.d(this.name, rateDTO.name) && Intrinsics.d(this.reasons, rateDTO.reasons);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getRate() {
        return this.rate;
    }

    public final List<ReasonDTO> getReasons() {
        return this.reasons;
    }

    public int hashCode() {
        int a11 = g.a(Integer.hashCode(this.rate) * 31, 31, this.name);
        List<ReasonDTO> list = this.reasons;
        return a11 + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        int i11 = this.rate;
        String str = this.name;
        return C2618u.h(Cm.e.g(i11, "RateDTO(rate=", ", name=", str, ", reasons="), this.reasons, ")");
    }
}
