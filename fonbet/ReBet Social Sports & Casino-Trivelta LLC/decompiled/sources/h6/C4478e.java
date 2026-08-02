package h6;

import T7.J;
import T7.Y;
import android.os.Bundle;
import g6.C4357q;
import g6.N;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import m6.C5562a;
import o6.C5816a;
import org.json.JSONObject;
import s6.C6340a;

/* renamed from: h6.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4478e implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final a f47764f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final HashSet f47765g = new HashSet();
    private static final long serialVersionUID = 1;

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f47766a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f47767b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f47768c;

    /* renamed from: d, reason: collision with root package name */
    public final String f47769d;

    /* renamed from: e, reason: collision with root package name */
    public final String f47770e;

    /* renamed from: h6.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String c(String str) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                Charset forName = Charset.forName("UTF-8");
                Intrinsics.checkNotNullExpressionValue(forName, "Charset.forName(charsetName)");
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes = str.getBytes(forName);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                messageDigest.update(bytes, 0, bytes.length);
                byte[] digest = messageDigest.digest();
                Intrinsics.checkNotNullExpressionValue(digest, "digest.digest()");
                return p6.g.c(digest);
            } catch (UnsupportedEncodingException e10) {
                Y.j0("Failed to generate checksum: ", e10);
                return "1";
            } catch (NoSuchAlgorithmException e11) {
                Y.j0("Failed to generate checksum: ", e11);
                return "0";
            }
        }

        public final void d(String str) {
            boolean contains;
            if (str == null || str.length() == 0 || str.length() > 40) {
                if (str == null) {
                    str = "<None Provided>";
                }
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{str, 40}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                throw new C4357q(format);
            }
            synchronized (C4478e.f47765g) {
                contains = C4478e.f47765g.contains(str);
                Unit unit = Unit.INSTANCE;
            }
            if (contains) {
                return;
            }
            if (new Regex("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").matches(str)) {
                synchronized (C4478e.f47765g) {
                    C4478e.f47765g.add(str);
                }
            } else {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String format2 = String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", Arrays.copyOf(new Object[]{str}, 1));
                Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(format, *args)");
                throw new C4357q(format2);
            }
        }

        public a() {
        }
    }

    /* renamed from: h6.e$b */
    public static final class b implements Serializable {

        /* renamed from: e, reason: collision with root package name */
        public static final a f47771e = new a(null);
        private static final long serialVersionUID = 20160803001L;

        /* renamed from: a, reason: collision with root package name */
        public final String f47772a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f47773b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f47774c;

        /* renamed from: d, reason: collision with root package name */
        public final String f47775d;

        /* renamed from: h6.e$b$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public a() {
            }
        }

        public b(String jsonString, boolean z10, boolean z11, String str) {
            Intrinsics.checkNotNullParameter(jsonString, "jsonString");
            this.f47772a = jsonString;
            this.f47773b = z10;
            this.f47774c = z11;
            this.f47775d = str;
        }

        private final Object readResolve() {
            return new C4478e(this.f47772a, this.f47773b, this.f47774c, this.f47775d, null);
        }
    }

    public /* synthetic */ C4478e(String str, boolean z10, boolean z11, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z10, z11, str2);
    }

    private final Object writeReplace() {
        String jSONObject = this.f47766a.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "jsonObject.toString()");
        return new b(jSONObject, this.f47767b, this.f47768c, this.f47770e);
    }

    public final String b() {
        a aVar = f47764f;
        String jSONObject = this.f47766a.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "jsonObject.toString()");
        return aVar.c(jSONObject);
    }

    public final boolean c() {
        return this.f47767b;
    }

    public final JSONObject d(String str, String str2, Double d10, Bundle bundle, UUID uuid) {
        a aVar = f47764f;
        aVar.d(str2);
        JSONObject jSONObject = new JSONObject();
        String e10 = C6340a.e(str2);
        jSONObject.put("_eventName", e10);
        jSONObject.put("_eventName_md5", aVar.c(e10));
        jSONObject.put("_logTime", System.currentTimeMillis() / 1000);
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (bundle != null) {
            Map i10 = i(bundle);
            for (String str3 : i10.keySet()) {
                jSONObject.put(str3, i10.get(str3));
            }
        }
        if (d10 != null) {
            jSONObject.put("_valueToSum", d10.doubleValue());
        }
        if (this.f47768c) {
            jSONObject.put("_inBackground", "1");
        }
        if (this.f47767b) {
            jSONObject.put("_implicitlyLogged", "1");
            return jSONObject;
        }
        J.a aVar2 = T7.J.f10993e;
        N n10 = N.APP_EVENTS;
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "eventObject.toString()");
        aVar2.c(n10, "AppEvents", "Created app event '%s'", jSONObject2);
        return jSONObject;
    }

    public final JSONObject e() {
        return this.f47766a;
    }

    public final String f() {
        return this.f47769d;
    }

    public final boolean g() {
        if (this.f47770e == null) {
            return true;
        }
        return Intrinsics.areEqual(b(), this.f47770e);
    }

    public final boolean h() {
        return this.f47767b;
    }

    public final Map i(Bundle bundle) {
        HashMap hashMap = new HashMap();
        for (String key : bundle.keySet()) {
            a aVar = f47764f;
            Intrinsics.checkNotNullExpressionValue(key, "key");
            aVar.d(key);
            Object obj = bundle.get(key);
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, key}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                throw new C4357q(format);
            }
            hashMap.put(key, obj.toString());
        }
        C5816a.c(hashMap);
        C6340a c6340a = C6340a.f64790a;
        C6340a.f(hashMap, this.f47769d);
        C5562a c5562a = C5562a.f56377a;
        C5562a.c(hashMap, this.f47769d);
        return hashMap;
    }

    public String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[]{this.f47766a.optString("_eventName"), Boolean.valueOf(this.f47767b), this.f47766a.toString()}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public C4478e(String contextName, String eventName, Double d10, Bundle bundle, boolean z10, boolean z11, UUID uuid) {
        Intrinsics.checkNotNullParameter(contextName, "contextName");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        this.f47767b = z10;
        this.f47768c = z11;
        this.f47769d = eventName;
        this.f47766a = d(contextName, eventName, d10, bundle, uuid);
        this.f47770e = b();
    }

    public C4478e(String str, boolean z10, boolean z11, String str2) {
        JSONObject jSONObject = new JSONObject(str);
        this.f47766a = jSONObject;
        this.f47767b = z10;
        String optString = jSONObject.optString("_eventName");
        Intrinsics.checkNotNullExpressionValue(optString, "jsonObject.optString(Constants.EVENT_NAME_EVENT_KEY)");
        this.f47769d = optString;
        this.f47770e = str2;
        this.f47768c = z11;
    }
}
