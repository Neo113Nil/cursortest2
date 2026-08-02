package com.vk.clips.design.view.filter;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n0;
import io.reactivex.rxjava3.disposables.c;
import java.util.Iterator;
import java.util.List;
import xsna.fgh;
import xsna.izs;
import xsna.kfr;
import xsna.l2i;
import xsna.r9k;
import xsna.s3q0;
import xsna.tcr;
import xsna.y9k0;

/* compiled from: FiltersRecyclerView.kt */
/* loaded from: classes16.dex */
public final class FiltersRecyclerView extends y9k0 {
    public static final /* synthetic */ int j = 0;
    public izs<? super tcr, s3q0> g;
    public c h;
    public final kfr i;

    public FiltersRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        kfr kfrVar = new kfr(new r9k(this, 7), new fgh(this, 13));
        this.i = kfrVar;
        RecyclerView.l itemAnimator = getItemAnimator();
        if (itemAnimator instanceof n0) {
            ((n0) itemAnimator).g = false;
        }
        setAdapter(kfrVar);
        setSnapPositionListener(new l2i(this, 9));
        scrollToPosition(0);
    }

    public final izs<tcr, s3q0> getSelectedListener() {
        return this.g;
    }

    public final void setFiltersData(List<tcr> list) {
        this.i.setItems(list);
        Iterator<tcr> it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next().d) {
                break;
            } else {
                i++;
            }
        }
        scrollToPosition(i);
    }

    public final void setSelectedListener(izs<? super tcr, s3q0> izsVar) {
        this.g = izsVar;
    }
}
