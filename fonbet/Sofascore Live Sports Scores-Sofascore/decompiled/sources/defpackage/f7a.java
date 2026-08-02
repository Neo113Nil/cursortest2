package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.internal.cast.zzyh;
import com.google.android.gms.internal.consent_sdk.zzqp;
import com.ironsource.C4427z5;
import com.sofascore.model.mvvm.model.IncidentKt;
import com.sofascore.model.newNetwork.AffiliateBanner;
import com.sofascore.results.R;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.dialog.InfoBottomSheet;
import com.sofascore.results.mma.fighter.MmaFighterActivity;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class f7a implements lt9, foh, lx2, zzqp, zzyh, lg0, f, pjd, o2c, ipg, meh, evk, nnd {
    public static boolean c;
    public static boolean d;
    public static List f;
    public static boolean g;
    public static bpf i;
    public final /* synthetic */ int a;
    public static final f7a b = new f7a(0);
    public static final f7a e = new f7a(1);
    public static final f7a h = new f7a(2);
    public static final f7a j = new f7a(3);
    public static final f7a k = new f7a(5);
    public static final f7a l = new f7a(7);
    public static final f7a m = new f7a(8);
    public static final f7a n = new f7a(9);
    public static final f7a o = new f7a(10);
    public static final f7a p = new f7a(11);
    public static final f7a q = new f7a(12);
    public static final f7a r = new f7a(13);
    public static final f7a s = new f7a(14);
    public static final f7a t = new f7a(15);

    public /* synthetic */ f7a(int i2) {
        this.a = i2;
    }

    public static q9k b(int i2, boolean z) {
        return new q9k(z ? R.string.baseball_injured_list_duration_short : R.string.baseball_injured_list_duration, l6g.K(Integer.valueOf(i2)));
    }

    public static rz6 g(String str) {
        str.getClass();
        for (rz6 rz6Var : rz6.m) {
            if (rz6Var.b.equals(str)) {
                return rz6Var;
            }
        }
        ogj.m("Collection contains no element matching the predicate.");
        return null;
    }

    public static q4f k(Function0 function0) {
        km5 km5Var = km5.a;
        hs4 hs4Var = z45.a;
        ad2 c2 = s9a.c(hq4.c.plus(tz9.o()));
        km5Var.getClass();
        return new q4f(new q4f(new qf4(new l18(inb.k, new gl7(11), new rsd(3, function0)), a.c(new ce4(km5Var, (rq3) null, 0)), new hjg(), c2)));
    }

    public static WebView o(Context context, AffiliateBanner affiliateBanner, ViewGroup viewGroup, y01 y01Var, y01 y01Var2, y01 y01Var3) {
        context.getClass();
        affiliateBanner.getClass();
        View inflate = LayoutInflater.from(context.getApplicationContext()).inflate(R.layout.web_view_banner, viewGroup, false);
        if (inflate == null) {
            yhk.s("rootView");
            return null;
        }
        WebView webView = (WebView) inflate;
        webView.setWebViewClient(new sl(context, y01Var3, y01Var2, y01Var));
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(false);
        settings.setLoadWithOverviewMode(false);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(false);
        if (g) {
            webView.setLayerType(1, null);
        }
        webView.loadDataWithBaseURL(null, dii.c("\n        <html>\n    <head>\n        <style type=\"text/css\">\n            /* Be aggressive about removing space */\n            html, body {\n                margin: 0;\n                padding: 0;\n            }\n        </style>\n    </head>\n    <body>\n        <script>\n            var onLoaded = function() {\n                if(window.Android) { window.Android.onAdLoaded(); }\n            };\n\n            var onError = function() {\n                if(window.Android) { window.Android.onAdFailed(); }\n            };\n        </script>\n        " + c.r(affiliateBanner.getContent(), "src=\"//", "src=\"https://", false) + "\n    </body>\n    </html>\n        "), "text/html", C4427z5.O, null);
        webView.setTag(R.id.affiliate_name_tag, affiliateBanner.getName());
        if (viewGroup == null) {
            webView.setLayoutParams(new LinearLayout.LayoutParams(ao2.s(affiliateBanner.getWidth(), context), ao2.s(affiliateBanner.getHeight(), context)));
            return webView;
        }
        ViewGroup.LayoutParams layoutParams = webView.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return null;
        }
        layoutParams.width = ao2.s(affiliateBanner.getWidth(), context);
        layoutParams.height = ao2.s(affiliateBanner.getHeight(), context);
        webView.setLayoutParams(layoutParams);
        return webView;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x07c4 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Integer p(String str) {
        Integer valueOf = Integer.valueOf(R.string.injury_reason_toe);
        str.getClass();
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String replace = lowerCase.replace('-', ' ');
        replace.getClass();
        String replace2 = replace.replace('_', ' ');
        replace2.getClass();
        String W = StringsKt.W(StringsKt.W(replace2, " injury"), " condition");
        switch (W.hashCode()) {
            case -2123414762:
                if (W.equals("contracture")) {
                    return Integer.valueOf(R.string.injury_reason_contracture);
                }
                return null;
            case -2037237553:
                if (!W.equals("personal reasons")) {
                    return null;
                }
                return Integer.valueOf(R.string.injury_reason_personal);
            case -1999812271:
                if (!W.equals("achilles")) {
                    return null;
                }
                return Integer.valueOf(R.string.injury_reason_achilles);
            case -1952740583:
                if (!W.equals("acl knee")) {
                    return null;
                }
                return Integer.valueOf(R.string.injury_reason_acl);
            case -1893496328:
                if (W.equals("sternum")) {
                    return Integer.valueOf(R.string.injury_reason_sternum);
                }
                return null;
            case -1884423129:
                if (!W.equals("stomach")) {
                    return null;
                }
                return Integer.valueOf(R.string.injury_reason_stomach);
            case -1842506655:
                if (W.equals("collarbone")) {
                    return Integer.valueOf(R.string.injury_reason_collarbone);
                }
                return null;
            case -1749977588:
                if (W.equals("sprained arm")) {
                    return Integer.valueOf(R.string.injury_reason_sprained_arm);
                }
                return null;
            case -1749967426:
                if (W.equals("sprained leg")) {
                    return Integer.valueOf(R.string.injury_reason_sprained_leg);
                }
                return null;
            case -1749959430:
                if (W.equals("sprained toe")) {
                    return Integer.valueOf(R.string.injury_reason_sprained_toe);
                }
                return null;
            case -1722656857:
                if (W.equals("dislocated elbow")) {
                    return Integer.valueOf(R.string.injury_reason_dislocated_elbow);
                }
                return null;
            case -1722554784:
                if (W.equals("upper body")) {
                    return Integer.valueOf(R.string.injury_reason_upper_body);
                }
                return null;
            case -1713098630:
                if (!W.equals("mid body")) {
                    return null;
                }
                return Integer.valueOf(R.string.injury_reason_mid_body);
            case -1673895460:
                if (W.equals("bruised leg")) {
                    return Integer.valueOf(R.string.injury_reason_bruised_leg);
                }
                return null;
            case -1657669071:
                if (W.equals("oblique")) {
                    return Integer.valueOf(R.string.injury_reason_oblique);
                }
                return null;
            case -1624348648:
                if (W.equals("knee surgery")) {
                    return Integer.valueOf(R.string.injury_reason_knee_surgery);
                }
                return null;
            case -1580389334:
                if (W.equals("pcl knee")) {
                    return Integer.valueOf(R.string.injury_reason_pcl);
                }
                return null;
            case -1523211649:
                if (W.equals("broken cheekbone")) {
                    return Integer.valueOf(R.string.injury_reason_broken_cheekbone);
                }
                return null;
            case -1490273624:
                if (W.equals("nose surgery")) {
                    return Integer.valueOf(R.string.injury_reason_nose_surgery);
                }
                return null;
            case -1479826585:
                if (W.equals("hip/back")) {
                    return Integer.valueOf(R.string.injury_reason_hip_back);
                }
                return null;
            case -1475444556:
                if (W.equals("concussion")) {
                    return Integer.valueOf(R.string.injury_reason_concussion);
                }
                return null;
            case -1468578352:
                if (!W.equals("quadricep")) {
                    return null;
                }
                return Integer.valueOf(R.string.injury_reason_quadriceps);
            case -1468391631:
                if (W.equals("clavicle fracture")) {
                    return Integer.valueOf(R.string.injury_reason_clavicle_fracture);
                }
                return null;
            case -1438092581:
                if (W.equals("trade pending")) {
                    return Integer.valueOf(R.string.missing_reason_trade_pending);
                }
                return null;
            case -1425700109:
                if (!W.equals("illnesss")) {
                    return null;
                }
                return Integer.valueOf(R.string.injury_reason_illness);
            case -1389290836:
                if (W.equals("biceps")) {
                    return Integer.valueOf(R.string.injury_reason_biceps);
                }
                return null;
            case -1367724416:
                if (W.equals("cancer")) {
                    return Integer.valueOf(R.string.injury_reason_cancer);
                }
                return null;
            case -1349555095:
                if (W.equals("therapy")) {
                    return Integer.valueOf(R.string.injury_reason_therapy);
                }
                return null;
            case -1332075610:
                if (W.equals("ankle/foot")) {
                    return Integer.valueOf(R.string.injury_reason_ankle_foot);
                }
                return null;
            case -1324822331:
                if (W.equals("skull fracture")) {
                    return Integer.valueOf(R.string.injury_reason_skull_fracture);
                }
                return null;
            case -1320076553:
                if (W.equals("tooth ache")) {
                    return Integer.valueOf(R.string.injury_reason_tooth_ache);
                }
                return null;
            case -1288870048:
                if (W.equals("broken knee cap")) {
                    return Integer.valueOf(R.string.injury_reason_broken_knee_cap);
                }
                return null;
            case -1282159028:
                if (W.equals("facial")) {
                    return Integer.valueOf(R.string.injury_reason_facial);
                }
                return null;
            case -1274788789:
                if (W.equals("fibula")) {
                    return Integer.valueOf(R.string.injury_reason_fibula);
                }
                return null;
            case -1274444951:
                if (W.equals("finger")) {
                    return Integer.valueOf(R.string.injury_reason_finger);
                }
                return null;
            case -1220754735:
                if (W.equals("hernia")) {
                    return Integer.valueOf(R.string.injury_reason_hernia);
                }
                return null;
            case -1216003064:
                if (W.equals("adductor")) {
                    return Integer.valueOf(R.string.injury_reason_adductor);
                }
                return null;
            case -1205032470:
                if (W.equals("abdomen")) {
                    return Integer.valueOf(R.string.injury_reason_abdomen);
                }
                return null;
            case -1202630425:
                if (W.equals("conditioning")) {
                    return Integer.valueOf(R.string.injury_reason_conditioning);
                }
                return null;
            case -1166359703:
                if (W.equals("bursitis")) {
                    return Integer.valueOf(R.string.injury_reason_bursitis);
                }
                return null;
            case -1148027676:
                if (W.equals("metatarsal fracture")) {
                    return Integer.valueOf(R.string.injury_reason_metatarsal_fracture);
                }
                return null;
            case -1134319175:
                if (W.equals("sprained finger")) {
                    return Integer.valueOf(R.string.injury_reason_sprained_finger);
                }
                return null;
            case -1108015409:
                if (W.equals("buttocks")) {
                    return Integer.valueOf(R.string.injury_reason_buttocks);
                }
                return null;
            case -1091622513:
                if (W.equals("lumbar")) {
                    return Integer.valueOf(R.string.injury_reason_lumbar);
                }
                return null;
            case -1062813327:
                if (W.equals("muscle")) {
                    return Integer.valueOf(R.string.injury_reason_muscle);
                }
                return null;
            case -1060012528:
                if (W.equals("triceps")) {
                    return Integer.valueOf(R.string.injury_reason_triceps);
                }
                return null;
            case -991892583:
                if (W.equals("pelvic")) {
                    return Integer.valueOf(R.string.injury_reason_pelvic);
                }
                return null;
            case -991892567:
                if (W.equals("pelvis")) {
                    return Integer.valueOf(R.string.injury_reason_pelvis);
                }
                return null;
            case -896785869:
                if (W.equals("soleus")) {
                    return Integer.valueOf(R.string.injury_reason_soleus);
                }
                return null;
            case -895862849:
                if (W.equals("spleen")) {
                    return Integer.valueOf(R.string.injury_reason_spleen);
                }
                return null;
            case -891993739:
                if (W.equals("strain")) {
                    return Integer.valueOf(R.string.injury_reason_strain);
                }
                return null;
            case -891989580:
                if (W.equals("stress")) {
                    return Integer.valueOf(R.string.injury_reason_stress);
                }
                return null;
            case -877333498:
                if (W.equals("tendon")) {
                    return Integer.valueOf(R.string.injury_reason_tendon);
                }
                return null;
            case -874433628:
                if (W.equals("throat")) {
                    return Integer.valueOf(R.string.injury_reason_throat);
                }
                return null;
            case -821060973:
                if (W.equals("dislocated kneecap")) {
                    return Integer.valueOf(R.string.injury_reason_dislocated_kneecap);
                }
                return null;
            case -791530625:
                if (W.equals("patella")) {
                    return Integer.valueOf(R.string.injury_reason_patella);
                }
                return null;
            case -735952405:
                if (W.equals("cervical")) {
                    return Integer.valueOf(R.string.injury_reason_cervical);
                }
                return null;
            case -677682144:
                if (W.equals("forearm")) {
                    return Integer.valueOf(R.string.injury_reason_forearm);
                }
                return null;
            case -676206060:
                if (W.equals("broken finger")) {
                    return Integer.valueOf(R.string.injury_reason_broken_finger);
                }
                return null;
            case -670826635:
                if (!W.equals("knee cap")) {
                    return null;
                }
                return Integer.valueOf(R.string.injury_reason_kneecap);
            case -668113489:
                if (W.equals("patellofemoral")) {
                    return Integer.valueOf(R.string.injury_reason_patellofemoral);
                }
                return null;
            case -659962408:
                if (!W.equals("non related")) {
                    return null;
                }
                return Integer.valueOf(R.string.injury_reason_non_related);
            case -652468121:
                if (W.equals("physical discomfort")) {
                    return Integer.valueOf(R.string.injury_reason_physical_discomfort);
                }
                return null;
            case -639312321:
                if (W.equals("gastrointestinal discomfort")) {
                    return Integer.valueOf(R.string.injury_reason_stomach_virus);
                }
                return null;
            case -613942079:
                if (W.equals("meniscus")) {
                    return Integer.valueOf(R.string.injury_reason_meniscus);
                }
                return null;
            case -605912163:
                if (!W.equals("pectoral muscle")) {
                    return null;
                }
                return Integer.valueOf(R.string.injury_reason_pectoral);
            case -575764561:
                if (!W.equals("kneecap")) {
                    return null;
                }
                return Integer.valueOf(R.string.injury_reason_kneecap);
            case -561039789:
                if (W.equals("knuckle")) {
                    return Integer.valueOf(R.string.injury_reason_knuckle);
                }
                return null;
            case -516493201:
                if (W.equals("lower leg")) {
                    return Integer.valueOf(R.string.injury_reason_lower_leg);
                }
                return null;
            case -499485916:
                if (!W.equals("achilles strain")) {
                    return null;
                }
                return Integer.valueOf(R.string.injury_reason_achilles);
            case -493881380:
                if (W.equals("plantar")) {
                    return Integer.valueOf(R.string.injury_reason_plantar);
                }
                return null;
            case -484825675:
                if (W.equals("achilles tendon")) {
                    return Integer.valueOf(R.string.injury_reason_achilles_tendon);
                }
                return null;
            case -392192840:
                if (W.equals("contusion")) {
                    return Integer.valueOf(R.string.injury_reason_contusion);
                }
                return null;
            case -386157659:
                if (W.equals("hamstring")) {
                    return Integer.valueOf(R.string.injury_reason_hamstring);
                }
                return null;
            case -368967034:
                if (W.equals("return from injury management")) {
                    return Integer.valueOf(R.string.injury_reason_treatment_complete);
                }
                return null;
            case -351320480:
                if (W.equals("bruised foot")) {
                    return Integer.valueOf(R.string.injury_reason_bruised_foot);
                }
                return null;
            case -351270826:
                if (W.equals("bruised heel")) {
                    return Integer.valueOf(R.string.injury_reason_bruised_heel);
                }
                return null;
            case -351172811:
                if (W.equals("bruised knee")) {
                    return Integer.valueOf(R.string.injury_reason_bruised_knee);
                }
                return null;
            case -348554237:
                if (W.equals("covid 19")) {
                    return Integer.valueOf(R.string.injury_reason_covid);
                }
                return null;
            case -339967584:
                if (!W.equals("shoulder")) {
                    return null;
                }
                return Integer.valueOf(R.string.injury_reason_shoulder);
            case -284840886:
                if (W.equals("unknown")) {
                    return Integer.valueOf(R.string.injury_reason_unknonwn);
                }
                return null;
            case -179346348:
                if (W.equals("thumb / wrist")) {
                    return Integer.valueOf(R.string.injury_reason_thumb_wrist);
                }
                return null;
            case -81129487:
                if (W.equals("spinal cord")) {
                    return Integer.valueOf(R.string.injury_reason_spinal_cord);
                }
                return null;
            case -55734015:
                if (W.equals("undisclosed")) {
                    return Integer.valueOf(R.string.injury_reason_undisclosed);
                }
                return null;
            case -26612063:
                if (!W.equals("nhl/nhlpa player assistance program")) {
                    return null;
                }
                return Integer.valueOf(R.string.injury_reason_mental_health);
            case 3427:
                if (!W.equals("kn")) {
                    return null;
                }
                return Integer.valueOf(R.string.injury_reason_knee);
            case 96394:
                if (!W.equals("acl")) {
                    return null;
                }
                return Integer.valueOf(R.string.injury_reason_acl);
            case 96860:
                if (W.equals("arm")) {
                    return Integer.valueOf(R.string.injury_reason_arm);
                }
                return null;
            case 100182:
                if (W.equals("ear")) {
                    return Integer.valueOf(R.string.injury_reason_ear);
                }
                return null;
            case 100913:
                if (W.equals("eye")) {
                    return Integer.valueOf(R.string.injury_reason_eye);
                }
                return null;
            case 101487:
                if (W.equals("flu")) {
                    return Integer.valueOf(R.string.injury_reason_flu);
                }
                return null;
            case 103311:
                if (W.equals("hip")) {
                    return Integer.valueOf(R.string.injury_reason_hip);
                }
                return null;
            case 104992:
                if (W.equals("jaw")) {
                    return Integer.valueOf(R.string.injury_reason_jaw);
                }
                return null;
            case 107022:
                if (W.equals("leg")) {
                    return Integer.valueOf(R.string.injury_reason_leg);
                }
                return null;
            case 107155:
                if (W.equals("lip")) {
                    return Integer.valueOf(R.string.injury_reason_lip);
                }
                return null;
            case 112907:
                if (W.equals("rib")) {
                    return Integer.valueOf(R.string.injury_reason_rib);
                }
                return null;
            case 115018:
                if (W.equals("toe")) {
                    return valueOf;
                }
                return null;
            case 3015911:
                if (W.equals("back")) {
                    return Integer.valueOf(R.string.injury_reason_back);
                }
                return null;
            case 3029410:
                if (W.equals("body")) {
                    return Integer.valueOf(R.string.injury_reason_body);
                }
                return null;
            case 3045976:
                if (!W.equals("calf")) {
                    return null;
                }
                return Integer.valueOf(R.string.injury_reason_calf_injury);
            case 3045981:
                if (!W.equals("calk")) {
                    return null;
                }
                return Integer.valueOf(R.string.injury_reason_calf_injury);
            case 3052618:
                if (W.equals("chin")) {
                    return Integer.valueOf(R.string.injury_reason_chin);
                }
                return null;
            case 3059428:
                if (W.equals("cold")) {
                    return Integer.valueOf(R.string.injury_reason_cold);
                }
                return null;
            case 3059615:
                if (W.equals("core")) {
                    return Integer.valueOf(R.string.injury_reason_core);
                }
                return null;
            case 3128418:
                if (W.equals("eyes")) {
                    return Integer.valueOf(R.string.injury_reason_eyes);
                }
                return null;
            case 3135069:
                if (W.equals("face")) {
                    return Integer.valueOf(R.string.injury_reason_face);
                }
                return null;
            case 3148910:
                if (W.equals("foot")) {
                    return Integer.valueOf(R.string.injury_reason_foot);
                }
                return null;
            case 3194991:
                if (W.equals("hand")) {
                    return Integer.valueOf(R.string.injury_reason_hand);
                }
                return null;
            case 3198432:
                if (W.equals("head")) {
                    return Integer.valueOf(R.string.injury_reason_head);
                }
                return null;
            case 3198564:
                if (W.equals("heel")) {
                    return Integer.valueOf(R.string.injury_reason_heel);
                }
                return null;
            case 3202756:
                if (W.equals("hips")) {
                    return Integer.valueOf(R.string.injury_reason_hips);
                }
                return null;
            case 3296579:
                if (!W.equals("knee")) {
                    return null;
                }
                return Integer.valueOf(R.string.injury_reason_knee);
            case 3321920:
                if (W.equals("lips")) {
                    return Integer.valueOf(R.string.injury_reason_lips);
                }
                return null;
            case 3327889:
                if (!W.equals("lowe")) {
                    return null;
                }
                return Integer.valueOf(R.string.injury_reason_lower_body);
            case 3333378:
                if (W.equals("lung")) {
                    return Integer.valueOf(R.string.injury_reason_lung);
                }
                return null;
            case 3377247:
                if (W.equals("neck")) {
                    return Integer.valueOf(R.string.injury_reason_neck);
                }
                return null;
            case 3387347:
                if (W.equals("nose")) {
                    return Integer.valueOf(R.string.injury_reason_nose);
                }
                return null;
            case 3481927:
                if (W.equals("quad")) {
                    return Integer.valueOf(R.string.injury_reason_quad);
                }
                return null;
            case 3496916:
                if (W.equals("rest")) {
                    return Integer.valueOf(R.string.injury_reason_rest);
                }
                return null;
            case 3500232:
                if (W.equals("ribs")) {
                    return Integer.valueOf(R.string.injury_reason_ribs);
                }
                return null;
            case 3529274:
                if (W.equals("shin")) {
                    return Integer.valueOf(R.string.injury_reason_shin);
                }
                return null;
            case 3530071:
                if (W.equals("side")) {
                    return Integer.valueOf(R.string.injury_reason_side);
                }
                return null;
            case 14654324:
                if (!W.equals("pectoral")) {
                    return null;
                }
                return Integer.valueOf(R.string.injury_reason_pectoral);
            case 29560797:
                if (W.equals(IncidentKt.TYPE_SUSPENSION)) {
                    return Integer.valueOf(R.string.missing_reason_suspension);
                }
                return null;
            case 38303918:
                if (W.equals("lcl knee")) {
                    return Integer.valueOf(R.string.injury_reason_lcl);
                }
                return null;
            case 72829988:
                if (!W.equals("personal reason")) {
                    return null;
                }
                return Integer.valueOf(R.string.injury_reason_personal);
            case 92964792:
                if (!W.equals("ankke")) {
                    return null;
                }
                return Integer.valueOf(R.string.injury_reason_ankle);
            case 92964823:
                if (!W.equals("ankle")) {
                    return null;
                }
                return Integer.valueOf(R.string.injury_reason_ankle);
            case 93731495:
                if (W.equals("bicep")) {
                    return Integer.valueOf(R.string.injury_reason_bicep);
                }
                return null;
            case 94627142:
                if (W.equals("cheek")) {
                    return Integer.valueOf(R.string.injury_reason_cheek);
                }
                return null;
            case 94627585:
                if (W.equals("chest")) {
                    return Integer.valueOf(R.string.injury_reason_chest);
                }
                return null;
            case 96590787:
                if (W.equals("elbow")) {
                    return Integer.valueOf(R.string.injury_reason_elbow);
                }
                return null;
            case 97324676:
                if (W.equals("fever")) {
                    return Integer.valueOf(R.string.injury_reason_fever);
                }
                return null;
            case 98628873:
                if (W.equals("groin")) {
                    return Integer.valueOf(R.string.injury_reason_groin);
                }
                return null;
            case 99151942:
                if (!W.equals("heart")) {
                    return null;
                }
                return Integer.valueOf(R.string.injury_reason_heart);
            case 102203604:
                if (W.equals("knock")) {
                    return Integer.valueOf(R.string.injury_reason_knock);
                }
                return null;
            case 104086727:
                if (W.equals("mouth")) {
                    return Integer.valueOf(R.string.injury_reason_mouth);
                }
                return null;
            case 104590667:
                if (W.equals("nasal")) {
                    return Integer.valueOf(R.string.injury_reason_nasal);
                }
                return null;
            case 104792931:
                if (!W.equals("nhlpa")) {
                    return null;
                }
                return Integer.valueOf(R.string.injury_reason_mental_health);
            case 110330902:
                if (W.equals("thigh")) {
                    return Integer.valueOf(R.string.injury_reason_thigh);
                }
                return null;
            case 110342614:
                if (W.equals("thumb")) {
                    return Integer.valueOf(R.string.injury_reason_thumb);
                }
                return null;
            case 110369276:
                if (!W.equals("tired")) {
                    return null;
                }
                return Integer.valueOf(R.string.injury_reason_fatigue);
            case 110545608:
                if (W.equals("tooth")) {
                    return Integer.valueOf(R.string.injury_reason_tooth);
                }
                return null;
            case 110722287:
                if (W.equals("tumor")) {
                    return Integer.valueOf(R.string.injury_reason_tumor);
                }
                return null;
            case 112216829:
                if (W.equals("virus")) {
                    return Integer.valueOf(R.string.injury_reason_virus);
                }
                return null;
            case 113399759:
                if (W.equals("wrist")) {
                    return Integer.valueOf(R.string.injury_reason_wrist);
                }
                return null;
            case 151866466:
                if (W.equals("obliques")) {
                    return Integer.valueOf(R.string.injury_reason_obliques);
                }
                return null;
            case 234866444:
                if (W.equals("ac joint")) {
                    return Integer.valueOf(R.string.injury_reason_ac_joint);
                }
                return null;
            case 299069518:
                if (!W.equals("heart problems")) {
                    return null;
                }
                return Integer.valueOf(R.string.injury_reason_heart);
            case 317649683:
                if (W.equals("maintenance")) {
                    return Integer.valueOf(R.string.injury_reason_maintenance);
                }
                return null;
            case 325361651:
                if (!W.equals("trade reasons")) {
                    return null;
                }
                return Integer.valueOf(R.string.missing_reason_trade_related);
            case 334988655:
                if (!W.equals("trade related")) {
                    return null;
                }
                return Integer.valueOf(R.string.missing_reason_trade_related);
            case 362546509:
                if (!W.equals("middle body")) {
                    return null;
                }
                return Integer.valueOf(R.string.injury_reason_mid_body);
            case 389357516:
                if (W.equals("broken ankle")) {
                    return Integer.valueOf(R.string.injury_reason_broken_ankle);
                }
                return null;
            case 409792452:
                if (W.equals("broken wrist")) {
                    return Integer.valueOf(R.string.injury_reason_broken_wrist);
                }
                return null;
            case 428351961:
                if (W.equals("broken foot")) {
                    return Integer.valueOf(R.string.injury_reason_broken_foot);
                }
                return null;
            case 428398042:
                if (W.equals("broken hand")) {
                    return Integer.valueOf(R.string.injury_reason_broken_hand);
                }
                return null;
            case 428590398:
                if (W.equals("broken nose")) {
                    return Integer.valueOf(R.string.injury_reason_broken_nose);
                }
                return null;
            case 439431700:
                if (W.equals("peroneal")) {
                    return Integer.valueOf(R.string.injury_reason_peroneal);
                }
                return null;
            case 443164224:
                if (!W.equals("personal")) {
                    return null;
                }
                return Integer.valueOf(R.string.injury_reason_personal);
            case 501373010:
                if (W.equals("dead leg")) {
                    return Integer.valueOf(R.string.injury_reason_dead_leg);
                }
                return null;
            case 529823674:
                if (!W.equals("overload")) {
                    return null;
                }
                return Integer.valueOf(R.string.injury_reason_fatigue);
            case 645778236:
                if (W.equals("dislocated shoulder")) {
                    return Integer.valueOf(R.string.injury_reason_dislocated_shoulder);
                }
                return null;
            case 715925926:
                if (!W.equals("medial collateral ligament")) {
                    return null;
                }
                return Integer.valueOf(R.string.injury_reason_mcl);
            case 743853568:
                if (W.equals("mononucleosis")) {
                    return Integer.valueOf(R.string.injury_reason_mononucleosis);
                }
                return null;
            case 748202092:
                if (W.equals("groin strain")) {
                    return Integer.valueOf(R.string.injury_reason_groin_strain);
                }
                return null;
            case 761138029:
                if (W.equals("pulled muscle")) {
                    return Integer.valueOf(R.string.injury_reason_pulled_muscle);
                }
                return null;
            case 833423969:
                if (W.equals("malaria")) {
                    return Integer.valueOf(R.string.injury_reason_malaria);
                }
                return null;
            case 836006754:
                if (W.equals("blood clotting")) {
                    return Integer.valueOf(R.string.injury_reason_blood_clotting);
                }
                return null;
            case 940776081:
                if (W.equals("medical")) {
                    return Integer.valueOf(R.string.injury_reason_medical_condition);
                }
                return null;
            case 965153654:
                if (W.equals("coach's decision")) {
                    return Integer.valueOf(R.string.missing_reason_coach_decision);
                }
                return null;
            case 965547861:
                if (W.equals("sore throat")) {
                    return Integer.valueOf(R.string.injury_reason_sore_throat);
                }
                return null;
            case 976972054:
                if (W.equals("achilles tendon rupture")) {
                    return Integer.valueOf(R.string.injury_reason_achilles_tendon_rupture);
                }
                return null;
            case 985293045:
                if (W.equals("ligament")) {
                    return Integer.valueOf(R.string.injury_reason_ligament);
                }
                return null;
            case 1010782052:
                if (W.equals("abdominal strain")) {
                    return Integer.valueOf(R.string.injury_reason_abdominal_strain);
                }
                return null;
            case 1107186093:
                if (W.equals("muscle cramps")) {
                    return Integer.valueOf(R.string.injury_reason_muscle_cramps);
                }
                return null;
            case 1135783678:
                if (!W.equals("stomach trouble")) {
                    return null;
                }
                return Integer.valueOf(R.string.injury_reason_stomach);
            case 1151916192:
                if (W.equals("sacroiliac joint")) {
                    return Integer.valueOf(R.string.injury_reason_sacroiliac_joint);
                }
                return null;
            case 1154988425:
                if (W.equals("gluteal strain")) {
                    return Integer.valueOf(R.string.injury_reason_gluteal_strain);
                }
                return null;
            case 1168291681:
                if (!W.equals("lower body")) {
                    return null;
                }
                return Integer.valueOf(R.string.injury_reason_lower_body);
            case 1173192137:
                if (W.equals("appendix")) {
                    return Integer.valueOf(R.string.injury_reason_appendix);
                }
                return null;
            case 1218227596:
                if (W.equals("broken collarbone")) {
                    return Integer.valueOf(R.string.injury_reason_broken_collarbone);
                }
                return null;
            case 1232354515:
                if (W.equals("patellar")) {
                    return Integer.valueOf(R.string.injury_reason_patellar);
                }
                return null;
            case 1367177348:
                if (W.equals("concussion protocol")) {
                    return Integer.valueOf(R.string.injury_reason_concussion_protocol);
                }
                return null;
            case 1380212702:
                if (!W.equals("not related")) {
                    return null;
                }
                return Integer.valueOf(R.string.injury_reason_non_related);
            case 1457306626:
                if (W.equals("lack of fitness")) {
                    return Integer.valueOf(R.string.injury_reason_match_fitness);
                }
                return null;
            case 1578193069:
                if (W.equals("shin splints")) {
                    return Integer.valueOf(R.string.injury_reason_shin_splints);
                }
                return null;
            case 1580098311:
                if (!W.equals("toe sprain")) {
                    return null;
                }
                break;
            case 1585415870:
                if (W.equals("sprained foot")) {
                    return Integer.valueOf(R.string.injury_reason_sprained_foot);
                }
                return null;
            case 1585461951:
                if (W.equals("sprained hand")) {
                    return Integer.valueOf(R.string.injury_reason_sprained_hand);
                }
                return null;
            case 1585563539:
                if (W.equals("sprained knee")) {
                    return Integer.valueOf(R.string.injury_reason_sprained_knee);
                }
                return null;
            case 1605088529:
                if (W.equals("abdominal")) {
                    return Integer.valueOf(R.string.injury_reason_abdominal);
                }
                return null;
            case 1676381073:
                if (W.equals("broken arm")) {
                    return Integer.valueOf(R.string.injury_reason_broken_arm);
                }
                return null;
            case 1676387524:
                if (W.equals("broken hip")) {
                    return Integer.valueOf(R.string.injury_reason_broken_hip);
                }
                return null;
            case 1676389205:
                if (W.equals("broken jaw")) {
                    return Integer.valueOf(R.string.injury_reason_broken_jaw);
                }
                return null;
            case 1676391235:
                if (W.equals("broken leg")) {
                    return Integer.valueOf(R.string.injury_reason_broken_leg);
                }
                return null;
            case 1676397120:
                if (W.equals("broken rib")) {
                    return Integer.valueOf(R.string.injury_reason_broken_rib);
                }
                return null;
            case 1676399231:
                if (W.equals("broken toe")) {
                    return Integer.valueOf(R.string.injury_reason_broken_toe);
                }
                return null;
            case 1716875893:
                if (W.equals("left leg")) {
                    return Integer.valueOf(R.string.injury_reason_left_leg);
                }
                return null;
            case 1718711459:
                if (!W.equals("quadriceps")) {
                    return null;
                }
                return Integer.valueOf(R.string.injury_reason_quadriceps);
            case 1724295834:
                if (W.equals("reconditioning")) {
                    return Integer.valueOf(R.string.injury_reason_reconditioning);
                }
                return null;
            case 1755473295:
                if (W.equals("cruciate ligament")) {
                    return Integer.valueOf(R.string.injury_reason_cruciate_ligament);
                }
                return null;
            case 1781114253:
                if (!W.equals("mcl knee")) {
                    return null;
                }
                return Integer.valueOf(R.string.injury_reason_mcl);
            case 1893672320:
                if (!W.equals("illness")) {
                    return null;
                }
                return Integer.valueOf(R.string.injury_reason_illness);
            case 1898600327:
                if (W.equals("sprained ankle")) {
                    return Integer.valueOf(R.string.injury_reason_sprained_ankle);
                }
                return null;
            case 1919035263:
                if (W.equals("sprained wrist")) {
                    return Integer.valueOf(R.string.injury_reason_sprained_wrist);
                }
                return null;
            case 1926279930:
                if (W.equals("scratch")) {
                    return Integer.valueOf(R.string.injury_reason_scratch);
                }
                return null;
            case 1929445193:
                if (W.equals("appendicitis")) {
                    return Integer.valueOf(R.string.injury_reason_appendicitis);
                }
                return null;
            case 1985829163:
                if (W.equals("collapsed lung")) {
                    return Integer.valueOf(R.string.injury_reason_collapsed_lung);
                }
                return null;
            case 1989315621:
                if (W.equals("bruised ankle")) {
                    return Integer.valueOf(R.string.injury_reason_bruised_ankle);
                }
                return null;
            case 2067243326:
                if (!W.equals("shouler")) {
                    return null;
                }
                return Integer.valueOf(R.string.injury_reason_shoulder);
            case 2083350668:
                if (W.equals("injury management")) {
                    return Integer.valueOf(R.string.injury_reason_under_treatment);
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static q9k r(String str, boolean z) {
        str.getClass();
        switch (str.hashCode()) {
            case -888000162:
                if (str.equals("outForSeason")) {
                    return new q9k(R.string.injury_status_season);
                }
                break;
            case -593559525:
                if (str.equals("injuredReserve")) {
                    return new q9k(R.string.injury_status_injured_reserve);
                }
                break;
            case 110414:
                if (str.equals("out")) {
                    return new q9k(R.string.injury_status_out);
                }
                break;
            case 474658308:
                if (str.equals("injuredList7Day")) {
                    return b(7, z);
                }
                break;
            case 861226832:
                if (str.equals("outIndefinitely")) {
                    return new q9k(R.string.injury_status_indefinite);
                }
                break;
            case 1823340222:
                if (str.equals("injuredList10Day")) {
                    return b(10, z);
                }
                break;
            case 1823489177:
                if (str.equals("injuredList15Day")) {
                    return b(15, z);
                }
                break;
            case 1827957827:
                if (str.equals("injuredList60Day")) {
                    return b(60, z);
                }
                break;
            case 1920963813:
                if (str.equals("dayToDay")) {
                    return new q9k(R.string.injury_status_day_to_day);
                }
                break;
        }
        return new q9k(R.string.player_injured);
    }

    public static Intent s(Context context, int i2, Intent intent) {
        context.getClass();
        Intent intent2 = new Intent(context, (Class<?>) MmaFighterActivity.class);
        if (intent != null) {
            intent2.putExtras(intent);
        }
        intent2.putExtra("FIGHTER_ID", i2);
        if (context instanceof csk) {
            context = ((csk) context).getBaseContext();
        }
        BaseActivity baseActivity = context instanceof BaseActivity ? (BaseActivity) context : null;
        intent2.putExtra("screen_name", baseActivity != null ? baseActivity.u() : null);
        intent2.putExtra("tab_name", baseActivity != null ? baseActivity.C : null);
        return intent2;
    }

    public static final bpf t(Context context) {
        bpf bpfVar = i;
        if (bpfVar != null) {
            return bpfVar;
        }
        synchronized (h) {
            bpf bpfVar2 = i;
            if (bpfVar2 != null) {
                return bpfVar2;
            }
            context.getApplicationContext();
            bpf c2 = new ox9(context).c();
            i = c2;
            return c2;
        }
    }

    public static void w(Context context, String str, CharSequence charSequence, String str2, String str3) {
        context.getClass();
        str.getClass();
        charSequence.getClass();
        InfoBottomSheet infoBottomSheet = new InfoBottomSheet();
        infoBottomSheet.setArguments(fz8.C(fz8.H("TITLE_EXTRA", str), new x62("TEXT_EXTRA", new z62(charSequence)), new x62("LOWER_TEXT_EXTRA", new z62(str3)), fz8.H("ANALYTICS_STRING_EXTRA", str2)));
        Unit unit = Unit.a;
        if (context instanceof csk) {
            context = ((csk) context).getBaseContext();
        }
        rq3 rq3Var = null;
        AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
        if (appCompatActivity != null) {
            wca.x(appCompatActivity.getLifecycle()).b(new r1(infoBottomSheet, appCompatActivity, rq3Var, 3));
        }
    }

    public static void x(int i2, Context context) {
        int i3 = MmaFighterActivity.U;
        context.getClass();
        context.startActivity(s(context, i2, null));
    }

    @Override // defpackage.ipg
    public int a(fp4 fp4Var, hm4 hm4Var, int i2) {
        hm4Var.b = 4;
        return -4;
    }

    @Override // defpackage.meh
    public Object c() {
        return Executors.newCachedThreadPool(n49.e("grpc-default-executor-%d"));
    }

    @Override // defpackage.o2c
    public q2c d(n2c n2cVar) {
        int i2 = lik.a;
        if (i2 < 23 || i2 < 31) {
            return new fff(3).d(n2cVar);
        }
        int f2 = rjc.f(n2cVar.c.l);
        "Creating an asynchronous MediaCodec adapter for track type ".concat(lik.t(f2));
        m6k.Q();
        return new f4a(f2).d(n2cVar);
    }

    @Override // defpackage.meh
    public void f(Object obj) {
        ((ExecutorService) ((Executor) obj)).shutdown();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lx2
    public void h(vh9 vh9Var, hoi hoiVar) {
        vh9Var.e.f(rj9.i, new bx((Function2) hoiVar, (rq3) null, 9));
    }

    @Override // defpackage.ipg
    public boolean isReady() {
        return true;
    }

    @Override // defpackage.lg0
    public void j(kx4 kx4Var, int i2, int[] iArr, ema emaVar, int[] iArr2) {
        ww9.E(i2, iArr, iArr2, false);
    }

    public long l() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    @Override // defpackage.evk
    public int m() {
        return R.id.view_tree_navigation_event_dispatcher_owner;
    }

    @Override // defpackage.pjd
    public Object n() {
        return new TreeSet();
    }

    @Override // defpackage.foh
    public boolean q(Object obj, Object obj2) {
        return false;
    }

    @Override // defpackage.ipg
    public int skipData(long j2) {
        return 0;
    }

    public String toString() {
        switch (this.a) {
            case 5:
                return "NeverEqualPolicy";
            case 16:
                return "AbsoluteArrangement#Center";
            case 25:
                return "grpc-default-executor";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if (r4 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean u(String str) {
        Set set = cw3.a;
        if (set.contains(this)) {
            return false;
        }
        try {
            String str2 = null;
            if (!set.contains(this)) {
                try {
                    float[] fArr = new float[30];
                    for (int i2 = 0; i2 < 30; i2++) {
                        fArr[i2] = 0.0f;
                    }
                    String[] f2 = stc.f(1, new float[][]{fArr}, new String[]{str});
                    if (f2 != null) {
                        str2 = f2[0];
                    }
                    str2 = "none";
                } catch (Throwable th) {
                    cw3.a(this, th);
                }
            }
            return !"none".equals(str2);
        } catch (Throwable th2) {
            cw3.a(this, th2);
            return false;
        }
    }

    @Override // defpackage.ipg
    public void maybeThrowError() {
    }

    @Override // defpackage.lt9
    public void onSuccess() {
    }

    @Override // defpackage.lt9
    public void E(fq5 fq5Var) {
    }

    @Override // defpackage.nnd
    public int i(int i2) {
        return i2;
    }

    @Override // defpackage.nnd
    public int v(int i2) {
        return i2;
    }
}
