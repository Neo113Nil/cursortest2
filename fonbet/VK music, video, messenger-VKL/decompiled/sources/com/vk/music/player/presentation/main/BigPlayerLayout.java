package com.vk.music.player.presentation.main;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.b;
import com.vkontakte.android.R;
import java.util.HashSet;
import xsna.cn70;
import xsna.e3m;
import xsna.fnj;
import xsna.iah0;

/* compiled from: BigPlayerLayout.kt */
/* loaded from: classes3.dex */
public final class BigPlayerLayout extends MotionLayout {
    public View I0;
    public final int J0;
    public final int K0;
    public final int L0;
    public boolean M0;
    public Integer N0;

    public BigPlayerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.J0 = cn70.b(200);
        this.K0 = cn70.b(34);
        this.L0 = cn70.b(48);
    }

    public final View getImageViewContainer() {
        View view = this.I0;
        if (view != null) {
            return view;
        }
        return null;
    }

    public final void o5(int i) {
        if (i != 1) {
            Context context = getContext();
            HashSet hashSet = iah0.a;
            if (!fnj.d(context)) {
                Activity h = e3m.h(getContext());
                if (h == null || !h.isInMultiWindowMode()) {
                    p5(R.id.player_landscape);
                    return;
                } else {
                    p5(R.id.player_split_screen);
                    return;
                }
            }
        }
        p5(R.id.lyrics_collapsed);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        o5(configuration.orientation);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setImageViewContainer(getRootView().findViewById(R.id.block_image));
        o5(getContext().getResources().getConfiguration().orientation);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (getCurrentState() == R.id.player_landscape || getCurrentState() == R.id.player_split_screen) {
            return;
        }
        int i5 = this.K0;
        int i6 = i - (i5 * 2);
        int i7 = (i2 - this.J0) - (i5 * 2);
        if (i6 < i7) {
            b Z4 = Z4(R.id.lyrics_collapsed);
            Z4.n(R.id.block_image, 0);
            Z4.G(R.id.block_image, 3, cn70.b(54));
            getImageViewContainer().setVisibility(0);
        } else if (i7 >= this.L0) {
            b Z42 = Z4(R.id.lyrics_collapsed);
            Z42.n(R.id.block_image, i7);
            Z42.G(R.id.block_image, 3, cn70.b(32));
            getImageViewContainer().setVisibility(0);
        } else {
            getImageViewContainer().setVisibility(8);
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        this.M0 = z;
        Integer num = this.N0;
        if (!z || num == null) {
            return;
        }
        p5(num.intValue());
    }

    public final void p5(int i) {
        if (!this.M0) {
            this.N0 = Integer.valueOf(i);
        } else if (getCurrentState() != i) {
            k5(i);
            this.N0 = null;
        }
    }

    public final void setImageViewContainer(View view) {
        this.I0 = view;
    }
}
