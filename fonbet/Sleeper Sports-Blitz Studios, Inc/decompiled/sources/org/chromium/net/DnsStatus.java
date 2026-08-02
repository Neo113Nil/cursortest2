package org.chromium.net;

import internal.org.jni_zero.JNINamespace;
import java.net.InetAddress;
import java.util.List;

@JNINamespace("net::android")
/* loaded from: classes10.dex */
public class DnsStatus {
    private final List<InetAddress> mDnsServers;
    private final boolean mPrivateDnsActive;
    private final String mPrivateDnsServerName;
    private final String mSearchDomains;

    public DnsStatus(List<InetAddress> dnsServers, boolean privateDnsActive, String privateDnsServerName, String searchDomains) {
        this.mDnsServers = dnsServers;
        this.mPrivateDnsActive = privateDnsActive;
        this.mPrivateDnsServerName = privateDnsServerName == null ? "" : privateDnsServerName;
        this.mSearchDomains = searchDomains == null ? "" : searchDomains;
    }

    public byte[][] getDnsServers() {
        byte[][] bArr = new byte[this.mDnsServers.size()][];
        for (int i = 0; i < this.mDnsServers.size(); i++) {
            bArr[i] = this.mDnsServers.get(i).getAddress();
        }
        return bArr;
    }

    public boolean getPrivateDnsActive() {
        return this.mPrivateDnsActive;
    }

    public String getPrivateDnsServerName() {
        return this.mPrivateDnsServerName;
    }

    public String getSearchDomains() {
        return this.mSearchDomains;
    }
}
