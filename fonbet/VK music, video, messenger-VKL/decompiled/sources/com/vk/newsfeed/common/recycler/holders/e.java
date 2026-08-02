package com.vk.newsfeed.common.recycler.holders;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.newsfeed.common.recycler.holders.LeadFormHolder;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.ShitAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.abg0;
import xsna.bwt0;
import xsna.bxq;
import xsna.ci0;
import xsna.dhr0;
import xsna.e43;
import xsna.izs;
import xsna.jyy;
import xsna.l44;
import xsna.lpj;
import xsna.ryy;
import xsna.s3q0;
import xsna.tyy;
import xsna.vif0;

/* compiled from: LeadFormOneAnswerHolder.kt */
/* loaded from: classes4.dex */
public final class e extends vif0<ryy.a.b> {
    public final izs<LeadFormHolder.ButtonAction, s3q0> n;
    public final tyy o;
    public final LinearLayout p;
    public final TextView q;
    public final VkSimpleButton r;
    public final jyy s;
    public final a t;

    /* compiled from: LeadFormOneAnswerHolder.kt */
    public final class a {
        public final ArrayList a = new ArrayList();
    }

    public e(ViewGroup viewGroup, LeadFormHolder.b bVar, tyy tyyVar) {
        super(viewGroup, R.layout.lead_ads_answers_page, 0);
        this.n = bVar;
        this.o = tyyVar;
        this.p = (LinearLayout) this.itemView.findViewById(R.id.answers_container);
        this.q = (TextView) this.itemView.findViewById(R.id.title);
        VkSimpleButton vkSimpleButton = (VkSimpleButton) this.itemView.findViewById(R.id.button);
        this.r = vkSimpleButton;
        this.s = new jyy();
        this.t = new a();
        vkSimpleButton.setOnClickListener(new ci0(this, 7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.vif0
    public final void i6(ryy.a.b bVar) {
        this.q.setText(((ryy.a.b) this.m).b);
        List<ShitAttachment.LeadForm.LeadFormBlock.Answer> list = bVar.e;
        int size = list.size();
        LinearLayout linearLayout = this.p;
        int childCount = linearLayout.getChildCount();
        a aVar = this.t;
        boolean z = true;
        if (childCount > size) {
            int i = childCount - size;
            for (int i2 = 0; i2 < i; i2++) {
                View childAt = linearLayout.getChildAt(i2);
                aVar.a.remove((AppCompatRadioButton) childAt.findViewById(R.id.lead_form_answer));
                linearLayout.removeView(childAt);
            }
        } else if (size > childCount) {
            int i3 = size - childCount;
            for (int i4 = 0; i4 < i3; i4++) {
                Context context = this.itemView.getContext();
                this.s.getClass();
                FrameLayout a2 = jyy.a(context);
                AppCompatRadioButton appCompatRadioButton = new AppCompatRadioButton(new lpj(context, R.style.VkRadioCheckBox), null);
                appCompatRadioButton.setId(R.id.lead_form_answer);
                appCompatRadioButton.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                appCompatRadioButton.setTextAlignment(6);
                appCompatRadioButton.setLayoutDirection(1);
                appCompatRadioButton.setTextSize(0, context.getResources().getDimension(R.dimen.lead_form_answer_text_size));
                appCompatRadioButton.setClickable(false);
                appCompatRadioButton.setButtonDrawable(R.drawable.lead_ads_radio_selector);
                abg0 abg0Var = dhr0.t;
                appCompatRadioButton.setButtonTintList(ColorStateList.valueOf(abg0Var.c(R.attr.vk_ui_icon_accent_themed)));
                appCompatRadioButton.setTextColor(abg0Var.c(R.attr.vk_ui_text_primary));
                appCompatRadioButton.setBackgroundColor(0);
                a2.setOnClickListener(new l44(appCompatRadioButton, 6));
                a2.addView(appCompatRadioButton);
                AppCompatRadioButton appCompatRadioButton2 = (AppCompatRadioButton) a2.findViewById(R.id.lead_form_answer);
                aVar.a.add(appCompatRadioButton2);
                a2.setOnClickListener(new bxq(1, this, appCompatRadioButton2));
                linearLayout.addView(a2);
            }
        }
        Iterator<T> it = list.iterator();
        int i5 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            tyy tyyVar = this.o;
            if (!hasNext) {
                ryy.a.b bVar2 = (ryy.a.b) this.m;
                String str = bVar2.a;
                String str2 = bVar2.c;
                if (bVar2.d && !tyyVar.a(str, str2)) {
                    z = false;
                }
                bwt0.a0(this.r, z);
                return;
            }
            Object next = it.next();
            int i6 = i5 + 1;
            if (i5 < 0) {
                e43.t();
                throw null;
            }
            final ShitAttachment.LeadForm.LeadFormBlock.Answer answer = (ShitAttachment.LeadForm.LeadFormBlock.Answer) next;
            AppCompatRadioButton appCompatRadioButton3 = (AppCompatRadioButton) linearLayout.getChildAt(i5).findViewById(R.id.lead_form_answer);
            appCompatRadioButton3.setText(answer.c);
            appCompatRadioButton3.setOnCheckedChangeListener(null);
            ryy.a.b bVar3 = (ryy.a.b) this.m;
            appCompatRadioButton3.setChecked(tyyVar.g(bVar3.a, bVar3.c, answer.b));
            appCompatRadioButton3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: xsna.qyy
                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                    com.vk.newsfeed.common.recycler.holders.e eVar = com.vk.newsfeed.common.recycler.holders.e.this;
                    tyy tyyVar2 = eVar.o;
                    String str3 = answer.b;
                    if (z2) {
                        ryy.a.b bVar4 = (ryy.a.b) eVar.m;
                        tyyVar2.i(bVar4.a, bVar4.c, str3);
                    } else {
                        ryy.a.b bVar5 = (ryy.a.b) eVar.m;
                        tyyVar2.h(bVar5.a, bVar5.c, str3);
                    }
                    ryy.a.b bVar6 = (ryy.a.b) eVar.m;
                    String str4 = bVar6.a;
                    String str5 = bVar6.c;
                    bwt0.a0(eVar.r, !bVar6.d || tyyVar2.a(str4, str5));
                }
            });
            i5 = i6;
        }
    }
}
