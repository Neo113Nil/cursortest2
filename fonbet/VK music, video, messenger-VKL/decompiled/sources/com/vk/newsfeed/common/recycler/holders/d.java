package com.vk.newsfeed.common.recycler.holders;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.newsfeed.common.recycler.holders.LeadFormHolder;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.ShitAttachment;
import java.util.Iterator;
import java.util.List;
import xsna.abg0;
import xsna.bwt0;
import xsna.dhr0;
import xsna.e43;
import xsna.izs;
import xsna.jyy;
import xsna.lpj;
import xsna.naj;
import xsna.pj8;
import xsna.ryy;
import xsna.s3q0;
import xsna.tyy;
import xsna.vif0;

/* compiled from: LeadFormManyAnswersHolder.kt */
/* loaded from: classes4.dex */
public final class d extends vif0<ryy.a.C3642a> {
    public final izs<LeadFormHolder.ButtonAction, s3q0> n;
    public final tyy o;
    public final LinearLayout p;
    public final TextView q;
    public final VkSimpleButton r;
    public final jyy s;

    public d(ViewGroup viewGroup, LeadFormHolder.b bVar, tyy tyyVar) {
        super(viewGroup, R.layout.lead_ads_answers_page, 0);
        this.n = bVar;
        this.o = tyyVar;
        this.p = (LinearLayout) this.itemView.findViewById(R.id.answers_container);
        this.q = (TextView) this.itemView.findViewById(R.id.title);
        VkSimpleButton vkSimpleButton = (VkSimpleButton) this.itemView.findViewById(R.id.button);
        this.r = vkSimpleButton;
        this.s = new jyy();
        vkSimpleButton.setOnClickListener(new pj8(this, 6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.vif0
    public final void i6(ryy.a.C3642a c3642a) {
        ryy.a.C3642a c3642a2 = c3642a;
        this.q.setText(c3642a2.b);
        List<ShitAttachment.LeadForm.LeadFormBlock.Answer> list = c3642a2.e;
        int size = list.size();
        LinearLayout linearLayout = this.p;
        int childCount = linearLayout.getChildCount();
        boolean z = true;
        if (childCount > size) {
            int i = childCount - size;
            for (int i2 = 0; i2 < i; i2++) {
                linearLayout.removeView(linearLayout.getChildAt(i2));
            }
        } else if (size > childCount) {
            int i3 = size - childCount;
            for (int i4 = 0; i4 < i3; i4++) {
                Context context = this.itemView.getContext();
                this.s.getClass();
                FrameLayout a = jyy.a(context);
                AppCompatCheckBox appCompatCheckBox = new AppCompatCheckBox(new lpj(context, R.style.VkCheckBoxTheme));
                appCompatCheckBox.setId(R.id.lead_form_answer);
                appCompatCheckBox.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                appCompatCheckBox.setTextAlignment(6);
                appCompatCheckBox.setLayoutDirection(1);
                appCompatCheckBox.setTextSize(0, context.getResources().getDimension(R.dimen.lead_form_answer_text_size));
                appCompatCheckBox.setClickable(false);
                appCompatCheckBox.setBackgroundColor(0);
                int[][] iArr = {new int[]{-16842912}, new int[]{android.R.attr.state_checked}};
                abg0 abg0Var = dhr0.t;
                appCompatCheckBox.setSupportButtonTintList(new ColorStateList(iArr, new int[]{abg0Var.c(R.attr.vk_ui_icon_tertiary), abg0Var.c(R.attr.vk_ui_icon_accent_themed)}));
                appCompatCheckBox.setTextColor(abg0Var.c(R.attr.vk_ui_text_primary));
                a.setOnClickListener(new naj(appCompatCheckBox, 2));
                a.addView(appCompatCheckBox);
                linearLayout.addView(a);
            }
        }
        Iterator<T> it = list.iterator();
        int i5 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            tyy tyyVar = this.o;
            if (!hasNext) {
                String str = c3642a2.a;
                String str2 = c3642a2.c;
                if (c3642a2.d && !tyyVar.a(str, str2)) {
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
            AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) linearLayout.getChildAt(i5).findViewById(R.id.lead_form_answer);
            appCompatCheckBox2.setText(answer.c);
            ryy.a.C3642a c3642a3 = (ryy.a.C3642a) this.m;
            appCompatCheckBox2.setChecked(tyyVar.g(c3642a3.a, c3642a3.c, answer.b));
            appCompatCheckBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: xsna.pyy
                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                    com.vk.newsfeed.common.recycler.holders.d dVar = com.vk.newsfeed.common.recycler.holders.d.this;
                    tyy tyyVar2 = dVar.o;
                    String str3 = answer.b;
                    if (z2) {
                        ryy.a.C3642a c3642a4 = (ryy.a.C3642a) dVar.m;
                        tyyVar2.i(c3642a4.a, c3642a4.c, str3);
                    } else {
                        ryy.a.C3642a c3642a5 = (ryy.a.C3642a) dVar.m;
                        tyyVar2.h(c3642a5.a, c3642a5.c, str3);
                    }
                    ryy.a.C3642a c3642a6 = (ryy.a.C3642a) dVar.m;
                    String str4 = c3642a6.a;
                    String str5 = c3642a6.c;
                    bwt0.a0(dVar.r, !c3642a6.d || tyyVar2.a(str4, str5));
                }
            });
            i5 = i6;
        }
    }
}
