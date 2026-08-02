package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RotateDrawable;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.pal.zzjn;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.IRecent;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.SubTeam;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.MediaHighlightSummaryResponse;
import com.sofascore.model.network.response.MediaHighlightedItem;
import com.sofascore.model.newNetwork.IHighlightMediaItem;
import com.sofascore.model.newNetwork.newRankings.RankingRow;
import com.sofascore.results.R;
import com.sofascore.results.main.start.StartActivity;
import com.sofascore.results.ranking.RankingsActivity;
import com.sofascore.results.widget.ChangeNotificationStatus;
import com.sofascore.results.widget.HideFinishedAction;
import com.sofascore.results.widget.RefreshFavorites;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class haa {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public static final /* synthetic */ int e = 0;
    public static final /* synthetic */ int f = 0;
    public static final /* synthetic */ int g = 0;
    public static final /* synthetic */ int h = 0;

    public static final void A(TextView textView) {
        textView.getClass();
        textView.setTextColor(textView.getContext().getColor(R.color.error));
    }

    public static final void B(TextView textView) {
        textView.getClass();
        textView.setTextColor(textView.getContext().getColor(R.color.live));
    }

    public static final void C(TextView textView) {
        textView.getClass();
        textView.setTextColor(textView.getContext().getColor(R.color.n_lv_1));
    }

    public static final void D(TextView textView) {
        textView.getClass();
        textView.setTextColor(textView.getContext().getColor(R.color.n_lv_3));
    }

    public static final void E(TextView textView) {
        textView.getClass();
        textView.setTextColor(textView.getContext().getColor(R.color.on_color_primary));
    }

    public static final void F(TextView textView) {
        textView.getClass();
        textView.setTextColor(textView.getContext().getColor(R.color.on_color_secondary));
    }

    public static final void G(TextView textView) {
        textView.getClass();
        textView.setTextColor(textView.getContext().getColor(R.color.primary_default));
    }

    public static final void H(TextView textView) {
        textView.getClass();
        textView.setTextColor(textView.getContext().getColor(R.color.secondary_default));
    }

    public static final double I(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    public static final String J(int i, long j) {
        if (j >= 0) {
            String l = Long.toString(j, CharsKt.checkRadix(i));
            l.getClass();
            return l;
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        StringBuilder sb = new StringBuilder();
        String l2 = Long.toString(j3, CharsKt.checkRadix(i));
        l2.getClass();
        sb.append(l2);
        String l3 = Long.toString(j4, CharsKt.checkRadix(i));
        l3.getClass();
        sb.append(l3);
        return sb.toString();
    }

    public static final void K(TextView textView, Drawable drawable, ua5 ua5Var, Integer num, Integer num2) {
        textView.getClass();
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        compoundDrawablesRelative.getClass();
        int length = textView.getCompoundDrawablesRelative().length;
        int ordinal = ua5Var.ordinal();
        if (ordinal < 0 || ordinal >= length) {
            return;
        }
        compoundDrawablesRelative[ua5Var.ordinal()] = drawable;
        if (num != null) {
            int intValue = num.intValue();
            if (drawable != null) {
                drawable.setBounds(0, 0, intValue, num2 != null ? num2.intValue() : intValue);
            }
        }
        textView.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
    }

    public static final void L(TextView textView, Integer num, ua5 ua5Var, Integer num2) {
        textView.getClass();
        K(textView, num != null ? textView.getContext().getDrawable(num.intValue()) : null, ua5Var, num2, num2);
    }

    public static final void M(TextView textView, Drawable drawable, ua5 ua5Var) {
        textView.getClass();
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        compoundDrawablesRelative.getClass();
        int length = textView.getCompoundDrawablesRelative().length;
        int ordinal = ua5Var.ordinal();
        if (ordinal < 0 || ordinal >= length) {
            return;
        }
        compoundDrawablesRelative[ua5Var.ordinal()] = drawable;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(compoundDrawablesRelative[0], compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
    }

    public static final void N(TextView textView, CharSequence charSequence) {
        textView.getClass();
        textView.setText(charSequence);
        textView.setVisibility(charSequence == null || StringsKt.R(charSequence) ? 8 : 0);
    }

    public static final void a(Object obj, String str, xtc xtcVar, mv1 mv1Var, op3 op3Var, of3 of3Var, int i, int i2) {
        mv1 mv1Var2 = (i2 & 32) != 0 ? uxf.g : mv1Var;
        op3 op3Var2 = (i2 & 64) != 0 ? mp3.b : op3Var;
        av8 av8Var = (av8) of3Var;
        apf a2 = ajh.a((Context) av8Var.k(nz.b));
        int i3 = i << 3;
        int i4 = (i & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024) | (i3 & 1879048192);
        int i5 = i4 >> 3;
        s9a.a(new ek0(obj, (hj0) av8Var.k(rgb.a), a2), str, xtcVar, yj0.v, null, mv1Var2, op3Var2, 1.0f, av8Var, (i4 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & 458752) | (i5 & 3670016) | (i5 & 29360128) | (i5 & 234881024) | ((((i >> 27) & 14) << 27) & 1879048192), 0);
    }

    public static final void b(Object obj, String str, xtc xtcVar, d7e d7eVar, d7e d7eVar2, Function1 function1, op3 op3Var, float f2, of3 of3Var, int i, int i2, int i3) {
        d7e d7eVar3 = (i3 & 8) != 0 ? null : d7eVar;
        Function1 function12 = (i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : function1;
        mv1 mv1Var = uxf.g;
        op3 op3Var2 = (i3 & 1024) != 0 ? mp3.b : op3Var;
        float f3 = (i3 & a.o) != 0 ? 1.0f : f2;
        av8 av8Var = (av8) of3Var;
        apf a2 = ajh.a((Context) av8Var.k(nz.b));
        int i4 = i << 3;
        int i5 = (i & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | (i4 & 7168) | 32768 | (i4 & 57344) | 262144 | (i4 & 458752) | 2097152 | (i4 & 3670016) | (i4 & 29360128) | (i4 & 234881024) | (i4 & 1879048192);
        int i6 = i2 << 3;
        int i7 = (i6 & 458752) | ((i >> 27) & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (i6 & 57344);
        int i8 = i5 >> 3;
        ek0 ek0Var = new ek0(obj, (hj0) av8Var.k(rgb.a), a2);
        int i9 = bjk.b;
        int i10 = i7 << 15;
        s9a.a(ek0Var, str, xtcVar, (d7eVar3 == null && d7eVar2 == null && d7eVar2 == null) ? yj0.v : new ncj(8, d7eVar3, d7eVar2, d7eVar2), function12 != null ? new fuj(1, function12) : null, mv1Var, op3Var2, f3, av8Var, (i5 & 112) | (i8 & 896) | (i10 & 458752) | (i10 & 3670016) | (i10 & 29360128) | (i10 & 234881024) | (i10 & 1879048192), (i7 >> 15) & 14);
    }

    public static final void c(final daa daaVar, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var;
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-521637848);
        final int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (av8Var2.g(daaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        final int i4 = 1;
        if (av8Var2.T(i2 & 1, (i2 & 147) != 146)) {
            tc3 H = yqo.H(-43506175, av8Var2, new faa(daaVar, r11));
            tc3 H2 = yqo.H(1262709161, av8Var2, new ct8() { // from class: gaa
                @Override // defpackage.ct8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    String str;
                    String valueOf;
                    String str2;
                    String str3;
                    int i5 = r2;
                    daa daaVar2 = daaVar;
                    switch (i5) {
                        case 0:
                            of3 of3Var2 = (of3) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            ((m12) obj).getClass();
                            av8 av8Var3 = (av8) of3Var2;
                            if (av8Var3.T(intValue & 1, (intValue & 17) != 16)) {
                                String str4 = daaVar2.i;
                                bx7 bx7Var = daaVar2.j;
                                String str5 = bx7Var.k;
                                Integer num = bx7Var.q;
                                Integer num2 = bx7Var.n;
                                Integer num3 = bx7Var.m;
                                fy7 fy7Var = bx7Var.h;
                                fy7 fy7Var2 = bx7Var.g;
                                if (!Intrinsics.c(str4, Sports.TENNIS) || fy7Var2 == null || fy7Var == null) {
                                    av8Var3.d0(2046197222);
                                    String str6 = (num3 == null || (valueOf = String.valueOf(num3.intValue())) == null) ? "" : valueOf;
                                    int intValue2 = num != null ? num.intValue() : 0;
                                    if (num2 == null || (str = String.valueOf(num2.intValue())) == null) {
                                        str = "";
                                    }
                                    String u = z8e.u((Context) av8Var3.k(nz.b), str5 != null ? str5 : "", str4, false);
                                    u.getClass();
                                    int i6 = fy7Var2 != null ? fy7Var2.a : 0;
                                    int i7 = fy7Var != null ? fy7Var.a : 0;
                                    String str7 = fy7Var2 != null ? fy7Var2.c : null;
                                    String str8 = fy7Var != null ? fy7Var.c : null;
                                    String str9 = bx7Var.o;
                                    String str10 = bx7Var.p;
                                    yf8 yf8Var = xth.a;
                                    l98.n(str6, intValue2, str, u, i6, i7, str7, str8, str9, str10, xth.h(), xth.e(), bx7Var.r, av8Var3, 0);
                                    av8Var3.s(false);
                                } else {
                                    av8Var3.d0(2045205129);
                                    fy7 fy7Var3 = bx7Var.g;
                                    fy7 fy7Var4 = bx7Var.h;
                                    if (num3 == null || (str2 = String.valueOf(num3.intValue())) == null) {
                                        str2 = "";
                                    }
                                    if (num2 == null || (str3 = String.valueOf(num2.intValue())) == null) {
                                        str3 = "";
                                    }
                                    int intValue3 = num != null ? num.intValue() : 0;
                                    String u2 = z8e.u((Context) av8Var3.k(nz.b), str5 != null ? str5 : "", str4, false);
                                    u2.getClass();
                                    boolean z = bx7Var.s;
                                    boolean z2 = bx7Var.r;
                                    long D = lz.D(R.color.on_color_primary, av8Var3);
                                    long D2 = lz.D(R.color.on_color_secondary, av8Var3);
                                    yf8 yf8Var2 = xth.a;
                                    l98.l(fy7Var3, fy7Var4, str2, str3, intValue3, u2, z, z2, null, D, D2, xth.h(), xth.e(), 48.0f, av8Var3, 0);
                                    av8Var3.s(false);
                                }
                            } else {
                                av8Var3.W();
                            }
                            break;
                        case 1:
                            v23 v23Var = (v23) obj;
                            of3 of3Var3 = (of3) obj2;
                            int intValue4 = ((Integer) obj3).intValue();
                            v23Var.getClass();
                            if ((intValue4 & 6) == 0) {
                                intValue4 |= ((av8) of3Var3).g(v23Var) ? 4 : 2;
                            }
                            av8 av8Var4 = (av8) of3Var3;
                            if (av8Var4.T(intValue4 & 1, (intValue4 & 19) != 18)) {
                                xtc c0 = l98.c0(n9e.q(l98.f0(v23Var.b(utc.a), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7), lz.D(R.color.on_color_highlight_1, av8Var4), o7g.a(16.0f)), 8.0f, 4.0f);
                                String str11 = daaVar2.k;
                                long D3 = lz.D(R.color.on_color_primary, av8Var4);
                                yf8 yf8Var3 = xth.a;
                                udj.c(str11, c0, D3, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var4, 0, 0, 131064);
                            } else {
                                av8Var4.W();
                            }
                            break;
                        default:
                            of3 of3Var4 = (of3) obj2;
                            int intValue5 = ((Integer) obj3).intValue();
                            ((m12) obj).getClass();
                            av8 av8Var5 = (av8) of3Var4;
                            if (av8Var5.T(intValue5 & 1, (intValue5 & 17) != 16)) {
                                bx7 bx7Var2 = daaVar2.j;
                                fy7 fy7Var5 = bx7Var2.g;
                                int i8 = fy7Var5 != null ? fy7Var5.a : 0;
                                fy7 fy7Var6 = bx7Var2.h;
                                int i9 = fy7Var6 != null ? fy7Var6.a : 0;
                                String str12 = daaVar2.i;
                                gvd.f(i8, i9, str12 == null ? "" : str12, bx7Var2.c, bx7Var2.b.intValue(), null, av8Var5, 0);
                            } else {
                                av8Var5.W();
                            }
                            break;
                    }
                    return Unit.a;
                }
            });
            tc3 H3 = yqo.H(2143905327, av8Var2, new ct8() { // from class: gaa
                @Override // defpackage.ct8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    String str;
                    String valueOf;
                    String str2;
                    String str3;
                    int i5 = i4;
                    daa daaVar2 = daaVar;
                    switch (i5) {
                        case 0:
                            of3 of3Var2 = (of3) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            ((m12) obj).getClass();
                            av8 av8Var3 = (av8) of3Var2;
                            if (av8Var3.T(intValue & 1, (intValue & 17) != 16)) {
                                String str4 = daaVar2.i;
                                bx7 bx7Var = daaVar2.j;
                                String str5 = bx7Var.k;
                                Integer num = bx7Var.q;
                                Integer num2 = bx7Var.n;
                                Integer num3 = bx7Var.m;
                                fy7 fy7Var = bx7Var.h;
                                fy7 fy7Var2 = bx7Var.g;
                                if (!Intrinsics.c(str4, Sports.TENNIS) || fy7Var2 == null || fy7Var == null) {
                                    av8Var3.d0(2046197222);
                                    String str6 = (num3 == null || (valueOf = String.valueOf(num3.intValue())) == null) ? "" : valueOf;
                                    int intValue2 = num != null ? num.intValue() : 0;
                                    if (num2 == null || (str = String.valueOf(num2.intValue())) == null) {
                                        str = "";
                                    }
                                    String u = z8e.u((Context) av8Var3.k(nz.b), str5 != null ? str5 : "", str4, false);
                                    u.getClass();
                                    int i6 = fy7Var2 != null ? fy7Var2.a : 0;
                                    int i7 = fy7Var != null ? fy7Var.a : 0;
                                    String str7 = fy7Var2 != null ? fy7Var2.c : null;
                                    String str8 = fy7Var != null ? fy7Var.c : null;
                                    String str9 = bx7Var.o;
                                    String str10 = bx7Var.p;
                                    yf8 yf8Var = xth.a;
                                    l98.n(str6, intValue2, str, u, i6, i7, str7, str8, str9, str10, xth.h(), xth.e(), bx7Var.r, av8Var3, 0);
                                    av8Var3.s(false);
                                } else {
                                    av8Var3.d0(2045205129);
                                    fy7 fy7Var3 = bx7Var.g;
                                    fy7 fy7Var4 = bx7Var.h;
                                    if (num3 == null || (str2 = String.valueOf(num3.intValue())) == null) {
                                        str2 = "";
                                    }
                                    if (num2 == null || (str3 = String.valueOf(num2.intValue())) == null) {
                                        str3 = "";
                                    }
                                    int intValue3 = num != null ? num.intValue() : 0;
                                    String u2 = z8e.u((Context) av8Var3.k(nz.b), str5 != null ? str5 : "", str4, false);
                                    u2.getClass();
                                    boolean z = bx7Var.s;
                                    boolean z2 = bx7Var.r;
                                    long D = lz.D(R.color.on_color_primary, av8Var3);
                                    long D2 = lz.D(R.color.on_color_secondary, av8Var3);
                                    yf8 yf8Var2 = xth.a;
                                    l98.l(fy7Var3, fy7Var4, str2, str3, intValue3, u2, z, z2, null, D, D2, xth.h(), xth.e(), 48.0f, av8Var3, 0);
                                    av8Var3.s(false);
                                }
                            } else {
                                av8Var3.W();
                            }
                            break;
                        case 1:
                            v23 v23Var = (v23) obj;
                            of3 of3Var3 = (of3) obj2;
                            int intValue4 = ((Integer) obj3).intValue();
                            v23Var.getClass();
                            if ((intValue4 & 6) == 0) {
                                intValue4 |= ((av8) of3Var3).g(v23Var) ? 4 : 2;
                            }
                            av8 av8Var4 = (av8) of3Var3;
                            if (av8Var4.T(intValue4 & 1, (intValue4 & 19) != 18)) {
                                xtc c0 = l98.c0(n9e.q(l98.f0(v23Var.b(utc.a), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7), lz.D(R.color.on_color_highlight_1, av8Var4), o7g.a(16.0f)), 8.0f, 4.0f);
                                String str11 = daaVar2.k;
                                long D3 = lz.D(R.color.on_color_primary, av8Var4);
                                yf8 yf8Var3 = xth.a;
                                udj.c(str11, c0, D3, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var4, 0, 0, 131064);
                            } else {
                                av8Var4.W();
                            }
                            break;
                        default:
                            of3 of3Var4 = (of3) obj2;
                            int intValue5 = ((Integer) obj3).intValue();
                            ((m12) obj).getClass();
                            av8 av8Var5 = (av8) of3Var4;
                            if (av8Var5.T(intValue5 & 1, (intValue5 & 17) != 16)) {
                                bx7 bx7Var2 = daaVar2.j;
                                fy7 fy7Var5 = bx7Var2.g;
                                int i8 = fy7Var5 != null ? fy7Var5.a : 0;
                                fy7 fy7Var6 = bx7Var2.h;
                                int i9 = fy7Var6 != null ? fy7Var6.a : 0;
                                String str12 = daaVar2.i;
                                gvd.f(i8, i9, str12 == null ? "" : str12, bx7Var2.c, bx7Var2.b.intValue(), null, av8Var5, 0);
                            } else {
                                av8Var5.W();
                            }
                            break;
                    }
                    return Unit.a;
                }
            });
            tc3 H4 = yqo.H(-806785309, av8Var2, new ct8() { // from class: gaa
                @Override // defpackage.ct8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    String str;
                    String valueOf;
                    String str2;
                    String str3;
                    int i5 = i3;
                    daa daaVar2 = daaVar;
                    switch (i5) {
                        case 0:
                            of3 of3Var2 = (of3) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            ((m12) obj).getClass();
                            av8 av8Var3 = (av8) of3Var2;
                            if (av8Var3.T(intValue & 1, (intValue & 17) != 16)) {
                                String str4 = daaVar2.i;
                                bx7 bx7Var = daaVar2.j;
                                String str5 = bx7Var.k;
                                Integer num = bx7Var.q;
                                Integer num2 = bx7Var.n;
                                Integer num3 = bx7Var.m;
                                fy7 fy7Var = bx7Var.h;
                                fy7 fy7Var2 = bx7Var.g;
                                if (!Intrinsics.c(str4, Sports.TENNIS) || fy7Var2 == null || fy7Var == null) {
                                    av8Var3.d0(2046197222);
                                    String str6 = (num3 == null || (valueOf = String.valueOf(num3.intValue())) == null) ? "" : valueOf;
                                    int intValue2 = num != null ? num.intValue() : 0;
                                    if (num2 == null || (str = String.valueOf(num2.intValue())) == null) {
                                        str = "";
                                    }
                                    String u = z8e.u((Context) av8Var3.k(nz.b), str5 != null ? str5 : "", str4, false);
                                    u.getClass();
                                    int i6 = fy7Var2 != null ? fy7Var2.a : 0;
                                    int i7 = fy7Var != null ? fy7Var.a : 0;
                                    String str7 = fy7Var2 != null ? fy7Var2.c : null;
                                    String str8 = fy7Var != null ? fy7Var.c : null;
                                    String str9 = bx7Var.o;
                                    String str10 = bx7Var.p;
                                    yf8 yf8Var = xth.a;
                                    l98.n(str6, intValue2, str, u, i6, i7, str7, str8, str9, str10, xth.h(), xth.e(), bx7Var.r, av8Var3, 0);
                                    av8Var3.s(false);
                                } else {
                                    av8Var3.d0(2045205129);
                                    fy7 fy7Var3 = bx7Var.g;
                                    fy7 fy7Var4 = bx7Var.h;
                                    if (num3 == null || (str2 = String.valueOf(num3.intValue())) == null) {
                                        str2 = "";
                                    }
                                    if (num2 == null || (str3 = String.valueOf(num2.intValue())) == null) {
                                        str3 = "";
                                    }
                                    int intValue3 = num != null ? num.intValue() : 0;
                                    String u2 = z8e.u((Context) av8Var3.k(nz.b), str5 != null ? str5 : "", str4, false);
                                    u2.getClass();
                                    boolean z = bx7Var.s;
                                    boolean z2 = bx7Var.r;
                                    long D = lz.D(R.color.on_color_primary, av8Var3);
                                    long D2 = lz.D(R.color.on_color_secondary, av8Var3);
                                    yf8 yf8Var2 = xth.a;
                                    l98.l(fy7Var3, fy7Var4, str2, str3, intValue3, u2, z, z2, null, D, D2, xth.h(), xth.e(), 48.0f, av8Var3, 0);
                                    av8Var3.s(false);
                                }
                            } else {
                                av8Var3.W();
                            }
                            break;
                        case 1:
                            v23 v23Var = (v23) obj;
                            of3 of3Var3 = (of3) obj2;
                            int intValue4 = ((Integer) obj3).intValue();
                            v23Var.getClass();
                            if ((intValue4 & 6) == 0) {
                                intValue4 |= ((av8) of3Var3).g(v23Var) ? 4 : 2;
                            }
                            av8 av8Var4 = (av8) of3Var3;
                            if (av8Var4.T(intValue4 & 1, (intValue4 & 19) != 18)) {
                                xtc c0 = l98.c0(n9e.q(l98.f0(v23Var.b(utc.a), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7), lz.D(R.color.on_color_highlight_1, av8Var4), o7g.a(16.0f)), 8.0f, 4.0f);
                                String str11 = daaVar2.k;
                                long D3 = lz.D(R.color.on_color_primary, av8Var4);
                                yf8 yf8Var3 = xth.a;
                                udj.c(str11, c0, D3, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var4, 0, 0, 131064);
                            } else {
                                av8Var4.W();
                            }
                            break;
                        default:
                            of3 of3Var4 = (of3) obj2;
                            int intValue5 = ((Integer) obj3).intValue();
                            ((m12) obj).getClass();
                            av8 av8Var5 = (av8) of3Var4;
                            if (av8Var5.T(intValue5 & 1, (intValue5 & 17) != 16)) {
                                bx7 bx7Var2 = daaVar2.j;
                                fy7 fy7Var5 = bx7Var2.g;
                                int i8 = fy7Var5 != null ? fy7Var5.a : 0;
                                fy7 fy7Var6 = bx7Var2.h;
                                int i9 = fy7Var6 != null ? fy7Var6.a : 0;
                                String str12 = daaVar2.i;
                                gvd.f(i8, i9, str12 == null ? "" : str12, bx7Var2.c, bx7Var2.b.intValue(), null, av8Var5, 0);
                            } else {
                                av8Var5.W();
                            }
                            break;
                    }
                    return Unit.a;
                }
            });
            int i5 = ((i2 & 112) == 32 ? 1 : 0) | ((i2 & 14) == 4 ? 1 : 0);
            Object O = av8Var2.O();
            if (i5 != 0 || O == nf3.a) {
                O = new ij8(18, function1, daaVar);
                av8Var2.n0(O);
            }
            av8Var = av8Var2;
            v9g.c(xtcVar, H, H2, H3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, H4, null, null, (Function0) O, av8Var, ((i2 >> 6) & 14) | 100666800, 1776);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new zt7(daaVar, function1, xtcVar, i, 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(l39 l39Var, xtc xtcVar, qpa qpaVar, p3e p3eVar, pg0 pg0Var, lg0 lg0Var, p78 p78Var, boolean z, myd mydVar, Function1 function1, of3 of3Var, int i, int i2) {
        int i3;
        xtc xtcVar2;
        qpa qpaVar2;
        int i4;
        pg0 pg0Var2;
        int i5;
        int i6;
        p3e p3eVar2;
        p78 p78Var2;
        xtc xtcVar3;
        qpa qpaVar3;
        boolean z2;
        myd mydVar2;
        eqf u;
        xtc xtcVar4;
        qpa qpaVar4;
        p3e t3eVar;
        p78 p78Var3;
        int i7;
        myd b2;
        boolean z3;
        int i8;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2072102870);
        if ((i & 6) == 0) {
            i3 = (av8Var.g(l39Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            xtcVar2 = xtcVar;
            i3 |= av8Var.g(xtcVar2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    qpaVar2 = qpaVar;
                    if (av8Var.g(qpaVar2)) {
                        i8 = NotificationCompat.FLAG_LOCAL_ONLY;
                        i3 |= i8;
                    }
                } else {
                    qpaVar2 = qpaVar;
                }
                i8 = 128;
                i3 |= i8;
            } else {
                qpaVar2 = qpaVar;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= av8Var.g(p3eVar) ? a.o : 1024;
                int i10 = i3 | 24576;
                if ((i & 196608) == 0) {
                    pg0Var2 = pg0Var;
                    i10 |= av8Var.g(pg0Var2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
                } else {
                    pg0Var2 = pg0Var;
                }
                if ((1572864 & i) == 0) {
                    i10 |= av8Var.g(lg0Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                }
                if ((12582912 & i) == 0) {
                    i10 |= 4194304;
                }
                i5 = 100663296 | i10;
                if ((i & 805306368) == 0) {
                    i5 = 369098752 | i10;
                }
                i6 = av8Var.i(function1) ? 4 : 2;
                boolean z4 = true;
                if (av8Var.T(i5 & 1, (i5 & 306783379) == 306783378 || (i6 & 3) != 2)) {
                    av8Var.Y();
                    int i11 = i & 1;
                    a99 a99Var = nf3.a;
                    if (i11 == 0 || av8Var.B()) {
                        xtcVar4 = i9 != 0 ? utc.a : xtcVar2;
                        if ((i2 & 4) != 0) {
                            qpaVar4 = tpa.a(0, 3, av8Var);
                            i5 &= -897;
                        } else {
                            qpaVar4 = qpaVar2;
                        }
                        t3eVar = i4 != 0 ? new t3e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : p3eVar;
                        ol4 a2 = iyh.a(av8Var);
                        boolean g2 = av8Var.g(a2);
                        Object O = av8Var.O();
                        if (g2 || O == a99Var) {
                            O = new jp4(a2);
                            av8Var.n0(O);
                        }
                        p78Var3 = (jp4) O;
                        i7 = i5 & (-1908408321);
                        b2 = nyd.b(av8Var);
                        z3 = true;
                    } else {
                        av8Var.W();
                        if ((i2 & 4) != 0) {
                            i5 &= -897;
                        }
                        p78Var3 = p78Var;
                        b2 = mydVar;
                        i7 = i5 & (-1908408321);
                        xtcVar4 = xtcVar2;
                        qpaVar4 = qpaVar2;
                        t3eVar = p3eVar;
                        z3 = z;
                    }
                    av8Var.t();
                    int i12 = (i7 & 14) | ((i7 >> 15) & 112);
                    boolean z5 = (((i12 & 14) ^ 6) > 4 && av8Var.g(l39Var)) || (i12 & 6) == 4;
                    if ((((i12 & 112) ^ 48) <= 32 || !av8Var.g(lg0Var)) && (i12 & 48) != 32) {
                        z4 = false;
                    }
                    boolean z6 = z5 | z4;
                    Object O2 = av8Var.O();
                    if (z6 || O2 == a99Var) {
                        O2 = new s39(new faa(l39Var, lg0Var));
                        av8Var.n0(O2);
                    }
                    int i13 = i7 >> 3;
                    int i14 = ((i6 << 3) & 112) | ((i7 >> 18) & 14);
                    boolean z7 = z3;
                    xtcVar3 = xtcVar4;
                    qpaVar3 = qpaVar4;
                    p3e p3eVar3 = t3eVar;
                    myd mydVar3 = b2;
                    p78 p78Var4 = p78Var3;
                    jaa.b(xtcVar3, qpaVar3, (s39) O2, p3eVar3, p78Var4, z7, mydVar3, pg0Var2, lg0Var, function1, av8Var, (i7 & 7168) | (i13 & 14) | 196608 | (i13 & 112) | (57344 & i7) | (i13 & 29360128) | ((i7 << 12) & 1879048192), i14);
                    p3eVar2 = p3eVar3;
                    mydVar2 = mydVar3;
                    z2 = z7;
                    p78Var2 = p78Var4;
                } else {
                    av8Var.W();
                    p3eVar2 = p3eVar;
                    p78Var2 = p78Var;
                    xtcVar3 = xtcVar2;
                    qpaVar3 = qpaVar2;
                    z2 = z;
                    mydVar2 = mydVar;
                }
                u = av8Var.u();
                if (u != null) {
                    u.d = new w72(l39Var, xtcVar3, qpaVar3, p3eVar2, pg0Var, lg0Var, p78Var2, z2, mydVar2, function1, i, i2);
                    return;
                }
                return;
            }
            int i102 = i3 | 24576;
            if ((i & 196608) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            if ((12582912 & i) == 0) {
            }
            i5 = 100663296 | i102;
            if ((i & 805306368) == 0) {
            }
            if (av8Var.i(function1)) {
            }
            boolean z42 = true;
            if (av8Var.T(i5 & 1, (i5 & 306783379) == 306783378 || (i6 & 3) != 2)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        xtcVar2 = xtcVar;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        int i1022 = i3 | 24576;
        if ((i & 196608) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if ((12582912 & i) == 0) {
        }
        i5 = 100663296 | i1022;
        if ((i & 805306368) == 0) {
        }
        if (av8Var.i(function1)) {
        }
        boolean z422 = true;
        if (av8Var.T(i5 & 1, (i5 & 306783379) == 306783378 || (i6 & 3) != 2)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final void e(final int i, int i2, final p5j p5jVar, of3 of3Var, int i3) {
        long j;
        long j2;
        final int i4 = i2;
        final p5j p5jVar2 = p5jVar;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1959821059);
        int i5 = i3 | (av8Var.e(i) ? 4 : 2) | (av8Var.e(i4) ? 32 : 16) | (av8Var.g(p5jVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i5 & 1, (i5 & 147) != 146)) {
            final Context context = (Context) av8Var.k(nz.b);
            utc utcVar = utc.a;
            xtc d0 = l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
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
            p8g p8gVar = p8g.a;
            xtc A = wnn.A(p8gVar.a(1.0f, utcVar, true), o7g.a(16.0f));
            String str = p5jVar2.b;
            c6j c6jVar = p5jVar2.a;
            String str2 = p5jVar2.d;
            boolean z = str != null;
            int i6 = i5 & 896;
            boolean i7 = av8Var.i(context) | (i6 == 256) | ((i5 & 14) == 4);
            Object O = av8Var.O();
            Object obj = nf3.a;
            if (i7 || O == obj) {
                final int i8 = 0;
                O = new Function0() { // from class: v5j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i9 = i8;
                        int i10 = i;
                        p5j p5jVar3 = p5jVar2;
                        Context context2 = context;
                        switch (i9) {
                            case 0:
                                jmf jmfVar = p5jVar3.a.c;
                                int i11 = RankingsActivity.O;
                                jaa.N(context2, jmfVar, Integer.valueOf(i10));
                                break;
                            default:
                                jmf jmfVar2 = p5jVar3.a.c;
                                int i12 = RankingsActivity.O;
                                jaa.N(context2, jmfVar2, Integer.valueOf(i10));
                                break;
                        }
                        return Unit.a;
                    }
                };
                av8Var.n0(O);
            }
            xtc c0 = l98.c0(tol.y(A, z, false, false, 0L, null, (Function0) O, av8Var, 30), 8.0f, 4.0f);
            p4h p4hVar = ww9.d;
            u23 a3 = t23.a(p4hVar, uxf.o, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, c0);
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
            String str3 = str == null ? "-" : str;
            yf8 yf8Var = xth.a;
            dfj l = xth.l();
            r13 r13Var = new r13(lz.D(R.color.primary_default, av8Var));
            if (str == null) {
                r13Var = null;
            }
            if (r13Var == null) {
                j = ljg.f(av8Var, 1344677298, R.color.n_lv_3, av8Var, false);
            } else {
                av8Var.d0(1344675345);
                av8Var.s(false);
                j = r13Var.a;
            }
            udj.c(str3, null, j, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, l, av8Var, 0, 24960, 110586);
            String str4 = p5jVar.c;
            if (str4 == null) {
                str4 = "-";
            }
            udj.c(str4, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110586);
            av8Var.s(true);
            xtc a4 = p8gVar.a(1.0f, utcVar, true);
            l8g a5 = k8g.a(rz8.b, uxf.l, av8Var, 6);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, a4);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a5, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            td4.i(Integer.valueOf(c6jVar.a), bkh.l(utcVar, 16.0f), av8Var, 48);
            nq8.h(av8Var, bkh.p(utcVar, 4.0f));
            udj.c(c6jVar.b, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var, 0, 24960, 110586);
            av8Var.s(true);
            xtc A2 = wnn.A(p8gVar.a(1.0f, utcVar, true), o7g.a(16.0f));
            boolean z2 = str2 != null;
            boolean i9 = av8Var.i(context) | (i6 == 256) | ((i5 & 112) == 32);
            Object O2 = av8Var.O();
            if (i9 || O2 == obj) {
                i4 = i2;
                final int i10 = 1;
                O2 = new Function0() { // from class: v5j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i92 = i10;
                        int i102 = i4;
                        p5j p5jVar3 = p5jVar;
                        Context context2 = context;
                        switch (i92) {
                            case 0:
                                jmf jmfVar = p5jVar3.a.c;
                                int i11 = RankingsActivity.O;
                                jaa.N(context2, jmfVar, Integer.valueOf(i102));
                                break;
                            default:
                                jmf jmfVar2 = p5jVar3.a.c;
                                int i12 = RankingsActivity.O;
                                jaa.N(context2, jmfVar2, Integer.valueOf(i102));
                                break;
                        }
                        return Unit.a;
                    }
                };
                av8Var.n0(O2);
            } else {
                i4 = i2;
            }
            Function0 function0 = (Function0) O2;
            p5jVar2 = p5jVar;
            xtc b0 = l98.b0(tol.y(A2, z2, false, false, 0L, null, function0, av8Var, 30), 4.0f);
            u23 a6 = t23.a(p4hVar, uxf.q, av8Var, 48);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C4 = fqj.C(av8Var, b0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a6, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C4, f50Var3);
            String str5 = str2 == null ? "-" : str2;
            dfj l2 = xth.l();
            r13 r13Var2 = new r13(lz.D(R.color.primary_default, av8Var));
            if (str2 == null) {
                r13Var2 = null;
            }
            if (r13Var2 == null) {
                j2 = ljg.f(av8Var, 667944987, R.color.n_lv_3, av8Var, false);
            } else {
                av8Var.d0(667943034);
                av8Var.s(false);
                j2 = r13Var2.a;
            }
            udj.c(str5, null, j2, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, l2, av8Var, 0, 24960, 110586);
            String str6 = p5jVar2.e;
            udj.c(str6 == null ? "-" : str6, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new vo(i, i4, i3, 6, p5jVar2);
        }
    }

    public static final void f(tc3 tc3Var, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1983129927);
        if (av8Var.T(i & 1, (i & 3) != 2)) {
            tzb.b(null, null, null, yqo.H(-1098610957, av8Var, new b25(tc3Var, 11)), av8Var, 3072, 7);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b25(i, 12, tc3Var);
        }
    }

    public static final void g(final q5j q5jVar, of3 of3Var, final int i) {
        eqf u;
        Function2 function2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1887520424);
        int i2 = (av8Var.g(q5jVar) ? 4 : 2) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (!av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            av8Var.W();
        } else {
            if (q5jVar == null) {
                u = av8Var.u();
                if (u != null) {
                    function2 = new Function2(q5jVar, i, i3) { // from class: t5j
                        public final /* synthetic */ int a;
                        public final /* synthetic */ q5j b;

                        {
                            this.a = i3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.a;
                            of3 of3Var2 = (of3) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    haa.g(this.b, of3Var2, aba.K(1));
                                    break;
                                default:
                                    haa.g(this.b, of3Var2, aba.K(1));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    u.d = function2;
                }
                return;
            }
            un0.a(bkh.d(l98.c0(utc.a, 8.0f, 4.0f), 1.0f), o7g.a(16.0f), rd0.t(lz.D(R.color.surface_1, av8Var), av8Var, 0), null, null, yqo.H(1293816358, av8Var, new e6i(8, (Context) av8Var.k(nz.b), q5jVar)), av8Var, 196614, 24);
        }
        u = av8Var.u();
        if (u != null) {
            function2 = new Function2(q5jVar, i, i4) { // from class: t5j
                public final /* synthetic */ int a;
                public final /* synthetic */ q5j b;

                {
                    this.a = i4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.a;
                    of3 of3Var2 = (of3) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            haa.g(this.b, of3Var2, aba.K(1));
                            break;
                        default:
                            haa.g(this.b, of3Var2, aba.K(1));
                            break;
                    }
                    return Unit.a;
                }
            };
            u.d = function2;
        }
    }

    public static final void h(hjl hjlVar, boolean z, Function1 function1, of3 of3Var, int i) {
        hjl hjlVar2;
        ry ryVar;
        f50 f50Var;
        f50 f50Var2;
        utc utcVar;
        f50 f50Var3;
        ff3 ff3Var;
        int i2;
        mv1 mv1Var = uxf.e;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-140567358);
        int i3 = i | (av8Var.g(hjlVar) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            utc utcVar2 = utc.a;
            float f2 = 16.0f;
            xtc q = n9e.q(wnn.A(bkh.p(utcVar2, 156.0f), o7g.a(16.0f)), lz.D(R.color.surface_1, av8Var), o7g.a(16.0f));
            long D = lz.D(R.color.n_lv_4, av8Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = wzj.w;
                av8Var.n0(O2);
            }
            xtc y = tol.y(q, true, true, true, D, wzcVar, new eui((boh) o3a.N(objArr, (Function0) O2, av8Var, 48), function1, hjlVar, 20), av8Var, 0);
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.o;
            u23 a2 = t23.a(p4hVar, kv1Var, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, y);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var4 = hf3.g;
            waa.K(av8Var, a2, f50Var4);
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var, m, ff3Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var5 = hf3.j;
            waa.K(av8Var, valueOf, f50Var5);
            ry ryVar2 = hf3.k;
            waa.J(av8Var, ryVar2);
            f50 f50Var6 = hf3.d;
            waa.K(av8Var, C, f50Var6);
            xtc d2 = bkh.d(utcVar2, 1.0f);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, f50Var4);
            waa.K(av8Var, m2, ff3Var2);
            bf3.s(hashCode2, av8Var, f50Var5, av8Var, ryVar2);
            waa.K(av8Var, C2, f50Var6);
            n12 n12Var = n12.a;
            if (z) {
                av8Var.d0(-1364175164);
                td4.D(hjlVar.a, 0, av8Var, rd0.O(bkh.l(n12Var.a(utcVar2, mv1Var), 104.0f), 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2));
                av8Var.s(false);
                ff3Var = ff3Var2;
                f50Var = f50Var5;
                f50Var2 = f50Var4;
                utcVar = utcVar2;
                i2 = 0;
                ryVar = ryVar2;
                f50Var3 = f50Var6;
            } else {
                av8Var.d0(-1363882803);
                int i4 = hjlVar.a;
                f2 = 16.0f;
                xtc l = bkh.l(l98.f0(n12Var.a(utcVar2, mv1Var), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 12.0f, 16.0f, 1), 60.0f);
                ryVar = ryVar2;
                f50Var = f50Var5;
                f50Var2 = f50Var4;
                utcVar = utcVar2;
                f50Var3 = f50Var6;
                ff3Var = ff3Var2;
                td4.C(i4, l, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 0, 12);
                i2 = 0;
                av8Var.s(false);
            }
            xtc f0 = l98.f0(utcVar, f2, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
            float f3 = f2;
            u23 a3 = t23.a(new ng0(8.0f, true, new a70(6)), kv1Var, av8Var, 6);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, f0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var2);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            Event event = hjlVar.f;
            int id = Event.getHomeTeam$default(event, null, 1, null).getId();
            int id2 = Event.getAwayTeam$default(event, null, 1, null).getId();
            Integer display = Event.getHomeScore$default(event, null, 1, null).getDisplay();
            int intValue = display != null ? display.intValue() : i2;
            Integer display2 = Event.getAwayScore$default(event, null, 1, null).getDisplay();
            if (display2 != null) {
                i2 = display2.intValue();
            }
            f50 f50Var7 = f50Var3;
            ry ryVar3 = ryVar;
            utc utcVar3 = utcVar;
            ff3 ff3Var3 = ff3Var;
            f50 f50Var8 = f50Var;
            rha.d(id, id2, intValue, i2, Event.getWinnerCode$default(event, null, 1, null), null, 0L, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 0, 0, 2016);
            i9a.j(Double.valueOf(hjlVar.c), false, false, kda.O(utcVar3, "wc26_player_rating", av8Var), false, true, null, av8Var, 197040, 80);
            av8Var.s(true);
            av8Var.s(true);
            xtc f02 = l98.f0(utcVar3, f3, 8.0f, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
            String str = hjlVar.b;
            long D2 = lz.D(R.color.n_lv_1, av8Var);
            yf8 yf8Var = xth.a;
            f50 f50Var9 = f50Var2;
            udj.c(str, f02, D2, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var, 0, 24960, 110584);
            lv1 lv1Var = uxf.m;
            xtc e0 = l98.e0(utcVar3, f3, 4.0f, f3, 8.0f);
            l8g a4 = k8g.a(ww9.b, lv1Var, av8Var, 48);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C4 = fqj.C(av8Var, e0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var9);
            waa.K(av8Var, m4, ff3Var3);
            bf3.s(hashCode4, av8Var, f50Var8, av8Var, ryVar3);
            waa.K(av8Var, C4, f50Var7);
            hjlVar2 = hjlVar;
            td4.G(hjlVar2.d, bkh.l(utcVar3, f3), false, 0L, av8Var, 48, 12);
            udj.c(hjlVar2.e, l98.f0(utcVar3, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 48, 24960, 110584);
            av8Var = av8Var;
            av8Var.s(true);
            av8Var.s(true);
        } else {
            hjlVar2 = hjlVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new cfl(hjlVar2, z, function1, i, 3);
        }
    }

    public static final void i(final y7l y7lVar, final boolean z, final String str, final String str2, final boolean z2, vy8 vy8Var, of3 of3Var, int i) {
        vy8 vy8Var2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(45992266);
        int i2 = i | (av8Var.e(y7lVar.ordinal()) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.g(str) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(str2) ? a.o : 1024) | (av8Var.h(z2) ? 16384 : 8192) | 196608;
        if (av8Var.T(i2 & 1, (74899 & i2) != 74898)) {
            final Context context = (Context) av8Var.k(bh3.b);
            ty8 ty8Var = ty8.a;
            nq8.g(h5a.O(c5n.t(nq8.F(nq8.A(ty8Var), 40.0f), new h1g(R.color.primary_default)), 8.0f, 2), 0, 1, yqo.H(1744655974, av8Var, new ct8() { // from class: d6l
                @Override // defpackage.ct8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    of3 of3Var2 = (of3) obj2;
                    ((Integer) obj3).getClass();
                    ((o8g) obj).getClass();
                    v20 v20Var = new v20(2131231886);
                    vy8 E = gz8.E(c5n.t(nq8.K(20.0f), new h1g(R.color.primary_variant)), 2.0f);
                    Context context2 = context;
                    context2.getClass();
                    Intent intent = new Intent(context2, (Class<?>) StartActivity.class);
                    intent.setFlags(872415232);
                    intent.setAction("android.intent.action.MAIN");
                    intent.addCategory("android.intent.category.LAUNCHER");
                    c5n.n(v20Var, j72.x(E, new vbi(intent, zm2.A((lc[]) Arrays.copyOf(new lc[0], 0)))), 0, new t13(new fjj(new h1g(R.color.on_color_primary))), of3Var2, 32816, 8);
                    aba.i(o8g.a(), of3Var2, 0);
                    haa.j(y7lVar, z, str, str2, z2, null, of3Var2, 0);
                    return Unit.a;
                }
            }), av8Var, 3072, 2);
            vy8Var2 = ty8Var;
        } else {
            av8Var.W();
            vy8Var2 = vy8Var;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new e6l(y7lVar, z, str, str2, z2, vy8Var2, i, 0);
        }
    }

    public static final void j(y7l y7lVar, final boolean z, final String str, final String str2, final boolean z2, vy8 vy8Var, of3 of3Var, int i) {
        vy8 vy8Var2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-991694701);
        int i2 = i | (av8Var.e(y7lVar.ordinal()) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.g(str) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(str2) ? a.o : 1024) | (av8Var.h(z2) ? 16384 : 8192) | 196608;
        if (av8Var.T(i2 & 1, (74899 & i2) != 74898)) {
            boolean z3 = y7lVar == y7l.b;
            final float f2 = z3 ? 8.0f : 16.0f;
            final boolean z4 = z3;
            tc3 H = yqo.H(-825698057, av8Var, new ct8() { // from class: f6l
                @Override // defpackage.ct8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    of3 of3Var2 = (of3) obj2;
                    ((Integer) obj3).getClass();
                    ((o8g) obj).getClass();
                    ty8 ty8Var = ty8.a;
                    aba.i(nq8.N(ty8Var, 8.0f), of3Var2, 0);
                    boolean z5 = z;
                    float f3 = f2;
                    if (z5) {
                        av8 av8Var2 = (av8) of3Var2;
                        av8Var2.d0(-1093014119);
                        c5n.n(new v20(R.drawable.ic_delete), j72.x(h5a.N(nq8.K(24.0f), 4.0f), new x9g(HideFinishedAction.class, zm2.A((lc[]) Arrays.copyOf(new lc[0], 0)))), 0, new t13(new fjj(new h1g(R.color.surface_1))), av8Var2, 32816, 8);
                        aba.i(nq8.N(ty8Var, f3), av8Var2, 0);
                        av8Var2.s(false);
                    } else {
                        av8 av8Var3 = (av8) of3Var2;
                        av8Var3.d0(-1092504789);
                        av8Var3.s(false);
                    }
                    String str3 = str;
                    if (str3.equals("NOTIFICATION_DISABLED")) {
                        av8 av8Var4 = (av8) of3Var2;
                        av8Var4.d0(-1091654645);
                        av8Var4.s(false);
                    } else {
                        av8 av8Var5 = (av8) of3Var2;
                        av8Var5.d0(-1092399420);
                        c5n.n(new v20(str3.equals("NOTIFICATION_ENABLED") ? R.drawable.ic_notification_active : R.drawable.ic_notification_mute), j72.x(h5a.N(nq8.K(24.0f), 4.0f), new x9g(ChangeNotificationStatus.class, zm2.A((lc[]) Arrays.copyOf(new lc[]{new lc(ok3.j, str3)}, 1)))), 0, new t13(new fjj(new h1g(R.color.surface_1))), av8Var5, 32816, 8);
                        aba.i(nq8.N(ty8Var, f3), av8Var5, 0);
                        av8Var5.s(false);
                    }
                    rd0.b(null, 1, 2, yqo.H(1768526829, of3Var2, new c82(z4, str2)), of3Var2, 3072, 1);
                    aba.i(nq8.N(ty8Var, 8.0f), of3Var2, 0);
                    if (z2) {
                        av8 av8Var6 = (av8) of3Var2;
                        av8Var6.d0(-1090985634);
                        m6k.d(h5a.N(nq8.K(24.0f), 4.0f), new h1g(R.color.surface_1), av8Var6, 0);
                        av8Var6.s(false);
                    } else {
                        av8 av8Var7 = (av8) of3Var2;
                        av8Var7.d0(-1090737448);
                        c5n.n(new v20(R.drawable.ic_refresh), j72.x(h5a.N(nq8.K(24.0f), 4.0f), new x9g(RefreshFavorites.class, zm2.A((lc[]) Arrays.copyOf(new lc[0], 0)))), 0, new t13(new fjj(new h1g(R.color.surface_1))), av8Var7, 32816, 8);
                        av8Var7.s(false);
                    }
                    return Unit.a;
                }
            });
            ty8 ty8Var = ty8.a;
            nq8.g(ty8Var, 0, 1, H, av8Var, 3078, 2);
            vy8Var2 = ty8Var;
        } else {
            av8Var.W();
            vy8Var2 = vy8Var;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new e6l(y7lVar, z, str, str2, z2, vy8Var2, i, 1);
        }
    }

    public static final void k(int i, of3 of3Var, gv9 gv9Var, xtc xtcVar, Function1 function1, boolean z) {
        av8 av8Var;
        gv9Var.getClass();
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1515187054);
        int i2 = i | (av8Var2.g(gv9Var) ? 4 : 2) | (av8Var2.h(z) ? 32 : 16) | (av8Var2.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.g(xtcVar) ? a.o : 1024);
        if (av8Var2.T(i2 & 1, (i2 & 1171) != 1170)) {
            xtc f0 = l98.f0(bkh.d(xtcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            u23 a2 = t23.a(new ng0(16.0f, true, new a70(6)), uxf.o, av8Var2, 6);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, f0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var2, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var2, C, f50Var3);
            utc utcVar = utc.a;
            xtc d0 = l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            l8g a3 = k8g.a(ww9.h, uxf.m, av8Var2, 54);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, d0);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a3, f50Var);
            waa.K(av8Var2, m2, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C2, f50Var3);
            String v = oea.v(R.string.football_players_of_the_day, av8Var2);
            yf8 yf8Var = xth.a;
            udj.c(v, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.i(), av8Var2, 0, 0, 131066);
            ImageVector N = s6a.N(R.drawable.ic_info, 6, av8Var2);
            long D = lz.D(R.color.n_lv_1, av8Var2);
            xtc A = wnn.A(bkh.l(utcVar, 28.0f), o7g.a);
            long D2 = lz.D(R.color.n_lv_4, av8Var2);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var2);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var2.O();
            if (O2 == a99Var) {
                O2 = wzj.x;
                av8Var2.n0(O2);
            }
            kq9.b(N, null, l98.b0(tol.y(A, true, true, true, D2, wzcVar, new uel(4, (boh) o3a.N(objArr, (Function0) O2, av8Var2, 48), function1), av8Var2, 0), 4.0f), D, av8Var2, 48, 0);
            int i3 = 1;
            av8Var2.s(true);
            xtc d2 = bkh.d(utcVar, 1.0f);
            ng0 ng0Var = new ng0(8.0f, true, new a70(6));
            t3e B = l98.B(8.0f, 2);
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 14) == 4) | ((i2 & 896) == 256);
            Object O3 = av8Var2.O();
            if (z2 || O3 == a99Var) {
                O3 = new bfl(gv9Var, z, function1, i3);
                av8Var2.n0(O3);
            }
            v8a.c(d2, null, B, ng0Var, null, null, false, null, (Function1) O3, av8Var2, 24966, 490);
            av8Var = av8Var2;
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new u73(gv9Var, z, function1, xtcVar, i, 3);
        }
    }

    public static final void l(Function0 function0, Function0 function02, of3 of3Var, int i) {
        int i2;
        function0.getClass();
        function02.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(381649217);
        if ((i & 6) == 0) {
            i2 = (av8Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(function02) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && av8Var.D()) {
            av8Var.W();
        } else {
            Object k = av8Var.k(nz.b);
            k.getClass();
            Activity activity = (Activity) k;
            av8Var.d0(1249803915);
            boolean i3 = ((i2 & 14) == 4) | av8Var.i(activity) | ((i2 & 112) == 32);
            Object O = av8Var.O();
            if (i3 || O == nf3.a) {
                O = new ncj(15, activity, function0, function02);
                av8Var.n0(O);
            }
            av8Var.s(false);
            m((Function1) O, av8Var, 0);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new nmi(function0, function02, i, 27);
        }
    }

    public static final void m(Function1 function1, of3 of3Var, int i) {
        int i2;
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-210215293);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (av8Var.i(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && av8Var.D()) {
            av8Var.W();
        } else {
            Object k = av8Var.k(nz.b);
            k.getClass();
            Activity activity = (Activity) k;
            Object[] objArr = new Object[0];
            av8Var.d0(1839189941);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = new wel(17);
                av8Var.n0(O);
            }
            av8Var.s(false);
            e1d e1dVar = (e1d) o3a.L(objArr, null, null, (Function0) O, av8Var, 3072, 6);
            Unit unit = Unit.a;
            av8Var.d0(1839196323);
            boolean i4 = ((i2 & 14) == 4) | av8Var.i(activity) | av8Var.g(e1dVar);
            Object O2 = av8Var.O();
            if (i4 || O2 == a99Var) {
                O2 = new ncj(16, activity, function1, e1dVar);
                av8Var.n0(O2);
            }
            av8Var.s(false);
            hz8.d(unit, (Function1) O2, av8Var);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new erc(i, i3, function1);
        }
    }

    public static final void n(RankingRow rankingRow, TextView textView) {
        int intValue;
        rankingRow.getClass();
        int color = textView.getContext().getColor(R.color.error);
        int color2 = textView.getContext().getColor(R.color.success);
        textView.setVisibility(8);
        Integer previousPosition = rankingRow.getPreviousPosition();
        if (previousPosition == null || (intValue = previousPosition.intValue() - rankingRow.getPosition()) == 0) {
            return;
        }
        textView.setVisibility(0);
        me4.s(new Object[]{Integer.valueOf(Math.abs(intValue))}, 1, dla.d(), "%s", textView);
        Integer valueOf = Integer.valueOf(color);
        if (intValue >= 0) {
            valueOf = null;
        }
        textView.setTextColor(valueOf != null ? valueOf.intValue() : color2);
        Integer valueOf2 = Integer.valueOf(color);
        if (intValue >= 0) {
            valueOf2 = null;
        }
        if (valueOf2 != null) {
            color2 = valueOf2.intValue();
        }
        textView.setCompoundDrawableTintList(ColorStateList.valueOf(color2));
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        compoundDrawablesRelative.getClass();
        Object F = ph0.F(2, compoundDrawablesRelative);
        RotateDrawable rotateDrawable = F instanceof RotateDrawable ? (RotateDrawable) F : null;
        Drawable mutate = rotateDrawable != null ? rotateDrawable.mutate() : null;
        if (mutate != null) {
            Integer num = intValue > 0 ? 0 : null;
            mutate.setLevel(num != null ? num.intValue() : 10000);
        }
    }

    public static String o(Class cls) {
        LinkedHashMap linkedHashMap = z8d.b;
        String str = (String) linkedHashMap.get(cls);
        if (str == null) {
            x8d x8dVar = (x8d) cls.getAnnotation(x8d.class);
            str = x8dVar != null ? x8dVar.value() : null;
            if (str == null || str.length() <= 0) {
                ogj.h("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()));
                return null;
            }
            linkedHashMap.put(cls, str);
        }
        str.getClass();
        return str;
    }

    public static final long p(long j) {
        if (j < 0) {
            xd5.b.getClass();
            return xd5.d;
        }
        xd5.b.getClass();
        return xd5.c;
    }

    public static final void q(TextView textView, Object obj, ua5 ua5Var, t25 t25Var) {
        textView.getClass();
        Context context = textView.getContext();
        context.getClass();
        ht9 ht9Var = new ht9(context);
        ht9Var.c = obj;
        ht9Var.q = jrg.b;
        ht9Var.p = new jpf(new kjh(v25.a, t25Var));
        ht9Var.f = String.valueOf(obj);
        ht9Var.c(String.valueOf(obj));
        ht9Var.d = new ujg(22, textView, ua5Var, textView, ua5Var, false);
        nt9 a2 = ht9Var.a();
        Context context2 = textView.getContext();
        context2.getClass();
        ajh.a(context2).a(a2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009e, code lost:
    
        if (r5 == null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static m4c r(Context context, IRecent iRecent, MediaHighlightSummaryResponse mediaHighlightSummaryResponse) {
        String Q;
        gv9 gv9Var;
        k4c i4cVar;
        String slug;
        List<MediaHighlightedItem<?>> mediaItems;
        String str;
        String str2;
        IHighlightMediaItem item;
        context.getClass();
        iRecent.getClass();
        boolean z = iRecent instanceof Event;
        String str3 = "";
        if (z) {
            Q = context.getString(R.string.media_tab_banner_text);
        } else if (iRecent instanceof Team) {
            Team team = (Team) iRecent;
            if (team.getType() == 1) {
                Q = hkg.Q(context, R.string.media_tab_banner_player, team.getGender(), new Object[0]);
            } else {
                Q = context.getString(R.string.media_tab_banner_team);
                Q.getClass();
            }
        } else {
            Q = iRecent instanceof Player ? hkg.Q(context, R.string.media_tab_banner_player, ((Player) iRecent).getGender(), new Object[0]) : "";
        }
        Q.getClass();
        if (mediaHighlightSummaryResponse != null && (mediaItems = mediaHighlightSummaryResponse.getMediaItems()) != null) {
            ArrayList arrayList = new ArrayList(k13.r(mediaItems, 10));
            Iterator<T> it = mediaItems.iterator();
            while (it.hasNext()) {
                MediaHighlightedItem mediaHighlightedItem = (MediaHighlightedItem) it.next();
                if (mediaHighlightedItem == null || (item = mediaHighlightedItem.getItem()) == null || (str = item.getThumbnailUrl()) == null) {
                    str = "";
                }
                if (mediaHighlightedItem == null || (str2 = mediaHighlightedItem.getType()) == null) {
                    str2 = "";
                }
                arrayList.add(new l4c(str, str2));
            }
            gv9Var = l6g.W(arrayList);
        }
        gv9Var = rlh.b;
        if (z) {
            Event event = (Event) iRecent;
            String sportSlug = event.getSportSlug();
            int id = Event.getHomeTeam$default(event, null, 1, null).getId();
            int id2 = Event.getAwayTeam$default(event, null, 1, null).getId();
            boolean isDoublesMatch = event.isDoublesMatch();
            SubTeam subTeam1 = Event.getHomeTeam$default(event, null, 1, null).getSubTeam1();
            Integer valueOf = subTeam1 != null ? Integer.valueOf(subTeam1.getId()) : null;
            SubTeam subTeam2 = Event.getHomeTeam$default(event, null, 1, null).getSubTeam2();
            Integer valueOf2 = subTeam2 != null ? Integer.valueOf(subTeam2.getId()) : null;
            SubTeam subTeam12 = Event.getAwayTeam$default(event, null, 1, null).getSubTeam1();
            Integer valueOf3 = subTeam12 != null ? Integer.valueOf(subTeam12.getId()) : null;
            SubTeam subTeam22 = Event.getAwayTeam$default(event, null, 1, null).getSubTeam2();
            i4cVar = new h4c(id, id2, isDoublesMatch, sportSlug, valueOf, valueOf2, valueOf3, subTeam22 != null ? Integer.valueOf(subTeam22.getId()) : null);
        } else if (iRecent instanceof Team) {
            Team team2 = (Team) iRecent;
            int id3 = team2.getId();
            Sport sport = team2.getSport();
            if (sport != null && (slug = sport.getSlug()) != null) {
                str3 = slug;
            }
            i4cVar = new j4c(id3, str3);
        } else {
            i4cVar = iRecent instanceof Player ? new i4c(((Player) iRecent).getId()) : null;
        }
        return new m4c(Q, gv9Var, i4cVar, mediaHighlightSummaryResponse != null ? mediaHighlightSummaryResponse.getItemsCount() : null);
    }

    public static final ArrayList s(Context context, List list) {
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Team team = (Team) it.next();
            int id = team.getId();
            String p = tba.p(context, team);
            x3b x3bVar = new x3b(id, p);
            arrayList.add(new oxh(x3bVar, p, new tc3(-1500417243, new bba(x3bVar, 6), true), null, null, false, 248));
        }
        return arrayList;
    }

    public static final d7e t(int i, int i2, of3 of3Var) {
        TypedValue typedValue;
        boolean z;
        av8 av8Var = (av8) of3Var;
        Context context = (Context) av8Var.k(nz.b);
        Resources resources = (Resources) av8Var.k(nz.c);
        q1g q1gVar = (q1g) av8Var.k(nz.e);
        synchronized (q1gVar) {
            typedValue = (TypedValue) q1gVar.a.b(i);
            z = true;
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i, typedValue, true);
                uzc uzcVar = q1gVar.a;
                int d2 = uzcVar.d(i);
                Object[] objArr = uzcVar.c;
                Object obj = objArr[d2];
                uzcVar.b[d2] = i;
                objArr[d2] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence == null || !StringsKt.M(charSequence, ".xml")) {
            av8Var.d0(-1771643000);
            Resources.Theme theme = context.getTheme();
            boolean g2 = av8Var.g(charSequence);
            if ((((i2 & 14) ^ 6) <= 4 || !av8Var.e(i)) && (i2 & 6) != 4) {
                z = false;
            }
            boolean g3 = g2 | z | av8Var.g(theme);
            Object O = av8Var.O();
            if (g3 || O == nf3.a) {
                try {
                    Drawable drawable = resources.getDrawable(i, null);
                    drawable.getClass();
                    O = new a10(((BitmapDrawable) drawable).getBitmap());
                    av8Var.n0(O);
                } catch (Exception e2) {
                    throw new fb3(11, "Error attempting to load resource: " + ((Object) charSequence), (Throwable) e2);
                }
            }
            cx1 cx1Var = new cx1((a10) O);
            av8Var.s(false);
            return cx1Var;
        }
        av8Var.d0(-1771798434);
        Resources.Theme theme2 = context.getTheme();
        int i3 = typedValue.changingConfigurations;
        iu9 iu9Var = (iu9) av8Var.k(nz.d);
        hu9 hu9Var = new hu9(theme2, i);
        WeakReference weakReference = (WeakReference) iu9Var.a.get(hu9Var);
        gu9 gu9Var = weakReference != null ? (gu9) weakReference.get() : null;
        if (gu9Var == null) {
            XmlResourceParser xml = resources.getXml(i);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                pvd.r("No start tag found");
                return null;
            }
            if (!Intrinsics.c(xml.getName(), "vector")) {
                a70.p("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                return null;
            }
            gu9Var = s6a.E(theme2, resources, xml, i3);
            iu9Var.a.put(hu9Var, new WeakReference(gu9Var));
        }
        lmk J = o6a.J(gu9Var.a, av8Var);
        av8Var.s(false);
        return J;
    }

    public static final jvg u(Function1 function1, of3 of3Var, int i) {
        e1d g2 = e.g(function1, of3Var);
        av8 av8Var = (av8) of3Var;
        Object O = av8Var.O();
        if (O == nf3.a) {
            ls4 ls4Var = new ls4(new fw6(28, g2));
            av8Var.n0(ls4Var);
            O = ls4Var;
        }
        return (jvg) O;
    }

    public static final xtc v(xtc xtcVar, float f2) {
        return f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? xtcVar : s02.O(xtcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, null, 524031);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ff, code lost:
    
        if ((java.lang.Integer.signum(r7) * java.lang.Long.signum(r16)) > 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012d, code lost:
    
        r13 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x012b, code lost:
    
        r13 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0129, code lost:
    
        if ((java.lang.Integer.signum(r7) * java.lang.Long.signum(r16)) > 0) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0169 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long w(long j, long j2) {
        long j3;
        long j4;
        be5 be5Var = be5.NANOSECONDS;
        long k = xd5.k(j2, be5Var);
        long j5 = 0;
        if (((j - 1) | 1) == Long.MAX_VALUE) {
            if (!xd5.g(j2) || (j ^ k) >= 0) {
                return j;
            }
            a70.p("Summing infinities of different signs");
            return 0L;
        }
        if (((k - 1) | 1) != Long.MAX_VALUE) {
            long j6 = j + k;
            return ((k ^ j6) & (j ^ j6)) < 0 ? j < 0 ? Long.MIN_VALUE : Long.MAX_VALUE : j6;
        }
        long j7 = xd5.d;
        long j8 = xd5.c;
        int i = ((int) j2) & 1;
        if (i != 0) {
            if (xd5.g(j2)) {
                j3 = 1;
                int signum = Integer.signum(2);
                if (xd5.g(j2)) {
                    if (signum == 0) {
                        a70.p("Multiplying infinite duration by zero yields an undefined result.");
                        return 0L;
                    }
                    j5 = signum > 0 ? j2 : xd5.m(j2);
                } else if (signum != 0) {
                    long j9 = j2 >> 1;
                    j4 = Long.MAX_VALUE;
                    long j10 = signum;
                    long j11 = j9 * j10;
                    if (i == 0) {
                        if (-2147483647L <= j9 && j9 < 2147483648L) {
                            j5 = wkn.w(j11);
                        } else if (j11 / j10 == j9) {
                            j5 = (-4611686018426999999L > j11 || j11 >= 4611686018427000000L) ? wkn.u(j11 / 1000000) : wkn.w(j11);
                        } else {
                            long j12 = j9 / 1000000;
                            long j13 = j12 * j10;
                            long j14 = (((j9 - (j12 * 1000000)) * j10) / 1000000) + j13;
                            if (j13 / j10 == j12 && (j14 ^ j13) >= 0) {
                                j5 = wkn.u(llf.f(j14, new hkb(-4611686018427387903L, 4611686018427387903L)));
                            }
                        }
                    } else if (j11 / j10 == j9) {
                        j5 = wkn.u(llf.f(j11, new hkb(-4611686018427387903L, 4611686018427387903L)));
                    }
                }
            } else {
                j3 = 1;
                j4 = Long.MAX_VALUE;
                long j15 = j2 >> 1;
                long j16 = j15 / 2;
                j5 = (-4611686018426L > j16 || j16 >= 4611686018427L) ? wkn.u(j16) : wkn.w((j16 * 1000000) + (((j15 - (j16 * 2)) * 1000000) / 2));
            }
            long k2 = xd5.k(j5, be5Var);
            return ((k2 - j3) | j3) != j4 ? k2 : w(w(j, j5), xd5.h(j2, j5));
        }
        j5 = wkn.w((j2 >> 1) / 2);
        j3 = 1;
        j4 = Long.MAX_VALUE;
        long k22 = xd5.k(j5, be5Var);
        if (((k22 - j3) | j3) != j4) {
        }
    }

    public static final long x(long j, long j2, be5 be5Var) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) >= 0) {
            return wkn.S(j3, be5Var);
        }
        be5 be5Var2 = be5.MILLISECONDS;
        if (be5Var.compareTo(be5Var2) >= 0) {
            return xd5.m(p(j3));
        }
        long convert = be5Var.a.convert(1L, TimeUnit.MILLISECONDS);
        long j4 = (j / convert) - (j2 / convert);
        long j5 = (j % convert) - (j2 % convert);
        wd5 wd5Var = xd5.b;
        return xd5.i(wkn.S(j4, be5Var2), wkn.S(j5, be5Var));
    }

    public static final long y(long j, long j2, be5 be5Var) {
        be5Var.getClass();
        if (((j2 - 1) | 1) != Long.MAX_VALUE) {
            return (1 | (j - 1)) == Long.MAX_VALUE ? p(j) : x(j, j2, be5Var);
        }
        if (j != j2) {
            return xd5.m(p(j2));
        }
        xd5.b.getClass();
        return 0L;
    }

    public static final void z(TextView textView) {
        textView.getClass();
        textView.setTextColor(textView.getContext().getColor(R.color.crowdsourcing_live));
    }

    public abstract qso O(zzjn zzjnVar);

    public abstract void P(vin vinVar, Thread thread);

    public abstract uso Q(zzjn zzjnVar);

    public abstract void R(vin vinVar, vin vinVar2);

    public abstract void S(uso usoVar, uso usoVar2);

    public abstract boolean T(yin yinVar, vin vinVar, vin vinVar2);

    public abstract vin U(yin yinVar);

    public abstract void V(uso usoVar, Thread thread);

    public abstract jin W(yin yinVar);

    public abstract boolean X(zzjn zzjnVar, Object obj, Object obj2);

    public abstract boolean Y(zzjn zzjnVar, uso usoVar, uso usoVar2);

    public abstract boolean Z(yin yinVar, Object obj, Object obj2);
}
