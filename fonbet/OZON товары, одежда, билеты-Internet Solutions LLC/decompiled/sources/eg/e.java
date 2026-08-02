package eg;

import Le0.w;
import Yf.d;
import android.annotation.SuppressLint;
import android.graphics.PointF;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import org.maplibre.android.maps.MapLibreMap;

/* loaded from: classes10.dex */
final class e {

    /* renamed from: k, reason: collision with root package name */
    private static e f62264k;

    /* renamed from: a, reason: collision with root package name */
    private w f62265a;

    /* renamed from: b, reason: collision with root package name */
    private MapLibreMap f62266b;

    /* renamed from: c, reason: collision with root package name */
    private LinkedList f62267c;

    /* renamed from: d, reason: collision with root package name */
    private HashMap<String, c> f62268d;

    /* renamed from: e, reason: collision with root package name */
    private final int f62269e;

    /* renamed from: f, reason: collision with root package name */
    private final int f62270f;

    /* renamed from: g, reason: collision with root package name */
    private final int f62271g;

    /* renamed from: h, reason: collision with root package name */
    private final int f62272h;

    /* renamed from: i, reason: collision with root package name */
    private AbstractC6362a f62273i;

    /* renamed from: j, reason: collision with root package name */
    private c f62274j;

    private class a implements d.a {
        a() {
        }

        @Override // Yf.d.a
        public final boolean a(Yf.d dVar) {
            return e.this.e(dVar);
        }

        @Override // Yf.d.a
        public final void b(Yf.d dVar) {
            e.this.f();
        }

        @Override // Yf.d.a
        public final boolean c(Yf.d dVar, float f7, float f11) {
            return e.this.d(dVar);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    e(w wVar, MapLibreMap mapLibreMap) {
        Yf.a aVar = new Yf.a(wVar.getContext(), false);
        int scrollX = wVar.getScrollX();
        int scrollY = wVar.getScrollY();
        int measuredWidth = wVar.getMeasuredWidth();
        int measuredHeight = wVar.getMeasuredHeight();
        this.f62267c = new LinkedList();
        this.f62268d = new HashMap<>();
        this.f62265a = wVar;
        this.f62266b = mapLibreMap;
        this.f62269e = scrollX;
        this.f62270f = scrollY;
        this.f62271g = measuredWidth;
        this.f62272h = measuredHeight;
        aVar.h(new a());
    }

    public static e b(w wVar, MapLibreMap mapLibreMap) {
        e eVar = f62264k;
        if (eVar == null || eVar.f62265a != wVar || eVar.f62266b != mapLibreMap) {
            f62264k = new e(wVar, mapLibreMap);
        }
        return f62264k;
    }

    final void a(c cVar) {
        String m11 = cVar.m();
        HashMap<String, c> hashMap = this.f62268d;
        LinkedList linkedList = this.f62267c;
        if (m11 != null) {
            linkedList.add(linkedList.indexOf(hashMap.get(cVar.m())) + 1, cVar);
        } else if (cVar.k() != null) {
            linkedList.add(linkedList.indexOf(hashMap.get(cVar.k())), cVar);
        } else {
            linkedList.add(0, cVar);
        }
        hashMap.put(cVar.f62254j.b(), cVar);
    }

    final void c(AbstractC6362a abstractC6362a) {
        AbstractC6362a abstractC6362a2 = this.f62273i;
        if (abstractC6362a == abstractC6362a2) {
            h(abstractC6362a2, this.f62274j);
        }
    }

    /* JADX WARN: Type inference failed for: r8v4, types: [T extends org.maplibre.geojson.Geometry, org.maplibre.geojson.Geometry] */
    final boolean d(Yf.d dVar) {
        if (this.f62273i != null && (dVar.j() > 1 || !this.f62273i.e())) {
            h(this.f62273i, this.f62274j);
            return true;
        }
        if (this.f62273i == null) {
            return false;
        }
        Yf.c v11 = dVar.v();
        float b11 = v11.b();
        float f7 = this.f62269e;
        float c11 = v11.c();
        float f11 = this.f62270f;
        PointF pointF = new PointF(b11 - f7, c11 - f11);
        float f12 = pointF.x;
        if (f12 >= 0.0f) {
            float f13 = pointF.y;
            if (f13 >= 0.0f && f12 <= this.f62271g && f13 <= this.f62272h) {
                ?? d11 = this.f62273i.d(this.f62266b.t(), v11, f7, f11);
                if (d11 == 0) {
                    return false;
                }
                this.f62273i.f62240b = d11;
                this.f62274j.v();
                Iterator it = this.f62274j.n().iterator();
                while (it.hasNext()) {
                    ((o) it.next()).c(this.f62273i);
                }
                return true;
            }
        }
        h(this.f62273i, this.f62274j);
        return true;
    }

    final boolean e(Yf.d dVar) {
        AbstractC6362a s11;
        for (c cVar : this.f62267c) {
            if (dVar.j() == 1 && (s11 = cVar.s(dVar.i())) != null && s11.e()) {
                Iterator it = cVar.n().iterator();
                while (it.hasNext()) {
                    ((o) it.next()).b(s11);
                }
                this.f62273i = s11;
                this.f62274j = cVar;
                return true;
            }
        }
        return false;
    }

    final void f() {
        h(this.f62273i, this.f62274j);
    }

    final void g(c cVar) {
        e eVar;
        LinkedList linkedList = this.f62267c;
        linkedList.remove(cVar);
        this.f62268d.remove(cVar.f62254j.b());
        if (!linkedList.isEmpty() || (eVar = f62264k) == null) {
            return;
        }
        eVar.f62265a = null;
        eVar.f62266b = null;
        f62264k = null;
    }

    final void h(AbstractC6362a abstractC6362a, c cVar) {
        if (abstractC6362a != null && cVar != null) {
            Iterator it = cVar.n().iterator();
            while (it.hasNext()) {
                ((o) it.next()).a(abstractC6362a);
            }
        }
        this.f62273i = null;
        this.f62274j = null;
    }
}
