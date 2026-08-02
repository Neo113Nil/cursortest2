package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch;

import defpackage.a70;
import defpackage.g6f;
import defpackage.j2d;
import defpackage.kx4;
import defpackage.lu3;
import defpackage.qze;
import defpackage.sq3;
import defpackage.y6a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class b implements g6f, kx4 {
    public final /* synthetic */ kx4 a;
    public boolean b;
    public boolean c;
    public final j2d d;

    public b(qze qzeVar) {
        qzeVar.getClass();
        this.a = qzeVar;
        this.d = new j2d();
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.g6f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object E(sq3 sq3Var) {
        a aVar;
        int i;
        if (sq3Var instanceof a) {
            aVar = (a) sq3Var;
            int i2 = aVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.u = i2 - Integer.MIN_VALUE;
                Object obj = aVar.s;
                lu3 lu3Var = lu3.a;
                i = aVar.u;
                if (i != 0) {
                    y6a.M(obj);
                    if (!this.b && !this.c) {
                        aVar.r = this;
                        aVar.u = 1;
                        if (this.d.e(aVar) == lu3Var) {
                            return lu3Var;
                        }
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = aVar.r;
                    y6a.M(obj);
                }
                return Boolean.valueOf(this.b);
            }
        }
        aVar = new a(this, sq3Var);
        Object obj2 = aVar.s;
        lu3 lu3Var2 = lu3.a;
        i = aVar.u;
        if (i != 0) {
        }
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.kx4
    public final float H0(float f) {
        return this.a.H0(f);
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

    @Override // defpackage.kx4
    public final int e0(float f) {
        return this.a.e0(f);
    }

    @Override // defpackage.kx4
    public final float getFontScale() {
        return this.a.getFontScale();
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
