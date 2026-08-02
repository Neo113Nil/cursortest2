package com.vk.clips.design.view.timeline;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import xsna.asp;
import xsna.awt0;
import xsna.f4m;
import xsna.iah0;
import xsna.wlb0;
import xsna.zrp;

/* compiled from: ActionButton.kt */
/* loaded from: classes16.dex */
public final class ActionButton extends LinearLayout {
    public ActionButtonState b;
    public Drawable c;
    public String d;
    public Integer e;
    public final VkImageSimple f;
    public final VkText g;
    public final VkImageSimple h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ActionButton.kt */
    public static final class ActionButtonState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ActionButtonState[] $VALUES;
        public static final ActionButtonState BUTTON_BOTTOM;
        public static final ActionButtonState BUTTON_TOP;

        static {
            ActionButtonState actionButtonState = new ActionButtonState("BUTTON_TOP", 0);
            BUTTON_TOP = actionButtonState;
            ActionButtonState actionButtonState2 = new ActionButtonState("BUTTON_BOTTOM", 1);
            BUTTON_BOTTOM = actionButtonState2;
            ActionButtonState[] actionButtonStateArr = {actionButtonState, actionButtonState2};
            $VALUES = actionButtonStateArr;
            $ENTRIES = new asp(actionButtonStateArr);
        }

        public ActionButtonState() {
            throw null;
        }

        public static ActionButtonState valueOf(String str) {
            return (ActionButtonState) Enum.valueOf(ActionButtonState.class, str);
        }

        public static ActionButtonState[] values() {
            return (ActionButtonState[]) $VALUES.clone();
        }
    }

    public ActionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.e = 0;
        LayoutInflater.from(context).inflate(R.layout.layout_action_button, (ViewGroup) this, true);
        this.f = (VkImageSimple) findViewById(R.id.action_button_icon);
        this.g = (VkText) findViewById(R.id.action_button_title);
        this.h = (VkImageSimple) findViewById(R.id.action_button_title_badge_question);
    }

    public final Integer getBadgeIcon() {
        return this.e;
    }

    public final Drawable getIcon() {
        return this.c;
    }

    public final ActionButtonState getState() {
        return this.b;
    }

    public final String getTitle() {
        return this.d;
    }

    public final void setBadgeIcon(Integer num) {
        this.e = num;
        if (num != null) {
            this.h.setImageResource(num.intValue());
        }
    }

    public final void setBadgeVisible(boolean z) {
        if (this.e != null) {
            awt0.u(this.h, z);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setAlpha(z ? 1.0f : 0.64f);
    }

    public final void setIcon(Drawable drawable) {
        this.c = drawable;
        if (drawable != null) {
            drawable.setTint(getContext().getColor(R.color.vk_white));
        } else {
            drawable = null;
        }
        this.f.setImageDrawable(drawable);
    }

    public final void setState(ActionButtonState actionButtonState) {
        this.b = actionButtonState;
        ActionButtonState actionButtonState2 = ActionButtonState.BUTTON_TOP;
        int f = actionButtonState == actionButtonState2 ? wlb0.f(R.dimen.action_button_icon_top_size, getContext()) : wlb0.f(R.dimen.action_button_icon_bottom_size, getContext());
        Size size = new Size(f, f);
        VkImageSimple vkImageSimple = this.f;
        f4m.A(vkImageSimple, size);
        int f2 = this.b == actionButtonState2 ? wlb0.f(R.dimen.action_button_badge_icon_top_size, getContext()) : wlb0.f(R.dimen.action_button_badge_icon_bottom_size, getContext());
        f4m.A(this.h, new Size(f2, f2));
        ActionButtonState actionButtonState3 = this.b;
        VkText vkText = this.g;
        if (actionButtonState3 == actionButtonState2) {
            vkText.setTextAppearance(R.style.VkUiTypography_Caption3);
        } else {
            vkText.setTextAppearance(R.style.VkUiTypography_Caption2);
        }
        if (this.b == actionButtonState2) {
            float f3 = 4;
            f4m.s(iah0.a(f3), vkImageSimple);
            f4m.r(iah0.a(f3), vkImageSimple);
            f4m.s(iah0.a(f3), vkText);
            f4m.r(iah0.a(f3), vkText);
            return;
        }
        float f4 = 2;
        f4m.s(iah0.a(f4), this);
        f4m.r(iah0.a(f4), this);
        float f5 = 6;
        f4m.s(iah0.a(f5), vkImageSimple);
        f4m.r(iah0.a(f5), vkImageSimple);
        f4m.s(iah0.a(f5), vkText);
        f4m.r(iah0.a(f5), vkText);
    }

    public final void setTitle(String str) {
        this.d = str;
        this.g.setText(str);
    }
}
