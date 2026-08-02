package com.vk.network.proxy.data.model;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.epx;
import xsna.qoy;
import xsna.zrp;

/* compiled from: VkProxyNetwork.kt */
/* loaded from: classes.dex */
public final class VkProxyNetwork {
    public final String a;
    public final boolean b;
    public final Status c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkProxyNetwork.kt */
    public static final class Status {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status BLOCKED;
        public static final Status ENABLED;
        public static final Status UNKNOWN;

        static {
            Status status = new Status("BLOCKED", 0);
            BLOCKED = status;
            Status status2 = new Status("ENABLED", 1);
            ENABLED = status2;
            Status status3 = new Status(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
            UNKNOWN = status3;
            Status[] statusArr = {status, status2, status3};
            $VALUES = statusArr;
            $ENTRIES = new asp(statusArr);
        }

        public Status() {
            throw null;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public VkProxyNetwork(String str, boolean z, Status status) {
        this.a = str;
        this.b = z;
        this.c = status;
    }

    public static VkProxyNetwork a(VkProxyNetwork vkProxyNetwork, Status status) {
        String str = vkProxyNetwork.a;
        boolean z = vkProxyNetwork.b;
        vkProxyNetwork.getClass();
        return new VkProxyNetwork(str, z, status);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkProxyNetwork)) {
            return false;
        }
        VkProxyNetwork vkProxyNetwork = (VkProxyNetwork) obj;
        return epx.f(this.a, vkProxyNetwork.a) && this.b == vkProxyNetwork.b && this.c == vkProxyNetwork.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + qoy.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "VkProxyNetwork(id=" + this.a + ", isRestored=" + this.b + ", status=" + this.c + ')';
    }
}
