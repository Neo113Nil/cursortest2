package j9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f53843c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    public final String f53844a;

    /* renamed from: b, reason: collision with root package name */
    public final List f53845b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f53846a = "";

        /* renamed from: b, reason: collision with root package name */
        public List f53847b = new ArrayList();

        public d a() {
            return new d(this.f53846a, Collections.unmodifiableList(this.f53847b));
        }

        public a b(List list) {
            this.f53847b = list;
            return this;
        }

        public a c(String str) {
            this.f53846a = str;
            return this;
        }
    }

    public d(String str, List list) {
        this.f53844a = str;
        this.f53845b = list;
    }

    public static a c() {
        return new a();
    }

    public List a() {
        return this.f53845b;
    }

    public String b() {
        return this.f53844a;
    }
}
