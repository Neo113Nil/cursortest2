package com.vk.core.compose.component.datetime;

import com.vk.core.compose.component.datetime.b;
import xsna.hke0;
import xsna.kf7;
import xsna.zvb0;

/* compiled from: BlockInput.kt */
/* loaded from: classes17.dex */
public final class k extends kf7 {
    public final int d;
    public final String e;

    public k(kf7 kf7Var, b.a.C0738b c0738b) {
        super(kf7Var);
        String str = c0738b.a;
        this.d = str.length();
        this.e = str;
    }

    @Override // xsna.kf7
    public final kf7 b(int i) {
        kf7 b = super.b(i);
        return b == this ? c() : b;
    }

    @Override // xsna.kf7
    public final kf7 c() {
        kf7 kf7Var = this.b;
        if (kf7Var != null) {
            return kf7Var.c();
        }
        return null;
    }

    @Override // xsna.kf7
    public final kf7 d() {
        kf7 kf7Var = this.c;
        if (kf7Var != null) {
            return kf7Var.d();
        }
        return null;
    }

    @Override // xsna.kf7
    public final int e() {
        return this.d;
    }

    @Override // xsna.kf7
    public final CharSequence f() {
        return this.e;
    }

    @Override // xsna.kf7
    public final zvb0 j() {
        return new zvb0(c());
    }

    @Override // xsna.kf7
    public final hke0 k(char c) {
        return new hke0(d(), false);
    }
}
