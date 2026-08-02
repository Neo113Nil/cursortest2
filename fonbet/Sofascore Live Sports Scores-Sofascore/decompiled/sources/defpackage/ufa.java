package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.webkit.CookieManager;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.bumptech.glide.integration.okhttp3.OkHttpGlideModule;
import com.google.android.gms.internal.consent_sdk.zzpm;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzer;
import com.google.android.gms.internal.play_billing.zzes;
import com.google.android.gms.internal.play_billing.zzim;
import com.google.protobuf.InvalidProtocolBufferException;
import com.ironsource.U3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.EventChanges;
import com.sofascore.model.network.response.LineupsResponse;
import com.sofascore.results.R;
import com.sofascore.results.feed.compose.model.ShortVideoFeedCardModel;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class ufa {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public static final /* synthetic */ int e = 0;

    public static boolean A(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static boolean B(String str, List list) {
        return list.size() >= (Intrinsics.c(str, Sports.FOOTBALL) ? 11 : Intrinsics.c(str, Sports.RUGBY) ? 1 : Integer.MAX_VALUE);
    }

    public static String C(String str, Object... objArr) {
        int indexOf;
        String sb;
        String valueOf = String.valueOf(str);
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e2) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for ".concat(str2), (Throwable) e2);
                    StringBuilder q = wt3.q("<", str2, " threw ");
                    q.append(e2.getClass().getName());
                    q.append(">");
                    sb = q.toString();
                }
            }
            objArr[i2] = sb;
        }
        StringBuilder sb2 = new StringBuilder((objArr.length * 16) + valueOf.length());
        int i3 = 0;
        while (i < objArr.length && (indexOf = valueOf.indexOf("%s", i3)) != -1) {
            sb2.append((CharSequence) valueOf, i3, indexOf);
            sb2.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb2.append((CharSequence) valueOf, i3, valueOf.length());
        if (i < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb2.append(", ");
                sb2.append(objArr[i4]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static boolean D(JSONObject jSONObject, Event event) {
        jSONObject.getClass();
        event.getClass();
        Iterator<String> keys = jSONObject.keys();
        keys.getClass();
        Iterator it = e5h.b(keys).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            str.getClass();
            if (j72.D(str)) {
                if (!jSONObject.has("changes.changeTimestamp")) {
                    return false;
                }
                ArrayList arrayList = new ArrayList();
                for (uc6 uc6Var : j72.L()) {
                    String str2 = uc6Var.a;
                    Object opt = jSONObject.opt(str2);
                    if (opt != null) {
                        if ((opt instanceof Integer) || (opt instanceof String)) {
                            Function2 function2 = uc6Var.b;
                            if (function2 != null) {
                                function2.invoke(event, opt);
                            }
                            arrayList.add(str2);
                        } else {
                            s38 a2 = s38.a();
                            StringBuilder q = mz1.q(event.getId(), "key: ", str2, ", eventId: ", ", data: ");
                            q.append(jSONObject);
                            a2.c(new IllegalArgumentException(q.toString()));
                        }
                    }
                }
                event.setChanges(new EventChanges(arrayList, jSONObject.optLong("changes.changeTimestamp")));
                return true;
            }
        }
        return false;
    }

    public static OkHttpGlideModule E(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
                if (newInstance instanceof OkHttpGlideModule) {
                    return (OkHttpGlideModule) newInstance;
                }
                cp4.h(mz1.m(newInstance, "Expected instanceof GlideModule, but found: "));
                return null;
            } catch (IllegalAccessException e2) {
                F(cls, e2);
                throw null;
            } catch (InstantiationException e3) {
                F(cls, e3);
                throw null;
            } catch (NoSuchMethodException e4) {
                F(cls, e4);
                throw null;
            } catch (InvocationTargetException e5) {
                F(cls, e5);
                throw null;
            }
        } catch (ClassNotFoundException e6) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e6);
        }
    }

    public static void F(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException(ljg.l(cls, "Unable to instantiate GlideModule implementation for "), reflectiveOperationException);
    }

    public static final e5a G(u4a u4aVar) {
        return new e5a(u4aVar.a, u4aVar.b, u4aVar.c, u4aVar.d);
    }

    public static String H(long j) {
        return "PointerId(value=" + j + ')';
    }

    public static final g0i I(bwc bwcVar, of3 of3Var) {
        return p((awc) ((av8) of3Var).k(tzb.a), bwcVar);
    }

    public static Bundle J(zzes zzesVar, zzim zzimVar) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("REQUEST_METADATA", zzesVar.b());
        bundle.putByteArray("REQUEST_PARAMS", zzimVar.b());
        return bundle;
    }

    public static String K(zzpm zzpmVar) {
        StringBuilder sb = new StringBuilder(zzpmVar.m());
        for (int i = 0; i < zzpmVar.m(); i++) {
            byte c2 = zzpmVar.c(i);
            if (c2 == 34) {
                sb.append("\\\"");
            } else if (c2 == 39) {
                sb.append("\\'");
            } else if (c2 != 92) {
                switch (c2) {
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
                        if (c2 < 32 || c2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((c2 >>> 6) & 3) + 48));
                            sb.append((char) (((c2 >>> 3) & 7) + 48));
                            sb.append((char) ((c2 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) c2);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static zzes L(Context context, String str) {
        String str2;
        zzer p = zzes.p();
        p.e();
        zzes.t((zzes) p.b);
        p.e();
        zzes.u((zzes) p.b);
        String packageName = context.getPackageName();
        p.e();
        zzes.r((zzes) p.b, packageName);
        p.e();
        zzes.s((zzes) p.b, str);
        try {
            str2 = String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            int i = zzc.a;
            str2 = null;
        }
        if (str2 != null) {
            p.e();
            zzes.q((zzes) p.b, str2);
        }
        return (zzes) p.c();
    }

    public static final void a(wcj wcjVar, Function1 function1, xtc xtcVar, boolean z, dfj dfjVar, Function2 function2, Function2 function22, Function2 function23, boolean z2, jwk jwkVar, kja kjaVar, ija ijaVar, boolean z3, int i, int i2, uah uahVar, n9j n9jVar, of3 of3Var, int i3) {
        int i4;
        Function1 function12;
        xtc xtcVar2;
        Function2 function24;
        av8 av8Var;
        boolean z4;
        dfj dfjVar2;
        ija ijaVar2;
        int i5;
        int i6;
        uah uahVar2;
        dfj dfjVar3;
        ija ijaVar3;
        int i7;
        uah b2;
        int i8;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(2057288437);
        if ((i3 & 6) == 0) {
            i4 = (av8Var2.g(wcjVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            function12 = function1;
            i4 |= av8Var2.i(function12) ? 32 : 16;
        } else {
            function12 = function1;
        }
        if ((i3 & 384) == 0) {
            xtcVar2 = xtcVar;
            i4 |= av8Var2.g(xtcVar2) ? 256 : 128;
        } else {
            xtcVar2 = xtcVar;
        }
        int i9 = i4 | 27648;
        if ((196608 & i3) == 0) {
            i9 = 93184 | i4;
        }
        if ((1572864 & i3) == 0) {
            i9 |= av8Var2.i(function2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i3) == 0) {
            function24 = function22;
            i9 |= av8Var2.i(function24) ? 8388608 : 4194304;
        } else {
            function24 = function22;
        }
        int i10 = i9 | 905969664;
        boolean z5 = true;
        if (av8Var2.T(i10 & 1, ((i10 & 306783379) == 306783378 && (((((av8Var2.h(z2) ? (char) 2048 : (char) 1024) | 438) | (av8Var2.g(jwkVar) ? 16384 : 8192)) | 840433664) & 306783379) == 306783378 && (((av8Var2.g(n9jVar) ? (char) 256 : (char) 128) | 22) & 147) == 146) ? false : true)) {
            av8Var2.Y();
            if ((i3 & 1) == 0 || av8Var2.B()) {
                dfjVar3 = (dfj) av8Var2.k(udj.a);
                ijaVar3 = ija.c;
                i7 = z3 ? 1 : Integer.MAX_VALUE;
                b2 = ech.b(xxd.b, av8Var2);
                i8 = 1;
            } else {
                av8Var2.W();
                z5 = z;
                dfjVar3 = dfjVar;
                ijaVar3 = ijaVar;
                i7 = i;
                i8 = i2;
                b2 = uahVar;
            }
            av8Var2.t();
            av8Var2.d0(-502250010);
            Object O = av8Var2.O();
            if (O == nf3.a) {
                O = mz1.e(av8Var2);
            }
            wzc wzcVar = (wzc) O;
            av8Var2.s(false);
            av8Var2.d0(1369277167);
            long c2 = dfjVar3.c();
            if (c2 == 16) {
                c2 = !z5 ? n9jVar.c : z2 ? n9jVar.d : ((Boolean) xw3.z(wzcVar, av8Var2, 0).getValue()).booleanValue() ? n9jVar.a : n9jVar.b;
            }
            long j = c2;
            av8Var2.s(false);
            dfj e2 = dfjVar3.e(new dfj(j, 0L, null, null, 0L, 0, 0, 0L, 16777214));
            gb0 a2 = xej.a.a(n9jVar.k);
            xtc xtcVar3 = xtcVar2;
            boolean z6 = z5;
            rxd rxdVar = new rxd(xtcVar3, function2, z2, n9jVar, wcjVar, function12, z6, e2, kjaVar, ijaVar3, z3, i7, i8, jwkVar, wzcVar, function24, function23, b2);
            av8Var = av8Var2;
            tol.b(a2, yqo.H(-2094276683, av8Var, rxdVar), av8Var, 56);
            z4 = z6;
            i5 = i7;
            i6 = i8;
            uahVar2 = b2;
            dfjVar2 = dfjVar3;
            ijaVar2 = ijaVar3;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            z4 = z;
            dfjVar2 = dfjVar;
            ijaVar2 = ijaVar;
            i5 = i;
            i6 = i2;
            uahVar2 = uahVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new pxd(wcjVar, function1, xtcVar, z4, dfjVar2, function2, function22, function23, z2, jwkVar, kjaVar, ijaVar2, z3, i5, i6, uahVar2, n9jVar, i3);
        }
    }

    public static final void b(String str, Function1 function1, xtc xtcVar, boolean z, boolean z2, dfj dfjVar, Function2 function2, Function2 function22, Function2 function23, jwk jwkVar, kja kjaVar, ija ijaVar, boolean z3, int i, int i2, uah uahVar, n9j n9jVar, of3 of3Var, int i3, int i4) {
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        int i7;
        Function2 function24;
        jwk jwkVar2;
        int i8;
        boolean z6;
        int i9;
        Function2 function25;
        jwk jwkVar3;
        int i10;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1901501544);
        int i11 = i3 | (av8Var.g(str) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | (av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        int i12 = i4 & 8;
        if (i12 != 0) {
            i5 = i11 | 3072;
            z4 = z;
        } else {
            z4 = z;
            i5 = i11 | (av8Var.h(z4) ? a.o : 1024);
        }
        int i13 = i4 & 16;
        if (i13 != 0) {
            i6 = i5 | 24576;
            z5 = z2;
        } else {
            z5 = z2;
            i6 = i5 | (av8Var.h(z5) ? 16384 : 8192);
        }
        int i14 = i6 | (av8Var.g(dfjVar) ? 131072 : 65536);
        int i15 = i14 | 12582912;
        int i16 = i4 & NotificationCompat.FLAG_LOCAL_ONLY;
        if (i16 != 0) {
            i7 = i14 | 113246208;
        } else {
            i7 = i15 | (av8Var.i(function22) ? 67108864 : 33554432);
        }
        int i17 = 1;
        if (av8Var.T(i7 & 1, ((i7 & 306783379) == 306783378 && ((((28086 | (av8Var.g(kjaVar) ? (char) 0 : (char) 0)) | (av8Var.g(ijaVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288)) | 838860800) & 306783379) == 306783378 && (((6 | (av8Var.g(uahVar) ? ' ' : (char) 16)) | (av8Var.g(n9jVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128)) & 147) == 146) ? false : true)) {
            av8Var.Y();
            if ((i3 & 1) == 0 || av8Var.B()) {
                if (i12 != 0) {
                    z4 = true;
                }
                if (i13 != 0) {
                    z5 = false;
                }
                function25 = i16 != 0 ? null : function22;
                jwkVar3 = wib.j;
                i10 = z3 ? 1 : Integer.MAX_VALUE;
            } else {
                av8Var.W();
                function25 = function22;
                jwkVar3 = jwkVar;
                i10 = i;
                i17 = i2;
            }
            boolean z7 = z5;
            av8Var.t();
            av8Var.d0(1310051731);
            Object O = av8Var.O();
            if (O == nf3.a) {
                O = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O;
            av8Var.s(false);
            av8Var.d0(1981927842);
            long c2 = dfjVar.c();
            if (c2 == 16) {
                c2 = !z4 ? n9jVar.c : ((Boolean) xw3.z(wzcVar, av8Var, 0).getValue()).booleanValue() ? n9jVar.a : n9jVar.b;
            }
            long j = c2;
            av8Var.s(false);
            tol.b(xej.a.a(n9jVar.k), yqo.H(1874034984, av8Var, new rxd(xtcVar, function2, n9jVar, str, function1, z4, z7, dfjVar.e(new dfj(j, 0L, null, null, 0L, 0, 0, 0L, 16777214)), kjaVar, ijaVar, z3, i10, i17, jwkVar3, wzcVar, function25, function23, uahVar)), av8Var, 56);
            z6 = z7;
            i8 = i10;
            i9 = i17;
            jwkVar2 = jwkVar3;
            function24 = function25;
        } else {
            av8Var.W();
            function24 = function22;
            jwkVar2 = jwkVar;
            i8 = i;
            z6 = z5;
            i9 = i2;
        }
        boolean z8 = z4;
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new pxd(str, function1, xtcVar, z8, z6, dfjVar, function2, function24, function23, jwkVar2, kjaVar, ijaVar, z3, i8, i9, uahVar, n9jVar, i3, i4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x0247, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r1.O(), java.lang.Integer.valueOf(r9)) == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0535, code lost:
    
        if (r1.i(r0) != false) goto L254;
     */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x058b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final Function2 function2, ct8 ct8Var, Function2 function22, final Function2 function23, final Function2 function24, final Function2 function25, Function2 function26, final boolean z, final uaj uajVar, final paj pajVar, final Function1 function1, final tc3 tc3Var, Function2 function27, final p3e p3eVar, of3 of3Var, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4;
        Function2 function28;
        ct8 ct8Var2;
        av8 av8Var;
        a99 a99Var;
        mv1 mv1Var;
        utc utcVar;
        float f;
        int i5;
        mv1 mv1Var2;
        mv1 mv1Var3;
        ema emaVar;
        boolean z3;
        float f2;
        mv1 mv1Var4;
        boolean z4;
        paj pajVar2;
        boolean z5;
        Object O;
        int G;
        final Function2 function29 = function22;
        final Function2 function210 = function26;
        mv1 mv1Var5 = uxf.g;
        mv1 mv1Var6 = uxf.c;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(753699262);
        int i6 = i & 6;
        utc utcVar2 = utc.a;
        if (i6 == 0) {
            i3 = i | (av8Var2.g(utcVar2) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= av8Var2.i(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= av8Var2.i(ct8Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= av8Var2.i(function29) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= av8Var2.i(function23) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= av8Var2.i(function24) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((i & 1572864) == 0) {
            i3 |= av8Var2.i(function25) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= av8Var2.i(function210) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            z2 = z;
            i3 |= av8Var2.h(z2) ? 67108864 : 33554432;
        } else {
            z2 = z;
        }
        if ((i & 805306368) == 0) {
            i3 |= av8Var2.g(uajVar) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | ((i2 & 8) == 0 ? av8Var2.g(pajVar) : av8Var2.i(pajVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= av8Var2.i(tc3Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= av8Var2.i(function27) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= av8Var2.g(p3eVar) ? 16384 : 8192;
        }
        int i7 = i4;
        if (av8Var2.T(i3 & 1, ((i3 & 306783379) == 306783378 && (i7 & 9363) == 9362) ? false : true)) {
            float R = qha.R(av8Var2);
            int i8 = i7 & 14;
            boolean d2 = ((i3 & 234881024) == 67108864) | ((i7 & 112) == 32) | ((i3 & 1879048192) == 536870912) | (i8 == 4 || ((i7 & 8) != 0 && av8Var2.g(pajVar))) | ((i7 & 57344) == 16384) | av8Var2.d(R);
            Object O2 = av8Var2.O();
            a99 a99Var2 = nf3.a;
            if (d2 || O2 == a99Var2) {
                a99Var = a99Var2;
                av8Var = av8Var2;
                mv1Var = mv1Var5;
                utcVar = utcVar2;
                f = R;
                i5 = i8;
                mv1Var2 = mv1Var6;
                wxd wxdVar = new wxd(function1, z2, uajVar, pajVar, p3eVar, f);
                av8Var.n0(wxdVar);
                O2 = wxdVar;
            } else {
                a99Var = a99Var2;
                av8Var = av8Var2;
                mv1Var = mv1Var5;
                utcVar = utcVar2;
                f = R;
                i5 = i8;
                mv1Var2 = mv1Var6;
            }
            wxd wxdVar2 = (wxd) O2;
            ema emaVar2 = (ema) av8Var.k(dh3.n);
            int G2 = z8e.G(av8Var);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, utcVar);
            if3.k7.getClass();
            float f3 = f;
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, wxdVar2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            f50 f50Var2 = hf3.j;
            if (av8Var.S) {
                mv1Var3 = mv1Var2;
            } else {
                mv1Var3 = mv1Var2;
            }
            mz1.t(G2, av8Var, G2, f50Var2);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            tc3Var.invoke(av8Var, Integer.valueOf((i7 >> 6) & 14));
            if (function23 != null) {
                av8Var.d0(2145628269);
                xtc z6 = ww9.D(utcVar, "Leading").z(yjc.a);
                k1c c2 = e12.c(mv1Var, false);
                int G3 = z8e.G(av8Var);
                aee m2 = av8Var.m();
                xtc C2 = fqj.C(av8Var, z6);
                av8Var.h0();
                emaVar = emaVar2;
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, c2, f50Var);
                waa.K(av8Var, m2, ff3Var);
                if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G3))) {
                    mz1.t(G3, av8Var, G3, f50Var2);
                }
                waa.K(av8Var, C2, f50Var3);
                function23.invoke(av8Var, Integer.valueOf((i3 >> 12) & 14));
                av8Var.s(true);
                z3 = false;
                av8Var.s(false);
            } else {
                emaVar = emaVar2;
                z3 = false;
                av8Var.d0(2145874285);
                av8Var.s(false);
            }
            if (function24 != null) {
                av8Var.d0(2145917003);
                xtc z7 = ww9.D(utcVar, "Trailing").z(yjc.a);
                k1c c3 = e12.c(mv1Var, z3);
                int G4 = z8e.G(av8Var);
                aee m3 = av8Var.m();
                xtc C3 = fqj.C(av8Var, z7);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, c3, f50Var);
                waa.K(av8Var, m3, ff3Var);
                if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G4))) {
                    mz1.t(G4, av8Var, G4, f50Var2);
                }
                waa.K(av8Var, C3, f50Var3);
                function24.invoke(av8Var, Integer.valueOf((i3 >> 15) & 14));
                av8Var.s(true);
                av8Var.s(false);
            } else {
                av8Var.d0(2146164941);
                av8Var.s(z3);
            }
            ema emaVar3 = emaVar;
            float L = l98.L(p3eVar, emaVar3);
            float K = l98.K(p3eVar, emaVar3);
            if (function23 != null) {
                L -= f3;
                if (L < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    L = 0.0f;
                }
            }
            float f4 = L;
            if (function24 != null) {
                K -= f3;
                if (K < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    K = 0.0f;
                }
            }
            if (function25 != null) {
                av8Var.d0(2146868920);
                f2 = K;
                xtc f0 = l98.f0(bkh.r(bkh.g(ww9.D(utcVar, "Prefix"), 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), null, 3), f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
                mv1Var4 = mv1Var3;
                k1c c4 = e12.c(mv1Var4, false);
                int G5 = z8e.G(av8Var);
                aee m4 = av8Var.m();
                xtc C4 = fqj.C(av8Var, f0);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, c4, f50Var);
                waa.K(av8Var, m4, ff3Var);
                if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G5))) {
                    mz1.t(G5, av8Var, G5, f50Var2);
                }
                waa.K(av8Var, C4, f50Var3);
                function25.invoke(av8Var, Integer.valueOf((i3 >> 18) & 14));
                av8Var.s(true);
                av8Var.s(false);
            } else {
                f2 = K;
                mv1Var4 = mv1Var3;
                av8Var.d0(2147196621);
                av8Var.s(false);
            }
            if (function26 != null) {
                av8Var.d0(2147239866);
                xtc f02 = l98.f0(bkh.r(bkh.g(ww9.D(utcVar, "Suffix"), 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), null, 3), 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
                k1c c5 = e12.c(mv1Var4, false);
                int G6 = z8e.G(av8Var);
                aee m5 = av8Var.m();
                xtc C5 = fqj.C(av8Var, f02);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, c5, f50Var);
                waa.K(av8Var, m5, ff3Var);
                if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G6))) {
                    mz1.t(G6, av8Var, G6, f50Var2);
                }
                waa.K(av8Var, C5, f50Var3);
                function210 = function26;
                function210.invoke(av8Var, Integer.valueOf((i3 >> 21) & 14));
                av8Var.s(true);
                av8Var.s(false);
            } else {
                function210 = function26;
                av8Var.d0(-2147401651);
                av8Var.s(false);
            }
            xtc f03 = l98.f0(bkh.r(bkh.g(utcVar, 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), null, 3), function25 == null ? f4 : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, function210 == null ? f2 : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            if (ct8Var != null) {
                av8Var.d0(-2147031666);
                ct8Var2 = ct8Var;
                ct8Var2.invoke(ww9.D(utcVar, "Hint").z(f03), av8Var, Integer.valueOf((i3 >> 3) & 112));
                av8Var.s(false);
            } else {
                ct8Var2 = ct8Var;
                av8Var.d0(-2146940371);
                av8Var.s(false);
            }
            xtc z8 = ww9.D(utcVar, "TextField").z(f03);
            k1c c6 = e12.c(mv1Var4, true);
            int G7 = z8e.G(av8Var);
            aee m6 = av8Var.m();
            xtc C6 = fqj.C(av8Var, z8);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c6, f50Var);
            waa.K(av8Var, m6, ff3Var);
            if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G7))) {
                mz1.t(G7, av8Var, G7, f50Var2);
            }
            waa.K(av8Var, C6, f50Var3);
            me4.l((i3 >> 3) & 14, function2, av8Var, true);
            if (function22 != null) {
                av8Var.d0(-2146287790);
                if (i5 != 4) {
                    if ((i7 & 8) != 0) {
                        pajVar2 = pajVar;
                    } else {
                        pajVar2 = pajVar;
                    }
                    z5 = false;
                    O = av8Var.O();
                    if (!z5 || O == a99Var) {
                        O = new nxd(pajVar2, 0);
                        av8Var.n0(O);
                    }
                    xtc z9 = ww9.D(bkh.r(s9a.A(utcVar, new r64(10, (Function0) O)), null, 3), "Label").z(utcVar);
                    k1c c7 = e12.c(mv1Var4, false);
                    G = z8e.G(av8Var);
                    aee m7 = av8Var.m();
                    xtc C7 = fqj.C(av8Var, z9);
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.q0();
                    } else {
                        av8Var.l(zg3Var);
                    }
                    waa.K(av8Var, c7, f50Var);
                    waa.K(av8Var, m7, ff3Var);
                    if (!av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G))) {
                        mz1.t(G, av8Var, G, f50Var2);
                    }
                    waa.K(av8Var, C7, f50Var3);
                    function29 = function22;
                    function29.invoke(av8Var, Integer.valueOf((i3 >> 9) & 14));
                    av8Var.s(true);
                    av8Var.s(false);
                } else {
                    pajVar2 = pajVar;
                }
                z5 = true;
                O = av8Var.O();
                if (!z5) {
                }
                O = new nxd(pajVar2, 0);
                av8Var.n0(O);
                xtc z92 = ww9.D(bkh.r(s9a.A(utcVar, new r64(10, (Function0) O)), null, 3), "Label").z(utcVar);
                k1c c72 = e12.c(mv1Var4, false);
                G = z8e.G(av8Var);
                aee m72 = av8Var.m();
                xtc C72 = fqj.C(av8Var, z92);
                av8Var.h0();
                if (av8Var.S) {
                }
                waa.K(av8Var, c72, f50Var);
                waa.K(av8Var, m72, ff3Var);
                if (!av8Var.S) {
                }
                mz1.t(G, av8Var, G, f50Var2);
                waa.K(av8Var, C72, f50Var3);
                function29 = function22;
                function29.invoke(av8Var, Integer.valueOf((i3 >> 9) & 14));
                av8Var.s(true);
                av8Var.s(false);
            } else {
                function29 = function22;
                av8Var.d0(-2145892819);
                av8Var.s(false);
            }
            if (function27 != null) {
                av8Var.d0(-2145844304);
                xtc a0 = l98.a0(bkh.r(bkh.g(ww9.D(utcVar, "Supporting"), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), null, 3), new t3e(16.0f, 4.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                k1c c8 = e12.c(mv1Var4, false);
                int G8 = z8e.G(av8Var);
                aee m8 = av8Var.m();
                xtc C8 = fqj.C(av8Var, a0);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, c8, f50Var);
                waa.K(av8Var, m8, ff3Var);
                if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G8))) {
                    mz1.t(G8, av8Var, G8, f50Var2);
                }
                waa.K(av8Var, C8, f50Var3);
                function28 = function27;
                function28.invoke(av8Var, Integer.valueOf((i7 >> 9) & 14));
                z4 = true;
                av8Var.s(true);
                av8Var.s(false);
            } else {
                function28 = function27;
                z4 = true;
                av8Var.d0(-2145508915);
                av8Var.s(false);
            }
            av8Var.s(z4);
        } else {
            function28 = function27;
            ct8Var2 = ct8Var;
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            final ct8 ct8Var3 = ct8Var2;
            final Function2 function211 = function28;
            u.d = new Function2() { // from class: oxd
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K2 = aba.K(i | 1);
                    int K3 = aba.K(i2);
                    ufa.c(Function2.this, ct8Var3, function29, function23, function24, function25, function210, z, uajVar, pajVar, function1, tc3Var, function211, p3eVar, (of3) obj, K2, K3);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(boolean z, Function0 function0, Function0 function02, xtc xtcVar, of3 of3Var, int i) {
        xtc xtcVar2;
        function0.getClass();
        function02.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-583028850);
        int i2 = i | (av8Var.h(z) ? 4 : 2) | (av8Var.i(function0) ? 32 : 16) | (av8Var.i(function02) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | 3072;
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            utc utcVar = utc.a;
            xtc u0 = hkg.u0(bkh.d(utcVar, 1.0f), hkg.o0(av8Var), false, 14);
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.o;
            u23 a2 = t23.a(p4hVar, kv1Var, av8Var, 0);
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
            xtc d2 = bkh.d(utcVar, 1.0f);
            long D = lz.D(R.color.brand_tertiary_highlight, av8Var);
            jf9 jf9Var = oyn.e;
            xtc f0 = l98.f0(n9e.q(d2, D, jf9Var), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 28.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            k1c c2 = e12.c(uxf.j, false);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, f0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            wkn.k(haa.t(R.drawable.ic_sofascore_analyst_preview, 0, av8Var), null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 56, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            av8Var.s(true);
            xtc q = n9e.q(bkh.e(bkh.d(utcVar, 1.0f), 4.0f), lz.D(R.color.n_lv_5, av8Var), jf9Var);
            k1c c3 = e12.c(uxf.f, false);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, q);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            e12.a(0, av8Var, n9e.q(bkh.e(bkh.d(utcVar, 0.5f), 4.0f), lz.D(R.color.primary_default, av8Var), jf9Var));
            av8Var.s(true);
            xtc b0 = l98.b0(utcVar, 16.0f);
            u23 a3 = t23.a(p4hVar, kv1Var, av8Var, 0);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C4 = fqj.C(av8Var, b0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C4, f50Var3);
            yf8 yf8Var = xth.a;
            udj.c(oea.v(R.string.free_month_unlocked, av8Var), null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var, 0, 0, 131066);
            udj.c(oea.v(R.string.sofascore_analyst, av8Var), l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 5), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.h(), av8Var, 48, 0, 131064);
            udj.c(oea.v(z ? R.string.referral_program_success_body_inviter : R.string.referral_program_success_body_friend, av8Var), l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var, 48, 0, 131064);
            v9g.f(oea.v(R.string.sofascore_analyst_benefit_matchup, av8Var), l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), 0L, 0L, av8Var, 48, 12);
            v9g.f(oea.v(R.string.sofascore_analyst_benefit_player_form, av8Var), l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), 0L, 0L, av8Var, 48, 12);
            v9g.f(oea.v(R.string.sofascore_analyst_benefit_corners, av8Var), l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), 0L, 0L, av8Var, 48, 12);
            v9g.f(oea.v(R.string.sofascore_analyst_benefit_probabilities, av8Var), l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), 0L, 0L, av8Var, 48, 12);
            v9g.f(oea.w(R.string.sofascore_analyst_benefit_leagues, new Object[]{250}, av8Var), l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), 0L, 0L, av8Var, 48, 12);
            mha.h(oea.v(R.string.button_activate_free_month, av8Var), function0, bkh.d(l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f), null, null, false, false, false, 0L, 0, 0, av8Var, (i2 & 112) | 384, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
            mha.h(oea.v(R.string.button_not_now, av8Var), function02, bkh.d(l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f), gqh.a, null, false, false, false, 0L, 0, 0, av8Var, ((i2 >> 3) & 112) | 3456, 0, 2032);
            av8Var = av8Var;
            av8Var.s(true);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p81(z, function0, function02, xtcVar2, i, 18);
        }
    }

    public static final s3h e(wma wmaVar, boolean z) {
        wtc wtcVar = (wtc) wmaVar.F.g;
        xv4 xv4Var = null;
        if ((wtcVar.d & 8) != 0) {
            loop0: while (true) {
                if (wtcVar == null) {
                    break;
                }
                if ((wtcVar.c & 8) != 0) {
                    wtc wtcVar2 = wtcVar;
                    i1d i1dVar = null;
                    while (wtcVar2 != null) {
                        if (wtcVar2 instanceof p3h) {
                            xv4Var = wtcVar2;
                            break loop0;
                        }
                        if ((wtcVar2.c & 8) != 0 && (wtcVar2 instanceof bw4)) {
                            int i = 0;
                            for (wtc wtcVar3 = ((bw4) wtcVar2).p; wtcVar3 != null; wtcVar3 = wtcVar3.f) {
                                if ((wtcVar3.c & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        wtcVar2 = wtcVar3;
                                    } else {
                                        if (i1dVar == null) {
                                            i1dVar = new i1d(new wtc[16], 0);
                                        }
                                        if (wtcVar2 != null) {
                                            i1dVar.b(wtcVar2);
                                            wtcVar2 = null;
                                        }
                                        i1dVar.b(wtcVar3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        wtcVar2 = c6o.X(i1dVar);
                    }
                }
                if ((wtcVar.d & 8) == 0) {
                    break;
                }
                wtcVar = wtcVar.f;
            }
        }
        xv4Var.getClass();
        wtc wtcVar4 = ((wtc) ((p3h) xv4Var)).a;
        l3h x = wmaVar.x();
        if (x == null) {
            x = new l3h();
        }
        return new s3h(wtcVar4, z, wmaVar, x);
    }

    public static final void f(int i, w31 w31Var, of3 of3Var, xtc xtcVar, Function1 function1) {
        xtcVar.getClass();
        w31Var.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(687550311);
        int i2 = (av8Var.g(xtcVar) ? 4 : 2) | i | (av8Var.g(w31Var) ? 32 : 16) | (av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (!av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            av8Var.W();
        } else if (w31Var instanceof c56) {
            av8Var.d0(-689109022);
            jca.p((c56) w31Var, function1, xtcVar, av8Var, ((i2 << 6) & 896) | ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
            av8Var.s(false);
        } else if (w31Var instanceof bt1) {
            av8Var.d0(-689105486);
            v9g.d((bt1) w31Var, function1, xtcVar, av8Var, ((i2 << 6) & 896) | ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
            av8Var.s(false);
        } else if (w31Var instanceof jsh) {
            av8Var.d0(-689101784);
            w1a.g((jsh) w31Var, function1, xtcVar, av8Var, ((i2 << 6) & 896) | ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
            av8Var.s(false);
        } else if (w31Var instanceof z6j) {
            av8Var.d0(-689098060);
            hda.i((z6j) w31Var, function1, xtcVar, av8Var, ((i2 << 6) & 896) | ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
            av8Var.s(false);
        } else if (w31Var instanceof nte) {
            av8Var.d0(-689094164);
            uaa.b((nte) w31Var, function1, xtcVar, av8Var, ((i2 << 6) & 896) | ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
            av8Var.s(false);
        } else if (w31Var instanceof dh8) {
            av8Var.d0(-689090318);
            n9e.l((dh8) w31Var, function1, xtcVar, av8Var, ((i2 << 6) & 896) | ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
            av8Var.s(false);
        } else if (w31Var instanceof otg) {
            av8Var.d0(-689086583);
            g7a.h((otg) w31Var, function1, xtcVar, av8Var, ((i2 << 6) & 896) | ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
            av8Var.s(false);
        } else if (w31Var instanceof m6j) {
            av8Var.d0(-689083193);
            nq8.l((m6j) w31Var, function1, xtcVar, av8Var, ((i2 << 6) & 896) | ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
            av8Var.s(false);
        } else if (w31Var instanceof mvc) {
            av8Var.d0(-689079960);
            pea.h((mvc) w31Var, function1, xtcVar, av8Var, ((i2 << 6) & 896) | ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
            av8Var.s(false);
        } else if (w31Var instanceof fnk) {
            av8Var.d0(-689076799);
            i9a.m((fnk) w31Var, function1, xtcVar, av8Var, ((i2 << 6) & 896) | ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
            av8Var.s(false);
        } else if (w31Var instanceof daa) {
            av8Var.d0(-689073855);
            haa.c((daa) w31Var, function1, xtcVar, av8Var, ((i2 << 6) & 896) | ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
            av8Var.s(false);
        } else if (w31Var instanceof sk8) {
            av8Var.d0(-689070383);
            m6k.k((sk8) w31Var, function1, xtcVar, av8Var, ((i2 << 6) & 896) | ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
            av8Var.s(false);
        } else if (w31Var instanceof tl8) {
            av8Var.d0(-689066481);
            wkn.j((tl8) w31Var, function1, xtcVar, av8Var, ((i2 << 6) & 896) | ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
            av8Var.s(false);
        } else if (w31Var instanceof zr1) {
            av8Var.d0(-689062509);
            s9a.b((zr1) w31Var, function1, xtcVar, av8Var, ((i2 << 6) & 896) | ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
            av8Var.s(false);
        } else if (w31Var instanceof ss1) {
            av8Var.d0(-689058479);
            fkf.b((ss1) w31Var, function1, xtcVar, av8Var, ((i2 << 6) & 896) | ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
            av8Var.s(false);
        } else if (w31Var instanceof bq9) {
            av8Var.d0(-689054478);
            rz8.p((bq9) w31Var, function1, xtcVar, av8Var, ((i2 << 6) & 896) | ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
            av8Var.s(false);
        } else if (w31Var instanceof fq9) {
            av8Var.d0(-689050512);
            s9a.j((fq9) w31Var, function1, xtcVar, av8Var, ((i2 << 6) & 896) | ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
            av8Var.s(false);
        } else if (w31Var instanceof sre) {
            av8Var.d0(-689046839);
            v7a.d((sre) w31Var, function1, xtcVar, av8Var, ((i2 << 6) & 896) | ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
            av8Var.s(false);
        } else if (w31Var instanceof wa6) {
            av8Var.d0(-689043383);
            k53.I((wa6) w31Var, function1, xtcVar, av8Var, ((i2 << 6) & 896) | ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
            av8Var.s(false);
        } else if (w31Var instanceof euh) {
            av8Var.d0(-689039956);
            t6a.f((euh) w31Var, function1, xtcVar, av8Var, ((i2 << 6) & 896) | ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
            av8Var.s(false);
        } else if (w31Var instanceof qu8) {
            av8Var.d0(-689036506);
            rd0.m((qu8) w31Var, function1, xtcVar, av8Var, ((i2 << 6) & 896) | ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
            av8Var.s(false);
        } else if (w31Var instanceof fdd) {
            av8Var.d0(114827897);
            av8Var.s(false);
        } else {
            if (!(w31Var instanceof f41) && !(w31Var instanceof zbd) && !(w31Var instanceof il6) && !(w31Var instanceof ShortVideoFeedCardModel) && !(w31Var instanceof b94) && !(w31Var instanceof y80) && !(w31Var instanceof u8b) && !(w31Var instanceof c3f) && !(w31Var instanceof bmd) && !(w31Var instanceof cqk) && !(w31Var instanceof zuh) && !(w31Var instanceof gla)) {
                throw dmi.h(av8Var, -689108086, false);
            }
            av8Var.d0(115217753);
            av8Var.s(false);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new x6g(xtcVar, w31Var, function1, i);
        }
    }

    public static final void g(int i, int i2, of3 of3Var, xtc xtcVar, String str) {
        int i3;
        xtc xtcVar2;
        str.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-778932145);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(str) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if (av8Var.T(i4 & 1, (i4 & 147) != 146)) {
            l8g a2 = k8g.a(new ng0(4.0f, true, new a70(6)), uxf.m, av8Var, 54);
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
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            td4.G(i, bkh.l(utcVar, 16.0f), false, 0L, av8Var, (i4 & 14) | 48, 12);
            goa goaVar = new goa(1.0f, true);
            yf8 yf8Var = xth.a;
            xtcVar2 = utcVar;
            udj.c(str, goaVar, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, (i4 >> 3) & 14, 24960, 110584);
            av8Var.s(true);
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new gcb(i, str, xtcVar2, i2);
        }
    }

    public static final void h(float f, int i, of3 of3Var, xtc xtcVar) {
        float f2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1444027629);
        int i2 = (av8Var.g(xtcVar) ? 4 : 2) | i | 48;
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            l8g a2 = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.m, av8Var, 48);
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
            p8g p8gVar = p8g.a;
            utc utcVar = utc.a;
            xtc a3 = p8gVar.a(0.5f, utcVar, true);
            d7e t = haa.t(R.drawable.weekly_challenge_trophy_tier_1, 0, av8Var);
            ccd ccdVar = mp3.d;
            wkn.k(t, "", a3, null, ccdVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 24632, 104);
            wkn.k(haa.t(R.drawable.weekly_challenge_trophy_tier_2, 0, av8Var), "", p8gVar.a(1.0f, utcVar, true), null, ccdVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 24632, 104);
            wkn.k(haa.t(R.drawable.weekly_challenge_trophy_tier_3, 0, av8Var), "", p8gVar.a(0.5f, utcVar, true), null, ccdVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 24632, 104);
            av8Var.s(true);
            f2 = 8.0f;
        } else {
            av8Var.W();
            f2 = f;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new w73(xtcVar, f2, i);
        }
    }

    public static final String i(long j) {
        long j2 = j / 3600;
        long j3 = (j % 3600) / 60;
        long j4 = j % 60;
        return j2 > 0 ? String.format("%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4)}, 3)) : j3 > 0 ? String.format("%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3), Long.valueOf(j4)}, 2)) : String.format("0:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j4)}, 1));
    }

    public static final mfa j(Decoder decoder) {
        decoder.getClass();
        mfa mfaVar = decoder instanceof mfa ? (mfa) decoder : null;
        if (mfaVar != null) {
            return mfaVar;
        }
        a70.r(mz1.k(duf.a, decoder.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ")));
        return null;
    }

    public static final vfa k(Encoder encoder) {
        encoder.getClass();
        vfa vfaVar = encoder instanceof vfa ? (vfa) encoder : null;
        if (vfaVar != null) {
            return vfaVar;
        }
        a70.r(mz1.k(duf.a, encoder.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ")));
        return null;
    }

    public static final int l(float f) {
        return Math.round((float) Math.ceil(f));
    }

    public static void m(JSONObject jSONObject) {
        List split$default;
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject optJSONObject = jSONObject.optJSONObject(next);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString(CampaignEx.JSON_KEY_AD_K);
                String optString2 = optJSONObject.optString("v");
                optString.getClass();
                if (optString.length() != 0) {
                    CopyOnWriteArraySet a2 = cjc.a();
                    next.getClass();
                    split$default = StringsKt__StringsKt.split$default(optString, new String[]{BlazeDataSourcePersonalizedType.STRING_SEPARATOR}, false, 0, 6, null);
                    optString2.getClass();
                    a2.add(new cjc(next, optString2, split$default));
                }
            }
        }
    }

    public static jod n(boolean z) {
        iod iodVar = new iod();
        iodVar.d.add(new u3g(1));
        if (z) {
            dlg dlgVar = dlg.d;
            dlgVar.getClass();
            iodVar.k = dlgVar;
        } else {
            dlg dlgVar2 = dlg.d;
            Set<String> set = dlgVar2.c;
            if (dlgVar2.a == null) {
                try {
                    dlgVar2.a = CookieManager.getInstance();
                } catch (Throwable unused) {
                }
            }
            CookieManager cookieManager = dlgVar2.a;
            if (cookieManager != null) {
                for (String str : set) {
                    String cookie = cookieManager.getCookie(str);
                    if (cookie != null) {
                        for (String str2 : cookie.split(";")) {
                            cookieManager.setCookie(str, str2.split(U3.j.b, 2)[0].trim() + "=; Max-Age=0");
                        }
                    }
                }
                if (set.size() > 0) {
                    cookieManager.flush();
                }
                set.clear();
                SharedPreferences sharedPreferences = dlgVar2.b;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().remove("equativ_sdk_cookie_hosts").apply();
                }
            }
        }
        return new jod(iodVar);
    }

    public static final boolean o(long j, long j2) {
        return j == j2;
    }

    public static final g0i p(awc awcVar, bwc bwcVar) {
        int ordinal = bwcVar.ordinal();
        if (ordinal == 0) {
            awcVar.getClass();
            g0i g0iVar = awc.b;
            g0iVar.getClass();
            return g0iVar;
        }
        if (ordinal == 1) {
            awcVar.getClass();
            g0i g0iVar2 = awc.c;
            g0iVar2.getClass();
            return g0iVar2;
        }
        if (ordinal == 2) {
            awcVar.getClass();
            g0i g0iVar3 = awc.d;
            g0iVar3.getClass();
            return g0iVar3;
        }
        if (ordinal == 3) {
            awcVar.getClass();
            g0i g0iVar4 = awc.e;
            g0iVar4.getClass();
            return g0iVar4;
        }
        if (ordinal == 4) {
            awcVar.getClass();
            g0i g0iVar5 = awc.f;
            g0iVar5.getClass();
            return g0iVar5;
        }
        if (ordinal != 5) {
            zzl.b();
            return null;
        }
        awcVar.getClass();
        g0i g0iVar6 = awc.g;
        g0iVar6.getClass();
        return g0iVar6;
    }

    public static String q(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static final ly3 r(ttk ttkVar) {
        return ttkVar instanceof h79 ? ((h79) ttkVar).getDefaultViewModelCreationExtras() : jy3.b;
    }

    public static final qtk s(ttk ttkVar) {
        return ttkVar instanceof h79 ? ((h79) ttkVar).getDefaultViewModelProviderFactory() : uu4.b;
    }

    public static void t(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i) {
        if (!z(b3)) {
            if ((((b3 + 112) + (b2 << 28)) >> 30) == 0 && !z(b4) && !z(b5)) {
                int i2 = ((b2 & 7) << 18) | ((b3 & 63) << 12) | ((b4 & 63) << 6) | (b5 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) + 56320);
                return;
            }
        }
        throw InvalidProtocolBufferException.invalidUtf8();
    }

    public static void u(byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (z(b3) || ((b2 == -32 && b3 < -96) || ((b2 == -19 && b3 >= -96) || z(b4)))) {
            throw InvalidProtocolBufferException.invalidUtf8();
        }
        cArr[i] = (char) (((b2 & 15) << 12) | ((b3 & 63) << 6) | (b4 & 63));
    }

    public static void v(byte b2, byte b3, char[] cArr, int i) {
        if (b2 < -62 || z(b3)) {
            throw InvalidProtocolBufferException.invalidUtf8();
        }
        cArr[i] = (char) (((b2 & 31) << 6) | (b3 & 63));
    }

    public static boolean w(Event event, LineupsResponse lineupsResponse) {
        boolean c2;
        String s = ok3.s(event);
        if (Intrinsics.c(s, Sports.FOOTBALL)) {
            if (y(LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null).getFormation()) && y(LineupsResponse.getAwayLineups$default(lineupsResponse, null, 1, null).getFormation())) {
                c2 = true;
            }
            c2 = false;
        } else {
            if (Intrinsics.c(s, Sports.RUGBY)) {
                c2 = Intrinsics.c(event.isEditor(), Boolean.TRUE);
            }
            c2 = false;
        }
        if (c2) {
            String s2 = ok3.s(event);
            if (B(s2, LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null).getPlayers()) && B(s2, LineupsResponse.getAwayLineups$default(lineupsResponse, null, 1, null).getPlayers())) {
                return true;
            }
        }
        return false;
    }

    public static boolean x(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000a, code lost:
    
        r4 = kotlin.text.StringsKt__StringsKt.split$default(r4, new java.lang.String[]{"-"}, false, 0, 6, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean y(String str) {
        List split$default;
        int size;
        if (str != null && str.length() != 0 && 3 <= (size = split$default.size()) && size < 5) {
            if (!split$default.isEmpty()) {
                Iterator it = split$default.iterator();
                while (it.hasNext()) {
                    Integer intOrNull = StringsKt.toIntOrNull((String) it.next());
                    int intValue = intOrNull != null ? intOrNull.intValue() : -1;
                    if (1 <= intValue && intValue < 6) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean z(byte b2) {
        return b2 > -65;
    }
}
