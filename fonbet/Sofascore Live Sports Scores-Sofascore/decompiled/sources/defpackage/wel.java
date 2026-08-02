package defpackage;

import android.app.Application;
import androidx.compose.runtime.e;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.google.gson.Gson;
import com.inmobi.media.AbstractC3286aa;
import com.inmobi.media.AbstractC3378e;
import com.inmobi.media.AbstractC3424fj;
import com.inmobi.media.AbstractC3603mh;
import com.inmobi.media.C3422fh;
import com.inmobi.media.C3605mj;
import com.inmobi.media.Yc;
import com.inmobi.media.bp;
import com.inmobi.media.dp;
import com.sofascore.model.Country;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.YoutubeVideoResponse;
import com.sofascore.results.R;
import com.vungle.ads.internal.protos.Sdk;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.SignStyle;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class wel implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ wel(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_;
        int i = 1;
        switch (this.a) {
            case 0:
                wn1 a = wn1.a((wn1) wn1.w.getValue(), 3);
                m9k m9kVar = new m9k("Group A");
                m9k m9kVar2 = new m9k("");
                m9k m9kVar3 = new m9k("13 Jun");
                joa joaVar = xel.i;
                return l6g.K(new xel(a, m9kVar, m9kVar2, "Mexico City", m9kVar3, false, false, d2a.v()), new xel(wn1.a((wn1) wn1.x.getValue(), 4), new m9k("Group A"), new m9k(""), "Mexico City", null, false, false, d2a.v()), new xel(wn1.a((wn1) wn1.v.getValue(), 5), new m9k("Group A"), new m9k(""), "Mexico City", null, false, false, d2a.v()), new xel(wn1.a((wn1) wn1.y.getValue(), 6), new m9k("Group A"), new m9k(""), "Mexico City", null, false, false, d2a.v()));
            case 1:
                Country country = zu3.o;
                afl aflVar = new afl(1, "Luka Modric", 8.0d, country.getIso2Alpha(), country.getName());
                Country country2 = zu3.S;
                afl aflVar2 = new afl(2, "Raúl Jiménez", 6.6d, country2.getIso2Alpha(), country2.getName());
                Country country3 = zu3.k0;
                return l6g.K(aflVar, aflVar2, new afl(3, "Lyle Foster", 8.1d, country3.getIso2Alpha(), country3.getName()));
            case 2:
                hrh hrhVar = hrh.m;
                tc3 tc3Var = null;
                vt2 vt2Var = new vt2("Group A", "Group A", false, null, tc3Var, hrhVar, null, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE);
                tt2 tt2Var = null;
                int i2 = Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE;
                boolean z = false;
                return new ofl(l6g.K(vt2Var, new vt2("Group B", "Group B", z, tc3Var, null, hrhVar, tt2Var, i2), new vt2("Group C", "Group C", z, tc3Var, null, hrhVar, tt2Var, i2)), l6g.L(new Pair("Group A", l6g.K(new zil(1, "New Zealand ", "NZ", 85), new zil(2, "Morocco", "MO", 11), new zil(3, "Haiti", "HA", 84)))));
            case 3:
                b7 K = l6g.K(new s1h(sfl.b, "Matches", true), new s1h(sfl.c, "Leaders", true), new s1h(sfl.d, "Videos", true));
                rlh rlhVar = rlh.b;
                return new rfl(K, true, true, null, null, rlhVar, rlhVar, null, null);
            case 4:
                hrh hrhVar2 = hrh.m;
                tc3 tc3Var2 = null;
                vt2 vt2Var2 = new vt2("Group A", "Group A", false, null, tc3Var2, hrhVar2, null, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE);
                tt2 tt2Var2 = null;
                int i3 = Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE;
                boolean z2 = false;
                return new sil(l6g.K(vt2Var2, new vt2("Group B", "Group B", z2, tc3Var2, null, hrhVar2, tt2Var2, i3), new vt2("Group C", "Group C", z2, tc3Var2, null, hrhVar2, tt2Var2, i3)), l6g.K(new pil(l6g.K(new q9k(R.string.any_sport_matches_played_short), new q9k(R.string.any_sport_difference_short), new q9k(R.string.any_sport_points_short))), new qil(1, 2, "South Africa", l6g.K("1", "2", "3"), Integer.valueOf(R.color.prom_to_y)), new qil(2, 3, "South Korea", l6g.K("1", "2", "3"), Integer.valueOf(R.color.prom_to_x)), new qil(3, 4, "Denmark", l6g.K("1", "2", "3"), null)), null);
            case 5:
                return l6g.K(new hjl(1, "Luka Modric", 8.0d, 1, zu3.o.getName(), t6a.D(), (Player) CollectionsKt.Y(t6a.E()), (Team) CollectionsKt.Y(t6a.F())), new hjl(2, "Raúl Jiménez", 6.6d, 1, zu3.S.getName(), t6a.D(), (Player) CollectionsKt.Y(t6a.E()), (Team) CollectionsKt.Y(t6a.F())), new hjl(3, "Lyle Foster", 8.1d, 1, zu3.k0.getName(), t6a.D(), (Player) CollectionsKt.Y(t6a.E()), (Team) CollectionsKt.Y(t6a.F())));
            case 6:
                return Yc.a();
            case 7:
                mnl mnlVar = new mnl(new ef0(0));
                ek4.f(mnlVar);
                v9g.x(mnlVar, '-');
                ek4.h(mnlVar);
                Unit unit = Unit.a;
                return new xj4(mnlVar.build(), i);
            case 8:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).appendLiteral('-').appendValue(ChronoField.MONTH_OF_YEAR, 2).toFormatter();
            case 9:
                _childSerializers$_anonymous_ = YoutubeVideoResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 10:
                return (BlazeSDK.INSTANCE.isProd$blazesdk_release() ? "https://blazesdk-prod-cdn.clipro.tv/api/blazesdk/" : "https://blazesdk-uat-cdn.clipro.tv/api/blazesdk/").concat("v1.3/");
            case 11:
                return (BlazeSDK.INSTANCE.isProd$blazesdk_release() ? "https://blazelogger.clipro.tv/api/blazelogger/" : "https://blazelogger-uat.clipro.tv/api/blazelogger/").concat("v1/");
            case 12:
                iod iodVar = new iod();
                iodVar.f = false;
                iodVar.h = new pxl();
                wsl wslVar = new wsl();
                ArrayList arrayList = iodVar.c;
                arrayList.add(wslVar);
                arrayList.add(new a5m());
                arrayList.add(new qwl());
                TimeUnit timeUnit = TimeUnit.SECONDS;
                iodVar.d(60L, timeUnit);
                iodVar.c(60L, timeUnit);
                iodVar.A = yol.b("timeout", 60L, timeUnit);
                iodVar.x = yol.b("timeout", 60L, timeUnit);
                return new jod(iodVar);
            case 13:
                return AbstractC3286aa.b();
            case 14:
                return bp.a();
            case 15:
                return new v0m();
            case 16:
                return e.f("");
            case 17:
                return e.f(mpl.Unknown);
            case 18:
                return dp.a();
            case 19:
                return Boolean.valueOf(AbstractC3378e.a());
            case 20:
                return C3422fh.a();
            case 21:
                return C3422fh.f();
            case 22:
                return AbstractC3424fj.a();
            case 23:
                Application application = vnm.b;
                if (application != null) {
                    return (ye4) kpm.b.getValue(application, kpm.a[0]);
                }
                return null;
            case 24:
                Application application2 = vnm.b;
                if (application2 != null) {
                    return (ye4) kpm.c.getValue(application2, kpm.a[1]);
                }
                return null;
            case 25:
                vnm vnmVar = vnm.a;
                return new Gson();
            case 26:
                return e.f("");
            case 27:
                return Boolean.valueOf(AbstractC3603mh.c());
            case 28:
                return Integer.valueOf(C3605mj.a());
            default:
                return Integer.valueOf(C3605mj.b());
        }
    }
}
