package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.RemoteViews;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sf0 extends xka implements Function2 {
    public final /* synthetic */ fsf i;
    public final /* synthetic */ fsf j;
    public final /* synthetic */ fsf k;
    public final /* synthetic */ Context l;
    public final /* synthetic */ RemoteViews m;
    public final /* synthetic */ s4a n;
    public final /* synthetic */ fsf o;
    public final /* synthetic */ fsf p;
    public final /* synthetic */ fsf q;
    public final /* synthetic */ fsf r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf0(fsf fsfVar, fsf fsfVar2, fsf fsfVar3, Context context, RemoteViews remoteViews, s4a s4aVar, fsf fsfVar4, fsf fsfVar5, fsf fsfVar6, pxj pxjVar, fsf fsfVar7, fsf fsfVar8, fsf fsfVar9) {
        super(2);
        this.i = fsfVar;
        this.j = fsfVar2;
        this.k = fsfVar3;
        this.l = context;
        this.m = remoteViews;
        this.n = s4aVar;
        this.o = fsfVar4;
        this.p = fsfVar6;
        this.q = fsfVar8;
        this.r = fsfVar9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        n3e n3eVar;
        uy8 uy8Var = (uy8) obj2;
        if (uy8Var instanceof ic) {
            this.i.a = uy8Var;
        } else if (uy8Var instanceof a8l) {
            this.j.a = uy8Var;
        } else if (uy8Var instanceof q99) {
            this.k.a = uy8Var;
        } else if (uy8Var instanceof gy0) {
            gy0 gy0Var = (gy0) uy8Var;
            int i = this.n.a;
            boolean z = gy0Var instanceof fy0;
            RemoteViews remoteViews = this.m;
            if (z) {
                int i2 = ((fy0) gy0Var).a.a;
                remoteViews.getClass();
                remoteViews.setInt(i, "setBackgroundResource", i2);
            } else if (gy0Var instanceof ey0) {
                e23 e23Var = ((ey0) gy0Var).a;
                if (e23Var instanceof f68) {
                    int s0 = hkg.s0(((f68) e23Var).a);
                    remoteViews.getClass();
                    remoteViews.setInt(i, "setBackgroundColor", s0);
                } else if (e23Var instanceof h1g) {
                    int i3 = ((h1g) e23Var).a;
                    remoteViews.getClass();
                    if (Build.VERSION.SDK_INT >= 31) {
                        byf.d(remoteViews, i, "setBackgroundColor", i3);
                    } else {
                        remoteViews.setInt(i, "setBackgroundResource", i3);
                    }
                } else if (!(e23Var instanceof al4)) {
                    Objects.toString(e23Var);
                } else if (Build.VERSION.SDK_INT >= 31) {
                    al4 al4Var = (al4) e23Var;
                    int s02 = hkg.s0(al4Var.a);
                    int s03 = hkg.s0(al4Var.b);
                    remoteViews.getClass();
                    byf.f(remoteViews, i, "setBackgroundColor", s02, s03);
                } else {
                    int s04 = hkg.s0(((al4) e23Var).a(this.l));
                    remoteViews.getClass();
                    remoteViews.setInt(i, "setBackgroundColor", s04);
                }
            }
        } else if (uy8Var instanceof n3e) {
            fsf fsfVar = this.o;
            n3e n3eVar2 = (n3e) fsfVar.a;
            if (n3eVar2 != null) {
                n3e n3eVar3 = (n3e) uy8Var;
                n3eVar = new n3e(n3eVar2.a.a(n3eVar3.a), n3eVar2.b.a(n3eVar3.b), n3eVar2.c.a(n3eVar3.c), n3eVar2.d.a(n3eVar3.d), n3eVar2.e.a(n3eVar3.e), n3eVar2.f.a(n3eVar3.f));
            } else {
                n3eVar = (n3e) uy8Var;
            }
            fsfVar.a = n3eVar;
        } else if (uy8Var instanceof tt3) {
            this.p.a = ((tt3) uy8Var).a;
        } else if (!(uy8Var instanceof qo)) {
            if (uy8Var instanceof bn5) {
                this.q.a = uy8Var;
            } else if (uy8Var instanceof m3h) {
                this.r.a = uy8Var;
            } else {
                Objects.toString(uy8Var);
            }
        }
        return Unit.a;
    }
}
