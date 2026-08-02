package defpackage;

import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.sofascore.results.chat.ChatTranslateActivity;
import com.sofascore.results.team.playerstats.TeamPlayerStatsFilterModal;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class in implements RadioGroup.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ in(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                radioGroup.getClass();
                ((s01) obj).g.i.setEnabled(radioGroup.getCheckedRadioButtonId() != -1);
                break;
            case 1:
                int i3 = ChatTranslateActivity.M;
                radioGroup.getClass();
                RadioButton radioButton = (RadioButton) radioGroup.findViewById(i);
                radioGroup.removeView(radioButton);
                ms2 S = ((ChatTranslateActivity) obj).S();
                Object tag = radioButton.getTag();
                tag.getClass();
                Set set = S.f;
                set.remove((String) tag);
                S.g.j(set);
                break;
            default:
                radioGroup.getClass();
                ((TeamPlayerStatsFilterModal) obj).F();
                break;
        }
    }
}
