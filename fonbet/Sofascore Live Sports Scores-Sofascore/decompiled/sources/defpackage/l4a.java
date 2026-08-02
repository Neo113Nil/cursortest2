package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.text.ParcelableSpan;
import android.text.SpannableString;
import android.text.style.AlignmentSpan;
import android.text.style.TextAppearanceSpan;
import android.util.SizeF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.ExtractedText;
import android.webkit.WebView;
import android.widget.RemoteViews;
import android.widget.TextView;
import androidx.compose.runtime.e;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.FieldTranslations;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournamentDetails;
import com.sofascore.model.newNetwork.UniqueTournamentWinner;
import com.sofascore.results.R;
import com.sofascore.results.wc26.data.WorldCupLastDanceUiModel;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class l4a {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public static final /* synthetic */ int e = 0;

    public static zmd A(Context context, Team team) {
        context.getClass();
        int id = team.getId();
        String p = tba.p(context, team);
        Team parentTeam = team.getParentTeam();
        zmd A = parentTeam != null ? A(context, parentTeam) : null;
        Country country = team.getCountry();
        return new zmd(id, p, A, country != null ? country.getAlpha2() : null, team.getType() == 1 ? ymd.b : ymd.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [km5] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v3, types: [km5] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static prj E(List list, UniqueTournamentDetails uniqueTournamentDetails, String str) {
        ?? r2;
        List<Team> mostTitlesTeams;
        String name;
        List<UniqueTournamentWinner> H0;
        String name2;
        Integer valueOf = Integer.valueOf(R.plurals.tennis_number_of_titles);
        Integer valueOf2 = Integer.valueOf(R.string.tennis_title_holder);
        Integer valueOf3 = Integer.valueOf(R.string.tennis_most_titles);
        Integer valueOf4 = Integer.valueOf(R.string.tennis_titles);
        str.getClass();
        ?? r6 = 0;
        r6 = 0;
        if (list == null || list.isEmpty()) {
            List<Team> mostTitlesTeams2 = uniqueTournamentDetails != null ? uniqueTournamentDetails.getMostTitlesTeams() : null;
            if (mostTitlesTeams2 == null || mostTitlesTeams2.isEmpty()) {
                return null;
            }
        }
        Pair pair = str.equals(Sports.BASKETBALL) ? new Pair(Integer.valueOf(R.string.basketball_titles), Integer.valueOf(R.string.basketball_most_titles)) : str.equals(Sports.TENNIS) ? new Pair(valueOf4, valueOf3) : new Pair(valueOf4, valueOf3);
        int intValue = ((Number) pair.a).intValue();
        int intValue2 = ((Number) pair.b).intValue();
        Pair pair2 = str.equals(Sports.BASKETBALL) ? new Pair(Integer.valueOf(R.string.basketball_title_holder), Integer.valueOf(R.plurals.basketball_number_of_titles)) : str.equals(Sports.TENNIS) ? new Pair(valueOf2, valueOf) : new Pair(valueOf2, valueOf);
        int intValue3 = ((Number) pair2.a).intValue();
        int intValue4 = ((Number) pair2.b).intValue();
        int i = 10;
        if (list == null || (H0 = CollectionsKt.H0(list, new q6i(i))) == null) {
            r2 = 0;
        } else {
            r2 = new ArrayList(k13.r(H0, 10));
            for (UniqueTournamentWinner uniqueTournamentWinner : H0) {
                int year = uniqueTournamentWinner.getYear();
                Team team = uniqueTournamentWinner.getTeam();
                int id = team.getId();
                FieldTranslations fieldTranslations = team.getFieldTranslations();
                if (fieldTranslations == null || (name2 = tba.r(fieldTranslations)) == null) {
                    name2 = team.getName();
                }
                r2.add(new xrj(id, name2, team.getGender(), String.valueOf(year), null, intValue3, intValue4, 16));
            }
        }
        if (r2 == 0) {
            r2 = km5.a;
        }
        gv9 W = l6g.W(r2);
        if (uniqueTournamentDetails != null && (mostTitlesTeams = uniqueTournamentDetails.getMostTitlesTeams()) != null) {
            r6 = new ArrayList(k13.r(mostTitlesTeams, 10));
            for (Team team2 : mostTitlesTeams) {
                int id2 = team2.getId();
                FieldTranslations fieldTranslations2 = team2.getFieldTranslations();
                if (fieldTranslations2 == null || (name = tba.r(fieldTranslations2)) == null) {
                    name = team2.getName();
                }
                r6.add(new xrj(id2, name, team2.getGender(), null, uniqueTournamentDetails.getMostTitles(), intValue3, intValue4, 8));
            }
        }
        if (r6 == 0) {
            r6 = km5.a;
        }
        return new prj(W, l6g.W(r6), intValue, intValue2);
    }

    public static final e1d F(keb kebVar, of3 of3Var) {
        return G(kebVar, kebVar.d(), of3Var, 0);
    }

    public static final e1d G(keb kebVar, Object obj, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        u6b u6bVar = (u6b) av8Var.k(mhb.a);
        Object O = av8Var.O();
        a99 a99Var = nf3.a;
        if (O == a99Var) {
            if (kebVar.e != keb.k) {
                obj = kebVar.d();
            }
            O = e.f(obj);
            av8Var.n0(O);
        }
        e1d e1dVar = (e1d) O;
        boolean i2 = av8Var.i(kebVar) | av8Var.i(u6bVar);
        Object O2 = av8Var.O();
        if (i2 || O2 == a99Var) {
            O2 = new dr6(27, kebVar, u6bVar, e1dVar);
            av8Var.n0(O2);
        }
        hz8.b(kebVar, u6bVar, (Function1) O2, av8Var);
        return e1dVar;
    }

    public static final void H(RemoteViews remoteViews, pxj pxjVar, s4a s4aVar, ArrayList arrayList) {
        int i = 0;
        for (Object obj : CollectionsKt.L0(arrayList, 10)) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            P(remoteViews, pxjVar.b(s4aVar, i), (mk5) obj);
            i = i2;
        }
    }

    public static void I(View view, qzb qzbVar) {
        dj5 dj5Var = qzbVar.b.b;
        if (dj5Var == null || !dj5Var.a) {
            return;
        }
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += ((View) parent).getElevation();
        }
        ozb ozbVar = qzbVar.b;
        if (ozbVar.m != f) {
            ozbVar.m = f;
            qzbVar.E();
        }
    }

    public static void J(Context context, boolean z) {
        SharedPreferences d2;
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
        SharedPreferences.Editor i = dmi.i(sharedPreferences, "PREF_PULSATE_QUICK_LINKS", z);
        Unit unit = Unit.a;
        i.apply();
    }

    public static final void K(TextView textView, String str) {
        textView.getClass();
        str.getClass();
        textView.setText("\u200e" + str + "\u200e");
    }

    public static boolean M(Context context) {
        ApplicationInfo applicationInfo;
        Intent putExtra = new Intent().addFlags(268435456).setAction("com.android.settings.panel.action.MEDIA_OUTPUT").putExtra("com.android.settings.panel.extra.PACKAGE_NAME", context.getPackageName());
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(putExtra, 0).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null && (applicationInfo = activityInfo.applicationInfo) != null && (applicationInfo.flags & 129) != 0) {
                putExtra.setPackage(applicationInfo.packageName);
                context.startActivity(putExtra);
                return true;
            }
        }
        return false;
    }

    public static final ExtractedText N(wcj wcjVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = wcjVar.a.b;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = wcjVar.b;
        extractedText.selectionStart = pej.g(j);
        extractedText.selectionEnd = pej.f(j);
        extractedText.flags = !StringsKt.K(wcjVar.a.b, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final String O(String str) {
        str.getClass();
        return "\u200e" + str + "\u200e";
    }

    /* JADX WARN: Code restructure failed: missing block: B:246:0x0549, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r1 != null ? r1.a : null, r3) != false) goto L255;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void P(RemoteViews remoteViews, pxj pxjVar, mk5 mk5Var) {
        foa foaVar;
        boolean z;
        String str;
        int i;
        int i2;
        Context context = pxjVar.a;
        tyd tydVar = tyd.m;
        if (mk5Var instanceof nk5) {
            nk5 nk5Var = (nk5) mk5Var;
            ArrayList arrayList = nk5Var.c;
            int size = arrayList.size();
            vy8 vy8Var = nk5Var.d;
            ho hoVar = nk5Var.e;
            s4a b2 = aoa.b(remoteViews, pxjVar, foa.c, size, vy8Var, new eo(hoVar.a), new go(hoVar.b));
            gz8.z(pxjVar, remoteViews, nk5Var.d, b2);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                mk5 mk5Var2 = (mk5) it.next();
                mk5Var2.a(mk5Var2.b().d(new qo(nk5Var.e)));
            }
            H(remoteViews, pxjVar, b2, arrayList);
            return;
        }
        int i3 = 16;
        if (mk5Var instanceof uk5) {
            uk5 uk5Var = (uk5) mk5Var;
            foa foaVar2 = (Build.VERSION.SDK_INT < 31 || !uk5Var.d.c(tydVar)) ? foa.a : foa.B;
            ArrayList arrayList2 = uk5Var.c;
            s4a b3 = aoa.b(remoteViews, pxjVar, foaVar2, arrayList2.size(), uk5Var.d, null, new go(uk5Var.f));
            int i4 = b3.a;
            int i5 = uk5Var.e;
            int i6 = uk5Var.f;
            if (i5 != 0) {
                if (i5 == 2) {
                    i2 = 8388613;
                } else if (i5 == 1) {
                    i2 = 1;
                } else {
                    eo.b(i5);
                }
                if (i6 != 0) {
                    if (i6 == 2) {
                        i3 = 80;
                    } else if (i6 != 1) {
                        go.b(i6);
                    }
                    remoteViews.setInt(i4, "setGravity", i2 | i3);
                    gz8.z(pxj.a(pxjVar, 0, null, null, null, 0L, 0, null, 28671), remoteViews, uk5Var.d, b3);
                    H(remoteViews, pxjVar, b3, arrayList2);
                    if (!uk5Var.d.c(tydVar) || arrayList2.isEmpty()) {
                        return;
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                    }
                    return;
                }
                i3 = 48;
                remoteViews.setInt(i4, "setGravity", i2 | i3);
                gz8.z(pxj.a(pxjVar, 0, null, null, null, 0L, 0, null, 28671), remoteViews, uk5Var.d, b3);
                H(remoteViews, pxjVar, b3, arrayList2);
                if (uk5Var.d.c(tydVar)) {
                    return;
                } else {
                    return;
                }
            }
            i2 = 8388611;
            if (i6 != 0) {
            }
            i3 = 48;
            remoteViews.setInt(i4, "setGravity", i2 | i3);
            gz8.z(pxj.a(pxjVar, 0, null, null, null, 0L, 0, null, 28671), remoteViews, uk5Var.d, b3);
            H(remoteViews, pxjVar, b3, arrayList2);
            if (uk5Var.d.c(tydVar)) {
            }
        } else {
            if (!(mk5Var instanceof pk5)) {
                if (mk5Var instanceof xk5) {
                    xk5 xk5Var = (xk5) mk5Var;
                    s4a c2 = aoa.c(remoteViews, pxjVar, foa.d, xk5Var.d);
                    int i7 = c2.a;
                    CharSequence charSequence = xk5Var.a;
                    cfj cfjVar = xk5Var.b;
                    int i8 = xk5Var.c;
                    if (i8 != Integer.MAX_VALUE) {
                        remoteViews.setInt(i7, "setMaxLines", i8);
                    }
                    if (cfjVar == null) {
                        remoteViews.setTextViewText(i7, charSequence);
                    } else {
                        SpannableString spannableString = new SpannableString(charSequence);
                        int length = spannableString.length();
                        lfj lfjVar = cfjVar.b;
                        if (lfjVar != null) {
                            long j = lfjVar.a;
                            if ((j & 1095216660480L) != 4294967296L) {
                                a70.p("Only Sp is currently supported for font sizes");
                                return;
                            }
                            remoteViews.setTextViewTextSize(i7, 2, lfj.c(j));
                        }
                        ArrayList arrayList3 = new ArrayList();
                        vg8 vg8Var = cfjVar.c;
                        if (vg8Var != null) {
                            int i9 = vg8Var.a;
                            arrayList3.add(new TextAppearanceSpan(context, i9 == 700 ? R.style.Glance_AppWidget_TextAppearance_Bold : i9 == 500 ? R.style.Glance_AppWidget_TextAppearance_Medium : R.style.Glance_AppWidget_TextAppearance_Normal));
                        }
                        o7j o7jVar = cfjVar.d;
                        if (o7jVar != null) {
                            int i10 = o7jVar.a;
                            int i11 = 3;
                            if (Build.VERSION.SDK_INT >= 31) {
                                if (i10 == 3) {
                                    i11 = 1;
                                } else if (i10 != 1) {
                                    i11 = i10 == 2 ? 5 : (i10 != 4 && i10 == 5) ? 8388613 : 8388611;
                                }
                                ifj.a.a(remoteViews, i7, i11 | 48);
                            } else {
                                boolean z2 = pxjVar.c;
                                arrayList3.add(new AlignmentSpan.Standard(i10 == 3 ? Layout.Alignment.ALIGN_CENTER : i10 == 1 ? z2 ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : i10 == 2 ? z2 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : i10 == 4 ? Layout.Alignment.ALIGN_NORMAL : i10 == 5 ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL));
                            }
                        }
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            spannableString.setSpan((ParcelableSpan) it3.next(), 0, length, 17);
                        }
                        remoteViews.setTextViewText(i7, spannableString);
                        e23 e23Var = cfjVar.a;
                        if (e23Var instanceof f68) {
                            remoteViews.setTextColor(i7, hkg.s0(((f68) e23Var).a));
                        } else if (e23Var instanceof h1g) {
                            if (Build.VERSION.SDK_INT >= 31) {
                                byf.g(remoteViews, i7, "setTextColor", ((h1g) e23Var).a);
                            } else {
                                remoteViews.setTextColor(i7, hkg.s0(((h1g) e23Var).a(context)));
                            }
                        } else if (!(e23Var instanceof al4)) {
                            Objects.toString(e23Var);
                        } else if (Build.VERSION.SDK_INT >= 31) {
                            al4 al4Var = (al4) e23Var;
                            byf.f(remoteViews, i7, "setTextColor", hkg.s0(al4Var.a), hkg.s0(al4Var.b));
                        } else {
                            remoteViews.setTextColor(i7, hkg.s0(((al4) e23Var).a(context)));
                        }
                    }
                    gz8.z(pxjVar, remoteViews, xk5Var.d, c2);
                    return;
                }
                if (mk5Var instanceof tk5) {
                    tk5 tk5Var = (tk5) mk5Var;
                    ArrayList arrayList4 = tk5Var.c;
                    if (arrayList4.size() == 1 && Intrinsics.c(tk5Var.d, ho.d)) {
                        P(remoteViews, pxjVar, (mk5) CollectionsKt.Y(arrayList4));
                        return;
                    } else {
                        a70.p("Lazy list items can only have a single child align at the center start of the view. The normalization of the composition tree failed.");
                        return;
                    }
                }
                if (mk5Var instanceof sk5) {
                    sk5 sk5Var = (sk5) mk5Var;
                    s4a c3 = aoa.c(remoteViews, pxjVar, foa.e, sk5Var.d);
                    int i12 = c3.a;
                    if (pxjVar.f) {
                        a70.r("Glance does not support nested list views.");
                        return;
                    }
                    remoteViews.setPendingIntentTemplate(i12, PendingIntent.getActivity(context, 0, new Intent(), 184549384, null));
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    pxj a2 = pxj.a(pxjVar, 0, null, null, null, 0L, i12, null, 31711);
                    Iterator it4 = sk5Var.c.iterator();
                    boolean z3 = false;
                    int i13 = 0;
                    while (it4.hasNext()) {
                        Object next = it4.next();
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            b.q();
                            throw null;
                        }
                        mk5 mk5Var3 = (mk5) next;
                        mk5Var3.getClass();
                        long j2 = ((tk5) mk5Var3).f;
                        RemoteViews Q = Q(pxj.a(a2, 0, new AtomicInteger(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES), null, null, 0L, i13, null, 31679), a.c(mk5Var3), pxjVar.d.a(mk5Var3));
                        arrayList5.add(Long.valueOf(j2));
                        arrayList6.add(Q);
                        z3 = z3 || j2 > -4611686018427387904L;
                        i13 = i14;
                    }
                    int i15 = aoa.c;
                    if (i15 < 1) {
                        ArrayList arrayList7 = new ArrayList(k13.r(arrayList6, 10));
                        Iterator it5 = arrayList6.iterator();
                        while (it5.hasNext()) {
                            arrayList7.add(Integer.valueOf(((RemoteViews) it5.next()).getLayoutId()));
                        }
                        i15 = CollectionsKt.S0(CollectionsKt.V0(arrayList7)).size();
                    }
                    ixf ixfVar = new ixf(CollectionsKt.T0(arrayList5), (RemoteViews[]) arrayList6.toArray(new RemoteViews[0]), z3, Math.max(i15, 1));
                    int i16 = pxjVar.b;
                    int i17 = c3.a;
                    long j3 = pxjVar.j;
                    if (j3 != 9205357640488583168L) {
                        StringBuilder sb = new StringBuilder();
                        sb.append((Object) p75.c(s75.b(j3)));
                        sb.append('x');
                        sb.append((Object) p75.c(s75.a(j3)));
                        str = sb.toString();
                    } else {
                        str = "Unspecified";
                    }
                    yy8.a(remoteViews, context, i16, i17, str, ixfVar);
                    gz8.z(pxjVar, remoteViews, sk5Var.d, c3);
                    return;
                }
                if (mk5Var instanceof wk5) {
                    wk5 wk5Var = (wk5) mk5Var;
                    gz8.z(pxjVar, remoteViews, wk5Var.a, aoa.c(remoteViews, pxjVar, foa.i, wk5Var.a));
                    return;
                }
                if (!(mk5Var instanceof rk5)) {
                    if (!(mk5Var instanceof ok5)) {
                        if (!(mk5Var instanceof vk5)) {
                            zzl.i(mk5Var.getClass().getCanonicalName(), "Unknown element type ");
                            return;
                        }
                        ArrayList arrayList8 = ((vk5) mk5Var).c;
                        if (arrayList8.size() <= 1) {
                            mk5 mk5Var4 = (mk5) CollectionsKt.firstOrNull(arrayList8);
                            if (mk5Var4 != null) {
                                P(remoteViews, pxjVar, mk5Var4);
                                return;
                            }
                            return;
                        }
                        throw new IllegalArgumentException(("Size boxes can only have at most one child " + arrayList8.size() + ". The normalization of the composition tree failed.").toString());
                    }
                    ok5 ok5Var = (ok5) mk5Var;
                    s4a c4 = aoa.c(remoteViews, pxjVar, foa.k, ok5Var.a);
                    int i18 = c4.a;
                    remoteViews.setProgressBar(i18, 0, 0, true);
                    if (Build.VERSION.SDK_INT >= 31) {
                        e23 e23Var2 = ok5Var.b;
                        if (e23Var2 instanceof f68) {
                            byf.h(remoteViews, i18, "setIndeterminateTintList", ColorStateList.valueOf(hkg.s0(((f68) e23Var2).a)));
                        } else if (e23Var2 instanceof h1g) {
                            byf.g(remoteViews, i18, "setIndeterminateTintList", ((h1g) e23Var2).a);
                        } else if (e23Var2 instanceof al4) {
                            al4 al4Var2 = (al4) e23Var2;
                            byf.i(remoteViews, i18, "setIndeterminateTintList", ColorStateList.valueOf(hkg.s0(al4Var2.a)), ColorStateList.valueOf(hkg.s0(al4Var2.b)));
                        } else {
                            Objects.toString(e23Var2);
                        }
                    }
                    gz8.z(pxjVar, remoteViews, ok5Var.a, c4);
                    return;
                }
                rk5 rk5Var = (rk5) mk5Var;
                boolean I = c5n.I(rk5Var);
                int i19 = rk5Var.d;
                if (i19 == 0) {
                    foaVar = I ? foa.w : foa.t;
                } else {
                    foa foaVar3 = foa.u;
                    if (i19 == 1) {
                        if (I) {
                            foaVar = foa.x;
                        }
                        foaVar = foaVar3;
                    } else if (i19 == 2) {
                        foaVar = I ? foa.y : foa.v;
                    } else {
                        np3.a(i19);
                        foaVar = foaVar3;
                    }
                }
                s4a c5 = aoa.c(remoteViews, pxjVar, foaVar, rk5Var.a);
                int i20 = c5.a;
                dt9 dt9Var = rk5Var.b;
                if (dt9Var instanceof v20) {
                    remoteViews.setImageViewResource(i20, ((v20) dt9Var).a);
                } else {
                    if (!(dt9Var instanceof bx1)) {
                        a70.p("An unsupported ImageProvider type was used.");
                        return;
                    }
                    remoteViews.setImageViewBitmap(i20, ((bx1) dt9Var).a);
                }
                fjj fjjVar = rk5Var.c;
                if (fjjVar != null) {
                    if (!(fjjVar instanceof fjj)) {
                        a70.p("An unsupported ColorFilter was used.");
                        return;
                    }
                    e23 e23Var3 = fjjVar.a;
                    if (Build.VERSION.SDK_INT >= 31) {
                        bu9.a.a(pxjVar, remoteViews, e23Var3, i20);
                    } else {
                        remoteViews.setInt(i20, "setColorFilter", hkg.s0(e23Var3.a(context)));
                    }
                }
                gz8.z(pxjVar, remoteViews, rk5Var.a, c5);
                if (rk5Var.d == 1) {
                    a8l a8lVar = (a8l) rk5Var.a.a(null, ff3.q);
                    z25 z25Var = a8lVar != null ? a8lVar.a : null;
                    x25 x25Var = x25.a;
                    if (!Intrinsics.c(z25Var, x25Var)) {
                        q99 q99Var = (q99) rk5Var.a.a(null, ff3.r);
                    }
                    z = true;
                    remoteViews.setBoolean(i20, "setAdjustViewBounds", z);
                    return;
                }
                z = false;
                remoteViews.setBoolean(i20, "setAdjustViewBounds", z);
                return;
            }
            pk5 pk5Var = (pk5) mk5Var;
            foa foaVar4 = (Build.VERSION.SDK_INT < 31 || !pk5Var.d.c(tydVar)) ? foa.b : foa.C;
            ArrayList arrayList9 = pk5Var.c;
            s4a b4 = aoa.b(remoteViews, pxjVar, foaVar4, arrayList9.size(), pk5Var.d, new eo(pk5Var.f), null);
            int i21 = b4.a;
            int i22 = pk5Var.f;
            int i23 = pk5Var.e;
            if (i22 != 0) {
                if (i22 == 2) {
                    i = 8388613;
                } else if (i22 == 1) {
                    i = 1;
                } else {
                    eo.b(i22);
                }
                if (i23 != 0) {
                    if (i23 == 2) {
                        i3 = 80;
                    } else if (i23 != 1) {
                        go.b(i23);
                    }
                    remoteViews.setInt(i21, "setGravity", i | i3);
                    gz8.z(pxj.a(pxjVar, 0, null, null, null, 0L, 0, null, 28671), remoteViews, pk5Var.d, b4);
                    H(remoteViews, pxjVar, b4, arrayList9);
                    if (!pk5Var.d.c(tydVar) || arrayList9.isEmpty()) {
                        return;
                    }
                    Iterator it6 = arrayList9.iterator();
                    while (it6.hasNext()) {
                    }
                    return;
                }
                i3 = 48;
                remoteViews.setInt(i21, "setGravity", i | i3);
                gz8.z(pxj.a(pxjVar, 0, null, null, null, 0L, 0, null, 28671), remoteViews, pk5Var.d, b4);
                H(remoteViews, pxjVar, b4, arrayList9);
                if (pk5Var.d.c(tydVar)) {
                    return;
                } else {
                    return;
                }
            }
            i = 8388611;
            if (i23 != 0) {
            }
            i3 = 48;
            remoteViews.setInt(i21, "setGravity", i | i3);
            gz8.z(pxj.a(pxjVar, 0, null, null, null, 0L, 0, null, 28671), remoteViews, pk5Var.d, b4);
            H(remoteViews, pxjVar, b4, arrayList9);
            if (pk5Var.d.c(tydVar)) {
            }
        }
    }

    public static final RemoteViews Q(pxj pxjVar, List list, int i) {
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!(((mk5) it.next()) instanceof vk5)) {
                    mk5 mk5Var = (mk5) CollectionsKt.D0(list);
                    dyf a2 = aoa.a(pxjVar, mk5Var.b(), i);
                    RemoteViews remoteViews = a2.a;
                    P(remoteViews, pxj.a(pxjVar.b(a2.b, 0), 0, new AtomicInteger(1), null, new AtomicBoolean(false), 0L, 0, null, 32447), mk5Var);
                    return remoteViews;
                }
            }
        }
        Object Y = CollectionsKt.Y(list);
        Y.getClass();
        ekh ekhVar = ((vk5) Y).e;
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            mk5 mk5Var2 = (mk5) it2.next();
            mk5Var2.getClass();
            long j = ((vk5) mk5Var2).d;
            dyf a3 = aoa.a(pxjVar, mk5Var2.b(), i);
            RemoteViews remoteViews2 = a3.a;
            P(remoteViews2, pxj.a(pxjVar.b(a3.b, 0), 0, new AtomicInteger(1), null, new AtomicBoolean(false), j, 0, null, 31935), mk5Var2);
            arrayList.add(new Pair(new SizeF(s75.b(j), s75.a(j)), remoteViews2));
        }
        if (ekhVar instanceof dkh) {
            return (RemoteViews) ((Pair) CollectionsKt.D0(arrayList)).b;
        }
        if (!Intrinsics.c(ekhVar, ckh.a)) {
            zzl.b();
            return null;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return g90.a.a(tub.o(arrayList));
        }
        if (arrayList.size() != 1 && arrayList.size() != 2) {
            a70.p("unsupported views size");
            return null;
        }
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add((RemoteViews) ((Pair) it3.next()).b);
        }
        int size = arrayList2.size();
        if (size == 1) {
            return (RemoteViews) arrayList2.get(0);
        }
        if (size == 2) {
            return new RemoteViews((RemoteViews) arrayList2.get(0), (RemoteViews) arrayList2.get(1));
        }
        a70.p("There must be between 1 and 2 views.");
        return null;
    }

    public static final RemoteViews R(Context context, int i, eyf eyfVar, cma cmaVar, int i2, ComponentName componentName) {
        return Q(new pxj(context, i, context.getResources().getConfiguration().getLayoutDirection() == 1, cmaVar, -1, false, new AtomicInteger(1), new s4a(0, 0, null, 7), new AtomicBoolean(false), 9205357640488583168L, -1, false, null, componentName), eyfVar.c, i2);
    }

    public static String U(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b2 : bArr) {
            if (b2 == 34) {
                sb.append("\\\"");
            } else if (b2 == 39) {
                sb.append("\\'");
            } else if (b2 != 92) {
                switch (b2) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b2 < 32 || b2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((b2 >>> 6) & 3) + 48));
                            sb.append((char) (((b2 >>> 3) & 7) + 48));
                            sb.append((char) ((b2 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) b2);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0290, code lost:
    
        if (r11.i(r10) != false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01fb, code lost:
    
        if (r10 == r9) goto L129;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(gv9 gv9Var, Object obj, Function1 function1, xtc xtcVar, y1h y1hVar, boolean z, of3 of3Var, int i, int i2) {
        int i3;
        int i4;
        y1h y1hVar2;
        int i5;
        boolean z2;
        xtc xtcVar2;
        y1h y1hVar3;
        boolean z3;
        eqf u;
        xtc z4;
        a99 a99Var;
        Object obj2;
        boolean z5;
        boolean g;
        Object O;
        gv9Var.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1704271408);
        if ((i & 6) == 0) {
            i3 = (av8Var.g(gv9Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? av8Var.g(obj) : av8Var.i(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= av8Var.g(xtcVar) ? com.ironsource.mediationsdk.metadata.a.o : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                y1hVar2 = y1hVar;
                i3 |= av8Var.g(y1hVar2) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                    z2 = z;
                } else {
                    z2 = z;
                    if ((i & 196608) == 0) {
                        i3 |= av8Var.h(z2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    }
                }
                if (av8Var.T(i3 & 1, (i3 & 74899) != 74898)) {
                    utc utcVar = utc.a;
                    xtc xtcVar3 = i6 != 0 ? utcVar : xtcVar;
                    y1h y1hVar4 = i4 != 0 ? v1h.f : y1hVar2;
                    boolean z6 = i5 != 0 ? false : z2;
                    boolean z7 = av8Var.k(dh3.n) == ema.b;
                    long j = ((r13) y1hVar4.b.invoke(av8Var, 0)).a;
                    int i7 = i3 & 14;
                    boolean z8 = i7 == 4;
                    Object O2 = av8Var.O();
                    a99 a99Var2 = nf3.a;
                    if (z8 || O2 == a99Var2) {
                        O2 = Integer.valueOf(gv9Var.size());
                        av8Var.n0(O2);
                    }
                    int intValue = ((Number) O2).intValue();
                    boolean z9 = i7 == 4;
                    int i8 = i3 & 112;
                    boolean z10 = z9 | (i8 == 32 || ((i3 & 64) != 0 && av8Var.g(obj)));
                    Object O3 = av8Var.O();
                    if (z10 || O3 == a99Var2) {
                        Iterator it = gv9Var.iterator();
                        int i9 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i9 = -1;
                                break;
                            } else if (Intrinsics.c(((t1h) it.next()).getItem(), obj)) {
                                break;
                            } else {
                                i9++;
                            }
                        }
                        O3 = Integer.valueOf(i9);
                        av8Var.n0(O3);
                    }
                    int intValue2 = ((Number) O3).intValue();
                    y1h y1hVar5 = y1hVar4;
                    int i10 = i8;
                    int i11 = i3;
                    cdi b2 = a60.b(!z7 ? intValue2 : (intValue - 1) - intValue2, null, "animatedProgress", av8Var, 3072, 22);
                    av8Var.d0(1422324058);
                    if (z6) {
                        av8Var.d0(1015771680);
                        xtc d0 = fz8.d0(utcVar, n9a.b);
                        av8Var.s(false);
                        z4 = xtcVar3.z(d0);
                    } else {
                        av8Var.d0(1775905919);
                        xtc d2 = bkh.d(utcVar, 1.0f);
                        av8Var.s(false);
                        z4 = xtcVar3.z(d2);
                    }
                    xtc d02 = l98.d0(n9e.q(l98.b0(fz8.Y(z4, n9a.a), 8.0f), ((r13) y1hVar5.a.invoke(av8Var, 0)).a, o7g.a(16.0f)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2.0f, 1);
                    if (intValue2 != -1) {
                        boolean e2 = av8Var.e(intValue) | av8Var.g(b2) | av8Var.f(j);
                        Object O4 = av8Var.O();
                        if (e2) {
                            a99Var = a99Var2;
                        } else {
                            a99Var = a99Var2;
                        }
                        O4 = new zaa(intValue, j, b2);
                        av8Var.n0(O4);
                        d02 = d02.z(td4.X(utcVar, (Function1) O4));
                    } else {
                        a99Var = a99Var2;
                    }
                    av8Var.s(false);
                    l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, d02);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, a2, hf3.g);
                    waa.K(av8Var, m, hf3.f);
                    waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var, hf3.k);
                    Iterator p = ljg.p(av8Var, C, hf3.d, -850738670, gv9Var);
                    int i12 = 0;
                    while (p.hasNext()) {
                        Object next = p.next();
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            b.q();
                            throw null;
                        }
                        t1h t1hVar = (t1h) next;
                        boolean z11 = i12 == intValue2;
                        int i14 = i10;
                        if (i14 != 32) {
                            if ((i11 & 64) != 0) {
                                obj2 = obj;
                            } else {
                                obj2 = obj;
                            }
                            z5 = false;
                            int i15 = i11;
                            g = z5 | av8Var.g(t1hVar) | ((i15 & 896) != 256);
                            O = av8Var.O();
                            if (!g || O == a99Var) {
                                O = new mth(0, obj2, t1hVar, function1);
                                av8Var.n0(O);
                            }
                            int i16 = 6 | ((i15 << 3) & 458752);
                            i11 = i15;
                            av8 av8Var2 = av8Var;
                            w3a.e(t1hVar, z11, (Function0) O, null, y1hVar5, av8Var2, i16);
                            i10 = i14;
                            i12 = i13;
                            av8Var = av8Var2;
                            a99Var = a99Var;
                        } else {
                            obj2 = obj;
                        }
                        z5 = true;
                        int i152 = i11;
                        g = z5 | av8Var.g(t1hVar) | ((i152 & 896) != 256);
                        O = av8Var.O();
                        if (!g) {
                        }
                        O = new mth(0, obj2, t1hVar, function1);
                        av8Var.n0(O);
                        int i162 = 6 | ((i152 << 3) & 458752);
                        i11 = i152;
                        av8 av8Var22 = av8Var;
                        w3a.e(t1hVar, z11, (Function0) O, null, y1hVar5, av8Var22, i162);
                        i10 = i14;
                        i12 = i13;
                        av8Var = av8Var22;
                        a99Var = a99Var;
                    }
                    av8Var.s(false);
                    av8Var.s(true);
                    y1hVar3 = y1hVar5;
                    xtcVar2 = xtcVar3;
                    z3 = z6;
                } else {
                    av8Var.W();
                    xtcVar2 = xtcVar;
                    y1hVar3 = y1hVar2;
                    z3 = z2;
                }
                u = av8Var.u();
                if (u != null) {
                    u.d = new vr5(gv9Var, obj, function1, xtcVar2, y1hVar3, z3, i, i2);
                    return;
                }
                return;
            }
            y1hVar2 = y1hVar;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            if (av8Var.T(i3 & 1, (i3 & 74899) != 74898)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        y1hVar2 = y1hVar;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        if (av8Var.T(i3 & 1, (i3 & 74899) != 74898)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final void b(int i, String str, boolean z, xtc xtcVar, of3 of3Var, int i2) {
        long j;
        str.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1539030793);
        int i3 = i2 | (av8Var.e(i) ? 4 : 2) | (av8Var.g(str) ? 32 : 16) | (av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(xtcVar) ? com.ironsource.mediationsdk.metadata.a.o : 1024);
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            if (z) {
                j = ljg.f(av8Var, 1539848158, R.color.primary_highlight, av8Var, false);
            } else {
                av8Var.d0(1539849204);
                av8Var.s(false);
                j = r13.i;
            }
            qz1 H = fcp.H(z ? ljg.f(av8Var, 1539850812, R.color.primary_default, av8Var, false) : ljg.f(av8Var, 1539851602, R.color.n_lv_5, av8Var, false), 1.0f);
            xtc c0 = l98.c0(n9e.q(yso.p(xtcVar, H.a, H.b, o7g.a(8.0f)), j, oyn.e), 12.0f, 12.0f);
            u23 a2 = t23.a(ww9.d, uxf.p, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, c0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            l8g a3 = k8g.a(ww9.b, uxf.l, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            utc utcVar = utc.a;
            xtc C2 = fqj.C(av8Var, utcVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            if (z) {
                av8Var.d0(-642945853);
                nq8.h(av8Var, bkh.l(utcVar, 16.0f));
                av8Var.s(false);
            } else {
                av8Var.d0(-642888193);
                av8Var.s(false);
            }
            td4.C(i, bkh.l(utcVar, 48.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, (i3 & 14) | 48, 12);
            if (z) {
                av8Var.d0(-642708021);
                kq9.b(s6a.N(R.drawable.ic_tv_channel_checkmark_16, 6, av8Var), null, bkh.l(utcVar, 16.0f), lz.D(R.color.primary_default, av8Var), av8Var, 432, 0);
                av8Var.s(false);
            } else {
                av8Var.d0(-642428897);
                av8Var.s(false);
            }
            bf3.t(av8Var, true, utcVar, 4.0f, av8Var);
            yf8 yf8Var = xth.a;
            q5a.w(str, bkh.r(bkh.e(utcVar, 32.0f), uxf.m, 2), lz.D(R.color.n_lv_1, av8Var), null, 0L, 0L, new p7j(3), 0L, 2, false, 0, 0, xth.g(), av8Var, ((i3 >> 3) & 14) | 48, 384, 125944);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p73(i, str, z, xtcVar, i2);
        }
    }

    public static final void c(String str, String str2, xtc xtcVar, of3 of3Var, int i) {
        av8 av8Var;
        str.getClass();
        str2.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-2819585);
        int i2 = i | (av8Var2.g(str) ? 4 : 2) | (av8Var2.g(str2) ? 32 : 16) | (av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var2.T(i2 & 1, (i2 & 147) != 146)) {
            kv1 kv1Var = uxf.p;
            xtc h = ljg.h(12.0f, xtcVar, lz.D(R.color.surface_2, av8Var2), 8.0f);
            u23 a2 = t23.a(ww9.d, kv1Var, av8Var2, 48);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, h);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a2, hf3.g);
            waa.K(av8Var2, m, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            yf8 yf8Var = xth.a;
            udj.c(upperCase, null, lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.c(), av8Var2, 0, 24960, 110586);
            udj.c(str2, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var2, (i2 >> 3) & 14, 24960, 110586);
            av8Var = av8Var2;
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new cv3(str, str2, xtcVar, i, 5);
        }
    }

    public static final void d(WorldCupLastDanceUiModel worldCupLastDanceUiModel, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        xtc xtcVar2;
        WorldCupLastDanceUiModel worldCupLastDanceUiModel2 = worldCupLastDanceUiModel;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(335442983);
        if ((i & 6) == 0) {
            i2 = i | (av8Var.g(worldCupLastDanceUiModel2) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            utc utcVar = utc.a;
            xtc A = wnn.A(bkh.d(utcVar, 1.0f), o7g.a(16.0f));
            long D = lz.D(R.color.surface_2, av8Var);
            jf9 jf9Var = oyn.e;
            xtc q = n9e.q(A, D, jf9Var);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, q);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            haa.b(worldCupLastDanceUiModel2.c, null, n9e.q(qx9.p(bkh.d(utcVar, 1.0f), 0.8f), lz.D(R.color.n_lv_4, av8Var), jf9Var), wv8.c(lz.D(R.color.n_lv_3, av8Var), 5, haa.t(R.drawable.sofascore_lockup, 0, av8Var), 12), wv8.c(lz.D(R.color.n_lv_3, av8Var), 5, haa.t(R.drawable.sofascore_lockup, 0, av8Var), 12), null, mp3.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 36912, 6, 31712);
            xtc f0 = l98.f0(utcVar, 16.0f, 16.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
            String str = worldCupLastDanceUiModel2.d;
            yf8 yf8Var = xth.a;
            xtcVar2 = utcVar;
            udj.c(str, f0, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var, 48, 0, 131064);
            worldCupLastDanceUiModel2 = worldCupLastDanceUiModel;
            udj.c(worldCupLastDanceUiModel2.e, l98.e0(xtcVar2, 16.0f, 4.0f, 16.0f, 16.0f), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var, 48, 0, 131064);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new nmi(worldCupLastDanceUiModel2, xtcVar2, i, 22);
        }
    }

    public static int e(int i, int i2) {
        return wv8.a(i, i2, 31);
    }

    public static void h(String str, boolean z) {
        if (z) {
            return;
        }
        a70.p(str);
    }

    public static void i(int i) {
        if (i >= 0) {
            return;
        }
        ilg.c();
    }

    public static void j(Object obj, String str) {
        if (obj != null) {
            return;
        }
        yhk.s(str);
    }

    public static void k(String str, boolean z) {
        if (z) {
            return;
        }
        a70.r(str);
    }

    public static final boolean l(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj != obj2 && !Intrinsics.c(obj, obj2)) {
                if (obj != null && obj2 != null) {
                    if ((obj instanceof Bundle) && (obj2 instanceof Bundle)) {
                        if (!l((Bundle) obj, (Bundle) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                        if (!kh0.b((Object[]) obj, (Object[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                        if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                        if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                        if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                        if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                        if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                        if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                        if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                        if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            return false;
                        }
                    } else if (!obj.equals(obj2)) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static final int m(Bundle bundle) {
        Iterator<String> it = bundle.keySet().iterator();
        int i = 1;
        while (it.hasNext()) {
            Object obj = bundle.get(it.next());
            i = (i * 31) + (obj instanceof Bundle ? m((Bundle) obj) : obj instanceof Object[] ? Arrays.deepHashCode((Object[]) obj) : obj instanceof byte[] ? Arrays.hashCode((byte[]) obj) : obj instanceof short[] ? Arrays.hashCode((short[]) obj) : obj instanceof int[] ? Arrays.hashCode((int[]) obj) : obj instanceof long[] ? Arrays.hashCode((long[]) obj) : obj instanceof float[] ? Arrays.hashCode((float[]) obj) : obj instanceof double[] ? Arrays.hashCode((double[]) obj) : obj instanceof char[] ? Arrays.hashCode((char[]) obj) : obj instanceof boolean[] ? Arrays.hashCode((boolean[]) obj) : obj != null ? obj.hashCode() : 0);
        }
        return i;
    }

    public static hz8 n(int i) {
        return i != 0 ? i != 1 ? new p7g() : new oa4() : new p7g();
    }

    public static InvocationHandler o() {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = c90.E();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, null).getClass().getClassLoader();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                is8.h(e2);
                return null;
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static String q(fl5 fl5Var, int i) {
        fl5Var.getClass();
        if (i <= 16777215) {
            return String.valueOf(i);
        }
        try {
            Context context = fl5Var.a;
            context.getClass();
            String resourceName = context.getResources().getResourceName(i);
            resourceName.getClass();
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i);
        }
    }

    public static Sequence t(s6d s6dVar) {
        s6dVar.getClass();
        return e5h.e(s6dVar, new clc(29));
    }

    public static final float u(aej aejVar, int i) {
        if (i < 0) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        zdj zdjVar = aejVar.a;
        eyc eycVar = aejVar.b;
        if (zdjVar.a.b.length() == 0) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        int min = Math.min(eycVar.d(i), Math.min(eycVar.b - 1, eycVar.f - 1));
        if (i > eycVar.c(min, false)) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        eycVar.m(min);
        ArrayList arrayList = eycVar.h;
        c8e c8eVar = (c8e) arrayList.get(qha.s(min, arrayList));
        x10 x10Var = c8eVar.a;
        int i2 = min - c8eVar.d;
        ydj ydjVar = x10Var.d;
        return ydjVar.e(i2) - ydjVar.h(i2);
    }

    public abstract boolean B(float f);

    public abstract boolean C(View view);

    public abstract boolean D(float f, float f2);

    public abstract boolean L(View view, float f);

    public abstract void S(ViewGroup.MarginLayoutParams marginLayoutParams, int i);

    public abstract void T(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2);

    public abstract void V(klo kloVar, Set set);

    public abstract int W(klo kloVar);

    public abstract int f(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float g(int i);

    public abstract int p(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int r();

    public abstract int s();

    public abstract int v();

    public abstract int w();

    public abstract int x(View view);

    public abstract int y(CoordinatorLayout coordinatorLayout);

    public abstract int z();
}
