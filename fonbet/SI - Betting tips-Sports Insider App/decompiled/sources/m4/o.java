package m4;

import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import f3.x;
import gf.t;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlin.text.z;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.FileSystem;
import okio.Okio;
import okio.Path;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o implements f4.h {

    /* renamed from: a, reason: collision with root package name */
    public final String f20407a;

    /* renamed from: b, reason: collision with root package name */
    public final q4.n f20408b;

    /* renamed from: c, reason: collision with root package name */
    public final gf.i f20409c;

    /* renamed from: d, reason: collision with root package name */
    public final t f20410d;

    /* renamed from: e, reason: collision with root package name */
    public final gf.i f20411e;

    /* renamed from: f, reason: collision with root package name */
    public final e f20412f;

    public o(String str, q4.n nVar, t tVar, t tVar2, t tVar3, e eVar) {
        this.f20407a = str;
        this.f20408b = nVar;
        this.f20409c = tVar;
        this.f20410d = tVar2;
        this.f20411e = tVar3;
        this.f20412f = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(o oVar, s sVar, mf.c cVar) {
        m mVar;
        int i5;
        Buffer buffer;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i10 = mVar.f20399d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                mVar.f20399d = i10 - Integer.MIN_VALUE;
                Object obj = mVar.f20397b;
                lf.a aVar = lf.a.f20034a;
                i5 = mVar.f20399d;
                if (i5 != 0) {
                    h8.b.B(obj);
                    Buffer buffer2 = new Buffer();
                    mVar.f20396a = buffer2;
                    mVar.f20399d = 1;
                    sVar.f20425a.readAll(buffer2);
                    if (Unit.f19194a == aVar) {
                        return aVar;
                    }
                    buffer = buffer2;
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    buffer = mVar.f20396a;
                    h8.b.B(obj);
                }
                return ci.c.b(buffer, oVar.e());
            }
        }
        mVar = new m(oVar, cVar);
        Object obj2 = mVar.f20397b;
        lf.a aVar2 = lf.a.f20034a;
        i5 = mVar.f20399d;
        if (i5 != 0) {
        }
        return ci.c.b(buffer, oVar.e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0221 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0217 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0181 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r9v1, types: [e4.g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(o oVar, e4.g gVar, r rVar, r rVar2, mf.c cVar) {
        n nVar;
        int i5;
        h9.c cVar2;
        r rVar3;
        h9.c cVar3;
        h9.c cVar4;
        ?? th2;
        Throwable th3;
        com.android.billingclient.api.i k6;
        s sVar;
        s sVar2;
        e4.g gVar2 = gVar;
        r rVar4 = rVar2;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i10 = nVar.f20406g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                nVar.f20406g = i10 - Integer.MIN_VALUE;
                Object obj = nVar.f20404e;
                lf.a aVar = lf.a.f20034a;
                i5 = nVar.f20406g;
                if (i5 != 0) {
                    h8.b.B(obj);
                    if (!oVar.f20408b.f22014h.f21934b) {
                        if (gVar2 != null) {
                            try {
                                r4.k.r(gVar2);
                                return null;
                            } catch (RuntimeException e7) {
                                throw e7;
                            } catch (Exception unused) {
                            }
                        }
                        return null;
                    }
                    c cVar5 = (c) oVar.f20411e.getValue();
                    nVar.f20400a = gVar2;
                    nVar.f20401b = rVar4;
                    nVar.f20406g = 1;
                    ((n4.a) cVar5).getClass();
                    if (rVar4.f20419a != 304 || rVar == null) {
                        cVar2 = null;
                        obj = new b(rVar4);
                    } else {
                        p pVar = rVar.f20422d;
                        p pVar2 = rVar4.f20422d;
                        pVar.getClass();
                        Map map = pVar.f20414a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : map.entrySet()) {
                            linkedHashMap.put(entry.getKey(), CollectionsKt.X((Collection) entry.getValue()));
                        }
                        for (Map.Entry entry2 : pVar2.f20414a.entrySet()) {
                            String str = (String) entry2.getKey();
                            List list = (List) entry2.getValue();
                            String lowerCase = str.toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                            linkedHashMap.put(lowerCase, CollectionsKt.X(list));
                        }
                        cVar2 = null;
                        obj = new b(new r(rVar4.f20419a, rVar4.f20420b, rVar4.f20421c, new p(n0.i(linkedHashMap)), null, rVar4.f20424f));
                    }
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i5 == 1) {
                    r rVar5 = nVar.f20401b;
                    e4.g gVar3 = nVar.f20400a;
                    h8.b.B(obj);
                    rVar4 = rVar5;
                    gVar2 = gVar3;
                    cVar2 = null;
                } else {
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar4 = nVar.f20403d;
                    rVar3 = nVar.f20402c;
                    rVar4 = nVar.f20401b;
                    try {
                        h8.b.B(obj);
                        return cVar4.j();
                    } catch (Exception e9) {
                        e = e9;
                        try {
                            ((com.android.billingclient.api.i) cVar4.f10430b).b(false);
                        } catch (Exception unused2) {
                        }
                        sVar = rVar4.f20423e;
                        if (sVar != null) {
                        }
                        sVar2 = rVar3.f20423e;
                        if (sVar2 != null) {
                        }
                    }
                }
                rVar3 = ((b) obj).f20368a;
                if (rVar3 != null) {
                    return cVar2;
                }
                if (gVar2 != null) {
                    e4.c cVar6 = gVar2.f8611a;
                    e4.e eVar = cVar6.f8590c;
                    synchronized (eVar.f8599h) {
                        cVar6.close();
                        k6 = eVar.k(cVar6.f8588a.f8579a);
                    }
                    if (k6 != null) {
                        cVar3 = new h9.c(21, k6);
                        if (cVar3 != null) {
                            return cVar2;
                        }
                        try {
                            BufferedSink buffer = Okio.buffer(oVar.e().sink(((com.android.billingclient.api.i) cVar3.f10430b).c(0), false));
                            try {
                                u6.h.x(rVar3, buffer);
                                Unit unit = Unit.f19194a;
                                try {
                                    buffer.close();
                                    th2 = cVar2;
                                } catch (Throwable th4) {
                                    th2 = th4;
                                }
                            } catch (Throwable th5) {
                                if (buffer != null) {
                                    try {
                                        buffer.close();
                                    } catch (Throwable th6) {
                                        gf.d.a(th5, th6);
                                    }
                                }
                                th2 = th5;
                            }
                            if (th2 != 0) {
                                throw th2;
                            }
                            s sVar3 = rVar3.f20423e;
                            if (sVar3 != null) {
                                FileSystem e10 = oVar.e();
                                Path c2 = ((com.android.billingclient.api.i) cVar3.f10430b).c(1);
                                ?? r92 = cVar2;
                                nVar.f20400a = r92;
                                nVar.f20401b = rVar4;
                                nVar.f20402c = rVar3;
                                nVar.f20403d = cVar3;
                                nVar.f20406g = 2;
                                BufferedSource bufferedSource = sVar3.f20425a;
                                BufferedSink buffer2 = Okio.buffer(e10.sink(c2, false));
                                try {
                                    new Long(bufferedSource.readAll(buffer2));
                                    if (buffer2 != null) {
                                        try {
                                            buffer2.close();
                                        } catch (Throwable th7) {
                                            th3 = th7;
                                        }
                                    }
                                    th3 = r92;
                                } catch (Throwable th8) {
                                    th3 = th8;
                                    if (buffer2 != null) {
                                        try {
                                            buffer2.close();
                                        } catch (Throwable th9) {
                                            gf.d.a(th3, th9);
                                        }
                                    }
                                }
                                if (th3 != null) {
                                    throw th3;
                                }
                                if (Unit.f19194a == aVar) {
                                    return aVar;
                                }
                            }
                            cVar4 = cVar3;
                            return cVar4.j();
                        } catch (Exception e11) {
                            e = e11;
                            cVar4 = cVar3;
                            ((com.android.billingclient.api.i) cVar4.f10430b).b(false);
                            sVar = rVar4.f20423e;
                            if (sVar != null) {
                                try {
                                    r4.k.r(sVar);
                                } catch (RuntimeException e12) {
                                    throw e12;
                                } catch (Exception unused3) {
                                }
                            }
                            sVar2 = rVar3.f20423e;
                            if (sVar2 != null) {
                                throw e;
                            }
                            try {
                                r4.k.r(sVar2);
                                throw e;
                            } catch (RuntimeException e13) {
                                throw e13;
                            } catch (Exception unused4) {
                                throw e;
                            }
                        }
                    }
                    cVar3 = cVar2;
                    if (cVar3 != null) {
                    }
                } else {
                    e4.a aVar2 = (e4.a) oVar.f20410d.getValue();
                    if (aVar2 != null) {
                        String str2 = oVar.f20408b.f22011e;
                        if (str2 == null) {
                            str2 = oVar.f20407a;
                        }
                        com.android.billingclient.api.i k9 = ((e4.h) aVar2).f8613b.k(ByteString.INSTANCE.encodeUtf8(str2).sha256().hex());
                        if (k9 != null) {
                            cVar3 = new h9.c(21, k9);
                            if (cVar3 != null) {
                            }
                        }
                    }
                    cVar3 = cVar2;
                    if (cVar3 != null) {
                    }
                }
            }
        }
        nVar = new n(oVar, cVar);
        Object obj2 = nVar.f20404e;
        lf.a aVar3 = lf.a.f20034a;
        i5 = nVar.f20406g;
        if (i5 != 0) {
        }
        rVar3 = ((b) obj2).f20368a;
        if (rVar3 != null) {
        }
    }

    public static String f(String str, String str2) {
        String d02;
        if ((str2 == null || z.o(str2, "text/plain", false)) && (d02 = x.d0(str)) != null) {
            return d02;
        }
        if (str2 != null) {
            return StringsKt.W(str2, ';');
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x017e, code lost:
    
        if (r0 == r7) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0169 A[Catch: Exception -> 0x003f, TryCatch #1 {Exception -> 0x003f, blocks: (B:14:0x003a, B:15:0x0181, B:21:0x0050, B:22:0x0165, B:24:0x0169, B:32:0x0121, B:34:0x0127, B:37:0x014e, B:63:0x00a5, B:65:0x00ae, B:67:0x00bc, B:70:0x00f0, B:72:0x00fc, B:76:0x00d2, B:78:0x00dc, B:80:0x0145, B:81:0x014c), top: B:8:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0127 A[Catch: Exception -> 0x003f, TryCatch #1 {Exception -> 0x003f, blocks: (B:14:0x003a, B:15:0x0181, B:21:0x0050, B:22:0x0165, B:24:0x0169, B:32:0x0121, B:34:0x0127, B:37:0x014e, B:63:0x00a5, B:65:0x00ae, B:67:0x00bc, B:70:0x00f0, B:72:0x00fc, B:76:0x00d2, B:78:0x00dc, B:80:0x0145, B:81:0x014c), top: B:8:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ae A[Catch: Exception -> 0x003f, TryCatch #1 {Exception -> 0x003f, blocks: (B:14:0x003a, B:15:0x0181, B:21:0x0050, B:22:0x0165, B:24:0x0169, B:32:0x0121, B:34:0x0127, B:37:0x014e, B:63:0x00a5, B:65:0x00ae, B:67:0x00bc, B:70:0x00f0, B:72:0x00fc, B:76:0x00d2, B:78:0x00dc, B:80:0x0145, B:81:0x014c), top: B:8:0x002c }] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r5v12, types: [T, m4.r] */
    @Override // f4.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        k kVar;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        T t3;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        e4.a aVar;
        a aVar2;
        f4.l lVar;
        try {
            if (continuation instanceof k) {
                kVar = (k) continuation;
                int i5 = kVar.f20388e;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    kVar.f20388e = i5 - Integer.MIN_VALUE;
                    k kVar2 = kVar;
                    Object obj = kVar2.f20386c;
                    lf.a aVar3 = lf.a.f20034a;
                    objectRef = kVar2.f20388e;
                    String str = this.f20407a;
                    Continuation continuation2 = null;
                    if (objectRef != 0) {
                        h8.b.B(obj);
                        objectRef2 = new Ref.ObjectRef();
                        q4.n nVar = this.f20408b;
                        if (nVar.f22014h.f21933a && (aVar = (e4.a) this.f20410d.getValue()) != null) {
                            String str2 = nVar.f22011e;
                            if (str2 == null) {
                                str2 = str;
                            }
                            e4.c n9 = ((e4.h) aVar).f8613b.n(ByteString.INSTANCE.encodeUtf8(str2).sha256().hex());
                            if (n9 != null) {
                                t3 = new e4.g(n9);
                                objectRef2.element = t3;
                                Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
                                if (objectRef2.element != 0) {
                                    FileSystem e7 = e();
                                    e4.c cVar = ((e4.g) objectRef2.element).f8611a;
                                    if (cVar.f8589b) {
                                        throw new IllegalStateException("snapshot is closed");
                                    }
                                    Long size = e7.metadata((Path) cVar.f8588a.f8581c.get(0)).getSize();
                                    if (size != null && size.longValue() == 0) {
                                        return new f4.l(h((e4.g) objectRef2.element), f(str, null), d4.h.f8130c);
                                    }
                                    ?? i10 = i((e4.g) objectRef2.element);
                                    objectRef5.element = i10;
                                    if (i10 != 0) {
                                        c cVar2 = (c) this.f20411e.getValue();
                                        r rVar = (r) objectRef5.element;
                                        g();
                                        kVar2.f20384a = objectRef2;
                                        kVar2.f20385b = objectRef5;
                                        kVar2.f20388e = 1;
                                        ((n4.a) cVar2).getClass();
                                        a aVar4 = new a(rVar);
                                        if (aVar4 == aVar3) {
                                            return aVar3;
                                        }
                                        objectRef4 = objectRef5;
                                        obj = aVar4;
                                    }
                                }
                                objectRef3 = objectRef5;
                                q g10 = g();
                                l lVar2 = new l(objectRef2, this, objectRef3, g10, null);
                                kVar2.f20384a = objectRef2;
                                kVar2.f20385b = null;
                                kVar2.f20388e = 2;
                                obj = d(g10, lVar2, kVar2);
                                if (obj == aVar3) {
                                    return aVar3;
                                }
                                lVar = (f4.l) obj;
                                if (lVar == null) {
                                }
                            }
                        }
                        t3 = 0;
                        objectRef2.element = t3;
                        Ref.ObjectRef objectRef52 = new Ref.ObjectRef();
                        if (objectRef2.element != 0) {
                        }
                        objectRef3 = objectRef52;
                        q g102 = g();
                        l lVar22 = new l(objectRef2, this, objectRef3, g102, null);
                        kVar2.f20384a = objectRef2;
                        kVar2.f20385b = null;
                        kVar2.f20388e = 2;
                        obj = d(g102, lVar22, kVar2);
                        if (obj == aVar3) {
                        }
                        lVar = (f4.l) obj;
                        if (lVar == null) {
                        }
                    } else if (objectRef == 1) {
                        Ref.ObjectRef objectRef6 = kVar2.f20385b;
                        Ref.ObjectRef objectRef7 = kVar2.f20384a;
                        try {
                            h8.b.B(obj);
                            objectRef4 = objectRef6;
                            objectRef2 = objectRef7;
                        } catch (Exception e9) {
                            e = e9;
                            objectRef = objectRef7;
                            e4.g gVar = (e4.g) objectRef.element;
                            if (gVar != null) {
                                try {
                                    r4.k.r(gVar);
                                } catch (RuntimeException e10) {
                                    throw e10;
                                } catch (Exception unused) {
                                }
                            }
                            throw e;
                        }
                    } else {
                        if (objectRef != 2) {
                            if (objectRef != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Ref.ObjectRef objectRef8 = kVar2.f20384a;
                            h8.b.B(obj);
                            return (f4.l) obj;
                        }
                        objectRef2 = kVar2.f20384a;
                        h8.b.B(obj);
                        lVar = (f4.l) obj;
                        if (lVar == null) {
                            return lVar;
                        }
                        q g11 = g();
                        kd.e eVar = new kd.e(this, continuation2, 23);
                        kVar2.f20384a = objectRef2;
                        kVar2.f20385b = null;
                        kVar2.f20388e = 3;
                        obj = d(g11, eVar, kVar2);
                    }
                    aVar2 = (a) obj;
                    if (aVar2.f20367a == null) {
                        return new f4.l(h((e4.g) objectRef2.element), f(str, aVar2.f20367a.f20422d.a()), d4.h.f8130c);
                    }
                    objectRef3 = objectRef4;
                    q g1022 = g();
                    l lVar222 = new l(objectRef2, this, objectRef3, g1022, null);
                    kVar2.f20384a = objectRef2;
                    kVar2.f20385b = null;
                    kVar2.f20388e = 2;
                    obj = d(g1022, lVar222, kVar2);
                    if (obj == aVar3) {
                    }
                    lVar = (f4.l) obj;
                    if (lVar == null) {
                    }
                }
            }
            if (objectRef != 0) {
            }
            aVar2 = (a) obj;
            if (aVar2.f20367a == null) {
            }
        } catch (Exception e11) {
            e = e11;
        }
        kVar = new k(this, (mf.c) continuation);
        k kVar22 = kVar;
        Object obj2 = kVar22.f20386c;
        lf.a aVar32 = lf.a.f20034a;
        objectRef = kVar22.f20388e;
        String str3 = this.f20407a;
        Continuation continuation22 = null;
    }

    public final Object d(q qVar, Function2 function2, k kVar) {
        if (this.f20408b.f22015i.f21933a && Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            throw new NetworkOnMainThreadException();
        }
        p4.b bVar = (p4.b) this.f20409c.getValue();
        return p4.b.a(bVar.f21515a, qVar, new g1.b(function2, null, 2), kVar);
    }

    public final FileSystem e() {
        FileSystem fileSystem;
        e4.a aVar = (e4.a) this.f20410d.getValue();
        return (aVar == null || (fileSystem = ((e4.h) aVar).f8612a) == null) ? this.f20408b.f22012f : fileSystem;
    }

    public final q g() {
        c4.k kVar = h.f20378b;
        q4.n nVar = this.f20408b;
        p pVar = (p) c4.p.f(nVar, kVar);
        pVar.getClass();
        e3.i iVar = new e3.i(pVar);
        q4.b bVar = nVar.f22014h;
        boolean z5 = bVar.f21933a;
        boolean z7 = nVar.f22015i.f21933a && this.f20412f.a();
        if (!z7 && z5) {
            iVar.i("only-if-cached, max-stale=2147483647");
        } else if (!z7 || z5) {
            if (!z7 && !z5) {
                iVar.i("no-cache, only-if-cached");
            }
        } else if (bVar.f21934b) {
            iVar.i("no-cache");
        } else {
            iVar.i("no-cache, no-store");
        }
        String str = (String) c4.p.f(nVar, h.f20377a);
        p pVar2 = new p(n0.i(iVar.f8523a));
        if (c4.p.f(nVar, h.f20379c) == null) {
            return new q(this.f20407a, str, pVar2, nVar.j);
        }
        throw new ClassCastException();
    }

    public final d4.q h(e4.g gVar) {
        e4.c cVar = gVar.f8611a;
        if (cVar.f8589b) {
            throw new IllegalStateException("snapshot is closed");
        }
        Path path = (Path) cVar.f8588a.f8581c.get(1);
        FileSystem e7 = e();
        String str = this.f20408b.f22011e;
        if (str == null) {
            str = this.f20407a;
        }
        return ci.c.a(path, e7, str, gVar, 16);
    }

    public final r i(e4.g gVar) {
        Throwable th2;
        r rVar;
        try {
            FileSystem e7 = e();
            e4.c cVar = gVar.f8611a;
            if (cVar.f8589b) {
                throw new IllegalStateException("snapshot is closed");
            }
            BufferedSource buffer = Okio.buffer(e7.source((Path) cVar.f8588a.f8581c.get(0)));
            try {
                rVar = u6.h.t(buffer);
                try {
                    buffer.close();
                    th2 = null;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                if (buffer != null) {
                    try {
                        buffer.close();
                    } catch (Throwable th5) {
                        gf.d.a(th4, th5);
                    }
                }
                th2 = th4;
                rVar = null;
            }
            if (th2 == null) {
                return rVar;
            }
            throw th2;
        } catch (IOException unused) {
            return null;
        }
    }
}
