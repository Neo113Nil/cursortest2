package com.appsflyer.internal;

import java.security.SecureRandom;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\u000bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/appsflyer/internal/AFb1mSDK;", "", "<init>", "()V", "", "p0", "Lcom/appsflyer/internal/AFc1pSDK;", "p1", "", "unregisterClient", "(Ljava/lang/String;Lcom/appsflyer/internal/AFc1pSDK;)V", "(Lcom/appsflyer/internal/AFc1pSDK;)Ljava/lang/String;", "AFLogger", "Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFb1mSDK {

    /* renamed from: AFLogger, reason: from kotlin metadata */
    @Nullable
    private static String unregisterClient;

    @NotNull
    public static final AFb1mSDK INSTANCE = new AFb1mSDK();

    private AFb1mSDK() {
    }

    @NotNull
    public static final synchronized String unregisterClient(@NotNull AFc1pSDK p0) {
        String str;
        synchronized (AFb1mSDK.class) {
            try {
                p0.getClass();
                str = unregisterClient;
                if (str == null) {
                    str = p0.d("AF_INSTALLATION");
                    if (str == null) {
                        str = System.currentTimeMillis() + "-" + Math.abs(new SecureRandom().nextLong());
                        p0.d("AF_INSTALLATION", str);
                    }
                    unregisterClient = str;
                }
                str.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public static final synchronized void unregisterClient(@NotNull String p0, @NotNull AFc1pSDK p1) {
        synchronized (AFb1mSDK.class) {
            p0.getClass();
            p1.getClass();
            unregisterClient = p0;
            p1.unregisterClient("CUSTOM_INSTALL_ID_APPLIED", true);
            p1.d("AF_INSTALLATION", p0);
        }
    }
}
