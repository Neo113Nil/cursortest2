package defpackage;

import android.view.TextureView;
import android.view.View;
import com.google.android.exoplayer2.ui.SubtitleView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class iji implements vke, View.OnLayoutChangeListener, View.OnClickListener, bji, wii {
    public final hij a = new hij();
    public Object b;
    public final /* synthetic */ lji c;

    public iji(lji ljiVar) {
        this.c = ljiVar;
    }

    @Override // defpackage.vke
    public final void f(yqk yqkVar) {
        this.c.h();
    }

    @Override // defpackage.vke
    public final void j(tuj tujVar) {
        int b;
        lji ljiVar = this.c;
        zke zkeVar = ljiVar.m;
        zkeVar.getClass();
        ug6 ug6Var = (ug6) zkeVar;
        lij j = ug6Var.j();
        if (j.p()) {
            this.b = null;
        } else {
            boolean isEmpty = ug6Var.k().a.isEmpty();
            hij hijVar = this.a;
            if (isEmpty) {
                Object obj = this.b;
                if (obj != null) {
                    int b2 = j.b(obj);
                    if (b2 != -1) {
                        if (ug6Var.g() == j.f(b2, hijVar, false).c) {
                            return;
                        }
                    }
                    this.b = null;
                }
            } else {
                ug6Var.T();
                if (ug6Var.i0.a.p()) {
                    b = 0;
                } else {
                    eke ekeVar = ug6Var.i0;
                    b = ekeVar.a.b(ekeVar.b.a);
                }
                this.b = j.f(b, hijVar, true).b;
            }
        }
        ljiVar.l(false);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.c.g();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        lji.a((TextureView) view, this.c.y);
    }

    @Override // defpackage.vke
    public final void onPlayWhenReadyChanged(boolean z, int i) {
        lji ljiVar = this.c;
        ljiVar.i();
        if (!ljiVar.b() || !ljiVar.w) {
            ljiVar.c(false);
            return;
        }
        cji cjiVar = ljiVar.j;
        if (cjiVar != null) {
            cjiVar.e();
        }
    }

    @Override // defpackage.vke
    public final void onPlaybackStateChanged(int i) {
        lji ljiVar = this.c;
        ljiVar.i();
        ljiVar.k();
        if (!ljiVar.b() || !ljiVar.w) {
            ljiVar.c(false);
            return;
        }
        cji cjiVar = ljiVar.j;
        if (cjiVar != null) {
            cjiVar.e();
        }
    }

    @Override // defpackage.vke
    public final void onRenderedFirstFrame() {
        View view = this.c.c;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    @Override // defpackage.vke
    public final void p(xke xkeVar, xke xkeVar2, int i) {
        cji cjiVar;
        lji ljiVar = this.c;
        if (ljiVar.b() && ljiVar.w && (cjiVar = ljiVar.j) != null) {
            cjiVar.e();
        }
    }

    @Override // defpackage.vke
    public final void s(n74 n74Var) {
        SubtitleView subtitleView = this.c.g;
        if (subtitleView != null) {
            subtitleView.setCues(n74Var.a);
        }
    }
}
