package androidx.core.app;

import android.app.Person;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f18976a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f18977b;

    /* renamed from: c, reason: collision with root package name */
    public String f18978c;

    /* renamed from: d, reason: collision with root package name */
    public String f18979d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18980e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18981f;

    public static class a {
        public static Person a(v vVar) {
            return new Person.Builder().setName(vVar.c()).setIcon(vVar.a() != null ? vVar.a().m() : null).setUri(vVar.d()).setKey(vVar.b()).setBot(vVar.e()).setImportant(vVar.f()).build();
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public CharSequence f18982a;

        /* renamed from: b, reason: collision with root package name */
        public IconCompat f18983b;

        /* renamed from: c, reason: collision with root package name */
        public String f18984c;

        /* renamed from: d, reason: collision with root package name */
        public String f18985d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f18986e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f18987f;

        public v a() {
            return new v(this);
        }

        public b b(boolean z10) {
            this.f18986e = z10;
            return this;
        }

        public b c(boolean z10) {
            this.f18987f = z10;
            return this;
        }

        public b d(String str) {
            this.f18985d = str;
            return this;
        }

        public b e(CharSequence charSequence) {
            this.f18982a = charSequence;
            return this;
        }

        public b f(String str) {
            this.f18984c = str;
            return this;
        }
    }

    public v(b bVar) {
        this.f18976a = bVar.f18982a;
        this.f18977b = bVar.f18983b;
        this.f18978c = bVar.f18984c;
        this.f18979d = bVar.f18985d;
        this.f18980e = bVar.f18986e;
        this.f18981f = bVar.f18987f;
    }

    public IconCompat a() {
        return this.f18977b;
    }

    public String b() {
        return this.f18979d;
    }

    public CharSequence c() {
        return this.f18976a;
    }

    public String d() {
        return this.f18978c;
    }

    public boolean e() {
        return this.f18980e;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        String b10 = b();
        String b11 = vVar.b();
        return (b10 == null && b11 == null) ? Objects.equals(Objects.toString(c()), Objects.toString(vVar.c())) && Objects.equals(d(), vVar.d()) && Boolean.valueOf(e()).equals(Boolean.valueOf(vVar.e())) && Boolean.valueOf(f()).equals(Boolean.valueOf(vVar.f())) : Objects.equals(b10, b11);
    }

    public boolean f() {
        return this.f18981f;
    }

    public String g() {
        String str = this.f18978c;
        if (str != null) {
            return str;
        }
        if (this.f18976a == null) {
            return "";
        }
        return "name:" + ((Object) this.f18976a);
    }

    public Person h() {
        return a.a(this);
    }

    public int hashCode() {
        String b10 = b();
        return b10 != null ? b10.hashCode() : Objects.hash(c(), d(), Boolean.valueOf(e()), Boolean.valueOf(f()));
    }

    public Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f18976a);
        IconCompat iconCompat = this.f18977b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.l() : null);
        bundle.putString("uri", this.f18978c);
        bundle.putString("key", this.f18979d);
        bundle.putBoolean("isBot", this.f18980e);
        bundle.putBoolean("isImportant", this.f18981f);
        return bundle;
    }
}
