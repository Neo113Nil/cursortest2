package com.vk.voip.ui.groupcalls.grid;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.vk.voip.ui.VoipViewModelState;
import com.vk.voip.ui.asr_online.AsrOnlineViewHorizontal;
import com.vk.voip.ui.c;
import com.vk.voip.ui.groupcalls.ControlsBoundsProvider;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import io.reactivex.rxjava3.internal.operators.observable.y;
import io.reactivex.rxjava3.subjects.f;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.asu0;
import xsna.bqs;
import xsna.ckj0;
import xsna.dfn;
import xsna.e43;
import xsna.el6;
import xsna.f6g;
import xsna.fvr;
import xsna.gf0;
import xsna.hg1;
import xsna.hxl;
import xsna.i22;
import xsna.i6x0;
import xsna.iew0;
import xsna.ihu;
import xsna.j9k;
import xsna.jhu;
import xsna.lp0;
import xsna.lr;
import xsna.qhj0;
import xsna.qiu;
import xsna.sd4;
import xsna.srg;
import xsna.td5;
import xsna.vl0;
import xsna.vx6;
import xsna.wmc;
import xsna.ysg0;

/* compiled from: GroupCallGridContainerView.kt */
/* loaded from: classes7.dex */
public final class GroupCallGridContainerView extends FrameLayout implements ckj0, ControlsBoundsProvider, qhj0 {
    public static final /* synthetic */ int i = 0;
    public final ihu b;
    public final List<VoipViewModelState> c;
    public final com.vk.voip.ui.groupcalls.grid.a d;
    public final b e;
    public a f;
    public ControlsBoundsProvider g;
    public final dfn h;

    /* compiled from: GroupCallGridContainerView.kt */
    public interface a {
    }

    public GroupCallGridContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        c.b.getClass();
        this.b = c.l0;
        this.c = e43.l(VoipViewModelState.InCall, VoipViewModelState.Connecting, VoipViewModelState.CallingPeer);
        com.vk.voip.ui.groupcalls.grid.a aVar = new com.vk.voip.ui.groupcalls.grid.a(context, attributeSet);
        this.d = aVar;
        this.e = new b();
        ControlsBoundsProvider.c7.getClass();
        this.g = ControlsBoundsProvider.a.b;
        aVar.setId(R.id.grid_view_pager);
        aVar.setListener(new lp0(this, 22));
        addView(aVar);
        this.h = c.m0.d;
    }

    public final void a() {
        GroupCallViewModel.b.getClass();
        GroupCallViewModel.o();
        setVisibility((c.b.s0() && this.c.contains(c.K0) && GroupCallViewModel.e == GroupCallViewModel.GroupCallViewMode.GridViewMode) ? 0 : 8);
        if (getVisibility() == 0) {
            com.vk.voip.ui.groupcalls.grid.a aVar = this.d;
            if (aVar.J.h && aVar.getVisibility() == 0) {
                aVar.requestLayout();
            }
        }
    }

    public final void b(int i2, int i3) {
        AsrOnlineViewHorizontal asrOnlineViewHorizontal = this.d.C;
        if (i2 != 0) {
            asrOnlineViewHorizontal.i += i2;
        }
        if (i3 != 0) {
            asrOnlineViewHorizontal.i += -i3;
        }
    }

    @Override // xsna.ckj0
    public final Collection g3() {
        this.d.getClass();
        return EmptyList.b;
    }

    @Override // com.vk.voip.ui.groupcalls.ControlsBoundsProvider
    public int getBottomOffset() {
        return this.g.getBottomOffset();
    }

    public final ControlsBoundsProvider getBoundsProvider() {
        return this.g;
    }

    public ControlsBoundsProvider.Gravity getHorizontalGravity() {
        return ControlsBoundsProvider.Gravity.LEFT;
    }

    public final i6x0 getPlayerMediator() {
        return this.d.getPlayerMediator();
    }

    public SpannableStringBuilder getSubtitlesTextSpannable() {
        return this.d.getSubtitlesTextSpannable();
    }

    @Override // com.vk.voip.ui.groupcalls.ControlsBoundsProvider
    public int getTopOffset() {
        return this.g.getTopOffset();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ihu ihuVar = this.b;
        jhu P0 = ihuVar.b.d.P0();
        boolean z = P0 != null ? P0.g : true;
        GroupCallViewModel groupCallViewModel = GroupCallViewModel.b;
        groupCallViewModel.getClass();
        GroupCallViewModel.o();
        this.d.P4(GroupCallViewModel.p, z);
        a();
        f<Object> fVar = ysg0.b.a;
        hg1.s1 s1Var = new hg1.s1();
        fVar.getClass();
        m1 a0 = new i0(fVar, s1Var).U(new hg1.r1()).a0(io.reactivex.rxjava3.android.schedulers.a.b());
        el6 el6Var = new el6(new srg(this, 20), 27);
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        io.reactivex.rxjava3.disposables.c subscribe = a0.subscribe(el6Var, new i22(new td5(bVar, 10), 27));
        b bVar2 = this.e;
        bVar2.b(subscribe);
        groupCallViewModel.getClass();
        bVar2.b(q.m(new y(GroupCallViewModel.m.U(new lr(new sd4(26), 17)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a), ihuVar.a(), new fvr()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new vl0(new hxl(this, 9), 24), new bqs(new wmc(bVar, 3), 2)));
        bVar2.b(q.m(GroupCallViewModel.j, ihuVar.a(), new vx6(new f6g((byte) 0, 7), 15)).a0(asu0.a.d()).subscribe(new gf0(new j9k(this, 19), 23)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.vk.voip.ui.groupcalls.grid.a aVar = this.d;
        aVar.x.dispose();
        aVar.w.b();
        this.e.e();
    }

    public final void setBoundsProvider(ControlsBoundsProvider controlsBoundsProvider) {
        this.g = controlsBoundsProvider;
    }

    public final void setListener(a aVar) {
        this.f = aVar;
    }

    public final void setTopIndent(qiu qiuVar) {
        this.d.setTopIndent(qiuVar);
    }

    @Override // xsna.ckj0
    public final void w2(String str) {
        this.d.w2(str);
    }

    @Override // xsna.qhj0
    public final void y3(List<iew0> list) {
        this.d.y3(list);
    }
}
