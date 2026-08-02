package io.intercom.android.sdk.models;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: HostAppState.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0016H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/models/HostAppState;", "", "isBackgrounded", "", "sessionStartedSinceLastBackgrounded", "backgroundedTimestamp", "", "<init>", "(ZZJ)V", "()Z", "getSessionStartedSinceLastBackgrounded", "getBackgroundedTimestamp", "()J", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class HostAppState {
    public static final int $stable = 0;
    public static final HostAppState NULL = new HostAppState(false, false, 0, 7, null);
    private final long backgroundedTimestamp;
    private final boolean isBackgrounded;
    private final boolean sessionStartedSinceLastBackgrounded;

    public HostAppState() {
        this(false, false, 0L, 7, null);
    }

    public static /* synthetic */ HostAppState copy$default(HostAppState hostAppState, boolean z, boolean z2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            z = hostAppState.isBackgrounded;
        }
        if ((i & 2) != 0) {
            z2 = hostAppState.sessionStartedSinceLastBackgrounded;
        }
        if ((i & 4) != 0) {
            j = hostAppState.backgroundedTimestamp;
        }
        return hostAppState.copy(z, z2, j);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsBackgrounded() {
        return this.isBackgrounded;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSessionStartedSinceLastBackgrounded() {
        return this.sessionStartedSinceLastBackgrounded;
    }

    /* renamed from: component3, reason: from getter */
    public final long getBackgroundedTimestamp() {
        return this.backgroundedTimestamp;
    }

    public final HostAppState copy(boolean isBackgrounded, boolean sessionStartedSinceLastBackgrounded, long backgroundedTimestamp) {
        return new HostAppState(isBackgrounded, sessionStartedSinceLastBackgrounded, backgroundedTimestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HostAppState)) {
            return false;
        }
        HostAppState hostAppState = (HostAppState) other;
        return this.isBackgrounded == hostAppState.isBackgrounded && this.sessionStartedSinceLastBackgrounded == hostAppState.sessionStartedSinceLastBackgrounded && this.backgroundedTimestamp == hostAppState.backgroundedTimestamp;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isBackgrounded) * 31) + Boolean.hashCode(this.sessionStartedSinceLastBackgrounded)) * 31) + Long.hashCode(this.backgroundedTimestamp);
    }

    public String toString() {
        return "HostAppState(isBackgrounded=" + this.isBackgrounded + ", sessionStartedSinceLastBackgrounded=" + this.sessionStartedSinceLastBackgrounded + ", backgroundedTimestamp=" + this.backgroundedTimestamp + ')';
    }

    public HostAppState(boolean z, boolean z2, long j) {
        this.isBackgrounded = z;
        this.sessionStartedSinceLastBackgrounded = z2;
        this.backgroundedTimestamp = j;
    }

    public /* synthetic */ HostAppState(boolean z, boolean z2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? 0L : j);
    }

    public final boolean isBackgrounded() {
        return this.isBackgrounded;
    }

    public final boolean getSessionStartedSinceLastBackgrounded() {
        return this.sessionStartedSinceLastBackgrounded;
    }

    public final long getBackgroundedTimestamp() {
        return this.backgroundedTimestamp;
    }
}
