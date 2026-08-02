package i6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final a f48124d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final Set f48125e = new CopyOnWriteArraySet();

    /* renamed from: a, reason: collision with root package name */
    public final String f48126a;

    /* renamed from: b, reason: collision with root package name */
    public final String f48127b;

    /* renamed from: c, reason: collision with root package name */
    public final List f48128c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(JSONObject jSONObject) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                JSONObject optJSONObject = jSONObject.optJSONObject(key);
                if (optJSONObject != null) {
                    String k10 = optJSONObject.optString("k");
                    String v10 = optJSONObject.optString("v");
                    Intrinsics.checkNotNullExpressionValue(k10, "k");
                    if (k10.length() != 0) {
                        Set a10 = d.a();
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        List split$default = StringsKt.split$default((CharSequence) k10, new String[]{","}, false, 0, 6, (Object) null);
                        Intrinsics.checkNotNullExpressionValue(v10, "v");
                        a10.add(new d(key, split$default, v10, null));
                    }
                }
            }
        }

        public final Set b() {
            HashSet hashSet = new HashSet();
            Iterator it = d.a().iterator();
            while (it.hasNext()) {
                hashSet.add(((d) it.next()).c());
            }
            return hashSet;
        }

        public final Set c() {
            return new HashSet(d.a());
        }

        public final void d(String rulesFromServer) {
            Intrinsics.checkNotNullParameter(rulesFromServer, "rulesFromServer");
            try {
                d.a().clear();
                a(new JSONObject(rulesFromServer));
            } catch (JSONException unused) {
            }
        }

        public a() {
        }
    }

    public /* synthetic */ d(String str, List list, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, str2);
    }

    public static final /* synthetic */ Set a() {
        if (Y7.a.d(d.class)) {
            return null;
        }
        try {
            return f48125e;
        } catch (Throwable th2) {
            Y7.a.b(th2, d.class);
            return null;
        }
    }

    public final List b() {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            return new ArrayList(this.f48128c);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    public final String c() {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            return this.f48126a;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    public final String d() {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            return this.f48127b;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    public d(String str, List list, String str2) {
        this.f48126a = str;
        this.f48127b = str2;
        this.f48128c = list;
    }
}
