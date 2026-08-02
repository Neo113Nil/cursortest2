package defpackage;

import com.sofascore.model.mvvm.model.Player;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class jwf {
    public final Player a;
    public final int b;

    public jwf(Player player, int i) {
        this.a = player;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jwf)) {
            return false;
        }
        jwf jwfVar = (jwf) obj;
        return this.a.equals(jwfVar.a) && this.b == jwfVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RegularIncidentPlayer(player=" + this.a + ", teamCode=" + this.b + ")";
    }
}
