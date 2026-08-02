package io.sentry;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import io.sentry.C1;
import io.sentry.C4728b3;
import io.sentry.C4733c3;
import io.sentry.C4744f;
import io.sentry.C4777l2;
import io.sentry.C4793o3;
import io.sentry.C4815r3;
import io.sentry.C4862w3;
import io.sentry.C4870y1;
import io.sentry.C4871y2;
import io.sentry.C4875z1;
import io.sentry.D1;
import io.sentry.EnumC4783m3;
import io.sentry.EnumC4788n3;
import io.sentry.G3;
import io.sentry.H1;
import io.sentry.V3;
import io.sentry.a4;
import io.sentry.clientreport.c;
import io.sentry.d4;
import io.sentry.f4;
import io.sentry.profilemeasurements.a;
import io.sentry.profilemeasurements.b;
import io.sentry.protocol.A;
import io.sentry.protocol.B;
import io.sentry.protocol.C4799a;
import io.sentry.protocol.C4801c;
import io.sentry.protocol.C4802d;
import io.sentry.protocol.C4803e;
import io.sentry.protocol.C4804f;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.F;
import io.sentry.protocol.G;
import io.sentry.protocol.H;
import io.sentry.protocol.i;
import io.sentry.protocol.j;
import io.sentry.protocol.k;
import io.sentry.protocol.l;
import io.sentry.protocol.m;
import io.sentry.protocol.n;
import io.sentry.protocol.o;
import io.sentry.protocol.p;
import io.sentry.protocol.r;
import io.sentry.protocol.s;
import io.sentry.protocol.t;
import io.sentry.protocol.v;
import io.sentry.protocol.w;
import io.sentry.protocol.x;
import io.sentry.protocol.y;
import io.sentry.protocol.z;
import io.sentry.q4;
import io.sentry.rrweb.a;
import io.sentry.rrweb.c;
import io.sentry.rrweb.e;
import io.sentry.rrweb.f;
import io.sentry.rrweb.g;
import io.sentry.rrweb.i;
import io.sentry.rrweb.j;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class H0 implements InterfaceC4770k0 {

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f50354c = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final F3 f50355a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f50356b;

    public H0(F3 f32) {
        this.f50355a = f32;
        HashMap hashMap = new HashMap();
        this.f50356b = hashMap;
        hashMap.put(C4799a.class, new C4799a.C0767a());
        hashMap.put(C4744f.class, new C4744f.a());
        hashMap.put(C4801c.class, new C4801c.a());
        hashMap.put(C4802d.class, new C4802d.a());
        hashMap.put(DebugImage.class, new DebugImage.a());
        hashMap.put(C4803e.class, new C4803e.a());
        hashMap.put(C4804f.class, new C4804f.a());
        hashMap.put(C4804f.b.class, new C4804f.b.a());
        hashMap.put(io.sentry.protocol.i.class, new i.a());
        hashMap.put(io.sentry.protocol.k.class, new k.a());
        hashMap.put(z.b.class, new z.b.a());
        hashMap.put(io.sentry.protocol.l.class, new l.a());
        hashMap.put(io.sentry.protocol.m.class, new m.a());
        hashMap.put(io.sentry.protocol.n.class, new n.a());
        hashMap.put(io.sentry.protocol.o.class, new o.a());
        hashMap.put(C4870y1.class, new C4870y1.b());
        hashMap.put(C4875z1.class, new C4875z1.a());
        hashMap.put(C1.class, new C1.b());
        hashMap.put(D1.class, new D1.a());
        hashMap.put(io.sentry.profilemeasurements.a.class, new a.C0766a());
        hashMap.put(io.sentry.profilemeasurements.b.class, new b.a());
        hashMap.put(io.sentry.protocol.p.class, new p.a());
        hashMap.put(H1.class, new H1.b());
        hashMap.put(io.sentry.rrweb.a.class, new a.C0769a());
        hashMap.put(io.sentry.rrweb.c.class, new c.a());
        hashMap.put(io.sentry.rrweb.e.class, new e.a());
        hashMap.put(io.sentry.rrweb.f.class, new f.a());
        hashMap.put(io.sentry.rrweb.g.class, new g.a());
        hashMap.put(io.sentry.rrweb.i.class, new i.a());
        hashMap.put(io.sentry.rrweb.j.class, new j.a());
        hashMap.put(io.sentry.protocol.r.class, new r.a());
        hashMap.put(io.sentry.protocol.s.class, new s.a());
        hashMap.put(C4871y2.class, new C4871y2.a());
        hashMap.put(C4728b3.class, new C4728b3.a());
        hashMap.put(C4733c3.class, new C4733c3.a());
        hashMap.put(io.sentry.protocol.t.class, new t.a());
        hashMap.put(EnumC4783m3.class, new EnumC4783m3.a());
        hashMap.put(EnumC4788n3.class, new EnumC4788n3.a());
        hashMap.put(C4793o3.class, new C4793o3.a());
        hashMap.put(C4815r3.class, new C4815r3.a());
        hashMap.put(C4862w3.class, new C4862w3.a());
        hashMap.put(io.sentry.protocol.v.class, new v.a());
        hashMap.put(io.sentry.protocol.w.class, new w.a());
        hashMap.put(G3.class, new G3.a());
        hashMap.put(io.sentry.protocol.x.class, new x.a());
        hashMap.put(io.sentry.protocol.y.class, new y.a());
        hashMap.put(io.sentry.protocol.z.class, new z.a());
        hashMap.put(C4777l2.class, new C4777l2.a());
        hashMap.put(io.sentry.protocol.A.class, new A.a());
        hashMap.put(io.sentry.protocol.B.class, new B.a());
        hashMap.put(V3.class, new V3.a());
        hashMap.put(a4.class, new a4.a());
        hashMap.put(d4.class, new d4.a());
        hashMap.put(f4.class, new f4.a());
        hashMap.put(io.sentry.protocol.F.class, new F.a());
        hashMap.put(io.sentry.protocol.j.class, new j.a());
        hashMap.put(q4.class, new q4.a());
        hashMap.put(io.sentry.clientreport.c.class, new c.a());
        hashMap.put(io.sentry.protocol.H.class, new H.a());
        hashMap.put(io.sentry.protocol.G.class, new G.a());
    }

    @Override // io.sentry.InterfaceC4770k0
    public void a(Object obj, Writer writer) {
        io.sentry.util.w.c(obj, "The entity is required.");
        io.sentry.util.w.c(writer, "The Writer object is required.");
        ILogger logger = this.f50355a.getLogger();
        EnumC4788n3 enumC4788n3 = EnumC4788n3.DEBUG;
        if (logger.d(enumC4788n3)) {
            this.f50355a.getLogger().c(enumC4788n3, "Serializing object: %s", h(obj, this.f50355a.isEnablePrettySerializationOutput()));
        }
        new E0(writer, this.f50355a.getMaxDepth()).j(this.f50355a.getLogger(), obj);
        writer.flush();
    }

    @Override // io.sentry.InterfaceC4770k0
    public void b(C4866x2 c4866x2, OutputStream outputStream) {
        io.sentry.util.w.c(c4866x2, "The SentryEnvelope object is required.");
        io.sentry.util.w.c(outputStream, "The Stream object is required.");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), f50354c), 512);
        try {
            c4866x2.b().serialize(new E0(bufferedWriter, this.f50355a.getMaxDepth()), this.f50355a.getLogger());
            bufferedWriter.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            for (C4665a3 c4665a3 : c4866x2.c()) {
                try {
                    byte[] M10 = c4665a3.M();
                    c4665a3.O().serialize(new E0(bufferedWriter, this.f50355a.getMaxDepth()), this.f50355a.getLogger());
                    bufferedWriter.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                    bufferedWriter.flush();
                    outputStream.write(M10);
                    bufferedWriter.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                } catch (Exception e10) {
                    this.f50355a.getLogger().b(EnumC4788n3.ERROR, "Failed to create envelope item. Dropping it.", e10);
                }
            }
        } finally {
            bufferedWriter.flush();
        }
    }

    @Override // io.sentry.InterfaceC4770k0
    public Object c(Reader reader, Class cls) {
        Object H12;
        try {
            C0 c02 = new C0(reader);
            try {
                InterfaceC4859w0 interfaceC4859w0 = (InterfaceC4859w0) this.f50356b.get(cls);
                if (interfaceC4859w0 != null) {
                    H12 = cls.cast(interfaceC4859w0.a(c02, this.f50355a.getLogger()));
                } else {
                    if (!g(cls)) {
                        c02.close();
                        return null;
                    }
                    H12 = c02.H1();
                }
                c02.close();
                return H12;
            } finally {
            }
        } catch (Exception e10) {
            this.f50355a.getLogger().b(EnumC4788n3.ERROR, "Error when deserializing", e10);
            return null;
        }
    }

    @Override // io.sentry.InterfaceC4770k0
    public C4866x2 d(InputStream inputStream) {
        io.sentry.util.w.c(inputStream, "The InputStream object is required.");
        try {
            return this.f50355a.getEnvelopeReader().a(inputStream);
        } catch (IOException e10) {
            this.f50355a.getLogger().b(EnumC4788n3.ERROR, "Error deserializing envelope.", e10);
            return null;
        }
    }

    @Override // io.sentry.InterfaceC4770k0
    public Object e(Reader reader, Class cls, InterfaceC4859w0 interfaceC4859w0) {
        try {
            C0 c02 = new C0(reader);
            try {
                Object H12 = Collection.class.isAssignableFrom(cls) ? interfaceC4859w0 == null ? c02.H1() : c02.P1(this.f50355a.getLogger(), interfaceC4859w0) : c02.H1();
                c02.close();
                return H12;
            } finally {
            }
        } catch (Throwable th2) {
            this.f50355a.getLogger().b(EnumC4788n3.ERROR, "Error when deserializing", th2);
            return null;
        }
    }

    @Override // io.sentry.InterfaceC4770k0
    public String f(Map map) {
        return h(map, false);
    }

    public final boolean g(Class cls) {
        return cls.isArray() || Collection.class.isAssignableFrom(cls) || String.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls);
    }

    public final String h(Object obj, boolean z10) {
        StringWriter stringWriter = new StringWriter();
        E0 e02 = new E0(stringWriter, this.f50355a.getMaxDepth());
        if (z10) {
            e02.h("\t");
        }
        e02.j(this.f50355a.getLogger(), obj);
        return stringWriter.toString();
    }
}
