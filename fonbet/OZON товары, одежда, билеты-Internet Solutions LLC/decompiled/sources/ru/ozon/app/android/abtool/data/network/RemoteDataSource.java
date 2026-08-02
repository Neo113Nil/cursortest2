package ru.ozon.app.android.abtool.data.network;

import Sc.InterfaceC4008j;
import Sc.r;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.FeatureServiceConfig;
import ru.ozon.app.android.storefront.widgets.feedback.result.data.ResultDTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/abtool/data/network/RemoteDataSource;", "", "Lru/ozon/app/android/abtool/FeatureServiceConfig;", "config", "LSc/j;", "Lru/ozon/app/android/abtool/data/network/AbTestApi;", "abTestApi", "<init>", "(Lru/ozon/app/android/abtool/FeatureServiceConfig;LSc/j;)V", "", "", ResultDTO.CONTENT_TYPE_SERVICES, "LSc/r;", "Lru/ozon/app/android/abtool/data/network/ConfigsResponse;", "getConfigs-gIAlu-s", "(Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "getConfigs", "Lru/ozon/app/android/abtool/FeatureServiceConfig;", "LSc/j;", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RemoteDataSource {

    @NotNull
    private final InterfaceC4008j<AbTestApi> abTestApi;

    @NotNull
    private final FeatureServiceConfig config;

    /* JADX WARN: Multi-variable type inference failed */
    public RemoteDataSource(@NotNull FeatureServiceConfig config, @NotNull InterfaceC4008j<? extends AbTestApi> abTestApi) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(abTestApi, "abTestApi");
        this.config = config;
        this.abTestApi = abTestApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* renamed from: getConfigs-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m451getConfigsgIAlus(@NotNull List<String> list, @NotNull d<? super r<ConfigsResponse>> dVar) {
        RemoteDataSource$getConfigs$1 remoteDataSource$getConfigs$1;
        int i11;
        try {
            if (dVar instanceof RemoteDataSource$getConfigs$1) {
                remoteDataSource$getConfigs$1 = (RemoteDataSource$getConfigs$1) dVar;
                int i12 = remoteDataSource$getConfigs$1.label;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    remoteDataSource$getConfigs$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = remoteDataSource$getConfigs$1.result;
                    a aVar = a.COROUTINE_SUSPENDED;
                    i11 = remoteDataSource$getConfigs$1.label;
                    if (i11 != 0) {
                        s.b(obj);
                        r.Companion companion = r.INSTANCE;
                        AbTestApi value = this.abTestApi.getValue();
                        String namespace = this.config.getNamespace();
                        boolean debug = this.config.getDebug();
                        this.config.getAdditionalParametersProvider();
                        ConfigsRequest configsRequest = new ConfigsRequest(namespace, list, debug, null);
                        remoteDataSource$getConfigs$1.label = 1;
                        obj = value.getConfigs(configsRequest, remoteDataSource$getConfigs$1);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                    }
                    r.Companion companion2 = r.INSTANCE;
                    return obj;
                }
            }
            if (i11 != 0) {
            }
            r.Companion companion22 = r.INSTANCE;
            return obj;
        } catch (Throwable th2) {
            r.Companion companion3 = r.INSTANCE;
            return s.a(th2);
        }
        remoteDataSource$getConfigs$1 = new RemoteDataSource$getConfigs$1(this, dVar);
        Object obj2 = remoteDataSource$getConfigs$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = remoteDataSource$getConfigs$1.label;
    }
}
