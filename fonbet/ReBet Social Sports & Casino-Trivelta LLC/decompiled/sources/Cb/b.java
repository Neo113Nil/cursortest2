package Cb;

import com.google.firebase.messaging.P;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f1613b = new a().a();

    /* renamed from: a, reason: collision with root package name */
    public final Cb.a f1614a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public Cb.a f1615a = null;

        public b a() {
            return new b(this.f1615a);
        }

        public a b(Cb.a aVar) {
            this.f1615a = aVar;
            return this;
        }
    }

    public b(Cb.a aVar) {
        this.f1614a = aVar;
    }

    public static a b() {
        return new a();
    }

    public Cb.a a() {
        return this.f1614a;
    }

    public byte[] c() {
        return P.a(this);
    }
}
