package com.vk.newsfeed.common.util;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.newsfeed.common.PostActions;
import com.vk.newsfeed.common.util.a;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.b520;
import xsna.cn70;
import xsna.dhr0;
import xsna.epx;
import xsna.fmc;
import xsna.gpu0;
import xsna.imc;
import xsna.jjv0;
import xsna.krv0;
import xsna.z960;

/* compiled from: ClipBannerAdMenuBuilder.kt */
/* loaded from: classes4.dex */
public final class d implements com.vk.newsfeed.common.util.a {
    public boolean b;
    public boolean c;
    public ArrayList d;
    public String e;
    public z960 f;

    /* compiled from: ClipBannerAdMenuBuilder.kt */
    public static final class a implements jjv0 {
        public final /* synthetic */ fmc b;

        public a(fmc fmcVar) {
            this.b = fmcVar;
        }

        @Override // xsna.jjv0
        public final int n1(int i) {
            return ((imc) ((ArrayList) this.b.y0()).get(i)).c ? 3 : 0;
        }

        @Override // xsna.jjv0
        public final int t(int i) {
            return 0;
        }
    }

    public static gpu0 c(Context context, fmc fmcVar) {
        gpu0 gpu0Var = new gpu0(context);
        gpu0Var.j = new a(fmcVar);
        gpu0Var.h = cn70.b(5);
        gpu0Var.g = cn70.b(4);
        gpu0Var.e = 0;
        gpu0Var.f = cn70.b(1);
        gpu0Var.i = cn70.b(12);
        return gpu0Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.newsfeed.common.util.a
    public final VkContextMenu a(Context context, a.AbstractC1374a abstractC1374a) {
        e.c cVar;
        fmc fmcVar = new fmc();
        fmcVar.e = this.f;
        gpu0 c = c(context, fmcVar);
        String str = this.e;
        if (str != null && str.length() != 0) {
            fmcVar.h = true;
            if (fmcVar.g) {
                fmcVar.g = false;
                fmcVar.x0(new imc(0, str, true));
            } else {
                fmcVar.x0(new imc(0, str, false));
            }
            fmcVar.g = true;
        }
        this.c = false;
        this.b = false;
        ArrayList<b520> arrayList = this.d;
        if (arrayList != null) {
            for (b520 b520Var : arrayList) {
                if (epx.f(b520Var.b, "hide")) {
                    this.c = true;
                } else if (epx.f(b520Var.b, "complain")) {
                    this.b = true;
                } else {
                    String str2 = b520Var.c;
                    if (str2 != null) {
                        switch (str2.hashCode()) {
                            case -1209704364:
                                if (str2.equals("ads_copy_url")) {
                                    fmc.L0(fmcVar, PostActions.ACTION_COPY_ADS_URL.h(), R.string.ads_copy_url, R.drawable.vk_icon_copy_outline_24, 0, 24);
                                    break;
                                } else {
                                    break;
                                }
                            case -720823110:
                                if (str2.equals("adv_info")) {
                                    fmc.L0(fmcVar, PostActions.ACTION_SHOW_ADVERTISER_INFO.h(), R.string.show_advertiser_info, R.drawable.vk_icon_link_circle_24, 0, 24);
                                    break;
                                } else {
                                    break;
                                }
                            case 3121800:
                                if (str2.equals("erid")) {
                                    fmc.N0(fmcVar, PostActions.ACTION_COPY_AD_MARKER.h(), b520Var.a, R.drawable.vk_icon_info_circle_outline_24);
                                    break;
                                } else {
                                    break;
                                }
                            case 95458899:
                                if (str2.equals("debug")) {
                                    fmc.N0(fmcVar, PostActions.ACTION_SHOW_AD_DEBUG_INFO.h(), "Ads Debug", R.drawable.vk_icon_bug_outline_28);
                                    break;
                                } else {
                                    break;
                                }
                            case 895502019:
                                if (str2.equals("ad_marker_template")) {
                                    fmc.N0(fmcVar, PostActions.ACTION_COPY_AD_MARKER.h(), b520Var.a, R.drawable.vk_icon_info_circle_outline_24);
                                    break;
                                } else {
                                    break;
                                }
                            case 1042034210:
                                if (str2.equals("ads_recommendations_info")) {
                                    fmc.L0(fmcVar, PostActions.ACTION_OPEN_RECOMMENDATION_URL.h(), R.string.ads_recommendations_info, R.drawable.vk_icon_advertising_outline_24, 0, 24);
                                    break;
                                } else {
                                    break;
                                }
                            case 1789286912:
                                if (str2.equals("show_advertiser_info")) {
                                    fmc.L0(fmcVar, PostActions.ACTION_SHOW_ADVERTISER_INFO.h(), R.string.show_advertiser_info, R.drawable.vk_icon_link_circle_24, 0, 24);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                }
            }
        }
        if (this.c) {
            fmc.L0(fmcVar, PostActions.ACTION_HIDE_AD_MY_TARGET_NATIVE_AD.h(), R.string.menu_item_hide_not_interesting, R.drawable.vk_icon_block_outline_24, 0, 24);
        }
        if (this.b) {
            fmc.L0(fmcVar, PostActions.ACTION_REPORT.h(), R.string.report_content, R.drawable.vk_icon_report_outline_24, dhr0.t.c(R.attr.vk_ui_background_negative), 8);
        }
        boolean z = fmcVar.h;
        if (abstractC1374a instanceof a.AbstractC1374a.b) {
            View view = ((a.AbstractC1374a.b) abstractC1374a).a;
            int l = krv0.l(R.attr.vk_ui_icon_accent);
            view.getContext();
            e.b bVar = new e.b(view, null, null, l, 6);
            bVar.w = R.layout.ds_internal_context_menu_item;
            cVar = bVar;
        } else {
            if (!(abstractC1374a instanceof a.AbstractC1374a.C1375a)) {
                throw new NoWhenBranchMatchedException();
            }
            a.AbstractC1374a.C1375a c1375a = (a.AbstractC1374a.C1375a) abstractC1374a;
            View view2 = c1375a.a;
            Rect rect = c1375a.b;
            int l2 = krv0.l(R.attr.vk_ui_icon_accent);
            view2.getContext();
            cVar = new e.c(null, rect, view2, l2, 1);
        }
        cVar.e = context;
        cVar.l = fmcVar;
        cVar.o = c;
        cVar.r = cn70.b(19);
        cVar.t = cn70.b(z ? 18 : 21);
        cVar.i(z ? Integer.valueOf(cn70.b(150) + fmcVar.i) : null);
        cVar.m = 0;
        VkContextMenu a2 = cVar.a();
        fmcVar.f = new WeakReference<>(a2);
        return a2;
    }

    @Override // com.vk.newsfeed.common.util.a
    public final com.vk.newsfeed.common.util.a b(z960 z960Var) {
        this.f = z960Var;
        return this;
    }
}
