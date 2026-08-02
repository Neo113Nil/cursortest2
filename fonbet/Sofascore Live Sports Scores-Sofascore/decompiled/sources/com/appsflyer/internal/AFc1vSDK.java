package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.util.JsonUtils;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFc1vSDK {
    public String AFKeystoreWrapper;
    public String AFLogger;
    public AFe1zSDK d;
    public byte[] registerClient;
    String unregisterClient;
    public Map<String, String> v;

    public AFc1vSDK(char[] cArr) {
        Scanner scanner = new Scanner(new String(cArr));
        while (scanner.hasNextLine()) {
            try {
                String nextLine = scanner.nextLine();
                if (nextLine.startsWith("url=")) {
                    this.AFLogger = nextLine.substring(4).trim();
                } else if (nextLine.startsWith("version=")) {
                    this.unregisterClient = nextLine.substring(8).trim();
                } else if (nextLine.startsWith("headers=")) {
                    try {
                        this.v = JsonUtils.toStringMap(new JSONObject(new String(Base64.decode(nextLine.substring(8).trim(), 2), Charset.defaultCharset())));
                    } catch (Exception e) {
                        AFLogger.INSTANCE.e(LogTag.CACHE, "Error parsing headers", e);
                        this.v = new HashMap();
                    }
                } else if (nextLine.startsWith("data=")) {
                    this.registerClient = Base64.decode(nextLine.substring(5).trim(), 2);
                } else if (nextLine.startsWith("type=")) {
                    String trim = nextLine.substring(5).trim();
                    AFd1aSDK d = AFd1aSDK.d(trim);
                    if (d != null) {
                        this.d = d;
                    } else {
                        AFLogger.INSTANCE.d(LogTag.CACHE, "Unknown task type: ".concat(String.valueOf(trim)));
                    }
                }
            } catch (Throwable th) {
                try {
                    scanner.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        scanner.close();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AFc1vSDK.class == obj.getClass()) {
            AFc1vSDK aFc1vSDK = (AFc1vSDK) obj;
            if (Objects.equals(this.unregisterClient, aFc1vSDK.unregisterClient) && Arrays.equals(this.registerClient, aFc1vSDK.registerClient) && Objects.equals(this.AFLogger, aFc1vSDK.AFLogger) && Objects.equals(this.AFKeystoreWrapper, aFc1vSDK.AFKeystoreWrapper) && Objects.equals(this.v, aFc1vSDK.v) && this.d == aFc1vSDK.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.unregisterClient;
        int hashCode = (Arrays.hashCode(this.registerClient) + ((str != null ? str.hashCode() : 0) * 31)) * 31;
        String str2 = this.AFLogger;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.AFKeystoreWrapper;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        AFe1zSDK aFe1zSDK = this.d;
        int hashCode4 = (hashCode3 + (aFe1zSDK != null ? aFe1zSDK.hashCode() : 0)) * 31;
        Map<String, String> map = this.v;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    public AFc1vSDK(String str, byte[] bArr, String str2, AFe1zSDK aFe1zSDK, Map<String, String> map) {
        this.AFLogger = str;
        this.registerClient = bArr;
        this.unregisterClient = str2;
        this.d = aFe1zSDK;
        this.v = map;
    }
}
