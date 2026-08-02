package defpackage;

import android.content.res.Configuration;
import android.graphics.Path;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.appsflyer.internal.i;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class ww9 {
    public static volatile ujg a;
    public static final wxf b;
    public static final uxf c;
    public static final p4h d;
    public static final zic e;
    public static final tc3 j;
    public static final tc3 m;
    public static final /* synthetic */ int q = 0;
    public static final /* synthetic */ int r = 0;
    public static final /* synthetic */ int s = 0;
    public static final /* synthetic */ int t = 0;
    public static final /* synthetic */ int u = 0;
    public static final /* synthetic */ int v = 0;
    public static final /* synthetic */ int w = 0;
    public static final kg0 f = new kg0(0);
    public static final kg0 g = new kg0(3);
    public static final kg0 h = new kg0(2);
    public static final kg0 i = new kg0(1);
    public static final tc3 k = new tc3(-1088934775, new pd3(9), false);
    public static final tc3 l = new tc3(2090988416, new pd3(10), false);
    public static final int[] n = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};
    public static final StackTraceElement[] o = new StackTraceElement[0];
    public static final char[] p = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        int i2 = 16;
        b = new wxf(i2);
        c = new uxf(i2);
        d = new p4h(i2);
        e = new zic(i2);
        int i3 = 11;
        j = new tc3(-14378308, new qs2(i3), false);
        m = new tc3(8437057, new pd3(i3), false);
    }

    public static final Object A(g1c g1cVar) {
        Object h2 = g1cVar.h();
        jma jmaVar = h2 instanceof jma ? (jma) h2 : null;
        if (jmaVar != null) {
            return jmaVar.t0();
        }
        return null;
    }

    public static final void B(CoroutineContext coroutineContext, Throwable th) {
        Throwable runtimeException;
        Iterator it = du3.a.iterator();
        while (it.hasNext()) {
            try {
                ((cu3) it.next()).handleException(coroutineContext, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    de6.a(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                try {
                    currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
                } catch (Throwable unused) {
                }
            }
        }
        try {
            de6.a(th, new f15(coroutineContext));
        } catch (Throwable unused2) {
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
        } catch (Throwable unused3) {
        }
    }

    public static final boolean C(KeyEvent keyEvent) {
        long w2 = u0a.w(keyEvent);
        int i2 = qia.O;
        return qia.a(w2, qia.h) || qia.a(w2, qia.r) || qia.a(w2, qia.E);
    }

    public static final xtc D(xtc xtcVar, String str) {
        return xtcVar.z(new hma(str));
    }

    public static void E(int i2, int[] iArr, int[] iArr2, boolean z) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float f2 = (i2 - i4) / 2.0f;
        if (!z) {
            int length = iArr.length;
            int i6 = 0;
            while (i3 < length) {
                int i7 = iArr[i3];
                iArr2[i6] = Math.round(f2);
                f2 += i7;
                i3++;
                i6++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i8 = iArr[length2];
            iArr2[length2] = Math.round(f2);
            f2 += i8;
        }
    }

    public static void F(int i2, int[] iArr, int[] iArr2, boolean z) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float length = iArr.length == 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : (i2 - i4) / iArr.length;
        float f2 = length / 2.0f;
        if (!z) {
            int length2 = iArr.length;
            int i6 = 0;
            while (i3 < length2) {
                int i7 = iArr[i3];
                iArr2[i6] = Math.round(f2);
                f2 += i7 + length;
                i3++;
                i6++;
            }
            return;
        }
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 >= length3) {
                return;
            }
            int i8 = iArr[length3];
            iArr2[length3] = Math.round(f2);
            f2 += i8 + length;
        }
    }

    public static void G(int i2, int[] iArr, int[] iArr2, boolean z) {
        if (iArr.length == 0) {
            return;
        }
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float max = (i2 - i4) / Math.max(iArr.length - 1, 1);
        float f2 = (z && iArr.length == 1) ? max : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i6 = iArr[length];
                iArr2[length] = Math.round(f2);
                f2 += i6 + max;
            }
            return;
        }
        int length2 = iArr.length;
        int i7 = 0;
        while (i3 < length2) {
            int i8 = iArr[i3];
            iArr2[i7] = Math.round(f2);
            f2 += i8 + max;
            i3++;
            i7++;
        }
    }

    public static void H(int i2, int[] iArr, int[] iArr2, boolean z) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float length = (i2 - i4) / (iArr.length + 1);
        if (z) {
            float f2 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i6 = iArr[length2];
                iArr2[length2] = Math.round(f2);
                f2 += i6 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f3 = length;
        int i7 = 0;
        while (i3 < length3) {
            int i8 = iArr[i3];
            iArr2[i7] = Math.round(f3);
            f3 += i8 + length;
            i3++;
            i7++;
        }
    }

    public static byte[] I(md4 md4Var) {
        md4Var.getClass();
        HashMap hashMap = md4Var.a;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                dataOutputStream.writeShort(1);
                dataOutputStream.writeInt(hashMap.size());
                for (Map.Entry entry : hashMap.entrySet()) {
                    J(dataOutputStream, (String) entry.getKey(), entry.getValue());
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() > 10240) {
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                byteArray.getClass();
                return byteArray;
            } finally {
            }
        } catch (IOException unused) {
            int i2 = gg4.a;
            rik.o().getClass();
            return new byte[0];
        }
    }

    public static final void J(DataOutputStream dataOutputStream, String str, Object obj) {
        int i2;
        if (obj == null) {
            dataOutputStream.writeByte(0);
        } else if (obj instanceof Boolean) {
            dataOutputStream.writeByte(1);
            dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(((Number) obj).byteValue());
        } else if (obj instanceof Integer) {
            dataOutputStream.writeByte(3);
            dataOutputStream.writeInt(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            dataOutputStream.writeByte(4);
            dataOutputStream.writeLong(((Number) obj).longValue());
        } else if (obj instanceof Float) {
            dataOutputStream.writeByte(5);
            dataOutputStream.writeFloat(((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            dataOutputStream.writeByte(6);
            dataOutputStream.writeDouble(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            dataOutputStream.writeByte(7);
            dataOutputStream.writeUTF((String) obj);
        } else {
            if (!(obj instanceof Object[])) {
                zzl.i(duf.a.getOrCreateKotlinClass(obj.getClass()).getSimpleName(), "Unsupported value type ");
                return;
            }
            Object[] objArr = (Object[]) obj;
            Class<?> cls = objArr.getClass();
            fuf fufVar = duf.a;
            KClass orCreateKotlinClass = fufVar.getOrCreateKotlinClass(cls);
            if (Intrinsics.c(orCreateKotlinClass, fufVar.getOrCreateKotlinClass(Boolean[].class))) {
                i2 = 8;
            } else if (Intrinsics.c(orCreateKotlinClass, fufVar.getOrCreateKotlinClass(Byte[].class))) {
                i2 = 9;
            } else if (Intrinsics.c(orCreateKotlinClass, fufVar.getOrCreateKotlinClass(Integer[].class))) {
                i2 = 10;
            } else if (Intrinsics.c(orCreateKotlinClass, fufVar.getOrCreateKotlinClass(Long[].class))) {
                i2 = 11;
            } else if (Intrinsics.c(orCreateKotlinClass, fufVar.getOrCreateKotlinClass(Float[].class))) {
                i2 = 12;
            } else if (Intrinsics.c(orCreateKotlinClass, fufVar.getOrCreateKotlinClass(Double[].class))) {
                i2 = 13;
            } else {
                if (!Intrinsics.c(orCreateKotlinClass, fufVar.getOrCreateKotlinClass(String[].class))) {
                    zzl.i(fufVar.getOrCreateKotlinClass(objArr.getClass()).getQualifiedName(), "Unsupported value type ");
                    return;
                }
                i2 = 14;
            }
            dataOutputStream.writeByte(i2);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj2 : objArr) {
                if (i2 == 8) {
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i2 == 9) {
                    Byte b2 = obj2 instanceof Byte ? (Byte) obj2 : null;
                    dataOutputStream.writeByte(b2 != null ? b2.byteValue() : (byte) 0);
                } else if (i2 == 10) {
                    Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i2 == 11) {
                    Long l2 = obj2 instanceof Long ? (Long) obj2 : null;
                    dataOutputStream.writeLong(l2 != null ? l2.longValue() : 0L);
                } else if (i2 == 12) {
                    Float f2 = obj2 instanceof Float ? (Float) obj2 : null;
                    dataOutputStream.writeFloat(f2 != null ? f2.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                } else if (i2 == 13) {
                    Double d2 = obj2 instanceof Double ? (Double) obj2 : null;
                    dataOutputStream.writeDouble(d2 != null ? d2.doubleValue() : 0.0d);
                } else if (i2 == 14) {
                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                    if (str2 == null) {
                        str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str2);
                }
            }
        }
        dataOutputStream.writeUTF(str);
    }

    public static final void a(v0i v0iVar, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1274494046);
        int i3 = (av8Var.g(v0iVar) ? 4 : 2) | i2 | (av8Var.g(xtcVar) ? 32 : 16);
        int i4 = 0;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            dy0.b(n9e.q(qx9.p(xtcVar, 1.0666667f), lz.D(R.color.terrain_basketball, av8Var), oyn.e), null, yqo.H(1674340364, av8Var, new kr1(v0iVar, i4)), av8Var, 3072, 6);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new lr1(v0iVar, xtcVar, i2, i4);
        }
    }

    public static final void b(int i2, w75 w75Var, xtc xtcVar, of3 of3Var, int i3) {
        int i4;
        Boolean bool;
        utc utcVar;
        float f2;
        float f3;
        boolean z;
        String str = w75Var.b;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(138305739);
        if ((i3 & 6) == 0) {
            i4 = (av8Var.e(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= av8Var.g(w75Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i4 & 1, (i4 & 147) != 146)) {
            boolean z2 = av8Var.k(dh3.n) == ema.b;
            xtc c0 = l98.c0(bkh.d(xtcVar, 1.0f), 16.0f, 8.0f);
            l8g a2 = k8g.a(b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
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
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            if (str != null) {
                bool = Boolean.valueOf(str.length() > 0);
            } else {
                bool = null;
            }
            boolean c2 = Intrinsics.c(bool, Boolean.TRUE);
            utc utcVar2 = utc.a;
            if (c2) {
                av8Var.d0(755574969);
                int i5 = i4;
                Integer valueOf = Integer.valueOf(i2);
                Integer num = w75Var.a;
                int intValue = num != null ? num.intValue() : -1;
                if (str == null) {
                    str = "";
                }
                Integer num2 = w75Var.c;
                int intValue2 = num2 != null ? num2.intValue() : -1;
                String str2 = w75Var.d;
                Regex regex = yid.a;
                String str3 = w75Var.g;
                int i6 = intValue;
                if (1.0f <= 0.0d) {
                    p3a.a("invalid weight; must be greater than zero");
                }
                z = false;
                c(valueOf, i6, str, intValue2, str2, str3, new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), av8Var, i5 & 14);
                av8Var = av8Var;
                av8Var.s(false);
                utcVar = utcVar2;
                f3 = 8.0f;
                f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            } else {
                av8Var.d0(755969506);
                String valueOf2 = String.valueOf(i2 + 1);
                xtc p2 = bkh.p(l98.f0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), 16.0f);
                yf8 yf8Var = xth.a;
                utcVar = utcVar2;
                udj.c(valueOf2, p2, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var, 48, 0, 131064);
                td4.C(-1, bkh.l(utcVar, 40.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 54, 12);
                String v2 = oea.v(R.string.label_to_be_determined, av8Var);
                dfj e2 = xth.e();
                long D = lz.D(R.color.n_lv_3, av8Var);
                if (1.0f <= 0.0d) {
                    p3a.a("invalid weight; must be greater than zero");
                }
                f2 = 0.0f;
                f3 = 8.0f;
                udj.c(v2, l98.d0(new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), D, null, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, e2, av8Var, 0, 24960, 110584);
                av8Var = av8Var;
                z = false;
                av8Var.s(false);
            }
            Integer num3 = w75Var.e;
            if (num3 == null) {
                av8Var.d0(756799499);
                av8Var.s(z);
            } else {
                av8Var.d0(756799500);
                td4.G(num3.intValue(), bkh.l(utcVar, 24.0f), false, 0L, av8Var, 48, 12);
                ImageVector N = s6a.N(R.drawable.ic_advantage_arrow_right_8, 6, av8Var);
                long D2 = lz.D(R.color.n_lv_1, av8Var);
                xtc l2 = bkh.l(l98.d0(utcVar, f3, f2, 2), 16.0f);
                if (z2) {
                    l2 = l2.z(f6a.D(utcVar, -1.0f, -1.0f));
                }
                kq9.b(N, null, l2, D2, av8Var, 48, 0);
                av8Var.s(z);
            }
            td4.G(w75Var.f, bkh.l(utcVar, 24.0f), false, 0L, av8Var, 48, 12);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new wx1(i2, w75Var, xtcVar, i3);
        }
    }

    public static final void c(Integer num, int i2, String str, int i3, String str2, String str3, xtc xtcVar, of3 of3Var, int i4) {
        int i5;
        utc utcVar;
        f50 f50Var;
        lv1 lv1Var;
        ff3 ff3Var;
        f50 f50Var2;
        ry ryVar;
        zg3 zg3Var;
        f50 f50Var3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-786759488);
        if ((i4 & 6) == 0) {
            i5 = (av8Var.g(num) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= av8Var.e(i2) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= av8Var.g(str) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= av8Var.e(i3) ? a.o : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= av8Var.g(str2) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= av8Var.g(str3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i4) == 0) {
            i5 |= av8Var.g(xtcVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i6 = i5;
        if (av8Var.T(i6 & 1, (i6 & 599187) != 599186)) {
            lv1 lv1Var2 = uxf.m;
            l8g a2 = k8g.a(b, lv1Var2, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, xtcVar);
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
            waa.K(av8Var, m2, ff3Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var5 = hf3.j;
            waa.K(av8Var, valueOf, f50Var5);
            ry ryVar2 = hf3.k;
            waa.J(av8Var, ryVar2);
            f50 f50Var6 = hf3.d;
            waa.K(av8Var, C, f50Var6);
            utc utcVar2 = utc.a;
            if (num == null) {
                av8Var.d0(-995269732);
                av8Var.s(false);
                lv1Var = lv1Var2;
                f50Var3 = f50Var6;
                ff3Var = ff3Var2;
                f50Var2 = f50Var4;
                ryVar = ryVar2;
                f50Var = f50Var5;
                zg3Var = zg3Var2;
                utcVar = utcVar2;
            } else {
                av8Var.d0(-995269731);
                String valueOf2 = String.valueOf(num.intValue() + 1);
                utcVar = utcVar2;
                xtc p2 = bkh.p(l98.f0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), 16.0f);
                yf8 yf8Var = xth.a;
                f50Var = f50Var5;
                lv1Var = lv1Var2;
                ff3Var = ff3Var2;
                f50Var2 = f50Var4;
                ryVar = ryVar2;
                zg3Var = zg3Var2;
                f50Var3 = f50Var6;
                q5a.w(valueOf2, p2, lz.D(R.color.n_lv_1, av8Var), null, 0L, 0L, null, 0L, 0, false, 0, 0, xth.e(), av8Var, 48, 0, 131064);
                av8Var = av8Var;
                Unit unit = Unit.a;
                av8Var.s(false);
            }
            utc utcVar3 = utcVar;
            av8 av8Var2 = av8Var;
            td4.C(i2, bkh.l(utcVar3, 40.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, ((i6 >> 3) & 14) | 48, 12);
            xtc e2 = fn0.e(1.0f, l98.f0(utcVar3, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), true);
            int i7 = 6;
            u23 a3 = t23.a(new ng0(4.0f, true, new a70(i7)), uxf.o, av8Var2, 6);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m3 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, e2);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a3, f50Var2);
            waa.K(av8Var2, m3, ff3Var);
            ry ryVar3 = ryVar;
            bf3.s(hashCode2, av8Var2, f50Var, av8Var2, ryVar3);
            f50 f50Var7 = f50Var3;
            waa.K(av8Var2, C2, f50Var7);
            yf8 yf8Var2 = xth.a;
            ff3 ff3Var3 = ff3Var;
            udj.c(str, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var2, (i6 >> 6) & 14, 24960, 110586);
            av8 av8Var3 = av8Var2;
            l8g a4 = k8g.a(new ng0(4.0f, true, new a70(i7)), lv1Var, av8Var3, 54);
            int hashCode3 = Long.hashCode(av8Var3.T);
            aee m4 = av8Var3.m();
            xtc C3 = fqj.C(av8Var3, utcVar3);
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var);
            } else {
                av8Var3.q0();
            }
            waa.K(av8Var3, a4, f50Var2);
            waa.K(av8Var3, m4, ff3Var3);
            bf3.s(hashCode3, av8Var3, f50Var, av8Var3, ryVar3);
            waa.K(av8Var3, C3, f50Var7);
            if (str3 == null) {
                av8Var3.d0(-1657904974);
                av8Var3.s(false);
            } else {
                av8Var3.d0(-1657904973);
                udj.c(str3, null, lz.D(R.color.n_lv_3, av8Var3), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var3, (i6 >> 15) & 14, 0, 131066);
                av8Var3 = av8Var3;
                e12.a(0, av8Var3, n9e.q(bkh.l(utcVar3, 4.0f), lz.D(R.color.n_lv_4, av8Var3), o7g.a));
                Unit unit2 = Unit.a;
                av8Var3.s(false);
            }
            td4.G(i3, bkh.l(utcVar3, 16.0f), false, 0L, av8Var3, ((i6 >> 9) & 14) | 48, 12);
            av8 av8Var4 = av8Var3;
            udj.c(str2, null, lz.D(R.color.n_lv_3, av8Var3), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var4, (i6 >> 12) & 14, 24960, 110586);
            av8Var = av8Var4;
            ljg.t(av8Var, true, true, true);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new x75(num, i2, str, i3, str2, str3, xtcVar, i4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [av8, java.lang.Object, of3] */
    /* JADX WARN: Type inference failed for: r6v15, types: [tc3] */
    public static final void d(boolean z, Function1 function1, xtc xtcVar, tc3 tc3Var, of3 of3Var, int i2) {
        int i3;
        xtc xtcVar2;
        tc3 tc3Var2;
        Object obj;
        int i4;
        int i5;
        znh znhVar;
        l8l l8lVar;
        int i6;
        boolean z2;
        boolean z3 = z;
        Function1 function12 = function1;
        ?? r15 = (av8) of3Var;
        r15.f0(1597265892);
        if ((i2 & 6) == 0) {
            i3 = (r15.h(z3) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= r15.i(function12) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= r15.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= r15.i(tc3Var) ? a.o : 1024;
        }
        if (r15.T(i3 & 1, (i3 & 1171) != 1170)) {
            Configuration configuration = (Configuration) r15.k(nz.a);
            View view = (View) r15.k(nz.f);
            boolean g2 = r15.g(configuration) | r15.g(view);
            Object O = r15.O();
            Object obj2 = nf3.a;
            if (g2 || O == obj2) {
                O = new l8l(view);
                r15.n0(O);
            }
            l8l l8lVar2 = (l8l) O;
            kx4 kx4Var = (kx4) r15.k(dh3.h);
            int e0 = kx4Var.e0(48.0f);
            Object O2 = r15.O();
            if (O2 == obj2) {
                O2 = e.f(null);
                r15.n0(O2);
            }
            e1d e1dVar = (e1d) O2;
            Object O3 = r15.O();
            if (O3 == obj2) {
                O3 = e.c(0);
                r15.n0(O3);
            }
            znh znhVar2 = (znh) O3;
            Object O4 = r15.O();
            if (O4 == obj2) {
                O4 = e.c(0);
                r15.n0(O4);
            }
            znh znhVar3 = (znh) O4;
            Object O5 = r15.O();
            if (O5 == obj2) {
                O5 = new ce8();
                r15.n0(O5);
            }
            ce8 ce8Var = (ce8) O5;
            mvh mvhVar = (mvh) r15.k(dh3.q);
            String B = cga.B(R.string.m3c_dropdown_menu_expanded, r15);
            String B2 = cga.B(R.string.m3c_dropdown_menu_collapsed, r15);
            String B3 = cga.B(R.string.m3c_dropdown_menu_toggle, r15);
            int i7 = i3;
            Object O6 = r15.O();
            if (O6 == obj2) {
                O6 = e.f(new fj6("PrimaryNotEditable"));
                r15.n0(O6);
            }
            e1d e1dVar2 = (e1d) O6;
            Object O7 = r15.O();
            if (O7 == obj2) {
                O7 = e.f(Boolean.FALSE);
                r15.n0(O7);
            }
            e1d e1dVar3 = (e1d) O7;
            int i8 = i7 & 14;
            boolean z4 = i8 == 4;
            int i9 = i7 & 112;
            boolean g3 = z4 | (i9 == 32) | r15.g(l8lVar2) | r15.g(kx4Var);
            Object O8 = r15.O();
            if (g3 || O8 == obj2) {
                obj = obj2;
                i4 = i9;
                i5 = e0;
                znhVar = znhVar2;
                l8lVar = l8lVar2;
                i6 = i7;
                O8 = new jj6(ce8Var, z, e1dVar3, B, B2, B3, mvhVar, e1dVar2, function12, znhVar, znhVar3);
                ce8Var = ce8Var;
                z3 = z;
                function12 = function12;
                r15.n0(O8);
            } else {
                z3 = z;
                obj = obj2;
                i4 = i9;
                i5 = e0;
                znhVar = znhVar2;
                i6 = i7;
                l8lVar = l8lVar2;
            }
            jj6 jj6Var = (jj6) O8;
            boolean i10 = r15.i(l8lVar) | r15.e(i5);
            Object O9 = r15.O();
            if (i10 || O9 == obj) {
                O9 = new xi(i5, 2, l8lVar, e1dVar, znhVar, znhVar3);
                e1dVar = e1dVar;
                r15.n0(O9);
            }
            xtcVar2 = xtcVar;
            xtc A = un0.A(xtcVar2, (Function1) O9);
            k1c c2 = e12.c(uxf.c, false);
            int G = z8e.G(r15);
            aee m2 = r15.m();
            xtc C = fqj.C(r15, A);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            r15.h0();
            if (r15.S) {
                r15.l(zg3Var);
            } else {
                r15.q0();
            }
            waa.K(r15, c2, hf3.g);
            waa.K(r15, m2, hf3.f);
            f50 f50Var = hf3.j;
            if (r15.S || !Intrinsics.c(r15.O(), Integer.valueOf(G))) {
                mz1.t(G, r15, G, f50Var);
            }
            waa.K(r15, C, hf3.d);
            int i11 = 6;
            ?? r6 = tc3Var;
            r6.invoke(jj6Var, r15, Integer.valueOf((i6 >> 6) & 112));
            r15.s(true);
            if (z3) {
                r15.d0(209894723);
                boolean i12 = r15.i(l8lVar) | r15.e(i5);
                Object O10 = r15.O();
                if (i12 || O10 == obj) {
                    O10 = new im1(l8lVar, i5, e1dVar, znhVar3, 1);
                    r15.n0(O10);
                }
                z2 = false;
                qx9.k((Function0) O10, r15, 0);
                r15.s(false);
            } else {
                z2 = false;
                r15.d0(210228190);
                r15.s(false);
            }
            boolean z5 = i8 == 4 ? true : z2;
            Object O11 = r15.O();
            if (z5 || O11 == obj) {
                O11 = new m1(z3, ce8Var, i11);
                r15.n0(O11);
            }
            hz8.t((Function0) O11, r15);
            boolean z6 = i4 != 32 ? z2 : true;
            Object O12 = r15.O();
            if (z6 || O12 == obj) {
                O12 = new is5(i11, function12);
                r15.n0(O12);
            }
            ktm.a(z3, (Function0) O12, r15, i8);
            tc3Var2 = r6;
        } else {
            xtcVar2 = xtcVar;
            tc3Var2 = tc3Var;
            r15.W();
        }
        eqf u2 = r15.u();
        if (u2 != null) {
            u2.d = new s73(z3, function12, xtcVar2, tc3Var2, i2);
        }
    }

    public static final void e(x07 x07Var, of3 of3Var, int i2) {
        x07Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1788249443);
        int i3 = (av8Var.g(x07Var) ? 4 : 2) | i2;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            wkn.a(Boolean.valueOf(x07Var.b), null, null, null, yqo.H(-1196382018, av8Var, new kr1(x07Var, 3)), av8Var, 24576, 14);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new jo6(x07Var, i2, 13);
        }
    }

    public static final void f(float f2, int i2, int i3, int i4, of3 of3Var, xtc xtcVar) {
        float f3;
        Object obj;
        Object obj2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1395689286);
        int i5 = i4 | (av8Var.d(f2) ? 4 : 2) | (av8Var.e(i2) ? 32 : 16) | (av8Var.e(i3) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(xtcVar) ? a.o : 1024);
        if (av8Var.T(i5 & 1, (i5 & 1171) != 1170)) {
            kx4 kx4Var = (kx4) av8Var.k(dh3.h);
            Object O = av8Var.O();
            Object obj3 = nf3.a;
            if (O == obj3) {
                O = hz8.G(g.a, av8Var);
                av8Var.n0(O);
            }
            Object obj4 = (ku3) O;
            final long j2 = r13.d;
            final long D = lz.D(R.color.on_color_highlight_1, av8Var);
            Object O2 = av8Var.O();
            if (O2 == obj3) {
                O2 = Float.valueOf(kx4Var.H0(1.0f));
                av8Var.n0(O2);
            }
            final float floatValue = ((Number) O2).floatValue();
            Object O3 = av8Var.O();
            if (O3 == obj3) {
                O3 = Float.valueOf(kx4Var.H0(3.0f));
                av8Var.n0(O3);
            }
            final float floatValue2 = ((Number) O3).floatValue();
            Object O4 = av8Var.O();
            if (O4 == obj3) {
                O4 = Float.valueOf(kx4Var.H0(4.0f));
                av8Var.n0(O4);
            }
            final float floatValue3 = ((Number) O4).floatValue();
            Object O5 = av8Var.O();
            if (O5 == obj3) {
                O5 = Float.valueOf(kx4Var.H0(36.0f));
                av8Var.n0(O5);
            }
            final float floatValue4 = ((Number) O5).floatValue();
            int i6 = 0;
            Object O6 = av8Var.O();
            if (O6 == obj3) {
                O6 = Float.valueOf(kx4Var.H0(40.0f));
                av8Var.n0(O6);
            }
            final float floatValue5 = ((Number) O6).floatValue();
            Object O7 = av8Var.O();
            if (O7 == obj3) {
                O7 = e.c(0);
                av8Var.n0(O7);
            }
            final znh znhVar = (znh) O7;
            Object O8 = av8Var.O();
            if (O8 == obj3) {
                O8 = Float.valueOf(kx4Var.H0(120.0f));
                av8Var.n0(O8);
            }
            final float floatValue6 = ((Number) O8).floatValue();
            Object O9 = av8Var.O();
            if (O9 == obj3) {
                O9 = goh.b(new Function0() { // from class: r07
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(((znhVar.h() - (floatValue4 * 2.0f)) - (3.0f * floatValue5)) / 2.0f);
                    }
                });
                av8Var.n0(O9);
            }
            final cdi cdiVar = (cdi) O9;
            Object O10 = av8Var.O();
            if (O10 == obj3) {
                Float valueOf = Float.valueOf(f2);
                f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                List j3 = b.j(valueOf, Float.valueOf(i2), Float.valueOf(i3));
                ArrayList arrayList = new ArrayList(k13.r(j3, 10));
                Iterator it = j3.iterator();
                while (it.hasNext()) {
                    Iterator it2 = it;
                    float floatValue7 = ((Number) it.next()).floatValue() / (i3 >= 1 ? i3 : 1);
                    if (floatValue7 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        floatValue7 = 0.0f;
                    }
                    arrayList.add(Float.valueOf(floatValue7 * floatValue6));
                    it = it2;
                }
                av8Var.n0(arrayList);
                obj = arrayList;
            } else {
                f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                obj = O10;
            }
            final List list = (List) obj;
            Object O11 = av8Var.O();
            if (O11 == obj3) {
                O11 = ml4.b(f3);
                av8Var.n0(O11);
            }
            final q50 q50Var = (q50) O11;
            Object O12 = av8Var.O();
            if (O12 == obj3) {
                Function0 function0 = new Function0() { // from class: s07
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ArrayList arrayList2 = new ArrayList(3);
                        for (int i7 = 0; i7 < 3; i7++) {
                            b20 a2 = e20.a();
                            Path path = a2.a;
                            float floatValue8 = ((Number) list.get(i7)).floatValue();
                            float floatValue9 = ((Number) cdiVar.getValue()).floatValue();
                            float f4 = floatValue5;
                            float f5 = ((floatValue9 + f4) * i7) + floatValue4;
                            float floatValue10 = ((Number) q50Var.d()).floatValue() * floatValue8;
                            float f6 = floatValue6;
                            float f7 = f6 - floatValue10;
                            float f8 = f4 + f5;
                            a2.i();
                            a2.g(f5, f6);
                            float f9 = floatValue3;
                            float f10 = f7 + f9;
                            a2.f(f5, f10);
                            path.quadTo(f5, f7, f5 + f9, f7);
                            a2.f(f8 - f9, f7);
                            path.quadTo(f8, f7, f8, f10);
                            a2.f(f8, f6);
                            a2.d();
                            arrayList2.add(a2);
                        }
                        return arrayList2;
                    }
                };
                obj2 = q50Var;
                O12 = goh.b(function0);
                av8Var.n0(O12);
            } else {
                obj2 = q50Var;
            }
            final cdi cdiVar2 = (cdi) O12;
            d6b d6bVar = d6b.ON_RESUME;
            boolean i7 = av8Var.i(obj4) | av8Var.i(obj2);
            Object O13 = av8Var.O();
            if (i7 || O13 == obj3) {
                O13 = new h84(27, obj4, obj2);
                av8Var.n0(O13);
            }
            jca.b(d6bVar, null, (Function0) O13, av8Var, 6);
            xtc e2 = bkh.e(bkh.d(xtcVar, 1.0f), 120.0f);
            Object O14 = av8Var.O();
            if (O14 == obj3) {
                O14 = new t07(znhVar, i6);
                av8Var.n0(O14);
            }
            xtc A = un0.A(e2, (Function1) O14);
            boolean f4 = av8Var.f(D);
            Object O15 = av8Var.O();
            if (f4 || O15 == obj3) {
                Object obj5 = new Function1() { // from class: u07
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        ha5 ha5Var = (ha5) obj6;
                        ha5Var.getClass();
                        float intBitsToFloat = Float.intBitsToFloat((int) (ha5Var.L0().D() & 4294967295L));
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (ha5Var.L0().D() >> 32));
                        int i8 = 0;
                        while (i8 < 3) {
                            c20 r2 = i8 == 0 ? f5p.r(new float[]{floatValue3, floatValue2}, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : null;
                            float f5 = ((intBitsToFloat / 2.0f) * i8) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            ha5.W0(ha5Var, D, (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L), (Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat2) << 32), floatValue, 0, r2, 464);
                            i8++;
                        }
                        Iterator it3 = ((List) cdiVar2.getValue()).iterator();
                        while (it3.hasNext()) {
                            ha5.X0(ha5Var, (b20) it3.next(), j2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 60);
                        }
                        return Unit.a;
                    }
                };
                av8Var.n0(obj5);
                O15 = obj5;
            }
            lz.d(0, av8Var, A, (Function1) O15);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new v07(f2, i2, i3, xtcVar, i4);
        }
    }

    public static final void g(final q67 q67Var, final boolean z, xtc xtcVar, final Integer num, final Function1 function1, final Function1 function12, final qug qugVar, boolean z2, Function1 function13, boolean z3, boolean z4, boolean z5, boolean z6, of3 of3Var, final int i2, final int i3, final int i4) {
        xtc xtcVar2;
        int i5;
        boolean z7;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        final Function1 function14;
        final boolean z8;
        final boolean z9;
        final boolean z10;
        av8 av8Var;
        final boolean z11;
        final xtc xtcVar3;
        final boolean z12;
        xtc xtcVar4;
        Function1 function15;
        boolean z13;
        Function1 function16;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        long c2;
        xtc xtcVar5;
        boolean z18;
        int i12;
        int i13;
        q67Var.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1210691091);
        int i14 = i2 | (av8Var2.g(q67Var) ? 4 : 2) | (av8Var2.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        int i15 = i4 & 8;
        if (i15 != 0) {
            i5 = i14 | 3072;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i5 = i14 | (av8Var2.g(xtcVar2) ? a.o : 1024);
        }
        int i16 = i5 | (av8Var2.g(num) ? 16384 : 8192);
        if ((i2 & 196608) == 0) {
            i16 |= av8Var2.i(function1) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        int i17 = i16 | (av8Var2.i(function12) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var2.g(qugVar) ? 8388608 : 4194304);
        int i18 = i4 & NotificationCompat.FLAG_LOCAL_ONLY;
        if (i18 != 0) {
            i6 = i17 | 100663296;
            z7 = z2;
        } else {
            z7 = z2;
            i6 = i17 | (av8Var2.h(z7) ? 67108864 : 33554432);
        }
        int i19 = i4 & 512;
        if (i19 != 0) {
            i6 |= 805306368;
        } else if ((i2 & 805306368) == 0) {
            i6 |= av8Var2.i(function13) ? 536870912 : 268435456;
        }
        int i20 = i4 & 1024;
        if (i20 != 0) {
            i8 = 6;
            i7 = i6;
        } else if ((i3 & 6) == 0) {
            i7 = i6;
            i8 = i3 | (av8Var2.h(z3) ? 4 : 2);
        } else {
            i7 = i6;
            i8 = i3;
        }
        int i21 = i4 & a.o;
        if (i21 != 0) {
            i9 = i8 | 48;
        } else {
            i9 = i8 | (av8Var2.h(z4) ? 32 : 16);
        }
        int i22 = i9;
        int i23 = i4 & 4096;
        if (i23 != 0) {
            i10 = i22 | 384;
        } else {
            i10 = i22 | (av8Var2.h(z5) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        }
        int i24 = i4 & 8192;
        if (i24 != 0) {
            i11 = i10 | 3072;
        } else {
            i11 = i10 | (av8Var2.h(z6) ? a.o : 1024);
        }
        if (av8Var2.T(i7 & 1, ((i7 & 306783379) == 306783378 && (i11 & 1171) == 1170) ? false : true)) {
            av8Var2.Y();
            int i25 = i2 & 1;
            Object obj = nf3.a;
            if (i25 == 0 || av8Var2.B()) {
                xtcVar4 = i15 != 0 ? utc.a : xtcVar2;
                if (i18 != 0) {
                    z7 = true;
                }
                if (i19 != 0) {
                    Object O = av8Var2.O();
                    if (O == obj) {
                        O = new yt6(16);
                        av8Var2.n0(O);
                    }
                    function15 = (Function1) O;
                } else {
                    function15 = function13;
                }
                boolean z19 = i20 != 0 ? false : z3;
                boolean z20 = i21 != 0 ? true : z4;
                boolean z21 = i23 != 0 ? true : z5;
                if (i24 != 0) {
                    function16 = function15;
                    z14 = z19;
                    z13 = false;
                } else {
                    z13 = z6;
                    function16 = function15;
                    z14 = z19;
                }
                z15 = z20;
                z16 = z7;
                z17 = z21;
            } else {
                av8Var2.W();
                function16 = function13;
                z14 = z3;
                z15 = z4;
                z17 = z5;
                z13 = z6;
                z16 = z7;
                xtcVar4 = xtcVar2;
            }
            av8Var2.t();
            View view = (View) av8Var2.k(nz.f);
            cdi P = z1a.P(qugVar, av8Var2);
            boolean z22 = z16;
            FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = q67Var.a;
            yy6 yy6Var = fantasyRoundPlayerUiModel.c;
            int i26 = yy6Var == null ? -1 : p67.a[yy6Var.ordinal()];
            if (i26 == 1 || i26 == 2) {
                av8Var2.d0(-461971706);
                c2 = r13.c(lz.D(R.color.error, av8Var2), 0.15f);
                av8Var2.s(false);
            } else {
                if (i26 == 3 || i26 == 4) {
                    i12 = -461969376;
                    i13 = R.color.surface_0;
                } else {
                    i12 = -461968384;
                    i13 = R.color.surface_1;
                }
                c2 = ljg.f(av8Var2, i12, i13, av8Var2, false);
            }
            xtc q2 = n9e.q(bkh.d(xtcVar4, 1.0f), c2, oyn.e);
            if (function1 == null || fantasyRoundPlayerUiModel.e) {
                xtcVar5 = q2;
                z18 = false;
            } else {
                xtcVar5 = q2;
                z18 = true;
            }
            boolean g2 = ((i7 & 458752) == 131072) | av8Var2.g(fantasyRoundPlayerUiModel);
            Object O2 = av8Var2.O();
            if (g2 || O2 == obj) {
                O2 = new lw6(function1, fantasyRoundPlayerUiModel, 2);
                av8Var2.n0(O2);
            }
            xtc y = tol.y(xtcVar5, z18, false, false, 0L, null, (Function0) O2, av8Var2, 30);
            av8Var2.d0(-1003410150);
            av8Var2.d0(212064437);
            av8Var2.s(false);
            kx4 kx4Var = (kx4) av8Var2.k(dh3.h);
            Object O3 = av8Var2.O();
            if (O3 == obj) {
                O3 = new t1c(kx4Var);
                av8Var2.n0(O3);
            }
            t1c t1cVar = (t1c) O3;
            Object O4 = av8Var2.O();
            if (O4 == obj) {
                O4 = new am3();
                av8Var2.n0(O4);
            }
            am3 am3Var = (am3) O4;
            Object O5 = av8Var2.O();
            if (O5 == obj) {
                O5 = e.f(Boolean.FALSE);
                av8Var2.n0(O5);
            }
            e1d e1dVar = (e1d) O5;
            Object O6 = av8Var2.O();
            if (O6 == obj) {
                O6 = new pm3(am3Var);
                av8Var2.n0(O6);
            }
            pm3 pm3Var = (pm3) O6;
            Object O7 = av8Var2.O();
            if (O7 == obj) {
                O7 = e.e(Unit.a, f7a.k);
                av8Var2.n0(O7);
            }
            e1d e1dVar2 = (e1d) O7;
            boolean i27 = av8Var2.i(t1cVar) | av8Var2.e(257);
            Object O8 = av8Var2.O();
            if (i27 || O8 == obj) {
                O8 = new kd3(e1dVar2, t1cVar, pm3Var, e1dVar, 4);
                av8Var2.n0(O8);
            }
            k1c k1cVar = (k1c) O8;
            Object O9 = av8Var2.O();
            if (O9 == obj) {
                O9 = new ld3(e1dVar, pm3Var, 4);
                av8Var2.n0(O9);
            }
            Function0 function0 = (Function0) O9;
            boolean i28 = av8Var2.i(t1cVar);
            Object O10 = av8Var2.O();
            if (i28 || O10 == obj) {
                O10 = new md3(t1cVar, 4);
                av8Var2.n0(O10);
            }
            xtc a2 = o3h.a(y, false, (Function1) O10);
            av8Var = av8Var2;
            Function1 function17 = function16;
            boolean z23 = z14;
            boolean z24 = z15;
            boolean z25 = z17;
            boolean z26 = z13;
            s6a.h(a2, yqo.H(1200550679, av8Var, new m67(e1dVar2, am3Var, function0, z26, fantasyRoundPlayerUiModel, function12, z, q67Var, P, qugVar, z22, z23, view, function17, z25, z24, num)), k1cVar, av8Var, 48);
            av8Var.s(false);
            z12 = z26;
            z11 = z22;
            z8 = z23;
            function14 = function17;
            z10 = z25;
            z9 = z24;
            xtcVar3 = xtcVar4;
        } else {
            av8Var2.W();
            function14 = function13;
            z8 = z3;
            z9 = z4;
            z10 = z5;
            av8Var = av8Var2;
            z11 = z7;
            xtcVar3 = xtcVar2;
            z12 = z6;
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new Function2() { // from class: k67
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int K = aba.K(i2 | 1);
                    int K2 = aba.K(i3);
                    ww9.g(q67.this, z, xtcVar3, num, function1, function12, qugVar, z11, function14, z8, z9, z10, z12, (of3) obj2, K, K2, i4);
                    return Unit.a;
                }
            };
        }
    }

    public static final void h(bd7 bd7Var, xtc xtcVar, Function1 function1, of3 of3Var, int i2) {
        xtc xtcVar2;
        float f2;
        utc utcVar;
        bd7Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1782450225);
        int i3 = i2 | (av8Var.g(bd7Var) ? 4 : 2) | 48 | (av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            lv1 lv1Var = uxf.m;
            utc utcVar2 = utc.a;
            xtc d2 = bkh.d(utcVar2, 1.0f);
            sx6 sx6Var = bd7Var.a;
            boolean z = sx6Var.b && function1 != null;
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
                O2 = o67.d;
                av8Var.n0(O2);
            }
            xtc c0 = l98.c0(tol.y(d2, z, true, true, D, wzcVar, new gi(11, (boh) o3a.N(objArr, (Function0) O2, av8Var, 48), function1, bd7Var), av8Var, 0), 16.0f, 12.0f);
            wxf wxfVar = b;
            l8g a2 = k8g.a(wxfVar, lv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
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
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            float f3 = Float.MAX_VALUE;
            if (1.0f > Float.MAX_VALUE) {
                f2 = Float.MAX_VALUE;
            } else {
                f2 = Float.MAX_VALUE;
                f3 = 1.0f;
            }
            goa goaVar = new goa(f3, true);
            l8g a3 = k8g.a(wxfVar, lv1Var, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, goaVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            goa goaVar2 = new goa(1.0f > f2 ? f2 : 1.0f, false);
            String v2 = oea.v(sx6Var.a, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v2, goaVar2, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, xth.e(), av8Var, 0, 24576, 114680);
            if (sx6Var.b) {
                utcVar = utcVar2;
                ljg.r(4.0f, -316315414, av8Var, av8Var, utcVar);
                kq9.b(s6a.N(R.drawable.ic_info, 6, av8Var), null, bkh.l(utcVar, 16.0f), lz.D(R.color.primary_default, av8Var), av8Var, 432, 0);
                av8Var.s(false);
            } else {
                utcVar = utcVar2;
                av8Var.d0(-315993479);
                av8Var.s(false);
            }
            i.o(av8Var, true, utcVar, 8.0f, av8Var);
            udj.c(bd7Var.b, l98.c0(n9e.q(utcVar, lz.D(R.color.surface_2, av8Var), o7g.a(4.0f)), 8.0f, 2.0f), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, xth.e(), av8Var, 0, 24576, 114680);
            av8Var = av8Var;
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new uu6(i2, 13, bd7Var, xtcVar2, function1);
        }
    }

    public static final void i(gv9 gv9Var, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1806903187);
        int i3 = (av8Var.g(gv9Var) ? 4 : 2) | i2;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            l8g a2 = k8g.a(new ng0(4.0f, true, new l1(uxf.p, 5)), uxf.l, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
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
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            Iterator<E> it = gv9Var.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                int size = ((tx6) it.next()).a.size();
                if (size < 1) {
                    size = 1;
                }
                i4 += size;
            }
            boolean z = i4 > 4;
            int i5 = z ? 3 : 4;
            xbb b2 = kotlin.collections.a.b();
            Iterator it2 = gv9Var.iterator();
            while (it2.hasNext()) {
                tx6 tx6Var = (tx6) it2.next();
                if (i5 <= 0) {
                    break;
                }
                List L0 = CollectionsKt.L0(tx6Var.a, i5);
                int size2 = L0.size();
                if (size2 < 1) {
                    size2 = 1;
                }
                i5 -= size2;
                b2.add(new tx6(l6g.W(L0)));
            }
            xbb a3 = kotlin.collections.a.a(b2);
            av8Var.d0(630071619);
            ListIterator listIterator = a3.listIterator(0);
            while (true) {
                hc9 hc9Var = (hc9) listIterator;
                if (!hc9Var.hasNext()) {
                    break;
                }
                tx6 tx6Var2 = (tx6) hc9Var.next();
                int size3 = tx6Var2.a.size();
                if (size3 == 0) {
                    av8Var.d0(-664662370);
                    c5n.i(0, av8Var, null);
                    av8Var.s(false);
                } else if (size3 != 1) {
                    av8Var.d0(-664648279);
                    c5n.j(tx6Var2, null, av8Var, 0);
                    av8Var.s(false);
                } else {
                    av8Var.d0(870369569);
                    ux6 ux6Var = (ux6) CollectionsKt.Y(tx6Var2.a);
                    c5n.l(ux6Var.b, ux6Var.a, ux6Var.c, null, true, av8Var, 24576, 8);
                    av8Var.s(false);
                }
            }
            av8Var.s(false);
            if (z) {
                av8Var.d0(-1942018950);
                c5n.k(0, av8Var, null);
                av8Var.s(false);
            } else {
                av8Var.d0(-1941964173);
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new y81(gv9Var, xtcVar, i2, 10);
        }
    }

    public static final void j(int i2, of3 of3Var, xtc xtcVar, Function0 function0, Function0 function02) {
        av8 av8Var;
        function0.getClass();
        function02.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-592054032);
        int i3 = i2 | (av8Var2.g(xtcVar) ? 4 : 2) | (av8Var2.i(function0) ? 32 : 16) | (av8Var2.i(function02) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var2.T(i3 & 1, (i3 & 147) != 146)) {
            xtc e0 = l98.e0(tol.y(wnn.A(n9e.q(bkh.d(xtcVar, 1.0f), lz.D(R.color.surface_1, av8Var2), o7g.a(16.0f)), o7g.a(16.0f)), false, false, false, 0L, null, function02, av8Var2, 31), 16.0f, 8.0f, 12.0f, 8.0f);
            u23 a2 = t23.a(d, uxf.o, av8Var2, 0);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C = fqj.C(av8Var2, e0);
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
            waa.K(av8Var2, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var2, C, f50Var3);
            utc utcVar = utc.a;
            xtc d2 = bkh.d(utcVar, 1.0f);
            lv1 lv1Var = uxf.m;
            wxf wxfVar = b;
            l8g a3 = k8g.a(wxfVar, lv1Var, av8Var2, 48);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m3 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, d2);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a3, f50Var);
            waa.K(av8Var2, m3, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
            goa g2 = ljg.g(av8Var2, C2, f50Var3, 1.0f, true);
            String v2 = oea.v(R.string.feed_primary_tab_toast_header, av8Var2);
            yf8 yf8Var = xth.a;
            udj.c(v2, g2, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.k(), av8Var2, 0, 0, 131064);
            kq9.b(s6a.N(R.drawable.ic_close, 6, av8Var2), null, l98.b0(oyn.w(wnn.A(bkh.l(utcVar, 32.0f), o7g.a), false, null, null, function0, 15), 6.0f), lz.D(R.color.n_lv_1, av8Var2), av8Var2, 48, 0);
            bf3.t(av8Var2, true, utcVar, 2.0f, av8Var2);
            udj.c(oea.v(R.string.feed_primary_tab_toast_body, av8Var2), bkh.d(utcVar, 1.0f), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var2, 48, 0, 131064);
            xtc d0 = l98.d0(vxd.f(utcVar, 8.0f, av8Var2, utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1);
            l8g a4 = k8g.a(wxfVar, lv1Var, av8Var2, 48);
            int hashCode3 = Long.hashCode(av8Var2.T);
            aee m4 = av8Var2.m();
            xtc C3 = fqj.C(av8Var2, d0);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a4, f50Var);
            waa.K(av8Var2, m4, ff3Var);
            bf3.s(hashCode3, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C3, f50Var3);
            udj.c(oea.v(R.string.go_to_settings, av8Var2), null, lz.D(R.color.primary_default, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var2, 0, 0, 131066);
            av8Var = av8Var2;
            kq9.b(s6a.N(R.drawable.ic_chevron_right_large_16, 6, av8Var), null, l98.f0(bkh.l(utcVar, 16.0f), 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), lz.D(R.color.primary_default, av8Var), av8Var, 432, 0);
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new x51(xtcVar, function0, function02, i2);
        }
    }

    public static p1g k(int i2, wg8 wg8Var) {
        return new p1g(i2, wg8Var, new ug8(new tg8[0]));
    }

    public static final void l(gv9 gv9Var, xtc xtcVar, tc3 tc3Var, of3 of3Var, int i2) {
        int i3;
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1767853907);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(gv9Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 48;
        if ((i2 & 384) == 0) {
            i4 |= av8Var.i(tc3Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i4 & 1, (i4 & 147) != 146)) {
            int i5 = i4 >> 3;
            l8g a2 = k8g.a(b, uxf.l, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
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
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            Iterator p2 = ljg.p(av8Var, C, hf3.d, -1786537094, gv9Var);
            while (p2.hasNext()) {
                xsi xsiVar = (xsi) p2.next();
                av8Var.a0(1816421904, xsiVar.a);
                tc3Var.invoke(xsiVar, av8Var, Integer.valueOf(i5 & 112));
                av8Var.s(false);
            }
            av8Var.s(false);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new zt7(gv9Var, xtcVar2, tc3Var, i2, 2);
        }
    }

    public static final void m(ysi ysiVar, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        gv9 gv9Var = ysiVar.g;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-301833647);
        int i4 = (av8Var.g(ysiVar) ? 4 : 2) | i2;
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            xtc f0 = l98.f0(l98.d0(n9e.q(bkh.d(xtcVar, 1.0f), lz.D(R.color.surface_1, av8Var), o7g.a(16.0f)), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7);
            u23 a2 = t23.a(d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
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
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            n(gv9Var, null, av8Var, 0);
            tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 15, 0L, 0L, av8Var, null);
            av8Var = av8Var;
            int i5 = ysiVar.a;
            String str = ysiVar.c;
            Integer num = ysiVar.e;
            utc utcVar = utc.a;
            o(i5, str, num, gv9Var, true, l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 5), av8Var, 221184);
            i3 = 1;
            o(ysiVar.b, ysiVar.d, ysiVar.f, gv9Var, false, l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 5), av8Var, 221184);
            av8Var.s(true);
        } else {
            i3 = 1;
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new op9(ysiVar, xtcVar, i2, i3);
        }
    }

    public static final void n(gv9 gv9Var, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(992732864);
        int i3 = (av8Var.g(gv9Var) ? 4 : 2) | i2 | 48;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            lv1 lv1Var = uxf.m;
            utc utcVar = utc.a;
            xtc d0 = l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            l8g a2 = k8g.a(b, lv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
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
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            nq8.h(av8Var, bkh.p(utcVar, 92.0f));
            l(gv9Var, null, yqo.H(-583661166, av8Var, new ud3(27)), av8Var, (i3 & 14) | 384);
            av8Var.s(true);
            xtcVar = utcVar;
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new y81(gv9Var, xtcVar, i2, 13);
        }
    }

    public static final void o(int i2, String str, Integer num, gv9 gv9Var, boolean z, xtc xtcVar, of3 of3Var, int i3) {
        boolean z2;
        gv9 gv9Var2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(384769642);
        int i4 = i3 | (av8Var.e(i2) ? 4 : 2) | (av8Var.g(str) ? 32 : 16) | (av8Var.g(num) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(gv9Var) ? a.o : 1024);
        if (av8Var.T(i4 & 1, (74899 & i4) != 74898)) {
            lv1 lv1Var = uxf.m;
            wxf wxfVar = b;
            l8g a2 = k8g.a(wxfVar, lv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, xtcVar);
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
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            utc utcVar = utc.a;
            xtc p2 = bkh.p(utcVar, 92.0f);
            l8g a3 = k8g.a(wxfVar, lv1Var, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, p2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            td4.G(i2, bkh.l(utcVar, 20.0f), false, 0L, av8Var, (i4 & 14) | 48, 12);
            nq8.h(av8Var, bkh.p(utcVar, 8.0f));
            xtc g2 = bkh.g(utcVar, 30.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a4 = t23.a(f, uxf.o, av8Var, 6);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C3 = fqj.C(av8Var, g2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            yf8 yf8Var = xth.a;
            udj.c(str, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var, (i4 >> 3) & 14, 24960, 110586);
            av8Var = av8Var;
            if (num == null) {
                av8Var.d0(-1957011045);
                av8Var.s(false);
            } else {
                bf3.r(2.0f, -1957011044, av8Var, av8Var, utcVar);
                udj.c(oea.v(R.string.hockey_shots_on_goal_short, av8Var) + ": " + num, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.c(), av8Var, 0, 24960, 110586);
                av8Var = av8Var;
                Unit unit = Unit.a;
                av8Var.s(false);
            }
            av8Var.s(true);
            av8Var.s(true);
            z2 = z;
            gv9Var2 = gv9Var;
            l(gv9Var2, null, yqo.H(-166878148, av8Var, new cv5(z2, 5)), av8Var, ((i4 >> 9) & 14) | 384);
            av8Var.s(true);
        } else {
            z2 = z;
            gv9Var2 = gv9Var;
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new ki4(i2, str, num, gv9Var2, z2, xtcVar, i3);
        }
    }

    public static final void p(int i2, long j2, of3 of3Var, xtc xtcVar, String str) {
        av8 av8Var;
        xtc xtcVar2;
        str.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1928318834);
        int i3 = i2 | (av8Var2.g(str) ? 4 : 2) | (av8Var2.f(j2) ? 32 : 16) | 384;
        if (av8Var2.T(i3 & 1, (i3 & 147) != 146)) {
            utc utcVar = utc.a;
            xtc p2 = bkh.p(utcVar, 50.0f);
            yf8 yf8Var = xth.a;
            av8Var = av8Var2;
            udj.c(str, p2, j2, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.g(), av8Var, (i3 & 14) | ((i3 << 3) & 896), 24960, 109560);
            xtcVar2 = utcVar;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new l67(str, j2, xtcVar2, i2, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void q(xtc xtcVar, String str, boolean z, boolean z2, Function0 function0, of3 of3Var, int i2, int i3) {
        int i4;
        boolean z3;
        int i5;
        av8 av8Var;
        boolean z4;
        boolean z5;
        eqf u2;
        str.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(881519447);
        if ((i2 & 6) == 0) {
            i4 = (av8Var2.g(xtcVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var2.g(str) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            z3 = z;
            i4 |= av8Var2.h(z3) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i4 |= av8Var2.h(z2) ? a.o : 1024;
                if ((i2 & 24576) == 0) {
                    i4 |= av8Var2.i(function0) ? 16384 : 8192;
                }
                if (av8Var2.T(i4 & 1, (i4 & 9363) != 9362)) {
                    boolean z6 = i6 != 0 ? true : z3;
                    boolean z7 = i5 != 0 ? false : z2;
                    n7g a2 = o7g.a(4.0f);
                    t3e t3eVar = new t3e(16.0f, 10.0f, 16.0f, 10.0f);
                    p72 p72Var = new p72(lz.D(R.color.primary_default, av8Var2), lz.D(R.color.surface_1, av8Var2), lz.D(R.color.primary_default, av8Var2), lz.D(R.color.surface_1, av8Var2));
                    boolean z8 = (57344 & i4) == 16384;
                    Object O = av8Var2.O();
                    if (z8 || O == nf3.a) {
                        O = new v61(3, function0);
                        av8Var2.n0(O);
                    }
                    av8Var = av8Var2;
                    iz8.e((Function0) O, xtcVar, z6, a2, p72Var, null, null, t3eVar, null, yqo.H(1414232423, av8Var2, new c82(str, z7)), av8Var, ((i4 << 3) & 112) | 805306368 | (i4 & 896), 352);
                    z5 = z7;
                    z4 = z6;
                } else {
                    av8Var = av8Var2;
                    av8Var.W();
                    z4 = z3;
                    z5 = z2;
                }
                u2 = av8Var.u();
                if (u2 != null) {
                    u2.d = new e82(xtcVar, str, z4, z5, function0, i2, i3, 0);
                    return;
                }
                return;
            }
            if ((i2 & 24576) == 0) {
            }
            if (av8Var2.T(i4 & 1, (i4 & 9363) != 9362)) {
            }
            u2 = av8Var.u();
            if (u2 != null) {
            }
        }
        z3 = z;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if (av8Var2.T(i4 & 1, (i4 & 9363) != 9362)) {
        }
        u2 = av8Var.u();
        if (u2 != null) {
        }
    }

    public static final void r(v23 v23Var, mmi mmiVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2004958920);
        if ((i2 & 6) == 0) {
            i3 = i2 | (av8Var.g(v23Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(mmiVar) ? 32 : 16;
        }
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            ehk ehkVar = mmiVar.a;
            d7e t2 = haa.t(ehkVar.c, 0, av8Var);
            utc utcVar = utc.a;
            wkn.k(t2, null, bkh.c(bkh.d(utcVar, 1.0f), 0.6f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 440, 120);
            nq8.h(av8Var, v23Var.a(32.0f, utcVar, true));
            String a2 = mmiVar.d.a(av8Var);
            yf8 yf8Var = xth.a;
            udj.c(a2, bkh.d(utcVar, 1.0f), lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.f(), av8Var, 48, 0, 130040);
            nq8.h(av8Var, v23Var.a(8.0f, utcVar, true));
            udj.c(oea.v(ehkVar.a, av8Var), bkh.d(utcVar, 1.0f), lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.h(), av8Var, 48, 0, 130040);
            nq8.h(av8Var, v23Var.a(24.0f, utcVar, true));
            udj.c(oea.v(ehkVar.b, av8Var), bkh.d(utcVar, 1.0f), lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.f(), av8Var, 48, 0, 130040);
            av8Var = av8Var;
            nq8.h(av8Var, v23Var.a(39.0f, utcVar, true));
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new nmi(v23Var, mmiVar, i2, 0);
        }
    }

    public static final void s(e9i e9iVar, mmi mmiVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2021880429);
        if ((i2 & 6) == 0) {
            i3 = i2 | (av8Var.g(e9iVar) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(mmiVar) ? 32 : 16;
        }
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            kv1 kv1Var = uxf.p;
            g28 g28Var = bkh.c;
            xtc d0 = l98.d0(g28Var, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a2 = t23.a(d, kv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
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
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            xtc d2 = bkh.d(ljg.g(av8Var, C, f50Var3, 1.0f, false), 1.0f);
            k1c c2 = e12.c(uxf.d, false);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            ehk ehkVar = mmiVar.a;
            wkn.k(haa.t(ehkVar.c, 0, av8Var), null, g28Var, null, mp3.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 25016, 104);
            utc utcVar = utc.a;
            bf3.t(av8Var, true, utcVar, 48.0f, av8Var);
            float a3 = e9iVar.a(0, 500);
            float f2 = (a3 * 0.1f) + 0.9f;
            String v2 = oea.v(ehkVar.a, av8Var);
            yf8 yf8Var = xth.a;
            dfj h2 = xth.h();
            long D = lz.D(R.color.on_color_primary, av8Var);
            xtc d3 = bkh.d(utcVar, 1.0f);
            boolean d4 = av8Var.d(a3) | av8Var.d(f2);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (d4 || O == a99Var) {
                O = new n28(16, a3, f2);
                av8Var.n0(O);
            }
            udj.c(v2, s02.M(d3, (Function1) O), D, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, h2, av8Var, 0, 0, 130040);
            nq8.h(av8Var, bkh.e(utcVar, 8.0f));
            float a4 = e9iVar.a(1000, 500);
            float f3 = (0.1f * a4) + 0.9f;
            String v3 = oea.v(ehkVar.b, av8Var);
            dfj f4 = xth.f();
            long D2 = lz.D(R.color.on_color_primary, av8Var);
            xtc d5 = bkh.d(utcVar, 1.0f);
            boolean d6 = av8Var.d(a4) | av8Var.d(f3);
            Object O2 = av8Var.O();
            if (d6 || O2 == a99Var) {
                O2 = new n28(17, a4, f3);
                av8Var.n0(O2);
            }
            udj.c(v3, s02.M(d5, (Function1) O2), D2, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, f4, av8Var, 0, 0, 130040);
            av8Var = av8Var;
            w1l.s(utcVar, 66.0f, av8Var, true);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new p8b(e9iVar, mmiVar, i2, 29);
        }
    }

    public static f8h t(List list, Function1 function1, Function2 function2) {
        Object next;
        list.getClass();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                Comparable comparable = (Comparable) function1.invoke(next);
                do {
                    Object next2 = it.next();
                    Comparable comparable2 = (Comparable) function1.invoke(next2);
                    if (comparable.compareTo(comparable2) < 0) {
                        next = next2;
                        comparable = comparable2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        if (next == null) {
            ogj.m("Unable to build char tree from an empty list");
            return null;
        }
        ((Number) function1.invoke(next)).intValue();
        if (!list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (((Number) function1.invoke(it2.next())).intValue() == 0) {
                    a70.p("There should be no empty entries");
                    return null;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        u(arrayList, list, 0, function1, function2);
        arrayList.trimToSize();
        new sh0((char) 0, km5.a, arrayList);
        return new f8h(16);
    }

    public static void u(ArrayList arrayList, List list, int i2, Function1 function1, Function2 function2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Character ch = (Character) function2.invoke(obj, Integer.valueOf(i2));
            ch.getClass();
            Object obj2 = linkedHashMap.get(ch);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(ch, obj2);
            }
            ((List) obj2).add(obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            char charValue = ((Character) entry.getKey()).charValue();
            List list2 = (List) entry.getValue();
            int i3 = i2 + 1;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list2) {
                if (((Number) function1.invoke(obj3)).intValue() > i3) {
                    arrayList3.add(obj3);
                }
            }
            u(arrayList2, arrayList3, i3, function1, function2);
            arrayList2.trimToSize();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : list2) {
                if (((Number) function1.invoke(obj4)).intValue() == i3) {
                    arrayList4.add(obj4);
                }
            }
            arrayList.add(new sh0(charValue, arrayList4, arrayList2));
        }
    }

    public static final void v(long j2, long j3, long j4) {
        if (j3 < 0 || j4 > j2) {
            StringBuilder o2 = ljg.o("startIndex (", j3, ") and endIndex (");
            o2.append(j4);
            zzl.r(fn0.l(j2, ") are not within the range [0..size(", "))", o2));
        } else {
            if (j3 <= j4) {
                return;
            }
            a70.p(fn0.n(ljg.o("startIndex (", j3, ") > endIndex ("), j4, ')'));
        }
    }

    public static final void w(long j2, long j3) {
        if (0 > j2 || j2 < j3 || j3 < 0) {
            a70.p(lnb.l(j2, "))", ljg.o("offset (0) and byteCount (", j3, ") are not within the range [0..size(")));
        }
    }

    public static final void x(ha5 ha5Var, n29 n29Var) {
        n29Var.c(ha5Var.L0().t(), (n29) ha5Var.L0().b);
    }

    public static md4 y(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream;
        int i2;
        boolean z;
        bArr.getClass();
        if (bArr.length > 10240) {
            a70.r("Data cannot occupy more than 10240 bytes when serialized");
            return null;
        }
        if (bArr.length == 0) {
            return md4.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            byte[] bArr2 = new byte[2];
            byteArrayInputStream.read(bArr2);
            i2 = 0;
            z = bArr2[0] == -84 && bArr2[1] == -19;
            byteArrayInputStream.reset();
        } catch (IOException unused) {
            int i3 = gg4.a;
            rik.o().getClass();
        } catch (ClassNotFoundException unused2) {
            int i4 = gg4.a;
            rik.o().getClass();
        }
        if (z) {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int readInt = objectInputStream.readInt();
                while (i2 < readInt) {
                    linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                    i2++;
                }
                objectInputStream.close();
                return new md4(linkedHashMap);
            } finally {
            }
        } else {
            DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
            try {
                short readShort = dataInputStream.readShort();
                if (readShort == -21521) {
                    short readShort2 = dataInputStream.readShort();
                    if (readShort2 != 1) {
                        hc5.f(ljg.j(readShort2, "Unsupported version number: "));
                    }
                } else {
                    hc5.f(ljg.j(readShort, "Magic number doesn't match: "));
                }
                int readInt2 = dataInputStream.readInt();
                while (i2 < readInt2) {
                    linkedHashMap.put(dataInputStream.readUTF(), z(dataInputStream, dataInputStream.readByte()));
                    i2++;
                }
                dataInputStream.close();
                return new md4(linkedHashMap);
            } finally {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Serializable, java.lang.Double[]] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.Float[]] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.Long[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, java.lang.Integer[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, java.lang.Byte[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Boolean[]] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Serializable, java.lang.String[]] */
    public static final Serializable z(DataInputStream dataInputStream, byte b2) {
        if (b2 == 0) {
            return null;
        }
        if (b2 == 1) {
            return Boolean.valueOf(dataInputStream.readBoolean());
        }
        if (b2 == 2) {
            return Byte.valueOf(dataInputStream.readByte());
        }
        if (b2 == 3) {
            return Integer.valueOf(dataInputStream.readInt());
        }
        if (b2 == 4) {
            return Long.valueOf(dataInputStream.readLong());
        }
        if (b2 == 5) {
            return Float.valueOf(dataInputStream.readFloat());
        }
        if (b2 == 6) {
            return Double.valueOf(dataInputStream.readDouble());
        }
        if (b2 == 7) {
            return dataInputStream.readUTF();
        }
        int i2 = 0;
        if (b2 == 8) {
            int readInt = dataInputStream.readInt();
            ?? r0 = new Boolean[readInt];
            while (i2 < readInt) {
                r0[i2] = Boolean.valueOf(dataInputStream.readBoolean());
                i2++;
            }
            return r0;
        }
        if (b2 == 9) {
            int readInt2 = dataInputStream.readInt();
            ?? r02 = new Byte[readInt2];
            while (i2 < readInt2) {
                r02[i2] = Byte.valueOf(dataInputStream.readByte());
                i2++;
            }
            return r02;
        }
        if (b2 == 10) {
            int readInt3 = dataInputStream.readInt();
            ?? r03 = new Integer[readInt3];
            while (i2 < readInt3) {
                r03[i2] = Integer.valueOf(dataInputStream.readInt());
                i2++;
            }
            return r03;
        }
        if (b2 == 11) {
            int readInt4 = dataInputStream.readInt();
            ?? r04 = new Long[readInt4];
            while (i2 < readInt4) {
                r04[i2] = Long.valueOf(dataInputStream.readLong());
                i2++;
            }
            return r04;
        }
        if (b2 == 12) {
            int readInt5 = dataInputStream.readInt();
            ?? r05 = new Float[readInt5];
            while (i2 < readInt5) {
                r05[i2] = Float.valueOf(dataInputStream.readFloat());
                i2++;
            }
            return r05;
        }
        if (b2 == 13) {
            int readInt6 = dataInputStream.readInt();
            ?? r06 = new Double[readInt6];
            while (i2 < readInt6) {
                r06[i2] = Double.valueOf(dataInputStream.readDouble());
                i2++;
            }
            return r06;
        }
        if (b2 != 14) {
            a70.r(ljg.j(b2, "Unsupported type "));
            return null;
        }
        int readInt7 = dataInputStream.readInt();
        ?? r1 = new String[readInt7];
        while (i2 < readInt7) {
            String readUTF = dataInputStream.readUTF();
            if (Intrinsics.c(readUTF, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                readUTF = null;
            }
            r1[i2] = readUTF;
            i2++;
        }
        return r1;
    }
}
