package com.vk.newsfeed.common.recycler.holders.clips;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.clips.tool.view.newsfeed.overlay.ClipEndOverlayView;
import com.vk.dto.newsfeed.entries.Videos;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.asp;
import xsna.bbb0;
import xsna.cfd;
import xsna.cui;
import xsna.d3j0;
import xsna.dnt0;
import xsna.efd;
import xsna.ent0;
import xsna.g620;
import xsna.h170;
import xsna.i7o;
import xsna.izs;
import xsna.j5g;
import xsna.lun;
import xsna.myc0;
import xsna.n880;
import xsna.o880;
import xsna.p880;
import xsna.p8d;
import xsna.qfd;
import xsna.qi6;
import xsna.rj60;
import xsna.rp6;
import xsna.s3q0;
import xsna.s6o;
import xsna.s980;
import xsna.u1c0;
import xsna.zof;
import xsna.zrp;

/* compiled from: SingleClipV2Holder.kt */
/* loaded from: classes4.dex */
public final class SingleClipV2Holder extends rp6<efd, Videos> implements ent0, i7o, cui, qfd, n880 {
    public final StringBuilder E;
    public final cfd F;
    public final ArrayList G;
    public p880 H;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SingleClipV2Holder.kt */
    public static final class BindConfig {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BindConfig[] $VALUES;
        public static final BindConfig HEADER;

        static {
            BindConfig bindConfig = new BindConfig("HEADER", 0);
            HEADER = bindConfig;
            BindConfig[] bindConfigArr = {bindConfig};
            $VALUES = bindConfigArr;
            $ENTRIES = new asp(bindConfigArr);
        }

        public BindConfig() {
            throw null;
        }

        public static BindConfig valueOf(String str) {
            return (BindConfig) Enum.valueOf(BindConfig.class, str);
        }

        public static BindConfig[] values() {
            return (BindConfig[]) $VALUES.clone();
        }
    }

    public SingleClipV2Holder(ViewGroup viewGroup, h170 h170Var, zof zofVar, ClipActionButtonStateRepository clipActionButtonStateRepository) {
        super(new FrameLayout(viewGroup.getContext()), viewGroup);
        FrameLayout frameLayout = (FrameLayout) this.itemView;
        this.E = new StringBuilder();
        cfd cfdVar = new cfd(frameLayout, new p8d(this.itemView.getContext(), g620.f().a(), zofVar, new lun(0, this, SingleClipV2Holder.class, "displayContext", "getDisplayContext()Lcom/vk/newsfeed/presentation/model/PostDisplayContext;", 1), clipActionButtonStateRepository, true), null, null, h170Var, 28);
        this.F = cfdVar;
        viewGroup.getContext();
        this.G = new ArrayList();
        this.H = new p880(false, 0);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        frameLayout.addView(cfdVar.itemView);
        d3j0 d3j0Var = new d3j0(this, 3);
        ClipEndOverlayView clipEndOverlayView = cfdVar.L0;
        clipEndOverlayView.m.add(d3j0Var);
        clipEndOverlayView.n.add(new bbb0(this, 19));
        cfdVar.N0.setOnCarouselHeightListener(new rj60(this, 22));
    }

    @Override // xsna.qfd
    public final View F1() {
        return this.F.W;
    }

    @Override // xsna.qfd
    public final boolean J5() {
        return this.F.K7();
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        this.F.Q6(s6oVar);
    }

    @Override // xsna.n880
    public final View R3() {
        return null;
    }

    @Override // xsna.rp6
    public final /* bridge */ /* synthetic */ void R6(efd efdVar) {
    }

    @Override // xsna.rp6
    public final void U6(Videos videos) {
        super.U6(videos);
        u1c0 J0 = J0();
        if (J0 == null) {
            return;
        }
        this.F.J7(J0, false, J0.l);
        this.itemView.setContentDescription(null);
        this.H = new p880(false, 0);
    }

    @Override // xsna.qfd
    public final String W0() {
        return this.F.W0();
    }

    @Override // xsna.n880
    public final void Y0(izs<? super o880, s3q0> izsVar) {
        this.G.remove(izsVar);
    }

    @Override // xsna.rp6, xsna.qi6
    public final void b6(u1c0 u1c0Var, Object obj) {
        if ((obj instanceof Iterable ? j5g.Z((Iterable) obj) : obj) == BindConfig.HEADER) {
            super.b6(u1c0Var, obj);
        } else {
            a6(u1c0Var);
        }
    }

    public final void b7(o880 o880Var) {
        Iterator it = this.G.iterator();
        while (it.hasNext()) {
            ((izs) it.next()).invoke(o880Var);
        }
    }

    @Override // xsna.n880
    public final p880 getState() {
        return this.H;
    }

    @Override // xsna.n880
    public final void i2(izs<? super o880, s3q0> izsVar) {
        this.G.add(izsVar);
    }

    @Override // xsna.ent0
    public final dnt0 q3() {
        return this.F.L;
    }

    @Override // xsna.cui
    public final void q5(s980 s980Var, qi6.b bVar) {
        cfd cfdVar = this.F;
        cfdVar.y = s980Var;
        if (s980Var != null) {
            cfdVar.D = s980Var;
        }
        cfdVar.A = bVar;
    }

    @Override // xsna.n880
    public final void s4(String str) {
        StringBuilder sb = this.E;
        sb.setLength(0);
        if (!myc0.f(this.itemView.getContentDescription())) {
            this.itemView.setContentDescription(str);
            return;
        }
        sb.append(this.itemView.getContentDescription());
        sb.append(" ");
        sb.append(str);
        this.itemView.setContentDescription(sb.toString());
    }

    @Override // xsna.n880
    public final void i3() {
    }
}
