package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.SeekBar;
import androidx.mediarouter.app.d;
import com.sofascore.results.player.details.view.PlayerPentagonSlider;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lac implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public lac(d dVar) {
        this.a = 0;
        this.c = dVar;
        this.b = new kac(this, 0);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        int colorNeutralDefault;
        int colorSecondaryDefault;
        switch (this.a) {
            case 0:
                if (z) {
                    obc obcVar = (obc) seekBar.getTag();
                    int i2 = d.r0;
                    obcVar.j(i);
                    break;
                }
                break;
            default:
                seekBar.getClass();
                PlayerPentagonSlider playerPentagonSlider = (PlayerPentagonSlider) this.b;
                if (z) {
                    int i3 = 3 - i;
                    if (playerPentagonSlider.e.contains(Integer.valueOf(i3))) {
                        playerPentagonSlider.f = i;
                        ((ord) this.c).invoke(Integer.valueOf(i3));
                    } else {
                        seekBar.setProgress(playerPentagonSlider.f);
                    }
                } else {
                    playerPentagonSlider.f = i;
                }
                if (playerPentagonSlider.f == 3) {
                    Drawable mutate = seekBar.getThumb().mutate();
                    colorSecondaryDefault = playerPentagonSlider.getColorSecondaryDefault();
                    v9g.K(mutate, colorSecondaryDefault);
                } else {
                    Drawable mutate2 = seekBar.getThumb().mutate();
                    colorNeutralDefault = playerPentagonSlider.getColorNeutralDefault();
                    v9g.K(mutate2, colorNeutralDefault);
                }
                for (int i4 = 0; i4 < 4; i4++) {
                    playerPentagonSlider.n(i4);
                }
                break;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        switch (this.a) {
            case 0:
                d dVar = (d) this.c;
                if (dVar.O != null) {
                    dVar.M.removeCallbacks((kac) this.b);
                }
                dVar.O = (obc) seekBar.getTag();
                break;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        switch (this.a) {
            case 0:
                ((d) this.c).M.postDelayed((kac) this.b, 500L);
                break;
        }
    }

    public lac(PlayerPentagonSlider playerPentagonSlider, ord ordVar) {
        this.a = 1;
        this.b = playerPentagonSlider;
        this.c = ordVar;
    }

    private final void a(SeekBar seekBar) {
    }

    private final void b(SeekBar seekBar) {
    }
}
