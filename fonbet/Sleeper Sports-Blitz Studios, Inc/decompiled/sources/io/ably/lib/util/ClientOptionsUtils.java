package io.ably.lib.util;

import io.ably.lib.http.HttpAuth;
import io.ably.lib.network.ProxyAuthType;
import io.ably.lib.network.ProxyConfig;
import io.ably.lib.types.ClientOptions;
import java.util.Arrays;

/* loaded from: classes9.dex */
public class ClientOptionsUtils {
    public static ProxyConfig convertToProxyConfig(ClientOptions clientOptions) {
        if (clientOptions.proxy == null) {
            return null;
        }
        ProxyConfig.ProxyConfigBuilder builder = ProxyConfig.builder();
        builder.host(clientOptions.proxy.host).port(clientOptions.proxy.port).username(clientOptions.proxy.username).password(clientOptions.proxy.password);
        if (clientOptions.proxy.nonProxyHosts != null) {
            builder.nonProxyHosts(Arrays.asList(clientOptions.proxy.nonProxyHosts));
        }
        int i = AnonymousClass1.$SwitchMap$io$ably$lib$http$HttpAuth$Type[clientOptions.proxy.prefAuthType.ordinal()];
        if (i == 1) {
            builder.authType(ProxyAuthType.BASIC);
        } else if (i == 2) {
            builder.authType(ProxyAuthType.DIGEST);
        }
        return builder.build();
    }

    /* renamed from: io.ably.lib.util.ClientOptionsUtils$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$ably$lib$http$HttpAuth$Type;

        static {
            int[] iArr = new int[HttpAuth.Type.values().length];
            $SwitchMap$io$ably$lib$http$HttpAuth$Type = iArr;
            try {
                iArr[HttpAuth.Type.BASIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$ably$lib$http$HttpAuth$Type[HttpAuth.Type.DIGEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }
}
