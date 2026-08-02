package ru.ozon.app.android.session.deleteAccount.data;

import io.reactivex.y;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Url;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0016\b\u0001\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bH'¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/data/DeleteAccountApi;", "", "", "action", "Lio/reactivex/y;", "Lru/ozon/app/android/session/deleteAccount/data/DeleteAccountStartResponse;", "deleteAccountStartRequest", "(Ljava/lang/String;)Lio/reactivex/y;", "", "body", "Lru/ozon/app/android/session/deleteAccount/data/DeleteAccountApiResponse;", "deleteAccountRequest", "(Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/y;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface DeleteAccountApi {
    @POST
    @NotNull
    y<DeleteAccountApiResponse> deleteAccountRequest(@Url @NotNull String action, @Body Map<String, String> body);

    @POST
    @NotNull
    y<DeleteAccountStartResponse> deleteAccountStartRequest(@Url @NotNull String action);
}
