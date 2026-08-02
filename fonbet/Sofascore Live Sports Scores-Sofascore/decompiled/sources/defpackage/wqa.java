package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wqa implements m1c {
    public final tqa a;
    public final yji b;
    public final uqa c;
    public final uzc d;

    public wqa(tqa tqaVar, yji yjiVar) {
        this.a = tqaVar;
        this.b = yjiVar;
        this.c = (uqa) tqaVar.b.invoke();
        q6a.a();
        this.d = new uzc();
    }

    @Override // defpackage.kx4
    public final float C(long j) {
        return this.b.C(j);
    }

    @Override // defpackage.kx4
    public final float C0(int i) {
        return this.b.C0(i);
    }

    @Override // defpackage.kx4
    public final float D0(float f) {
        return this.b.D0(f);
    }

    @Override // defpackage.kx4
    public final float H0(float f) {
        return this.b.H0(f);
    }

    @Override // defpackage.m1c
    public final l1c M0(int i, int i2, Map map, Function1 function1, Function1 function12) {
        return this.b.M0(i, i2, map, function1, function12);
    }

    @Override // defpackage.kx4
    public final long N(int i) {
        return this.b.N(i);
    }

    @Override // defpackage.kx4
    public final long O(float f) {
        return this.b.O(f);
    }

    @Override // defpackage.kx4
    public final long R0(long j) {
        return this.b.R0(j);
    }

    @Override // defpackage.l9a
    public final boolean W() {
        return this.b.W();
    }

    public final List a(int i) {
        uzc uzcVar = this.d;
        List list = (List) uzcVar.b(i);
        if (list != null) {
            return list;
        }
        uqa uqaVar = this.c;
        Object d = uqaVar.d(i);
        List t = this.b.t(d, this.a.a(i, d, uqaVar.b(i)));
        uzcVar.i(i, t);
        return t;
    }

    @Override // defpackage.kx4
    public final int e0(float f) {
        return this.b.e0(f);
    }

    @Override // defpackage.kx4
    public final float getFontScale() {
        return this.b.getFontScale();
    }

    @Override // defpackage.l9a
    public final ema getLayoutDirection() {
        return this.b.getLayoutDirection();
    }

    @Override // defpackage.kx4
    public final float h0(long j) {
        return this.b.h0(j);
    }

    @Override // defpackage.kx4
    public final float j() {
        return this.b.j();
    }

    @Override // defpackage.kx4
    public final long u(float f) {
        return this.b.u(f);
    }

    @Override // defpackage.kx4
    public final long v(long j) {
        return this.b.v(j);
    }

    @Override // defpackage.m1c
    public final l1c v0(int i, int i2, Map map, Function1 function1) {
        return this.b.v0(i, i2, map, function1);
    }
}
