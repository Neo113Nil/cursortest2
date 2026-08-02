package com.vk.newsfeed.common.recycler.holders;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.newsfeed.common.recycler.holders.LeadFormHolder;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.cn70;
import xsna.cqv;
import xsna.f4m;
import xsna.izs;
import xsna.lpj;
import xsna.oa01;
import xsna.ryy;
import xsna.s3q0;
import xsna.tyy;
import xsna.vif0;
import xsna.w16;

/* compiled from: LeadFormTextAnswerHolder.kt */
/* loaded from: classes4.dex */
public final class g extends vif0<ryy.a.c> {
    public final izs<LeadFormHolder.ButtonAction, s3q0> n;
    public final tyy o;
    public final TextView p;
    public final VkSimpleButton q;
    public final AppCompatEditText r;

    public g(ViewGroup viewGroup, LeadFormHolder.b bVar, tyy tyyVar) {
        super(viewGroup, R.layout.lead_ads_answers_page, 0);
        this.n = bVar;
        this.o = tyyVar;
        LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(R.id.answers_container);
        this.p = (TextView) this.itemView.findViewById(R.id.title);
        VkSimpleButton vkSimpleButton = (VkSimpleButton) this.itemView.findViewById(R.id.button);
        this.q = vkSimpleButton;
        AppCompatEditText appCompatEditText = new AppCompatEditText(new lpj(this.itemView.getContext(), R.style.VKUIEditText), null);
        this.r = appCompatEditText;
        appCompatEditText.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        appCompatEditText.setTextAppearance(R.style.VkUiTypography_Paragraph);
        appCompatEditText.setBackgroundResource(R.drawable.bg_lead_form_edit_text);
        appCompatEditText.setInputType(147457);
        appCompatEditText.setHint(this.itemView.getContext().getString(R.string.lead_ads_text_answer_hint));
        appCompatEditText.setGravity(8388659);
        appCompatEditText.setMinLines(2);
        appCompatEditText.setMaxLines(8);
        f4m.x(cn70.b(12), appCompatEditText);
        f4m.t(cn70.b(12), appCompatEditText);
        appCompatEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: xsna.vyy
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                if (z) {
                    return;
                }
                mhy.c(view.getWindowToken(), com.vk.newsfeed.common.recycler.holders.g.this.itemView.getContext());
            }
        });
        linearLayout.addView(appCompatEditText);
        oa01.a(appCompatEditText, new cqv(this, 6));
        vkSimpleButton.setOnClickListener(new w16(this, 7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.vif0
    public final void i6(ryy.a.c cVar) {
        ryy.a.c cVar2 = (ryy.a.c) this.m;
        String b = this.o.b(cVar2.a, cVar2.c);
        this.r.setText(b);
        if (b == null) {
            b = "";
        }
        bwt0.a0(this.q, !((ryy.a.c) this.m).d || b.length() > 0);
        this.p.setText(((ryy.a.c) this.m).b);
    }
}
