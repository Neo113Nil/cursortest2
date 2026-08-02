package ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.data;

import H3.c;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/data/TravelPersonalAccountReplenishmentResponse;", "", "sum", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/data/TravelPersonalAccountReplenishmentResponse$Sum;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/data/TravelPersonalAccountReplenishmentResponse$Sum;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getSum", "()Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/data/TravelPersonalAccountReplenishmentResponse$Sum;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Sum", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TravelPersonalAccountReplenishmentResponse {
    public static final int $stable = 8;
    private final AtomActionDTO action;

    @NotNull
    private final Sum sum;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/data/TravelPersonalAccountReplenishmentResponse$Sum;", "", "errors", "", "", "<init>", "(Ljava/util/List;)V", "getErrors", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Sum {
        public static final int $stable = 8;

        @NotNull
        private final List<String> errors;

        public Sum() {
            this(null, 1, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Sum copy$default(Sum sum, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = sum.errors;
            }
            return sum.copy(list);
        }

        @NotNull
        public final List<String> component1() {
            return this.errors;
        }

        @NotNull
        public final Sum copy(@NotNull List<String> errors) {
            Intrinsics.checkNotNullParameter(errors, "errors");
            return new Sum(errors);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Sum) && Intrinsics.d(this.errors, ((Sum) other).errors);
        }

        @NotNull
        public final List<String> getErrors() {
            return this.errors;
        }

        public int hashCode() {
            return this.errors.hashCode();
        }

        @NotNull
        public String toString() {
            return c.a("Sum(errors=", ")", this.errors);
        }

        public Sum(@NotNull List<String> errors) {
            Intrinsics.checkNotNullParameter(errors, "errors");
            this.errors = errors;
        }

        public Sum(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? K.f71697a : list);
        }
    }

    public TravelPersonalAccountReplenishmentResponse(@NotNull Sum sum, AtomActionDTO atomActionDTO) {
        Intrinsics.checkNotNullParameter(sum, "sum");
        this.sum = sum;
        this.action = atomActionDTO;
    }

    public static /* synthetic */ TravelPersonalAccountReplenishmentResponse copy$default(TravelPersonalAccountReplenishmentResponse travelPersonalAccountReplenishmentResponse, Sum sum, AtomActionDTO atomActionDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            sum = travelPersonalAccountReplenishmentResponse.sum;
        }
        if ((i11 & 2) != 0) {
            atomActionDTO = travelPersonalAccountReplenishmentResponse.action;
        }
        return travelPersonalAccountReplenishmentResponse.copy(sum, atomActionDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Sum getSum() {
        return this.sum;
    }

    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final TravelPersonalAccountReplenishmentResponse copy(@NotNull Sum sum, AtomActionDTO action) {
        Intrinsics.checkNotNullParameter(sum, "sum");
        return new TravelPersonalAccountReplenishmentResponse(sum, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelPersonalAccountReplenishmentResponse)) {
            return false;
        }
        TravelPersonalAccountReplenishmentResponse travelPersonalAccountReplenishmentResponse = (TravelPersonalAccountReplenishmentResponse) other;
        return Intrinsics.d(this.sum, travelPersonalAccountReplenishmentResponse.sum) && Intrinsics.d(this.action, travelPersonalAccountReplenishmentResponse.action);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final Sum getSum() {
        return this.sum;
    }

    public int hashCode() {
        int hashCode = this.sum.hashCode() * 31;
        AtomActionDTO atomActionDTO = this.action;
        return hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode());
    }

    @NotNull
    public String toString() {
        return "TravelPersonalAccountReplenishmentResponse(sum=" + this.sum + ", action=" + this.action + ")";
    }
}
