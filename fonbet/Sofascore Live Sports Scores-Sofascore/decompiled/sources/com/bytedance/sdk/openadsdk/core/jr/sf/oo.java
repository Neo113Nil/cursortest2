package com.bytedance.sdk.openadsdk.core.jr.sf;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.tsz;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.widget.gpj;
import com.bytedance.sdk.openadsdk.core.widget.lo;
import com.bytedance.sdk.openadsdk.utils.nac;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.bytedance.sdk.openadsdk.utils.vh;
import com.unity3d.services.UnityAdsConstants;
import defpackage.oem;
import defpackage.rtm;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo extends vj {
    private float bbd;
    private int bg;
    private final int ei;
    private boolean erj;
    private ColorStateList ew;
    private TextView fmh;
    private final Rect fvk;
    private final tsz gd;
    private int gdh;
    private final Rect gh;
    private final Rect gqd;
    private int hoh;
    private TextView hpk;
    private TextView iv;
    private float jq;
    private ImageView kun;
    private final Rect kz;
    private ImageView lrr;
    private View mu;
    private TextView nn;
    private final int otd;
    private ImageView pq;
    private int ptr;
    private ColorStateList pv;
    private float qc;
    private int qcw;
    private float ra;
    private SeekBar ri;
    private View rj;
    private TextView rnn;
    private ColorStateList rt;
    private boolean se;
    private float tmh;
    private TextView tsx;
    private final gpj vgx;
    private int vr;
    private final Rect wax;
    private View xb;
    private final View.OnTouchListener ywp;
    private ImageView zsj;
    private TextView zti;

    public oo(Context context, ViewGroup viewGroup, boolean z, int i, of ofVar, oem oemVar, boolean z2) {
        super(context, viewGroup, z, i, ofVar, oemVar, z2);
        this.gd = new tsz(this);
        this.erj = false;
        this.se = false;
        this.ptr = 0;
        this.hoh = 0;
        this.qcw = 0;
        this.vr = 0;
        this.bg = 0;
        this.kz = new Rect();
        this.gh = new Rect();
        this.gdh = 0;
        this.ywp = new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.oo.7
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 2) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                } else if (actionMasked == 3) {
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                }
                return false;
            }
        };
        this.wax = new Rect();
        this.gqd = new Rect();
        this.fvk = new Rect();
        this.of = lu.pcc().getApplicationContext();
        oo(z2);
        this.gm = viewGroup;
        this.lu = z;
        gpj gpjVar = new gpj(this);
        this.vgx = gpjVar;
        gpjVar.pcc(this.lu);
        DisplayMetrics displayMetrics = this.of.getResources().getDisplayMetrics();
        this.otd = displayMetrics.widthPixels;
        this.ei = displayMetrics.heightPixels;
        this.fum = i;
        this.mk = oemVar;
        this.tz = ofVar;
        oo(8);
        pcc(context, this.gm);
        oo();
        tmg();
    }

    private void jsj() {
        TextView textView = this.fmh;
        if (textView != null) {
            textView.setTextSize(0, this.ra);
            ColorStateList colorStateList = this.rt;
            if (colorStateList != null) {
                this.fmh.setTextColor(colorStateList);
            }
            this.fmh.setAlpha(this.qc);
            this.fmh.setShadowLayer(rj.sf(this.of, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, tz.qf(this.of, "tt_72000000"));
            TextView textView2 = this.fmh;
            Rect rect = this.wax;
            rj.pcc(textView2, rect.left, rect.top, rect.right, rect.bottom);
        }
        TextView textView3 = this.hpk;
        if (textView3 != null) {
            textView3.setTextSize(0, this.bbd);
            ColorStateList colorStateList2 = this.pv;
            if (colorStateList2 != null) {
                this.hpk.setTextColor(colorStateList2);
            }
            this.hpk.setAlpha(this.jq);
            this.hpk.setShadowLayer(rj.sf(this.of, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, tz.qf(this.of, "tt_72000000"));
            TextView textView4 = this.hpk;
            Rect rect2 = this.gqd;
            rj.pcc(textView4, rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
        ImageView imageView = this.zsj;
        if (imageView != null) {
            Rect rect3 = this.fvk;
            rj.pcc(imageView, rect3.left, rect3.top, rect3.right, rect3.bottom);
        }
        ImageView imageView2 = this.zsj;
        if (imageView2 != null) {
            imageView2.setImageDrawable(tz.gm(this.of, "tt_enlarge_video"));
        }
        TextView textView5 = this.rnn;
        if (textView5 != null) {
            ColorStateList colorStateList3 = this.ew;
            if (colorStateList3 != null) {
                textView5.setTextColor(colorStateList3);
            }
            this.rnn.setAlpha(this.tmh);
            TextView textView6 = this.rnn;
            Rect rect4 = this.gqd;
            rj.pcc(textView6, rect4.left, rect4.top, rect4.right, rect4.bottom);
        }
        View view = this.mu;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = this.gdh;
            this.mu.setLayoutParams(layoutParams);
            this.mu.setBackground(vh.pcc(this.of, "tt_video_black_desc_gradient"));
        }
        sf(false, true);
    }

    private void qy() {
        DisplayMetrics displayMetrics = this.of.getResources().getDisplayMetrics();
        TextView textView = this.fmh;
        if (textView != null) {
            this.ra = textView.getTextSize();
            this.fmh.setTextSize(2, 14.0f);
            ColorStateList textColors = this.fmh.getTextColors();
            this.rt = textColors;
            if (textColors != null) {
                this.fmh.setTextColor(-1);
            }
            this.qc = this.fmh.getAlpha();
            this.fmh.setAlpha(0.85f);
            this.fmh.setShadowLayer(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rj.sf(this.of, 0.5f), rj.sf(this.of, 0.5f), tz.qf(this.of, "tt_b2000000"));
            ViewGroup.LayoutParams layoutParams = this.fmh.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.wax.set(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                rj.pcc(this.fmh, (int) TypedValue.applyDimension(1, 16.0f, displayMetrics), this.wax.top, (int) TypedValue.applyDimension(1, 14.0f, displayMetrics), this.wax.bottom);
            }
        }
        TextView textView2 = this.hpk;
        if (textView2 != null) {
            this.bbd = textView2.getTextSize();
            this.hpk.setTextSize(2, 14.0f);
            ColorStateList textColors2 = this.hpk.getTextColors();
            this.pv = textColors2;
            if (textColors2 != null) {
                this.hpk.setTextColor(-1);
            }
            this.jq = this.hpk.getAlpha();
            this.hpk.setAlpha(0.85f);
            this.hpk.setShadowLayer(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rj.sf(this.of, 0.5f), rj.sf(this.of, 0.5f), tz.qf(this.of, "tt_b2000000"));
            ViewGroup.LayoutParams layoutParams2 = this.hpk.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                this.gqd.set(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                TextView textView3 = this.hpk;
                int applyDimension = (int) TypedValue.applyDimension(1, 14.0f, displayMetrics);
                Rect rect = this.gqd;
                rj.pcc(textView3, applyDimension, rect.top, rect.right, rect.bottom);
            }
        }
        ImageView imageView = this.zsj;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                this.fvk.set(marginLayoutParams3.leftMargin, marginLayoutParams3.topMargin, marginLayoutParams3.rightMargin, marginLayoutParams3.bottomMargin);
                ImageView imageView2 = this.zsj;
                Rect rect2 = this.fvk;
                rj.pcc(imageView2, rect2.left, rect2.top, (int) TypedValue.applyDimension(1, 16.0f, displayMetrics), this.fvk.bottom);
            }
        }
        ImageView imageView3 = this.zsj;
        if (imageView3 != null) {
            imageView3.setImageDrawable(tz.gm(this.of, "tt_shrink_fullscreen"));
        }
        TextView textView4 = this.rnn;
        if (textView4 != null) {
            ColorStateList textColors3 = textView4.getTextColors();
            this.ew = textColors3;
            if (textColors3 != null) {
                this.rnn.setTextColor(-1);
            }
            this.tmh = this.rnn.getAlpha();
            this.rnn.setAlpha(0.85f);
            ViewGroup.LayoutParams layoutParams4 = this.rnn.getLayoutParams();
            if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                this.gh.set(marginLayoutParams4.leftMargin, marginLayoutParams4.topMargin, marginLayoutParams4.rightMargin, marginLayoutParams4.bottomMargin);
                TextView textView5 = this.rnn;
                int applyDimension2 = (int) TypedValue.applyDimension(1, 1.0f, displayMetrics);
                Rect rect3 = this.gqd;
                rj.pcc(textView5, applyDimension2, rect3.top, rect3.right, rect3.bottom);
            }
        }
        View view = this.mu;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
            this.gdh = layoutParams5.height;
            layoutParams5.height = (int) TypedValue.applyDimension(1, 49.0f, displayMetrics);
            this.mu.setLayoutParams(layoutParams5);
            this.mu.setBackgroundResource(tz.oo(this.of, "tt_shadow_fullscreen_top"));
        }
        sf(false, true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.vj
    public void gm(boolean z) {
        TextView textView = this.nn;
        if (textView != null) {
            rj.pcc((View) textView, (!this.lu && z) ? 0 : 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.vj
    public void kj() {
        rj.vj(this.wh);
        rj.vj(this.rj);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.vj
    public void oo() {
        super.oo();
        this.vgx.pcc(this.gm);
        rj.pcc((View) this.pq, (this.lu || (this.fum & 1) == 1) ? 8 : 0);
        this.pq.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.oo.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (oo.this.dax()) {
                    oo ooVar = oo.this;
                    ooVar.qy.gm(ooVar, view);
                }
            }
        });
        rj.pcc((View) this.zti, (!this.lu || (this.fum & 2) == 2) ? 0 : 8);
        this.zti.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.oo.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (oo.this.dax()) {
                    oo ooVar = oo.this;
                    ooVar.qy.oo(ooVar, view);
                }
            }
        });
        this.kun.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.oo.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (oo.this.dax()) {
                    oo ooVar = oo.this;
                    ooVar.qy.vj(ooVar, view);
                }
            }
        });
        this.lrr.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.oo.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                oo.this.sf(false, true);
                oo.this.kj();
                oo.this.qf();
                oo.this.dax();
            }
        });
        this.zsj.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.oo.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (oo.this.dax()) {
                    oo ooVar = oo.this;
                    ooVar.qy.sf(ooVar, view);
                }
            }
        });
        this.ri.setThumbOffset(0);
        this.ri.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.oo.6
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                if (oo.this.dax()) {
                    oo ooVar = oo.this;
                    ooVar.qy.pcc(ooVar, i, z);
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar) {
                if (!oo.this.erj && oo.this.of != null) {
                    seekBar.setThumb(vh.pcc(lu.pcc(), "tt_seek_thumb_press"));
                }
                if (oo.this.dax()) {
                    seekBar.setThumbOffset(0);
                    oo ooVar = oo.this;
                    ooVar.qy.sf(ooVar, seekBar.getProgress());
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar) {
                if (!oo.this.erj && oo.this.of != null) {
                    seekBar.setThumb(vh.pcc(lu.pcc(), "tt_seek_thumb_normal"));
                }
                if (oo.this.dax()) {
                    seekBar.setThumbOffset(0);
                    oo ooVar = oo.this;
                    ooVar.qy.pcc(ooVar, seekBar.getProgress());
                }
            }
        });
        this.ri.setOnTouchListener(this.ywp);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.vj, com.bytedance.sdk.openadsdk.core.widget.lo.sf
    public boolean ork() {
        return this.erj;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.vj
    public void pcc(@Nullable ViewGroup viewGroup) {
        if (viewGroup != null && (this.gm.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            this.erj = true;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.gm.getLayoutParams();
            this.hoh = marginLayoutParams.leftMargin;
            this.ptr = marginLayoutParams.topMargin;
            this.qcw = marginLayoutParams.width;
            this.vr = marginLayoutParams.height;
            marginLayoutParams.width = -1;
            marginLayoutParams.height = -1;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            this.gm.setLayoutParams(marginLayoutParams);
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                int[] rules = layoutParams2.getRules();
                this.bg = rules.length > 0 ? rules[3] : 0;
                layoutParams2.addRule(3, 0);
                viewGroup.setLayoutParams(layoutParams2);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                this.kz.set(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                rj.pcc(viewGroup, 0, 0, 0, 0);
            }
            sf(true);
            this.zsj.setImageDrawable(tz.gm(this.of, "tt_shrink_video"));
            this.ri.setThumb(vh.pcc(this.of, "tt_seek_thumb_fullscreen_selector"));
            this.ri.setThumbOffset(0);
            rtm.c(this.gm, false);
            vj(this.erj);
            rj.pcc(this.mu, 8);
            if (!this.lu) {
                rj.pcc((View) this.pq, 8);
                rj.pcc((View) this.zti, 8);
            } else if ((this.fum & 1) == 1) {
                rj.pcc((View) this.pq, 8);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.vj
    public void qf() {
        of ofVar;
        rj.wh(this.wh);
        rj.wh(this.qf);
        rj.vj(this.rj);
        if (this.kj != null && (ofVar = this.tz) != null && ofVar.kez() != null && this.tz.kez().f != null) {
            rj.wh(this.kj);
            com.bytedance.sdk.openadsdk.lo.sf.sf().pcc(this.tz.kez().f, this.tz.kez().b, this.tz.kez().a, this.kj, this.tz);
        }
        if (this.vj.getVisibility() == 0) {
            rj.pcc((View) this.vj, 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.vj
    public void sf(@Nullable ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        if (viewGroup == null || (viewGroup2 = this.gm) == null || !(viewGroup2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        this.erj = false;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.gm.getLayoutParams();
        marginLayoutParams.width = this.qcw;
        marginLayoutParams.height = this.vr;
        marginLayoutParams.leftMargin = this.hoh;
        marginLayoutParams.topMargin = this.ptr;
        this.gm.setLayoutParams(marginLayoutParams);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.addRule(3, this.bg);
            viewGroup.setLayoutParams(layoutParams2);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            Rect rect = this.kz;
            rj.pcc(viewGroup, rect.left, rect.top, rect.right, rect.bottom);
        }
        sf(true);
        this.zsj.setImageDrawable(tz.gm(this.of, "tt_enlarge_video"));
        this.ri.setThumb(vh.pcc(this.of, "tt_seek_thumb_normal"));
        this.ri.setThumbOffset(0);
        rtm.c(this.gm, true);
        vj(this.erj);
        rj.pcc(this.mu, 8);
        if ((this.fum & 2) == 2) {
            rj.pcc((View) this.zti, 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.vj, com.bytedance.sdk.openadsdk.core.widget.lo.sf
    public void vh() {
        pcc(true, false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.vj
    public void vj() {
        this.gd.removeMessages(1);
        this.gd.sendMessageDelayed(this.gd.obtainMessage(1), 2000L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.vj
    public void vy() {
        this.ri.setProgress(0);
        this.ri.setSecondaryProgress(0);
        this.hpk.setText(tz.pcc(this.of, "tt_00_00"));
        this.fmh.setText(tz.pcc(this.of, "tt_00_00"));
        oo(8);
        if (yt()) {
            this.oo.setVisibility(8);
        }
        ImageView imageView = this.kj;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        oo(8);
        rj.pcc(this.xb, 8);
        rj.pcc(this.ork, 8);
        rj.pcc((View) this.vh, 8);
        rj.pcc(this.tmg, 8);
        lo loVar = this.yt;
        if (loVar != null) {
            loVar.pcc(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.vj
    public void wh() {
        this.gd.removeMessages(1);
    }

    private void vj(boolean z) {
        if (z) {
            qy();
        } else {
            jsj();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.vj
    public void sf(boolean z) {
        int i = ork() ? this.ei : this.gbb;
        int i2 = ork() ? this.otd : this.jr;
        if (this.nac <= 0 || this.dax <= 0 || i <= 0) {
            return;
        }
        if (!fum() && !ork() && (this.fum & 8) != 8) {
            i2 = rj.sf(this.of, 228.0f);
        }
        float f = this.dax;
        float f2 = this.nac;
        int i3 = (int) (((i * 1.0f) / f) * f2);
        if (i3 > i2) {
            i = (int) (((i2 * 1.0f) / f2) * f);
        } else {
            i2 = i3;
        }
        if (!z && !ork()) {
            i = this.gbb;
            i2 = this.jr;
        }
        this.oo.pcc(i, i2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.vj
    public boolean sf(int i) {
        SeekBar seekBar = this.ri;
        return seekBar != null && i > seekBar.getSecondaryProgress();
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.vj
    public void pcc(Context context, View view) {
        super.pcc(context, view);
        this.zti = (TextView) view.findViewById(nac.ial);
        this.pq = (ImageView) view.findViewById(nac.gye);
        this.mu = view.findViewById(nac.dt);
        this.kun = (ImageView) view.findViewById(nac.hl);
        this.nn = (TextView) view.findViewById(nac.xfm);
        this.rnn = (TextView) view.findViewById(nac.ct);
        this.tsx = (TextView) view.findViewById(nac.cz);
        this.rj = view.findViewById(nac.dp);
        this.lrr = (ImageView) view.findViewById(nac.esn);
        TextView textView = (TextView) view.findViewById(nac.bq);
        this.iv = textView;
        textView.setText(tz.pcc(context, "tt_video_retry_des_txt"));
        this.ri = (SeekBar) view.findViewById(nac.oa);
        this.hpk = (TextView) view.findViewById(nac.luz);
        this.fmh = (TextView) view.findViewById(nac.qxq);
        this.xb = view.findViewById(nac.wjv);
        this.zsj = (ImageView) view.findViewById(nac.jkz);
        this.vy = view.findViewById(nac.ln);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.vj
    public void pcc(String str) {
        TextView textView = this.nn;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.rnn;
        if (textView2 != null) {
            textView2.setText(str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.vj
    public void pcc(int i) {
        View view = this.xb;
        if (view == null || view.getVisibility() != 0) {
            this.ri.setProgress(i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.vj
    public void pcc(long j, long j2) {
        this.hpk.setText(rtm.b(j2));
        this.fmh.setText(rtm.b(j));
        this.ri.setProgress(rtm.a(j, j2));
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.vj, defpackage.kwm
    public void pcc() {
        pcc(false, this.lu);
        gpj();
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.vj
    public void pcc(long j) {
        this.fmh.setText(rtm.b(j));
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.vj
    public void pcc(of ofVar, WeakReference<Context> weakReference, boolean z) {
        String pcc;
        of ofVar2;
        if (ofVar == null) {
            return;
        }
        pcc(this.gm, lu.pcc());
        pcc(false, this.lu);
        rj.pcc(this.ork, 0);
        rj.pcc((View) this.vh, 0);
        rj.pcc(this.tmg, 0);
        if (this.vh != null && (ofVar2 = this.tz) != null && ofVar2.kez() != null && this.tz.kez().f != null) {
            com.bytedance.sdk.openadsdk.lo.sf.sf().pcc(this.tz.kez().f, this.tz.kez().b, this.tz.kez().a, this.vh, this.tz);
        }
        rj.pcc((View) this.hc, 0);
        int az = ofVar.az();
        if (az != 4) {
            Context context = this.of;
            if (az != 5) {
                pcc = tz.pcc(context, "tt_video_mobile_go_detail");
            } else {
                pcc = tz.pcc(context, "tt_video_dial_phone");
            }
        } else {
            pcc = tz.pcc(this.of, "tt_video_download_apk");
        }
        TextView textView = this.hc;
        if (textView != null) {
            textView.setText(pcc);
            this.hc.setOnClickListener(this.atb);
            this.hc.setOnTouchListener(this.atb);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.vj, defpackage.kwm
    public /* bridge */ /* synthetic */ void pcc(Object obj, WeakReference weakReference, boolean z) {
        pcc((of) obj, (WeakReference<Context>) weakReference, z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.vj, com.bytedance.sdk.component.utils.tsz.pcc
    public void pcc(Message message) {
        if (message.what != 1) {
            return;
        }
        vh();
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.vj
    public void pcc(boolean z, boolean z2, boolean z3) {
        rj.pcc(this.xb, 0);
        if (this.erj) {
            rj.pcc(this.mu, 0);
            rj.pcc((View) this.rnn, 0);
        } else if (z3) {
            rj.pcc(this.mu, 8);
        }
        rj.pcc((View) this.vj, (!z || this.wh.getVisibility() == 0) ? 8 : 0);
        if (!this.lu && !this.erj) {
            if ((this.fum & 1) != 1 && !z3) {
                rj.pcc((View) this.pq, 0);
            }
            rj.pcc((View) this.zti, z3 ? 8 : 0);
        }
        rj.pcc((View) this.hpk, 0);
        rj.pcc((View) this.fmh, 0);
        rj.pcc((View) this.ri, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.vj
    public void pcc(boolean z, boolean z2) {
        rj.pcc(this.xb, 8);
        rj.pcc(this.mu, 8);
        rj.pcc((View) this.vj, 8);
        if (!this.lu && !this.erj) {
            rj.pcc((View) this.pq, 8);
            if ((this.fum & 2) != 2) {
                rj.pcc((View) this.zti, 8);
            }
        } else if ((this.fum & 1) == 1) {
            rj.pcc((View) this.pq, 8);
        }
        if (z2) {
            rj.pcc((View) this.pq, 8);
            rj.pcc((View) this.zti, 8);
        }
        gm(false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.vj, com.bytedance.sdk.openadsdk.core.widget.gpj.pcc
    public void pcc(View view, boolean z) {
        if (ork()) {
            String format = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date());
            of ofVar = this.tz;
            if (ofVar != null && !TextUtils.isEmpty(ofVar.gmh())) {
                pcc(this.tz.gmh());
            }
            this.tsx.setText(format);
        } else {
            pcc("");
            this.tsx.setText("");
        }
        if (this.jsj) {
            return;
        }
        gm(this.lu && !this.erj);
        if (dax()) {
            this.qy.pcc(this, view, true, this.wh.getVisibility() != 0);
        }
    }
}
