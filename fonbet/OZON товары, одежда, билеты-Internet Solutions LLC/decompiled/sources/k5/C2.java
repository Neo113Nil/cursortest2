package k5;

import androidx.annotation.NonNull;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/* loaded from: classes8.dex */
final class C2 extends D0<String> {
    @Override // k5.D0
    @NonNull
    protected final String s() throws D1 {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if ((nextElement instanceof Inet6Address) && !nextElement.isLoopbackAddress()) {
                        String hostAddress = nextElement.getHostAddress();
                        if (hostAddress == null) {
                            return "";
                        }
                        try {
                            return (hostAddress.isEmpty() || !hostAddress.contains("%")) ? "" : hostAddress.substring(0, hostAddress.indexOf(37));
                        } catch (Error unused) {
                            return hostAddress;
                        }
                    }
                }
            }
            throw new P2("Uncaught exception");
        } catch (SocketException e11) {
            throw new P2(e11.getMessage(), e11);
        }
    }
}
