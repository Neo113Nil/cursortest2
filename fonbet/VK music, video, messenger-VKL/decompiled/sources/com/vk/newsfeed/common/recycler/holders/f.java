package com.vk.newsfeed.common.recycler.holders;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.view.components.button.VkButton;
import com.vk.newsfeed.common.recycler.holders.LeadFormHolder;
import com.vkontakte.android.R;
import xsna.bd0;
import xsna.bwt0;
import xsna.izs;
import xsna.myc0;
import xsna.ryy;
import xsna.s3q0;
import xsna.vif0;
import xsna.vr6;

/* compiled from: LeadFormSuccessPageHolder.kt */
/* loaded from: classes4.dex */
public final class f extends vif0<ryy.d> {
    public final izs<LeadFormHolder.ButtonAction, s3q0> n;
    public final TextView o;
    public final TextView p;
    public final TextView q;
    public final VkButton r;

    public f(ViewGroup viewGroup, LeadFormHolder.b bVar) {
        super(viewGroup, R.layout.lead_ads_success_page, 0);
        this.n = bVar;
        this.o = (TextView) this.itemView.findViewById(R.id.title);
        this.p = (TextView) this.itemView.findViewById(R.id.description);
        TextView textView = (TextView) this.itemView.findViewById(R.id.promocode);
        this.q = textView;
        VkButton vkButton = (VkButton) this.itemView.findViewById(R.id.button);
        this.r = vkButton;
        textView.setOnClickListener(new vr6(this, 3));
        vkButton.setOnClickListener(new bd0(this, 7));
    }

    @Override // xsna.vif0
    public final void i6(ryy.d dVar) {
        ryy.d dVar2 = dVar;
        this.o.setText(dVar2.b);
        this.p.setText(dVar2.c);
        String str = dVar2.g;
        boolean f = myc0.f(str);
        TextView textView = this.q;
        bwt0.p0(textView, f);
        if (f) {
            textView.setText(str);
        }
        boolean f2 = myc0.f(dVar2.d);
        VkButton vkButton = this.r;
        bwt0.p0(vkButton, f2);
        if (f2) {
            vkButton.setText(dVar2.h);
        }
    }
}
