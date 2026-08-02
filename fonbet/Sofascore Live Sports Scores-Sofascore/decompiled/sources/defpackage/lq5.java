package defpackage;

import com.sofascore.model.mvvm.model.ESportsEvent;
import com.sofascore.model.newNetwork.EsportsGame;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class lq5 implements Serializable {
    public final int a;
    public final EsportsGame b;
    public final ESportsEvent c;
    public final boolean d;

    public lq5(int i, EsportsGame esportsGame, ESportsEvent eSportsEvent, boolean z) {
        esportsGame.getClass();
        this.a = i;
        this.b = esportsGame;
        this.c = eSportsEvent;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lq5)) {
            return false;
        }
        lq5 lq5Var = (lq5) obj;
        return this.a == lq5Var.a && Intrinsics.c(this.b, lq5Var.b) && this.c.equals(lq5Var.c) && this.d == lq5Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "EsportsCSGORowData(position=" + this.a + ", game=" + this.b + ", event=" + this.c + ", isLast=" + this.d + ")";
    }
}
