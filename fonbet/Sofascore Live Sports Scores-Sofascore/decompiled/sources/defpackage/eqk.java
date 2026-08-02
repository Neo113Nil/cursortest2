package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.sofascore.model.newNetwork.Highlight;
import com.sofascore.results.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class eqk extends h6b {
    public final bu1 d;
    public fye e;
    public String f;
    public Highlight g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public final boolean l;
    public YouTubePlayerView m;
    public hol n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [u2g] */
    public eqk(Context context) {
        super(context, null, 0);
        YouTubePlayerView u2gVar;
        g6b t;
        context.getClass();
        View root = getRoot();
        CardView cardView = (CardView) root;
        int i = R.id.info_text;
        TextView textView = (TextView) nq8.B(R.id.info_text, root);
        if (textView != null) {
            i = R.id.live_stream_info_text;
            TextView textView2 = (TextView) nq8.B(R.id.live_stream_info_text, root);
            if (textView2 != null) {
                i = R.id.media_cta_button;
                if (((MaterialButton) nq8.B(R.id.media_cta_button, root)) != null) {
                    i = R.id.media_cta_layout;
                    LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.media_cta_layout, root);
                    if (linearLayout != null) {
                        i = R.id.overlay;
                        View B = nq8.B(R.id.overlay, root);
                        if (B != null) {
                            i = R.id.overlay_group;
                            Group group = (Group) nq8.B(R.id.overlay_group, root);
                            if (group != null) {
                                i = R.id.play;
                                ImageView imageView = (ImageView) nq8.B(R.id.play, root);
                                if (imageView != null) {
                                    i = R.id.progress_bar;
                                    if (((CircularProgressIndicator) nq8.B(R.id.progress_bar, root)) != null) {
                                        i = R.id.thumbnail;
                                        ImageView imageView2 = (ImageView) nq8.B(R.id.thumbnail, root);
                                        if (imageView2 != null) {
                                            i = R.id.youtube_click_area;
                                            View B2 = nq8.B(R.id.youtube_click_area, root);
                                            if (B2 != null) {
                                                i = R.id.youtube_player_holder;
                                                FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.youtube_player_holder, root);
                                                if (frameLayout != null) {
                                                    this.d = new bu1(cardView, textView, textView2, linearLayout, B, group, imageView, imageView2, B2, frameLayout);
                                                    this.e = new fye();
                                                    boolean a = y05.a(context);
                                                    this.l = a;
                                                    if (!a) {
                                                        try {
                                                            p2g p2gVar = w2g.b;
                                                            View inflate = LayoutInflater.from(context.getApplicationContext()).inflate(R.layout.youtube_player_layout, (ViewGroup) frameLayout, false);
                                                            u2gVar = inflate instanceof YouTubePlayerView ? (YouTubePlayerView) inflate : null;
                                                            if (u2gVar != null) {
                                                                frameLayout.addView(u2gVar);
                                                            } else {
                                                                u2gVar = null;
                                                            }
                                                        } catch (Throwable th) {
                                                            p2g p2gVar2 = w2g.b;
                                                            u2gVar = new u2g(th);
                                                        }
                                                        r1 = u2gVar instanceof u2g ? null : u2gVar;
                                                    }
                                                    this.m = r1;
                                                    o8.d(this, 0, 7);
                                                    setVisibility(8);
                                                    if (isAttachedToWindow()) {
                                                        YouTubePlayerView youTubePlayerView = this.m;
                                                        if (youTubePlayerView != null && (t = qea.t(this)) != null) {
                                                            t.a(youTubePlayerView);
                                                        }
                                                    } else {
                                                        addOnAttachStateChangeListener(new a16(this, 9, this));
                                                    }
                                                    ((ImageView) this.d.d).setOnClickListener(new ivj(4, this, context));
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
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
        return R.layout.media_video_player_highlights_view;
    }

    @Override // defpackage.rq4
    public final void onDestroy(u6b u6bVar) {
        g6b t;
        snl snlVar;
        hol holVar = this.n;
        if (holVar != null) {
            YouTubePlayerView youTubePlayerView = this.m;
            if (youTubePlayerView != null) {
                k1l webViewYouTubePlayer$core_release = youTubePlayerView.b.getWebViewYouTubePlayer$core_release();
                webViewYouTubePlayer$core_release.getClass();
                webViewYouTubePlayer$core_release.c.d(holVar);
            }
            fye fyeVar = this.e;
            if (fyeVar != null && (snlVar = fyeVar.a) != null) {
                ((xnl) snlVar).d(holVar);
            }
        }
        this.n = null;
        YouTubePlayerView youTubePlayerView2 = this.m;
        if (youTubePlayerView2 != null && (t = qea.t(this)) != null) {
            t.d(youTubePlayerView2);
        }
        ((FrameLayout) this.d.c).removeAllViews();
        fye fyeVar2 = this.e;
        if (fyeVar2 != null) {
            fyeVar2.a = null;
        }
        this.e = null;
        this.m = null;
    }

    public final void setOnMediaCTAButtonListener(@NotNull Function0<Unit> function0) {
        function0.getClass();
        ((LinearLayout) this.d.b).setOnClickListener(new s61(12, function0));
    }
}
