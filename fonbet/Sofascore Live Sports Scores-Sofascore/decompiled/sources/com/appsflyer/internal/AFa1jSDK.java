package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.util.JsonUtils;
import defpackage.lm5;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFa1jSDK implements AFa1kSDK {

    @NotNull
    private final AFc1pSDK AFKeystoreWrapper;

    public AFa1jSDK(@NotNull AFc1pSDK aFc1pSDK) {
        aFc1pSDK.getClass();
        this.AFKeystoreWrapper = aFc1pSDK;
    }

    @Override // com.appsflyer.internal.AFa1kSDK
    public final void d(@NotNull Map<String, ? extends Object> map) {
        map.getClass();
        this.AFKeystoreWrapper.d("deeplink_data", new JSONObject(map).toString());
    }

    @Override // com.appsflyer.internal.AFa1kSDK
    @NotNull
    public final Map<String, Object> registerClient() {
        if (this.AFKeystoreWrapper.AFKeystoreWrapper("deeplink_data")) {
            try {
                String d = this.AFKeystoreWrapper.d("deeplink_data");
                if (d != null) {
                    return JsonUtils.toMap(new JSONObject(d));
                }
                lm5 lm5Var = lm5.a;
                lm5Var.getClass();
                return lm5Var;
            } catch (Throwable th) {
                AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DDL, "Exception while parsing stored deeplink data", th, false, true, false, false, 72, null);
            }
        }
        lm5 lm5Var2 = lm5.a;
        lm5Var2.getClass();
        return lm5Var2;
    }

    @Override // com.appsflyer.internal.AFa1kSDK
    public final void d() {
        this.AFKeystoreWrapper.AFLogger("deeplink_data");
    }
}
