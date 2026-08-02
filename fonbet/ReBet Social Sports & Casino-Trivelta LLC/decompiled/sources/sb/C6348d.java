package sb;

import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import qb.C6135c;
import qb.InterfaceC6133a;
import qb.f;
import qb.g;
import qb.h;
import rb.InterfaceC6214a;
import rb.InterfaceC6215b;

/* renamed from: sb.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6348d implements InterfaceC6215b {

    /* renamed from: e, reason: collision with root package name */
    public static final qb.e f64809e = new qb.e() { // from class: sb.a
        @Override // qb.InterfaceC6134b
        public final void a(Object obj, Object obj2) {
            C6348d.c(obj, (f) obj2);
        }
    };

    /* renamed from: f, reason: collision with root package name */
    public static final g f64810f = new g() { // from class: sb.b
        @Override // qb.InterfaceC6134b
        public final void a(Object obj, Object obj2) {
            ((h) obj2).add((String) obj);
        }
    };

    /* renamed from: g, reason: collision with root package name */
    public static final g f64811g = new g() { // from class: sb.c
        @Override // qb.InterfaceC6134b
        public final void a(Object obj, Object obj2) {
            ((h) obj2).d(((Boolean) obj).booleanValue());
        }
    };

    /* renamed from: h, reason: collision with root package name */
    public static final b f64812h = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final Map f64813a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Map f64814b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public qb.e f64815c = f64809e;

    /* renamed from: d, reason: collision with root package name */
    public boolean f64816d = false;

    /* renamed from: sb.d$a */
    public class a implements InterfaceC6133a {
        public a() {
        }

        @Override // qb.InterfaceC6133a
        public void a(Object obj, Writer writer) {
            C6349e c6349e = new C6349e(writer, C6348d.this.f64813a, C6348d.this.f64814b, C6348d.this.f64815c, C6348d.this.f64816d);
            c6349e.g(obj, false);
            c6349e.o();
        }
    }

    /* renamed from: sb.d$b */
    public static final class b implements g {

        /* renamed from: a, reason: collision with root package name */
        public static final DateFormat f64818a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f64818a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        public b() {
        }

        @Override // qb.InterfaceC6134b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Date date, h hVar) {
            hVar.add(f64818a.format(date));
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public C6348d() {
        m(String.class, f64810f);
        m(Boolean.class, f64811g);
        m(Date.class, f64812h);
    }

    public static /* synthetic */ void c(Object obj, f fVar) {
        throw new C6135c("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    public InterfaceC6133a i() {
        return new a();
    }

    public C6348d j(InterfaceC6214a interfaceC6214a) {
        interfaceC6214a.a(this);
        return this;
    }

    public C6348d k(boolean z10) {
        this.f64816d = z10;
        return this;
    }

    @Override // rb.InterfaceC6215b
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public C6348d a(Class cls, qb.e eVar) {
        this.f64813a.put(cls, eVar);
        this.f64814b.remove(cls);
        return this;
    }

    public C6348d m(Class cls, g gVar) {
        this.f64814b.put(cls, gVar);
        this.f64813a.remove(cls);
        return this;
    }
}
