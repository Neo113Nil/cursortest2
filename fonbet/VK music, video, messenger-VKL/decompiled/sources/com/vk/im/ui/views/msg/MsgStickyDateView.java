package com.vk.im.ui.views.msg;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import xsna.ci30;
import xsna.dhr0;
import xsna.too0;

/* compiled from: MsgStickyDateView.kt */
/* loaded from: classes2.dex */
public final class MsgStickyDateView extends AppCompatTextView implements too0 {
    public int b;
    public final ci30 c;
    public final StringBuffer d;
    public long e;

    public MsgStickyDateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = -1;
        this.c = new ci30(getContext());
        this.d = new StringBuffer();
        this.e = -1L;
    }

    @Override // xsna.too0
    public final void Ng() {
        int i = this.b;
        if (i != -1) {
            setBackground(dhr0.t.a(i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void setBackgroundResource(int i) {
        this.b = i;
        super.setBackgroundResource(i);
    }

    public final void setDate(long j) {
        if (this.e != j) {
            this.e = j;
            StringBuffer stringBuffer = this.d;
            stringBuffer.setLength(0);
            this.c.b(j, stringBuffer);
            setText(stringBuffer);
        }
    }
}
