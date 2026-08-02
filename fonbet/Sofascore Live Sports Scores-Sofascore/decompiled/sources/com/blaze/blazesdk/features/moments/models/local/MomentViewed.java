package com.blaze.blazesdk.features.moments.models.local;

import androidx.annotation.Keep;
import defpackage.lnb;
import defpackage.utl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\"\u0010\u0005\u001a\u00020\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0005\u0010\u000b\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/blaze/blazesdk/features/moments/models/local/MomentViewed;", "Lutl;", "", "momentId", "", "isSynced", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/blaze/blazesdk/features/moments/models/local/MomentViewed;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMomentId", "Z", "setSynced", "(Z)V", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MomentViewed implements utl {
    public static final int $stable = 8;
    private boolean isSynced;

    @NotNull
    private final String momentId;

    public MomentViewed(@NotNull String str, boolean z) {
        str.getClass();
        this.momentId = str;
        this.isSynced = z;
    }

    public static /* synthetic */ MomentViewed copy$default(MomentViewed momentViewed, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = momentViewed.momentId;
        }
        if ((i & 2) != 0) {
            z = momentViewed.isSynced;
        }
        return momentViewed.copy(str, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getMomentId() {
        return this.momentId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSynced() {
        return this.isSynced;
    }

    @NotNull
    public final MomentViewed copy(@NotNull String momentId, boolean isSynced) {
        momentId.getClass();
        return new MomentViewed(momentId, isSynced);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MomentViewed)) {
            return false;
        }
        MomentViewed momentViewed = (MomentViewed) other;
        return Intrinsics.c(this.momentId, momentViewed.momentId) && this.isSynced == momentViewed.isSynced;
    }

    @NotNull
    public final String getMomentId() {
        return this.momentId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSynced) + (this.momentId.hashCode() * 31);
    }

    public boolean isSynced() {
        return this.isSynced;
    }

    @Override // defpackage.utl
    public void setSynced(boolean z) {
        this.isSynced = z;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("MomentViewed(momentId=");
        sb.append(this.momentId);
        sb.append(", isSynced=");
        return lnb.r(sb, this.isSynced, ')');
    }
}
