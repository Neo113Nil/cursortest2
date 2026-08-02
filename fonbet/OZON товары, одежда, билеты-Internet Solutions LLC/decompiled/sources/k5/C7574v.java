package k5;

import android.annotation.SuppressLint;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkInfo;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.util.Iterator;

/* renamed from: k5.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7574v extends D0<String> {

    /* renamed from: e, reason: collision with root package name */
    private final ConnectivityManager f70874e;

    static {
        C7563s0.a(new byte[]{-21, -61, 19, -52, Byte.MAX_VALUE, 21, -78, 93, -80, -41, -100, -110, 85, -97, 104, 49});
        C7563s0.a(new byte[]{-46, 55, 111, 0, -60, -76, -75, 31, -126, -29, 22, -105, 94, -80, -24, 119});
        C7563s0.a(new byte[]{-1, -93, -64, -112, -55, -44, -5, 9, 92, -112, -89, 122, -3, -90, 35, 8});
        C7563s0.a(new byte[]{83, 75, -112, -69, 44, -84, 48, 8, 4, -100, -35, -15, 28, -99, -115, 32});
    }

    C7574v(ConnectivityManager connectivityManager) {
        super(Mm0.e.DnsIP);
        this.f70874e = connectivityManager;
    }

    @SuppressLint({"HardwareIds"})
    private String w() throws P2 {
        LinkProperties linkProperties;
        ConnectivityManager connectivityManager = this.f70874e;
        if (connectivityManager == null) {
            throw new P2(C7563s0.a(new byte[]{123, 23, -64, 85, -4, 69, 71, -102, 29, -62, 79, -54, 89, 100, -69, -84, 4, -102, -86, -67, 49, 44, 2, 46, -85, 10, -123, -71, 109, 37, 34, 19}));
        }
        StringBuilder sb2 = new StringBuilder();
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
            if (networkInfo != null && networkInfo.isConnected() && (linkProperties = connectivityManager.getLinkProperties(network)) != null) {
                Iterator<InetAddress> it = linkProperties.getDnsServers().iterator();
                while (it.hasNext()) {
                    sb2.append(it.next());
                    sb2.append(C7563s0.a(new byte[]{91, -119, -16, -117, -91, -64, 2, 25, 94, -21, -40, -106, -36, 105, -23, -34}));
                }
            }
        }
        return sb2.toString();
    }

    @Override // k5.D0
    @NonNull
    protected final String s() throws D1 {
        C7563s0.a(new byte[]{57, 113, -35, -27, -115, -45, -57, -75, -111, 90, -74, 36, -56, 66, 57, -73});
        try {
            String w11 = w();
            if (!w11.isEmpty()) {
                w11 = w11.substring(0, w11.length() - 1);
            }
            return w11.replaceAll(C7563s0.a(new byte[]{54, 63, -42, 79, -102, -16, -107, -70, 115, -6, 77, 106, -85, -20, 82, -88}), C7563s0.a(new byte[]{57, 113, -35, -27, -115, -45, -57, -75, -111, 90, -74, 36, -56, 66, 57, -73}));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | NullPointerException | InvocationTargetException e11) {
            throw new P2(e11.getMessage(), e11);
        }
    }
}
