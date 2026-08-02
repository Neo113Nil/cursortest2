package com.vk.biometrics.lock.impl.presentation.base.mvi.pin;

import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.c;
import defpackage.q0;
import xsna.d77;
import xsna.epx;
import xsna.km50;
import xsna.p57;

/* compiled from: BiometricsLockPinState.kt */
/* loaded from: classes15.dex */
public final class h implements km50 {
    public final d77 b;
    public final c c;
    public final p57 d;
    public final boolean e;

    public h() {
        this(0);
    }

    public static h a(h hVar, d77 d77Var, c cVar, p57 p57Var, boolean z, int i) {
        if ((i & 1) != 0) {
            d77Var = hVar.b;
        }
        if ((i & 2) != 0) {
            cVar = hVar.c;
        }
        if ((i & 4) != 0) {
            p57Var = hVar.d;
        }
        if ((i & 8) != 0) {
            z = hVar.e;
        }
        hVar.getClass();
        return new h(d77Var, cVar, p57Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return epx.f(this.b, hVar.b) && epx.f(this.c, hVar.c) && epx.f(this.d, hVar.d) && this.e == hVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiometricsLockPinState(passwordContent=");
        sb.append(this.b);
        sb.append(", pinMode=");
        sb.append(this.c);
        sb.append(", dialogs=");
        sb.append(this.d);
        sb.append(", isBiometricBtnVisible=");
        return q0.a(sb, this.e, ')');
    }

    public h(d77 d77Var, c cVar, p57 p57Var, boolean z) {
        this.b = d77Var;
        this.c = cVar;
        this.d = p57Var;
        this.e = z;
    }

    public /* synthetic */ h(int i) {
        this(new d77(null, 31), c.f.a, new p57(false, false, false, false), false);
    }
}
