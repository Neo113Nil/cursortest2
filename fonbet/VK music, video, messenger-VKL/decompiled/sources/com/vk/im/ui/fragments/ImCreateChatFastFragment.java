package com.vk.im.ui.fragments;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.reporters.api.di.ImReportersComponent;
import com.vk.im.ui.components.chat_controls.ChatControls;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.a1w;
import xsna.c5g;
import xsna.fpf0;
import xsna.fsq;
import xsna.hg1;
import xsna.j5g;
import xsna.k0w;
import xsna.kq01;
import xsna.lf1;
import xsna.m7m;
import xsna.mhy;
import xsna.oz50;
import xsna.q1w;
import xsna.qtd0;
import xsna.tuq;
import xsna.udo;
import xsna.x6k;

/* compiled from: ImCreateChatFastFragment.kt */
/* loaded from: classes2.dex */
public final class ImCreateChatFastFragment extends ImSelectContactsFragment {
    public static final /* synthetic */ int y0 = 0;
    public final a1w w0;
    public final k0w x0;

    /* compiled from: ImCreateChatFastFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(ImCreateChatFastFragment.class, null, null);
            s(true);
            y();
        }

        public final void A() {
            this.j.putBoolean("multiselect", true);
        }

        public final void B() {
            this.j.putInt("searchMode", 0);
        }

        public final void C(List list) {
            this.j.putLongArray("selected_ids", j5g.P0(list));
        }

        public final void D(String str) {
            this.j.putString("text", str);
        }

        public final void E(String str) {
            this.j.putString("entry_point", str);
        }

        public final void F() {
            this.j.putInt("max_selection_count", Integer.MAX_VALUE);
        }

        public final void G(String str) {
            this.j.putString("hint", str);
        }

        public final void H(String str) {
            this.j.putString("title", str);
        }

        public final void I(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
            this.j.putSerializable("visitSource", mobileOfficialAppsCoreNavStat$EventScreen);
        }

        public final void y() {
            this.j.putBoolean("allow_empty", true);
        }

        public final void z(Collection collection) {
            this.j.putLongArray("ids", j5g.P0(collection));
        }
    }

    public ImCreateChatFastFragment() {
        a1w a1wVar = q1w.a;
        this.w0 = a1wVar == null ? null : a1wVar;
        this.x0 = ((ImReportersComponent) m7m.d(this).a(fpf0.a(ImReportersComponent.class))).K().w();
    }

    @Override // com.vk.im.ui.fragments.ImSelectContactsFragment
    public final void go(List<? extends qtd0> list) {
        List<? extends qtd0> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (qtd0 qtd0Var : list2) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            arrayList.add(Peer.a.b(qtd0Var.G3()));
        }
        this.N.b(hg1.n(this.w0.F(this, new x6k("", "", arrayList, EmptyList.b, false, kq01.q(ChatControls.o), null, Boolean.FALSE)), getActivity(), false, null, 62).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new fsq(new udo(this, 16), 5), new lf1(new tuq(6), 28)));
        mhy.b(mo2getContext());
    }
}
