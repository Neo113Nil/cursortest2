package com.sofascore.results.mma.mainScreen;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.sofascore.model.Sports;
import com.sofascore.results.buzzer.BuzzerActivity;
import com.sofascore.results.mma.mainScreen.MmaEventsFragment;
import defpackage.bi4;
import defpackage.duf;
import defpackage.emc;
import defpackage.g9i;
import defpackage.hk4;
import defpackage.hkg;
import defpackage.krk;
import defpackage.lnb;
import defpackage.mqi;
import defpackage.n9e;
import defpackage.omc;
import defpackage.otk;
import defpackage.ulc;
import defpackage.vlc;
import defpackage.wq8;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z1;
import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/mma/mainScreen/MmaEventsFragment;", "Lcom/sofascore/results/main/AbstractFadingFragment;", "Lwq8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MmaEventsFragment extends Hilt_MmaEventsFragment<wq8> {
    public final otk t = new otk(duf.a.getOrCreateKotlinClass(emc.class), new vlc(this, 0), new vlc(this, 2), new vlc(this, 1));
    public final mqi u;
    public g9i v;
    public final mqi w;

    public MmaEventsFragment() {
        final int i = 0;
        final int i2 = 1;
        final int i3 = 2;
        this.u = ypa.b(new Function0(this) { // from class: rlc
            public final /* synthetic */ MmaEventsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i;
                MmaEventsFragment mmaEventsFragment = this.b;
                switch (i4) {
                    case 0:
                        krk krkVar = mmaEventsFragment.l;
                        krkVar.getClass();
                        return new omc(mmaEventsFragment, ((wq8) krkVar).g, fc6.t(Instant.ofEpochMilli(ke0.a.getTimeInMillis())));
                    case 1:
                        Context requireContext = mmaEventsFragment.requireContext();
                        requireContext.getClass();
                        return Integer.valueOf(ao2.s(16, requireContext));
                    default:
                        return new ulc(mmaEventsFragment);
                }
            }
        });
        ypa.a(ysa.c, new Function0(this) { // from class: rlc
            public final /* synthetic */ MmaEventsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i2;
                MmaEventsFragment mmaEventsFragment = this.b;
                switch (i4) {
                    case 0:
                        krk krkVar = mmaEventsFragment.l;
                        krkVar.getClass();
                        return new omc(mmaEventsFragment, ((wq8) krkVar).g, fc6.t(Instant.ofEpochMilli(ke0.a.getTimeInMillis())));
                    case 1:
                        Context requireContext = mmaEventsFragment.requireContext();
                        requireContext.getClass();
                        return Integer.valueOf(ao2.s(16, requireContext));
                    default:
                        return new ulc(mmaEventsFragment);
                }
            }
        });
        this.w = ypa.b(new Function0(this) { // from class: rlc
            public final /* synthetic */ MmaEventsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i3;
                MmaEventsFragment mmaEventsFragment = this.b;
                switch (i4) {
                    case 0:
                        krk krkVar = mmaEventsFragment.l;
                        krkVar.getClass();
                        return new omc(mmaEventsFragment, ((wq8) krkVar).g, fc6.t(Instant.ofEpochMilli(ke0.a.getTimeInMillis())));
                    case 1:
                        Context requireContext = mmaEventsFragment.requireContext();
                        requireContext.getClass();
                        return Integer.valueOf(ao2.s(16, requireContext));
                    default:
                        return new ulc(mmaEventsFragment);
                }
            }
        });
    }

    public final String D(LocalDate localDate) {
        LocalDate minusDays = localDate.minusDays(3L);
        LocalDate plusDays = localDate.plusDays(3L);
        bi4 bi4Var = minusDays.getYear() == plusDays.getYear() ? bi4.PATTERN_DMM : bi4.PATTERN_DMMY;
        ConcurrentHashMap concurrentHashMap = hk4.a;
        String format = minusDays.format(hk4.a(bi4Var.d()));
        format.getClass();
        String format2 = plusDays.format(hk4.a(bi4.PATTERN_DMMY.d()));
        format2.getClass();
        String o = lnb.o(format, " - ", format2);
        Context requireContext = requireContext();
        requireContext.getClass();
        return hkg.c0(requireContext) ? n9e.G(o, " - ") : o;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        return wq8.a(getLayoutInflater());
    }

    @Override // com.sofascore.results.main.AbstractFadingFragment, com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        int i = BuzzerActivity.O;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "MatchesNestedTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        this.i.b = Sports.MMA;
        krk krkVar = this.l;
        krkVar.getClass();
        ViewPager2 viewPager2 = ((wq8) krkVar).g;
        mqi mqiVar = this.u;
        viewPager2.setAdapter((omc) mqiVar.getValue());
        final int i = 0;
        ((omc) mqiVar.getValue()).j.c(1073741823, false);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        ((wq8) krkVar2).g.a((ulc) this.w.getValue());
        A().k0.e(getViewLifecycleOwner(), new z1(23, new Function1(this) { // from class: slc
            public final /* synthetic */ MmaEventsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = i;
                MmaEventsFragment mmaEventsFragment = this.b;
                switch (i2) {
                    case 0:
                        Calendar calendar = (Calendar) ((pn3) obj).a();
                        if (calendar != null) {
                            LocalDate of = LocalDate.of(calendar.get(1), calendar.get(2) + 1, calendar.get(5));
                            omc omcVar = (omc) mmaEventsFragment.u.getValue();
                            of.getClass();
                            omcVar.getClass();
                            omcVar.k = of;
                            omcVar.notifyDataSetChanged();
                            omcVar.j.c(1073741823, false);
                            krk krkVar3 = mmaEventsFragment.l;
                            krkVar3.getClass();
                            ((wq8) krkVar3).f.setText(mmaEventsFragment.D(of));
                        }
                        break;
                    default:
                        LocalDate localDate = (LocalDate) obj;
                        omc omcVar2 = (omc) mmaEventsFragment.u.getValue();
                        localDate.getClass();
                        omcVar2.getClass();
                        int between = ((int) ChronoUnit.DAYS.between(omcVar2.k, localDate)) + 3;
                        int i3 = between / 7;
                        if ((between ^ 7) < 0 && i3 * 7 != between) {
                            i3--;
                        }
                        krk krkVar4 = mmaEventsFragment.l;
                        krkVar4.getClass();
                        ((wq8) krkVar4).g.c(1073741823 + i3, true);
                        break;
                }
                return Unit.a;
            }
        }));
        krk krkVar3 = this.l;
        krkVar3.getClass();
        ((wq8) krkVar3).c.setOnClickListener(new View.OnClickListener(this) { // from class: tlc
            public final /* synthetic */ MmaEventsFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = i;
                MmaEventsFragment mmaEventsFragment = this.b;
                switch (i2) {
                    case 0:
                        krk krkVar4 = mmaEventsFragment.l;
                        krkVar4.getClass();
                        ViewPager2 viewPager22 = ((wq8) krkVar4).g;
                        mmaEventsFragment.l.getClass();
                        viewPager22.c(((wq8) r1).g.getCurrentItem() - 1, true);
                        break;
                    case 1:
                        krk krkVar5 = mmaEventsFragment.l;
                        krkVar5.getClass();
                        ViewPager2 viewPager23 = ((wq8) krkVar5).g;
                        krk krkVar6 = mmaEventsFragment.l;
                        krkVar6.getClass();
                        viewPager23.c(((wq8) krkVar6).g.getCurrentItem() + 1, true);
                        break;
                    default:
                        r4a.M(mmaEventsFragment.A().I);
                        break;
                }
            }
        });
        krk krkVar4 = this.l;
        krkVar4.getClass();
        final int i2 = 1;
        ((wq8) krkVar4).b.setOnClickListener(new View.OnClickListener(this) { // from class: tlc
            public final /* synthetic */ MmaEventsFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i2;
                MmaEventsFragment mmaEventsFragment = this.b;
                switch (i22) {
                    case 0:
                        krk krkVar42 = mmaEventsFragment.l;
                        krkVar42.getClass();
                        ViewPager2 viewPager22 = ((wq8) krkVar42).g;
                        mmaEventsFragment.l.getClass();
                        viewPager22.c(((wq8) r1).g.getCurrentItem() - 1, true);
                        break;
                    case 1:
                        krk krkVar5 = mmaEventsFragment.l;
                        krkVar5.getClass();
                        ViewPager2 viewPager23 = ((wq8) krkVar5).g;
                        krk krkVar6 = mmaEventsFragment.l;
                        krkVar6.getClass();
                        viewPager23.c(((wq8) krkVar6).g.getCurrentItem() + 1, true);
                        break;
                    default:
                        r4a.M(mmaEventsFragment.A().I);
                        break;
                }
            }
        });
        krk krkVar5 = this.l;
        krkVar5.getClass();
        TextView textView = ((wq8) krkVar5).f;
        LocalDate now = LocalDate.now();
        now.getClass();
        textView.setText(D(now));
        krk krkVar6 = this.l;
        krkVar6.getClass();
        final int i3 = 2;
        ((wq8) krkVar6).f.setOnClickListener(new View.OnClickListener(this) { // from class: tlc
            public final /* synthetic */ MmaEventsFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i3;
                MmaEventsFragment mmaEventsFragment = this.b;
                switch (i22) {
                    case 0:
                        krk krkVar42 = mmaEventsFragment.l;
                        krkVar42.getClass();
                        ViewPager2 viewPager22 = ((wq8) krkVar42).g;
                        mmaEventsFragment.l.getClass();
                        viewPager22.c(((wq8) r1).g.getCurrentItem() - 1, true);
                        break;
                    case 1:
                        krk krkVar52 = mmaEventsFragment.l;
                        krkVar52.getClass();
                        ViewPager2 viewPager23 = ((wq8) krkVar52).g;
                        krk krkVar62 = mmaEventsFragment.l;
                        krkVar62.getClass();
                        viewPager23.c(((wq8) krkVar62).g.getCurrentItem() + 1, true);
                        break;
                    default:
                        r4a.M(mmaEventsFragment.A().I);
                        break;
                }
            }
        });
        ((emc) this.t.getValue()).f.e(getViewLifecycleOwner(), new z1(23, new Function1(this) { // from class: slc
            public final /* synthetic */ MmaEventsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = i2;
                MmaEventsFragment mmaEventsFragment = this.b;
                switch (i22) {
                    case 0:
                        Calendar calendar = (Calendar) ((pn3) obj).a();
                        if (calendar != null) {
                            LocalDate of = LocalDate.of(calendar.get(1), calendar.get(2) + 1, calendar.get(5));
                            omc omcVar = (omc) mmaEventsFragment.u.getValue();
                            of.getClass();
                            omcVar.getClass();
                            omcVar.k = of;
                            omcVar.notifyDataSetChanged();
                            omcVar.j.c(1073741823, false);
                            krk krkVar32 = mmaEventsFragment.l;
                            krkVar32.getClass();
                            ((wq8) krkVar32).f.setText(mmaEventsFragment.D(of));
                        }
                        break;
                    default:
                        LocalDate localDate = (LocalDate) obj;
                        omc omcVar2 = (omc) mmaEventsFragment.u.getValue();
                        localDate.getClass();
                        omcVar2.getClass();
                        int between = ((int) ChronoUnit.DAYS.between(omcVar2.k, localDate)) + 3;
                        int i32 = between / 7;
                        if ((between ^ 7) < 0 && i32 * 7 != between) {
                            i32--;
                        }
                        krk krkVar42 = mmaEventsFragment.l;
                        krkVar42.getClass();
                        ((wq8) krkVar42).g.c(1073741823 + i32, true);
                        break;
                }
                return Unit.a;
            }
        }));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
    }
}
