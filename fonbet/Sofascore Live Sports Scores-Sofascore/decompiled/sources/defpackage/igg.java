package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.sofascore.results.R;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class igg extends LinearLayout {
    public final ad2 a;
    public final ez0 b;
    public final igg c;

    public igg(Context context) {
        super(context);
        hs4 hs4Var = z45.a;
        this.a = s9a.c(rob.a);
        View inflate = LayoutInflater.from(context).inflate(R.layout.native_video_player_progress_bar_layout, (ViewGroup) this, false);
        addView(inflate);
        int i = R.id.elapsedTimeTextView;
        TextView textView = (TextView) nq8.B(R.id.elapsedTimeTextView, inflate);
        if (textView != null) {
            i = R.id.remainingTimeTextView;
            TextView textView2 = (TextView) nq8.B(R.id.remainingTimeTextView, inflate);
            if (textView2 != null) {
                i = R.id.seekBar;
                SeekBar seekBar = (SeekBar) nq8.B(R.id.seekBar, inflate);
                if (seekBar != null) {
                    this.b = new ez0((LinearLayout) inflate, textView, textView2, seekBar, 29);
                    this.c = this;
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams.addRule(9);
                    layoutParams.addRule(11);
                    layoutParams.addRule(12);
                    setLayoutParams(layoutParams);
                    seekBar.setThumb(null);
                    seekBar.setEnabled(false);
                    return;
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    @NotNull
    public View getView() {
        return this.c;
    }
}
