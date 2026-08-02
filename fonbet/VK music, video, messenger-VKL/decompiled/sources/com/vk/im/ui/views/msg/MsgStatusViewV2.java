package com.vk.im.ui.views.msg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.vk.im.ui.drawables.MsgStatusDrawableV2;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.hp10;

/* compiled from: MsgStatusViewV2.kt */
/* loaded from: classes2.dex */
public final class MsgStatusViewV2 extends View {
    public MsgStatus b;
    public final MsgStatusDrawableV2 c;

    /* compiled from: MsgStatusViewV2.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MsgStatus.values().length];
            try {
                iArr[MsgStatus.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MsgStatus.SENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MsgStatus.UNREAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MsgStatusViewV2(Context context) {
        this(context, null, 0, 14, 0);
    }

    public final MsgStatus getCurrentStatus() {
        return this.b;
    }

    public final Drawable getCurrentStatusDrawable() {
        return this.c;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.c.jumpToCurrentState();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.c.draw(canvas);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = ((i3 - i) - getPaddingRight()) - paddingLeft;
        int i5 = (paddingRight / 2) + paddingLeft;
        int paddingBottom = ((i4 - i2) - getPaddingBottom()) - paddingTop;
        int i6 = (paddingBottom / 2) + paddingTop;
        MsgStatusDrawableV2 msgStatusDrawableV2 = this.c;
        float intrinsicWidth = msgStatusDrawableV2.getIntrinsicWidth();
        float intrinsicHeight = msgStatusDrawableV2.getIntrinsicHeight();
        float min = Math.min(intrinsicWidth / paddingRight, intrinsicHeight / paddingBottom);
        int i7 = (int) (intrinsicWidth * min);
        int i8 = (int) (intrinsicHeight * min);
        int i9 = i5 - (i7 / 2);
        int i10 = i6 - (i8 / 2);
        msgStatusDrawableV2.setBounds(i9, i10, i7 + i9, i8 + i10);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        MsgStatusDrawableV2 msgStatusDrawableV2 = this.c;
        setMeasuredDimension(hp10.b(i, suggestedMinimumWidth, Integer.MAX_VALUE, msgStatusDrawableV2.getIntrinsicWidth() + paddingRight), hp10.b(i2, suggestedMinimumHeight, Integer.MAX_VALUE, msgStatusDrawableV2.getIntrinsicHeight() + paddingBottom));
    }

    public final void setGradientBubble(boolean z) {
        MsgStatusDrawableV2 msgStatusDrawableV2 = this.c;
        Drawable drawable = msgStatusDrawableV2.f;
        Drawable drawable2 = z ? msgStatusDrawableV2.e : msgStatusDrawableV2.d;
        msgStatusDrawableV2.f = drawable2;
        if (drawable != drawable2) {
            msgStatusDrawableV2.invalidateSelf();
        }
    }

    public final void setStatus(MsgStatus msgStatus) {
        this.b = msgStatus;
        int i = a.$EnumSwitchMapping$0[msgStatus.ordinal()];
        MsgStatusDrawableV2.StatusState statusState = i != 1 ? i != 2 ? i != 3 ? MsgStatusDrawableV2.StatusState.READ : MsgStatusDrawableV2.StatusState.UNREAD : MsgStatusDrawableV2.StatusState.SENDING : MsgStatusDrawableV2.StatusState.ERROR;
        MsgStatusDrawableV2 msgStatusDrawableV2 = this.c;
        if (msgStatusDrawableV2.h == statusState) {
            return;
        }
        msgStatusDrawableV2.c();
        msgStatusDrawableV2.h = statusState;
        int i2 = MsgStatusDrawableV2.a.$EnumSwitchMapping$0[statusState.ordinal()];
        if (i2 == 1) {
            msgStatusDrawableV2.a.setAlpha(255);
        } else if (i2 == 2) {
            msgStatusDrawableV2.b.setAlpha(255);
        } else if (i2 != 3) {
            msgStatusDrawableV2.d.setAlpha(255);
            msgStatusDrawableV2.e.setAlpha(255);
        } else {
            msgStatusDrawableV2.c.setAlpha(255);
        }
        msgStatusDrawableV2.invalidateSelf();
    }

    public final void setStatusColor(int i) {
        MsgStatusDrawableV2 msgStatusDrawableV2 = this.c;
        msgStatusDrawableV2.a.setTint(i);
        msgStatusDrawableV2.invalidateSelf();
        msgStatusDrawableV2.b.setTint(i);
        msgStatusDrawableV2.invalidateSelf();
        msgStatusDrawableV2.c.setTint(i);
        msgStatusDrawableV2.invalidateSelf();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.c;
    }

    public MsgStatusViewV2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public MsgStatusViewV2(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ MsgStatusViewV2(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public MsgStatusViewV2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = MsgStatus.READ;
        MsgStatusDrawableV2 msgStatusDrawableV2 = new MsgStatusDrawableV2(context);
        msgStatusDrawableV2.setCallback(this);
        this.c = msgStatusDrawableV2;
        msgStatusDrawableV2.g.setColor(e3m.f(R.attr.vk_legacy_background_content, context));
        msgStatusDrawableV2.invalidateSelf();
    }
}
