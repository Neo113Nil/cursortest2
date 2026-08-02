package com.vk.profile.design.view.subscriptioninfo;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import androidx.compose.runtime.k;
import com.unity3d.services.UnityAdsConstants;
import xsna.azl;
import xsna.gzs;
import xsna.hd4;
import xsna.og4;
import xsna.q630;
import xsna.r5j0;
import xsna.rpo0;
import xsna.s200;
import xsna.s3q0;
import xsna.txj0;
import xsna.uvi;
import xsna.vog0;
import xsna.wh50;
import xsna.wzs;
import xsna.xtm0;
import xsna.zak0;

/* compiled from: SubscriptionInfoView.kt */
/* loaded from: classes5.dex */
public final class SubscriptionInfoView extends rpo0 {
    public static final /* synthetic */ int p = 0;
    public final wh50 m;
    public final wh50 n;
    public final wh50 o;

    public SubscriptionInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.m = k.b("");
        this.n = k.b(null);
        this.o = k.b(vog0.b(0));
    }

    @Override // xsna.rpo0
    public final void A(int i, a aVar) {
        a M = aVar.M(800229697);
        int i2 = (M.y(this) ? 4 : 2) | i;
        boolean z = true;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (b.d()) {
                b.f(800229697, i2, -1, "com.vk.profile.design.view.subscriptioninfo.SubscriptionInfoView.ThemedContent (SubscriptionInfoView.kt:50)");
            }
            azl azlVar = (azl) M.r(uvi.h);
            q630 f = txj0.f(s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f);
            if ((i2 & 14) != 4 && !M.y(this)) {
                z = false;
            }
            boolean J = M.J(azlVar) | z;
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new og4(7, azlVar, this);
                M.R(x);
            }
            xtm0.a(f, (wzs) x, M, 6, 0);
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new hd4(this, i, 9);
        }
    }

    public final gzs<s3q0> getOnClick() {
        return (gzs) ((zak0) this.n).getValue();
    }

    public final r5j0 getShape() {
        return (r5j0) ((zak0) this.o).getValue();
    }

    public final String getSubscriptionInfoText() {
        return (String) ((zak0) this.m).getValue();
    }

    public final void setOnClick(gzs<s3q0> gzsVar) {
        ((zak0) this.n).setValue(gzsVar);
    }

    public final void setShape(r5j0 r5j0Var) {
        ((zak0) this.o).setValue(r5j0Var);
    }

    public final void setSubscriptionInfoText(String str) {
        ((zak0) this.m).setValue(str);
    }
}
