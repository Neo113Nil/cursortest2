package ru.ozon.app.android.actionHandlers.monetization.confirmBloggerChannel;

import com.squareup.moshi.j;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/actionHandlers/monetization/confirmBloggerChannel/ConfirmBloggerChannelResponse;", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "refreshPaths", "", "", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Set;)V", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getRefreshPaths", "()Ljava/util/Set;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ConfirmBloggerChannelResponse {
    private final AtomActionDTO action;
    private final Set<String> refreshPaths;

    public ConfirmBloggerChannelResponse(AtomActionDTO atomActionDTO, Set<String> set) {
        this.action = atomActionDTO;
        this.refreshPaths = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConfirmBloggerChannelResponse copy$default(ConfirmBloggerChannelResponse confirmBloggerChannelResponse, AtomActionDTO atomActionDTO, Set set, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            atomActionDTO = confirmBloggerChannelResponse.action;
        }
        if ((i11 & 2) != 0) {
            set = confirmBloggerChannelResponse.refreshPaths;
        }
        return confirmBloggerChannelResponse.copy(atomActionDTO, set);
    }

    /* renamed from: component1, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Set<String> component2() {
        return this.refreshPaths;
    }

    @NotNull
    public final ConfirmBloggerChannelResponse copy(AtomActionDTO action, Set<String> refreshPaths) {
        return new ConfirmBloggerChannelResponse(action, refreshPaths);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfirmBloggerChannelResponse)) {
            return false;
        }
        ConfirmBloggerChannelResponse confirmBloggerChannelResponse = (ConfirmBloggerChannelResponse) other;
        return Intrinsics.d(this.action, confirmBloggerChannelResponse.action) && Intrinsics.d(this.refreshPaths, confirmBloggerChannelResponse.refreshPaths);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Set<String> getRefreshPaths() {
        return this.refreshPaths;
    }

    public int hashCode() {
        AtomActionDTO atomActionDTO = this.action;
        int hashCode = (atomActionDTO == null ? 0 : atomActionDTO.hashCode()) * 31;
        Set<String> set = this.refreshPaths;
        return hashCode + (set != null ? set.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ConfirmBloggerChannelResponse(action=" + this.action + ", refreshPaths=" + this.refreshPaths + ")";
    }
}
