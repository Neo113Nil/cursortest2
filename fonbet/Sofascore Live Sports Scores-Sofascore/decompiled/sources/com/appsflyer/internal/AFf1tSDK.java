package com.appsflyer.internal;

import android.util.Base64;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFf1tSDK {
    public long AFKeystoreWrapper;
    public long AFLogger;
    public final AFc1pSDK d;

    @Nullable
    public AFh1lSDK unregisterClient = null;
    public AFh1lSDK registerClient = AFKeystoreWrapper();

    public AFf1tSDK(AFc1pSDK aFc1pSDK) {
        this.d = aFc1pSDK;
        this.AFLogger = aFc1pSDK.AFKeystoreWrapper("af_rc_timestamp", 0L);
        this.AFKeystoreWrapper = aFc1pSDK.AFKeystoreWrapper("af_rc_max_age", 0L);
    }

    @Nullable
    private AFh1lSDK AFKeystoreWrapper() {
        String d = this.d.d("af_remote_config");
        if (d == null) {
            AFLogger.INSTANCE.d(LogTag.REMOTE_CONTROL, "No configuration found in cache");
            return null;
        }
        try {
            return new AFh1lSDK(new String(Base64.decode(d, 2), Charset.defaultCharset()));
        } catch (Exception e) {
            AFLogger.INSTANCE.e(LogTag.REMOTE_CONTROL, "Error reading malformed configuration from cache, requires fetching from remote again", e, true);
            return null;
        }
    }
}
