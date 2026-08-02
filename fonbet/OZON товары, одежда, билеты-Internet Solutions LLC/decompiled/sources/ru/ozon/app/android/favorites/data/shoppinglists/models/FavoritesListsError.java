package ru.ozon.app.android.favorites.data.shoppinglists.models;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/favorites/data/shoppinglists/models/FavoritesListsError;", "", "error", "", "errorForUser", "errorType", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getError", "()Ljava/lang/String;", "getErrorForUser", "getErrorType", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FavoritesListsError {
    private final AtomActionDTO action;

    @NotNull
    private final String error;

    @NotNull
    private final String errorForUser;

    @NotNull
    private final String errorType;

    public FavoritesListsError(@NotNull String error, @NotNull String errorForUser, @NotNull String errorType, AtomActionDTO atomActionDTO) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(errorForUser, "errorForUser");
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        this.error = error;
        this.errorForUser = errorForUser;
        this.errorType = errorType;
        this.action = atomActionDTO;
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final String getError() {
        return this.error;
    }

    @NotNull
    public final String getErrorForUser() {
        return this.errorForUser;
    }

    @NotNull
    public final String getErrorType() {
        return this.errorType;
    }
}
