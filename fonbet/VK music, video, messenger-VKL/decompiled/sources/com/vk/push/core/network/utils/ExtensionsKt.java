package com.vk.push.core.network.utils;

import android.net.Uri;
import com.vk.push.common.HostInfoProvider;

/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class ExtensionsKt {
    public static final UrlBuilder getHostInfoHttpBuilder(HostInfoProvider hostInfoProvider) {
        return new UrlBuilder(hostInfoProvider);
    }

    public static final Uri.Builder hostInfo(Uri.Builder builder, HostInfoProvider hostInfoProvider) {
        String host;
        if (hostInfoProvider.getPort() != null) {
            host = hostInfoProvider.getHost() + ':' + hostInfoProvider.getPort();
        } else {
            host = hostInfoProvider.getHost();
        }
        return builder.scheme(hostInfoProvider.getScheme()).encodedAuthority(host);
    }
}
