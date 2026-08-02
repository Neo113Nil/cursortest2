package com.vk.core.compose.component.datetime;

import com.vk.core.compose.component.datetime.b;
import java.util.ArrayList;
import xsna.hke0;
import xsna.kf7;
import xsna.swe0;
import xsna.zvb0;

/* compiled from: BlockInput.kt */
/* loaded from: classes17.dex */
public final class j extends kf7 {
    public final b.a.C0737a d;
    public final int e;
    public final StringBuilder f;

    public j(kf7 kf7Var, b.a.C0737a c0737a) {
        super(kf7Var);
        this.d = c0737a;
        this.e = c0737a.a;
        this.f = new StringBuilder();
    }

    @Override // xsna.kf7
    public final void a(int i, int i2) {
        int i3 = this.a;
        int i4 = i - i3;
        int i5 = i2 - i3;
        StringBuilder sb = this.f;
        if (i4 < sb.length() && i5 > 0) {
            if (i5 < sb.length()) {
                sb.setLength(0);
            } else {
                if (i4 < 0) {
                    i4 = 0;
                }
                sb.delete(i4, sb.length());
            }
        }
        super.a(i, i2);
    }

    @Override // xsna.kf7
    public final int e() {
        return this.e;
    }

    @Override // xsna.kf7
    public final CharSequence f() {
        return this.f;
    }

    @Override // xsna.kf7
    public final void h(ArrayList arrayList) {
        if (this.f.length() > 0) {
            arrayList.add(swe0.q(this.a, g()));
        }
        super.h(arrayList);
    }

    @Override // xsna.kf7
    public final zvb0 j() {
        kf7 kf7Var;
        StringBuilder sb = this.f;
        if (sb.length() != 0) {
            sb.deleteCharAt(sb.length() - 1);
            return new zvb0(this);
        }
        kf7 kf7Var2 = this.b;
        if (kf7Var2 == null || (kf7Var = kf7Var2.c()) == null) {
            kf7Var = this;
        }
        return new zvb0(kf7Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [xsna.kf7] */
    @Override // xsna.kf7
    public final hke0 k(char c) {
        if (!this.d.b.test(Character.valueOf(c))) {
            return new hke0(this, false);
        }
        boolean i = i();
        StringBuilder sb = this.f;
        if (i) {
            sb.setLength(0);
        }
        sb.append(c);
        if (!i()) {
            return new hke0(this, false);
        }
        kf7 kf7Var = this.c;
        j d = kf7Var != null ? kf7Var.d() : null;
        return new hke0(d == null ? this : d, d == null);
    }

    @Override // xsna.kf7
    public final kf7 c() {
        return this;
    }

    @Override // xsna.kf7
    public final kf7 d() {
        return this;
    }
}
