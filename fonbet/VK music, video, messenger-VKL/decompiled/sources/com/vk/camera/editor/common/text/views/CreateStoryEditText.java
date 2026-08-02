package com.vk.camera.editor.common.text.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;
import com.vk.log.L;
import java.lang.reflect.Field;
import xsna.gz80;
import xsna.hko0;
import xsna.hv5;
import xsna.iah0;
import xsna.pjo0;
import xsna.rl3;

/* compiled from: CreateStoryEditText.kt */
/* loaded from: classes16.dex */
public final class CreateStoryEditText extends hv5 implements hko0, GestureDetector.OnGestureListener {
    public static final int j = iah0.a(32);
    public a d;
    public int e;
    public pjo0 f;
    public boolean g;
    public final GestureDetector h;
    public final Rect i;

    /* compiled from: CreateStoryEditText.kt */
    public interface a {
        void a();
    }

    /* compiled from: CreateStoryEditText.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CreateStoryEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = true;
        this.h = new GestureDetector(getContext(), this);
        this.i = new Rect();
        setIncludeFontPadding(false);
        setInputType(671745);
        b();
    }

    public final void a() {
        if (!this.g) {
            return;
        }
        pjo0 pjo0Var = this.f;
        if (pjo0Var != null) {
            pjo0Var.b(this);
        }
        int lineCount = getLayout().getLineCount();
        Rect rect = new Rect();
        int i = 0;
        int i2 = 0;
        while (true) {
            Rect rect2 = this.i;
            if (i >= lineCount) {
                int i3 = -j;
                rect2.inset(i3, i3);
                this.g = false;
                return;
            }
            h(i, rect);
            if (i2 < rect.width()) {
                i2 = rect.width();
                rect2.left = rect.left;
                rect2.right = rect.right;
            }
            if (i == 0) {
                rect2.top = rect.top;
            }
            if (i == lineCount - 1) {
                rect2.bottom = rect.bottom;
            }
            i++;
        }
    }

    public final void b() {
        Integer num = (Integer) rl3.d0(new Integer[]{Integer.valueOf(getPaddingLeft()), Integer.valueOf(getPaddingTop()), Integer.valueOf(getPaddingRight()), Integer.valueOf(getPaddingBottom())});
        if (num != null) {
            if (gz80.a(29)) {
                L.e("CreateStoryEditText reflection hack wasn't engaged - running at least Q");
                return;
            }
            try {
                Field declaredField = TextView.class.getDeclaredField("mShadowRadius");
                declaredField.setAccessible(true);
                declaredField.set(this, num);
            } catch (Exception e) {
                L.g("CreateStoryEditText reflection hack didn't work", e);
            }
        }
    }

    @Override // xsna.hko0
    public float getLineSpacing() {
        return getLineSpacingExtra();
    }

    @Override // xsna.hko0
    public float getMultiplier() {
        return getLineSpacingMultiplier();
    }

    public final a getOnOutsideTextAreaClicked() {
        return this.d;
    }

    public final int getTopOutsideAreaMargin() {
        return this.e;
    }

    @Override // xsna.hko0
    public final void h(int i, Rect rect) {
        getLineBounds(i, rect);
        rect.left = (int) getLayout().getLineLeft(i);
        rect.right = (int) getLayout().getLineRight(i);
        rect.offset(getCompoundPaddingLeft(), 0);
    }

    @Override // xsna.hko0
    public final String j(int i) {
        return String.valueOf(getText()).substring(getLayout().getLineStart(i), getLayout().getLineEnd(i));
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        a();
        pjo0 pjo0Var = this.f;
        if (pjo0Var != null) {
            pjo0Var.draw(canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.g = true;
        a();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (motionEvent.getY() <= this.e) {
            return false;
        }
        if (this.i.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.a();
        }
        return true;
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        this.g = true;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent) || this.h.onTouchEvent(motionEvent);
    }

    public final void setOnOutsideTextAreaClicked(a aVar) {
        this.d = aVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        b();
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        b();
    }

    @Override // android.widget.TextView
    public final void setShadowLayer(float f, float f2, float f3, int i) {
        super.setShadowLayer(f, f2, f3, i);
        b();
    }

    public final void setTopOutsideAreaMargin(int i) {
        this.e = i;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
