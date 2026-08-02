package defpackage;

import android.content.Context;
import com.sofascore.model.branding.ServerBrandingConfig;
import com.sofascore.model.branding.ServerBrandingTournament;
import com.unity3d.ads.core.data.datasource.AnalyticsDataSource;
import com.unity3d.ads.core.data.datasource.FIdExistenceDataSource;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.datasource.TcfDataSource;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.AdRevenueRepository;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.GetAssetFileName;
import com.unity3d.ads.core.domain.GetByteStringId;
import com.unity3d.ads.core.domain.GetCacheDirectory;
import com.unity3d.ads.core.domain.GetSafeguardedInitializationPolicy;
import com.unity3d.ads.core.domain.HandleDebugSettings;
import com.unity3d.ads.core.domain.MediationProviderParser;
import com.unity3d.ads.core.domain.RemoveUrlQuery;
import com.unity3d.ads.core.domain.billing.IsBillingClientAvailable;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.network.core.CronetEngineBuilderFactory;
import com.unity3d.services.core.properties.ClientProperties;
import java.util.Arrays;
import java.util.ServiceConfigurationError;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class m6h implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ m6h(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ServiceConfigurationError serviceConfigurationError;
        KSerializer _childSerializers$_anonymous_$1;
        KSerializer _childSerializers$_anonymous_$2;
        KSerializer _childSerializers$_anonymous_$3;
        KSerializer _childSerializers$_anonymous_$4;
        KSerializer _childSerializers$_anonymous_$5;
        KSerializer _childSerializers$_anonymous_;
        Context applicationContext;
        FIdExistenceDataSource initialize$lambda$220$lambda$206;
        HandleDebugSettings initialize$lambda$220$lambda$214;
        IsBillingClientAvailable initialize$lambda$220$lambda$216;
        GetSafeguardedInitializationPolicy initialize$lambda$220$lambda$218;
        CronetEngineBuilderFactory initialize$lambda$220$lambda$32;
        TcfDataSource initialize$lambda$220$lambda$36;
        AnalyticsDataSource initialize$lambda$220$lambda$43;
        LifecycleDataSource initialize$lambda$220$lambda$47;
        CreateFile initialize$lambda$220$lambda$51;
        RemoveUrlQuery initialize$lambda$220$lambda$53;
        OmidManager initialize$lambda$220$lambda$61;
        SDKPropertiesManager initialize$lambda$220$lambda$62;
        StorageManager initialize$lambda$220$lambda$63;
        AdRepository initialize$lambda$220$lambda$67;
        GetCacheDirectory initialize$lambda$220$lambda$69;
        GetAssetFileName initialize$lambda$220$lambda$70;
        MediationProviderParser initialize$lambda$220$lambda$76;
        TransactionEventRepository initialize$lambda$220$lambda$81;
        AdRevenueRepository initialize$lambda$220$lambda$82;
        OperativeEventRepository initialize$lambda$220$lambda$83;
        GetByteStringId initialize$lambda$220$lambda$85;
        switch (this.a) {
            case 0:
                _childSerializers$_anonymous_$1 = ServerBrandingConfig._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$1;
            case 1:
                _childSerializers$_anonymous_$2 = ServerBrandingConfig._childSerializers$_anonymous_$2();
                return _childSerializers$_anonymous_$2;
            case 2:
                _childSerializers$_anonymous_$3 = ServerBrandingConfig._childSerializers$_anonymous_$3();
                return _childSerializers$_anonymous_$3;
            case 3:
                _childSerializers$_anonymous_$4 = ServerBrandingConfig._childSerializers$_anonymous_$4();
                return _childSerializers$_anonymous_$4;
            case 4:
                _childSerializers$_anonymous_$5 = ServerBrandingConfig._childSerializers$_anonymous_$5();
                return _childSerializers$_anonymous_$5;
            case 5:
                _childSerializers$_anonymous_ = ServerBrandingTournament._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 6:
                try {
                    return fcp.n0(i5h.q(e5h.b(Arrays.asList(new qod()).iterator())));
                } finally {
                }
            case 7:
                try {
                    return fcp.n0(i5h.q(e5h.b(Arrays.asList(new wx8(), new toi()).iterator())));
                } finally {
                }
            case 8:
                applicationContext = ClientProperties.getApplicationContext();
                return applicationContext;
            case 9:
                initialize$lambda$220$lambda$206 = ServiceProvider.initialize$lambda$220$lambda$206();
                return initialize$lambda$220$lambda$206;
            case 10:
                initialize$lambda$220$lambda$214 = ServiceProvider.initialize$lambda$220$lambda$214();
                return initialize$lambda$220$lambda$214;
            case 11:
                initialize$lambda$220$lambda$216 = ServiceProvider.initialize$lambda$220$lambda$216();
                return initialize$lambda$220$lambda$216;
            case 12:
                initialize$lambda$220$lambda$218 = ServiceProvider.initialize$lambda$220$lambda$218();
                return initialize$lambda$220$lambda$218;
            case 13:
                initialize$lambda$220$lambda$32 = ServiceProvider.initialize$lambda$220$lambda$32();
                return initialize$lambda$220$lambda$32;
            case 14:
                initialize$lambda$220$lambda$36 = ServiceProvider.initialize$lambda$220$lambda$36();
                return initialize$lambda$220$lambda$36;
            case 15:
                initialize$lambda$220$lambda$43 = ServiceProvider.initialize$lambda$220$lambda$43();
                return initialize$lambda$220$lambda$43;
            case 16:
                initialize$lambda$220$lambda$47 = ServiceProvider.initialize$lambda$220$lambda$47();
                return initialize$lambda$220$lambda$47;
            case 17:
                initialize$lambda$220$lambda$51 = ServiceProvider.initialize$lambda$220$lambda$51();
                return initialize$lambda$220$lambda$51;
            case 18:
                initialize$lambda$220$lambda$53 = ServiceProvider.initialize$lambda$220$lambda$53();
                return initialize$lambda$220$lambda$53;
            case 19:
                initialize$lambda$220$lambda$61 = ServiceProvider.initialize$lambda$220$lambda$61();
                return initialize$lambda$220$lambda$61;
            case 20:
                initialize$lambda$220$lambda$62 = ServiceProvider.initialize$lambda$220$lambda$62();
                return initialize$lambda$220$lambda$62;
            case 21:
                initialize$lambda$220$lambda$63 = ServiceProvider.initialize$lambda$220$lambda$63();
                return initialize$lambda$220$lambda$63;
            case 22:
                initialize$lambda$220$lambda$67 = ServiceProvider.initialize$lambda$220$lambda$67();
                return initialize$lambda$220$lambda$67;
            case 23:
                initialize$lambda$220$lambda$69 = ServiceProvider.initialize$lambda$220$lambda$69();
                return initialize$lambda$220$lambda$69;
            case 24:
                initialize$lambda$220$lambda$70 = ServiceProvider.initialize$lambda$220$lambda$70();
                return initialize$lambda$220$lambda$70;
            case 25:
                initialize$lambda$220$lambda$76 = ServiceProvider.initialize$lambda$220$lambda$76();
                return initialize$lambda$220$lambda$76;
            case 26:
                initialize$lambda$220$lambda$81 = ServiceProvider.initialize$lambda$220$lambda$81();
                return initialize$lambda$220$lambda$81;
            case 27:
                initialize$lambda$220$lambda$82 = ServiceProvider.initialize$lambda$220$lambda$82();
                return initialize$lambda$220$lambda$82;
            case 28:
                initialize$lambda$220$lambda$83 = ServiceProvider.initialize$lambda$220$lambda$83();
                return initialize$lambda$220$lambda$83;
            default:
                initialize$lambda$220$lambda$85 = ServiceProvider.initialize$lambda$220$lambda$85();
                return initialize$lambda$220$lambda$85;
        }
    }
}
