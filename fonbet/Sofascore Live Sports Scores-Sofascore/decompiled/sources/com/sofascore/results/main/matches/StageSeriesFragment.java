package com.sofascore.results.main.matches;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewpager2.widget.ViewPager2;
import com.sofascore.model.Sports;
import com.sofascore.results.buzzer.BuzzerActivity;
import com.sofascore.results.main.matches.StageSeriesFragment;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a7i;
import defpackage.bi4;
import defpackage.eqb;
import defpackage.g2i;
import defpackage.g9i;
import defpackage.hk4;
import defpackage.hkg;
import defpackage.hwc;
import defpackage.krk;
import defpackage.lnb;
import defpackage.mqi;
import defpackage.n9e;
import defpackage.p7i;
import defpackage.wq8;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/main/matches/StageSeriesFragment;", "Lcom/sofascore/results/main/AbstractFadingFragment;", "Lwq8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StageSeriesFragment extends Hilt_StageSeriesFragment<wq8> {
    public final mqi t;
    public g9i u;
    public final mqi v;

    public StageSeriesFragment() {
        final int i = 0;
        this.t = ypa.b(new Function0(this) { // from class: z6i
            public final /* synthetic */ StageSeriesFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                StageSeriesFragment stageSeriesFragment = this.b;
                switch (i2) {
                    case 0:
                        krk krkVar = stageSeriesFragment.l;
                        krkVar.getClass();
                        return new p7i(stageSeriesFragment, ((wq8) krkVar).g);
                    case 1:
                        Context requireContext = stageSeriesFragment.requireContext();
                        requireContext.getClass();
                        return Integer.valueOf(ao2.v(16, requireContext));
                    default:
                        return new a7i(stageSeriesFragment);
                }
            }
        });
        final int i2 = 1;
        ypa.a(ysa.c, new Function0(this) { // from class: z6i
            public final /* synthetic */ StageSeriesFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                StageSeriesFragment stageSeriesFragment = this.b;
                switch (i22) {
                    case 0:
                        krk krkVar = stageSeriesFragment.l;
                        krkVar.getClass();
                        return new p7i(stageSeriesFragment, ((wq8) krkVar).g);
                    case 1:
                        Context requireContext = stageSeriesFragment.requireContext();
                        requireContext.getClass();
                        return Integer.valueOf(ao2.v(16, requireContext));
                    default:
                        return new a7i(stageSeriesFragment);
                }
            }
        });
        final int i3 = 2;
        this.v = ypa.b(new Function0(this) { // from class: z6i
            public final /* synthetic */ StageSeriesFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                StageSeriesFragment stageSeriesFragment = this.b;
                switch (i22) {
                    case 0:
                        krk krkVar = stageSeriesFragment.l;
                        krkVar.getClass();
                        return new p7i(stageSeriesFragment, ((wq8) krkVar).g);
                    case 1:
                        Context requireContext = stageSeriesFragment.requireContext();
                        requireContext.getClass();
                        return Integer.valueOf(ao2.v(16, requireContext));
                    default:
                        return new a7i(stageSeriesFragment);
                }
            }
        });
    }

    public final String D(LocalDate localDate) {
        LocalDate plusDays = localDate.plusDays(6L);
        bi4 bi4Var = localDate.getYear() == plusDays.getYear() ? bi4.PATTERN_DMM : bi4.PATTERN_DMMY;
        ConcurrentHashMap concurrentHashMap = hk4.a;
        String format = localDate.format(hk4.a(bi4Var.d()));
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
        this.i.b = Sports.MOTORSPORT;
        krk krkVar = this.l;
        krkVar.getClass();
        ViewPager2 viewPager2 = ((wq8) krkVar).g;
        mqi mqiVar = this.t;
        viewPager2.setAdapter((p7i) mqiVar.getValue());
        final int i = 0;
        ((p7i) mqiVar.getValue()).j.c(1073741823, false);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        ((wq8) krkVar2).g.a((a7i) this.v.getValue());
        krk krkVar3 = this.l;
        krkVar3.getClass();
        ((wq8) krkVar3).d.setPadding(0, 0, 0, 0);
        krk krkVar4 = this.l;
        krkVar4.getClass();
        CardView cardView = ((wq8) krkVar4).e;
        ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(0);
        marginLayoutParams.setMarginEnd(0);
        cardView.setLayoutParams(marginLayoutParams);
        krk krkVar5 = this.l;
        krkVar5.getClass();
        ((wq8) krkVar5).e.setRadius(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        krk krkVar6 = this.l;
        krkVar6.getClass();
        ((wq8) krkVar6).c.setOnClickListener(new View.OnClickListener(this) { // from class: y6i
            public final /* synthetic */ StageSeriesFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = i;
                StageSeriesFragment stageSeriesFragment = this.b;
                switch (i2) {
                    case 0:
                        krk krkVar7 = stageSeriesFragment.l;
                        krkVar7.getClass();
                        ViewPager2 viewPager22 = ((wq8) krkVar7).g;
                        stageSeriesFragment.l.getClass();
                        viewPager22.c(((wq8) r1).g.getCurrentItem() - 1, true);
                        break;
                    case 1:
                        krk krkVar8 = stageSeriesFragment.l;
                        krkVar8.getClass();
                        ViewPager2 viewPager23 = ((wq8) krkVar8).g;
                        krk krkVar9 = stageSeriesFragment.l;
                        krkVar9.getClass();
                        viewPager23.c(((wq8) krkVar9).g.getCurrentItem() + 1, true);
                        break;
                    default:
                        r4a.M(stageSeriesFragment.A().I);
                        break;
                }
            }
        });
        krk krkVar7 = this.l;
        krkVar7.getClass();
        final int i2 = 1;
        ((wq8) krkVar7).b.setOnClickListener(new View.OnClickListener(this) { // from class: y6i
            public final /* synthetic */ StageSeriesFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i2;
                StageSeriesFragment stageSeriesFragment = this.b;
                switch (i22) {
                    case 0:
                        krk krkVar72 = stageSeriesFragment.l;
                        krkVar72.getClass();
                        ViewPager2 viewPager22 = ((wq8) krkVar72).g;
                        stageSeriesFragment.l.getClass();
                        viewPager22.c(((wq8) r1).g.getCurrentItem() - 1, true);
                        break;
                    case 1:
                        krk krkVar8 = stageSeriesFragment.l;
                        krkVar8.getClass();
                        ViewPager2 viewPager23 = ((wq8) krkVar8).g;
                        krk krkVar9 = stageSeriesFragment.l;
                        krkVar9.getClass();
                        viewPager23.c(((wq8) krkVar9).g.getCurrentItem() + 1, true);
                        break;
                    default:
                        r4a.M(stageSeriesFragment.A().I);
                        break;
                }
            }
        });
        LocalDate with = LocalDate.now().with(TemporalAdjusters.previousOrSame(hwc.a));
        krk krkVar8 = this.l;
        krkVar8.getClass();
        TextView textView = ((wq8) krkVar8).f;
        with.getClass();
        textView.setText(D(with));
        krk krkVar9 = this.l;
        krkVar9.getClass();
        final int i3 = 2;
        ((wq8) krkVar9).f.setOnClickListener(new View.OnClickListener(this) { // from class: y6i
            public final /* synthetic */ StageSeriesFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i3;
                StageSeriesFragment stageSeriesFragment = this.b;
                switch (i22) {
                    case 0:
                        krk krkVar72 = stageSeriesFragment.l;
                        krkVar72.getClass();
                        ViewPager2 viewPager22 = ((wq8) krkVar72).g;
                        stageSeriesFragment.l.getClass();
                        viewPager22.c(((wq8) r1).g.getCurrentItem() - 1, true);
                        break;
                    case 1:
                        krk krkVar82 = stageSeriesFragment.l;
                        krkVar82.getClass();
                        ViewPager2 viewPager23 = ((wq8) krkVar82).g;
                        krk krkVar92 = stageSeriesFragment.l;
                        krkVar92.getClass();
                        viewPager23.c(((wq8) krkVar92).g.getCurrentItem() + 1, true);
                        break;
                    default:
                        r4a.M(stageSeriesFragment.A().I);
                        break;
                }
            }
        });
        A().k0.e(getViewLifecycleOwner(), new eqb(29, new g2i(this, 8)));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
    }
}
