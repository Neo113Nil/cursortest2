package com.vk.superapp.multiaccount.impl.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vk.core.ui.image.a;
import com.vk.core.ui.themes.VKReplacerView;
import com.vkontakte.android.R;
import xsna.e370;
import xsna.e3m;
import xsna.epx;
import xsna.ggn0;
import xsna.hnj;
import xsna.iah0;
import xsna.ifx0;
import xsna.lgr0;
import xsna.m33;
import xsna.sjo;
import xsna.x9;

/* compiled from: MultiAccountAvatarController.kt */
/* loaded from: classes6.dex */
public final class MultiAccountAvatarController extends FrameLayout {
    public final ImageView b;
    public final View c;
    public final a<View> d;
    public final int e;
    public final Paint f;

    public MultiAccountAvatarController(Context context, AttributeSet attributeSet) {
        super(hnj.a(context), attributeSet, 0);
        this.e = iah0.a(3);
        Paint c = x9.c(true);
        c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        c.setColor(0);
        this.f = c;
        setLayerType(1, null);
        LayoutInflater.from(getContext()).inflate(R.layout.vk_auth_multiaccount_avatar_layout, this);
        VKReplacerView vKReplacerView = (VKReplacerView) findViewById(R.id.user_avatar_view);
        this.b = (ImageView) findViewById(R.id.selected_icon);
        ifx0 ifx0Var = e370.c;
        lgr0 create = (ifx0Var != null ? ifx0Var : null).a().create(getContext());
        this.d = create;
        ggn0 view = create.getView();
        this.c = view;
        vKReplacerView.a(view);
    }

    public static void a(MultiAccountAvatarController multiAccountAvatarController, Integer num, Integer num2, Integer num3) {
        ImageView imageView = multiAccountAvatarController.b;
        int intValue = num.intValue();
        Context context = imageView.getContext();
        e3m.a aVar = e3m.a;
        imageView.setImageDrawable(m33.a(intValue, context));
        imageView.setColorFilter(num2.intValue());
        sjo.b(imageView.getBackground(), num3.intValue(), PorterDuff.Mode.SRC_IN);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean drawChild = super.drawChild(canvas, view, j);
        if (epx.f(view, this.c)) {
            if (this.b.getVisibility() == 0) {
                canvas.drawCircle((r5.getRight() + r5.getLeft()) / 2.0f, (r5.getBottom() + r5.getTop()) / 2.0f, (r5.getWidth() / 2.0f) + this.e, this.f);
            }
        }
        return drawChild;
    }

    public final ImageView getSelectedIcon$impl_release() {
        return this.b;
    }

    public final void setSelectionVisible$impl_release(boolean z) {
        this.b.setVisibility(z ? 0 : 8);
    }
}
