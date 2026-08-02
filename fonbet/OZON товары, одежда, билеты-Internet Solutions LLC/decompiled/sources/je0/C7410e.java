package je0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ru.ozon.mapsdk.common.geoproxy.data.ComposerGeoProxyApi;
import ru.ozon.mapsdk.common.geoproxy.data.GeoProxyApi;
import ru.ozon.mapsdk.common.geoproxy.model.AppDomainApiHost;
import ru.ozon.mapsdk.common.geoproxy.model.ComposerApiHost;
import ru.ozon.mapsdk.common.geoproxy.model.UNCAppDomainApiHost;

/* renamed from: je0.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C7410e extends AbstractC7737t implements Function0<C7408c> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC7412g f69969b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7410e(AbstractC7412g abstractC7412g) {
        super(0);
        this.f69969b = abstractC7412g;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C7408c invoke() {
        Retrofit.Builder builder = new Retrofit.Builder();
        AbstractC7412g abstractC7412g = this.f69969b;
        Retrofit build = builder.client(abstractC7412g.d()).baseUrl(abstractC7412g.b().getHost().getUrl()).addConverterFactory(GsonConverterFactory.create(abstractC7412g.c())).build();
        return ((abstractC7412g.b().getHost() instanceof ComposerApiHost) || (abstractC7412g.b().getHost() instanceof AppDomainApiHost) || (abstractC7412g.b().getHost() instanceof UNCAppDomainApiHost)) ? new C7408c((ComposerGeoProxyApi) build.create(ComposerGeoProxyApi.class), null, 2) : new C7408c(null, (GeoProxyApi) build.create(GeoProxyApi.class), 1);
    }
}
