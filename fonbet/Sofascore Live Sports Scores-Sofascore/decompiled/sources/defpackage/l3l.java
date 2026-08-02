package defpackage;

import com.sofascore.model.mvvm.model.Event;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class l3l {
    public final gv9 a;
    public final oc b;
    public final int c;
    public final gv9 d;
    public final int e;
    public final boolean f;
    public final Event g;

    public l3l(b7 b7Var, oc ocVar, int i, b7 b7Var2, int i2, boolean z, Event event) {
        b7Var.getClass();
        ocVar.getClass();
        b7Var2.getClass();
        this.a = b7Var;
        this.b = ocVar;
        this.c = i;
        this.d = b7Var2;
        this.e = i2;
        this.f = z;
        this.g = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3l)) {
            return false;
        }
        l3l l3lVar = (l3l) obj;
        return Intrinsics.c(this.a, l3lVar.a) && Intrinsics.c(this.b, l3lVar.b) && this.c == l3lVar.c && Intrinsics.c(this.d, l3lVar.d) && this.e == l3lVar.e && this.f == l3lVar.f && Intrinsics.c(this.g, l3lVar.g);
    }

    public final int hashCode() {
        int e = dmi.e(wv8.a(this.e, ljg.d(wv8.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31, this.d), 31), 31, this.f);
        Event event = this.g;
        return e + (event == null ? 0 : event.hashCode());
    }

    public final String toString() {
        return "WeeklyChallengeUiModel(leagues=" + this.a + ", activeLeague=" + this.b + ", activeLeagueIndex=" + this.c + ", rankingItems=" + this.d + ", userPosition=" + this.e + ", isVoted=" + this.f + ", event=" + this.g + ")";
    }
}
