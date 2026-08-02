package je0;

import Sc.o;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;
import ru.ozon.mapsdk.common.geoproxy.model.ActualBXTab;
import ru.ozon.mapsdk.common.geoproxy.model.PreferredProvider;

/* renamed from: je0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7409d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private ActualBXTab f69959a = ActualBXTab.NONE;

    /* renamed from: b, reason: collision with root package name */
    private GeoProviderConfig f69960b;

    /* renamed from: c, reason: collision with root package name */
    private GeoProviderConfig f69961c;

    /* renamed from: d, reason: collision with root package name */
    private PreferredProvider f69962d;

    /* renamed from: e, reason: collision with root package name */
    private PreferredProvider f69963e;

    /* renamed from: f, reason: collision with root package name */
    private PreferredProvider f69964f;

    /* renamed from: g, reason: collision with root package name */
    private PreferredProvider f69965g;

    /* renamed from: h, reason: collision with root package name */
    private PreferredProvider f69966h;

    /* renamed from: i, reason: collision with root package name */
    private PreferredProvider f69967i;

    /* renamed from: je0.d$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f69968a;

        static {
            int[] iArr = new int[PreferredProvider.Type.values().length];
            try {
                iArr[PreferredProvider.Type.SUGGEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PreferredProvider.Type.GEOCODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PreferredProvider.Type.REVGEOCODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f69968a = iArr;
        }
    }

    @NotNull
    protected final ActualBXTab a() {
        return this.f69959a;
    }

    protected final List<String> b(@NotNull PreferredProvider.Type providerType) {
        Intrinsics.checkNotNullParameter(providerType, "providerType");
        int i11 = a.f69968a[providerType.ordinal()];
        if (i11 == 1) {
            PreferredProvider preferredProvider = this.f69965g;
            if (preferredProvider != null) {
                return preferredProvider.getProviders();
            }
            return null;
        }
        if (i11 == 2) {
            PreferredProvider preferredProvider2 = this.f69966h;
            if (preferredProvider2 != null) {
                return preferredProvider2.getProviders();
            }
            return null;
        }
        if (i11 != 3) {
            throw new o();
        }
        PreferredProvider preferredProvider3 = this.f69967i;
        if (preferredProvider3 != null) {
            return preferredProvider3.getProviders();
        }
        return null;
    }

    protected final GeoProviderConfig c() {
        return this.f69961c;
    }

    public abstract List<String> d(@NotNull PreferredProvider.Type type);

    protected final List<String> e(@NotNull PreferredProvider.Type providerType) {
        Intrinsics.checkNotNullParameter(providerType, "providerType");
        int i11 = a.f69968a[providerType.ordinal()];
        if (i11 == 1) {
            PreferredProvider preferredProvider = this.f69962d;
            if (preferredProvider != null) {
                return preferredProvider.getProviders();
            }
            return null;
        }
        if (i11 == 2) {
            PreferredProvider preferredProvider2 = this.f69963e;
            if (preferredProvider2 != null) {
                return preferredProvider2.getProviders();
            }
            return null;
        }
        if (i11 != 3) {
            throw new o();
        }
        PreferredProvider preferredProvider3 = this.f69964f;
        if (preferredProvider3 != null) {
            return preferredProvider3.getProviders();
        }
        return null;
    }

    protected final GeoProviderConfig f() {
        return this.f69960b;
    }

    protected final void g() {
        List<String> a02;
        String suggestProvider;
        List<String> a03;
        String suggestProvider2;
        PreferredProvider.Type type = PreferredProvider.Type.SUGGEST;
        GeoProviderConfig geoProviderConfig = this.f69960b;
        if (geoProviderConfig == null || (a02 = geoProviderConfig.parseSuggestPreferredProvider()) == null) {
            GeoProviderConfig geoProviderConfig2 = this.f69960b;
            a02 = (geoProviderConfig2 == null || (suggestProvider = geoProviderConfig2.getSuggestProvider()) == null) ? null : C7714v.a0(suggestProvider);
        }
        this.f69962d = new PreferredProvider(type, a02);
        PreferredProvider.Type type2 = PreferredProvider.Type.GEOCODE;
        GeoProviderConfig geoProviderConfig3 = this.f69960b;
        this.f69963e = new PreferredProvider(type2, geoProviderConfig3 != null ? geoProviderConfig3.parseGeocodePreferredProvider() : null);
        PreferredProvider.Type type3 = PreferredProvider.Type.REVGEOCODE;
        GeoProviderConfig geoProviderConfig4 = this.f69960b;
        this.f69964f = new PreferredProvider(type3, geoProviderConfig4 != null ? geoProviderConfig4.parseRevGeocodePreferredProvider() : null);
        GeoProviderConfig geoProviderConfig5 = this.f69961c;
        if (geoProviderConfig5 == null || (a03 = geoProviderConfig5.parseSuggestPreferredProvider()) == null) {
            GeoProviderConfig geoProviderConfig6 = this.f69961c;
            a03 = (geoProviderConfig6 == null || (suggestProvider2 = geoProviderConfig6.getSuggestProvider()) == null) ? null : C7714v.a0(suggestProvider2);
        }
        this.f69965g = new PreferredProvider(type, a03);
        GeoProviderConfig geoProviderConfig7 = this.f69961c;
        this.f69966h = new PreferredProvider(type2, geoProviderConfig7 != null ? geoProviderConfig7.parseGeocodePreferredProvider() : null);
        GeoProviderConfig geoProviderConfig8 = this.f69961c;
        this.f69967i = new PreferredProvider(type3, geoProviderConfig8 != null ? geoProviderConfig8.parseRevGeocodePreferredProvider() : null);
    }

    protected final void h(@NotNull ActualBXTab actualBXTab) {
        Intrinsics.checkNotNullParameter(actualBXTab, "<set-?>");
        this.f69959a = actualBXTab;
    }

    protected final void i(GeoProviderConfig geoProviderConfig) {
        this.f69961c = geoProviderConfig;
    }

    protected final void j(GeoProviderConfig geoProviderConfig) {
        this.f69960b = geoProviderConfig;
    }
}
