package com.vk.photos.root.albums.presentation;

import android.os.Bundle;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.log.L;
import com.vk.photos.root.albums.presentation.a;
import com.vk.photos.root.albums.presentation.c;
import com.vk.photos.root.photoflow.domain.AlbumsRepository;
import com.vk.toggle.anonymous.SakFeatures;
import com.vkontakte.android.R;
import defpackage.x;
import defpackage.z;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.asu0;
import xsna.b00;
import xsna.bj1;
import xsna.bw;
import xsna.c40;
import xsna.e43;
import xsna.el1;
import xsna.epx;
import xsna.f4z;
import xsna.fk1;
import xsna.hg1;
import xsna.hr;
import xsna.izs;
import xsna.j5g;
import xsna.km1;
import xsna.l00;
import xsna.lm1;
import xsna.m7a0;
import xsna.mm1;
import xsna.nda0;
import xsna.nm1;
import xsna.om1;
import xsna.on;
import xsna.p41;
import xsna.pm1;
import xsna.qfa0;
import xsna.qm1;
import xsna.rl3;
import xsna.s0e0;
import xsna.s3q0;
import xsna.sq1;
import xsna.sv;
import xsna.sz;
import xsna.tlo0;
import xsna.tq;
import xsna.vr0;
import xsna.wk50;
import xsna.ysg0;

/* compiled from: AlbumsFeature.kt */
/* loaded from: classes4.dex */
public final class b extends wk50<g, f, com.vk.photos.root.albums.presentation.a, c> {
    public static final Set<Integer> n = rl3.y0(new Integer[]{-7, -6});
    public final s0e0 f;
    public final ysg0<m7a0> g;
    public final AlbumsRepository h;
    public final bj1 i;
    public final el1 j;
    public final qfa0.j k;
    public final f4z<sq1> l;
    public final C1494b m;

    /* compiled from: AlbumsFeature.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    /* compiled from: AlbumsFeature.kt */
    /* renamed from: com.vk.photos.root.albums.presentation.b$b, reason: collision with other inner class name */
    public static final class C1494b implements bj1.a {
        public C1494b() {
        }

        @Override // xsna.bj1.a
        public final void a(PhotoAlbum photoAlbum) {
            b bVar = b.this;
            int i = 1;
            bVar.e.b(bVar.h.a(photoAlbum.b, photoAlbum.c).subscribe(new x(new nm1(0, bVar, photoAlbum), i), new z(new vr0(i), 4)));
        }

        @Override // xsna.bj1.a
        public final void b(int i, izs<? super PhotoAlbum, ? extends PhotoAlbum> izsVar) {
            b.this.T(new c.h(i, izsVar));
        }
    }

