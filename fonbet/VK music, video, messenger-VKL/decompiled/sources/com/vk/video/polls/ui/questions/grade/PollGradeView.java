package com.vk.video.polls.ui.questions.grade;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.slider.Slider;
import com.vk.dto.uxpolls.PollQuestion;
import com.vkontakte.android.R;
import xsna.izs;
import xsna.s3q0;
import xsna.xpe0;
import xsna.xrb0;
import xsna.ype0;
import xsna.zpe0;

/* compiled from: PollGradeView.kt */
/* loaded from: classes6.dex */
public final class PollGradeView extends ConstraintLayout implements ype0, Slider.a {
    public final TextView t;
    public final TextView u;
    public final TextView v;
    public final Slider w;
    public izs<? super xrb0, s3q0> x;

    public PollGradeView(Context context) {
        this(context, null, 0, 14, 0);
    }

    @Override // xsna.ti6
    public final void F0(BaseSlider baseSlider, float f, boolean z) {
        izs<? super xrb0, s3q0> izsVar;
        if (!z || (izsVar = this.x) == null) {
            return;
        }
        izsVar.invoke(new xrb0.a.b.C4040a(((Integer) getTag()).intValue(), (int) f));
    }

    @Override // xsna.ype0
    public final void a4(PollQuestion pollQuestion, zpe0 zpe0Var, izs<? super xrb0, s3q0> izsVar) {
        if (pollQuestion instanceof PollQuestion.Grade) {
            this.x = izsVar;
            PollQuestion.Grade grade = (PollQuestion.Grade) pollQuestion;
            this.t.setText(grade.c);
            this.u.setText(grade.f);
            this.v.setText(grade.g);
            float f = grade.e;
            Slider slider = this.w;
            slider.setValueFrom(1.0f);
            slider.setValueTo(f);
            slider.setValue(f / 2);
            setTag(Integer.valueOf(grade.b));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.w.a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.w.n.remove(this);
    }

    @Override // xsna.ype0
    public void setState(xpe0 xpe0Var) {
        if (xpe0Var instanceof xpe0.c) {
            this.w.setValue(((xpe0.c) xpe0Var).a);
        }
    }

    public PollGradeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public PollGradeView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ PollGradeView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public PollGradeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(R.layout.polls_grade_layout, (ViewGroup) this, true);
        this.t = (TextView) findViewById(R.id.polls_grade_title);
        this.u = (TextView) findViewById(R.id.poll_grade_min_text);
        this.v = (TextView) findViewById(R.id.poll_grade_max_text);
        this.w = (Slider) findViewById(R.id.polls_grade_slider);
    }

    @Override // xsna.ype0
    public View getUiView() {
        return this;
    }
}
