package com.vk.auth.passport;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.auth.passport.VkPassportView;
import com.vk.core.view.TextViewEllipsizeEnd;
import com.vkontakte.android.R;
import xsna.bpn0;
import xsna.bu0;
import xsna.e3m;
import xsna.em90;
import xsna.f4m;
import xsna.iah0;
import xsna.itk;
import xsna.kr50;
import xsna.m33;
import xsna.pkk;
import xsna.xav0;

/* compiled from: PassportDelegate.kt */
/* loaded from: classes15.dex */
public final class b {
    public static final float D = iah0.b(12.0f);
    public static final pkk E = new pkk(0.4f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.2f, 1.0f);
    public final View A;
    public final bpn0 B;
    public final em90 C;
    public final VkPassportView a;
    public final com.vk.core.ui.image.a<View> b;
    public final itk c;
    public xav0 d;
    public final LinearLayout e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final ImageView i;
    public final TextView j;
    public final TextView k;
    public final TextView l;
    public final TextView m;
    public final View n;
    public final View o;
    public final View p;
    public final View q;
    public final View r;
    public final View s;
    public final View t;
    public final View u;
    public final View v;
    public final View w;
    public final View x;
    public final ImageView y;
    public final View z;

    /* compiled from: PassportDelegate.kt */
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            if (view == null || outline == null) {
                return;
            }
            float f = b.D;
            outline.setRoundRect(-((int) f), 0, view.getWidth(), view.getHeight(), f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(VkPassportView vkPassportView, com.vk.core.ui.image.a<? extends View> aVar, itk itkVar) {
        this.a = vkPassportView;
        this.b = aVar;
        this.c = itkVar;
        this.e = (LinearLayout) vkPassportView.findViewById(R.id.vk_passport_container);
        this.f = (TextView) vkPassportView.findViewById(R.id.vk_passport_title);
        this.g = (TextView) vkPassportView.findViewById(R.id.vk_passport_subtitle);
        this.h = (TextView) vkPassportView.findViewById(R.id.vk_passport_action);
        this.i = (ImageView) vkPassportView.findViewById(R.id.vk_passport_end_icon);
        this.j = (TextView) vkPassportView.findViewById(R.id.vk_dashboard_vkcombo_caption);
        this.k = (TextView) vkPassportView.findViewById(R.id.vk_dashboard_vkcombo_text);
        this.l = (TextView) vkPassportView.findViewById(R.id.vk_dashboard_vkpay_caption);
        this.m = (TextView) vkPassportView.findViewById(R.id.vk_dashboard_vkpay_text);
        View findViewById = vkPassportView.findViewById(R.id.vk_dashboard_vkpay_icon_box);
        this.n = findViewById;
        this.o = vkPassportView.findViewById(R.id.vk_passport_vkpay_combo_container);
        this.p = vkPassportView.findViewById(R.id.vk_passport_container_separator);
        this.q = vkPassportView.findViewById(R.id.vk_passport_vkpay_container);
        this.r = vkPassportView.findViewById(R.id.vk_passport_vkcombo_container);
        View findViewById2 = vkPassportView.findViewById(R.id.vk_dashboard_vkcombo_icon_box);
        this.s = findViewById2;
        this.t = vkPassportView.findViewById(R.id.vk_passport_vkpay_combo_separator);
        this.u = vkPassportView.findViewById(R.id.vk_passport_loading_title);
        this.v = vkPassportView.findViewById(R.id.vk_passport_loading_subtitle);
        this.w = vkPassportView.findViewById(R.id.vk_passport_loading_avatar);
        this.x = vkPassportView.findViewById(R.id.vk_passport_loading_action);
        this.y = (ImageView) vkPassportView.findViewById(R.id.vk_passport_loading_end_icon);
        this.z = vkPassportView.findViewById(R.id.vk_passport_loading_vkpay);
        this.A = vkPassportView.findViewById(R.id.vk_passport_loading_vkpay_separator);
        this.B = new bpn0(new kr50(this, 8));
        bpn0 bpn0Var = new bpn0(new bu0(23));
        findViewById2.setOutlineProvider((ViewOutlineProvider) bpn0Var.getValue());
        findViewById.setOutlineProvider((ViewOutlineProvider) bpn0Var.getValue());
        this.C = new em90(vkPassportView, aVar);
    }

    public final void a(VkPassportView.a aVar) {
        itk itkVar = this.c;
        boolean a2 = itkVar.a(1);
        View view = this.w;
        if (a2) {
            f4m.j(view);
        } else {
            view.setVisibility(0);
        }
        boolean a3 = itkVar.a(2);
        View view2 = this.u;
        if (a3) {
            f4m.j(view2);
        } else {
            view2.setVisibility(0);
        }
        boolean a4 = itkVar.a(4);
        View view3 = this.v;
        if (a4) {
            f4m.j(view3);
        } else {
            view3.setVisibility(0);
        }
        boolean a5 = itkVar.a(8);
        View view4 = this.A;
        View view5 = this.z;
        View view6 = this.p;
        View view7 = this.o;
        LinearLayout linearLayout = this.e;
        VkPassportView vkPassportView = this.a;
        if (a5) {
            Context context = vkPassportView.getContext();
            e3m.a aVar2 = e3m.a;
            linearLayout.setBackground(m33.a(R.drawable.vk_profile_dashboard_passport_ripple, context));
            f4m.j(view7);
            f4m.j(view6);
            f4m.j(view5);
            f4m.j(view4);
        } else {
            Context context2 = vkPassportView.getContext();
            e3m.a aVar3 = e3m.a;
            linearLayout.setBackground(m33.a(R.drawable.vk_profile_dashboard_passport_ripple_top_corners, context2));
            view7.setVisibility(0);
            view6.setVisibility(0);
            view5.setVisibility(0);
            view4.setVisibility(0);
        }
        boolean a6 = itkVar.a(63);
        ImageView imageView = this.y;
        View view8 = this.x;
        if (a6) {
            f4m.n((int) iah0.y(18), view8);
            imageView.setImageTintList(ColorStateList.valueOf(e3m.f(R.attr.vk_ui_text_accent, vkPassportView.getContext())));
            f4m.s(iah0.a(4), view8);
        } else {
            f4m.n((int) iah0.y(12), view8);
            imageView.setImageTintList(ColorStateList.valueOf(e3m.f(R.attr.vk_ui_icon_secondary, vkPassportView.getContext())));
            f4m.s(iah0.a(0), view8);
        }
        String str = aVar.v;
        String str2 = aVar.w;
        TextViewEllipsizeEnd textViewEllipsizeEnd = vkPassportView.d;
        if (textViewEllipsizeEnd == null) {
            textViewEllipsizeEnd = null;
        }
        textViewEllipsizeEnd.b(str, str2, false, true);
        vkPassportView.setContainerMarginSide(aVar.n);
        vkPassportView.setEndIcon(aVar.t);
        int i = aVar.u;
        if (i != 0) {
            vkPassportView.setEndIconColor(i);
        }
    }
}
