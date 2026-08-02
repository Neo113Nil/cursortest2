package ru.ozon.app.android.travel.feature.general.common.widgets.pendingAction.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pendingAction/data/PendingActionDTO;", "", "seconds", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(JLru/ozon/uni/atoms/data/AtomActionDTO;)V", "getSeconds", "()J", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PendingActionDTO {
    public static final int $stable = 0;

    @NotNull
    private final AtomActionDTO action;
    private final long seconds;

    public PendingActionDTO(long j11, @NotNull AtomActionDTO action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.seconds = j11;
        this.action = action;
    }

    public static /* synthetic */ PendingActionDTO copy$default(PendingActionDTO pendingActionDTO, long j11, AtomActionDTO atomActionDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = pendingActionDTO.seconds;
        }
        if ((i11 & 2) != 0) {
            atomActionDTO = pendingActionDTO.action;
        }
        return pendingActionDTO.copy(j11, atomActionDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final long getSeconds() {
        return this.seconds;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final PendingActionDTO copy(long seconds, @NotNull AtomActionDTO action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return new PendingActionDTO(seconds, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PendingActionDTO)) {
            return false;
        }
        PendingActionDTO pendingActionDTO = (PendingActionDTO) other;
        return this.seconds == pendingActionDTO.seconds && Intrinsics.d(this.action, pendingActionDTO.action);
    }

    @NotNull
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final long getSeconds() {
        return this.seconds;
    }

    public int hashCode() {
        return this.action.hashCode() + (Long.hashCode(this.seconds) * 31);
    }

    @NotNull
    public String toString() {
        return "PendingActionDTO(seconds=" + this.seconds + ", action=" + this.action + ")";
    }

    public /* synthetic */ PendingActionDTO(long j11, AtomActionDTO atomActionDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0L : j11, atomActionDTO);
    }
}
