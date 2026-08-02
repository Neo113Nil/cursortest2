package com.vk.music.informer.mvi;

import com.vk.api.generated.artist.dto.ArtistArtistPromoDto;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.music.informer.mvi.e;
import com.vk.music.informer.mvi.g;
import com.vk.music.informer.mvi.h;
import com.vk.music.player.PlayState;
import com.vk.music.player.e;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioArtistClickItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioArtistViewItem;
import com.vk.stat.scheme.CommonStat$TypeTrackCodeItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeView;
import defpackage.q0;
import io.reactivex.rxjava3.internal.operators.observable.z0;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.bjc;
import xsna.bvt0;
import xsna.bzw;
import xsna.c2u;
import xsna.c550;
import xsna.d550;
import xsna.epx;
import xsna.es00;
import xsna.f4z;
import xsna.iou;
import xsna.k840;
import xsna.l8w;
import xsna.lt3;
import xsna.nx40;
import xsna.ny40;
import xsna.oel0;
import xsna.qoy;
import xsna.qww;
import xsna.sq3;
import xsna.u2b0;
import xsna.wk50;
import xsna.x2y;

/* compiled from: MusicPlayerInformerFeature.kt */
/* loaded from: classes3.dex */
public final class d extends wk50<MusicPlayerInformerViewState, nx40, com.vk.music.informer.mvi.e, h> {
    public final c550 f;
    public final qww g;
    public final ny40 h;
    public final u2b0 i;
    public final f4z j;
    public final c k;
    public final a l;
    public final io.reactivex.rxjava3.disposables.g m;
    public boolean n;
    public boolean o;
    public final sq3 p;
    public final e q;
    public final C1325d r;

    /* compiled from: MusicPlayerInformerFeature.kt */
    public static final class a {
        public final c2u a;
        public boolean b;

        public a(c2u c2uVar) {
            this.a = c2uVar;
        }
    }

    /* compiled from: MusicPlayerInformerFeature.kt */
    public static final class b {
        public final lt3 a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        public b() {
            this(0);
        }

        public static b a(b bVar, lt3 lt3Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
            if ((i & 1) != 0) {
                lt3Var = bVar.a;
            }
            lt3 lt3Var2 = lt3Var;
            if ((i & 2) != 0) {
                z = bVar.b;
            }
            boolean z6 = z;
            if ((i & 4) != 0) {
                z2 = bVar.c;
            }
            boolean z7 = z2;
            if ((i & 8) != 0) {
                z3 = bVar.d;
            }
            boolean z8 = z3;
            if ((i & 16) != 0) {
                z4 = bVar.e;
            }
            boolean z9 = z4;
            if ((i & 32) != 0) {
                z5 = bVar.f;
            }
            bVar.getClass();
            return new b(lt3Var2, z6, z7, z8, z9, z5);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f;
        }

