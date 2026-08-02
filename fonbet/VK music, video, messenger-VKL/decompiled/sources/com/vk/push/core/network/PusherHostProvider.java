package com.vk.push.core.network;

import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.push.common.HostInfoProvider;

/* compiled from: PusherHostProvider.kt */
/* loaded from: classes5.dex */
public final class PusherHostProvider implements HostInfoProvider {
    @Override // com.vk.push.common.HostInfoProvider
    public String getHost() {
        return "vkpns.rustore.ru";
    }

    @Override // com.vk.push.common.HostInfoProvider
    public Integer getPort() {
        return HostInfoProvider.DefaultImpls.getPort(this);
    }

    @Override // com.vk.push.common.HostInfoProvider
    public String getScheme() {
        return HttpRequest.DEFAULT_SCHEME;
    }
}
