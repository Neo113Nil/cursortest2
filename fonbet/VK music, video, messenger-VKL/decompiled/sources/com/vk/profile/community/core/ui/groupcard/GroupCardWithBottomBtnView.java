package com.vk.profile.community.core.ui.groupcard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vkontakte.android.R;
import xsna.cn70;
import xsna.dju;

/* compiled from: GroupCardWithBottomBtnView.kt */
/* loaded from: classes5.dex */
public final class GroupCardWithBottomBtnView extends ConstraintLayout {
    public final dju t;

    public GroupCardWithBottomBtnView(Context context) {
        this(context, null, 0, 14, 0);
    }

    public View getDecisionAnchorView() {
        return this.t.f;
    }

    public void setButtonOnClickListener(View.OnClickListener onClickListener) {
        this.t.f.setOnClickListener(onClickListener);
    }

    public GroupCardWithBottomBtnView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public GroupCardWithBottomBtnView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ GroupCardWithBottomBtnView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public GroupCardWithBottomBtnView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.t = new dju(LayoutInflater.from(context).inflate(R.layout.group_card_with_bottom_btn, (ViewGroup) this, true));
        setLayoutParams(new ConstraintLayout.b(-1, cn70.b(257)));
        setId(R.id.group_card_container);
        setBackgroundResource(R.drawable.bg_group_card_with_bottom_btn);
    }
}
