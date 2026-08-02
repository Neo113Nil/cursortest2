package com.appsflyer.internal;

import B0.C2454a;
import B90.g0;
import Sc.InterfaceC4008j;
import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1iSDK;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFd1hSDK implements AFd1iSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int afInfoLog = 1;
    private static char[] force = {31715, 31672, 31675, 31669, 31675};

    /* renamed from: i, reason: collision with root package name */
    private static int f57384i;

    @NotNull
    private final InterfaceC4008j AFInAppEventParameterName;

    @NotNull
    private final InterfaceC4008j AFInAppEventType;

    @NotNull
    private final InterfaceC4008j AFKeystoreWrapper;

    @NotNull
    private final String AFLogger;

    /* renamed from: d, reason: collision with root package name */
    private AFd1iSDK.AFa1ySDK f57385d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f57386e;

    @NotNull
    private final InterfaceC4008j registerClient;

    @NotNull
    private final InterfaceC4008j unregisterClient;

    @NotNull
    private AFd1mSDK valueOf;

    @NotNull
    private final InterfaceC4008j values;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFf1bSDK;", "valueOf", "()Lcom/appsflyer/internal/AFf1bSDK;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1hSDK$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<AFf1bSDK> {
        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: valueOf, reason: merged with bridge method [inline-methods] */
        public final AFf1bSDK invoke() {
            AFf1bSDK d11 = AFd1hSDK.values(AFd1hSDK.this).d();
            Intrinsics.checkNotNullExpressionValue(d11, "");
            return d11;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFg1xSDK;", "AFKeystoreWrapper", "()Lcom/appsflyer/internal/AFg1xSDK;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1hSDK$10, reason: invalid class name */
    static final class AnonymousClass10 extends AbstractC7737t implements Function0<AFg1xSDK> {
        AnonymousClass10() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: AFKeystoreWrapper, reason: merged with bridge method [inline-methods] */
        public final AFg1xSDK invoke() {
            AFg1xSDK force = AFd1hSDK.values(AFd1hSDK.this).force();
            Intrinsics.checkNotNullExpressionValue(force, "");
            return force;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFd1sSDK;", "values", "()Lcom/appsflyer/internal/AFd1sSDK;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1hSDK$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function0<AFd1sSDK> {
        AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: values, reason: merged with bridge method [inline-methods] */
        public final AFd1sSDK invoke() {
            AFd1sSDK AFInAppEventType = AFd1hSDK.values(AFd1hSDK.this).AFInAppEventType();
            Intrinsics.checkNotNullExpressionValue(AFInAppEventType, "");
            return AFInAppEventType;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFd1tSDK;", "AFInAppEventType", "()Lcom/appsflyer/internal/AFd1tSDK;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1hSDK$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function0<AFd1tSDK> {
        AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
        public final AFd1tSDK invoke() {
            AFd1tSDK values = AFd1hSDK.values(AFd1hSDK.this).values();
            Intrinsics.checkNotNullExpressionValue(values, "");
            return values;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "AFInAppEventParameterName", "()Ljava/util/concurrent/ExecutorService;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1hSDK$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function0<ExecutorService> {
        AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: AFInAppEventParameterName, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            ExecutorService AFInAppEventParameterName = AFd1hSDK.values(AFd1hSDK.this).AFInAppEventParameterName();
            Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
            return AFInAppEventParameterName;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFd1jSDK;", "AFInAppEventParameterName", "()Lcom/appsflyer/internal/AFd1jSDK;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1hSDK$5, reason: invalid class name */
    static final class AnonymousClass5 extends AbstractC7737t implements Function0<AFd1jSDK> {
        AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: AFInAppEventParameterName, reason: merged with bridge method [inline-methods] */
        public final AFd1jSDK invoke() {
            AFd1kSDK w11 = AFd1hSDK.values(AFd1hSDK.this).w();
            Intrinsics.checkNotNullExpressionValue(w11, "");
            return new AFd1jSDK(w11);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFd1bSDK;", "values", "()Lcom/appsflyer/internal/AFd1bSDK;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1hSDK$6, reason: invalid class name */
    static final class AnonymousClass6 extends AbstractC7737t implements Function0<AFd1bSDK> {
        AnonymousClass6() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: values, reason: merged with bridge method [inline-methods] */
        public final AFd1bSDK invoke() {
            return new AFd1bSDK(AFd1hSDK.this.values());
        }
    }

    public AFd1hSDK(@NotNull AFd1mSDK aFd1mSDK) {
        Intrinsics.checkNotNullParameter(aFd1mSDK, "");
        this.valueOf = aFd1mSDK;
        this.AFKeystoreWrapper = Sc.k.b(new AnonymousClass1());
        this.AFInAppEventType = Sc.k.b(new AnonymousClass2());
        this.AFInAppEventParameterName = Sc.k.b(new AnonymousClass3());
        this.values = Sc.k.b(new AnonymousClass10());
        this.unregisterClient = Sc.k.b(new AnonymousClass4());
        this.AFLogger = "6.13.1";
        this.registerClient = Sc.k.b(new AnonymousClass5());
        this.f57386e = Sc.k.b(new AnonymousClass6());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFInAppEventType(AFd1hSDK aFd1hSDK) {
        f57384i = (afInfoLog + 25) % UserVerificationMethods.USER_VERIFY_PATTERN;
        Intrinsics.checkNotNullParameter(aFd1hSDK, "");
        aFd1hSDK.afInfoLog();
        int i11 = f57384i + 119;
        afInfoLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private final AFf1bSDK AFKeystoreWrapper() {
        f57384i = (afInfoLog + 125) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFf1bSDK aFf1bSDK = (AFf1bSDK) this.AFKeystoreWrapper.getValue();
        int i11 = f57384i + 31;
        afInfoLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            return aFf1bSDK;
        }
        throw null;
    }

    private final AFg1xSDK AFLogger() {
        int i11 = afInfoLog + 41;
        f57384i = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            return (AFg1xSDK) this.values.getValue();
        }
        int i12 = 51 / 0;
        return (AFg1xSDK) this.values.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x01c1, code lost:
    
        if (r1 != null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01cc, code lost:
    
        r2 = valueOf(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01ca, code lost:
    
        if (r1 != null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0112, code lost:
    
        if (r0.intValue() == (-1)) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0116 A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:3:0x0001, B:5:0x000f, B:6:0x0017, B:8:0x0025, B:12:0x0043, B:14:0x004b, B:16:0x0052, B:18:0x005a, B:20:0x005e, B:22:0x0070, B:24:0x007a, B:26:0x0080, B:28:0x0086, B:29:0x0094, B:31:0x00a2, B:33:0x00a8, B:35:0x00ae, B:36:0x00b4, B:38:0x00c2, B:40:0x00c8, B:42:0x00ce, B:43:0x00d4, B:44:0x00d7, B:45:0x00dd, B:47:0x00e3, B:49:0x00e7, B:50:0x00ed, B:52:0x00f3, B:54:0x00fe, B:56:0x0102, B:60:0x0116, B:61:0x01ab, B:63:0x01af, B:65:0x01ba, B:70:0x01d0, B:73:0x01cc, B:76:0x01c5, B:77:0x01c6, B:82:0x0127, B:84:0x0132, B:85:0x014e, B:90:0x016b, B:92:0x016e, B:93:0x018a, B:94:0x010e, B:100:0x0109, B:108:0x019b, B:68:0x01c0, B:97:0x0107, B:87:0x0169), top: B:2:0x0001, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0127 A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:3:0x0001, B:5:0x000f, B:6:0x0017, B:8:0x0025, B:12:0x0043, B:14:0x004b, B:16:0x0052, B:18:0x005a, B:20:0x005e, B:22:0x0070, B:24:0x007a, B:26:0x0080, B:28:0x0086, B:29:0x0094, B:31:0x00a2, B:33:0x00a8, B:35:0x00ae, B:36:0x00b4, B:38:0x00c2, B:40:0x00c8, B:42:0x00ce, B:43:0x00d4, B:44:0x00d7, B:45:0x00dd, B:47:0x00e3, B:49:0x00e7, B:50:0x00ed, B:52:0x00f3, B:54:0x00fe, B:56:0x0102, B:60:0x0116, B:61:0x01ab, B:63:0x01af, B:65:0x01ba, B:70:0x01d0, B:73:0x01cc, B:76:0x01c5, B:77:0x01c6, B:82:0x0127, B:84:0x0132, B:85:0x014e, B:90:0x016b, B:92:0x016e, B:93:0x018a, B:94:0x010e, B:100:0x0109, B:108:0x019b, B:68:0x01c0, B:97:0x0107, B:87:0x0169), top: B:2:0x0001, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010e A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:3:0x0001, B:5:0x000f, B:6:0x0017, B:8:0x0025, B:12:0x0043, B:14:0x004b, B:16:0x0052, B:18:0x005a, B:20:0x005e, B:22:0x0070, B:24:0x007a, B:26:0x0080, B:28:0x0086, B:29:0x0094, B:31:0x00a2, B:33:0x00a8, B:35:0x00ae, B:36:0x00b4, B:38:0x00c2, B:40:0x00c8, B:42:0x00ce, B:43:0x00d4, B:44:0x00d7, B:45:0x00dd, B:47:0x00e3, B:49:0x00e7, B:50:0x00ed, B:52:0x00f3, B:54:0x00fe, B:56:0x0102, B:60:0x0116, B:61:0x01ab, B:63:0x01af, B:65:0x01ba, B:70:0x01d0, B:73:0x01cc, B:76:0x01c5, B:77:0x01c6, B:82:0x0127, B:84:0x0132, B:85:0x014e, B:90:0x016b, B:92:0x016e, B:93:0x018a, B:94:0x010e, B:100:0x0109, B:108:0x019b, B:68:0x01c0, B:97:0x0107, B:87:0x0169), top: B:2:0x0001, inners: #1, #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized void afInfoLog() {
        AFh1nSDK e11;
        Integer num;
        Pair<Integer, Integer> pair;
        String str;
        String str2;
        int i11;
        int i12;
        String f71945a;
        Integer w02;
        String f71945a2;
        Integer w03;
        String f71945a3;
        Integer w04;
        try {
            f57384i = (afInfoLog + 75) % UserVerificationMethods.USER_VERIFY_PATTERN;
            AFh1nSDK e12 = e();
            if ((e12 != null ? e12.values : -1L) < TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
                AFg1hSDK.v$default(AFLogger.INSTANCE, AFg1gSDK.EXCEPTION_MANAGER, "TTL is already passed", false, 4, null);
                d().AFInAppEventType("af_send_exc_to_server_window");
                values().AFInAppEventParameterName();
                return;
            }
            AFh1nSDK e13 = e();
            boolean z11 = false;
            if (e13 == null || !AFInAppEventType(e13)) {
                d().AFInAppEventType("af_send_exc_to_server_window");
                values().AFInAppEventParameterName();
            } else {
                AFh1nSDK e14 = e();
                if (e14 == null || (str2 = e14.AFInAppEventParameterName) == null) {
                    num = null;
                } else {
                    Intrinsics.checkNotNullParameter(str2, "");
                    MatchResult e15 = new Regex("(\\d+).(\\d+).(\\d+).*").e(str2);
                    if (e15 != null) {
                        MatchGroup b11 = e15.b().b(1);
                        if (b11 == null || (f71945a3 = b11.getF71945a()) == null || (w04 = kotlin.text.h.w0(f71945a3)) == null) {
                            i12 = 0;
                        } else {
                            i12 = w04.intValue();
                            afInfoLog = (f57384i + 45) % UserVerificationMethods.USER_VERIFY_PATTERN;
                        }
                        int i13 = i12 * 1000000;
                        MatchGroup b12 = e15.b().b(2);
                        int intValue = (((b12 == null || (f71945a2 = b12.getF71945a()) == null || (w03 = kotlin.text.h.w0(f71945a2)) == null) ? 0 : w03.intValue()) * 1000) + i13;
                        MatchGroup b13 = e15.b().b(3);
                        i11 = intValue + ((b13 == null || (f71945a = b13.getF71945a()) == null || (w02 = kotlin.text.h.w0(f71945a)) == null) ? 0 : w02.intValue());
                    } else {
                        i11 = -1;
                    }
                    num = Integer.valueOf(i11);
                }
                AFh1nSDK e16 = e();
                Pair<Integer, Integer> AFInAppEventType = (e16 == null || (str = e16.AFInAppEventParameterName) == null) ? null : AFe1zSDK.AFInAppEventType(str);
                AFh1nSDK e17 = e();
                if (e17 != null) {
                    int i14 = afInfoLog + 97;
                    f57384i = i14 % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i14 % 2 != 0) {
                        throw null;
                    }
                    String str3 = e17.AFInAppEventParameterName;
                    if (str3 != null) {
                        pair = AFe1zSDK.AFInAppEventParameterName(str3);
                        if (num != null) {
                        }
                        if (AFInAppEventType == null) {
                            values().valueOf(this.AFLogger);
                        }
                        if (AFInAppEventType == null) {
                            int i15 = f57384i + 103;
                            afInfoLog = i15 % UserVerificationMethods.USER_VERIFY_PATTERN;
                            if (i15 % 2 == 0) {
                                values().AFKeystoreWrapper(AFInAppEventType.e().intValue(), AFInAppEventType.f().intValue());
                                throw null;
                            }
                            values().AFKeystoreWrapper(AFInAppEventType.e().intValue(), AFInAppEventType.f().intValue());
                        } else if (pair != null) {
                            values().AFKeystoreWrapper(pair.e().intValue(), pair.f().intValue());
                        } else {
                            d().AFInAppEventType("af_send_exc_to_server_window");
                            values().AFInAppEventParameterName();
                        }
                    }
                }
                pair = null;
                if (num != null) {
                }
                if (AFInAppEventType == null) {
                }
                if (AFInAppEventType == null) {
                }
            }
            AFd1iSDK.AFa1ySDK aFa1ySDK = this.f57385d;
            if (aFa1ySDK != null) {
                int i16 = f57384i + 57;
                afInfoLog = i16 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i16 % 2 == 0) {
                    e11 = e();
                    int i17 = 88 / 0;
                } else {
                    e11 = e();
                }
                aFa1ySDK.onConfigurationChanged(z11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final AFh1nSDK e() {
        AFh1hSDK aFh1hSDK = AFKeystoreWrapper().valueOf.AFInAppEventParameterName;
        if (aFh1hSDK != null) {
            int i11 = (f57384i + 125) % UserVerificationMethods.USER_VERIFY_PATTERN;
            afInfoLog = i11;
            AFh1gSDK aFh1gSDK = aFh1hSDK.AFInAppEventType;
            if (aFh1gSDK != null) {
                int i12 = i11 + 93;
                f57384i = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
                int i13 = i12 % 2;
                AFh1nSDK aFh1nSDK = aFh1gSDK.AFKeystoreWrapper;
                if (i13 == 0) {
                    return aFh1nSDK;
                }
                throw null;
            }
        }
        return null;
    }

    private final void force() {
        int i11 = afInfoLog + 23;
        f57384i = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            e();
            throw null;
        }
        AFh1nSDK e11 = e();
        if (e11 != null) {
            afInfoLog = (f57384i + 59) % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (!AFInAppEventParameterName(e11)) {
                AFg1hSDK.v$default(AFLogger.INSTANCE, AFg1gSDK.EXCEPTION_MANAGER, "skipping", false, 4, null);
                f57384i = (afInfoLog + 97) % UserVerificationMethods.USER_VERIFY_PATTERN;
                return;
            }
            String str = AFLogger().registerClient;
            if (str != null) {
                String jSONObject = new JSONObject(AFKeystoreWrapper(AFKeystoreWrapper(e11), values().AFInAppEventType())).toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject, "");
                Intrinsics.checkNotNullExpressionValue(str, "");
                valueOf(jSONObject, str);
                return;
            }
            int i12 = afInfoLog + 9;
            f57384i = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i12 % 2 != 0) {
                throw null;
            }
        }
    }

    @NotNull
    private AFd1dSDK registerClient() {
        afInfoLog = (f57384i + 105) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFd1dSDK aFd1dSDK = (AFd1dSDK) this.f57386e.getValue();
        int i11 = f57384i + 17;
        afInfoLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            return aFd1dSDK;
        }
        throw null;
    }

    private final ExecutorService unregisterClient() {
        int i11 = afInfoLog + 71;
        f57384i = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            return (ExecutorService) this.unregisterClient.getValue();
        }
        throw null;
    }

    private final synchronized void v() {
        boolean z11;
        try {
            AFh1nSDK e11 = e();
            if (e11 != null) {
                if (e11.AFKeystoreWrapper == -1) {
                    int i11 = f57384i + 107;
                    afInfoLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i11 % 2 == 0) {
                        d().AFInAppEventType("af_send_exc_to_server_window");
                        throw null;
                    }
                    d().AFInAppEventType("af_send_exc_to_server_window");
                } else if (d().AFKeystoreWrapper("af_send_exc_to_server_window", -1L) == -1) {
                    values(e11);
                    afInfoLog = (f57384i + 25) % UserVerificationMethods.USER_VERIFY_PATTERN;
                }
                z11 = valueOf(e11);
            } else {
                z11 = false;
            }
            AFd1iSDK.AFa1ySDK aFa1ySDK = this.f57385d;
            if (aFa1ySDK != null) {
                aFa1ySDK.onConfigurationChanged(z11);
                return;
            }
            int i12 = f57384i + 63;
            afInfoLog = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i12 % 2 != 0) {
            } else {
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final AFd1sSDK valueOf() {
        afInfoLog = (f57384i + 37) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFd1sSDK aFd1sSDK = (AFd1sSDK) this.AFInAppEventType.getValue();
        afInfoLog = (f57384i + 69) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return aFd1sSDK;
    }

    public static final /* synthetic */ AFd1mSDK values(AFd1hSDK aFd1hSDK) {
        int i11 = afInfoLog + 97;
        f57384i = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        int i12 = i11 % 2;
        AFd1mSDK aFd1mSDK = aFd1hSDK.valueOf;
        if (i12 == 0) {
            return aFd1mSDK;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFd1iSDK
    public final void AFInAppEventParameterName() {
        f57384i = (afInfoLog + 19) % UserVerificationMethods.USER_VERIFY_PATTERN;
        unregisterClient().execute(new g0(this, 3));
        int i11 = f57384i + 63;
        afInfoLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            int i12 = 7 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFInAppEventParameterName(AFd1hSDK aFd1hSDK) {
        afInfoLog = (f57384i + 65) % UserVerificationMethods.USER_VERIFY_PATTERN;
        Intrinsics.checkNotNullParameter(aFd1hSDK, "");
        aFd1hSDK.v();
        f57384i = (afInfoLog + 3) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    private static void a(boolean z11, String str, int[] iArr, Object[] objArr) {
        char[] cArr;
        int length;
        char[] cArr2;
        String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        AFj1lSDK aFj1lSDK = new AFj1lSDK();
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        char[] cArr3 = force;
        if (cArr3 != null) {
            int i15 = $11 + 103;
            $10 = i15 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i15 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            for (int i16 = 0; i16 < length; i16++) {
                cArr2[i16] = (char) (cArr3[i16] ^ 5319028286697339858L);
            }
            cArr3 = cArr2;
        }
        char[] cArr4 = new char[i12];
        System.arraycopy(cArr3, i11, cArr4, 0, i12);
        if (bArr2 != null) {
            char[] cArr5 = new char[i12];
            aFj1lSDK.AFKeystoreWrapper = 0;
            char c11 = 0;
            while (true) {
                int i17 = aFj1lSDK.AFKeystoreWrapper;
                if (i17 >= i12) {
                    break;
                }
                if (bArr2[i17] == 1) {
                    cArr5[i17] = (char) (((cArr4[i17] * 2) + 1) - c11);
                } else {
                    cArr5[i17] = (char) ((cArr4[i17] * 2) - c11);
                }
                c11 = cArr5[i17];
                aFj1lSDK.AFKeystoreWrapper = i17 + 1;
            }
            cArr4 = cArr5;
        }
        if (i14 > 0) {
            int i18 = $11 + 45;
            $10 = i18 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i18 % 2 != 0) {
                char[] cArr6 = new char[i12];
                System.arraycopy(cArr4, 1, cArr6, 1, i12);
                System.arraycopy(cArr6, 0, cArr4, i12 - i14, i14);
                System.arraycopy(cArr6, i14, cArr4, 1, i12 >>> i14);
            } else {
                char[] cArr7 = new char[i12];
                System.arraycopy(cArr4, 0, cArr7, 0, i12);
                int i19 = i12 - i14;
                System.arraycopy(cArr7, 0, cArr4, i19, i14);
                System.arraycopy(cArr7, i14, cArr4, 0, i19);
            }
        }
        if (z11) {
            int i21 = $10 + 5;
            $11 = i21 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i21 % 2 == 0) {
                cArr = new char[i12];
                aFj1lSDK.AFKeystoreWrapper = 1;
            } else {
                cArr = new char[i12];
                aFj1lSDK.AFKeystoreWrapper = 0;
            }
            while (true) {
                int i22 = aFj1lSDK.AFKeystoreWrapper;
                if (i22 >= i12) {
                    break;
                }
                cArr[i22] = cArr4[(i12 - i22) - 1];
                aFj1lSDK.AFKeystoreWrapper = i22 + 1;
            }
            cArr4 = cArr;
        }
        if (i13 > 0) {
            int i23 = $10 + 15;
            $11 = i23 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i23 % 2 == 0) {
                aFj1lSDK.AFKeystoreWrapper = 1;
            } else {
                aFj1lSDK.AFKeystoreWrapper = 0;
            }
            while (true) {
                int i24 = aFj1lSDK.AFKeystoreWrapper;
                if (i24 >= i12) {
                    break;
                }
                cArr4[i24] = (char) (cArr4[i24] - iArr[2]);
                aFj1lSDK.AFKeystoreWrapper = i24 + 1;
            }
        }
        String str3 = new String(cArr4);
        $11 = ($10 + 13) % UserVerificationMethods.USER_VERIFY_PATTERN;
        objArr[0] = str3;
    }

    private final AFd1tSDK d() {
        int i11 = f57384i + 59;
        afInfoLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            throw null;
        }
        AFd1tSDK aFd1tSDK = (AFd1tSDK) this.AFInAppEventParameterName.getValue();
        int i12 = afInfoLog + 61;
        f57384i = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i12 % 2 == 0) {
            return aFd1tSDK;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFd1iSDK
    public final void AFKeystoreWrapper(@NotNull final Throwable th2, @NotNull final String str) {
        f57384i = (afInfoLog + 83) % UserVerificationMethods.USER_VERIFY_PATTERN;
        Intrinsics.checkNotNullParameter(th2, "");
        Intrinsics.checkNotNullParameter(str, "");
        unregisterClient().execute(new Runnable() { // from class: com.appsflyer.internal.f
            @Override // java.lang.Runnable
            public final void run() {
                AFd1hSDK.values(AFd1hSDK.this, th2, str);
            }
        });
        afInfoLog = (f57384i + 39) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.internal.AFd1iSDK
    public final void valueOf(AFd1iSDK.AFa1ySDK aFa1ySDK) {
        f57384i = (afInfoLog + 27) % UserVerificationMethods.USER_VERIFY_PATTERN;
        this.f57385d = aFa1ySDK;
        unregisterClient().execute(new g(this, 0));
        int i11 = f57384i + 101;
        afInfoLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            int i12 = 81 / 0;
        }
    }

    @NotNull
    public final AFd1gSDK values() {
        f57384i = (afInfoLog + 101) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFd1gSDK aFd1gSDK = (AFd1gSDK) this.registerClient.getValue();
        afInfoLog = (f57384i + 5) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return aFd1gSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void values(AFd1hSDK aFd1hSDK, Throwable th2, String str) {
        int i11 = afInfoLog + 107;
        f57384i = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            Intrinsics.checkNotNullParameter(aFd1hSDK, "");
            Intrinsics.checkNotNullParameter(th2, "");
            Intrinsics.checkNotNullParameter(str, "");
            AFh1nSDK e11 = aFd1hSDK.e();
            if (e11 != null) {
                afInfoLog = (f57384i + 103) % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (aFd1hSDK.valueOf(e11)) {
                    aFd1hSDK.values().valueOf(th2, str);
                    return;
                }
                return;
            }
            return;
        }
        Intrinsics.checkNotNullParameter(aFd1hSDK, "");
        Intrinsics.checkNotNullParameter(th2, "");
        Intrinsics.checkNotNullParameter(str, "");
        aFd1hSDK.e();
        throw null;
    }

    @Override // com.appsflyer.internal.AFd1iSDK
    public final void AFInAppEventType() {
        f57384i = (afInfoLog + 103) % UserVerificationMethods.USER_VERIFY_PATTERN;
        unregisterClient().execute(new h(this, 0));
        int i11 = afInfoLog + 31;
        f57384i = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            int i12 = 52 / 0;
        }
    }

    private final boolean AFInAppEventParameterName(AFh1nSDK aFh1nSDK) {
        long currentTimeMillis = System.currentTimeMillis();
        long AFKeystoreWrapper = d().AFKeystoreWrapper("af_send_exc_to_server_window", -1L);
        if (aFh1nSDK.values < TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis)) {
            afInfoLog = (f57384i + 43) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return false;
        }
        if (AFKeystoreWrapper == -1 || AFKeystoreWrapper < currentTimeMillis) {
            afInfoLog = (f57384i + 53) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return false;
        }
        int AFInAppEventParameterName = d().AFInAppEventParameterName("af_send_exc_min", -1);
        if (AFInAppEventParameterName != -1 && values().AFKeystoreWrapper() >= AFInAppEventParameterName) {
            return AFInAppEventType(aFh1nSDK);
        }
        f57384i = (afInfoLog + 57) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return false;
    }

    private final boolean AFInAppEventType(AFh1nSDK aFh1nSDK) {
        new AFe1ySDK();
        String str = this.AFLogger;
        String str2 = aFh1nSDK.AFInAppEventParameterName;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        boolean values = AFe1ySDK.values(str, str2);
        f57384i = (afInfoLog + 83) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return values;
    }

    private final Map<String, String> AFKeystoreWrapper(AFh1nSDK aFh1nSDK) {
        Object[] objArr = new Object[1];
        a(false, "\u0000\u0000\u0001\u0001\u0000", new int[]{0, 5, 0, 0}, objArr);
        Pair pair = new Pair(((String) objArr[0]).intern(), Build.BRAND);
        Pair pair2 = new Pair("model", Build.MODEL);
        Pair pair3 = new Pair("app_id", valueOf().AFInAppEventParameterName.valueOf.getPackageName());
        Pair pair4 = new Pair("p_ex", new AFb1cSDK().valueOf());
        Pair pair5 = new Pair("api", String.valueOf(Build.VERSION.SDK_INT));
        Pair pair6 = new Pair("sdk", this.AFLogger);
        AFd1sSDK valueOf = valueOf();
        Map<String, String> j11 = U.j(pair, pair2, pair3, pair4, pair5, pair6, new Pair("uid", AFb1kSDK.AFInAppEventType(valueOf.AFInAppEventParameterName, valueOf.AFKeystoreWrapper)), new Pair("exc_config", aFh1nSDK.AFInAppEventParameterName()));
        int i11 = f57384i + 71;
        afInfoLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            return j11;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void valueOf(AFd1hSDK aFd1hSDK) {
        int i11 = f57384i + 3;
        afInfoLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            Intrinsics.checkNotNullParameter(aFd1hSDK, "");
            aFd1hSDK.force();
        } else {
            Intrinsics.checkNotNullParameter(aFd1hSDK, "");
            aFd1hSDK.force();
            throw null;
        }
    }

    private final boolean valueOf(AFh1nSDK aFh1nSDK) {
        int i11 = afInfoLog + 83;
        f57384i = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            long AFKeystoreWrapper = d().AFKeystoreWrapper("af_send_exc_to_server_window", -1L);
            if (aFh1nSDK.values < TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis)) {
                f57384i = (afInfoLog + 85) % UserVerificationMethods.USER_VERIFY_PATTERN;
                return false;
            }
            if (AFKeystoreWrapper != -1) {
                afInfoLog = (f57384i + 93) % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (AFKeystoreWrapper >= currentTimeMillis) {
                    return AFInAppEventType(aFh1nSDK);
                }
            }
            return false;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        d().AFKeystoreWrapper("af_send_exc_to_server_window", -1L);
        long j11 = aFh1nSDK.values;
        TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis2);
        throw null;
    }

    private final void values(AFh1nSDK aFh1nSDK) {
        afInfoLog = (f57384i + 73) % UserVerificationMethods.USER_VERIFY_PATTERN;
        int i11 = aFh1nSDK.AFInAppEventType;
        long millis = TimeUnit.DAYS.toMillis(aFh1nSDK.AFKeystoreWrapper) + System.currentTimeMillis();
        AFd1tSDK d11 = d();
        d11.AFInAppEventParameterName("af_send_exc_to_server_window", millis);
        d11.values("af_send_exc_min", i11);
        int i12 = f57384i + 75;
        afInfoLog = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    private final void valueOf(String str, String str2) {
        f57384i = (afInfoLog + 21) % UserVerificationMethods.USER_VERIFY_PATTERN;
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        registerClient().valueOf(bytes, C2454a.b("Authorization", AFb1mSDK.AFInAppEventType(str, str2)), 2000);
        int i11 = f57384i + 105;
        afInfoLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            int i12 = 98 / 0;
        }
    }

    private static Map<String, Object> AFKeystoreWrapper(Map<String, ? extends Object> map, List<AFd1fSDK> list) {
        Map<String, Object> j11;
        int i11 = afInfoLog + 73;
        f57384i = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            Pair[] pairArr = new Pair[3];
            pairArr[0] = new Pair("deviceInfo", map);
            pairArr[0] = new Pair("excs", AFd1eSDK.AFInAppEventParameterName(list));
            j11 = U.j(pairArr);
        } else {
            j11 = U.j(new Pair("deviceInfo", map), new Pair("excs", AFd1eSDK.AFInAppEventParameterName(list)));
        }
        afInfoLog = (f57384i + 65) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return j11;
    }
}
