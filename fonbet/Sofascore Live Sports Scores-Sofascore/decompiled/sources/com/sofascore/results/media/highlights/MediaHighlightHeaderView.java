package com.sofascore.results.media.highlights;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.sofascore.model.newNetwork.Highlight;
import com.sofascore.results.R;
import defpackage.aik;
import defpackage.bea;
import defpackage.ez0;
import defpackage.fye;
import defpackage.g6b;
import defpackage.h6b;
import defpackage.hol;
import defpackage.mqi;
import defpackage.nq8;
import defpackage.qea;
import defpackage.qhi;
import defpackage.snl;
import defpackage.tsk;
import defpackage.u6b;
import defpackage.usk;
import defpackage.xnl;
import defpackage.y05;
import defpackage.yhk;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/media/highlights/MediaHighlightHeaderView;", "Lh6b;", "", "getLayoutId", "()I", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MediaHighlightHeaderView extends h6b {
    public static final /* synthetic */ int j = 0;
    public final ez0 d;
    public fye e;
    public String f;
    public String g;
    public hol h;
    public final YouTubePlayerView i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaHighlightHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        boolean z = false;
        View root = getRoot();
        int i = R.id.title;
        TextView textView = (TextView) nq8.B(R.id.title, root);
        if (textView != null) {
            i = R.id.video_overlay_barrier;
            if (((Barrier) nq8.B(R.id.video_overlay_barrier, root)) != null) {
                i = R.id.watch_on_youtube_button;
                MaterialButton materialButton = (MaterialButton) nq8.B(R.id.watch_on_youtube_button, root);
                if (materialButton != null) {
                    i = R.id.watch_on_youtube_overlay;
                    LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.watch_on_youtube_overlay, root);
                    if (linearLayout != null) {
                        i = R.id.youtube_player_view_stub;
                        ViewStub viewStub = (ViewStub) nq8.B(R.id.youtube_player_view_stub, root);
                        if (viewStub != null) {
                            this.d = new ez0((ConstraintLayout) root, textView, materialButton, linearLayout, viewStub);
                            this.e = new fye();
                            if (!y05.a(context)) {
                                boolean z2 = true;
                                if (!bea.b) {
                                    try {
                                        if (WebView.getCurrentWebViewPackage() == null) {
                                            z2 = false;
                                        }
                                        bea.b = z2;
                                    } catch (Exception unused) {
                                    }
                                }
                                z = z2;
                                if (z) {
                                    View inflate = viewStub.inflate();
                                    inflate.getClass();
                                    YouTubePlayerView youTubePlayerView = (YouTubePlayerView) inflate;
                                    l(youTubePlayerView);
                                    this.i = youTubePlayerView;
                                    return;
                                }
                            }
                            o();
                            return;
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    public static void l(ViewGroup viewGroup) {
        Iterator it = new tsk(viewGroup).iterator();
        while (true) {
            usk uskVar = (usk) it;
            if (!uskVar.hasNext()) {
                return;
            }
            View view = (View) uskVar.next();
            if (view instanceof WebView) {
                ((WebView) view).setBackgroundColor(0);
            } else if (view instanceof ViewGroup) {
                l((ViewGroup) view);
            }
        }
    }

    @Override // defpackage.rq4
    public final void g(u6b u6bVar) {
        snl snlVar;
        fye fyeVar = this.e;
        if (fyeVar == null || (snlVar = fyeVar.a) == null) {
            return;
        }
        ((xnl) snlVar).c();
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.media_video_highlight_header;
    }

    public final void n(Highlight highlight) {
        snl snlVar;
        fye fyeVar;
        snl snlVar2;
        highlight.getClass();
        if (Intrinsics.c(this.g, highlight.getUrl())) {
            return;
        }
        ez0 ez0Var = this.d;
        ((TextView) ez0Var.d).setText(highlight.getTitle());
        mqi mqiVar = qhi.a;
        this.f = qhi.c(highlight.getUrl(), false);
        this.g = highlight.getUrl();
        YouTubePlayerView youTubePlayerView = this.i;
        if (youTubePlayerView == null || this.f == null || highlight.getMediaType() != 6) {
            o();
            fye fyeVar2 = this.e;
            if (fyeVar2 == null || (snlVar = fyeVar2.a) == null) {
                return;
            }
            ((xnl) snlVar).c();
            return;
        }
        ((LinearLayout) ez0Var.e).setVisibility(8);
        youTubePlayerView.setVisibility(0);
        g6b t = qea.t(this);
        String str = this.f;
        if (t == null || str == null || (fyeVar = this.e) == null || (snlVar2 = fyeVar.a) == null) {
            return;
        }
        aik.Y(snlVar2, t, str);
    }

    public final void o() {
        ((LinearLayout) this.d.e).setVisibility(0);
        YouTubePlayerView youTubePlayerView = this.i;
        if (youTubePlayerView != null) {
            youTubePlayerView.setVisibility(4);
        }
    }

    @Override // defpackage.rq4
    public final void onDestroy(u6b u6bVar) {
        fye fyeVar;
        snl snlVar;
        hol holVar = this.h;
        if (holVar != null && (fyeVar = this.e) != null && (snlVar = fyeVar.a) != null) {
            ((xnl) snlVar).d(holVar);
        }
        fye fyeVar2 = this.e;
        if (fyeVar2 != null) {
            fyeVar2.a = null;
        }
        this.e = null;
        this.h = null;
        YouTubePlayerView youTubePlayerView = this.i;
        if (youTubePlayerView != null) {
            youTubePlayerView.b();
        }
    }
}
