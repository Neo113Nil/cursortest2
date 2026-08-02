package com.vk.superapp.browser.internal.ui.menu.action;

import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.superapp.browser.internal.ui.banner.PersonalBannerView;
import xsna.iah0;
import xsna.m520;

/* compiled from: PersonalBannerViewHolder.kt */
/* loaded from: classes6.dex */
public final class h extends RecyclerView.e0 {
    public final m520 l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h(c cVar, Context context) {
        super(r0);
        PersonalBannerView personalBannerView = new PersonalBannerView(context, null, 6, 0);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-1, -2);
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = iah0.a(cVar.a.K() ? iah0.a(8) : 0);
        float f = 16;
        bVar.setMarginStart(iah0.a(f));
        bVar.setMarginEnd(iah0.a(f));
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = iah0.a(12);
        personalBannerView.setLayoutParams(bVar);
        this.l = cVar;
        this.itemView.setVisibility(8);
    }
}
