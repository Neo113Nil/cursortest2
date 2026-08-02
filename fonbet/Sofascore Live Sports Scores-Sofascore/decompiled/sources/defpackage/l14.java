package defpackage;

import com.sofascore.model.mvvm.model.Player;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class l14 {
    public final Player a;
    public final LinkedHashMap b;

    public l14(Player player, LinkedHashMap linkedHashMap) {
        this.a = player;
        this.b = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l14)) {
            return false;
        }
        l14 l14Var = (l14) obj;
        return this.a.equals(l14Var.a) && this.b.equals(l14Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BatterData(batsman=" + this.a + ", zoneIncidentMap=" + this.b + ")";
    }
}
