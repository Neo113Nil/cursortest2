package com.vk.profile.community.impl.ui.profile.actions;

import android.content.Context;
import android.view.View;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.dto.narratives.Narrative;
import com.vk.profile.community.impl.ui.profile.actions.d;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.cta;
import xsna.d5f;
import xsna.krv0;
import xsna.q34;
import xsna.ru1;
import xsna.s2b;
import xsna.wf9;
import xsna.xah;
import xsna.yah;
import xsna.yq1;
import xsna.yy0;

/* compiled from: CommunityProfileLongClickSideEffectDelegate.kt */
/* loaded from: classes5.dex */
public final class b {
    public final yah a;

    public b(yah yahVar) {
        this.a = yahVar;
    }

    public final void a(d.g gVar) {
        if (!(gVar instanceof d.g.a)) {
            throw new NoWhenBranchMatchedException();
        }
        d.g.a aVar = (d.g.a) gVar;
        boolean z = aVar instanceof d.g.a.C1594a;
        yah yahVar = this.a;
        if (!z) {
            if (!(aVar instanceof d.g.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            d.g.a.b bVar = (d.g.a.b) aVar;
            View view = bVar.b.get();
            if (view == null) {
                return;
            }
            Narrative narrative = bVar.a;
            Context context = view.getContext();
            int l = krv0.l(R.attr.vk_ui_icon_accent);
            view.getContext();
            e.b bVar2 = new e.b(view, null, null, l, 6);
            bVar2.w = R.layout.ds_internal_context_menu_item;
            if (narrative.k) {
                VkContextMenu.c.c(bVar2, R.string.favorites_remove, null, false, null, new cta(yahVar, context, narrative, 1), 30);
            } else {
                VkContextMenu.c.c(bVar2, R.string.favorites_add, null, false, null, new yy0(yahVar, context, narrative, 3), 30);
            }
            if (!narrative.l.isEmpty()) {
                VkContextMenu.c.c(bVar2, R.string.share, null, false, null, new wf9(yahVar, context, narrative, 2), 30);
            }
            bVar2.l(true).g();
            return;
        }
        d.g.a.C1594a c1594a = (d.g.a.C1594a) aVar;
        View view2 = c1594a.b.get();
        if (view2 == null) {
            return;
        }
        Narrative narrative2 = c1594a.a;
        Context context2 = view2.getContext();
        int l2 = krv0.l(R.attr.vk_ui_icon_accent);
        view2.getContext();
        e.b bVar3 = new e.b(view2, null, null, l2, 6);
        bVar3.w = R.layout.ds_internal_context_menu_item;
        VkContextMenu.c.c(bVar3, R.string.favorites_reorder, null, false, null, new yq1(4, yahVar, narrative2), 30);
        if (narrative2.k) {
            VkContextMenu.c.c(bVar3, R.string.favorites_remove, null, false, null, new ru1(yahVar, context2, narrative2, 2), 30);
        } else {
            VkContextMenu.c.c(bVar3, R.string.favorites_add, null, false, null, new s2b(yahVar, context2, narrative2, 2), 30);
        }
        VkContextMenu.c.c(bVar3, R.string.edit, null, false, null, new q34(yahVar, narrative2, context2), 30);
        if (!narrative2.l.isEmpty()) {
            VkContextMenu.c.c(bVar3, R.string.share, null, false, null, new xah(yahVar, context2, narrative2, 0), 30);
        }
        if (narrative2.j) {
            VkContextMenu.c.c(bVar3, R.string.narrative_delete_action, null, false, null, new d5f(context2, yahVar, narrative2, 2), 30);
        }
        bVar3.j();
    }
}
