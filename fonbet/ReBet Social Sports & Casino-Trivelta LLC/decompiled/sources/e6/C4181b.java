package e6;

import android.os.Bundle;
import android.util.Log;
import com.dieam.reactnativepushnotification.modules.RNPushNotification;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import com.twilio.voice.EventKeys;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: e6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4181b {

    /* renamed from: A, reason: collision with root package name */
    public final String f45684A;

    /* renamed from: B, reason: collision with root package name */
    public final String f45685B;

    /* renamed from: C, reason: collision with root package name */
    public final double f45686C;

    /* renamed from: D, reason: collision with root package name */
    public final double f45687D;

    /* renamed from: E, reason: collision with root package name */
    public final boolean f45688E;

    /* renamed from: F, reason: collision with root package name */
    public final double f45689F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f45690G;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f45691H;

    /* renamed from: I, reason: collision with root package name */
    public final String f45692I;

    /* renamed from: J, reason: collision with root package name */
    public final String f45693J;

    /* renamed from: K, reason: collision with root package name */
    public final boolean f45694K;

    /* renamed from: L, reason: collision with root package name */
    public final boolean f45695L;

    /* renamed from: M, reason: collision with root package name */
    public final String f45696M;

    /* renamed from: a, reason: collision with root package name */
    public final String f45697a;

    /* renamed from: b, reason: collision with root package name */
    public final String f45698b;

    /* renamed from: c, reason: collision with root package name */
    public final double f45699c;

    /* renamed from: d, reason: collision with root package name */
    public final String f45700d;

    /* renamed from: e, reason: collision with root package name */
    public final String f45701e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f45702f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f45703g;

    /* renamed from: h, reason: collision with root package name */
    public final String f45704h;

    /* renamed from: i, reason: collision with root package name */
    public final String f45705i;

    /* renamed from: j, reason: collision with root package name */
    public final String f45706j;

    /* renamed from: k, reason: collision with root package name */
    public final String f45707k;

    /* renamed from: l, reason: collision with root package name */
    public final String f45708l;

    /* renamed from: m, reason: collision with root package name */
    public final String f45709m;

    /* renamed from: n, reason: collision with root package name */
    public final String f45710n;

    /* renamed from: o, reason: collision with root package name */
    public final String f45711o;

    /* renamed from: p, reason: collision with root package name */
    public final String f45712p;

    /* renamed from: q, reason: collision with root package name */
    public final String f45713q;

    /* renamed from: r, reason: collision with root package name */
    public final String f45714r;

    /* renamed from: s, reason: collision with root package name */
    public final String f45715s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f45716t;

    /* renamed from: u, reason: collision with root package name */
    public final String f45717u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f45718v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f45719w;

    /* renamed from: x, reason: collision with root package name */
    public final double f45720x;

    /* renamed from: y, reason: collision with root package name */
    public final String f45721y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f45722z;

    public C4181b(Bundle bundle) {
        this.f45697a = bundle.getString(StackTraceHelper.ID_KEY);
        this.f45698b = bundle.getString("message");
        this.f45699c = bundle.getDouble("fireDate");
        this.f45700d = bundle.getString("title");
        this.f45701e = bundle.getString("ticker");
        this.f45702f = bundle.getBoolean("showWhen");
        this.f45703g = bundle.getBoolean("autoCancel");
        this.f45704h = bundle.getString("largeIcon");
        this.f45705i = bundle.getString("largeIconUrl");
        this.f45706j = bundle.getString("smallIcon");
        this.f45707k = bundle.getString("bigText");
        this.f45708l = bundle.getString("subText");
        this.f45709m = bundle.getString("bigPictureUrl");
        this.f45710n = bundle.getString("shortcutId");
        this.f45711o = bundle.getString("number");
        this.f45712p = bundle.getString("channelId");
        this.f45713q = bundle.getString("sound");
        this.f45714r = bundle.getString(ViewProps.COLOR);
        this.f45715s = bundle.getString(EventKeys.EVENT_GROUP);
        this.f45716t = bundle.getBoolean("groupSummary");
        this.f45717u = bundle.getString("messageId");
        this.f45718v = bundle.getBoolean("playSound");
        this.f45719w = bundle.getBoolean("vibrate");
        this.f45720x = bundle.getDouble("vibration");
        this.f45721y = bundle.getString("actions");
        this.f45722z = bundle.getBoolean("invokeApp");
        this.f45684A = bundle.getString("tag");
        this.f45685B = bundle.getString("repeatType");
        this.f45686C = bundle.getDouble("repeatTime");
        this.f45687D = bundle.getDouble("when");
        this.f45688E = bundle.getBoolean("usesChronometer");
        this.f45689F = bundle.getDouble("timeoutAfter");
        this.f45690G = bundle.getBoolean("onlyAlertOnce");
        this.f45691H = bundle.getBoolean("ongoing");
        this.f45692I = bundle.getString("reply_button_text");
        this.f45693J = bundle.getString("reply_placeholder_text");
        this.f45694K = bundle.getBoolean("allowWhileIdle");
        this.f45695L = bundle.getBoolean("ignoreInForeground");
        this.f45696M = bundle.getString("userInfo");
    }

    public static C4181b a(String str) {
        return new C4181b(new JSONObject(str));
    }

    public double b() {
        return this.f45699c;
    }

    public String c() {
        return this.f45697a;
    }

    public String d() {
        return this.f45698b;
    }

    public String e() {
        return this.f45711o;
    }

    public String f() {
        return this.f45685B;
    }

    public String g() {
        return this.f45713q;
    }

    public String h() {
        return this.f45700d;
    }

    public String i() {
        return this.f45696M;
    }

    public JSONObject j() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(StackTraceHelper.ID_KEY, this.f45697a);
            jSONObject.put("message", this.f45698b);
            jSONObject.put("fireDate", this.f45699c);
            jSONObject.put("title", this.f45700d);
            jSONObject.put("ticker", this.f45701e);
            jSONObject.put("showWhen", this.f45702f);
            jSONObject.put("autoCancel", this.f45703g);
            jSONObject.put("largeIcon", this.f45704h);
            jSONObject.put("largeIconUrl", this.f45705i);
            jSONObject.put("smallIcon", this.f45706j);
            jSONObject.put("bigText", this.f45707k);
            jSONObject.put("bigPictureUrl", this.f45709m);
            jSONObject.put("subText", this.f45708l);
            jSONObject.put("shortcutId", this.f45710n);
            jSONObject.put("number", this.f45711o);
            jSONObject.put("channelId", this.f45712p);
            jSONObject.put("sound", this.f45713q);
            jSONObject.put(ViewProps.COLOR, this.f45714r);
            jSONObject.put(EventKeys.EVENT_GROUP, this.f45715s);
            jSONObject.put("groupSummary", this.f45716t);
            jSONObject.put("messageId", this.f45717u);
            jSONObject.put("playSound", this.f45718v);
            jSONObject.put("vibrate", this.f45719w);
            jSONObject.put("vibration", this.f45720x);
            jSONObject.put("actions", this.f45721y);
            jSONObject.put("invokeApp", this.f45722z);
            jSONObject.put("tag", this.f45684A);
            jSONObject.put("repeatType", this.f45685B);
            jSONObject.put("repeatTime", this.f45686C);
            jSONObject.put("when", this.f45687D);
            jSONObject.put("usesChronometer", this.f45688E);
            jSONObject.put("timeoutAfter", this.f45689F);
            jSONObject.put("onlyAlertOnce", this.f45690G);
            jSONObject.put("ongoing", this.f45691H);
            jSONObject.put("reply_button_text", this.f45692I);
            jSONObject.put("reply_placeholder_text", this.f45693J);
            jSONObject.put("allowWhileIdle", this.f45694K);
            jSONObject.put("ignoreInForeground", this.f45695L);
            jSONObject.put("userInfo", this.f45696M);
            return jSONObject;
        } catch (JSONException e10) {
            Log.e(RNPushNotification.LOG_TAG, "Exception while converting RNPushNotificationAttributes to JSON. Returning an empty object", e10);
            return new JSONObject();
        }
    }

    public String toString() {
        return "RNPushNotificationAttributes{id='" + this.f45697a + "', message='" + this.f45698b + "', fireDate=" + this.f45699c + ", title='" + this.f45700d + "', ticker='" + this.f45701e + "', showWhen=" + this.f45702f + ", autoCancel=" + this.f45703g + ", largeIcon='" + this.f45704h + "', largeIconUrl='" + this.f45705i + "', smallIcon='" + this.f45706j + "', bigText='" + this.f45707k + "', subText='" + this.f45708l + "', bigPictureUrl='" + this.f45709m + "', shortcutId='" + this.f45710n + "', number='" + this.f45711o + "', channelId='" + this.f45712p + "', sound='" + this.f45713q + "', color='" + this.f45714r + "', group='" + this.f45715s + "', groupSummary='" + this.f45716t + "', messageId='" + this.f45717u + "', playSound=" + this.f45718v + ", vibrate=" + this.f45719w + ", vibration=" + this.f45720x + ", actions='" + this.f45721y + "', invokeApp=" + this.f45722z + ", tag='" + this.f45684A + "', repeatType='" + this.f45685B + "', repeatTime=" + this.f45686C + ", when=" + this.f45687D + ", usesChronometer=" + this.f45688E + ", timeoutAfter=" + this.f45689F + ", onlyAlertOnce=" + this.f45690G + ", ongoing=" + this.f45691H + ", reply_button_text=" + this.f45692I + ", reply_placeholder_text=" + this.f45693J + ", allowWhileIdle=" + this.f45694K + ", ignoreInForeground=" + this.f45695L + ", userInfo=" + this.f45696M + '}';
    }

    public C4181b(JSONObject jSONObject) {
        try {
            this.f45697a = jSONObject.has(StackTraceHelper.ID_KEY) ? jSONObject.getString(StackTraceHelper.ID_KEY) : null;
            this.f45698b = jSONObject.has("message") ? jSONObject.getString("message") : null;
            this.f45699c = jSONObject.has("fireDate") ? jSONObject.getDouble("fireDate") : 0.0d;
            this.f45700d = jSONObject.has("title") ? jSONObject.getString("title") : null;
            this.f45701e = jSONObject.has("ticker") ? jSONObject.getString("ticker") : null;
            this.f45702f = jSONObject.has("showWhen") ? jSONObject.getBoolean("showWhen") : true;
            this.f45703g = jSONObject.has("autoCancel") ? jSONObject.getBoolean("autoCancel") : true;
            this.f45704h = jSONObject.has("largeIcon") ? jSONObject.getString("largeIcon") : null;
            this.f45705i = jSONObject.has("largeIconUrl") ? jSONObject.getString("largeIconUrl") : null;
            this.f45706j = jSONObject.has("smallIcon") ? jSONObject.getString("smallIcon") : null;
            this.f45707k = jSONObject.has("bigText") ? jSONObject.getString("bigText") : null;
            this.f45708l = jSONObject.has("subText") ? jSONObject.getString("subText") : null;
            this.f45709m = jSONObject.has("bigPictureUrl") ? jSONObject.getString("bigPictureUrl") : null;
            this.f45710n = jSONObject.has("shortcutId") ? jSONObject.getString("shortcutId") : null;
            this.f45711o = jSONObject.has("number") ? jSONObject.getString("number") : null;
            this.f45712p = jSONObject.has("channelId") ? jSONObject.getString("channelId") : null;
            this.f45713q = jSONObject.has("sound") ? jSONObject.getString("sound") : null;
            this.f45714r = jSONObject.has(ViewProps.COLOR) ? jSONObject.getString(ViewProps.COLOR) : null;
            this.f45715s = jSONObject.has(EventKeys.EVENT_GROUP) ? jSONObject.getString(EventKeys.EVENT_GROUP) : null;
            this.f45716t = jSONObject.has("groupSummary") ? jSONObject.getBoolean("groupSummary") : false;
            this.f45717u = jSONObject.has("messageId") ? jSONObject.getString("messageId") : null;
            this.f45718v = jSONObject.has("playSound") ? jSONObject.getBoolean("playSound") : true;
            this.f45719w = jSONObject.has("vibrate") ? jSONObject.getBoolean("vibrate") : true;
            this.f45720x = jSONObject.has("vibration") ? jSONObject.getDouble("vibration") : 1000.0d;
            this.f45721y = jSONObject.has("actions") ? jSONObject.getString("actions") : null;
            this.f45722z = jSONObject.has("invokeApp") ? jSONObject.getBoolean("invokeApp") : true;
            this.f45684A = jSONObject.has("tag") ? jSONObject.getString("tag") : null;
            this.f45685B = jSONObject.has("repeatType") ? jSONObject.getString("repeatType") : null;
            this.f45686C = jSONObject.has("repeatTime") ? jSONObject.getDouble("repeatTime") : 0.0d;
            this.f45687D = jSONObject.has("when") ? jSONObject.getDouble("when") : -1.0d;
            this.f45688E = jSONObject.has("usesChronometer") ? jSONObject.getBoolean("usesChronometer") : false;
            this.f45689F = jSONObject.has("timeoutAfter") ? jSONObject.getDouble("timeoutAfter") : -1.0d;
            this.f45690G = jSONObject.has("onlyAlertOnce") ? jSONObject.getBoolean("onlyAlertOnce") : false;
            this.f45691H = jSONObject.has("ongoing") ? jSONObject.getBoolean("ongoing") : false;
            this.f45692I = jSONObject.has("reply_button_text") ? jSONObject.getString("reply_button_text") : null;
            this.f45693J = jSONObject.has("reply_placeholder_text") ? jSONObject.getString("reply_placeholder_text") : null;
            this.f45694K = jSONObject.has("allowWhileIdle") ? jSONObject.getBoolean("allowWhileIdle") : false;
            this.f45695L = jSONObject.has("ignoreInForeground") ? jSONObject.getBoolean("ignoreInForeground") : false;
            this.f45696M = jSONObject.has("userInfo") ? jSONObject.getString("userInfo") : null;
        } catch (JSONException e10) {
            throw new IllegalStateException("Exception while initializing RNPushNotificationAttributes from JSON", e10);
        }
    }
}
