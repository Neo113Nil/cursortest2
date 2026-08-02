package com.vk.clips.design.view.correction;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n0;
import com.vk.movika.sdk.base.logic.interactor.e;
import java.util.List;
import xsna.ha;
import xsna.izs;
import xsna.kf1;
import xsna.lwj;
import xsna.nwj;
import xsna.s3q0;
import xsna.y9k0;

/* compiled from: CorrectionsRecyclerView.kt */
/* loaded from: classes16.dex */
public final class CorrectionsRecyclerView extends y9k0 {
    public static final /* synthetic */ int i = 0;
    public izs<? super lwj, s3q0> g;
    public final nwj h;

    public CorrectionsRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        nwj nwjVar = new nwj(new e(this, 23), new ha(this, 26));
        this.h = nwjVar;
        RecyclerView.l itemAnimator = getItemAnimator();
        if (itemAnimator instanceof n0) {
            ((n0) itemAnimator).g = false;
        }
        setAdapter(nwjVar);
        setSnapPositionListener(new kf1(this, 28));
        scrollToPosition(0);
    }

    public final izs<lwj, s3q0> getSelectedListener() {
        return this.g;
    }

    public final void setCorrectionItems(List<lwj> list) {
        this.h.setItems(list);
        scrollToPosition(0);
    }

    public final void setSelectedListener(izs<? super lwj, s3q0> izsVar) {
        this.g = izsVar;
    }
}
