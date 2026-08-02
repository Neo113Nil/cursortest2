package ru.ozon.app.android.commonwidgets.widgets.resultheader.domain;

import Ak.C2436a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ0\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/resultheader/domain/ShareListRequest;", "", "id", "", "permission", "", "shareAsManager", "", "<init>", "(JLjava/lang/String;Ljava/lang/Boolean;)V", "getId", "()J", "getPermission", "()Ljava/lang/String;", "getShareAsManager", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(JLjava/lang/String;Ljava/lang/Boolean;)Lru/ozon/app/android/commonwidgets/widgets/resultheader/domain/ShareListRequest;", "equals", "other", "hashCode", "", "toString", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ShareListRequest {
    private final long id;
    private final String permission;
    private final Boolean shareAsManager;

    public ShareListRequest(long j11, String str, Boolean bool) {
        this.id = j11;
        this.permission = str;
        this.shareAsManager = bool;
    }

    public static /* synthetic */ ShareListRequest copy$default(ShareListRequest shareListRequest, long j11, String str, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = shareListRequest.id;
        }
        if ((i11 & 2) != 0) {
            str = shareListRequest.permission;
        }
        if ((i11 & 4) != 0) {
            bool = shareListRequest.shareAsManager;
        }
        return shareListRequest.copy(j11, str, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPermission() {
        return this.permission;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getShareAsManager() {
        return this.shareAsManager;
    }

    @NotNull
    public final ShareListRequest copy(long id2, String permission, Boolean shareAsManager) {
        return new ShareListRequest(id2, permission, shareAsManager);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShareListRequest)) {
            return false;
        }
        ShareListRequest shareListRequest = (ShareListRequest) other;
        return this.id == shareListRequest.id && Intrinsics.d(this.permission, shareListRequest.permission) && Intrinsics.d(this.shareAsManager, shareListRequest.shareAsManager);
    }

    public final long getId() {
        return this.id;
    }

    public final String getPermission() {
        return this.permission;
    }

    public final Boolean getShareAsManager() {
        return this.shareAsManager;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.permission;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.shareAsManager;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.permission;
        Boolean bool = this.shareAsManager;
        StringBuilder c11 = C2436a.c(j11, "ShareListRequest(id=", ", permission=", str);
        c11.append(", shareAsManager=");
        c11.append(bool);
        c11.append(")");
        return c11.toString();
    }

    public /* synthetic */ ShareListRequest(long j11, String str, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : bool);
    }
}
