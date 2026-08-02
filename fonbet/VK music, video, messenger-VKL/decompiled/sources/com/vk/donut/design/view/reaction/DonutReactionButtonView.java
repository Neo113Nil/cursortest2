package com.vk.donut.design.view.reaction;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vk.donut.design.view.reaction.DonutReactionButtonView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.dne;
import xsna.epx;
import xsna.gzs;
import xsna.hbh0;
import xsna.jrh;
import xsna.krv0;
import xsna.msy;
import xsna.myh;
import xsna.q01;
import xsna.s3q0;
import xsna.too0;
import xsna.xpm0;

/* compiled from: DonutReactionButtonView.kt */
/* loaded from: classes18.dex */
public final class DonutReactionButtonView extends LinearLayout implements too0 {
    public static final /* synthetic */ int h = 0;
    public final Object b;
    public final Object c;
    public final Object d;
    public Integer e;
    public gzs<s3q0> f;
    public gzs<s3q0> g;

    public DonutReactionButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final GradientDrawable getBackgroundDrawable() {
        return (GradientDrawable) this.b.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkImageSimple getIconView() {
        return (VkImageSimple) this.c.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkText getTextView() {
        return (VkText) this.d.getValue();
    }

    @Override // xsna.too0
    public final void Ng() {
        a();
    }

    public final void a() {
        TypedValue typedValue = krv0.a;
        if (epx.f(krv0.i(getContext()), Boolean.TRUE)) {
            getTextView().setTextColor(krv0.m(R.attr.vk_ui_text_contrast, getContext()));
            GradientDrawable backgroundDrawable = getBackgroundDrawable();
            if (backgroundDrawable != null) {
                backgroundDrawable.setColor(krv0.m(R.attr.vk_ui_background_contrast_secondary_alpha, getContext()));
                return;
            }
            return;
        }
        getTextView().setTextColor(krv0.m(R.attr.vk_ui_accent_orange, getContext()));
        GradientDrawable backgroundDrawable2 = getBackgroundDrawable();
        if (backgroundDrawable2 != null) {
            backgroundDrawable2.setColor(krv0.m(R.attr.vk_ui_background_warning, getContext()));
        }
    }

    public final void b(Integer num) {
        if (num == null) {
            getTextView().setVisibility(8);
        } else {
            getTextView().setText(xpm0.a(num.intValue()));
            getTextView().setVisibility(0);
        }
    }

    public final Integer getCount() {
        return this.e;
    }

    public final gzs<s3q0> getOnClickListener() {
        return this.f;
    }

    public final gzs<s3q0> getOnLongClickListener() {
        return this.g;
    }

    public final void setCount(Integer num) {
        this.e = num;
        b(num);
    }

    public final void setIcon(int i) {
        getIconView().setImageResource(i);
    }

    public final void setOnClickListener(gzs<s3q0> gzsVar) {
        this.f = gzsVar;
        setClickable((gzsVar == null && this.g == null) ? false : true);
    }

    public final void setOnLongClickListener(gzs<s3q0> gzsVar) {
        this.g = gzsVar;
        setLongClickable(gzsVar != null);
        setClickable((this.f == null && gzsVar == null) ? false : true);
    }

    public DonutReactionButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        jrh jrhVar = new jrh(this, 8);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, jrhVar);
        this.c = msy.a(lazyThreadSafetyMode, new myh(this, 10));
        this.d = msy.a(lazyThreadSafetyMode, new dne(this, 19));
        View.inflate(context, R.layout.pds_donut_reaction_button, this);
        setBackgroundResource(R.drawable.pds_bg_donut_reaction_button);
        setOrientation(0);
        setPadding(hbh0.b(5, context), hbh0.b(3, context), hbh0.b(4, context), hbh0.b(3, context));
        setOnClickListener(new q01(this, 4));
        setOnLongClickListener(new View.OnLongClickListener() { // from class: xsna.m2o
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                s3q0 s3q0Var;
                gzs<s3q0> gzsVar = DonutReactionButtonView.this.g;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    s3q0Var = s3q0.a;
                } else {
                    s3q0Var = null;
                }
                return s3q0Var != null;
            }
        });
        b(null);
        a();
    }
}
