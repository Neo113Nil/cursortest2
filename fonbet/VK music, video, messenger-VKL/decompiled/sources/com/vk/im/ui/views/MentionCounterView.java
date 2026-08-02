package com.vk.im.ui.views;

import android.content.Context;
import android.text.Spannable;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import com.vkontakte.android.R;
import xsna.baf0;
import xsna.bpn0;
import xsna.cj4;
import xsna.dhr0;
import xsna.f5x;
import xsna.iah0;
import xsna.zxj;

/* compiled from: MentionCounterView.kt */
/* loaded from: classes2.dex */
public final class MentionCounterView extends zxj {
    public static final /* synthetic */ int h = 0;
    public final bpn0 f;
    public final bpn0 g;

    public MentionCounterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f = new bpn0(new cj4(26));
        this.g = new bpn0(new f5x(this, 7));
        float f = 4;
        setPadding(iah0.a(f), 0, iah0.a(f), 0);
    }

    public static Spannable f(MentionCounterView mentionCounterView) {
        Spannable newSpannable = Spannable.Factory.getInstance().newSpannable("F");
        newSpannable.setSpan(new ImageSpan(mentionCounterView.getMentionDrawable(), 2), 0, 1, 0);
        return newSpannable;
    }

    private final baf0 getMentionDrawable() {
        return (baf0) this.f.getValue();
    }

    private final Spannable getMentionSpannable() {
        return (Spannable) this.g.getValue();
    }

    @Override // xsna.zxj, xsna.too0
    public final void Ng() {
        e();
        getMentionDrawable().a(dhr0.t.c(this.d ? R.attr.vk_legacy_counter_secondary_text : R.attr.vk_legacy_counter_primary_text));
    }

    @Override // xsna.zxj
    public final void b(int i, StringBuilder sb) {
        sb.append(i > 99 ? "99+" : Integer.valueOf(i));
    }

    public final void i() {
        getCounterSb().setLength(0);
        setText(getMentionSpannable());
    }
}
