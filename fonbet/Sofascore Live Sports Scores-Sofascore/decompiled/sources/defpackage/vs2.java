package defpackage;

import android.widget.CompoundButton;
import androidx.preference.CheckBoxPreference;
import androidx.preference.SwitchPreference;
import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.TwoStatePreference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vs2 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TwoStatePreference b;

    public /* synthetic */ vs2(TwoStatePreference twoStatePreference, int i) {
        this.a = i;
        this.b = twoStatePreference;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.a;
        TwoStatePreference twoStatePreference = this.b;
        switch (i) {
            case 0:
                ((CheckBoxPreference) twoStatePreference).z(z);
                break;
            case 1:
                ((SwitchPreference) twoStatePreference).z(z);
                break;
            default:
                ((SwitchPreferenceCompat) twoStatePreference).z(z);
                break;
        }
    }
}
