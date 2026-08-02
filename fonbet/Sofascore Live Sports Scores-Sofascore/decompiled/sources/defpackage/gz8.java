package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcelable;
import android.widget.RemoteViews;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.InterfaceC4060ee;
import com.ironsource.V2;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Score;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.StatusTime;
import com.sofascore.model.mvvm.model.TeamSides;
import com.sofascore.model.mvvm.model.Time;
import com.sofascore.model.newNetwork.PlayerWithDepthAssignment;
import com.sofascore.model.profile.InvitedUser;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class gz8 {
    public static final tc3 a = new tc3(610461630, new ed3(5), false);
    public static final tc3 b = new tc3(1889549516, new qd3(27), false);
    public static final String[] c = {"standard", "accelerate", "decelerate", "linear"};
    public static final gda d = new gda();
    public static final Object e = new Object();
    public static final /* synthetic */ int f = 0;
    public static final /* synthetic */ int g = 0;
    public static final /* synthetic */ int h = 0;
    public static final /* synthetic */ int i = 0;

    public static final void A(RemoteViews remoteViews, q99 q99Var, int i2) {
        z25 z25Var = q99Var.a;
        int i3 = Build.VERSION.SDK_INT;
        r25 r25Var = r25.a;
        x25 x25Var = x25.a;
        if (i3 >= 31) {
            if (i3 >= 33 || !b.j(x25Var, r25Var).contains(z25Var)) {
                rf0.a.b(remoteViews, i2, z25Var);
                return;
            }
            return;
        }
        List j = b.j(x25Var, s25.a, r25Var);
        Map map = aoa.a;
        if (j.contains(z25Var)) {
            return;
        }
        sw9.o(z25Var, " requires a complex layout before API 31", "Using a height of ");
    }

    public static final void B(RemoteViews remoteViews, a8l a8lVar, int i2) {
        z25 z25Var = a8lVar.a;
        int i3 = Build.VERSION.SDK_INT;
        r25 r25Var = r25.a;
        x25 x25Var = x25.a;
        if (i3 >= 31) {
            if (i3 >= 33 || !b.j(x25Var, r25Var).contains(z25Var)) {
                rf0.a.c(remoteViews, i2, z25Var);
                return;
            }
            return;
        }
        List j = b.j(x25Var, s25.a, r25Var);
        Map map = aoa.a;
        if (j.contains(z25Var)) {
            return;
        }
        sw9.o(z25Var, " requires a complex layout before API 31", "Using a width of ");
    }

    public static final Object C(zwh zwhVar, int i2) {
        Object obj;
        zwhVar.getClass();
        int h2 = kik.h(zwhVar.d, i2, zwhVar.b);
        if (h2 < 0 || (obj = zwhVar.c[h2]) == e) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] D(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            jArr[i2] = iArr[i2];
        }
        return jArr;
    }

    public static final vy8 E(vy8 vy8Var, float f2) {
        return vy8Var.d(new tt3(new q25(f2)));
    }

    public static final byte[] F(CharsetEncoder charsetEncoder, CharSequence charSequence, int i2, int i3) {
        charsetEncoder.getClass();
        charSequence.getClass();
        if (charSequence instanceof String) {
            if (i2 == 0) {
                String str = (String) charSequence;
                if (i3 == str.length()) {
                    byte[] bytes = str.getBytes(charsetEncoder.charset());
                    bytes.getClass();
                    return bytes;
                }
            }
            byte[] bytes2 = ((String) charSequence).substring(i2, i3).getBytes(charsetEncoder.charset());
            bytes2.getClass();
            return bytes2;
        }
        ByteBuffer encode = charsetEncoder.encode(CharBuffer.wrap(charSequence, i2, i3));
        byte[] bArr = null;
        if (encode.hasArray() && encode.arrayOffset() == 0) {
            byte[] array = encode.array();
            if (array.length == encode.remaining()) {
                bArr = array;
            }
        }
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[encode.remaining()];
        encode.get(bArr2);
        return bArr2;
    }

    public static final kp5 G(Enum[] enumArr) {
        enumArr.getClass();
        return new kp5(enumArr);
    }

    public static final void H(zwh zwhVar) {
        int i2 = zwhVar.d;
        int[] iArr = zwhVar.b;
        Object[] objArr = zwhVar.c;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != e) {
                if (i4 != i3) {
                    iArr[i3] = iArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        zwhVar.a = false;
        zwhVar.d = i3;
    }

    public static final CoroutineContext I(k6g k6gVar, boolean z, sq3 sq3Var) {
        xuj xujVar = (xuj) sq3Var.getContext().get(xuj.b);
        CoroutineContext coroutineContext = xujVar != null ? xujVar.a : null;
        if (k6gVar.inCompatibilityMode()) {
            return coroutineContext != null ? k6gVar.getQueryContext().plus(coroutineContext) : z ? k6gVar.getTransactionContext$room_runtime() : k6gVar.getQueryContext();
        }
        CoroutineContext queryContext = k6gVar.getQueryContext();
        if (coroutineContext == null) {
            coroutineContext = g.a;
        }
        return queryContext.plus(coroutineContext);
    }

    public static final String J(Charset charset) {
        charset.getClass();
        String name = charset.name();
        name.getClass();
        return name;
    }

    public static Object K(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return z9.k(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static ArrayList L(Bundle bundle, String str, Class cls) {
        return Build.VERSION.SDK_INT >= 34 ? z9.m(bundle, str, cls) : bundle.getParcelableArrayList(str);
    }

    public static Serializable M(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return z9.n(bundle, str, cls);
        }
        Serializable serializable = bundle.getSerializable(str);
        if (cls.isInstance(serializable)) {
            return serializable;
        }
        return null;
    }

    public static long N(double d2) {
        z1a.r("not a normal value", O(d2));
        int exponent = Math.getExponent(d2);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d2) & 4503599627370495L;
        return exponent == -1023 ? doubleToRawLongBits << 1 : doubleToRawLongBits | 4503599627370496L;
    }

    public static boolean O(double d2) {
        return Math.getExponent(d2) <= 1023;
    }

    public static final boolean P(z25 z25Var) {
        if (z25Var instanceof q25) {
            return true;
        }
        if ((Intrinsics.c(z25Var, r25.a) ? true : Intrinsics.c(z25Var, s25.a) ? true : Intrinsics.c(z25Var, x25.a)) || z25Var == null) {
            return false;
        }
        zzl.b();
        return false;
    }

    public static gv9 Q(List list) {
        List L0 = CollectionsKt.L0(CollectionsKt.H0(list, new se7(20)), 5);
        ArrayList arrayList = new ArrayList(k13.r(L0, 10));
        Iterator it = L0.iterator();
        while (it.hasNext()) {
            arrayList.add(X((PlayerWithDepthAssignment) it.next()));
        }
        gv9 W = l6g.W(arrayList);
        List j = b.j(l6g.W(CollectionsKt.L0(W, 3)), l6g.W(CollectionsKt.S(W, 3)));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : j) {
            if (!((gv9) obj).isEmpty()) {
                arrayList2.add(obj);
            }
        }
        return l6g.W(arrayList2);
    }

    public static final wn1 R(Context context, Event event, boolean z) {
        String str;
        String str2;
        String str3;
        int i2;
        TeamSides teamSides;
        int i3;
        String str4;
        StatusTime statusTime;
        event.getClass();
        context.getClass();
        int id = event.getId();
        int id2 = Event.getHomeTeam$default(event, null, 1, null).getId();
        int id3 = Event.getAwayTeam$default(event, null, 1, null).getId();
        String p = tba.p(context, Event.getHomeTeam$default(event, null, 1, null));
        String A = tba.A(context, Event.getHomeTeam$default(event, null, 1, null));
        String nameCode = Event.getHomeTeam$default(event, null, 1, null).getNameCode();
        String p2 = tba.p(context, Event.getAwayTeam$default(event, null, 1, null));
        String A2 = tba.A(context, Event.getAwayTeam$default(event, null, 1, null));
        String nameCode2 = Event.getAwayTeam$default(event, null, 1, null).getNameCode();
        Score homeScore$default = Event.getHomeScore$default(event, null, 1, null);
        Integer current = !z ? homeScore$default.getCurrent() : homeScore$default.getDisplay();
        Score awayScore$default = Event.getAwayScore$default(event, null, 1, null);
        Integer current2 = !z ? awayScore$default.getCurrent() : awayScore$default.getDisplay();
        boolean disabled = Event.getHomeTeam$default(event, null, 1, null).getDisabled();
        boolean disabled2 = Event.getAwayTeam$default(event, null, 1, null).getDisabled();
        Integer num = current2;
        long timestamp = event.getTimestamp();
        String type = event.getStatus().getType();
        String c2 = afi.c(context, event.getStatusDescription(), event.getSportSlug(), true);
        Time time = event.getTime();
        String H = (time == null || (statusTime = time.getStatusTime()) == null) ? null : z8e.H(statusTime, xe6.c().b);
        if (ok3.z(event)) {
            str = c2;
            str2 = H;
            if (hkg.c0(context)) {
                str3 = A;
                i2 = id3;
                str4 = yid.m(Event.getAwayScore$default(event, null, 1, null).getPenalties()) + " - " + yid.m(Event.getHomeScore$default(event, null, 1, null).getPenalties()) + " " + context.getString(R.string.penalties_short);
            } else {
                str3 = A;
                i2 = id3;
                str4 = context.getString(R.string.penalties_short) + " " + yid.m(Event.getHomeScore$default(event, null, 1, null).getPenalties()) + " - " + yid.m(Event.getAwayScore$default(event, null, 1, null).getPenalties());
            }
            teamSides = null;
            i3 = 1;
        } else {
            str = c2;
            str2 = H;
            str3 = A;
            i2 = id3;
            teamSides = null;
            i3 = 1;
            str4 = null;
        }
        return new wn1(id, id2, i2, p, str3, nameCode, p2, A2, nameCode2, current, num, Event.getHomeScore$default(event, teamSides, i3, teamSides).getPenalties(), Event.getAwayScore$default(event, teamSides, i3, teamSides).getPenalties(), disabled, disabled2, timestamp, type, str, str4, str2, Event.getWinnerCode$default(event, teamSides, i3, teamSides));
    }

    public static final Object S(k6g k6gVar, boolean z, boolean z2, Function1 function1) {
        k6gVar.getClass();
        k6gVar.assertNotMainThread();
        k6gVar.assertNotSuspendingTransaction();
        CoroutineContext coroutineContext = k6gVar.getSuspendingTransactionContext().get();
        if (coroutineContext == null) {
            coroutineContext = g.a;
        }
        return wca.F(new fb4(coroutineContext, k6gVar, z2, z, function1, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0092, code lost:
    
        if (r8 == r1) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object T(rq3 rq3Var, k6g k6gVar, Function1 function1) {
        gb4 gb4Var;
        int i2;
        Function1 function12;
        if (rq3Var instanceof gb4) {
            gb4Var = (gb4) rq3Var;
            int i3 = gb4Var.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gb4Var.u = i3 - Integer.MIN_VALUE;
                Object obj = gb4Var.t;
                lu3 lu3Var = lu3.a;
                i2 = gb4Var.u;
                int i4 = 1;
                rq3 rq3Var2 = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    if (k6gVar.inCompatibilityMode()) {
                        cl clVar = new cl(k6gVar, function1, rq3Var2, 7);
                        gb4Var.u = 1;
                        Object c0 = l6g.c0(gb4Var, k6gVar, clVar);
                        if (c0 != lu3Var) {
                            return c0;
                        }
                    } else if (k6gVar.inCompatibilityMode() && k6gVar.isOpenInternal$room_runtime() && k6gVar.inTransaction()) {
                        ib4 ib4Var = new ib4(k6gVar, rq3Var2, function1, i4);
                        gb4Var.u = 2;
                        Object useConnection = k6gVar.useConnection(false, ib4Var, gb4Var);
                        if (useConnection != lu3Var) {
                            return useConnection;
                        }
                    } else {
                        gb4Var.r = k6gVar;
                        gb4Var.s = (hoi) function1;
                        gb4Var.u = 3;
                        obj = I(k6gVar, true, gb4Var);
                        function12 = function1;
                    }
                }
                if (i2 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                if (i2 == 2) {
                    y6a.M(obj);
                    return obj;
                }
                if (i2 != 3) {
                    if (i2 == 4) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Function1 function13 = (Function1) gb4Var.s;
                k6gVar = gb4Var.r;
                y6a.M(obj);
                function12 = function13;
                hy1 hy1Var = new hy1((rq3) null, k6gVar, function12);
                gb4Var.r = null;
                gb4Var.s = null;
                gb4Var.u = 4;
                Object R = xw3.R((CoroutineContext) obj, hy1Var, gb4Var);
                return R != lu3Var ? lu3Var : R;
            }
        }
        gb4Var = new gb4(rq3Var);
        Object obj2 = gb4Var.t;
        lu3 lu3Var2 = lu3.a;
        i2 = gb4Var.u;
        int i42 = 1;
        rq3 rq3Var22 = null;
        if (i2 != 0) {
        }
        hy1 hy1Var2 = new hy1((rq3) null, k6gVar, function12);
        gb4Var.r = null;
        gb4Var.s = null;
        gb4Var.u = 4;
        Object R2 = xw3.R((CoroutineContext) obj2, hy1Var2, gb4Var);
        if (R2 != lu3Var2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object U(rq3 rq3Var, k6g k6gVar, boolean z, boolean z2, Function1 function1) {
        jb4 jb4Var;
        int i2;
        k6g k6gVar2;
        Function1 function12;
        boolean z3;
        boolean z4;
        if (rq3Var instanceof jb4) {
            jb4Var = (jb4) rq3Var;
            int i3 = jb4Var.w;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jb4Var.w = i3 - Integer.MIN_VALUE;
                jb4 jb4Var2 = jb4Var;
                Object obj = jb4Var2.v;
                lu3 lu3Var = lu3.a;
                i2 = jb4Var2.w;
                if (i2 != 0) {
                    y6a.M(obj);
                    if (k6gVar.inCompatibilityMode() && k6gVar.isOpenInternal$room_runtime() && k6gVar.inTransaction()) {
                        db4 db4Var = new db4(z2, z, k6gVar, null, function1, 1);
                        jb4Var2.w = 1;
                        Object useConnection = k6gVar.useConnection(z, db4Var, jb4Var2);
                        if (useConnection != lu3Var) {
                            return useConnection;
                        }
                    } else {
                        jb4Var2.r = k6gVar;
                        jb4Var2.s = function1;
                        jb4Var2.t = z;
                        jb4Var2.u = z2;
                        jb4Var2.w = 2;
                        CoroutineContext I = I(k6gVar, z2, jb4Var2);
                        if (I != lu3Var) {
                            k6gVar2 = k6gVar;
                            function12 = function1;
                            z3 = z;
                            obj = I;
                            z4 = z2;
                        }
                    }
                }
                if (i2 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                if (i2 != 2) {
                    if (i2 == 3) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z5 = jb4Var2.u;
                boolean z6 = jb4Var2.t;
                Function1 function13 = jb4Var2.s;
                k6g k6gVar3 = jb4Var2.r;
                y6a.M(obj);
                z4 = z5;
                z3 = z6;
                function12 = function13;
                k6gVar2 = k6gVar3;
                eb4 eb4Var = new eb4((rq3) null, k6gVar2, z3, z4, function12);
                jb4Var2.r = null;
                jb4Var2.s = null;
                jb4Var2.w = 3;
                Object R = xw3.R((CoroutineContext) obj, eb4Var, jb4Var2);
                return R != lu3Var ? lu3Var : R;
            }
        }
        jb4Var = new jb4(rq3Var);
        jb4 jb4Var22 = jb4Var;
        Object obj2 = jb4Var22.v;
        lu3 lu3Var2 = lu3.a;
        i2 = jb4Var22.w;
        if (i2 != 0) {
        }
        eb4 eb4Var2 = new eb4((rq3) null, k6gVar2, z3, z4, function12);
        jb4Var22.r = null;
        jb4Var22.s = null;
        jb4Var22.w = 3;
        Object R2 = xw3.R((CoroutineContext) obj2, eb4Var2, jb4Var22);
        if (R2 != lu3Var2) {
        }
    }

    public static final Cursor V(k6g k6gVar, hni hniVar) {
        k6gVar.getClass();
        hniVar.getClass();
        return k6gVar.query(hniVar, (CancellationSignal) null);
    }

    public static boolean W(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                if (bArr[i2] == bArr2[i2]) {
                }
            }
            return true;
        }
        return false;
    }

    public static qp9 X(PlayerWithDepthAssignment playerWithDepthAssignment) {
        int id = playerWithDepthAssignment.getPlayer().getId();
        String C = tba.C(playerWithDepthAssignment.getPlayer());
        if (C == null) {
            C = tba.t(playerWithDepthAssignment.getPlayer());
        }
        Integer depth = playerWithDepthAssignment.getDepth();
        Integer valueOf = Integer.valueOf(depth != null ? depth.intValue() : 0);
        ccd ccdVar = pp9.a;
        Player player = playerWithDepthAssignment.getPlayer();
        ccdVar.getClass();
        return new qp9(id, C, valueOf, ccd.x(player));
    }

    public static final void a(gv9 gv9Var, Function1 function1, xtc xtcVar, Integer num, of3 of3Var, int i2) {
        int i3;
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-791768433);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.i(gv9Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(function1) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if ((i2 & 3072) == 0) {
            i4 |= av8Var.g(num) ? a.o : 1024;
        }
        if (av8Var.T(i4 & 1, (i4 & 1171) != 1170)) {
            ksa a2 = msa.a(0, 0, av8Var, 0, 3);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            Object obj = O;
            if (O == a99Var) {
                koh kohVar = new koh();
                if (num != null) {
                    kohVar.put(Integer.valueOf(num.intValue()), Boolean.TRUE);
                }
                av8Var.n0(kohVar);
                obj = kohVar;
            }
            koh kohVar2 = (koh) obj;
            t3e C = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 72.0f, 7);
            boolean i5 = av8Var.i(gv9Var) | ((i4 & 112) == 32);
            Object O2 = av8Var.O();
            if (i5 || O2 == a99Var) {
                O2 = new fa(gv9Var, kohVar2, function1);
                av8Var.n0(O2);
            }
            utc utcVar = utc.a;
            v8a.a(utcVar, a2, C, null, null, null, false, null, (Function1) O2, av8Var, ((i4 >> 6) & 14) | 384, PglCryptUtils.BASE64_FAILED);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bk1(gv9Var, function1, xtcVar2, num, i2, 5);
        }
    }

    public static final void b(pyg pygVar, e93 e93Var, Integer num, Function0 function0, of3 of3Var, int i2) {
        gv9 gv9Var;
        e93Var.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1663147512);
        int i3 = (av8Var.i(pygVar) ? 4 : 2) | i2 | (av8Var.e(e93Var.ordinal()) ? 32 : 16) | (av8Var.g(num) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function0) ? 2048 : 1024);
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            gyg gygVar = (gyg) ((vnb) rfo.x(pygVar.f, av8Var, 0).getValue()).a();
            if (gygVar == null || (gv9Var = (gv9) gygVar.e.get(e93Var)) == null) {
                gv9Var = rlh.b;
            }
            boolean i4 = ((i3 & 112) == 32) | av8Var.i(pygVar) | ((i3 & 7168) == 2048);
            Object O = av8Var.O();
            if (i4 || O == nf3.a) {
                O = new fa(10, pygVar, e93Var, function0);
                av8Var.n0(O);
            }
            a(gv9Var, (Function1) O, null, num, av8Var, (i3 << 3) & 7168);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ace(i2, 5, pygVar, e93Var, num, function0);
        }
    }

    public static final void c(uv3 uv3Var, boolean z, Function0 function0, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        long j;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1359346466);
        int i3 = i2 | (av8Var.g(uv3Var) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | 3072;
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            String c2 = tv3.c((Context) av8Var.k(nz.b), uv3Var.a);
            utc utcVar = utc.a;
            xtc w = oyn.w(bkh.d(utcVar, 1.0f), false, null, null, function0, 15);
            if (z) {
                j = ljg.f(av8Var, -661882833, R.color.on_color_highlight_2, av8Var, false);
            } else {
                av8Var.d0(-661881399);
                av8Var.s(false);
                j = r13.h;
            }
            xtc c0 = l98.c0(n9e.q(w, j, oyn.e), 16.0f, 12.0f);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
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
            td4.k(uv3Var.b, bkh.l(utcVar, 24.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, av8Var, 48, 12);
            xtc e2 = fn0.e(1.0f, l98.d0(utcVar, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), true);
            long D = lz.D(R.color.on_color_primary, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(c2, e2, D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var, 0, 0, 131064);
            av8Var = av8Var;
            if (z) {
                av8Var.d0(-122987347);
                kq9.b(s6a.N(R.drawable.ic_tv_channel_checkmark_16, 6, av8Var), null, bkh.l(utcVar, 24.0f), lz.D(R.color.on_color_primary, av8Var), av8Var, 432, 0);
                av8Var = av8Var;
                av8Var.s(false);
            } else {
                av8Var.d0(-122723072);
                av8Var.s(false);
            }
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new yq2(uv3Var, z, function0, xtcVar2, i2, 1);
        }
    }

    public static final void d(final String str, String str2, final long j, String str3, final fy7 fy7Var, final fy7 fy7Var2, final boolean z, of3 of3Var, final int i2) {
        String str4;
        Pair pair;
        boolean z2;
        ema emaVar;
        boolean z3;
        ema emaVar2;
        final String str5 = str3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-402794518);
        int i3 = i2 | (av8Var.g(str) ? 4 : 2) | (av8Var.g(str2) ? 32 : 16) | (av8Var.f(j) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(str5) ? a.o : 1024) | (av8Var.g(fy7Var) ? 16384 : 8192) | (av8Var.g(fy7Var2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if ((i2 & 1572864) == 0) {
            i3 |= av8Var.h(z) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i4 = i3;
        if (av8Var.T(i4 & 1, (i4 & 599187) != 599186)) {
            utc utcVar = utc.a;
            xtc d0 = l98.d0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
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
            boolean z4 = (!z || fy7Var.h == null || fy7Var2.h == null) ? false : true;
            p8g p8gVar = p8g.a;
            xtc a3 = p8gVar.a(1.0f, utcVar, true);
            boolean z5 = z4;
            boolean z6 = !z5;
            i(fy7Var, z5, a3, z6, av8Var, (i4 >> 12) & 14);
            xtc a4 = p8gVar.a(1.0f, utcVar, true);
            u23 a5 = t23.a(ww9.d, uxf.p, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, a4);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a5, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            str4 = str2;
            int i5 = 3;
            if (Intrinsics.c(str4, StatusKt.STATUS_NOT_STARTED)) {
                av8Var.d0(-1196954171);
                Pair v = pd0.v(j, (Context) av8Var.k(nz.b));
                String str6 = (String) v.a;
                String str7 = (String) v.b;
                Pair x = pd0.x(j);
                int intValue = ((Number) x.a).intValue();
                int intValue2 = ((Number) x.b).intValue();
                if (intValue == 3) {
                    av8Var.d0(2039609927);
                    av8Var.s(false);
                    emaVar = ema.a;
                } else {
                    av8Var.d0(2039610891);
                    emaVar = (ema) av8Var.k(dh3.n);
                    av8Var.s(false);
                }
                ff5 ff5Var = dh3.n;
                tol.b(ff5Var.a(emaVar), yqo.H(1595822111, av8Var, new tk1(str6, 2)), av8Var, 56);
                if (intValue2 == 3) {
                    av8Var.d0(2039626503);
                    z3 = false;
                    av8Var.s(false);
                    emaVar2 = ema.a;
                } else {
                    z3 = false;
                    av8Var.d0(2039627467);
                    emaVar2 = (ema) av8Var.k(ff5Var);
                    av8Var.s(false);
                }
                tol.b(ff5Var.a(emaVar2), yqo.H(1815693910, av8Var, new tk1(str7, i5)), av8Var, 56);
                av8Var.s(z3);
                z2 = true;
                str5 = str3;
            } else {
                av8Var.d0(-1195637570);
                if (Intrinsics.c(str4, StatusKt.STATUS_IN_PROGRESS)) {
                    av8Var.d0(-1195575849);
                    pair = new Pair(new r13(lz.D(R.color.live, av8Var)), new r13(lz.D(R.color.live_highlight, av8Var)));
                    av8Var.s(false);
                } else {
                    av8Var.d0(-1195499620);
                    pair = new Pair(new r13(lz.D(R.color.n_lv_3, av8Var)), new r13(lz.D(R.color.surface_1, av8Var)));
                    av8Var.s(false);
                }
                long j2 = ((r13) pair.a).a;
                xtc c0 = l98.c0(n9e.q(utcVar, ((r13) pair.b).a, o7g.a(8.0f)), 8.0f, 2.0f);
                str5 = str3;
                String c2 = afi.c((Context) av8Var.k(nz.b), str5, str, false);
                yf8 yf8Var = xth.a;
                z2 = true;
                udj.c(c2, c0, j2, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 130040);
                av8Var.s(false);
            }
            av8Var.s(z2);
            i(fy7Var2, z5, p8gVar.a(1.0f, utcVar, z2), z6, av8Var, (i4 >> 15) & 14);
            av8Var.s(z2);
        } else {
            str4 = str2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            final String str8 = str4;
            u.d = new Function2() { // from class: cx7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    gz8.d(str, str8, j, str5, fy7Var, fy7Var2, z, (of3) obj, aba.K(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(int i2, int i3, of3 of3Var, xtc xtcVar, String str, Function0 function0) {
        xtc xtcVar2;
        str.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1845530562);
        int i4 = i3 | (av8Var.e(i2) ? 4 : 2) | (av8Var.g(str) ? 32 : 16) | (av8Var.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | 3072;
        if (av8Var.T(i4 & 1, (i4 & 1171) != 1170)) {
            Context context = (Context) av8Var.k(nz.b);
            lv1 lv1Var = uxf.m;
            kg0 kg0Var = ww9.h;
            utc utcVar = utc.a;
            xtc d0 = l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            l8g a2 = k8g.a(kg0Var, lv1Var, av8Var, 54);
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
            xtc f0 = l98.f0(ljg.g(av8Var, C, f50Var3, 1.0f, true), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
            u23 a3 = t23.a(ww9.d, uxf.o, av8Var, 0);
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
            String w = oea.w(R.string.fantasy_round_highlights_title, new Object[]{f5p.C(context, i2, str)}, av8Var);
            yf8 yf8Var = xth.a;
            dfj j = xth.j();
            long j2 = r13.d;
            udj.c(w, null, j2, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, j, av8Var, 384, 24960, 110586);
            udj.c(oea.v(R.string.fantasy_round_highlights_text, av8Var), null, lz.D(R.color.on_color_secondary, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110586);
            av8Var.s(true);
            xtc q = n9e.q(wnn.A(utcVar, o7g.a), lz.D(R.color.on_color_highlight_2, av8Var), oyn.e);
            boolean z = (i4 & 896) == 256;
            Object O = av8Var.O();
            if (z || O == nf3.a) {
                O = new v61(23, function0);
                av8Var.n0(O);
            }
            xtc y = tol.y(q, false, false, false, 0L, null, (Function0) O, av8Var, 31);
            av8Var = av8Var;
            xtc b0 = l98.b0(y, 4.0f);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, b0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            kq9.b(s6a.N(R.drawable.ic_close, 6, av8Var), null, bkh.l(utcVar, 24.0f), j2, av8Var, V2.b.f, 0);
            av8Var.s(true);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b30(i2, i3, 24, str, function0, xtcVar2);
        }
    }

    public static final void f(zo6 zo6Var, Function1 function1, boolean z, of3 of3Var, int i2) {
        zo6 zo6Var2;
        av8 av8Var;
        e1d e1dVar;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(846865506);
        int i3 = i2 | (av8Var2.g(zo6Var) ? 4 : 2) | (av8Var2.i(function1) ? 32 : 16) | (av8Var2.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var2.T(i3 & 1, (i3 & 147) != 146)) {
            kx4 kx4Var = (kx4) av8Var2.k(dh3.h);
            float H0 = kx4Var.H0(64.0f);
            float H02 = kx4Var.H0(48.0f);
            int i4 = 3;
            ksa a2 = msa.a(0, 0, av8Var2, 0, 3);
            Object O = av8Var2.O();
            rq3 rq3Var = null;
            Object obj = nf3.a;
            if (O == obj) {
                O = e.f(null);
                av8Var2.n0(O);
            }
            e1d e1dVar2 = (e1d) O;
            Object O2 = av8Var2.O();
            if (O2 == obj) {
                O2 = e.b(H0);
                av8Var2.n0(O2);
            }
            xnh xnhVar = (xnh) O2;
            Object O3 = av8Var2.O();
            if (O3 == obj) {
                O3 = goh.b(new ni4(a2, i4));
                av8Var2.n0(O3);
            }
            cdi cdiVar = (cdi) O3;
            Object O4 = av8Var2.O();
            if (O4 == obj) {
                O4 = goh.b(new n37(9, a2, xnhVar));
                av8Var2.n0(O4);
            }
            cdi cdiVar2 = (cdi) O4;
            boolean g2 = av8Var2.g(a2) | av8Var2.d(H02) | av8Var2.g(kx4Var) | av8Var2.d(H0);
            Object O5 = av8Var2.O();
            if (g2 || O5 == obj) {
                Object uc7Var = new uc7(a2, H02, kx4Var, H0, e1dVar2, xnhVar, cdiVar, null);
                e1dVar = e1dVar2;
                av8Var2.n0(uc7Var);
                O5 = uc7Var;
            } else {
                e1dVar = e1dVar2;
            }
            hz8.o(av8Var2, a2, (Function2) O5);
            m73 m73Var = zo6Var.b;
            m73 m73Var2 = zo6Var.c;
            boolean g3 = av8Var2.g(a2);
            Object O6 = av8Var2.O();
            if (g3 || O6 == obj) {
                O6 = new hs6(a2, e1dVar, rq3Var, 21);
                av8Var2.n0(O6);
            }
            hz8.q(m73Var, m73Var2, (Function2) O6, av8Var2);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, utc.a);
            if3.k7.getClass();
            Function0 function0 = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(function0);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, c2, hf3.g);
            waa.K(av8Var2, m, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            gb0 a3 = nyd.a.a(null);
            rc7 rc7Var = new rc7(a2, zo6Var, function1, z, e1dVar, cdiVar, cdiVar2);
            zo6Var2 = zo6Var;
            tol.b(a3, yqo.H(1190702556, av8Var2, rc7Var), av8Var2, 56);
            av8Var = av8Var2;
            fz8.e(zo6Var2.a, null, uo5.e(s02.h0(200, 0, null, 6), 2), uo5.f(s02.h0(200, 0, null, 6), 2), null, fkf.b, av8Var, 200064, 18);
            av8Var.s(true);
        } else {
            zo6Var2 = zo6Var;
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t60(zo6Var2, function1, z, i2, 9);
        }
    }

    public static final void g(yc7 yc7Var, Function1 function1, of3 of3Var, int i2) {
        yc7Var.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-6957726);
        int i3 = (av8Var.i(yc7Var) ? 4 : 2) | i2 | (av8Var.i(function1) ? 32 : 16);
        int i4 = 9;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            zo6 m = yc7Var.m();
            boolean z = yc7Var.h;
            boolean i5 = av8Var.i(yc7Var) | ((i3 & 112) == 32);
            Object O = av8Var.O();
            if (i5 || O == nf3.a) {
                O = new w47(i4, function1, yc7Var);
                av8Var.n0(O);
            }
            f(m, (Function1) O, z, av8Var, 0);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new kz6(yc7Var, function1, i2, i4);
        }
    }

    public static final void h(do7 do7Var, final Integer num, final float f2, final int i2, final int i3, final FantasyCompetitionType fantasyCompetitionType, final gv9 gv9Var, final xtc xtcVar, of3 of3Var, final int i4) {
        do7 do7Var2;
        av8 av8Var;
        int i5;
        int i6;
        int i7;
        String format;
        do7Var.getClass();
        ev6 ev6Var = do7Var.c;
        fantasyCompetitionType.getClass();
        gv9Var.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1226506374);
        int i8 = i4 | (av8Var2.g(do7Var) ? 4 : 2) | (av8Var2.g(num) ? 32 : 16) | (av8Var2.d(f2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.e(i2) ? a.o : 1024) | (av8Var2.e(i3) ? 16384 : 8192) | (av8Var2.e(fantasyCompetitionType.ordinal()) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var2.g(gv9Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (av8Var2.T(i8 & 1, (4793491 & i8) != 4793490)) {
            Context context = (Context) av8Var2.k(nz.b);
            xtc d0 = l98.d0(l98.f0(n9e.q(bkh.d(xtcVar, 1.0f), lz.D(R.color.surface_1, av8Var2), o7g.a(16.0f)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.o;
            u23 a2 = t23.a(p4hVar, kv1Var, av8Var2, 0);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, d0);
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
            String v = oea.v(R.string.overview, av8Var2);
            yf8 yf8Var = xth.a;
            dfj j = xth.j();
            long D = lz.D(R.color.n_lv_1, av8Var2);
            utc utcVar = utc.a;
            udj.c(v, l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6.0f, 5), D, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, j, av8Var2, 48, 24960, 109560);
            av8Var = av8Var2;
            int i9 = 6;
            ng0 ng0Var = new ng0(8.0f, true, new a70(i9));
            xtc d02 = l98.d0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            u23 a3 = t23.a(ng0Var, kv1Var, av8Var, 6);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d02);
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
            ng0 ng0Var2 = new ng0(8.0f, true, new a70(i9));
            xtc d2 = bkh.d(utcVar, 1.0f);
            lv1 lv1Var = uxf.l;
            l8g a4 = k8g.a(ng0Var2, lv1Var, av8Var, 6);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, d2);
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
            p8g p8gVar = p8g.a;
            xtc a5 = p8gVar.a(1.0f, utcVar, true);
            String v2 = oea.v(R.string.fantasy_round, av8Var);
            int i10 = ev6Var.r;
            int i11 = ev6Var.s;
            context.getClass();
            l4a.c(v2, fc6.g(i10, i11, hkg.c0(context) ? "\\" : "/"), a5, av8Var, 0);
            l4a.c(oea.v(R.string.total_points, av8Var), yid.j(num), p8gVar.a(1.0f, utcVar, true), av8Var, 0);
            av8Var.s(true);
            ng0 ng0Var3 = new ng0(8.0f, true, new a70(6));
            xtc d3 = bkh.d(utcVar, 1.0f);
            l8g a6 = k8g.a(ng0Var3, lv1Var, av8Var, 6);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C4 = fqj.C(av8Var, d3);
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
            xtc a7 = p8gVar.a(1.0f, utcVar, true);
            String v3 = oea.v(R.string.fantasy_global_rank, av8Var);
            do7Var2 = do7Var;
            Integer num2 = do7Var2.l;
            String i12 = num2 != null ? dla.i(num2) : null;
            if (i12 == null) {
                i12 = "-";
            }
            l4a.c(v3, i12, a7, av8Var, 0);
            xtc a8 = p8gVar.a(1.0f, utcVar, true);
            int[] iArr = sl7.a;
            int i13 = iArr[fantasyCompetitionType.ordinal()];
            if (i13 != 1) {
                i5 = 2;
                if (i13 != 2) {
                    throw dmi.h(av8Var, -125628105, false);
                }
                i6 = -125622144;
                i7 = R.string.fantasy_elite_faceoff_matches_left_to_play;
            } else {
                i5 = 2;
                i6 = -125625720;
                i7 = R.string.fantasy_team_value;
            }
            String k = ljg.k(av8Var, i6, i7, av8Var, false);
            int i14 = iArr[fantasyCompetitionType.ordinal()];
            if (i14 == 1) {
                Locale d4 = dla.d();
                Set set = o84.a;
                format = String.format(d4, "%s%.1fM", Arrays.copyOf(new Object[]{o84.e(context), Float.valueOf(f2)}, i5));
            } else {
                if (i14 != i5) {
                    zzl.b();
                    return;
                }
                format = fc6.g(i2, i3, hkg.c0(context) ? "\\" : "/");
            }
            l4a.c(k, format, a8, av8Var, 0);
            av8Var.s(true);
            av8Var.s(true);
            if (gv9Var.isEmpty()) {
                av8Var.d0(2079097054);
                av8Var.s(false);
            } else {
                av8Var.d0(2078399368);
                udj.c(oea.v(R.string.fantasy_tokens, av8Var), l98.f0(l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i5), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6.0f, 5), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.l(), av8Var, 48, 24960, 109560);
                av8Var = av8Var;
                Iterator<E> it = gv9Var.iterator();
                while (it.hasNext()) {
                    r((vl7) it.next(), ev6Var.w, null, av8Var, 0);
                }
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            do7Var2 = do7Var;
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            final do7 do7Var3 = do7Var2;
            u.d = new Function2(num, f2, i2, i3, fantasyCompetitionType, gv9Var, xtcVar, i4) { // from class: rl7
                public final /* synthetic */ Integer b;
                public final /* synthetic */ float c;
                public final /* synthetic */ int d;
                public final /* synthetic */ int e;
                public final /* synthetic */ FantasyCompetitionType f;
                public final /* synthetic */ gv9 g;
                public final /* synthetic */ xtc h;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(12582913);
                    gz8.h(do7.this, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    public static final void i(fy7 fy7Var, boolean z, xtc xtcVar, boolean z2, of3 of3Var, int i2) {
        int i3;
        boolean z3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(R.drawable.moloco_twotone_play_arrow_24);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(fy7Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.h(z2) ? a.o : 1024;
        }
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            u23 a2 = t23.a(new ng0(4.0f, true, new a70(6)), uxf.p, av8Var, 54);
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
            int i4 = fy7Var.a;
            utc utcVar = utc.a;
            td4.G(i4, bkh.l(utcVar, 32.0f), false, 0L, av8Var, 48, 12);
            if (z) {
                av8Var.d0(-308969770);
                Double d2 = fy7Var.h;
                z3 = true;
                i9a.i(Double.valueOf(d2 != null ? d2.doubleValue() : 0.0d), false, null, null, null, null, false, av8Var, 432, PglCryptUtils.BASE64_FAILED);
                av8Var = av8Var;
                av8Var.s(false);
            } else {
                z3 = true;
                if (z2) {
                    av8Var.d0(-308745919);
                    xtc d0 = l98.d0(utcVar, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    String str = fy7Var.c;
                    if (str == null) {
                        str = "";
                    }
                    yf8 yf8Var = xth.a;
                    udj.c(str, d0, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.k(), av8Var, 48, 24960, 110584);
                    av8Var = av8Var;
                    av8Var.s(false);
                } else {
                    av8Var.d0(-308442894);
                    av8Var.s(false);
                }
            }
            av8Var.s(z3);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bl1(fy7Var, z, xtcVar, z2, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void j(xtc xtcVar, long j, long j2, float f2, int i2, of3 of3Var, final int i3, final int i4) {
        xtc xtcVar2;
        int i5;
        float f3;
        int i6;
        int i7;
        int i8;
        final long j3;
        final float f4;
        final int i9;
        final xtc xtcVar3;
        final long j4;
        eqf u;
        xtc xtcVar4;
        int i10;
        int i11;
        long j5;
        float f5;
        long j6;
        long j7;
        long j8;
        int i12;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1432383562);
        int i13 = i4 & 1;
        if (i13 != 0) {
            i5 = i3 | 6;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i5 = (av8Var.g(xtcVar2) ? 4 : 2) | i3;
        }
        int i14 = i5 | 144;
        int i15 = i4 & 8;
        if (i15 != 0) {
            i14 = i5 | 3216;
        } else if ((i3 & 3072) == 0) {
            f3 = f2;
            i14 |= av8Var.d(f3) ? a.o : 1024;
            if ((i4 & 16) != 0) {
                i6 = i2;
                if (av8Var.e(i6)) {
                    i7 = 16384;
                    i8 = i14 | i7;
                    if (av8Var.T(i8 & 1, (i8 & 9363) != 9362)) {
                        av8Var.Y();
                        if ((i3 & 1) == 0 || av8Var.B()) {
                            xtcVar4 = i13 != 0 ? utc.a : xtcVar2;
                            long D = lz.D(R.color.primary_default, av8Var);
                            long D2 = lz.D(R.color.primary_highlight, av8Var);
                            int i16 = i8 & (-1009);
                            if (i15 != 0) {
                                f3 = 6.0f;
                            }
                            if ((i4 & 16) != 0) {
                                i10 = i8 & (-58353);
                                f5 = f3;
                                i11 = 1;
                                j6 = D;
                                j5 = D2;
                            } else {
                                i10 = i16;
                                i11 = i6;
                                j5 = D2;
                                f5 = f3;
                                j6 = D;
                            }
                        } else {
                            av8Var.W();
                            int i17 = i8 & (-1009);
                            if ((i4 & 16) != 0) {
                                i17 = i8 & (-58353);
                            }
                            j5 = j2;
                            i10 = i17;
                            xtcVar4 = xtcVar2;
                            i11 = i6;
                            f5 = f3;
                            j6 = j;
                        }
                        av8Var.t();
                        final f2a q = i2a.q(i2a.F(null, av8Var, 1), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, s02.P(s02.h0(InterfaceC4060ee.c.d, 0, jg5.d, 2), bzf.a, 0L, 4), null, av8Var, 4536, 8);
                        xtc e2 = bkh.e(bkh.d(xtcVar4, 1.0f), f5);
                        boolean g2 = av8Var.g(q) | av8Var.f(j5) | av8Var.f(j6) | ((((57344 & i10) ^ 24576) > 16384 && av8Var.e(i11)) || (i10 & 24576) == 16384);
                        Object O = av8Var.O();
                        if (g2 || O == nf3.a) {
                            final long j9 = j6;
                            final long j10 = j5;
                            final int i18 = i11;
                            O = new Function1() { // from class: i09
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    ha5 ha5Var = (ha5) obj;
                                    ha5Var.getClass();
                                    float intBitsToFloat = Float.intBitsToFloat((int) (ha5Var.n() >> 32)) * 0.5f;
                                    float floatValue = (((Number) q.getValue()).floatValue() * (Float.intBitsToFloat((int) (ha5Var.n() >> 32)) + intBitsToFloat)) - intBitsToFloat;
                                    Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    long j11 = j10;
                                    v7b t = wxf.t(new Pair[]{new Pair(valueOf, new r13(j11)), new Pair(Float.valueOf(0.5f), new r13(j9)), new Pair(Float.valueOf(1.0f), new r13(j11))}, floatValue, intBitsToFloat + floatValue, 8);
                                    float intBitsToFloat2 = Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) / 2.0f;
                                    long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32);
                                    float intBitsToFloat3 = Float.intBitsToFloat((int) (ha5Var.n() >> 32));
                                    float intBitsToFloat4 = Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) / 2.0f;
                                    ha5.j0(ha5Var, t, floatToRawIntBits, (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L), Float.intBitsToFloat((int) (4294967295L & ha5Var.n())), i18, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 480);
                                    return Unit.a;
                                }
                            };
                            j7 = j10;
                            j8 = j9;
                            i12 = i18;
                            av8Var.n0(O);
                        } else {
                            j8 = j6;
                            j7 = j5;
                            i12 = i11;
                        }
                        lz.d(0, av8Var, e2, (Function1) O);
                        float f6 = f5;
                        xtcVar3 = xtcVar4;
                        f4 = f6;
                        av8Var = av8Var;
                        j3 = j7;
                        i9 = i12;
                        j4 = j8;
                    } else {
                        av8Var.W();
                        j3 = j2;
                        f4 = f3;
                        i9 = i6;
                        xtcVar3 = xtcVar2;
                        j4 = j;
                    }
                    u = av8Var.u();
                    if (u != null) {
                        u.d = new Function2() { // from class: j09
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                gz8.j(xtcVar3, j4, j3, f4, i9, (of3) obj, aba.K(i3 | 1), i4);
                                return Unit.a;
                            }
                        };
                        return;
                    }
                    return;
                }
            } else {
                i6 = i2;
            }
            i7 = 8192;
            i8 = i14 | i7;
            if (av8Var.T(i8 & 1, (i8 & 9363) != 9362)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        f3 = f2;
        if ((i4 & 16) != 0) {
        }
        i7 = 8192;
        i8 = i14 | i7;
        if (av8Var.T(i8 & 1, (i8 & 9363) != 9362)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final void k(InvitedUser invitedUser, Function0 function0, of3 of3Var, int i2) {
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1480224599);
        int i3 = (av8Var.i(invitedUser) ? 4 : 2) | i2 | (av8Var.i(function0) ? 32 : 16);
        int i4 = 0;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            xtc d0 = l98.d0(bkh.c, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
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
            utc utcVar = utc.a;
            un0.a(bkh.d(l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), 1.0f), o7g.a(16.0f), rd0.t(lz.D(R.color.surface_1, av8Var), av8Var, 0), null, null, yqo.H(-239057601, av8Var, new bba(invitedUser, i4)), av8Var, 196614, 24);
            un0.a(bkh.d(utcVar, 1.0f), o7g.a(16.0f), rd0.t(lz.D(R.color.surface_1, av8Var), av8Var, 0), null, null, yso.b, av8Var, 196614, 24);
            w1l.o(1.0f, true, av8Var);
            xtc z = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 32.0f, 7).z(new we9(uxf.p));
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
                O2 = o67.x;
                av8Var.n0(O2);
            }
            xtc y = tol.y(z, true, true, true, D, wzcVar, new p28(function0, (boh) o3a.N(objArr, (Function0) O2, av8Var, 48), 6), av8Var, 0);
            l8g a3 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, y);
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
            String v = oea.v(R.string.quit_squad_rewards, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, null, lz.D(R.color.error, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131066);
            kq9.b(s6a.N(R.drawable.ic_log_out, 6, av8Var), null, bkh.l(l98.f0(utcVar, 4.0f, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 4), 16.0f), lz.D(R.color.error, av8Var), av8Var, 432, 0);
            av8Var = av8Var;
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new op9(invitedUser, function0, i2, 6);
        }
    }

    public static final void l(int i2, old oldVar, xtc xtcVar, of3 of3Var, int i3) {
        xtc xtcVar2;
        boolean z;
        vmd vmdVar = vmd.MONETIZED_ODDS_TAB;
        oldVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-692375361);
        int i4 = (av8Var.e(i2) ? 4 : 2) | i3 | (av8Var.g(oldVar) ? 32 : 16) | (av8Var.e(6) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | 3072;
        if (av8Var.T(i4 & 1, (i4 & 1171) != 1170)) {
            utc utcVar = utc.a;
            xtc d0 = l98.d0(bkh.d(utcVar, 1.0f), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
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
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            iu7.f(i2, i4 & 14, 2, av8Var, null);
            if (oldVar.c) {
                av8Var.d0(193479861);
                xtc O = kda.O(new goa(1.0f, true), "header_title", av8Var);
                String v = oea.v(R.string.featured_by, av8Var);
                yf8 yf8Var = xth.a;
                udj.c(v, O, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, new p7j(6), 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 130040);
                xtcVar2 = utcVar;
                int i5 = i4 >> 3;
                z = true;
                nld.f(oldVar, vmdVar, null, null, null, kda.O(l98.f0(xtcVar2, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), "odds_logo", av8Var), false, av8Var, (i5 & 112) | (i5 & 14) | 224640, 128);
                av8Var.s(false);
            } else {
                xtcVar2 = utcVar;
                z = true;
                av8Var.d0(194258271);
                av8Var.s(false);
            }
            av8Var.s(z);
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new lj(i2, oldVar, xtcVar2, i3);
        }
    }

    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v20 */
    public static final void m(Integer num, xtc xtcVar, of3 of3Var, int i2, int i3) {
        xtc xtcVar2;
        int i4;
        av8 av8Var;
        ?? r7;
        Object obj;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-584642443);
        int i5 = i2 | (av8Var2.g(num) ? 4 : 2);
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 = i5 | 48;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i4 = i5 | (av8Var2.g(xtcVar2) ? 32 : 16);
        }
        if (av8Var2.T(i4 & 1, (i4 & 19) != 18)) {
            utc utcVar = utc.a;
            xtc xtcVar3 = i6 != 0 ? utcVar : xtcVar2;
            xtc c0 = l98.c0(n9e.q(xtcVar3, lz.D(R.color.brand_tertiary_highlight, av8Var2), o7g.a(8.0f)), 16.0f, 12.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var2, 0);
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
            float intValue = (num != null ? num.intValue() : 0) / 5.0f;
            l8g a3 = k8g.a(ww9.b, uxf.m, av8Var2, 48);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc xtcVar4 = xtcVar3;
            xtc C2 = fqj.C(av8Var2, utcVar);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a3, f50Var);
            waa.K(av8Var2, m2, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
            goa g2 = ljg.g(av8Var2, C2, f50Var3, 1.0f, true);
            String v = oea.v(R.string.sofascore_analyst_free_month, av8Var2);
            yf8 yf8Var = xth.a;
            udj.c(v, g2, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var2, 0, 0, 131064);
            udj.c(String.format("%.0f%%", Arrays.copyOf(new Object[]{Float.valueOf(intValue * 100.0f)}, 1)), null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var2, 0, 0, 131066);
            av8 av8Var3 = av8Var2;
            av8Var3.s(true);
            Object O = av8Var3.O();
            a99 a99Var = nf3.a;
            Object obj2 = O;
            if (O == a99Var) {
                q50 b2 = ml4.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                av8Var3.n0(b2);
                obj2 = b2;
            }
            q50 q50Var = (q50) obj2;
            Float valueOf2 = Float.valueOf(intValue);
            boolean i7 = av8Var3.i(q50Var) | av8Var3.d(intValue);
            Object O2 = av8Var3.O();
            if (i7 || O2 == a99Var) {
                r7 = 0;
                cba cbaVar = new cba(q50Var, intValue, null, false ? 1 : 0);
                av8Var3.n0(cbaVar);
                obj = cbaVar;
            } else {
                r7 = 0;
                obj = O2;
            }
            hz8.o(av8Var3, valueOf2, (Function2) obj);
            xtc A = wnn.A(bkh.e(bkh.d(l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f), 6.0f), o7g.a(8.0f));
            long D = lz.D(R.color.surface_1, av8Var3);
            jf9 jf9Var = oyn.e;
            xtc q = n9e.q(A, D, jf9Var);
            k1c c2 = e12.c(uxf.c, r7);
            int hashCode3 = Long.hashCode(av8Var3.T);
            aee m3 = av8Var3.m();
            xtc C3 = fqj.C(av8Var3, q);
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var);
            } else {
                av8Var3.q0();
            }
            waa.K(av8Var3, c2, f50Var);
            waa.K(av8Var3, m3, ff3Var);
            bf3.s(hashCode3, av8Var3, f50Var2, av8Var3, ryVar);
            waa.K(av8Var3, C3, f50Var3);
            e12.a(r7, av8Var3, n9e.q(bkh.c(bkh.d(utcVar, ((Number) q50Var.d()).floatValue()), 1.0f), lz.D(R.color.brand_tertiary_variant, av8Var3), jf9Var));
            av8Var3.s(true);
            av8Var3.s(true);
            xtcVar2 = xtcVar4;
            av8Var = av8Var3;
        } else {
            av8Var2.W();
            av8Var = av8Var2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new gs9(num, xtcVar2, i2, i3);
        }
    }

    public static final void n(int i2, of3 of3Var, xtc xtcVar, String str, Function0 function0, boolean z) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(776330737);
        int i3 = i2 | (av8Var.g(str) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(xtcVar) ? a.o : 1024);
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            yf8 yf8Var = xth.a;
            dfj e2 = xth.e();
            long D = lz.D(R.color.n_lv_1, av8Var);
            av8Var.d0(-1270460644);
            xtc e3 = bkh.e(bkh.d(xtcVar, 1.0f), 48.0f);
            if (z) {
                e3 = e3.z(f5p.s(lz.D(R.color.n_lv_4, av8Var)));
            }
            av8Var.s(false);
            long D2 = lz.D(R.color.n_lv_4, av8Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = fi.x;
                av8Var.n0(O2);
            }
            udj.c(str, bkh.r(l98.d0(tol.y(e3, true, true, true, D2, wzcVar, new gm(function0, (boh) o3a.N(objArr, (Function0) O2, av8Var, 48), 6), av8Var, 0), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), uxf.m, 2), D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, e2, av8Var, i3 & 14, 0, 131064);
            av8Var = av8Var;
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b82(str, z, function0, xtcVar, i2);
        }
    }

    public static final void o(int i2, of3 of3Var, xtc xtcVar) {
        av8 av8Var;
        xtc xtcVar2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1152237828);
        int i3 = i2 | 6;
        if (av8Var2.T(i3 & 1, (i3 & 3) != 2)) {
            String v = oea.v(R.string.teams, av8Var2);
            utc utcVar = utc.a;
            xtc e0 = l98.e0(bkh.d(utcVar, 1.0f), 16.0f, 14.0f, 16.0f, 6.0f);
            yf8 yf8Var = xth.a;
            av8Var = av8Var2;
            udj.c(v, e0, lz.D(R.color.on_color_primary, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131064);
            xtcVar2 = utcVar;
            tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 14, 0L, 0L, av8Var, n9e.q(bkh.e(bkh.d(xtcVar2, 1.0f), 1.0f), lz.D(R.color.on_color_highlight_2, av8Var), oyn.e));
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new oqj(xtcVar2, i2, 4);
        }
    }

    public static final void p(int i2, of3 of3Var, xtc xtcVar, String str) {
        av8 av8Var;
        xtc xtcVar2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1619958962);
        int i3 = (av8Var2.g(str) ? 4 : 2) | i2 | 48;
        if (av8Var2.T(i3 & 1, (i3 & 19) != 18)) {
            utc utcVar = utc.a;
            xtc e0 = l98.e0(bkh.d(utcVar, 1.0f), 16.0f, 16.0f, 16.0f, 12.0f);
            yf8 yf8Var = xth.a;
            av8Var = av8Var2;
            udj.c(str, e0, lz.D(R.color.on_color_primary, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.k(), av8Var, i3 & 14, 0, 131064);
            xtcVar2 = utcVar;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new x81(str, xtcVar2, i2, 9);
        }
    }

    public static final void q(int i2, of3 of3Var, xtc xtcVar, boolean z, boolean z2) {
        int i3;
        xtc xtcVar2;
        int i4;
        int i5;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1960147473);
        if ((i2 & 6) == 0) {
            i3 = i2 | (av8Var.h(z) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.h(z2) ? 32 : 16;
        }
        int i6 = i3 | 384;
        if (av8Var.T(i6 & 1, (i6 & 147) != 146)) {
            if (!z || z2) {
                i4 = -1788915132;
                i5 = R.color.neutral_default;
            } else {
                i4 = -1788915715;
                i5 = R.color.success;
            }
            long f2 = ljg.f(av8Var, i4, i5, av8Var, false);
            int i7 = (z && z2) ? R.string.fantasy_token_not_used : z ? R.string.available : R.string.fantasy_token_used;
            mv1 mv1Var = uxf.g;
            n7g a2 = o7g.a(16.0f);
            utc utcVar = utc.a;
            xtc c0 = l98.c0(n9e.q(utcVar, f2, a2), 12.0f, 4.0f);
            k1c c2 = e12.c(mv1Var, false);
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
            String v = oea.v(i7, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new dv5(z, z2, xtcVar2, i2);
        }
    }

    public static final void r(vl7 vl7Var, boolean z, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var;
        xtc xtcVar2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1415796163);
        int i3 = i2 | (av8Var2.g(vl7Var) ? 4 : 2) | (av8Var2.h(z) ? 32 : 16) | 384;
        if (av8Var2.T(i3 & 1, (i3 & 147) != 146)) {
            lv1 lv1Var = uxf.m;
            utc utcVar = utc.a;
            xtc d0 = l98.d0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1);
            l8g a2 = k8g.a(ww9.b, lv1Var, av8Var2, 48);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, d0);
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
            String v = oea.v(vl7Var.a.a, av8Var2);
            yf8 yf8Var = xth.a;
            dfj e2 = xth.e();
            long D = lz.D(R.color.n_lv_1, av8Var2);
            xtcVar2 = utcVar;
            udj.c(v, new goa(1.0f, true), D, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, e2, av8Var2, 0, 24960, 110584);
            av8Var = av8Var2;
            nq8.h(av8Var, bkh.p(xtcVar2, 16.0f));
            q(i3 & 112, av8Var, null, vl7Var.c, z);
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t60((Object) vl7Var, z, xtcVar2, i2, 15);
        }
    }

    public static final void s(String str, Integer num, boolean z, boolean z2, boolean z3, Function0 function0, xtc xtcVar, of3 of3Var, int i2) {
        boolean z4;
        boolean z5;
        float f2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1789758062);
        int i3 = i2 | (av8Var.g(str) ? 4 : 2) | (av8Var.g(num) ? 32 : 16) | (av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.h(z2) ? a.o : 1024) | (av8Var.h(z3) ? 16384 : 8192) | (av8Var.i(function0) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var.g(xtcVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (av8Var.T(i3 & 1, (599187 & i3) != 599186)) {
            av8Var.d0(-1970568835);
            xtc e2 = bkh.e(bkh.d(xtcVar, 1.0f), 48.0f);
            if (z3) {
                e2 = e2.z(f5p.s(lz.D(R.color.n_lv_4, av8Var)));
            }
            av8Var.s(false);
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
                O2 = fi.y;
                av8Var.n0(O2);
            }
            xtc y = tol.y(e2, true, true, true, D, wzcVar, new gm(function0, (boh) o3a.N(objArr, (Function0) O2, av8Var, 48), 7), av8Var, 0);
            av8 av8Var2 = av8Var;
            xtc d0 = l98.d0(y, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            l8g a2 = k8g.a(new ng0(16.0f, true, new a70(6)), uxf.m, av8Var2, 54);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, d0);
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
            utc utcVar = utc.a;
            if (z2) {
                av8Var2.d0(1561252483);
                ImageVector N = s6a.N(R.drawable.cup_logo_placeholder, 6, av8Var2);
                long D2 = lz.D(R.color.value, av8Var2);
                xtc l = bkh.l(utcVar, 24.0f);
                z4 = true;
                f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                kq9.b(N, null, l, D2, av8Var2, 432, 0);
                av8Var2 = av8Var2;
                z5 = false;
                av8Var2.s(false);
                Unit unit = Unit.a;
            } else {
                z4 = true;
                z5 = false;
                f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                av8Var2.d0(1561538706);
                if (num == null) {
                    av8Var2.d0(1561538705);
                    av8Var2.s(false);
                } else {
                    av8Var2.d0(1561538706);
                    td4.y(num.intValue(), 48, 12, av8Var2, bkh.l(utcVar, 24.0f), null, false);
                    Unit unit2 = Unit.a;
                    av8Var2.s(false);
                }
                av8Var2.s(false);
            }
            yf8 yf8Var = xth.a;
            av8 av8Var3 = av8Var2;
            boolean z6 = z5;
            udj.c(str, new goa(1.0f, z4), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var3, i3 & 14, 0, 131064);
            av8Var = av8Var3;
            if (z2) {
                av8Var.d0(1562412596);
                av8Var.s(z6);
            } else {
                av8Var.d0(1561926330);
                cdi b2 = a60.b(z ? 180.0f : f2, null, "chevronRotation", av8Var, 3072, 22);
                ImageVector N2 = s6a.N(R.drawable.ic_chevron_down, 6, av8Var);
                long D3 = lz.D(R.color.n_lv_3, av8Var);
                xtc l2 = bkh.l(utcVar, 20.0f);
                boolean g2 = av8Var.g(b2);
                Object O3 = av8Var.O();
                if (g2 || O3 == a99Var) {
                    O3 = new cl1(b2, 3);
                    av8Var.n0(O3);
                }
                kq9.b(N2, null, s02.M(l2, (Function1) O3), D3, av8Var, 48, 0);
                av8Var = av8Var;
                av8Var.s(z6);
            }
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new c93(str, num, z, z2, z3, function0, xtcVar, i2, 0);
        }
    }

    public static final void t(int i2, of3 of3Var, xtc xtcVar, Function0 function0, boolean z) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1469271501);
        int i3 = i2 | (av8Var.h(z) ? 4 : 2) | (av8Var.i(function0) ? 32 : 16) | 384;
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            utc utcVar = utc.a;
            xtc f0 = ml4.f0(bkh.d(utcVar, 1.0f));
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, f0);
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
            tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 14, 0L, 0L, av8Var, n9e.q(bkh.e(bkh.d(utcVar, 1.0f), 1.0f), lz.D(R.color.on_color_highlight_2, av8Var), oyn.e));
            mha.h(oea.v(R.string.confirm_button, av8Var), function0, l98.b0(bkh.d(utcVar, 1.0f), 16.0f), lqh.a, null, z, false, false, 0L, 0, 0, av8Var, (i3 & 112) | 3456 | ((i3 << 15) & 458752), 0, 2000);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s27(i2, 4, xtcVar2, function0, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void u(gll gllVar, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var;
        xtc xtcVar2;
        a99 a99Var;
        boolean z;
        Object O;
        Function1 function12 = function1;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1440832151);
        if ((i2 & 6) == 0) {
            i3 = i2 | (av8Var2.i(gllVar) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.i(function12) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if (av8Var2.T(i4 & 1, (i4 & 147) != 146)) {
            g28 g28Var = bkh.c;
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var2, 0);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, g28Var);
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
            xtc c0 = l98.c0(ml4.q0(bkh.d(utcVar, 1.0f)), 16.0f, 12.0f);
            l8g a3 = k8g.a(ww9.b, uxf.m, av8Var2, 48);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, c0);
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
            ImageVector N = s6a.N(R.drawable.ic_arrow_back, 6, av8Var2);
            xtc l = bkh.l(utcVar, 24.0f);
            int i5 = i4 & 112;
            boolean z2 = i5 == 32;
            Object O2 = av8Var2.O();
            a99 a99Var2 = nf3.a;
            if (z2 || O2 == a99Var2) {
                O2 = new b4j(21, function12);
                av8Var2.n0(O2);
            }
            kq9.b(N, null, oyn.w(l, false, null, null, (Function0) O2, 15), lz.D(R.color.on_color_primary, av8Var2), av8Var2, 48, 0);
            String f2 = fc6.f(32.0f, R.string.select_your_team, av8Var2, av8Var2, utcVar);
            yf8 yf8Var = xth.a;
            udj.c(f2, null, lz.D(R.color.on_color_primary, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, (dfj) xth.s.getValue(), av8Var2, 0, 0, 131066);
            av8Var2.s(true);
            hda.m(gllVar.d, gllVar.c, null, av8Var2, 0);
            o(0, av8Var2, null);
            xtc e2 = fn0.e(1.0f, bkh.d(utcVar, 1.0f), true);
            boolean i6 = av8Var2.i(gllVar) | (i5 == 32);
            Object O3 = av8Var2.O();
            if (i6) {
                a99Var = a99Var2;
            } else {
                a99Var = a99Var2;
                if (O3 != a99Var) {
                    a99 a99Var3 = a99Var;
                    v8a.a(e2, null, null, null, null, null, false, null, (Function1) O3, av8Var2, 0, 510);
                    av8Var = av8Var2;
                    boolean z3 = gllVar.b == null;
                    z = i5 != 32;
                    O = av8Var.O();
                    if (!z || O == a99Var3) {
                        function12 = function1;
                        O = new b4j(22, function12);
                        av8Var.n0(O);
                    } else {
                        function12 = function1;
                    }
                    t(0, av8Var, null, (Function0) O, z3);
                    av8Var.s(true);
                    xtcVar2 = utcVar;
                }
            }
            O3 = new bcl(12, gllVar, function1);
            av8Var2.n0(O3);
            a99 a99Var32 = a99Var;
            v8a.a(e2, null, null, null, null, null, false, null, (Function1) O3, av8Var2, 0, 510);
            av8Var = av8Var2;
            if (gllVar.b == null) {
            }
            if (i5 != 32) {
            }
            O = av8Var.O();
            if (z) {
            }
            function12 = function1;
            O = new b4j(22, function12);
            av8Var.n0(O);
            t(0, av8Var, null, (Function0) O, z3);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new opg(gllVar, function12, xtcVar2, i2, 22);
        }
    }

    public static final void v(vnb vnbVar, Function1 function1, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1789347564);
        int i3 = 2;
        int i4 = (av8Var.g(vnbVar) ? 4 : 2) | i2 | (av8Var.i(function1) ? 32 : 16);
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            ktm.t(vnbVar, fz8.Z(bkh.c, haa.t(R.drawable.wc_widget_config_background, 0, av8Var), null, mp3.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 54), false, null, null, yqo.H(743854321, av8Var, new y47(24, function1)), av8Var, (i4 & 14) | 196608, 28);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new chd(vnbVar, function1, i2, i3);
        }
    }

    public static final void w(ill illVar, Function0 function0, Function0 function02, of3 of3Var, int i2) {
        av8 av8Var;
        illVar.getClass();
        function0.getClass();
        function02.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1524717270);
        int i3 = i2 | (av8Var2.i(illVar) ? 4 : 2) | (av8Var2.i(function0) ? 32 : 16) | (av8Var2.i(function02) ? 256 : 128);
        int i4 = 1;
        if (av8Var2.T(i3 & 1, (i3 & 147) != 146)) {
            e1d x = rfo.x(illVar.f, av8Var2, 0);
            hof hofVar = illVar.h;
            boolean z = ((i3 & 896) == 256) | ((i3 & 112) == 32);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (z || O == a99Var) {
                O = new wbj(function0, function02, i4);
                av8Var2.n0(O);
            }
            w1a.c(hofVar, null, (Function1) O, av8Var2, 0, 14);
            av8Var = av8Var2;
            vnb vnbVar = (vnb) x.getValue();
            boolean i5 = av8Var.i(illVar);
            Object O2 = av8Var.O();
            if (i5 || O2 == a99Var) {
                wlj wljVar = new wlj(1, illVar, ill.class, "onAction", "onAction(Lcom/sofascore/results/wc26/widget/configurationActivity/WorldCupWidgetConfigAction;)V", 0, 6);
                av8Var.n0(wljVar);
                O2 = wljVar;
            }
            v(vnbVar, (Function1) ((KFunction) O2), av8Var, 0);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new dgl(illVar, function0, function02, i2, 5);
        }
    }

    public static xtc x(xtc xtcVar, i4k i4kVar, Function2 function2, int i2) {
        j38 j38Var = i4kVar;
        if ((i2 & 1) != 0) {
            Map map = hwk.a;
            j38Var = s02.e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, new c7a(4294967297L), 1);
        }
        if ((i2 & 2) != 0) {
            function2 = null;
        }
        return wnn.B(xtcVar).z(new ojh(j38Var, uxf.c, function2));
    }

    public static xtc y(i4k i4kVar) {
        return wnn.B(utc.a).z(new ojh(i4kVar, uxf.g, null));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:20:0x016f
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void z(defpackage.pxj r21, android.widget.RemoteViews r22, defpackage.vy8 r23, defpackage.s4a r24) {
        /*
            Method dump skipped, instructions count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gz8.z(pxj, android.widget.RemoteViews, vy8, s4a):void");
    }
}
