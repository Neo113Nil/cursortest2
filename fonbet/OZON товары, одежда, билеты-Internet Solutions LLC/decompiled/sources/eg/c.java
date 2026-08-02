package eg;

import Hy.RunnableC3170a;
import Le0.w;
import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.collection.C5153w;
import eg.AbstractC6362a;
import eg.n;
import eg.o;
import eg.p;
import eg.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.maps.MapLibreMap;
import org.maplibre.android.maps.Style;
import org.maplibre.android.style.layers.Layer;
import org.maplibre.android.style.sources.GeoJsonSource;
import org.maplibre.geojson.Feature;
import org.maplibre.geojson.FeatureCollection;

/* loaded from: classes10.dex */
public abstract class c<L extends Layer, T extends AbstractC6362a, S extends r<T>, D extends o<T>, U extends n<T>, V extends p<T>> {

    /* renamed from: a, reason: collision with root package name */
    private final w f62245a;

    /* renamed from: b, reason: collision with root package name */
    protected final MapLibreMap f62246b;

    /* renamed from: i, reason: collision with root package name */
    private long f62253i;

    /* renamed from: j, reason: collision with root package name */
    protected L f62254j;

    /* renamed from: k, reason: collision with root package name */
    protected GeoJsonSource f62255k;

    /* renamed from: l, reason: collision with root package name */
    private final c<L, T, S, D, U, V>.a f62256l;

    /* renamed from: m, reason: collision with root package name */
    private Style f62257m;

    /* renamed from: n, reason: collision with root package name */
    private String f62258n;

    /* renamed from: o, reason: collision with root package name */
    private String f62259o;

    /* renamed from: p, reason: collision with root package name */
    protected d<L> f62260p;

    /* renamed from: q, reason: collision with root package name */
    private e f62261q;

    /* renamed from: c, reason: collision with root package name */
    protected final C5153w<T> f62247c = new C5153w<>();

    /* renamed from: d, reason: collision with root package name */
    final HashMap f62248d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    final HashMap f62249e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final ArrayList f62250f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList f62251g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final ArrayList f62252h = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    private AtomicBoolean f62262r = new AtomicBoolean(true);

    private class a implements MapLibreMap.OnMapClickListener, MapLibreMap.OnMapLongClickListener {
        a() {
        }

        @Override // org.maplibre.android.maps.MapLibreMap.OnMapLongClickListener
        public final boolean a(@NonNull LatLng latLng) {
            c cVar = c.this;
            if (cVar.f62252h.isEmpty() || cVar.s(cVar.f62246b.t().g(latLng)) == null) {
                return false;
            }
            Iterator it = cVar.f62252h.iterator();
            while (it.hasNext()) {
                if (((p) it.next()).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // org.maplibre.android.maps.MapLibreMap.OnMapClickListener
        public final boolean e(@NonNull LatLng latLng) {
            c cVar = c.this;
            if (cVar.f62251g.isEmpty() || cVar.s(cVar.f62246b.t().g(latLng)) == null) {
                return false;
            }
            Iterator it = cVar.f62251g.iterator();
            while (it.hasNext()) {
                if (((n) it.next()).a()) {
                    return true;
                }
            }
            return false;
        }
    }

    protected c(w wVar, MapLibreMap mapLibreMap, Style style, d dVar, e eVar, String str, String str2) {
        this.f62245a = wVar;
        this.f62246b = mapLibreMap;
        this.f62257m = style;
        this.f62258n = str;
        this.f62259o = str2;
        this.f62260p = dVar;
        this.f62261q = eVar;
        if (!style.n()) {
            throw new RuntimeException("The style has to be non-null and fully loaded.");
        }
        c<L, T, S, D, U, V>.a aVar = new a();
        this.f62256l = aVar;
        mapLibreMap.e(aVar);
        mapLibreMap.f(aVar);
        q();
        eVar.a(this);
        wVar.addOnDidFinishLoadingStyleListener(new b(this, mapLibreMap));
    }

    public static void a(c cVar) {
        cVar.f62262r.set(true);
        if (!cVar.f62257m.n()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (true) {
            C5153w<T> c5153w = cVar.f62247c;
            if (i11 >= c5153w.h()) {
                cVar.f62255k.b(FeatureCollection.fromFeatures(arrayList));
                return;
            }
            T i12 = c5153w.i(i11);
            T t2 = i12.f62240b;
            if (t2 == 0) {
                throw new IllegalStateException();
            }
            arrayList.add(Feature.fromGeometry(t2, i12.f62239a));
            i12.i();
            i11++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        d<L> dVar = this.f62260p;
        this.f62255k = dVar.e();
        this.f62254j = dVar.b();
        this.f62257m.f(this.f62255k);
        String str = this.f62259o;
        String str2 = this.f62258n;
        if (str2 != null && str != null) {
            throw new IllegalArgumentException("At most one of belowLayerId and aboveLayerId can be set, not both!");
        }
        if (str2 != null) {
            this.f62257m.e(this.f62254j, str2);
        } else if (str != null) {
            this.f62257m.d(this.f62254j, str);
        } else {
            this.f62257m.c(this.f62254j);
        }
        p();
        this.f62254j.i((org.maplibre.android.style.layers.c[]) this.f62249e.values().toArray(new org.maplibre.android.style.layers.c[0]));
        v();
    }

    public final T f(S s11) {
        T t2 = (T) s11.a(this.f62253i, this);
        this.f62247c.f(t2.b(), t2);
        this.f62253i++;
        v();
        return t2;
    }

    public final ArrayList g(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC6362a a11 = ((r) it.next()).a(this.f62253i, this);
            arrayList2.add(a11);
            this.f62247c.f(a11.b(), a11);
            this.f62253i++;
        }
        v();
        return arrayList2;
    }

    public final void h(T t2) {
        this.f62247c.g(t2.b());
        this.f62261q.c(t2);
        v();
    }

    public void i(List<T> list) {
        for (T t2 : list) {
            this.f62247c.g(t2.b());
            this.f62261q.c(t2);
        }
        v();
    }

    final void j(@NonNull String str) {
        HashMap hashMap = this.f62248d;
        if (((Boolean) hashMap.get(str)).equals(Boolean.FALSE)) {
            hashMap.put(str, Boolean.TRUE);
            t(str);
        }
    }

    public final String k() {
        return this.f62259o;
    }

    public final C5153w<T> l() {
        return this.f62247c;
    }

    public final String m() {
        return this.f62258n;
    }

    ArrayList n() {
        return this.f62250f;
    }

    public final String o() {
        return this.f62254j.b();
    }

    abstract void p();

    public final void r() {
        MapLibreMap mapLibreMap = this.f62246b;
        c<L, T, S, D, U, V>.a aVar = this.f62256l;
        mapLibreMap.S(aVar);
        mapLibreMap.T(aVar);
        this.f62261q.g(this);
        this.f62250f.clear();
        this.f62251g.clear();
        this.f62252h.clear();
    }

    final T s(@NonNull PointF pointF) {
        List<Feature> O11 = this.f62246b.O(pointF, this.f62260p.a());
        if (O11.isEmpty()) {
            return null;
        }
        return this.f62247c.b(O11.get(0).getProperty("id").getAsLong());
    }

    protected abstract void t(@NonNull String str);

    public final void u(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC6362a abstractC6362a = (AbstractC6362a) it.next();
            this.f62247c.f(abstractC6362a.b(), abstractC6362a);
        }
        v();
    }

    public final void v() {
        if (this.f62262r.compareAndSet(true, false)) {
            this.f62245a.post(new RunnableC3170a(this, 5));
        }
    }
}
