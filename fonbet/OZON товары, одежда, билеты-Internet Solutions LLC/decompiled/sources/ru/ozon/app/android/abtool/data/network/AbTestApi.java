package ru.ozon.app.android.abtool.data.network;

import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/abtool/data/network/AbTestApi;", "", "Lru/ozon/app/android/abtool/data/network/ConfigsRequest;", "request", "Lru/ozon/app/android/abtool/data/network/ConfigsResponse;", "getConfigs", "(Lru/ozon/app/android/abtool/data/network/ConfigsRequest;Lkotlin/coroutines/d;)Ljava/lang/Object;", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AbTestApi {
    Object getConfigs(@Body @NotNull ConfigsRequest configsRequest, @NotNull d<? super ConfigsResponse> dVar);
}
