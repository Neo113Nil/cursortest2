package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class km {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f3052 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f3053 = -1549132124806242019L;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f3054;

    public interface c {
        /* renamed from: ﾒ */
        void mo7417(Object obj, Method method, Object[] objArr);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static Object m8460(Class<?> cls, Object obj, c cVar) {
        int i = 2 % 2;
        try {
            Object newProxyInstance = Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls, hj.class}, new b(obj, cVar));
            int i2 = f3054 + 81;
            f3052 = i2 % 128;
            int i3 = i2 % 2;
            return newProxyInstance;
        } catch (Throwable th) {
            kl.m8458(m8461("⅍聀挬싨ꗘң\ue673䤽⠉诉", View.MeasureSpec.makeMeasureSpec(0, 0) + 41263).intern(), m8461("⅘貈窡⣇雳䒾㈞\ue022丅㱡\uea69妕ި\uf5d2ꏚᇄ？괥᭛쥁띕抋키뺳泇\udaf3蠟瘯\u242b鈖䁸⾍鶉䮲㦓\ue7ef唄̊\uf114彃൫\uf896ꚞᒨ식냅ỳ찕먾桙홏葷玐↪迂緎", View.MeasureSpec.getSize(0) + 44519).intern(), th, true);
            try {
                return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls, hj.class}, new b(obj, cVar));
            } catch (Throwable th2) {
                kl.m8458(m8461("⅍聀挬싨ꗘң\ue673䤽⠉诉", TextUtils.getCapsMode("", 0, 0) + 41263).intern(), m8461("⅘㓴ਖ਼憣眃䴺ꃖ뙎跥\ue30d率쳑∸㦶༂敘磟丹ꖃ믥酅\ue4cf館톟⟧㵟თ昫綛厲ꥀ벱鈉\ue98eﾫ핋⢴㸎ᑜ毬䅄咽ꨀ聘韖\ued43삣혍Ɀ", (KeyEvent.getMaxKeyCode() >> 16) + 5531).intern(), th2, true);
                return obj;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if ((r3 instanceof com.ironsource.adqualitysdk.sdk.i.hj) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0015, code lost:
    
        if (r3 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (java.lang.reflect.Proxy.isProxyClass(r3.getClass()) == false) goto L14;
     */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m8462(Object obj) {
        int i = 2 % 2;
        int i2 = f3054 + 47;
        f3052 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 44 / 0;
        }
        int i4 = f3054 + 109;
        f3052 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    static class b implements InvocationHandler {

        /* renamed from: ﮐ, reason: contains not printable characters */
        private static int f3055 = 1;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private static char f3056 = 19331;

        /* renamed from: ﻏ, reason: contains not printable characters */
        private static int f3057 = 0;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static char f3058 = 3344;

        /* renamed from: ｋ, reason: contains not printable characters */
        private static char f3059 = 60067;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static char f3060 = 59789;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private Object f3061;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private c f3062;

        b(Object obj, c cVar) {
            this.f3061 = obj;
            this.f3062 = cVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            int i = 2 % 2;
            int i2 = f3055 + 91;
            f3057 = i2 % 128;
            int i3 = i2 % 2;
            Object obj2 = null;
            if (m8465(method)) {
                try {
                    return m8466(method);
                } catch (Throwable th) {
                    kl.m8458(m8467("馎蟷İ\u200d䭒団㨢敽\uf5a7ᚌ", 11 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern(), new StringBuilder().append(m8467("ﯧ\udf56츤琉迵땨畢毮\uab1c㗘뤘㿥㹕퇢츞\uf0a3\udb64렻蝝穣템▷齪Ƶဲ\ud9b8궗ങ慕\ue166", TextUtils.getOffsetBefore("", 0) + 30).intern()).append(method.getName()).toString(), th, true);
                    return null;
                }
            }
            try {
                this.f3062.mo7417(obj, method, objArr);
            } catch (Throwable th2) {
                String intern = m8467("馎蟷İ\u200d䭒団㨢敽\uf5a7ᚌ", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10).intern();
                StringBuilder append = new StringBuilder().append(m8467("ﯧ\udf56츤琉迵땨畢毮\uab1c㗘뤘㿥\uf640唕ꛁ豼沁蟧\ue5ba埥㹼쮷ಧ\ue707", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 22).intern());
                Object obj3 = this.f3061;
                kl.m8458(intern, append.append(obj3 != null ? obj3.toString() : m8467("纂彴\ue1b0ꁯ", '4' - AndroidCharacter.getMirror('0')).intern()).append(m8467("齪Ƶဲ\ud9b8궗ങ黋\ue45a", TextUtils.lastIndexOf("", '0', 0) + 9).intern()).append(method.getName()).toString(), th2, true);
                int i4 = f3057 + 75;
                f3055 = i4 % 128;
                int i5 = i4 % 2;
            }
            Object obj4 = this.f3061;
            if (obj4 != null) {
                return method.invoke(obj4, objArr);
            }
            if (!Object.class.equals(method.getDeclaringClass())) {
                return null;
            }
            int i6 = f3055 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            f3057 = i6 % 128;
            if (i6 % 2 != 0) {
                method.invoke(this, m8463(objArr));
                super.hashCode();
                throw null;
            }
            Object invoke = method.invoke(this, m8463(objArr));
            int i7 = f3055 + 69;
            f3057 = i7 % 128;
            if (i7 % 2 == 0) {
                return invoke;
            }
            throw null;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static Object[] m8463(Object[] objArr) {
            int i = 2 % 2;
            int i2 = f3055 + 21;
            f3057 = i2 % 128;
            int i3 = i2 % 2;
            if (objArr != null) {
                try {
                    ArrayList arrayList = new ArrayList();
                    int i4 = f3055 + 75;
                    f3057 = i4 % 128;
                    int i5 = i4 % 2;
                    for (Object obj : objArr) {
                        int i6 = f3057 + 37;
                        f3055 = i6 % 128;
                        int i7 = i6 % 2;
                        if (Proxy.isProxyClass(obj.getClass())) {
                            arrayList.add(Proxy.getInvocationHandler(obj));
                            int i8 = f3055 + 95;
                            f3057 = i8 % 128;
                            int i9 = i8 % 2;
                        } else {
                            arrayList.add(obj);
                        }
                    }
                    return arrayList.toArray();
                } catch (Throwable th) {
                    kl.m8458(m8467("馎蟷İ\u200d䭒団㨢敽\uf5a7ᚌ", View.getDefaultSize(0, 0) + 10).intern(), m8467("ﯧ\udf56츤琉迵땨꓄⋤ㆣۿ畢毮룎誛畢毮\uab1c㗘勢뿐㨢敽礅䒻㹕퇢⚛藁秠Ɇ", (ViewConfiguration.getFadingEdgeLength() >> 16) + 29).intern(), th, true);
                }
            }
            return objArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0061 A[RETURN] */
        /* renamed from: ｋ, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static boolean m8465(Method method) {
            char c;
            int i = 2 % 2;
            int i2 = f3055 + 79;
            f3057 = i2 % 128;
            int i3 = i2 % 2;
            String name = method.getName();
            if (name.hashCode() == 1622498214) {
                if ((name.equals(m8467("꓄⋤\ue0cb쨡䲽생ఊ䢹椮鶵鳵핻싟쭒\ue1b0ꁯ䮙麃\uda33⽰", 20 - (Process.myTid() >> 22)).intern()) ? '\r' : '0') != '0') {
                    int i4 = f3057 + 79;
                    f3055 = i4 % 128;
                    c = (i4 % 2 == 0 ? ')' : '@') != ')' ? (char) 0 : (char) 1;
                    if (c != 0) {
                        return true;
                    }
                    int i5 = f3057 + 115;
                    f3055 = i5 % 128;
                    int i6 = i5 % 2;
                    return false;
                }
            }
            c = 65535;
            if (c != 0) {
            }
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private Object m8466(Method method) {
            int i = 2 % 2;
            int i2 = f3055;
            int i3 = i2 + 99;
            f3057 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            if (method != null) {
                int i4 = i2 + 57;
                f3057 = i4 % 128;
                int i5 = i4 % 2;
                String name = method.getName();
                if (name.hashCode() == 1622498214 && name.equals(m8467("꓄⋤\ue0cb쨡䲽생ఊ䢹椮鶵鳵핻싟쭒\ue1b0ꁯ䮙麃\uda33⽰", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 20).intern())) {
                    return m8464();
                }
            }
            int i6 = f3057 + 49;
            f3055 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 86 / 0;
            }
            return null;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private Object m8464() {
            int i = 2 % 2;
            int i2 = f3055;
            int i3 = i2 + 39;
            f3057 = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                super.hashCode();
                throw null;
            }
            Object obj2 = this.f3061;
            int i4 = i2 + 17;
            f3057 = i4 % 128;
            int i5 = i4 % 2;
            return obj2;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static String m8467(String str, int i) {
            String str2;
            char[] cArr = str;
            if (str != null) {
                cArr = str.toCharArray();
            }
            char[] cArr2 = cArr;
            synchronized (o.f3094) {
                char[] cArr3 = new char[cArr2.length];
                o.f3095 = 0;
                char[] cArr4 = new char[2];
                while (o.f3095 < cArr2.length) {
                    cArr4[0] = cArr2[o.f3095];
                    cArr4[1] = cArr2[o.f3095 + 1];
                    int i2 = 58224;
                    for (int i3 = 0; i3 < 16; i3++) {
                        char c = cArr4[1];
                        char c2 = cArr4[0];
                        char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f3060)) ^ ((c2 >>> 5) + f3056)));
                        cArr4[1] = c3;
                        cArr4[0] = (char) (c2 - (((c3 >>> 5) + f3058) ^ ((c3 + i2) ^ ((c3 << 4) + f3059))));
                        i2 -= 40503;
                    }
                    cArr3[o.f3095] = cArr4[0];
                    cArr3[o.f3095 + 1] = cArr4[1];
                    o.f3095 += 2;
                }
                str2 = new String(cArr3, 0, i);
            }
            return str2;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m8461(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (i.f2454) {
            i.f2455 = i;
            char[] cArr3 = new char[cArr2.length];
            i.f2453 = 0;
            while (i.f2453 < cArr2.length) {
                cArr3[i.f2453] = (char) ((cArr2[i.f2453] ^ (i.f2453 * i.f2455)) ^ f3053);
                i.f2453++;
            }
            str2 = new String(cArr3);
        }
        return str2;
    }
}
