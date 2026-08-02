package io.sentry.android.core.internal.tombstone;

import com.twilio.voice.EventKeys;
import io.sentry.C4733c3;
import io.sentry.EnumC4788n3;
import io.sentry.J3;
import io.sentry.android.core.internal.util.s;
import io.sentry.protocol.A;
import io.sentry.protocol.C4803e;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.m;
import io.sentry.protocol.t;
import io.sentry.protocol.y;
import io.sentry.protocol.z;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import s1.h;
import w3.c;
import w3.l;
import w3.n;
import w3.q;
import w3.r;
import y3.AbstractC6851a;

/* loaded from: classes3.dex */
public class b implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f51075a;

    /* renamed from: b, reason: collision with root package name */
    public final List f51076b;

    /* renamed from: c, reason: collision with root package name */
    public final List f51077c;

    /* renamed from: d, reason: collision with root package name */
    public final String f51078d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f51079e;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f51080a;

        /* renamed from: b, reason: collision with root package name */
        public String f51081b;

        /* renamed from: c, reason: collision with root package name */
        public long f51082c;

        /* renamed from: d, reason: collision with root package name */
        public long f51083d;

        public a(l lVar) {
            this.f51080a = lVar.f67345g;
            this.f51081b = lVar.f67346h;
            this.f51082c = lVar.f67339a;
            this.f51083d = lVar.f67340b;
        }

        public void a(long j10) {
            this.f51083d = j10;
        }

        public DebugImage b() {
            if (this.f51081b.isEmpty()) {
                return null;
            }
            DebugImage debugImage = new DebugImage();
            debugImage.setCodeId(this.f51081b);
            debugImage.setCodeFile(this.f51080a);
            String a10 = s.a(this.f51081b);
            if (a10 == null) {
                a10 = this.f51081b;
            }
            debugImage.setDebugId(a10);
            debugImage.setImageAddr(b.z0(this.f51082c));
            debugImage.setImageSize(this.f51083d - this.f51082c);
            debugImage.setType("elf");
            return debugImage;
        }
    }

    public b(InputStream inputStream, List list, List list2, String str) {
        HashMap hashMap = new HashMap();
        this.f51079e = hashMap;
        this.f51075a = inputStream;
        this.f51076b = list;
        this.f51077c = list2;
        this.f51078d = str;
        hashMap.put("SIGILL", "IllegalInstruction");
        hashMap.put("SIGTRAP", "Trap");
        hashMap.put("SIGABRT", "Abort");
        hashMap.put("SIGBUS", "BusError");
        hashMap.put("SIGFPE", "FloatingPointException");
        hashMap.put("SIGSEGV", "Segfault");
    }

    public static m J(n nVar) {
        m mVar = new m();
        mVar.r(io.sentry.android.core.internal.tombstone.a.TOMBSTONE.getValue());
        mVar.n(Boolean.FALSE);
        mVar.q(Boolean.TRUE);
        HashMap hashMap = new HashMap();
        hashMap.put("number", Integer.valueOf(nVar.f67350a));
        hashMap.put("name", nVar.f67351b);
        hashMap.put(EventKeys.ERROR_CODE, Integer.valueOf(nVar.f67352c));
        hashMap.put("code_name", nVar.f67353d);
        mVar.o(hashMap);
        return mVar;
    }

    public static String z0(long j10) {
        return String.format("0x%x", Long.valueOf(j10));
    }

    public C4733c3 A0() {
        InputStream inputStream = this.f51075a;
        if (inputStream != null) {
            return D0(AbstractC6851a.a(inputStream));
        }
        throw new IOException("No InputStream provided; use parse(Tombstone) instead.");
    }

    public final List B(q qVar) {
        t tVar = new t();
        if (qVar.a()) {
            n nVar = qVar.f67376l;
            tVar.p(nVar.f67351b);
            tVar.r((String) this.f51079e.get(nVar.f67351b));
            tVar.l(J(nVar));
        }
        tVar.o(Long.valueOf(qVar.f67371g));
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(tVar);
        return arrayList;
    }

    public C4733c3 D0(q qVar) {
        C4733c3 c4733c3 = new C4733c3();
        c4733c3.C0(EnumC4788n3.FATAL);
        c4733c3.Y("native");
        c4733c3.D0(k(qVar));
        c4733c3.T(r(qVar));
        c4733c3.A0(B(qVar));
        List p02 = c4733c3.p0();
        Objects.requireNonNull(p02);
        c4733c3.F0(w0(qVar, (t) p02.get(0)));
        return c4733c3;
    }

    public final z U(r rVar) {
        ArrayList arrayList = new ArrayList();
        for (c cVar : rVar.f67393f) {
            if (!cVar.f67299f.endsWith("libart.so") && (!cVar.f67299f.startsWith("<anonymous") || !cVar.f67297d.isEmpty())) {
                y yVar = new y();
                yVar.G(cVar.f67299f);
                yVar.z(cVar.f67297d);
                yVar.B(z0(cVar.f67295b));
                String str = cVar.f67297d;
                Boolean c10 = str.isEmpty() ? Boolean.FALSE : J3.c(str, this.f51076b, this.f51077c);
                String str2 = this.f51078d;
                boolean z10 = true;
                boolean z11 = str2 != null && cVar.f67299f.startsWith(str2);
                if ((c10 == null || !c10.booleanValue()) && !z11) {
                    z10 = false;
                }
                yVar.A(Boolean.valueOf(z10));
                arrayList.add(0, yVar);
            }
        }
        z zVar = new z();
        zVar.f(arrayList);
        zVar.g(z.b.NONE);
        HashMap hashMap = new HashMap();
        for (w3.m mVar : rVar.f67390c) {
            hashMap.put(mVar.f67348a, z0(mVar.f67349b));
        }
        zVar.h(hashMap);
        return zVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InputStream inputStream = this.f51075a;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final io.sentry.protocol.n k(q qVar) {
        String str;
        io.sentry.protocol.n nVar = new io.sentry.protocol.n();
        n nVar2 = qVar.f67376l;
        String a10 = h.a(" ", qVar.f67374j);
        if (!qVar.a()) {
            nVar.f(String.format(Locale.ROOT, "Fatal exit pid = %d (%s)", Integer.valueOf(qVar.f67370f), a10));
            return nVar;
        }
        String str2 = qVar.f67377m;
        Locale locale = Locale.ROOT;
        if (str2.isEmpty()) {
            str = "";
        } else {
            str = str2 + ": ";
        }
        nVar.f(String.format(locale, "%sFatal signal %s (%d), %s (%d), pid = %d (%s)", str, nVar2.f67351b, Integer.valueOf(nVar2.f67350a), nVar2.f67353d, Integer.valueOf(nVar2.f67352c), Integer.valueOf(qVar.f67370f), a10));
        return nVar;
    }

    public final C4803e r(q qVar) {
        DebugImage b10;
        DebugImage b11;
        ArrayList arrayList = new ArrayList();
        a aVar = null;
        for (l lVar : qVar.f67382r) {
            if (lVar.f67342d) {
                String str = lVar.f67345g;
                if (!str.isEmpty() && !str.startsWith("/dev/")) {
                    boolean isEmpty = lVar.f67346h.isEmpty();
                    boolean z10 = lVar.f67341c == 0;
                    if (isEmpty || !z10) {
                        if (aVar != null && str.equals(aVar.f51080a)) {
                            aVar.a(lVar.f67340b);
                        }
                    } else if (aVar == null || !str.equals(aVar.f51080a)) {
                        if (aVar != null && (b11 = aVar.b()) != null) {
                            arrayList.add(b11);
                        }
                        aVar = new a(lVar);
                    } else {
                        aVar.a(lVar.f67340b);
                    }
                }
            }
        }
        if (aVar != null && (b10 = aVar.b()) != null) {
            arrayList.add(b10);
        }
        C4803e c4803e = new C4803e();
        c4803e.e(arrayList);
        return c4803e;
    }

    public final List w0(q qVar, t tVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = qVar.f67380p.entrySet().iterator();
        while (it.hasNext()) {
            r rVar = (r) ((Map.Entry) it.next()).getValue();
            A a10 = new A();
            a10.u(Long.valueOf(((Integer) r2.getKey()).intValue()));
            a10.w(rVar.f67389b);
            z U10 = U(rVar);
            a10.y(U10);
            if (qVar.f67371g == rVar.f67388a) {
                a10.q(Boolean.TRUE);
                tVar.n(U10);
            }
            arrayList.add(a10);
        }
        return arrayList;
    }
}
