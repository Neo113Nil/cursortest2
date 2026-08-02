package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.customui.views.YouTubePlayerSeekBar;
import com.sofascore.results.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class u61 {
    public final WeakReference a;
    public final snl b;
    public final bv1 c;
    public boolean d;
    public final boolean e;

    public u61(WeakReference weakReference, snl snlVar, Function0 function0) {
        snlVar.getClass();
        this.a = weakReference;
        this.b = snlVar;
        Context context = (Context) weakReference.get();
        int i = 0;
        View inflate = LayoutInflater.from(context != null ? context.getApplicationContext() : null).inflate(R.layout.media_youtube_player_ui, (ViewGroup) null, false);
        int i2 = R.id.close_button;
        ImageButton imageButton = (ImageButton) nq8.B(R.id.close_button, inflate);
        if (imageButton != null) {
            i2 = R.id.controls_container;
            RelativeLayout relativeLayout = (RelativeLayout) nq8.B(R.id.controls_container, inflate);
            if (relativeLayout != null) {
                i2 = R.id.drop_shadow_bottom;
                View B = nq8.B(R.id.drop_shadow_bottom, inflate);
                if (B != null) {
                    i2 = R.id.drop_shadow_top;
                    View B2 = nq8.B(R.id.drop_shadow_top, inflate);
                    if (B2 != null) {
                        i2 = R.id.panel;
                        View B3 = nq8.B(R.id.panel, inflate);
                        if (B3 != null) {
                            i2 = R.id.play_pause_button;
                            ImageView imageView = (ImageView) nq8.B(R.id.play_pause_button, inflate);
                            if (imageView != null) {
                                i2 = R.id.progress;
                                ProgressBar progressBar = (ProgressBar) nq8.B(R.id.progress, inflate);
                                if (progressBar != null) {
                                    i2 = R.id.youtube_button;
                                    ImageView imageView2 = (ImageView) nq8.B(R.id.youtube_button, inflate);
                                    if (imageView2 != null) {
                                        i2 = R.id.youtube_player_seekbar;
                                        YouTubePlayerSeekBar youTubePlayerSeekBar = (YouTubePlayerSeekBar) nq8.B(R.id.youtube_player_seekbar, inflate);
                                        if (youTubePlayerSeekBar != null) {
                                            this.c = new bv1((FrameLayout) inflate, imageButton, relativeLayout, B, B2, B3, imageView, progressBar, imageView2, youTubePlayerSeekBar);
                                            this.e = true;
                                            t61 t61Var = new t61(this, i);
                                            xnl xnlVar = (xnl) snlVar;
                                            xnlVar.a(youTubePlayerSeekBar);
                                            xnlVar.a(t61Var);
                                            youTubePlayerSeekBar.setYoutubePlayerSeekBarListener(new dad(this, 9));
                                            imageView.setOnClickListener(new s0(this, 6));
                                            if (function0 != null) {
                                                imageButton.setVisibility(0);
                                                imageButton.setOnClickListener(new s61(0, function0));
                                                Context context2 = (Context) weakReference.get();
                                                imageButton.setImageTintList(context2 != null ? eq3.q(R.color.on_color_primary, context2) : null);
                                                return;
                                            }
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
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    public abstract void a();

    public void b(boolean z) {
        ((ImageView) this.c.e).setImageResource(z ? R.drawable.ayp_ic_pause_36dp : R.drawable.ayp_ic_play_36dp);
    }
}
