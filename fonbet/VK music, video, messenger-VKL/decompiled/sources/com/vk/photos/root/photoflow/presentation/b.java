package com.vk.photos.root.photoflow.presentation;

import android.os.Bundle;
import android.os.Parcelable;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.data.VKList;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.log.L;
import com.vk.photos.root.common.PhotoUploadInteractor;
import com.vk.photos.root.photoflow.presentation.a;
import com.vk.photos.root.photoflow.presentation.c;
import com.vk.photos.root.photoflow.presentation.d;
import com.vk.photos.root.photoflow.presentation.h;
import com.vk.photos.root.selectalbum.domain.PhotoAlbumWrapper;
import com.vk.toggle.anonymous.SakFeatures;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.chromium.net.NetError;
import ru.ok.android.utils.Logger;
import xsna.a960;
import xsna.abq0;
import xsna.amt;
import xsna.asu0;
import xsna.b9a0;
import xsna.be50;
import xsna.c5g;
import xsna.c7w;
import xsna.c8a0;
import xsna.cl1;
import xsna.cqv;
import xsna.cx00;
import xsna.d8a0;
import xsna.dh40;
import xsna.e43;
import xsna.eaa;
import xsna.ejh;
import xsna.epx;
import xsna.f4z;
import xsna.fh1;
import xsna.fo1;
import xsna.g22;
import xsna.g30;
import xsna.g600;
import xsna.h7o0;
import xsna.hg1;
import xsna.hq;
import xsna.izs;
import xsna.j4x;
import xsna.j5g;
import xsna.j7k0;
import xsna.k8;
import xsna.kdg0;
import xsna.l2e;
import xsna.lkz;
import xsna.lz;
import xsna.m3y;
import xsna.m5y;
import xsna.m7a0;
import xsna.mgz;
import xsna.n240;
import xsna.nda0;
import xsna.o010;
import xsna.o83;
import xsna.ok1;
import xsna.ow40;
import xsna.p350;
import xsna.p5;
import xsna.p870;
import xsna.paq0;
import xsna.pw;
import xsna.q130;
import xsna.q7a0;
import xsna.q8;
import xsna.qfa0;
import xsna.r7a0;
import xsna.s3q0;
import xsna.s520;
import xsna.tjc;
import xsna.tl30;
import xsna.tlo0;
import xsna.tq;
import xsna.uh40;
import xsna.uy7;
import xsna.vk40;
import xsna.w620;
import xsna.wj50;
import xsna.wk50;
import xsna.wn7;
import xsna.wnt;
import xsna.wzs;
import xsna.x7a0;
import xsna.y7a0;
import xsna.ysg0;
import xsna.zb60;
import xsna.zf1;
import xsna.zn3;

/* compiled from: PhotoFlowFeature.kt */
/* loaded from: classes4.dex */
public final class b extends wk50<l, h, com.vk.photos.root.photoflow.presentation.a, com.vk.photos.root.photoflow.presentation.d> {
    public final com.vk.photos.root.photoflow.presentation.c f;
    public final c8a0 g;
    public final f4z h;
    public final zn3 i;
    public io.reactivex.rxjava3.disposables.c j;

    /* compiled from: PhotoFlowFeature.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    /* compiled from: PhotoFlowFeature.kt */
    /* renamed from: com.vk.photos.root.photoflow.presentation.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C1506b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    /* compiled from: PhotoFlowFeature.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    /* compiled from: RxExt.kt */
    public static final class d implements izs {
        public static final d b = new d();

        @Override // xsna.izs
        public final Object invoke(Object obj) {
            return Boolean.valueOf(obj instanceof m7a0.c);
        }
    }

    /* compiled from: RxExt.kt */
    public static final class e implements izs {
        public static final e b = new e();

