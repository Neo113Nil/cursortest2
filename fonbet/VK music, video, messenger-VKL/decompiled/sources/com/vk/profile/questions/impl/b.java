package com.vk.profile.questions.impl;

import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.core.view.components.topbar.VkTopBar$Middle$Cell$Middle$Text;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.SchemeStat$TypeQuestionItem;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import xsna.a470;
import xsna.b8g;
import xsna.bwt0;
import xsna.cn70;
import xsna.dhr0;
import xsna.dw20;
import xsna.dzf;
import xsna.e3m;
import xsna.e43;
import xsna.g0;
import xsna.hi6;
import xsna.iah0;
import xsna.igh;
import xsna.mpe0;
import xsna.n82;
import xsna.o25;
import xsna.ob;
import xsna.qj8;
import xsna.snx;
import xsna.t9k;
import xsna.tlo0;
import xsna.tq;
import xsna.vlw;
import xsna.x4;
import xsna.x5i;
import xsna.zf1;

/* compiled from: CreateQuestionDialog.kt */
/* loaded from: classes5.dex */
public final class b extends hi6<Object> {
    public static final /* synthetic */ int q1 = 0;
    public ExtendedUserProfile g1;
    public boolean h1;
    public t9k i1;
    public final int j1;
    public VkButton k1;
    public VkButton l1;
    public View m1;
    public VkInputSelect n1;
    public TextView o1;
    public boolean p1;

    /* compiled from: CreateQuestionDialog.kt */
    public static final class a extends dw20.b {
        public final ExtendedUserProfile e;
        public final boolean f;

        public a(Context context, ExtendedUserProfile extendedUserProfile, boolean z) {
            super(z ? bwt0.u(context) : context, null);
            this.e = extendedUserProfile;
            this.f = z;
            c(new a470());
            F0(true);
            G0();
            l(dhr0.t.c(R.attr.vk_ui_background_content));
            x(iah0.a(12));
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            b bVar = new b();
            bVar.g1 = this.e;
            bVar.h1 = this.f;
            return bVar;
        }
    }

    public b() {
        Context context = e43.a;
        this.j1 = (context == null ? null : context).getResources().getInteger(R.integer.questions_max_length);
    }

    @Override // xsna.hi6
    public final Object Yn() {
        return this.i1;
    }

    public final void Zn(boolean z) {
        if (z) {
            VkButton vkButton = this.l1;
            if (vkButton == null) {
                vkButton = null;
            }
            vkButton.setText(R.string.create_question_anonymously);
            VkButton vkButton2 = this.k1;
            (vkButton2 != null ? vkButton2 : null).setText(R.string.create_question_submit_anonymously);
            return;
        }
        VkButton vkButton3 = this.l1;
        if (vkButton3 == null) {
            vkButton3 = null;
        }
        vkButton3.setText(R.string.create_question_public);
        VkButton vkButton4 = this.k1;
        (vkButton4 != null ? vkButton4 : null).setText(R.string.create_question_submit);
    }

    public final ContextWrapper ao() {
        if (!this.h1) {
            return getActivity();
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return bwt0.u(activity);
        }
        return null;
    }

    public final void bo(SchemeStat$TypeQuestionItem.Type type, Boolean bool) {
        UserId c = o25.a().c();
        ExtendedUserProfile extendedUserProfile = this.g1;
        if (extendedUserProfile == null) {
            extendedUserProfile = null;
        }
        UserId userId = extendedUserProfile.a.c;
        VkInputSelect vkInputSelect = this.n1;
        mpe0.b(type, c, userId, null, String.valueOf((vkInputSelect != null ? vkInputSelect : null).getText()), bool, 8);
    }

