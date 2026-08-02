package com.sofascore.results.event.hockeyplaybyplay;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import androidx.recyclerview.widget.u;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.hockeyplaybyplay.HockeyIncident;
import com.sofascore.results.event.dialog.PlayerEventStatisticsModal;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import defpackage.a70;
import defpackage.ay5;
import defpackage.ce4;
import defpackage.dsf;
import defpackage.duf;
import defpackage.f16;
import defpackage.f8h;
import defpackage.fi5;
import defpackage.fsf;
import defpackage.fuf;
import defpackage.g16;
import defpackage.h16;
import defpackage.i16;
import defpackage.j16;
import defpackage.jle;
import defpackage.joa;
import defpackage.jpe;
import defpackage.k16;
import defpackage.krk;
import defpackage.l16;
import defpackage.me4;
import defpackage.mr5;
import defpackage.n16;
import defpackage.nl2;
import defpackage.otk;
import defpackage.qrf;
import defpackage.r8;
import defpackage.rlh;
import defpackage.rq3;
import defpackage.t06;
import defpackage.u6b;
import defpackage.un0;
import defpackage.v1h;
import defpackage.vqg;
import defpackage.wca;
import defpackage.wrf;
import defpackage.xw3;
import defpackage.y7;
import defpackage.ypa;
import defpackage.yq8;
import defpackage.ysa;
import defpackage.z8e;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/event/hockeyplaybyplay/EventHockeyPlayByPlayFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Lyq8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EventHockeyPlayByPlayFragment extends Hilt_EventHockeyPlayByPlayFragment<yq8> {
    public final otk r;
    public final otk s;
    public final joa t;
    public final joa u;
    public final joa v;
    public final joa w;
    public final joa x;
    public Integer y;

    public EventHockeyPlayByPlayFragment() {
        int i = 3;
        l16 l16Var = new l16(this, i);
        ysa ysaVar = ysa.c;
        int i2 = 1;
        joa a = ypa.a(ysaVar, new t06(l16Var, 1));
        fuf fufVar = duf.a;
        this.r = new otk(fufVar.getOrCreateKotlinClass(n16.class), new ay5(a, 7), new fi5(this, a, 7), new ay5(a, 8));
        int i3 = 2;
        this.s = new otk(fufVar.getOrCreateKotlinClass(mr5.class), new l16(this, 0), new l16(this, i3), new l16(this, i2));
        this.t = ypa.a(ysaVar, new j16(this, i2));
        this.u = ypa.a(ysaVar, new j16(this, i3));
        this.v = ypa.a(ysaVar, new j16(this, i));
        this.w = ypa.a(ysaVar, new j16(this, 4));
        this.x = ypa.a(ysaVar, new j16(this, 5));
    }

    public final void C() {
        int itemCount;
        u findViewHolderForAdapterPosition;
        u findViewHolderForAdapterPosition2;
        u findViewHolderForAdapterPosition3;
        krk krkVar = this.l;
        krkVar.getClass();
        RecyclerView recyclerView = ((yq8) krkVar).c;
        n layoutManager = recyclerView.getLayoutManager();
        layoutManager.getClass();
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (findFirstVisibleItemPosition == -1 || findLastVisibleItemPosition == -1 || findFirstVisibleItemPosition > F().getItemCount() - 1 || itemCount > findLastVisibleItemPosition || (findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(F().getItemCount() - 3)) == null || (findViewHolderForAdapterPosition2 = recyclerView.findViewHolderForAdapterPosition(F().getItemCount() - 2)) == null || (findViewHolderForAdapterPosition3 = recyclerView.findViewHolderForAdapterPosition(F().getItemCount() - 1)) == null) {
            return;
        }
        if (this.y == null) {
            findViewHolderForAdapterPosition3.itemView.getLayoutParams().height = -2;
            View view = findViewHolderForAdapterPosition3.itemView;
            view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            this.y = Integer.valueOf(findViewHolderForAdapterPosition3.itemView.getMeasuredHeight());
        }
        krk krkVar2 = this.l;
        krkVar2.getClass();
        int height = (((yq8) krkVar2).d.getHeight() - findViewHolderForAdapterPosition.itemView.getHeight()) - findViewHolderForAdapterPosition2.itemView.getHeight();
        krk krkVar3 = this.l;
        krkVar3.getClass();
        int height2 = height - ((yq8) krkVar3).b.getHeight();
        if (findViewHolderForAdapterPosition3.itemView.getHeight() != height2) {
            ViewGroup.LayoutParams layoutParams = findViewHolderForAdapterPosition3.itemView.getLayoutParams();
            Integer num = this.y;
            layoutParams.height = Math.max(num != null ? num.intValue() : 0, height2);
        }
    }

    public final void D(boolean z) {
        krk krkVar = this.l;
        krkVar.getClass();
        n layoutManager = ((yq8) krkVar).c.getLayoutManager();
        layoutManager.getClass();
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (findFirstVisibleItemPosition == -1 || findLastVisibleItemPosition == -1) {
            return;
        }
        fsf fsfVar = new fsf();
        dsf dsfVar = new dsf();
        dsfVar.a = findFirstVisibleItemPosition;
        if (findFirstVisibleItemPosition <= findLastVisibleItemPosition) {
            int i = findFirstVisibleItemPosition;
            while (true) {
                View findViewByPosition = linearLayoutManager.findViewByPosition(i);
                if (findViewByPosition != null) {
                    int bottom = findViewByPosition.getBottom();
                    this.l.getClass();
                    if (Math.min(bottom, ((yq8) r8).c.getHeight()) - Math.max(findViewByPosition.getTop(), 0) >= findViewByPosition.getHeight() * 0.25d) {
                        dsfVar.a = i;
                        ArrayList arrayList = F().i;
                        HockeyIncident hockeyIncident = null;
                        if (!z) {
                            arrayList = null;
                        }
                        if (arrayList != null) {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj : arrayList) {
                                if (obj instanceof HockeyIncident) {
                                    arrayList2.add(obj);
                                }
                            }
                            HockeyIncident hockeyIncident2 = (HockeyIncident) CollectionsKt.a0(i, arrayList2);
                            if (hockeyIncident2 != null && hockeyIncident2.getIsHome() != null && hockeyIncident2.getEventMapItem() != null) {
                                hockeyIncident = hockeyIncident2;
                            }
                        }
                        fsfVar.a = hockeyIncident;
                    }
                }
                if (fsfVar.a != null || i == findLastVisibleItemPosition) {
                    break;
                } else {
                    i++;
                }
            }
        }
        krk krkVar2 = this.l;
        krkVar2.getClass();
        t(((yq8) krkVar2).c, new i16(this, fsfVar, findFirstVisibleItemPosition, findLastVisibleItemPosition, dsfVar, 0));
    }

    public final void E(Player player, boolean z) {
        if (!Intrinsics.c(G().getHasEventPlayerStatistics(), Boolean.TRUE)) {
            int i = PlayerActivity.Z;
            FragmentActivity requireActivity = requireActivity();
            requireActivity.getClass();
            int id = getId();
            UniqueTournament uniqueTournament = G().getTournament().getUniqueTournament();
            jle.q(requireActivity, id, uniqueTournament != null ? uniqueTournament.getId() : 0, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
            return;
        }
        Event G = G();
        Team homeTeam$default = z ? Event.getHomeTeam$default(G, null, 1, null) : Event.getAwayTeam$default(G, null, 1, null);
        int i2 = z ? 1 : 2;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            PlayerEventStatisticsModal c = jpe.c(f8h.i(G(), player, homeTeam$default, i2, null, 112), null);
            AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
            if (appCompatActivity != null) {
                me4.n(c, appCompatActivity, null, wca.x(appCompatActivity.getLifecycle()));
            }
        }
    }

    public final f16 F() {
        return (f16) this.t.getValue();
    }

    public final Event G() {
        Object d = ((mr5) this.s.getValue()).v.d();
        if (d != null) {
            return (Event) d;
        }
        a70.r("Required value was null.");
        return null;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        return yq8.a(getLayoutInflater());
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "PlayByPlayTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((yq8) krkVar).d;
        swipeRefreshLayout.getClass();
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 6);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        final RecyclerView recyclerView = ((yq8) krkVar2).c;
        int i = 0;
        recyclerView.setPadding(0, 0, 0, 0);
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        recyclerView.setAdapter(F());
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager() { // from class: com.sofascore.results.event.hockeyplaybyplay.EventHockeyPlayByPlayFragment$setupRecyclerView$1$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.n
            public final void smoothScrollToPosition(RecyclerView recyclerView2, qrf qrfVar, int i2) {
                recyclerView2.getClass();
                qrfVar.getClass();
                nl2 nl2Var = new nl2(RecyclerView.this.getContext(), 5);
                nl2Var.setTargetPosition(i2);
                startSmoothScroll(nl2Var);
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.n
            public final boolean supportsPredictiveItemAnimations() {
                return false;
            }
        });
        wrf.a(recyclerView, new h16(this, i));
        recyclerView.addOnScrollListener(new k16(this));
        SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) this.v.getValue();
        segmentedButtonsView.getClass();
        Boolean bool = Boolean.FALSE;
        Pair pair = new Pair(bool, bool);
        vqg vqgVar = new vqg(29);
        segmentedButtonsView.k = new g16(this, i);
        segmentedButtonsView.g = false;
        segmentedButtonsView.h = pair;
        segmentedButtonsView.j = v1h.f;
        segmentedButtonsView.i = vqgVar;
        rlh rlhVar = rlh.b;
        if (!rlhVar.isEmpty()) {
            SegmentedButtonsView.t(segmentedButtonsView, rlhVar, null, 6);
        }
        krk krkVar3 = this.l;
        krkVar3.getClass();
        ((yq8) krkVar3).b.addOnLayoutChangeListener(new r8(this, 4));
        otk otkVar = this.r;
        n16 n16Var = (n16) otkVar.getValue();
        u6b viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        n16Var.g(viewLifecycleOwner, new j16(this, i));
        ((n16) otkVar.getValue()).g.e(getViewLifecycleOwner(), new y7(17, new h16(this, 1)));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        n16 n16Var = (n16) this.r.getValue();
        xw3.L(un0.z(n16Var), null, null, new ce4(n16Var, G(), (rq3) null, 14), 3);
    }
}
