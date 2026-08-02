package com.vk.profile.user.impl.ui.view.skeleton;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import com.vk.movika.tools.controls.seekbar.j;
import xsna.mb5;
import xsna.rpo0;

/* compiled from: UserLegoHeaderSkeletonView.kt */
/* loaded from: classes5.dex */
public final class UserLegoHeaderSkeletonView extends rpo0 {
    public static final /* synthetic */ int m = 0;

    public UserLegoHeaderSkeletonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // xsna.rpo0
    public final void A(int i, a aVar) {
        a M = aVar.M(741195688);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (b.d()) {
                b.f(741195688, i, -1, "com.vk.profile.user.impl.ui.view.skeleton.UserLegoHeaderSkeletonView.ThemedContent (UserLegoHeaderSkeletonView.kt:17)");
            }
            mb5.b(0, 1, M, null);
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new j(this, i, 15);
        }
    }
}
