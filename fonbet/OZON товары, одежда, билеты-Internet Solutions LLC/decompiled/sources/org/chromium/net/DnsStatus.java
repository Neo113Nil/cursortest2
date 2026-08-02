package org.chromium.net;

import internal.org.jni_zero.CalledByNative;
import java.net.InetAddress;
import java.util.List;

/* loaded from: classes6.dex */
public final class DnsStatus {

    /* renamed from: a, reason: collision with root package name */
    private final List<InetAddress> f78599a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f78600b;

    /* renamed from: c, reason: collision with root package name */
    private final String f78601c;

    /* renamed from: d, reason: collision with root package name */
    private final String f78602d;

    public DnsStatus(List<InetAddress> list, boolean z11, String str, String str2) {
        this.f78599a = list;
        this.f78600b = z11;
        this.f78601c = str == null ? "" : str;
        this.f78602d = str2 == null ? "" : str2;
    }

    @CalledByNative
    public final byte[][] getDnsServers() {
        List<InetAddress> list = this.f78599a;
        byte[][] bArr = new byte[list.size()][];
        for (int i11 = 0; i11 < list.size(); i11++) {
            bArr[i11] = list.get(i11).getAddress();
        }
        return bArr;
    }

    @CalledByNative
    public final boolean getPrivateDnsActive() {
        return this.f78600b;
    }

    @CalledByNative
    public final String getPrivateDnsServerName() {
        return this.f78601c;
    }

    @CalledByNative
    public final String getSearchDomains() {
        return this.f78602d;
    }
}
