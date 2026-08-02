package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class w74 implements krk {
    public final /* synthetic */ int a;
    public final RecyclerView b;
    public final RecyclerView c;

    public /* synthetic */ w74(RecyclerView recyclerView, RecyclerView recyclerView2, int i) {
        this.a = i;
        this.b = recyclerView;
        this.c = recyclerView2;
    }

    public static w74 a(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.cup_tree_dialog_layout, (ViewGroup) frameLayout, false);
        if (inflate != null) {
            RecyclerView recyclerView = (RecyclerView) inflate;
            return new w74(recyclerView, recyclerView, i);
        }
        yhk.s("rootView");
        return null;
    }

    public static w74 b(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        View inflate = layoutInflater.inflate(R.layout.recycler_view_modal, (ViewGroup) frameLayout, false);
        if (inflate != null) {
            RecyclerView recyclerView = (RecyclerView) inflate;
            return new w74(recyclerView, recyclerView, 1);
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
