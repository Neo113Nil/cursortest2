package com.vk.profile.community.members.impl.ui;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.profile.community.members.api.CommunityMembersFilter;
import com.vk.profile.community.members.impl.ui.a;
import com.vk.profile.community.members.impl.ui.b;
import com.vk.profile.community.members.impl.ui.c;
import com.vk.profile.community.members.impl.ui.k;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeDonutBanner;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.t0;
import com.vkontakte.android.data.b;
import kotlin.NoWhenBranchMatchedException;
import xsna.a220;
import xsna.al50;
import xsna.bjc;
import xsna.epx;
import xsna.hah;
import xsna.lj50;
import xsna.on50;
import xsna.qwn;
import xsna.sj50;
import xsna.uzp0;

/* compiled from: MembersStoreActor.kt */
/* loaded from: classes5.dex */
public final class e extends al50<MembersState, a, on50, k, c, b> {
    public final sj50<MembersState, on50, k, c, b> c;
    public final a220 d;

    public e(sj50<MembersState, on50, k, c, b> sj50Var, a220 a220Var) {
        super(sj50Var);
        this.c = sj50Var;
        this.d = a220Var;
    }

    public final void m(a220 a220Var) {
        e(new c.e(true));
        hah hahVar = a220Var.c;
        hahVar.c.clear();
        hahVar.d.clear();
        a(new k.b(null, true, true));
        if (a220Var.e && a220Var.b == CommunityMembersFilter.FRIENDS) {
            a(new k.c(true));
        }
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        a aVar = (a) lj50Var;
        a220 a220Var = this.d;
        qwn qwnVar = a220Var.f;
        boolean z = aVar instanceof a.j;
        sj50<State, TaskId, Task, Patch, Event> sj50Var = this.b;
        if (z) {
            e(c.a.a);
            a(new k.b(((MembersState) sj50Var.getCurrentState()).e, false, false));
            return;
        }
        if (aVar instanceof a.h) {
            m(a220Var);
            return;
        }
        if (aVar instanceof a.i) {
            e(c.a.a);
            MembersState membersState = (MembersState) sj50Var.getCurrentState();
            if (membersState.b || membersState.g != null) {
                return;
            }
            m(a220Var);
            return;
        }
        if (!(aVar instanceof a.InterfaceC1632a)) {
            if (aVar instanceof a.g) {
                c(new b.C1633b(((a.g) aVar).b));
                return;
            }
            if (aVar instanceof a.e) {
                boolean z2 = ((a.e) aVar).b;
                qwnVar.c = z2;
                if (z2 && qwnVar.b) {
                    qwnVar.a();
                    return;
                }
                return;
            }
            if (!aVar.equals(a.f.b)) {
                throw new NoWhenBranchMatchedException();
            }
            if (a220Var.e && a220Var.b == CommunityMembersFilter.FRIENDS) {
                a(new k.c(true));
                return;
            }
            return;
        }
        a.InterfaceC1632a interfaceC1632a = (a.InterfaceC1632a) aVar;
        if (interfaceC1632a instanceof a.b) {
            b.d a = io.reactivex.rxjava3.processors.b.a("donut_click_pay", "source", "donut_banner");
            a.b(Long.valueOf(-qwnVar.a.b), "owner_id");
            a.b(t0.a(MobileOfficialAppsCoreNavStat$EventScreen.FRIENDS_IN_GROUP), "screen");
            a.e();
            c(new b.a(((a.b) interfaceC1632a).b));
            return;
        }
        if (!(interfaceC1632a instanceof a.c)) {
            if (!epx.f(interfaceC1632a, a.d.b)) {
                throw new NoWhenBranchMatchedException();
            }
            qwnVar.b = true;
            if (qwnVar.c) {
                qwnVar.a();
                return;
            }
            return;
        }
        a(new k.a(((a.c) interfaceC1632a).b));
        e(new c.C1634c(null, false));
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, Long.valueOf(-qwnVar.a.b), null, null, null, 58, null), new CommonCommunitiesStat$TypeDonutBanner(CommonCommunitiesStat$TypeDonutBanner.EventType.DONUT_BANNER_HIDE), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }
}
