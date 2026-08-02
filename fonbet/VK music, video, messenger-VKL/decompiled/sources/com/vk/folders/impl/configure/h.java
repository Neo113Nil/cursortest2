package com.vk.folders.impl.configure;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n0;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.folders.impl.configure.g;
import com.vk.folders.impl.configure.i;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.im.popup.Popup;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.ao50;
import xsna.ayr;
import xsna.bpn0;
import xsna.bwt0;
import xsna.c5g;
import xsna.dhr0;
import xsna.du90;
import xsna.e4;
import xsna.fi6;
import xsna.gmp;
import xsna.hfz;
import xsna.ikv0;
import xsna.jpf;
import xsna.kbe;
import xsna.lwb0;
import xsna.m2j;
import xsna.m33;
import xsna.mh4;
import xsna.p3v;
import xsna.q5f;
import xsna.qbj;
import xsna.qgh0;
import xsna.qj0;
import xsna.r3v;
import xsna.sjo;
import xsna.te0;
import xsna.txr;
import xsna.u9;
import xsna.wt90;
import xsna.wxr;
import xsna.xt90;
import xsna.yn50;
import xsna.yra;
import xsna.ys90;
import xsna.yt90;
import xsna.yve;

/* compiled from: FolderConfigurationViewController.kt */
/* loaded from: classes18.dex */
public final class h extends fi6<ayr, g> {
    public final boolean f;
    public VkTopBar g;
    public VkButton h;
    public View i;
    public RecyclerView j;
    public ProgressBar k;
    public txr l;
    public final bpn0 m;
    public final bpn0 n;
    public final bpn0 o;
    public final bpn0 p;

