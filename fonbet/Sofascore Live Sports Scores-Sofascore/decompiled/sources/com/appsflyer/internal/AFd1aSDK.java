package com.appsflyer.internal;

import defpackage.jp5;
import defpackage.kp5;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u001a\b\u0086\u0001\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\tj\u0002\b\u000bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d"}, d2 = {"Lcom/appsflyer/internal/AFd1aSDK;", "Lcom/appsflyer/internal/AFe1zSDK;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "getLevel", "I", "registerClient", "()I", "AFKeystoreWrapper", "AFa1uSDK", "d", "AFLogger", "unregisterClient", "w", com.mbridge.msdk.setting.i.a, "v", "e", "force", "afErrorLog", "afDebugLog", "afInfoLog", "afWarnLog", "AFLoggerLogLevel", "valueOf", "values", "getEntries", "AppsFlyerLib"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFd1aSDK implements AFe1zSDK {
    public static final AFd1aSDK AFKeystoreWrapper;
    public static final AFd1aSDK AFLogger;
    public static final AFd1aSDK AFLoggerLogLevel;

    /* renamed from: AFa1uSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final AFd1aSDK AppsFlyerLib;
    public static final AFd1aSDK afDebugLog;
    public static final AFd1aSDK afErrorLog;
    public static final AFd1aSDK afInfoLog;
    public static final AFd1aSDK afWarnLog;
    public static final AFd1aSDK d;
    public static final AFd1aSDK e;
    public static final AFd1aSDK force;
    public static final AFd1aSDK getEntries;
    private static final /* synthetic */ jp5 getInstance;
    public static final AFd1aSDK i;
    public static final AFd1aSDK registerClient;
    private static final /* synthetic */ AFd1aSDK[] stop;
    public static final AFd1aSDK unregisterClient;
    public static final AFd1aSDK v;
    public static final AFd1aSDK valueOf;
    public static final AFd1aSDK values;
    public static final AFd1aSDK w;

    /* renamed from: getLevel, reason: from kotlin metadata */
    private final int AFKeystoreWrapper;

    static {
        AFd1aSDK aFd1aSDK = new AFd1aSDK("RC_CDN", 0, 1);
        registerClient = aFd1aSDK;
        AFd1aSDK aFd1aSDK2 = new AFd1aSDK("FETCH_ADVERTISING_ID", 1, 1);
        AFKeystoreWrapper = aFd1aSDK2;
        AFd1aSDK aFd1aSDK3 = new AFd1aSDK("LOAD_CACHE", 2, 2);
        d = aFd1aSDK3;
        AFd1aSDK aFd1aSDK4 = new AFd1aSDK("CACHED_EVENT", 3, 2);
        AFLogger = aFd1aSDK4;
        AFd1aSDK aFd1aSDK5 = new AFd1aSDK("CONVERSION", 4, 2);
        unregisterClient = aFd1aSDK5;
        AFd1aSDK aFd1aSDK6 = new AFd1aSDK("PLAY_INTEGRITY_API", 5, 2);
        w = aFd1aSDK6;
        AFd1aSDK aFd1aSDK7 = new AFd1aSDK("ONELINK", 6, 2);
        i = aFd1aSDK7;
        AFd1aSDK aFd1aSDK8 = new AFd1aSDK("DLSDK", 7, 2);
        v = aFd1aSDK8;
        AFd1aSDK aFd1aSDK9 = new AFd1aSDK("RESOLVE_ESP", 8, 2);
        e = aFd1aSDK9;
        AFd1aSDK aFd1aSDK10 = new AFd1aSDK("ATTR", 9, 2);
        force = aFd1aSDK10;
        AFd1aSDK aFd1aSDK11 = new AFd1aSDK("GCDSDK", 10, 3);
        afErrorLog = aFd1aSDK11;
        AFd1aSDK aFd1aSDK12 = new AFd1aSDK("REGISTER", 11, 4);
        afDebugLog = aFd1aSDK12;
        AFd1aSDK aFd1aSDK13 = new AFd1aSDK("LAUNCH", 12, 4);
        afInfoLog = aFd1aSDK13;
        AFd1aSDK aFd1aSDK14 = new AFd1aSDK("INAPP", 13, 4);
        afWarnLog = aFd1aSDK14;
        AFd1aSDK aFd1aSDK15 = new AFd1aSDK("MANUAL_PURCHASE_VALIDATION", 14, 4);
        AFLoggerLogLevel = aFd1aSDK15;
        AFd1aSDK aFd1aSDK16 = new AFd1aSDK("PURCHASE_VALIDATE", 15, 4);
        valueOf = aFd1aSDK16;
        AFd1aSDK aFd1aSDK17 = new AFd1aSDK("IMPRESSIONS", 16, 4);
        values = aFd1aSDK17;
        AFd1aSDK aFd1aSDK18 = new AFd1aSDK("ARS_VALIDATE", 17, 4);
        getEntries = aFd1aSDK18;
        AFd1aSDK aFd1aSDK19 = new AFd1aSDK("ADREVENUE", 18, 4);
        AppsFlyerLib = aFd1aSDK19;
        AFd1aSDK[] aFd1aSDKArr = {aFd1aSDK, aFd1aSDK2, aFd1aSDK3, aFd1aSDK4, aFd1aSDK5, aFd1aSDK6, aFd1aSDK7, aFd1aSDK8, aFd1aSDK9, aFd1aSDK10, aFd1aSDK11, aFd1aSDK12, aFd1aSDK13, aFd1aSDK14, aFd1aSDK15, aFd1aSDK16, aFd1aSDK17, aFd1aSDK18, aFd1aSDK19};
        stop = aFd1aSDKArr;
        getInstance = new kp5(aFd1aSDKArr);
        INSTANCE = new Companion(null);
    }

    private AFd1aSDK(String str, int i2, int i3) {
        this.AFKeystoreWrapper = i3;
    }

    @NotNull
    public static jp5 AFLogger() {
        return getInstance;
    }

    @Nullable
    public static final AFd1aSDK d(@NotNull String str) {
        return Companion.d(str);
    }

    public static AFd1aSDK valueOf(String str) {
        return (AFd1aSDK) Enum.valueOf(AFd1aSDK.class, str);
    }

    public static AFd1aSDK[] values() {
        return (AFd1aSDK[]) stop.clone();
    }

    @Override // com.appsflyer.internal.AFe1zSDK
    public final /* synthetic */ String AFKeystoreWrapper() {
        return name();
    }

    @Override // com.appsflyer.internal.AFe1zSDK
    /* renamed from: registerClient, reason: from getter */
    public final int getAFKeystoreWrapper() {
        return this.AFKeystoreWrapper;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/appsflyer/internal/AFd1aSDK$AFa1uSDK;", "", "<init>", "()V", "", "p0", "Lcom/appsflyer/internal/AFd1aSDK;", "d", "(Ljava/lang/String;)Lcom/appsflyer/internal/AFd1aSDK;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1aSDK$AFa1uSDK, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @Nullable
        public static AFd1aSDK d(@NotNull String p0) {
            Object obj;
            p0.getClass();
            Iterator<E> it = AFd1aSDK.AFLogger().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.c(((AFd1aSDK) obj).name(), p0)) {
                    break;
                }
            }
            return (AFd1aSDK) obj;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
