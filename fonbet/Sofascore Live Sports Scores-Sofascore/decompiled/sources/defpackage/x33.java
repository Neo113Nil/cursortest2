package defpackage;

import android.view.View;
import com.sofascore.model.mvvm.model.Player;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class x33 implements y33 {
    public final View a;
    public final Player b;
    public final Player c;

    public x33(View view, Player player, Player player2) {
        this.a = view;
        this.b = player;
        this.c = player2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x33)) {
            return false;
        }
        x33 x33Var = (x33) obj;
        return this.a.equals(x33Var.a) && this.b.equals(x33Var.b) && this.c.equals(x33Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SubstitutionClicked(anchorView=" + this.a + ", playerIn=" + this.b + ", playerOut=" + this.c + ")";
    }
}
