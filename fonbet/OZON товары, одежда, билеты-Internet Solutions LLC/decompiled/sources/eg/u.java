package eg;

import Le0.w;
import androidx.annotation.NonNull;
import fg.C6561a;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.util.HashMap;
import org.maplibre.android.maps.MapLibreMap;
import org.maplibre.android.maps.Style;
import org.maplibre.android.style.layers.SymbolLayer;

/* loaded from: classes10.dex */
public class u extends c<SymbolLayer, s, v, q, Object, Object> {
    u() {
        throw null;
    }

    public u(@NonNull w wVar, @NonNull MapLibreMap mapLibreMap, @NonNull Style style, String str, String str2) {
        super(wVar, mapLibreMap, style, new t(), e.b(wVar, mapLibreMap), str, str2);
    }

    @Override // eg.c
    final void p() {
        Boolean bool = Boolean.FALSE;
        HashMap hashMap = this.f62248d;
        hashMap.put("symbol-sort-key", bool);
        hashMap.put("icon-size", bool);
        hashMap.put("icon-image", bool);
        hashMap.put("icon-rotate", bool);
        hashMap.put("icon-offset", bool);
        hashMap.put("icon-anchor", bool);
        hashMap.put("text-field", bool);
        hashMap.put("text-font", bool);
        hashMap.put("text-size", bool);
        hashMap.put("text-max-width", bool);
        hashMap.put("text-letter-spacing", bool);
        hashMap.put("text-justify", bool);
        hashMap.put("text-radial-offset", bool);
        hashMap.put("text-anchor", bool);
        hashMap.put("text-rotate", bool);
        hashMap.put("text-transform", bool);
        hashMap.put("text-offset", bool);
        hashMap.put("icon-opacity", bool);
        hashMap.put("icon-color", bool);
        hashMap.put("icon-halo-color", bool);
        hashMap.put("icon-halo-width", bool);
        hashMap.put("icon-halo-blur", bool);
        hashMap.put("text-opacity", bool);
        hashMap.put("text-color", bool);
        hashMap.put("text-halo-color", bool);
        hashMap.put("text-halo-width", bool);
        hashMap.put("text-halo-blur", bool);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // eg.c
    protected final void t(@NonNull String str) {
        String str2;
        String str3 = "icon-halo-width";
        String str4 = "icon-halo-color";
        String str5 = "text-radial-offset";
        String str6 = "icon-rotate";
        switch (str.hashCode()) {
            case -2146810373:
                str2 = "text-rotate";
                if (str.equals(str2)) {
                    r23 = 0;
                    break;
                }
                break;
            case -2041493401:
                str2 = "text-rotate";
                if (str.equals("icon-offset")) {
                    r23 = 1;
                    break;
                }
                break;
            case -1946894033:
                r23 = str.equals(str6) ? (char) 2 : (char) 65535;
                str6 = str6;
                str2 = "text-rotate";
                break;
            case -1717422239:
                r23 = str.equals(str5) ? (char) 3 : (char) 65535;
                str5 = str5;
                str2 = "text-rotate";
                break;
            case -1708933018:
                r23 = str.equals(str4) ? (char) 4 : (char) 65535;
                str4 = str4;
                str2 = "text-rotate";
                break;
            case -1690648887:
                r23 = str.equals(str3) ? (char) 5 : (char) 65535;
                str3 = str3;
                str2 = "text-rotate";
                break;
            case -1600683761:
                if (str.equals("icon-color")) {
                    r23 = 6;
                }
                str2 = "text-rotate";
                break;
            case -1595213049:
                if (str.equals("icon-image")) {
                    r23 = 7;
                }
                str2 = "text-rotate";
                break;
            case -1436636971:
                if (str.equals("icon-size")) {
                    r23 = '\b';
                }
                str2 = "text-rotate";
                break;
            case -1336352187:
                if (str.equals("symbol-sort-key")) {
                    r23 = '\t';
                }
                str2 = "text-rotate";
                break;
            case -1262567732:
                if (str.equals("text-transform")) {
                    r23 = '\n';
                }
                str2 = "text-rotate";
                break;
            case -1084154641:
                if (str.equals("text-font")) {
                    r23 = 11;
                }
                str2 = "text-rotate";
                break;
            case -1083772767:
                if (str.equals("text-size")) {
                    r23 = '\f';
                }
                str2 = "text-rotate";
                break;
            case -888013006:
                if (str.equals("text-halo-color")) {
                    r23 = '\r';
                }
                str2 = "text-rotate";
                break;
            case -886443260:
                if (str.equals("icon-halo-blur")) {
                    r23 = 14;
                }
                str2 = "text-rotate";
                break;
            case -869728875:
                if (str.equals("text-halo-width")) {
                    r23 = 15;
                }
                str2 = "text-rotate";
                break;
            case -483024021:
                if (str.equals("text-opacity")) {
                    r23 = 16;
                }
                str2 = "text-rotate";
                break;
            case -465299984:
                if (str.equals("text-justify")) {
                    r23 = 17;
                }
                str2 = "text-rotate";
                break;
            case 317300605:
                if (str.equals("text-max-width")) {
                    r23 = 18;
                }
                str2 = "text-rotate";
                break;
            case 428355132:
                if (str.equals("text-letter-spacing")) {
                    r23 = 19;
                }
                str2 = "text-rotate";
                break;
            case 525511352:
                if (str.equals("text-halo-blur")) {
                    r23 = 20;
                }
                str2 = "text-rotate";
                break;
            case 748171971:
                if (str.equals("text-color")) {
                    r23 = 21;
                }
                str2 = "text-rotate";
                break;
            case 750756954:
                if (str.equals("text-field")) {
                    r23 = 22;
                }
                str2 = "text-rotate";
                break;
            case 1419415223:
                if (str.equals("icon-opacity")) {
                    r23 = 23;
                }
                str2 = "text-rotate";
                break;
            case 1660037973:
                if (str.equals("text-anchor")) {
                    r23 = 24;
                }
                str2 = "text-rotate";
                break;
            case 1859954313:
                if (str.equals("icon-anchor")) {
                    r23 = 25;
                }
                str2 = "text-rotate";
                break;
            case 2053557555:
                if (str.equals("text-offset")) {
                    r23 = 26;
                }
                str2 = "text-rotate";
                break;
            default:
                str2 = "text-rotate";
                break;
        }
        switch (r23) {
            case 0:
                ((SymbolLayer) this.f62254j).i(new org.maplibre.android.style.layers.a(str2, C6561a.b(str2)));
                break;
            case 1:
                ((SymbolLayer) this.f62254j).i(new org.maplibre.android.style.layers.a("icon-offset", C6561a.b("icon-offset")));
                break;
            case 2:
                ((SymbolLayer) this.f62254j).i(new org.maplibre.android.style.layers.a(str6, C6561a.b(str6)));
                break;
            case 3:
                ((SymbolLayer) this.f62254j).i(new org.maplibre.android.style.layers.a(str5, C6561a.b(str5)));
                break;
            case 4:
                ((SymbolLayer) this.f62254j).i(new org.maplibre.android.style.layers.b(str4, C6561a.b(str4)));
                break;
            case 5:
                ((SymbolLayer) this.f62254j).i(new org.maplibre.android.style.layers.b(str3, C6561a.b(str3)));
                break;
            case 6:
                ((SymbolLayer) this.f62254j).i(new org.maplibre.android.style.layers.b("icon-color", C6561a.b("icon-color")));
                break;
            case 7:
                ((SymbolLayer) this.f62254j).i(new org.maplibre.android.style.layers.a("icon-image", C6561a.b("icon-image")));
                break;
            case '\b':
                ((SymbolLayer) this.f62254j).i(new org.maplibre.android.style.layers.a("icon-size", C6561a.b("icon-size")));
                break;
            case '\t':
                ((SymbolLayer) this.f62254j).i(new org.maplibre.android.style.layers.a("symbol-sort-key", C6561a.b("symbol-sort-key")));
                break;
            case '\n':
                ((SymbolLayer) this.f62254j).i(new org.maplibre.android.style.layers.a("text-transform", C6561a.b("text-transform")));
                break;
            case 11:
                ((SymbolLayer) this.f62254j).i(new org.maplibre.android.style.layers.a("text-font", C6561a.b("text-font")));
                break;
            case '\f':
                ((SymbolLayer) this.f62254j).i(new org.maplibre.android.style.layers.a("text-size", C6561a.b("text-size")));
                break;
            case '\r':
                ((SymbolLayer) this.f62254j).i(new org.maplibre.android.style.layers.b("text-halo-color", C6561a.b("text-halo-color")));
                break;
            case 14:
                ((SymbolLayer) this.f62254j).i(new org.maplibre.android.style.layers.b("icon-halo-blur", C6561a.b("icon-halo-blur")));
                break;
            case 15:
                ((SymbolLayer) this.f62254j).i(new org.maplibre.android.style.layers.b("text-halo-width", C6561a.b("text-halo-width")));
                break;
            case 16:
                ((SymbolLayer) this.f62254j).i(new org.maplibre.android.style.layers.b("text-opacity", C6561a.b("text-opacity")));
                break;
            case 17:
                ((SymbolLayer) this.f62254j).i(new org.maplibre.android.style.layers.a("text-justify", C6561a.b("text-justify")));
                break;
            case 18:
                ((SymbolLayer) this.f62254j).i(new org.maplibre.android.style.layers.a("text-max-width", C6561a.b("text-max-width")));
                break;
            case 19:
                ((SymbolLayer) this.f62254j).i(new org.maplibre.android.style.layers.a("text-letter-spacing", C6561a.b("text-letter-spacing")));
                break;
            case 20:
                ((SymbolLayer) this.f62254j).i(new org.maplibre.android.style.layers.b("text-halo-blur", C6561a.b("text-halo-blur")));
                break;
            case 21:
                ((SymbolLayer) this.f62254j).i(new org.maplibre.android.style.layers.b("text-color", C6561a.b("text-color")));
                break;
            case 22:
                ((SymbolLayer) this.f62254j).i(new org.maplibre.android.style.layers.a("text-field", C6561a.b("text-field")));
                break;
            case 23:
                ((SymbolLayer) this.f62254j).i(new org.maplibre.android.style.layers.b("icon-opacity", C6561a.b("icon-opacity")));
                break;
            case 24:
                ((SymbolLayer) this.f62254j).i(new org.maplibre.android.style.layers.a("text-anchor", C6561a.b("text-anchor")));
                break;
            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                ((SymbolLayer) this.f62254j).i(new org.maplibre.android.style.layers.a("icon-anchor", C6561a.b("icon-anchor")));
                break;
            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                ((SymbolLayer) this.f62254j).i(new org.maplibre.android.style.layers.a("text-offset", C6561a.b("text-offset")));
                break;
        }
    }

    public final void w() {
        org.maplibre.android.style.layers.a aVar = new org.maplibre.android.style.layers.a("icon-allow-overlap", Boolean.TRUE);
        this.f62249e.put("icon-allow-overlap", aVar);
        ((SymbolLayer) this.f62254j).i(aVar);
    }

    public final void x() {
        org.maplibre.android.style.layers.a aVar = new org.maplibre.android.style.layers.a("icon-ignore-placement", Boolean.TRUE);
        this.f62249e.put("icon-ignore-placement", aVar);
        ((SymbolLayer) this.f62254j).i(aVar);
    }

    public final void y() {
        org.maplibre.android.style.layers.a aVar = new org.maplibre.android.style.layers.a("text-allow-overlap", Boolean.TRUE);
        this.f62249e.put("text-allow-overlap", aVar);
        ((SymbolLayer) this.f62254j).i(aVar);
    }

    public final void z() {
        org.maplibre.android.style.layers.a aVar = new org.maplibre.android.style.layers.a("text-ignore-placement", Boolean.TRUE);
        this.f62249e.put("text-ignore-placement", aVar);
        ((SymbolLayer) this.f62254j).i(aVar);
    }
}