        @Override // xsna.izs
        public final Object invoke(Object obj) {
            return Boolean.valueOf(obj instanceof h7o0);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(com.vk.photos.root.photoflow.presentation.c cVar) {
        super(r0, new g(r2.a, r2.f));
        a.e eVar = a.e.b;
        c.b bVar = cVar.b;
        this.f = cVar;
        this.g = new c8a0(bVar.e, bVar.c, bVar.b, this.e, new uh40(this, 7), new q130(this, 14), new zb60(this, 6), bVar.g);
        this.h = new f4z();
        zn3 zn3Var = new zn3(this, 1);
        this.i = zn3Var;
        p870 w = cVar.c.a.w();
        w.b(130, zn3Var);
        w.b(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, zn3Var);
        ysg0<m7a0> ysg0Var = bVar.e;
        this.e.b(ysg0Var.a.subscribe(new be50(new o010(this, 27), 8)));
        ysg0<Object> ysg0Var2 = ysg0.b;
        i0 c2 = hg1.c(ysg0Var2.a, cl1.class, nda0.class, ok1.class);
        io.reactivex.rxjava3.subjects.f<m7a0> fVar = ysg0Var.a;
        hg1.y2 y2Var = new hg1.y2(d.b);
        fVar.getClass();
        this.e.b(q.X(c2, new i0(fVar, y2Var)).v0(500L, TimeUnit.MILLISECONDS).subscribe(new lz(this, 29), new dh40(new a(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 9)));
        U();
        io.reactivex.rxjava3.subjects.f<Object> fVar2 = ysg0Var2.a;
        hg1.y2 y2Var2 = new hg1.y2(e.b);
        fVar2.getClass();
        this.e.b(new i0(fVar2, y2Var2).subscribe(new s520(new w620(this, 12), 7)));
        c.d dVar = cVar.d;
        int i = dVar.a;
        if (i == 0 && dVar.b == 0) {
            return;
        }
        if (i < 0) {
            dVar.a = 100;
        }
        if (dVar.b < 0) {
            dVar.b = 100;
        }
        c0(dVar.a, dVar.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, xsna.c8a0] */
    /* JADX WARN: Type inference failed for: r3v11, types: [xsna.tlo0$g] */
    /* JADX WARN: Type inference failed for: r3v12, types: [xsna.tlo0] */
    /* JADX WARN: Type inference failed for: r3v16, types: [xsna.tlo0$g] */
    /* JADX WARN: Type inference failed for: r3v18, types: [xsna.tlo0$g] */
    /* JADX WARN: Type inference failed for: r3v20, types: [xsna.tlo0$g] */
    /* JADX WARN: Type inference failed for: r3v22, types: [xsna.tlo0$g] */
    /* JADX WARN: Type inference failed for: r3v24, types: [xsna.tlo0$f] */
    /* JADX WARN: Type inference failed for: r3v26, types: [xsna.tlo0$f] */
    /* JADX WARN: Type inference failed for: r3v28, types: [xsna.tlo0$f] */
    /* JADX WARN: Type inference failed for: r3v30, types: [xsna.tlo0$f] */
    /* JADX WARN: Type inference failed for: r3v31, types: [xsna.tlo0] */
    /* JADX WARN: Type inference failed for: r3v34, types: [xsna.tlo0$f] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v52, types: [java.lang.Iterable, java.util.ArrayList, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v57, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v58, types: [java.lang.Iterable, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v64, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v32, types: [xsna.qfa0$k] */
    @Override // xsna.wk50
    public final void N(h hVar, com.vk.photos.root.photoflow.presentation.a aVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        b bVar;
        boolean z5;
        int i;
        int i2;
        h hVar2 = hVar;
        com.vk.photos.root.photoflow.presentation.a aVar2 = aVar;
        Integer valueOf = Integer.valueOf(R.attr.vk_ui_accent_orange);
        Integer valueOf2 = Integer.valueOf(R.drawable.vk_icon_warning_triangle_outline_28);
        Integer valueOf3 = Integer.valueOf(R.drawable.vk_icon_check_circle_outline_28);
        Set<Integer> set = hVar2.g;
        boolean z6 = hVar2.i;
        boolean z7 = hVar2.f;
        h.a aVar3 = hVar2.e;
        if (aVar2.equals(a.e.b)) {
            T(new d.n());
            return;
        }
        boolean z8 = aVar2 instanceof a.j;
        f4z f4zVar = this.h;
        if (z8) {
            a.j jVar = (a.j) aVar2;
            boolean z9 = jVar.b;
            Throwable th = jVar.c;
            if (th instanceof VKApiExecutionException) {
                VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
                if (vKApiExecutionException.T() && SakFeatures.Type.NEW_GEOBLOCK_ERROR.h()) {
                    Bundle w = vKApiExecutionException.w();
                    long j = w != null ? w.getLong("owner_id") : 0L;
                    if (j != 0) {
                        f4zVar.b(new b9a0.e(j));
                        s3q0 s3q0Var = s3q0.a;
                        return;
                    }
                }
            }
            T(new d.C1508d(z9, th));
            return;
        }
        if (aVar2 instanceof a.k) {
            a.k kVar = (a.k) aVar2;
            boolean z10 = kVar.d;
            boolean z11 = kVar.c;
            VKList<Photo> vKList = kVar.b;
            T(z10 ? new d.h(vKList, z11) : new d.c(vKList, z11));
            return;
        }
        boolean z12 = aVar2 instanceof a.s.C1505a;
        com.vk.photos.root.photoflow.presentation.c cVar = this.f;
        if (z12) {
            y7a0 y7a0Var = ((a.s.C1505a) aVar2).b;
            if (z7) {
                Boolean bool = y7a0Var.b;
                Photo photo = y7a0Var.a;
                if (epx.f(bool, Boolean.TRUE)) {
                    T(new d.l(photo));
                    return;
                } else {
                    T(new d.j(photo));
                    return;
                }
            }
            cVar.b.g.a(y7a0Var.a.c);
            VKList<Photo> vKList2 = aVar3.a;
            if (vKList2 != null) {
                Iterator<Photo> it = vKList2.iterator();
                int i3 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    } else {
                        if (it.next().c == y7a0Var.a.c) {
                            i2 = i3;
                            break;
                        }
                        i3++;
                    }
                }
                f4zVar.b(new b9a0.f.h(i2, vKList2));
            }
        } else {
            boolean z13 = aVar2 instanceof a.s.e;
            d8a0.b.e eVar = d8a0.b.e.d;
            d8a0.b.a aVar4 = d8a0.b.a.d;
            d8a0.b.g gVar = d8a0.b.g.d;
            d8a0.b.i iVar = d8a0.b.i.d;
            d8a0.b.h hVar3 = d8a0.b.h.d;
            d8a0.b.C2713b c2713b = d8a0.b.C2713b.d;
            d8a0.b.f fVar = d8a0.b.f.d;
            d8a0.b.d dVar = d8a0.b.d.d;
            d8a0.b.c cVar2 = d8a0.b.c.d;
            ?? r1 = this.g;
            if (!z13) {
                Set<Integer> set2 = set;
                if (aVar2 instanceof a.s.f) {
                    a.s.f fVar2 = (a.s.f) aVar2;
                    d8a0.b bVar2 = fVar2.b;
                    Photo photo2 = fVar2.c;
                    x7a0 x7a0Var = r1.b;
                    io.reactivex.rxjava3.disposables.b bVar3 = r1.d;
                    zb60 zb60Var = r1.g;
                    qfa0.k kVar2 = r1.h;
                    if (bVar2.equals(dVar)) {
                        kVar2.g(Collections.singletonList(photo2));
                        String str = photo2.t;
                        if (str == null) {
                            return;
                        }
                        zb60Var.invoke(new b9a0.d.b(str));
                        return;
                    }
                    if (bVar2.equals(fVar)) {
                        kVar2.n(photo2);
                        zb60Var.invoke(new b9a0.f.e(photo2.e, photo2.d));
                        return;
                    }
                    if (bVar2.equals(c2713b)) {
                        List singletonList = Collections.singletonList(photo2);
                        kVar2.c(singletonList);
                        List list = singletonList;
                        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(Integer.valueOf(((Photo) it2.next()).d));
                        }
                        Set S0 = j5g.S0(arrayList);
                        if (S0.size() != 1) {
                            zb60Var.invoke(new b9a0.f.C2600f(EmptySet.b, singletonList));
                            return;
                        } else {
                            zb60Var.invoke(new b9a0.f.C2600f(S0, singletonList));
                            return;
                        }
                    }
                    if (bVar2.equals(hVar3)) {
                        kVar2.k(Collections.singletonList(photo2));
                        zb60Var.invoke(new b9a0.f.b(photo2));
                        return;
                    }
                    if (bVar2.equals(gVar)) {
                        kVar2.b(photo2.c);
                        Iterable iterable = aVar3.a;
                        if (iterable == null) {
                            iterable = EmptyList.b;
                        }
                        Iterable iterable2 = iterable;
                        if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                            i = 0;
                        } else {
                            Iterator it3 = iterable2.iterator();
                            i = 0;
                            while (it3.hasNext()) {
                                if (epx.f(((Photo) it3.next()).O, Boolean.TRUE) && (i = i + 1) < 0) {
                                    e43.s();
                                    throw null;
                                }
                            }
                        }
                        if (i >= 6) {
                            zb60Var.invoke(new b9a0.k(new j7k0(tq.h(tlo0.Companion, R.string.photo_flow_photo_pin_limit), valueOf3, Integer.valueOf(R.attr.vk_ui_icon_secondary), null, null, null, 32)));
                            return;
                        } else {
                            bVar3.b(x7a0Var.e(photo2).subscribe(new c7w(1, r1, photo2), new m3y(new k8(28, r1, photo2), 10)));
                            return;
                        }
                    }
                    if (bVar2.equals(iVar)) {
                        kVar2.m(photo2.c);
                        bVar3.b(x7a0Var.f(photo2).subscribe(new g30((Object) r1, 6), new wnt(new defpackage.c(29, r1, photo2), 18)));
                        return;
                    }
                    if (bVar2.equals(aVar4)) {
                        r1.a(Collections.singletonList(photo2));
                        return;
                    }
                    if (bVar2.equals(eVar)) {
                        kVar2.e(photo2.c);
                        r1.a.a(new m7a0.f(false));
                        r1.e.invoke(new d.a(photo2));
                        return;
                    } else {
                        if (!bVar2.equals(cVar2)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        kVar2.i(Collections.singletonList(photo2));
                        int i4 = photo2.d;
                        if (i4 == -183) {
                            zb60Var.invoke(new b9a0.c.a(photo2, null));
                            return;
                        } else {
                            bVar3.b(r1.c.a(i4, photo2.e).subscribe(new a960(new com.vk.libvideo.b(27, (Object) r1, photo2), 5), new vk40(new q8(L.a, 9), 13)));
                            return;
                        }
                    }
                }
                ?? r3 = 0;
                if (aVar2 instanceof a.s.d) {
                    d0();
                    return;
                }
                int i5 = 20;
                if (aVar2 instanceof a.s.c) {
                    f4zVar.b(new b9a0.k(new j7k0(hq.b(tlo0.Companion, R.plurals.download_photos_error, 1), valueOf2, valueOf, new tlo0.f(R.string.photos_retry), new com.vk.movika.sdk.base.flow.binding.j(i5, this, ((a.s.c) aVar2).b), null, 32)));
                    return;
                }
                if (aVar2 instanceof a.s.b) {
                    V(((a.s.b) aVar2).b);
                    return;
                }
                if (aVar2 instanceof a.s.g) {
                    V(((a.s.g) aVar2).b);
                    return;
                }
                if (aVar2 instanceof a.d.C1502a) {
                    cVar.b.g.f();
                    f4zVar.b(b9a0.a.a);
                    return;
                }
                if (aVar2 instanceof a.d.b) {
                    cVar.b.g.l();
                    f4zVar.b(b9a0.g.a);
                    return;
                }
                if (aVar2 instanceof a.d.e) {
                    cVar.b.g.h();
                    f4zVar.b(b9a0.f.i.a);
                    return;
                }
                if (aVar2 instanceof a.d.c) {
                    X();
                    return;
                }
                if (aVar2 instanceof a.d.C1503d) {
                    VKList<Photo> vKList3 = aVar3.a;
                    if (vKList3 != null) {
                        r3 = new ArrayList();
                        for (Photo photo3 : vKList3) {
                            Set<Integer> set3 = set2;
                            if (set3.contains(Integer.valueOf(photo3.c))) {
                                r3.add(photo3);
                            }
                            set2 = set3;
                        }
                    }
                    r1.getClass();
                    if (r3 != 0) {
                        if (!r3.isEmpty()) {
                            Iterator it4 = r3.iterator();
                            while (it4.hasNext()) {
                                if (((Photo) it4.next()).d != -6) {
                                    z5 = false;
                                    break;
                                }
                            }
                        }
                        z5 = true;
                        int size = r3.size();
                        ListBuilder e2 = e43.e();
                        if (size <= 1 && !r3.isEmpty()) {
                            Iterator it5 = r3.iterator();
                            while (true) {
                                if (it5.hasNext()) {
                                    if (!((Photo) it5.next()).Ib()) {
                                        e2.add(d8a0.a.d.e);
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        if (z6 && !z5) {
                            e2.add(d8a0.a.b.e);
                        }
                        if (size <= 1) {
                            e2.add(d8a0.a.e.e);
                        }
                        if (!z5) {
                            e2.add(new d8a0.a.C2712a(size));
                        }
                        e2.add(new d8a0.a.c(size));
                        r1.g.invoke(new b9a0.c.d(e2.g()));
                        return;
                    }
                } else if (aVar2 instanceof a.g.d) {
                    d8a0.a aVar5 = ((a.g.d) aVar2).b;
                    zb60 zb60Var2 = r1.g;
                    ?? r4 = r1.h;
                    VKList<Photo> vKList4 = aVar3.a;
                    if (vKList4 != null) {
                        r3 = new ArrayList();
                        for (Photo photo4 : vKList4) {
                            if (set2.contains(Integer.valueOf(photo4.c))) {
                                r3.add(photo4);
                            }
                        }
                    }
                    if (r3 != 0) {
                        if (!aVar5.equals(d8a0.a.d.e)) {
                            if (!aVar5.equals(d8a0.a.b.e)) {
                                if (aVar5.equals(d8a0.a.e.e)) {
                                    r4.k(r3);
                                    zb60Var2.invoke(new b9a0.f.c(r3));
                                    return;
                                } else if (aVar5 instanceof d8a0.a.C2712a) {
                                    r1.a(r3);
                                    return;
                                } else {
                                    if (!(aVar5 instanceof d8a0.a.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    r4.i(r3);
                                    zb60Var2.invoke(new b9a0.c.b(r3));
                                    return;
                                }
                            }
                            r4.c(r3);
                            ArrayList arrayList2 = new ArrayList(c5g.u(r3, 10));
                            Iterator it6 = r3.iterator();
                            while (it6.hasNext()) {
                                arrayList2.add(Integer.valueOf(((Photo) it6.next()).d));
                            }
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it7 = arrayList2.iterator();
                            while (it7.hasNext()) {
                                Object next = it7.next();
                                if (((Number) next).intValue() != -6) {
                                    arrayList3.add(next);
                                }
                            }
                            Set S02 = j5g.S0(arrayList3);
                            if (S02.size() != 1) {
                                zb60Var2.invoke(new b9a0.f.C2600f(EmptySet.b, r3));
                                return;
                            } else {
                                zb60Var2.invoke(new b9a0.f.C2600f(S02, r3));
                                return;
                            }
                        }
                        if (!r3.isEmpty()) {
                            r4.g(r3);
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it8 = r3.iterator();
                            while (it8.hasNext()) {
                                String str2 = ((Photo) it8.next()).t;
                                if (str2 != null) {
                                    arrayList4.add(str2);
                                }
                            }
                            zb60Var2.invoke(new b9a0.d.a(arrayList4));
                            return;
                        }
                    }
                } else {
                    if (aVar2 instanceof a.g.C1504a) {
                        W(((a.g.C1504a) aVar2).b);
                        return;
                    }
                    if (aVar2 instanceof a.g.e) {
                        W(((a.g.e) aVar2).b);
                        return;
                    }
                    if (aVar2 instanceof a.g.c) {
                        X();
                        d0();
                        return;
                    }
                    int i6 = 24;
                    if (aVar2 instanceof a.g.b) {
                        List<String> list2 = ((a.g.b) aVar2).b;
                        f4zVar.b(new b9a0.k(new j7k0(hq.b(tlo0.Companion, R.plurals.download_photos_error, list2.size()), valueOf2, valueOf, new tlo0.f(R.string.photos_retry), new pw(i6, this, list2), null, 32)));
                        return;
                    }
                    boolean z14 = aVar2 instanceof a.C1501a;
                    io.reactivex.rxjava3.disposables.b bVar4 = this.e;
                    if (z14) {
                        a.C1501a c1501a = (a.C1501a) aVar2;
                        int i7 = c1501a.c;
                        int i8 = c1501a.b;
                        if (i8 == 23) {
                            if (i7 == -1) {
                                c.b bVar5 = cVar.b;
                                Integer a2 = bVar5.d.a(NetError.ERR_ECH_NOT_NEGOTIATED, bVar5.a).a(i8, i7, c1501a.d, bVar4);
                                if (a2 == null) {
                                    Z();
                                    return;
                                } else {
                                    T(new d.p(a2.intValue()));
                                    return;
                                }
                            }
                        } else if (i8 == 25035) {
                            if (i7 == -1) {
                                X();
                                return;
                            }
                        }
                    } else {
                        if (!(aVar2 instanceof a.v)) {
                            if (aVar2 instanceof a.r) {
                                T(new d.k(((a.r) aVar2).b));
                                return;
                            }
                            if (aVar2.equals(a.h.b)) {
                                c.d dVar2 = cVar.d;
                                dVar2.d.e();
                                f4zVar.b(new b9a0.f.g(dVar2.a, dVar2.b));
                                return;
                            }
                            if (aVar2.equals(a.n.b)) {
                                c0(100, 100);
                                f4zVar.b(b9a0.h.a);
                                return;
                            }
                            if (aVar2.equals(a.i.b)) {
                                f4zVar.b(b9a0.g.a);
                                return;
                            }
                            if (aVar2 instanceof a.b) {
                                a.b bVar6 = (a.b) aVar2;
                                ArrayList arrayList5 = bVar6.b;
                                List<Photo> list3 = bVar6.c;
                                if (arrayList5.isEmpty()) {
                                    return;
                                }
                                bVar4.b(cVar.a.a.b(arrayList5).subscribe(new n240(new o83(this, arrayList5, list3, 6), 8), new m3y(new k8(27, arrayList5, this), 9)));
                                return;
                            }
                            if (aVar2 instanceof a.q) {
                                T(new d.j(((a.q) aVar2).b));
                                return;
                            }
                            if (aVar2 instanceof a.u) {
                                T(new d.l(((a.u) aVar2).b));
                                return;
                            }
                            if (aVar2.equals(a.c.b)) {
                                if (z7) {
                                    X();
                                    return;
                                } else {
                                    f4zVar.b(b9a0.b.a);
                                    return;
                                }
                            }
                            int i9 = 2;
                            if (!(aVar2 instanceof a.f)) {
                                if (aVar2 instanceof a.t) {
                                    a.t tVar = (a.t) aVar2;
                                    kdg0 kdg0Var = cVar.c.b;
                                    List<? extends Photo> list4 = aVar3.a;
                                    if (list4 == null) {
                                        list4 = EmptyList.b;
                                    }
                                    Photo photo5 = tVar.b;
                                    boolean z15 = tVar.c;
                                    fh1 fh1Var = new fh1(17, photo5, new j4x(this, 28));
                                    bVar4.b(z15 ? kdg0Var.b(list4, photo5, fh1Var) : kdg0Var.e(list4, photo5, fh1Var));
                                    return;
                                }
                                if (aVar2 instanceof a.p) {
                                    T(new d.i(((a.p) aVar2).b));
                                    return;
                                }
                                if (aVar2.equals(a.l.b)) {
                                    if (hVar2.k) {
                                        f4zVar.b(b9a0.i.a);
                                    }
                                    C(new a.p(false));
                                    return;
                                }
                                if (!(aVar2 instanceof a.o)) {
                                    if (!(aVar2 instanceof a.m)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    f4zVar.b(new b9a0.f.a(((a.m) aVar2).b));
                                    return;
                                }
                                a.o oVar = (a.o) aVar2;
                                if (z7) {
                                    return;
                                }
                                ysg0<m7a0> ysg0Var = cVar.b.e;
                                int i10 = oVar.b;
                                if (i10 != 0) {
                                    if (i10 == 1) {
                                        ysg0Var.a(new m7a0.f(false));
                                        return;
                                    } else if (i10 != 2) {
                                        return;
                                    }
                                }
                                ysg0Var.a(new m7a0.f(true));
                                return;
                            }
                            a.f fVar3 = (a.f) aVar2;
                            PhotoAlbumWrapper photoAlbumWrapper = fVar3.c;
                            boolean z16 = fVar3.d;
                            List<Photo> list5 = fVar3.b;
                            boolean z17 = photoAlbumWrapper instanceof PhotoAlbumWrapper.CommonPhotoAlbum;
                            int i11 = R.string.photo_flow_confirm_move_photos_title;
                            if (!z17) {
                                if (!(photoAlbumWrapper instanceof PhotoAlbumWrapper.SpecialPhotoAlbum)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                PhotoAlbumWrapper.SpecialPhotoAlbum specialPhotoAlbum = (PhotoAlbumWrapper.SpecialPhotoAlbum) photoAlbumWrapper;
                                List<Photo> list6 = list5;
                                boolean z18 = list6 instanceof Collection;
                                if (!z18 || !list6.isEmpty()) {
                                    Iterator it9 = list6.iterator();
                                    while (it9.hasNext()) {
                                        if (((Photo) it9.next()).d == -6) {
                                            z = true;
                                            break;
                                        }
                                    }
                                }
                                z = false;
                                if (!z18 || !list6.isEmpty()) {
                                    Iterator it10 = list6.iterator();
                                    while (it10.hasNext()) {
                                        if (((Photo) it10.next()).d != -183) {
                                            z2 = true;
                                            break;
                                        }
                                    }
                                }
                                z2 = false;
                                boolean z19 = list5.size() == 1;
                                if (!z19 && z) {
                                    tlo0.a aVar6 = tlo0.Companion;
                                    Object[] objArr = {specialPhotoAlbum.f};
                                    aVar6.getClass();
                                    r3 = tlo0.a.c(R.string.photo_flow_confirm_move_from_system_to_photo_flow, objArr);
                                } else if (!z19 && z2) {
                                    tlo0.a aVar7 = tlo0.Companion;
                                    Object[] objArr2 = {specialPhotoAlbum.f};
                                    aVar7.getClass();
                                    r3 = tlo0.a.c(R.string.photo_flow_confirm_move_from_other_album_to_photo_flow, objArr2);
                                }
                                if (z16 || r3 == 0) {
                                    b0(specialPhotoAlbum.e, list5, new zf1(i6, this, fVar3), new wn7(10, fVar3, this));
                                    return;
                                } else {
                                    f4zVar.b(new b9a0.c.C2599c(new p5(i5, this, fVar3), tq.h(tlo0.Companion, R.string.photo_flow_confirm_move_photos_title), r3));
                                    return;
                                }
                            }
                            PhotoAlbumWrapper.CommonPhotoAlbum commonPhotoAlbum = (PhotoAlbumWrapper.CommonPhotoAlbum) photoAlbumWrapper;
                            List<Photo> list7 = list5;
                            boolean z20 = list7 instanceof Collection;
                            if (!z20 || !list7.isEmpty()) {
                                Iterator it11 = list7.iterator();
                                while (it11.hasNext()) {
                                    if (((Photo) it11.next()).d == -6) {
                                        z3 = true;
                                        break;
                                    }
                                }
                            }
                            z3 = false;
                            if (!z20 || !list7.isEmpty()) {
                                Iterator it12 = list7.iterator();
                                while (it12.hasNext()) {
                                    if (((Photo) it12.next()).d != -183) {
                                        z4 = true;
                                        break;
                                    }
                                }
                            }
                            z4 = false;
                            boolean z21 = list5.size() == 1;
                            if (z21) {
                                PhotoAlbum photoAlbum = commonPhotoAlbum.e;
                                if (!photoAlbum.x && !photoAlbum.w) {
                                    r3 = tq.h(tlo0.Companion, R.string.photo_flow_confirm_move_photo_to_private_album);
                                    if (!z16 || r3 == 0) {
                                        b0(commonPhotoAlbum.b, list5, new q7a0(0, this, fVar3), new ejh(fVar3, commonPhotoAlbum, this, i9));
                                        return;
                                    }
                                    if (z21) {
                                        i11 = R.string.photo_flow_confirm_move_photo_title;
                                    }
                                    f4zVar.b(new b9a0.c.C2599c(new com.vk.movika.sdk.base.presenter.c(21, this, fVar3), tq.h(tlo0.Companion, i11), r3));
                                    return;
                                }
                            }
                            PhotoAlbum photoAlbum2 = commonPhotoAlbum.e;
                            String str3 = commonPhotoAlbum.d;
                            boolean z22 = photoAlbum2.x;
                            if (!z22 && !photoAlbum2.w) {
                                r3 = tq.h(tlo0.Companion, R.string.photo_flow_confirm_move_to_private_album);
                            } else if (z21 && z22 && photoAlbum2.w) {
                                r3 = tq.h(tlo0.Companion, R.string.photo_flow_confirm_move_photo_to_disabled_album);
                            } else if (z22 && photoAlbum2.w) {
                                r3 = tq.h(tlo0.Companion, R.string.photo_flow_confirm_move_photos_to_disabled_album);
                            } else if (!z22 && photoAlbum2.w) {
                                r3 = tq.h(tlo0.Companion, R.string.photo_flow_confirm_move_to_disabled_album);
                            } else if (z3) {
                                tlo0.Companion.getClass();
                                r3 = tlo0.a.c(R.string.photo_flow_confirm_move_from_system, str3);
                            } else if (z21 && z4) {
                                tlo0.Companion.getClass();
                                r3 = tlo0.a.c(R.string.photo_flow_confirm_move_photo_from_other_album, str3);
                            } else if (z4) {
                                tlo0.Companion.getClass();
                                r3 = tlo0.a.c(R.string.photo_flow_confirm_move_from_other_album, str3);
                            }
                            if (z16) {
                            }
                            b0(commonPhotoAlbum.b, list5, new q7a0(0, this, fVar3), new ejh(fVar3, commonPhotoAlbum, this, i9));
                            return;
                        }
                        h7o0 h7o0Var = ((a.v) aVar2).b;
                        int i12 = h7o0Var.a;
                        Integer num = hVar2.j;
                        if (num != null && i12 == num.intValue()) {
                            if (h7o0Var instanceof paq0) {
                                Parcelable parcelable = ((paq0) h7o0Var).b;
                                PhotoUploadInteractor.UploadTaskExtraParams uploadTaskExtraParams = r3;
                                if (parcelable instanceof PhotoUploadInteractor.UploadTaskExtraParams) {
                                    uploadTaskExtraParams = (PhotoUploadInteractor.UploadTaskExtraParams) parcelable;
                                }
                                if (uploadTaskExtraParams != null) {
                                    List<String> list8 = uploadTaskExtraParams.b;
                                    bVar = this;
                                    f4zVar.b(new b9a0.k(new j7k0(null, valueOf3, Integer.valueOf(R.attr.vk_ui_icon_positive), null, null, new tjc(tq.h(tlo0.Companion, list8.size() == 1 ? R.string.photo_flow_one_photo_uploaded_2 : R.string.photo_flow_several_photo_uploaded_2), new tlo0.f(R.string.photo_flow_post_to_story), new a.m(list8)), 25)));
                                } else {
                                    bVar = this;
                                }
                            } else {
                                bVar = this;
                                if (h7o0Var instanceof abq0) {
                                    bVar.Z();
                                }
                            }
                            bVar.T(d.o.b);
                            return;
                        }
                    }
                }
                return;
            }
            a.s.e eVar2 = (a.s.e) aVar2;
            y7a0 y7a0Var2 = eVar2.b;
            int i13 = eVar2.c;
            if (!z7) {
                cVar.b.g.d(y7a0Var2.a);
                Photo photo6 = y7a0Var2.a;
                r1.getClass();
                ListBuilder e3 = e43.e();
                if (!photo6.Ib()) {
                    e3.add(dVar);
                }
                if (photo6.d != -183) {
                    e3.add(fVar);
                }
                if (photo6.d != -6 && z6) {
                    e3.add(c2713b);
                }
                e3.add(hVar3);
                if (epx.f(photo6.O, Boolean.TRUE)) {
                    e3.add(iVar);
                } else {
                    e3.add(gVar);
                }
                if (photo6.d != -6) {
                    e3.add(aVar4);
                }
                e3.add(eVar);
                e3.add(cVar2);
                r1.g.invoke(new b9a0.c.e(photo6, i13, e3.g()));
            }
        }
    }

    public final void U() {
        c.b bVar = this.f.b;
        this.e.b(bVar.c.g(bVar.a).subscribe(new ow40(new mgz(this, 19), 7), new tl30(new C1506b(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 11)));
    }

    public final void V(Photo photo) {
        c.b bVar = this.f.b;
        this.e.b(bVar.c.b(photo, bVar.a).o(asu0.a.d()).subscribe(new fo1(this, 7), new m5y(new com.vk.libvideo.b(26, this, photo), 14)));
    }

    public final void W(List<? extends Photo> list) {
        c.b bVar = this.f.b;
        this.e.b(bVar.c.a(bVar.a, list).m(asu0.a.d()).subscribe(new g600(new g22(23, list, this), 10), new lkz(new eaa(26, this, list), 10)));
    }

    public final void X() {
        this.f.b.e.a(new m7a0.f(true));
        T(d.b.b);
    }

    public final wj50<b9a0> Y() {
        return this.h;
    }

    public final void Z() {
        this.h.b(new b9a0.k(new j7k0(tq.h(tlo0.Companion, R.string.photo_flow_photos_upload_error), Integer.valueOf(R.drawable.vk_icon_warning_triangle_outline_28), Integer.valueOf(R.attr.vk_ui_accent_orange), null, null, null, 32)));
    }

    public final void b0(int i, List list, izs izsVar, wzs wzsVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Photo) obj).d != -6) {
                arrayList.add(obj);
            }
        }
        c.b bVar = this.f.b;
        x c2 = bVar.c.c(arrayList, i, bVar.a);
        l2e l2eVar = new l2e(wzsVar, arrayList, this, 5);
        int i2 = 5;
        this.e.b(c2.subscribe(new p350(l2eVar, i2), new r7a0(new uy7(izsVar, i2), 0)));
    }

    public final void c0(int i, int i2) {
        io.reactivex.rxjava3.disposables.c cVar = this.j;
        if (cVar != null) {
            cVar.dispose();
        }
        com.vk.photos.root.photoflow.presentation.c cVar2 = this.f;
        io.reactivex.rxjava3.disposables.c subscribe = cVar2.d.c.c(i, i2, cVar2.b.a, false).subscribe(new amt(new cqv(this, 28), 20), new cx00(new c(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 11));
        this.e.b(subscribe);
        this.j = subscribe;
    }

    public final void d0() {
        this.h.b(new b9a0.k(new j7k0(hq.b(tlo0.Companion, R.plurals.download_photos_success, 1), Integer.valueOf(R.drawable.vk_icon_warning_triangle_outline_28), Integer.valueOf(R.attr.vk_ui_accent_orange), null, null, null, 32)));
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        super.onDestroy();
        this.f.c.a.w().g(this.i);
    }
}
