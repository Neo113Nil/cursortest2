package l6;

import com.twilio.voice.EventKeys;
import com.twilio.voice.PublisherMetadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: l6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5406a {

    /* renamed from: j, reason: collision with root package name */
    public static final b f55605j = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f55606a;

    /* renamed from: b, reason: collision with root package name */
    public final c f55607b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC0801a f55608c;

    /* renamed from: d, reason: collision with root package name */
    public final String f55609d;

    /* renamed from: e, reason: collision with root package name */
    public final List f55610e;

    /* renamed from: f, reason: collision with root package name */
    public final List f55611f;

    /* renamed from: g, reason: collision with root package name */
    public final String f55612g;

    /* renamed from: h, reason: collision with root package name */
    public final String f55613h;

    /* renamed from: i, reason: collision with root package name */
    public final String f55614i;

    /* renamed from: l6.a$a, reason: collision with other inner class name */
    public enum EnumC0801a {
        CLICK,
        SELECTED,
        TEXT_CHANGED;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0801a[] valuesCustom() {
            EnumC0801a[] valuesCustom = values();
            return (EnumC0801a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* renamed from: l6.a$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5406a a(JSONObject mapping) {
            int length;
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            String eventName = mapping.getString("event_name");
            String string = mapping.getString("method");
            Intrinsics.checkNotNullExpressionValue(string, "mapping.getString(\"method\")");
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            String upperCase = string.toUpperCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            c valueOf = c.valueOf(upperCase);
            String string2 = mapping.getString(EventKeys.CALL_MESSAGE_EVENT_TYPE);
            Intrinsics.checkNotNullExpressionValue(string2, "mapping.getString(\"event_type\")");
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            String upperCase2 = string2.toUpperCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "(this as java.lang.String).toUpperCase(locale)");
            EnumC0801a valueOf2 = EnumC0801a.valueOf(upperCase2);
            String appVersion = mapping.getString(PublisherMetadata.APP_VERSION);
            JSONArray jSONArray = mapping.getJSONArray("path");
            ArrayList arrayList = new ArrayList();
            int length2 = jSONArray.length();
            if (length2 > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject jsonPath = jSONArray.getJSONObject(i10);
                    Intrinsics.checkNotNullExpressionValue(jsonPath, "jsonPath");
                    arrayList.add(new C5408c(jsonPath));
                    if (i11 >= length2) {
                        break;
                    }
                    i10 = i11;
                }
            }
            String pathType = mapping.optString("path_type", "absolute");
            JSONArray optJSONArray = mapping.optJSONArray("parameters");
            int i12 = 0;
            ArrayList arrayList2 = new ArrayList();
            if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
                while (true) {
                    int i13 = i12 + 1;
                    JSONObject jsonParameter = optJSONArray.getJSONObject(i12);
                    Intrinsics.checkNotNullExpressionValue(jsonParameter, "jsonParameter");
                    arrayList2.add(new C5407b(jsonParameter));
                    if (i13 >= length) {
                        break;
                    }
                    i12 = i13;
                }
            }
            String componentId = mapping.optString("component_id");
            String activityName = mapping.optString("activity_name");
            Intrinsics.checkNotNullExpressionValue(eventName, "eventName");
            Intrinsics.checkNotNullExpressionValue(appVersion, "appVersion");
            Intrinsics.checkNotNullExpressionValue(componentId, "componentId");
            Intrinsics.checkNotNullExpressionValue(pathType, "pathType");
            Intrinsics.checkNotNullExpressionValue(activityName, "activityName");
            return new C5406a(eventName, valueOf, valueOf2, appVersion, arrayList, arrayList2, componentId, pathType, activityName);
        }

        public final List b(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                try {
                    int length = jSONArray.length();
                    if (length > 0) {
                        int i10 = 0;
                        while (true) {
                            int i11 = i10 + 1;
                            JSONObject jSONObject = jSONArray.getJSONObject(i10);
                            Intrinsics.checkNotNullExpressionValue(jSONObject, "array.getJSONObject(i)");
                            arrayList.add(a(jSONObject));
                            if (i11 >= length) {
                                break;
                            }
                            i10 = i11;
                        }
                    }
                } catch (IllegalArgumentException | JSONException unused) {
                }
            }
            return arrayList;
        }

        public b() {
        }
    }

    /* renamed from: l6.a$c */
    public enum c {
        MANUAL,
        INFERENCE;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            c[] valuesCustom = values();
            return (c[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public C5406a(String eventName, c method, EnumC0801a type, String appVersion, List path, List parameters, String componentId, String pathType, String activityName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(componentId, "componentId");
        Intrinsics.checkNotNullParameter(pathType, "pathType");
        Intrinsics.checkNotNullParameter(activityName, "activityName");
        this.f55606a = eventName;
        this.f55607b = method;
        this.f55608c = type;
        this.f55609d = appVersion;
        this.f55610e = path;
        this.f55611f = parameters;
        this.f55612g = componentId;
        this.f55613h = pathType;
        this.f55614i = activityName;
    }

    public final String a() {
        return this.f55614i;
    }

    public final String b() {
        return this.f55606a;
    }

    public final List c() {
        List unmodifiableList = Collections.unmodifiableList(this.f55611f);
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(parameters)");
        return unmodifiableList;
    }

    public final List d() {
        List unmodifiableList = Collections.unmodifiableList(this.f55610e);
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(path)");
        return unmodifiableList;
    }
}
