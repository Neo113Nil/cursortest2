package com.vk.profile.design.view.profileheader;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.f;
import androidx.compose.runtime.k;
import xsna.izs;
import xsna.rpo0;
import xsna.s3q0;
import xsna.w61;
import xsna.wh50;
import xsna.yml0;
import xsna.zak0;

/* compiled from: UserProfileBaseInfoView.kt */
/* loaded from: classes5.dex */
public final class UserProfileBaseInfoView extends rpo0 {
    public static final /* synthetic */ int p = 0;
    public final wh50 m;
    public final wh50 n;
    public final wh50 o;

    public UserProfileBaseInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.m = k.b(new UserProfileBaseInfoState(0));
        this.n = k.b(new yml0(5));
        this.o = k.b(0);
    }

    private final int getForceRedrawDescriptionKey() {
        return ((Number) ((zak0) this.o).getValue()).intValue();
    }

    private final void setForceRedrawDescriptionKey(int i) {
        ((zak0) this.o).setValue(Integer.valueOf(i));
    }

    @Override // xsna.rpo0
    public final void A(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1975349376);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1975349376, i2, -1, "com.vk.profile.design.view.profileheader.UserProfileBaseInfoView.ThemedContent (UserProfileBaseInfoView.kt:75)");
            }
            b.o(getState(), getOnAction(), getForceRedrawDescriptionKey(), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new w61(this, i, 16);
        }
    }

    public final void B() {
        setForceRedrawDescriptionKey(getForceRedrawDescriptionKey() + 1);
    }

    public final izs<a, s3q0> getOnAction() {
        return (izs) ((zak0) this.n).getValue();
    }

    public final UserProfileBaseInfoState getState() {
        return (UserProfileBaseInfoState) ((zak0) this.m).getValue();
    }

    public final void setOnAction(izs<? super a, s3q0> izsVar) {
        ((zak0) this.n).setValue(izsVar);
    }

    public final void setState(UserProfileBaseInfoState userProfileBaseInfoState) {
        ((zak0) this.m).setValue(userProfileBaseInfoState);
    }
}
