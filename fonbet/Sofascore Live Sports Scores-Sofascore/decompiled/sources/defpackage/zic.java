package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import com.appsflyer.internal.i;
import com.appsflyer.sdk_base.referrer.Payload;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.internal.cast.zzyh;
import com.google.android.gms.internal.consent_sdk.zza;
import com.google.android.gms.internal.consent_sdk.zzbq;
import com.google.android.gms.internal.consent_sdk.zzcz;
import com.google.android.gms.internal.consent_sdk.zzj;
import com.google.android.gms.internal.consent_sdk.zzqp;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C4427z5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.newNetwork.topperformance.response.AmericanFootballTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.response.BaseballTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.response.BasketballTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.response.CricketTopPlayerStatistics;
import com.sofascore.model.newNetwork.topperformance.response.FootballTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.response.FutsalTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.response.HandballTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.response.IceHockeyTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.response.RugbyTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.response.TopPerformanceStatistics;
import com.sofascore.model.newNetwork.topperformance.response.VolleyballTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.CricketTopPlayersStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.TopPlayersStatisticsItem;
import com.sofascore.results.R;
import com.sofascore.results.league.fragment.topStats.TopPlayerCategoryUiModel;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.f79;
import defpackage.p7f;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class zic implements aki, zzqp, zzyh, pg0, w1g, pjd, xli, eni, kic, sm6 {
    public static boolean f;
    public final /* synthetic */ int a;
    public static final zic b = new zic(0);
    public static final zic c = new zic(2);
    public static final zic d = new zic(4);
    public static final zic e = new zic(5);
    public static final zic g = new zic(7);
    public static final zic h = new zic(9);
    public static final zic i = new zic(10);
    public static final zic j = new zic(11);
    public static final zic k = new zic(12);
    public static final zic l = new zic(13);
    public static final zic m = new zic(14);
    public static final zic n = new zic(15);

    public zic(SSLSession sSLSession) {
        this.a = 26;
        sSLSession.getCipherSuite();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            Certificate certificate = localCertificates[0];
        }
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            if (peerCertificates != null) {
                Certificate certificate2 = peerCertificates[0];
            }
        } catch (SSLPeerUnverifiedException e2) {
            b8a.d.log(Level.FINE, "Peer cert not available for peerHost=" + sSLSession.getPeerHost(), (Throwable) e2);
        }
    }

    public static tu2 A(String str) {
        tu2 tu2Var = new tu2(str);
        tu2.d.put(str, tu2Var);
        return tu2Var;
    }

    public static boolean B(Context context) {
        SharedPreferences d2;
        context.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                d2 = a5f.d(applicationContext);
                uic.j = d2;
            }
            d2.getClass();
            sharedPreferences = d2;
        }
        boolean z = sharedPreferences.getBoolean("PREF_SHOW_MANUFACTURER_DIALOG", true);
        String str = Build.MANUFACTURER;
        str.getClass();
        Locale locale = Locale.US;
        String k2 = i.k(locale, str, locale);
        return z && (StringsKt.J(k2, Payload.SOURCE_HUAWEI, false) || StringsKt.J(k2, "asus", false) || StringsKt.J(k2, "wiko", false) || StringsKt.J(k2, Payload.SOURCE_XIAOMI, false) || StringsKt.J(k2, "lenovo", false));
    }

    public static void C(Context context, String str, String str2, int i2) {
        AlertDialog h2 = lnb.h(R.style.RedesignDialog, context);
        e92 g2 = e92.g(LayoutInflater.from(context));
        ((TextView) g2.b).setText(str);
        ((TextView) g2.f).setText(context.getString(Intrinsics.c(str2, Sports.MMA) ? R.string.mma_receiving_notifications_organisation : R.string.following_text_league));
        as9.q((ImageView) g2.c, Integer.valueOf(i2), 0, null);
        int i3 = 3;
        ((MaterialCheckBox) g2.d).setOnCheckedChangeListener(new rn(context, i3));
        h2.setCanceledOnTouchOutside(false);
        h2.setView((ConstraintLayout) g2.e);
        h2.setButton(-1, context.getString(R.string.ok), new on(2));
        h2.setButton(-3, context.getString(R.string.action_settings), new mn(context, i3));
        FragmentActivity K = hkg.K(context);
        if (K == null || K.isFinishing()) {
            return;
        }
        h2.show();
    }

    public static void D(final Activity activity, boolean z) {
        int i2 = 0;
        if (z) {
            kr9 kr9Var = new kr9(activity, 22);
            pvd pvdVar = new pvd(11);
            zza a = zza.a(activity);
            ((Queue) a.d().g.get()).add(Long.valueOf(System.currentTimeMillis()));
            a.c().a(kr9Var, pvdVar, false);
            return;
        }
        if (f) {
            return;
        }
        f = true;
        final p7f p7fVar = new p7f(activity, i2);
        zza a2 = zza.a(activity);
        if (a2.b().a()) {
            p7fVar.a();
        } else {
            ((Queue) a2.d().i.get()).add(Long.valueOf(System.currentTimeMillis()));
            zzbq c2 = a2.c();
            zzcz.a();
            c2.a(new ofk() { // from class: com.google.android.gms.internal.consent_sdk.zzbo
                @Override // defpackage.ofk
                public final void h(zzbe zzbeVar) {
                    zzbeVar.a(activity, p7fVar);
                }
            }, new nfk() { // from class: com.google.android.gms.internal.consent_sdk.zzbp
                @Override // defpackage.nfk
                public final void f(f79 f79Var) {
                    p7f.this.a();
                }
            }, true);
        }
        Context applicationContext = activity.getApplicationContext();
        applicationContext.getClass();
        nv.l0(applicationContext, dv.POPUP_QUEUE, bv.GOOGLE_PRIVACY_POLICY, null);
    }

    public static final void E(Context context, DialogInterface.OnClickListener onClickListener) {
        context.getClass();
        AlertDialog create = new AlertDialog.Builder(context, R.style.RedesignDialog).create();
        ez0 e2 = ez0.e(LayoutInflater.from(context));
        TextView textView = (TextView) e2.e;
        String string = context.getString(R.string.manufacturer_title);
        string.getClass();
        textView.setText(String.format(string, Arrays.copyOf(new Object[]{Build.MANUFACTURER}, 1)));
        ((TextView) e2.d).setText(context.getString(R.string.manufacturer_text));
        ((MaterialCheckBox) e2.c).setOnCheckedChangeListener(new rn(context, 0));
        create.setCancelable(false);
        create.setCanceledOnTouchOutside(false);
        create.setView((ScrollView) e2.b);
        create.setButton(-1, context.getString(R.string.ok), onClickListener);
        FragmentActivity K = hkg.K(context);
        if (K == null || K.isFinishing()) {
            return;
        }
        create.show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v47, types: [kp5] */
    /* JADX WARN: Type inference failed for: r3v48, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v49, types: [java.util.ArrayList] */
    public static gv9 F(Context context, TopPerformanceStatistics topPerformanceStatistics, gz3 gz3Var, String str, boolean z, wj1 wj1Var, hub hubVar, boolean z2, int i2) {
        xbb a;
        ?? r3;
        String str2 = (i2 & 8) != 0 ? null : str;
        boolean z3 = (i2 & 16) != 0 ? false : z;
        wj1 wj1Var2 = (i2 & 32) != 0 ? null : wj1Var;
        hub hubVar2 = (i2 & 64) != 0 ? null : hubVar;
        boolean z4 = (i2 & 128) != 0 ? true : z2;
        boolean z5 = (i2 & NotificationCompat.FLAG_LOCAL_ONLY) == 0;
        boolean z6 = topPerformanceStatistics instanceof FootballTopPlayersStatistics;
        cbb cbbVar = cbb.a;
        if (z6) {
            return cbb.e(cbbVar, context, (FootballTopPlayersStatistics) topPerformanceStatistics, qab.i, 0, z5, null, hubVar2, false, z4, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE);
        }
        boolean z7 = z4;
        if (topPerformanceStatistics instanceof BasketballTopPlayersStatistics) {
            return cbb.e(cbbVar, context, (BasketballTopPlayersStatistics) topPerformanceStatistics, nab.e, Integer.MAX_VALUE, false, null, null, z3, z7, 64);
        }
        if (topPerformanceStatistics instanceof IceHockeyTopPlayersStatistics) {
            IceHockeyTopPlayersStatistics iceHockeyTopPlayersStatistics = (IceHockeyTopPlayersStatistics) topPerformanceStatistics;
            hub hubVar3 = hub.b;
            List S0 = CollectionsKt.S0(vab.h);
            yre[] yreVarArr = yre.c;
            if (Intrinsics.c(str2, "goalie")) {
                S0 = CollectionsKt.H0(S0, new se7(28));
            }
            return cbb.e(cbbVar, context, iceHockeyTopPlayersStatistics, S0, Integer.MAX_VALUE, false, null, hubVar3, false, z7, 128);
        }
        if (topPerformanceStatistics instanceof HandballTopPlayersStatistics) {
            return cbb.e(cbbVar, context, (HandballTopPlayersStatistics) topPerformanceStatistics, tab.e, Integer.MAX_VALUE, false, null, null, false, z7, PsExtractor.AUDIO_STREAM);
        }
        if (topPerformanceStatistics instanceof AmericanFootballTopPlayersStatistics) {
            return cbb.e(cbbVar, context, (AmericanFootballTopPlayersStatistics) topPerformanceStatistics, hab.f, Integer.MAX_VALUE, false, null, hub.b, false, z7, 128);
        }
        if (topPerformanceStatistics instanceof BaseballTopPlayersStatistics) {
            BaseballTopPlayersStatistics baseballTopPlayersStatistics = (BaseballTopPlayersStatistics) topPerformanceStatistics;
            if (wj1Var2 != null) {
                kp5 kp5Var = kab.f;
                r3 = new ArrayList();
                for (Object obj : kp5Var) {
                    if (((kab) obj).a == wj1Var2) {
                        r3.add(obj);
                    }
                }
            } else {
                r3 = kab.f;
            }
            return cbb.e(cbbVar, context, baseballTopPlayersStatistics, r3, Integer.MAX_VALUE, false, null, null, false, z7, PsExtractor.AUDIO_STREAM);
        }
        if (topPerformanceStatistics instanceof RugbyTopPlayersStatistics) {
            return cbb.e(cbbVar, context, (RugbyTopPlayersStatistics) topPerformanceStatistics, yab.e, Integer.MAX_VALUE, false, null, hub.b, false, z7, 128);
        }
        if (topPerformanceStatistics instanceof VolleyballTopPlayersStatistics) {
            return cbb.e(cbbVar, context, (VolleyballTopPlayersStatistics) topPerformanceStatistics, bbb.e, Integer.MAX_VALUE, false, null, hub.b, false, z7, 128);
        }
        if (!(topPerformanceStatistics instanceof CricketTopPlayerStatistics)) {
            return topPerformanceStatistics instanceof FutsalTopPlayersStatistics ? cbb.e(cbbVar, context, (FutsalTopPlayersStatistics) topPerformanceStatistics, rab.e, 0, z5, null, hubVar2, false, z7, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE) : rlh.b;
        }
        if (gz3Var != null) {
            CricketTopPlayerStatistics cricketTopPlayerStatistics = (CricketTopPlayerStatistics) topPerformanceStatistics;
            int ordinal = gz3Var.ordinal();
            if (ordinal == 0) {
                xbb b2 = a.b();
                String string = context.getString(R.string.cricket_runs);
                string.getClass();
                List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> runsScored = cricketTopPlayerStatistics.getRunsScored();
                if (runsScored != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = runsScored.iterator();
                    while (it.hasNext()) {
                        TopPlayersStatisticsItem topPlayersStatisticsItem = (TopPlayersStatisticsItem) it.next();
                        vnj x = ktm.x(context, string, String.valueOf(((CricketTopPlayersStatisticsItem) topPlayersStatisticsItem.getStatistics()).getRunsScored()), topPlayersStatisticsItem, z7);
                        if (x != null) {
                            arrayList.add(x);
                        }
                    }
                    b2.add(new TopPlayerCategoryUiModel(string, l6g.W(arrayList), null, null, null));
                }
                String string2 = context.getString(R.string.highest_score);
                string2.getClass();
                List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> highestScore = cricketTopPlayerStatistics.getHighestScore();
                if (highestScore != null) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = highestScore.iterator();
                    while (it2.hasNext()) {
                        TopPlayersStatisticsItem topPlayersStatisticsItem2 = (TopPlayersStatisticsItem) it2.next();
                        vnj x2 = ktm.x(context, string2, String.valueOf(((CricketTopPlayersStatisticsItem) topPlayersStatisticsItem2.getStatistics()).getHighestScore()), topPlayersStatisticsItem2, z7);
                        if (x2 != null) {
                            arrayList2.add(x2);
                        }
                    }
                    b2.add(new TopPlayerCategoryUiModel(string2, l6g.W(arrayList2), null, null, null));
                }
                String string3 = context.getString(R.string.cricket_batting_average);
                string3.getClass();
                List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> battingAverage = cricketTopPlayerStatistics.getBattingAverage();
                if (battingAverage != null) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = battingAverage.iterator();
                    while (it3.hasNext()) {
                        TopPlayersStatisticsItem topPlayersStatisticsItem3 = (TopPlayersStatisticsItem) it3.next();
                        vnj x3 = ktm.x(context, string3, rei.b(2, ((CricketTopPlayersStatisticsItem) topPlayersStatisticsItem3.getStatistics()).getBattingAverage()), topPlayersStatisticsItem3, z7);
                        if (x3 != null) {
                            arrayList3.add(x3);
                        }
                    }
                    b2.add(new TopPlayerCategoryUiModel(string3, l6g.W(arrayList3), null, null, null));
                }
                String string4 = context.getString(R.string.cricket_batting_strike_rate);
                string4.getClass();
                List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> battingStrikeRate = cricketTopPlayerStatistics.getBattingStrikeRate();
                if (battingStrikeRate != null) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it4 = battingStrikeRate.iterator();
                    while (it4.hasNext()) {
                        TopPlayersStatisticsItem topPlayersStatisticsItem4 = (TopPlayersStatisticsItem) it4.next();
                        vnj x4 = ktm.x(context, string4, rei.b(2, ((CricketTopPlayersStatisticsItem) topPlayersStatisticsItem4.getStatistics()).getBattingStrikeRate()), topPlayersStatisticsItem4, z7);
                        if (x4 != null) {
                            arrayList4.add(x4);
                        }
                    }
                    b2.add(new TopPlayerCategoryUiModel(string4, l6g.W(arrayList4), null, null, null));
                }
                String string5 = context.getString(R.string.cricket_hundreds);
                string5.getClass();
                List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> hundreds = cricketTopPlayerStatistics.getHundreds();
                if (hundreds != null) {
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it5 = hundreds.iterator();
                    while (it5.hasNext()) {
                        TopPlayersStatisticsItem topPlayersStatisticsItem5 = (TopPlayersStatisticsItem) it5.next();
                        vnj x5 = ktm.x(context, string5, String.valueOf(((CricketTopPlayersStatisticsItem) topPlayersStatisticsItem5.getStatistics()).getHundreds()), topPlayersStatisticsItem5, z7);
                        if (x5 != null) {
                            arrayList5.add(x5);
                        }
                    }
                    b2.add(new TopPlayerCategoryUiModel(string5, l6g.W(arrayList5), null, null, null));
                }
                String string6 = context.getString(R.string.cricket_fifties);
                string6.getClass();
                List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> fifties = cricketTopPlayerStatistics.getFifties();
                if (fifties != null) {
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it6 = fifties.iterator();
                    while (it6.hasNext()) {
                        TopPlayersStatisticsItem topPlayersStatisticsItem6 = (TopPlayersStatisticsItem) it6.next();
                        vnj x6 = ktm.x(context, string6, String.valueOf(((CricketTopPlayersStatisticsItem) topPlayersStatisticsItem6.getStatistics()).getFifties()), topPlayersStatisticsItem6, z7);
                        if (x6 != null) {
                            arrayList6.add(x6);
                        }
                    }
                    b2.add(new TopPlayerCategoryUiModel(string6, l6g.W(arrayList6), null, null, null));
                }
                String string7 = context.getString(R.string.cricket_fours);
                string7.getClass();
                List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> fours = cricketTopPlayerStatistics.getFours();
                if (fours != null) {
                    ArrayList arrayList7 = new ArrayList();
                    Iterator it7 = fours.iterator();
                    while (it7.hasNext()) {
                        TopPlayersStatisticsItem topPlayersStatisticsItem7 = (TopPlayersStatisticsItem) it7.next();
                        vnj x7 = ktm.x(context, string7, String.valueOf(((CricketTopPlayersStatisticsItem) topPlayersStatisticsItem7.getStatistics()).getFours()), topPlayersStatisticsItem7, z7);
                        if (x7 != null) {
                            arrayList7.add(x7);
                        }
                    }
                    b2.add(new TopPlayerCategoryUiModel(string7, l6g.W(arrayList7), null, null, null));
                }
                String string8 = context.getString(R.string.cricket_sixes);
                string8.getClass();
                List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> sixes = cricketTopPlayerStatistics.getSixes();
                if (sixes != null) {
                    ArrayList arrayList8 = new ArrayList();
                    Iterator it8 = sixes.iterator();
                    while (it8.hasNext()) {
                        TopPlayersStatisticsItem topPlayersStatisticsItem8 = (TopPlayersStatisticsItem) it8.next();
                        vnj x8 = ktm.x(context, string8, String.valueOf(((CricketTopPlayersStatisticsItem) topPlayersStatisticsItem8.getStatistics()).getSixes()), topPlayersStatisticsItem8, z7);
                        if (x8 != null) {
                            arrayList8.add(x8);
                        }
                    }
                    b2.add(new TopPlayerCategoryUiModel(string8, l6g.W(arrayList8), null, null, null));
                }
                String string9 = context.getString(R.string.cricket_nineties);
                string9.getClass();
                List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> nineties = cricketTopPlayerStatistics.getNineties();
                if (nineties != null) {
                    ArrayList arrayList9 = new ArrayList();
                    Iterator it9 = nineties.iterator();
                    while (it9.hasNext()) {
                        TopPlayersStatisticsItem topPlayersStatisticsItem9 = (TopPlayersStatisticsItem) it9.next();
                        vnj x9 = ktm.x(context, string9, String.valueOf(((CricketTopPlayersStatisticsItem) topPlayersStatisticsItem9.getStatistics()).getNineties()), topPlayersStatisticsItem9, z7);
                        if (x9 != null) {
                            arrayList9.add(x9);
                        }
                    }
                    b2.add(new TopPlayerCategoryUiModel(string9, l6g.W(arrayList9), null, null, null));
                }
                a = a.a(b2);
            } else {
                if (ordinal != 1) {
                    zzl.b();
                    return null;
                }
                xbb b3 = a.b();
                String string10 = context.getString(R.string.cricket_wickets);
                string10.getClass();
                List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> wickets = cricketTopPlayerStatistics.getWickets();
                if (wickets != null) {
                    ArrayList arrayList10 = new ArrayList();
                    Iterator it10 = wickets.iterator();
                    while (it10.hasNext()) {
                        TopPlayersStatisticsItem topPlayersStatisticsItem10 = (TopPlayersStatisticsItem) it10.next();
                        vnj x10 = ktm.x(context, string10, String.valueOf(((CricketTopPlayersStatisticsItem) topPlayersStatisticsItem10.getStatistics()).getWickets()), topPlayersStatisticsItem10, z7);
                        if (x10 != null) {
                            arrayList10.add(x10);
                        }
                    }
                    b3.add(new TopPlayerCategoryUiModel(string10, l6g.W(arrayList10), null, null, null));
                }
                String string11 = context.getString(R.string.cricket_bowling_average);
                string11.getClass();
                List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> bowlingAverage = cricketTopPlayerStatistics.getBowlingAverage();
                if (bowlingAverage != null) {
                    ArrayList arrayList11 = new ArrayList();
                    Iterator it11 = bowlingAverage.iterator();
                    while (it11.hasNext()) {
                        TopPlayersStatisticsItem topPlayersStatisticsItem11 = (TopPlayersStatisticsItem) it11.next();
                        vnj x11 = ktm.x(context, string11, rei.b(2, ((CricketTopPlayersStatisticsItem) topPlayersStatisticsItem11.getStatistics()).getBowlingAverage()), topPlayersStatisticsItem11, z7);
                        if (x11 != null) {
                            arrayList11.add(x11);
                        }
                    }
                    b3.add(new TopPlayerCategoryUiModel(string11, l6g.W(arrayList11), null, null, null));
                }
                String string12 = context.getString(R.string.best_bowling_figures);
                string12.getClass();
                List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> bowling = cricketTopPlayerStatistics.getBowling();
                if (bowling != null) {
                    ArrayList arrayList12 = new ArrayList();
                    Iterator it12 = bowling.iterator();
                    while (it12.hasNext()) {
                        TopPlayersStatisticsItem topPlayersStatisticsItem12 = (TopPlayersStatisticsItem) it12.next();
                        vnj x12 = ktm.x(context, string12, String.valueOf(((CricketTopPlayersStatisticsItem) topPlayersStatisticsItem12.getStatistics()).getBowling()), topPlayersStatisticsItem12, z7);
                        if (x12 != null) {
                            arrayList12.add(x12);
                        }
                    }
                    b3.add(new TopPlayerCategoryUiModel(string12, l6g.W(arrayList12), null, null, null));
                }
                String string13 = context.getString(R.string.cricket_five_wicket_hauls);
                string13.getClass();
                List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> fiveWicketsHaul = cricketTopPlayerStatistics.getFiveWicketsHaul();
                if (fiveWicketsHaul != null) {
                    ArrayList arrayList13 = new ArrayList();
                    Iterator it13 = fiveWicketsHaul.iterator();
                    while (it13.hasNext()) {
                        TopPlayersStatisticsItem topPlayersStatisticsItem13 = (TopPlayersStatisticsItem) it13.next();
                        vnj x13 = ktm.x(context, string13, String.valueOf(((CricketTopPlayersStatisticsItem) topPlayersStatisticsItem13.getStatistics()).getFiveWicketsHaul()), topPlayersStatisticsItem13, z7);
                        if (x13 != null) {
                            arrayList13.add(x13);
                        }
                    }
                    b3.add(new TopPlayerCategoryUiModel(string13, l6g.W(arrayList13), null, null, null));
                }
                String string14 = context.getString(R.string.cricket_economy_rate);
                string14.getClass();
                List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> economy = cricketTopPlayerStatistics.getEconomy();
                if (economy != null) {
                    ArrayList arrayList14 = new ArrayList();
                    Iterator it14 = economy.iterator();
                    while (it14.hasNext()) {
                        TopPlayersStatisticsItem topPlayersStatisticsItem14 = (TopPlayersStatisticsItem) it14.next();
                        vnj x14 = ktm.x(context, string14, rei.b(2, ((CricketTopPlayersStatisticsItem) topPlayersStatisticsItem14.getStatistics()).getEconomy()), topPlayersStatisticsItem14, z7);
                        if (x14 != null) {
                            arrayList14.add(x14);
                        }
                    }
                    b3.add(new TopPlayerCategoryUiModel(string14, l6g.W(arrayList14), null, null, null));
                }
                String string15 = context.getString(R.string.cricket_bowling_strike_rate);
                string15.getClass();
                List<TopPlayersStatisticsItem<CricketTopPlayersStatisticsItem>> bowlingStrikeRate = cricketTopPlayerStatistics.getBowlingStrikeRate();
                if (bowlingStrikeRate != null) {
                    ArrayList arrayList15 = new ArrayList();
                    Iterator it15 = bowlingStrikeRate.iterator();
                    while (it15.hasNext()) {
                        TopPlayersStatisticsItem topPlayersStatisticsItem15 = (TopPlayersStatisticsItem) it15.next();
                        vnj x15 = ktm.x(context, string15, rei.b(2, ((CricketTopPlayersStatisticsItem) topPlayersStatisticsItem15.getStatistics()).getBowlingStrikeRate()), topPlayersStatisticsItem15, z7);
                        if (x15 != null) {
                            arrayList15.add(x15);
                        }
                    }
                    b3.add(new TopPlayerCategoryUiModel(string15, l6g.W(arrayList15), null, null, null));
                }
                a = a.a(b3);
            }
            gv9 W = l6g.W(a);
            if (W != null) {
                return W;
            }
        }
        return rlh.b;
    }

    public static final boolean G(ArrayList arrayList, ArrayList arrayList2) {
        if (!cw3.a.contains(zic.class)) {
            try {
                arrayList.getClass();
                arrayList2.getClass();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    zic zicVar = b;
                    if (!cw3.a.contains(zicVar)) {
                        try {
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                if (StringsKt.J(str, (String) it2.next(), false)) {
                                    return true;
                                }
                            }
                        } catch (Throwable th) {
                            cw3.a(zicVar, th);
                        }
                    }
                }
            } catch (Throwable th2) {
                cw3.a(zic.class, th2);
                return false;
            }
        }
        return false;
    }

    public static xsd H(int i2) {
        Object obj;
        Iterator<E> it = xsd.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((xsd) obj).a == i2) {
                break;
            }
        }
        xsd xsdVar = (xsd) obj;
        return xsdVar == null ? xsd.d : xsdVar;
    }

    public static void I(Context context, Player player) {
        String Q;
        AlertDialog h2 = lnb.h(R.style.RedesignDialog, context);
        e92 g2 = e92.g(LayoutInflater.from(context));
        as9.l((ImageView) g2.c, player.getId(), null);
        ((TextView) g2.b).setText(tba.t(player));
        TextView textView = (TextView) g2.f;
        Q = hkg.Q(context, R.string.following_text_player, player.getGender(), new Object[0]);
        textView.setText(Q);
        int i2 = 5;
        ((MaterialCheckBox) g2.d).setOnCheckedChangeListener(new rn(context, i2));
        h2.setCanceledOnTouchOutside(false);
        h2.setView((ConstraintLayout) g2.e);
        h2.setButton(-1, context.getString(R.string.ok), new on(5));
        h2.setButton(-3, context.getString(R.string.action_settings), new mn(context, i2));
        FragmentActivity K = hkg.K(context);
        if (K == null || K.isFinishing()) {
            return;
        }
        h2.show();
    }

    public static void J(Context context) {
        AlertDialog h2 = lnb.h(R.style.RedesignDialog, context);
        ez0 e2 = ez0.e(LayoutInflater.from(context));
        ((TextView) e2.e).setText(context.getString(R.string.prediction_notifications_popup_title));
        ((TextView) e2.d).setText(context.getString(R.string.prediction_notifications_popup_text));
        ((MaterialCheckBox) e2.c).setOnCheckedChangeListener(new rn(context, 8));
        h2.setCanceledOnTouchOutside(false);
        h2.setView((ScrollView) e2.b);
        h2.setButton(-1, context.getString(R.string.ok), new on(8));
        h2.setButton(-3, context.getString(R.string.action_settings), new mn(context, 10));
        h2.show();
    }

    public static void K(Activity activity, boolean z) {
        Context applicationContext = activity.getApplicationContext();
        applicationContext.getClass();
        bv bvVar = bv.GOOGLE_PRIVACY_POLICY;
        av avVar = av.CTA_CLICK;
        dv dvVar = z ? dv.POPUP_QUEUE : dv.OTHER;
        m38 m2 = m(activity, 1);
        m38 m38Var = m38.a;
        nv.k0(applicationContext, bvVar, avVar, dvVar, (m2 == m38Var && m(activity, 1, 7) == m38Var && m(activity, 3, 4) == m38Var) ? cv.ACCEPT : cv.REJECT, null, 32);
    }

    public static void M(FragmentActivity fragmentActivity, int i2) {
        boolean z = (i2 & 2) == 0;
        fragmentActivity.getClass();
        if (f) {
            return;
        }
        it7 it7Var = new it7(19);
        zzj b2 = zza.a(fragmentActivity).b();
        if (!b2.a() || z) {
            if (b2.c.c.get() != null) {
                D(fragmentActivity, z);
            } else {
                b2.b(fragmentActivity, it7Var, new lt4(b2, fragmentActivity, z), new pvd(10));
            }
        }
    }

    public static void N(Context context, final Function0 function0, final ir2 ir2Var) {
        context.getClass();
        AlertDialog create = new AlertDialog.Builder(context, R.style.RedesignDialog_BottomButtonsStyle).create();
        final int i2 = 0;
        View inflate = LayoutInflater.from(context).inflate(R.layout.dialog_chat_rules, (ViewGroup) null, false);
        TextView textView = (TextView) nq8.B(R.id.chat_rules_bullets, inflate);
        if (textView == null) {
            yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.chat_rules_bullets)));
            return;
        }
        ScrollView scrollView = (ScrollView) inflate;
        List j2 = b.j(context.getString(R.string.chat_rules_no_insults), context.getString(R.string.chat_rules_no_fake_scores_spam), context.getString(R.string.chat_rules_no_ads));
        int s = ao2.s(2, context);
        int s2 = ao2.s(8, context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Iterator it = j2.iterator();
        int i3 = 0;
        while (true) {
            final int i4 = 1;
            if (!it.hasNext()) {
                textView.setText(spannableStringBuilder);
                create.setCancelable(false);
                create.setView(scrollView);
                create.setButton(-1, context.getString(R.string.agree), new DialogInterface.OnClickListener() { // from class: kn
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i5) {
                        int i6 = i2;
                        Function0 function02 = function0;
                        switch (i6) {
                            case 0:
                                function02.invoke();
                                break;
                            default:
                                if (function02 != null) {
                                    function02.invoke();
                                    break;
                                }
                                break;
                        }
                    }
                });
                create.setButton(-2, context.getString(R.string.button_not_now), new DialogInterface.OnClickListener() { // from class: kn
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i5) {
                        int i6 = i4;
                        Function0 function02 = ir2Var;
                        switch (i6) {
                            case 0:
                                function02.invoke();
                                break;
                            default:
                                if (function02 != null) {
                                    function02.invoke();
                                    break;
                                }
                                break;
                        }
                    }
                });
                create.show();
                create.getButton(-1).setTextColor(ColorStateList.valueOf(context.getColor(R.color.surface_1)));
                Button button = create.getButton(-2);
                button.setTextColor(ColorStateList.valueOf(context.getColor(R.color.primary_default)));
                button.setBackgroundColor(context.getColor(android.R.color.transparent));
                return;
            }
            Object next = it.next();
            int i5 = i3 + 1;
            if (i3 < 0) {
                b.q();
                throw null;
            }
            String y = dmi.y((String) next, i3 < j2.size() - 1 ? "\n" : "");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) y);
            spannableStringBuilder.setSpan(new w62(s, s2), length, y.length() + length, 33);
            i3 = i5;
        }
    }

    public static void O(Context context, String str, String str2, String str3, int i2, String str4, Function0 function0) {
        context.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        AlertDialog h2 = lnb.h(R.style.RedesignDialog, context);
        z82 f2 = z82.f(LayoutInflater.from(context));
        TextView textView = (TextView) f2.d;
        MaterialButton materialButton = (MaterialButton) f2.c;
        MaterialButton materialButton2 = (MaterialButton) f2.f;
        TextView textView2 = (TextView) f2.g;
        mqi mqiVar = qhi.a;
        textView2.setText(qhi.a(str));
        ((TextView) f2.e).setText(qhi.a(str2));
        if (str4 != null) {
            textView.setVisibility(0);
            textView.setText(qhi.a(str4));
        }
        Locale locale = Locale.ROOT;
        String upperCase = str3.toUpperCase(locale);
        upperCase.getClass();
        materialButton2.setText(upperCase);
        z8e.V(context.getColor(i2), materialButton2);
        materialButton2.setOnClickListener(new cn(h2, function0));
        String string = context.getString(R.string.cancel);
        string.getClass();
        String upperCase2 = string.toUpperCase(locale);
        upperCase2.getClass();
        materialButton.setText(upperCase2);
        aba.y(materialButton, 0, 3);
        materialButton.setOnClickListener(new wn(h2, 0));
        h2.setView((ConstraintLayout) f2.b);
        h2.show();
    }

    public static void P(Context context, int i2, int i3, int i4, Function0 function0, int i5) {
        int i6 = (i5 & 16) != 0 ? R.color.primary_default : R.color.error;
        context.getClass();
        String string = context.getString(i2);
        string.getClass();
        String string2 = context.getString(i3);
        string2.getClass();
        String string3 = context.getString(i4);
        string3.getClass();
        O(context, string, string2, string3, i6, null, function0);
    }

    public static void Q(final Context context, final int i2, final String str) {
        context.getClass();
        str.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences = a5f.d(applicationContext);
                uic.j = sharedPreferences;
            }
            sharedPreferences.getClass();
        }
        if (sharedPreferences.getBoolean("PREF_SHOW_FOLLOW_TEAM_DIALOG", true)) {
            if (B(context)) {
                E(context, new DialogInterface.OnClickListener() { // from class: qn
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        zic.r(context, i2, str);
                    }
                });
            } else {
                r(context, i2, str);
            }
        }
    }

    public static final void R(final Context context, final String str, final String str2, final int i2) {
        context.getClass();
        str.getClass();
        str2.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences = a5f.d(applicationContext);
                uic.j = sharedPreferences;
            }
            sharedPreferences.getClass();
        }
        if (sharedPreferences.getBoolean("PREF_SHOW_FOLLOW_LEAGUE_DIALOG", true)) {
            if (B(context)) {
                E(context, new DialogInterface.OnClickListener() { // from class: ln
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        zic.C(context, str, str2, i2);
                    }
                });
            } else {
                C(context, str, str2, i2);
            }
        }
    }

    public static final void S(Context context, Player player) {
        context.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences = a5f.d(applicationContext);
                uic.j = sharedPreferences;
            }
            sharedPreferences.getClass();
        }
        if (sharedPreferences.getBoolean("PREF_SHOW_FOLLOW_PLAYER_DIALOG", true)) {
            if (B(context)) {
                E(context, new h0(5, context, player));
            } else {
                I(context, player);
            }
        }
    }

    public static final void T(Context context, Team team) {
        context.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences = a5f.d(applicationContext);
                uic.j = sharedPreferences;
            }
            sharedPreferences.getClass();
        }
        if (sharedPreferences.getBoolean("PREF_SHOW_FOLLOW_TEAM_DIALOG", true)) {
            if (B(context)) {
                E(context, new h0(3, context, team));
            } else {
                Z(context, team);
            }
        }
    }

    public static void U(Context context, String str, String str2) {
        String string = context.getString(R.string.close_window_button);
        string.getClass();
        context.getClass();
        str.getClass();
        str2.getClass();
        AlertDialog h2 = lnb.h(R.style.RedesignDialog, context);
        h04 b2 = h04.b(LayoutInflater.from(context));
        b2.d.setText(qhi.a(str));
        b2.c.setText(qhi.a(str2));
        h2.setView(b2.b);
        h2.setButton(-2, string, new i0(h2, 5));
        h2.show();
    }

    public static void V(Context context, final Function2 function2) {
        SharedPreferences d2;
        n9e.u(context, new vt(context, 14));
        final AlertDialog create = new AlertDialog.Builder(context, R.style.RedesignDialog).create();
        final int i2 = 0;
        View inflate = LayoutInflater.from(context).inflate(R.layout.dialog_screenshot_detected, (ViewGroup) null, false);
        int i3 = R.id.button_close;
        TextView textView = (TextView) nq8.B(R.id.button_close, inflate);
        if (textView != null) {
            i3 = R.id.button_share;
            MaterialButton materialButton = (MaterialButton) nq8.B(R.id.button_share, inflate);
            if (materialButton != null) {
                i3 = R.id.do_not_show_again_checkbox;
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) nq8.B(R.id.do_not_show_again_checkbox, inflate);
                if (materialCheckBox != null) {
                    i3 = R.id.image_screenshot_detected;
                    if (((ImageView) nq8.B(R.id.image_screenshot_detected, inflate)) != null) {
                        i3 = R.id.text_body;
                        TextView textView2 = (TextView) nq8.B(R.id.text_body, inflate);
                        if (textView2 != null) {
                            i3 = R.id.text_subtitle;
                            if (((TextView) nq8.B(R.id.text_subtitle, inflate)) != null) {
                                i3 = R.id.text_title;
                                if (((TextView) nq8.B(R.id.text_title, inflate)) != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                    final ed edVar = new ed(constraintLayout, textView, materialButton, materialCheckBox, textView2);
                                    String string = context.getString(R.string.share_details_body, "#ICONHERE#");
                                    string.getClass();
                                    SpannableString spannableString = new SpannableString(string);
                                    Drawable drawable = context.getDrawable(R.drawable.ic_menu_list_share);
                                    if (drawable != null) {
                                        Drawable mutate = drawable.mutate();
                                        v9g.K(mutate, context.getColor(R.color.primary_default));
                                        mutate.setBounds(0, 0, ao2.s(16, context), ao2.s(16, context));
                                        ImageSpan imageSpan = Build.VERSION.SDK_INT >= 29 ? new ImageSpan(drawable, 2) : new ImageSpan(drawable);
                                        int P = StringsKt.P(string, "#ICONHERE#", 0, false, 6);
                                        spannableString.setSpan(imageSpan, P, P + 10, 0);
                                    }
                                    textView2.setText(spannableString);
                                    SharedPreferences sharedPreferences = uic.j;
                                    if (sharedPreferences == null) {
                                        Context applicationContext = context.getApplicationContext();
                                        synchronized (uic.i) {
                                            d2 = a5f.d(applicationContext);
                                            uic.j = d2;
                                        }
                                        d2.getClass();
                                        sharedPreferences = d2;
                                    }
                                    materialCheckBox.setVisibility(sharedPreferences.getInt("PREF_SCREENSHOT_COUNTER", 0) >= 4 ? 0 : 8);
                                    textView.setOnClickListener(new View.OnClickListener() { // from class: un
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            int i4 = i2;
                                            AlertDialog alertDialog = create;
                                            ed edVar2 = edVar;
                                            Function2 function22 = function2;
                                            switch (i4) {
                                                case 0:
                                                    function22.invoke(Boolean.FALSE, Boolean.valueOf(((MaterialCheckBox) edVar2.c).isChecked()));
                                                    alertDialog.dismiss();
                                                    break;
                                                default:
                                                    function22.invoke(Boolean.TRUE, Boolean.valueOf(((MaterialCheckBox) edVar2.c).isChecked()));
                                                    alertDialog.dismiss();
                                                    break;
                                            }
                                        }
                                    });
                                    final int i4 = 1;
                                    materialButton.setOnClickListener(new View.OnClickListener() { // from class: un
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            int i42 = i4;
                                            AlertDialog alertDialog = create;
                                            ed edVar2 = edVar;
                                            Function2 function22 = function2;
                                            switch (i42) {
                                                case 0:
                                                    function22.invoke(Boolean.FALSE, Boolean.valueOf(((MaterialCheckBox) edVar2.c).isChecked()));
                                                    alertDialog.dismiss();
                                                    break;
                                                default:
                                                    function22.invoke(Boolean.TRUE, Boolean.valueOf(((MaterialCheckBox) edVar2.c).isChecked()));
                                                    alertDialog.dismiss();
                                                    break;
                                            }
                                        }
                                    });
                                    create.setOnDismissListener(new vn(0, function2, edVar));
                                    create.setView(constraintLayout);
                                    create.show();
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
    }

    public static final void W(Context context) {
        context.getClass();
        if (B(context)) {
            E(context, new mn(context, 1));
        } else {
            Y(context);
        }
    }

    public static void X(Context context, Function0 function0) {
        context.getClass();
        AlertDialog create = new AlertDialog.Builder(context, R.style.RedesignDialog).create();
        h04 b2 = h04.b(LayoutInflater.from(context));
        b2.d.setText(context.getString(R.string.change_vote_text));
        b2.c.setText(context.getString(R.string.change_vote_watch_ad));
        create.setView(b2.b);
        create.setButton(-1, context.getString(R.string.uninstall_popup_button_continue), new h0(8, function0, create));
        create.setButton(-2, context.getString(R.string.cancel), new i0(create, 7));
        create.show();
    }

    public static void Y(Context context) {
        AlertDialog h2 = lnb.h(R.style.RedesignDialog, context);
        ez0 e2 = ez0.e(LayoutInflater.from(context));
        ((TextView) e2.d).setText(context.getString(R.string.following_text_stage));
        int i2 = 4;
        ((MaterialCheckBox) e2.c).setOnCheckedChangeListener(new rn(context, i2));
        h2.setCanceledOnTouchOutside(false);
        h2.setView((ScrollView) e2.b);
        h2.setButton(-1, context.getString(R.string.ok), new on(4));
        h2.setButton(-3, context.getString(R.string.action_settings), new mn(context, i2));
        FragmentActivity K = hkg.K(context);
        if (K == null || K.isFinishing()) {
            return;
        }
        h2.show();
    }

    public static void Z(Context context, Team team) {
        String Q;
        AlertDialog h2 = lnb.h(R.style.RedesignDialog, context);
        Set set = wyh.a;
        String A = wyh.e(team.getSportSlug()) ? tba.A(context, team) : tba.p(context, team);
        e92 g2 = e92.g(LayoutInflater.from(context));
        TextView textView = (TextView) g2.b;
        context.getClass();
        textView.setText(tv3.c(context, A));
        TextView textView2 = (TextView) g2.f;
        if (wyh.m(team.getSportSlug())) {
            joa joaVar = l5i.a;
            Q = team.getType() == 0 ? context.getString(R.string.following_text_team_general) : l5i.h(team) ? hkg.Q(context, R.string.following_text_rider, team.getGender(), new Object[0]) : hkg.Q(context, R.string.following_text_driver, team.getGender(), new Object[0]);
        } else {
            Q = team.getType() == 1 ? Intrinsics.c(team.getSportSlug(), Sports.MMA) ? hkg.Q(context, R.string.mma_receiving_notifications_fighter, team.getGender(), new Object[0]) : hkg.Q(context, R.string.following_text_player, team.getGender(), new Object[0]) : context.getString(R.string.following_text_team);
        }
        textView2.setText(Q);
        as9.o((ImageView) g2.c, team.getId());
        ((MaterialCheckBox) g2.d).setOnCheckedChangeListener(new rn(context, 7));
        h2.setCanceledOnTouchOutside(false);
        h2.setView((ConstraintLayout) g2.e);
        h2.setButton(-1, context.getString(R.string.ok), new on(7));
        h2.setButton(-3, context.getString(R.string.action_settings), new mn(context, 8));
        FragmentActivity K = hkg.K(context);
        if (K == null || K.isFinishing()) {
            return;
        }
        h2.show();
    }

    public static void a0(Context context, UniqueStage uniqueStage) {
        AlertDialog h2 = lnb.h(R.style.RedesignDialog, context);
        e92 g2 = e92.g(LayoutInflater.from(context));
        ((TextView) g2.b).setText(uniqueStage.getName());
        ((TextView) g2.f).setText(context.getString(Intrinsics.c(uniqueStage.getCategory().getSport().getSlug(), Sports.CYCLING) ? R.string.following_text_cycling : R.string.following_text_motorsport));
        as9.b((ImageView) g2.c, Integer.valueOf(uniqueStage.getCategory().getId()), null);
        ((MaterialCheckBox) g2.d).setOnCheckedChangeListener(new rn(context, 1));
        h2.setCanceledOnTouchOutside(false);
        h2.setView((ConstraintLayout) g2.e);
        h2.setButton(-1, context.getString(R.string.ok), new on(1));
        h2.setButton(-3, context.getString(R.string.action_settings), new mn(context, 2));
        FragmentActivity K = hkg.K(context);
        if (K == null || K.isFinishing()) {
            return;
        }
        h2.show();
    }

    public static void l(Context context, x90 x90Var, Function0 function0) {
        SharedPreferences d2;
        x90Var.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                d2 = a5f.d(applicationContext);
                uic.j = d2;
            }
            d2.getClass();
            sharedPreferences = d2;
        }
        String string = sharedPreferences.getString(AndroidTcfDataSource.TCF_TCSTRING_KEY, null);
        int i2 = sharedPreferences.getInt("IABTCF_gdprApplies", -1);
        if (i2 == 1 && string != null) {
            function0.invoke();
        } else if (i2 == 0) {
            function0.invoke();
        }
        sharedPreferences.registerOnSharedPreferenceChangeListener(x90Var);
    }

    public static m38 m(Context context, int... iArr) {
        SharedPreferences d2;
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences = a5f.d(applicationContext);
                uic.j = sharedPreferences;
            }
            sharedPreferences.getClass();
        }
        int i2 = sharedPreferences.getInt("IABTCF_gdprApplies", -1);
        SharedPreferences sharedPreferences2 = uic.j;
        if (sharedPreferences2 == null) {
            Context applicationContext2 = context.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences2 = a5f.d(applicationContext2);
                uic.j = sharedPreferences2;
            }
            sharedPreferences2.getClass();
        }
        String string = sharedPreferences2.getString("IABTCF_PurposeConsents", null);
        SharedPreferences sharedPreferences3 = uic.j;
        if (sharedPreferences3 == null) {
            Context applicationContext3 = context.getApplicationContext();
            synchronized (uic.i) {
                d2 = a5f.d(applicationContext3);
                uic.j = d2;
            }
            d2.getClass();
            sharedPreferences3 = d2;
        }
        String string2 = sharedPreferences3.getString("IABTCF_PurposeLegitimateInterests", null);
        if (i2 == 1) {
            for (int i3 : iArr) {
                int i4 = i3 - 1;
                Character F = string != null ? iii.F(i4, string) : null;
                Character F2 = string2 != null ? iii.F(i4, string2) : null;
                if ((F == null || F.charValue() != '1') && (F2 == null || F2.charValue() != '1')) {
                    return m38.b;
                }
            }
        }
        return m38.a;
    }

    public static rse p(s67 s67Var, Function0 function0, s67 s67Var2, Function0 function02, int i2) {
        s67 s67Var3 = (i2 & 4) != 0 ? null : s67Var2;
        if ((i2 & 8) != 0) {
            function02 = null;
        }
        if (s67Var == null && s67Var3 == null) {
            return null;
        }
        return new rse(s67Var, s67Var3, null, s67Var != null ? function0 : null, (function02 == null || s67Var3 == null) ? null : function02, null);
    }

    public static final void q(Context context) {
        context.getClass();
        if (B(context)) {
            E(context, new mn(context, 0));
        } else {
            t(context);
        }
    }

    public static void r(Context context, int i2, String str) {
        AlertDialog h2 = lnb.h(R.style.RedesignDialog, context);
        e92 g2 = e92.g(LayoutInflater.from(context));
        TextView textView = (TextView) g2.b;
        context.getClass();
        textView.setText(tv3.c(context, str));
        ((TextView) g2.f).setText(context.getString(R.string.following_text_team));
        as9.o((ImageView) g2.c, i2);
        ((MaterialCheckBox) g2.d).setOnCheckedChangeListener(new rn(context, 2));
        h2.setCanceledOnTouchOutside(false);
        h2.setView((ConstraintLayout) g2.e);
        h2.setButton(-1, context.getString(R.string.ok), new on(3));
        h2.setButton(-3, context.getString(R.string.action_settings), new mn(context, 7));
        FragmentActivity K = hkg.K(context);
        if (K == null || K.isFinishing()) {
            return;
        }
        h2.show();
    }

    public static void t(Context context) {
        AlertDialog h2 = lnb.h(R.style.RedesignDialog, context);
        ez0 e2 = ez0.e(LayoutInflater.from(context));
        ((TextView) e2.d).setText(context.getString(R.string.following_text_event));
        int i2 = 6;
        ((MaterialCheckBox) e2.c).setOnCheckedChangeListener(new rn(context, i2));
        h2.setCanceledOnTouchOutside(false);
        h2.setView((ScrollView) e2.b);
        h2.setButton(-1, context.getString(R.string.ok), new on(6));
        h2.setButton(-3, context.getString(R.string.action_settings), new mn(context, i2));
        FragmentActivity K = hkg.K(context);
        if (K == null || K.isFinishing()) {
            return;
        }
        h2.show();
    }

    public static int u(ia0 ia0Var) {
        SharedPreferences d2;
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = ia0Var.getApplicationContext();
            synchronized (uic.i) {
                d2 = a5f.d(applicationContext);
                uic.j = d2;
            }
            d2.getClass();
            sharedPreferences = d2;
        }
        return sharedPreferences.getInt("IABTCF_gdprApplies", 0);
    }

    public static ad7 v(String str) {
        if (str == null) {
            return null;
        }
        int hashCode = str.hashCode();
        if (hashCode == -1897185137) {
            if (str.equals("starter")) {
                return ad7.b;
            }
            return null;
        }
        if (hashCode == -741038950) {
            if (str.equals("substitute")) {
                return ad7.c;
            }
            return null;
        }
        if (hashCode == 694537154 && str.equals("notInSquad")) {
            return ad7.d;
        }
        return null;
    }

    public static final ArrayList w(View view) {
        if (cw3.a.contains(zic.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            ViewGroup i2 = xsk.i(view);
            if (i2 != null) {
                Iterator it = xsk.b(i2).iterator();
                while (it.hasNext()) {
                    View view2 = (View) it.next();
                    if (view != view2) {
                        arrayList.addAll(b.y(view2));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            cw3.a(zic.class, th);
            return null;
        }
    }

    public static final ArrayList x(View view) {
        if (cw3.a.contains(zic.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(xsk.h(view));
            Object tag = view.getTag();
            if (tag != null) {
                arrayList.add(tag.toString());
            }
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                arrayList.add(contentDescription.toString());
            }
            try {
                if (view.getId() != -1) {
                    String resourceName = view.getResources().getResourceName(view.getId());
                    resourceName.getClass();
                    String[] strArr = (String[]) new Regex("/").h(resourceName).toArray(new String[0]);
                    if (strArr.length == 2) {
                        arrayList.add(strArr[1]);
                    }
                }
            } catch (Resources.NotFoundException unused) {
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str.length() > 0 && str.length() <= 100) {
                    String lowerCase = str.toLowerCase();
                    lowerCase.getClass();
                    arrayList2.add(lowerCase);
                }
            }
            return arrayList2;
        } catch (Throwable th) {
            cw3.a(zic.class, th);
            return null;
        }
    }

    public static boolean z(ia0 ia0Var) {
        return m(ia0Var, 1, 3, 4, 7) == m38.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object L(Context context, Bitmap bitmap, String str, sq3 sq3Var) {
        tch tchVar;
        int i2;
        Uri uri;
        if (sq3Var instanceof tch) {
            tchVar = (tch) sq3Var;
            int i3 = tchVar.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tchVar.v = i3 - Integer.MIN_VALUE;
                Object obj = tchVar.t;
                lu3 lu3Var = lu3.a;
                i2 = tchVar.v;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    tchVar.r = context;
                    tchVar.s = str;
                    tchVar.v = 1;
                    hs4 hs4Var = z45.a;
                    obj = xw3.R(hq4.c, new k50(context, bitmap, rq3Var, 25), tchVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = tchVar.s;
                    context = tchVar.r;
                    y6a.M(obj);
                }
                uri = (Uri) obj;
                if (uri != null) {
                    context.getClass();
                    str.getClass();
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("image/*");
                    intent.setFlags(1);
                    intent.setClipData(new ClipData(str, new String[]{"image/*"}, new ClipData.Item(uri)));
                    intent.putExtra("android.intent.extra.STREAM", uri);
                    intent.putExtra("android.intent.extra.TEXT", str);
                    context.startActivity(Intent.createChooser(intent, str));
                }
                return Unit.a;
            }
        }
        tchVar = new tch(this, sq3Var);
        Object obj2 = tchVar.t;
        lu3 lu3Var2 = lu3.a;
        i2 = tchVar.v;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        uri = (Uri) obj2;
        if (uri != null) {
        }
        return Unit.a;
    }

    @Override // defpackage.eni
    public fni a(ge6 ge6Var) {
        return new xr8((Context) ge6Var.c, (String) ge6Var.d, (ffb) ge6Var.e, ge6Var.a, ge6Var.b);
    }

    @Override // defpackage.pg0
    public void b(kx4 kx4Var, int i2, int[] iArr, int[] iArr2) {
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

    @Override // defpackage.sm6
    public Object c() {
        return new mib();
    }

    @Override // defpackage.kic
    public String d(Object obj) {
        Long l2 = (Long) obj;
        if (l2.longValue() < 0) {
            a70.p("Timeout too small");
            return null;
        }
        if (l2.longValue() < 100000000) {
            return l2 + C4427z5.q;
        }
        if (l2.longValue() < 100000000000L) {
            return (l2.longValue() / 1000) + "u";
        }
        if (l2.longValue() < 100000000000000L) {
            return (l2.longValue() / 1000000) + InneractiveMediationDefs.GENDER_MALE;
        }
        if (l2.longValue() < 100000000000000000L) {
            return (l2.longValue() / 1000000000) + PlayerKt.VOLLEYBALL_SETTER;
        }
        if (l2.longValue() < 6000000000000000000L) {
            return (l2.longValue() / 60000000000L) + PlayerKt.FOOTBALL_MIDFIELDER;
        }
        return (l2.longValue() / 3600000000000L) + "H";
    }

    @Override // defpackage.xli
    public int f(androidx.media3.common.b bVar) {
        String str = bVar.o;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        a70.p(dmi.q("Unsupported MIME type: ", str));
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.xli
    public zli g(androidx.media3.common.b bVar) {
        char c2;
        String str = bVar.o;
        List list = bVar.r;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals(MimeTypes.APPLICATION_DVBSUBS)) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1248334819:
                    if (str.equals(MimeTypes.APPLICATION_PGS)) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1026075066:
                    if (str.equals(MimeTypes.APPLICATION_MP4VTT)) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1004728940:
                    if (str.equals(MimeTypes.TEXT_VTT)) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 691401887:
                    if (str.equals(MimeTypes.APPLICATION_TX3G)) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 822864842:
                    if (str.equals(MimeTypes.TEXT_SSA)) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1157994102:
                    if (str.equals(MimeTypes.APPLICATION_VOBSUB)) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1668750253:
                    if (str.equals(MimeTypes.APPLICATION_SUBRIP)) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1693976202:
                    if (str.equals(MimeTypes.APPLICATION_TTML)) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    return new r18(list);
                case 1:
                    return new g7h(15);
                case 2:
                    return new bka(6);
                case 3:
                    return new c0l(1);
                case 4:
                    y25 y25Var = new y25();
                    y25Var.g = new j9e();
                    int size = list.size();
                    String str2 = C.SANS_SERIF_NAME;
                    if (size == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
                        byte[] bArr = (byte[]) list.get(0);
                        y25Var.b = bArr[24];
                        y25Var.c = ((bArr[26] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[27] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[28] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[29] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                        if ("Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8))) {
                            str2 = C.SERIF_NAME;
                        }
                        y25Var.d = str2;
                        int i2 = bArr[25] * 20;
                        y25Var.f = i2;
                        boolean z = (bArr[0] & 32) != 0;
                        y25Var.a = z;
                        if (z) {
                            y25Var.e = nik.i(((bArr[11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8)) / i2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.95f);
                        } else {
                            y25Var.e = 0.85f;
                        }
                    } else {
                        y25Var.b = 0;
                        y25Var.c = -1;
                        y25Var.d = C.SANS_SERIF_NAME;
                        y25Var.a = false;
                        y25Var.e = 0.85f;
                        y25Var.f = -1;
                    }
                    return y25Var;
                case 5:
                    return new p0i(list);
                case 6:
                    return new lwk(list);
                case 7:
                    return new cki();
                case '\b':
                    return new i2k();
            }
        }
        a70.p(dmi.q("Unsupported MIME type: ", str));
        return null;
    }

    @Override // defpackage.aki
    public void h(zji zjiVar) {
        zjiVar.clear();
    }

    @Override // defpackage.xli
    public boolean i(androidx.media3.common.b bVar) {
        String str = bVar.o;
        return Objects.equals(str, MimeTypes.TEXT_SSA) || Objects.equals(str, MimeTypes.TEXT_VTT) || Objects.equals(str, MimeTypes.APPLICATION_MP4VTT) || Objects.equals(str, MimeTypes.APPLICATION_SUBRIP) || Objects.equals(str, MimeTypes.APPLICATION_TX3G) || Objects.equals(str, MimeTypes.APPLICATION_PGS) || Objects.equals(str, MimeTypes.APPLICATION_VOBSUB) || Objects.equals(str, MimeTypes.APPLICATION_DVBSUBS) || Objects.equals(str, MimeTypes.APPLICATION_TTML);
    }

    @Override // defpackage.aki
    public boolean j(Object obj, Object obj2) {
        return false;
    }

    @Override // defpackage.kic
    public Object k(String str) {
        z1a.r("empty timeout", str.length() > 0);
        z1a.r("bad timeout format", str.length() <= 9);
        long parseLong = Long.parseLong(str.substring(0, str.length() - 1));
        char charAt = str.charAt(str.length() - 1);
        if (charAt == 'H') {
            return Long.valueOf(TimeUnit.HOURS.toNanos(parseLong));
        }
        if (charAt == 'M') {
            return Long.valueOf(TimeUnit.MINUTES.toNanos(parseLong));
        }
        if (charAt == 'S') {
            return Long.valueOf(TimeUnit.SECONDS.toNanos(parseLong));
        }
        if (charAt == 'u') {
            return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(parseLong));
        }
        if (charAt == 'm') {
            return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(parseLong));
        }
        if (charAt == 'n') {
            return Long.valueOf(parseLong);
        }
        zzl.g(charAt, "Invalid timeout unit: ");
        return null;
    }

    @Override // defpackage.pjd
    public Object n() {
        return new ArrayList();
    }

    @Override // defpackage.w1g
    public e1g o(e1g e1gVar, uvd uvdVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) e1gVar.get()).compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        e1gVar.c();
        return new lc2(byteArrayOutputStream.toByteArray());
    }

    public synchronized tu2 s(String str) {
        tu2 tu2Var;
        try {
            str.getClass();
            LinkedHashMap linkedHashMap = tu2.d;
            tu2Var = (tu2) linkedHashMap.get(str);
            if (tu2Var == null) {
                tu2Var = (tu2) linkedHashMap.get(c.v(str, "TLS_", false) ? "SSL_".concat(str.substring(4)) : c.v(str, "SSL_", false) ? "TLS_".concat(str.substring(4)) : str);
                if (tu2Var == null) {
                    tu2Var = new tu2(str);
                }
                linkedHashMap.put(str, tu2Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return tu2Var;
    }

    public String toString() {
        switch (this.a) {
            case 16:
                return "Arrangement#Bottom";
            default:
                return super.toString();
        }
    }

    public ArrayList y(View view) {
        if (cw3.a.contains(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (view instanceof TextView) {
                String obj = ((TextView) view).getText().toString();
                if (obj.length() > 0 && obj.length() < 100) {
                    String lowerCase = obj.toLowerCase();
                    lowerCase.getClass();
                    arrayList.add(lowerCase);
                    return arrayList;
                }
            } else {
                Iterator it = xsk.b(view).iterator();
                while (it.hasNext()) {
                    arrayList.addAll(y((View) it.next()));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            cw3.a(this, th);
            return null;
        }
    }

    public /* synthetic */ zic(int i2) {
        this.a = i2;
    }
}
