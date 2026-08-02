package eg;

import Le0.w;
import androidx.annotation.NonNull;
import fg.C6561a;
import java.util.HashMap;
import org.maplibre.android.maps.MapLibreMap;
import org.maplibre.android.maps.Style;
import org.maplibre.android.style.layers.FillLayer;

/* loaded from: classes10.dex */
public final class h extends c<FillLayer, f, i, Object, Object, Object> {
    public h(@NonNull w wVar, @NonNull MapLibreMap mapLibreMap, @NonNull Style style) {
        super(wVar, mapLibreMap, style, new g(), e.b(wVar, mapLibreMap), null, null);
    }

    @Override // eg.c
    final void p() {
        Boolean bool = Boolean.FALSE;
        HashMap hashMap = this.f62248d;
        hashMap.put("fill-opacity", bool);
        hashMap.put("fill-color", bool);
        hashMap.put("fill-outline-color", bool);
        hashMap.put("fill-pattern", bool);
    }

    @Override // eg.c
    protected final void t(@NonNull String str) {
        switch (str) {
            case "fill-color":
                ((FillLayer) this.f62254j).i(new org.maplibre.android.style.layers.b("fill-color", C6561a.b("fill-color")));
                break;
            case "fill-opacity":
                ((FillLayer) this.f62254j).i(new org.maplibre.android.style.layers.b("fill-opacity", C6561a.b("fill-opacity")));
                break;
            case "fill-pattern":
                ((FillLayer) this.f62254j).i(new org.maplibre.android.style.layers.b("fill-pattern", C6561a.b("fill-pattern")));
                break;
            case "fill-outline-color":
                ((FillLayer) this.f62254j).i(new org.maplibre.android.style.layers.b("fill-outline-color", C6561a.b("fill-outline-color")));
                break;
        }
    }
}
