package com.vk.profile.design.view.onboarding;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import androidx.compose.runtime.k;
import xsna.a280;
import xsna.ftq0;
import xsna.o85;
import xsna.rpo0;
import xsna.wh50;
import xsna.zak0;

/* compiled from: UserProfileOnBoardingBannerView.kt */
/* loaded from: classes5.dex */
public final class UserProfileOnBoardingBannerView extends rpo0 {
    public static final /* synthetic */ int n = 0;
    public final wh50 m;

    public UserProfileOnBoardingBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.m = k.b(null);
    }

    private final a280 getBanner() {
        return (a280) ((zak0) this.m).getValue();
    }

    private final void setBanner(a280 a280Var) {
        ((zak0) this.m).setValue(a280Var);
    }

    @Override // xsna.rpo0
    public final void A(int i, a aVar) {
        a M = aVar.M(-169399329);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (b.d()) {
                b.f(-169399329, i2, -1, "com.vk.profile.design.view.onboarding.UserProfileOnBoardingBannerView.ThemedContent (UserProfileOnBoardingBannerView.kt:41)");
            }
            ftq0.a(getBanner(), M, 0);
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new o85(this, i, 10);
        }
    }

    public final void setup(a280 a280Var) {
        a280 banner = getBanner();
        setBanner(a280Var);
        if (banner != null) {
            a280Var.getClass();
        } else {
            requestLayout();
        }
    }
}
