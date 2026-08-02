package com.blaze.blazesdk.delegates.models;

import androidx.annotation.Keep;
import com.blaze.blazesdk.follow.models.BlazeFollowEntity;
import defpackage.o6a;
import defpackage.u0a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/blaze/blazesdk/delegates/models/BlazeFollowEntityClickedParams;", "", "playerType", "Lcom/blaze/blazesdk/delegates/models/BlazePlayerType;", "sourceId", "", "newFollowingState", "", "followEntity", "Lcom/blaze/blazesdk/follow/models/BlazeFollowEntity;", "<init>", "(Lcom/blaze/blazesdk/delegates/models/BlazePlayerType;Ljava/lang/String;ZLcom/blaze/blazesdk/follow/models/BlazeFollowEntity;)V", "getPlayerType", "()Lcom/blaze/blazesdk/delegates/models/BlazePlayerType;", "getSourceId", "()Ljava/lang/String;", "getNewFollowingState", "()Z", "getFollowEntity", "()Lcom/blaze/blazesdk/follow/models/BlazeFollowEntity;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BlazeFollowEntityClickedParams {
    public static final int $stable = 0;

    @NotNull
    private final BlazeFollowEntity followEntity;
    private final boolean newFollowingState;

    @NotNull
    private final BlazePlayerType playerType;

    @NotNull
    private final String sourceId;

    public BlazeFollowEntityClickedParams(@NotNull BlazePlayerType blazePlayerType, @NotNull String str, boolean z, @NotNull BlazeFollowEntity blazeFollowEntity) {
        blazePlayerType.getClass();
        str.getClass();
        blazeFollowEntity.getClass();
        this.playerType = blazePlayerType;
        this.sourceId = str;
        this.newFollowingState = z;
        this.followEntity = blazeFollowEntity;
    }

    public static /* synthetic */ BlazeFollowEntityClickedParams copy$default(BlazeFollowEntityClickedParams blazeFollowEntityClickedParams, BlazePlayerType blazePlayerType, String str, boolean z, BlazeFollowEntity blazeFollowEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            blazePlayerType = blazeFollowEntityClickedParams.playerType;
        }
        if ((i & 2) != 0) {
            str = blazeFollowEntityClickedParams.sourceId;
        }
        if ((i & 4) != 0) {
            z = blazeFollowEntityClickedParams.newFollowingState;
        }
        if ((i & 8) != 0) {
            blazeFollowEntity = blazeFollowEntityClickedParams.followEntity;
        }
        return blazeFollowEntityClickedParams.copy(blazePlayerType, str, z, blazeFollowEntity);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BlazePlayerType getPlayerType() {
        return this.playerType;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSourceId() {
        return this.sourceId;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getNewFollowingState() {
        return this.newFollowingState;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final BlazeFollowEntity getFollowEntity() {
        return this.followEntity;
    }

    @NotNull
    public final BlazeFollowEntityClickedParams copy(@NotNull BlazePlayerType playerType, @NotNull String sourceId, boolean newFollowingState, @NotNull BlazeFollowEntity followEntity) {
        playerType.getClass();
        sourceId.getClass();
        followEntity.getClass();
        return new BlazeFollowEntityClickedParams(playerType, sourceId, newFollowingState, followEntity);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeFollowEntityClickedParams)) {
            return false;
        }
        BlazeFollowEntityClickedParams blazeFollowEntityClickedParams = (BlazeFollowEntityClickedParams) other;
        return this.playerType == blazeFollowEntityClickedParams.playerType && Intrinsics.c(this.sourceId, blazeFollowEntityClickedParams.sourceId) && this.newFollowingState == blazeFollowEntityClickedParams.newFollowingState && Intrinsics.c(this.followEntity, blazeFollowEntityClickedParams.followEntity);
    }

    @NotNull
    public final BlazeFollowEntity getFollowEntity() {
        return this.followEntity;
    }

    public final boolean getNewFollowingState() {
        return this.newFollowingState;
    }

    @NotNull
    public final BlazePlayerType getPlayerType() {
        return this.playerType;
    }

    @NotNull
    public final String getSourceId() {
        return this.sourceId;
    }

    public int hashCode() {
        return this.followEntity.hashCode() + u0a.t(o6a.k(this.sourceId, this.playerType.hashCode() * 31), this.newFollowingState);
    }

    @NotNull
    public String toString() {
        return "BlazeFollowEntityClickedParams(playerType=" + this.playerType + ", sourceId=" + this.sourceId + ", newFollowingState=" + this.newFollowingState + ", followEntity=" + this.followEntity + ')';
    }
}
