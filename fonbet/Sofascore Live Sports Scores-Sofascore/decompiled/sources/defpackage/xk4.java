package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xk4 extends qzh {
    @Override // defpackage.qzh, defpackage.ysk
    public final Integer a(int i) {
        haf hafVar = pzh.b;
        return i == 0 ? Integer.valueOf(R.id.card_content) : super.a(i);
    }

    @Override // defpackage.qzh, defpackage.w0, defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        if (!(obj instanceof String)) {
            return super.v(obj);
        }
        haf hafVar = pzh.b;
        return 14;
    }

    @Override // defpackage.qzh, defpackage.w0, defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        haf hafVar = pzh.b;
        Context context = this.b;
        if (i != 14) {
            return (i == 0 || i == 7) ? new wk4(this, bcb.a(LayoutInflater.from(context), viewGroup), 0) : super.z(viewGroup, i);
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.davis_cup_section_row, viewGroup, false);
        View B = nq8.B(R.id.section_container, inflate);
        if (B != null) {
            return new wh(new ed((FrameLayout) inflate, 6, kqb.a(B)), (char) 0);
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.section_container)));
        return null;
    }
}
