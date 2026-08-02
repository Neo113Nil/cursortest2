package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u0000 \n2\u00020\u0001:\u0002\n\u000bJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\t"}, d2 = {"Lcom/appsflyer/internal/AFb1gSDK;", "", "Landroid/content/Context;", "p0", "Lcom/appsflyer/internal/AFb1gSDK$AFa1tSDK;", "p1", "", "unregisterClient", "(Landroid/content/Context;Lcom/appsflyer/internal/AFb1gSDK$AFa1tSDK;)V", "()V", "AFa1zSDK", "AFa1tSDK"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AFb1gSDK {

    /* renamed from: AFa1zSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.d;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface AFa1tSDK {
        void m_(@NotNull Intent intent);

        void n_(@NotNull Intent intent);

        void unregisterClient();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.appsflyer.internal.AFb1gSDK$AFa1zSDK, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion d = new Companion();
        private static long unregisterClient = 500;

        private Companion() {
        }

        public static long AFKeystoreWrapper() {
            return unregisterClient;
        }
    }

    void unregisterClient();

    void unregisterClient(@NotNull Context p0, @NotNull AFa1tSDK p1);
}
