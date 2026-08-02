package io.sentry;

import io.sentry.C7141f;
import io.sentry.C7151h1;
import io.sentry.C7155i1;
import io.sentry.C7167l1;
import io.sentry.C7171m1;
import io.sentry.C7194q1;
import io.sentry.C7226y2;
import io.sentry.C7230z2;
import io.sentry.H2;
import io.sentry.I2;
import io.sentry.J2;
import io.sentry.L1;
import io.sentry.M2;
import io.sentry.R2;
import io.sentry.W1;
import io.sentry.X2;
import io.sentry.clientreport.c;
import io.sentry.h3;
import io.sentry.j3;
import io.sentry.l3;
import io.sentry.n3;
import io.sentry.profilemeasurements.a;
import io.sentry.profilemeasurements.b;
import io.sentry.protocol.A;
import io.sentry.protocol.C7185a;
import io.sentry.protocol.C7186b;
import io.sentry.protocol.C7187c;
import io.sentry.protocol.C7188d;
import io.sentry.protocol.C7189e;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.E;
import io.sentry.protocol.F;
import io.sentry.protocol.G;
import io.sentry.protocol.h;
import io.sentry.protocol.i;
import io.sentry.protocol.j;
import io.sentry.protocol.k;
import io.sentry.protocol.l;
import io.sentry.protocol.m;
import io.sentry.protocol.n;
import io.sentry.protocol.o;
import io.sentry.protocol.q;
import io.sentry.protocol.r;
import io.sentry.protocol.s;
import io.sentry.protocol.u;
import io.sentry.protocol.v;
import io.sentry.protocol.w;
import io.sentry.protocol.x;
import io.sentry.protocol.y;
import io.sentry.protocol.z;
import io.sentry.rrweb.a;
import io.sentry.rrweb.c;
import io.sentry.rrweb.e;
import io.sentry.rrweb.f;
import io.sentry.rrweb.g;
import io.sentry.rrweb.i;
import io.sentry.rrweb.j;
import io.sentry.w3;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7224y0 implements InterfaceC7126b0 {

    /* renamed from: c, reason: collision with root package name */
    private static final Charset f68673c = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final W2 f68674a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final HashMap f68675b;

    public C7224y0(@NotNull W2 w22) {
        this.f68674a = w22;
        HashMap hashMap = new HashMap();
        this.f68675b = hashMap;
        hashMap.put(C7185a.class, new C7185a.C1116a());
        hashMap.put(C7141f.class, new C7141f.a());
        hashMap.put(C7186b.class, new C7186b.a());
        hashMap.put(C7187c.class, new C7187c.a());
        hashMap.put(DebugImage.class, new DebugImage.a());
        hashMap.put(C7188d.class, new C7188d.a());
        hashMap.put(C7189e.class, new C7189e.a());
        hashMap.put(C7189e.b.class, new C7189e.b.a());
        hashMap.put(io.sentry.protocol.h.class, new h.a());
        hashMap.put(io.sentry.protocol.j.class, new j.a());
        hashMap.put(y.b.class, new y.b.a());
        hashMap.put(io.sentry.protocol.k.class, new k.a());
        hashMap.put(io.sentry.protocol.l.class, new l.a());
        hashMap.put(io.sentry.protocol.m.class, new m.a());
        hashMap.put(io.sentry.protocol.n.class, new n.a());
        hashMap.put(C7151h1.class, new C7151h1.b());
        hashMap.put(C7155i1.class, new C7155i1.a());
        hashMap.put(C7167l1.class, new C7167l1.a());
        hashMap.put(C7171m1.class, new C7171m1.a());
        hashMap.put(io.sentry.profilemeasurements.a.class, new a.C1115a());
        hashMap.put(io.sentry.profilemeasurements.b.class, new b.a());
        hashMap.put(io.sentry.protocol.o.class, new o.a());
        hashMap.put(C7194q1.class, new C7194q1.b());
        hashMap.put(io.sentry.rrweb.a.class, new a.C1118a());
        hashMap.put(io.sentry.rrweb.c.class, new c.a());
        hashMap.put(io.sentry.rrweb.e.class, new e.a());
        hashMap.put(io.sentry.rrweb.f.class, new f.a());
        hashMap.put(io.sentry.rrweb.g.class, new g.a());
        hashMap.put(io.sentry.rrweb.i.class, new i.a());
        hashMap.put(io.sentry.rrweb.j.class, new j.a());
        hashMap.put(io.sentry.protocol.q.class, new q.a());
        hashMap.put(io.sentry.protocol.r.class, new r.a());
        hashMap.put(W1.class, new W1.a());
        hashMap.put(C7226y2.class, new C7226y2.a());
        hashMap.put(C7230z2.class, new C7230z2.a());
        hashMap.put(io.sentry.protocol.s.class, new s.a());
        hashMap.put(H2.class, new H2.a());
        hashMap.put(I2.class, new I2.a());
        hashMap.put(J2.class, new J2.a());
        hashMap.put(M2.class, new M2.a());
        hashMap.put(R2.class, new R2.a());
        hashMap.put(io.sentry.protocol.u.class, new u.a());
        hashMap.put(io.sentry.protocol.v.class, new v.a());
        hashMap.put(X2.class, new X2.a());
        hashMap.put(io.sentry.protocol.w.class, new w.a());
        hashMap.put(io.sentry.protocol.x.class, new x.a());
        hashMap.put(io.sentry.protocol.y.class, new y.a());
        hashMap.put(L1.class, new L1.a());
        hashMap.put(io.sentry.protocol.z.class, new z.a());
        hashMap.put(io.sentry.protocol.A.class, new A.a());
        hashMap.put(h3.class, new h3.a());
        hashMap.put(j3.class, new j3.a());
        hashMap.put(l3.class, new l3.a());
        hashMap.put(n3.class, new n3.a());
        hashMap.put(io.sentry.protocol.E.class, new E.a());
        hashMap.put(io.sentry.protocol.i.class, new i.a());
        hashMap.put(w3.class, new w3.a());
        hashMap.put(io.sentry.clientreport.c.class, new c.a());
        hashMap.put(io.sentry.protocol.G.class, new G.a());
        hashMap.put(io.sentry.protocol.F.class, new F.a());
    }

    @NotNull
    private String f(Object obj, boolean z11) throws IOException {
        StringWriter stringWriter = new StringWriter();
        W2 w22 = this.f68674a;
        C7212v0 c7212v0 = new C7212v0(stringWriter, w22.getMaxDepth());
        if (z11) {
            c7212v0.i("\t");
        }
        c7212v0.r(w22.getLogger(), obj);
        return stringWriter.toString();
    }

    @Override // io.sentry.InterfaceC7126b0
    public final void a(@NotNull Writer writer, @NotNull Object obj) throws IOException {
        io.sentry.util.p.b(obj, "The entity is required.");
        W2 w22 = this.f68674a;
        ILogger logger = w22.getLogger();
        I2 i22 = I2.DEBUG;
        if (logger.d(i22)) {
            w22.getLogger().c(i22, "Serializing object: %s", f(obj, w22.isEnablePrettySerializationOutput()));
        }
        new C7212v0(writer, w22.getMaxDepth()).r(w22.getLogger(), obj);
        writer.flush();
    }

    @Override // io.sentry.InterfaceC7126b0
    public final void b(@NotNull V1 v12, @NotNull OutputStream outputStream) throws Exception {
        W2 w22 = this.f68674a;
        io.sentry.util.p.b(v12, "The SentryEnvelope object is required.");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), f68673c));
        try {
            v12.a().serialize(new C7212v0(bufferedWriter, w22.getMaxDepth()), w22.getLogger());
            bufferedWriter.write("\n");
            for (C7222x2 c7222x2 : v12.b()) {
                try {
                    byte[] o11 = c7222x2.o();
                    c7222x2.p().serialize(new C7212v0(bufferedWriter, w22.getMaxDepth()), w22.getLogger());
                    bufferedWriter.write("\n");
                    bufferedWriter.flush();
                    outputStream.write(o11);
                    bufferedWriter.write("\n");
                } catch (Exception e11) {
                    w22.getLogger().a(I2.ERROR, "Failed to create envelope item. Dropping it.", e11);
                }
            }
        } finally {
            bufferedWriter.flush();
        }
    }

    @Override // io.sentry.InterfaceC7126b0
    public final <T> T c(@NotNull Reader reader, @NotNull Class<T> cls) {
        T t2;
        W2 w22 = this.f68674a;
        try {
            C7204t0 c7204t0 = new C7204t0(reader);
            try {
                InterfaceC7174n0 interfaceC7174n0 = (InterfaceC7174n0) this.f68675b.get(cls);
                if (interfaceC7174n0 != null) {
                    t2 = cls.cast(interfaceC7174n0.a(c7204t0, w22.getLogger()));
                } else {
                    if (!cls.isArray() && !Collection.class.isAssignableFrom(cls) && !String.class.isAssignableFrom(cls) && !Map.class.isAssignableFrom(cls)) {
                        c7204t0.close();
                        return null;
                    }
                    t2 = (T) c7204t0.U1();
                }
                c7204t0.close();
                return t2;
            } finally {
            }
        } catch (Exception e11) {
            w22.getLogger().a(I2.ERROR, "Error when deserializing", e11);
            return null;
        }
    }

    @Override // io.sentry.InterfaceC7126b0
    public final V1 d(@NotNull BufferedInputStream bufferedInputStream) {
        W2 w22 = this.f68674a;
        try {
            return w22.getEnvelopeReader().a(bufferedInputStream);
        } catch (IOException e11) {
            w22.getLogger().a(I2.ERROR, "Error deserializing envelope.", e11);
            return null;
        }
    }

    @Override // io.sentry.InterfaceC7126b0
    @NotNull
    public final String e(@NotNull Map<String, Object> map) throws Exception {
        return f(map, false);
    }
}
