package com.vk.catalog2.common.ui.holders.group;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.soloader.MinElf;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockGroup;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.core.view.links.LinkedTextView;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import com.vk.imageloader.view.VKImageView;
import com.vk.toggle.b;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.v;
import io.reactivex.rxjava3.disposables.c;
import kotlin.Pair;
import xsna.a9l;
import xsna.bf2;
import xsna.c5f;
import xsna.f4m;
import xsna.fkq0;
import xsna.flu;
import xsna.gqu;
import xsna.izs;
import xsna.j41;
import xsna.jrh;
import xsna.krv0;
import xsna.l6u;
import xsna.myh;
import xsna.o0r0;
import xsna.o1e0;
import xsna.rik0;
import xsna.rsg0;
import xsna.s3q0;
import xsna.s53;
import xsna.t6g0;
import xsna.xqu;
import xsna.xwk;
import xsna.xz;
import xsna.yfb;
import xsna.ylw;
import xsna.zm00;

/* compiled from: GroupInviteVh.kt */
/* loaded from: classes16.dex */
public final class GroupInviteVh implements CatalogViewHolder, View.OnClickListener {
    public VKImageView b;
    public VKImageView c;
    public TextView d;
    public TextView e;
    public LinkedTextView f;
    public ViewGroup g;
    public View h;
    public View i;
    public Group j;
    public UIBlockGroup k;
    public c l;

    /* compiled from: GroupInviteVh.kt */
    public static final class a implements izs {
        public final /* synthetic */ Group b;
        public final /* synthetic */ GroupInviteVh c;

        public a(Group group, GroupInviteVh groupInviteVh) {
            this.b = group;
            this.c = groupInviteVh;
        }

        @Override // xsna.izs
        public final Object invoke(Object obj) {
            t6g0 t6g0Var = t6g0.b;
            t6g0.b().G0(this.b.c);
            UIBlockGroup uIBlockGroup = this.c.k;
            if (uIBlockGroup != null) {
                if (!uIBlockGroup.B) {
                    o1e0.a.a(new a9l(2));
                }
                uIBlockGroup.B = true;
            }
            return s3q0.a;
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        c cVar = this.l;
        if (cVar == null) {
            cVar = null;
        }
        cVar.dispose();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        Pair pair;
        UIBlockGroup uIBlockGroup = (UIBlockGroup) uIBlock;
        Group group = uIBlockGroup.y;
        this.j = group;
        this.k = uIBlockGroup;
        if (group == null) {
            return;
        }
        VKImageView vKImageView = this.b;
        if (vKImageView == null) {
            vKImageView = null;
        }
        vKImageView.load(group.e);
        TextView textView = this.d;
        if (textView == null) {
            textView = null;
        }
        textView.setText(group.d);
        TextView textView2 = this.e;
        if (textView2 == null) {
            textView2 = null;
        }
        Resources resources = textView2.getContext().getResources();
        int i = group.v;
        String quantityString = resources.getQuantityString(R.plurals.community_members, i, Integer.valueOf(i));
        UserProfile userProfile = group.M;
        if (userProfile != null) {
            pair = new Pair(userProfile != null ? userProfile.h : null, userProfile != null ? userProfile.e : null);
        } else {
            Group group2 = group.N;
            if (group2 != null) {
                pair = new Pair(group2 != null ? group2.e : null, group2 != null ? group2.d : null);
            } else {
                pair = new Pair(null, null);
            }
        }
        String str = (String) pair.d();
        String str2 = (String) pair.g();
        if (group.M == null && group.N == null) {
            VKImageView vKImageView2 = this.c;
            if (vKImageView2 == null) {
                vKImageView2 = null;
            }
            f4m.j(vKImageView2);
        } else {
            VKImageView vKImageView3 = this.c;
            if (vKImageView3 == null) {
                vKImageView3 = null;
            }
            vKImageView3.load(str);
        }
        TextView textView3 = this.e;
        TextView textView4 = textView3 != null ? textView3 : null;
        Context context = (textView3 != null ? textView3 : null).getContext();
        if (str2 == null) {
            str2 = "";
        }
        textView4.setText(context.getString(R.string.community_catalog_invite_description, quantityString, str2));
        if (group.j) {
            c();
        } else if (uIBlockGroup.B) {
            d();
        } else {
            b();
        }
    }

