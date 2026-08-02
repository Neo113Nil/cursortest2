package io.sentry.okhttp;

import java.net.InetAddress;
import java.net.Proxy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends Lambda implements Function1 {

    /* renamed from: f, reason: collision with root package name */
    public static final c f16700f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f16701g;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f16702e;

    static {
        int i5 = 1;
        f16700f = new c(i5, 0);
        f16701g = new c(i5, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i5, int i10) {
        super(i5);
        this.f16702e = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f16702e) {
            case 0:
                InetAddress address = (InetAddress) obj;
                Intrinsics.checkNotNullParameter(address, "address");
                String inetAddress = address.toString();
                Intrinsics.checkNotNullExpressionValue(inetAddress, "toString(...)");
                return inetAddress;
            default:
                Proxy proxy = (Proxy) obj;
                Intrinsics.checkNotNullParameter(proxy, "proxy");
                String proxy2 = proxy.toString();
                Intrinsics.checkNotNullExpressionValue(proxy2, "toString(...)");
                return proxy2;
        }
    }
}
