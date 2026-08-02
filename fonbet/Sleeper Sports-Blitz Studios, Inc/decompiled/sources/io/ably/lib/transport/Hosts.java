package io.ably.lib.transport;

import com.socure.docv.capturesdk.BuildConfig;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.ClientOptions;
import io.ably.lib.types.ErrorInfo;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes9.dex */
public class Hosts {
    private final String defaultHost;
    private final String[] fallbackHosts;
    private final boolean fallbackHostsIsDefault;
    private final boolean fallbackHostsUseDefault;
    private final long fallbackRetryTimeout;
    private final Preferred preferred = new Preferred();
    private final String primaryHost;
    private final boolean primaryHostIsDefault;

    public Hosts(String str, String str2, ClientOptions clientOptions) throws AblyException {
        String str3;
        this.defaultHost = str2;
        this.fallbackHostsUseDefault = clientOptions.fallbackHostsUseDefault;
        boolean z = true;
        boolean z2 = (str == null || str.equalsIgnoreCase(str2)) ? false : true;
        String[] strArr = clientOptions.fallbackHosts;
        if (clientOptions.fallbackHostsUseDefault) {
            if (clientOptions.fallbackHosts != null) {
                throw AblyException.fromErrorInfo(new ErrorInfo("fallbackHosts and fallbackHostsUseDefault cannot both be set", 40000, 400));
            }
            if (clientOptions.port != 0 || clientOptions.tlsPort != 0) {
                throw AblyException.fromErrorInfo(new ErrorInfo("fallbackHostsUseDefault cannot be set when port or tlsPort are set", 40000, 400));
            }
            strArr = Defaults.HOST_FALLBACKS;
        }
        if (clientOptions.environment != null && !clientOptions.environment.isEmpty() && !BuildConfig.FLAVOR.equalsIgnoreCase(clientOptions.environment)) {
            z = false;
        }
        if (!z2 && strArr == null && clientOptions.port == 0 && clientOptions.tlsPort == 0) {
            strArr = z ? Defaults.HOST_FALLBACKS : Defaults.getEnvironmentFallbackHosts(clientOptions.environment);
        }
        if (z2) {
            this.primaryHost = str;
            if (clientOptions.environment != null) {
                throw AblyException.fromErrorInfo(new ErrorInfo("cannot set both restHost/realtimeHost and environment options", 40000, 400));
            }
        } else {
            if (z) {
                str3 = str2;
            } else {
                str3 = clientOptions.environment + "-" + str2;
            }
            this.primaryHost = str3;
        }
        this.primaryHostIsDefault = this.primaryHost.equalsIgnoreCase(str2);
        this.fallbackHostsIsDefault = Arrays.equals(Defaults.HOST_FALLBACKS, strArr);
        String[] strArr2 = strArr == null ? new String[0] : (String[]) strArr.clone();
        this.fallbackHosts = strArr2;
        Collections.shuffle(Arrays.asList(strArr2));
        this.fallbackRetryTimeout = clientOptions.fallbackRetryTimeout;
    }

    public synchronized void setPreferredHost(String str, boolean z) {
        if (this.preferred.isHost(str)) {
            return;
        }
        if (str.equals(this.primaryHost)) {
            this.preferred.clear();
        } else {
            this.preferred.setHost(str, z ? System.currentTimeMillis() + this.fallbackRetryTimeout : 0L);
        }
    }

    public String getPrimaryHost() {
        return this.primaryHost;
    }

    public synchronized String getPreferredHost() {
        String hostOrClearIfExpired;
        hostOrClearIfExpired = this.preferred.getHostOrClearIfExpired();
        if (hostOrClearIfExpired == null) {
            hostOrClearIfExpired = this.primaryHost;
        }
        return hostOrClearIfExpired;
    }

    public synchronized String getFallback(String str) {
        int i;
        if (this.fallbackHosts == null) {
            return null;
        }
        if (str.equals(this.primaryHost)) {
            if (!this.primaryHostIsDefault && !this.fallbackHostsUseDefault && this.fallbackHostsIsDefault) {
                return null;
            }
            i = 0;
        } else {
            if (str.equals(this.preferred.getHostOrClearIfExpired())) {
                this.preferred.clear();
                return this.primaryHost;
            }
            int indexOf = Arrays.asList(this.fallbackHosts).indexOf(str);
            if (indexOf < 0) {
                return null;
            }
            i = indexOf + 1;
        }
        String[] strArr = this.fallbackHosts;
        if (i >= strArr.length) {
            return null;
        }
        return strArr[i];
    }

    public synchronized int fallbackHostsRemaining(String str) {
        if (this.fallbackHosts == null) {
            return 0;
        }
        if (!str.equals(this.primaryHost) && !str.equals(this.preferred.getHost())) {
            String[] strArr = this.fallbackHosts;
            return (strArr.length - Arrays.asList(strArr).indexOf(str)) - 1;
        }
        return this.fallbackHosts.length;
    }

    private static class Preferred {
        private long expiry;
        private String host;

        private Preferred() {
        }

        public void clear() {
            this.host = null;
            this.expiry = 0L;
        }

        public boolean isHost(String str) {
            String str2 = this.host;
            return str2 == null ? str == null : str2.equals(str);
        }

        public void setHost(String str, long j) {
            this.host = str;
            this.expiry = j;
        }

        public String getHostOrClearIfExpired() {
            long j = this.expiry;
            if (j > 0 && j <= System.currentTimeMillis()) {
                clear();
            }
            return this.host;
        }

        public String getHost() {
            return this.host;
        }
    }
}
