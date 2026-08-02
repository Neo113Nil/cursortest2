package com.vk.camera.drawing.gradient;

import android.content.Context;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.TextView;
import com.vk.camera.drawing.gradient.StoryEditText;
import com.vk.common.view.EditText;
import com.vk.dto.stories.model.mention.SelectionChangeEditText;
import xsna.aey;
import xsna.h4m0;

/* compiled from: StoryEditText.kt */
/* loaded from: classes14.dex */
public final class StoryEditText extends EditText {
    public aey b;
    public SelectionChangeEditText.a c;

    public StoryEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: xsna.j1m0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                aey aeyVar = StoryEditText.this.b;
                if (aeyVar == null || i != 6) {
                    return false;
                }
                aeyVar.b();
                return true;
            }
        });
    }

    private final Shader getGradientShader() {
        if (getWidth() == 0) {
            return null;
        }
        getHeight();
        return null;
    }

    public final h4m0 getGradient() {
        return null;
    }

    public final SelectionChangeEditText.a getSelectionChangeListener() {
        return this.c;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (this.b == null || i != 4 || keyEvent.getAction() != 1) {
            return super.onKeyPreIme(i, keyEvent);
        }
        aey aeyVar = this.b;
        if (aeyVar != null) {
            aeyVar.a0();
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            getPaint().setShader(null);
        }
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        SelectionChangeEditText.a aVar = this.c;
        if (aVar == null || aVar == null) {
            return;
        }
        aVar.b(i, i2);
    }

    public final void setGradient(h4m0 h4m0Var) {
        requestLayout();
        invalidate();
    }

    public final void setPressKey(aey aeyVar) {
        this.b = aeyVar;
    }

    public final void setSelectionChangeListener(SelectionChangeEditText.a aVar) {
        this.c = aVar;
    }
}
