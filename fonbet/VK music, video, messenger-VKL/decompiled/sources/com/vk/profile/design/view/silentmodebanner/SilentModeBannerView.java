package com.vk.profile.design.view.silentmodebanner;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import androidx.compose.runtime.k;
import com.vk.movika.tools.controls.seekbar.m;
import xsna.fnj0;
import xsna.gnj0;
import xsna.gzs;
import xsna.kcc0;
import xsna.rpo0;
import xsna.s3q0;
import xsna.wh50;
import xsna.zak0;

/* compiled from: SilentModeBannerView.kt */
/* loaded from: classes5.dex */
public final class SilentModeBannerView extends rpo0 {
    public static final /* synthetic */ int o = 0;
    public final wh50 m;
    public final wh50 n;

    public SilentModeBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.m = k.b(new fnj0(0));
        this.n = k.b(new kcc0(5));
    }

    @Override // xsna.rpo0
    public final void A(int i, a aVar) {
        a M = aVar.M(204430998);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (b.d()) {
                b.f(204430998, i2, -1, "com.vk.profile.design.view.silentmodebanner.SilentModeBannerView.ThemedContent (SilentModeBannerView.kt:49)");
            }
            gnj0.a(getState(), getOnClick(), M, 0);
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new m(this, i, 12);
        }
    }

    public final gzs<s3q0> getOnClick() {
        return (gzs) ((zak0) this.n).getValue();
    }

    public final fnj0 getState() {
        return (fnj0) ((zak0) this.m).getValue();
    }

    public final void setOnClick(gzs<s3q0> gzsVar) {
        ((zak0) this.n).setValue(gzsVar);
    }

    public final void setState(fnj0 fnj0Var) {
        ((zak0) this.m).setValue(fnj0Var);
    }
}
