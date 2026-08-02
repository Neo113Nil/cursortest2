package io.sentry.android.core.internal.tombstone;

import androidx.appcompat.widget.c1;
import io.sentry.b5;
import io.sentry.protocol.a0;
import io.sentry.protocol.b0;
import io.sentry.protocol.d0;
import io.sentry.protocol.u;
import io.sentry.t4;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import s9.k0;
import s9.l0;
import s9.n0;
import s9.p0;
import s9.r;
import s9.t;
import s9.v;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f15677a;

    public a(InputStream inputStream) {
        HashMap hashMap = new HashMap();
        this.f15677a = inputStream;
        hashMap.put("SIGILL", "IllegalInstruction");
        hashMap.put("SIGTRAP", "Trap");
        hashMap.put("SIGABRT", "Abort");
        hashMap.put("SIGBUS", "BusError");
        hashMap.put("SIGFPE", "FloatingPointException");
        hashMap.put("SIGSEGV", "Segfault");
    }

    public final t4 c() {
        s9.k jVar;
        boolean c2;
        o oVar = o.f15688h;
        InputStream inputStream = this.f15677a;
        if (inputStream == null) {
            byte[] bArr = t.f23376b;
            int length = bArr.length;
            jVar = new s9.i(bArr, 0, length, false);
            try {
                jVar.e(length);
            } catch (v e7) {
                throw new IllegalArgumentException(e7);
            }
        } else {
            jVar = new s9.j(inputStream);
        }
        s9.m a7 = s9.m.a();
        r e9 = oVar.e();
        try {
            k0 k0Var = k0.f23346c;
            k0Var.getClass();
            n0 a10 = k0Var.a(e9.getClass());
            androidx.datastore.preferences.protobuf.m mVar = jVar.f23345c;
            if (mVar == null) {
                mVar = new androidx.datastore.preferences.protobuf.m(jVar);
            }
            a10.f(e9, mVar, a7);
            a10.b(e9);
            byte byteValue = ((Byte) e9.a(1)).byteValue();
            if (byteValue == 1) {
                c2 = true;
            } else if (byteValue == 0) {
                c2 = false;
            } else {
                k0 k0Var2 = k0.f23346c;
                k0Var2.getClass();
                c2 = k0Var2.a(e9.getClass()).c(e9);
                e9.a(2);
            }
            if (!c2) {
                throw new v(new p0("Message was missing required fields.  (Lite runtime could not determine which fields were missing).").getMessage());
            }
            o oVar2 = (o) e9;
            t4 t4Var = new t4();
            t4Var.f17096u = b5.FATAL;
            t4Var.f16462h = "native";
            io.sentry.protocol.n nVar = new io.sentry.protocol.n();
            k kVar = k.f15680e;
            l0 l0Var = oVar2.f15690e;
            StringBuilder sb2 = new StringBuilder();
            Iterator it = l0Var.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb2.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    }
                    sb2.append((CharSequence) " ");
                }
            }
            String sb3 = sb2.toString();
            Locale locale = Locale.ROOT;
            nVar.f16865a = c1.n("Fatal exit pid = 0 (", sb3, ")");
            t4Var.q = nVar;
            ArrayList arrayList = new ArrayList();
            Iterator it2 = oVar2.f15692g.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
            io.sentry.protocol.d dVar = new io.sentry.protocol.d();
            dVar.f16758b = new ArrayList(arrayList);
            t4Var.f16467n = dVar;
            u uVar = new u();
            uVar.f16918d = Long.valueOf(0);
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(uVar);
            com.android.billingclient.api.m mVar2 = new com.android.billingclient.api.m(arrayList2);
            t4Var.f17095t = mVar2;
            ArrayList arrayList3 = mVar2.f4046a;
            Objects.requireNonNull(arrayList3);
            u uVar2 = (u) arrayList3.get(0);
            ArrayList arrayList4 = new ArrayList();
            Iterator it3 = DesugarCollections.unmodifiableMap(oVar2.f15691f).entrySet().iterator();
            while (it3.hasNext()) {
                l lVar = (l) ((Map.Entry) it3.next()).getValue();
                d0 d0Var = new d0();
                d0Var.f16760a = Long.valueOf(((Integer) r4.getKey()).intValue());
                lVar.getClass();
                d0Var.f16762c = "";
                ArrayList arrayList5 = new ArrayList();
                Iterator it4 = lVar.f15685f.iterator();
                if (it4.hasNext()) {
                    it4.next().getClass();
                    throw new ClassCastException();
                }
                b0 b0Var = new b0();
                b0Var.f16749a = arrayList5;
                b0Var.f16752d = a0.NONE;
                HashMap hashMap = new HashMap();
                Iterator it5 = lVar.f15684e.iterator();
                if (it5.hasNext()) {
                    it5.next().getClass();
                    throw new ClassCastException();
                }
                b0Var.f16750b = hashMap;
                d0Var.f16768i = b0Var;
                d0Var.f16764e = Boolean.TRUE;
                uVar2.f16919e = b0Var;
                arrayList4.add(d0Var);
            }
            t4Var.f17094s = new com.android.billingclient.api.m(arrayList4);
            return t4Var;
        } catch (IOException e10) {
            if (e10.getCause() instanceof v) {
                throw ((v) e10.getCause());
            }
            throw new v(e10.getMessage(), e10);
        } catch (p0 e11) {
            throw new v(e11.getMessage());
        } catch (RuntimeException e12) {
            if (e12.getCause() instanceof v) {
                throw ((v) e12.getCause());
            }
            throw e12;
        } catch (v e13) {
            if (e13.f23378a) {
                throw new v(e13.getMessage(), e13);
            }
            throw e13;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f15677a.close();
    }
}
