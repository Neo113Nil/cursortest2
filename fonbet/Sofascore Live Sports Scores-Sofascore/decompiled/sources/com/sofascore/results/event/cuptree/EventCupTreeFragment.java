package com.sofascore.results.event.cuptree;

import androidx.fragment.app.FragmentActivity;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.event.cuptree.EventCupTreeFragment;
import defpackage.a70;
import defpackage.bx5;
import defpackage.dsi;
import defpackage.duf;
import defpackage.hz8;
import defpackage.mqi;
import defpackage.mr5;
import defpackage.otk;
import defpackage.ypa;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/event/cuptree/EventCupTreeFragment;", "Lcom/sofascore/results/league/fragment/cuptree/BaseCupTreeFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EventCupTreeFragment extends Hilt_EventCupTreeFragment {
    public final otk A = new otk(duf.a.getOrCreateKotlinClass(mr5.class), new bx5(this, 0), new bx5(this, 2), new bx5(this, 1));
    public final mqi B;
    public final mqi C;
    public final mqi D;

    public EventCupTreeFragment() {
        final int i = 0;
        final int i2 = 1;
        final int i3 = 2;
        this.B = ypa.b(new Function0(this) { // from class: ax5
            public final /* synthetic */ EventCupTreeFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i;
                EventCupTreeFragment eventCupTreeFragment = this.b;
                switch (i4) {
                    case 0:
                        return eventCupTreeFragment.N().getTournament();
                    case 1:
                        return eventCupTreeFragment.N().getSeason();
                    default:
                        return Integer.valueOf(eventCupTreeFragment.N().getId());
                }
            }
        });
        this.C = ypa.b(new Function0(this) { // from class: ax5
            public final /* synthetic */ EventCupTreeFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i2;
                EventCupTreeFragment eventCupTreeFragment = this.b;
                switch (i4) {
                    case 0:
                        return eventCupTreeFragment.N().getTournament();
                    case 1:
                        return eventCupTreeFragment.N().getSeason();
                    default:
                        return Integer.valueOf(eventCupTreeFragment.N().getId());
                }
            }
        });
        this.D = ypa.b(new Function0(this) { // from class: ax5
            public final /* synthetic */ EventCupTreeFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i3;
                EventCupTreeFragment eventCupTreeFragment = this.b;
                switch (i4) {
                    case 0:
                        return eventCupTreeFragment.N().getTournament();
                    case 1:
                        return eventCupTreeFragment.N().getSeason();
                    default:
                        return Integer.valueOf(eventCupTreeFragment.N().getId());
                }
            }
        });
    }

    @Override // com.sofascore.results.league.fragment.cuptree.BaseCupTreeFragment
    public final Integer D() {
        return (Integer) this.D.getValue();
    }

    @Override // com.sofascore.results.league.fragment.cuptree.BaseCupTreeFragment
    public final Season G() {
        return (Season) this.C.getValue();
    }

    @Override // com.sofascore.results.league.fragment.cuptree.BaseCupTreeFragment
    public final Tournament H() {
        return (Tournament) this.B.getValue();
    }

    @Override // com.sofascore.results.league.fragment.cuptree.BaseCupTreeFragment
    public final void I(boolean z) {
        FragmentActivity requireActivity = requireActivity();
        EventActivity eventActivity = requireActivity instanceof EventActivity ? (EventActivity) requireActivity : null;
        if (eventActivity != null) {
            if (z) {
                hz8.B(eventActivity.R().d, 200L);
            } else {
                hz8.C(eventActivity.R().d, 200L, 9);
            }
            if (((dsi) eventActivity.Q.getValue()).d) {
                return;
            }
            eventActivity.R().k.setUserInputEnabled(!z);
            if (z) {
                hz8.B(eventActivity.R().i, 200L);
                eventActivity.R().e.y(1);
            } else {
                eventActivity.R().e.y(0);
                hz8.C(eventActivity.R().i, 200L, 9);
            }
        }
    }

    public final Event N() {
        Object d = ((mr5) this.A.getValue()).v.d();
        if (d != null) {
            return (Event) d;
        }
        a70.r("Required value was null.");
        return null;
    }
}
