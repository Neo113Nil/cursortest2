package com.vk.stories.design.view.stickerbutton;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import com.vk.core.view.components.tooltip.VkTooltip;
import com.vk.stories.design.view.ReactionView;
import com.vk.stories.design.view.stickerbutton.a;
import com.vkontakte.android.R;
import xsna.hp7;
import xsna.iah0;
import xsna.jai;
import xsna.kgn;

/* compiled from: ReactionStickerButton.kt */
/* loaded from: classes6.dex */
public final class ReactionStickerButton extends LinearLayout {
    public static final /* synthetic */ int c = 0;
    public final ComposeView b;

    /* compiled from: Effects.kt */
    public static final class a implements kgn {
        public final /* synthetic */ a.C1830a a;

        public a(a.C1830a c1830a) {
            this.a = c1830a;
        }

        @Override // xsna.kgn
        public final void dispose() {
            this.a.b = null;
        }
    }

    public ReactionStickerButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        setClipChildren(false);
        setClickable(true);
        setFocusable(true);
        View reactionView = new ReactionView(context, null, 6);
        reactionView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        addView(reactionView);
        ComposeView composeView = new ComposeView(context, null, 6);
        composeView.setId(R.id.highlight);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = iah0.a(12);
        composeView.setLayoutParams(layoutParams);
        this.b = composeView;
        addView(composeView);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() || motionEvent.getAction() != 1) {
            if (isEnabled()) {
                return super.onTouchEvent(motionEvent);
            }
            return true;
        }
        Rect rect = new Rect();
        getGlobalVisibleRect(rect);
        rect.offset(0, iah0.a(20));
        VkTooltip.a aVar = new VkTooltip.a(getContext());
        aVar.c = getContext().getString(R.string.sticker_button_limit_tooltip);
        aVar.f = VkTooltip.TooltipGravity.TOP;
        aVar.e = VkTooltip.Appearance.Neutral;
        aVar.o = 2000L;
        aVar.a(rect);
        return true;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setAlpha(z ? 1.0f : 0.52f);
    }

    public final void setupHighlight(a.C1830a c1830a) {
        ComposeView composeView = this.b;
        composeView.setContent(new jai(1863139318, new hp7(8, c1830a, composeView), true));
    }
}
