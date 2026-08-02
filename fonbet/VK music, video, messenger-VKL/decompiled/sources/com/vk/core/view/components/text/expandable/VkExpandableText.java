package com.vk.core.view.components.text.expandable;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.vkontakte.android.R;
import xsna.cut0;
import xsna.epx;
import xsna.fd6;
import xsna.gpo0;
import xsna.gzs;
import xsna.s3q0;
import xsna.tlo0;
import xsna.u7q;
import xsna.wo1;
import xsna.x7g;

/* compiled from: VkExpandableText.kt */
/* loaded from: classes17.dex */
public final class VkExpandableText extends fd6 {
    public static final /* synthetic */ int S = 0;
    public a Q;
    public int R;

    /* compiled from: VkExpandableText.kt */
    public static final class a {
        public final tlo0 a;
        public final cut0 b;
        public final Typeface c;
        public final gzs<s3q0> d;

        public a() {
            throw null;
        }

        public a(tlo0 tlo0Var, x7g x7gVar, Typeface typeface, gzs gzsVar, int i) {
            x7gVar = (i & 2) != 0 ? null : x7gVar;
            typeface = (i & 4) != 0 ? null : typeface;
            gzsVar = (i & 8) != 0 ? null : gzsVar;
            this.a = tlo0Var;
            this.b = x7gVar;
            this.c = typeface;
            this.d = gzsVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            cut0 cut0Var = this.b;
            int hashCode2 = (hashCode + (cut0Var == null ? 0 : cut0Var.hashCode())) * 31;
            Typeface typeface = this.c;
            int hashCode3 = (hashCode2 + (typeface == null ? 0 : typeface.hashCode())) * 31;
            gzs<s3q0> gzsVar = this.d;
            return Boolean.hashCode(false) + ((hashCode3 + (gzsVar == null ? 0 : gzsVar.hashCode())) * 31);
        }

        public final String toString() {
            return "ExpandButton(text=" + this.a + ", textColor=" + this.b + ", textTypeface=" + this.c + ", onClick=" + this.d + ", expandDisabled=false)";
        }
    }

    public VkExpandableText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    @Override // xsna.fd6, xsna.too0
    public final void Ng() {
        super.Ng();
        a aVar = this.Q;
        if (aVar != null) {
            n(aVar);
        }
    }

    public final a getExpandButton() {
        return this.Q;
    }

    public final int getMaxCollapsedLines() {
        return this.R;
    }

    public final void n(a aVar) {
        if (aVar == null) {
            return;
        }
        u7q u7qVar = new u7q();
        u7qVar.b = null;
        u7qVar.c = true;
        cut0 cut0Var = aVar.b;
        u7qVar.d = Integer.valueOf(cut0Var != null ? cut0Var.b(getContext()) : gpo0.d(R.attr.vk_ui_text_link, this));
        u7qVar.e = aVar.c;
        u7qVar.b = new wo1(20, aVar, this);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(aVar.a.a(getContext()));
        spannableStringBuilder.setSpan(u7qVar, 0, spannableStringBuilder.length(), 33);
        setShowMoreText(spannableStringBuilder);
    }

    public final void o() {
        setShouldTruncate(true);
        setMaxLines(getMinTrimmedTextLines() + getMaxExcerptTextLines());
        setEllipsize(TextUtils.TruncateAt.END);
    }

    public final void q() {
        setShouldTruncate(false);
        setMaxLines(Integer.MAX_VALUE);
        setEllipsize(null);
    }

    public final void setExpandButton(a aVar) {
        this.Q = aVar;
        n(aVar);
    }

    public final void setMaxCollapsedLines(int i) {
        this.R = i;
        setMaxExcerptLines(i);
    }

    public VkExpandableText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.R = 3;
        setAvailableShowMoreExpandSpanMeasureStrategy(true);
        setMaxExcerptLines(this.R);
    }
}
