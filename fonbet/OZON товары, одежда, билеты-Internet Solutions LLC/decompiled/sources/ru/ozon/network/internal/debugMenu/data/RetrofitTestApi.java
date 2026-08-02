package ru.ozon.network.internal.debugMenu.data;

import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Url;
import uf0.InterfaceC10056a;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/network/internal/debugMenu/data/RetrofitTestApi;", "", "", ImagesContract.URL, "Luf0/a;", "", "executeGetHttpRequest", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "ozon-network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface RetrofitTestApi {
    @GET
    Object executeGetHttpRequest(@Url @NotNull String str, @NotNull d<? super InterfaceC10056a<Unit>> dVar);
}
