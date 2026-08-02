package com.vk.clips.design.view.hsl;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n0;
import com.vkontakte.android.R;
import java.util.List;
import xsna.dn70;
import xsna.e3m;
import xsna.ehk0;
import xsna.iah0;
import xsna.izs;
import xsna.rmg;
import xsna.s3q0;
import xsna.ugv;
import xsna.wgv;

/* compiled from: HslRecyclerView.kt */
/* loaded from: classes16.dex */
public final class HslRecyclerView extends RecyclerView {
    public static final /* synthetic */ int e = 0;
    public izs<? super wgv, s3q0> b;
    public final ugv c;
    public ehk0 d;

    public HslRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ugv ugvVar = new ugv(new rmg(this, 14));
        this.c = ugvVar;
        RecyclerView.l itemAnimator = getItemAnimator();
        if (itemAnimator instanceof n0) {
            ((n0) itemAnimator).g = false;
        }
        setLayoutManager(new LinearLayoutManager(0, false));
        setHasFixedSize(true);
        setAdapter(ugvVar);
    }

    private final void setSpacing(List<wgv> list) {
        int size;
        RecyclerView.n nVar = this.d;
        if (nVar != null) {
            removeItemDecoration(nVar);
        }
        int b = dn70.b(14);
        if (list.size() > 1) {
            float size2 = (list.size() * e3m.a(R.dimen.correction_color_size, getContext())) + (e3m.a(R.dimen.hsl_horizontal_padding, getContext()) * 2.0f);
            float z = iah0.z(getContext());
            if (size2 < z && (size = (int) ((z - size2) / (list.size() - 1))) > 0) {
                b = size;
            }
        }
        ehk0 ehk0Var = new ehk0(b);
        addItemDecoration(ehk0Var);
        this.d = ehk0Var;
    }

    public final izs<wgv, s3q0> getSelectedListener() {
        return this.b;
    }

    public final void setHslItems(List<wgv> list) {
        setSpacing(list);
        this.c.setItems(list);
    }

    public final void setSelectedListener(izs<? super wgv, s3q0> izsVar) {
        this.b = izsVar;
    }
}
