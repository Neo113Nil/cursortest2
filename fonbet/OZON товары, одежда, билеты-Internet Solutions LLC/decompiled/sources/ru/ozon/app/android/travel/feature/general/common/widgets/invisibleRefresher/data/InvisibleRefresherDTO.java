package ru.ozon.app.android.travel.feature.general.common.widgets.invisibleRefresher.data;

import Bi.b;
import Ih.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/invisibleRefresher/data/InvisibleRefresherDTO;", "", "timeout", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "isSilentRefresh", "", "<init>", "(JLru/ozon/uni/atoms/data/AtomActionDTO;Z)V", "getTimeout", "()J", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class InvisibleRefresherDTO {
    public static final int $stable = 0;

    @NotNull
    private final AtomActionDTO action;
    private final boolean isSilentRefresh;
    private final long timeout;

    public InvisibleRefresherDTO(long j11, @NotNull AtomActionDTO action, boolean z11) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.timeout = j11;
        this.action = action;
        this.isSilentRefresh = z11;
    }

    public static /* synthetic */ InvisibleRefresherDTO copy$default(InvisibleRefresherDTO invisibleRefresherDTO, long j11, AtomActionDTO atomActionDTO, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = invisibleRefresherDTO.timeout;
        }
        if ((i11 & 2) != 0) {
            atomActionDTO = invisibleRefresherDTO.action;
        }
        if ((i11 & 4) != 0) {
            z11 = invisibleRefresherDTO.isSilentRefresh;
        }
        return invisibleRefresherDTO.copy(j11, atomActionDTO, z11);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTimeout() {
        return this.timeout;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSilentRefresh() {
        return this.isSilentRefresh;
    }

    @NotNull
    public final InvisibleRefresherDTO copy(long timeout, @NotNull AtomActionDTO action, boolean isSilentRefresh) {
        Intrinsics.checkNotNullParameter(action, "action");
        return new InvisibleRefresherDTO(timeout, action, isSilentRefresh);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvisibleRefresherDTO)) {
            return false;
        }
        InvisibleRefresherDTO invisibleRefresherDTO = (InvisibleRefresherDTO) other;
        return this.timeout == invisibleRefresherDTO.timeout && Intrinsics.d(this.action, invisibleRefresherDTO.action) && this.isSilentRefresh == invisibleRefresherDTO.isSilentRefresh;
    }

    @NotNull
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final long getTimeout() {
        return this.timeout;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSilentRefresh) + a.b(this.action, Long.hashCode(this.timeout) * 31, 31);
    }

    public final boolean isSilentRefresh() {
        return this.isSilentRefresh;
    }

    @NotNull
    public String toString() {
        long j11 = this.timeout;
        AtomActionDTO atomActionDTO = this.action;
        boolean z11 = this.isSilentRefresh;
        StringBuilder sb2 = new StringBuilder("InvisibleRefresherDTO(timeout=");
        sb2.append(j11);
        sb2.append(", action=");
        sb2.append(atomActionDTO);
        return b.f(sb2, ", isSilentRefresh=", z11, ")");
    }

    public /* synthetic */ InvisibleRefresherDTO(long j11, AtomActionDTO atomActionDTO, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, atomActionDTO, (i11 & 4) != 0 ? false : z11);
    }
}
