package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.share.network.http.ResponseNetwork;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class AFd1iSDK<Body> implements ResponseNetwork<Body> {
    final boolean AFKeystoreWrapper;

    @NonNull
    public final AFd1kSDK AFLogger;

    @NonNull
    private final Body d;

    @NonNull
    final Map<String, List<String>> registerClient;
    final int unregisterClient;

    public AFd1iSDK(@NonNull Body body, int i, boolean z, Map<String, List<String>> map, @NonNull AFd1kSDK aFd1kSDK) {
        this.d = body;
        this.unregisterClient = i;
        this.AFKeystoreWrapper = z;
        this.registerClient = new HashMap(map);
        this.AFLogger = aFd1kSDK;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFd1iSDK aFd1iSDK = (AFd1iSDK) obj;
        if (this.unregisterClient == aFd1iSDK.unregisterClient && this.AFKeystoreWrapper == aFd1iSDK.AFKeystoreWrapper && this.d.equals(aFd1iSDK.d) && this.registerClient.equals(aFd1iSDK.registerClient)) {
            return this.AFLogger.equals(aFd1iSDK.AFLogger);
        }
        return false;
    }

    @Override // com.appsflyer.share.network.http.ResponseNetwork
    @NonNull
    public Body getBody() {
        return this.d;
    }

    @Override // com.appsflyer.share.network.http.ResponseNetwork
    @Nullable
    public List<String> getHeaderField(@NonNull String str) {
        for (String str2 : this.registerClient.keySet()) {
            if (str2 != null && str2.equalsIgnoreCase(str)) {
                return this.registerClient.get(str2);
            }
        }
        return null;
    }

    @Override // com.appsflyer.share.network.http.ResponseNetwork
    public int getStatusCode() {
        return this.unregisterClient;
    }

    public int hashCode() {
        return this.AFLogger.hashCode() + ((this.registerClient.hashCode() + (((((this.d.hashCode() * 31) + this.unregisterClient) * 31) + (this.AFKeystoreWrapper ? 1 : 0)) * 31)) * 31);
    }

    @Override // com.appsflyer.share.network.http.ResponseNetwork
    public boolean isSuccessful() {
        return this.AFKeystoreWrapper;
    }

    @Nullable
    public final String unregisterClient(@NonNull String str) {
        List<String> headerField = getHeaderField(str);
        if (headerField == null || headerField.isEmpty()) {
            return null;
        }
        Iterator<String> it = headerField.iterator();
        StringBuilder sb = new StringBuilder(it.next());
        while (it.hasNext()) {
            sb.append(", ");
            sb.append(it.next());
        }
        return sb.toString();
    }
}
