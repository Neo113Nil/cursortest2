package com.vk.photo.editor.markup.view.tools.editor;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.style.CharacterStyle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.afo0;
import xsna.cdi;
import xsna.jio0;
import xsna.lw5;
import xsna.s5j0;
import xsna.u11;
import xsna.ulo0;
import xsna.wk3;

/* compiled from: TextElementEditText.kt */
/* loaded from: classes4.dex */
public final class TextElementEditText extends AppCompatEditText {
    public afo0 b;
    public a c;
    public s5j0 d;

    /* compiled from: TextElementEditText.kt */
    public interface a {
        void b();
    }

    /* compiled from: TextElementEditText.kt */
    public static final /* synthetic */ class c {
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

    public TextElementEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editorTextElementEditTextStyle);
        addTextChangedListener(new b());
        setIncludeFontPadding(false);
        setInputType(671745);
    }

    private final Integer getElementMaxWidth() {
        afo0 afo0Var = this.b;
        if (afo0Var == null) {
            return null;
        }
        jio0 jio0Var = afo0Var.a;
        float f = jio0Var.b - jio0Var.e;
        lw5.a aVar = afo0Var.b.f;
        return Integer.valueOf((int) ((f - aVar.a) - aVar.c));
    }

    public final void a() {
        afo0 afo0Var = this.b;
        if (afo0Var == null || getLayout() == null) {
            return;
        }
        this.d = cdi.r(getLayout(), afo0Var.b);
    }

    public final a getCallback() {
        return this.c;
    }

    public final afo0 getConfig() {
        return this.b;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        int save = canvas.save();
        canvas.translate(paddingLeft, paddingTop);
        try {
            s5j0 s5j0Var = this.d;
            if (s5j0Var != null) {
                s5j0Var.draw(canvas);
            }
            canvas.restoreToCount(save);
            super.onDraw(canvas);
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        a aVar;
        if (i != 4 || keyEvent.getAction() != 1 || (aVar = this.c) == null) {
            return super.onKeyPreIme(i, keyEvent);
        }
        aVar.b();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        Integer elementMaxWidth = getElementMaxWidth();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(elementMaxWidth != null ? elementMaxWidth.intValue() : View.MeasureSpec.getSize(i), View.MeasureSpec.getMode(i)), i2);
        a();
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        a();
    }

    public final void setCallback(a aVar) {
        this.c = aVar;
    }

    public final void setConfig(afo0 afo0Var) {
        this.b = afo0Var;
        requestLayout();
        afo0 afo0Var2 = this.b;
        if (afo0Var2 == null) {
            return;
        }
        jio0 jio0Var = afo0Var2.a;
        jio0.a aVar = jio0Var.c;
        jio0.b bVar = jio0Var.f;
        Layout.Alignment alignment = jio0Var.g;
        TextPaint paint = getPaint();
        bVar.getClass();
        paint.setShadowLayer(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
        int[] iArr = c.$EnumSwitchMapping$0;
        int i = iArr[alignment.ordinal()];
        int i2 = 1;
        setTextAlignment(i != 1 ? i != 2 ? 4 : 6 : 5);
        int i3 = iArr[alignment.ordinal()];
        if (i3 == 1) {
            i2 = 8388611;
        } else if (i3 == 2) {
            i2 = 8388613;
        }
        setGravity(i2 | 16);
        setTypeface(aVar.b);
        float f = jio0Var.d;
        float f2 = aVar.d;
        float f3 = aVar.c;
        setTextSize(0, u11.b(f2, f3, f, f3));
        ulo0 ulo0Var = jio0Var.h;
        ulo0Var.getClass();
        setLineSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ulo0Var.a);
        getPaint().setPathEffect(jio0Var.i.provide());
        setTextColor(jio0Var.a.a());
        a();
        requestLayout();
        invalidate();
    }

    /* compiled from: TextElementEditText.kt */
    public static final class b implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            wk3 wk3Var = new wk3((CharacterStyle[]) editable.getSpans(0, editable.length(), CharacterStyle.class));
            while (wk3Var.hasNext()) {
                editable.removeSpan((CharacterStyle) wk3Var.next());
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
