package defpackage;

import android.content.Context;
import android.os.Handler;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.PlayerMatchesEventStatistics;
import com.sofascore.model.player.PlayerEventIncidents;
import com.sofascore.model.util.ValueWrapper;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class y21 implements Serializable {
    public boolean A;
    public boolean B;
    public va9 C;
    public jfj D;
    public Long E;
    public Long F;
    public PlayerEventIncidents G;
    public PlayerMatchesEventStatistics H;
    public v8a I;
    public Boolean J;
    public boolean K;
    public Integer L;
    public boolean M;
    public jfj a;
    public jfj b;
    public jfj c;
    public jfj d;
    public jfj e;
    public jfj f;
    public jfj g;
    public jfj h;
    public boolean i;
    public boolean j;
    public wu k;
    public Integer l;
    public boolean m;
    public boolean n;
    public pv5 p;
    public Integer q;
    public Integer r;
    public Integer s;
    public boolean t;
    public boolean u;
    public boolean v;
    public jfj w;
    public jfj x;
    public jfj y;
    public jfj z;
    public boolean o = true;
    public ValueWrapper N = new ValueWrapper(Boolean.TRUE);

    /* JADX WARN: Multi-variable type inference failed */
    public y21() {
        int i = 7;
        this.a = new jfj(i, (String) null, (Integer) (0 == true ? 1 : 0));
        this.b = new jfj(i, (String) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0));
        this.c = new jfj(i, (String) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0));
        this.d = new jfj(i, (String) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0));
        this.g = new jfj(i, (String) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0));
        this.h = new jfj(i, (String) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0));
    }

    public final boolean a(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        y21 y21Var = (y21) obj;
        return Intrinsics.c(d(), y21Var.d()) && Intrinsics.c(this.a, y21Var.a) && Intrinsics.c(this.b, y21Var.b) && Intrinsics.c(this.c, y21Var.c) && Intrinsics.c(this.d, y21Var.d) && Intrinsics.c(this.e, y21Var.e) && Intrinsics.c(this.f, y21Var.f) && Intrinsics.c(this.g, y21Var.g) && Intrinsics.c(this.h, y21Var.h) && this.i == y21Var.i && this.j == y21Var.j && Intrinsics.c(this.l, y21Var.l) && this.m == y21Var.m && this.o == y21Var.o;
    }

    public abstract Event d();

    public final void e(b16 b16Var, va9 va9Var, Function0 function0) {
        if (va9Var == null || !va9Var.h || !va9Var.d() || b16Var == null) {
            return;
        }
        Handler handler = b16Var.d;
        r0 r0Var = new r0(20, this, function0);
        handler.removeCallbacksAndMessages(null);
        handler.postDelayed(r0Var, 7000L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null) || !a(obj)) {
            return false;
        }
        obj.getClass();
        y21 y21Var = (y21) obj;
        return Intrinsics.c(this.q, y21Var.q) && Intrinsics.c(this.r, y21Var.r) && this.t == y21Var.t && this.u == y21Var.u && this.v == y21Var.v && Intrinsics.c(this.w, y21Var.w) && Intrinsics.c(this.x, y21Var.x) && Intrinsics.c(this.y, y21Var.y) && Intrinsics.c(this.z, y21Var.z) && this.A == y21Var.A && this.B == y21Var.B && Intrinsics.c(this.C, y21Var.C) && Intrinsics.c(this.D, y21Var.D) && Intrinsics.c(this.E, y21Var.E) && Intrinsics.c(this.F, y21Var.F) && Intrinsics.c(this.G, y21Var.G) && Intrinsics.c(this.H, y21Var.H) && Intrinsics.c(this.I, y21Var.I) && Intrinsics.c(this.J, y21Var.J) && this.K == y21Var.K && Intrinsics.c(this.L, y21Var.L) && this.M == y21Var.M && this.n == y21Var.n;
    }

    public final int g() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + (d().hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        jfj jfjVar = this.e;
        int hashCode2 = (hashCode + (jfjVar != null ? jfjVar.hashCode() : 0)) * 31;
        jfj jfjVar2 = this.f;
        int hashCode3 = (this.g.hashCode() + ((hashCode2 + (jfjVar2 != null ? jfjVar2.hashCode() : 0)) * 31)) * 31;
        jfj jfjVar3 = this.h;
        int e = dmi.e(dmi.e(dmi.e((hashCode3 + (jfjVar3 != null ? jfjVar3.hashCode() : 0)) * 31, 31, this.i), 31, this.j), 31, true);
        Integer num = this.l;
        return Boolean.hashCode(this.m) + ((e + (num != null ? num.intValue() : 0)) * 31);
    }

    public abstract void h(Context context, Event event);

    public int hashCode() {
        int e = dmi.e(dmi.e(dmi.e((yid.m(this.r) + ((yid.m(this.q) + (g() * 31)) * 31)) * 31, 31, this.t), 31, this.u), 31, this.v);
        jfj jfjVar = this.w;
        int hashCode = (e + (jfjVar != null ? jfjVar.hashCode() : 0)) * 31;
        jfj jfjVar2 = this.x;
        int hashCode2 = (hashCode + (jfjVar2 != null ? jfjVar2.hashCode() : 0)) * 31;
        jfj jfjVar3 = this.y;
        int hashCode3 = (hashCode2 + (jfjVar3 != null ? jfjVar3.hashCode() : 0)) * 31;
        jfj jfjVar4 = this.z;
        int e2 = dmi.e(dmi.e((hashCode3 + (jfjVar4 != null ? jfjVar4.hashCode() : 0)) * 31, 31, this.A), 31, this.B);
        va9 va9Var = this.C;
        int hashCode4 = (e2 + (va9Var != null ? va9Var.hashCode() : 0)) * 31;
        jfj jfjVar5 = this.D;
        int hashCode5 = (hashCode4 + (jfjVar5 != null ? jfjVar5.hashCode() : 0)) * 31;
        Long l = this.E;
        int hashCode6 = (hashCode5 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 31;
        Long l2 = this.F;
        int hashCode7 = (hashCode6 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 31;
        PlayerEventIncidents playerEventIncidents = this.G;
        int hashCode8 = (hashCode7 + (playerEventIncidents != null ? playerEventIncidents.hashCode() : 0)) * 31;
        PlayerMatchesEventStatistics playerMatchesEventStatistics = this.H;
        int hashCode9 = (hashCode8 + (playerMatchesEventStatistics != null ? playerMatchesEventStatistics.hashCode() : 0)) * 31;
        v8a v8aVar = this.I;
        int hashCode10 = (hashCode9 + (v8aVar != null ? v8aVar.hashCode() : 0)) * 31;
        Boolean bool = this.J;
        int e3 = dmi.e((hashCode10 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 31, 31, this.K);
        Integer num = this.L;
        return Boolean.hashCode(this.n) + dmi.e((e3 + (num != null ? num.intValue() : 0)) * 31, 31, this.M);
    }
}
