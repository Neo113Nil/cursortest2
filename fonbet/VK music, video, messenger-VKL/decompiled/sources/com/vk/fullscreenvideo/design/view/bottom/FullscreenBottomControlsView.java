package com.vk.fullscreenvideo.design.view.bottom;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import androidx.compose.runtime.k;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.dto.common.VideoFile;
import com.vk.fullscreenvideo.ControlsState;
import com.vk.fullscreenvideo.a;
import com.vk.fullscreenvideo.design.view.bottom.a;
import java.util.List;
import kotlin.collections.EmptyList;
import one.video.exo.offline.DownloadInfo;
import xsna.b0a0;
import xsna.dr0;
import xsna.fnj;
import xsna.gzs;
import xsna.hg10;
import xsna.hq5;
import xsna.iah0;
import xsna.izs;
import xsna.j60;
import xsna.j8o;
import xsna.k8o;
import xsna.kai;
import xsna.kdn;
import xsna.m9o;
import xsna.q630;
import xsna.qxs;
import xsna.rrv0;
import xsna.s3q0;
import xsna.td;
import xsna.wh50;
import xsna.wzs;
import xsna.xis;
import xsna.xk6;
import xsna.zak0;

/* compiled from: FullscreenBottomControlsView.kt */
/* loaded from: classes16.dex */
public final class FullscreenBottomControlsView extends td implements a {
    public static final /* synthetic */ int o = 0;
    public final wh50 l;
    public final wh50 m;
    public final wh50 n;

