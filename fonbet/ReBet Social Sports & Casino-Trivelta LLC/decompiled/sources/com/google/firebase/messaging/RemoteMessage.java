package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.messaging.AbstractC3498e;
import java.util.Map;
import z.C6900a;

/* loaded from: classes3.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new X();

    /* renamed from: a, reason: collision with root package name */
    public Bundle f37866a;

    /* renamed from: b, reason: collision with root package name */
    public Map f37867b;

    /* renamed from: c, reason: collision with root package name */
    public c f37868c;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Bundle f37869a;

        /* renamed from: b, reason: collision with root package name */
        public final Map f37870b;

        public b(String str) {
            Bundle bundle = new Bundle();
            this.f37869a = bundle;
            this.f37870b = new C6900a();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("google.to", str);
                return;
            }
            throw new IllegalArgumentException("Invalid to: " + str);
        }

        public b a(String str, String str2) {
            this.f37870b.put(str, str2);
            return this;
        }

        public RemoteMessage b() {
            Bundle bundle = new Bundle();
            for (Map.Entry entry : this.f37870b.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            bundle.putAll(this.f37869a);
            this.f37869a.remove("from");
            return new RemoteMessage(bundle);
        }

        public b c(String str) {
            this.f37869a.putString("collapse_key", str);
            return this;
        }

        public b d(String str) {
            this.f37869a.putString("google.message_id", str);
            return this;
        }

        public b e(String str) {
            this.f37869a.putString("message_type", str);
            return this;
        }

        public b f(int i10) {
            this.f37869a.putString("google.ttl", String.valueOf(i10));
            return this;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f37871a;

        /* renamed from: b, reason: collision with root package name */
        public final String f37872b;
        private final String[] bodyLocArgs;

        /* renamed from: c, reason: collision with root package name */
        public final String f37873c;

        /* renamed from: d, reason: collision with root package name */
        public final String f37874d;

        /* renamed from: e, reason: collision with root package name */
        public final String f37875e;

        /* renamed from: f, reason: collision with root package name */
        public final String f37876f;

        /* renamed from: g, reason: collision with root package name */
        public final String f37877g;

        /* renamed from: h, reason: collision with root package name */
        public final String f37878h;

        /* renamed from: i, reason: collision with root package name */
        public final String f37879i;

        /* renamed from: j, reason: collision with root package name */
        public final String f37880j;

        /* renamed from: k, reason: collision with root package name */
        public final String f37881k;

        /* renamed from: l, reason: collision with root package name */
        public final Uri f37882l;
        private final int[] lightSettings;

        /* renamed from: m, reason: collision with root package name */
        public final String f37883m;

        /* renamed from: n, reason: collision with root package name */
        public final Integer f37884n;

        /* renamed from: o, reason: collision with root package name */
        public final Integer f37885o;

        /* renamed from: p, reason: collision with root package name */
        public final Integer f37886p;

        /* renamed from: q, reason: collision with root package name */
        public final Long f37887q;

        /* renamed from: r, reason: collision with root package name */
        public final boolean f37888r;

        /* renamed from: s, reason: collision with root package name */
        public final boolean f37889s;

        /* renamed from: t, reason: collision with root package name */
        public final boolean f37890t;
        private final String[] titleLocArgs;

        /* renamed from: u, reason: collision with root package name */
        public final boolean f37891u;

        /* renamed from: v, reason: collision with root package name */
        public final boolean f37892v;
        private final long[] vibrateTimings;

        public static String[] j(O o10, String str) {
            Object[] g10 = o10.g(str);
            if (g10 == null) {
                return null;
            }
            String[] strArr = new String[g10.length];
            for (int i10 = 0; i10 < g10.length; i10++) {
                strArr[i10] = String.valueOf(g10[i10]);
            }
            return strArr;
        }

        public String a() {
            return this.f37873c;
        }

        public String[] b() {
            return this.bodyLocArgs;
        }

        public String c() {
            return this.f37874d;
        }

        public String d() {
            return this.f37881k;
        }

        public String e() {
            return this.f37880j;
        }

        public String f() {
            return this.f37879i;
        }

        public String g() {
            return this.f37875e;
        }

        public Uri h() {
            String str = this.f37876f;
            if (str != null) {
                return Uri.parse(str);
            }
            return null;
        }

        public Uri i() {
            return this.f37882l;
        }

        public Integer k() {
            return this.f37886p;
        }

        public Integer l() {
            return this.f37884n;
        }

        public String m() {
            return this.f37877g;
        }

        public String n() {
            return this.f37883m;
        }

        public String o() {
            return this.f37871a;
        }

        public String[] p() {
            return this.titleLocArgs;
        }

        public String q() {
            return this.f37872b;
        }

        public Integer r() {
            return this.f37885o;
        }

        public c(O o10) {
            this.f37871a = o10.p("gcm.n.title");
            this.f37872b = o10.h("gcm.n.title");
            this.titleLocArgs = j(o10, "gcm.n.title");
            this.f37873c = o10.p("gcm.n.body");
            this.f37874d = o10.h("gcm.n.body");
            this.bodyLocArgs = j(o10, "gcm.n.body");
            this.f37875e = o10.p("gcm.n.icon");
            this.f37877g = o10.o();
            this.f37878h = o10.p("gcm.n.tag");
            this.f37879i = o10.p("gcm.n.color");
            this.f37880j = o10.p("gcm.n.click_action");
            this.f37881k = o10.p("gcm.n.android_channel_id");
            this.f37882l = o10.f();
            this.f37876f = o10.p("gcm.n.image");
            this.f37883m = o10.p("gcm.n.ticker");
            this.f37884n = o10.b("gcm.n.notification_priority");
            this.f37885o = o10.b("gcm.n.visibility");
            this.f37886p = o10.b("gcm.n.notification_count");
            this.f37888r = o10.a("gcm.n.sticky");
            this.f37889s = o10.a("gcm.n.local_only");
            this.f37890t = o10.a("gcm.n.default_sound");
            this.f37891u = o10.a("gcm.n.default_vibrate_timings");
            this.f37892v = o10.a("gcm.n.default_light_settings");
            this.f37887q = o10.j("gcm.n.event_time");
            this.lightSettings = o10.e();
            this.vibrateTimings = o10.q();
        }
    }

    public RemoteMessage(Bundle bundle) {
        this.f37866a = bundle;
    }

    public int N() {
        String string = this.f37866a.getString("google.original_priority");
        if (string == null) {
            string = this.f37866a.getString("google.priority");
        }
        return k(string);
    }

    public int O() {
        String string = this.f37866a.getString("google.delivered_priority");
        if (string == null) {
            if ("1".equals(this.f37866a.getString("google.priority_reduced"))) {
                return 2;
            }
            string = this.f37866a.getString("google.priority");
        }
        return k(string);
    }

    public long Y() {
        Object obj = this.f37866a.get("google.sent_time");
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return 0L;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid sent time: " + obj);
            return 0L;
        }
    }

    public String Z() {
        return this.f37866a.getString("google.to");
    }

    public int a0() {
        Object obj = this.f37866a.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
            return 0;
        }
    }

    public void d0(Intent intent) {
        intent.putExtras(this.f37866a);
    }

    public String g() {
        return this.f37866a.getString("collapse_key");
    }

    public Map h() {
        if (this.f37867b == null) {
            this.f37867b = AbstractC3498e.a.a(this.f37866a);
        }
        return this.f37867b;
    }

    public String i() {
        return this.f37866a.getString("from");
    }

    public String j() {
        String string = this.f37866a.getString("google.message_id");
        return string == null ? this.f37866a.getString("message_id") : string;
    }

    public final int k(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    public String l() {
        return this.f37866a.getString("message_type");
    }

    public c m() {
        if (this.f37868c == null && O.t(this.f37866a)) {
            this.f37868c = new c(new O(this.f37866a));
        }
        return this.f37868c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        X.c(this, parcel, i10);
    }
}
