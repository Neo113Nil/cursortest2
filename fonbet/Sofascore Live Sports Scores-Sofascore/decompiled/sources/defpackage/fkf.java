package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.NumberFormat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.app.NotificationCompat;
import com.appsflyer.internal.i;
import com.google.android.gms.internal.ads.s;
import com.google.android.gms.internal.ads.zzajc;
import com.google.android.gms.internal.ads.zzfv;
import com.google.android.gms.internal.ads.zzgxj;
import com.google.android.gms.internal.ads.zzgxm;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.ironsource.InterfaceC4060ee;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.local_persistance.BrandingConfig;
import com.sofascore.local_persistance.BrandingFantasyCompetition;
import com.sofascore.model.fantasy.FantasyCompetition;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.fantasy.FantasyPlayerPriceChanges;
import com.sofascore.model.fantasy.FantasyRound;
import com.sofascore.model.fantasy.FantasyUserCompetition;
import com.sofascore.model.mvvm.model.FieldTranslations;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.base.BaseActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty0;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class fkf {
    public static final tc3 a = new tc3(-1821061460, new ed3(12), false);
    public static final tc3 b = new tc3(1038089412, new gd3(1), false);
    public static final tc3 c = new tc3(537781408, new pr1(9), false);
    public static final String[] d = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] e = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] f = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};
    public static final /* synthetic */ int g = 0;
    public static final /* synthetic */ int h = 0;
    public static final /* synthetic */ int i = 0;
    public static final /* synthetic */ int j = 0;

    public static ImageView.ScaleType B(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 5 ? i2 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static final void D(yma ymaVar, ia5 ia5Var, float f2) {
        long floatToRawIntBits;
        int floatToRawIntBits2;
        v7b s;
        float H0 = ymaVar.H0(f2);
        wj2 wj2Var = ymaVar.a;
        int ordinal = ia5Var.ordinal();
        float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (ordinal == 0 || ordinal == 1) {
            floatToRawIntBits = Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            floatToRawIntBits2 = Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else if (ordinal == 2) {
            floatToRawIntBits = Float.floatToRawIntBits(Float.intBitsToFloat((int) (wj2Var.n() >> 32)) - H0);
            floatToRawIntBits2 = Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else if (ordinal != 3) {
            zzl.b();
            return;
        } else {
            float intBitsToFloat = Float.intBitsToFloat((int) (wj2Var.n() & 4294967295L)) - H0;
            floatToRawIntBits = Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat);
        }
        long j2 = (floatToRawIntBits << 32) | (floatToRawIntBits2 & 4294967295L);
        int ordinal2 = ia5Var.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 != 1) {
                if (ordinal2 != 2) {
                    if (ordinal2 != 3) {
                        zzl.b();
                        return;
                    }
                }
            }
            List j3 = b.j(new r13(r13.h), new r13(r13.b));
            ia5 ia5Var2 = ia5.b;
            if (ia5Var != ia5Var2) {
                f3 = Float.intBitsToFloat((int) (wj2Var.n() & 4294967295L));
            }
            s = wxf.E(j3, f3, ia5Var == ia5Var2 ? H0 : Float.intBitsToFloat((int) (wj2Var.n() & 4294967295L)) - H0, 8);
            ha5.g0(ymaVar, s, j2, (Float.floatToRawIntBits(H0) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (wj2Var.n() & 4294967295L))) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 6, 56);
        }
        List j4 = b.j(new r13(r13.h), new r13(r13.b));
        ia5 ia5Var3 = ia5.a;
        if (ia5Var != ia5Var3) {
            f3 = Float.intBitsToFloat((int) (wj2Var.n() >> 32));
        }
        s = wxf.s(j4, f3, ia5Var == ia5Var3 ? H0 : Float.intBitsToFloat((int) (wj2Var.n() >> 32)) - H0, 8);
        ha5.g0(ymaVar, s, j2, (Float.floatToRawIntBits(H0) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (wj2Var.n() & 4294967295L))) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 6, 56);
    }

    public static void E(yk0 yk0Var) {
        if (yk0.i == null) {
            yk0.i = new yk0();
            vk0 vk0Var = new vk0("Okio Watchdog");
            vk0Var.setDaemon(true);
            vk0Var.start();
        }
        long nanoTime = System.nanoTime();
        long j2 = yk0Var.c;
        boolean z = yk0Var.a;
        if (j2 != 0 && z) {
            yk0Var.g = Math.min(j2, yk0Var.c() - nanoTime) + nanoTime;
        } else if (j2 != 0) {
            yk0Var.g = nanoTime + j2;
        } else {
            if (!z) {
                ogj.b();
                return;
            }
            yk0Var.g = yk0Var.c();
        }
        yz1 yz1Var = yk0.h;
        int i2 = yz1Var.b + 1;
        yz1Var.b = i2;
        yk0[] yk0VarArr = (yk0[]) yz1Var.c;
        if (i2 == yk0VarArr.length) {
            yk0[] yk0VarArr2 = new yk0[i2 * 2];
            mh0.i(0, 0, 14, yk0VarArr, yk0VarArr2);
            yz1Var.c = yk0VarArr2;
        }
        yz1Var.c(i2, yk0Var);
        if (yk0Var.f == 1) {
            yk0.k.signal();
        }
    }

    public static final boolean F(Boolean bool) {
        return Intrinsics.c(bool, Boolean.TRUE);
    }

    public static final xtc G(xtc xtcVar, KProperty0 kProperty0, ira iraVar, ewd ewdVar, boolean z) {
        return xtcVar.z(new lra(kProperty0, iraVar, ewdVar, z));
    }

    public static final void H(bnf bnfVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1357976708);
        int i3 = (av8Var.e(bnfVar.ordinal()) ? 4 : 2) | i2;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            jca.c(bnfVar, null, new fa(28, new esf(), (Context) av8Var.k(nz.b), bnfVar), av8Var, i3 & 14);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new fv2(bnfVar, i2, 19);
        }
    }

    public static ze3 I(Context context, View view, bnh bnhVar) {
        context.getClass();
        view.getClass();
        bnhVar.getClass();
        ViewGroup a0 = td4.a0(view);
        if (a0 == null) {
            return null;
        }
        cf3 cf3Var = new cf3(context);
        ComposeView composeView = new ComposeView(context, null, 6);
        composeView.setContent(new tc3(2038836438, new af3(bnhVar), true));
        cf3Var.addView(composeView);
        ze3 ze3Var = new ze3(a0.getContext(), a0, cf3Var, cf3Var);
        m71 m71Var = ze3Var.i;
        m71Var.setBackgroundColor(m71Var.getContext().getColor(R.color.transparent));
        m71Var.setPadding(0, 0, 0, 0);
        ze3Var.k = 2000;
        return ze3Var;
    }

    public static void K(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
        Drawable mutate = drawable.mutate();
        mutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    public static void L(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = onLongClickListener != null;
        boolean z2 = hasOnClickListeners || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        checkableImageButton.setImportantForAccessibility(z2 ? 1 : 2);
    }

    public static final xtc M(Function2 function2) {
        return new i8j(function2);
    }

    public static final ev6 N(FantasyCompetition fantasyCompetition, Context context) {
        Integer num;
        BrandingFantasyCompetition brandingFantasyCompetition;
        boolean z;
        Map<String, BrandingFantasyCompetition> fantasyCompetitions;
        fantasyCompetition.getClass();
        int id = fantasyCompetition.getId();
        FantasyCompetitionType type = fantasyCompetition.getType();
        String name = fantasyCompetition.getName();
        String competitionColor = fantasyCompetition.getCompetitionColor();
        int parseColor = Color.parseColor("#374DF5");
        if (competitionColor != null) {
            try {
                parseColor = Color.parseColor(competitionColor);
            } catch (Exception unused) {
            }
        }
        int argb = Color.argb(102, Color.red(parseColor), Color.green(parseColor), Color.blue(parseColor));
        String name2 = fantasyCompetition.getCategory().getName();
        int id2 = fantasyCompetition.getCategory().getId();
        String slug = fantasyCompetition.getCategory().getSport().getSlug();
        FantasyRound previousRound = fantasyCompetition.getPreviousRound();
        Integer valueOf = previousRound != null ? Integer.valueOf(previousRound.getId()) : null;
        FantasyRound nextRound = fantasyCompetition.getNextRound();
        Integer valueOf2 = nextRound != null ? Integer.valueOf(nextRound.getId()) : null;
        int id3 = fantasyCompetition.getCurrentRound().getId();
        long deadlineTimestamp = fantasyCompetition.getCurrentRound().getDeadlineTimestamp();
        Long scoreUpdatedAtTimestamp = fantasyCompetition.getScoreUpdatedAtTimestamp();
        int roundCount = fantasyCompetition.getRoundCount();
        int currentRoundSequence = fantasyCompetition.getCurrentRoundSequence();
        long totalPlayers = fantasyCompetition.getTotalPlayers();
        String rules = fantasyCompetition.getRules();
        Float averageScore = fantasyCompetition.getAverageScore();
        float floatValue = averageScore != null ? averageScore.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        boolean c2 = Intrinsics.c(fantasyCompetition.getFinished(), Boolean.TRUE);
        int maxPlayersFromSameTeam = fantasyCompetition.getCurrentRound().getMaxPlayersFromSameTeam();
        boolean isAlpha = fantasyCompetition.isAlpha();
        mj7 K = pd0.K(fantasyCompetition.getCurrentRound());
        FantasyRound nextRound2 = fantasyCompetition.getNextRound();
        mj7 K2 = nextRound2 != null ? pd0.K(nextRound2) : null;
        FantasyRound previousRound2 = fantasyCompetition.getPreviousRound();
        mj7 K3 = previousRound2 != null ? pd0.K(previousRound2) : null;
        boolean official = fantasyCompetition.getOfficial();
        String officialPartnerName = fantasyCompetition.getOfficialPartnerName();
        boolean officialAssetsRestricted = fantasyCompetition.getOfficialAssetsRestricted();
        UniqueTournament uniqueTournament = fantasyCompetition.getUniqueTournament();
        Integer valueOf3 = uniqueTournament != null ? Integer.valueOf(uniqueTournament.getId()) : null;
        Season season = fantasyCompetition.getSeason();
        String year = season != null ? season.getYear() : null;
        Integer globalLeagueId = fantasyCompetition.getGlobalLeagueId();
        int id4 = fantasyCompetition.getId();
        ia0 ia0Var = ia0.q;
        jca.G(ok3.p().e());
        BrandingConfig brandingConfig = ccd.b;
        if (brandingConfig == null || (fantasyCompetitions = brandingConfig.getFantasyCompetitions()) == null) {
            num = valueOf3;
            brandingFantasyCompetition = null;
        } else {
            num = valueOf3;
            brandingFantasyCompetition = fantasyCompetitions.get(String.valueOf(id4));
        }
        Integer num2 = num;
        boolean tripleCaptainAllowed = fantasyCompetition.getTripleCaptainAllowed();
        boolean wildcardAllowed = fantasyCompetition.getWildcardAllowed();
        boolean freeHitAllowed = fantasyCompetition.getFreeHitAllowed();
        long startTimestamp = fantasyCompetition.getStartTimestamp();
        boolean z2 = false;
        if (fantasyCompetition.getTripleCaptainRenewalSequence() != null) {
            z = false;
            z2 = true;
        } else {
            z = false;
        }
        return new ev6(id2, name2, id, type, name, argb, num2, slug, K, K2, K3, valueOf, valueOf2, id3, deadlineTimestamp, maxPlayersFromSameTeam, scoreUpdatedAtTimestamp, currentRoundSequence, roundCount, totalPlayers, rules, floatValue, c2, isAlpha, official, officialPartnerName, officialAssetsRestricted, globalLeagueId, year, brandingFantasyCompetition, tripleCaptainAllowed, wildcardAllowed, freeHitAllowed, z2, fantasyCompetition.getFreeHitRenewalSequence() == null ? z : true, fantasyCompetition.getWildcardRenewalSequence() != null ? true : z, startTimestamp, fantasyCompetition.getEndTimestamp());
    }

    public static final do7 O(FantasyUserCompetition fantasyUserCompetition, Context context) {
        fantasyUserCompetition.getClass();
        int id = fantasyUserCompetition.getId();
        String name = fantasyUserCompetition.getName();
        ev6 N = N(fantasyUserCompetition.getFantasyCompetition(), context);
        Integer score = fantasyUserCompetition.getScore();
        Integer currentRoundScore = fantasyUserCompetition.getCurrentRoundScore();
        Float averageScore = fantasyUserCompetition.getAverageScore();
        String userName = fantasyUserCompetition.getUserName();
        boolean z = fantasyUserCompetition.getTripleCaptains() > 0;
        return new do7(id, name, N, score, currentRoundScore, averageScore, userName, pd0.K(fantasyUserCompetition.getJoinedInRound()), fantasyUserCompetition.getWildcards() > 0, fantasyUserCompetition.getFreeHits() > 0, z, fantasyUserCompetition.getGlobalRank());
    }

    public static void P(CheckableImageButton checkableImageButton, CharSequence charSequence) {
        if (!checkableImageButton.isFocusable()) {
            charSequence = null;
        }
        checkableImageButton.setTooltipText(charSequence);
    }

    public static s Q(XmlPullParser xmlPullParser, String str, String str2) {
        mio mioVar = zzgxm.b;
        zzgxj zzgxjVar = new zzgxj();
        do {
            String concat = str.concat(":Item");
            xmlPullParser.next();
            if (zzfv.b(xmlPullParser, concat)) {
                String concat2 = str2.concat(":Mime");
                String concat3 = str2.concat(":Semantic");
                String concat4 = str2.concat(":Length");
                String concat5 = str2.concat(":Padding");
                String c2 = zzfv.c(xmlPullParser, concat2);
                String c3 = zzfv.c(xmlPullParser, concat3);
                String c4 = zzfv.c(xmlPullParser, concat4);
                String c5 = zzfv.c(xmlPullParser, concat5);
                if (c2 == null || c3 == null) {
                    return s.e;
                }
                zzgxjVar.c(new zzajc(c2, c4 != null ? Long.parseLong(c4) : 0L, c5 != null ? Long.parseLong(c5) : 0L));
            }
        } while (!zzfv.a(xmlPullParser, str.concat(":Directory")));
        return zzgxjVar.f();
    }

    public static final void a(final int i2, int i3, of3 of3Var, Function0 function0, final boolean z) {
        int i4;
        Function0 function02;
        boolean z2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-127996081);
        if ((i3 & 6) == 0) {
            i4 = (av8Var.e(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= av8Var.h(z) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= av8Var.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i4 & 1, (i4 & 147) != 146)) {
            function02 = function0;
            z2 = z;
            ao2.g(function02, wnn.A(bkh.l(utc.a, 32.0f), o7g.a(16.0f)), z2, null, null, yqo.H(-147162767, av8Var, new Function2() { // from class: a61
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5;
                    int i6;
                    of3 of3Var2 = (of3) obj;
                    int intValue = ((Integer) obj2).intValue();
                    av8 av8Var2 = (av8) of3Var2;
                    if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                        ImageVector N = s6a.N(i2, 6, av8Var2);
                        if (z) {
                            i5 = 310506532;
                            i6 = com.sofascore.results.R.color.primary_default;
                        } else {
                            i5 = 310507322;
                            i6 = com.sofascore.results.R.color.n_lv_4;
                        }
                        kq9.b(N, null, bkh.l(utc.a, 24.0f), ljg.f(av8Var2, i5, i6, av8Var2, false), av8Var2, 432, 0);
                    } else {
                        av8Var2.W();
                    }
                    return Unit.a;
                }
            }), av8Var, ((i4 >> 6) & 14) | 1572864 | ((i4 << 3) & 896), 56);
        } else {
            function02 = function0;
            z2 = z;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new tx0(i2, z2, function02, i3);
        }
    }

    public static final void b(ss1 ss1Var, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var;
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-2130194116);
        int i4 = 2;
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.i(ss1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var2.T(i3 & 1, (i3 & 147) != 146)) {
            tc3 H = yqo.H(-385019627, av8Var2, new t21(ss1Var, 26));
            tc3 H2 = yqo.H(-1434229571, av8Var2, new os1(ss1Var, 3));
            boolean i5 = av8Var2.i(ss1Var) | ((i3 & 112) == 32);
            Object O = av8Var2.O();
            if (i5 || O == nf3.a) {
                O = new ps1(function1, ss1Var, i4);
                av8Var2.n0(O);
            }
            av8Var = av8Var2;
            v9g.c(xtcVar, H, H2, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, null, (Function0) O, av8Var, ((i3 >> 6) & 14) | 432, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new qs1(ss1Var, function1, xtcVar, i2, 1);
        }
    }

    public static final void c(String str, String str2, gv9 gv9Var, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        char c2;
        long f2;
        lv1 lv1Var = uxf.m;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-337503393);
        int i3 = i2 | (av8Var.g(str) ? 4 : 2) | (av8Var.g(str2) ? 32 : 16) | (av8Var.g(gv9Var) ? 256 : 128) | (av8Var.g(xtcVar) ? a.o : 1024);
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z = (i3 & 896) == 256;
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (z || O == a99Var) {
                O = CollectionsKt.l0(k13.s(gv9Var));
                av8Var.n0(O);
            }
            Double d2 = (Double) O;
            double doubleValue = d2 != null ? d2.doubleValue() : 0.0d;
            Context context = (Context) av8Var.k(nz.b);
            xtc c0 = l98.c0(n9e.q(bkh.d(xtcVar, 1.0f), lz.D(com.sofascore.results.R.color.surface_1, av8Var), o7g.a(16.0f)), 16.0f, 12.0f);
            u23 a2 = t23.a(new ng0(8.0f, true, new a70(6)), uxf.o, av8Var, 6);
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
            double d3 = doubleValue;
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            xtc xtcVar3 = utc.a;
            xtc f0 = l98.f0(bkh.d(xtcVar3, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7);
            l8g a3 = k8g.a(ww9.b, lv1Var, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, f0);
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
            String v = oea.v(com.sofascore.results.R.string.result_probability, av8Var);
            yf8 yf8Var = xth.a;
            boolean z2 = false;
            udj.c(v, new goa(1.0f, true), lz.D(com.sofascore.results.R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var, 0, 0, 131064);
            xtc l = bkh.l(xtcVar3, 24.0f);
            long D = lz.D(com.sofascore.results.R.color.n_lv_4, av8Var);
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O2;
            Object[] objArr = new Object[0];
            Object O3 = av8Var.O();
            if (O3 == a99Var) {
                O3 = b74.e;
                av8Var.n0(O3);
            }
            xtc y = tol.y(l, true, false, true, D, wzcVar, new e32((boh) o3a.N(objArr, (Function0) O3, av8Var, 48), context, str, str2), av8Var, 0);
            av8 av8Var2 = av8Var;
            int i4 = 6;
            kq9.b(s6a.N(com.sofascore.results.R.drawable.ic_info, 6, av8Var2), null, y, lz.D(com.sofascore.results.R.color.n_lv_1, av8Var2), av8Var2, 48, 0);
            av8Var2.s(true);
            av8Var2.d0(1875557942);
            Iterator<E> it = gv9Var.iterator();
            int i5 = 0;
            while (true) {
                boolean hasNext = it.hasNext();
                int i6 = com.sofascore.results.R.color.n_lv_3;
                String str3 = null;
                if (hasNext) {
                    Object next = it.next();
                    int i7 = i5 + 1;
                    if (i5 < 0) {
                        b.q();
                        throw null;
                    }
                    gv9 gv9Var2 = (gv9) next;
                    l8g a4 = k8g.a(new ng0(8.0f, true, new a70(i4)), lv1Var, av8Var2, 54);
                    int hashCode3 = Long.hashCode(av8Var2.T);
                    aee m3 = av8Var2.m();
                    xtc C3 = fqj.C(av8Var2, xtcVar3);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var2);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a4, hf3.g);
                    waa.K(av8Var2, m3, hf3.f);
                    waa.K(av8Var2, Integer.valueOf(hashCode3), hf3.j);
                    waa.J(av8Var2, hf3.k);
                    waa.K(av8Var2, C3, hf3.d);
                    xtc p = bkh.p(xtcVar3, 12.0f);
                    yf8 yf8Var2 = xth.a;
                    av8 av8Var3 = av8Var2;
                    udj.c(yid.e(3, null, Integer.valueOf((gv9Var.size() - 1) - i5)), p, lz.D(com.sofascore.results.R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.b(), av8Var3, 48, 0, 130040);
                    av8Var2 = av8Var3;
                    av8Var2.d0(-500011369);
                    Iterator<E> it2 = gv9Var2.iterator();
                    while (it2.hasNext()) {
                        double doubleValue2 = ((Number) it2.next()).doubleValue();
                        float a5 = d3 <= 0.0d ? 0.1f : (float) (((llf.a(doubleValue2, 0.0d, d3) / d3) * 0.9d) + 0.1d);
                        xtc e2 = fn0.e(1.0f, n9e.q(xtcVar3, lz.D(com.sofascore.results.R.color.surface_P, av8Var2), o7g.a(4.0f)), true);
                        k1c c3 = e12.c(uxf.c, false);
                        int hashCode4 = Long.hashCode(av8Var2.T);
                        aee m4 = av8Var2.m();
                        xtc C4 = fqj.C(av8Var2, e2);
                        if3.k7.getClass();
                        zg3 zg3Var3 = hf3.b;
                        av8Var2.h0();
                        if (av8Var2.S) {
                            av8Var2.l(zg3Var3);
                        } else {
                            av8Var2.q0();
                        }
                        waa.K(av8Var2, c3, hf3.g);
                        waa.K(av8Var2, m4, hf3.f);
                        waa.K(av8Var2, Integer.valueOf(hashCode4), hf3.j);
                        waa.J(av8Var2, hf3.k);
                        waa.K(av8Var2, C4, hf3.d);
                        if (doubleValue2 < 0.001d) {
                            doubleValue2 = 0.001d;
                        }
                        NumberFormat percentInstance = NumberFormat.getPercentInstance(dla.d());
                        percentInstance.setMinimumFractionDigits(1);
                        percentInstance.setMaximumFractionDigits(1);
                        String q = dmi.q(doubleValue2 < 0.001d ? "<" : "", percentInstance.format(doubleValue2));
                        yf8 yf8Var3 = xth.a;
                        dfj b2 = xth.b();
                        if (a5 > 0.8d) {
                            f2 = ljg.f(av8Var2, 323266268, com.sofascore.results.R.color.on_color_primary, av8Var2, false);
                            c2 = 1392;
                        } else {
                            c2 = 1392;
                            f2 = ljg.f(av8Var2, 323266903, com.sofascore.results.R.color.n_lv_1, av8Var2, false);
                        }
                        av8 av8Var4 = av8Var2;
                        q5a.w(q, l98.d0(n9e.q(bkh.d(xtcVar3, 1.0f), r13.c(lz.D(com.sofascore.results.R.color.primary_default, av8Var2), a5), o7g.a(4.0f)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1), f2, null, 0L, 0L, new p7j(3), 0L, 0, false, 1, 0, b2, av8Var4, 0, 24576, 113656);
                        av8Var2 = av8Var4;
                        av8Var2.s(true);
                    }
                    av8Var2.s(false);
                    av8Var2.s(true);
                    z2 = false;
                    i5 = i7;
                    i4 = 6;
                } else {
                    float f3 = 8.0f;
                    av8Var2.s(z2);
                    xtc f02 = l98.f0(bkh.d(xtcVar3, 1.0f), 20.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 6);
                    l8g a6 = k8g.a(ww9.i, uxf.l, av8Var2, 6);
                    int hashCode5 = Long.hashCode(av8Var2.T);
                    aee m5 = av8Var2.m();
                    xtc C5 = fqj.C(av8Var2, f02);
                    if3.k7.getClass();
                    zg3 zg3Var4 = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var4);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a6, hf3.g);
                    waa.K(av8Var2, m5, hf3.f);
                    waa.K(av8Var2, Integer.valueOf(hashCode5), hf3.j);
                    waa.J(av8Var2, hf3.k);
                    waa.K(av8Var2, C5, hf3.d);
                    av8Var2.d0(1522752115);
                    gv9 gv9Var3 = (gv9) CollectionsKt.firstOrNull(gv9Var);
                    int size = gv9Var3 != null ? gv9Var3.size() : 0;
                    int i8 = 0;
                    while (i8 < size) {
                        if (i8 != 0) {
                            xtcVar2 = xtcVar3;
                            xtcVar3 = l98.f0(xtcVar2, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                        } else {
                            xtcVar2 = xtcVar3;
                        }
                        yf8 yf8Var4 = xth.a;
                        av8 av8Var5 = av8Var2;
                        xtc xtcVar4 = xtcVar3;
                        xtcVar3 = xtcVar2;
                        udj.c(yid.e(3, str3, Integer.valueOf(i8)), xtcVar4, lz.D(i6, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var5, 0, 0, 131064);
                        av8Var2 = av8Var5;
                        i8++;
                        i6 = com.sofascore.results.R.color.n_lv_3;
                        str3 = null;
                        f3 = 8.0f;
                    }
                    av8Var2.s(false);
                    av8Var2.s(true);
                    l8g a7 = k8g.a(new ng0(8.0f, true, new a70(6)), lv1Var, av8Var2, 54);
                    int hashCode6 = Long.hashCode(av8Var2.T);
                    aee m6 = av8Var2.m();
                    xtc C6 = fqj.C(av8Var2, xtcVar3);
                    if3.k7.getClass();
                    zg3 zg3Var5 = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var5);
                    } else {
                        av8Var2.q0();
                    }
                    f50 f50Var4 = hf3.g;
                    waa.K(av8Var2, a7, f50Var4);
                    ff3 ff3Var2 = hf3.f;
                    waa.K(av8Var2, m6, ff3Var2);
                    Integer valueOf2 = Integer.valueOf(hashCode6);
                    f50 f50Var5 = hf3.j;
                    waa.K(av8Var2, valueOf2, f50Var5);
                    ry ryVar2 = hf3.k;
                    waa.J(av8Var2, ryVar2);
                    f50 f50Var6 = hf3.d;
                    waa.K(av8Var2, C6, f50Var6);
                    m(0, av8Var2, null);
                    yf8 yf8Var5 = xth.a;
                    av8 av8Var6 = av8Var2;
                    udj.c(oea.w(com.sofascore.results.R.string.result_probability_team_score, new Object[]{str}, av8Var2), null, lz.D(com.sofascore.results.R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.b(), av8Var6, 0, 0, 130042);
                    av8Var6.s(true);
                    l8g a8 = k8g.a(new ng0(8.0f, true, new a70(6)), lv1Var, av8Var6, 54);
                    int hashCode7 = Long.hashCode(av8Var6.T);
                    aee m7 = av8Var6.m();
                    xtc C7 = fqj.C(av8Var6, xtcVar3);
                    av8Var6.h0();
                    if (av8Var6.S) {
                        av8Var6.l(zg3Var5);
                    } else {
                        av8Var6.q0();
                    }
                    waa.K(av8Var6, a8, f50Var4);
                    waa.K(av8Var6, m7, ff3Var2);
                    bf3.s(hashCode7, av8Var6, f50Var5, av8Var6, ryVar2);
                    waa.K(av8Var6, C7, f50Var6);
                    l(0, av8Var6, null);
                    udj.c(oea.w(com.sofascore.results.R.string.result_probability_team_score, new Object[]{str2}, av8Var6), null, lz.D(com.sofascore.results.R.color.n_lv_3, av8Var6), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.b(), av8Var6, 0, 0, 130042);
                    av8Var = av8Var6;
                    av8Var.s(true);
                    av8Var.s(true);
                }
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ace(i2, 12, str, str2, gv9Var, xtcVar);
        }
    }

    public static final void d(f06 f06Var, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        xtc xtcVar2;
        gv9 gv9Var;
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(233732603);
        if ((i2 & 6) == 0) {
            i3 = i2 | ((i2 & 8) == 0 ? av8Var.g(f06Var) : av8Var.i(f06Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(function1) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if (av8Var.T(i4 & 1, (i4 & 147) != 146)) {
            Object k = av8Var.k(ngb.a);
            BaseActivity baseActivity = k instanceof BaseActivity ? (BaseActivity) k : null;
            if (baseActivity == null) {
                a70.r("Required value was null.");
                return;
            }
            bnf bnfVar = f06Var.e;
            h06 h06Var = f06Var.c;
            H(bnfVar, av8Var, 0);
            boolean g2 = av8Var.g(h06Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (g2 || O == a99Var) {
                O = Integer.valueOf(yid.m((h06Var == null || (gv9Var = h06Var.b) == null) ? null : Integer.valueOf(gv9Var.size())));
                av8Var.n0(O);
            }
            int intValue = ((Number) O).intValue();
            xtc J = lz.J(bkh.c, jaa.L(av8Var), null);
            t3e C = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 72.0f, 7);
            boolean i5 = av8Var.i(f06Var) | av8Var.e(intValue) | ((i4 & 112) == 32) | av8Var.i(baseActivity);
            Object O2 = av8Var.O();
            if (i5 || O2 == a99Var) {
                yx4 yx4Var = new yx4(f06Var, intValue, function1, baseActivity, 1);
                av8Var.n0(yx4Var);
                O2 = yx4Var;
            }
            v8a.a(J, null, C, null, null, null, false, null, (Function1) O2, av8Var, 100663680, 250);
            xtcVar2 = utc.a;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b30(f06Var, function1, xtcVar2, i2, 21);
        }
    }

    public static final void e(j17 j17Var, of3 of3Var, int i2) {
        j17Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1319285889);
        int i3 = (av8Var.g(j17Var) ? 4 : 2) | i2;
        int i4 = 0;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            wkn.a(Boolean.valueOf(j17Var.d), null, null, null, yqo.H(1513102114, av8Var, new g17(j17Var, i4)), av8Var, 24576, 14);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new jo6(j17Var, i2, 17);
        }
    }

    public static final void f(ho7 ho7Var, String str, Function1 function1, xtc xtcVar, gv9 gv9Var, of3 of3Var, int i2, int i3) {
        gv9 gv9Var2;
        int i4;
        xtc xtcVar2;
        gv9 gv9Var3;
        ho7Var.getClass();
        str.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-220183135);
        int i5 = (av8Var.g(ho7Var) ? 4 : 2) | i2 | (av8Var.g(str) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i5 |= av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i6 = i5 | 3072;
        int i7 = i3 & 16;
        if (i7 != 0) {
            i4 = i5 | 27648;
            gv9Var2 = gv9Var;
        } else {
            gv9Var2 = gv9Var;
            i4 = i6 | (av8Var.g(gv9Var2) ? 16384 : 8192);
        }
        if (av8Var.T(i4 & 1, (i4 & 9363) != 9362)) {
            if (i7 != 0) {
                gv9Var2 = null;
            }
            gv9 gv9Var4 = gv9Var2;
            Context context = (Context) av8Var.k(nz.b);
            mv1 mv1Var = uxf.g;
            utc utcVar = utc.a;
            xtc g2 = bkh.g(utcVar, 62.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = new yt6(25);
                av8Var.n0(O);
            }
            Function1 function12 = (Function1) O;
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = new yt6(26);
                av8Var.n0(O2);
            }
            l98.b(ho7Var, g2, function12, mv1Var, null, (Function1) O2, yqo.H(1300706734, av8Var, new nlj(3, gv9Var4, str, context, function1)), av8Var, 1772928 | (i4 & 14), 16);
            xtcVar2 = utcVar;
            gv9Var3 = gv9Var4;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
            gv9Var3 = gv9Var2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ei(i2, i3, 5, function1, xtcVar2, ho7Var, str, gv9Var3);
        }
    }

    public static final void g(FantasyPlayerPriceChanges fantasyPlayerPriceChanges, boolean z, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(468299527);
        int i3 = i2 | (av8Var.i(fantasyPlayerPriceChanges) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | 384;
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            long D = lz.D(com.sofascore.results.R.color.surface_2, av8Var);
            n7g a2 = o7g.a(8.0f);
            utc utcVar = utc.a;
            xtc c0 = l98.c0(n9e.q(utcVar, D, a2), 16.0f, 8.0f);
            k1c c2 = e12.c(uxf.c, false);
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
            waa.K(av8Var, c2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            h(fantasyPlayerPriceChanges, z, null, true, av8Var, (i3 & 14) | 3072 | (i3 & 112), 4);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t60((Object) fantasyPlayerPriceChanges, z, xtcVar2, i2, 10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(final FantasyPlayerPriceChanges fantasyPlayerPriceChanges, final boolean z, xtc xtcVar, boolean z2, of3 of3Var, final int i2, final int i3) {
        FantasyPlayerPriceChanges fantasyPlayerPriceChanges2;
        int i4;
        boolean z3;
        final xtc xtcVar2;
        final boolean z4;
        eqf u;
        xtc goaVar;
        String shortName;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1698274860);
        if ((i2 & 6) == 0) {
            fantasyPlayerPriceChanges2 = fantasyPlayerPriceChanges;
            i4 = (av8Var.i(fantasyPlayerPriceChanges2) ? 4 : 2) | i2;
        } else {
            fantasyPlayerPriceChanges2 = fantasyPlayerPriceChanges;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var.h(z) ? 32 : 16;
        }
        int i5 = i4 | 384;
        int i6 = i3 & 8;
        if (i6 != 0) {
            i5 = i4 | 3456;
        } else if ((i2 & 3072) == 0) {
            z3 = z2;
            i5 |= av8Var.h(z3) ? a.o : 1024;
            if (av8Var.T(i5 & 1, (i5 & 1171) == 1170)) {
                av8Var.W();
                xtcVar2 = xtcVar;
                z4 = z3;
            } else {
                if (i6 != 0) {
                    z3 = false;
                }
                Context context = (Context) av8Var.k(nz.b);
                lv1 lv1Var = uxf.m;
                wxf wxfVar = ww9.b;
                l8g a2 = k8g.a(wxfVar, lv1Var, av8Var, 48);
                int hashCode = Long.hashCode(av8Var.T);
                aee m = av8Var.m();
                utc utcVar = utc.a;
                xtc C = fqj.C(av8Var, utcVar);
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
                boolean z5 = z3;
                wnn.l(fantasyPlayerPriceChanges2.getFantasyPlayerId(), fantasyPlayerPriceChanges2.getTeamId(), z, bkh.l(utcVar, 40.0f), fantasyPlayerPriceChanges2.getPosition(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, av8Var, ((i5 << 3) & 896) | 3072, 224);
                nq8.h(av8Var, bkh.p(utcVar, 16.0f));
                if (z5) {
                    av8Var.d0(925233914);
                    goaVar = bkh.q(utcVar, 88.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    av8Var.s(false);
                } else {
                    av8Var.d0(-1077077415);
                    goaVar = new goa(1.0f, true);
                    av8Var.s(false);
                }
                p4h p4hVar = ww9.d;
                u23 a3 = t23.a(p4hVar, uxf.o, av8Var, 0);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C2 = fqj.C(av8Var, goaVar);
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
                FieldTranslations fieldTranslations = fantasyPlayerPriceChanges.getFieldTranslations();
                if (fieldTranslations == null || (shortName = tba.B(fieldTranslations)) == null) {
                    shortName = fantasyPlayerPriceChanges.getShortName();
                }
                yf8 yf8Var = xth.a;
                udj.c(shortName, null, lz.D(com.sofascore.results.R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var, 0, 24960, 110586);
                nq8.h(av8Var, bkh.e(utcVar, 4.0f));
                udj.c(fantasyPlayerPriceChanges.getTeamNameCode(), null, lz.D(com.sofascore.results.R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110586);
                i.o(av8Var, true, utcVar, 8.0f, av8Var);
                u23 a4 = t23.a(p4hVar, uxf.p, av8Var, 48);
                int hashCode3 = Long.hashCode(av8Var.T);
                aee m3 = av8Var.m();
                xtc C3 = fqj.C(av8Var, utcVar);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a4, f50Var);
                waa.K(av8Var, m3, ff3Var);
                bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
                waa.K(av8Var, C3, f50Var3);
                float fantasyPlayerFinalPrice = fantasyPlayerPriceChanges.getFantasyPlayerFinalPrice();
                context.getClass();
                Locale d2 = dla.d();
                Set set = o84.a;
                udj.c(String.format(d2, "%s%.1fM", Arrays.copyOf(new Object[]{o84.e(context), Float.valueOf(fantasyPlayerFinalPrice)}, 2)), null, lz.D(com.sofascore.results.R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var, 0, 24960, 110586);
                l8g a5 = k8g.a(wxfVar, lv1Var, av8Var, 48);
                int hashCode4 = Long.hashCode(av8Var.T);
                aee m4 = av8Var.m();
                xtc C4 = fqj.C(av8Var, utcVar);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a5, f50Var);
                waa.K(av8Var, m4, ff3Var);
                bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
                waa.K(av8Var, C4, f50Var3);
                long f2 = fantasyPlayerPriceChanges.getTotalPriceChange() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? ljg.f(av8Var, 1686906357, com.sofascore.results.R.color.success, av8Var, false) : fantasyPlayerPriceChanges.getTotalPriceChange() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? ljg.f(av8Var, 1686908595, com.sofascore.results.R.color.error, av8Var, false) : ljg.f(av8Var, 1686909842, com.sofascore.results.R.color.n_lv_3, av8Var, false);
                float totalPriceChange = fantasyPlayerPriceChanges.getTotalPriceChange();
                udj.c(String.format(dla.d(), (Double.compare(yid.s((double) totalPriceChange, 1), 0.0d) < 0 ? "-" : "+").concat("%.1f"), Arrays.copyOf(new Object[]{Float.valueOf(Math.abs(totalPriceChange))}, 1)), null, f2, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.g(), av8Var, 0, 24960, 110586);
                av8Var = av8Var;
                if (fantasyPlayerPriceChanges.getTotalPriceChange() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    av8Var.d0(755423609);
                    av8Var.s(false);
                } else {
                    av8Var.d0(755027119);
                    kq9.b(s6a.N(com.sofascore.results.R.drawable.ic_arrow_drop_down_16, 6, av8Var), null, haa.v(bkh.l(utcVar, 8.0f), fantasyPlayerPriceChanges.getTotalPriceChange() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 180.0f : 0.0f), f2, av8Var, 48, 0);
                    av8Var.s(false);
                }
                ljg.t(av8Var, true, true, true);
                z4 = z5;
                xtcVar2 = utcVar;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new Function2() { // from class: td7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        fkf.h(FantasyPlayerPriceChanges.this, z, xtcVar2, z4, (of3) obj, aba.K(i2 | 1), i3);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        z3 = z2;
        if (av8Var.T(i5 & 1, (i5 & 1171) == 1170)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void i(FantasyPlayerPriceChanges fantasyPlayerPriceChanges, Function1 function1, boolean z, xtc xtcVar, of3 of3Var, int i2) {
        fantasyPlayerPriceChanges.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1475178877);
        int i3 = i2 | (av8Var.i(fantasyPlayerPriceChanges) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | (av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(xtcVar) ? a.o : 1024);
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            xtc q = n9e.q(wnn.A(xtcVar, o7g.a(8.0f)), lz.D(com.sofascore.results.R.color.surface_2, av8Var), oyn.e);
            boolean i4 = ((i3 & 112) == 32) | av8Var.i(fantasyPlayerPriceChanges);
            Object O = av8Var.O();
            if (i4 || O == nf3.a) {
                O = new n37(10, (Object) fantasyPlayerPriceChanges, function1);
                av8Var.n0(O);
            }
            xtc c0 = l98.c0(tol.y(q, false, false, false, 0L, null, (Function0) O, av8Var, 31), 16.0f, 8.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
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
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            av8Var = av8Var;
            h(fantasyPlayerPriceChanges, z, null, false, av8Var, (i3 & 14) | ((i3 >> 3) & 112), 12);
            utc utcVar = utc.a;
            nq8.h(av8Var, bkh.e(utcVar, 16.0f));
            int i5 = 6;
            s02.n(bkh.d(utcVar, 1.0f), new ng0(4.0f, true, new a70(i5)), new ng0(4.0f, true, new a70(i5)), null, 0, 0, yqo.H(-1941318504, av8Var, new s16(fantasyPlayerPriceChanges, 15)), av8Var, 1573302, 56);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p81(fantasyPlayerPriceChanges, function1, z, xtcVar, i2, 9);
        }
    }

    public static final void j(oz6 oz6Var, boolean z, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        long f2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-113755261);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? av8Var.g(oz6Var) : av8Var.i(oz6Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            if (oz6Var.getB() == null) {
                av8Var.d0(-1944616594);
                av8Var.s(false);
                f2 = r13.h;
            } else {
                f2 = ljg.f(av8Var, -1944616052, com.sofascore.results.R.color.n_lv_3, av8Var, false);
            }
            yy6 b2 = oz6Var.getB();
            xtc z2 = Intrinsics.c(b2 != null ? Boolean.valueOf(b2.a) : null, Boolean.TRUE) ? xtcVar.z(n9e.q(utc.a, f2, oyn.e)) : xtcVar;
            av8Var.d0(-1003410150);
            av8Var.d0(212064437);
            av8Var.s(false);
            kx4 kx4Var = (kx4) av8Var.k(dh3.h);
            Object O = av8Var.O();
            Object obj = nf3.a;
            if (O == obj) {
                O = new t1c(kx4Var);
                av8Var.n0(O);
            }
            t1c t1cVar = (t1c) O;
            Object O2 = av8Var.O();
            if (O2 == obj) {
                O2 = new am3();
                av8Var.n0(O2);
            }
            am3 am3Var = (am3) O2;
            Object O3 = av8Var.O();
            if (O3 == obj) {
                O3 = e.f(Boolean.FALSE);
                av8Var.n0(O3);
            }
            e1d e1dVar = (e1d) O3;
            Object O4 = av8Var.O();
            if (O4 == obj) {
                O4 = new pm3(am3Var);
                av8Var.n0(O4);
            }
            pm3 pm3Var = (pm3) O4;
            Object O5 = av8Var.O();
            if (O5 == obj) {
                O5 = e.e(Unit.a, f7a.k);
                av8Var.n0(O5);
            }
            e1d e1dVar2 = (e1d) O5;
            boolean i4 = av8Var.i(t1cVar) | av8Var.e(257);
            Object O6 = av8Var.O();
            if (i4 || O6 == obj) {
                O6 = new kd3(e1dVar2, t1cVar, pm3Var, e1dVar, 6);
                av8Var.n0(O6);
            }
            k1c k1cVar = (k1c) O6;
            Object O7 = av8Var.O();
            int i5 = 6;
            if (O7 == obj) {
                O7 = new ld3(e1dVar, pm3Var, i5);
                av8Var.n0(O7);
            }
            Function0 function0 = (Function0) O7;
            boolean i6 = av8Var.i(t1cVar);
            Object O8 = av8Var.O();
            if (i6 || O8 == obj) {
                O8 = new md3(t1cVar, i5);
                av8Var.n0(O8);
            }
            s6a.h(o3h.a(z2, false, (Function1) O8), yqo.H(1200550679, av8Var, new qj8(e1dVar2, am3Var, function0, z)), k1cVar, av8Var, 48);
            av8Var.s(false);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new di(oz6Var, z, xtcVar, i2, 10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void k(oz6 oz6Var, boolean z, xtc xtcVar, Function1 function1, of3 of3Var, int i2) {
        xtc xtcVar2;
        long f2;
        int i3;
        long j2;
        int i4;
        int i5;
        long j3;
        yy6 b2;
        long j4;
        int i6;
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(804924317);
        int i7 = i2 | (av8Var.g(oz6Var) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | 384 | (av8Var.i(function1) ? 2048 : 1024);
        if (av8Var.T(i7 & 1, (i7 & 1171) != 1170)) {
            yy6 b3 = oz6Var.getB();
            int i8 = com.sofascore.results.R.color.n_lv_3;
            if (b3 == null) {
                av8Var.d0(438163752);
                av8Var.s(false);
                f2 = r13.h;
            } else {
                f2 = ljg.f(av8Var, 438164294, com.sofascore.results.R.color.n_lv_3, av8Var, false);
            }
            yy6 b4 = oz6Var.getB();
            int i9 = b4 == null ? -1 : rj8.a[b4.ordinal()];
            if (i9 == 1) {
                i3 = 438166795;
            } else if (i9 != 2) {
                i3 = 438168971;
            } else {
                j2 = ljg.f(av8Var, 438168134, com.sofascore.results.R.color.n_lv_1, av8Var, false);
                yy6 b5 = oz6Var.getB();
                i4 = b5 != null ? -1 : rj8.a[b5.ordinal()];
                if (i4 != 1) {
                    i5 = 438171568;
                    i8 = com.sofascore.results.R.color.primary_default;
                } else if (i4 != 2) {
                    i5 = 438174054;
                } else {
                    j3 = ljg.f(av8Var, 438173067, com.sofascore.results.R.color.on_color_primary, av8Var, false);
                    double doubleValue = ((Number) av8Var.k(thb.a)).doubleValue();
                    long j5 = f2;
                    float f3 = (float) (64.0d * doubleValue);
                    float f4 = (float) (68.0d * doubleValue);
                    yy6 b6 = oz6Var.getB();
                    float f5 = (float) (4.0d * doubleValue);
                    float f6 = (b6 == null && b6.a) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : (float) (2.0d * doubleValue);
                    float f7 = (float) (2.0d * doubleValue);
                    yf8 yf8Var = xth.a;
                    dfj k = xth.k();
                    long j6 = j3;
                    long j7 = xth.k().a.b;
                    v8a.l(j7);
                    long E = v8a.E(j7 & 1095216660480L, (float) (lfj.c(j7) * doubleValue));
                    long j8 = xth.k().b.c;
                    v8a.l(j8);
                    dfj a2 = dfj.a(k, 0L, E, null, null, 0L, null, 0, 0, v8a.E(j8 & 1095216660480L, (float) (lfj.c(j8) * doubleValue)), null, null, 0, 16646141);
                    dfj c2 = xth.c();
                    long j9 = xth.c().a.b;
                    v8a.l(j9);
                    long E2 = v8a.E(j9 & 1095216660480L, (float) (lfj.c(j9) * doubleValue));
                    long j10 = xth.c().b.c;
                    v8a.l(j10);
                    dfj a3 = dfj.a(c2, 0L, E2, null, null, 0L, null, 0, 0, v8a.E(j10 & 1095216660480L, (float) (lfj.c(j10) * doubleValue)), null, null, 0, 16646141);
                    kv1 kv1Var = uxf.p;
                    av8Var.d0(438202165);
                    boolean d2 = oz6Var.getD();
                    utc utcVar = utc.a;
                    xtc C = d2 ? u6h.C(utcVar, 0.5f) : utcVar;
                    if (!oz6Var.getD()) {
                        boolean z2 = ((i7 & 14) == 4) | ((i7 & 7168) == 2048);
                        Object O = av8Var.O();
                        if (z2 || O == nf3.a) {
                            i6 = 2;
                            O = new ij8(i6, function1, oz6Var);
                            av8Var.n0(O);
                        } else {
                            i6 = 2;
                        }
                        C = C.z(tol.n(utcVar, 0.9f, (Function0) O, i6));
                    }
                    av8Var.s(false);
                    b2 = oz6Var.getB();
                    if (Intrinsics.c(b2 != null ? Boolean.valueOf(b2.a) : null, Boolean.TRUE)) {
                        j4 = j6;
                        C = C.z(yso.o(utcVar, f7, j4, o7g.a(f5)));
                    } else {
                        j4 = j6;
                    }
                    xtc e2 = bkh.e(bkh.p(l98.b0(C, f7), f3), f4);
                    u23 a4 = t23.a(ww9.d, kv1Var, av8Var, 48);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C2 = fqj.C(av8Var, e2);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, a4, hf3.g);
                    waa.K(av8Var, m, hf3.f);
                    waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var, hf3.k);
                    j(oz6Var, z, ljg.g(av8Var, C2, hf3.d, 1.0f, true), av8Var, i7 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                    udj.c(oz6Var.getA().a, l98.d0(n9e.q(bkh.d(utcVar, 1.0f), j4, o7g.a(f6)), 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), j2, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, a2, av8Var, 0, 24960, 109560);
                    udj.c("", n9e.q(bkh.d(utcVar, 1.0f), j5, o7g.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f6, f6, 3)), 0L, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, a3, av8Var, 6, 24960, 109564);
                    av8Var = av8Var;
                    av8Var.s(true);
                    xtcVar2 = utcVar;
                }
                j3 = ljg.f(av8Var, i5, i8, av8Var, false);
                double doubleValue2 = ((Number) av8Var.k(thb.a)).doubleValue();
                long j52 = f2;
                float f32 = (float) (64.0d * doubleValue2);
                float f42 = (float) (68.0d * doubleValue2);
                yy6 b62 = oz6Var.getB();
                float f52 = (float) (4.0d * doubleValue2);
                float f62 = (b62 == null && b62.a) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : (float) (2.0d * doubleValue2);
                float f72 = (float) (2.0d * doubleValue2);
                yf8 yf8Var2 = xth.a;
                dfj k2 = xth.k();
                long j62 = j3;
                long j72 = xth.k().a.b;
                v8a.l(j72);
                long E3 = v8a.E(j72 & 1095216660480L, (float) (lfj.c(j72) * doubleValue2));
                long j82 = xth.k().b.c;
                v8a.l(j82);
                dfj a22 = dfj.a(k2, 0L, E3, null, null, 0L, null, 0, 0, v8a.E(j82 & 1095216660480L, (float) (lfj.c(j82) * doubleValue2)), null, null, 0, 16646141);
                dfj c22 = xth.c();
                long j92 = xth.c().a.b;
                v8a.l(j92);
                long E22 = v8a.E(j92 & 1095216660480L, (float) (lfj.c(j92) * doubleValue2));
                long j102 = xth.c().b.c;
                v8a.l(j102);
                dfj a32 = dfj.a(c22, 0L, E22, null, null, 0L, null, 0, 0, v8a.E(j102 & 1095216660480L, (float) (lfj.c(j102) * doubleValue2)), null, null, 0, 16646141);
                kv1 kv1Var2 = uxf.p;
                av8Var.d0(438202165);
                boolean d22 = oz6Var.getD();
                utc utcVar2 = utc.a;
                if (d22) {
                }
                if (!oz6Var.getD()) {
                }
                av8Var.s(false);
                b2 = oz6Var.getB();
                if (Intrinsics.c(b2 != null ? Boolean.valueOf(b2.a) : null, Boolean.TRUE)) {
                }
                xtc e22 = bkh.e(bkh.p(l98.b0(C, f72), f32), f42);
                u23 a42 = t23.a(ww9.d, kv1Var2, av8Var, 48);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C22 = fqj.C(av8Var, e22);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                }
                waa.K(av8Var, a42, hf3.g);
                waa.K(av8Var, m2, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode2), hf3.j);
                waa.J(av8Var, hf3.k);
                j(oz6Var, z, ljg.g(av8Var, C22, hf3.d, 1.0f, true), av8Var, i7 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                udj.c(oz6Var.getA().a, l98.d0(n9e.q(bkh.d(utcVar2, 1.0f), j4, o7g.a(f62)), 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), j2, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, a22, av8Var, 0, 24960, 109560);
                udj.c("", n9e.q(bkh.d(utcVar2, 1.0f), j52, o7g.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f62, f62, 3)), 0L, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, a32, av8Var, 6, 24960, 109564);
                av8Var = av8Var;
                av8Var.s(true);
                xtcVar2 = utcVar2;
            }
            j2 = ljg.f(av8Var, i3, com.sofascore.results.R.color.on_color_primary, av8Var, false);
            yy6 b52 = oz6Var.getB();
            if (b52 != null) {
            }
            if (i4 != 1) {
            }
            j3 = ljg.f(av8Var, i5, i8, av8Var, false);
            double doubleValue22 = ((Number) av8Var.k(thb.a)).doubleValue();
            long j522 = f2;
            float f322 = (float) (64.0d * doubleValue22);
            float f422 = (float) (68.0d * doubleValue22);
            yy6 b622 = oz6Var.getB();
            float f522 = (float) (4.0d * doubleValue22);
            float f622 = (b622 == null && b622.a) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : (float) (2.0d * doubleValue22);
            float f722 = (float) (2.0d * doubleValue22);
            yf8 yf8Var22 = xth.a;
            dfj k22 = xth.k();
            long j622 = j3;
            long j722 = xth.k().a.b;
            v8a.l(j722);
            long E32 = v8a.E(j722 & 1095216660480L, (float) (lfj.c(j722) * doubleValue22));
            long j822 = xth.k().b.c;
            v8a.l(j822);
            dfj a222 = dfj.a(k22, 0L, E32, null, null, 0L, null, 0, 0, v8a.E(j822 & 1095216660480L, (float) (lfj.c(j822) * doubleValue22)), null, null, 0, 16646141);
            dfj c222 = xth.c();
            long j922 = xth.c().a.b;
            v8a.l(j922);
            long E222 = v8a.E(j922 & 1095216660480L, (float) (lfj.c(j922) * doubleValue22));
            long j1022 = xth.c().b.c;
            v8a.l(j1022);
            dfj a322 = dfj.a(c222, 0L, E222, null, null, 0L, null, 0, 0, v8a.E(j1022 & 1095216660480L, (float) (lfj.c(j1022) * doubleValue22)), null, null, 0, 16646141);
            kv1 kv1Var22 = uxf.p;
            av8Var.d0(438202165);
            boolean d222 = oz6Var.getD();
            utc utcVar22 = utc.a;
            if (d222) {
            }
            if (!oz6Var.getD()) {
            }
            av8Var.s(false);
            b2 = oz6Var.getB();
            if (Intrinsics.c(b2 != null ? Boolean.valueOf(b2.a) : null, Boolean.TRUE)) {
            }
            xtc e222 = bkh.e(bkh.p(l98.b0(C, f722), f322), f422);
            u23 a422 = t23.a(ww9.d, kv1Var22, av8Var, 48);
            int hashCode22 = Long.hashCode(av8Var.T);
            aee m22 = av8Var.m();
            xtc C222 = fqj.C(av8Var, e222);
            if3.k7.getClass();
            zg3 zg3Var22 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
            }
            waa.K(av8Var, a422, hf3.g);
            waa.K(av8Var, m22, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode22), hf3.j);
            waa.J(av8Var, hf3.k);
            j(oz6Var, z, ljg.g(av8Var, C222, hf3.d, 1.0f, true), av8Var, i7 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            udj.c(oz6Var.getA().a, l98.d0(n9e.q(bkh.d(utcVar22, 1.0f), j4, o7g.a(f622)), 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), j2, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, a222, av8Var, 0, 24960, 109560);
            udj.c("", n9e.q(bkh.d(utcVar22, 1.0f), j522, o7g.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f622, f622, 3)), 0L, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, a322, av8Var, 6, 24960, 109564);
            av8Var = av8Var;
            av8Var.s(true);
            xtcVar2 = utcVar22;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p81(oz6Var, z, xtcVar2, function1, i2, 10);
        }
    }

    public static final void l(int i2, of3 of3Var, xtc xtcVar) {
        int i3;
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1299665148);
        int i4 = i2 | 6;
        if (av8Var.T(i4 & 1, (i4 & 3) != 2)) {
            long u = ((kx4) av8Var.k(dh3.h)).u(8.0f);
            float f2 = av8Var.k(dh3.n) == ema.b ? -1.0f : 1.0f;
            utc utcVar = utc.a;
            xtc l = bkh.l(utcVar, 24.0f);
            u23 a2 = t23.a(ww9.f, uxf.p, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, l);
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
            l8g a3 = k8g.a(new ng0(2.0f, true, new a70(6)), uxf.m, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
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
            yf8 yf8Var = xth.a;
            float f3 = f2;
            i3 = 3;
            udj.c(yid.e(3, null, 0), null, lz.D(com.sofascore.results.R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, dfj.a(xth.i(), 0L, u, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777213), av8Var, 0, 0, 131066);
            udj.c(yid.e(3, null, 1), null, lz.D(com.sofascore.results.R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, dfj.a(xth.i(), 0L, u, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777213), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            av8Var.s(true);
            xtcVar2 = utcVar;
            kq9.b(s6a.N(com.sofascore.results.R.drawable.ic_arrow_full_right, 6, av8Var), null, bkh.p(f6a.D(xtcVar2, f3, f3), 16.0f), lz.D(com.sofascore.results.R.color.n_lv_1, av8Var), av8Var, 48, 0);
            av8Var.s(true);
        } else {
            i3 = 3;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new l63(xtcVar2, i2, i3);
        }
    }

    public static final void m(int i2, of3 of3Var, xtc xtcVar) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1228905514);
        int i3 = i2 | 6;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            long u = ((kx4) av8Var.k(dh3.h)).u(8.0f);
            utc utcVar = utc.a;
            xtc l = bkh.l(utcVar, 24.0f);
            lv1 lv1Var = uxf.m;
            kg0 kg0Var = ww9.f;
            l8g a2 = k8g.a(kg0Var, lv1Var, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, l);
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
            kq9.b(s6a.N(com.sofascore.results.R.drawable.ic_arrow_full_up, 6, av8Var), null, bkh.e(utcVar, 16.0f), lz.D(com.sofascore.results.R.color.n_lv_1, av8Var), av8Var, 432, 0);
            xtc f0 = l98.f0(utcVar, 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            u23 a3 = t23.a(kg0Var, uxf.p, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, f0);
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
            yf8 yf8Var = xth.a;
            udj.c(yid.e(3, null, 1), null, lz.D(com.sofascore.results.R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, dfj.a(xth.i(), 0L, u, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777213), av8Var, 0, 0, 131066);
            udj.c(yid.e(3, null, 0), null, lz.D(com.sofascore.results.R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, dfj.a(xth.i(), 0L, u, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777213), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            av8Var.s(true);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new l63(xtcVar2, i2, 2);
        }
    }

    public static final void n(e9i e9iVar, i4f i4fVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(209461526);
        if ((i2 & 6) == 0) {
            i3 = i2 | (av8Var.g(e9iVar) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(i4fVar) ? 32 : 16;
        }
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            kv1 kv1Var = uxf.p;
            xtc d0 = l98.d0(bkh.c, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a2 = t23.a(ww9.d, kv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d0);
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
            ImageVector N = s6a.N(i4fVar.a ? com.sofascore.results.R.drawable.ic_predictor_medal : com.sofascore.results.R.drawable.ic_contributor_medal, 6, av8Var);
            utc utcVar = utc.a;
            wkn.l(N, bkh.d(utcVar, 0.65f), null, mp3.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 25008, 104);
            x23 x23Var = x23.a;
            nq8.h(av8Var, x23Var.a(48.0f, utcVar, true));
            String a3 = i4fVar.b.a(av8Var);
            yf8 yf8Var = xth.a;
            udj.c(a3, bkh.d(utcVar, 1.0f), lz.D(com.sofascore.results.R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.h(), av8Var, 48, 0, 130040);
            nq8.h(av8Var, x23Var.a(40.0f, utcVar, true));
            float a4 = e9iVar.a(InterfaceC4060ee.c.d, 1000);
            float f2 = (0.1f * a4) + 0.9f;
            String a5 = i4fVar.c.a(av8Var);
            dfj f3 = xth.f();
            long D = lz.D(com.sofascore.results.R.color.on_color_primary, av8Var);
            xtc d2 = bkh.d(utcVar, 1.0f);
            boolean d3 = av8Var.d(a4) | av8Var.d(f2);
            Object O = av8Var.O();
            if (d3 || O == nf3.a) {
                O = new n28(7, a4, f2);
                av8Var.n0(O);
            }
            udj.c(a5, s02.M(d2, (Function1) O), D, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, f3, av8Var, 0, 0, 130040);
            av8Var = av8Var;
            nq8.h(av8Var, x23Var.a(100.0f, utcVar, true));
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p8b(e9iVar, i4fVar, i2, 18);
        }
    }

    public static final void o(v23 v23Var, i4f i4fVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-113989844);
        if ((i2 & 6) == 0) {
            i3 = i2 | (av8Var.g(v23Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(i4fVar) ? 32 : 16;
        }
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            d7e t = haa.t(i4fVar.a ? com.sofascore.results.R.drawable.ic_predictor_medal : com.sofascore.results.R.drawable.ic_contributor_medal, 0, av8Var);
            utc utcVar = utc.a;
            wkn.k(t, null, bkh.d(utcVar, 0.65f), null, mp3.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 25016, 104);
            nq8.h(av8Var, v23Var.a(56.0f, utcVar, true));
            String a2 = i4fVar.f.a(av8Var);
            yf8 yf8Var = xth.a;
            udj.c(a2, bkh.d(utcVar, 1.0f), lz.D(com.sofascore.results.R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.h(), av8Var, 48, 0, 130040);
            nq8.h(av8Var, v23Var.a(40.0f, utcVar, true));
            udj.c(i4fVar.g.a(av8Var), bkh.d(utcVar, 1.0f), lz.D(com.sofascore.results.R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.f(), av8Var, 48, 0, 130040);
            av8Var = av8Var;
            nq8.h(av8Var, v23Var.a(146.0f, utcVar, true));
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p8b(v23Var, i4fVar, i2, 17);
        }
    }

    public static final void p(final gv9 gv9Var, int i2, int i3, final kch kchVar, Function1 function1, final Function1 function12, final Function1 function13, tc3 tc3Var, xtc xtcVar, of3 of3Var, int i4) {
        xtc xtcVar2;
        boolean z;
        boolean z2;
        int i5;
        Object obj;
        a99 a99Var;
        int i6;
        utc utcVar;
        int i7;
        final Context context;
        final ku3 ku3Var;
        final Map map;
        final pr4 pr4Var;
        Function0 function0;
        xtc xtcVar3;
        int i8;
        gv9Var.getClass();
        kchVar.getClass();
        function1.getClass();
        function12.getClass();
        function13.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1633812108);
        int i9 = i4 | (av8Var.g(gv9Var) ? 4 : 2) | (av8Var.e(i2) ? 32 : 16) | (av8Var.e(i3) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.e(kchVar.ordinal()) ? a.o : 1024) | (av8Var.i(function1) ? 16384 : 8192) | (av8Var.i(function12) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var.i(function13) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | 100663296;
        if (av8Var.T(i9 & 1, (38347923 & i9) != 38347922)) {
            Context context2 = (Context) av8Var.k(nz.b);
            Object O = av8Var.O();
            a99 a99Var2 = nf3.a;
            if (O == a99Var2) {
                O = hz8.G(g.a, av8Var);
                av8Var.n0(O);
            }
            ku3 ku3Var2 = (ku3) O;
            int i10 = i9 & 14;
            boolean z3 = i10 == 4;
            Object O2 = av8Var.O();
            if (z3 || O2 == a99Var2) {
                O2 = new b61(0, gv9Var);
                av8Var.n0(O2);
            }
            final pr4 b2 = c6e.b(i2, (Function0) O2, av8Var, (i9 >> 3) & 14, 2);
            boolean z4 = i10 == 4;
            Object O3 = av8Var.O();
            if (z4 || O3 == a99Var2) {
                O3 = new LinkedHashMap();
                av8Var.n0(O3);
            }
            final Map map2 = (Map) O3;
            xtc u0 = hkg.u0(n9e.q(bkh.c, lz.D(com.sofascore.results.R.color.surface_1, av8Var), oyn.e), hkg.o0(av8Var), false, 14);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, u0);
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
            utc utcVar2 = utc.a;
            xtc b0 = l98.b0(bkh.d(utcVar2, 1.0f), 16.0f);
            String v = oea.v(i3, av8Var);
            long D = lz.D(com.sofascore.results.R.color.n_lv_1, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, b0, D, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.e(), av8Var, 48, 0, 130040);
            f6a.a(b2, fn0.e(1.0f, bkh.d(utcVar2, 1.0f), true), l98.B(32.0f, 2), null, 0, 8.0f, uxf.m, null, false, null, null, null, yqo.H(-1681991509, av8Var, new c61(0, gv9Var, map2, tc3Var)), av8Var, 1769856, 24576, 16280);
            av8Var = av8Var;
            if (gv9Var.size() > 1) {
                av8Var.d0(-1039449970);
                Object a0 = CollectionsKt.a0(b2.k(), gv9Var);
                String str = a0 != null ? (String) function1.invoke(a0) : null;
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                boolean z5 = b2.k() > 0;
                z = true;
                boolean z6 = b2.k() < gv9Var.size() + (-1);
                boolean i11 = av8Var.i(ku3Var2) | av8Var.g(b2);
                Object O4 = av8Var.O();
                if (i11 || O4 == a99Var2) {
                    O4 = new d61(ku3Var2, b2, 0);
                    av8Var.n0(O4);
                }
                Function0 function02 = (Function0) O4;
                boolean i12 = av8Var.i(ku3Var2) | av8Var.g(b2) | (i10 == 4);
                Object O5 = av8Var.O();
                if (i12 || O5 == a99Var2) {
                    O5 = new mi(5, ku3Var2, b2, gv9Var);
                    av8Var.n0(O5);
                }
                s(0, av8Var, null, str2, function02, (Function0) O5, z5, z6);
                z2 = false;
                av8Var.s(false);
            } else {
                z = true;
                z2 = false;
                av8Var.d0(-1038763816);
                av8Var.s(false);
            }
            boolean g2 = av8Var.g(b2) | av8Var.i(map2) | (i10 != 4 ? z2 : z) | av8Var.i(ku3Var2) | av8Var.i(context2);
            int i13 = i9 & 7168;
            int i14 = i9 & 458752;
            boolean z7 = g2 | (i13 == 2048 ? z : z2) | (i14 == 131072 ? z : false);
            Object O6 = av8Var.O();
            if (z7 || O6 == a99Var2) {
                i5 = i9;
                a99Var = a99Var2;
                i6 = i10;
                utcVar = utcVar2;
                i7 = a.o;
                context = context2;
                ku3Var = ku3Var2;
                obj = new Function0() { // from class: u51
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        fkf.q(b2, map2, gv9Var, ku3Var, new f61(context, kchVar, function12, null, 0));
                        return Unit.a;
                    }
                };
                map = map2;
                pr4Var = b2;
                av8Var.n0(obj);
            } else {
                i5 = i9;
                obj = O6;
                a99Var = a99Var2;
                map = map2;
                i6 = i10;
                utcVar = utcVar2;
                i7 = a.o;
                pr4Var = b2;
                context = context2;
                ku3Var = ku3Var2;
            }
            Function0 function03 = (Function0) obj;
            boolean g3 = av8Var.g(pr4Var) | av8Var.i(map) | (i6 == 4) | av8Var.i(ku3Var) | av8Var.i(context) | (i13 == i7) | (i14 == 131072) | ((3670016 & i5) == 1048576);
            Object O7 = av8Var.O();
            if (g3 || O7 == a99Var) {
                function0 = function03;
                final ku3 ku3Var3 = ku3Var;
                xtcVar3 = null;
                i8 = 0;
                Function0 function04 = new Function0() { // from class: v51
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        fkf.q(pr4Var, map, gv9Var, ku3Var3, new g61(context, kchVar, function12, function13, null));
                        return Unit.a;
                    }
                };
                av8Var.n0(function04);
                O7 = function04;
            } else {
                function0 = function03;
                xtcVar3 = null;
                i8 = 0;
            }
            r(i8, av8Var, xtcVar3, function0, (Function0) O7);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new w51(gv9Var, i2, i3, kchVar, function1, function12, function13, tc3Var, xtcVar2, i4);
        }
    }

    public static final void q(a6e a6eVar, Map map, gv9 gv9Var, ku3 ku3Var, ct8 ct8Var) {
        Object a0;
        int k = a6eVar.k();
        n29 n29Var = (n29) map.get(Integer.valueOf(k));
        if (n29Var == null || (a0 = CollectionsKt.a0(k, gv9Var)) == null) {
            return;
        }
        xw3.L(ku3Var, null, null, new g2(n29Var, ct8Var, a0, (rq3) null, 14), 3);
    }

    public static final void r(int i2, of3 of3Var, xtc xtcVar, Function0 function0, Function0 function02) {
        av8 av8Var;
        xtc xtcVar2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(2000043536);
        int i3 = i2 | (av8Var2.i(function0) ? 4 : 2) | (av8Var2.i(function02) ? 32 : 16) | 384;
        if (av8Var2.T(i3 & 1, (i3 & 147) != 146)) {
            uxf uxfVar = ww9.c;
            lv1 lv1Var = uxf.m;
            utc utcVar = utc.a;
            xtc c0 = l98.c0(n9e.q(fz8.Y(bkh.d(utcVar, 1.0f), n9a.b), lz.D(com.sofascore.results.R.color.surface_P, av8Var2), oyn.e), 16.0f, 8.0f);
            l8g a2 = k8g.a(uxfVar, lv1Var, av8Var2, 54);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, c0);
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
            kq9.b(s6a.N(com.sofascore.results.R.drawable.ic_download, 6, av8Var2), null, l98.b0(tol.y(yso.o(wnn.A(qx9.p(bkh.e(utcVar, 36.0f), 1.0f), o7g.a(4.0f)), 1.0f, lz.D(com.sofascore.results.R.color.primary_default, av8Var2), o7g.a(4.0f)), false, false, false, 0L, null, function0, av8Var2, 31), 8.0f), lz.D(com.sofascore.results.R.color.primary_default, av8Var2), av8Var2, 48, 0);
            mha.h(fc6.f(16.0f, com.sofascore.results.R.string.share_image, av8Var2, av8Var2, utcVar), function02, bkh.e(utcVar, 36.0f), null, new bqh(s6a.N(com.sofascore.results.R.drawable.ic_menu_list_share, 6, av8Var2), uxf.q), false, false, false, 0L, 0, 0, av8Var2, (i3 & 112) | 384, 0, 2024);
            av8Var = av8Var2;
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new x51(function0, function02, xtcVar2, i2, 0);
        }
    }

    public static final void s(int i2, of3 of3Var, xtc xtcVar, String str, Function0 function0, Function0 function02, boolean z, boolean z2) {
        av8 av8Var;
        xtc xtcVar2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-850759124);
        int i3 = i2 | (av8Var2.g(str) ? 4 : 2) | (av8Var2.h(z) ? 32 : 16) | (av8Var2.h(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.i(function0) ? a.o : 1024) | (av8Var2.i(function02) ? 16384 : 8192) | 196608;
        if (av8Var2.T(i3 & 1, (74899 & i3) != 74898)) {
            lv1 lv1Var = uxf.m;
            utc utcVar = utc.a;
            xtc c0 = l98.c0(n9e.q(bkh.d(utcVar, 1.0f), lz.D(com.sofascore.results.R.color.surface_1, av8Var2), oyn.e), 16.0f, 4.0f);
            l8g a2 = k8g.a(ww9.b, lv1Var, av8Var2, 48);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, c0);
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
            int i4 = i3 >> 3;
            a(com.sofascore.results.R.drawable.ic_chevron_left, (i3 & 112) | (i4 & 896), av8Var2, function0, z);
            xtc d0 = l98.d0(new goa(1.0f, true), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            yf8 yf8Var = xth.a;
            xtcVar2 = utcVar;
            udj.c(str, d0, lz.D(com.sofascore.results.R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.l(), av8Var2, i3 & 14, 24960, 109560);
            av8Var = av8Var2;
            a(com.sofascore.results.R.drawable.ic_chevron_right, ((i3 >> 6) & 896) | (i4 & 112), av8Var, function02, z2);
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t51(i2, xtcVar2, str, function0, function02, z, z2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ae, code lost:
    
        if ((r44 & 32) != 0) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(String str, String str2, xtc xtcVar, dfj dfjVar, long j2, long j3, of3 of3Var, int i2, int i3) {
        dfj dfjVar2;
        int i4;
        long j4;
        int i5;
        long j5;
        int i6;
        int i7;
        av8 av8Var;
        dfj dfjVar3;
        long j6;
        long j7;
        eqf u;
        str.getClass();
        str2.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(434581291);
        int i8 = i2 | (av8Var2.g(str) ? 4 : 2) | (av8Var2.g(str2) ? 32 : 16) | (av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if ((i3 & 8) == 0) {
            dfjVar2 = dfjVar;
            if (av8Var2.g(dfjVar2)) {
                i4 = a.o;
                int i9 = i8 | i4;
                if ((i3 & 16) != 0) {
                    j4 = j2;
                    if (av8Var2.f(j4)) {
                        i5 = 16384;
                        int i10 = i9 | i5;
                        if ((i3 & 32) == 0) {
                            j5 = j3;
                            if (av8Var2.f(j5)) {
                                i6 = 131072;
                                i7 = i10 | i6;
                                if (av8Var2.T(i7 & 1, (74899 & i7) == 74898)) {
                                    av8Var = av8Var2;
                                    av8Var.W();
                                    dfjVar3 = dfjVar2;
                                    j6 = j4;
                                    j7 = j5;
                                } else {
                                    av8Var2.Y();
                                    if ((i2 & 1) == 0 || av8Var2.B()) {
                                        if ((i3 & 8) != 0) {
                                            yf8 yf8Var = xth.a;
                                            dfjVar2 = xth.j();
                                            i7 &= -7169;
                                        }
                                        if ((i3 & 16) != 0) {
                                            j4 = lz.D(com.sofascore.results.R.color.on_color_primary, av8Var2);
                                            i7 &= -57345;
                                        }
                                        if ((i3 & 32) != 0) {
                                            j5 = lz.D(com.sofascore.results.R.color.on_color_primary, av8Var2);
                                            i7 &= -458753;
                                        }
                                        dfj dfjVar4 = dfjVar2;
                                        long j8 = j5;
                                        av8Var2.t();
                                        int i11 = i7 >> 6;
                                        u23 a2 = t23.a(ww9.d, uxf.p, av8Var2, 48);
                                        int hashCode = Long.hashCode(av8Var2.T);
                                        aee m = av8Var2.m();
                                        xtc C = fqj.C(av8Var2, xtcVar);
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
                                        udj.c(str2, null, j4, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, dfjVar4, av8Var2, ((i7 >> 3) & 14) | (i11 & 896), ((i7 << 12) & 29360128) | 24960, 110586);
                                        String upperCase = str.toUpperCase(Locale.ROOT);
                                        upperCase.getClass();
                                        yf8 yf8Var2 = xth.a;
                                        udj.c(upperCase, null, j8, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.c(), av8Var2, (i7 >> 9) & 896, 24960, 110586);
                                        av8Var = av8Var2;
                                        av8Var.s(true);
                                        j7 = j8;
                                        j6 = j4;
                                        dfjVar3 = dfjVar4;
                                    } else {
                                        av8Var2.W();
                                        if ((i3 & 8) != 0) {
                                            i7 &= -7169;
                                        }
                                        if ((i3 & 16) != 0) {
                                            i7 &= -57345;
                                        }
                                    }
                                }
                                u = av8Var.u();
                                if (u == null) {
                                    u.d = new h17(str, str2, xtcVar, dfjVar3, j6, j7, i2, i3);
                                    return;
                                }
                                return;
                            }
                        } else {
                            j5 = j3;
                        }
                        i6 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                        i7 = i10 | i6;
                        if (av8Var2.T(i7 & 1, (74899 & i7) == 74898)) {
                        }
                        u = av8Var.u();
                        if (u == null) {
                        }
                    }
                } else {
                    j4 = j2;
                }
                i5 = 8192;
                int i102 = i9 | i5;
                if ((i3 & 32) == 0) {
                }
                i6 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                i7 = i102 | i6;
                if (av8Var2.T(i7 & 1, (74899 & i7) == 74898)) {
                }
                u = av8Var.u();
                if (u == null) {
                }
            }
        } else {
            dfjVar2 = dfjVar;
        }
        i4 = 1024;
        int i92 = i8 | i4;
        if ((i3 & 16) != 0) {
        }
        i5 = 8192;
        int i1022 = i92 | i5;
        if ((i3 & 32) == 0) {
        }
        i6 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
        i7 = i1022 | i6;
        if (av8Var2.T(i7 & 1, (74899 & i7) == 74898)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static void u(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static IOException v(File file, IOException iOException) {
        StringBuilder sb = new StringBuilder("Inoperable file:");
        try {
            sb.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + ']');
        } catch (IOException unused) {
            sb.append(" failed to attach additional metadata");
        }
        return new IOException(sb.toString(), iOException);
    }

    public static IOException w(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        return parentFile == null ? v(file, iOException) : parentFile.exists() ? parentFile.isFile() ? parentFile.canRead() ? parentFile.canWrite() ? v(file, iOException) : v(file, iOException) : parentFile.canWrite() ? v(file, iOException) : v(file, iOException) : parentFile.canRead() ? parentFile.canWrite() ? v(file, iOException) : v(file, iOException) : parentFile.canWrite() ? v(file, iOException) : v(file, iOException) : v(file, iOException);
    }

    public static yk0 x() {
        yz1 yz1Var = yk0.h;
        yk0 yk0Var = ((yk0[]) yz1Var.c)[1];
        if (yk0Var == null) {
            long nanoTime = System.nanoTime();
            yk0.k.await(yk0.l, TimeUnit.MILLISECONDS);
            if (((yk0[]) yz1Var.c)[1] != null || System.nanoTime() - nanoTime < yk0.m) {
                return null;
            }
            return yk0.i;
        }
        long nanoTime2 = yk0Var.g - System.nanoTime();
        if (nanoTime2 > 0) {
            yk0.k.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        yz1Var.f(yk0Var);
        yk0Var.e = 2;
        return yk0Var;
    }

    public static final void y(db2 db2Var) {
        db2Var.getClass();
        db2Var.a(new IOException("Channel was cancelled"));
    }

    public static bt2 z(of3 of3Var) {
        g23 g23Var = (g23) ((av8) of3Var).k(i23.a);
        bt2 bt2Var = g23Var.a0;
        if (bt2Var != null) {
            return bt2Var;
        }
        long c2 = i23.c(g23Var, gt2.c);
        long j2 = r13.h;
        h23 h23Var = gt2.a;
        long c3 = i23.c(g23Var, h23Var);
        h23 h23Var2 = gt2.b;
        bt2 bt2Var2 = new bt2(c2, j2, c3, j2, r13.c(i23.c(g23Var, h23Var2), 0.38f), j2, r13.c(i23.c(g23Var, h23Var2), 0.38f), i23.c(g23Var, h23Var), i23.c(g23Var, gt2.f), r13.c(i23.c(g23Var, h23Var2), 0.38f), r13.c(i23.c(g23Var, gt2.e), 0.38f), r13.c(i23.c(g23Var, h23Var2), 0.38f));
        g23Var.a0 = bt2Var2;
        return bt2Var2;
    }

    public abstract void A(n33 n33Var, Set set);

    public abstract int C(n33 n33Var);

    public abstract int J();
}