    public FullscreenBottomControlsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        boolean z = !iah0.s(context);
        boolean d = fnj.d(context);
        EmptyList emptyList = EmptyList.b;
        this.l = k.b(new ControlsState.a(d, false, hg10.t(emptyList), new m9o(null, null, null), false, false, hg10.t(emptyList), new ControlsState.c(0), z, ControlsState.ScreenState.DISCOVERY));
        this.m = k.b(new j60(23));
        this.n = k.b(null);
    }

    public static s3q0 A(FullscreenBottomControlsView fullscreenBottomControlsView, com.vk.fullscreenvideo.a aVar) {
        fullscreenBottomControlsView.getClickActionCallback().invoke(aVar);
        return s3q0.a;
    }

    public static j8o B(FullscreenBottomControlsView fullscreenBottomControlsView) {
        k8o provider = fullscreenBottomControlsView.getProvider();
        if (provider == null) {
            return null;
        }
        fullscreenBottomControlsView.getContext();
        return provider.a();
    }

    private final izs<com.vk.fullscreenvideo.a, s3q0> getClickActionCallback() {
        return (izs) ((zak0) this.m).getValue();
    }

    private final k8o getProvider() {
        return (k8o) ((zak0) this.n).getValue();
    }

    private final ControlsState.a getState() {
        return (ControlsState.a) ((zak0) this.l).getValue();
    }

    private final void setClickActionCallback(izs<? super com.vk.fullscreenvideo.a, s3q0> izsVar) {
        ((zak0) this.m).setValue(izsVar);
    }

    private final void setProvider(k8o k8oVar) {
        ((zak0) this.n).setValue(k8oVar);
    }

    private final void setState(ControlsState.a aVar) {
        ((zak0) this.l).setValue(aVar);
    }

    public static s3q0 z(FullscreenBottomControlsView fullscreenBottomControlsView, androidx.compose.runtime.a aVar, int i) {
        if (aVar.t(i & 1, (i & 3) != 2)) {
            if (b.d()) {
                b.f(2113109588, i, -1, "com.vk.fullscreenvideo.design.view.bottom.FullscreenBottomControlsView.Content.<anonymous> (FullscreenBottomControlsView.kt:44)");
            }
            ControlsState.a state = fullscreenBottomControlsView.getState();
            boolean y = aVar.y(fullscreenBottomControlsView);
            Object x = aVar.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (y || x == c0012a) {
                x = new xis(fullscreenBottomControlsView, 1);
                aVar.R(x);
            }
            gzs gzsVar = (gzs) x;
            boolean y2 = aVar.y(fullscreenBottomControlsView);
            Object x2 = aVar.x();
            if (y2 || x2 == c0012a) {
                x2 = new kdn(fullscreenBottomControlsView, 6);
                aVar.R(x2);
            }
            qxs.a(state, gzsVar, q630.a.a, (izs) x2, aVar, 384);
            if (b.d()) {
                b.e();
            }
        } else {
            aVar.h();
        }
        return s3q0.a;
    }

    @Override // com.vk.fullscreenvideo.design.view.bottom.a
    public final void a(ControlsState.CastStatus castStatus) {
        setState(ControlsState.a.a(getState(), false, null, null, false, false, null, ControlsState.c.a(getState().i, castStatus, null, null, false, false, false, false, false, false, 510), false, null, 1919));
    }

    @Override // com.vk.fullscreenvideo.design.view.bottom.a
    public final void j(ControlsState.ResizeStatus resizeStatus) {
        setState(ControlsState.a.a(getState(), false, null, null, false, false, null, ControlsState.c.a(getState().i, null, resizeStatus, null, false, false, false, false, false, false, IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW), false, null, 1919));
    }

    @Override // com.vk.fullscreenvideo.design.view.bottom.a
    public final void m(DownloadInfo downloadInfo) {
        if (getState().f) {
            setState(ControlsState.a.a(getState(), false, null, m9o.a(getState().e, downloadInfo != null ? downloadInfo.a : null, downloadInfo, null, 4), false, false, null, null, false, null, 2039));
        }
    }

    @Override // xsna.td
    public final void o(int i, androidx.compose.runtime.a aVar) {
        f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> dr0Var;
        androidx.compose.runtime.a M = aVar.M(305760945);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (b.d()) {
                b.f(305760945, i2, -1, "com.vk.fullscreenvideo.design.view.bottom.FullscreenBottomControlsView.Content (FullscreenBottomControlsView.kt:41)");
            }
            if (getState().k == ControlsState.ScreenState.DISCOVERY) {
                if (b.d()) {
                    b.e();
                }
                s = M.s();
                if (s != null) {
                    dr0Var = new xk6(this, i, 4);
                    s.d = dr0Var;
                }
                return;
            }
            rrv0.e(true, null, null, null, null, null, kai.c(2113109588, new hq5(this, 8), M), M, 1572870, 62);
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        s = M.s();
        if (s != null) {
            dr0Var = new dr0(this, i, 7);
            s.d = dr0Var;
        }
    }

    @Override // com.vk.fullscreenvideo.design.view.bottom.a
    public void setAreCommentsDisabled(boolean z) {
        setState(ControlsState.a.a(getState(), false, null, null, false, false, null, ControlsState.c.a(getState().i, null, null, null, false, false, false, z, false, false, 447), false, null, 1919));
    }

    @Override // com.vk.fullscreenvideo.design.view.bottom.a
    public void setControls(List<? extends a.d> list) {
        setState(ControlsState.a.a(getState(), false, null, null, false, false, hg10.t(list), null, false, null, 1983));
    }

    @Override // com.vk.fullscreenvideo.design.view.bottom.a
    public void setDownloadButtonProvider(k8o k8oVar) {
        setProvider(k8oVar);
    }

    @Override // com.vk.fullscreenvideo.design.view.bottom.a
    public void setOnClickAction(izs<? super com.vk.fullscreenvideo.a, s3q0> izsVar) {
        setClickActionCallback(izsVar);
    }

    @Override // com.vk.fullscreenvideo.design.view.bottom.a
    public void setShowPlaylistButton(boolean z) {
        setState(ControlsState.a.a(getState(), false, null, null, false, false, null, ControlsState.c.a(getState().i, null, null, null, false, false, z, false, false, false, 479), false, null, 1919));
    }

    @Override // com.vk.fullscreenvideo.design.view.bottom.a
    public void setState(a.b bVar) {
        ControlsState.Like like;
        VideoFile videoFile = bVar.c;
        ControlsState.a state = getState();
        b0a0 t = hg10.t(bVar.j);
        boolean z = bVar.a;
        ControlsState.ScreenState screenState = bVar.b;
        boolean z2 = bVar.i;
        boolean z3 = bVar.h;
        m9o a = m9o.a(getState().e, null, null, bVar.c, 3);
        boolean z4 = bVar.g;
        ControlsState.c cVar = getState().i;
        boolean z5 = bVar.d;
        boolean z6 = bVar.e;
        boolean X = videoFile.X();
        boolean Fa = videoFile.Fa();
        boolean z7 = bVar.f;
        if (videoFile.i0()) {
            like = videoFile.O9() ? ControlsState.Like.LIKED : ControlsState.Like.NOT_LIKED;
        } else {
            like = ControlsState.Like.UNAVAILABLE;
        }
        setState(ControlsState.a.a(state, z2, t, a, z4, z3, null, ControlsState.c.a(cVar, null, null, like, z5, Fa, z6, false, X, z7, 3), z, screenState, 1089));
    }
}
