package com.sofascore.model.mvvm.model;

import com.sofascore.model.network.response.SearchResponseKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/sofascore/model/mvvm/model/RefereeDetailsHeadFlags;", "", SearchResponseKt.REFEREE_ENTITY, "Lcom/sofascore/model/mvvm/model/Referee;", "<init>", "(Lcom/sofascore/model/mvvm/model/Referee;)V", "getReferee", "()Lcom/sofascore/model/mvvm/model/Referee;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RefereeDetailsHeadFlags {

    @NotNull
    private final Referee referee;

    public RefereeDetailsHeadFlags(@NotNull Referee referee) {
        referee.getClass();
        this.referee = referee;
    }

    public static /* synthetic */ RefereeDetailsHeadFlags copy$default(RefereeDetailsHeadFlags refereeDetailsHeadFlags, Referee referee, int i, Object obj) {
        if ((i & 1) != 0) {
            referee = refereeDetailsHeadFlags.referee;
        }
        return refereeDetailsHeadFlags.copy(referee);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Referee getReferee() {
        return this.referee;
    }

    @NotNull
    public final RefereeDetailsHeadFlags copy(@NotNull Referee referee) {
        referee.getClass();
        return new RefereeDetailsHeadFlags(referee);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RefereeDetailsHeadFlags) && Intrinsics.c(this.referee, ((RefereeDetailsHeadFlags) other).referee);
    }

    @NotNull
    public final Referee getReferee() {
        return this.referee;
    }

    public int hashCode() {
        return this.referee.hashCode();
    }

    @NotNull
    public String toString() {
        return "RefereeDetailsHeadFlags(referee=" + this.referee + ")";
    }
}
