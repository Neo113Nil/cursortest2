package j9;

import g9.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: j9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5102a {

    /* renamed from: e, reason: collision with root package name */
    public static final C5102a f53818e = new C0779a().b();

    /* renamed from: a, reason: collision with root package name */
    public final f f53819a;

    /* renamed from: b, reason: collision with root package name */
    public final List f53820b;

    /* renamed from: c, reason: collision with root package name */
    public final C5103b f53821c;

    /* renamed from: d, reason: collision with root package name */
    public final String f53822d;

    /* renamed from: j9.a$a, reason: collision with other inner class name */
    public static final class C0779a {

        /* renamed from: a, reason: collision with root package name */
        public f f53823a = null;

        /* renamed from: b, reason: collision with root package name */
        public List f53824b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public C5103b f53825c = null;

        /* renamed from: d, reason: collision with root package name */
        public String f53826d = "";

        public C0779a a(d dVar) {
            this.f53824b.add(dVar);
            return this;
        }

        public C5102a b() {
            return new C5102a(this.f53823a, Collections.unmodifiableList(this.f53824b), this.f53825c, this.f53826d);
        }

        public C0779a c(String str) {
            this.f53826d = str;
            return this;
        }

        public C0779a d(C5103b c5103b) {
            this.f53825c = c5103b;
            return this;
        }

        public C0779a e(f fVar) {
            this.f53823a = fVar;
            return this;
        }
    }

    public C5102a(f fVar, List list, C5103b c5103b, String str) {
        this.f53819a = fVar;
        this.f53820b = list;
        this.f53821c = c5103b;
        this.f53822d = str;
    }

    public static C0779a e() {
        return new C0779a();
    }

    public String a() {
        return this.f53822d;
    }

    public C5103b b() {
        return this.f53821c;
    }

    public List c() {
        return this.f53820b;
    }

    public f d() {
        return this.f53819a;
    }

    public byte[] f() {
        return l.a(this);
    }
}
