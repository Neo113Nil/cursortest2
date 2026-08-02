package com.vk.movika.sdk.android.defaultplayer.interactive;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.movika.sdk.android.defaultplayer.container.g;
import com.vk.movika.sdk.android.defaultplayer.container.h;
import com.vk.movika.sdk.android.defaultplayer.control.k;
import com.vk.movika.sdk.android.defaultplayer.control.p;
import com.vk.movika.sdk.android.defaultplayer.control.s;
import com.vk.movika.sdk.android.defaultplayer.control.u;
import com.vk.movika.sdk.base.model.f;
import com.vk.movika.sdk.base.model.j;
import com.vk.movika.sdk.base.model.m;
import com.vk.movika.sdk.base.ui.d;
import com.vk.movika.sdk.base.ui.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import xsna.bpn0;
import xsna.c5g;
import xsna.drm0;
import xsna.e43;
import xsna.epx;
import xsna.go9;
import xsna.gzs;
import xsna.j5g;

/* loaded from: classes3.dex */
public class d implements com.vk.movika.sdk.base.ui.d {
    public static final a Companion = new a();
    public final b b;
    public final FrameLayout c;
    public final s d;
    public boolean e;
    public final ArrayList<com.vk.movika.sdk.android.defaultplayer.container.c> f;
    public final ArrayList g;
    public gzs<Long> h;
    public long i;
    public d.b j;

    public static final class a {
    }

    public static final class b {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;

        public b(int i) {
            boolean z = (i & 4) == 0;
            boolean z2 = (i & 8) == 0;
            boolean z3 = (i & 16) == 0;
            boolean z4 = (i & 32) == 0;
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
        }
    }

    public final class c {
        public final f a;
        public final g b;

        public c(f fVar, g gVar) {
            this.a = fVar;
            this.b = gVar;
        }
    }

