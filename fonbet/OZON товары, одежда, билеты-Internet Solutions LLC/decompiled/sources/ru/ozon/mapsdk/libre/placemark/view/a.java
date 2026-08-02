package ru.ozon.mapsdk.libre.placemark.view;

import android.graphics.PointF;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.maps.Projection;
import ru.ozon.mapsdk.libre.placemark.view.LibreMarkerGestureDetector;
import we0.m;
import we0.u;

/* loaded from: classes3.dex */
public final class a implements LibreMarkerGestureDetector.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b<View> f97590a;

    a(b<View> bVar) {
        this.f97590a = bVar;
    }

    @Override // ru.ozon.mapsdk.libre.placemark.view.LibreMarkerGestureDetector.a
    public final void a() {
        Function0<Unit> i11 = this.f97590a.i().i();
        if (i11 != null) {
            i11.invoke();
        }
    }

    @Override // ru.ozon.mapsdk.libre.placemark.view.LibreMarkerGestureDetector.a
    public final void b(float f7, float f11) {
        Projection projection;
        b<View> bVar = this.f97590a;
        projection = ((b) bVar).f97593c;
        LatLng b11 = projection.b(new PointF((bVar.j().getMeasuredWidth() * bVar.i().d().e().x) + f7, (bVar.j().getMeasuredHeight() * bVar.i().d().e().y) + f11));
        Intrinsics.checkNotNullExpressionValue(b11, "fromScreenLocation(...)");
        m mVar = new m(b11.getLatitude(), b11.getLongitude());
        Function1<m, Unit> h11 = bVar.i().h();
        if (h11 != null) {
            h11.invoke(mVar);
        }
        u a11 = u.a(bVar.i(), mVar, null, null, null, 1022);
        a11.m(bVar.i().b());
        bVar.q(a11);
    }

    @Override // ru.ozon.mapsdk.libre.placemark.view.LibreMarkerGestureDetector.a
    public final void c() {
        Function0<Unit> g10 = this.f97590a.i().g();
        if (g10 != null) {
            g10.invoke();
        }
    }

    @Override // ru.ozon.mapsdk.libre.placemark.view.LibreMarkerGestureDetector.a
    public final void d() {
        Function1 function1;
        b<View> bVar = this.f97590a;
        function1 = ((b) bVar).f97594d;
        function1.invoke(bVar.i());
    }
}
