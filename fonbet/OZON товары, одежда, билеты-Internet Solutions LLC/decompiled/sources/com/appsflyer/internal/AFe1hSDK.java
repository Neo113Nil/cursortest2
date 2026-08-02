package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class AFe1hSDK<Body> implements ResponseNetwork<Body> {

    @NonNull
    public final AFe1mSDK AFInAppEventParameterName;

    @NonNull
    private final Body AFInAppEventType;

    @NonNull
    final Map<String, List<String>> AFKeystoreWrapper;
    final boolean valueOf;
    final int values;

    public AFe1hSDK(@NonNull Body body, int i11, boolean z11, Map<String, List<String>> map, @NonNull AFe1mSDK aFe1mSDK) {
        this.AFInAppEventType = body;
        this.values = i11;
        this.valueOf = z11;
        this.AFKeystoreWrapper = new HashMap(map);
        this.AFInAppEventParameterName = aFe1mSDK;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFe1hSDK aFe1hSDK = (AFe1hSDK) obj;
        if (this.values == aFe1hSDK.values && this.valueOf == aFe1hSDK.valueOf && this.AFInAppEventType.equals(aFe1hSDK.AFInAppEventType) && this.AFKeystoreWrapper.equals(aFe1hSDK.AFKeystoreWrapper)) {
            return this.AFInAppEventParameterName.equals(aFe1hSDK.AFInAppEventParameterName);
        }
        return false;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    @NonNull
    public Body getBody() {
        return this.AFInAppEventType;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public List<String> getHeaderField(@NonNull String str) {
        for (String str2 : this.AFKeystoreWrapper.keySet()) {
            if (str2 != null && str2.equalsIgnoreCase(str)) {
                return this.AFKeystoreWrapper.get(str2);
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public int getStatusCode() {
        return this.values;
    }

    public int hashCode() {
        return this.AFInAppEventParameterName.hashCode() + ((this.AFKeystoreWrapper.hashCode() + (((((this.AFInAppEventType.hashCode() * 31) + this.values) * 31) + (this.valueOf ? 1 : 0)) * 31)) * 31);
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public boolean isSuccessful() {
        return this.valueOf;
    }

    public final String values(@NonNull String str) {
        List<String> headerField = getHeaderField(str);
        if (headerField == null || headerField.isEmpty()) {
            return null;
        }
        Iterator<String> it = headerField.iterator();
        StringBuilder sb2 = new StringBuilder(it.next());
        while (it.hasNext()) {
            sb2.append(", ");
            sb2.append(it.next());
        }
        return sb2.toString();
    }
}
