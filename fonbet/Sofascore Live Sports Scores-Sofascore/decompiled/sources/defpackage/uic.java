package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.cast.zzyh;
import com.google.android.gms.internal.consent_sdk.zzqp;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.newNetwork.topperformance.response.AmericanFootballTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.response.BasketballTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.response.FootballTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.response.FutsalTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.response.HandballTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.response.IceHockeyTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.response.RugbyTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.response.TopPerformanceStatistics;
import com.sofascore.model.newNetwork.topperformance.response.VolleyballTopPlayersStatistics;
import com.sofascore.model.util.ChatInterface;
import com.sofascore.results.R;
import com.sofascore.results.chat.ChatActivity;
import com.sofascore.results.fantasy.onboarding.FantasyOnboardingActivity;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.f;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class uic implements lx2, lkk, f, e1a, zzqp, zzyh, lg0, cw1, pjd, lah, g8a {
    public static boolean c;
    public static volatile SharedPreferences j;
    public final /* synthetic */ int a;
    public static final uic b = new uic(0);
    public static final uic d = new uic(1);
    public static final uic e = new uic(2);
    public static final uic f = new uic(3);
    public static final /* synthetic */ uic g = new uic(4);
    public static final uic h = new uic(5);
    public static final uic i = new uic(6);
    public static final uic k = new uic(7);
    public static final uic l = new uic(9);
    public static final uic m = new uic(10);
    public static final uic n = new uic(11);
    public static final uic o = new uic(12);
    public static final uic p = new uic(13);
    public static final uic q = new uic(14);
    public static final uic r = new uic(15);

    public /* synthetic */ uic(int i2) {
        this.a = i2;
    }

    public static zod g(int i2) {
        return new zod(new x52(), Math.min(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, Math.max(4096, i2)));
    }

    public static bah k(omf omfVar) {
        return new bah(System.currentTimeMillis() + 3600000, new zid(8, 11), new vn0(true, false, false), 10.0d, 1.2d, 60);
    }

    public static o5a l(int i2, long j2) {
        long j3 = i2;
        long j4 = j3 / 1000000000;
        if ((j3 ^ 1000000000) < 0 && j4 * 1000000000 != j3) {
            j4--;
        }
        long j5 = j2 + j4;
        if ((j2 ^ j5) < 0 && (j4 ^ j2) >= 0) {
            return j2 > 0 ? o5a.d : o5a.c;
        }
        if (j5 < -31557014167219200L) {
            return o5a.c;
        }
        if (j5 > 31556889864403199L) {
            return o5a.d;
        }
        long j6 = j3 % 1000000000;
        return new o5a(j5, (int) (j6 + ((((j6 ^ 1000000000) & ((-j6) | j6)) >> 63) & 1000000000)));
    }

    public static Intent m(Context context, Integer num, boolean z, boolean z2) {
        context.getClass();
        Intent intent = new Intent(context, (Class<?>) FantasyOnboardingActivity.class);
        if (num != null) {
            intent.putExtra("competitionId", num.intValue());
        }
        intent.putExtra("finishWithResult", z);
        intent.putExtra("skipLeagueStep", z2);
        return intent;
    }

    public static /* synthetic */ Intent o(Context context, Integer num, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            num = null;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m(context, num, z, false);
    }

    public static Intent q(Context context, ChatInterface chatInterface, String str, boolean z, boolean z2) {
        context.getClass();
        chatInterface.getClass();
        Intent intent = new Intent(context, (Class<?>) ChatActivity.class);
        intent.putExtra("CHAT_INTERFACE_OBJECT", chatInterface);
        intent.putExtra("EDITOR_MODE", z);
        intent.putExtra("OPEN_LOCATION", str);
        intent.putExtra("MESSAGE_STATUS", (String) null);
        intent.putExtra("HAS_BRANDED_ODDS", z2);
        return intent;
    }

    public static Intent r(Context context, ChatInterface chatInterface, String str, boolean z, int i2) {
        if ((i2 & 32) != 0) {
            z = false;
        }
        return q(context, chatInterface, str, false, z);
    }

    public static List s(Context context, TopPerformanceStatistics topPerformanceStatistics) {
        context.getClass();
        topPerformanceStatistics.getClass();
        if (topPerformanceStatistics instanceof FootballTopPlayersStatistics) {
            return cbb.d(context, (FootballTopPlayersStatistics) topPerformanceStatistics, qab.i, 0, false, null, 88);
        }
        if (topPerformanceStatistics instanceof BasketballTopPlayersStatistics) {
            return cbb.d(context, (BasketballTopPlayersStatistics) topPerformanceStatistics, nab.e, Integer.MAX_VALUE, false, null, 64);
        }
        if (topPerformanceStatistics instanceof IceHockeyTopPlayersStatistics) {
            return cbb.a(context, (IceHockeyTopPlayersStatistics) topPerformanceStatistics, Integer.MAX_VALUE, false, null, hub.b);
        }
        if (topPerformanceStatistics instanceof HandballTopPlayersStatistics) {
            return cbb.d(context, (HandballTopPlayersStatistics) topPerformanceStatistics, tab.e, Integer.MAX_VALUE, false, null, 64);
        }
        if (topPerformanceStatistics instanceof AmericanFootballTopPlayersStatistics) {
            return cbb.c(context, (AmericanFootballTopPlayersStatistics) topPerformanceStatistics, hab.f, Integer.MAX_VALUE, false, null, hub.b);
        }
        if (topPerformanceStatistics instanceof RugbyTopPlayersStatistics) {
            return cbb.c(context, (RugbyTopPlayersStatistics) topPerformanceStatistics, yab.e, Integer.MAX_VALUE, false, null, hub.b);
        }
        if (topPerformanceStatistics instanceof VolleyballTopPlayersStatistics) {
            return cbb.c(context, (VolleyballTopPlayersStatistics) topPerformanceStatistics, bbb.e, Integer.MAX_VALUE, false, null, hub.b);
        }
        return topPerformanceStatistics instanceof FutsalTopPlayersStatistics ? cbb.d(context, (FutsalTopPlayersStatistics) topPerformanceStatistics, rab.e, Integer.MAX_VALUE, false, null, 64) : km5.a;
    }

    public static Intent u(Context context) {
        context.getClass();
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        String y = dmi.y(context.getString(R.string.share_link), "/basketball/tournament/usa/nba/132#id:80229,tab:overview,c:goat");
        intent.putExtra("android.intent.extra.SUBJECT", context.getString(R.string.vote_for_your_goat));
        intent.putExtra("android.intent.extra.TEXT", context.getString(R.string.share_message_vote_for_your_goat) + " " + y);
        intent.putExtra("android.intent.extra.TITLE", context.getString(R.string.vote_for_your_goat));
        return intent;
    }

    public static void w(Context context, ChatInterface chatInterface, String str, int i2) {
        int i3 = ChatActivity.Z;
        if ((i2 & 4) != 0) {
            tu[] tuVarArr = tu.a;
            str = "bubble";
        }
        boolean z = (i2 & 16) == 0;
        context.getClass();
        chatInterface.getClass();
        context.startActivity(q(context, chatInterface, str, z, false));
    }

    public static void x(Context context, Integer num, int i2) {
        int i3 = FantasyOnboardingActivity.M;
        if ((i2 & 2) != 0) {
            num = null;
        }
        context.getClass();
        context.startActivity(o(context, num, false, 8));
    }

    @Override // defpackage.lah
    public bah b(omf omfVar, JSONObject jSONObject) {
        return k(omfVar);
    }

    @Override // defpackage.e1a
    public void c(yma ymaVar) {
        ymaVar.a();
    }

    @Override // defpackage.oic
    public byte[] d(Object obj) {
        return (byte[]) obj;
    }

    public void f(boolean z, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1732824199);
        int i3 = (av8Var.h(z) ? 4 : 2) | i2 | (av8Var.g(xtcVar) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            kq9.b(u6h.I(), null, haa.v(xtcVar, z ? 180.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), 0L, av8Var, 48, 8);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t60((Object) this, z, xtcVar, i2, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lx2
    public void h(vh9 vh9Var, hoi hoiVar) {
        ct8 ct8Var = (ct8) hoiVar;
        int i2 = 0;
        ihe iheVar = new ihe("ObservableContent", i2);
        rj9 rj9Var = vh9Var.e;
        ihe iheVar2 = rj9.l;
        ArrayList arrayList = rj9Var.a;
        iheVar2.getClass();
        rq3 rq3Var = null;
        if (!rj9Var.e(iheVar)) {
            int c2 = rj9Var.c(iheVar2);
            if (c2 == -1) {
                throw new v3("Phase " + iheVar2 + " was not registered for this pipeline", 3);
            }
            int i3 = c2 + 1;
            int size = arrayList.size() - 1;
            if (i3 <= size) {
                while (true) {
                    Object obj = arrayList.get(i3);
                    ufe ufeVar = obj instanceof ufe ? (ufe) obj : null;
                    if (ufeVar == null) {
                        break;
                    }
                    sha shaVar = ufeVar.b;
                    jhe jheVar = shaVar instanceof jhe ? (jhe) shaVar : null;
                    if (jheVar != null && jheVar.e == iheVar2) {
                        c2 = i3;
                    }
                    if (i3 == size) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            arrayList.add(c2 + 1, new ufe(iheVar, new jhe(iheVar2)));
        }
        rj9Var.f(iheVar, new ul(ct8Var, rq3Var, i2));
    }

    @Override // defpackage.lkk
    public Object i(wga wgaVar, float f2) {
        boolean z = wgaVar.Z() == 1;
        if (z) {
            wgaVar.h();
        }
        double H = wgaVar.H();
        double H2 = wgaVar.H();
        double H3 = wgaVar.H();
        double H4 = wgaVar.Z() == 7 ? wgaVar.H() : 1.0d;
        if (z) {
            wgaVar.m();
        }
        if (H <= 1.0d && H2 <= 1.0d && H3 <= 1.0d) {
            H *= 255.0d;
            H2 *= 255.0d;
            H3 *= 255.0d;
            if (H4 <= 1.0d) {
                H4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) H4, (int) H, (int) H2, (int) H3));
    }

    @Override // defpackage.lg0
    public void j(kx4 kx4Var, int i2, int[] iArr, ema emaVar, int[] iArr2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        int length = iArr.length;
        int i6 = i2 - i4;
        int i7 = 0;
        while (i3 < length) {
            int i8 = iArr[i3];
            iArr2[i7] = i6;
            i6 += i8;
            i3++;
            i7++;
        }
    }

    @Override // defpackage.pjd
    public Object n() {
        return new ArrayDeque();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007f, code lost:
    
        if (defpackage.xw3.R(defpackage.hq4.c, new defpackage.k50(r5, r6, r7, r8, 24), r0) != r13) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object t(Context context, RecyclerView recyclerView, sq3 sq3Var) {
        qch qchVar;
        int i2;
        String str;
        Context context2;
        if (sq3Var instanceof qch) {
            qchVar = (qch) sq3Var;
            int i3 = qchVar.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qchVar.v = i3 - Integer.MIN_VALUE;
                Object obj = qchVar.t;
                lu3 lu3Var = lu3.a;
                i2 = qchVar.v;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    String l2 = vxd.l(System.currentTimeMillis() / 1000, "Sofascore_");
                    qchVar.r = context;
                    qchVar.s = l2;
                    qchVar.v = 1;
                    hs4 hs4Var = z45.a;
                    Object R = xw3.R(rob.a, new m1f(recyclerView, context, rq3Var, 15), qchVar);
                    if (R != lu3Var) {
                        str = l2;
                        context2 = context;
                        obj = R;
                    }
                    return lu3Var;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        y6a.M(obj);
                        return Unit.a;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str2 = qchVar.s;
                Context context3 = qchVar.r;
                y6a.M(obj);
                str = str2;
                context2 = context3;
                Bitmap bitmap = (Bitmap) obj;
                qchVar.r = null;
                qchVar.s = null;
                qchVar.v = 2;
                hs4 hs4Var2 = z45.a;
            }
        }
        qchVar = new qch(this, sq3Var);
        Object obj2 = qchVar.t;
        lu3 lu3Var2 = lu3.a;
        i2 = qchVar.v;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        Bitmap bitmap2 = (Bitmap) obj2;
        qchVar.r = null;
        qchVar.s = null;
        qchVar.v = 2;
        hs4 hs4Var22 = z45.a;
    }

    public String toString() {
        switch (this.a) {
            case 16:
                return "AbsoluteArrangement#Right";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        if (r10 == r14) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object v(Context context, RecyclerView recyclerView, String str, sq3 sq3Var) {
        sch schVar;
        int i2;
        if (sq3Var instanceof sch) {
            schVar = (sch) sq3Var;
            int i3 = schVar.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                schVar.v = i3 - Integer.MIN_VALUE;
                Object obj = schVar.t;
                lu3 lu3Var = lu3.a;
                i2 = schVar.v;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    schVar.r = context;
                    schVar.s = str;
                    schVar.v = 1;
                    hs4 hs4Var = z45.a;
                    obj = xw3.R(rob.a, new m1f(recyclerView, context, rq3Var, 15), schVar);
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            y6a.M(obj);
                            return obj;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = schVar.s;
                    context = schVar.r;
                    y6a.M(obj);
                }
                Context context2 = context;
                String str2 = str;
                Bitmap bitmap = (Bitmap) obj;
                schVar.r = null;
                schVar.s = null;
                schVar.v = 2;
                hs4 hs4Var2 = z45.a;
                Object R = xw3.R(hq4.c, new v1f(context2, bitmap, str2, rq3Var, 19), schVar);
                return R != lu3Var ? lu3Var : R;
            }
        }
        schVar = new sch(this, sq3Var);
        Object obj2 = schVar.t;
        lu3 lu3Var2 = lu3.a;
        i2 = schVar.v;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        Context context22 = context;
        String str22 = str;
        Bitmap bitmap2 = (Bitmap) obj2;
        schVar.r = null;
        schVar.s = null;
        schVar.v = 2;
        hs4 hs4Var22 = z45.a;
        Object R2 = xw3.R(hq4.c, new v1f(context22, bitmap2, str22, rq3Var2, 19), schVar);
        if (R2 != lu3Var2) {
        }
    }

    @Override // defpackage.cw1
    public long a(long j2) {
        return j2;
    }

    @Override // defpackage.oic
    public Object p(byte[] bArr) {
        return bArr;
    }
}
