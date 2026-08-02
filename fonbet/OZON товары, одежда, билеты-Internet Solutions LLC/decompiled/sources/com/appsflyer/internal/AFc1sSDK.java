package com.appsflyer.internal;

import com.appsflyer.internal.AFe1fSDK.AnonymousClass3;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFc1sSDK implements Runnable {

    @NotNull
    private final AFa1pSDK AFInAppEventParameterName;
    private final Map<String, Object> AFInAppEventType;

    @NotNull
    private final AFd1mSDK valueOf;

    public AFc1sSDK(@NotNull AFd1mSDK aFd1mSDK, @NotNull AFa1pSDK aFa1pSDK, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(aFd1mSDK, "");
        Intrinsics.checkNotNullParameter(aFa1pSDK, "");
        this.valueOf = aFd1mSDK;
        this.AFInAppEventParameterName = aFa1pSDK;
        this.AFInAppEventType = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AFf1hSDK aFf1hSDK;
        if (this.AFInAppEventParameterName.values()) {
            AFf1jSDK aFf1jSDK = new AFf1jSDK(this.AFInAppEventParameterName, this.valueOf);
            aFf1jSDK.afInfoLog = this.AFInAppEventType;
            aFf1hSDK = aFf1jSDK;
        } else {
            aFf1hSDK = new AFf1hSDK(this.AFInAppEventParameterName, this.valueOf);
        }
        AFe1fSDK afInfoLog = this.valueOf.afInfoLog();
        afInfoLog.AFKeystoreWrapper.execute(afInfoLog.new AnonymousClass3(aFf1hSDK));
        if (aFf1hSDK.AFInAppEventParameterName == AFf1zSDK.CONVERSION) {
            this.valueOf.afVerboseLog();
            if (AFe1gSDK.valueOf() && AFb1uSDK.AFKeystoreWrapper(this.valueOf.w().valueOf)) {
                AFe1fSDK afInfoLog2 = this.valueOf.afInfoLog();
                afInfoLog2.AFKeystoreWrapper.execute(afInfoLog2.new AnonymousClass3(new AFf1pSDK(this.valueOf, "install")));
            }
        }
    }
}
