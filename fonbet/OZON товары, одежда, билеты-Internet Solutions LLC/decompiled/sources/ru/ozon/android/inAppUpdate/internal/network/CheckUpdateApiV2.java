package ru.ozon.android.inAppUpdate.internal.network;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import retrofit2.http.GET;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H'¨\u0006\u0005"}, d2 = {"Lru/ozon/android/inAppUpdate/internal/network/CheckUpdateApiV2;", "", "checkUpdate", "Lretrofit2/Call;", "Lru/ozon/android/inAppUpdate/internal/network/CheckUpdateResponseDTO;", "in-app-update-sdk_googlePlayStoreRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface CheckUpdateApiV2 {
    @GET("mobileDeployer/GetDownloadLink")
    @NotNull
    Call<CheckUpdateResponseDTO> checkUpdate();
}
