package eg;

import Le0.w;
import androidx.annotation.NonNull;
import fg.C6561a;
import java.util.HashMap;
import org.maplibre.android.maps.MapLibreMap;
import org.maplibre.android.maps.Style;
import org.maplibre.android.style.layers.LineLayer;

/* loaded from: classes10.dex */
public final class l extends c<LineLayer, j, m, Object, Object, Object> {
    public l(@NonNull w wVar, @NonNull MapLibreMap mapLibreMap, @NonNull Style style, String str) {
        super(wVar, mapLibreMap, style, new k(), e.b(wVar, mapLibreMap), str, null);
    }

    @Override // eg.c
    final void p() {
        Boolean bool = Boolean.FALSE;
        HashMap hashMap = this.f62248d;
        hashMap.put("line-join", bool);
        hashMap.put("line-opacity", bool);
        hashMap.put("line-color", bool);
        hashMap.put("line-width", bool);
        hashMap.put("line-gap-width", bool);
        hashMap.put("line-offset", bool);
        hashMap.put("line-blur", bool);
        hashMap.put("line-pattern", bool);
    }

    @Override // eg.c
    protected final void t(@NonNull String str) {
        switch (str) {
            case "line-blur":
                ((LineLayer) this.f62254j).i(new org.maplibre.android.style.layers.b("line-blur", C6561a.b("line-blur")));
                break;
            case "line-join":
                ((LineLayer) this.f62254j).i(new org.maplibre.android.style.layers.a("line-join", C6561a.b("line-join")));
                break;
            case "line-gap-width":
                ((LineLayer) this.f62254j).i(new org.maplibre.android.style.layers.b("line-gap-width", C6561a.b("line-gap-width")));
                break;
            case "line-color":
                ((LineLayer) this.f62254j).i(new org.maplibre.android.style.layers.b("line-color", C6561a.b("line-color")));
                break;
            case "line-width":
                ((LineLayer) this.f62254j).i(new org.maplibre.android.style.layers.b("line-width", C6561a.b("line-width")));
                break;
            case "line-opacity":
                ((LineLayer) this.f62254j).i(new org.maplibre.android.style.layers.b("line-opacity", C6561a.b("line-opacity")));
                break;
            case "line-offset":
                ((LineLayer) this.f62254j).i(new org.maplibre.android.style.layers.b("line-offset", C6561a.b("line-offset")));
                break;
            case "line-pattern":
                ((LineLayer) this.f62254j).i(new org.maplibre.android.style.layers.b("line-pattern", C6561a.b("line-pattern")));
                break;
        }
    }

    public final void w() {
        org.maplibre.android.style.layers.a aVar = new org.maplibre.android.style.layers.a("line-cap", "round");
        this.f62249e.put("line-cap", aVar);
        ((LineLayer) this.f62254j).i(aVar);
    }
}
