package ai.verisoul.sdk.helpers.session;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lai/verisoul/sdk/helpers/session/SessionStatus;", "", "playIntegrity", "Lai/verisoul/sdk/helpers/session/Status;", "nativeDataCollection", "touchDataCollection", "(Lai/verisoul/sdk/helpers/session/Status;Lai/verisoul/sdk/helpers/session/Status;Lai/verisoul/sdk/helpers/session/Status;)V", "getNativeDataCollection", "()Lai/verisoul/sdk/helpers/session/Status;", "getPlayIntegrity", "getTouchDataCollection", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SessionStatus {

    @NotNull
    private final Status nativeDataCollection;

    @NotNull
    private final Status playIntegrity;

    @NotNull
    private final Status touchDataCollection;

    public SessionStatus(@NotNull Status playIntegrity, @NotNull Status nativeDataCollection, @NotNull Status touchDataCollection) {
        Intrinsics.checkNotNullParameter(playIntegrity, "playIntegrity");
        Intrinsics.checkNotNullParameter(nativeDataCollection, "nativeDataCollection");
        Intrinsics.checkNotNullParameter(touchDataCollection, "touchDataCollection");
        this.playIntegrity = playIntegrity;
        this.nativeDataCollection = nativeDataCollection;
        this.touchDataCollection = touchDataCollection;
    }

    public static /* synthetic */ SessionStatus copy$default(SessionStatus sessionStatus, Status status, Status status2, Status status3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            status = sessionStatus.playIntegrity;
        }
        if ((i10 & 2) != 0) {
            status2 = sessionStatus.nativeDataCollection;
        }
        if ((i10 & 4) != 0) {
            status3 = sessionStatus.touchDataCollection;
        }
        return sessionStatus.copy(status, status2, status3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Status getPlayIntegrity() {
        return this.playIntegrity;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Status getNativeDataCollection() {
        return this.nativeDataCollection;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Status getTouchDataCollection() {
        return this.touchDataCollection;
    }

    @NotNull
    public final SessionStatus copy(@NotNull Status playIntegrity, @NotNull Status nativeDataCollection, @NotNull Status touchDataCollection) {
        Intrinsics.checkNotNullParameter(playIntegrity, "playIntegrity");
        Intrinsics.checkNotNullParameter(nativeDataCollection, "nativeDataCollection");
        Intrinsics.checkNotNullParameter(touchDataCollection, "touchDataCollection");
        return new SessionStatus(playIntegrity, nativeDataCollection, touchDataCollection);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionStatus)) {
            return false;
        }
        SessionStatus sessionStatus = (SessionStatus) other;
        return this.playIntegrity == sessionStatus.playIntegrity && this.nativeDataCollection == sessionStatus.nativeDataCollection && this.touchDataCollection == sessionStatus.touchDataCollection;
    }

    @NotNull
    public final Status getNativeDataCollection() {
        return this.nativeDataCollection;
    }

    @NotNull
    public final Status getPlayIntegrity() {
        return this.playIntegrity;
    }

    @NotNull
    public final Status getTouchDataCollection() {
        return this.touchDataCollection;
    }

    public int hashCode() {
        return (((this.playIntegrity.hashCode() * 31) + this.nativeDataCollection.hashCode()) * 31) + this.touchDataCollection.hashCode();
    }

    @NotNull
    public String toString() {
        return "SessionStatus(playIntegrity=" + this.playIntegrity + ", nativeDataCollection=" + this.nativeDataCollection + ", touchDataCollection=" + this.touchDataCollection + ")";
    }
}
