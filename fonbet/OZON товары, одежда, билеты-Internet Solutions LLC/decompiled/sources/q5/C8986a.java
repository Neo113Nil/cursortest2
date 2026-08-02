package q5;

import Sc.o;
import Sc.s;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.jvm.internal.M;
import l5.C7873b;
import l5.InterfaceC7874c;
import n5.EnumC8444d;
import n5.g;
import n5.n;
import org.jetbrains.annotations.NotNull;
import p5.h;
import p5.m;
import t5.C9759d;
import t5.InterfaceC9758c;
import v5.C10232f;
import v5.C10234h;
import v5.C10237k;
import v5.C10239m;
import v5.C10242p;
import w5.C10435g;
import w5.EnumC10434f;
import xe.C10727i;
import xe.I;

/* renamed from: q5.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8986a implements i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final l5.i f81624a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C10242p f81625b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C9759d f81626c;

    /* renamed from: q5.a$a, reason: collision with other inner class name */
    public static final class C1375a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Drawable f81627a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f81628b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final EnumC8444d f81629c;

        /* renamed from: d, reason: collision with root package name */
        private final String f81630d;

        public C1375a(@NotNull Drawable drawable, boolean z11, @NotNull EnumC8444d enumC8444d, String str) {
            this.f81627a = drawable;
            this.f81628b = z11;
            this.f81629c = enumC8444d;
            this.f81630d = str;
        }

        public static C1375a a(C1375a c1375a, BitmapDrawable bitmapDrawable) {
            return new C1375a(bitmapDrawable, c1375a.f81628b, c1375a.f81629c, c1375a.f81630d);
        }

        @NotNull
        public final EnumC8444d b() {
            return this.f81629c;
        }

        public final String c() {
            return this.f81630d;
        }

        @NotNull
        public final Drawable d() {
            return this.f81627a;
        }

        public final boolean e() {
            return this.f81628b;
        }
    }

    public C8986a(@NotNull l5.i iVar, @NotNull C10242p c10242p) {
        this.f81624a = iVar;
        this.f81625b = c10242p;
        this.f81626c = new C9759d(iVar, c10242p);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x008a -> B:10:0x008e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(C8986a c8986a, m mVar, C7873b c7873b, C10234h c10234h, Object obj, C10239m c10239m, InterfaceC7874c interfaceC7874c, kotlin.coroutines.jvm.internal.c cVar) {
        C8987b c8987b;
        int i11;
        int i12;
        Pair h11;
        c8986a.getClass();
        if (cVar instanceof C8987b) {
            c8987b = (C8987b) cVar;
            int i13 = c8987b.f81642o;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c8987b.f81642o = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = c8987b.f81640m;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c8987b.f81642o;
                if (i11 != 0) {
                    s.b(obj2);
                    i12 = 0;
                    h11 = c7873b.h(mVar, c10239m, c8986a.f81624a, i12);
                    if (h11 != null) {
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i14 = c8987b.f81639l;
                    InterfaceC7874c interfaceC7874c2 = c8987b.f81637j;
                    C10239m c10239m2 = c8987b.f81636i;
                    Object obj3 = c8987b.f81635h;
                    C10234h c10234h2 = c8987b.f81634g;
                    C7873b c7873b2 = c8987b.f81633f;
                    m mVar2 = c8987b.f81632e;
                    C8986a c8986a2 = c8987b.f81631d;
                    s.b(obj2);
                    C8987b c8987b2 = c8987b;
                    int i15 = i14;
                    c8986a = c8986a2;
                    C8987b c8987b3 = c8987b2;
                    interfaceC7874c = interfaceC7874c2;
                    mVar = mVar2;
                    c10239m = c10239m2;
                    c7873b = c7873b2;
                    obj = obj3;
                    c10234h = c10234h2;
                    n5.e eVar = (n5.e) obj2;
                    interfaceC7874c.getClass();
                    if (eVar == null) {
                        Drawable a11 = eVar.a();
                        boolean b11 = eVar.b();
                        EnumC8444d a12 = mVar.a();
                        n c11 = mVar.c();
                        n5.m mVar3 = c11 instanceof n5.m ? (n5.m) c11 : null;
                        return new C1375a(a11, b11, a12, mVar3 != null ? mVar3.j() : null);
                    }
                    i12 = i15;
                    c8987b = c8987b3;
                    h11 = c7873b.h(mVar, c10239m, c8986a.f81624a, i12);
                    if (h11 != null) {
                        throw new IllegalStateException(U7.m.b(obj, "Unable to create a decoder that supports: ").toString());
                    }
                    n5.g gVar = (n5.g) h11.e();
                    int intValue = ((Number) h11.f()).intValue() + 1;
                    interfaceC7874c.getClass();
                    c8987b.f81631d = c8986a;
                    c8987b.f81632e = mVar;
                    c8987b.f81633f = c7873b;
                    c8987b.f81634g = c10234h;
                    c8987b.f81635h = obj;
                    c8987b.f81636i = c10239m;
                    c8987b.f81637j = interfaceC7874c;
                    c8987b.f81638k = gVar;
                    c8987b.f81639l = intValue;
                    c8987b.f81642o = 1;
                    Object a13 = gVar.a(c8987b);
                    if (a13 == aVar) {
                        return aVar;
                    }
                    C8987b c8987b4 = c8987b;
                    i15 = intValue;
                    obj2 = a13;
                    c8987b3 = c8987b4;
                    n5.e eVar2 = (n5.e) obj2;
                    interfaceC7874c.getClass();
                    if (eVar2 == null) {
                    }
                }
            }
        }
        c8987b = new C8987b(c8986a, cVar);
        Object obj22 = c8987b.f81640m;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c8987b.f81642o;
        if (i11 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x01fa, code lost:
    
        if (r1 != r7) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0134 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:26:0x004e, B:27:0x0163, B:48:0x0068, B:50:0x0129, B:52:0x0134, B:57:0x0147, B:72:0x0174, B:74:0x017e, B:76:0x0216, B:77:0x021b), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0174 A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:26:0x004e, B:27:0x0163, B:48:0x0068, B:50:0x0129, B:52:0x0134, B:57:0x0147, B:72:0x0174, B:74:0x017e, B:76:0x0216, B:77:0x021b), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0078  */
    /* JADX WARN: Type inference failed for: r1v14, types: [T, l5.b] */
    /* JADX WARN: Type inference failed for: r1v21, types: [T, v5.m] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, l5.b] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(C8986a c8986a, C10234h c10234h, Object obj, C10239m c10239m, InterfaceC7874c interfaceC7874c, kotlin.coroutines.jvm.internal.c cVar) {
        C8988c c8988c;
        M m11;
        m mVar;
        n c11;
        C8986a c8986a2;
        C10234h c10234h2;
        Object obj2;
        InterfaceC7874c interfaceC7874c2;
        M m12;
        M m13;
        M m14;
        M m15;
        T t2;
        p5.g gVar;
        C10234h c10234h3;
        M m16;
        InterfaceC7874c interfaceC7874c3;
        C1375a c1375a;
        C8986a c8986a3;
        M m17;
        C8986a c8986a4;
        m mVar2;
        n c12;
        Object obj3;
        Bitmap bitmap;
        c8986a.getClass();
        try {
            if (cVar instanceof C8988c) {
                c8988c = (C8988c) cVar;
                int i11 = c8988c.f81653n;
                if ((i11 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c8988c.f81653n = i11 - LinearLayoutManager.INVALID_OFFSET;
                    C8988c c8988c2 = c8988c;
                    Object obj4 = c8988c2.f81651l;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    m11 = c8988c2.f81653n;
                    if (m11 != 0) {
                        s.b(obj4);
                        M m18 = new M();
                        m18.f71787a = c10239m;
                        M m19 = new M();
                        m19.f71787a = c8986a.f81624a.f();
                        M m21 = new M();
                        try {
                            if (!c8986a.f81625b.a((C10239m) m18.f71787a)) {
                                C10239m c10239m2 = (C10239m) m18.f71787a;
                                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                                m18.f71787a = C10239m.a(c10239m2);
                            }
                            if (c10234h.w() != null || c10234h.o() != null) {
                                C7873b c7873b = (C7873b) m19.f71787a;
                                c7873b.getClass();
                                C7873b.a aVar2 = new C7873b.a(c7873b);
                                Pair<h.a<?>, Class<?>> w11 = c10234h.w();
                                if (w11 != null) {
                                    ((ArrayList) aVar2.g()).add(0, w11);
                                }
                                g.a o11 = c10234h.o();
                                if (o11 != null) {
                                    ((ArrayList) aVar2.f()).add(0, o11);
                                }
                                m19.f71787a = aVar2.e();
                            }
                            C7873b c7873b2 = (C7873b) m19.f71787a;
                            C10239m c10239m3 = (C10239m) m18.f71787a;
                            c8988c2.f81643d = c8986a;
                            c8988c2.f81644e = c10234h;
                            c8988c2.f81645f = obj;
                            c8988c2.f81646g = interfaceC7874c;
                            c8988c2.f81647h = m18;
                            c8988c2.f81648i = m19;
                            c8988c2.f81649j = m21;
                            c8988c2.f81650k = m21;
                            c8988c2.f81653n = 1;
                            Object f7 = c8986a.f(c7873b2, c10234h, obj, c10239m3, interfaceC7874c, c8988c2);
                            if (f7 != aVar) {
                                c8986a2 = c8986a;
                                c10234h2 = c10234h;
                                obj2 = obj;
                                interfaceC7874c2 = interfaceC7874c;
                                m12 = m18;
                                m13 = m19;
                                m14 = m21;
                                m15 = m14;
                                t2 = f7;
                            }
                            return aVar;
                        } catch (Throwable th2) {
                            th = th2;
                            m11 = m21;
                            T t11 = m11.f71787a;
                            mVar = t11 instanceof m ? (m) t11 : null;
                            if (mVar != null && (c11 = mVar.c()) != null) {
                                A5.k.a(c11);
                            }
                            throw th;
                        }
                    }
                    if (m11 == 1) {
                        m14 = c8988c2.f81650k;
                        m15 = c8988c2.f81649j;
                        M m22 = c8988c2.f81648i;
                        M m23 = c8988c2.f81647h;
                        InterfaceC7874c interfaceC7874c4 = (InterfaceC7874c) c8988c2.f81646g;
                        Object obj5 = c8988c2.f81645f;
                        C10234h c10234h4 = c8988c2.f81644e;
                        C8986a c8986a5 = c8988c2.f81643d;
                        s.b(obj4);
                        m13 = m22;
                        m12 = m23;
                        interfaceC7874c2 = interfaceC7874c4;
                        obj2 = obj5;
                        c10234h2 = c10234h4;
                        c8986a2 = c8986a5;
                        t2 = obj4;
                    } else {
                        if (m11 != 2) {
                            if (m11 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s.b(obj4);
                            C1375a c1375a2 = (C1375a) obj4;
                            Drawable d11 = c1375a2.d();
                            BitmapDrawable bitmapDrawable = d11 instanceof BitmapDrawable ? (BitmapDrawable) d11 : null;
                            if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                                bitmap.prepareToDraw();
                            }
                            return c1375a2;
                        }
                        m15 = c8988c2.f81647h;
                        m17 = (M) c8988c2.f81646g;
                        interfaceC7874c3 = (InterfaceC7874c) c8988c2.f81645f;
                        c10234h3 = c8988c2.f81644e;
                        c8986a4 = c8988c2.f81643d;
                        s.b(obj4);
                        obj3 = obj4;
                        c1375a = (C1375a) obj3;
                        m16 = m17;
                        c8986a3 = c8986a4;
                        C1375a c1375a3 = c1375a;
                        InterfaceC7874c interfaceC7874c5 = interfaceC7874c3;
                        C10234h c10234h5 = c10234h3;
                        T t12 = m15.f71787a;
                        mVar2 = t12 instanceof m ? (m) t12 : null;
                        if (mVar2 != null && (c12 = mVar2.c()) != null) {
                            A5.k.a(c12);
                        }
                        C10239m c10239m4 = (C10239m) m16.f71787a;
                        c8988c2.f81643d = null;
                        c8988c2.f81644e = null;
                        c8988c2.f81645f = null;
                        c8988c2.f81646g = null;
                        c8988c2.f81647h = null;
                        c8988c2.f81648i = null;
                        c8988c2.f81649j = null;
                        c8988c2.f81650k = null;
                        c8988c2.f81653n = 3;
                        c8986a3.getClass();
                        List<y5.b> O11 = c10234h5.O();
                        obj4 = (!O11.isEmpty() && ((c1375a3.d() instanceof BitmapDrawable) || c10234h5.g())) ? C10727i.f(c10234h5.N(), new h(c8986a3, c1375a3, c10239m4, O11, interfaceC7874c5, c10234h5, null), c8988c2) : c1375a3;
                    }
                    m14.f71787a = t2;
                    T t13 = m15.f71787a;
                    gVar = (p5.g) t13;
                    if (gVar instanceof m) {
                        c10234h3 = c10234h2;
                        m16 = m12;
                        interfaceC7874c3 = interfaceC7874c2;
                        if (!(gVar instanceof p5.f)) {
                            throw new o();
                        }
                        c1375a = new C1375a(((p5.f) t13).b(), ((p5.f) m15.f71787a).c(), ((p5.f) m15.f71787a).a(), null);
                        c8986a3 = c8986a2;
                        C1375a c1375a32 = c1375a;
                        InterfaceC7874c interfaceC7874c52 = interfaceC7874c3;
                        C10234h c10234h52 = c10234h3;
                        T t122 = m15.f71787a;
                        if (t122 instanceof m) {
                        }
                        if (mVar2 != null) {
                        }
                        C10239m c10239m42 = (C10239m) m16.f71787a;
                        c8988c2.f81643d = null;
                        c8988c2.f81644e = null;
                        c8988c2.f81645f = null;
                        c8988c2.f81646g = null;
                        c8988c2.f81647h = null;
                        c8988c2.f81648i = null;
                        c8988c2.f81649j = null;
                        c8988c2.f81650k = null;
                        c8988c2.f81653n = 3;
                        c8986a3.getClass();
                        List<y5.b> O112 = c10234h52.O();
                        if (O112.isEmpty()) {
                        }
                    } else {
                        I n11 = c10234h2.n();
                        M m24 = m15;
                        try {
                            d dVar = new d(c8986a2, m24, m13, c10234h2, obj2, m12, interfaceC7874c2, null);
                            c10234h3 = c10234h2;
                            M m25 = m12;
                            interfaceC7874c3 = interfaceC7874c2;
                            c8988c2.f81643d = c8986a2;
                            c8988c2.f81644e = c10234h3;
                            c8988c2.f81645f = interfaceC7874c3;
                            c8988c2.f81646g = m25;
                            c8988c2.f81647h = m15;
                            c8988c2.f81648i = null;
                            c8988c2.f81649j = null;
                            c8988c2.f81650k = null;
                            c8988c2.f81653n = 2;
                            Object f11 = C10727i.f(n11, dVar, c8988c2);
                            if (f11 == aVar) {
                                return aVar;
                            }
                            m17 = m25;
                            c8986a4 = c8986a2;
                            obj3 = f11;
                            c1375a = (C1375a) obj3;
                            m16 = m17;
                            c8986a3 = c8986a4;
                            C1375a c1375a322 = c1375a;
                            InterfaceC7874c interfaceC7874c522 = interfaceC7874c3;
                            C10234h c10234h522 = c10234h3;
                            T t1222 = m15.f71787a;
                            if (t1222 instanceof m) {
                            }
                            if (mVar2 != null) {
                                A5.k.a(c12);
                            }
                            C10239m c10239m422 = (C10239m) m16.f71787a;
                            c8988c2.f81643d = null;
                            c8988c2.f81644e = null;
                            c8988c2.f81645f = null;
                            c8988c2.f81646g = null;
                            c8988c2.f81647h = null;
                            c8988c2.f81648i = null;
                            c8988c2.f81649j = null;
                            c8988c2.f81650k = null;
                            c8988c2.f81653n = 3;
                            c8986a3.getClass();
                            List<y5.b> O1122 = c10234h522.O();
                            if (O1122.isEmpty()) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            m11 = m24;
                            T t112 = m11.f71787a;
                            if (t112 instanceof m) {
                            }
                            if (mVar != null) {
                                A5.k.a(c11);
                            }
                            throw th;
                        }
                    }
                }
            }
            if (m11 != 0) {
            }
            m14.f71787a = t2;
            T t132 = m15.f71787a;
            gVar = (p5.g) t132;
            if (gVar instanceof m) {
            }
        } catch (Throwable th4) {
            th = th4;
        }
        c8988c = new C8988c(c8986a, cVar);
        C8988c c8988c22 = c8988c;
        Object obj42 = c8988c22.f81651l;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        m11 = c8988c22.f81653n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0081 -> B:10:0x0085). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(C7873b c7873b, C10234h c10234h, Object obj, C10239m c10239m, InterfaceC7874c interfaceC7874c, kotlin.coroutines.jvm.internal.c cVar) {
        e eVar;
        int i11;
        int i12;
        C8986a c8986a;
        Pair i13;
        n c11;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f81672n;
            if ((i14 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                eVar.f81672n = i14 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = eVar.f81670l;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = eVar.f81672n;
                if (i11 != 0) {
                    s.b(obj2);
                    i12 = 0;
                    c8986a = this;
                    i13 = c7873b.i(obj, c10239m, c8986a.f81624a, i12);
                    if (i13 != null) {
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i15 = eVar.f81669k;
                    InterfaceC7874c interfaceC7874c2 = eVar.f81667i;
                    C10239m c10239m2 = eVar.f81666h;
                    Object obj3 = eVar.f81665g;
                    C10234h c10234h2 = eVar.f81664f;
                    C7873b c7873b2 = eVar.f81663e;
                    c8986a = eVar.f81662d;
                    s.b(obj2);
                    e eVar2 = eVar;
                    int i16 = i15;
                    c7873b = c7873b2;
                    e eVar3 = eVar2;
                    interfaceC7874c = interfaceC7874c2;
                    c10234h = c10234h2;
                    c10239m = c10239m2;
                    obj = obj3;
                    p5.g gVar = (p5.g) obj2;
                    try {
                        interfaceC7874c.getClass();
                        if (gVar == null) {
                            return gVar;
                        }
                        i12 = i16;
                        eVar = eVar3;
                        i13 = c7873b.i(obj, c10239m, c8986a.f81624a, i12);
                        if (i13 != null) {
                            throw new IllegalStateException(U7.m.b(obj, "Unable to create a fetcher that supports: ").toString());
                        }
                        p5.h hVar = (p5.h) i13.e();
                        int intValue = ((Number) i13.f()).intValue() + 1;
                        interfaceC7874c.getClass();
                        eVar.f81662d = c8986a;
                        eVar.f81663e = c7873b;
                        eVar.f81664f = c10234h;
                        eVar.f81665g = obj;
                        eVar.f81666h = c10239m;
                        eVar.f81667i = interfaceC7874c;
                        eVar.f81668j = hVar;
                        eVar.f81669k = intValue;
                        eVar.f81672n = 1;
                        Object a11 = hVar.a(eVar);
                        if (a11 == aVar) {
                            return aVar;
                        }
                        e eVar4 = eVar;
                        i16 = intValue;
                        obj2 = a11;
                        eVar3 = eVar4;
                        p5.g gVar2 = (p5.g) obj2;
                        interfaceC7874c.getClass();
                        if (gVar2 == null) {
                        }
                    } catch (Throwable th2) {
                        m mVar = gVar2 instanceof m ? (m) gVar2 : null;
                        if (mVar != null && (c11 = mVar.c()) != null) {
                            A5.k.a(c11);
                        }
                        throw th2;
                    }
                }
            }
        }
        eVar = new e(this, cVar);
        Object obj22 = eVar.f81670l;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = eVar.f81672n;
        if (i11 != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r2v9, types: [q5.i$a] */
    @Override // q5.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull k kVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        f fVar;
        int i11;
        C8986a c8986a;
        k kVar2;
        Drawable t2;
        C9759d c9759d = this.f81626c;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i12 = fVar.f81677h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                fVar.f81677h = i12 - LinearLayoutManager.INVALID_OFFSET;
                f fVar2 = fVar;
                Object obj = fVar2.f81675f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = fVar2.f81677h;
                if (i11 != 0) {
                    s.b(obj);
                    try {
                        C10234h request = kVar.getRequest();
                        Object m11 = request.m();
                        C10435g c11 = kVar.c();
                        int i13 = A5.k.f430d;
                        InterfaceC7874c b11 = kVar.b();
                        C10239m c12 = this.f81625b.c(request, c11);
                        EnumC10434f m12 = c12.m();
                        b11.getClass();
                        Object g10 = this.f81624a.f().g(m11, c12);
                        InterfaceC9758c.b b12 = c9759d.b(request, g10, c12, b11);
                        InterfaceC9758c.C2178c a11 = b12 != null ? c9759d.a(request, b12, c11, m12) : null;
                        if (a11 != null) {
                            return C9759d.c(kVar, request, b12, a11);
                        }
                        I v11 = request.v();
                        g gVar = new g(this, request, g10, c12, b11, b12, kVar, null);
                        fVar2.f81673d = this;
                        fVar2.f81674e = kVar;
                        fVar2.f81677h = 1;
                        Object f7 = C10727i.f(v11, gVar, fVar2);
                        return f7 == aVar ? aVar : f7;
                    } catch (Throwable th2) {
                        th = th2;
                        c8986a = this;
                        kVar2 = kVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ?? r22 = fVar2.f81674e;
                    c8986a = fVar2.f81673d;
                    try {
                        s.b(obj);
                        return obj;
                    } catch (Throwable th3) {
                        th = th3;
                        kVar2 = r22;
                    }
                }
                if (!(th instanceof CancellationException)) {
                    throw th;
                }
                C10242p c10242p = c8986a.f81625b;
                C10234h request2 = kVar2.getRequest();
                if (th instanceof C10237k) {
                    t2 = request2.u();
                    if (t2 == null) {
                        t2 = request2.t();
                    }
                } else {
                    t2 = request2.t();
                }
                return new C10232f(t2, request2, th);
            }
        }
        fVar = new f(this, cVar);
        f fVar22 = fVar;
        Object obj2 = fVar22.f81675f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = fVar22.f81677h;
        if (i11 != 0) {
        }
        if (!(th instanceof CancellationException)) {
        }
    }
}