    @SuppressLint({"CheckResult"})
    public final void a(boolean z) {
        rsg0 gquVar;
        Group group = this.j;
        if (group == null) {
            return;
        }
        c();
        ComFeatures comFeatures = ComFeatures.COM_CODEGEN_GROUPS_JOIN;
        comFeatures.getClass();
        if (b.A.a(comFeatures)) {
            gquVar = yfb.x(xqu.a.c((508 & 2) != 0 ? null : zm00.g(!z), null, null, null, fkq0.a(group.c), null, null, null));
        } else {
            gquVar = new gqu(group.c, !z, false, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        }
        rsg0.y0(gquVar, null, null, 3).subscribe(new j41(new a(group, this), 17), new xz(new s53(18, group, this), 25));
    }

    public final void b() {
        ViewGroup viewGroup = this.g;
        if (viewGroup == null) {
            viewGroup = null;
        }
        viewGroup.setVisibility(0);
        LinkedTextView linkedTextView = this.f;
        f4m.j(linkedTextView != null ? linkedTextView : null);
    }

    public final void c() {
        LinkedTextView linkedTextView = this.f;
        if (linkedTextView == null) {
            linkedTextView = null;
        }
        Context context = linkedTextView.getContext();
        if (context == null) {
            return;
        }
        ViewGroup viewGroup = this.g;
        if (viewGroup == null) {
            viewGroup = null;
        }
        f4m.j(viewGroup);
        LinkedTextView linkedTextView2 = this.f;
        if (linkedTextView2 == null) {
            linkedTextView2 = null;
        }
        linkedTextView2.setVisibility(0);
        LinkedTextView linkedTextView3 = this.f;
        if (linkedTextView3 == null) {
            linkedTextView3 = null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ylw ylwVar = new ylw(R.drawable.vk_icon_done_16);
        ylwVar.c = 3;
        ylwVar.e = -1.0f;
        ylwVar.d = true;
        linkedTextView3.setText(spannableStringBuilder.append((CharSequence) ylwVar.b(context)).append((CharSequence) rik0.b(8.0f)).append((CharSequence) context.getString(R.string.community_catalog_invite_accepted)));
        c cVar = this.l;
        (cVar != null ? cVar : null).dispose();
    }

    public final void d() {
        LinkedTextView linkedTextView = this.f;
        if (linkedTextView == null) {
            linkedTextView = null;
        }
        Context context = linkedTextView.getContext();
        if (context == null) {
            return;
        }
        ViewGroup viewGroup = this.g;
        if (viewGroup == null) {
            viewGroup = null;
        }
        f4m.j(viewGroup);
        LinkedTextView linkedTextView2 = this.f;
        if (linkedTextView2 == null) {
            linkedTextView2 = null;
        }
        linkedTextView2.setVisibility(0);
        LinkedTextView linkedTextView3 = this.f;
        if (linkedTextView3 == null) {
            linkedTextView3 = null;
        }
        linkedTextView3.setText(new SpannableStringBuilder().append((CharSequence) context.getString(R.string.community_catalog_invite_declined)));
        c cVar = this.l;
        (cVar != null ? cVar : null).dispose();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_groups_invite, viewGroup, false);
        this.b = (VKImageView) inflate.findViewById(R.id.group_photo);
        this.c = (VKImageView) inflate.findViewById(R.id.invited_photo);
        this.d = (TextView) inflate.findViewById(R.id.title);
        this.e = (TextView) inflate.findViewById(R.id.info);
        this.f = (LinkedTextView) inflate.findViewById(R.id.post_status);
        this.g = (ViewGroup) inflate.findViewById(R.id.button_layout);
        this.h = inflate.findViewById(R.id.positive_button);
        this.i = inflate.findViewById(R.id.negative_button);
        View view = this.h;
        if (view == null) {
            view = null;
        }
        view.setOnClickListener(this);
        View view2 = this.i;
        if (view2 == null) {
            view2 = null;
        }
        view2.setOnClickListener(this);
        VKImageView vKImageView = this.c;
        (vKImageView != null ? vKImageView : null).setOnClickListener(this);
        inflate.setOnClickListener(this);
        this.l = o1e0.a.a.subscribe(new bf2(new l6u(this, 4), 19));
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Group group = this.j;
        if (group == null) {
            return;
        }
        int id = view.getId();
        if (id != R.id.positive_button) {
            if (id == R.id.negative_button) {
                xwk.e().h0().a(view.getContext(), group, new myh(this, 21), new flu(this, 0), new v(13, group, this));
                return;
            } else if (id == R.id.invited_photo) {
                xwk.e().m(view.getContext(), group.L, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                return;
            } else {
                xwk.e().m(view.getContext(), fkq0.e(group.c), new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                return;
            }
        }
        if (group.p != 1) {
            a(true);
            return;
        }
        int l = krv0.l(R.attr.vk_ui_icon_accent);
        view.getContext();
        e.b bVar = new e.b(view, null, null, l, 6);
        bVar.w = R.layout.ds_internal_context_menu_item;
        VkContextMenu.c.c(bVar, R.string.group_event_join, null, false, null, new c5f(this, 25), 30);
        VkContextMenu.c.c(bVar, R.string.group_event_join_unsure, null, false, null, new jrh(this, 15), 30);
        bVar.a().j(false);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
