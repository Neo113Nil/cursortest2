package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.sofascore.results.R;
import com.sofascore.results.redesign.dividers.SofaDivider;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class i3 extends o8 {
    public final h3 d;
    public SofaDivider e;
    public boolean f;

    public i3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View root = getRoot();
        if (root != null) {
            this.d = new h3((LinearLayout) root);
        } else {
            yhk.s("rootView");
            throw null;
        }
    }

    @NotNull
    public final h3 getBinding() {
        return this.d;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.abstract_facts_container;
    }

    public abstract ArrayList j(Object obj);

    public final void l(Object obj, boolean z) {
        h3 h3Var = this.d;
        if (!z) {
            h3Var.a.setVisibility(8);
            return;
        }
        if (this.f) {
            return;
        }
        this.f = true;
        Iterator it = j(obj).iterator();
        while (it.hasNext()) {
            h3Var.a.addView((View) it.next());
        }
        Context context = getContext();
        context.getClass();
        SofaDivider sofaDivider = new SofaDivider(context, null, 6);
        sofaDivider.setDividerVisibility(true);
        sofaDivider.c = true;
        this.e = sofaDivider;
        h3Var.a.addView(sofaDivider);
    }
}
