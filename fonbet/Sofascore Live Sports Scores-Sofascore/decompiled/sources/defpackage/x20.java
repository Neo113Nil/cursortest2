package defpackage;

import android.view.ViewGroup;
import androidx.compose.runtime.e;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class x20 implements swf, k5g, e1a {
    public final n72 a;
    public final e1d b;
    public final e1d c;
    public final ViewGroup d;
    public j5g e;
    public final e1d f = e.f(null);
    public final e1d g = e.f(Boolean.TRUE);
    public long h = 0;
    public int i = -1;
    public final z0 j = new z0(this, 13);

    public x20(e1d e1dVar, e1d e1dVar2, ViewGroup viewGroup) {
        this.a = new n72(true, (Function0) new tra(17, e1dVar2));
        this.b = e1dVar;
        this.c = e1dVar2;
        this.d = viewGroup;
    }

    @Override // defpackage.swf
    public final void b() {
        j5g j5gVar = this.e;
        if (j5gVar != null) {
            z0();
            gp5 gp5Var = j5gVar.d;
            l5g l5gVar = (l5g) gp5Var.a.get(this);
            if (l5gVar != null) {
                l5gVar.c();
                LinkedHashMap linkedHashMap = gp5Var.a;
                l5g l5gVar2 = (l5g) linkedHashMap.get(this);
                if (l5gVar2 != null) {
                }
                linkedHashMap.remove(this);
                j5gVar.c.add(l5gVar);
            }
        }
    }

    @Override // defpackage.e1a
    public final void c(yma ymaVar) {
        wj2 wj2Var = ymaVar.a;
        this.h = wj2Var.n();
        this.i = Float.isNaN(Float.NaN) ? wzb.b(v7a.v(ymaVar, true, wj2Var.n())) : wj2Var.e0(Float.NaN);
        long j = ((r13) this.b.getValue()).a;
        float f = ((g5g) this.c.getValue()).d;
        ymaVar.a();
        this.a.b(ymaVar, Float.isNaN(Float.NaN) ? v7a.v(ymaVar, true, wj2Var.n()) : ymaVar.H0(Float.NaN), j);
        uj2 t = wj2Var.b.t();
        ((Boolean) ((eoh) this.g).getValue()).booleanValue();
        l5g l5gVar = (l5g) ((eoh) this.f).getValue();
        if (l5gVar != null) {
            l5gVar.e(f, wj2Var.n(), j, this.i);
            l5gVar.draw(xx.b(t));
        }
    }

    @Override // defpackage.swf
    public final void d() {
        j5g j5gVar = this.e;
        if (j5gVar != null) {
            z0();
            gp5 gp5Var = j5gVar.d;
            l5g l5gVar = (l5g) gp5Var.a.get(this);
            if (l5gVar != null) {
                l5gVar.c();
                LinkedHashMap linkedHashMap = gp5Var.a;
                l5g l5gVar2 = (l5g) linkedHashMap.get(this);
                if (l5gVar2 != null) {
                }
                linkedHashMap.remove(this);
                j5gVar.c.add(l5gVar);
            }
        }
    }

    @Override // defpackage.k5g
    public final void z0() {
        ((eoh) this.f).setValue(null);
    }

    @Override // defpackage.swf
    public final void a() {
    }
}
