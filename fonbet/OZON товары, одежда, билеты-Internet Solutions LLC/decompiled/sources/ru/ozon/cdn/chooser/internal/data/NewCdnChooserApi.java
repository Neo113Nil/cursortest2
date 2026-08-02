package ru.ozon.cdn.chooser.internal.data;

import bZ.InterfaceC5607a;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import ru.ozon.cdn.chooser.internal.data.dto.CdnConfigResponse;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/cdn/chooser/internal/data/NewCdnChooserApi;", "LbZ/a;", "Lru/ozon/cdn/chooser/internal/data/dto/CdnConfigResponse;", "getCDNConfig", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "cdn-chooser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface NewCdnChooserApi extends InterfaceC5607a {
    @Override // bZ.InterfaceC5607a
    @GET("api/composer-api.bx/_action/getCDNConf")
    Object getCDNConfig(@NotNull d<? super CdnConfigResponse> dVar);
}
