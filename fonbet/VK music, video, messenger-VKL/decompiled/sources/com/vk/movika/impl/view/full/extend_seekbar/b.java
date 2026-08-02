package com.vk.movika.impl.view.full.extend_seekbar;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.movika.impl.view.full.extend_seekbar.InteractiveExtendSeekBarView;
import xsna.acx;
import xsna.bcx;
import xsna.izs;
import xsna.s3q0;

/* compiled from: InteractiveExtendSeekBarView.kt */
/* loaded from: classes3.dex */
public final class b extends RecyclerView.t {
    public final /* synthetic */ InteractiveExtendSeekBarView b;

    public b(InteractiveExtendSeekBarView interactiveExtendSeekBarView) {
        this.b = interactiveExtendSeekBarView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        bcx actionConsumer;
        InteractiveExtendSeekBarView interactiveExtendSeekBarView = this.b;
        InteractiveExtendSeekBarView.a aVar = interactiveExtendSeekBarView.h;
        if (aVar != null) {
            long j = aVar.a;
            if (i != 0 || (actionConsumer = interactiveExtendSeekBarView.getActionConsumer()) == null) {
                return;
            }
            actionConsumer.a(new acx.h(j));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int i3;
        InteractiveExtendSeekBarView interactiveExtendSeekBarView = this.b;
        Long l = interactiveExtendSeekBarView.f;
        if (l != null) {
            long longValue = l.longValue();
            if (interactiveExtendSeekBarView.g || (i3 = interactiveExtendSeekBarView.e) == 0) {
                return;
            }
            float f = (longValue / i3) * i;
            InteractiveExtendSeekBarView.a aVar = interactiveExtendSeekBarView.h;
            long j = aVar != null ? aVar.c : Long.MAX_VALUE;
            long j2 = (aVar != null ? aVar.a : 0L) + ((long) f);
            if (j2 <= j) {
                izs<Long, s3q0> seekStateListener = interactiveExtendSeekBarView.getSeekStateListener();
                if (seekStateListener != null) {
                    seekStateListener.invoke(Long.valueOf(j2));
                    return;
                }
                return;
            }
            recyclerView.stopScroll();
            izs<Long, s3q0> seekStateListener2 = interactiveExtendSeekBarView.getSeekStateListener();
            if (seekStateListener2 != null) {
                seekStateListener2.invoke(Long.valueOf(j));
            }
        }
    }
}
