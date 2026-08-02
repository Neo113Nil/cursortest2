package ru.ozon.app.android.network.interceptors;

import Ib.a;
import Sc.InterfaceC4008j;
import Sc.k;
import We.A;
import We.B;
import We.G;
import We.L;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.di.NetworkComponentConfig;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0010R\u001b\u0010\u0019\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0010R\u001b\u0010\u001c\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/network/interceptors/DynamicUrlInterceptor;", "Lru/ozon/app/android/network/interceptors/BXInterceptor;", "LIb/a;", "Lru/ozon/app/android/network/di/NetworkComponentConfig;", "config", "<init>", "(LIb/a;)V", "LWe/B$a;", "chain", "LWe/L;", "onIntercept", "(LWe/B$a;)LWe/L;", "", "hostPrefix", "Ljava/lang/String;", "getHostPrefix", "()Ljava/lang/String;", "setHostPrefix", "(Ljava/lang/String;)V", "host$delegate", "LSc/j;", "getHost", "host", "apiUrlSuffix$delegate", "getApiUrlSuffix", "apiUrlSuffix", "", "isSuffixForSameDomain$delegate", "isSuffixForSameDomain", "()Z", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DynamicUrlInterceptor extends BXInterceptor {

    /* renamed from: apiUrlSuffix$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j apiUrlSuffix;

    /* renamed from: host$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j host;
    private volatile String hostPrefix;

    /* renamed from: isSuffixForSameDomain$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j isSuffixForSameDomain;

    public DynamicUrlInterceptor(@NotNull a<NetworkComponentConfig> config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.host = k.b(new DynamicUrlInterceptor$host$2(config));
        this.apiUrlSuffix = k.b(new DynamicUrlInterceptor$apiUrlSuffix$2(config));
        this.isSuffixForSameDomain = k.b(new DynamicUrlInterceptor$isSuffixForSameDomain$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getApiUrlSuffix() {
        return (String) this.apiUrlSuffix.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getHost() {
        return (String) this.host.getValue();
    }

    private final boolean isSuffixForSameDomain() {
        return ((Boolean) this.isSuffixForSameDomain.getValue()).booleanValue();
    }

    @Override // ru.ozon.app.android.network.interceptors.BXInterceptor
    @NotNull
    protected L onIntercept(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        G request = chain.request();
        A j11 = request.j();
        if (this.hostPrefix != null && Intrinsics.d(j11.h(), getHost()) && isSuffixForSameDomain()) {
            G.a aVar = new G.a(request);
            A.a j12 = j11.j();
            j12.j(this.hostPrefix + "." + getApiUrlSuffix());
            aVar.j(j12.e());
            request = aVar.b();
        }
        return chain.proceed(request);
    }

    public final void setHostPrefix(String str) {
        this.hostPrefix = str;
    }
}
