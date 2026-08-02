package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class vkb extends tkb implements g1c {
    public final wdd o;
    public LinkedHashMap q;
    public l1c s;
    public final h0d t;
    public long p = 0;
    public final wkb r = new wkb(this);

    public vkb(wdd wddVar) {
        this.o = wddVar;
        h0d h0dVar = vjd.a;
        this.t = new h0d();
    }

    @Override // defpackage.tkb
    public final tkb B0() {
        wdd wddVar = this.o.q;
        if (wddVar != null) {
            return wddVar.c1();
        }
        return null;
    }

    @Override // defpackage.tkb
    public final long F0() {
        return this.p;
    }

    @Override // defpackage.tkb
    public final void N0() {
        b0(this.p, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null);
    }

    public void P0() {
        z0().b();
    }

    public final void S0(long j) {
        if (!r6a.b(this.p, j)) {
            this.p = j;
            wdd wddVar = this.o;
            zkb zkbVar = wddVar.o.G.q;
            if (zkbVar != null) {
                zkbVar.r0();
            }
            tkb.J0(wddVar);
        }
        if (this.k) {
            return;
        }
        r0(z0());
    }

    public final long T0(vkb vkbVar, boolean z) {
        long j = 0;
        while (!this.equals(vkbVar)) {
            if (!this.i || !z) {
                j = r6a.d(j, this.p);
            }
            wdd wddVar = this.o.q;
            wddVar.getClass();
            this = wddVar.c1();
            this.getClass();
        }
        return j;
    }

    public final void U0(l1c l1cVar) {
        LinkedHashMap linkedHashMap;
        if (l1cVar != null) {
            i0((l1cVar.getHeight() & 4294967295L) | (l1cVar.getWidth() << 32));
        } else {
            i0(0L);
        }
        if (!Intrinsics.c(this.s, l1cVar) && l1cVar != null && ((((linkedHashMap = this.q) != null && !linkedHashMap.isEmpty()) || !l1cVar.a().isEmpty()) && !Intrinsics.c(l1cVar.a(), this.q))) {
            zkb zkbVar = this.o.o.G.q;
            zkbVar.getClass();
            zkbVar.s.f();
            LinkedHashMap linkedHashMap2 = this.q;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                this.q = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(l1cVar.a());
        }
        this.s = l1cVar;
    }

    @Override // defpackage.tkb, defpackage.l9a
    public final boolean W() {
        return true;
    }

    @Override // defpackage.qhe
    public final void b0(long j, float f, Function1 function1) {
        S0(j);
        if (this.j) {
            return;
        }
        P0();
    }

    @Override // defpackage.kx4
    public final float getFontScale() {
        return this.o.getFontScale();
    }

    @Override // defpackage.l9a
    public final ema getLayoutDirection() {
        return this.o.o.z;
    }

    @Override // defpackage.qhe, defpackage.g1c
    public final Object h() {
        return this.o.h();
    }

    @Override // defpackage.kx4
    public final float j() {
        return this.o.j();
    }

    @Override // defpackage.tkb
    public final tkb t0() {
        wdd wddVar = this.o.p;
        if (wddVar != null) {
            return wddVar.c1();
        }
        return null;
    }

    @Override // defpackage.tkb
    public final dma w0() {
        return this.r;
    }

    @Override // defpackage.tkb
    public final boolean x0() {
        return this.s != null;
    }

    @Override // defpackage.tkb
    public final wma y0() {
        return this.o.o;
    }

    @Override // defpackage.tkb
    public final l1c z0() {
        l1c l1cVar = this.s;
        if (l1cVar != null) {
            return l1cVar;
        }
        throw wt3.j("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }
}
