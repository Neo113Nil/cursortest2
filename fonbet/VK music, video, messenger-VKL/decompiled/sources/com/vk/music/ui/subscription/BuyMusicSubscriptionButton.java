package com.vk.music.ui.subscription;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.runtime.k;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.dto.common.data.Subscription;
import com.vkontakte.android.R;
import xsna.c63;
import xsna.gqo;
import xsna.gzs;
import xsna.izs;
import xsna.jai;
import xsna.lyd;
import xsna.qr8;
import xsna.rk6;
import xsna.ro;
import xsna.s3q0;
import xsna.s70;
import xsna.uw3;
import xsna.wh50;
import xsna.ws8;
import xsna.xr0;
import xsna.ys8;

/* compiled from: BuyMusicSubscriptionButton.kt */
/* loaded from: classes3.dex */
public final class BuyMusicSubscriptionButton extends ConstraintLayout {
    public static final /* synthetic */ int z = 0;
    public gzs<? extends ys8> t;
    public izs<? super Subscription, s3q0> u;
    public rk6 v;
    public final ComposeView w;
    public final qr8 x;
    public ys8 y;

    public BuyMusicSubscriptionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.t = new uw3(4);
        this.u = new xr0(3);
        this.v = new rk6();
        wh50 b = k.b("");
        wh50 b2 = k.b("");
        Boolean bool = Boolean.FALSE;
        wh50 b3 = k.b(bool);
        Boolean bool2 = Boolean.TRUE;
        this.x = new qr8(b, b2, b3, k.b(bool2), k.b(bool), k.b(bool2));
        LayoutInflater.from(context).inflate(R.layout.music_buy_subscription_vk_ui_layout, this);
        this.w = (ComposeView) findViewById(R.id.root);
    }

    public final gzs<ys8> getModelFactory() {
        return this.t;
    }

    public final izs<Subscription, s3q0> getOnBuySubscriptionClickedListener() {
        return this.u;
    }

    public final rk6 getPriceResolver() {
        return this.v;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ys8 invoke = this.t.invoke();
        this.y = invoke;
        c63 c63Var = c63.a;
        Activity b = c63.b();
        if (b != null) {
            Object parent = getParent();
            View view = this;
            while (parent instanceof View) {
                View view2 = (View) parent;
                if (view2.getId() == 16908290) {
                    break;
                }
                view = view2;
                parent = view2.getParent();
            }
            if (gqo.e(view) == null) {
                gqo.f(view, gqo.e(b.getWindow().getDecorView()));
                ro.o(view, ro.h(b.getWindow().getDecorView()));
                lyd.h(view, lyd.f(b.getWindow().getDecorView()));
            }
        }
        this.w.setContent(new jai(882113994, new s70(2, this, invoke), true));
    }

    public final void setIsUpsell(boolean z2) {
        this.t = new ws8(z2);
    }

    public final void setModelFactory(gzs<? extends ys8> gzsVar) {
        this.t = gzsVar;
    }

    public final void setOnBuySubscriptionClickedListener(izs<? super Subscription, s3q0> izsVar) {
        this.u = izsVar;
    }

    public final void setPriceResolver(rk6 rk6Var) {
        this.v = rk6Var;
    }

    public final void setTitle(String str) {
        wh50<String> wh50Var = this.x.a;
        if (str == null) {
            str = "";
        }
        wh50Var.setValue(str);
    }
}
