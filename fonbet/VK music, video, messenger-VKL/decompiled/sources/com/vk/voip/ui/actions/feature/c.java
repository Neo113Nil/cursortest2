package com.vk.voip.ui.actions.feature;

import com.vk.voip.ui.VoipViewModelState;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.c2;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.internal.operators.observable.q1;
import io.reactivex.rxjava3.subjects.d;
import xsna.cd9;
import xsna.cim0;
import xsna.dd9;
import xsna.djw0;
import xsna.hr;
import xsna.kbq0;
import xsna.ltl0;
import xsna.mlh0;
import xsna.mmm0;
import xsna.pd9;
import xsna.pzt0;
import xsna.rd9;
import xsna.rsg0;
import xsna.s440;
import xsna.tfx;
import xsna.vii0;
import xsna.wii0;
import xsna.xzu0;
import xsna.yfb;

/* compiled from: VoipCallSettingsDelegate.kt */
/* loaded from: classes7.dex */
public final class c {
    public final rd9 a;
    public final cd9 b;
    public final pd9 c;
    public final com.vk.voip.b d;
    public boolean e;
    public djw0 f;
    public final d<djw0> g = d.N0();
    public final io.reactivex.rxjava3.disposables.b h = new io.reactivex.rxjava3.disposables.b();

    public c(rd9 rd9Var, cd9 cd9Var, pd9 pd9Var, com.vk.voip.b bVar) {
        this.a = rd9Var;
        this.b = cd9Var;
        this.c = pd9Var;
        this.d = bVar;
    }

    public final djw0 a() {
        return this.f;
    }

    public final void b() {
        q<dd9.a> d = this.b.d(this.c.a.f());
        mlh0 mlh0Var = new mlh0(new pzt0(5), 9);
        d.getClass();
        this.h.b(new i0(d, mlh0Var).subscribe(new xzu0(new cim0(this, 15), 2)));
    }

    public final synchronized void c(VoipViewModelState voipViewModelState) {
        boolean z;
        boolean z2;
        try {
            if (voipViewModelState != VoipViewModelState.InCall && voipViewModelState != VoipViewModelState.CallingPeer) {
                z = false;
                z2 = this.e;
                if (z2 && z) {
                    this.e = true;
                    d(this.d.b().b);
                    b();
                } else if (z2 && voipViewModelState == VoipViewModelState.Idle) {
                    this.e = false;
                    this.h.e();
                    this.f = null;
                }
            }
            z = true;
            z2 = this.e;
            if (z2) {
            }
            if (z2) {
                this.e = false;
                this.h.e();
                this.f = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void d(String str) {
        this.a.getClass();
        tfx tfxVar = new tfx("calls.getCallSettings", new q1(8), new hr(5));
        tfx.o(tfxVar, "call_id", str, 0, 0, 12);
        this.h.b(new c2(rsg0.y0(yfb.x(tfxVar), null, null, 3), new vii0(new ltl0(15), 10)).U(new wii0(new kbq0(5), 18)).subscribe(new s440(new mmm0(this, 23), 26)));
    }
}
