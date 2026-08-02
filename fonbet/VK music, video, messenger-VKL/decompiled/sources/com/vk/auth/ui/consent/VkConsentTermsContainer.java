package com.vk.auth.ui.consent;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.auth.main.TermsLink;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import xsna.e3m;
import xsna.e43;
import xsna.gzs;
import xsna.iah0;
import xsna.izs;
import xsna.krv0;
import xsna.oao0;
import xsna.pao0;
import xsna.s3q0;

/* compiled from: VkConsentTermsContainer.kt */
/* loaded from: classes15.dex */
public final class VkConsentTermsContainer extends LinearLayout {
    public izs<? super String, s3q0> b;
    public final pao0 c;
    public final LinkedHashSet d;
    public final int e;

    public VkConsentTermsContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.c = new pao0(7);
        this.d = new LinkedHashSet();
        this.e = krv0.m(R.attr.vk_connect_accent, context);
        setOrientation(1);
    }

    public final void a(List<String> list) {
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            TextView textView = new TextView(getContext());
            com.vk.typography.b.k(textView, FontFamily.REGULAR, Float.valueOf(14.0f), 4);
            textView.setTextColor(e3m.f(R.attr.vk_ui_text_secondary, textView.getContext()));
            oao0 oao0Var = new oao0(this.e, 0, getUrlClickListener$common_release(), false);
            oao0Var.a(textView);
            oao0Var.d((String) obj);
            this.d.add(oao0Var);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            if (i > 0) {
                marginLayoutParams.topMargin = iah0.a(12);
            }
            addView(textView, marginLayoutParams);
            i = i2;
        }
    }

    public final izs<String, s3q0> getUrlClickListener$common_release() {
        izs izsVar = this.b;
        if (izsVar != null) {
            return izsVar;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((oao0) it.next()).b();
        }
        super.onDetachedFromWindow();
    }

    public final void setCustomLinkProvider(gzs<? extends List<TermsLink>> gzsVar) {
        this.c.d = gzsVar;
    }

    public final void setUrlClickListener$common_release(izs<? super String, s3q0> izsVar) {
        this.b = izsVar;
    }
}
