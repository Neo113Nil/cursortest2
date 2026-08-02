package Ah;

import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.logging.Logger;
import oh.e;
import oh.g;
import oh.h;
import ph.AbstractC6078i;
import ph.AbstractC6080k;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f460a = Logger.getLogger(c.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final e f461b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f462c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f463d;

    /* renamed from: e, reason: collision with root package name */
    public static final e f464e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f465f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f466g;

    /* renamed from: h, reason: collision with root package name */
    public static final c f467h;

    /* renamed from: i, reason: collision with root package name */
    public static final c f468i;

    static {
        e a10 = e.a("service.name");
        f461b = a10;
        e a11 = e.a("telemetry.sdk.language");
        f462c = a11;
        e a12 = e.a("telemetry.sdk.name");
        f463d = a12;
        e a13 = e.a("telemetry.sdk.version");
        f464e = a13;
        f465f = c(g.empty());
        c c10 = c(g.b(a10, "unknown_service:java"));
        f467h = c10;
        c c11 = c(g.builder().a(a12, "opentelemetry").a(a11, "java").a(a13, "1.47.0").build());
        f466g = c11;
        f468i = c10.j(c11);
    }

    public static /* synthetic */ void a(e eVar, Object obj) {
        AbstractC6080k.a(i(eVar), "Attribute key should be a ASCII string with a length greater than 0 and not exceed 255 characters.");
        Objects.requireNonNull(obj, "Attribute value should be a ASCII string with a length not exceed 255 characters.");
    }

    public static void b(g gVar) {
        gVar.forEach(new BiConsumer() { // from class: Ah.b
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                c.a((e) obj, obj2);
            }
        });
    }

    public static c c(g gVar) {
        return d(gVar, null);
    }

    public static c d(g gVar, String str) {
        Objects.requireNonNull(gVar, "attributes");
        b(gVar);
        return new a(str, gVar);
    }

    public static c f() {
        return f468i;
    }

    public static boolean h(String str) {
        return str.length() <= 255 && AbstractC6078i.b(str);
    }

    public static boolean i(e eVar) {
        return !eVar.getKey().isEmpty() && h(eVar.getKey());
    }

    public abstract g e();

    public abstract String g();

    public c j(c cVar) {
        if (cVar == null || cVar == f465f) {
            return this;
        }
        h builder = g.builder();
        builder.b(e());
        builder.b(cVar.e());
        if (cVar.g() == null) {
            return d(builder.build(), g());
        }
        if (g() == null) {
            return d(builder.build(), cVar.g());
        }
        if (cVar.g().equals(g())) {
            return d(builder.build(), g());
        }
        f460a.info("Attempting to merge Resources with different schemaUrls. The resulting Resource will have no schemaUrl assigned. Schema 1: " + g() + " Schema 2: " + cVar.g());
        return d(builder.build(), null);
    }
}
