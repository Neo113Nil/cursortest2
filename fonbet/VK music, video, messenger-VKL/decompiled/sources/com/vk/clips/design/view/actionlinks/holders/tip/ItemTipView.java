package com.vk.clips.design.view.actionlinks.holders.tip;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import xsna.dvx;
import xsna.evx;
import xsna.p01;

/* compiled from: ItemTipView.kt */
/* loaded from: classes16.dex */
public final class ItemTipView extends FrameLayout implements evx {
    public static final /* synthetic */ int f = 0;
    public final VkText b;
    public final VkText c;
    public final VkImage d;
    public dvx e;

    public ItemTipView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // xsna.evx
    public void setActionText(int i) {
        this.c.setText(getContext().getString(i));
    }

    @Override // xsna.cux
    public void setActionVisibility(boolean z) {
        this.c.setVisibility(z ? 0 : 8);
    }

    @Override // xsna.evx
    public void setHintText(int i) {
        this.b.setText(getContext().getString(i));
    }

    @Override // xsna.evx
    public void setHintVisibility(boolean z) {
        this.b.setVisibility(z ? 0 : 8);
    }

    @Override // xsna.evx
    public void setImage(int i) {
        this.d.setImageResource(i);
    }

    public ItemTipView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.collection_item_tip, (ViewGroup) this, true);
        this.b = (VkText) findViewById(R.id.collection_item_tip_title);
        VkText vkText = (VkText) findViewById(R.id.collection_item_tip_action);
        this.c = vkText;
        this.d = (VkImage) findViewById(R.id.collection_item_tip_photo);
        vkText.setOnClickListener(new p01(this, 9));
    }

    @Override // xsna.dc6
    public dvx getPresenter() {
        return this.e;
    }

    @Override // xsna.dc6
    public void setPresenter(dvx dvxVar) {
        this.e = dvxVar;
    }
}
