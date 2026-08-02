package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xzg implements View.OnKeyListener {
    public final /* synthetic */ SeekBarPreference a;

    public xzg(SeekBarPreference seekBarPreference) {
        this.a = seekBarPreference;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        SeekBar seekBar;
        if (keyEvent.getAction() != 0) {
            return false;
        }
        SeekBarPreference seekBarPreference = this.a;
        if ((!seekBarPreference.T && (i == 21 || i == 22)) || i == 23 || i == 66 || (seekBar = seekBarPreference.R) == null) {
            return false;
        }
        return seekBar.onKeyDown(i, keyEvent);
    }
}
