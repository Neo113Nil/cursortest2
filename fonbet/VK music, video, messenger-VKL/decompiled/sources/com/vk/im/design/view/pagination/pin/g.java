package com.vk.im.design.view.pagination.pin;

import android.view.ViewGroup;
import com.vk.core.view.components.text.VkFadeText;
import com.vk.im.design.view.pagination.pin.ImPinItem;
import com.vkontakte.android.R;
import xsna.gzs;
import xsna.s3q0;
import xsna.t9w;
import xsna.tkc;
import xsna.tlo0;
import xsna.vfz;

/* compiled from: MultiPinViewHolder.kt */
/* loaded from: classes2.dex */
public final class g extends vfz<ImPinItem.a> {
    public final gzs<s3q0> l;
    public final VkFadeText m;
    public final VkFadeText n;

    public g(t9w t9wVar, ViewGroup viewGroup) {
        super(R.layout.im_multi_pin_view_item, viewGroup);
        this.l = t9wVar;
        VkFadeText vkFadeText = (VkFadeText) this.itemView.findViewById(R.id.title);
        this.m = vkFadeText;
        VkFadeText vkFadeText2 = (VkFadeText) this.itemView.findViewById(R.id.subtitle);
        this.n = vkFadeText2;
        vkFadeText.setFade(true);
        vkFadeText.setMaxTextLines(1);
        vkFadeText.setSingleLine();
        vkFadeText2.setFade(true);
        vkFadeText2.setMaxTextLines(1);
        vkFadeText2.setSingleLine();
        this.itemView.setOnClickListener(new tkc(this, 5));
    }

    @Override // xsna.vfz
    public final void W5(ImPinItem.a aVar) {
        ImPinItem.a aVar2 = aVar;
        this.m.setText(tlo0.b.a(aVar2.c, this.itemView.getContext()));
        this.n.setText(tlo0.b.a(aVar2.d, this.itemView.getContext()));
    }
}
