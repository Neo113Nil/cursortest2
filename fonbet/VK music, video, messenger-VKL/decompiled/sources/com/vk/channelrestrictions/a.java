package com.vk.channelrestrictions;

import androidx.compose.runtime.a;
import androidx.compose.runtime.f;
import com.vk.channelrestrictions.RestrictionBadge;
import xsna.fdj0;
import xsna.k71;
import xsna.kai;
import xsna.l71;
import xsna.nr2;
import xsna.rrv0;
import xsna.vpi;

/* compiled from: AgeRestrictionModal.kt */
/* loaded from: classes16.dex */
public final class a extends vpi {
    public static final /* synthetic */ int g1 = 0;

    @Override // xsna.vpi
    public final void Zn(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1605497925);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1605497925, i2, -1, "com.vk.channelrestrictions.AgeRestrictionModal.Content (AgeRestrictionModal.kt:31)");
            }
            fdj0 G = nr2.G(6, 2, M, null);
            Object x = M.x();
            if (x == a.C0011a.a) {
                RestrictionBadge.a aVar2 = RestrictionBadge.Companion;
                int i3 = requireArguments().getInt("badge");
                aVar2.getClass();
                x = i3 == 0 ? RestrictionBadge.OVER_16 : RestrictionBadge.OVER_18;
                M.R(x);
            }
            rrv0.d(null, null, null, null, kai.c(649099446, new k71(this, G, (RestrictionBadge) x), M), M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new l71(this, i, 0);
        }
    }
}
