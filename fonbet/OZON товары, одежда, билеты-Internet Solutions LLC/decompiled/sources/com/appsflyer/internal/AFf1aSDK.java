package com.appsflyer.internal;

import Sc.InterfaceC4008j;
import Sc.r;
import com.appsflyer.AFLogger;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011R\u001b\u0010\u000e\u001a\u00020\u000b8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000b8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u000e\u0010\r"}, d2 = {"Lcom/appsflyer/internal/AFf1aSDK;", "", "Lcom/appsflyer/internal/AFd1sSDK;", "p0", "Lcom/appsflyer/internal/AFg1ySDK;", "p1", "<init>", "(Lcom/appsflyer/internal/AFd1sSDK;Lcom/appsflyer/internal/AFg1ySDK;)V", "", "AFInAppEventParameterName", "()J", "", "AFKeystoreWrapper", "()Z", "AFInAppEventType", "Lcom/appsflyer/internal/AFd1sSDK;", "values", "Lcom/appsflyer/internal/AFg1ySDK;", "LSc/j;", "valueOf", "AFa1zSDK"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFf1aSDK {
    private static final long valueOf = TimeUnit.HOURS.toSeconds(24);

    /* renamed from: AFInAppEventParameterName, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j AFInAppEventType;

    /* renamed from: AFInAppEventType, reason: from kotlin metadata */
    @NotNull
    private final AFd1sSDK values;

    @NotNull
    private final AFg1ySDK AFKeystoreWrapper;

    /* renamed from: values, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j valueOf;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "AFInAppEventType", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFf1aSDK$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Boolean> {
        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFf1aSDK.this.values.AFInAppEventParameterName("com.appsflyer.rc.sandbox")));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "AFKeystoreWrapper", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFf1aSDK$5, reason: invalid class name */
    static final class AnonymousClass5 extends AbstractC7737t implements Function0<Boolean> {
        AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: AFKeystoreWrapper, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFf1aSDK.this.values.AFInAppEventParameterName("com.appsflyer.rc.staging")));
        }
    }

    public AFf1aSDK(@NotNull AFd1sSDK aFd1sSDK, @NotNull AFg1ySDK aFg1ySDK) {
        Intrinsics.checkNotNullParameter(aFd1sSDK, "");
        Intrinsics.checkNotNullParameter(aFg1ySDK, "");
        this.values = aFd1sSDK;
        this.AFKeystoreWrapper = aFg1ySDK;
        this.AFInAppEventType = Sc.k.b(new AnonymousClass1());
        this.valueOf = Sc.k.b(new AnonymousClass5());
    }

    public final long AFInAppEventParameterName() {
        Object a11;
        String AFInAppEventParameterName = this.values.AFInAppEventParameterName("com.appsflyer.rc.cache.max-age-fallback");
        if (AFInAppEventParameterName == null) {
            return valueOf;
        }
        try {
            r.Companion companion = Sc.r.INSTANCE;
            a11 = Long.valueOf(Long.parseLong(AFInAppEventParameterName));
        } catch (Throwable th2) {
            r.Companion companion2 = Sc.r.INSTANCE;
            a11 = Sc.s.a(th2);
        }
        Throwable b11 = Sc.r.b(a11);
        if (b11 != null) {
            StringBuilder sb2 = new StringBuilder("Can't read maxAgeFallback from Manifest: ");
            sb2.append(b11.getMessage());
            AFLogger.afErrorLog(sb2.toString(), b11);
            a11 = Long.valueOf(valueOf);
        }
        return ((Number) a11).longValue();
    }

    public final boolean AFInAppEventType() {
        return ((Boolean) this.valueOf.getValue()).booleanValue();
    }

    public final boolean AFKeystoreWrapper() {
        AFh1iSDK aFh1iSDK;
        AFh1hSDK aFh1hSDK = this.AFKeystoreWrapper.AFInAppEventParameterName;
        if (aFh1hSDK == null) {
            AFg1hSDK.i$default(AFLogger.INSTANCE, AFg1gSDK.REMOTE_CONTROL, "active config is missing - fetching from CDN", false, 4, null);
            return true;
        }
        AFh1gSDK aFh1gSDK = aFh1hSDK.AFInAppEventType;
        boolean AFInAppEventType = (aFh1gSDK == null || (aFh1iSDK = aFh1gSDK.valueOf) == null) ? false : aFh1iSDK.AFInAppEventType();
        long currentTimeMillis = System.currentTimeMillis();
        AFg1ySDK aFg1ySDK = this.AFKeystoreWrapper;
        return AFInAppEventType || currentTimeMillis - aFg1ySDK.values > TimeUnit.SECONDS.toMillis(aFg1ySDK.valueOf);
    }

    public final boolean valueOf() {
        return ((Boolean) this.AFInAppEventType.getValue()).booleanValue();
    }
}
