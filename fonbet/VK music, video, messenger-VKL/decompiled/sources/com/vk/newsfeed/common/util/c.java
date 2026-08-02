package com.vk.newsfeed.common.util;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.newsfeed.common.util.a;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.ba60;
import xsna.cn70;
import xsna.fb60;
import xsna.gpu0;
import xsna.je40;
import xsna.jjv0;
import xsna.krv0;
import xsna.z960;

/* compiled from: BaseActionsMenuRedesignBuilder.kt */
/* loaded from: classes4.dex */
public abstract class c implements com.vk.newsfeed.common.util.a {
    public z960 b;

    /* compiled from: BaseActionsMenuRedesignBuilder.kt */
    public static final class a implements jjv0 {
        public final /* synthetic */ ba60 b;

        public a(ba60 ba60Var) {
            this.b = ba60Var;
        }

        @Override // xsna.jjv0
        public final int n1(int i) {
            return ((fb60) ((ArrayList) this.b.y0()).get(i)).c ? 3 : 0;
        }

        @Override // xsna.jjv0
        public final int t(int i) {
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.newsfeed.common.util.a
    public final VkContextMenu a(Context context, a.AbstractC1374a abstractC1374a) {
        e.c cVar;
        VkContextMenu d;
        ba60 ba60Var = new ba60();
        ba60Var.e = this.b;
        gpu0 gpu0Var = new gpu0(context);
        gpu0Var.j = new a(ba60Var);
        gpu0Var.h = cn70.b(5);
        gpu0Var.g = cn70.b(4);
        gpu0Var.e = 0;
        gpu0Var.f = cn70.b(1);
        gpu0Var.i = cn70.b(12);
        if (!c(ba60Var) && (d = d(context, abstractC1374a)) != null) {
            return d;
        }
        boolean z = ba60Var.h;
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
        cVar.l = ba60Var;
        cVar.o = gpu0Var;
        cVar.u = cn70.b(36);
        cVar.r = cn70.b(19);
        cVar.t = cn70.b(z ? 18 : 21);
        cVar.i(z ? Integer.valueOf(cn70.b(150) + ba60Var.g) : null);
        cVar.m = 0;
        VkContextMenu a2 = cVar.a();
        ba60Var.f = new WeakReference<>(a2);
        return a2;
    }

    public abstract boolean c(ba60 ba60Var);

    public abstract VkContextMenu d(Context context, a.AbstractC1374a abstractC1374a);

    @Override // com.vk.newsfeed.common.util.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public c b(je40 je40Var) {
        this.b = je40Var;
        return this;
    }
}
