package kf;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import kotlin.collections.C7714v;
import org.jetbrains.annotations.NotNull;

/* renamed from: kf.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7673a extends ProxySelector {

    /* renamed from: a, reason: collision with root package name */
    public static final C7673a f71520a = new C7673a();

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    @Override // java.net.ProxySelector
    @NotNull
    public final List<Proxy> select(URI uri) {
        if (uri != null) {
            return C7714v.a0(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null");
    }
}
