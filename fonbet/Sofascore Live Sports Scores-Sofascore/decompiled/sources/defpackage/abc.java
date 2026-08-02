package defpackage;

import android.widget.SeekBar;
import android.widget.TextView;
import androidx.mediarouter.app.e;
import androidx.preference.SeekBarPreference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class abc implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ abc(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                if (z) {
                    obc obcVar = (obc) seekBar.getTag();
                    e eVar = (e) ((bbc) obj).w.get(obcVar.c);
                    if (eVar != null) {
                        eVar.b(i == 0);
                    }
                    obcVar.j(i);
                    break;
                }
                break;
            default:
                SeekBarPreference seekBarPreference = (SeekBarPreference) obj;
                if (z && (seekBarPreference.V || !seekBarPreference.Q)) {
                    int progress = seekBar.getProgress() + seekBarPreference.N;
                    if (progress != seekBarPreference.M) {
                        seekBarPreference.z(progress, false);
                        break;
                    }
                } else {
                    int i3 = i + seekBarPreference.N;
                    TextView textView = seekBarPreference.S;
                    if (textView != null) {
                        textView.setText(String.valueOf(i3));
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                bbc bbcVar = (bbc) obj;
                if (bbcVar.x != null) {
                    bbcVar.s.removeMessages(2);
                }
                bbcVar.x = (obc) seekBar.getTag();
                break;
            default:
                ((SeekBarPreference) obj).Q = true;
                break;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        int progress;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((bbc) obj).s.sendEmptyMessageDelayed(2, 500L);
                break;
            default:
                SeekBarPreference seekBarPreference = (SeekBarPreference) obj;
                seekBarPreference.Q = false;
                int progress2 = seekBar.getProgress();
                int i2 = seekBarPreference.N;
                if (progress2 + i2 != seekBarPreference.M && (progress = seekBar.getProgress() + i2) != seekBarPreference.M) {
                    seekBarPreference.z(progress, false);
                    break;
                }
                break;
        }
    }
}
