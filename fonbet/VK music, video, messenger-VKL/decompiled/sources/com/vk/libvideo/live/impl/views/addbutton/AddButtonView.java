package com.vk.libvideo.live.impl.views.addbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.live.api.view.AddButtonContract$State;
import com.vkontakte.android.R;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.iah0;
import xsna.iut0;
import xsna.lk0;
import xsna.mk0;
import xsna.tk0;
import xsna.uk0;

/* loaded from: classes3.dex */
public class AddButtonView extends AppCompatButton implements mk0 {
    public static final /* synthetic */ int g = 0;
    public lk0 e;
    public boolean f;

    public AddButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.style.Widget_AppCompat_Button_Colored);
        this.f = true;
        setPadding(iah0.a(24.0f), iah0.a(8.0f), iah0.a(24.0f), iah0.a(8.0f));
        setOnClickListener(new tk0(this));
    }

    private void setColor(int i) {
        ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{android.R.attr.state_enabled}, new int[]{-16842910}, new int[]{-16842912}, new int[]{android.R.attr.state_pressed}}, new int[]{i, i, i, i});
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        setBackgroundTintList(colorStateList);
        setBackgroundTintMode(PorterDuff.Mode.SRC_IN);
    }

    @Override // xsna.mk0
    public final void Q(String str, AddButtonContract$State addButtonContract$State) {
        if (this.f) {
            a(str, addButtonContract$State);
            this.f = false;
        } else {
            animate().setListener(null).cancel();
            animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(300L).setListener(new uk0(this, str, addButtonContract$State)).start();
        }
    }

    public final void a(String str, AddButtonContract$State addButtonContract$State) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        Context context = getContext();
        boolean booleanValue = addButtonContract$State.h().booleanValue();
        int i = R.color.vk_blue_400;
        setColor(context.getColor(booleanValue ? R.color.vk_white : R.color.vk_blue_400));
        Context context2 = getContext();
        if (!addButtonContract$State.h().booleanValue()) {
            i = R.color.vk_white;
        }
        setTextColor(context2.getColor(i));
        setText(spannableStringBuilder);
    }

    @Override // xsna.rr6
    public Context getViewContext() {
        return getContext();
    }

    @Override // xsna.rr6
    public final void pause() {
        lk0 lk0Var = this.e;
        if (lk0Var != null) {
            lk0Var.pause();
        }
    }

    @Override // xsna.rr6
    public final void release() {
        lk0 lk0Var = this.e;
        if (lk0Var != null) {
            lk0Var.release();
        }
    }

    @Override // xsna.rr6
    public final void resume() {
        this.f = true;
        lk0 lk0Var = this.e;
        if (lk0Var != null) {
            lk0Var.resume();
        }
    }

    @Override // xsna.mk0
    public void setVisible(boolean z) {
        setVisibility(z ? 0 : 8);
    }

    @Override // xsna.rr6
    public lk0 getPresenter() {
        return this.e;
    }

    @Override // xsna.rr6
    public void setPresenter(lk0 lk0Var) {
        this.e = lk0Var;
    }

    @Override // xsna.rr6
    public View getView() {
        return this;
    }
}
