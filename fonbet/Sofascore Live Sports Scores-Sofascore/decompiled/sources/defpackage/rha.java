package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.fido.zzfu;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.Sports;
import com.sofascore.model.branding.PartnerOfferType;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.R;
import com.sofascore.results.league.fragment.details.compose.model.TeamOfTheWeekFieldUIData;
import com.sofascore.results.league.fragment.details.compose.model.TeamOfTheWeekPlayerUIData;
import com.sofascore.results.league.fragment.topStats.TopStatsCategory;
import com.sofascore.results.service.PinnedLeagueWorker;
import com.sofascore.results.view.follownotification.FollowButton;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.RandomAccessFile;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class rha implements zzfu {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public static Boolean e;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0030, code lost:
    
        if (r7 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0098, code lost:
    
        if (r7 == null) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final KSerializer A(p5c p5cVar, Type type, boolean z) {
        ArrayList<KSerializer> arrayList;
        KSerializer A;
        KSerializer A2;
        KClass kClass;
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            if (genericComponentType instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) genericComponentType).getUpperBounds();
                upperBounds.getClass();
                genericComponentType = (Type) ph0.z(upperBounds);
            }
            genericComponentType.getClass();
            if (z) {
                A2 = z(p5cVar, genericComponentType);
            } else {
                p5cVar.getClass();
                A2 = A(p5cVar, genericComponentType, false);
            }
            if (genericComponentType instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) genericComponentType).getRawType();
                rawType.getClass();
                kClass = duf.a.getOrCreateKotlinClass((Class) rawType);
            } else {
                if (!(genericComponentType instanceof KClass)) {
                    a70.r(mz1.k(duf.a, genericComponentType.getClass(), new StringBuilder("unsupported type in GenericArray: ")));
                    return null;
                }
                kClass = (KClass) genericComponentType;
            }
            kClass.getClass();
            return l98.c(kClass, A2);
        }
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (!cls.isArray() || cls.getComponentType().isPrimitive()) {
                return v(p5cVar, cls, km5.a);
            }
            Class<?> componentType = cls.getComponentType();
            componentType.getClass();
            if (z) {
                A = z(p5cVar, componentType);
            } else {
                p5cVar.getClass();
                A = A(p5cVar, componentType, false);
            }
            KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(componentType);
            orCreateKotlinClass.getClass();
            return l98.c(orCreateKotlinClass, A);
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof WildcardType) {
                Type[] upperBounds2 = ((WildcardType) type).getUpperBounds();
                upperBounds2.getClass();
                Object z2 = ph0.z(upperBounds2);
                z2.getClass();
                return A(p5cVar, (Type) z2, true);
            }
            StringBuilder sb = new StringBuilder("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument ");
            sb.append(type);
            sb.append(" has type ");
            a70.p(mz1.k(duf.a, type.getClass(), sb));
            return null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType2 = parameterizedType.getRawType();
        rawType2.getClass();
        Class cls2 = (Class) rawType2;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        actualTypeArguments.getClass();
        if (z) {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type2 : actualTypeArguments) {
                type2.getClass();
                arrayList.add(z(p5cVar, type2));
            }
        } else {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type3 : actualTypeArguments) {
                type3.getClass();
                p5cVar.getClass();
                KSerializer A3 = A(p5cVar, type3, false);
                if (A3 != null) {
                    arrayList.add(A3);
                }
            }
        }
        if (Set.class.isAssignableFrom(cls2)) {
            KSerializer kSerializer = (KSerializer) arrayList.get(0);
            kSerializer.getClass();
            return new xg0(kSerializer, 2);
        }
        if (List.class.isAssignableFrom(cls2) || Collection.class.isAssignableFrom(cls2)) {
            KSerializer kSerializer2 = (KSerializer) arrayList.get(0);
            kSerializer2.getClass();
            return new xg0(kSerializer2, 0);
        }
        if (Map.class.isAssignableFrom(cls2)) {
            return l98.x((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
        }
        if (Map.Entry.class.isAssignableFrom(cls2)) {
            KSerializer kSerializer3 = (KSerializer) arrayList.get(0);
            KSerializer kSerializer4 = (KSerializer) arrayList.get(1);
            kSerializer3.getClass();
            kSerializer4.getClass();
            return new utb(kSerializer3, kSerializer4, 0);
        }
        if (Pair.class.isAssignableFrom(cls2)) {
            KSerializer kSerializer5 = (KSerializer) arrayList.get(0);
            KSerializer kSerializer6 = (KSerializer) arrayList.get(1);
            kSerializer5.getClass();
            kSerializer6.getClass();
            return new utb(kSerializer5, kSerializer6, 1);
        }
        if (n1k.class.isAssignableFrom(cls2)) {
            KSerializer kSerializer7 = (KSerializer) arrayList.get(0);
            KSerializer kSerializer8 = (KSerializer) arrayList.get(1);
            KSerializer kSerializer9 = (KSerializer) arrayList.get(2);
            kSerializer7.getClass();
            kSerializer8.getClass();
            kSerializer9.getClass();
            return new q1k(kSerializer7, kSerializer8, kSerializer9);
        }
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        for (KSerializer kSerializer10 : arrayList) {
            kSerializer10.getClass();
            arrayList2.add(kSerializer10);
        }
        return v(p5cVar, cls2, arrayList2);
        return null;
    }

    public static void B(Context context, String str) {
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
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.getClass();
        edit.putString("PREF_PINNED_LEAGUES_COUNTRY", str);
        Unit unit = Unit.a;
        edit.apply();
    }

    public static final String C(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static void D(Context context) {
        Pair[] pairArr = {wv8.t(context, "ACTION", "UPDATE_DEFAULT_PINNED_LEAGUES")};
        hpo hpoVar = new hpo(18);
        Pair pair = pairArr[0];
        hpoVar.B(pair.b, (String) pair.a);
        md4 l = hpoVar.l();
        vxd.h(context).b("PinnedLeagueWorker-".concat(mha.o(l)), nf6.a, (ltd) vxd.g(PinnedLeagueWorker.class, l).a());
    }

    public static void E(int i, String str) {
        if (i > 0) {
            return;
        }
        a70.p(mz1.j(i, str, " > 0 required but it was "));
    }

    public static int F(Activity activity, int i) {
        return (int) ((i * activity.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int G(Activity activity) {
        return F(activity, activity.getResources().getConfiguration().screenHeightDp);
    }

    public static final void a(TeamOfTheWeekFieldUIData teamOfTheWeekFieldUIData, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        float f;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1360120625);
        int i2 = (i & 6) == 0 ? (av8Var.g(teamOfTheWeekFieldUIData) ? 4 : 2) | i : i;
        Function1 function12 = function1;
        if ((i & 48) == 0) {
            i2 |= av8Var.i(function12) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            int i3 = ((Configuration) av8Var.k(nz.a)).screenWidthDp - 8;
            int i4 = 6;
            u23 a2 = t23.a(ww9.h, uxf.o, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, xtcVar);
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
            av8Var.d0(-1247688940);
            int i5 = 0;
            int i6 = 0;
            for (Object obj : teamOfTheWeekFieldUIData.b) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    b.q();
                    throw null;
                }
                int intValue = ((Number) obj).intValue();
                int min = Math.min(i3 / intValue, 112);
                utc utcVar = utc.a;
                xtc d2 = bkh.d(utcVar, 1.0f);
                int i8 = i2;
                l8g a3 = k8g.a(ww9.g, uxf.l, av8Var, i4);
                int i9 = i4;
                int i10 = i6;
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C2 = fqj.C(av8Var, d2);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var2);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a3, hf3.g);
                waa.K(av8Var, m2, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode2), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C2, hf3.d);
                av8Var.d0(-270774732);
                int i11 = 0;
                while (i11 < intValue) {
                    int i12 = i5 + 1;
                    TeamOfTheWeekPlayerUIData teamOfTheWeekPlayerUIData = (TeamOfTheWeekPlayerUIData) CollectionsKt.a0((r2.size() - 1) - i5, teamOfTheWeekFieldUIData.c);
                    if (Intrinsics.c(teamOfTheWeekFieldUIData.a, Sports.BASKETBALL) && i10 == 0) {
                        if (i11 == 0 || i11 == 2) {
                            f = 24.0f;
                            int i13 = min;
                            yxi.b(teamOfTheWeekPlayerUIData, i13, l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), function12, av8Var, (i8 << 6) & 7168);
                            i11++;
                            function12 = function1;
                            min = i13;
                            i5 = i12;
                            intValue = intValue;
                        }
                    }
                    f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    int i132 = min;
                    yxi.b(teamOfTheWeekPlayerUIData, i132, l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), function12, av8Var, (i8 << 6) & 7168);
                    i11++;
                    function12 = function1;
                    min = i132;
                    i5 = i12;
                    intValue = intValue;
                }
                av8Var.s(false);
                av8Var.s(true);
                function12 = function1;
                i6 = i7;
                i2 = i8;
                i4 = i9;
            }
            av8Var.s(false);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new opg(teamOfTheWeekFieldUIData, function1, xtcVar, i, 9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(String str, xtc xtcVar, long j, of3 of3Var, int i, int i2) {
        xtc xtcVar2;
        long j2;
        av8 av8Var;
        xtc xtcVar3;
        long j3;
        eqf u;
        xtc xtcVar4;
        long D;
        int i3;
        str.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1593128919);
        int i4 = (av8Var2.g(str) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            xtcVar2 = xtcVar;
            i4 |= av8Var2.g(xtcVar2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    j2 = j;
                    if (av8Var2.f(j2)) {
                        i3 = NotificationCompat.FLAG_LOCAL_ONLY;
                        i4 |= i3;
                    }
                } else {
                    j2 = j;
                }
                i3 = 128;
                i4 |= i3;
            } else {
                j2 = j;
            }
            if (av8Var2.T(i4 & 1, (i4 & 147) == 146)) {
                av8Var = av8Var2;
                av8Var.W();
                xtcVar3 = xtcVar2;
                j3 = j2;
            } else {
                av8Var2.Y();
                if ((i & 1) == 0 || av8Var2.B()) {
                    xtcVar4 = i5 != 0 ? utc.a : xtcVar2;
                    if ((i2 & 4) != 0) {
                        i4 &= -897;
                        D = lz.D(R.color.n_lv_1, av8Var2);
                        av8Var2.t();
                        yf8 yf8Var = xth.a;
                        av8Var = av8Var2;
                        udj.c(str, l98.f0(l98.d0(bkh.d(xtcVar4, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6.0f, 5), D, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.j(), av8Var, i4 & 910, 24960, 109560);
                        xtcVar3 = xtcVar4;
                        j3 = D;
                    }
                } else {
                    av8Var2.W();
                    if ((i2 & 4) != 0) {
                        i4 &= -897;
                    }
                    xtcVar4 = xtcVar2;
                }
                D = j2;
                av8Var2.t();
                yf8 yf8Var2 = xth.a;
                av8Var = av8Var2;
                udj.c(str, l98.f0(l98.d0(bkh.d(xtcVar4, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6.0f, 5), D, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.j(), av8Var, i4 & 910, 24960, 109560);
                xtcVar3 = xtcVar4;
                j3 = D;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new xj(str, xtcVar3, j3, i, i2, 3);
                return;
            }
            return;
        }
        xtcVar2 = xtcVar;
        if ((i & 384) != 0) {
        }
        if (av8Var2.T(i4 & 1, (i4 & 147) == 146)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(String str, xtc xtcVar, Function2 function2, of3 of3Var, int i, int i2) {
        xtc xtcVar2;
        int i3;
        Function2 function22;
        av8 av8Var;
        xtc xtcVar3;
        Function2 function23;
        eqf u;
        str.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1758506749);
        int i4 = (av8Var2.g(str) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i3 = i4 | (av8Var2.g(xtcVar2) ? 32 : 16);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            function22 = function2;
            i3 |= av8Var2.i(function22) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            if (av8Var2.T(i3 & 1, (i3 & 147) == 146)) {
                av8Var = av8Var2;
                av8Var.W();
                xtcVar3 = xtcVar2;
                function23 = function22;
            } else {
                utc utcVar = utc.a;
                xtc xtcVar4 = i5 != 0 ? utcVar : xtcVar2;
                Function2 function24 = i6 != 0 ? null : function22;
                lv1 lv1Var = uxf.m;
                xtc f0 = l98.f0(l98.d0(bkh.d(xtcVar4, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 5);
                l8g a2 = k8g.a(ww9.b, lv1Var, av8Var2, 48);
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
                waa.K(av8Var2, a2, hf3.g);
                waa.K(av8Var2, m, hf3.f);
                waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
                waa.J(av8Var2, hf3.k);
                waa.K(av8Var2, C, hf3.d);
                yf8 yf8Var = xth.a;
                Function2 function25 = function24;
                xtc xtcVar5 = xtcVar4;
                udj.c(str, new goa(1.0f, true), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var2, i3 & 14, 24960, 110584);
                av8Var = av8Var2;
                if (function25 != null) {
                    ljg.r(8.0f, -2045819762, av8Var, av8Var, utcVar);
                    me4.l((i3 >> 6) & 14, function25, av8Var, false);
                } else {
                    av8Var.d0(-2045745765);
                    av8Var.s(false);
                }
                av8Var.s(true);
                xtcVar3 = xtcVar5;
                function23 = function25;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new r22(str, xtcVar3, function23, i, i2, 7);
                return;
            }
            return;
        }
        function22 = function2;
        if (av8Var2.T(i3 & 1, (i3 & 147) == 146)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final int i, final int i2, final int i3, final int i4, final Integer num, xtc xtcVar, long j, long j2, long j3, float f, float f2, of3 of3Var, final int i5, final int i6, final int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        xtc xtcVar2;
        long j4;
        int i12;
        int i13;
        int i14;
        av8 av8Var;
        final long j5;
        final float f3;
        final xtc xtcVar3;
        final long j6;
        final long j7;
        final float f4;
        eqf u;
        long j8;
        long j9;
        float f5;
        float f6;
        long j10;
        long j11;
        int i15;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1111983599);
        if ((i5 & 6) == 0) {
            i8 = (av8Var2.e(i) ? 4 : 2) | i5;
        } else {
            i8 = i5;
        }
        if ((i5 & 48) == 0) {
            i9 = i2;
            i8 |= av8Var2.e(i9) ? 32 : 16;
        } else {
            i9 = i2;
        }
        if ((i5 & 384) == 0) {
            i10 = i3;
            i8 |= av8Var2.e(i10) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        } else {
            i10 = i3;
        }
        if ((i5 & 3072) == 0) {
            i11 = i4;
            i8 |= av8Var2.e(i11) ? a.o : 1024;
        } else {
            i11 = i4;
        }
        if ((i5 & 24576) == 0) {
            i8 |= av8Var2.g(num) ? 16384 : 8192;
        }
        int i16 = i7 & 32;
        if (i16 != 0) {
            i8 |= 196608;
        } else if ((196608 & i5) == 0) {
            xtcVar2 = xtcVar;
            i8 |= av8Var2.g(xtcVar2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
            if ((1572864 & i5) != 0) {
                if ((i7 & 64) == 0) {
                    j4 = j;
                    if (av8Var2.f(j4)) {
                        i15 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        i8 |= i15;
                    }
                } else {
                    j4 = j;
                }
                i15 = 524288;
                i8 |= i15;
            } else {
                j4 = j;
            }
            if ((12582912 & i5) == 0) {
                i8 |= ((i7 & 128) == 0 && av8Var2.f(j2)) ? 8388608 : 4194304;
            }
            if ((i5 & 100663296) == 0) {
                i8 |= ((i7 & NotificationCompat.FLAG_LOCAL_ONLY) == 0 && av8Var2.f(j3)) ? 67108864 : 33554432;
            }
            i12 = i7 & 512;
            if (i12 == 0) {
                i8 |= 805306368;
            } else if ((805306368 & i5) == 0) {
                i8 |= av8Var2.d(f) ? 536870912 : 268435456;
                i13 = i7 & 1024;
                if (i13 != 0) {
                    i14 = 6;
                } else if ((i6 & 6) == 0) {
                    i14 = i6 | (av8Var2.d(f2) ? 4 : 2);
                } else {
                    i14 = i6;
                }
                if (av8Var2.T(i8 & 1, (i8 & 306783379) == 306783378 || (i14 & 3) != 2)) {
                    av8Var2.Y();
                    int i17 = i5 & 1;
                    utc utcVar = utc.a;
                    if (i17 == 0 || av8Var2.B()) {
                        if (i16 != 0) {
                            xtcVar2 = utcVar;
                        }
                        if ((i7 & 64) != 0) {
                            j4 = lz.D(R.color.surface_2, av8Var2);
                            i8 &= -3670017;
                        }
                        if ((i7 & 128) != 0) {
                            j8 = lz.D(R.color.n_lv_1, av8Var2);
                            i8 &= -29360129;
                        } else {
                            j8 = j2;
                        }
                        if ((i7 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
                            j9 = lz.D(R.color.n_lv_3, av8Var2);
                            i8 &= -234881025;
                        } else {
                            j9 = j3;
                        }
                        f5 = i12 != 0 ? 8.0f : f;
                        f6 = i13 != 0 ? 20.0f : f2;
                        j10 = j8;
                        j11 = j9;
                    } else {
                        av8Var2.W();
                        if ((i7 & 64) != 0) {
                            i8 &= -3670017;
                        }
                        if ((i7 & 128) != 0) {
                            i8 &= -29360129;
                        }
                        if ((i7 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
                            i8 &= -234881025;
                        }
                        j10 = j2;
                        j11 = j3;
                        f5 = f;
                        f6 = f2;
                    }
                    av8Var2.t();
                    xtc c0 = l98.c0(n9e.q(xtcVar2, j4, o7g.a(4.0f)), 4.0f, 2.0f);
                    l8g a2 = k8g.a(ww9.b, uxf.m, av8Var2, 48);
                    int i18 = i8;
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
                    td4.G(i, bkh.l(utcVar, f6), false, 0L, av8Var2, i18 & 14, 12);
                    nq8.h(av8Var2, bkh.p(utcVar, f5));
                    String valueOf = String.valueOf(i10);
                    yf8 yf8Var = xth.a;
                    udj.c(valueOf, null, (num != null && num.intValue() == 1) ? j10 : j11, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.k(), av8Var2, 0, 0, 131066);
                    udj.c(" - ", null, j11, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.k(), av8Var2, ((i18 >> 18) & 896) | 6, 0, 131066);
                    udj.c(String.valueOf(i11), null, (num != null && num.intValue() == 2) ? j10 : j11, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.k(), av8Var2, 0, 0, 131066);
                    av8Var = av8Var2;
                    td4.G(i9, ljg.i(utcVar, f5, av8Var, utcVar, f6), false, 0L, av8Var, (i18 >> 3) & 14, 12);
                    av8Var.s(true);
                    f3 = f6;
                    xtcVar3 = xtcVar2;
                    j6 = j4;
                    j5 = j10;
                    j7 = j11;
                    f4 = f5;
                } else {
                    av8Var = av8Var2;
                    av8Var.W();
                    j5 = j2;
                    f3 = f2;
                    xtcVar3 = xtcVar2;
                    j6 = j4;
                    j7 = j3;
                    f4 = f;
                }
                u = av8Var.u();
                if (u != null) {
                    u.d = new Function2() { // from class: wjc
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int K = aba.K(i5 | 1);
                            int K2 = aba.K(i6);
                            rha.d(i, i2, i3, i4, num, xtcVar3, j6, j5, j7, f4, f3, (of3) obj, K, K2, i7);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            i13 = i7 & 1024;
            if (i13 != 0) {
            }
            if (av8Var2.T(i8 & 1, (i8 & 306783379) == 306783378 || (i14 & 3) != 2)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        xtcVar2 = xtcVar;
        if ((1572864 & i5) != 0) {
        }
        if ((12582912 & i5) == 0) {
        }
        if ((i5 & 100663296) == 0) {
        }
        i12 = i7 & 512;
        if (i12 == 0) {
        }
        i13 = i7 & 1024;
        if (i13 != 0) {
        }
        if (av8Var2.T(i8 & 1, (i8 & 306783379) == 306783378 || (i14 & 3) != 2)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final void e(gv9 gv9Var, gv9 gv9Var2, Function1 function1, xtc xtcVar, boolean z, lrh lrhVar, of3 of3Var, int i) {
        boolean z2;
        gv9Var.getClass();
        gv9Var2.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(677970005);
        int i2 = i | (av8Var.g(gv9Var) ? 4 : 2) | (av8Var.g(gv9Var2) ? 32 : 16) | (av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | 24576;
        if (av8Var.T(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = 6;
            s02.l(xtcVar, new ng0(12.0f, true, new a70(i3)), new ng0(12.0f, true, new a70(i3)), null, 0, 0, yqo.H(-165221234, av8Var, new nrh(gv9Var, gv9Var2, lrhVar, function1, 0)), av8Var, 1573302);
            z2 = true;
        } else {
            av8Var.W();
            z2 = z;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new orh(gv9Var, gv9Var2, function1, xtcVar, z2, lrhVar, i, 0);
        }
    }

    public static final void f(int i, of3 of3Var, vnb vnbVar, Function1 function1, boolean z) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2028163292);
        int i2 = (av8Var.g(vnbVar) ? 4 : 2) | i | (av8Var.h(z) ? 32 : 16) | (av8Var.i(function1) ? 256 : 128);
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 896) == 256;
            Object O = av8Var.O();
            if (z2 || O == nf3.a) {
                O = new vbc(18, function1);
                av8Var.n0(O);
            }
            ktm.s(vnbVar, (Function0) O, z, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, yqo.H(1493600894, av8Var, new y47(20, function1)), av8Var, (i2 & 14) | 100663296 | ((i2 << 3) & 896), 248);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new i66(vnbVar, z, function1, i);
        }
    }

    public static final void g(d3i d3iVar, of3 of3Var, int i) {
        d3iVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(847127191);
        int i2 = (av8Var.i(d3iVar) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) av8Var.k(nz.b);
            e1d x = rfo.x(d3iVar.f, av8Var, 0);
            e1d x2 = rfo.x(d3iVar.j, av8Var, 0);
            vnb vnbVar = (vnb) x.getValue();
            boolean booleanValue = ((Boolean) x2.getValue()).booleanValue();
            boolean g = av8Var.g(x) | av8Var.i(context) | av8Var.i(d3iVar);
            Object O = av8Var.O();
            if (g || O == nf3.a) {
                O = new vsc(19, d3iVar, x, context);
                av8Var.n0(O);
            }
            f(0, av8Var, vnbVar, (Function1) O, booleanValue);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new fvg(d3iVar, i, 23);
        }
    }

    public static final void h(TeamOfTheWeekFieldUIData teamOfTheWeekFieldUIData, Function1 function1, of3 of3Var, int i) {
        int i2;
        teamOfTheWeekFieldUIData.getClass();
        String str = teamOfTheWeekFieldUIData.a;
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1718599109);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(teamOfTheWeekFieldUIData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(function1) ? 32 : 16;
        }
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            utc utcVar = utc.a;
            xtc c2 = bkh.c(utcVar, 1.0f);
            if (Intrinsics.c(str, Sports.FOOTBALL)) {
                c2 = c2.z(l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13));
            }
            if (Intrinsics.c(str, Sports.BASKETBALL)) {
                c2 = c2.z(l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 28.0f, 1));
            }
            a(teamOfTheWeekFieldUIData, function1, c2, av8Var, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new nmi(teamOfTheWeekFieldUIData, function1, i, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(TopStatsCategory topStatsCategory, Function0 function0, String str, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        xtc xtcVar2;
        int i3;
        ry ryVar;
        f50 f50Var;
        a99 a99Var;
        xtc xtcVar3;
        wxf wxfVar;
        f50 f50Var2;
        ff3 ff3Var;
        lv1 lv1Var;
        zg3 zg3Var;
        f50 f50Var3;
        boolean z;
        float f;
        topStatsCategory.getClass();
        str.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(560324319);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? av8Var.g(topStatsCategory) : av8Var.i(topStatsCategory) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.g(str) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i4 = i2 | 3072;
        if (av8Var.T(i4 & 1, (i4 & 1171) != 1170)) {
            Context context = (Context) av8Var.k(nz.b);
            boolean contains = b.j(context.getString(R.string.average_sofascore_rating), context.getString(R.string.sofascore_rating)).contains(topStatsCategory.getA());
            xtc xtcVar4 = utc.a;
            xtc d0 = l98.d0(bkh.g(bkh.d(xtcVar4, 1.0f), 48.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            lv1 lv1Var2 = uxf.m;
            wxf wxfVar2 = ww9.b;
            l8g a2 = k8g.a(wxfVar2, lv1Var2, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d0);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
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
            av8Var.d0(883030409);
            a99 a99Var2 = nf3.a;
            if (contains) {
                xtc A = wnn.A(xtcVar4, o7g.a(16.0f));
                i3 = i4;
                boolean i5 = ((i4 & 896) == 256) | av8Var.i(context) | ((i4 & 14) == 4 || ((i4 & 8) != 0 && av8Var.i(topStatsCategory)));
                Object O = av8Var.O();
                if (i5 || O == a99Var2) {
                    O = new mth(5, context, topStatsCategory, str);
                    av8Var.n0(O);
                }
                a99Var = a99Var2;
                ryVar = ryVar2;
                f50Var = f50Var5;
                ff3Var = ff3Var2;
                lv1Var = lv1Var2;
                zg3Var = zg3Var2;
                f50Var3 = f50Var6;
                wxfVar = wxfVar2;
                xtcVar3 = xtcVar4;
                f50Var2 = f50Var4;
                z = false;
                xtcVar4 = tol.y(A, false, false, false, 0L, null, (Function0) O, av8Var, 31);
            } else {
                i3 = i4;
                ryVar = ryVar2;
                f50Var = f50Var5;
                a99Var = a99Var2;
                xtcVar3 = xtcVar4;
                wxfVar = wxfVar2;
                f50Var2 = f50Var4;
                ff3Var = ff3Var2;
                lv1Var = lv1Var2;
                zg3Var = zg3Var2;
                f50Var3 = f50Var6;
                z = false;
            }
            av8Var.s(z);
            xtc b0 = l98.b0(xtcVar4, 8.0f);
            l8g a3 = k8g.a(wxfVar, lv1Var, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, b0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var2);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            String a4 = topStatsCategory.getA();
            yf8 yf8Var = xth.a;
            utc utcVar = xtcVar3;
            udj.c(a4, kda.O(utcVar, "title", av8Var), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var, 0, 24960, 110584);
            av8Var = av8Var;
            if (contains) {
                ljg.r(8.0f, -1181821151, av8Var, av8Var, utcVar);
                f = 16.0f;
                kq9.b(s6a.N(R.drawable.ic_info, 6, av8Var), null, bkh.l(utcVar, 16.0f), lz.D(R.color.primary_default, av8Var), av8Var, 432, 0);
                av8Var.s(z);
            } else {
                f = 16.0f;
                av8Var.d0(-1181488645);
                av8Var.s(z);
            }
            av8Var.s(true);
            nq8.h(av8Var, new goa(1.0f, true));
            if (function0 == null) {
                av8Var.d0(1605579598);
                av8Var.s(z);
            } else {
                av8Var.d0(1605579599);
                String v = oea.v(R.string.see_all, av8Var);
                long D = lz.D(R.color.primary_default, av8Var);
                dfj l = xth.l();
                xtc O2 = kda.O(wnn.A(utcVar, o7g.a(f)), "see_all", av8Var);
                boolean z2 = (i3 & 112) == 32 ? true : z;
                Object O3 = av8Var.O();
                if (z2 || O3 == a99Var) {
                    O3 = new rsd(19, function0);
                    av8Var.n0(O3);
                }
                udj.c(v, l98.b0(tol.y(O2, false, false, false, 0L, null, (Function0) O3, av8Var, 31), 8.0f), D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, l, av8Var, 0, 0, 131064);
                av8Var = av8Var;
                Unit unit = Unit.a;
                av8Var.s(z);
            }
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b1j(topStatsCategory, function0, str, xtcVar2, i);
        }
    }

    public static final String j(PartnerOfferType partnerOfferType) {
        int i = iwb.a[partnerOfferType.ordinal()];
        if (i == 1) {
            return "StreamingModal";
        }
        if (i == 2) {
            return "ProductModal";
        }
        if (i == 3) {
            return "GiveawayModal";
        }
        if (i == 4) {
            return "GenericPartnerModal";
        }
        zzl.b();
        return null;
    }

    public static void k(String str, StringBuilder sb) {
        str.getClass();
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\n') {
                sb.append("%0A");
            } else if (charAt == '\r') {
                sb.append("%0D");
            } else if (charAt != '\"') {
                sb.append(charAt);
            } else {
                sb.append("%22");
            }
        }
        sb.append('\"');
    }

    public static void l(r1f r1fVar, nta ntaVar, int i, t1f t1fVar) {
        r1fVar.getClass();
        ntaVar.getClass();
        Context context = r1fVar.a.getContext();
        r1fVar.f.setText(String.valueOf(i));
        r1fVar.e.setText(ntaVar.b);
        context.getClass();
        TextView textView = r1fVar.c;
        long j = ntaVar.c;
        int i2 = 0;
        if (j > 0) {
            String E = uxf.E(j, 58, false);
            String string = context.getString(R.string.number_of_followers, E);
            string.getClass();
            SpannableString spannableString = new SpannableString(string);
            spannableString.setSpan(new ForegroundColorSpan(context.getColor(R.color.primary_default)), 0, E.length(), 0);
            textView.setText(spannableString);
        } else {
            textView.setText(R.string.no_followers);
        }
        FollowButton followButton = r1fVar.b;
        Player player = new Player(ntaVar.a, ntaVar.b, (String) null, ntaVar.c, (Team) null);
        wu wuVar = wu.POPUP;
        int i3 = FollowButton.i;
        rq3 rq3Var = null;
        followButton.e(player, wuVar, null);
        ImageView imageView = r1fVar.d;
        int s = ao2.s(40, context);
        du9[] du9VarArr = {new du9(ao2.s(40, context), 17, new s1f(context, ntaVar, rq3Var, i2)), new du9(ao2.s(16, context), 85, new s1f(context, ntaVar, rq3Var, 1))};
        boolean z = as9.a;
        imageView.setImageResource(R.drawable.player_photo_placeholder);
        if (!imageView.isAttachedToWindow()) {
            imageView.addOnAttachStateChangeListener(new xr9(imageView, imageView, s, du9VarArr, t1fVar));
            return;
        }
        u6b w = qha.w(imageView);
        if (w != null) {
            g9i L = xw3.L(wca.x(w.getLifecycle()), null, null, new z23(s, du9VarArr, imageView, (rq3) null), 3);
            if (t1fVar != null) {
                t1fVar.invoke(L);
            }
        }
    }

    public static void m(float f, float f2, float f3) {
        if (f >= f2) {
            a70.p("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
        } else {
            if (f2 < f3) {
                return;
            }
            a70.p("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
        }
    }

    public static h12 n(RandomAccessFile randomAccessFile) {
        long length = randomAccessFile.length();
        long j = length - 22;
        if (j < 0) {
            throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
        }
        long j2 = length - 65558;
        long j3 = j2 >= 0 ? j2 : 0L;
        int reverseBytes = Integer.reverseBytes(101010256);
        do {
            randomAccessFile.seek(j);
            if (randomAccessFile.readInt() == reverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                h12 h12Var = new h12();
                h12Var.b = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                h12Var.a = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                return h12Var;
            }
            j--;
        } while (j >= j3);
        throw new ZipException("End Of Central Directory signature not found");
    }

    public static vjg o(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        HashMap v = mha.v(jSONObject.getJSONObject("reasons"));
        if (v.isEmpty()) {
            throw new wo0("CreativeFeedback's `reasons` dictionary is empty.");
        }
        for (Map.Entry entry : v.entrySet()) {
            int parseInt = Integer.parseInt((String) entry.getKey());
            Object value = entry.getValue();
            value.getClass();
            arrayList.add(new yig(parseInt, (String) value));
        }
        if (arrayList.size() > 1) {
            n13.u(new laf(11), arrayList);
        }
        String string = jSONObject.getString("loggerURL");
        string.getClass();
        List S0 = CollectionsKt.S0(arrayList);
        String optString = jSONObject.optString("whyThisAdURL", "https://whythisad.smartadserver.com/?data=[metadata]");
        optString.getClass();
        return new vjg(string, optString, S0);
    }

    public static final qbl p(lcl lclVar) {
        lclVar.getClass();
        return new qbl(lclVar.a, lclVar.t);
    }

    public static final qqg q(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            qqg qqgVar = tag instanceof qqg ? (qqg) tag : null;
            if (qqgVar != null) {
                return qqgVar;
            }
            Object r = mha.r(view);
            view = r instanceof View ? (View) r : null;
        }
        return null;
    }

    public static String r(Context context) {
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
        return sharedPreferences.getString("PREF_PINNED_LEAGUES_COUNTRY", null);
    }

    public static final boolean s(KeyEvent keyEvent) {
        return (keyEvent.getFlags() & 2) == 2;
    }

    public static final Class t(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            rawType.getClass();
            return t(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            upperBounds.getClass();
            Object z = ph0.z(upperBounds);
            z.getClass();
            return t((Type) z);
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            genericComponentType.getClass();
            return t(genericComponentType);
        }
        StringBuilder sb = new StringBuilder("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument ");
        sb.append(type);
        sb.append(" has type ");
        a70.p(mz1.k(duf.a, type.getClass(), sb));
        return null;
    }

    public static long u(j9e j9eVar, int i, int i2) {
        j9eVar.N(i);
        if (j9eVar.a() < 5) {
            return C.TIME_UNSET;
        }
        int m = j9eVar.m();
        if ((8388608 & m) != 0 || ((2096896 & m) >> 8) != i2 || (m & 32) == 0 || j9eVar.A() < 7 || j9eVar.a() < 7 || (j9eVar.A() & 16) != 16) {
            return C.TIME_UNSET;
        }
        j9eVar.k(new byte[6], 0, 6);
        return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((r0[4] & 255) >> 7);
    }

    public static final KSerializer v(p5c p5cVar, Class cls, List list) {
        KSerializer[] kSerializerArr = (KSerializer[]) list.toArray(new KSerializer[0]);
        KSerializer C = b0a.C(cls, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (C != null) {
            return C;
        }
        fuf fufVar = duf.a;
        KClass orCreateKotlinClass = fufVar.getOrCreateKotlinClass(cls);
        ltb ltbVar = h7f.a;
        orCreateKotlinClass.getClass();
        KSerializer kSerializer = (KSerializer) h7f.a.get(orCreateKotlinClass);
        if (kSerializer != null) {
            return kSerializer;
        }
        KSerializer g = p5cVar.g(orCreateKotlinClass, list);
        if (g != null) {
            return g;
        }
        if (cls.isInterface()) {
            return new a0f(fufVar.getOrCreateKotlinClass(cls));
        }
        return null;
    }

    public static void w(j74 j74Var) {
        j74Var.k = -3.4028235E38f;
        j74Var.j = Integer.MIN_VALUE;
        CharSequence charSequence = j74Var.a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                charSequence = SpannableString.valueOf(charSequence);
                j74Var.a = charSequence;
            }
            charSequence.getClass();
            Spannable spannable = (Spannable) charSequence;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static void x(Object obj, String str) {
        if (obj != null) {
            return;
        }
        yhk.s(str);
    }

    public static float y(int i, float f, int i2, int i3) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f2 = i3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    return -3.4028235E38f;
                }
                return f;
            }
            f2 = i2;
        }
        return f * f2;
    }

    public static final KSerializer z(p5c p5cVar, Type type) {
        p5cVar.getClass();
        type.getClass();
        KSerializer A = A(p5cVar, type, true);
        if (A != null) {
            return A;
        }
        Class t = t(type);
        t.getClass();
        throw new v5h(s9a.E(duf.a.getOrCreateKotlinClass(t)));
    }
}
