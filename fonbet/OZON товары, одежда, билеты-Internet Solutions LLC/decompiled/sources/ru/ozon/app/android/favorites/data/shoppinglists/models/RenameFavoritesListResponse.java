package ru.ozon.app.android.favorites.data.shoppinglists.models;

import B0.A0;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/favorites/data/shoppinglists/models/RenameFavoritesListResponse;", "", "errorForUser", "", "<init>", "(Ljava/lang/String;)V", "getErrorForUser", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class RenameFavoritesListResponse {
    private final String errorForUser;

    public RenameFavoritesListResponse(String str) {
        this.errorForUser = str;
    }

    public static /* synthetic */ RenameFavoritesListResponse copy$default(RenameFavoritesListResponse renameFavoritesListResponse, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = renameFavoritesListResponse.errorForUser;
        }
        return renameFavoritesListResponse.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getErrorForUser() {
        return this.errorForUser;
    }

    @NotNull
    public final RenameFavoritesListResponse copy(String errorForUser) {
        return new RenameFavoritesListResponse(errorForUser);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RenameFavoritesListResponse) && Intrinsics.d(this.errorForUser, ((RenameFavoritesListResponse) other).errorForUser);
    }

    public final String getErrorForUser() {
        return this.errorForUser;
    }

    public int hashCode() {
        String str = this.errorForUser;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return A0.b("RenameFavoritesListResponse(errorForUser=", this.errorForUser, ")");
    }
}
