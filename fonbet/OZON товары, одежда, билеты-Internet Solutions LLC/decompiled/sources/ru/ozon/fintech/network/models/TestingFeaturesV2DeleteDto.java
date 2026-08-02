package ru.ozon.fintech.network.models;

import Ak.C2436a;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0014"}, d2 = {"Lru/ozon/fintech/network/models/TestingFeaturesV2DeleteDto;", "", "flags", "", "", "realtimeSwitches", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getFlags", "()Ljava/util/List;", "getRealtimeSwitches", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "fintech-network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TestingFeaturesV2DeleteDto {

    @NotNull
    private final List<String> flags;

    @NotNull
    private final List<String> realtimeSwitches;

    public TestingFeaturesV2DeleteDto() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TestingFeaturesV2DeleteDto copy$default(TestingFeaturesV2DeleteDto testingFeaturesV2DeleteDto, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = testingFeaturesV2DeleteDto.flags;
        }
        if ((i11 & 2) != 0) {
            list2 = testingFeaturesV2DeleteDto.realtimeSwitches;
        }
        return testingFeaturesV2DeleteDto.copy(list, list2);
    }

    @NotNull
    public final List<String> component1() {
        return this.flags;
    }

    @NotNull
    public final List<String> component2() {
        return this.realtimeSwitches;
    }

    @NotNull
    public final TestingFeaturesV2DeleteDto copy(@NotNull List<String> flags, @NotNull List<String> realtimeSwitches) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(realtimeSwitches, "realtimeSwitches");
        return new TestingFeaturesV2DeleteDto(flags, realtimeSwitches);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TestingFeaturesV2DeleteDto)) {
            return false;
        }
        TestingFeaturesV2DeleteDto testingFeaturesV2DeleteDto = (TestingFeaturesV2DeleteDto) other;
        return Intrinsics.d(this.flags, testingFeaturesV2DeleteDto.flags) && Intrinsics.d(this.realtimeSwitches, testingFeaturesV2DeleteDto.realtimeSwitches);
    }

    @NotNull
    public final List<String> getFlags() {
        return this.flags;
    }

    @NotNull
    public final List<String> getRealtimeSwitches() {
        return this.realtimeSwitches;
    }

    public int hashCode() {
        return this.realtimeSwitches.hashCode() + (this.flags.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return C2436a.b("TestingFeaturesV2DeleteDto(flags=", this.flags, ", realtimeSwitches=", ")", this.realtimeSwitches);
    }

    public TestingFeaturesV2DeleteDto(List list, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? K.f71697a : list, (i11 & 2) != 0 ? K.f71697a : list2);
    }

    public TestingFeaturesV2DeleteDto(@NotNull List<String> flags, @NotNull List<String> realtimeSwitches) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(realtimeSwitches, "realtimeSwitches");
        this.flags = flags;
        this.realtimeSwitches = realtimeSwitches;
    }
}
