package com.vk.movika.sdk.base.ui;

import com.vk.movika.sdk.base.model.Chapter;
import com.vk.movika.sdk.player.base.listener.PlaybackStateListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import xsna.bpn0;
import xsna.fp;
import xsna.fpf0;
import xsna.gzs;
import xsna.j5g;
import xsna.mj80;
import xsna.swe0;
import xsna.tj0;

/* loaded from: classes3.dex */
public final class v0 implements com.vk.movika.sdk.player.base.observable.a, com.vk.movika.sdk.player.base.observable.b, com.vk.movika.sdk.player.base.observable.c {
    public static final a Companion = new a();
    public final /* synthetic */ mj80 b;
    public final /* synthetic */ mj80 c;
    public final com.vk.movika.sdk.player.base.components.a d;
    public final com.vk.movika.sdk.player.base.a e;
    public final HashMap f = new HashMap();
    public final LinkedList g = new LinkedList();
    public final HashMap h = new HashMap();
    public final i0 i;

    public static final class a {
    }

    public v0(com.vk.movika.sdk.player.base.components.a aVar, j jVar) {
        this.b = aVar.a;
        this.c = aVar.c;
        this.d = aVar;
        this.e = new com.vk.movika.sdk.player.base.a(jVar);
        new bpn0(new o0(0));
        this.i = new i0(new p0(this, 0));
    }

    @Override // com.vk.movika.sdk.player.base.observable.c
    public final void c(com.vk.movika.sdk.base.flow.binding.i iVar) {
        this.c.c(iVar);
    }

    @Override // com.vk.movika.sdk.player.base.observable.a
    public final void e(PlaybackStateListener playbackStateListener) {
        this.b.e(playbackStateListener);
    }

    @Override // com.vk.movika.sdk.player.base.observable.a
    public final void f(PlaybackStateListener playbackStateListener) {
        this.b.f(playbackStateListener);
    }

    @Override // com.vk.movika.sdk.player.base.observable.b
    public final void h(com.vk.movika.sdk.player.base.listener.a aVar) {
        this.g.add(aVar);
        this.d.b.h(aVar);
    }

    @Override // com.vk.movika.sdk.player.base.observable.c
    public final void i(com.vk.movika.sdk.base.flow.binding.k kVar) {
        this.c.i(kVar);
    }

    @Override // com.vk.movika.sdk.player.base.observable.c
    public final void j(com.vk.movika.sdk.base.flow.binding.i iVar) {
        this.c.j(iVar);
    }

    @Override // com.vk.movika.sdk.player.base.observable.c
    public final void k(com.vk.movika.sdk.base.flow.binding.k kVar) {
        this.c.k(kVar);
    }

    @Override // com.vk.movika.sdk.player.base.observable.b
    public final void n(com.vk.movika.sdk.player.base.listener.a aVar) {
        this.g.remove(aVar);
        this.d.b.n(aVar);
    }

    public final long o(long j) {
        long j2;
        Long r = this.d.a.r();
        if (r != null) {
            j2 = r.longValue();
            if (j2 < 0) {
                j2 = 0;
            }
        } else {
            j2 = Long.MAX_VALUE;
        }
        long j3 = j2 - 100;
        return swe0.i(j, 0L, j3 < 0 ? 0L : j3);
    }

    public final com.vk.movika.sdk.player.base.model.a p(Chapter chapter) {
        this.h.put(chapter.a, chapter);
        try {
            return this.e.a(chapter);
        } catch (Exception unused) {
            if (com.vk.movika.sdk.utils.f.b.b - 2 > 0) {
                return null;
            }
            com.vk.movika.sdk.utils.c.a(chapter, "PlayerController");
            return null;
        }
    }

    public final void q(final long j, final Object obj, final boolean z) {
        long j2;
        final long r = r() - j;
        com.vk.movika.sdk.utils.c.b(this, "PlayerController", new gzs() { // from class: com.vk.movika.sdk.base.ui.n0
            @Override // xsna.gzs
            public final Object invoke() {
                long r2 = this.r();
                String l = fpf0.a(obj.getClass()).l();
                StringBuilder b = fp.b(j, "addTimePoint: time = ", ", unsafeCurrentTime = ");
                b.append(r2);
                tj0.d(b, ", lostTime = ", r, ", tag = ");
                b.append(l);
                b.append(", seekable = ");
                b.append(z);
                return b.toString();
            }
        });
        if (j <= r()) {
            if (com.vk.movika.sdk.utils.f.b.b - 1 <= 0) {
                com.vk.movika.sdk.utils.c.a(this, "PlayerController");
            }
            if (r < 1000) {
                if (com.vk.movika.sdk.utils.f.b.b - 1 <= 0) {
                    com.vk.movika.sdk.utils.c.a(this, "PlayerController");
                }
                Iterator it = j5g.O0(this.g).iterator();
                while (it.hasNext()) {
                    ((com.vk.movika.sdk.player.base.listener.a) it.next()).a(obj);
                }
                return;
            }
            return;
        }
        com.vk.movika.sdk.player.base.components.a aVar = this.d;
        Long r2 = aVar.a.r();
        if (r2 != null) {
            j2 = r2.longValue();
            if (j2 < 0) {
                j2 = 0;
            }
        } else {
            j2 = Long.MAX_VALUE;
        }
        long j3 = j2 - 100;
        long j4 = j3 >= 0 ? j3 : 0L;
        if (1 > j4 || j4 > j) {
            if (!z) {
                this.f.put(obj, Long.valueOf(j));
            }
            aVar.b.m(j, obj);
        } else if (com.vk.movika.sdk.utils.f.b.b - 2 <= 0) {
            com.vk.movika.sdk.utils.c.a(this, "PlayerController");
            aVar.a.r();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long r() {
        long j;
        mj80 mj80Var = this.d.a;
        long q = mj80Var.q();
        Long r = mj80Var.r();
        if (r != null) {
            if (r.longValue() <= 0) {
                r = null;
            }
            if (r != null) {
                j = r.longValue();
                long j2 = 0 > j ? j : 0L;
                if (0 > j) {
                    j = 0;
                }
                return swe0.i(q, j2, j);
            }
        }
        j = Long.MAX_VALUE;
        if (0 > j) {
        }
        if (0 > j) {
        }
        return swe0.i(q, j2, j);
    }

    public final boolean s(long j) {
        long o = o(j);
        mj80 mj80Var = this.d.a;
        o(mj80Var.q());
        Long r = mj80Var.r();
        if (r == null) {
            return false;
        }
        mj80Var.c.seekTo(swe0.i(o, 0L, r.longValue()));
        return true;
    }
}
