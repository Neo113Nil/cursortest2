package com.vk.content.design.view.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vkontakte.android.R;
import xsna.bpn0;
import xsna.dhr0;
import xsna.f4m;
import xsna.ip;
import xsna.np;

/* compiled from: AttachWithCounterView.kt */
/* loaded from: classes.dex */
public final class AttachWithCounterView extends ConstraintLayout {
    public static final /* synthetic */ int w = 0;
    public final bpn0 t;
    public final bpn0 u;
    public int v;

    public AttachWithCounterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.t = new bpn0(new ip(this, 2));
        this.u = new bpn0(new np(this, 2));
        LayoutInflater.from(context).inflate(R.layout.attach_with_counter_view, (ViewGroup) this, true);
        setForeground(dhr0.t.a(R.drawable.white_ripple_unbounded));
    }

    private final ImageView getAttachIcon() {
        return (ImageView) this.t.getValue();
    }

    private final TextView getIconCounter() {
        return (TextView) this.u.getValue();
    }

    public final int getCount() {
        return this.v;
    }

    public final void setCount(int i) {
        this.v = i;
        if (i >= 100) {
            getIconCounter().setText("99+");
        } else {
            getIconCounter().setText(String.valueOf(i));
        }
        if (i == 0) {
            getAttachIcon().setImageResource(R.drawable.vk_icon_attach_outline_large_48);
            f4m.j(getIconCounter());
        } else {
            getAttachIcon().setImageResource(R.drawable.vk_icon_attach_substract_outline_large_48);
            getIconCounter().setVisibility(0);
        }
    }
}
