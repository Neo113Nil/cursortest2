package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import defpackage.dmi;
import defpackage.joa;
import defpackage.ypa;
import defpackage.zzl;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0015\u0010\u0011\u001a\u00020\u000e8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0015\u0010\u000f\u001a\u00020\u000e8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u0010R\u0011\u0010\u0014\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u0016"}, d2 = {"Lcom/appsflyer/internal/AFd1hSDK;", "", "Lcom/appsflyer/internal/AFc1hSDK;", "p0", "Lcom/appsflyer/internal/AFc1pSDK;", "p1", "<init>", "(Lcom/appsflyer/internal/AFc1hSDK;Lcom/appsflyer/internal/AFc1pSDK;)V", "e", "Lcom/appsflyer/internal/AFc1hSDK;", "AFLogger", "force", "Lcom/appsflyer/internal/AFc1pSDK;", "registerClient", "", com.mbridge.msdk.setting.i.a, "Ljoa;", "unregisterClient", "", "()Z", "v", "AFKeystoreWrapper", "()Ljava/lang/String;", "d", "AFa1uSDK"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFd1hSDK {

    @Nullable
    public static AFd1gSDK d;

    /* renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final AFc1hSDK AFLogger;

    /* renamed from: force, reason: from kotlin metadata */
    @NotNull
    private final AFc1pSDK registerClient;

    /* renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final joa unregisterClient;

    /* renamed from: registerClient, reason: from kotlin metadata */
    @NotNull
    public final joa i;

    /* renamed from: AFa1uSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static String AFLogger = "https://%scdn-%ssettings.%s/android/v2/%s/settings";

    @NotNull
    public static String AFKeystoreWrapper = "https://%scdn-%stestsettings.%s/android/v2/%s/settings";

    @NotNull
    public static List<String> unregisterClient = kotlin.collections.b.j("googleplay", "playstore", "googleplaystore");

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public /* synthetic */ class AFa1vSDK {
        public static final /* synthetic */ int[] registerClient;

        static {
            int[] iArr = new int[AFd1cSDK.values().length];
            try {
                iArr[AFd1cSDK.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFd1cSDK.API.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFd1cSDK.RC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            registerClient = iArr;
        }
    }

    public AFd1hSDK(@NotNull AFc1hSDK aFc1hSDK, @NotNull AFc1pSDK aFc1pSDK) {
        aFc1hSDK.getClass();
        aFc1pSDK.getClass();
        this.AFLogger = aFc1hSDK;
        this.registerClient = aFc1pSDK;
        final int i = 0;
        this.unregisterClient = ypa.b(new Function0(this) { // from class: com.appsflyer.internal.m
            public final /* synthetic */ AFd1hSDK b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String AFLogger2;
                String AFKeystoreWrapper2;
                int i2 = i;
                AFd1hSDK aFd1hSDK = this.b;
                switch (i2) {
                    case 0:
                        AFLogger2 = AFd1hSDK.AFLogger(aFd1hSDK);
                        return AFLogger2;
                    default:
                        AFKeystoreWrapper2 = AFd1hSDK.AFKeystoreWrapper(aFd1hSDK);
                        return AFKeystoreWrapper2;
                }
            }
        });
        final int i2 = 1;
        this.i = ypa.b(new Function0(this) { // from class: com.appsflyer.internal.m
            public final /* synthetic */ AFd1hSDK b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String AFLogger2;
                String AFKeystoreWrapper2;
                int i22 = i2;
                AFd1hSDK aFd1hSDK = this.b;
                switch (i22) {
                    case 0:
                        AFLogger2 = AFd1hSDK.AFLogger(aFd1hSDK);
                        return AFLogger2;
                    default:
                        AFKeystoreWrapper2 = AFd1hSDK.AFKeystoreWrapper(aFd1hSDK);
                        return AFKeystoreWrapper2;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String AFKeystoreWrapper(AFd1hSDK aFd1hSDK) {
        String packageName = aFd1hSDK.AFLogger.registerClient.d.getPackageName();
        packageName.getClass();
        String y = dmi.y(packageName, (String) aFd1hSDK.unregisterClient.getValue());
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = y.getBytes(Charsets.UTF_8);
        bytes.getClass();
        byte[] digest = messageDigest.digest(bytes);
        digest.getClass();
        String encodeToString = Base64.encodeToString(digest, 2);
        encodeToString.getClass();
        Locale locale = Locale.ROOT;
        return new Regex("[^\\w]+").replace(i.k(locale, encodeToString, locale), "").substring(0, 6).concat(".");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String AFLogger(AFd1hSDK aFd1hSDK) {
        AFc1pSDK aFc1pSDK = aFd1hSDK.registerClient;
        String AFLogger2 = aFd1hSDK.AFLogger.AFLogger("CHANNEL");
        if (AFLogger2 != null && AFLogger2.equals("")) {
            AFLogger2 = null;
        }
        String d2 = AFa1zSDK.d(aFc1pSDK, AFLogger2);
        if (d2 != null && !StringsKt.R(d2)) {
            String obj = StringsKt.l0(d2).toString();
            List<String> list = unregisterClient;
            Locale locale = Locale.ROOT;
            locale.getClass();
            String lowerCase = obj.toLowerCase(locale);
            lowerCase.getClass();
            if (list.contains(lowerCase)) {
                AFLoggerBase.w$default(AFLogger.INSTANCE, LogTag.GENERAL, String.format(Locale.US, "AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", Arrays.copyOf(new Object[]{obj}, 1)), false, 4, null);
                d2 = "";
            } else {
                d2 = "-".concat(obj);
            }
        }
        return StringsKt.l0(d2 != null ? d2 : "").toString();
    }

    public static boolean unregisterClient() {
        return d == null;
    }

    @NotNull
    public final String registerClient() {
        int i = AFa1vSDK.registerClient[(d == null ? AFd1cSDK.DEFAULT : AFd1cSDK.API).ordinal()];
        if (i == 1) {
            return "appsflyersdk.com";
        }
        if (i == 2) {
            AFd1gSDK aFd1gSDK = d;
            String str = aFd1gSDK != null ? aFd1gSDK.AFKeystoreWrapper : null;
            return str == null ? "" : str;
        }
        if (i == 3) {
            return "";
        }
        zzl.b();
        return null;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001e\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\r\u0010\u000e\"\u0004\b\t\u0010\u000f"}, d2 = {"Lcom/appsflyer/internal/AFd1hSDK$AFa1uSDK;", "", "<init>", "()V", "", "AFLogger", "Ljava/lang/String;", "AFKeystoreWrapper", "", "unregisterClient", "Ljava/util/List;", "registerClient", "Lcom/appsflyer/internal/AFd1gSDK;", "d", "Lcom/appsflyer/internal/AFd1gSDK;", "(Lcom/appsflyer/internal/AFd1gSDK;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1hSDK$AFa1uSDK, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static void unregisterClient(@Nullable AFd1gSDK aFd1gSDK) {
            AFd1hSDK.d = aFd1gSDK;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final void AFKeystoreWrapper(@Nullable AFd1gSDK aFd1gSDK) {
        Companion.unregisterClient(aFd1gSDK);
    }

    @NotNull
    public final String AFKeystoreWrapper() {
        AFd1cSDK aFd1cSDK;
        if (d == null) {
            aFd1cSDK = AFd1cSDK.DEFAULT;
        } else {
            aFd1cSDK = AFd1cSDK.API;
        }
        int i = AFa1vSDK.registerClient[aFd1cSDK.ordinal()];
        if (i == 1) {
            return (String) this.i.getValue();
        }
        if (i == 2) {
            AFd1gSDK aFd1gSDK = d;
            String str = aFd1gSDK != null ? aFd1gSDK.d : null;
            return str == null ? "" : str;
        }
        if (i == 3) {
            return "";
        }
        zzl.b();
        return null;
    }
}
