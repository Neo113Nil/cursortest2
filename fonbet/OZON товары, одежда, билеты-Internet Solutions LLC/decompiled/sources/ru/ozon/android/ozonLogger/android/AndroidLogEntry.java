package ru.ozon.android.ozonLogger.android;

import Sc.o;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.android.ozonLogger.core.LogEntry;
import ru.ozon.android.ozonLogger.core.i;
import xj.c;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b2\u0018\u00002\u00020\u0001BO\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u0012J\u001b\u0010\u001d\u001a\u00060\u001bj\u0002`\u001c*\u00060\u001bj\u0002`\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010!\u001a\u00060\u001bj\u0002`\u001c*\u00060\u001fj\u0002` H\u0002¢\u0006\u0004\b!\u0010\"J-\u0010%\u001a\u00060\u001fj\u0002` *\u00060\u001fj\u0002` 2\u0006\u0010#\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b%\u0010&R.\u0010'\u001a\u0004\u0018\u00010\u00062\b\u0010$\u001a\u0004\u0018\u00010\u00068\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0012\"\u0004\b*\u0010+R.\u0010,\u001a\u0004\u0018\u00010\u00062\b\u0010$\u001a\u0004\u0018\u00010\u00068\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010(\u001a\u0004\b-\u0010\u0012\"\u0004\b.\u0010+R.\u0010/\u001a\u0004\u0018\u00010\u00062\b\u0010$\u001a\u0004\u0018\u00010\u00068\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010(\u001a\u0004\b0\u0010\u0012\"\u0004\b1\u0010+R.\u00102\u001a\u0004\u0018\u00010\u00062\b\u0010$\u001a\u0004\u0018\u00010\u00068\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010(\u001a\u0004\b3\u0010\u0012\"\u0004\b4\u0010+R.\u00105\u001a\u0004\u0018\u00010\u00062\b\u0010$\u001a\u0004\u0018\u00010\u00068\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010(\u001a\u0004\b6\u0010\u0012\"\u0004\b7\u0010+R.\u00108\u001a\u0004\u0018\u00010\u00062\b\u0010$\u001a\u0004\u0018\u00010\u00068\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010(\u001a\u0004\b9\u0010\u0012\"\u0004\b:\u0010+R.\u0010;\u001a\u0004\u0018\u00010\u00062\b\u0010$\u001a\u0004\u0018\u00010\u00068\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010(\u001a\u0004\b<\u0010\u0012\"\u0004\b=\u0010+R.\u0010>\u001a\u0004\u0018\u00010\u00062\b\u0010$\u001a\u0004\u0018\u00010\u00068\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010(\u001a\u0004\b?\u0010\u0012\"\u0004\b@\u0010+R.\u0010A\u001a\u0004\u0018\u00010\u00062\b\u0010$\u001a\u0004\u0018\u00010\u00068\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010(\u001a\u0004\bB\u0010\u0012\"\u0004\bC\u0010+R.\u0010D\u001a\u0004\u0018\u00010\u00062\b\u0010$\u001a\u0004\u0018\u00010\u00068\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010(\u001a\u0004\bE\u0010\u0012\"\u0004\bF\u0010+R.\u0010G\u001a\u0004\u0018\u00010\u00062\b\u0010$\u001a\u0004\u0018\u00010\u00068\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010(\u001a\u0004\bH\u0010\u0012\"\u0004\bI\u0010+R.\u0010J\u001a\u0004\u0018\u00010\u00062\b\u0010$\u001a\u0004\u0018\u00010\u00068\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010(\u001a\u0004\bK\u0010\u0012\"\u0004\bL\u0010+R.\u0010M\u001a\u0004\u0018\u00010\f2\b\u0010$\u001a\u0004\u0018\u00010\f8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bM\u0010O\"\u0004\bP\u0010Q¨\u0006R"}, d2 = {"Lru/ozon/android/ozonLogger/android/AndroidLogEntry;", "Lru/ozon/android/ozonLogger/core/LogEntry;", "", "timestamp", "Lru/ozon/android/ozonLogger/core/c;", "level", "", "message", "Ljava/util/UUID;", "uuid", "Lru/ozon/android/ozonLogger/core/a;", "customFields", "", "isLocal", "tag", "<init>", "(JLru/ozon/android/ozonLogger/core/c;Ljava/lang/String;Ljava/util/UUID;Lru/ozon/android/ozonLogger/core/a;Ljava/lang/Boolean;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "Lru/ozon/android/ozonLogger/core/i;", "format", "formatted", "(Lru/ozon/android/ozonLogger/core/i;)Ljava/lang/String;", "Lorg/json/JSONObject;", "asJSONObject", "()Lorg/json/JSONObject;", "formatStandardFields", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "appendSpace", "(Ljava/lang/Appendable;)Ljava/lang/Appendable;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "appendDelimiterIfNeeded", "(Ljava/lang/StringBuilder;)Ljava/lang/Appendable;", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "appendField", "(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;", "team", "Ljava/lang/String;", "getTeam", "setTeam$ozon_logger_android_release", "(Ljava/lang/String;)V", "group", "getGroup", "setGroup$ozon_logger_android_release", "service", "getService", "setService$ozon_logger_android_release", "appUuid", "getAppUuid", "setAppUuid$ozon_logger_android_release", "ozonId", "getOzonId", "setOzonId$ozon_logger_android_release", "userId", "getUserId", "setUserId$ozon_logger_android_release", "sessionId", "getSessionId", "setSessionId$ozon_logger_android_release", "appVersion", "getAppVersion", "setAppVersion$ozon_logger_android_release", "env", "getEnv", "setEnv$ozon_logger_android_release", "model", "getModel", "setModel$ozon_logger_android_release", "manufacturer", "getManufacturer", "setManufacturer$ozon_logger_android_release", "platform", "getPlatform", "setPlatform$ozon_logger_android_release", "isFirstLaunch", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setFirstLaunch$ozon_logger_android_release", "(Ljava/lang/Boolean;)V", "ozon-logger-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidLogEntry extends LogEntry {
    private String appUuid;
    private String appVersion;
    private String env;
    private String group;
    private Boolean isFirstLaunch;
    private String manufacturer;
    private String model;
    private String ozonId;
    private String platform;
    private String service;
    private String sessionId;
    private String team;
    private String userId;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f92031a;

        static {
            int[] iArr = new int[i.values().length];
            try {
                iArr[i.COMPACT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i.FULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f92031a = iArr;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ AndroidLogEntry(long r10, ru.ozon.android.ozonLogger.core.c r12, java.lang.String r13, java.util.UUID r14, ru.ozon.android.ozonLogger.core.a r15, java.lang.Boolean r16, java.lang.String r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18 & 8
            if (r0 == 0) goto L8
            java.util.UUID r14 = java.util.UUID.randomUUID()
        L8:
            r5 = r14
            r14 = r18 & 16
            r0 = 0
            if (r14 == 0) goto L10
            r6 = r0
            goto L11
        L10:
            r6 = r15
        L11:
            r14 = r18 & 32
            if (r14 == 0) goto L17
            r7 = r0
            goto L19
        L17:
            r7 = r16
        L19:
            r14 = r18 & 64
            if (r14 == 0) goto L23
            r8 = r0
            r1 = r10
            r3 = r12
            r4 = r13
            r0 = r9
            goto L29
        L23:
            r8 = r17
            r0 = r9
            r1 = r10
            r3 = r12
            r4 = r13
        L29:
            r0.<init>(r1, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.android.ozonLogger.android.AndroidLogEntry.<init>(long, ru.ozon.android.ozonLogger.core.c, java.lang.String, java.util.UUID, ru.ozon.android.ozonLogger.core.a, java.lang.Boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    private final Appendable appendDelimiterIfNeeded(StringBuilder sb2) {
        if (sb2.length() > 0 && h.M(sb2) != '{') {
            sb2.append(", ");
        }
        return sb2;
    }

    private final StringBuilder appendField(StringBuilder sb2, String str, String str2) {
        if (str2 != null) {
            appendDelimiterIfNeeded(sb2);
            sb2.append(str);
            sb2.append('=');
            sb2.append(str2);
        }
        return sb2;
    }

    private final Appendable appendSpace(Appendable appendable) {
        Appendable append = appendable.append(' ');
        Intrinsics.checkNotNullExpressionValue(append, "append(...)");
        return append;
    }

    private final String formatStandardFields() {
        StringBuilder sb2 = new StringBuilder();
        c cVar = c.f105596a;
        appendField(sb2, cVar.getTeam(), this.team);
        appendField(sb2, cVar.getGroup(), this.group);
        appendField(sb2, cVar.getService(), this.service);
        appendField(sb2, cVar.h(), this.appUuid);
        appendField(sb2, cVar.f(), this.ozonId);
        appendField(sb2, cVar.getSessionId(), this.sessionId);
        appendField(sb2, cVar.g(), this.userId);
        appendField(sb2, cVar.getAppVersion(), this.appVersion);
        appendField(sb2, cVar.getEnv(), this.env);
        appendField(sb2, cVar.e(), this.model);
        appendField(sb2, cVar.d(), this.manufacturer);
        appendField(sb2, cVar.getPlatform(), this.platform);
        String c11 = cVar.c();
        Boolean bool = this.isFirstLaunch;
        appendField(sb2, c11, bool != null ? bool.toString() : null);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    @Override // ru.ozon.android.ozonLogger.core.LogEntry
    @NotNull
    public JSONObject asJSONObject() {
        JSONObject jSONObject = new JSONObject();
        c cVar = c.f105596a;
        String timestamp = cVar.getTimestamp();
        LogEntry.Companion companion = LogEntry.INSTANCE;
        long timestamp2 = getTimestamp();
        i iVar = i.FULL;
        companion.getClass();
        jSONObject.put(timestamp, LogEntry.Companion.a(timestamp2, iVar));
        jSONObject.put(cVar.getLevel(), getLevel().b());
        jSONObject.put(cVar.getMessage(), getMessage());
        jSONObject.put(cVar.getTeam(), this.team);
        jSONObject.put(cVar.getGroup(), this.group);
        jSONObject.put(cVar.getService(), this.service);
        jSONObject.put(cVar.h(), this.appUuid);
        jSONObject.put(cVar.f(), this.ozonId);
        jSONObject.put(cVar.getSessionId(), this.sessionId);
        jSONObject.put(cVar.g(), this.userId);
        jSONObject.put(cVar.getAppVersion(), this.appVersion);
        jSONObject.put(cVar.getEnv(), this.env);
        jSONObject.put(cVar.e(), this.model);
        jSONObject.put(cVar.d(), this.manufacturer);
        jSONObject.put(cVar.getPlatform(), this.platform);
        jSONObject.put(cVar.c(), this.isFirstLaunch);
        ru.ozon.android.ozonLogger.core.a customFields = getCustomFields();
        if (customFields != null) {
            customFields.b(jSONObject);
        }
        return jSONObject;
    }

    @Override // ru.ozon.android.ozonLogger.core.LogEntry
    @NotNull
    public String formatted(@NotNull i format) {
        Set<Map.Entry<String, Object>> entrySet;
        Intrinsics.checkNotNullParameter(format, "format");
        StringBuilder sb2 = new StringBuilder();
        LogEntry.Companion companion = LogEntry.INSTANCE;
        long timestamp = getTimestamp();
        companion.getClass();
        sb2.append(LogEntry.Companion.a(timestamp, format));
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        appendSpace(sb2);
        sb2.append(getLevel().d());
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        appendSpace(sb2);
        sb2.append(getMessage());
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        appendSpace(sb2);
        StringBuilder sb3 = new StringBuilder();
        ru.ozon.android.ozonLogger.core.a customFields = getCustomFields();
        if (customFields != null && (entrySet = customFields.entrySet()) != null) {
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                appendField(sb3, (String) entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        int i11 = a.f92031a[format.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                throw new o();
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append(formatStandardFields());
            if (sb4.length() > 0) {
                appendDelimiterIfNeeded(sb5);
                sb5.append(sb4);
            }
            StringBuilder sb6 = new StringBuilder();
            Boolean isLocal = getIsLocal();
            if (isLocal != null) {
                appendField(sb6, "isLocal", String.valueOf(isLocal.booleanValue()));
            }
            String sb7 = sb6.toString();
            Intrinsics.checkNotNullExpressionValue(sb7, "toString(...)");
            if (sb7.length() > 0) {
                appendDelimiterIfNeeded(sb5);
                sb5.append(sb7);
            }
            String sb8 = sb5.toString();
            Intrinsics.checkNotNullExpressionValue(sb8, "toString(...)");
            if (sb8.length() > 0) {
                sb2.append('[');
                sb2.append(sb8);
                sb2.append(']');
            }
        } else if (sb4.length() > 0) {
            sb2.append('[');
            sb2.append(sb4);
            sb2.append(']');
        }
        String sb9 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb9, "toString(...)");
        return sb9;
    }

    public final String getAppUuid() {
        return this.appUuid;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getEnv() {
        return this.env;
    }

    public final String getGroup() {
        return this.group;
    }

    public final String getManufacturer() {
        return this.manufacturer;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getOzonId() {
        return this.ozonId;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getService() {
        return this.service;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getTeam() {
        return this.team;
    }

    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: isFirstLaunch, reason: from getter */
    public final Boolean getIsFirstLaunch() {
        return this.isFirstLaunch;
    }

    public final void setAppUuid$ozon_logger_android_release(String str) {
        this.appUuid = str;
    }

    public final void setAppVersion$ozon_logger_android_release(String str) {
        this.appVersion = str;
    }

    public final void setEnv$ozon_logger_android_release(String str) {
        this.env = str;
    }

    public final void setFirstLaunch$ozon_logger_android_release(Boolean bool) {
        this.isFirstLaunch = bool;
    }

    public final void setGroup$ozon_logger_android_release(String str) {
        this.group = str;
    }

    public final void setManufacturer$ozon_logger_android_release(String str) {
        this.manufacturer = str;
    }

    public final void setModel$ozon_logger_android_release(String str) {
        this.model = str;
    }

    public final void setOzonId$ozon_logger_android_release(String str) {
        this.ozonId = str;
    }

    public final void setPlatform$ozon_logger_android_release(String str) {
        this.platform = str;
    }

    public final void setService$ozon_logger_android_release(String str) {
        this.service = str;
    }

    public final void setSessionId$ozon_logger_android_release(String str) {
        this.sessionId = str;
    }

    public final void setTeam$ozon_logger_android_release(String str) {
        this.team = str;
    }

    public final void setUserId$ozon_logger_android_release(String str) {
        this.userId = str;
    }

    @Override // ru.ozon.android.ozonLogger.core.LogEntry
    @NotNull
    public String toString() {
        long timestamp = getTimestamp();
        ru.ozon.android.ozonLogger.core.c level = getLevel();
        String tag = getTag();
        String message = getMessage();
        String str = this.team;
        String str2 = this.group;
        String str3 = this.service;
        String str4 = this.appUuid;
        String str5 = this.ozonId;
        String str6 = this.userId;
        String str7 = this.appVersion;
        String str8 = this.env;
        String str9 = this.model;
        String str10 = this.manufacturer;
        ru.ozon.android.ozonLogger.core.a customFields = getCustomFields();
        Boolean isLocal = getIsLocal();
        StringBuilder sb2 = new StringBuilder("AndroidLogEntry(timestamp=");
        sb2.append(timestamp);
        sb2.append(", level=");
        sb2.append(level);
        Nh.a.h(sb2, ", tag=", tag, ", message=", message);
        Nh.a.h(sb2, ", team=", str, ", group=", str2);
        Nh.a.h(sb2, ", service=", str3, ", uuid=", str4);
        Nh.a.h(sb2, ", ozonId=", str5, ", userId=", str6);
        Nh.a.h(sb2, ", appVersion=", str7, ", env=", str8);
        Nh.a.h(sb2, ", model=", str9, ", manufacturer=", str10);
        sb2.append(", customFields=");
        sb2.append(customFields);
        sb2.append(", isLocal=");
        sb2.append(isLocal);
        sb2.append(")");
        return sb2.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidLogEntry(long j11, @NotNull ru.ozon.android.ozonLogger.core.c level, @NotNull String message, @NotNull UUID uuid, ru.ozon.android.ozonLogger.core.a aVar, Boolean bool, String str) {
        super(uuid, j11, level, str, message, aVar, bool);
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
    }
}