    @Override // xsna.dw20, xsna.dh6, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (!this.p1) {
            bo(SchemeStat$TypeQuestionItem.Type.CANCEL_SEND_QUESTION, null);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // xsna.hi6, xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        if (this.g1 == null) {
            tn();
            return super.yn(bundle);
        }
        View inflate = LayoutInflater.from(this.h1 ? bwt0.u(requireContext()) : Mn()).inflate(R.layout.create_question_dialog, (ViewGroup) null, false);
        int i = 4;
        dw20.Rn(this, inflate, 4);
        ExtendedUserProfile extendedUserProfile = this.g1;
        if (extendedUserProfile == null) {
            extendedUserProfile = null;
        }
        int i2 = this.j1;
        this.i1 = new t9k(this, extendedUserProfile, i2);
        Context context = inflate.getContext();
        StringBuilder sb = new StringBuilder();
        ExtendedUserProfile extendedUserProfile2 = this.g1;
        if (extendedUserProfile2 == null) {
            extendedUserProfile2 = null;
        }
        String str = extendedUserProfile2.b;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append(' ');
        ExtendedUserProfile extendedUserProfile3 = this.g1;
        if (extendedUserProfile3 == null) {
            extendedUserProfile3 = null;
        }
        String str2 = extendedUserProfile3.e;
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        String sb2 = sb.toString();
        VkTopBar vkTopBar = (VkTopBar) inflate.findViewById(R.id.toolbar);
        vkTopBar.setTransitionHeaderColor(VkTopBar.m.b.a);
        int i3 = 3;
        vkTopBar.setBefore(new VkTopBar.c.d(tq.h(tlo0.Companion, R.string.close), new x5i(this, i), new b8g(e3m.f(R.attr.vk_ui_icon_accent, context)), com.vk.core.compose.component.semantics.b.a(null, new x4(26), 3)));
        ExtendedUserProfile extendedUserProfile4 = this.g1;
        if (extendedUserProfile4 == null) {
            extendedUserProfile4 = null;
        }
        String f = extendedUserProfile4.a.l0().f(cn70.b(24));
        com.vk.core.view.components.topbar.b bVar = new com.vk.core.view.components.topbar.b(new snx(new snx.b.c(new vlw(f != null ? f : "", null), null, null, 14)), com.vk.core.compose.component.semantics.b.a(null, new n82(16), 3), 2);
        VkTopBar$Middle$Cell$Middle$Text.Title title = new VkTopBar$Middle$Cell$Middle$Text.Title(new tlo0.h(context.getString(R.string.create_question_question_for, sb2)), null, com.vk.core.compose.component.semantics.b.a(null, new ob(19), 3), 30);
        int i4 = 6;
        vkTopBar.setMiddle(new VkTopBar.Middle.a(bVar, new VkTopBar$Middle$Cell$Middle$Text(title, null, 6)));
        this.o1 = (TextView) inflate.findViewById(R.id.create_question_tv_hint);
        VkInputSelect vkInputSelect = (VkInputSelect) inflate.findViewById(R.id.create_question_et_text);
        vkInputSelect.postDelayed(new g0(vkInputSelect, 8), 200L);
        this.n1 = vkInputSelect;
        vkInputSelect.setFilters(new InputFilter[]{new dzf(i2)});
        VkInputSelect vkInputSelect2 = this.n1;
        if (vkInputSelect2 == null) {
            vkInputSelect2 = null;
        }
        vkInputSelect2.c(new igh(this, i4));
        VkInputSelect vkInputSelect3 = this.n1;
        (vkInputSelect3 != null ? vkInputSelect3 : null).setMaxLinesNumber(3);
        VkButton vkButton = (VkButton) inflate.findViewById(R.id.question_type_button);
        vkButton.setOnClickListener(new qj8(this, i3));
        this.l1 = vkButton;
        VkButton vkButton2 = (VkButton) inflate.findViewById(R.id.create_question_tv_submit);
        this.k1 = vkButton2;
        bwt0.i0(vkButton2, new zf1(10, this, inflate));
        this.m1 = inflate.findViewById(R.id.create_question_tv_error);
        Zn(false);
        return super.yn(bundle);
    }
}
