package ru.ozon.app.android.pdp.ui.configurators.ugc.data;

import Am.C2438a;
import B0.C2454a;
import C.o0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/data/VoteResponse;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "usefulness", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/VoteResponse$Usefulness;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/pdp/ui/configurators/ugc/data/VoteResponse$Usefulness;)V", "getValue", "()Ljava/lang/String;", "getUsefulness", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/data/VoteResponse$Usefulness;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Usefulness", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class VoteResponse {
    public static final int $stable = 0;

    @NotNull
    private final Usefulness usefulness;

    @NotNull
    private final String value;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/data/VoteResponse$Usefulness;", "", "unuseful", "", "useful", "userSelection", "", "<init>", "(IILjava/lang/String;)V", "getUnuseful", "()I", "getUseful", "getUserSelection", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Usefulness {
        public static final int $stable = 0;
        private final int unuseful;
        private final int useful;

        @NotNull
        private final String userSelection;

        public Usefulness(int i11, int i12, @NotNull String userSelection) {
            Intrinsics.checkNotNullParameter(userSelection, "userSelection");
            this.unuseful = i11;
            this.useful = i12;
            this.userSelection = userSelection;
        }

        public static /* synthetic */ Usefulness copy$default(Usefulness usefulness, int i11, int i12, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = usefulness.unuseful;
            }
            if ((i13 & 2) != 0) {
                i12 = usefulness.useful;
            }
            if ((i13 & 4) != 0) {
                str = usefulness.userSelection;
            }
            return usefulness.copy(i11, i12, str);
        }

        /* renamed from: component1, reason: from getter */
        public final int getUnuseful() {
            return this.unuseful;
        }

        /* renamed from: component2, reason: from getter */
        public final int getUseful() {
            return this.useful;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getUserSelection() {
            return this.userSelection;
        }

        @NotNull
        public final Usefulness copy(int unuseful, int useful, @NotNull String userSelection) {
            Intrinsics.checkNotNullParameter(userSelection, "userSelection");
            return new Usefulness(unuseful, useful, userSelection);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Usefulness)) {
                return false;
            }
            Usefulness usefulness = (Usefulness) other;
            return this.unuseful == usefulness.unuseful && this.useful == usefulness.useful && Intrinsics.d(this.userSelection, usefulness.userSelection);
        }

        public final int getUnuseful() {
            return this.unuseful;
        }

        public final int getUseful() {
            return this.useful;
        }

        @NotNull
        public final String getUserSelection() {
            return this.userSelection;
        }

        public int hashCode() {
            return this.userSelection.hashCode() + C2454a.a(this.useful, Integer.hashCode(this.unuseful) * 31, 31);
        }

        @NotNull
        public String toString() {
            int i11 = this.unuseful;
            int i12 = this.useful;
            return o0.c(C2438a.a("Usefulness(unuseful=", i11, ", useful=", ", userSelection=", i12), this.userSelection, ")");
        }
    }

    public VoteResponse(@NotNull String value, @NotNull Usefulness usefulness) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(usefulness, "usefulness");
        this.value = value;
        this.usefulness = usefulness;
    }

    public static /* synthetic */ VoteResponse copy$default(VoteResponse voteResponse, String str, Usefulness usefulness, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = voteResponse.value;
        }
        if ((i11 & 2) != 0) {
            usefulness = voteResponse.usefulness;
        }
        return voteResponse.copy(str, usefulness);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Usefulness getUsefulness() {
        return this.usefulness;
    }

    @NotNull
    public final VoteResponse copy(@NotNull String value, @NotNull Usefulness usefulness) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(usefulness, "usefulness");
        return new VoteResponse(value, usefulness);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoteResponse)) {
            return false;
        }
        VoteResponse voteResponse = (VoteResponse) other;
        return Intrinsics.d(this.value, voteResponse.value) && Intrinsics.d(this.usefulness, voteResponse.usefulness);
    }

    @NotNull
    public final Usefulness getUsefulness() {
        return this.usefulness;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.usefulness.hashCode() + (this.value.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "VoteResponse(value=" + this.value + ", usefulness=" + this.usefulness + ")";
    }
}
