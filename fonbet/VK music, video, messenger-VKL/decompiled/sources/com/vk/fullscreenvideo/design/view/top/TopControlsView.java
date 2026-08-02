package com.vk.fullscreenvideo.design.view.top;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import androidx.compose.runtime.k;
import com.vk.fullscreenvideo.ControlsState;
import com.vk.fullscreenvideo.a;
import com.vk.fullscreenvideo.design.view.top.a;
import com.vkontakte.android.R;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.drm0;
import xsna.dso0;
import xsna.fnj;
import xsna.hg10;
import xsna.hkq0;
import xsna.iah0;
import xsna.izs;
import xsna.kai;
import xsna.n7b0;
import xsna.nx7;
import xsna.p8p0;
import xsna.q630;
import xsna.rrv0;
import xsna.s3q0;
import xsna.t9o0;
import xsna.td;
import xsna.wh50;
import xsna.wmg;
import xsna.zak0;

/* compiled from: TopControlsView.kt */
/* loaded from: classes16.dex */
public final class TopControlsView extends td implements com.vk.fullscreenvideo.design.view.top.a {
    public static final /* synthetic */ int p = 0;
    public final wh50 l;
    public final wh50 m;
    public final a n;
    public final dso0 o;

    /* compiled from: TopControlsView.kt */
    public static final class a {
        public Rect a;
    }

