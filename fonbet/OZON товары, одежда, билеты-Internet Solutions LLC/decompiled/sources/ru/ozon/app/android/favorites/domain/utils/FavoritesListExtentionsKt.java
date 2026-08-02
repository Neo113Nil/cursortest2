package ru.ozon.app.android.favorites.domain.utils;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.R$string;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.utils.FavoritesListsException;
import ru.ozon.app.android.uikit.text.StringProvider;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toMessage", "", "", "favorites_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FavoritesListExtentionsKt {
    @NotNull
    public static final String toMessage(@NotNull Throwable th2) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        if (!(th2 instanceof FavoritesListsException)) {
            return ((th2 instanceof UnknownHostException) || (th2 instanceof ConnectException) || (th2 instanceof SocketTimeoutException)) ? StringProvider.getString(R$string.common_message_not_internet) : StringProvider.getString(ru.ozon.app.android.uikit.R$string.error_common_message_service_error);
        }
        String message = th2.getMessage();
        return message == null ? StringProvider.getString(ru.ozon.app.android.uikit.R$string.error_common_message_service_error) : message;
    }
}
