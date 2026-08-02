package com.appsflyer.internal;

import android.content.Context;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/appsflyer/internal/AFg1ySDK;", "", "Landroid/content/Context;", "p0", "", "", "registerClient", "(Landroid/content/Context;)Ljava/util/Map;", "AFa1uSDK"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AFg1ySDK {

    /* renamed from: AFa1uSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.d;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.appsflyer.internal.AFg1ySDK$AFa1uSDK, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion d = new Companion();

        private Companion() {
        }
    }

    @NotNull
    Map<String, String> registerClient(@NotNull Context p0);
}