    public TopControlsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.l = k.b(new ControlsState.b(false, new hkq0(0), null, false, false, false, false, false, false, new ControlsState.b.a(0), false, hg10.t(EmptyList.b), new ControlsState.c(0), !iah0.s(context), ControlsState.ScreenState.DISCOVERY, false));
        this.m = k.b(new t9o0(3));
        this.n = new a();
        this.o = new dso0(this, 1);
    }

    public static s3q0 A(TopControlsView topControlsView, com.vk.fullscreenvideo.a aVar) {
        topControlsView.getClickActionCallback().invoke(aVar);
        return s3q0.a;
    }

    private final izs<com.vk.fullscreenvideo.a, s3q0> getClickActionCallback() {
        return (izs) ((zak0) this.m).getValue();
    }

    private final ControlsState.b getState() {
        return (ControlsState.b) ((zak0) this.l).getValue();
    }

    private final void setClickActionCallback(izs<? super com.vk.fullscreenvideo.a, s3q0> izsVar) {
        ((zak0) this.m).setValue(izsVar);
    }

    private final void setState(ControlsState.b bVar) {
        ((zak0) this.l).setValue(bVar);
    }

    public static s3q0 z(TopControlsView topControlsView, androidx.compose.runtime.a aVar, int i) {
        if (aVar.t(i & 1, (i & 3) != 2)) {
            if (b.d()) {
                b.f(993445665, i, -1, "com.vk.fullscreenvideo.design.view.top.TopControlsView.Content.<anonymous> (TopControlsView.kt:50)");
            }
            ControlsState.b state = topControlsView.getState();
            dso0 dso0Var = topControlsView.o;
            boolean y = aVar.y(topControlsView);
            Object x = aVar.x();
            if (y || x == a.C0011a.a) {
                x = new n7b0(topControlsView, 19);
                aVar.R(x);
            }
            p8p0.j(state, (izs) x, q630.a.a, dso0Var, aVar, 384);
            if (b.d()) {
                b.e();
            }
        } else {
            aVar.h();
        }
        return s3q0.a;
    }

    @Override // com.vk.fullscreenvideo.design.view.top.a
    public final void a(ControlsState.CastStatus castStatus) {
        setState(ControlsState.b.a(getState(), false, null, null, false, false, false, false, false, null, false, null, ControlsState.c.a(getState().n, castStatus, null, null, false, false, false, false, false, false, 510), false, null, false, 61439));
    }

    @Override // com.vk.fullscreenvideo.design.view.top.a
    public final void d(boolean z, boolean z2) {
        setState(ControlsState.b.a(getState(), false, null, Integer.valueOf(z2 ? R.string.autoplay_enabled : R.string.autoplay_disabled), z, false, z2, false, false, null, false, null, null, false, null, false, 65459));
    }

    @Override // com.vk.fullscreenvideo.design.view.top.a
    public Rect getSettingsButtonBoundsInWindow() {
        Rect rect = this.n.a;
        if (rect == null || !isShown() || rect.isEmpty()) {
            return null;
        }
        return rect;
    }

    @Override // xsna.td
    public final void o(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-74040481);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (b.d()) {
                b.f(-74040481, i2, -1, "com.vk.fullscreenvideo.design.view.top.TopControlsView.Content (TopControlsView.kt:44)");
            }
            if ((getState().l || getState().p == ControlsState.ScreenState.FULLSCREEN) && getState().p != ControlsState.ScreenState.TRANSITION) {
                M.K(1873506588);
                rrv0.e(true, null, null, null, null, null, kai.c(993445665, new nx7(this, 13), M), M, 1572870, 62);
            } else {
                M.K(1871618595);
            }
            M.j();
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new wmg(this, i, 7);
        }
    }

    @Override // com.vk.fullscreenvideo.design.view.top.a
    public void setControls(List<? extends a.d> list) {
        setState(ControlsState.b.a(getState(), false, null, null, false, false, false, false, false, null, false, hg10.t(list), null, false, null, false, 63487));
    }

    @Override // com.vk.fullscreenvideo.design.view.top.a
    public void setIsAutoplayInactive(boolean z) {
        setState(ControlsState.b.a(getState(), false, null, null, false, false, false, z, false, null, false, null, null, false, null, false, 65407));
    }

    @Override // com.vk.fullscreenvideo.design.view.top.a
    public void setOnClickAction(izs<? super com.vk.fullscreenvideo.a, s3q0> izsVar) {
        setClickActionCallback(izsVar);
    }

    @Override // com.vk.fullscreenvideo.design.view.top.a
    public void setScreenState(ControlsState.ScreenState screenState) {
        setState(ControlsState.b.a(getState(), false, null, null, false, false, false, false, false, ControlsState.b.a.a(getState().k, screenState, false, 254), false, null, null, false, screenState, false, 48639));
    }

    @Override // com.vk.fullscreenvideo.design.view.top.a
    public void setSmallScreenMode(boolean z) {
        setState(ControlsState.b.a(getState(), false, null, null, false, z, false, false, false, ControlsState.b.a.a(getState().k, null, z, 127), false, null, null, false, null, false, 64991));
    }

    @Override // com.vk.fullscreenvideo.design.view.top.a
    public void setState(a.C1076a c1076a) {
        ControlsState.b state = getState();
        ControlsState.ScreenState screenState = c1076a.b;
        boolean z = c1076a.a;
        Context context = getContext();
        HashSet hashSet = iah0.a;
        boolean d = fnj.d(context);
        boolean z2 = c1076a.n;
        boolean z3 = c1076a.d;
        boolean z4 = c1076a.f;
        boolean z5 = c1076a.g;
        boolean z6 = c1076a.h;
        ControlsState.b.a aVar = new ControlsState.b.a(c1076a.b, c1076a.a, c1076a.i, c1076a.j, c1076a.k, c1076a.l, c1076a.m, getState().g);
        ControlsState.c a2 = ControlsState.c.a(getState().n, c1076a.o, null, null, false, false, false, false, false, false, 510);
        String title = c1076a.c.getTitle();
        if (drm0.N(title)) {
            title = null;
        }
        if (title == null) {
            title = getResources().getString(R.string.album_unnamed);
        }
        a.C1076a.b bVar = c1076a.e;
        String str = bVar.a;
        boolean z7 = bVar.b;
        a.C1076a.C1077a c1077a = bVar.c;
        setState(ControlsState.b.a(state, d, new hkq0(title, str, z7, c1077a != null ? new hkq0.a(c1077a.a, c1077a.b) : null), null, false, false, z4, z5, z6, aVar, z2, null, a2, z, screenState, z3, 2092));
    }
}
