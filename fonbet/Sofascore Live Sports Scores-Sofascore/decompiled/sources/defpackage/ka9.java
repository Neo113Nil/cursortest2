package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ka9 extends g7 {
    public final LayoutInflater l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka9(Context context) {
        super(context);
        context.getClass();
        this.l = LayoutInflater.from(context);
    }

    @Override // defpackage.g7
    public final void F(List list) {
        ArrayList k = me4.k(list);
        if (!list.isEmpty()) {
            String string = this.b.getString(R.string.media);
            string.getClass();
            k.add(new d6c(string));
        }
        k.addAll(list);
        super.F(k);
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        g6c g6cVar = (g6c) obj;
        return (g6cVar instanceof r5c) || (g6cVar instanceof a6c);
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        return new ha9(this.i, arrayList);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        g6c g6cVar = (g6c) obj;
        g6cVar.getClass();
        if (g6cVar instanceof r5c) {
            return 1;
        }
        if (g6cVar instanceof d6c) {
            return 3;
        }
        if (g6cVar instanceof a6c) {
            return 2;
        }
        a70.p("Unknown view type item:".concat(g6cVar.getClass().getSimpleName()));
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        LayoutInflater layoutInflater = this.l;
        if (i == 1) {
            return new la9(nr1.b(layoutInflater.inflate(R.layout.media_highlight_row_layout, viewGroup, false)), new s26(1, this, ka9.class, "isLastPosition", "isLastPosition(I)Z", 0, 17));
        }
        if (i == 2) {
            return new km1(nr1.b(layoutInflater.inflate(R.layout.media_highlight_row_layout, viewGroup, false)), new s26(1, this, ka9.class, "isLastPosition", "isLastPosition(I)Z", 0, 18));
        }
        if (i != 3) {
            ilg.c();
            return null;
        }
        View inflate = layoutInflater.inflate(R.layout.league_media_title, viewGroup, false);
        if (inflate != null) {
            return new ja9(new u22((TextView) inflate, 4));
        }
        yhk.s("rootView");
        return null;
    }
}