        public final int hashCode() {
            lt3 lt3Var = this.a;
            return Boolean.hashCode(this.f) + qoy.b(qoy.b(qoy.b(qoy.b((lt3Var == null ? 0 : lt3Var.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InformerContext(artists=");
            sb.append(this.a);
            sb.append(", shouldShowInformer=");
            sb.append(this.b);
            sb.append(", isMusicScreen=");
            sb.append(this.c);
            sb.append(", isStickyBannerVisible=");
            sb.append(this.d);
            sb.append(", isCollapsed=");
            sb.append(this.e);
            sb.append(", isSupportsHidingInformerOpen=");
            return q0.a(sb, this.f, ')');
        }

        public /* synthetic */ b(int i) {
            this(null, false, false, false, false, false);
        }

        public b(lt3 lt3Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.a = lt3Var;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.e = z4;
            this.f = z5;
        }
    }

    /* compiled from: MusicPlayerInformerFeature.kt */
    public static final class c {
        public final bzw a;
        public b b = new b(0);

        public c(bzw bzwVar) {
            this.a = bzwVar;
        }
    }

    /* compiled from: MusicPlayerInformerFeature.kt */
    /* renamed from: com.vk.music.informer.mvi.d$d, reason: collision with other inner class name */
    public static final class C1325d implements d550 {
        public C1325d() {
        }

        @Override // xsna.d550
        public final void a() {
            h.f fVar = new h.f(true);
            d dVar = d.this;
            dVar.T(fVar);
            c cVar = dVar.k;
            b a = b.a(cVar.b, null, false, false, false, false, true, 31);
            cVar.b = a;
            lt3 lt3Var = a.a;
            if (lt3Var != null && a.b && a.c && !a.d && a.e && !a.f) {
                cVar.a.invoke(lt3Var);
            }
        }

        @Override // xsna.d550
        public final void b(boolean z) {
            d dVar = d.this;
            c cVar = dVar.k;
            b a = b.a(cVar.b, null, false, z, false, false, false, 59);
            cVar.b = a;
            lt3 lt3Var = a.a;
            if (lt3Var != null && a.b && a.c && !a.d && a.e && !a.f) {
                cVar.a.invoke(lt3Var);
            }
            dVar.T(new h.d(z));
        }

        @Override // xsna.d550
        public final void c() {
            h.f fVar = new h.f(false);
            d dVar = d.this;
            dVar.T(fVar);
            c cVar = dVar.k;
            b a = b.a(cVar.b, null, false, false, false, false, false, 31);
            cVar.b = a;
            lt3 lt3Var = a.a;
            if (lt3Var != null && a.b && a.c && !a.d && a.e && !a.f) {
                cVar.a.invoke(lt3Var);
            }
        }
    }

    /* compiled from: MusicPlayerInformerFeature.kt */
    public static final class e extends e.a {
        public e() {
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void N3(PlayState playState, com.vk.music.player.f fVar) {
            d.this.p.a(fVar);
        }
    }

    public d(com.vk.music.informer.mvi.e eVar, j jVar, oel0 oel0Var, c550 c550Var, qww qwwVar, ny40 ny40Var) {
        super(eVar, jVar);
        this.f = c550Var;
        this.g = qwwVar;
        this.h = ny40Var;
        u2b0 b2 = k840.a.g().b();
        this.i = b2;
        this.j = new f4z();
        this.k = new c(new bzw(this, 9));
        this.l = new a(new c2u(this, 21));
        this.m = new io.reactivex.rxjava3.disposables.g();
        this.p = new sq3(b2, new x2y(this, 18), new es00(this, 6));
        e eVar2 = new e();
        this.q = eVar2;
        C1325d c1325d = new C1325d();
        this.r = c1325d;
        c550Var.c(c1325d);
        b2.P0(eVar2, true);
        io.reactivex.rxjava3.disposables.b bVar = this.e;
        io.reactivex.rxjava3.subjects.d<Boolean> dVar = oel0Var.a;
        dVar.getClass();
        bVar.b(new z0(dVar).subscribe(new l8w(new iou(this, 19), 8)));
    }

    public static void U(String str) {
        String valueOf = String.valueOf(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()));
        UiTracker uiTracker = UiTracker.a;
        new bvt0(UiTracker.c(), SchemeStat$TypeView.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.EVENT, null, null, null, null, null, 62, null), valueOf, valueOf, null, new CommonAudioStat$TypeAudioArtistViewItem(new CommonStat$TypeTrackCodeItem(str), CommonAudioStat$TypeAudioArtistViewItem.RefSource.CONCERT_PLAYER_INFORMER), 8)).q();
    }

    @Override // xsna.wk50
    public final void N(nx40 nx40Var, com.vk.music.informer.mvi.e eVar) {
        String r;
        String r2;
        com.vk.music.informer.mvi.e eVar2 = eVar;
        ArtistArtistPromoDto artistArtistPromoDto = nx40Var.b;
        String str = "";
        if (eVar2 instanceof e.c) {
            if (artistArtistPromoDto != null && (r2 = artistArtistPromoDto.r()) != null) {
                str = r2;
            }
            UiTracker uiTracker = UiTracker.a;
            new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new CommonAudioStat$TypeAudioArtistClickItem(new CommonStat$TypeTrackCodeItem(str), CommonAudioStat$TypeAudioArtistClickItem.RefSource.CONCERT_PLAYER_INFORMER, CommonAudioStat$TypeAudioArtistClickItem.EventType.ITEM_CLICK), 2)).q();
            this.f.b(false);
            this.j.b(new g.a(((e.c) eVar2).b));
            return;
        }
        if (eVar2 instanceof e.a) {
            boolean z = ((e.a) eVar2).b;
            if (z && !this.o) {
                this.o = true;
                if (artistArtistPromoDto != null && (r = artistArtistPromoDto.r()) != null) {
                    str = r;
                }
                U(str);
            }
            this.n = z;
            this.g.setVisibility(z);
            return;
        }
        if (!(eVar2 instanceof e.d)) {
            if (!(eVar2 instanceof e.b)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        c cVar = this.k;
        b a2 = b.a(cVar.b, null, false, false, false, ((e.d) eVar2).b, false, 47);
        cVar.b = a2;
        lt3 lt3Var = a2.a;
        if (lt3Var != null && a2.b && a2.c && !a2.d && a2.e && !a2.f) {
            cVar.a.invoke(lt3Var);
        }
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        super.onDestroy();
        this.f.d(this.r);
        this.i.n0(this.q);
    }
}
