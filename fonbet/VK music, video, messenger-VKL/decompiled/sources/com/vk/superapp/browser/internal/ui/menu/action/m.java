package com.vk.superapp.browser.internal.ui.menu.action;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.image.VKImageController;
import com.vk.core.ui.themes.VKReplacerView;
import com.vkontakte.android.R;
import defpackage.h0;
import xsna.e370;
import xsna.e3m;
import xsna.iah0;
import xsna.ifx0;
import xsna.jjc;
import xsna.vjo;

/* compiled from: UnifiedMenuHeaderViewHolder.kt */
/* loaded from: classes6.dex */
public final class m extends RecyclerView.e0 {
    public boolean l;
    public final TextView m;
    public final TextView n;
    public final View o;
    public final VKImageController<View> p;

    public m(c cVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(layoutInflater.inflate(R.layout.vk_action_menu_header_item, viewGroup, false));
        TextView textView = (TextView) this.itemView.findViewById(R.id.more);
        this.m = textView;
        this.n = (TextView) this.itemView.findViewById(R.id.title_text);
        this.o = this.itemView.findViewById(R.id.separator);
        VKReplacerView vKReplacerView = (VKReplacerView) this.itemView.findViewById(R.id.header_icon_container);
        ifx0 ifx0Var = e370.c;
        VKImageController<View> create = (ifx0Var == null ? null : ifx0Var).b().create(vKReplacerView.getContext());
        vKReplacerView.a(((com.vk.core.ui.image.c) create).getView());
        this.p = create;
        jjc.g(this.itemView, new h0(26, this, cVar));
        View view = this.itemView;
        view.setBackground(vjo.a(view.getContext(), e3m.f(R.attr.vk_ui_background_tertiary, this.itemView.getContext()), 0, 0, iah0.b(8.0f), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 444));
        textView.setText(R.string.vk_apps_about_service_alternate);
    }
}
