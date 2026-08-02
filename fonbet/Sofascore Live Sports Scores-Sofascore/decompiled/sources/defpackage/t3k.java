package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.sofascore.model.mvvm.model.TvChannel;
import com.sofascore.results.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class t3k extends g7 {
    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return true;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new th(arrayList2, arrayList, 4);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        ((TvChannel) obj).getClass();
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View inflate = LayoutInflater.from(this.b).inflate(R.layout.channel_editor_item, viewGroup, false);
        if (inflate != null) {
            MaterialCheckBox materialCheckBox = (MaterialCheckBox) inflate;
            return new j8i(new ed(materialCheckBox, 4, materialCheckBox));
        }
        yhk.s("rootView");
        return null;
    }
}
