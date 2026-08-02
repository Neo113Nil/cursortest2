package defpackage;

import com.sofascore.model.mvvm.model.Player;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class qyi {
    public final Player a;
    public final nk2 b;
    public final ArrayList c;

    public qyi(Player player, nk2 nk2Var, ArrayList arrayList) {
        player.getClass();
        nk2Var.getClass();
        this.a = player;
        this.b = nk2Var;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qyi)) {
            return false;
        }
        qyi qyiVar = (qyi) obj;
        return Intrinsics.c(this.a, qyiVar.a) && Intrinsics.c(this.b, qyiVar.b) && this.c.equals(qyiVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlayerStatRow(player=" + this.a + ", category=" + this.b + ", statValues=" + this.c + ")";
    }
}
