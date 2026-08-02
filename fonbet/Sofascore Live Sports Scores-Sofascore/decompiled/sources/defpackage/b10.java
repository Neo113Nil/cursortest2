package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.Xml;
import android.view.MotionEvent;
import androidx.media3.common.b;
import com.facebook.login.i;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.internal.ads.zzafr;
import com.google.android.gms.internal.ads.zzafs;
import com.google.android.gms.internal.ads.zzagi;
import com.google.android.gms.internal.ads.zzarx;
import com.google.android.gms.internal.ads.zzaz;
import com.google.android.gms.internal.ads.zzba;
import com.google.android.gms.internal.ads.zzeb;
import com.google.android.gms.internal.ads.zzeu;
import com.google.android.gms.internal.ads.zzfj;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.cast.zzj;
import com.google.android.gms.internal.cast.zzqq;
import com.google.android.gms.internal.cast.zzqr;
import com.google.android.gms.internal.common.zzg;
import com.google.android.gms.tasks.OnSuccessListener;
import com.ironsource.U3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.i0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.IOException;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class b10 implements fw1, h, zzafs, OnSuccessListener, zzeb {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;

    public b10(Context context) {
        String str;
        String str2;
        this.a = 12;
        this.d = new WeakReference(context);
        Context context2 = hkg.a;
        synchronized (hkg.class) {
            Object obj = hkg.b;
            str = null;
            if (obj != null) {
                try {
                    str2 = (String) obj.getClass().getDeclaredMethod("getAdvertisingID", Context.class).invoke(hkg.b, context);
                } catch (Exception e) {
                    e = e;
                }
                try {
                    if (!"00000000-0000-0000-0000-000000000000".equalsIgnoreCase(str2)) {
                        str = str2;
                    }
                } catch (Exception e2) {
                    e = e2;
                    str = str2;
                    fjg c = fjg.c();
                    e.toString();
                    c.f(1);
                    this.c = str;
                    if (str != null) {
                    }
                    this.b = 1;
                }
            }
        }
        this.c = str;
        if (str != null || str.length() <= 0) {
            this.b = 1;
        } else {
            this.b = 2;
        }
    }

    public static b10 H(String str) {
        return new b10(str, Boolean.FALSE, 1, 25);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01df, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01d7, code lost:
    
        if (r10.size() <= 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01d9, code lost:
    
        r0 = new defpackage.bg2(r10, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01e0, code lost:
    
        if (r0 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01f2, code lost:
    
        if (r7 == 1) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01f5, code lost:
    
        if (r7 == 2) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01f7, code lost:
    
        r1 = r0.a;
        r0 = r0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01fd, code lost:
    
        if (r13 == 1) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ff, code lost:
    
        if (r13 == 2) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0201, code lost:
    
        r2 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0216, code lost:
    
        r12 = new android.graphics.LinearGradient(r21, r24, r25, r16, r1, r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0259, code lost:
    
        return new defpackage.b10(r12, (java.lang.Object) null, 0, 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0210, code lost:
    
        r2 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0213, code lost:
    
        r2 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x021a, code lost:
    
        r12 = new android.graphics.SweepGradient(r9, r12, r0.a, r0.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0229, code lost:
    
        if (r23 <= com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x022b, code lost:
    
        r1 = r0.a;
        r0 = r0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0233, code lost:
    
        if (r13 == 1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0235, code lost:
    
        if (r13 == 2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0237, code lost:
    
        r2 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x024c, code lost:
    
        r12 = new android.graphics.RadialGradient(r9, r12, r23, r1, r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0246, code lost:
    
        r2 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0249, code lost:
    
        r2 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x025a, code lost:
    
        defpackage.pvd.r("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0260, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e4, code lost:
    
        if (r19 == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e6, code lost:
    
        r0 = new defpackage.bg2(r6, r11, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ec, code lost:
    
        r0 = new defpackage.bg2(r6, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b10 g(Resources resources, int i, Resources.Theme theme) {
        int next;
        float f;
        int i2;
        float f2;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        Object obj = null;
        if (next != 2) {
            pvd.r("No start tag found");
            return null;
        }
        String name = xml.getName();
        name.getClass();
        int i3 = 3;
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList b = m23.b(resources, xml, asAttributeSet, theme);
                return new b10(obj, b, b.getDefaultColor(), i3);
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray D = r4a.D(resources, theme, asAttributeSet, xjf.e);
        float f3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? D.getFloat(8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : 0.0f;
        float f4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? D.getFloat(9, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : 0.0f;
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? D.getFloat(10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? D.getFloat(11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? D.getFloat(3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : 0.0f;
        float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? D.getFloat(4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : 0.0f;
        int i4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? D.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? D.getColor(0, 0) : 0;
        boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? D.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? D.getColor(1, 0) : 0;
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null) {
            f = f3;
            i2 = D.getInt(6, 0);
        } else {
            f = f3;
            i2 = 0;
        }
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? D.getFloat(5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        D.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f10 = f9;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            float f11 = f4;
            if (next2 == 1) {
                f2 = f5;
                break;
            }
            int depth2 = xml.getDepth();
            f2 = f5;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray D2 = r4a.D(resources, theme, asAttributeSet, xjf.f);
                boolean hasValue = D2.hasValue(0);
                boolean hasValue2 = D2.hasValue(1);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color4 = D2.getColor(0, 0);
                float f12 = D2.getFloat(1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                D2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f12));
            }
            f4 = f11;
            f5 = f2;
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
    }

    public static b10 z(String str) {
        int i;
        String str2;
        boolean startsWith = str.startsWith("HTTP/1.");
        rff rffVar = rff.HTTP_1_0;
        if (startsWith) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                rffVar = rff.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int parseInt = Integer.parseInt(str.substring(i, i2));
            if (str.length() <= i2) {
                str2 = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                str2 = str.substring(i + 4);
            }
            return new b10((Object) rffVar, str2, parseInt, 17);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public void A(Object obj, Object obj2) {
        int i = (this.b + 1) * 2;
        Object[] objArr = (Object[]) this.c;
        if (i > objArr.length) {
            this.c = Arrays.copyOf(objArr, vu9.b(objArr.length, i));
        }
        yqo.v(obj, obj2);
        Object[] objArr2 = (Object[]) this.c;
        int i2 = this.b;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.b = i2 + 1;
    }

    public void B(Set set) {
        if (set instanceof Collection) {
            int size = (set.size() + this.b) * 2;
            Object[] objArr = (Object[]) this.c;
            if (size > objArr.length) {
                this.c = Arrays.copyOf(objArr, vu9.b(objArr.length, size));
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            A(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object C(IndexedValue indexedValue, sq3 sq3Var) {
        l78 l78Var;
        int i;
        j2d j2dVar;
        try {
            if (sq3Var instanceof l78) {
                l78Var = (l78) sq3Var;
                int i2 = l78Var.v;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    l78Var.v = i2 - Integer.MIN_VALUE;
                    Object obj = l78Var.t;
                    lu3 lu3Var = lu3.a;
                    i = l78Var.v;
                    if (i != 0) {
                        y6a.M(obj);
                        j2dVar = (j2d) this.d;
                        l78Var.r = indexedValue;
                        l78Var.s = j2dVar;
                        l78Var.v = 1;
                        if (j2dVar.e(l78Var) == lu3Var) {
                            return lu3Var;
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j2d j2dVar2 = l78Var.s;
                        IndexedValue indexedValue2 = l78Var.r;
                        y6a.M(obj);
                        j2dVar = j2dVar2;
                        indexedValue = indexedValue2;
                    }
                    this.b = indexedValue.a;
                    ((m78) this.c).a((e4e) indexedValue.b);
                    Unit unit = Unit.a;
                    j2dVar.f(null);
                    return Unit.a;
                }
            }
            this.b = indexedValue.a;
            ((m78) this.c).a((e4e) indexedValue.b);
            Unit unit2 = Unit.a;
            j2dVar.f(null);
            return Unit.a;
        } catch (Throwable th) {
            j2dVar.f(null);
            throw th;
        }
        l78Var = new l78(this, sq3Var);
        Object obj2 = l78Var.t;
        lu3 lu3Var2 = lu3.a;
        i = l78Var.v;
        if (i != 0) {
        }
    }

    public void D(int i, boolean z) {
        int i2 = i & 33554431;
        long[] jArr = (long[]) this.c;
        int i3 = this.b;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            int i5 = i4 + 2;
            long j = jArr[i5];
            if ((((int) j) & 33554431) == i2) {
                long j2 = 8070450532247928831L & j;
                long j3 = z ? 1L : 0L;
                jArr[i5] = j2 | (1152921504606846976L * j3) | (j3 * Long.MIN_VALUE);
                return;
            }
        }
    }

    public void E(int i, int i2, long j) {
        int i3;
        char c;
        char c2;
        long[] jArr = (long[]) this.c;
        long[] jArr2 = (long[]) this.d;
        jArr2[0] = j;
        int i4 = 1;
        while (i4 > 0) {
            i4--;
            long j2 = jArr2[i4];
            int i5 = 33554431;
            int i6 = ((int) j2) & 33554431;
            char c3 = 25;
            int i7 = ((int) (j2 >> 25)) & 33554431;
            char c4 = '2';
            int i8 = ((int) (j2 >> 50)) & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE;
            int i9 = i8 == 1023 ? this.b : (i8 * 3) + i7;
            if (i7 < 0) {
                return;
            }
            while (i7 < jArr.length - 2 && i7 < i9) {
                int i10 = i7 + 2;
                long j3 = jArr[i10];
                if ((((int) (j3 >> c3)) & i5) == i6) {
                    long j4 = jArr[i7];
                    int i11 = i7 + 1;
                    i3 = i5;
                    c = c3;
                    long j5 = jArr[i11];
                    c2 = c4;
                    jArr[i7] = ((((int) j4) + i2) & 4294967295L) | ((((int) (j4 >> 32)) + i) << 32);
                    jArr[i11] = ((((int) j5) + i2) & 4294967295L) | ((((int) (j5 >> 32)) + i) << 32);
                    jArr[i10] = (((j3 >> 63) & 1) << 60) | j3;
                    if ((((int) (j3 >> c2)) & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) > 0) {
                        jArr2[i4] = (pqf.b & j3) | (((i7 + 3) & i3) << c);
                        i4++;
                    }
                } else {
                    i3 = i5;
                    c = c3;
                    c2 = c4;
                }
                i7 += 3;
                i5 = i3;
                c3 = c;
                c4 = c2;
            }
        }
    }

    public void F(int i, long j, long j2) {
        m6c m6cVar = new m6c(1, i, null, 3, null, nik.h0(j), nik.h0(j2));
        scc sccVar = (scc) this.c;
        sccVar.getClass();
        h(new li3(9, this, sccVar, m6cVar));
    }

    public void G(int i, et8 et8Var) {
        int i2 = i & 33554431;
        long[] jArr = (long[]) this.c;
        int i3 = this.b;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            if ((((int) jArr[i4 + 2]) & 33554431) == i2) {
                long j = jArr[i4];
                long j2 = jArr[i4 + 1];
                et8Var.invoke(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
                return;
            }
        }
    }

    public void I(String str, LifecycleCallback lifecycleCallback) {
        Map map = (Map) this.c;
        if (map.containsKey(str)) {
            a70.p(wt3.m("LifecycleCallback with tag ", str, new StringBuilder(str.length() + 59), " already added to this fragment."));
            return;
        }
        map.put(str, lifecycleCallback);
        if (this.b > 0) {
            new zzg(Looper.getMainLooper()).post(new lv4(16, this, lifecycleCallback, str));
        }
    }

    public Object J() {
        Object obj = this.d;
        swo swoVar = (swo) lxo.a.get();
        if (swoVar == null) {
            if (lxo.b.get() == null) {
                return obj;
            }
            pvd.j();
            return null;
        }
        SharedPreferences sharedPreferences = swoVar.a;
        int i = this.b - 1;
        String str = (String) this.c;
        if (i != 0) {
            try {
                return Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue()));
            } catch (ClassCastException unused) {
                return Long.valueOf(sharedPreferences.getInt(str, (int) r2));
            }
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        try {
            return Boolean.valueOf(sharedPreferences.getBoolean(str, booleanValue));
        } catch (ClassCastException unused2) {
            return Boolean.valueOf(sharedPreferences.getString(str, String.valueOf(booleanValue)));
        }
    }

    public void K(Bundle bundle) {
        this.b = 1;
        this.d = bundle;
        for (Map.Entry entry : ((Map) this.c).entrySet()) {
            ((LifecycleCallback) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public void L(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : ((Map) this.c).entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // defpackage.fw1
    public dw1 a(nl6 nl6Var, long j) {
        long j2;
        long position = nl6Var.getPosition();
        int min = (int) Math.min(112800L, nl6Var.getLength() - position);
        j9e j9eVar = (j9e) this.d;
        j9eVar.K(min);
        nl6Var.peekFully(j9eVar.a, 0, min);
        int i = j9eVar.c;
        long j3 = -1;
        long j4 = -1;
        long j5 = C.TIME_UNSET;
        while (true) {
            if (j9eVar.a() < 188) {
                j2 = C.TIME_UNSET;
                break;
            }
            byte[] bArr = j9eVar.a;
            int i2 = j9eVar.b;
            while (true) {
                if (i2 >= i) {
                    j2 = C.TIME_UNSET;
                    break;
                }
                byte b = bArr[i2];
                j2 = C.TIME_UNSET;
                if (b == 71) {
                    break;
                }
                i2++;
            }
            int i3 = i2 + 188;
            if (i3 > i) {
                break;
            }
            long u = rha.u(j9eVar, i2, this.b);
            if (u != j2) {
                long b2 = ((djj) this.c).b(u);
                if (b2 > j) {
                    return j5 == j2 ? new dw1(-1, 1, b2, position) : new dw1(0, 1, C.TIME_UNSET, position + j4);
                }
                if (100000 + b2 > j) {
                    return new dw1(0, 1, C.TIME_UNSET, position + i2);
                }
                j5 = b2;
                j4 = i2;
            }
            j9eVar.N(i3);
            j3 = i3;
        }
        return j5 != j2 ? new dw1(-2, 1, j5, position + j3) : dw1.f;
    }

    public void b(int i, iqa iqaVar) {
        if (i < 0) {
            u3a.a("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        h9a h9aVar = new h9a(this.b, i, iqaVar);
        this.b += i;
        ((i1d) this.c).b(h9aVar);
    }

    public awf c(boolean z) {
        jv9 jv9Var;
        jv9 jv9Var2;
        if (z && (jv9Var2 = (jv9) this.d) != null) {
            throw jv9Var2.a();
        }
        awf j = awf.j(this.b, (Object[]) this.c, this);
        if (!z || (jv9Var = (jv9) this.d) == null) {
            return j;
        }
        throw jv9Var.a();
    }

    @Override // com.google.android.gms.internal.ads.zzafs
    public zzafr d(zzagi zzagiVar, long j) {
        long j2;
        long zzn = zzagiVar.zzn();
        int min = (int) Math.min(112800L, zzagiVar.zzo() - zzn);
        zzeu zzeuVar = (zzeu) this.d;
        zzeuVar.y(min);
        zzagiVar.h(0, min, zzeuVar.a);
        int i = zzeuVar.c;
        long j3 = -1;
        long j4 = -1;
        long j5 = C.TIME_UNSET;
        while (true) {
            if (zzeuVar.B() < 188) {
                j2 = C.TIME_UNSET;
                break;
            }
            byte[] bArr = zzeuVar.a;
            int i2 = zzeuVar.b;
            while (true) {
                if (i2 >= i) {
                    j2 = C.TIME_UNSET;
                    break;
                }
                byte b = bArr[i2];
                j2 = C.TIME_UNSET;
                if (b == 71) {
                    break;
                }
                i2++;
            }
            int i3 = i2 + 188;
            if (i3 > i) {
                break;
            }
            long a = zzarx.a(zzeuVar, i2, this.b);
            if (a != j2) {
                long c = ((zzfj) this.c).c(a);
                if (c > j) {
                    return j5 == j2 ? new zzafr(-1, c, zzn) : new zzafr(0, C.TIME_UNSET, zzn + j4);
                }
                j5 = c;
                long j6 = i2;
                if (100000 + j5 > j) {
                    return new zzafr(0, C.TIME_UNSET, zzn + j6);
                }
                j4 = j6;
            }
            zzeuVar.D(i3);
            j3 = i3;
        }
        return j5 != j2 ? new zzafr(-2, j5, zzn + j3) : zzafr.d;
    }

    @Override // defpackage.fw1
    public void e() {
        j9e j9eVar = (j9e) this.d;
        byte[] bArr = nik.b;
        j9eVar.L(bArr, bArr.length);
    }

    public boolean f() {
        Context context = (Context) ((WeakReference) this.d).get();
        en0 n = n();
        if (n != null && n.b) {
            try {
                return n.g(context);
            } catch (cjg e) {
                fjg c = fjg.c();
                e.getMessage();
                c.f(3);
            }
        }
        ekg p = this.p();
        if (p == null) {
            return a5f.d(context).getInt("IABTCF_gdprApplies", -1) != 1;
        }
        try {
            return p.a(context);
        } catch (cjg unused) {
            return false;
        }
    }

    public void h(wn3 wn3Var) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            cdc cdcVar = (cdc) it.next();
            nik.X(cdcVar.a, new yq5(29, wn3Var, cdcVar.b));
        }
    }

    public void i(int i, b bVar, int i2, Object obj, long j) {
        h(new ow9(3, this, new m6c(1, i, bVar, i2, obj, nik.h0(j), C.TIME_UNSET)));
    }

    public h9a j(int i) {
        if (i < 0 || i >= this.b) {
            StringBuilder t = lnb.t(i, "Index ", ", size ");
            t.append(this.b);
            u3a.e(t.toString());
        }
        h9a h9aVar = (h9a) this.d;
        if (h9aVar != null) {
            int i2 = h9aVar.a;
            if (i < h9aVar.b + i2 && i2 <= i) {
                return h9aVar;
            }
        }
        i1d i1dVar = (i1d) this.c;
        h9a h9aVar2 = (h9a) i1dVar.a[i9a.q(i, i1dVar)];
        this.d = h9aVar2;
        return h9aVar2;
    }

    public Object k(int i) {
        switch (this.a) {
            case 14:
                SparseArray sparseArray = (SparseArray) this.c;
                if (this.b == -1) {
                    this.b = 0;
                }
                while (true) {
                    int i2 = this.b;
                    if (i2 > 0 && i < sparseArray.keyAt(i2)) {
                        this.b--;
                    }
                }
                while (this.b < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.b + 1)) {
                    this.b++;
                }
                return sparseArray.valueAt(this.b);
            default:
                SparseArray sparseArray2 = (SparseArray) this.c;
                if (this.b == -1) {
                    this.b = 0;
                }
                while (true) {
                    int i3 = this.b;
                    if (i3 > 0 && i < sparseArray2.keyAt(i3)) {
                        this.b--;
                    }
                }
                while (this.b < sparseArray2.size() - 1 && i >= sparseArray2.keyAt(this.b + 1)) {
                    this.b++;
                }
                return sparseArray2.valueAt(this.b);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g
    public ddi l() {
        throw null;
    }

    public pp4 m() {
        boolean z;
        int i;
        Context context = (Context) ((WeakReference) this.d).get();
        pp4 pp4Var = null;
        if (context != null) {
            byte b = 0;
            String string = context.getSharedPreferences(a5f.e(context), 0).getString("IABUSPrivacy_String", null);
            if (string != null) {
                pp4Var = new pp4(b, 7);
                pp4Var.b = true;
                pp4Var.c = 2;
                if (string.matches("\\d[YN-]{3}")) {
                    z = true;
                } else {
                    pp4Var.b = false;
                    z = false;
                }
                pp4Var.d = string;
                if (z) {
                    try {
                        i = Integer.parseInt("" + string.toCharArray()[0]);
                    } catch (NumberFormatException unused) {
                        i = -1;
                    }
                    int i2 = i != 1 ? 2 : 1;
                    pp4Var.c = i2;
                    if (i2 == 2) {
                        pp4Var.b = false;
                    }
                }
            }
        }
        return pp4Var;
    }

    public en0 n() {
        int i;
        Context context = (Context) ((WeakReference) this.d).get();
        if (context == null) {
            return null;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(a5f.e(context), 0);
        try {
            i = Integer.valueOf(sharedPreferences.getString("IABGPP_HDR_Version", null)).intValue();
        } catch (Exception unused) {
            try {
                i = sharedPreferences.getInt("IABGPP_HDR_Version", -1);
            } catch (Exception unused2) {
                i = -1;
            }
        }
        String string = sharedPreferences.getString("IABGPP_HDR_GppString", null);
        String string2 = sharedPreferences.getString("IABGPP_GppSID", null);
        if (string == null || string2 == null) {
            return null;
        }
        return new en0(string, string2, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0069 A[Catch: all -> 0x007e, TryCatch #0 {all -> 0x007e, blocks: (B:11:0x0043, B:12:0x0063, B:14:0x0069, B:16:0x0071, B:18:0x0080, B:19:0x0083), top: B:10:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable o(sq3 sq3Var) {
        k78 k78Var;
        int i;
        j2d j2dVar;
        try {
            if (sq3Var instanceof k78) {
                k78Var = (k78) sq3Var;
                int i2 = k78Var.u;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    k78Var.u = i2 - Integer.MIN_VALUE;
                    Object obj = k78Var.s;
                    lu3 lu3Var = lu3.a;
                    i = k78Var.u;
                    if (i != 0) {
                        y6a.M(obj);
                        j2d j2dVar2 = (j2d) this.d;
                        k78Var.r = j2dVar2;
                        k78Var.u = 1;
                        if (j2dVar2.e(k78Var) == lu3Var) {
                            return lu3Var;
                        }
                        j2dVar = j2dVar2;
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j2dVar = k78Var.r;
                        y6a.M(obj);
                    }
                    List b = ((m78) this.c).b();
                    int size = (this.b - b.size()) + 1;
                    ArrayList arrayList = new ArrayList(k13.r(b, 10));
                    int i3 = 0;
                    for (Object obj2 : b) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            kotlin.collections.b.q();
                            throw null;
                        }
                        arrayList.add(new IndexedValue(i3 + size, (e4e) obj2));
                        i3 = i4;
                    }
                    j2dVar.f(null);
                    return arrayList;
                }
            }
            List b2 = ((m78) this.c).b();
            int size2 = (this.b - b2.size()) + 1;
            ArrayList arrayList2 = new ArrayList(k13.r(b2, 10));
            int i32 = 0;
            while (r8.hasNext()) {
            }
            j2dVar.f(null);
            return arrayList2;
        } catch (Throwable th) {
            j2dVar.f(null);
            throw th;
        }
        k78Var = new k78(this, sq3Var);
        Object obj3 = k78Var.s;
        lu3 lu3Var2 = lu3.a;
        i = k78Var.u;
        if (i != 0) {
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        zzj zzjVar = (zzj) this.c;
        zzqr zzqrVar = (zzqr) this.d;
        int i = this.b;
        if (((Boolean) obj).booleanValue()) {
            zzqq p = zzqr.p(zzqrVar);
            String str = zzjVar.e;
            p.b();
            ((zzqr) p.b).s(str);
            p.b();
            ((zzqr) p.b).v(str);
            Long l = zzjVar.f;
            if (l != null) {
                int longValue = (int) l.longValue();
                p.b();
                ((zzqr) p.b).w(longValue);
            }
            zzqr zzqrVar2 = (zzqr) p.c();
            int i2 = zzjVar.j;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            int i4 = i - 1;
            i7f i7fVar = i7f.b;
            cu0 cu0Var = i3 != 0 ? i3 != 1 ? new cu0(Integer.valueOf(i4), zzqrVar2, i7fVar, null) : new cu0(Integer.valueOf(i4), zzqrVar2, i7f.a, null) : new cu0(Integer.valueOf(i4), zzqrVar2, i7fVar, null);
            zzj.k.a("analytics event: %s", cu0Var);
            p03 p03Var = zzjVar.h;
            if (p03Var != null) {
                p03Var.x(cu0Var, new ogj(15));
            }
        }
    }

    public ekg p() {
        Context context = (Context) ((WeakReference) this.d).get();
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(a5f.e(context), 0);
            String string = sharedPreferences.getString(AndroidTcfDataSource.TCF_TCSTRING_KEY, null);
            if (string == null) {
                string = sharedPreferences.getString("IABConsent_ConsentString", null);
            }
            if (string != null) {
                return new ekg(string, false);
            }
        }
        return null;
    }

    public void q(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, int i7) {
        long[] jArr = (long[]) this.c;
        int i8 = this.b;
        int i9 = i8 + 3;
        this.b = i9;
        int length = jArr.length;
        if (length <= i9) {
            int max = Math.max(length * 2, i9);
            this.c = Arrays.copyOf(jArr, max);
            this.d = Arrays.copyOf((long[]) this.d, max);
        }
        long[] jArr2 = (long[]) this.c;
        jArr2[i8] = (i2 << 32) | (i3 & 4294967295L);
        jArr2[i8 + 1] = (i4 << 32) | (i5 & 4294967295L);
        int i10 = i6 & 33554431;
        jArr2[i8 + 2] = ((z3 ? 1L : 0L) << 63) | ((z2 ? 1L : 0L) << 62) | ((z ? 1L : 0L) << 61) | 1152921504606846976L | (Math.min(0, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) << 50) | (i10 << 25) | (i & 33554431);
        if (i6 < 0) {
            return;
        }
        for (int i11 = i7 != -1 ? i7 : i8 - 3; i11 >= 0; i11 -= 3) {
            int i12 = i11 + 2;
            long j = jArr2[i12];
            if ((((int) j) & 33554431) == i10) {
                jArr2[i12] = (Math.min((i8 - i11) / 3, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) << 50) | (j & pqf.a);
                return;
            }
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h
    public void reset() {
        i iVar = (i) this.c;
        int i = this.b;
        fdi fdiVar = (fdi) iVar.c;
        jof a = i0.a(i, (ad2) iVar.b, null);
        fdiVar.getClass();
        fdiVar.m(null, a);
    }

    public boolean s() {
        ColorStateList colorStateList;
        return ((Shader) this.c) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful();
    }

    public boolean t() {
        Context context = (Context) ((WeakReference) this.d).get();
        boolean z = false;
        if (context == null) {
            return false;
        }
        Context context2 = hkg.a;
        synchronized (hkg.class) {
            Object obj = hkg.b;
            if (obj != null) {
                try {
                    z = ((Boolean) obj.getClass().getDeclaredMethod(U3.j.M, Context.class).invoke(hkg.b, context)).booleanValue();
                } catch (Exception e) {
                    fjg c = fjg.c();
                    e.toString();
                    c.f(1);
                }
            }
        }
        return z;
    }

    public String toString() {
        switch (this.a) {
            case 6:
                StringBuilder sb = new StringBuilder((String) this.c);
                sb.append("://");
                int i = -1;
                if (((String) this.d).indexOf(58) != -1) {
                    sb.append('[');
                    sb.append((String) this.d);
                    sb.append(']');
                } else {
                    sb.append((String) this.d);
                }
                int i2 = this.b;
                if (i2 == -1) {
                    String str = (String) this.c;
                    i2 = str.equals("http") ? 80 : str.equals(HttpRequest.DEFAULT_SCHEME) ? 443 : -1;
                }
                String str2 = (String) this.c;
                if (str2.equals("http")) {
                    i = 80;
                } else if (str2.equals(HttpRequest.DEFAULT_SCHEME)) {
                    i = 443;
                }
                if (i2 != i) {
                    sb.append(':');
                    sb.append(i2);
                }
                return sb.toString();
            case 16:
                StringBuilder sb2 = new StringBuilder();
                if (((qff) this.c) == qff.HTTP_1_0) {
                    sb2.append("HTTP/1.0");
                } else {
                    sb2.append("HTTP/1.1");
                }
                sb2.append(' ');
                sb2.append(this.b);
                sb2.append(' ');
                sb2.append((String) this.d);
                return sb2.toString();
            case 17:
                return (((rff) this.c) == rff.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1") + ' ' + this.b + ' ' + ((String) this.d);
            default:
                return super.toString();
        }
    }

    public void u(lfb lfbVar, int i, int i2, b bVar, int i3, Object obj, long j, long j2) {
        h(new zcc(this, lfbVar, new m6c(i, i2, bVar, i3, obj, nik.h0(j), nik.h0(j2)), 1));
    }

    public void v(lfb lfbVar, int i, int i2, b bVar, int i3, Object obj, long j, long j2) {
        h(new zcc(this, lfbVar, new m6c(i, i2, bVar, i3, obj, nik.h0(j), nik.h0(j2)), 0));
    }

    public void w(lfb lfbVar, int i, int i2, b bVar, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        h(new adc(this, lfbVar, new m6c(i, i2, bVar, i3, obj, nik.h0(j), nik.h0(j2)), iOException, z));
    }

    public void x(lfb lfbVar, int i, IOException iOException, boolean z) {
        w(lfbVar, i, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET, iOException, z);
    }

    public void y(lfb lfbVar, int i, int i2, b bVar, int i3, Object obj, long j, long j2, int i4) {
        h(new ycc(this, lfbVar, new m6c(i, i2, bVar, i3, obj, nik.h0(j), nik.h0(j2)), i4));
    }

    @Override // com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public /* synthetic */ void mo13zza(Object obj) {
        int i = cwo.Z;
        ((zzaz) obj).c(this.b, (zzba) this.c, (zzba) this.d);
    }

    @Override // com.google.android.gms.internal.ads.zzafs
    public void zzb() {
        byte[] bArr = zzfm.b;
        int length = bArr.length;
        ((zzeu) this.d).z(0, bArr);
    }

    public /* synthetic */ b10(int i, zzba zzbaVar, zzba zzbaVar2) {
        this.a = 24;
        this.b = i;
        this.c = zzbaVar;
        this.d = zzbaVar2;
    }

    public /* synthetic */ b10(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    public /* synthetic */ b10(Object obj, String str, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = str;
    }

    public b10(int i, zzfj zzfjVar) {
        this.a = 21;
        this.b = i;
        this.c = zzfjVar;
        this.d = new zzeu();
    }

    public b10(int i, ad2 ad2Var) {
        Object dVar;
        this.a = 20;
        this.b = i;
        i iVar = new i(i, ad2Var);
        this.c = iVar;
        n nVar = new n((jof) iVar.d, 2);
        uci uciVar = new uci(0L, Long.MAX_VALUE);
        if (i == 0) {
            dVar = c.a;
        } else {
            dVar = new d(i);
        }
        this.d = un0.K(nVar, ad2Var, uciVar, dVar);
    }

    public b10(ArrayList arrayList, int i, MotionEvent motionEvent) {
        this.a = 0;
        this.c = arrayList;
        this.b = i;
        this.d = motionEvent;
        if (arrayList.isEmpty()) {
            a70.p("changes cannot be empty");
            throw null;
        }
    }

    public b10(byte b, int i) {
        this.a = i;
        switch (i) {
            case 5:
                this.c = new m78();
                this.d = new j2d();
                this.b = -1;
                break;
            case 10:
                this.c = new i1d(new h9a[16], 0);
                break;
            case 22:
                this.c = Collections.synchronizedMap(new dh0(0));
                this.b = 0;
                break;
            default:
                Object[] objArr = new Object[5];
                this.c = objArr;
                this.d = objArr;
                break;
        }
    }

    public /* synthetic */ b10(char c, int i) {
        this.a = i;
    }

    public b10(ilg ilgVar) {
        this.a = 14;
        this.c = new SparseArray();
        this.d = ilgVar;
        this.b = -1;
    }

    public b10(ilg ilgVar, byte b) {
        this.a = 15;
        this.c = new SparseArray();
        this.d = ilgVar;
        this.b = -1;
    }

    public b10(int i, djj djjVar) {
        this.a = 18;
        this.b = i;
        this.c = djjVar;
        this.d = new j9e();
    }

    public b10(CopyOnWriteArrayList copyOnWriteArrayList, int i, scc sccVar) {
        this.a = 9;
        this.d = copyOnWriteArrayList;
        this.b = i;
        this.c = sccVar;
    }

    public b10(hsk hskVar) {
        this.a = 2;
        this.c = hskVar;
    }

    public b10(int i) {
        this.a = 7;
        this.c = new Object[i * 2];
        this.b = 0;
    }

    public b10(ggf ggfVar) {
        this.a = 4;
        this.d = m6k.d0(150, new t9d(this));
        this.c = ggfVar;
    }
}
