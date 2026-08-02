package x6;

import D6.n;
import android.content.Context;
import java.io.File;
import w6.InterfaceC6710a;
import w6.InterfaceC6712c;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f67881a;

    /* renamed from: b, reason: collision with root package name */
    public final String f67882b;

    /* renamed from: c, reason: collision with root package name */
    public final n f67883c;

    /* renamed from: d, reason: collision with root package name */
    public final long f67884d;

    /* renamed from: e, reason: collision with root package name */
    public final long f67885e;

    /* renamed from: f, reason: collision with root package name */
    public final long f67886f;

    /* renamed from: g, reason: collision with root package name */
    public final j f67887g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC6710a f67888h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC6712c f67889i;

    /* renamed from: j, reason: collision with root package name */
    public final A6.b f67890j;

    /* renamed from: k, reason: collision with root package name */
    public final Context f67891k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f67892l;

    public class a implements n {
        public a() {
        }

        @Override // D6.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public File get() {
            D6.k.g(d.this.f67891k);
            return d.this.f67891k.getApplicationContext().getCacheDir();
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public int f67894a;

        /* renamed from: b, reason: collision with root package name */
        public String f67895b;

        /* renamed from: c, reason: collision with root package name */
        public n f67896c;

        /* renamed from: d, reason: collision with root package name */
        public long f67897d;

        /* renamed from: e, reason: collision with root package name */
        public long f67898e;

        /* renamed from: f, reason: collision with root package name */
        public long f67899f;

        /* renamed from: g, reason: collision with root package name */
        public j f67900g;

        /* renamed from: h, reason: collision with root package name */
        public InterfaceC6710a f67901h;

        /* renamed from: i, reason: collision with root package name */
        public InterfaceC6712c f67902i;

        /* renamed from: j, reason: collision with root package name */
        public A6.b f67903j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f67904k;

        /* renamed from: l, reason: collision with root package name */
        public final Context f67905l;

        public d n() {
            return new d(this);
        }

        public b o(long j10) {
            this.f67897d = j10;
            return this;
        }

        public b(Context context) {
            this.f67894a = 1;
            this.f67895b = "image_cache";
            this.f67897d = 41943040L;
            this.f67898e = 10485760L;
            this.f67899f = 2097152L;
            this.f67900g = new c();
            this.f67905l = context;
        }
    }

    public d(b bVar) {
        Context context = bVar.f67905l;
        this.f67891k = context;
        D6.k.j((bVar.f67896c == null && context == null) ? false : true, "Either a non-null context or a base directory path or supplier must be provided.");
        if (bVar.f67896c == null && context != null) {
            bVar.f67896c = new a();
        }
        this.f67881a = bVar.f67894a;
        this.f67882b = (String) D6.k.g(bVar.f67895b);
        this.f67883c = (n) D6.k.g(bVar.f67896c);
        this.f67884d = bVar.f67897d;
        this.f67885e = bVar.f67898e;
        this.f67886f = bVar.f67899f;
        this.f67887g = (j) D6.k.g(bVar.f67900g);
        this.f67888h = bVar.f67901h == null ? w6.g.b() : bVar.f67901h;
        this.f67889i = bVar.f67902i == null ? w6.h.i() : bVar.f67902i;
        this.f67890j = bVar.f67903j == null ? A6.c.b() : bVar.f67903j;
        this.f67892l = bVar.f67904k;
    }

    public static b m(Context context) {
        return new b(context);
    }

    public String b() {
        return this.f67882b;
    }

    public n c() {
        return this.f67883c;
    }

    public InterfaceC6710a d() {
        return this.f67888h;
    }

    public InterfaceC6712c e() {
        return this.f67889i;
    }

    public long f() {
        return this.f67884d;
    }

    public A6.b g() {
        return this.f67890j;
    }

    public j h() {
        return this.f67887g;
    }

    public boolean i() {
        return this.f67892l;
    }

    public long j() {
        return this.f67885e;
    }

    public long k() {
        return this.f67886f;
    }

    public int l() {
        return this.f67881a;
    }
}
