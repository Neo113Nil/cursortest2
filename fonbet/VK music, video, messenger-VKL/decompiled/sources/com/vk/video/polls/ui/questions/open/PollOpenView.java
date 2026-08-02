package com.vk.video.polls.ui.questions.open;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.formitem.VkTextArea;
import com.vk.dto.uxpolls.PollQuestion;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import io.reactivex.rxjava3.internal.operators.observable.y;
import java.util.concurrent.TimeUnit;
import xsna.a840;
import xsna.gzw;
import xsna.izs;
import xsna.mhy;
import xsna.qno0;
import xsna.qqb0;
import xsna.s3q0;
import xsna.u4u;
import xsna.xgv;
import xsna.xpe0;
import xsna.xrb0;
import xsna.ype0;
import xsna.zpe0;

/* compiled from: PollOpenView.kt */
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes6.dex */
public final class PollOpenView extends FrameLayout implements ype0 {
    public static final /* synthetic */ int e = 0;
    public final VkTextArea b;
    public c c;
    public izs<? super xrb0, s3q0> d;

    public PollOpenView(Context context) {
        this(context, null, 0, 14, 0);
    }

    @Override // xsna.ype0
    public final void a4(PollQuestion pollQuestion, zpe0 zpe0Var, izs<? super xrb0, s3q0> izsVar) {
        if (pollQuestion instanceof PollQuestion.Open) {
            PollQuestion.Open open = (PollQuestion.Open) pollQuestion;
            setTag(Integer.valueOf(open.b));
            PollQuestion.Open.OpenFeedback openFeedback = open.e;
            if (openFeedback != null) {
                this.b.getEditText().setHint(openFeedback.b);
            }
            this.d = izsVar;
            if (zpe0Var.a instanceof zpe0.a.C4194a) {
                setVisibility(0);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c = io.reactivex.rxjava3.kotlin.c.f(3, new y(new gzw.a(new qno0(this.b.getEditText())).y(500L, TimeUnit.MILLISECONDS), a.a, b.a).U(new a840(new u4u(23), 2)), null, null, new xgv(this, 25));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.dispose();
    }

    @Override // xsna.ype0
    public void setState(xpe0 xpe0Var) {
        if (xpe0Var instanceof xpe0.d) {
            boolean z = ((xpe0.d) xpe0Var).a;
            if (!z) {
                mhy.d(this.b);
            }
            setVisibility(z ? 0 : 8);
        }
    }

    public PollOpenView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public PollOpenView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ PollOpenView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public PollOpenView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(R.layout.polls_open_layout, (ViewGroup) this, true);
        setVisibility(8);
        VkTextArea vkTextArea = (VkTextArea) findViewById(R.id.polls_open_question_edittext);
        vkTextArea.setOnTouchListener(new qqb0());
        this.b = vkTextArea;
        this.c = EmptyDisposable.INSTANCE;
    }

    @Override // xsna.ype0
    public View getUiView() {
        return this;
    }
}
