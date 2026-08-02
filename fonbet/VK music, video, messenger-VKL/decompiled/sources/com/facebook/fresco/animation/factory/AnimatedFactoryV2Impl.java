package com.facebook.fresco.animation.factory;

import android.os.Handler;
import android.os.Looper;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import java.util.concurrent.LinkedBlockingQueue;
import xsna.cin0;
import xsna.fmi0;
import xsna.h0q0;
import xsna.hj2;
import xsna.hta0;
import xsna.iml;
import xsna.kj2;
import xsna.lj2;
import xsna.mj2;
import xsna.niw;
import xsna.nj2;
import xsna.oj2;
import xsna.pj2;
import xsna.qyj;
import xsna.r3q;
import xsna.sbl;
import xsna.svf;
import xsna.tjo;
import xsna.uk2;
import xsna.ww8;
import xsna.zsn;

@zsn
/* loaded from: classes.dex */
public class AnimatedFactoryV2Impl implements kj2 {
    public final hta0 a;
    public final r3q b;
    public final qyj<ww8, svf> c;
    public final boolean d;
    public uk2 e;
    public pj2 f;
    public hj2 g;
    public sbl h;
    public final fmi0 i;
    public final int j;
    public final boolean k;
    public final int l;

    @zsn
    public AnimatedFactoryV2Impl(hta0 hta0Var, r3q r3qVar, qyj<ww8, svf> qyjVar, boolean z, boolean z2, int i, int i2, fmi0 fmi0Var) {
        this.a = hta0Var;
        this.b = r3qVar;
        this.c = qyjVar;
        this.j = i;
        this.k = z2;
        this.d = z;
        this.i = fmi0Var;
        this.l = i2;
    }

    @Override // xsna.kj2
    public final tjo a() {
        if (this.h == null) {
            lj2 lj2Var = new lj2();
            fmi0 fmi0Var = this.i;
            if (fmi0Var == null) {
                fmi0Var = new iml(this.b.f(), new LinkedBlockingQueue());
            }
            fmi0 fmi0Var2 = fmi0Var;
            mj2 mj2Var = new mj2();
            if (this.f == null) {
                this.f = new pj2(this);
            }
            pj2 pj2Var = this.f;
            if (h0q0.c == null) {
                h0q0.c = new h0q0(new Handler(Looper.getMainLooper()));
            }
            this.h = new sbl(pj2Var, h0q0.c, fmi0Var2, RealtimeSinceBootClock.get(), this.a, this.c, lj2Var, mj2Var, new cin0(Boolean.valueOf(this.k)), new cin0(Boolean.valueOf(this.d)), new cin0(Integer.valueOf(this.j)), new cin0(Integer.valueOf(this.l)));
        }
        return this.h;
    }

    @Override // xsna.kj2
    public final oj2 b() {
        return new oj2(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xsna.nj2] */
    @Override // xsna.kj2
    public final nj2 c() {
        return new niw() { // from class: xsna.nj2
            @Override // xsna.niw
            public final svf a(rip ripVar, int i, cpe0 cpe0Var, liw liwVar) {
                AnimatedFactoryV2Impl animatedFactoryV2Impl = AnimatedFactoryV2Impl.this;
                if (animatedFactoryV2Impl.e == null) {
                    animatedFactoryV2Impl.e = new uk2(new rj01(animatedFactoryV2Impl), animatedFactoryV2Impl.a, animatedFactoryV2Impl.k);
                }
                return animatedFactoryV2Impl.e.b(ripVar, liwVar, liwVar.c);
            }
        };
    }
}
