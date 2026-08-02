package com.vk.push.common;

/* compiled from: HostInfoProvider.kt */
/* loaded from: classes5.dex */
public interface HostInfoProvider {

    /* compiled from: HostInfoProvider.kt */
    public static final class DefaultImpls {
        public static Integer getPort(HostInfoProvider hostInfoProvider) {
            return null;
        }
    }

    String getHost();

    Integer getPort();

    String getScheme();
}
