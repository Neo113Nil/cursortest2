package io.sentry;

import io.sentry.protocol.DebugImage;
import j$.util.concurrent.ConcurrentHashMap;
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

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d2 implements g1 {

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f16299c = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final b6 f16300a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f16301b;

    public d2(b6 b6Var) {
        this.f16300a = b6Var;
        HashMap hashMap = new HashMap();
        this.f16301b = hashMap;
        hashMap.put(io.sentry.protocol.a.class, new io.sentry.clientreport.b(4));
        hashMap.put(e.class, new d(0));
        hashMap.put(io.sentry.protocol.b.class, new io.sentry.clientreport.b(5));
        hashMap.put(io.sentry.protocol.c.class, new io.sentry.clientreport.b(6));
        hashMap.put(DebugImage.class, new io.sentry.clientreport.b(7));
        hashMap.put(io.sentry.protocol.d.class, new io.sentry.clientreport.b(8));
        hashMap.put(io.sentry.protocol.f.class, new io.sentry.clientreport.b(9));
        hashMap.put(io.sentry.protocol.e.class, new io.sentry.clientreport.b(10));
        hashMap.put(io.sentry.protocol.i.class, new io.sentry.clientreport.b(12));
        hashMap.put(io.sentry.protocol.k.class, new io.sentry.clientreport.b(14));
        hashMap.put(io.sentry.protocol.a0.class, new io.sentry.clientreport.b(29));
        hashMap.put(io.sentry.protocol.l.class, new io.sentry.clientreport.b(15));
        hashMap.put(io.sentry.protocol.m.class, new io.sentry.clientreport.b(16));
        hashMap.put(io.sentry.protocol.n.class, new io.sentry.clientreport.b(17));
        hashMap.put(io.sentry.protocol.o.class, new io.sentry.clientreport.b(18));
        hashMap.put(g3.class, new d(1));
        hashMap.put(h3.class, new d(2));
        hashMap.put(j3.class, new d(3));
        hashMap.put(k3.class, new d(4));
        hashMap.put(io.sentry.profilemeasurements.a.class, new io.sentry.clientreport.b(2));
        hashMap.put(io.sentry.profilemeasurements.b.class, new io.sentry.clientreport.b(3));
        hashMap.put(io.sentry.protocol.p.class, new io.sentry.clientreport.b(19));
        hashMap.put(o3.class, new d(5));
        hashMap.put(io.sentry.rrweb.a.class, new io.sentry.protocol.c0(9));
        hashMap.put(io.sentry.rrweb.c.class, new io.sentry.protocol.c0(10));
        hashMap.put(io.sentry.rrweb.g.class, new io.sentry.protocol.c0(12));
        hashMap.put(io.sentry.rrweb.i.class, new io.sentry.protocol.c0(14));
        hashMap.put(io.sentry.rrweb.j.class, new io.sentry.protocol.c0(16));
        hashMap.put(io.sentry.rrweb.l.class, new io.sentry.protocol.c0(17));
        hashMap.put(io.sentry.rrweb.m.class, new io.sentry.protocol.c0(18));
        hashMap.put(io.sentry.protocol.s.class, new io.sentry.clientreport.b(20));
        hashMap.put(io.sentry.protocol.t.class, new io.sentry.clientreport.b(21));
        hashMap.put(m4.class, new d(7));
        hashMap.put(s4.class, new d(8));
        hashMap.put(t4.class, new d(9));
        hashMap.put(io.sentry.protocol.u.class, new io.sentry.clientreport.b(22));
        hashMap.put(a5.class, new d(10));
        hashMap.put(b5.class, new d(11));
        hashMap.put(c5.class, new d(12));
        hashMap.put(e5.class, new d(15));
        hashMap.put(i5.class, new d(18));
        hashMap.put(io.sentry.protocol.w.class, new io.sentry.clientreport.b(24));
        hashMap.put(io.sentry.protocol.x.class, new io.sentry.clientreport.b(25));
        hashMap.put(d6.class, new d(19));
        hashMap.put(io.sentry.protocol.y.class, new io.sentry.clientreport.b(26));
        hashMap.put(io.sentry.protocol.z.class, new io.sentry.clientreport.b(27));
        hashMap.put(io.sentry.protocol.b0.class, new io.sentry.clientreport.b(28));
        hashMap.put(e4.class, new d(6));
        hashMap.put(io.sentry.protocol.d0.class, new io.sentry.protocol.c0(0));
        hashMap.put(io.sentry.protocol.e0.class, new io.sentry.protocol.c0(1));
        hashMap.put(l6.class, new d(21));
        hashMap.put(n6.class, new d(22));
        hashMap.put(p6.class, new d(23));
        hashMap.put(q6.class, new d(24));
        hashMap.put(io.sentry.protocol.i0.class, new io.sentry.protocol.c0(2));
        hashMap.put(io.sentry.protocol.j.class, new io.sentry.clientreport.b(13));
        hashMap.put(y6.class, new d(26));
        hashMap.put(io.sentry.clientreport.c.class, new io.sentry.clientreport.b(0));
        hashMap.put(io.sentry.protocol.k0.class, new io.sentry.protocol.c0(4));
        hashMap.put(io.sentry.protocol.j0.class, new io.sentry.protocol.c0(3));
    }

    @Override // io.sentry.g1
    public final void a(Object obj, Writer writer) {
        y4.a.C(obj, "The entity is required.");
        b6 b6Var = this.f16300a;
        ILogger logger = b6Var.getLogger();
        b5 b5Var = b5.DEBUG;
        if (logger.i(b5Var)) {
            b6Var.getLogger().h(b5Var, "Serializing object: %s", f(obj, b6Var.isEnablePrettySerializationOutput()));
        }
        l1.a aVar = new l1.a(writer, b6Var.getMaxDepth());
        ((i2.d) aVar.f19315c).B(aVar, b6Var.getLogger(), obj);
        writer.flush();
    }

    @Override // io.sentry.g1
    public final String b(ConcurrentHashMap concurrentHashMap) {
        return f(concurrentHashMap, false);
    }

    @Override // io.sentry.g1
    public final Object c(Reader reader, Class cls) {
        Object d02;
        b6 b6Var = this.f16300a;
        try {
            b2 b2Var = new b2(reader);
            try {
                s1 s1Var = (s1) this.f16301b.get(cls);
                if (s1Var != null) {
                    d02 = cls.cast(s1Var.a(b2Var, b6Var.getLogger()));
                } else {
                    if (!cls.isArray() && !Collection.class.isAssignableFrom(cls) && !String.class.isAssignableFrom(cls) && !Map.class.isAssignableFrom(cls)) {
                        b2Var.close();
                        return null;
                    }
                    d02 = b2Var.d0();
                }
                b2Var.close();
                return d02;
            } finally {
            }
        } catch (Exception e7) {
            b6Var.getLogger().e(b5.ERROR, "Error when deserializing", e7);
            return null;
        }
    }

    @Override // io.sentry.g1
    public final l1.a d(BufferedInputStream bufferedInputStream) {
        b6 b6Var = this.f16300a;
        try {
            return b6Var.getEnvelopeReader().a(bufferedInputStream);
        } catch (IOException e7) {
            b6Var.getLogger().e(b5.ERROR, "Error deserializing envelope.", e7);
            return null;
        }
    }

    @Override // io.sentry.g1
    public final void e(l1.a aVar, OutputStream outputStream) {
        b6 b6Var = this.f16300a;
        y4.a.C(aVar, "The SentryEnvelope object is required.");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), f16299c));
        try {
            ((m4) aVar.f19314b).serialize(new l1.a(bufferedWriter, b6Var.getMaxDepth()), b6Var.getLogger());
            bufferedWriter.write("\n");
            for (r4 r4Var : (Iterable) aVar.f19315c) {
                try {
                    byte[] f6 = r4Var.f();
                    r4Var.f16985a.serialize(new l1.a(bufferedWriter, b6Var.getMaxDepth()), b6Var.getLogger());
                    bufferedWriter.write("\n");
                    bufferedWriter.flush();
                    outputStream.write(f6);
                    bufferedWriter.write("\n");
                } catch (Exception e7) {
                    b6Var.getLogger().e(b5.ERROR, "Failed to create envelope item. Dropping it.", e7);
                }
            }
        } finally {
            bufferedWriter.flush();
        }
    }

    public final String f(Object obj, boolean z5) {
        StringWriter stringWriter = new StringWriter();
        b6 b6Var = this.f16300a;
        l1.a aVar = new l1.a(stringWriter, b6Var.getMaxDepth());
        if (z5) {
            aVar.C("\t");
        }
        ((i2.d) aVar.f19315c).B(aVar, b6Var.getLogger(), obj);
        return stringWriter.toString();
    }
}
