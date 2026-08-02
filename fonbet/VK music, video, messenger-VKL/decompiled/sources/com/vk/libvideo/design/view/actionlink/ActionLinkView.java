package com.vk.libvideo.design.view.actionlink;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.libvideo.design.view.actionlink.b;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.bb;
import xsna.bpn0;
import xsna.bwt0;
import xsna.cb;
import xsna.d4;
import xsna.dhr0;
import xsna.e3m;
import xsna.epx;
import xsna.iah0;
import xsna.msy;
import xsna.quy;
import xsna.r20;
import xsna.vsy;
import xsna.z10;

/* compiled from: ActionLinkView.kt */
/* loaded from: classes2.dex */
public final class ActionLinkView extends quy<z10> {
    public static final bpn0 f = new bpn0(new d4(1));
    public final Object c;
    public final Object d;
    public final Object e;

    public ActionLinkView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ImageView getLinkIconView() {
        return (ImageView) this.d.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final AppCompatTextView getLinkTextView() {
        return (AppCompatTextView) this.e.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final a getProductView() {
        return (a) this.c.getValue();
    }

    @Override // xsna.quy
    public final void b() {
        View imageView = new ImageView(getContext());
        imageView.setId(R.id.video_action_link_icon);
        float f2 = 16;
        imageView.setLayoutParams(new LinearLayout.LayoutParams(iah0.a(f2), iah0.a(f2)));
        float f3 = 7;
        bwt0.f0(imageView, iah0.a(f3), 0, iah0.a(f3), 0, 10);
        addView(imageView, 0);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        appCompatTextView.setId(R.id.video_action_link_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setMaxLines(1);
        addView(appCompatTextView);
    }

    @Override // xsna.quy
    public final void c(z10 z10Var) {
        z10 z10Var2 = z10Var;
        b c = z10Var2.c();
        if (c instanceof b.C1229b) {
            b.C1229b c1229b = (b.C1229b) c;
            b.C1229b.a aVar = c1229b.b;
            String str = c1229b.c;
            if (epx.f(aVar, b.C1229b.a.l.c)) {
                bwt0.p0(getLinkIconView(), false);
                AppCompatTextView linkTextView = getLinkTextView();
                linkTextView.setText(str);
                linkTextView.setTextSize(14.0f);
                Context context = linkTextView.getContext();
                e3m.a aVar2 = e3m.a;
                linkTextView.setTextColor(context.getColor(R.color.vk_gray_800));
                linkTextView.setAllCaps(false);
                float f2 = 16;
                linkTextView.setPaddingRelative(iah0.a(f2), iah0.a(5.5f), iah0.a(f2), iah0.a(6.5f));
                bwt0.p0(linkTextView, true);
                setPaddingRelative(0, 0, 0, 0);
            } else if (aVar instanceof b.C1229b.a.j) {
                if (findViewById(R.id.video_action_product) == null) {
                    a productView = getProductView();
                    productView.setId(R.id.video_action_product);
                    productView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                    bwt0.p0(productView, true);
                    addView(productView);
                    setBackgroundColor(0);
                }
                bwt0.p0(getLinkIconView(), false);
                bwt0.p0(getLinkTextView(), false);
                getProductView().a(z10Var2);
            } else {
                boolean z = c1229b.a && str.length() > 0;
                ImageView linkIconView = getLinkIconView();
                linkIconView.setImageDrawable(dhr0.t.b(aVar.a, R.attr.vk_ui_text_primary_invariably));
                bwt0.p0(linkIconView, true);
                AppCompatTextView linkTextView2 = getLinkTextView();
                linkTextView2.setText(str);
                linkTextView2.setTextSize(12.0f);
                dhr0.a.m0(linkTextView2, R.attr.vk_ui_text_primary_invariably);
                linkTextView2.setAllCaps(true);
                linkTextView2.setPaddingRelative(0, 0, iah0.a(16), 0);
                bwt0.p0(linkTextView2, z);
                int a = z ? iah0.a(5) : 0;
                float f3 = 7;
                setPaddingRelative(a, iah0.a(f3), a, iah0.a(f3));
            }
            Integer num = aVar.b;
            setContentDescription(num != null ? getContext().getString(num.intValue()) : null);
        }
    }

    public final void d() {
        getProductView().getClass();
    }

    public final void e(int i) {
        getProductView().g(i);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (findViewById(R.id.video_action_product) == null) {
            i = View.MeasureSpec.makeMeasureSpec(((Number) f.getValue()).intValue(), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    public ActionLinkView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        r20 r20Var = new r20(context, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, r20Var);
        int i2 = 1;
        this.d = msy.a(lazyThreadSafetyMode, new bb(this, i2));
        this.e = msy.a(lazyThreadSafetyMode, new cb(this, i2));
        setFitsSystemWindows(false);
        this.b.getClass();
        if (vsy.d()) {
            b();
        }
    }
}
