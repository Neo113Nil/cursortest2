package com.vk.sharing.core.view;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.sharing.api.dto.Target;
import com.vk.sharing.core.view.l;
import com.vkontakte.android.R;
import xsna.cvk;
import xsna.k170;
import xsna.n7b0;

/* compiled from: TargetViewHolder.kt */
/* loaded from: classes5.dex */
public final class h extends RecyclerView.e0 implements View.OnClickListener {
    public final l l;
    public final j m;

    public h(f fVar, j jVar, Integer num) {
        super(jVar);
        this.l = fVar;
        this.m = jVar;
        j jVar2 = (j) this.itemView;
        if (num != null) {
            jVar2.setTargetAccentColor(num.intValue());
        }
        jVar2.setOnSendClicked(new k170(this, 28));
        jVar2.setOnGotoClicked(new n7b0(this, 15));
        l.a delegate = fVar.getDelegate();
        jVar2.setCancellationDelegate(delegate != null ? delegate.t2() : null);
    }

    public final void V5(Target target, boolean z) {
        int absoluteAdapterPosition = getAbsoluteAdapterPosition();
        if (target == null || absoluteAdapterPosition == -1) {
            return;
        }
        l lVar = this.l;
        if (lVar.getPresenter() != null) {
            if (!target.zb()) {
                cvk.u(R.string.send_forbidden, false);
                return;
            }
            l.a presenter = lVar.getPresenter();
            if (!z) {
                presenter.e(target, absoluteAdapterPosition);
            } else {
                presenter.y2(target, absoluteAdapterPosition, null);
                presenter.u2(target, absoluteAdapterPosition, null);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        V5(this.m.getTarget(), false);
    }
}
