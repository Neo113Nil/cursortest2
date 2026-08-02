package com.appsflyer.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B+\b\u0002\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000f"}, d2 = {"Lcom/appsflyer/internal/AFa1hSDK;", "", "", "", "p0", "Lcom/appsflyer/internal/AFa1kSDK;", "p1", "<init>", "(Ljava/util/Map;Lcom/appsflyer/internal/AFa1kSDK;)V", "", "registerClient", "(Ljava/lang/String;Ljava/lang/Object;)V", "AFKeystoreWrapper", "Ljava/util/Map;", "AFLogger", "Lcom/appsflyer/internal/AFa1kSDK;", "AFa1tSDK"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFa1hSDK {

    /* renamed from: AFa1tSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    @NotNull
    final Map<String, Object> AFLogger;

    /* renamed from: registerClient, reason: from kotlin metadata */
    @Nullable
    final AFa1kSDK AFKeystoreWrapper;

    public /* synthetic */ AFa1hSDK(Map map, AFa1kSDK aFa1kSDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i & 2) != 0 ? null : aFa1kSDK);
    }

    @NotNull
    public static final AFa1hSDK AFLogger(@NotNull Map<String, Object> map) {
        return Companion.AFLogger(map);
    }

    @NotNull
    public static final AFa1hSDK unregisterClient(@NotNull AFa1kSDK aFa1kSDK) {
        return Companion.AFKeystoreWrapper(aFa1kSDK);
    }

    public final void registerClient(@NotNull String p0, @Nullable Object p1) {
        p0.getClass();
        this.AFLogger.put(p0, p1);
        AFa1kSDK aFa1kSDK = this.AFKeystoreWrapper;
        if (aFa1kSDK != null) {
            aFa1kSDK.d(this.AFLogger);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u00020\u00062\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/appsflyer/internal/AFa1hSDK$AFa1tSDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFa1kSDK;", "p0", "Lcom/appsflyer/internal/AFa1hSDK;", "AFKeystoreWrapper", "(Lcom/appsflyer/internal/AFa1kSDK;)Lcom/appsflyer/internal/AFa1hSDK;", "", "", "AFLogger", "(Ljava/util/Map;)Lcom/appsflyer/internal/AFa1hSDK;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFa1hSDK$AFa1tSDK, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public static AFa1hSDK AFKeystoreWrapper(@NotNull AFa1kSDK p0) {
            p0.getClass();
            return new AFa1hSDK(new LinkedHashMap(), p0, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static AFa1hSDK AFLogger(@NotNull Map<String, Object> p0) {
            p0.getClass();
            return new AFa1hSDK(p0, null, 2, 0 == true ? 1 : 0);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private AFa1hSDK(Map<String, Object> map, AFa1kSDK aFa1kSDK) {
        this.AFLogger = map;
        this.AFKeystoreWrapper = aFa1kSDK;
    }

    public /* synthetic */ AFa1hSDK(Map map, AFa1kSDK aFa1kSDK, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, aFa1kSDK);
    }
}
