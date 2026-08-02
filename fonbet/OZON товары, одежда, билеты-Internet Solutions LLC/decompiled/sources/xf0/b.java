package xf0;

import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import qf0.EnumC9053a;

/* loaded from: classes3.dex */
public final class b {
    @NotNull
    public static EnumC9053a a(int i11, @NotNull String domain) {
        Intrinsics.checkNotNullParameter(domain, "domain");
        try {
            InetSocketAddress inetSocketAddress = new InetSocketAddress(h.m0(domain, "/"), i11);
            Socket socket = new Socket();
            try {
                socket.connect(inetSocketAddress, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS);
                Unit unit = Unit.f71690a;
                socket.close();
                return EnumC9053a.Available;
            } finally {
            }
        } catch (CancellationException e11) {
            throw e11;
        } catch (Exception unused) {
            return EnumC9053a.NotAvailable;
        }
    }
}
