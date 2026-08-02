package com.vk.newsfeed.common.recycler.holders;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.core.view.fresco.VKEnhancedImageView;
import com.vk.newsfeed.common.recycler.holders.LeadFormHolder;
import com.vkontakte.android.R;
import java.util.List;
import xsna.fxj0;
import xsna.izs;
import xsna.ryy;
import xsna.s3q0;
import xsna.vif0;
import xsna.zh0;

/* compiled from: LeadFormMainPageHolder.kt */
/* loaded from: classes4.dex */
public final class c extends vif0<ryy.c> {
    public final izs<LeadFormHolder.ButtonAction, s3q0> n;
    public final VKEnhancedImageView o;
    public final TextView p;
    public final TextView q;
    public final VkSimpleButton r;

    public c(ViewGroup viewGroup, LeadFormHolder.b bVar) {
        super(viewGroup, R.layout.lead_ads_main_page, 0);
        this.n = bVar;
        this.o = (VKEnhancedImageView) this.itemView.findViewById(R.id.main_image);
        this.p = (TextView) this.itemView.findViewById(R.id.title);
        this.q = (TextView) this.itemView.findViewById(R.id.description);
        VkSimpleButton vkSimpleButton = (VkSimpleButton) this.itemView.findViewById(R.id.button);
        this.r = vkSimpleButton;
        vkSimpleButton.setOnClickListener(new zh0(this, 3));
    }

    @Override // xsna.vif0
    public final void i6(ryy.c cVar) {
        ryy.c cVar2 = cVar;
        this.o.setRemoteImage((List<? extends fxj0>) cVar2.d);
        this.p.setText(cVar2.b);
        this.q.setText(cVar2.c);
        this.r.setText(this.itemView.getContext().getString(R.string.lead_ads_main_button_text));
    }
}
