package com.vk.im.design.view.pagination.pin;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.im.design.view.pagination.pin.ImPinItem;
import com.vkontakte.android.R;
import xsna.gzs;
import xsna.m9b;
import xsna.ne3;
import xsna.s3q0;
import xsna.tlo0;
import xsna.vfz;

/* compiled from: ImPinViewHolder.kt */
/* loaded from: classes2.dex */
public final class d extends vfz<ImPinItem.a> {
    public final gzs<s3q0> l;
    public final TextView m;
    public final TextView n;

    public d(m9b m9bVar, ViewGroup viewGroup) {
        super(R.layout.im_ui_internal_pin_view_item, viewGroup);
        this.l = m9bVar;
        this.m = (TextView) this.itemView.findViewById(R.id.title);
        this.n = (TextView) this.itemView.findViewById(R.id.subtitle);
        this.itemView.setOnClickListener(new ne3(this, 5));
    }

    @Override // xsna.vfz
    public final void W5(ImPinItem.a aVar) {
        ImPinItem.a aVar2 = aVar;
        this.m.setText(tlo0.b.a(aVar2.c, this.itemView.getContext()));
        this.n.setText(tlo0.b.a(aVar2.d, this.itemView.getContext()));
    }
}
