package defpackage;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class i8m extends bca {
    public final bca d;

    public i8m(bca bcaVar) {
        bcaVar.getClass();
        this.d = bcaVar;
    }

    @Override // defpackage.bca
    public final boolean a(RecyclerView recyclerView, u uVar, u uVar2) {
        recyclerView.getClass();
        uVar.getClass();
        uVar2.getClass();
        return this.d.a(recyclerView, uVar, uVar2);
    }

    @Override // defpackage.bca
    public final u b(u uVar, List list, int i, int i2) {
        uVar.getClass();
        list.getClass();
        u b = this.d.b(uVar, list, i, i2);
        b.getClass();
        return b;
    }

    @Override // defpackage.bca
    public final void c(RecyclerView recyclerView, u uVar) {
        recyclerView.getClass();
        uVar.getClass();
        this.d.c(recyclerView, uVar);
    }

    @Override // defpackage.bca
    public final int d(int i, int i2) {
        return this.d.d(i, i2);
    }

    @Override // defpackage.bca
    public final long f(RecyclerView recyclerView, int i, float f, float f2) {
        recyclerView.getClass();
        return this.d.f(recyclerView, i, f, f2);
    }

    @Override // defpackage.bca
    public final int g() {
        return this.d.g();
    }

    @Override // defpackage.bca
    public final float h(u uVar) {
        uVar.getClass();
        return this.d.h(uVar);
    }

    @Override // defpackage.bca
    public final int i(RecyclerView recyclerView, u uVar) {
        recyclerView.getClass();
        uVar.getClass();
        return this.d.i(recyclerView, uVar);
    }

    @Override // defpackage.bca
    public final float j(u uVar) {
        uVar.getClass();
        return this.d.j(uVar);
    }

    @Override // defpackage.bca
    public final int k(RecyclerView recyclerView, int i, int i2, int i3, long j) {
        recyclerView.getClass();
        return this.d.k(recyclerView, i, i2, i3, j);
    }

    @Override // defpackage.bca
    public final boolean l() {
        return this.d.l();
    }

    @Override // defpackage.bca
    public final boolean m() {
        return this.d.m();
    }

    @Override // defpackage.bca
    public final void o(Canvas canvas, RecyclerView recyclerView, u uVar, float f, float f2, int i, boolean z) {
        recyclerView.getClass();
        uVar.getClass();
        this.d.o(canvas, recyclerView, uVar, f, f2, i, z);
    }

    @Override // defpackage.bca
    public final void p(Canvas canvas, RecyclerView recyclerView, u uVar, float f, float f2, int i, boolean z) {
        recyclerView.getClass();
        uVar.getClass();
        this.d.p(canvas, recyclerView, uVar, f, f2, i, z);
    }

    @Override // defpackage.bca
    public final boolean q(RecyclerView recyclerView, u uVar, u uVar2) {
        recyclerView.getClass();
        uVar.getClass();
        return this.d.q(recyclerView, uVar, uVar2);
    }

    @Override // defpackage.bca
    public final void r(RecyclerView recyclerView, u uVar, int i, u uVar2, int i2, int i3, int i4) {
        recyclerView.getClass();
        uVar.getClass();
        this.d.r(recyclerView, uVar, i, uVar2, i2, i3, i4);
    }

    @Override // defpackage.bca
    public void s(u uVar, int i) {
        this.d.s(uVar, i);
    }

    @Override // defpackage.bca
    public final void t(u uVar, int i) {
        uVar.getClass();
        this.d.t(uVar, i);
    }
}
