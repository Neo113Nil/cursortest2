package com.vk.libvideo.bottomsheet.about.delegate;

import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import xsna.atp;
import xsna.bwt0;
import xsna.bzs0;
import xsna.c4;
import xsna.f4m;
import xsna.gzs;
import xsna.hfz;
import xsna.iah0;
import xsna.isp;
import xsna.p1u0;
import xsna.rcg0;
import xsna.swe0;
import xsna.tlo0;
import xsna.tq;
import xsna.vfz;
import xsna.x5;
import xsna.y6;

/* compiled from: AboutVideoEpisodeDelegate.kt */
/* loaded from: classes2.dex */
public final class j extends p1u0<AboutVideoItem.n> {
    public final c4 a;
    public final boolean b;
    public final gzs<rcg0> c;
    public final bzs0 d;
    public final boolean e;

    /* compiled from: AboutVideoEpisodeDelegate.kt */
    public static final class a extends vfz<AboutVideoItem.n> {
        public final c4 l;
        public final boolean m;
        public final RecyclerView n;
        public final VkGroupHeader o;
        public final isp p;
        public boolean q;

        public a(ViewGroup viewGroup, c4 c4Var, boolean z, rcg0 rcg0Var, bzs0 bzs0Var) {
            super(bwt0.I(R.layout.video_about_episode, viewGroup, false));
            this.l = c4Var;
            this.m = z;
            RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.recycler_view);
            this.n = recyclerView;
            this.o = (VkGroupHeader) this.itemView.findViewById(R.id.episode_header);
            isp ispVar = new isp(z ? R.layout.video_episode_tablet : R.layout.video_episode, new x5(18), rcg0Var, bzs0Var, false, null, null);
            this.p = ispVar;
            this.q = true;
            viewGroup.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
            recyclerView.setAdapter(ispVar);
        }

        @Override // xsna.vfz
        public final void V5() {
            if (this.m) {
                int a = iah0.a(!iah0.s(this.itemView.getContext()) ? 20 : 32);
                f4m.x(a, this.n);
                f4m.s(a, this.o);
            }
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(AboutVideoItem.n nVar) {
            VkGroupHeader vkGroupHeader = this.o;
            vkGroupHeader.setShowTopDivider(true);
            vkGroupHeader.setSize(VkGroupHeader.Size.Medium);
            tlo0.f h = tq.h(tlo0.Companion, R.string.video_episode_title);
            List<atp> list = nVar.b;
            vkGroupHeader.setTitle(new VkGroupHeader.d(h, null, new com.vk.core.view.components.group.header.e(String.valueOf(list.size())), null, 0, 502));
            Object obj = null;
            vkGroupHeader.setRight(new VkGroupHeader.Right(new VkGroupHeader.Right.ExtraContent.a(new tlo0.f(R.string.video_show_all), new y6(this, 0), null, VkButton.Mode.Link, VkButton.Appearance.Accent, null, 484), null, null, 6));
            this.p.setItems(list);
            if (this.q) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((atp) next).e) {
                        obj = next;
                        break;
                    }
                }
                atp atpVar = (atp) obj;
                if (atpVar != null) {
                    this.n.scrollToPosition(swe0.g(atpVar.c - 1, 0, list.size() - 1));
                }
                this.q = false;
            }
        }
    }

    public j(c4 c4Var, boolean z, gzs<rcg0> gzsVar, bzs0 bzs0Var, boolean z2) {
        this.a = c4Var;
        this.b = z;
        this.c = gzsVar;
        this.d = bzs0Var;
        this.e = z2;
    }

    @Override // xsna.p1u0
    public final vfz<? extends AboutVideoItem.n> b(ViewGroup viewGroup) {
        gzs<rcg0> gzsVar = this.c;
        return new a(viewGroup, this.a, this.b, gzsVar != null ? gzsVar.invoke() : null, this.d);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return (hfzVar instanceof AboutVideoItem.n) && !this.e;
    }
}
