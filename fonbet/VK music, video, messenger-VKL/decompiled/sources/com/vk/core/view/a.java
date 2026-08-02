package com.vk.core.view;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.BottomMenuView;
import xsna.i58;
import xsna.ozl;

/* compiled from: BottomMenuItemView.kt */
@ozl
@SuppressLint({"ViewConstructor"})
/* loaded from: classes17.dex */
public final class a extends ConstraintLayout {
    public i58 t;

    private final BottomMenuView.a getConfig() {
        throw null;
    }

    public final TextView getCounterView() {
        throw null;
    }

    public final View getDotView() {
        throw null;
    }

    public final AppCompatImageView getIconView() {
        throw null;
    }

    public final i58 getItem() {
        return this.t;
    }

    public final TextView getTitleView() {
        throw null;
    }

    public final void setItem(i58 i58Var) {
        this.t = i58Var;
        setId(0);
        setContentDescription(null);
        getIconView();
        throw null;
    }
}