    /* compiled from: FolderConfigurationViewController.kt */
    public static final class a extends RecyclerView.t {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            h.this.R();
        }
    }

    public h(boolean z) {
        super(R.layout.vkim_folder_configuration_fragment, null);
        this.f = z;
        this.m = new bpn0(new q5f(this, 22));
        this.n = new bpn0(new te0(18));
        this.o = new bpn0(new kbe(this, 23));
        this.p = new bpn0(new jpf(this, 21));
    }

    @Override // xsna.fi6
    public final void Q(View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        this.g = (VkTopBar) view.findViewById(R.id.im_toolbar);
        this.h = (VkButton) view.findViewById(R.id.vkim_confirm_btn);
        this.i = view.findViewById(R.id.vkim_confirm_btn_group);
        this.j = (RecyclerView) view.findViewById(R.id.vkim_recycler_view);
        this.k = (ProgressBar) view.findViewById(R.id.vkim_folder_config_progress);
        RecyclerView recyclerView = this.j;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.addOnScrollListener(new a());
        RecyclerView recyclerView2 = this.j;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        ((n0) recyclerView2.getItemAnimator()).g = false;
        txr txrVar = new txr(new b());
        this.l = txrVar;
        txrVar.setHasStableIds(true);
        txr txrVar2 = this.l;
        if (txrVar2 == null) {
            txrVar2 = null;
        }
        RecyclerView recyclerView3 = this.j;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        qj0.a(txrVar2, recyclerView3, new qgh0.a());
        RecyclerView recyclerView4 = this.j;
        if (recyclerView4 == null) {
            recyclerView4 = null;
        }
        txr txrVar3 = this.l;
        if (txrVar3 == null) {
            txrVar3 = null;
        }
        recyclerView4.setAdapter(txrVar3);
        VkTopBar vkTopBar = this.g;
        if (vkTopBar == null) {
            vkTopBar = null;
        }
        vkTopBar.setShowBottomDivider(true);
        VkTopBar vkTopBar2 = this.g;
        if (vkTopBar2 == null) {
            vkTopBar2 = null;
        }
        qbj qbjVar = new qbj(this, 9);
        SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.ClearAndSet;
        vkTopBar2.setBack(new VkTopBar.b(qbjVar, null, null, null, com.vk.core.compose.component.semantics.b.a(mode, new yve(this, 24), 2), 14));
        VkTopBar vkTopBar3 = this.g;
        if (vkTopBar3 == null) {
            vkTopBar3 = null;
        }
        Context context = viewGroup.getContext();
        boolean z = this.f;
        vkTopBar3.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(z ? context.getString(R.string.vkim_folder_create_title) : context.getString(R.string.vkim_folder_configure_title), (e4) null, (VkTopBar.Middle.Text.Title.a) null, (VkTopBar.Middle.Text.Title.Size) null, 14), null, null, com.vk.core.compose.component.semantics.b.a(mode, new u9(16, this, view), 2), 6));
        VkButton vkButton = this.h;
        if (vkButton == null) {
            vkButton = null;
        }
        vkButton.setOnClickListener(new gmp(this, 2));
        VkButton vkButton2 = this.h;
        VkButton vkButton3 = vkButton2 != null ? vkButton2 : null;
        Context context2 = viewGroup.getContext();
        vkButton3.setText(z ? context2.getString(R.string.vkim_create_folder) : context2.getString(R.string.vkim_configure_folder));
    }

    public final void R() {
        RecyclerView recyclerView = this.j;
        if (recyclerView == null) {
            recyclerView = null;
        }
        int x = ((LinearLayoutManager) recyclerView.getLayoutManager()).x();
        if (x == -1) {
            O(new g.d(0));
        } else {
            O(new g.d(x));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ei6, xsna.wn50
    public final void j(yn50 yn50Var) {
        i iVar = (i) yn50Var;
        boolean z = iVar instanceof i.d;
        bpn0 bpn0Var = this.m;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (!z) {
            if (iVar instanceof i.a) {
                R();
                return;
            }
            if (iVar instanceof i.c) {
                com.vk.im.popup.a aVar = (com.vk.im.popup.a) bpn0Var.getValue();
                RecyclerView recyclerView = this.j;
                com.vk.im.popup.a.d(aVar, new r3v((recyclerView != null ? recyclerView : null).getContext()), new m2j(this, 13), null, null, 12);
                return;
            } else {
                if (!(iVar instanceof i.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                VkTopBar vkTopBar = this.g;
                if (vkTopBar == null) {
                    vkTopBar = null;
                }
                String string = vkTopBar.getContext().getString(R.string.error);
                VkTopBar vkTopBar2 = this.g;
                if (vkTopBar2 == null) {
                    vkTopBar2 = null;
                }
                ikv0.a aVar2 = new ikv0.a(vkTopBar2.getContext());
                aVar2.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_outline_24, Integer.valueOf(R.attr.vk_ui_icon_negative), (Size) (objArr3 == true ? 1 : 0), 12);
                aVar2.u = new ikv0.d(new ikv0.d.c(string), (ikv0.d.b) (objArr2 == true ? 1 : 0), (ikv0.d.a) (objArr == true ? 1 : 0), 6);
                aVar2.n();
                return;
            }
        }
        i.d dVar = (i.d) yn50Var;
        wt90 wt90Var = dVar.b;
        List<yt90> list = dVar.a;
        txr txrVar = this.l;
        if (txrVar == null) {
            txrVar = null;
        }
        Iterator<hfz> it = txrVar.h.f.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            hfz next = it.next();
            if ((next instanceof wt90) && ((wt90) next).b == wt90Var.b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        RecyclerView recyclerView2 = this.j;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        du90 du90Var = (du90) recyclerView2.findViewHolderForAdapterPosition(i);
        List<yt90> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (yt90 yt90Var : list2) {
            if (!(yt90Var instanceof yt90.a)) {
                throw new NoWhenBranchMatchedException();
            }
            yt90.a aVar3 = (yt90.a) yt90Var;
            RecyclerView recyclerView3 = this.j;
            if (recyclerView3 == null) {
                recyclerView3 = null;
            }
            Drawable a2 = m33.a(R.drawable.vk_icon_delete_outline_20, recyclerView3.getContext());
            if (a2 != null) {
                sjo.d(a2, dhr0.r(R.attr.vk_ui_background_negative));
            }
            RecyclerView recyclerView4 = this.j;
            if (recyclerView4 == null) {
                recyclerView4 = null;
            }
            arrayList.add(new lwb0(null, R.string.vkim_folder_peer_delete_option, a2, Integer.valueOf(dhr0.Y(R.attr.vk_ui_background_negative, recyclerView4.getContext())), 0, aVar3, true, null, false, false, 1937));
        }
        ((com.vk.im.popup.a) bpn0Var.getValue()).f(new Popup.a(arrayList, list, new Popup.g.a(du90Var.itemView), 2431), du90Var.itemView, du90Var.m.b(VkCell.Region.RightExtraAction), new mh4(13, this, wt90Var));
    }

    @Override // xsna.wn50
    public final void l(ao50 ao50Var) {
        ayr ayrVar = (ayr) ao50Var;
        VkButton vkButton = this.h;
        if (vkButton == null) {
            vkButton = null;
        }
        vkButton.setEnabled(ayrVar.b);
        View view = this.i;
        if (view == null) {
            view = null;
        }
        bwt0.p0(view, ayrVar.l);
        txr txrVar = this.l;
        List<hfz> list = (txrVar == null ? null : txrVar).h.f;
        List<hfz> list2 = ayrVar.a;
        if (list == list2) {
            return;
        }
        (txrVar != null ? txrVar : null).setItems(list2);
        bpn0 bpn0Var = this.n;
        Handler handler = (Handler) bpn0Var.getValue();
        bpn0 bpn0Var2 = this.o;
        handler.removeCallbacks((Runnable) bpn0Var2.getValue());
        Handler handler2 = (Handler) bpn0Var.getValue();
        bpn0 bpn0Var3 = this.p;
        handler2.removeCallbacks((Runnable) bpn0Var3.getValue());
        if (ayrVar.k) {
            ((Handler) bpn0Var.getValue()).postDelayed((Runnable) bpn0Var2.getValue(), 300L);
        } else {
            ((Handler) bpn0Var.getValue()).post((Runnable) bpn0Var3.getValue());
        }
    }

    @Override // xsna.fi6, xsna.wn50
    public final void onDestroyView() {
        ((Handler) this.n.getValue()).removeCallbacksAndMessages(null);
        super.onDestroyView();
    }

    /* compiled from: FolderConfigurationViewController.kt */
    public static final class b implements ys90, wxr, xt90, p3v, yra {
        public b() {
        }

        @Override // xsna.ys90
        public final void a() {
            h.this.O(g.i.b);
        }

        @Override // xsna.xt90
        public final void b(wt90 wt90Var) {
            h.this.O(new g.h(wt90Var));
        }

        @Override // xsna.wxr
        public final void d(String str) {
            h.this.O(new g.j(str));
        }

        @Override // xsna.yra
        public final void e(FolderType folderType, boolean z) {
            h.this.O(new g.b(folderType, z));
        }

        @Override // xsna.p3v
        public final void f() {
            h.this.O(g.e.b);
        }

        @Override // xsna.xt90
        public final void c(wt90 wt90Var) {
        }
    }
}
