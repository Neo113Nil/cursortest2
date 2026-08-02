package com.vk.music.ui.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vk.movika.tools.controls.seekbar.v;
import kotlin.Pair;
import xsna.f870;
import xsna.izs;
import xsna.l5g;
import xsna.n8g;
import xsna.q630;
import xsna.qu;
import xsna.rpo0;
import xsna.rrv0;
import xsna.txj0;
import xsna.xa4;
import xsna.ylu0;

/* compiled from: BottomNavigationGradientComposeView.kt */
/* loaded from: classes3.dex */
public final class BottomNavigationGradientComposeView extends rpo0 {
    public static final /* synthetic */ int m = 0;

    public BottomNavigationGradientComposeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // xsna.rpo0
    public final void A(int i, a aVar) {
        a M = aVar.M(2076126281);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (b.d()) {
                b.f(2076126281, i, -1, "com.vk.music.ui.bottomsheet.BottomNavigationGradientComposeView.ThemedContent (BottomNavigationGradientComposeView.kt:24)");
            }
            if (b.d()) {
                b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (b.d()) {
                b.e();
            }
            int H = f870.H(ylu0Var.getBackground().g);
            Pair[] pairArr = {new Pair(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), new l5g(f870.c(n8g.l(H, 255)))), new Pair(Float.valueOf(0.15f), new l5g(f870.c(n8g.l(H, PsExtractor.VIDEO_STREAM_MASK)))), new Pair(Float.valueOf(0.3f), new l5g(f870.c(n8g.l(H, 200)))), new Pair(Float.valueOf(0.7f), new l5g(f870.c(n8g.l(H, 50)))), new Pair(Float.valueOf(0.85f), new l5g(f870.c(n8g.l(H, 10)))), new Pair(Float.valueOf(1.0f), new l5g(f870.c(n8g.l(H, 0))))};
            q630 d = txj0.d(q630.a.a, 1.0f);
            boolean y = M.y(pairArr);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new qu(pairArr, 9);
                M.R(x);
            }
            xa4.i(6, M, (izs) x, d);
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new v(this, i, 2);
        }
    }
}
