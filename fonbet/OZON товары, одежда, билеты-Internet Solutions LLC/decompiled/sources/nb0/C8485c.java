package nb0;

import Hb0.f;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.r;
import Sc.s;
import We.G;
import android.app.Application;
import android.net.LinkProperties;
import android.net.NetworkCapabilities;
import android.net.ProxyInfo;
import android.util.Base64;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import qj.C9067a;
import qj.C9070d;
import ru.ozon.android.networkinfo.models.NetworkInfo;

/* renamed from: nb0.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C8485c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Hb0.c> f76723a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f76724b;

    public C8485c(@NotNull InterfaceC4008j featureFlagsStore, @NotNull Application context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(featureFlagsStore, "featureFlagsStore");
        this.f76723a = featureFlagsStore;
        this.f76724b = k.b(new C8484b(context));
    }

    private static String b(List list) {
        List list2 = list;
        if (list2.isEmpty()) {
            list2 = null;
        }
        List list3 = list2;
        if (list3 != null) {
            return C7714v.V(list3, ",", null, null, null, 62);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [Sc.r$b] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.ArrayList] */
    @NotNull
    public final G a(@NotNull G request) {
        Pair pair;
        NetworkInfo h11;
        ?? r62;
        LinkProperties linkProperties;
        List<InetAddress> dnsServers;
        LinkProperties linkProperties2;
        NetworkCapabilities capabilities;
        NetworkCapabilities capabilities2;
        Intrinsics.checkNotNullParameter(request, "request");
        if (((Boolean) this.f76723a.getValue().b(f.b.f10796a)).booleanValue()) {
            try {
                r.Companion companion = r.INSTANCE;
                h11 = ((C9067a) this.f76724b.getValue()).h(C9070d.f82206b);
                NetworkInfo.Available available = h11 instanceof NetworkInfo.Available ? (NetworkInfo.Available) h11 : null;
                Boolean valueOf = (available == null || (capabilities2 = available.getCapabilities()) == null) ? null : Boolean.valueOf(capabilities2.hasTransport(4));
                Boolean valueOf2 = (available == null || (capabilities = available.getCapabilities()) == null) ? null : Boolean.valueOf(capabilities.hasCapability(15));
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                Intrinsics.checkNotNullExpressionValue(networkInterfaces, "getNetworkInterfaces(...)");
                ArrayList list = Collections.list(networkInterfaces);
                Intrinsics.checkNotNullExpressionValue(list, "list(...)");
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String name = ((NetworkInterface) it.next()).getName();
                    if (name != null) {
                        arrayList.add(name);
                    }
                }
                ProxyInfo httpProxy = (available == null || (linkProperties2 = available.getLinkProperties()) == null) ? null : linkProperties2.getHttpProxy();
                if (available == null || (linkProperties = available.getLinkProperties()) == null || (dnsServers = linkProperties.getDnsServers()) == null) {
                    r62 = 0;
                } else {
                    r62 = new ArrayList();
                    Iterator it2 = dnsServers.iterator();
                    while (it2.hasNext()) {
                        String hostAddress = ((InetAddress) it2.next()).getHostAddress();
                        if (hostAddress != null) {
                            r62.add(hostAddress);
                        }
                    }
                }
                if (r62 == 0) {
                    r62 = K.f71697a;
                }
                byte[] bytes = C7714v.V(C7714v.b0(new Pair("vpn", String.valueOf(valueOf)), new Pair("noVpn", String.valueOf(valueOf2)), new Pair("scoped", b(arrayList)), new Pair("pHost", httpProxy != null ? httpProxy.getHost() : null), new Pair("pPort", httpProxy != null ? Integer.valueOf(httpProxy.getPort()).toString() : null), new Pair("dns", b(r62))), "&", null, null, new C8483a(this), 30).getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                String encodeToString = Base64.encodeToString(bytes, 3);
                Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(...)");
                pair = new Pair("x-ad-params", encodeToString);
            } catch (Throwable th2) {
                r.Companion companion2 = r.INSTANCE;
                pair = s.a(th2);
            }
            r.Companion companion3 = r.INSTANCE;
            r1 = pair instanceof r.b ? null : pair;
        }
        if (r1 == null) {
            return request;
        }
        String str = (String) r1.a();
        String str2 = (String) r1.b();
        request.getClass();
        G.a aVar = new G.a(request);
        aVar.d(str, str2);
        return aVar.b();
    }
}
