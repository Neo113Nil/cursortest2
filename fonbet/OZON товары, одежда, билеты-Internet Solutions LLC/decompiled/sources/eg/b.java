package eg;

import androidx.annotation.NonNull;
import org.maplibre.android.maps.MapLibreMap;
import org.maplibre.android.maps.MapView;
import org.maplibre.android.maps.Style;

/* loaded from: classes10.dex */
final class b implements MapView.OnDidFinishLoadingStyleListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MapLibreMap f62242a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f62243b;

    final class a implements Style.OnStyleLoaded {
        a() {
        }

        @Override // org.maplibre.android.maps.Style.OnStyleLoaded
        public final void a(@NonNull Style style) {
            b bVar = b.this;
            bVar.f62243b.f62257m = style;
            bVar.f62243b.q();
        }
    }

    b(c cVar, MapLibreMap mapLibreMap) {
        this.f62243b = cVar;
        this.f62242a = mapLibreMap;
    }

    @Override // org.maplibre.android.maps.MapView.OnDidFinishLoadingStyleListener
    public final void j() {
        this.f62242a.v(new a());
    }
}
