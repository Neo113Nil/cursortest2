package com.vk.libvideo.live.impl.views.error;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import xsna.cvp;
import xsna.dvp;
import xsna.e3m;
import xsna.evp;
import xsna.exp;
import xsna.g2u0;
import xsna.iah0;
import xsna.m33;
import xsna.rr6;

/* loaded from: classes3.dex */
public class ErrorView extends FrameLayout implements rr6 {
    public final VkSimpleButton b;
    public final VkText c;
    public final VkImageSimple d;
    public cvp e;
    public String f;

    public ErrorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        iah0.a(2.0f);
        iah0.a(12.0f);
        View inflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.live_error, (ViewGroup) this, true);
        VkSimpleButton vkSimpleButton = (VkSimpleButton) inflate.findViewById(R.id.liveErrorButton);
        this.b = vkSimpleButton;
        this.c = (VkText) inflate.findViewById(R.id.liveErrorText);
        this.d = (VkImageSimple) inflate.findViewById(R.id.liveErrorIcon);
        vkSimpleButton.setOnClickListener(new exp(this));
    }

    @Override // xsna.rr6
    public Context getViewContext() {
        return getContext();
    }

    @Override // xsna.rr6
    public final void release() {
        this.e = null;
    }

    public void setModel(dvp dvpVar) {
        String str = dvpVar.a;
        boolean z = dvpVar.e;
        this.f = dvpVar.b;
        this.e = dvpVar.c;
        this.c.setText(str);
        cvp cvpVar = this.e;
        VkSimpleButton vkSimpleButton = this.b;
        if (cvpVar == null) {
            vkSimpleButton.setVisibility(8);
        } else {
            if (z) {
                Context context = getContext();
                e3m.a aVar = e3m.a;
                vkSimpleButton.setBackground(m33.a(R.drawable.bg_round_corner_button_10, context));
                vkSimpleButton.setTextColor(g2u0.a(R.color.vk_white, vkSimpleButton));
            } else {
                Context context2 = getContext();
                e3m.a aVar2 = e3m.a;
                vkSimpleButton.setBackground(m33.a(R.drawable.bg_round_corner_button, context2));
                vkSimpleButton.setTextColor(g2u0.a(R.color.vk_black, vkSimpleButton));
            }
            vkSimpleButton.setVisibility(0);
            vkSimpleButton.setText(this.f);
        }
        Drawable drawable = dvpVar.d;
        VkImageSimple vkImageSimple = this.d;
        if (drawable == null || !z) {
            vkImageSimple.setVisibility(8);
        } else {
            vkImageSimple.setImageDrawable(drawable);
            vkImageSimple.setVisibility(0);
        }
    }

    @Override // xsna.rr6
    public evp getPresenter() {
        return null;
    }

    @Override // xsna.rr6
    public void setPresenter(evp evpVar) {
    }

    @Override // xsna.rr6
    public View getView() {
        return this;
    }

    @Override // xsna.rr6
    public final void pause() {
    }

    @Override // xsna.rr6
    public final void resume() {
    }
}
