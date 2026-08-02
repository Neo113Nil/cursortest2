package com.vk.catalog2.common.ui.mvp.holder.video.playlist.toolbar;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.runtime.d;
import androidx.compose.runtime.f;
import androidx.compose.runtime.k;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.g5t0;
import xsna.gzs;
import xsna.k5t0;
import xsna.kg50;
import xsna.mwm0;
import xsna.oi40;
import xsna.rpo0;
import xsna.uog;
import xsna.wcs0;
import xsna.wh50;
import xsna.yei0;

/* compiled from: VideoPlaylistToolbarView.kt */
/* loaded from: classes16.dex */
public final class b extends rpo0 {
    public final wh50<g5t0> m;

    public b(Context context) {
        super(context, null, 0);
        this.m = k.b(new g5t0(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, false, new oi40(29)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.rpo0
    public final void A(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1488810403);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1488810403, i2, -1, "com.vk.catalog2.common.ui.mvp.holder.video.playlist.toolbar.VideoPlaylistToolbarView.ThemedContent (VideoPlaylistToolbarView.kt:63)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = this.m;
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = d.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                M.R(x2);
            }
            kg50 kg50Var = (kg50) x2;
            kg50Var.g(((g5t0) wh50Var.getValue()).b);
            Integer valueOf = ((g5t0) wh50Var.getValue()).c ? Integer.valueOf(R.drawable.vk_icon_write_outline_28) : (((g5t0) wh50Var.getValue()).d && ((g5t0) wh50Var.getValue()).e) ? Integer.valueOf(R.drawable.vk_icon_check_square_outline_24) : (!((g5t0) wh50Var.getValue()).d || ((g5t0) wh50Var.getValue()).e) ? null : Integer.valueOf(R.drawable.vk_icon_add_square_outline_24);
            String str = ((g5t0) wh50Var.getValue()).a;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new yei0(wh50Var, 20);
                M.R(x3);
            }
            gzs gzsVar = (gzs) x3;
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new mwm0(wh50Var, 12);
                M.R(x4);
            }
            gzs gzsVar2 = (gzs) x4;
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = new wcs0(wh50Var, 2);
                M.R(x5);
            }
            k5t0.a(null, str, kg50Var, valueOf, gzsVar, gzsVar2, (gzs) x5, M, 1794432);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new uog(this, i, 11);
        }
    }

    public final wh50<g5t0> getViewState() {
        return this.m;
    }
}
