package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.sofascore.results.R;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ddd implements krk {
    public final /* synthetic */ int a;
    public final GraphicLarge b;

    public /* synthetic */ ddd(GraphicLarge graphicLarge, int i) {
        this.a = i;
        this.b = graphicLarge;
    }

    public static ddd a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.search_empty_state, viewGroup, false);
        if (inflate != null) {
            return new ddd((GraphicLarge) inflate, 1);
        }
        yhk.s("rootView");
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        int i = this.a;
        return this.b;
    }
}
