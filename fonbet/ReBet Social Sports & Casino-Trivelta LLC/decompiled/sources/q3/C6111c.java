package q3;

import android.util.Patterns;
import java.util.HashMap;
import o3.C5800e;
import o3.C5801f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: q3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6111c extends AbstractC6112d {

    /* renamed from: b, reason: collision with root package name */
    public C6110b f63384b;

    /* renamed from: c, reason: collision with root package name */
    public String f63385c;

    /* renamed from: d, reason: collision with root package name */
    public String f63386d;

    /* renamed from: g, reason: collision with root package name */
    public JSONArray f63389g;

    /* renamed from: j, reason: collision with root package name */
    public int f63392j;

    /* renamed from: k, reason: collision with root package name */
    public String f63393k;

    /* renamed from: l, reason: collision with root package name */
    public String f63394l;

    /* renamed from: m, reason: collision with root package name */
    public a f63395m;

    /* renamed from: n, reason: collision with root package name */
    public String f63396n;

    /* renamed from: o, reason: collision with root package name */
    public String f63397o;

    /* renamed from: a, reason: collision with root package name */
    public final String f63383a = C6111c.class.getSimpleName();

    /* renamed from: h, reason: collision with root package name */
    public boolean f63390h = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f63398p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f63399q = false;

    /* renamed from: f, reason: collision with root package name */
    public JSONObject f63388f = new JSONObject();

    /* renamed from: e, reason: collision with root package name */
    public int f63387e = -1;

    /* renamed from: i, reason: collision with root package name */
    public HashMap f63391i = new HashMap();

    /* renamed from: q3.c$a */
    public enum a {
        account,
        subaccount
    }

    public C6111c() {
        JSONArray jSONArray = new JSONArray();
        this.f63389g = jSONArray;
        try {
            this.f63388f.put("custom_fields", jSONArray);
        } catch (JSONException e10) {
            e10.toString();
        }
    }

    public final void a(String str) {
        this.f63398p = true;
    }

    public final void b() {
        this.f63399q = true;
    }

    public String c() {
        return this.f63386d;
    }

    public HashMap d() {
        return this.f63391i;
    }

    public int e() {
        return this.f63387e;
    }

    public a f() {
        return this.f63395m;
    }

    public C6110b g() {
        return this.f63384b;
    }

    public String h() {
        return this.f63396n;
    }

    public String i() {
        return this.f63385c;
    }

    public String j() {
        if (this.f63390h) {
            return this.f63388f.toString();
        }
        return null;
    }

    public String k() {
        return this.f63397o;
    }

    public String l() {
        return this.f63394l;
    }

    public String m() {
        return this.f63393k;
    }

    public int n() {
        return this.f63392j;
    }

    public C6111c o(String str) {
        b();
        this.f63386d = str;
        return this;
    }

    public C6111c p(int i10) {
        a("amount");
        if (i10 <= 0) {
            throw new C5800e(i10);
        }
        this.f63387e = i10;
        return this;
    }

    public C6111c q(a aVar) {
        a("bearer");
        this.f63395m = aVar;
        return this;
    }

    public C6111c r(C6110b c6110b) {
        this.f63384b = c6110b;
        return this;
    }

    public C6111c s(String str) {
        a("currency");
        this.f63396n = str;
        return this;
    }

    public C6111c t(String str) {
        a("email");
        if (!Patterns.EMAIL_ADDRESS.matcher(str).matches()) {
            throw new C5801f(str);
        }
        this.f63385c = str;
        return this;
    }

    public C6111c u(String str) {
        a("plan");
        this.f63397o = str;
        return this;
    }

    public C6111c v(String str) {
        a("reference");
        this.f63394l = str;
        return this;
    }

    public C6111c w(String str) {
        a("subaccount");
        this.f63393k = str;
        return this;
    }

    public C6111c x(int i10) {
        a("transaction charge");
        this.f63392j = i10;
        return this;
    }
}