    public d(Context context, b bVar) {
        this.b = bVar;
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.c = frameLayout2;
        s sVar = new s(context);
        this.d = sVar;
        new bpn0(new com.vk.movika.sdk.android.defaultplayer.interactive.a(this, 0));
        this.f = e43.a(new com.vk.movika.sdk.android.defaultplayer.container.c(new h(context, bVar.a, bVar.d, null, null, null, 112)));
        this.g = new ArrayList();
        this.h = new com.vk.movika.sdk.android.defaultplayer.interactive.b(0);
        this.i = Long.MAX_VALUE;
        frameLayout.addView(frameLayout2, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(sVar, new ViewGroup.LayoutParams(-1, -1));
        this.j = new d.b(frameLayout, true);
    }

    public final void a(f fVar, boolean z) {
        Object obj;
        ArrayList arrayList = this.g;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (epx.f(((c) obj).a, fVar)) {
                    break;
                }
            }
        }
        c cVar = (c) obj;
        if (cVar == null) {
            return;
        }
        arrayList.remove(cVar);
        g gVar = cVar.b;
        if (gVar.g) {
            return;
        }
        gVar.d.post(new com.vk.movika.sdk.android.defaultplayer.container.d(0, new com.vk.movika.sdk.android.defaultplayer.container.f(gVar, z)));
    }

    @Override // com.vk.movika.sdk.common.c
    public final void destroy() {
        Iterator it = j5g.O0(this.g).iterator();
        while (it.hasNext()) {
            g gVar = ((c) it.next()).b;
            gVar.d.post(new com.vk.movika.sdk.android.defaultplayer.container.d(0, new com.vk.movika.sdk.android.defaultplayer.container.f(gVar, false)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x02b2, code lost:
    
        if (r6 != null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02b5, code lost:
    
        r6.d.post(new com.vk.movika.sdk.android.defaultplayer.container.d(0, new com.vk.movika.sdk.android.defaultplayer.container.e(0, r6, r18.c)));
        r7.add(new com.vk.movika.sdk.android.defaultplayer.interactive.d.c(r9, r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02d2, code lost:
    
        if (r2.c == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02d4, code lost:
    
        r1 = r6.n.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02de, code lost:
    
        if (r1.hasNext() == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02e0, code lost:
    
        ((com.vk.movika.sdk.android.defaultplayer.control.a) r1.next()).t0(r18.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02ec, code lost:
    
        if (r3 != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02ef, code lost:
    
        r1 = r7.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02f7, code lost:
    
        if (r1.hasNext() == false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02f9, code lost:
    
        r2 = ((com.vk.movika.sdk.android.defaultplayer.container.b) ((com.vk.movika.sdk.android.defaultplayer.interactive.d.c) r1.next()).b).n.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x030d, code lost:
    
        if (r2.hasNext() == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x030f, code lost:
    
        ((com.vk.movika.sdk.android.defaultplayer.control.a) r2.next()).z0(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:?, code lost:
    
        return;
     */
    @Override // com.vk.movika.sdk.base.ui.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(d.a aVar) {
        com.vk.movika.sdk.android.defaultplayer.container.b bVar;
        b bVar2 = this.b;
        boolean z = bVar2.d;
        boolean z2 = aVar instanceof d.a.C1313a;
        com.vk.movika.sdk.android.defaultplayer.container.b bVar3 = null;
        ArrayList arrayList = this.g;
        if (z2) {
            boolean z3 = ((d.a.C1313a) aVar).a;
            if (!bVar2.b || z3 == this.e) {
                return;
            }
            this.e = z3;
            List O0 = j5g.O0(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : O0) {
                j b2 = m.b(((c) obj).a);
                if ((b2 != null ? b2.b : null) instanceof com.vk.movika.sdk.base.model.actions.c) {
                    arrayList2.add(obj);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((com.vk.movika.sdk.android.defaultplayer.container.b) ((c) it.next()).b).n.iterator();
                while (it2.hasNext()) {
                    com.vk.movika.sdk.android.defaultplayer.control.a aVar2 = (com.vk.movika.sdk.android.defaultplayer.control.a) it2.next();
                    if (aVar2 instanceof k) {
                        if (z3) {
                            k kVar = (k) aVar2;
                            if (!(kVar.b instanceof u)) {
                                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.8f);
                                alphaAnimation.setDuration(667L);
                                alphaAnimation.setRepeatMode(2);
                                alphaAnimation.setRepeatCount(-1);
                                kVar.b.startAnimation(alphaAnimation);
                            }
                        } else {
                            p pVar = ((k) aVar2).b;
                            if (!(pVar instanceof u)) {
                                pVar.clearAnimation();
                            }
                        }
                    }
                    View u0 = aVar2.u0();
                    if (u0 != null) {
                        if (z3) {
                            u0.setVisibility(0);
                            AlphaAnimation alphaAnimation2 = new AlphaAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.25f);
                            alphaAnimation2.setDuration(667L);
                            alphaAnimation2.setRepeatMode(2);
                            alphaAnimation2.setRepeatCount(-1);
                            u0.startAnimation(alphaAnimation2);
                        } else {
                            u0.clearAnimation();
                            u0.setVisibility(8);
                        }
                    }
                }
            }
            return;
        }
        if (aVar instanceof d.a.b) {
            long j = ((d.a.b) aVar).a;
            if (z) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    Iterator it4 = ((com.vk.movika.sdk.android.defaultplayer.container.b) ((c) it3.next()).b).n.iterator();
                    while (it4.hasNext()) {
                        ((com.vk.movika.sdk.android.defaultplayer.control.a) it4.next()).z0(j);
                    }
                }
                return;
            }
            return;
        }
        if (aVar instanceof d.a.c) {
            long j2 = ((d.a.c) aVar).a;
            Iterator it5 = j5g.O0(arrayList).iterator();
            while (it5.hasNext()) {
                com.vk.movika.sdk.android.defaultplayer.container.b bVar4 = (com.vk.movika.sdk.android.defaultplayer.container.b) ((c) it5.next()).b;
                bVar4.h = true;
                Iterator it6 = bVar4.n.iterator();
                while (it6.hasNext()) {
                    com.vk.movika.sdk.android.defaultplayer.control.a aVar3 = (com.vk.movika.sdk.android.defaultplayer.control.a) it6.next();
                    aVar3.x0(true);
                    aVar3.z0(j2);
                }
            }
            return;
        }
        if (aVar instanceof d.a.C1314d) {
            long j3 = ((d.a.C1314d) aVar).a;
            Iterator it7 = j5g.O0(arrayList).iterator();
            while (it7.hasNext()) {
                com.vk.movika.sdk.android.defaultplayer.container.b bVar5 = (com.vk.movika.sdk.android.defaultplayer.container.b) ((c) it7.next()).b;
                bVar5.h = false;
                Iterator it8 = bVar5.n.iterator();
                while (it8.hasNext()) {
                    com.vk.movika.sdk.android.defaultplayer.control.a aVar4 = (com.vk.movika.sdk.android.defaultplayer.control.a) it8.next();
                    aVar4.x0(false);
                    aVar4.z0(j3);
                }
            }
            return;
        }
        if (aVar instanceof d.a.e) {
            Iterator it9 = j5g.O0(arrayList).iterator();
            while (it9.hasNext()) {
                g gVar = ((c) it9.next()).b;
                long longValue = this.h.invoke().longValue();
                Iterator it10 = ((com.vk.movika.sdk.android.defaultplayer.container.b) gVar).n.iterator();
                while (it10.hasNext()) {
                    ((com.vk.movika.sdk.android.defaultplayer.control.a) it10.next()).v0(longValue);
                }
            }
            return;
        }
        if (aVar instanceof d.a.f) {
            List<f> list = ((d.a.f) aVar).a;
            ArrayList arrayList3 = new ArrayList(c5g.u(list, 10));
            Iterator<T> it11 = list.iterator();
            while (it11.hasNext()) {
                arrayList3.add(((f) it11.next()).a);
            }
            Iterator it12 = j5g.O0(arrayList).iterator();
            while (it12.hasNext()) {
                f fVar = ((c) it12.next()).a;
                a(fVar, arrayList3.contains(fVar.a));
            }
            return;
        }
        if (aVar instanceof d.a.g) {
            d.a.g gVar2 = (d.a.g) aVar;
            a(gVar2.a, gVar2.b);
            return;
        }
        if (!(aVar instanceof d.a.h)) {
            if (!(aVar instanceof d.a.i)) {
                throw new NoWhenBranchMatchedException();
            }
            boolean z4 = ((d.a.i) aVar).a;
            d.b bVar6 = this.j;
            boolean z5 = bVar6.a;
            this.j = new d.b(bVar6.b, z4);
            return;
        }
        d.a.h hVar = (d.a.h) aVar;
        f fVar2 = hVar.a;
        long j4 = hVar.b;
        i iVar = hVar.c;
        com.vk.movika.sdk.base.interactive.a aVar5 = hVar.e;
        this.h = iVar;
        if (this.i == Long.MAX_VALUE) {
            this.i = ((Number) iVar.invoke()).longValue();
        }
        Iterator it13 = j5g.O0(this.f).iterator();
        while (true) {
            if (!it13.hasNext()) {
                break;
            }
            h hVar2 = ((com.vk.movika.sdk.android.defaultplayer.container.c) it13.next()).a;
            if (drm0.p0(fVar2.f).toString().toLowerCase(Locale.US).equals(drm0.p0("Choice").toString().toLowerCase(Locale.ROOT))) {
                bVar = new com.vk.movika.sdk.android.defaultplayer.container.b(fVar2, aVar5, hVar2.c, hVar2.d, hVar2.b, hVar2.a, null, hVar2.f);
            } else {
                if (!hVar2.e) {
                    throw new IllegalArgumentException(go9.b("Unsupported container type ", fVar2.f));
                }
                bVar = null;
            }
            if (bVar != null) {
                bVar3 = bVar;
                break;
            }
        }
    }

    @Override // com.vk.movika.sdk.base.ui.d
    public final void p() {
        boolean z;
        Object obj;
        g gVar;
        Object obj2;
        ArrayList arrayList = this.g;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                g gVar2 = ((c) it.next()).b;
                gVar2.getClass();
                ArrayList arrayList2 = ((com.vk.movika.sdk.android.defaultplayer.container.b) gVar2).n;
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (((com.vk.movika.sdk.android.defaultplayer.control.a) next).r0()) {
                        arrayList3.add(next);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        if (((com.vk.movika.sdk.android.defaultplayer.control.a) it3.next()).s0()) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (z) {
                    return;
                }
            }
        }
        Iterator it4 = arrayList.iterator();
        while (true) {
            if (!it4.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it4.next();
                if (com.vk.movika.sdk.base.utils.d.c(((c) obj).a)) {
                    break;
                }
            }
        }
        c cVar = (c) obj;
        if (cVar == null || (gVar = cVar.b) == null) {
            return;
        }
        gVar.getClass();
        ArrayList arrayList4 = ((com.vk.movika.sdk.android.defaultplayer.container.b) gVar).n;
        if (!arrayList4.isEmpty() && gVar.a) {
            ArrayList arrayList5 = new ArrayList();
            Iterator it5 = arrayList4.iterator();
            while (it5.hasNext()) {
                Object next2 = it5.next();
                if (((com.vk.movika.sdk.android.defaultplayer.control.a) next2).r0()) {
                    arrayList5.add(next2);
                }
            }
            if (!arrayList5.isEmpty()) {
                Iterator it6 = arrayList5.iterator();
                while (it6.hasNext()) {
                    if (((com.vk.movika.sdk.android.defaultplayer.control.a) it6.next()).s0()) {
                        return;
                    }
                }
            }
            Iterator it7 = arrayList4.iterator();
            while (true) {
                if (!it7.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it7.next();
                    if (((com.vk.movika.sdk.android.defaultplayer.control.a) obj2).r0()) {
                        break;
                    }
                }
            }
            com.vk.movika.sdk.android.defaultplayer.control.a aVar = (com.vk.movika.sdk.android.defaultplayer.control.a) obj2;
            if (aVar != null) {
                aVar.q0();
            }
        }
    }
}
