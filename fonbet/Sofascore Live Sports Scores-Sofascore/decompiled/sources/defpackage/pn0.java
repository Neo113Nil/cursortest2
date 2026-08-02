package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.n;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.inmobi.media.C3485i2;
import com.inmobi.media.Ha;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.common.widget.NestedHorizontalScrollView;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;
import com.sofascore.model.newNetwork.ESportRound;
import com.sofascore.model.newNetwork.ESportsGameRoundsResponse;
import com.sofascore.results.R;
import com.sofascore.results.event.details.view.shootout.PenaltiesGridView;
import com.sofascore.results.featuredtournament.view.FeaturedTournamentCalendarRailView;
import com.sofascore.results.league.view.cuptree.CupTreeExtendedView;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class pn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pn0(ih6 ih6Var, int i, boolean z) {
        this.a = 7;
        this.c = ih6Var;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<ESportRound> overtimeRounds;
        int i = this.a;
        int i2 = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                rn0 rn0Var = ((qn0) obj).b;
                if (i2 != -3 && i2 != -2) {
                    if (i2 == -1) {
                        lg6 lg6Var = rn0Var.c;
                        if (lg6Var != null) {
                            ug6 ug6Var = lg6Var.a;
                            boolean n = ug6Var.n();
                            ug6Var.Q(-1, n ? 2 : 1, n);
                        }
                        rn0Var.a();
                        break;
                    } else if (i2 == 1) {
                        rn0Var.b(1);
                        lg6 lg6Var2 = rn0Var.c;
                        if (lg6Var2 != null) {
                            ug6 ug6Var2 = lg6Var2.a;
                            ug6Var2.Q(1, 1, ug6Var2.n());
                            break;
                        }
                    } else {
                        m6k.f0();
                        break;
                    }
                } else if (i2 == -2) {
                    lg6 lg6Var3 = rn0Var.c;
                    if (lg6Var3 != null) {
                        ug6 ug6Var3 = lg6Var3.a;
                        boolean n2 = ug6Var3.n();
                        ug6Var3.Q(0, n2 ? 2 : 1, n2);
                    }
                    rn0Var.b(2);
                    break;
                } else {
                    rn0Var.b(3);
                    break;
                }
                break;
            case 1:
                mg6 mg6Var = ((ro0) obj).b;
                String str = nik.a;
                jy0 jy0Var = mg6Var.a.C;
                kg6 kg6Var = new kg6(i2);
                jy0Var.getClass();
                z1a.E(Looper.myLooper() == ((zqi) jy0Var.c).a.getLooper());
                jy0Var.a++;
                jy0Var.e(new r0(19, jy0Var, kg6Var));
                jy0Var.h(Integer.valueOf(i2));
                break;
            case 2:
                ((ScrollInterceptorHorizontalScrollView) ((p12) obj).g).scrollTo(i2, 0);
                break;
            case 3:
                ((ScrollInterceptorHorizontalScrollView) ((j22) obj).p).scrollTo(i2, 0);
                break;
            case 4:
                ((ScrollInterceptorHorizontalScrollView) ((ez0) obj).d).scrollTo(i2, 0);
                break;
            case 5:
                nd2 nd2Var = (nd2) obj;
                Context context = nd2Var.getContext();
                context.getClass();
                nd2Var.s = (i2 - ao2.s(Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE, context)) / nd2Var.t;
                ESportsGameRoundsResponse eSportsGameRoundsResponse = nd2Var.p;
                if (eSportsGameRoundsResponse != null && (overtimeRounds = eSportsGameRoundsResponse.getOvertimeRounds()) != null && !overtimeRounds.isEmpty() && eSportsGameRoundsResponse.getOvertimeChunkSize() != null) {
                    List<ESportRound> overtimeRounds2 = eSportsGameRoundsResponse.getOvertimeRounds();
                    overtimeRounds2.getClass();
                    Integer overtimeChunkSize = eSportsGameRoundsResponse.getOvertimeChunkSize();
                    overtimeChunkSize.getClass();
                    nd2Var.n(overtimeChunkSize.intValue(), overtimeRounds2);
                }
                nd2Var.requestLayout();
                break;
            case 6:
                CupTreeExtendedView.q((CupTreeExtendedView) obj, i2);
                break;
            case 7:
                ih6 ih6Var = (ih6) obj;
                cn4 cn4Var = ih6Var.v;
                int i3 = ((n51) ih6Var.a[i2].e).b;
                cn4Var.q(cn4Var.p(), IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, new eg4(15));
                break;
            case 8:
                FeaturedTournamentCalendarRailView featuredTournamentCalendarRailView = (FeaturedTournamentCalendarRailView) obj;
                int i4 = FeaturedTournamentCalendarRailView.f;
                int i5 = (Resources.getSystem().getDisplayMetrics().widthPixels - featuredTournamentCalendarRailView.b) / 2;
                n layoutManager = featuredTournamentCalendarRailView.getLayoutManager();
                layoutManager.getClass();
                ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(i2, i5);
                break;
            case 9:
                Ha.a((Ha) obj, i2);
                break;
            case 10:
                int[] iArr = MaterialButton.N;
                ((MaterialButton) obj).setIconSize(i2);
                break;
            case 11:
                PenaltiesGridView penaltiesGridView = (PenaltiesGridView) obj;
                boolean z = penaltiesGridView.f;
                hcb hcbVar = penaltiesGridView.d;
                if (!z) {
                    GridLayout gridLayout = (GridLayout) hcbVar.b;
                    gridLayout.removeAllViews();
                    int i6 = penaltiesGridView.e;
                    gridLayout.setColumnCount(((i2 - i6) / (i6 * 2)) + 1);
                    gridLayout.setRowCount((penaltiesGridView.g.size() / gridLayout.getColumnCount()) + 1);
                    penaltiesGridView.setOutcomes(penaltiesGridView.g);
                    break;
                }
                break;
            case 12:
                ede edeVar = (ede) obj;
                mm3 mm3Var = new mm3();
                e92 e92Var = edeVar.f;
                int i7 = edeVar.h;
                int i8 = edeVar.l;
                int i9 = edeVar.j;
                int i10 = edeVar.i;
                mm3Var.e((ConstraintLayout) ((v82) e92Var.c).b);
                mm3Var.d(R.id.team_logo_image, 6);
                mm3Var.d(R.id.team_logo_image, 7);
                mm3Var.d(R.id.team_score_text, 6);
                mm3Var.d(R.id.team_score_text, 7);
                if (i2 >= edeVar.g) {
                    LinearLayout linearLayout = (LinearLayout) e92Var.b;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ((v82) e92Var.d).b;
                    v82 v82Var = (v82) e92Var.c;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) v82Var.b;
                    linearLayout.setOrientation(0);
                    ((LinearLayout) e92Var.b).setPaddingRelative(i9, 0, i9, 0);
                    constraintLayout.setMaxWidth(i8);
                    ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                    layoutParams.getClass();
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.width = 0;
                    layoutParams2.weight = 1.0f;
                    layoutParams2.setMarginStart(0);
                    ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = i10;
                    layoutParams2.setMarginEnd(i7);
                    ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = 0;
                    constraintLayout.setLayoutParams(layoutParams2);
                    constraintLayout2.setMaxWidth(i8);
                    mm3Var.f(R.id.team_logo_image, 7, 0, 7);
                    mm3Var.f(R.id.team_score_text, 6, 0, 6);
                    mm3Var.r(R.id.team_score_text, 6, i10);
                    ((TextView) v82Var.e).setGravity(8388627);
                    ViewGroup.LayoutParams layoutParams3 = constraintLayout2.getLayoutParams();
                    layoutParams3.getClass();
                    LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                    layoutParams4.width = 0;
                    layoutParams4.weight = 1.0f;
                    layoutParams4.setMarginStart(i7);
                    ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = i10;
                    layoutParams4.setMarginEnd(0);
                    ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = 0;
                    constraintLayout2.setLayoutParams(layoutParams4);
                } else {
                    LinearLayout linearLayout2 = (LinearLayout) e92Var.b;
                    ConstraintLayout constraintLayout3 = (ConstraintLayout) ((v82) e92Var.d).b;
                    v82 v82Var2 = (v82) e92Var.c;
                    ConstraintLayout constraintLayout4 = (ConstraintLayout) v82Var2.b;
                    linearLayout2.setOrientation(1);
                    LinearLayout linearLayout3 = (LinearLayout) e92Var.b;
                    int i11 = edeVar.k;
                    linearLayout3.setPaddingRelative(i11, 0, i11, 0);
                    constraintLayout3.setMaxWidth(Integer.MAX_VALUE);
                    ViewGroup.LayoutParams layoutParams5 = constraintLayout3.getLayoutParams();
                    layoutParams5.getClass();
                    LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
                    layoutParams6.width = -1;
                    layoutParams6.setMarginEnd(0);
                    layoutParams6.setMarginStart(0);
                    ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin = i10;
                    layoutParams6.setMarginEnd(0);
                    ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin = 0;
                    constraintLayout3.setLayoutParams(layoutParams6);
                    constraintLayout4.setMaxWidth(Integer.MAX_VALUE);
                    mm3Var.f(R.id.team_logo_image, 6, 0, 6);
                    mm3Var.f(R.id.team_score_text, 7, 0, 7);
                    mm3Var.r(R.id.team_score_text, 7, i10);
                    ((TextView) v82Var2.e).setGravity(8388629);
                    ViewGroup.LayoutParams layoutParams7 = constraintLayout4.getLayoutParams();
                    layoutParams7.getClass();
                    LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) layoutParams7;
                    layoutParams8.width = -1;
                    layoutParams8.setMarginStart(0);
                    ((ViewGroup.MarginLayoutParams) layoutParams8).topMargin = i9;
                    layoutParams8.setMarginEnd(0);
                    ((ViewGroup.MarginLayoutParams) layoutParams8).bottomMargin = 0;
                    constraintLayout4.setLayoutParams(layoutParams8);
                }
                mm3Var.a((ConstraintLayout) ((v82) e92Var.c).b);
                break;
            case 13:
                ((HorizontalScrollView) ((pye) obj).d.k).setScrollX(i2);
                break;
            case 14:
                ((ViewPager2) ((c4f) obj).d.c).c(i2, true);
                break;
            case 15:
                ((t6a) obj).B(i2);
                break;
            case 16:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                WeakReference weakReference = sideSheetBehavior.p;
                View view = weakReference != null ? (View) weakReference.get() : null;
                if (view != null) {
                    sideSheetBehavior.z(view, i2, false);
                    break;
                }
                break;
            case 17:
                ((ScrollInterceptorHorizontalScrollView) obj).setScrollX(i2);
                break;
            case 18:
                ((NestedHorizontalScrollView) ((p6j) obj).d.k).fullScroll(i2);
                break;
            case 19:
                eum eumVar = ((zgm) obj).c;
                jsi h = eumVar.c.h(i2);
                if (h != null) {
                    eumVar.c.l(h, true);
                    break;
                }
                break;
            default:
                C3485i2.a((C3485i2) obj, i2);
                break;
        }
    }

    public /* synthetic */ pn0(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}
