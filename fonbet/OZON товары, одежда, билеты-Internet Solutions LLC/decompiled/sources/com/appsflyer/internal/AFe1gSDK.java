package com.appsflyer.internal;

import Sc.InterfaceC4008j;
import android.util.Base64;
import com.appsflyer.AFLogger;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0015\u0010\u0011\u001a\u00020\u000e8\u0003X\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0015\u0010\u000b\u001a\u00020\u000e8\u0003X\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0011\u0010\b\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0014"}, d2 = {"Lcom/appsflyer/internal/AFe1gSDK;", "", "Lcom/appsflyer/internal/AFd1sSDK;", "p0", "Lcom/appsflyer/internal/AFd1tSDK;", "p1", "<init>", "(Lcom/appsflyer/internal/AFd1sSDK;Lcom/appsflyer/internal/AFd1tSDK;)V", "AFInAppEventParameterName", "Lcom/appsflyer/internal/AFd1sSDK;", "valueOf", "AFInAppEventType", "Lcom/appsflyer/internal/AFd1tSDK;", "e", "", "AFLogger", "LSc/j;", "values", "", "()Z", "()Ljava/lang/String;", "d", "AFKeystoreWrapper", "AFa1vSDK"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFe1gSDK {

    /* renamed from: e, reason: collision with root package name */
    private static AFe1kSDK f57402e;

    /* renamed from: AFInAppEventParameterName, reason: from kotlin metadata */
    @NotNull
    private final AFd1sSDK valueOf;

    /* renamed from: AFInAppEventType, reason: from kotlin metadata */
    @NotNull
    private final AFd1tSDK e;

    /* renamed from: AFLogger, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j values;

    /* renamed from: valueOf, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC4008j AFInAppEventType;

    /* renamed from: AFa1vSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static String AFKeystoreWrapper = "https://%scdn-%ssettings.%s/android/v1/%s/settings";

    @NotNull
    public static String values = "https://%scdn-%stestsettings.%s/android/v1/%s/settings";

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final List<String> f57401d = C7714v.b0("googleplay", "playstore", "googleplaystore");

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "AFKeystoreWrapper", "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFe1gSDK$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function0<String> {
        AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: AFKeystoreWrapper, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String packageName = AFe1gSDK.this.valueOf.AFInAppEventParameterName.valueOf.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "");
            return AFe1gSDK.values(packageName, AFe1gSDK.valueOf(AFe1gSDK.this));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "AFInAppEventParameterName", "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFe1gSDK$5, reason: invalid class name */
    static final class AnonymousClass5 extends AbstractC7737t implements Function0<String> {
        AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: AFInAppEventParameterName, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String AFKeystoreWrapper = AFb1tSDK.AFKeystoreWrapper(AFe1gSDK.this.e, AFe1gSDK.this.valueOf.AFLogger());
            if (AFKeystoreWrapper != null && !kotlin.text.h.K(AFKeystoreWrapper)) {
                String obj = kotlin.text.h.z0(AFKeystoreWrapper).toString();
                List<String> AFKeystoreWrapper2 = Companion.AFKeystoreWrapper();
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "");
                String lowerCase = obj.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                if (AFKeystoreWrapper2.contains(lowerCase)) {
                    String format = String.format("AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", Arrays.copyOf(new Object[]{obj}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "");
                    AFLogger.afWarnLog(format);
                    AFKeystoreWrapper = "";
                } else {
                    AFKeystoreWrapper = "-".concat(obj);
                }
            }
            return kotlin.text.h.z0(AFKeystoreWrapper != null ? AFKeystoreWrapper : "").toString();
        }
    }

    public /* synthetic */ class AFa1uSDK {
        public static final /* synthetic */ int[] AFInAppEventType;

        static {
            int[] iArr = new int[AFe1cSDK.values().length];
            iArr[AFe1cSDK.DEFAULT.ordinal()] = 1;
            iArr[AFe1cSDK.API.ordinal()] = 2;
            iArr[AFe1cSDK.RC.ordinal()] = 3;
            AFInAppEventType = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\u0006\u001a\u00020\u0003X\u0087\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\tR\u0012\u0010\u000b\u001a\u00020\u0003X\u0087\u0002¢\u0006\u0006\n\u0004\b\n\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\f@\u0007X\u0087\n¢\u0006\f\n\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/appsflyer/internal/AFe1gSDK$AFa1vSDK;", "", "", "", "d", "Ljava/util/List;", "AFKeystoreWrapper", "()Ljava/util/List;", "valueOf", "Ljava/lang/String;", "values", "AFInAppEventParameterName", "Lcom/appsflyer/internal/AFe1kSDK;", "e", "Lcom/appsflyer/internal/AFe1kSDK;", "AFInAppEventType", "(Lcom/appsflyer/internal/AFe1kSDK;)V", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFe1gSDK$AFa1vSDK, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static void AFInAppEventType(AFe1kSDK aFe1kSDK) {
            AFe1gSDK.f57402e = aFe1kSDK;
        }

        @NotNull
        public static List<String> AFKeystoreWrapper() {
            return AFe1gSDK.f57401d;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AFe1gSDK(@NotNull AFd1sSDK aFd1sSDK, @NotNull AFd1tSDK aFd1tSDK) {
        Intrinsics.checkNotNullParameter(aFd1sSDK, "");
        Intrinsics.checkNotNullParameter(aFd1tSDK, "");
        this.valueOf = aFd1sSDK;
        this.e = aFd1tSDK;
        this.values = Sc.k.b(new AnonymousClass5());
        this.AFInAppEventType = Sc.k.b(new AnonymousClass4());
    }

    public static final void AFInAppEventParameterName(AFe1kSDK aFe1kSDK) {
        Companion.AFInAppEventType(aFe1kSDK);
    }

    public static boolean valueOf() {
        return f57402e == null;
    }

    public static final /* synthetic */ String valueOf(AFe1gSDK aFe1gSDK) {
        return (String) aFe1gSDK.values.getValue();
    }

    public static final /* synthetic */ String values(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(str2);
        String obj = sb3.toString();
        Intrinsics.checkNotNullParameter(obj, "");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = obj.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] digest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(digest, "");
        String encodeToString = Base64.encodeToString(digest, 2);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "");
        String lowerCase = encodeToString.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        String substring = new Regex("[^\\w]+").replace(lowerCase, "").substring(0, 6);
        Intrinsics.checkNotNullExpressionValue(substring, "");
        sb2.append(substring);
        sb2.append('-');
        return sb2.toString();
    }

    @NotNull
    public final String AFInAppEventParameterName() {
        int i11 = AFa1uSDK.AFInAppEventType[(valueOf() ? AFe1cSDK.DEFAULT : AFe1cSDK.API).ordinal()];
        if (i11 == 1) {
            return (String) this.AFInAppEventType.getValue();
        }
        if (i11 != 2) {
            if (i11 == 3) {
                return "";
            }
            throw new Sc.o();
        }
        AFe1kSDK aFe1kSDK = f57402e;
        String str = aFe1kSDK != null ? aFe1kSDK.values : null;
        return str == null ? "" : str;
    }

    @NotNull
    public final String AFInAppEventType() {
        int i11 = AFa1uSDK.AFInAppEventType[(valueOf() ? AFe1cSDK.DEFAULT : AFe1cSDK.API).ordinal()];
        if (i11 == 1) {
            return "appsflyersdk.com";
        }
        if (i11 != 2) {
            if (i11 == 3) {
                return "";
            }
            throw new Sc.o();
        }
        AFe1kSDK aFe1kSDK = f57402e;
        String str = aFe1kSDK != null ? aFe1kSDK.AFInAppEventParameterName : null;
        return str == null ? "" : str;
    }
}
