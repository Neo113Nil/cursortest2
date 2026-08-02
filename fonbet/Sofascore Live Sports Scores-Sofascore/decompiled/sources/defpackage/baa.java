package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class baa implements m1c, l9a {
    public final /* synthetic */ l9a a;
    public final ema b;

    public baa(l9a l9aVar, ema emaVar) {
        this.a = l9aVar;
        this.b = emaVar;
    }

    @Override // defpackage.kx4
    public final float C(long j) {
        return this.a.C(j);
    }

    @Override // defpackage.kx4
    public final float C0(int i) {
        return this.a.C0(i);
    }

    @Override // defpackage.kx4
    public final float D0(float f) {
        return this.a.D0(f);
    }

    @Override // defpackage.kx4
    public final float H0(float f) {
        return this.a.H0(f);
    }

    @Override // defpackage.m1c
    public final l1c M0(int i, int i2, Map map, Function1 function1, Function1 function12) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            r3a.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new aaa(i, i2, map, function1);
    }

    @Override // defpackage.kx4
    public final long N(int i) {
        return this.a.N(i);
    }

    @Override // defpackage.kx4
    public final long O(float f) {
        return this.a.O(f);
    }

    @Override // defpackage.kx4
    public final long R0(long j) {
        return this.a.R0(j);
    }

    @Override // defpackage.l9a
    public final boolean W() {
        return this.a.W();
    }

    @Override // defpackage.kx4
    public final int e0(float f) {
        return this.a.e0(f);
    }

    @Override // defpackage.kx4
    public final float getFontScale() {
        return this.a.getFontScale();
    }

    @Override // defpackage.l9a
    public final ema getLayoutDirection() {
        return this.b;
    }

    @Override // defpackage.kx4
    public final float h0(long j) {
        return this.a.h0(j);
    }

    @Override // defpackage.kx4
    public final float j() {
        return this.a.j();
    }

    @Override // defpackage.kx4
    public final long u(float f) {
        return this.a.u(f);
    }

    @Override // defpackage.kx4
    public final long v(long j) {
        return this.a.v(j);
    }
}
