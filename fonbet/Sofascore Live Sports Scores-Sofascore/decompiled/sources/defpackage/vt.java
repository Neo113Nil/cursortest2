package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.blaze.blazesdk.features.videos.players.ui.a;
import com.sofascore.model.mvvm.model.TeamLinkedRound;
import com.sofascore.model.newNetwork.topperformance.response.TopStatsItem;
import com.sofascore.results.R;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.fantasy.competition.FantasyCompetitionActivity;
import com.sofascore.results.fantasy.teammanagement.components.FantasyFreeTransfersWarningBottomSheet;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class vt implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ vt(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FragmentActivity O;
        SharedPreferences d;
        SharedPreferences d2;
        rq3 rq3Var = null;
        switch (this.a) {
            case 0:
                Context context = this.b;
                String str = (String) obj;
                str.getClass();
                ut.b.getClass();
                String string = context.getString(q1f.q(str).a);
                string.getClass();
                return string;
            case 1:
                Context context2 = this.b;
                int intValue = ((Integer) obj).intValue();
                wxf wxfVar = EventActivity.h0;
                wxf.B(context2, intValue, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                return Unit.a;
            case 2:
                Context context3 = this.b;
                do7 do7Var = (do7) obj;
                do7Var.getClass();
                int i = FantasyCompetitionActivity.R;
                context3.getClass();
                context3.startActivity(mx9.t(context3, do7Var, null));
                return Unit.a;
            case 3:
                Context context4 = this.b;
                int intValue2 = ((Integer) obj).intValue();
                nv.A(context4, "open_event", null);
                wxf wxfVar2 = EventActivity.h0;
                wxf.B(context4, intValue2, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                return Unit.a;
            case 4:
                Context context5 = this.b;
                int intValue3 = ((Integer) obj).intValue();
                nv.A(context5, "open_event", null);
                wxf wxfVar3 = EventActivity.h0;
                wxf.B(context5, intValue3, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                return Unit.a;
            case 5:
                Context context6 = this.b;
                sx6 sx6Var = (sx6) obj;
                sx6Var.getClass();
                if (sx6Var == sx6.c) {
                    String string2 = context6.getString(R.string.fantasy_lineup_view_expected_fantasy_points_title);
                    string2.getClass();
                    String string3 = context6.getString(R.string.fantasy_expected_fantasy_points_explained);
                    string3.getClass();
                    String string4 = context6.getString(R.string.got_it_button);
                    string4.getClass();
                    AlertDialog create = new AlertDialog.Builder(context6, R.style.RedesignDialog).create();
                    h04 b = h04.b(LayoutInflater.from(context6));
                    TextView textView = b.d;
                    mqi mqiVar = qhi.a;
                    textView.setText(qhi.a(string2));
                    b.c.setText(qhi.a(string3));
                    create.setView(b.b);
                    create.setButton(-2, string4, new i0(create, 5));
                    create.show();
                }
                return Unit.a;
            case 6:
                Context context7 = this.b;
                en7 en7Var = (en7) obj;
                en7Var.getClass();
                if ((en7Var instanceof an7) && (O = hkg.O(context7)) != null) {
                    FantasyFreeTransfersWarningBottomSheet fantasyFreeTransfersWarningBottomSheet = new FantasyFreeTransfersWarningBottomSheet();
                    AppCompatActivity appCompatActivity = O instanceof AppCompatActivity ? (AppCompatActivity) O : null;
                    if (appCompatActivity != null) {
                        wca.x(appCompatActivity.getLifecycle()).b(new r1(fantasyFreeTransfersWarningBottomSheet, appCompatActivity, rq3Var, 3));
                    }
                }
                return Unit.a;
            case 7:
                Context context8 = this.b;
                SharedPreferences.Editor editor = (SharedPreferences.Editor) obj;
                editor.getClass();
                SharedPreferences sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext = context8.getApplicationContext();
                    synchronized (uic.i) {
                        d = a5f.d(applicationContext);
                        uic.j = d;
                    }
                    d.getClass();
                    sharedPreferences = d;
                }
                editor.putInt("NUMBER_OF_FEED_OPENINGS", sharedPreferences.getInt("NUMBER_OF_FEED_OPENINGS", 0) + 1);
                return Unit.a;
            case 8:
                k7d A = q5a.A(this.b);
                A.e((Bundle) obj);
                return A;
            case 9:
                bea.G(this.b, (String) obj);
                return Unit.a;
            case 10:
                Context context9 = this.b;
                pgg pggVar = (pgg) obj;
                pggVar.getClass();
                Context applicationContext2 = context9.getApplicationContext();
                applicationContext2.getClass();
                return new zag(applicationContext2, 0L, pggVar);
            case 11:
                Context context10 = this.b;
                String str2 = (String) obj;
                str2.getClass();
                context10.getClass();
                Uri parse = Uri.parse(str2);
                try {
                    ea4 a = new da4().a();
                    if (!(context10 instanceof Activity)) {
                        a.a.setFlags(268435456);
                    }
                    a.a(context10, parse);
                } catch (Throwable unused) {
                    Intent intent = new Intent("android.intent.action.VIEW", parse);
                    if (!(context10 instanceof Activity)) {
                        intent.setFlags(268435456);
                    }
                    context10.startActivity(intent);
                }
                return Unit.a;
            case 12:
                Context context11 = this.b;
                pgg pggVar2 = (pgg) obj;
                pggVar2.getClass();
                Context applicationContext3 = context11.getApplicationContext();
                applicationContext3.getClass();
                return new zag(applicationContext3, 300L, pggVar2);
            case 13:
                Context context12 = this.b;
                String str3 = (String) obj;
                str3.getClass();
                Context applicationContext4 = context12.getApplicationContext();
                applicationContext4.getClass();
                Uri parse2 = Uri.parse(str3);
                try {
                    ea4 a2 = new da4().a();
                    if (!(applicationContext4 instanceof Activity)) {
                        a2.a.setFlags(268435456);
                    }
                    a2.a(applicationContext4, parse2);
                } catch (Throwable unused2) {
                    Intent intent2 = new Intent("android.intent.action.VIEW", parse2);
                    if (!(applicationContext4 instanceof Activity)) {
                        intent2.setFlags(268435456);
                    }
                    applicationContext4.startActivity(intent2);
                }
                return Unit.a;
            case 14:
                Context context13 = this.b;
                SharedPreferences.Editor editor2 = (SharedPreferences.Editor) obj;
                editor2.getClass();
                SharedPreferences sharedPreferences2 = uic.j;
                if (sharedPreferences2 == null) {
                    Context applicationContext5 = context13.getApplicationContext();
                    synchronized (uic.i) {
                        d2 = a5f.d(applicationContext5);
                        uic.j = d2;
                    }
                    d2.getClass();
                    sharedPreferences2 = d2;
                }
                editor2.putInt("PREF_SCREENSHOT_COUNTER", sharedPreferences2.getInt("PREF_SCREENSHOT_COUNTER", 0) + 1);
                return Unit.a;
            case 15:
                Context context14 = this.b;
                int intValue4 = ((Integer) obj).intValue();
                wxf wxfVar4 = EventActivity.h0;
                wxf.B(context14, intValue4, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                return Unit.a;
            case 16:
                Context context15 = this.b;
                TeamLinkedRound teamLinkedRound = (TeamLinkedRound) obj;
                teamLinkedRound.getClass();
                nxi.a(teamLinkedRound, context15);
                return Unit.a;
            case 17:
                Context context16 = this.b;
                wij wijVar = (wij) obj;
                wijVar.getClass();
                context16.getClass();
                String upperCase = dmi.y(StringsKt.U(2, String.valueOf(wijVar.a)), context16.getString(wijVar.b.a)).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                return upperCase;
            case 18:
                Context context17 = this.b;
                List<TopStatsItem> list = (List) obj;
                list.getClass();
                ArrayList arrayList = new ArrayList(k13.r(list, 10));
                for (TopStatsItem topStatsItem : list) {
                    String string5 = context17.getString(R.string.kilometers_format, yid.c("%.1f", Double.valueOf(Double.parseDouble(topStatsItem.getStatistic()))));
                    string5.getClass();
                    arrayList.add(new TopStatsItem(string5, topStatsItem.getPlayer(), topStatsItem.getEvent()));
                }
                return arrayList;
            case 19:
                Context context18 = this.b;
                List<TopStatsItem> list2 = (List) obj;
                list2.getClass();
                ArrayList arrayList2 = new ArrayList(k13.r(list2, 10));
                for (TopStatsItem topStatsItem2 : list2) {
                    String string6 = context18.getString(R.string.kilometers_per_hour_format, yid.c("%.1f", Double.valueOf(Double.parseDouble(topStatsItem2.getStatistic()))));
                    string6.getClass();
                    arrayList2.add(new TopStatsItem(string6, topStatsItem2.getPlayer(), topStatsItem2.getEvent()));
                }
                return arrayList2;
            case 20:
                Context context19 = this.b;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                nv.z0(context19, booleanValue ? kv.SWITCH_OFF : kv.SWITCH_ON, "mute_wc_popup", "wc_popup");
                SharedPreferences sharedPreferences3 = uic.j;
                if (sharedPreferences3 == null) {
                    Context applicationContext6 = context19.getApplicationContext();
                    synchronized (uic.i) {
                        sharedPreferences3 = a5f.d(applicationContext6);
                        uic.j = sharedPreferences3;
                    }
                    sharedPreferences3.getClass();
                }
                SharedPreferences.Editor i2 = dmi.i(sharedPreferences3, "PREF_WEEKLY_CHALLENGE_MUTED", booleanValue);
                Unit unit = Unit.a;
                i2.apply();
                return Unit.a;
            case 21:
                Context context20 = this.b;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                int i3 = syl.C;
                if (!booleanValue2) {
                    cnb.promptNoInternetConnection$default(context20, null, 1, null);
                }
                return Unit.a;
            case 22:
                Context context21 = this.b;
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                int i4 = obm.D;
                if (!booleanValue3) {
                    cnb.promptNoInternetConnection$default(context21, null, 1, null);
                }
                return Unit.a;
            default:
                Context context22 = this.b;
                boolean booleanValue4 = ((Boolean) obj).booleanValue();
                int i5 = a.I;
                if (!booleanValue4) {
                    cnb.promptNoInternetConnection$default(context22, null, 1, null);
                }
                return Unit.a;
        }
    }
}
