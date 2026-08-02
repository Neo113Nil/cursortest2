package V7;

import T7.Y;
import android.os.Build;
import com.twilio.voice.EventKeys;
import com.twilio.voice.PublisherMetadata;
import java.io.File;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: h, reason: collision with root package name */
    public static final b f12562h = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public String f12563a;

    /* renamed from: b, reason: collision with root package name */
    public EnumC0263c f12564b;

    /* renamed from: c, reason: collision with root package name */
    public JSONArray f12565c;

    /* renamed from: d, reason: collision with root package name */
    public String f12566d;

    /* renamed from: e, reason: collision with root package name */
    public String f12567e;

    /* renamed from: f, reason: collision with root package name */
    public String f12568f;

    /* renamed from: g, reason: collision with root package name */
    public Long f12569g;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f12570a = new a();

        public static final c a(String str, String str2) {
            return new c(str, str2, (DefaultConstructorMarker) null);
        }

        public static final c b(Throwable th2, EnumC0263c t10) {
            Intrinsics.checkNotNullParameter(t10, "t");
            return new c(th2, t10, (DefaultConstructorMarker) null);
        }

        public static final c c(JSONArray features) {
            Intrinsics.checkNotNullParameter(features, "features");
            return new c(features, (DefaultConstructorMarker) null);
        }

        public static final c d(File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return new c(file, (DefaultConstructorMarker) null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC0263c b(String str) {
            return StringsKt.startsWith$default(str, "crash_log_", false, 2, (Object) null) ? EnumC0263c.CrashReport : StringsKt.startsWith$default(str, "shield_log_", false, 2, (Object) null) ? EnumC0263c.CrashShield : StringsKt.startsWith$default(str, "thread_check_log_", false, 2, (Object) null) ? EnumC0263c.ThreadCheck : StringsKt.startsWith$default(str, "analysis_log_", false, 2, (Object) null) ? EnumC0263c.Analysis : StringsKt.startsWith$default(str, "anr_log_", false, 2, (Object) null) ? EnumC0263c.AnrReport : EnumC0263c.Unknown;
        }

        public b() {
        }
    }

    /* renamed from: V7.c$c, reason: collision with other inner class name */
    public enum EnumC0263c {
        Unknown,
        Analysis,
        AnrReport,
        CrashReport,
        CrashShield,
        ThreadCheck;

        /* renamed from: V7.c$c$a */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC0263c.valuesCustom().length];
                iArr[EnumC0263c.Analysis.ordinal()] = 1;
                iArr[EnumC0263c.AnrReport.ordinal()] = 2;
                iArr[EnumC0263c.CrashReport.ordinal()] = 3;
                iArr[EnumC0263c.CrashShield.ordinal()] = 4;
                iArr[EnumC0263c.ThreadCheck.ordinal()] = 5;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0263c[] valuesCustom() {
            EnumC0263c[] valuesCustom = values();
            return (EnumC0263c[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        public final String b() {
            int i10 = a.$EnumSwitchMapping$0[ordinal()];
            return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "Unknown" : "thread_check_log_" : "shield_log_" : "crash_log_" : "anr_log_" : "analysis_log_";
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.$EnumSwitchMapping$0[ordinal()];
            return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "Unknown" : "ThreadCheck" : "CrashShield" : "CrashReport" : "AnrReport" : "Analysis";
        }
    }

    public /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC0263c.valuesCustom().length];
            iArr[EnumC0263c.Analysis.ordinal()] = 1;
            iArr[EnumC0263c.AnrReport.ordinal()] = 2;
            iArr[EnumC0263c.CrashReport.ordinal()] = 3;
            iArr[EnumC0263c.CrashShield.ordinal()] = 4;
            iArr[EnumC0263c.ThreadCheck.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ c(File file, DefaultConstructorMarker defaultConstructorMarker) {
        this(file);
    }

    public final void a() {
        k kVar = k.f12578a;
        k.d(this.f12563a);
    }

    public final int b(c data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Long l10 = this.f12569g;
        if (l10 == null) {
            return -1;
        }
        long longValue = l10.longValue();
        Long l11 = data.f12569g;
        if (l11 == null) {
            return 1;
        }
        return Intrinsics.compare(l11.longValue(), longValue);
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = this.f12565c;
            if (jSONArray != null) {
                jSONObject.put("feature_names", jSONArray);
            }
            Long l10 = this.f12569g;
            if (l10 != null) {
                jSONObject.put(EventKeys.TIMESTAMP, l10);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_os_version", Build.VERSION.RELEASE);
            jSONObject.put(PublisherMetadata.DEVICE_MODEL, Build.MODEL);
            String str = this.f12566d;
            if (str != null) {
                jSONObject.put(PublisherMetadata.APP_VERSION, str);
            }
            Long l10 = this.f12569g;
            if (l10 != null) {
                jSONObject.put(EventKeys.TIMESTAMP, l10);
            }
            String str2 = this.f12567e;
            if (str2 != null) {
                jSONObject.put(EventKeys.REASON, str2);
            }
            String str3 = this.f12568f;
            if (str3 != null) {
                jSONObject.put("callstack", str3);
            }
            EnumC0263c enumC0263c = this.f12564b;
            if (enumC0263c != null) {
                jSONObject.put("type", enumC0263c);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final JSONObject e() {
        EnumC0263c enumC0263c = this.f12564b;
        int i10 = enumC0263c == null ? -1 : d.$EnumSwitchMapping$0[enumC0263c.ordinal()];
        if (i10 == 1) {
            return c();
        }
        if (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) {
            return d();
        }
        return null;
    }

    public final void f() {
        if (isValid()) {
            k kVar = k.f12578a;
            k.t(this.f12563a, toString());
        }
    }

    public final boolean isValid() {
        EnumC0263c enumC0263c = this.f12564b;
        int i10 = enumC0263c == null ? -1 : d.$EnumSwitchMapping$0[enumC0263c.ordinal()];
        return i10 != 1 ? i10 != 2 ? ((i10 != 3 && i10 != 4 && i10 != 5) || this.f12568f == null || this.f12569g == null) ? false : true : (this.f12568f == null || this.f12567e == null || this.f12569g == null) ? false : true : (this.f12565c == null || this.f12569g == null) ? false : true;
    }

    public String toString() {
        JSONObject e10 = e();
        if (e10 == null) {
            String jSONObject = new JSONObject().toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject().toString()");
            return jSONObject;
        }
        String jSONObject2 = e10.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "params.toString()");
        return jSONObject2;
    }

    public /* synthetic */ c(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public /* synthetic */ c(Throwable th2, EnumC0263c enumC0263c, DefaultConstructorMarker defaultConstructorMarker) {
        this(th2, enumC0263c);
    }

    public /* synthetic */ c(JSONArray jSONArray, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONArray);
    }

    public c(JSONArray jSONArray) {
        this.f12564b = EnumC0263c.Analysis;
        this.f12569g = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f12565c = jSONArray;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("analysis_log_");
        stringBuffer.append(String.valueOf(this.f12569g));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ANALYSIS_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        this.f12563a = stringBuffer2;
    }

    public c(Throwable th2, EnumC0263c enumC0263c) {
        this.f12564b = enumC0263c;
        this.f12566d = Y.v();
        this.f12567e = k.e(th2);
        this.f12568f = k.h(th2);
        this.f12569g = Long.valueOf(System.currentTimeMillis() / 1000);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(enumC0263c.b());
        stringBuffer.append(String.valueOf(this.f12569g));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(stringBuffer2, "StringBuffer().append(t.logPrefix).append(timestamp.toString()).append(\".json\").toString()");
        this.f12563a = stringBuffer2;
    }

    public c(String str, String str2) {
        this.f12564b = EnumC0263c.AnrReport;
        this.f12566d = Y.v();
        this.f12567e = str;
        this.f12568f = str2;
        this.f12569g = Long.valueOf(System.currentTimeMillis() / 1000);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("anr_log_");
        stringBuffer.append(String.valueOf(this.f12569g));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ANR_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        this.f12563a = stringBuffer2;
    }

    public c(File file) {
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "file.name");
        this.f12563a = name;
        this.f12564b = f12562h.b(name);
        k kVar = k.f12578a;
        JSONObject r10 = k.r(this.f12563a, true);
        if (r10 != null) {
            this.f12569g = Long.valueOf(r10.optLong(EventKeys.TIMESTAMP, 0L));
            this.f12566d = r10.optString(PublisherMetadata.APP_VERSION, null);
            this.f12567e = r10.optString(EventKeys.REASON, null);
            this.f12568f = r10.optString("callstack", null);
            this.f12565c = r10.optJSONArray("feature_names");
        }
    }
}
