package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import com.sofascore.model.mvvm.model.TvChannel;
import com.sofascore.results.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class f3k extends g7 {
    public c3k l;
    public Integer m;

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return true;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        return null;
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        ((TvChannel) obj).getClass();
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View inflate = LayoutInflater.from(this.b).inflate(R.layout.item_radio_layout, viewGroup, false);
        RadioButton radioButton = (RadioButton) nq8.B(R.id.radio_button, inflate);
        if (radioButton != null) {
            return new gai(this, new ed((FrameLayout) inflate, 12, radioButton));
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.radio_button)));
        return null;
    }
}
