package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import com.adsbynimbus.render.mraid.Host;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.sofascore.results.bettingtips.fragment.TeamStreaksFragment;
import com.sofascore.results.stagesport.fragments.details.StageDetailsRankingFragment;
import com.sofascore.results.stagesport.fragments.media.StageMediaFragment;
import com.sofascore.results.stagesport.fragments.raceFlow.StageDetailsRaceFlowFragment;
import com.sofascore.results.team.lastnext.TeamEventsFragment;
import com.sofascore.results.team.lastnext.calendar.monthpicker.TeamEventsCalendarMonthPickerBottomSheet;
import com.sofascore.results.team.media.TeamMediaFragment;
import com.sofascore.results.team.squad.TeamSquadFragment;
import com.sofascore.results.team.standings.TeamStandingsFragment;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class o1i extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1i(Object obj, int i) {
        super(0);
        this.i = i;
        this.j = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        Object obj = this.j;
        switch (i) {
            case 0:
                return (ttk) ((n1i) obj).invoke();
            case 1:
                return (ttk) ((t1i) obj).invoke();
            case 2:
                return (ttk) ((i2i) obj).invoke();
            case 3:
                return (StageDetailsRaceFlowFragment) obj;
            case 4:
                return (ttk) ((o1i) obj).invoke();
            case 5:
                return (StageDetailsRankingFragment) obj;
            case 6:
                return (ttk) ((o1i) obj).invoke();
            case 7:
                return (ttk) ((z3i) obj).invoke();
            case 8:
                return (ttk) ((u4i) obj).invoke();
            case 9:
                return (StageMediaFragment) obj;
            case 10:
                return (ttk) ((o1i) obj).invoke();
            case 11:
                return (ttk) ((t5i) obj).invoke();
            case 12:
                return (ttk) ((n7i) obj).invoke();
            case 13:
                xdi xdiVar = (xdi) obj;
                hcd hcdVar = xdiVar.f;
                lcd lcdVar = xdiVar.l;
                String str = hcdVar.i() ? "interstitial" : "inline";
                DisplayMetrics displayMetrics = lcdVar.getResources().getDisplayMetrics();
                displayMetrics.getClass();
                int C = iz8.C(displayMetrics, lcdVar.getRootView().getWidth());
                int C2 = iz8.C(displayMetrics, lcdVar.getRootView().getHeight());
                ljh ljhVar = new ljh(C, C2);
                DisplayMetrics displayMetrics2 = lcdVar.getResources().getDisplayMetrics();
                displayMetrics2.getClass();
                l2f l2fVar = new l2f(iz8.C(displayMetrics2, lcdVar.getWidth()), iz8.C(displayMetrics2, lcdVar.getHeight()), iz8.C(displayMetrics2, lcdVar.getLeft()), iz8.C(displayMetrics2, lcdVar.getTop()));
                boolean z = lcdVar.b && lcdVar.getGlobalVisibleRect(new Rect());
                Context context = lcdVar.getContext();
                context.getClass();
                ie0 ie0Var = new ie0(context.getResources().getConfiguration().orientation == 2 ? U3.i.C : U3.i.D);
                DisplayMetrics displayMetrics3 = lcdVar.getResources().getDisplayMetrics();
                displayMetrics3.getClass();
                return new Host(ie0Var, l2fVar, z, str, ljhVar, new ljh(iz8.C(displayMetrics3, displayMetrics3.widthPixels), iz8.C(displayMetrics3, displayMetrics3.heightPixels)), (mwd) null, (a1g) null, l2fVar, "loading", new wh6(C, C2, str.equals("interstitial")), sub.d(new Pair("inlineVideo", Boolean.TRUE)), "3.0", PsExtractor.AUDIO_STREAM, (DefaultConstructorMarker) null);
            case 14:
                kna a = ((xji) obj).a();
                wma wmaVar = a.a;
                if (a.n != ((i1d) ((j0d) wmaVar.p()).b).c) {
                    x0d x0dVar = a.f;
                    Object[] objArr = x0dVar.c;
                    long[] jArr = x0dVar.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j = jArr[i2];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i3 = 8 - ((~(i2 - length)) >>> 31);
                                for (int i4 = 0; i4 < i3; i4++) {
                                    if ((255 & j) < 128) {
                                        ((cna) objArr[(i2 << 3) + i4]).d = true;
                                    }
                                    j >>= 8;
                                }
                                if (i3 != 8) {
                                }
                            }
                            if (i2 != length) {
                                i2++;
                            }
                        }
                    }
                    if (wmaVar.h != null) {
                        if (!wmaVar.G.e) {
                            wma.T(wmaVar, false, 7);
                        }
                    } else if (!wmaVar.r()) {
                        wma.V(wmaVar, false, 7);
                    }
                }
                return Unit.a;
            case 15:
                return (TeamEventsCalendarMonthPickerBottomSheet) obj;
            case 16:
                return (ttk) ((o1i) obj).invoke();
            case 17:
                return (ttk) ((w1i) obj).invoke();
            case 18:
                return (TeamEventsFragment) obj;
            case 19:
                return (ttk) ((o1i) obj).invoke();
            case 20:
                return (TeamMediaFragment) obj;
            case 21:
                return (ttk) ((o1i) obj).invoke();
            case 22:
                return (ttk) ((hyi) obj).invoke();
            case 23:
                return (ttk) ((oyi) obj).invoke();
            case 24:
                return (ttk) ((s0j) obj).invoke();
            case 25:
                return (TeamSquadFragment) obj;
            case 26:
                return (ttk) ((o1i) obj).invoke();
            case 27:
                return (TeamStandingsFragment) obj;
            case 28:
                return (ttk) ((o1i) obj).invoke();
            default:
                return (TeamStreaksFragment) obj;
        }
    }
}
