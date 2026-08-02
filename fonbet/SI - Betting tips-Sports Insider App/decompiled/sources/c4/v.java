package c4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.widget.ImageView;
import eg.c0;
import eg.e1;
import io.sentry.android.core.g0;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.Path;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v implements o {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f3627f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final r f3628a;

    /* renamed from: b, reason: collision with root package name */
    public final jg.d f3629b;

    /* renamed from: c, reason: collision with root package name */
    public final x5.h f3630c;

    /* renamed from: d, reason: collision with root package name */
    public final e f3631d;

    /* renamed from: e, reason: collision with root package name */
    public volatile /* synthetic */ int f3632e;

    static {
        AtomicIntegerFieldUpdater.newUpdater(v.class, "e");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public v(r rVar) {
        Object hVar;
        Object obj;
        int i5;
        this.f3628a = rVar;
        int i10 = 0;
        this.f3629b = c0.b(kotlin.coroutines.e.c(c0.d(), new w(eg.x.f9236a, i10)));
        kh.h hVar2 = new kh.h(this);
        x5.h hVar3 = new x5.h();
        hVar3.f25409a = this;
        int i11 = Build.VERSION.SDK_INT;
        int i12 = 1;
        if (i11 < 26) {
            boolean z5 = v4.g.f24420a;
        } else if (!v4.g.f24420a) {
            hVar = (i11 == 26 || i11 == 27) ? new v4.k() : new v4.h(true);
            hVar3.f25410b = hVar;
            this.f3630c = hVar3;
            d dVar = new d(rVar.f3607f);
            ArrayList arrayList = (ArrayList) dVar.f3577b;
            ArrayList arrayList2 = (ArrayList) dVar.f3580e;
            ArrayList arrayList3 = (ArrayList) dVar.f3579d;
            ArrayList arrayList4 = (ArrayList) dVar.f3581f;
            q4.f fVar = rVar.f3603b;
            obj = fVar.f21966n.f3595a.get(p.f3597a);
            int i13 = 3;
            int i14 = 2;
            if (((Boolean) (obj == null ? Boolean.TRUE : obj)).booleanValue()) {
                arrayList2.add(new n(i14));
                arrayList4.add(new n(i13));
            }
            dVar.b(new k4.a(i10), Reflection.getOrCreateKotlinClass(Uri.class));
            dVar.b(new k4.a(i13), Reflection.getOrCreateKotlinClass(Integer.class));
            arrayList3.add(new Pair(new j4.a(i10), Reflection.getOrCreateKotlinClass(b0.class)));
            dVar.a(new f4.a(i10), Reflection.getOrCreateKotlinClass(b0.class));
            dVar.a(new f4.a(4), Reflection.getOrCreateKotlinClass(b0.class));
            dVar.a(new f4.a(9), Reflection.getOrCreateKotlinClass(b0.class));
            dVar.a(new f4.a(6), Reflection.getOrCreateKotlinClass(Drawable.class));
            dVar.a(new f4.a(i12), Reflection.getOrCreateKotlinClass(Bitmap.class));
            k kVar = q.f3598a;
            Object obj2 = fVar.f21966n.f3595a.get(q.f3598a);
            int intValue = ((Number) (obj2 == null ? 4 : obj2)).intValue();
            int i15 = ng.j.f20905a;
            ng.i iVar = new ng.i(intValue);
            i5 = Build.VERSION.SDK_INT;
            Object obj3 = d4.o.f8140a;
            if (i5 >= 29) {
                Object obj4 = fVar.f21966n.f3595a.get(q.f3600c);
                if (((Boolean) (obj4 == null ? Boolean.TRUE : obj4)).booleanValue()) {
                    Object obj5 = fVar.f21966n.f3595a.get(q.f3599b);
                    if (Intrinsics.areEqual((d4.o) (obj5 == null ? obj3 : obj5), obj3)) {
                        arrayList4.add(new c(new d4.v(iVar), i10));
                    }
                }
            }
            Object obj6 = fVar.f21966n.f3595a.get(q.f3599b);
            arrayList4.add(new c(new d4.c(iVar, (d4.o) (obj6 != null ? obj6 : obj3)), i10));
            dVar.b(new k4.a(i12), Reflection.getOrCreateKotlinClass(File.class));
            dVar.a(new f4.a(8), Reflection.getOrCreateKotlinClass(b0.class));
            dVar.a(new f4.a(3), Reflection.getOrCreateKotlinClass(ByteBuffer.class));
            dVar.b(new k4.a(4), Reflection.getOrCreateKotlinClass(String.class));
            dVar.b(new k4.a(2), Reflection.getOrCreateKotlinClass(Path.class));
            arrayList3.add(new Pair(new j4.b(), Reflection.getOrCreateKotlinClass(b0.class)));
            arrayList3.add(new Pair(new j4.a(i12), Reflection.getOrCreateKotlinClass(b0.class)));
            dVar.a(new f4.a(7), Reflection.getOrCreateKotlinClass(b0.class));
            dVar.a(new f4.a(2), Reflection.getOrCreateKotlinClass(byte[].class));
            dVar.a(new f4.a(5), Reflection.getOrCreateKotlinClass(b0.class));
            arrayList.add(new i4.h(this, hVar2, hVar3));
            this.f3631d = new e(ci.c.a0(arrayList), ci.c.a0((ArrayList) dVar.f3578c), ci.c.a0(arrayList3), ci.c.a0(arrayList2), ci.c.a0(arrayList4));
        }
        hVar = new v4.h(false);
        hVar3.f25410b = hVar;
        this.f3630c = hVar3;
        d dVar2 = new d(rVar.f3607f);
        ArrayList arrayList5 = (ArrayList) dVar2.f3577b;
        ArrayList arrayList22 = (ArrayList) dVar2.f3580e;
        ArrayList arrayList32 = (ArrayList) dVar2.f3579d;
        ArrayList arrayList42 = (ArrayList) dVar2.f3581f;
        q4.f fVar2 = rVar.f3603b;
        obj = fVar2.f21966n.f3595a.get(p.f3597a);
        int i132 = 3;
        int i142 = 2;
        if (((Boolean) (obj == null ? Boolean.TRUE : obj)).booleanValue()) {
        }
        dVar2.b(new k4.a(i10), Reflection.getOrCreateKotlinClass(Uri.class));
        dVar2.b(new k4.a(i132), Reflection.getOrCreateKotlinClass(Integer.class));
        arrayList32.add(new Pair(new j4.a(i10), Reflection.getOrCreateKotlinClass(b0.class)));
        dVar2.a(new f4.a(i10), Reflection.getOrCreateKotlinClass(b0.class));
        dVar2.a(new f4.a(4), Reflection.getOrCreateKotlinClass(b0.class));
        dVar2.a(new f4.a(9), Reflection.getOrCreateKotlinClass(b0.class));
        dVar2.a(new f4.a(6), Reflection.getOrCreateKotlinClass(Drawable.class));
        dVar2.a(new f4.a(i12), Reflection.getOrCreateKotlinClass(Bitmap.class));
        k kVar2 = q.f3598a;
        Object obj22 = fVar2.f21966n.f3595a.get(q.f3598a);
        int intValue2 = ((Number) (obj22 == null ? 4 : obj22)).intValue();
        int i152 = ng.j.f20905a;
        ng.i iVar2 = new ng.i(intValue2);
        i5 = Build.VERSION.SDK_INT;
        Object obj32 = d4.o.f8140a;
        if (i5 >= 29) {
        }
        Object obj62 = fVar2.f21966n.f3595a.get(q.f3599b);
        arrayList42.add(new c(new d4.c(iVar2, (d4.o) (obj62 != null ? obj62 : obj32)), i10));
        dVar2.b(new k4.a(i12), Reflection.getOrCreateKotlinClass(File.class));
        dVar2.a(new f4.a(8), Reflection.getOrCreateKotlinClass(b0.class));
        dVar2.a(new f4.a(3), Reflection.getOrCreateKotlinClass(ByteBuffer.class));
        dVar2.b(new k4.a(4), Reflection.getOrCreateKotlinClass(String.class));
        dVar2.b(new k4.a(2), Reflection.getOrCreateKotlinClass(Path.class));
        arrayList32.add(new Pair(new j4.b(), Reflection.getOrCreateKotlinClass(b0.class)));
        arrayList32.add(new Pair(new j4.a(i12), Reflection.getOrCreateKotlinClass(b0.class)));
        dVar2.a(new f4.a(7), Reflection.getOrCreateKotlinClass(b0.class));
        dVar2.a(new f4.a(2), Reflection.getOrCreateKotlinClass(byte[].class));
        dVar2.a(new f4.a(5), Reflection.getOrCreateKotlinClass(b0.class));
        arrayList5.add(new i4.h(this, hVar2, hVar3));
        this.f3631d = new e(ci.c.a0(arrayList5), ci.c.a0((ArrayList) dVar2.f3578c), ci.c.a0(arrayList32), ci.c.a0(arrayList22), ci.c.a0(arrayList42));
    }

    public final q4.c a(q4.h hVar) {
        return p.d(hVar, c0.e(this.f3629b, (CoroutineContext) this.f3628a.f3604c.getValue(), new s(this, hVar, null, 0), 2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x0195, code lost:
    
        if (r1.d(r9) == r10) goto L131;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x020c A[Catch: all -> 0x003e, TryCatch #5 {all -> 0x003e, blocks: (B:14:0x0039, B:15:0x0206, B:17:0x020c, B:20:0x021b, B:21:0x022f, B:23:0x0236, B:27:0x021f, B:28:0x023a, B:30:0x023e, B:31:0x024a, B:32:0x024f, B:69:0x006b, B:70:0x019e, B:72:0x01a5, B:74:0x01af, B:75:0x01b9, B:76:0x01bc), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x023a A[Catch: all -> 0x003e, TryCatch #5 {all -> 0x003e, blocks: (B:14:0x0039, B:15:0x0206, B:17:0x020c, B:20:0x021b, B:21:0x022f, B:23:0x0236, B:27:0x021f, B:28:0x023a, B:30:0x023e, B:31:0x024a, B:32:0x024f, B:69:0x006b, B:70:0x019e, B:72:0x01a5, B:74:0x01af, B:75:0x01b9, B:76:0x01bc), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0264 A[Catch: all -> 0x0271, TRY_LEAVE, TryCatch #1 {all -> 0x0271, blocks: (B:52:0x0260, B:54:0x0264, B:57:0x0273, B:58:0x0278), top: B:51:0x0260 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0273 A[Catch: all -> 0x0271, TRY_ENTER, TryCatch #1 {all -> 0x0271, blocks: (B:52:0x0260, B:54:0x0264, B:57:0x0273, B:58:0x0278), top: B:51:0x0260 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a5 A[Catch: all -> 0x003e, TryCatch #5 {all -> 0x003e, blocks: (B:14:0x0039, B:15:0x0206, B:17:0x020c, B:20:0x021b, B:21:0x022f, B:23:0x0236, B:27:0x021f, B:28:0x023a, B:30:0x023e, B:31:0x024a, B:32:0x024f, B:69:0x006b, B:70:0x019e, B:72:0x01a5, B:74:0x01af, B:75:0x01b9, B:76:0x01bc), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0070  */
    /* JADX WARN: Type inference failed for: r17v0, types: [c4.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19, types: [c4.g, c4.i] */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v4, types: [c4.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v18, types: [int] */
    /* JADX WARN: Type inference failed for: r4v19, types: [int] */
    /* JADX WARN: Type inference failed for: r5v0, types: [q4.h] */
    /* JADX WARN: Type inference failed for: r5v1, types: [q4.o] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(q4.h hVar, int i5, mf.c cVar) {
        t tVar;
        q4.h hVar2;
        Object obj;
        lf.a aVar;
        ?? r32;
        q4.o g0Var;
        r4.j jVar;
        q4.o oVar;
        ImageView imageView;
        r4.g gVar;
        ImageView.ScaleType scaleType;
        q4.h hVar3;
        i iVar;
        s4.b bVar;
        q4.h hVar4;
        i iVar2;
        q4.o oVar2;
        m mVar;
        q4.h hVar5;
        q4.h hVar6;
        Object A;
        i iVar3;
        q4.o oVar3;
        q4.h hVar7;
        q4.k kVar;
        ?? r42;
        ?? r5 = hVar;
        int i10 = i5;
        try {
            if (cVar instanceof t) {
                tVar = (t) cVar;
                r42 = tVar.f3619h;
                if ((r42 & Integer.MIN_VALUE) != 0) {
                    ?? r43 = r42 - Integer.MIN_VALUE;
                    tVar.f3619h = r43;
                    hVar2 = r43;
                    t tVar2 = tVar;
                    obj = tVar2.f3617f;
                    aVar = lf.a.f20034a;
                    r32 = tVar2.f3619h;
                    if (r32 != 0) {
                        h8.b.B(obj);
                        e1 o3 = c0.o(tVar2.getContext());
                        boolean z5 = i10 == 0;
                        x5.h hVar8 = this.f3630c;
                        hVar8.getClass();
                        v vVar = (v) hVar8.f25409a;
                        s4.b bVar2 = r5.f21978c;
                        if (bVar2 instanceof s4.a) {
                            androidx.lifecycle.y yVar = (androidx.lifecycle.y) p.e(r5, q4.j.f22003e);
                            if (yVar == null) {
                                yVar = x5.h.d(r5);
                            }
                            g0Var = new q4.q(vVar, r5, (s4.a) bVar2, yVar, o3);
                        } else {
                            androidx.lifecycle.y yVar2 = (androidx.lifecycle.y) p.e(r5, q4.j.f22003e);
                            if (yVar2 == null) {
                                yVar2 = z5 ? x5.h.d(r5) : null;
                            }
                            g0Var = yVar2 != null ? new g0(yVar2, o3) : new q4.a(o3);
                        }
                        g0Var.b();
                        Context context = r5.f21976a;
                        s4.b bVar3 = r5.f21978c;
                        q4.e eVar = new q4.e(r5, context);
                        eVar.f21939b = vVar.f3628a.f3603b;
                        q4.g gVar2 = r5.f21993t;
                        r4.j jVar2 = gVar2.f21973g;
                        if (jVar2 == null) {
                            if (bVar3 instanceof s4.a) {
                                ImageView imageView2 = ((s4.a) bVar3).f22622b;
                                jVar = (imageView2 == null || !((scaleType = imageView2.getScaleType()) == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX)) ? new r4.f(imageView2) : r4.j.f22309a;
                            } else {
                                jVar = r4.j.f22309a;
                            }
                            eVar.f21950n = jVar;
                        } else {
                            jVar = jVar2;
                        }
                        if (gVar2.f21974h == null) {
                            s4.a aVar2 = bVar3 instanceof s4.a ? (s4.a) bVar3 : null;
                            ImageView imageView3 = aVar2 != null ? aVar2.f22622b : null;
                            if (imageView3 == null) {
                                imageView3 = null;
                            }
                            if (imageView3 != null) {
                                Bitmap.Config[] configArr = v4.r.f24431a;
                                ImageView.ScaleType scaleType2 = imageView3.getScaleType();
                                int i11 = scaleType2 == null ? -1 : v4.q.$EnumSwitchMapping$1[scaleType2.ordinal()];
                                gVar = (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) ? r4.g.f22299b : r4.g.f22298a;
                            } else {
                                gVar = r5.q;
                            }
                            eVar.f21951o = gVar;
                        }
                        if (gVar2.f21975i == null) {
                            eVar.f21952p = (jVar2 == null && Intrinsics.areEqual(jVar, r4.j.f22309a)) ? r4.d.f22294b : ((bVar3 instanceof s4.a) && (jVar instanceof r4.f) && (imageView = ((s4.a) bVar3).f22622b) != null && imageView == ((r4.f) jVar).f22297b) ? r4.d.f22294b : r4.d.f22293a;
                        }
                        hVar2 = eVar.a();
                        r32 = i.f3591a;
                        try {
                            if (Intrinsics.areEqual(hVar2.f21977b, q4.l.f22006a)) {
                                throw new q4.m("The request's data is null.");
                            }
                            g0Var.start();
                            if (i10 == 0) {
                                tVar2.f3612a = g0Var;
                                tVar2.f3613b = hVar2;
                                tVar2.f3614c = r32;
                                tVar2.f3616e = i10;
                                tVar2.f3619h = 1;
                            }
                            oVar = g0Var;
                            iVar = r32;
                            hVar3 = hVar2;
                        } catch (Throwable th2) {
                            th = th2;
                            r5 = g0Var;
                            if (th instanceof CancellationException) {
                            }
                        }
                    } else if (r32 == 1) {
                        i10 = tVar2.f3616e;
                        i iVar4 = tVar2.f3614c;
                        q4.h hVar9 = tVar2.f3613b;
                        oVar = tVar2.f3612a;
                        h8.b.B(obj);
                        iVar = iVar4;
                        hVar3 = hVar9;
                    } else {
                        if (r32 != 2) {
                            if (r32 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            iVar3 = tVar2.f3614c;
                            hVar7 = tVar2.f3613b;
                            oVar3 = tVar2.f3612a;
                            h8.b.B(obj);
                            kVar = (q4.k) obj;
                            if (!(kVar instanceof q4.p)) {
                                q4.p pVar = (q4.p) kVar;
                                s4.b bVar4 = hVar7.f21978c;
                                q4.h hVar10 = pVar.f22017b;
                                m mVar2 = pVar.f22016a;
                                if (bVar4 instanceof s4.a) {
                                    ((u4.a) p.e(hVar10, q4.j.f21999a)).getClass();
                                    ((s4.a) bVar4).e(mVar2);
                                } else if (bVar4 != null) {
                                    bVar4.f(mVar2);
                                }
                                iVar3.a(hVar10, pVar);
                                i iVar5 = hVar10.f21979d;
                                if (iVar5 != null) {
                                    iVar5.a(hVar10, pVar);
                                }
                            } else {
                                if (!(kVar instanceof q4.d)) {
                                    throw new gf.m();
                                }
                                e((q4.d) kVar, hVar7.f21978c, iVar3);
                            }
                            oVar3.a();
                            return kVar;
                        }
                        i10 = tVar2.f3616e;
                        m mVar3 = tVar2.f3615d;
                        iVar2 = tVar2.f3614c;
                        q4.h hVar11 = tVar2.f3613b;
                        q4.o oVar4 = tVar2.f3612a;
                        try {
                            h8.b.B(obj);
                            hVar4 = hVar11;
                            mVar = mVar3;
                            oVar2 = oVar4;
                            hVar5 = hVar4;
                            int i12 = i10;
                            try {
                                r4.i iVar6 = (r4.i) obj;
                                iVar2.getClass();
                                CoroutineContext coroutineContext = hVar5.f21982g;
                                hVar6 = hVar5;
                                try {
                                    u uVar = new u(hVar6, this, iVar6, iVar2, mVar, null, 0);
                                    tVar2.f3612a = oVar2;
                                    tVar2.f3613b = hVar6;
                                    tVar2.f3614c = iVar2;
                                    tVar2.f3615d = null;
                                    tVar2.f3616e = i12;
                                    tVar2.f3619h = 3;
                                    A = c0.A(coroutineContext, uVar, tVar2);
                                    if (A != aVar) {
                                        iVar3 = iVar2;
                                        oVar3 = oVar2;
                                        hVar7 = hVar6;
                                        obj = A;
                                        kVar = (q4.k) obj;
                                        if (!(kVar instanceof q4.p)) {
                                        }
                                        oVar3.a();
                                        return kVar;
                                    }
                                    return aVar;
                                } catch (Throwable th3) {
                                    th = th3;
                                    r32 = iVar2;
                                    r5 = oVar2;
                                    hVar2 = hVar6;
                                    try {
                                        if (th instanceof CancellationException) {
                                            r32.getClass();
                                            i iVar7 = hVar2.f21979d;
                                            throw th;
                                        }
                                        q4.d a7 = v4.p.a(hVar2, th);
                                        e(a7, hVar2.f21978c, r32);
                                        return a7;
                                    } finally {
                                        r5.a();
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                hVar6 = hVar5;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            r32 = iVar2;
                            hVar2 = hVar11;
                            r5 = oVar4;
                            if (th instanceof CancellationException) {
                            }
                        }
                    }
                    hVar3.getClass();
                    bVar = hVar3.f21978c;
                    if (bVar != null) {
                        m mVar4 = (m) hVar3.f21987m.invoke(hVar3);
                        if (mVar4 == null) {
                            mVar4 = (m) hVar3.f21994u.f21961h.invoke(hVar3);
                        }
                        bVar.d(mVar4);
                    }
                    iVar.getClass();
                    r4.j jVar3 = hVar3.f21990p;
                    tVar2.f3612a = oVar;
                    tVar2.f3613b = hVar3;
                    tVar2.f3614c = iVar;
                    tVar2.f3615d = null;
                    tVar2.f3616e = i10;
                    tVar2.f3619h = 2;
                    obj = jVar3.a(tVar2);
                    if (obj != aVar) {
                        hVar4 = hVar3;
                        iVar2 = iVar;
                        oVar2 = oVar;
                        mVar = null;
                        hVar5 = hVar4;
                        int i122 = i10;
                        r4.i iVar62 = (r4.i) obj;
                        iVar2.getClass();
                        CoroutineContext coroutineContext2 = hVar5.f21982g;
                        hVar6 = hVar5;
                        u uVar2 = new u(hVar6, this, iVar62, iVar2, mVar, null, 0);
                        tVar2.f3612a = oVar2;
                        tVar2.f3613b = hVar6;
                        tVar2.f3614c = iVar2;
                        tVar2.f3615d = null;
                        tVar2.f3616e = i122;
                        tVar2.f3619h = 3;
                        A = c0.A(coroutineContext2, uVar2, tVar2);
                        if (A != aVar) {
                        }
                    }
                    return aVar;
                }
            }
            if (r32 != 0) {
            }
            hVar3.getClass();
            bVar = hVar3.f21978c;
            if (bVar != null) {
            }
            iVar.getClass();
            r4.j jVar32 = hVar3.f21990p;
            tVar2.f3612a = oVar;
            tVar2.f3613b = hVar3;
            tVar2.f3614c = iVar;
            tVar2.f3615d = null;
            tVar2.f3616e = i10;
            tVar2.f3619h = 2;
            obj = jVar32.a(tVar2);
            if (obj != aVar) {
            }
            return aVar;
        } catch (Throwable th6) {
            th = th6;
        }
        tVar = new t(this, cVar);
        hVar2 = r42;
        t tVar22 = tVar;
        obj = tVar22.f3617f;
        aVar = lf.a.f20034a;
        r32 = tVar22.f3619h;
    }

    public final Object c(q4.h hVar, mf.c cVar) {
        return ((hVar.f21978c instanceof s4.a) || (hVar.f21990p instanceof r4.f) || ((androidx.lifecycle.y) p.e(hVar, q4.j.f22003e)) != null) ? c0.i(new androidx.lifecycle.o(this, hVar, (Continuation) null, 3), cVar) : b(hVar, 1, cVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [gf.i, java.lang.Object] */
    public final l4.c d() {
        return (l4.c) this.f3628a.f3605d.getValue();
    }

    public final void e(q4.d dVar, s4.b bVar, i iVar) {
        q4.h hVar = dVar.f21936b;
        m mVar = dVar.f21935a;
        if (bVar instanceof s4.a) {
            ((u4.a) p.e(hVar, q4.j.f21999a)).getClass();
            ((s4.a) bVar).e(mVar);
        } else if (bVar != null) {
            bVar.b(mVar);
        }
        iVar.getClass();
        i iVar2 = hVar.f21979d;
    }
}