    public b(s0e0 s0e0Var, ysg0<m7a0> ysg0Var, AlbumsRepository albumsRepository, bj1 bj1Var, el1 el1Var, qfa0.j jVar, UserId userId, String str) {
        super(a.b.b, new e(el1Var, s0e0Var, userId, str));
        this.f = s0e0Var;
        this.g = ysg0Var;
        this.h = albumsRepository;
        this.i = bj1Var;
        this.j = el1Var;
        this.k = jVar;
        this.l = new f4z<>();
        this.m = new C1494b();
        ysg0<Object> ysg0Var2 = ysg0.b;
        io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0Var2.a;
        hr hrVar = new hr(1);
        fVar.getClass();
        this.e.b(new i0(fVar, hrVar).v0(500L, TimeUnit.MILLISECONDS).subscribe(new b00(this, 1), new bw(new a(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 3)));
        io.reactivex.rxjava3.subjects.f<Object> fVar2 = ysg0Var2.a;
        hg1.b bVar = new hg1.b();
        fVar2.getClass();
        this.e.b(new i0(fVar2, bVar).subscribe(new om1(new on(this, 1), 0)));
        this.e.b(ysg0Var.a.subscribe(new pm1(new l00(this, 1), 0)));
    }

    @Override // xsna.wk50
    public final void N(f fVar, com.vk.photos.root.albums.presentation.a aVar) {
        List singletonList;
        f fVar2 = fVar;
        com.vk.photos.root.albums.presentation.a aVar2 = aVar;
        List<PhotoAlbum> list = fVar2.c;
        Collection collection = fVar2.b;
        if (aVar2.equals(a.b.b)) {
            T(c.b.b);
            return;
        }
        if (aVar2 instanceof a.h) {
            a.h hVar = (a.h) aVar2;
            List<PhotoAlbum> list2 = hVar.b;
            if (hVar.c) {
                T(new c.f(list2));
                return;
            } else {
                T(new c.d(list2));
                return;
            }
        }
        boolean z = aVar2 instanceof a.i;
        f4z<sq1> f4zVar = this.l;
        if (z) {
            a.i iVar = (a.i) aVar2;
            boolean z2 = iVar.c;
            Throwable th = iVar.b;
            if (th instanceof VKApiExecutionException) {
                VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
                if (vKApiExecutionException.T() && SakFeatures.Type.NEW_GEOBLOCK_ERROR.h()) {
                    Bundle w = vKApiExecutionException.w();
                    long j = w != null ? w.getLong("owner_id") : 0L;
                    if (j != 0) {
                        f4zVar.b(new sq1.b(new UserId(j)));
                        s3q0 s3q0Var = s3q0.a;
                        return;
                    }
                    return;
                }
            }
            T(new c.C1495c(th, z2));
            return;
        }
        if (aVar2 instanceof a.g) {
            T(new c.e(((a.g) aVar2).b));
            return;
        }
        boolean z3 = aVar2 instanceof a.d;
        C1494b c1494b = this.m;
        bj1 bj1Var = this.i;
        if (z3) {
            m7a0 m7a0Var = ((a.d) aVar2).b;
            if (collection == null && list == null) {
                return;
            }
            if (collection == null) {
                collection = EmptyList.b;
            }
            bj1Var.a(j5g.u0(list != null ? list : EmptyList.b, collection), m7a0Var, c1494b);
            return;
        }
        if (aVar2 instanceof a.c) {
            nda0 nda0Var = ((a.c) aVar2).b;
            if (collection == null && list == null) {
                return;
            }
            if (collection == null) {
                collection = EmptyList.b;
            }
            bj1Var.b(j5g.u0(list != null ? list : EmptyList.b, collection), nda0Var, c1494b);
            return;
        }
        if (aVar2 instanceof a.l.b) {
            a.l.b bVar = (a.l.b) aVar2;
            PhotoAlbum photoAlbum = bVar.b;
            int i = bVar.c;
            boolean a2 = this.f.a(photoAlbum.c);
            el1 el1Var = this.j;
            if (a2) {
                ListBuilder e = e43.e();
                if (!n.contains(Integer.valueOf(photoAlbum.b))) {
                    e.add(fk1.a.d.d);
                }
                e.add(fk1.a.c.d);
                if (!el1Var.c(photoAlbum.b)) {
                    e.add(fk1.a.C2878a.d);
                }
                singletonList = e.g();
            } else {
                singletonList = Collections.singletonList(fk1.a.c.d);
            }
            f4zVar.b(new sq1.c(photoAlbum, i, el1Var.c(photoAlbum.b), singletonList));
            return;
        }
        int i2 = 0;
        if (aVar2 instanceof a.l.C1493a) {
            a.l.C1493a c1493a = (a.l.C1493a) aVar2;
            fk1.a aVar3 = c1493a.b;
            PhotoAlbum photoAlbum2 = c1493a.c;
            if (epx.f(aVar3, fk1.a.C2878a.d)) {
                f4zVar.b(new sq1.f(tq.h(tlo0.Companion, R.string.delete_album_dialog_title), new tlo0.f((photoAlbum2.w || !photoAlbum2.x) ? R.string.delete_album_dialog_description : R.string.delete_album_dialog_description_flow), new tlo0.f(R.string.album_details_delete_album_confirmation_button), new km1(i2, this, photoAlbum2)));
                return;
            }
            boolean f = epx.f(aVar3, fk1.a.b.d);
            qfa0.j jVar = this.k;
            if (f) {
                jVar.i(photoAlbum2.b);
                return;
            }
            if (epx.f(aVar3, fk1.a.c.d)) {
                jVar.j(photoAlbum2.b);
                f4zVar.b(new sq1.e(photoAlbum2));
                return;
            } else {
                if (!epx.f(aVar3, fk1.a.d.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                jVar.b(photoAlbum2.b);
                f4zVar.b(new sq1.a(photoAlbum2));
                return;
            }
        }
        boolean z4 = aVar2 instanceof a.j;
        int i3 = 2;
        io.reactivex.rxjava3.disposables.b bVar2 = this.e;
        AlbumsRepository albumsRepository = this.h;
        int i4 = 1;
        if (z4) {
            T(c.g.b.b);
            bVar2.b(albumsRepository.h(fVar2.g, true).a0(asu0.a.d()).subscribe(new p41(new qm1(this, i2), i4), new sv(new sz(this, 3), i3)));
            return;
        }
        if (aVar2 instanceof a.C1492a) {
            a.C1492a c1492a = (a.C1492a) aVar2;
            PhotoAlbum photoAlbum3 = c1492a.b;
            bVar2.b(albumsRepository.d(photoAlbum3.b, photoAlbum3.c).subscribe(new lm1(this, i2), new c40(new mm1(i2, this, c1492a), i4)));
            return;
        }
        if (aVar2.equals(a.f.b)) {
            T(new c.a(true));
            return;
        }
        if (aVar2.equals(a.e.b)) {
            if (fVar2.i) {
                f4zVar.b(sq1.d.a);
                T(new c.a(false));
                return;
            }
            return;
        }
        if (!(aVar2 instanceof a.k)) {
            throw new NoWhenBranchMatchedException();
        }
        int i5 = ((a.k) aVar2).b;
        ysg0<m7a0> ysg0Var = this.g;
        if (i5 != 0) {
            if (i5 == 1) {
                ysg0Var.a(new m7a0.f(false));
                return;
            } else if (i5 != 2) {
                return;
            }
        }
        ysg0Var.a(new m7a0.f(true));
    }

    public final f4z<sq1> U() {
        return this.l;
    }
}
