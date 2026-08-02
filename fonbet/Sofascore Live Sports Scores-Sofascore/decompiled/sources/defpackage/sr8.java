package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Movie;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import com.blaze.blazesdk.ads.ima.exo_player.ImaPresenterActivity;
import com.inmobi.media.M0;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.mvvm.model.Round;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.results.R;
import com.sofascore.results.bettingtips.fragment.HighValueStreaksFragment;
import com.sofascore.results.league.fragment.awards.LeagueAwardsFragment;
import com.sofascore.results.league.fragment.cuptree.LeagueCupTreeFragment;
import com.sofascore.results.league.fragment.details.compose.LeaguePlayerUpdatesBottomSheet;
import com.sofascore.results.main.fantasy.MainFantasyFragment;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeViewModel;
import com.sofascore.results.weeklyChallenge.leaderboard.LeaderboardInfoModal;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class sr8 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sr8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        wr8 wr8Var;
        SharedPreferences d;
        int i;
        WeeklyChallengeViewModel.LeaderboardInfoType leaderboardInfoType;
        boolean z = true;
        int i2 = 0;
        switch (this.a) {
            case 0:
                xr8 xr8Var = (xr8) this.b;
                String str = xr8Var.b;
                if (str == null || !xr8Var.d) {
                    wr8Var = new wr8(xr8Var.a, xr8Var.b, new t9d(22), xr8Var.c, xr8Var.e);
                } else {
                    Context context = xr8Var.a;
                    context.getClass();
                    File noBackupFilesDir = context.getNoBackupFilesDir();
                    noBackupFilesDir.getClass();
                    wr8Var = new wr8(xr8Var.a, new File(noBackupFilesDir, str).getAbsolutePath(), new t9d(22), xr8Var.c, xr8Var.e);
                }
                wr8Var.setWriteAheadLoggingEnabled(xr8Var.g);
                return wr8Var;
            case 1:
                vx8 vx8Var = (vx8) this.b;
                yt9 yt9Var = vx8Var.a;
                tvd tvdVar = vx8Var.b;
                yt9 I = f5p.I(yt9Var, true);
                try {
                    Movie decodeStream = Movie.decodeStream(I.source().W0());
                    o1j.t(I, null);
                    if (decodeStream == null || decodeStream.width() <= 0 || decodeStream.height() <= 0) {
                        a70.r("Failed to decode GIF.");
                        return null;
                    }
                    uwc uwcVar = new uwc(decodeStream, (decodeStream.isOpaque() && ((Boolean) fqj.x(tvdVar, vt9.g)).booleanValue()) ? Bitmap.Config.RGB_565 : pco.H(vt9.c(tvdVar)) ? Bitmap.Config.ARGB_8888 : (Bitmap.Config) fqj.x(tvdVar, vt9.b), tvdVar.c);
                    sl6 sl6Var = qt9.a;
                    if (((Number) fqj.x(tvdVar, sl6Var)).intValue() != -2) {
                        int intValue = ((Number) fqj.x(tvdVar, sl6Var)).intValue();
                        if (intValue < -1) {
                            ogj.h(ljg.j(intValue, "Invalid repeatCount: "));
                            return null;
                        }
                        uwcVar.q = intValue;
                    }
                    Function0 function0 = (Function0) fqj.x(tvdVar, qt9.c);
                    Function0 function02 = (Function0) fqj.x(tvdVar, qt9.d);
                    if (function0 != null || function02 != null) {
                        uwcVar.e.add(new yik(function0, function02));
                    }
                    if (fqj.x(tvdVar, qt9.b) != null) {
                        pvd.j();
                        return null;
                    }
                    uwcVar.r = null;
                    uwcVar.s = ohe.a;
                    uwcVar.t = false;
                    uwcVar.invalidateSelf();
                    return new vl4(rfo.u(uwcVar), false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        o1j.t(I, th);
                        throw th2;
                    }
                }
            case 2:
                return Integer.valueOf(((v39) this.b).n.size());
            case 3:
                return Integer.valueOf(((b49) this.b).n.size());
            case 4:
                Context requireContext = ((HighValueStreaksFragment) this.b).requireContext();
                requireContext.getClass();
                return new da9(requireContext);
            case 5:
                vb9 vb9Var = (vb9) this.b;
                Context context2 = vb9Var.b;
                context2.getClass();
                SharedPreferences sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext = context2.getApplicationContext();
                    synchronized (uic.i) {
                        d = a5f.d(applicationContext);
                        uic.j = d;
                    }
                    d.getClass();
                    sharedPreferences = d;
                }
                SharedPreferences.Editor i3 = dmi.i(sharedPreferences, "showHistoricalDataInfoBanner", false);
                Unit unit = Unit.a;
                i3.apply();
                ArrayList arrayList = vb9Var.i;
                arrayList.getClass();
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        ub9 ub9Var = (ub9) it.next();
                        ub9Var.getClass();
                        if (ub9Var.a() != 7) {
                            i2++;
                        }
                    } else {
                        i2 = -1;
                    }
                }
                Integer valueOf = i2 != -1 ? Integer.valueOf(i2) : null;
                if (valueOf != null) {
                    int intValue2 = valueOf.intValue();
                    ArrayList arrayList2 = vb9Var.i;
                    if (intValue2 >= 0 && intValue2 < arrayList2.size()) {
                        arrayList2.remove(intValue2);
                        vb9Var.notifyItemRemoved(vb9Var.g.size() + intValue2);
                    }
                }
                return Unit.a;
            case 6:
                Function0 function03 = ((me9) this.b).f;
                if (function03 != null) {
                    function03.invoke();
                }
                return Unit.a;
            case 7:
                zg9 zg9Var = (zg9) this.b;
                zg9Var.getClass();
                try {
                    zg9Var.x.j(2, 0, false);
                } catch (IOException e) {
                    tp5 tp5Var = tp5.PROTOCOL_ERROR;
                    zg9Var.e(tp5Var, tp5Var, e);
                }
                return Unit.a;
            case 8:
                return ImaPresenterActivity.r((ImaPresenterActivity) this.b);
            case 9:
                Context context3 = (Context) ((vng) this.b).a;
                double d2 = 0.2d;
                try {
                    Object systemService = context3.getSystemService((Class<Object>) ActivityManager.class);
                    systemService.getClass();
                    if (((ActivityManager) systemService).isLowRamDevice()) {
                        d2 = 0.15d;
                    }
                } catch (Exception unused) {
                }
                if (0.0d > d2 || d2 > 1.0d) {
                    a70.p("percent must be in the range [0.0, 1.0].");
                    return null;
                }
                spf spfVar = new spf(0);
                try {
                    Object systemService2 = context3.getSystemService((Class<Object>) ActivityManager.class);
                    systemService2.getClass();
                    ActivityManager activityManager = (ActivityManager) systemService2;
                    i = (context3.getApplicationInfo().flags & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                } catch (Exception unused2) {
                    i = NotificationCompat.FLAG_LOCAL_ONLY;
                }
                return new fpf(new ou4((long) (d2 * i * 1048576), spfVar), spfVar);
            case 10:
                return Integer.valueOf(ao2.s(8, ((xy9) this.b).b));
            case 11:
                return Float.valueOf(d2a.w(((ku3) this.b).getCoroutineContext()));
            case 12:
                Object systemService3 = ((View) ((f4a) this.b).b).getContext().getSystemService("input_method");
                systemService3.getClass();
                return (InputMethodManager) systemService3;
            case 13:
                k6g k6gVar = ((taa) this.b).a;
                if (k6gVar.inCompatibilityMode() && !k6gVar.isOpenInternal$room_runtime()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 14:
                Object obj = ((l5k) this.b).a;
                eka ekaVar = obj instanceof eka ? (eka) obj : null;
                if (ekaVar != null) {
                    return ekaVar.findJavaDeclaration();
                }
                return null;
            case 15:
                oqa oqaVar = (oqa) ((rqa) this.b).j;
                if (oqaVar != null) {
                    n9e.E(oqaVar);
                }
                return Unit.a;
            case 16:
                Bundle arguments = ((LeaderboardInfoModal) this.b).getArguments();
                return (arguments == null || (leaderboardInfoType = (WeeklyChallengeViewModel.LeaderboardInfoType) gz8.M(arguments, "info_type", WeeklyChallengeViewModel.LeaderboardInfoType.class)) == null) ? WeeklyChallengeViewModel.LeaderboardInfoType.FULL_LEADERBOARD_INFO : leaderboardInfoType;
            case 17:
                ((dsi) ((LeagueAwardsFragment) this.b).s.getValue()).f(y4b.f);
                return Unit.a;
            case 18:
                return Integer.valueOf(((LeagueCupTreeFragment) this.b).requireArguments().getInt("INITIAL_FILTER", -1));
            case 19:
                View root = ((tua) this.b).getRoot();
                int i4 = R.id.league_info_facts;
                View B = nq8.B(R.id.league_info_facts, root);
                if (B != null) {
                    cva a = cva.a(B);
                    i4 = R.id.league_info_grid;
                    View B2 = nq8.B(R.id.league_info_grid, root);
                    if (B2 != null) {
                        int i5 = R.id.details;
                        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.details, B2);
                        if (linearLayout != null) {
                            i5 = R.id.grid_layout;
                            GridLayout gridLayout = (GridLayout) nq8.B(R.id.grid_layout, B2);
                            if (gridLayout != null) {
                                dd ddVar = new dd((LinearLayout) B2, linearLayout, gridLayout, 19);
                                i4 = R.id.league_info_host;
                                View B3 = nq8.B(R.id.league_info_host, root);
                                if (B3 != null) {
                                    cva a2 = cva.a(B3);
                                    i4 = R.id.league_info_newcomers_lower;
                                    View B4 = nq8.B(R.id.league_info_newcomers_lower, root);
                                    if (B4 != null) {
                                        cva a3 = cva.a(B4);
                                        i4 = R.id.league_info_newcomers_other;
                                        View B5 = nq8.B(R.id.league_info_newcomers_other, root);
                                        if (B5 != null) {
                                            cva a4 = cva.a(B5);
                                            i4 = R.id.league_info_newcomers_upper;
                                            View B6 = nq8.B(R.id.league_info_newcomers_upper, root);
                                            if (B6 != null) {
                                                cva a5 = cva.a(B6);
                                                i4 = R.id.league_info_qualification_tournaments;
                                                View B7 = nq8.B(R.id.league_info_qualification_tournaments, root);
                                                if (B7 != null) {
                                                    cva a6 = cva.a(B7);
                                                    i4 = R.id.league_info_subtitle_lower;
                                                    View B8 = nq8.B(R.id.league_info_subtitle_lower, root);
                                                    if (B8 != null) {
                                                        cva a7 = cva.a(B8);
                                                        i4 = R.id.league_info_upper;
                                                        View B9 = nq8.B(R.id.league_info_upper, root);
                                                        if (B9 != null) {
                                                            return new qua((LinearLayout) root, a, ddVar, a2, a3, a4, a5, a6, a7, cva.a(B9));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(B2.getResources().getResourceName(i5)));
                        return null;
                    }
                }
                yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i4)));
                return null;
            case 20:
                return rua.a(((sua) this.b).getRoot());
            case 21:
                zwa zwaVar = (zwa) this.b;
                Round round = new Round("");
                Tournament tournament = zwaVar.j;
                if (tournament != null) {
                    return new jya(round, tournament.getCategory().getSport().getSlug());
                }
                Intrinsics.i("tournament");
                throw null;
            case 22:
                return lxa.l((lxa) this.b);
            case 23:
                return Integer.valueOf(((sxa) this.b).c.size());
            case 24:
                ((LeaguePlayerUpdatesBottomSheet) this.b).j();
                return Unit.a;
            case 25:
                return new BaseInputConnection(((r5b) this.b).a, false);
            case 26:
                return geb.p((geb) this.b);
            case 27:
                return Boolean.valueOf(M0.a((M0) this.b));
            case 28:
                FragmentActivity requireActivity = ((MainFantasyFragment) this.b).requireActivity();
                requireActivity.getClass();
                return new ldk(requireActivity, R.id.main_coordinator_layout);
            default:
                gvb gvbVar = (gvb) this.b;
                if (gvbVar.s.h() <= gvbVar.t.h()) {
                    return null;
                }
                ((evb) ((eoh) gvbVar.y).getValue()).getClass();
                return Float.valueOf(gvbVar.k1() + r1.h());
        }
    }
}
