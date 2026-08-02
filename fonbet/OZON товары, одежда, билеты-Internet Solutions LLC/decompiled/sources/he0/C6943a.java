package he0;

import Sc.InterfaceC4008j;
import Sc.k;
import com.google.gson.Gson;
import com.google.gson.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.geoproxy.data.customconverters.MapProviderSdkTypeConverter;
import ru.ozon.mapsdk.common.geoproxy.data.customconverters.ProviderSuggestAdapter;
import ru.ozon.mapsdk.common.geoproxy.data.customconverters.VectorDataConvertor;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;
import ru.ozon.mapsdk.common.geoproxy.data.model.VectorData;
import ru.ozon.mapsdk.common.storage.convertors.MapGeoProviderConfigCacheConvertor;
import ru.ozon.mapsdk.common.storage.convertors.MapSdkTypeCacheConvertor;

/* renamed from: he0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6943a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f65488a = k.b(b.f65491b);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f65489b = k.b(C1066a.f65490b);

    /* renamed from: he0.a$a, reason: collision with other inner class name */
    static final class C1066a extends AbstractC7737t implements Function0<Gson> {

        /* renamed from: b, reason: collision with root package name */
        public static final C1066a f65490b = new C1066a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Gson invoke() {
            f fVar = new f();
            fVar.c(GeoProviderConfig.class, new MapGeoProviderConfigCacheConvertor());
            fVar.c(GeoProviderConfig.SdkType.class, new MapSdkTypeCacheConvertor());
            fVar.c(VectorData.class, new VectorDataConvertor());
            fVar.e();
            return fVar.a();
        }
    }

    /* renamed from: he0.a$b */
    static final class b extends AbstractC7737t implements Function0<Gson> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f65491b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final Gson invoke() {
            f fVar = new f();
            fVar.c(GeoProviderConfig.SdkType.class, new MapProviderSdkTypeConverter());
            fVar.c(GeoProviderConfig.ProviderSuggest.class, new ProviderSuggestAdapter());
            fVar.e();
            return fVar.a();
        }
    }

    @NotNull
    public static Gson a() {
        Object value = f65489b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Gson) value;
    }

    @NotNull
    public static Gson b() {
        Object value = f65488a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Gson) value;
    }
}
