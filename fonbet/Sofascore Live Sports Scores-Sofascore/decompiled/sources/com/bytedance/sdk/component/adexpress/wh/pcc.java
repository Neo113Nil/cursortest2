package com.bytedance.sdk.component.adexpress.wh;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.bytedance.sdk.component.utils.tsz;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc extends TextSwitcher implements ViewSwitcher.ViewFactory, tsz.pcc {
    private Handler gbb;
    private int gm;
    private int hc;
    private int kj;
    private final int oo;
    private int ork;
    Animation.AnimationListener pcc;
    private int qf;
    private List<String> sf;
    private int tmg;
    private int vh;
    private Context vj;
    private float vy;
    private TextView wh;

    public pcc(Context context, int i, float f, int i2, int i3) {
        super(context);
        this.sf = new ArrayList();
        this.gm = 0;
        this.oo = 1;
        this.gbb = new tsz(Looper.getMainLooper(), this);
        this.pcc = new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.wh.pcc.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (pcc.this.wh != null) {
                    pcc.this.wh.setText("");
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        };
        this.vj = context;
        this.kj = i;
        this.vy = f;
        this.ork = i2;
        this.hc = i3;
        gm();
    }

    private void gm() {
        setFactory(this);
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        TextView textView = new TextView(getContext());
        this.wh = textView;
        textView.setTextColor(this.kj);
        this.wh.setTextSize(this.vy);
        this.wh.setMaxLines(this.ork);
        this.wh.setTextAlignment(this.hc);
        return this.wh;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.gbb.sendEmptyMessageDelayed(1, this.qf);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.gbb.removeMessages(1);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        try {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(com.bytedance.sdk.component.adexpress.dynamic.vj.vh.sf(this.sf.get(this.vh), this.vy, false)[0], 1073741824), i);
        } catch (Exception unused) {
            super.onMeasure(i, i2);
        }
    }

    public void pcc() {
        int i = this.tmg;
        if (i == 1) {
            setInAnimation(getContext(), com.bytedance.sdk.component.utils.tz.vy(this.vj, "tt_text_animation_y_in"));
            setOutAnimation(getContext(), com.bytedance.sdk.component.utils.tz.vy(this.vj, "tt_text_animation_y_out"));
        } else if (i == 0) {
            setInAnimation(getContext(), com.bytedance.sdk.component.utils.tz.vy(this.vj, "tt_text_animation_x_in"));
            setOutAnimation(getContext(), com.bytedance.sdk.component.utils.tz.vy(this.vj, "tt_text_animation_x_in"));
            getInAnimation().setInterpolator(new LinearInterpolator());
            getOutAnimation().setInterpolator(new LinearInterpolator());
            getInAnimation().setAnimationListener(this.pcc);
            getOutAnimation().setAnimationListener(this.pcc);
        }
        this.gbb.sendEmptyMessage(1);
    }

    public void setAnimationDuration(int i) {
        this.qf = i;
    }

    public void setAnimationText(List<String> list) {
        this.sf = list;
    }

    public void setAnimationType(int i) {
        this.tmg = i;
    }

    public void setMaxLines(int i) {
        this.ork = i;
    }

    public void setTextColor(int i) {
        this.kj = i;
    }

    public void setTextSize(float f) {
        this.vy = f;
    }

    public void sf() {
        List<String> list = this.sf;
        if (list == null || list.size() <= 0) {
            return;
        }
        int i = this.gm;
        this.gm = i + 1;
        this.vh = i;
        setText(this.sf.get(i));
        if (this.gm > this.sf.size() - 1) {
            this.gm = 0;
        }
    }

    @Override // com.bytedance.sdk.component.utils.tsz.pcc
    public void pcc(Message message) {
        if (message.what != 1) {
            return;
        }
        sf();
        this.gbb.sendEmptyMessageDelayed(1, this.qf);
    }
}
