package com.sofascore.results.event.matches;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TeamSides;
import com.sofascore.model.mvvm.model.TennisEvent;
import com.sofascore.results.R;
import com.sofascore.results.event.details.view.odds.GambleRegulationFooterView;
import com.sofascore.results.event.matches.EventMatchesFragment;
import com.sofascore.results.mvvm.base.AbstractFragment;
import defpackage.a52;
import defpackage.a70;
import defpackage.ad2;
import defpackage.ao2;
import defpackage.ay5;
import defpackage.b1d;
import defpackage.beh;
import defpackage.c36;
import defpackage.d2a;
import defpackage.duf;
import defpackage.e6b;
import defpackage.fi5;
import defpackage.fuf;
import defpackage.g9i;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.iz2;
import defpackage.joa;
import defpackage.k6b;
import defpackage.km5;
import defpackage.krk;
import defpackage.lh2;
import defpackage.mqi;
import defpackage.mr5;
import defpackage.n26;
import defpackage.n9e;
import defpackage.o26;
import defpackage.ok3;
import defpackage.oo8;
import defpackage.otk;
import defpackage.pi;
import defpackage.qu7;
import defpackage.qv5;
import defpackage.r1;
import defpackage.rq3;
import defpackage.t06;
import defpackage.t26;
import defpackage.tba;
import defpackage.tu7;
import defpackage.u1;
import defpackage.u6b;
import defpackage.un0;
import defpackage.w1;
import defpackage.w26;
import defpackage.wca;
import defpackage.ws2;
import defpackage.wv8;
import defpackage.wyh;
import defpackage.x1;
import defpackage.xs2;
import defpackage.xw3;
import defpackage.y1;
import defpackage.ypa;
import defpackage.ys2;
import defpackage.ysa;
import defpackage.z1;
import defpackage.z45;
import defpackage.z8e;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/event/matches/EventMatchesFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Loo8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EventMatchesFragment extends Hilt_EventMatchesFragment<oo8> {
    public List A;
    public List B;
    public List C;
    public boolean D;
    public boolean E;
    public final joa F;
    public final joa G;
    public final joa H;
    public final joa I;
    public final joa J;
    public final joa K;
    public final joa L;
    public final otk r;
    public final otk s;
    public final otk t;
    public final joa u;
    public final mqi v;
    public lh2 w;
    public xs2 x;
    public xs2 y;
    public xs2 z;

    public EventMatchesFragment() {
        fuf fufVar = duf.a;
        int i = 1;
        int i2 = 2;
        this.r = new otk(fufVar.getOrCreateKotlinClass(mr5.class), new t26(this, 0), new t26(this, i2), new t26(this, i));
        int i3 = 8;
        pi piVar = new pi(i3, this, this);
        w1 w1Var = new w1(this, 7);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new w1(w1Var, 8));
        int i4 = 4;
        int i5 = 5;
        int i6 = 6;
        this.s = new otk(fufVar.getOrCreateKotlinClass(c36.class), new x1(a, 4), new y1(i6, this, a), new y1(i5, piVar, a));
        int i7 = 3;
        joa a2 = ypa.a(ysaVar, new t06(new t26(this, i7), i4));
        int i8 = 9;
        this.t = new otk(fufVar.getOrCreateKotlinClass(tu7.class), new ay5(a2, 11), new fi5(this, a2, i8), new ay5(a2, 12));
        this.u = ypa.a(ysaVar, new n26(this, i4));
        this.v = ypa.b(new n26(this, i5));
        this.w = lh2.a;
        km5 km5Var = km5.a;
        this.A = km5Var;
        this.B = km5Var;
        this.C = km5Var;
        this.F = ypa.a(ysaVar, new n26(this, i6));
        this.G = ypa.a(ysaVar, new n26(this, 7));
        this.H = ypa.a(ysaVar, new n26(this, i3));
        this.I = ypa.a(ysaVar, new n26(this, i8));
        this.J = n9e.M(new n26(this, 10), new n26(this, i));
        this.K = ypa.a(ysaVar, new n26(this, i2));
        this.L = ypa.a(ysaVar, new n26(this, i7));
    }

    public static void G(EventMatchesFragment eventMatchesFragment, boolean z, int i) {
        joa joaVar = eventMatchesFragment.L;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) == 0;
        if (eventMatchesFragment.E) {
            return;
        }
        ((GambleRegulationFooterView) joaVar.getValue()).j(Boolean.valueOf(z), z2);
        ((GambleRegulationFooterView) joaVar.getValue()).setVisibility(0);
        eventMatchesFragment.E = true;
    }

    public final void C(xs2 xs2Var, List list) {
        c36 c36Var = (c36) this.s.getValue();
        lh2 lh2Var = this.w;
        list.getClass();
        lh2Var.getClass();
        g9i g9iVar = c36Var.n;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        c36Var.n = xw3.L(un0.z(c36Var), null, null, new u1(list, lh2Var, c36Var, xs2Var, null, 18), 3);
    }

    public final void D(View view, boolean z, ws2 ws2Var, List list) {
        ArrayList arrayList;
        ArrayList arrayList2;
        view.getClass();
        boolean isChecked = ((CheckBox) view).isChecked();
        int ordinal = this.w.ordinal();
        xs2 xs2Var = ordinal != 1 ? ordinal != 2 ? this.z : this.y : this.x;
        if (z) {
            if (xs2Var != null) {
                xs2Var.f = isChecked;
            }
        } else if (xs2Var != null) {
            xs2Var.g = isChecked;
        }
        if (isChecked) {
            if (xs2Var != null && (arrayList2 = xs2Var.e) != null) {
                arrayList2.add(ws2Var);
            }
        } else if (xs2Var != null && (arrayList = xs2Var.e) != null) {
            arrayList.remove(ws2Var);
        }
        C(xs2Var, list);
    }

    public final ys2 E() {
        return (ys2) this.u.getValue();
    }

    public final Event F() {
        Object d = ((mr5) this.r.getValue()).v.d();
        if (d != null) {
            return (Event) d;
        }
        a70.r("Required value was null.");
        return null;
    }

    public final boolean H(String str) {
        Set set = wyh.a;
        return (wyh.e(F().getTournament().getCategory().getSport().getSlug()) || Intrinsics.c(str, Sports.E_SPORTS)) ? false : true;
    }

    public final void I() {
        int ordinal = this.w.ordinal();
        if (ordinal == 0) {
            C(this.z, this.C);
            return;
        }
        if (ordinal == 1) {
            C(this.x, this.A);
        } else if (ordinal == 2) {
            C(this.y, this.B);
        } else {
            zzl.b();
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        return oo8.b(getLayoutInflater());
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "MatchesTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        View.OnClickListener onClickListener;
        View.OnClickListener onClickListener2;
        View.OnClickListener onClickListener3;
        View.OnClickListener onClickListener4;
        oo8 a = oo8.a(view);
        SwipeRefreshLayout swipeRefreshLayout = a.e;
        swipeRefreshLayout.getClass();
        final int i = 6;
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 6);
        RecyclerView recyclerView = a.d;
        recyclerView.setAdapter(E());
        Context requireContext = requireContext();
        requireContext.getClass();
        final int i2 = 4;
        recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), ao2.s(4, requireContext), recyclerView.getPaddingEnd(), recyclerView.getPaddingBottom());
        requireContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        final int i3 = 1;
        recyclerView.setHasFixedSize(true);
        e6b e6bVar = e6b.a;
        ad2 ad2Var = qv5.a;
        u6b viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        LinkedHashMap linkedHashMap = qv5.b;
        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(a52.class);
        Object obj = linkedHashMap.get(orCreateKotlinClass);
        final int i4 = 7;
        final int i5 = 0;
        if (obj == null) {
            obj = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass, obj);
        }
        k6b x = wca.x(viewLifecycleOwner.getLifecycle());
        u1 u1Var = new u1(viewLifecycleOwner, (b1d) obj, this, (rq3) null, this);
        final int i6 = 3;
        xw3.L(x, null, null, u1Var, 3);
        Event F = F();
        final int i7 = 2;
        if (F instanceof TennisEvent) {
            String groundType = ((TennisEvent) F).getGroundType();
            if (groundType == null) {
                groundType = "";
            }
            final View.OnClickListener onClickListener5 = new View.OnClickListener(this) { // from class: p26
                public final /* synthetic */ EventMatchesFragment b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i8 = i5;
                    EventMatchesFragment eventMatchesFragment = this.b;
                    switch (i8) {
                        case 0:
                            view2.getClass();
                            eventMatchesFragment.D(view2, true, ws2.e, eventMatchesFragment.A);
                            break;
                        case 1:
                            view2.getClass();
                            eventMatchesFragment.D(view2, false, ws2.c, eventMatchesFragment.B);
                            break;
                        case 2:
                            view2.getClass();
                            eventMatchesFragment.D(view2, true, ws2.a, eventMatchesFragment.C);
                            break;
                        case 3:
                            view2.getClass();
                            eventMatchesFragment.D(view2, true, ws2.c, eventMatchesFragment.C);
                            break;
                        case 4:
                            view2.getClass();
                            eventMatchesFragment.D(view2, false, ws2.c, eventMatchesFragment.C);
                            break;
                        case 5:
                            view2.getClass();
                            eventMatchesFragment.D(view2, true, ws2.e, eventMatchesFragment.B);
                            break;
                        case 6:
                            view2.getClass();
                            eventMatchesFragment.D(view2, true, ws2.e, eventMatchesFragment.C);
                            break;
                        case 7:
                            view2.getClass();
                            eventMatchesFragment.D(view2, true, ws2.c, eventMatchesFragment.A);
                            break;
                        case 8:
                            view2.getClass();
                            eventMatchesFragment.D(view2, false, ws2.c, eventMatchesFragment.A);
                            break;
                        default:
                            view2.getClass();
                            eventMatchesFragment.D(view2, true, ws2.c, eventMatchesFragment.B);
                            break;
                    }
                }
            };
            if (groundType.length() <= 0) {
                onClickListener5 = null;
            }
            final int i8 = 5;
            final View.OnClickListener onClickListener6 = new View.OnClickListener(this) { // from class: p26
                public final /* synthetic */ EventMatchesFragment b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i82 = i8;
                    EventMatchesFragment eventMatchesFragment = this.b;
                    switch (i82) {
                        case 0:
                            view2.getClass();
                            eventMatchesFragment.D(view2, true, ws2.e, eventMatchesFragment.A);
                            break;
                        case 1:
                            view2.getClass();
                            eventMatchesFragment.D(view2, false, ws2.c, eventMatchesFragment.B);
                            break;
                        case 2:
                            view2.getClass();
                            eventMatchesFragment.D(view2, true, ws2.a, eventMatchesFragment.C);
                            break;
                        case 3:
                            view2.getClass();
                            eventMatchesFragment.D(view2, true, ws2.c, eventMatchesFragment.C);
                            break;
                        case 4:
                            view2.getClass();
                            eventMatchesFragment.D(view2, false, ws2.c, eventMatchesFragment.C);
                            break;
                        case 5:
                            view2.getClass();
                            eventMatchesFragment.D(view2, true, ws2.e, eventMatchesFragment.B);
                            break;
                        case 6:
                            view2.getClass();
                            eventMatchesFragment.D(view2, true, ws2.e, eventMatchesFragment.C);
                            break;
                        case 7:
                            view2.getClass();
                            eventMatchesFragment.D(view2, true, ws2.c, eventMatchesFragment.A);
                            break;
                        case 8:
                            view2.getClass();
                            eventMatchesFragment.D(view2, false, ws2.c, eventMatchesFragment.A);
                            break;
                        default:
                            view2.getClass();
                            eventMatchesFragment.D(view2, true, ws2.c, eventMatchesFragment.B);
                            break;
                    }
                }
            };
            if (groundType.length() <= 0) {
                onClickListener6 = null;
            }
            View.OnClickListener onClickListener7 = new View.OnClickListener(this) { // from class: p26
                public final /* synthetic */ EventMatchesFragment b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i82 = i;
                    EventMatchesFragment eventMatchesFragment = this.b;
                    switch (i82) {
                        case 0:
                            view2.getClass();
                            eventMatchesFragment.D(view2, true, ws2.e, eventMatchesFragment.A);
                            break;
                        case 1:
                            view2.getClass();
                            eventMatchesFragment.D(view2, false, ws2.c, eventMatchesFragment.B);
                            break;
                        case 2:
                            view2.getClass();
                            eventMatchesFragment.D(view2, true, ws2.a, eventMatchesFragment.C);
                            break;
                        case 3:
                            view2.getClass();
                            eventMatchesFragment.D(view2, true, ws2.c, eventMatchesFragment.C);
                            break;
                        case 4:
                            view2.getClass();
                            eventMatchesFragment.D(view2, false, ws2.c, eventMatchesFragment.C);
                            break;
                        case 5:
                            view2.getClass();
                            eventMatchesFragment.D(view2, true, ws2.e, eventMatchesFragment.B);
                            break;
                        case 6:
                            view2.getClass();
                            eventMatchesFragment.D(view2, true, ws2.e, eventMatchesFragment.C);
                            break;
                        case 7:
                            view2.getClass();
                            eventMatchesFragment.D(view2, true, ws2.c, eventMatchesFragment.A);
                            break;
                        case 8:
                            view2.getClass();
                            eventMatchesFragment.D(view2, false, ws2.c, eventMatchesFragment.A);
                            break;
                        default:
                            view2.getClass();
                            eventMatchesFragment.D(view2, true, ws2.c, eventMatchesFragment.B);
                            break;
                    }
                }
            };
            if (groundType.length() <= 0) {
                onClickListener7 = null;
            }
            if (!F.isDoublesMatch()) {
                View.OnClickListener onClickListener8 = new View.OnClickListener(this) { // from class: q26
                    public final /* synthetic */ EventMatchesFragment b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i9 = i5;
                        View.OnClickListener onClickListener9 = onClickListener5;
                        EventMatchesFragment eventMatchesFragment = this.b;
                        switch (i9) {
                            case 0:
                                view2.getClass();
                                eventMatchesFragment.D(view2, onClickListener9 == null, ws2.d, eventMatchesFragment.A);
                                break;
                            default:
                                view2.getClass();
                                eventMatchesFragment.D(view2, onClickListener9 == null, ws2.d, eventMatchesFragment.B);
                                break;
                        }
                    }
                };
                View.OnClickListener onClickListener9 = new View.OnClickListener(this) { // from class: q26
                    public final /* synthetic */ EventMatchesFragment b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i9 = i3;
                        View.OnClickListener onClickListener92 = onClickListener6;
                        EventMatchesFragment eventMatchesFragment = this.b;
                        switch (i9) {
                            case 0:
                                view2.getClass();
                                eventMatchesFragment.D(view2, onClickListener92 == null, ws2.d, eventMatchesFragment.A);
                                break;
                            default:
                                view2.getClass();
                                eventMatchesFragment.D(view2, onClickListener92 == null, ws2.d, eventMatchesFragment.B);
                                break;
                        }
                    }
                };
                if (onClickListener5 == null || onClickListener6 == null) {
                    String string = getString(R.string.tennis_singles);
                    string.getClass();
                    this.x = new xs2(string, onClickListener8, null, null);
                    String string2 = getString(R.string.tennis_singles);
                    string2.getClass();
                    this.y = new xs2(string2, onClickListener9, null, null);
                } else {
                    Context context = getContext();
                    String x2 = context == null ? null : d2a.x(context, groundType, true);
                    if (x2 == null) {
                        x2 = "";
                    }
                    this.x = new xs2(x2, onClickListener5, getString(R.string.tennis_singles), onClickListener8);
                    Context context2 = getContext();
                    String x3 = context2 == null ? null : d2a.x(context2, groundType, true);
                    if (x3 == null) {
                        x3 = "";
                    }
                    this.y = new xs2(x3, onClickListener6, getString(R.string.tennis_singles), onClickListener9);
                }
            } else if (onClickListener5 != null && onClickListener6 != null) {
                Context context3 = getContext();
                String x4 = context3 == null ? null : d2a.x(context3, groundType, true);
                if (x4 == null) {
                    x4 = "";
                }
                this.x = new xs2(x4, onClickListener5, null, null);
                Context context4 = getContext();
                String x5 = context4 == null ? null : d2a.x(context4, groundType, true);
                if (x5 == null) {
                    x5 = "";
                }
                this.y = new xs2(x5, onClickListener6, null, null);
            }
            if (onClickListener7 != null) {
                Context context5 = getContext();
                String x6 = context5 == null ? null : d2a.x(context5, groundType, true);
                this.z = new xs2(x6 != null ? x6 : "", onClickListener7, null, null);
            }
        } else {
            String string3 = getString(R.string.home);
            if (F.shouldReverseTeams()) {
                string3 = null;
            }
            if (string3 == null) {
                string3 = getString(R.string.away);
                string3.getClass();
            }
            final ws2 ws2Var = ws2.a;
            final ws2 ws2Var2 = !F.shouldReverseTeams() ? ws2Var : null;
            if (ws2Var2 == null) {
                ws2Var2 = ws2.b;
            }
            if (H(ok3.s(F))) {
                onClickListener = new View.OnClickListener(this) { // from class: r26
                    public final /* synthetic */ EventMatchesFragment b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i9 = i5;
                        ws2 ws2Var3 = ws2Var2;
                        EventMatchesFragment eventMatchesFragment = this.b;
                        switch (i9) {
                            case 0:
                                view2.getClass();
                                eventMatchesFragment.D(view2, true, ws2Var3, eventMatchesFragment.A);
                                break;
                            default:
                                view2.getClass();
                                eventMatchesFragment.D(view2, true, ws2Var3, eventMatchesFragment.B);
                                break;
                        }
                    }
                };
            } else {
                string3 = getString(R.string.this_competition);
                string3.getClass();
                onClickListener = new View.OnClickListener(this) { // from class: p26
                    public final /* synthetic */ EventMatchesFragment b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i82 = i4;
                        EventMatchesFragment eventMatchesFragment = this.b;
                        switch (i82) {
                            case 0:
                                view2.getClass();
                                eventMatchesFragment.D(view2, true, ws2.e, eventMatchesFragment.A);
                                break;
                            case 1:
                                view2.getClass();
                                eventMatchesFragment.D(view2, false, ws2.c, eventMatchesFragment.B);
                                break;
                            case 2:
                                view2.getClass();
                                eventMatchesFragment.D(view2, true, ws2.a, eventMatchesFragment.C);
                                break;
                            case 3:
                                view2.getClass();
                                eventMatchesFragment.D(view2, true, ws2.c, eventMatchesFragment.C);
                                break;
                            case 4:
                                view2.getClass();
                                eventMatchesFragment.D(view2, false, ws2.c, eventMatchesFragment.C);
                                break;
                            case 5:
                                view2.getClass();
                                eventMatchesFragment.D(view2, true, ws2.e, eventMatchesFragment.B);
                                break;
                            case 6:
                                view2.getClass();
                                eventMatchesFragment.D(view2, true, ws2.e, eventMatchesFragment.C);
                                break;
                            case 7:
                                view2.getClass();
                                eventMatchesFragment.D(view2, true, ws2.c, eventMatchesFragment.A);
                                break;
                            case 8:
                                view2.getClass();
                                eventMatchesFragment.D(view2, false, ws2.c, eventMatchesFragment.A);
                                break;
                            default:
                                view2.getClass();
                                eventMatchesFragment.D(view2, true, ws2.c, eventMatchesFragment.B);
                                break;
                        }
                    }
                };
            }
            if (H(ok3.s(F))) {
                final int i9 = 8;
                onClickListener2 = new View.OnClickListener(this) { // from class: p26
                    public final /* synthetic */ EventMatchesFragment b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i82 = i9;
                        EventMatchesFragment eventMatchesFragment = this.b;
                        switch (i82) {
                            case 0:
                                view2.getClass();
                                eventMatchesFragment.D(view2, true, ws2.e, eventMatchesFragment.A);
                                break;
                            case 1:
                                view2.getClass();
                                eventMatchesFragment.D(view2, false, ws2.c, eventMatchesFragment.B);
                                break;
                            case 2:
                                view2.getClass();
                                eventMatchesFragment.D(view2, true, ws2.a, eventMatchesFragment.C);
                                break;
                            case 3:
                                view2.getClass();
                                eventMatchesFragment.D(view2, true, ws2.c, eventMatchesFragment.C);
                                break;
                            case 4:
                                view2.getClass();
                                eventMatchesFragment.D(view2, false, ws2.c, eventMatchesFragment.C);
                                break;
                            case 5:
                                view2.getClass();
                                eventMatchesFragment.D(view2, true, ws2.e, eventMatchesFragment.B);
                                break;
                            case 6:
                                view2.getClass();
                                eventMatchesFragment.D(view2, true, ws2.e, eventMatchesFragment.C);
                                break;
                            case 7:
                                view2.getClass();
                                eventMatchesFragment.D(view2, true, ws2.c, eventMatchesFragment.A);
                                break;
                            case 8:
                                view2.getClass();
                                eventMatchesFragment.D(view2, false, ws2.c, eventMatchesFragment.A);
                                break;
                            default:
                                view2.getClass();
                                eventMatchesFragment.D(view2, true, ws2.c, eventMatchesFragment.B);
                                break;
                        }
                    }
                };
            } else {
                onClickListener2 = null;
            }
            this.x = new xs2(string3, onClickListener, getString(R.string.this_competition), onClickListener2);
            String string4 = getString(R.string.away);
            if (F.shouldReverseTeams()) {
                string4 = null;
            }
            if (string4 == null) {
                string4 = getString(R.string.home);
                string4.getClass();
            }
            ws2 ws2Var3 = ws2.b;
            if (F.shouldReverseTeams()) {
                ws2Var3 = null;
            }
            if (ws2Var3 != null) {
                ws2Var = ws2Var3;
            }
            if (H(ok3.s(F))) {
                onClickListener3 = new View.OnClickListener(this) { // from class: r26
                    public final /* synthetic */ EventMatchesFragment b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i92 = i3;
                        ws2 ws2Var32 = ws2Var;
                        EventMatchesFragment eventMatchesFragment = this.b;
                        switch (i92) {
                            case 0:
                                view2.getClass();
                                eventMatchesFragment.D(view2, true, ws2Var32, eventMatchesFragment.A);
                                break;
                            default:
                                view2.getClass();
                                eventMatchesFragment.D(view2, true, ws2Var32, eventMatchesFragment.B);
                                break;
                        }
                    }
                };
            } else {
                string4 = getString(R.string.this_competition);
                string4.getClass();
                final int i10 = 9;
                onClickListener3 = new View.OnClickListener(this) { // from class: p26
                    public final /* synthetic */ EventMatchesFragment b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i82 = i10;
                        EventMatchesFragment eventMatchesFragment = this.b;
                        switch (i82) {
                            case 0:
                                view2.getClass();
                                eventMatchesFragment.D(view2, true, ws2.e, eventMatchesFragment.A);
                                break;
                            case 1:
                                view2.getClass();
                                eventMatchesFragment.D(view2, false, ws2.c, eventMatchesFragment.B);
                                break;
                            case 2:
                                view2.getClass();
                                eventMatchesFragment.D(view2, true, ws2.a, eventMatchesFragment.C);
                                break;
                            case 3:
                                view2.getClass();
                                eventMatchesFragment.D(view2, true, ws2.c, eventMatchesFragment.C);
                                break;
                            case 4:
                                view2.getClass();
                                eventMatchesFragment.D(view2, false, ws2.c, eventMatchesFragment.C);
                                break;
                            case 5:
                                view2.getClass();
                                eventMatchesFragment.D(view2, true, ws2.e, eventMatchesFragment.B);
                                break;
                            case 6:
                                view2.getClass();
                                eventMatchesFragment.D(view2, true, ws2.e, eventMatchesFragment.C);
                                break;
                            case 7:
                                view2.getClass();
                                eventMatchesFragment.D(view2, true, ws2.c, eventMatchesFragment.A);
                                break;
                            case 8:
                                view2.getClass();
                                eventMatchesFragment.D(view2, false, ws2.c, eventMatchesFragment.A);
                                break;
                            default:
                                view2.getClass();
                                eventMatchesFragment.D(view2, true, ws2.c, eventMatchesFragment.B);
                                break;
                        }
                    }
                };
            }
            this.y = new xs2(string4, onClickListener3, getString(R.string.this_competition), H(ok3.s(F)) ? new View.OnClickListener(this) { // from class: p26
                public final /* synthetic */ EventMatchesFragment b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i82 = i3;
                    EventMatchesFragment eventMatchesFragment = this.b;
                    switch (i82) {
                        case 0:
                            view2.getClass();
                            eventMatchesFragment.D(view2, true, ws2.e, eventMatchesFragment.A);
                            break;
                        case 1:
                            view2.getClass();
                            eventMatchesFragment.D(view2, false, ws2.c, eventMatchesFragment.B);
                            break;
                        case 2:
                            view2.getClass();
                            eventMatchesFragment.D(view2, true, ws2.a, eventMatchesFragment.C);
                            break;
                        case 3:
                            view2.getClass();
                            eventMatchesFragment.D(view2, true, ws2.c, eventMatchesFragment.C);
                            break;
                        case 4:
                            view2.getClass();
                            eventMatchesFragment.D(view2, false, ws2.c, eventMatchesFragment.C);
                            break;
                        case 5:
                            view2.getClass();
                            eventMatchesFragment.D(view2, true, ws2.e, eventMatchesFragment.B);
                            break;
                        case 6:
                            view2.getClass();
                            eventMatchesFragment.D(view2, true, ws2.e, eventMatchesFragment.C);
                            break;
                        case 7:
                            view2.getClass();
                            eventMatchesFragment.D(view2, true, ws2.c, eventMatchesFragment.A);
                            break;
                        case 8:
                            view2.getClass();
                            eventMatchesFragment.D(view2, false, ws2.c, eventMatchesFragment.A);
                            break;
                        default:
                            view2.getClass();
                            eventMatchesFragment.D(view2, true, ws2.c, eventMatchesFragment.B);
                            break;
                    }
                }
            } : null);
            Team homeTeam = F.getHomeTeam(TeamSides.ORIGINAL);
            Context requireContext2 = requireContext();
            requireContext2.getClass();
            String i11 = wv8.i(getString(R.string.at), " ", tba.p(requireContext2, homeTeam));
            if (H(ok3.s(F))) {
                onClickListener4 = new View.OnClickListener(this) { // from class: p26
                    public final /* synthetic */ EventMatchesFragment b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i82 = i7;
                        EventMatchesFragment eventMatchesFragment = this.b;
                        switch (i82) {
                            case 0:
                                view2.getClass();
                                eventMatchesFragment.D(view2, true, ws2.e, eventMatchesFragment.A);
                                break;
                            case 1:
                                view2.getClass();
                                eventMatchesFragment.D(view2, false, ws2.c, eventMatchesFragment.B);
                                break;
                            case 2:
                                view2.getClass();
                                eventMatchesFragment.D(view2, true, ws2.a, eventMatchesFragment.C);
                                break;
                            case 3:
                                view2.getClass();
                                eventMatchesFragment.D(view2, true, ws2.c, eventMatchesFragment.C);
                                break;
                            case 4:
                                view2.getClass();
                                eventMatchesFragment.D(view2, false, ws2.c, eventMatchesFragment.C);
                                break;
                            case 5:
                                view2.getClass();
                                eventMatchesFragment.D(view2, true, ws2.e, eventMatchesFragment.B);
                                break;
                            case 6:
                                view2.getClass();
                                eventMatchesFragment.D(view2, true, ws2.e, eventMatchesFragment.C);
                                break;
                            case 7:
                                view2.getClass();
                                eventMatchesFragment.D(view2, true, ws2.c, eventMatchesFragment.A);
                                break;
                            case 8:
                                view2.getClass();
                                eventMatchesFragment.D(view2, false, ws2.c, eventMatchesFragment.A);
                                break;
                            default:
                                view2.getClass();
                                eventMatchesFragment.D(view2, true, ws2.c, eventMatchesFragment.B);
                                break;
                        }
                    }
                };
            } else {
                i11 = getString(R.string.this_competition);
                i11.getClass();
                onClickListener4 = new View.OnClickListener(this) { // from class: p26
                    public final /* synthetic */ EventMatchesFragment b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i82 = i6;
                        EventMatchesFragment eventMatchesFragment = this.b;
                        switch (i82) {
                            case 0:
                                view2.getClass();
                                eventMatchesFragment.D(view2, true, ws2.e, eventMatchesFragment.A);
                                break;
                            case 1:
                                view2.getClass();
                                eventMatchesFragment.D(view2, false, ws2.c, eventMatchesFragment.B);
                                break;
                            case 2:
                                view2.getClass();
                                eventMatchesFragment.D(view2, true, ws2.a, eventMatchesFragment.C);
                                break;
                            case 3:
                                view2.getClass();
                                eventMatchesFragment.D(view2, true, ws2.c, eventMatchesFragment.C);
                                break;
                            case 4:
                                view2.getClass();
                                eventMatchesFragment.D(view2, false, ws2.c, eventMatchesFragment.C);
                                break;
                            case 5:
                                view2.getClass();
                                eventMatchesFragment.D(view2, true, ws2.e, eventMatchesFragment.B);
                                break;
                            case 6:
                                view2.getClass();
                                eventMatchesFragment.D(view2, true, ws2.e, eventMatchesFragment.C);
                                break;
                            case 7:
                                view2.getClass();
                                eventMatchesFragment.D(view2, true, ws2.c, eventMatchesFragment.A);
                                break;
                            case 8:
                                view2.getClass();
                                eventMatchesFragment.D(view2, false, ws2.c, eventMatchesFragment.A);
                                break;
                            default:
                                view2.getClass();
                                eventMatchesFragment.D(view2, true, ws2.c, eventMatchesFragment.B);
                                break;
                        }
                    }
                };
            }
            this.z = new xs2(i11, onClickListener4, getString(R.string.this_competition), H(ok3.s(F)) ? new View.OnClickListener(this) { // from class: p26
                public final /* synthetic */ EventMatchesFragment b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i82 = i2;
                    EventMatchesFragment eventMatchesFragment = this.b;
                    switch (i82) {
                        case 0:
                            view2.getClass();
                            eventMatchesFragment.D(view2, true, ws2.e, eventMatchesFragment.A);
                            break;
                        case 1:
                            view2.getClass();
                            eventMatchesFragment.D(view2, false, ws2.c, eventMatchesFragment.B);
                            break;
                        case 2:
                            view2.getClass();
                            eventMatchesFragment.D(view2, true, ws2.a, eventMatchesFragment.C);
                            break;
                        case 3:
                            view2.getClass();
                            eventMatchesFragment.D(view2, true, ws2.c, eventMatchesFragment.C);
                            break;
                        case 4:
                            view2.getClass();
                            eventMatchesFragment.D(view2, false, ws2.c, eventMatchesFragment.C);
                            break;
                        case 5:
                            view2.getClass();
                            eventMatchesFragment.D(view2, true, ws2.e, eventMatchesFragment.B);
                            break;
                        case 6:
                            view2.getClass();
                            eventMatchesFragment.D(view2, true, ws2.e, eventMatchesFragment.C);
                            break;
                        case 7:
                            view2.getClass();
                            eventMatchesFragment.D(view2, true, ws2.c, eventMatchesFragment.A);
                            break;
                        case 8:
                            view2.getClass();
                            eventMatchesFragment.D(view2, false, ws2.c, eventMatchesFragment.A);
                            break;
                        default:
                            view2.getClass();
                            eventMatchesFragment.D(view2, true, ws2.c, eventMatchesFragment.B);
                            break;
                    }
                }
            } : null);
        }
        otk otkVar = this.s;
        c36 c36Var = (c36) otkVar.getValue();
        u6b viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        c36Var.g(viewLifecycleOwner2, new n26(this, i5));
        ((c36) otkVar.getValue()).m.e(getViewLifecycleOwner(), new z1(11, new o26(this, i3)));
        ((c36) otkVar.getValue()).k.e(getViewLifecycleOwner(), new z1(11, new o26(this, i7)));
        z8e.y(this, ((tu7) this.t.getValue()).l, new r1(this, null, 22));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        if (((Boolean) this.v.getValue()).booleanValue()) {
            tu7 tu7Var = (tu7) this.t.getValue();
            xw3.L(un0.z(tu7Var), null, null, new qu7(tu7Var, F(), (rq3) null), 3);
        }
        c36 c36Var = (c36) this.s.getValue();
        iz2 z = un0.z(c36Var);
        hs4 hs4Var = z45.a;
        xw3.L(z, hq4.c, null, new w26(c36Var, null), 2);
    }
}
