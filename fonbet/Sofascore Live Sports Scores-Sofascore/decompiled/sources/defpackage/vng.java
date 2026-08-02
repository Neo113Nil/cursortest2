package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgChannel;
import com.google.ads.interactivemedia.v3.impl.data.WebViewInitData;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzczr;
import com.google.android.gms.internal.ads.zzdbu;
import com.google.android.gms.internal.ads.zzdcw;
import com.google.android.gms.internal.ads.zzdcz;
import com.google.android.gms.internal.ads.zzdjp;
import com.google.android.gms.internal.ads.zzdod;
import com.google.android.gms.internal.ads.zzeay;
import com.google.android.gms.internal.ads.zzemf;
import com.google.android.gms.internal.ads.zzemh;
import com.google.android.gms.internal.ads.zzemi;
import com.google.android.gms.internal.ads.zzeml;
import com.google.android.gms.internal.ads.zzeqk;
import com.google.android.gms.internal.ads.zzesg;
import com.google.android.gms.internal.ads.zzfic;
import com.google.android.gms.internal.ads.zzfiy;
import com.google.android.gms.internal.ads.zzfnc;
import com.google.android.gms.internal.ads.zzfvk;
import com.google.android.gms.internal.ads.zzfvn;
import com.google.android.gms.internal.ads.zzfvo;
import com.google.android.gms.internal.ads.zzfvp;
import com.google.android.gms.internal.ads.zzfvq;
import com.google.android.gms.internal.ads.zzfvr;
import com.google.android.gms.internal.ads.zzfvz;
import com.google.android.gms.internal.ads.zzfwa;
import com.google.android.gms.internal.ads.zzioe;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSource;
import com.sofascore.model.Country;
import com.sofascore.model.TvType;
import com.sofascore.model.mvvm.model.TvChannelVote;
import com.sofascore.model.newNetwork.TvChannelVoteBody;
import com.sofascore.results.event.details.view.tv.model.TvChannelData;
import com.unity3d.services.UnityAdsConstants;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class vng implements ac3, zzdod, v4o, z7p {
    public static HashSet g;
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public vng(z3k z3kVar, SharedPreferences sharedPreferences) {
        Object obj;
        z3kVar.getClass();
        sharedPreferences.getClass();
        this.a = z3kVar;
        yzc yzcVar = new yzc();
        this.b = yzcVar;
        this.c = waa.w(yzcVar);
        List list = zu3.y0;
        this.d = (Country) CollectionsKt.Y(list);
        Country e = dv3.e();
        int intValue = ((Number) CollectionsKt.Y((e == null ? (Country) this.d : e).getMccList())).intValue();
        int i = sharedPreferences.getInt("tv_mcc_" + intValue, intValue);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Country) obj).getMccList().contains(Integer.valueOf(i))) {
                    break;
                }
            }
        }
        Country country = (Country) obj;
        country = country == null ? (Country) CollectionsKt.Y(list) : country;
        country.getClass();
        this.d = country;
    }

    public static void D(vlg vlgVar, String str) {
        umg z = vlgVar.a.z(str);
        if (z == null || !(z instanceof vlg) || z == vlgVar) {
            return;
        }
        vlg vlgVar2 = (vlg) z;
        if (vlgVar.i == null) {
            vlgVar.i = vlgVar2.i;
        }
        if (vlgVar.j == null) {
            vlgVar.j = vlgVar2.j;
        }
        if (vlgVar.k == 0) {
            vlgVar.k = vlgVar2.k;
        }
        if (vlgVar.h.isEmpty()) {
            vlgVar.h = vlgVar2.h;
        }
        try {
            if (vlgVar instanceof vmg) {
                vmg vmgVar = (vmg) vlgVar;
                vmg vmgVar2 = (vmg) z;
                if (vmgVar.m == null) {
                    vmgVar.m = vmgVar2.m;
                }
                if (vmgVar.n == null) {
                    vmgVar.n = vmgVar2.n;
                }
                if (vmgVar.o == null) {
                    vmgVar.o = vmgVar2.o;
                }
                if (vmgVar.p == null) {
                    vmgVar.p = vmgVar2.p;
                }
            } else {
                E((zmg) vlgVar, (zmg) z);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = vlgVar2.l;
        if (str2 != null) {
            D(vlgVar, str2);
        }
    }

    public static void E(zmg zmgVar, zmg zmgVar2) {
        if (zmgVar.m == null) {
            zmgVar.m = zmgVar2.m;
        }
        if (zmgVar.n == null) {
            zmgVar.n = zmgVar2.n;
        }
        if (zmgVar.o == null) {
            zmgVar.o = zmgVar2.o;
        }
        if (zmgVar.p == null) {
            zmgVar.p = zmgVar2.p;
        }
        if (zmgVar.q == null) {
            zmgVar.q = zmgVar2.q;
        }
    }

    public static void F(img imgVar, String str) {
        umg z = imgVar.a.z(str);
        if (z == null || !(z instanceof img) || z == imgVar) {
            return;
        }
        img imgVar2 = (img) z;
        if (imgVar.p == null) {
            imgVar.p = imgVar2.p;
        }
        if (imgVar.q == null) {
            imgVar.q = imgVar2.q;
        }
        if (imgVar.r == null) {
            imgVar.r = imgVar2.r;
        }
        if (imgVar.s == null) {
            imgVar.s = imgVar2.s;
        }
        if (imgVar.t == null) {
            imgVar.t = imgVar2.t;
        }
        if (imgVar.u == null) {
            imgVar.u = imgVar2.u;
        }
        if (imgVar.v == null) {
            imgVar.v = imgVar2.v;
        }
        if (imgVar.i.isEmpty()) {
            imgVar.i = imgVar2.i;
        }
        if (imgVar.o == null) {
            imgVar.o = imgVar2.o;
        }
        if (imgVar.n == null) {
            imgVar.n = imgVar2.n;
        }
        String str2 = imgVar2.w;
        if (str2 != null) {
            F(imgVar, str2);
        }
    }

    public static scc G(ale aleVar, hv9 hv9Var, scc sccVar, iij iijVar) {
        int i;
        mij currentTimeline = aleVar.getCurrentTimeline();
        int currentPeriodIndex = aleVar.getCurrentPeriodIndex();
        Object l = currentTimeline.p() ? null : currentTimeline.l(currentPeriodIndex);
        if (aleVar.isPlayingAd() || currentTimeline.p()) {
            i = -1;
        } else {
            iij f = currentTimeline.f(currentPeriodIndex, iijVar, false);
            i = f.g.c(nik.T(aleVar.getCurrentPosition()) - iijVar.e, f.d);
        }
        int i2 = i;
        for (int i3 = 0; i3 < hv9Var.size(); i3++) {
            scc sccVar2 = (scc) hv9Var.get(i3);
            if (O(sccVar2, l, aleVar.isPlayingAd(), aleVar.getCurrentAdGroupIndex(), aleVar.getCurrentAdIndexInAdGroup(), i2)) {
                return sccVar2;
            }
        }
        if (hv9Var.isEmpty() && sccVar != null && O(sccVar, l, aleVar.isPlayingAd(), aleVar.getCurrentAdGroupIndex(), aleVar.getCurrentAdIndexInAdGroup(), i2)) {
            return sccVar;
        }
        return null;
    }

    public static boolean O(scc sccVar, Object obj, boolean z, int i, int i2, int i3) {
        Object obj2 = sccVar.a;
        int i4 = sccVar.b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z && i4 == i && sccVar.c == i2) {
            return true;
        }
        return !z && i4 == -1 && sccVar.e == i3;
    }

    public static boolean P(omg omgVar, long j) {
        return (omgVar.a & j) != 0;
    }

    public static Path T(jmg jmgVar) {
        Path path = new Path();
        float[] fArr = jmgVar.o;
        path.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = jmgVar.o;
            if (i >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (jmgVar instanceof kmg) {
            path.close();
        }
        if (jmgVar.h == null) {
            jmgVar.h = q(path);
        }
        return path;
    }

    public static ao4 b0(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            String readUTF = dataInputStream.readUTF();
            int readInt2 = dataInputStream.readInt();
            if (readInt2 < 0) {
                is8.e(ljg.j(readInt2, "Invalid value size: "));
                return null;
            }
            int min = Math.min(readInt2, 10485760);
            byte[] bArr = nik.b;
            int i2 = 0;
            while (i2 != readInt2) {
                int i3 = i2 + min;
                bArr = Arrays.copyOf(bArr, i3);
                dataInputStream.readFully(bArr, i2, min);
                min = Math.min(readInt2 - i3, 10485760);
                i2 = i3;
            }
            hashMap.put(readUTF, bArr);
        }
        return new ao4(hashMap);
    }

    public static void k0(tng tngVar, boolean z, xmg xmgVar) {
        int i;
        omg omgVar = tngVar.a;
        float floatValue = (z ? omgVar.c : omgVar.e).floatValue();
        if (xmgVar instanceof rlg) {
            i = ((rlg) xmgVar).a;
        } else if (!(xmgVar instanceof slg)) {
            return;
        } else {
            i = tngVar.a.k.a;
        }
        int w = w(floatValue, i);
        if (z) {
            tngVar.d.setColor(w);
        } else {
            tngVar.e.setColor(w);
        }
    }

    public static void n(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, hmg hmgVar) {
        if (f == f6 && f2 == f7) {
            return;
        }
        if (f3 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f4 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            hmgVar.g(f6, f7);
            return;
        }
        float abs = Math.abs(f3);
        float abs2 = Math.abs(f4);
        double radians = Math.toRadians(f5 % 360.0d);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d = (f - f6) / 2.0d;
        double d2 = (f2 - f7) / 2.0d;
        double d3 = (sin * d2) + (cos * d);
        double d4 = (cos * d2) + ((-sin) * d);
        double d5 = abs * abs;
        double d6 = abs2 * abs2;
        double d7 = d3 * d3;
        double d8 = d4 * d4;
        double d9 = (d8 / d6) + (d7 / d5);
        if (d9 > 0.99999d) {
            double sqrt = Math.sqrt(d9) * 1.00001d;
            abs = (float) (abs * sqrt);
            abs2 = (float) (sqrt * abs2);
            d5 = abs * abs;
            d6 = abs2 * abs2;
        }
        double d10 = z == z2 ? -1.0d : 1.0d;
        double d11 = d5 * d6;
        double d12 = d5 * d8;
        double d13 = d6 * d7;
        double d14 = ((d11 - d12) - d13) / (d12 + d13);
        if (d14 < 0.0d) {
            d14 = 0.0d;
        }
        double sqrt2 = Math.sqrt(d14) * d10;
        double d15 = abs;
        double d16 = abs2;
        double d17 = ((d15 * d4) / d16) * sqrt2;
        double d18 = sqrt2 * (-((d16 * d3) / d15));
        double d19 = ((cos * d17) - (sin * d18)) + ((f + f6) / 2.0d);
        double d20 = (cos * d18) + (sin * d17) + ((f2 + f7) / 2.0d);
        double d21 = (d3 - d17) / d15;
        double d22 = (d4 - d18) / d16;
        double d23 = ((-d3) - d17) / d15;
        double d24 = ((-d4) - d18) / d16;
        double d25 = (d22 * d22) + (d21 * d21);
        double acos = Math.acos(d21 / Math.sqrt(d25)) * (d22 < 0.0d ? -1.0d : 1.0d);
        double sqrt3 = ((d22 * d24) + (d21 * d23)) / Math.sqrt(((d24 * d24) + (d23 * d23)) * d25);
        double acos2 = ((d21 * d24) - (d22 * d23) < 0.0d ? -1.0d : 1.0d) * (sqrt3 < -1.0d ? 3.141592653589793d : sqrt3 > 1.0d ? 0.0d : Math.acos(sqrt3));
        if (!z2 && acos2 > 0.0d) {
            acos2 -= 6.283185307179586d;
        } else if (z2 && acos2 < 0.0d) {
            acos2 += 6.283185307179586d;
        }
        double d26 = acos2 % 6.283185307179586d;
        double d27 = acos % 6.283185307179586d;
        int ceil = (int) Math.ceil((Math.abs(d26) * 2.0d) / 3.141592653589793d);
        double d28 = d26 / ceil;
        double d29 = d28 / 2.0d;
        double sin2 = (Math.sin(d29) * 1.3333333333333333d) / (Math.cos(d29) + 1.0d);
        int i = ceil * 6;
        float[] fArr = new float[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 < ceil) {
            double d30 = d27;
            double d31 = (i2 * d28) + d30;
            double cos2 = Math.cos(d31);
            double sin3 = Math.sin(d31);
            int i4 = i2;
            int i5 = i3;
            fArr[i5] = (float) (cos2 - (sin2 * sin3));
            fArr[i3 + 1] = (float) ((cos2 * sin2) + sin3);
            double d32 = d31 + d28;
            double cos3 = Math.cos(d32);
            double sin4 = Math.sin(d32);
            fArr[i5 + 2] = (float) ((sin2 * sin4) + cos3);
            fArr[i5 + 3] = (float) (sin4 - (sin2 * cos3));
            fArr[i5 + 4] = (float) cos3;
            i3 = i5 + 6;
            fArr[i5 + 5] = (float) sin4;
            i2 = i4 + 1;
            d27 = d30;
            ceil = ceil;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(abs, abs2);
        matrix.postRotate(f5);
        matrix.postTranslate((float) d19, (float) d20);
        matrix.mapPoints(fArr);
        fArr[i - 2] = f6;
        fArr[i - 1] = f7;
        for (int i6 = 0; i6 < i; i6 += 6) {
            hmgVar.d(fArr[i6], fArr[i6 + 1], fArr[i6 + 2], fArr[i6 + 3], fArr[i6 + 4], fArr[i6 + 5]);
        }
    }

    public static w0d q(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new w0d(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if (r7 != 9) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Matrix s(w0d w0dVar, w0d w0dVar2, f6f f6fVar) {
        e6f e6fVar;
        float f;
        float f2;
        Matrix matrix = new Matrix();
        if (f6fVar != null && (e6fVar = f6fVar.a) != null) {
            float f3 = w0dVar.d / w0dVar2.d;
            float f4 = w0dVar.e / w0dVar2.e;
            float f5 = -w0dVar2.b;
            float f6 = -w0dVar2.c;
            if (f6fVar.equals(f6f.c)) {
                matrix.preTranslate(w0dVar.b, w0dVar.c);
                matrix.preScale(f3, f4);
                matrix.preTranslate(f5, f6);
                return matrix;
            }
            float max = f6fVar.b == 2 ? Math.max(f3, f4) : Math.min(f3, f4);
            float f7 = w0dVar.d / max;
            float f8 = w0dVar.e / max;
            int ordinal = e6fVar.ordinal();
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 5) {
                        if (ordinal != 6) {
                            if (ordinal != 8) {
                            }
                        }
                    }
                }
                f = w0dVar2.d - f7;
                f5 -= f;
                switch (e6fVar.ordinal()) {
                    case 4:
                    case 5:
                    case 6:
                        f2 = (w0dVar2.e - f8) / 2.0f;
                        break;
                    case 7:
                    case 8:
                    case 9:
                        f2 = w0dVar2.e - f8;
                        break;
                }
                f6 -= f2;
                matrix.preTranslate(w0dVar.b, w0dVar.c);
                matrix.preScale(max, max);
                matrix.preTranslate(f5, f6);
            }
            f = (w0dVar2.d - f7) / 2.0f;
            f5 -= f;
            switch (e6fVar.ordinal()) {
            }
            f6 -= f2;
            matrix.preTranslate(w0dVar.b, w0dVar.c);
            matrix.preScale(max, max);
            matrix.preTranslate(f5, f6);
        }
        return matrix;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005b, code lost:
    
        if (r6.equals(com.mbridge.msdk.playercommon.exoplayer2.C.SANS_SERIF_NAME) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface v(int i, String str, Integer num) {
        char c = 0;
        boolean z = i == 2;
        int i2 = num.intValue() > 500 ? z ? 3 : 1 : z ? 2 : 0;
        str.getClass();
        switch (str.hashCode()) {
            case -1536685117:
                break;
            case -1431958525:
                if (str.equals("monospace")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1081737434:
                if (str.equals("fantasy")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 109326717:
                if (str.equals(C.SERIF_NAME)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1126973893:
                if (str.equals("cursive")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return Typeface.create(Typeface.SANS_SERIF, i2);
            case 1:
                return Typeface.create(Typeface.MONOSPACE, i2);
            case 2:
                return Typeface.create(Typeface.SANS_SERIF, i2);
            case 3:
                return Typeface.create(Typeface.SERIF, i2);
            case 4:
                return Typeface.create(Typeface.SANS_SERIF, i2);
            default:
                return null;
        }
    }

    public static void v0(ao4 ao4Var, DataOutputStream dataOutputStream) {
        Set<Map.Entry> entrySet = ao4Var.b.entrySet();
        dataOutputStream.writeInt(entrySet.size());
        for (Map.Entry entry : entrySet) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    public static int w(float f, int i) {
        int i2 = 255;
        int round = Math.round(((i >> 24) & 255) * f);
        if (round < 0) {
            i2 = 0;
        } else if (round <= 255) {
            i2 = round;
        }
        return (i2 << 24) | (i & 16777215);
    }

    public void A(Path path) {
        tng tngVar = (tng) this.c;
        int i = tngVar.a.L;
        Canvas canvas = (Canvas) this.a;
        if (i != 2) {
            canvas.drawPath(path, tngVar.e);
            return;
        }
        Matrix matrix = canvas.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        canvas.setMatrix(new Matrix());
        Shader shader = ((tng) this.c).e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        canvas.drawPath(path2, ((tng) this.c).e);
        canvas.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    public void B(hng hngVar, d2a d2aVar) {
        float f;
        float f2;
        float f3;
        int K;
        umg z;
        if (y()) {
            Iterator it = hngVar.i.iterator();
            boolean z2 = true;
            while (it.hasNext()) {
                wmg wmgVar = (wmg) it.next();
                if (wmgVar instanceof kng) {
                    d2aVar.B(o0(((kng) wmgVar).c, z2, !it.hasNext()));
                } else if (d2aVar.t((hng) wmgVar)) {
                    boolean z3 = wmgVar instanceof ing;
                    float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    if (z3) {
                        m0();
                        ing ingVar = (ing) wmgVar;
                        s0((tng) this.c, ingVar);
                        if (y() && u0() && (z = ingVar.a.z(ingVar.n)) != null) {
                            gmg gmgVar = (gmg) z;
                            Path path = (Path) new png(gmgVar.o).c;
                            Matrix matrix = gmgVar.n;
                            if (matrix != null) {
                                path.transform(matrix);
                            }
                            PathMeasure pathMeasure = new PathMeasure(path, false);
                            amg amgVar = ingVar.o;
                            if (amgVar != null) {
                                f4 = amgVar.c(this, pathMeasure.getLength());
                            }
                            int K2 = K();
                            if (K2 != 1) {
                                float r = r(ingVar);
                                if (K2 == 2) {
                                    r /= 2.0f;
                                }
                                f4 -= r;
                            }
                            u(ingVar.p);
                            boolean a0 = a0();
                            B(ingVar, new qng(this, path, f4));
                            if (a0) {
                                Y(ingVar.h);
                            }
                        }
                        l0();
                    } else if (wmgVar instanceof eng) {
                        m0();
                        eng engVar = (eng) wmgVar;
                        s0((tng) this.c, engVar);
                        if (y()) {
                            ArrayList arrayList = engVar.n;
                            boolean z4 = arrayList != null && arrayList.size() > 0;
                            boolean z5 = d2aVar instanceof rng;
                            if (z5) {
                                float d = !z4 ? ((rng) d2aVar).f : ((amg) engVar.n.get(0)).d(this);
                                ArrayList arrayList2 = engVar.o;
                                f2 = (arrayList2 == null || arrayList2.size() == 0) ? ((rng) d2aVar).g : ((amg) engVar.o.get(0)).e(this);
                                ArrayList arrayList3 = engVar.p;
                                f3 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((amg) engVar.p.get(0)).d(this);
                                ArrayList arrayList4 = engVar.q;
                                if (arrayList4 != null && arrayList4.size() != 0) {
                                    f4 = ((amg) engVar.q.get(0)).e(this);
                                }
                                float f5 = d;
                                f = f4;
                                f4 = f5;
                            } else {
                                f = 0.0f;
                                f2 = 0.0f;
                                f3 = 0.0f;
                            }
                            if (z4 && (K = K()) != 1) {
                                float r2 = r(engVar);
                                if (K == 2) {
                                    r2 /= 2.0f;
                                }
                                f4 -= r2;
                            }
                            u(engVar.r);
                            if (z5) {
                                rng rngVar = (rng) d2aVar;
                                rngVar.f = f4 + f3;
                                rngVar.g = f2 + f;
                            }
                            boolean a02 = a0();
                            B(engVar, d2aVar);
                            if (a02) {
                                Y(engVar.h);
                            }
                        }
                        l0();
                    } else if (wmgVar instanceof dng) {
                        m0();
                        dng dngVar = (dng) wmgVar;
                        s0((tng) this.c, dngVar);
                        if (y()) {
                            u(dngVar.o);
                            umg z6 = wmgVar.a.z(dngVar.n);
                            if (z6 != null && (z6 instanceof hng)) {
                                StringBuilder sb = new StringBuilder();
                                C((hng) z6, sb);
                                if (sb.length() > 0) {
                                    d2aVar.B(sb.toString());
                                }
                            }
                        }
                        l0();
                    }
                }
                z2 = false;
            }
        }
    }

    public void C(hng hngVar, StringBuilder sb) {
        Iterator it = hngVar.i.iterator();
        boolean z = true;
        while (it.hasNext()) {
            wmg wmgVar = (wmg) it.next();
            if (wmgVar instanceof hng) {
                C((hng) wmgVar, sb);
            } else if (wmgVar instanceof kng) {
                sb.append(o0(((kng) wmgVar).c, z, !it.hasNext()));
            }
            z = false;
        }
    }

    public tng H(wmg wmgVar) {
        tng tngVar = new tng();
        r0(tngVar, omg.a());
        I(wmgVar, tngVar);
        return tngVar;
    }

    public void I(wmg wmgVar, tng tngVar) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (wmgVar instanceof umg) {
                arrayList.add(0, (umg) wmgVar);
            }
            Object obj = wmgVar.b;
            if (obj == null) {
                break;
            } else {
                wmgVar = (wmg) obj;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            s0(tngVar, (umg) it.next());
        }
        tng tngVar2 = (tng) this.c;
        tngVar.g = tngVar2.g;
        tngVar.f = tngVar2.f;
    }

    public lf2 J(String str) {
        return (lf2) ((HashMap) this.a).get(str);
    }

    public int K() {
        int i;
        omg omgVar = ((tng) this.c).a;
        return (omgVar.I == 1 || (i = omgVar.J) == 2) ? omgVar.J : i == 1 ? 3 : 1;
    }

    public Object L(int i, Country country, TvType tvType, hoi hoiVar) {
        Object r = s9a.r(new jr5(this, country, tvType, i, (rq3) null), hoiVar);
        return r == lu3.a ? r : Unit.a;
    }

    public lf2 M(String str) {
        HashMap hashMap = (HashMap) this.a;
        lf2 lf2Var = (lf2) hashMap.get(str);
        if (lf2Var != null) {
            return lf2Var;
        }
        SparseArray sparseArray = (SparseArray) this.b;
        int size = sparseArray.size();
        int i = 0;
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            keyAt = i;
        }
        lf2 lf2Var2 = new lf2(keyAt, str, ao4.c);
        hashMap.put(str, lf2Var2);
        sparseArray.put(keyAt, str);
        ((SparseBooleanArray) this.d).put(keyAt, true);
        ((mf2) this.e).f(lf2Var2);
        return lf2Var2;
    }

    public void N(long j) {
        mf2 mf2Var;
        SparseArray sparseArray = (SparseArray) this.b;
        HashMap hashMap = (HashMap) this.a;
        mf2 mf2Var2 = (mf2) this.e;
        mf2Var2.j(j);
        mf2 mf2Var3 = (mf2) this.f;
        if (mf2Var3 != null) {
            mf2Var3.j(j);
        }
        if (mf2Var2.h() || (mf2Var = (mf2) this.f) == null || !mf2Var.h()) {
            mf2Var2.r(hashMap, sparseArray);
        } else {
            ((mf2) this.f).r(hashMap, sparseArray);
            mf2Var2.p(hashMap);
        }
        mf2 mf2Var4 = (mf2) this.f;
        if (mf2Var4 != null) {
            mf2Var4.s();
            this.f = null;
        }
    }

    public xk0 Q() {
        gie gieVar = gie.a;
        Object obj = gie.a;
        dq3 dq3Var = obj != null ? (dq3) obj : null;
        Context a = dq3Var != null ? dq3Var.a() : null;
        AssetManager assets = a != null ? a.getAssets() : null;
        if (assets != null) {
            InputStream open = assets.open((String) this.f);
            open.getClass();
            return f6a.I(open);
        }
        if (Build.FINGERPRINT == null) {
            is8.e("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
            return null;
        }
        is8.e("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
        return null;
    }

    public Path R(plg plgVar) {
        amg amgVar = plgVar.o;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float d = amgVar != null ? amgVar.d(this) : 0.0f;
        amg amgVar2 = plgVar.p;
        if (amgVar2 != null) {
            f = amgVar2.e(this);
        }
        float f2 = f;
        float b = plgVar.q.b(this);
        float f3 = d - b;
        float f4 = f2 - b;
        float f5 = d + b;
        float f6 = f2 + b;
        if (plgVar.h == null) {
            float f7 = 2.0f * b;
            plgVar.h = new w0d(f3, f4, f7, f7);
        }
        float f8 = b * 0.5522848f;
        Path path = new Path();
        path.moveTo(d, f4);
        float f9 = d + f8;
        float f10 = f2 - f8;
        path.cubicTo(f9, f4, f5, f10, f5, f2);
        float f11 = f2 + f8;
        path.cubicTo(f5, f11, f9, f6, d, f6);
        float f12 = d - f8;
        path.cubicTo(f12, f6, f3, f11, f3, f2);
        path.cubicTo(f3, f10, f12, f4, d, f4);
        path.close();
        return path;
    }

    public Path S(ulg ulgVar) {
        amg amgVar = ulgVar.o;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float d = amgVar != null ? amgVar.d(this) : 0.0f;
        amg amgVar2 = ulgVar.p;
        if (amgVar2 != null) {
            f = amgVar2.e(this);
        }
        float f2 = f;
        float d2 = ulgVar.q.d(this);
        float e = ulgVar.r.e(this);
        float f3 = d - d2;
        float f4 = f2 - e;
        float f5 = d + d2;
        float f6 = f2 + e;
        if (ulgVar.h == null) {
            ulgVar.h = new w0d(f3, f4, d2 * 2.0f, 2.0f * e);
        }
        float f7 = d2 * 0.5522848f;
        float f8 = e * 0.5522848f;
        Path path = new Path();
        path.moveTo(d, f4);
        float f9 = d + f7;
        float f10 = f2 - f8;
        path.cubicTo(f9, f4, f5, f10, f5, f2);
        float f11 = f2 + f8;
        path.cubicTo(f5, f11, f9, f6, d, f6);
        float f12 = d - f7;
        path.cubicTo(f12, f6, f3, f11, f3, f2);
        path.cubicTo(f3, f10, f12, f4, d, f4);
        path.close();
        return path;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Path U(lmg lmgVar) {
        float d;
        float e;
        float min;
        float d2;
        float e2;
        float f;
        float f2;
        Path path;
        amg amgVar = lmgVar.s;
        if (amgVar == null && lmgVar.t == null) {
            d = 0.0f;
        } else {
            amg amgVar2 = lmgVar.t;
            if (amgVar == null) {
                d = amgVar2.e(this);
            } else {
                if (amgVar2 != null) {
                    d = amgVar.d(this);
                    e = lmgVar.t.e(this);
                    min = Math.min(d, lmgVar.q.d(this) / 2.0f);
                    float min2 = Math.min(e, lmgVar.r.e(this) / 2.0f);
                    amg amgVar3 = lmgVar.o;
                    d2 = amgVar3 == null ? amgVar3.d(this) : 0.0f;
                    amg amgVar4 = lmgVar.p;
                    e2 = amgVar4 == null ? amgVar4.e(this) : 0.0f;
                    float d3 = lmgVar.q.d(this);
                    float e3 = lmgVar.r.e(this);
                    if (lmgVar.h == null) {
                        lmgVar.h = new w0d(d2, e2, d3, e3);
                    }
                    f = d3 + d2;
                    f2 = e2 + e3;
                    path = new Path();
                    if (min != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || min2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        path.moveTo(d2, e2);
                        path.lineTo(f, e2);
                        path.lineTo(f, f2);
                        path.lineTo(d2, f2);
                        path.lineTo(d2, e2);
                    } else {
                        float f3 = min * 0.5522848f;
                        float f4 = 0.5522848f * min2;
                        float f5 = e2 + min2;
                        path.moveTo(d2, f5);
                        float f6 = f5 - f4;
                        float f7 = d2 + min;
                        float f8 = f7 - f3;
                        path.cubicTo(d2, f6, f8, e2, f7, e2);
                        float f9 = f - min;
                        path.lineTo(f9, e2);
                        float f10 = f9 + f3;
                        path.cubicTo(f10, e2, f, f6, f, f5);
                        float f11 = f2 - min2;
                        path.lineTo(f, f11);
                        float f12 = f11 + f4;
                        path.cubicTo(f, f12, f10, f2, f9, f2);
                        path.lineTo(f7, f2);
                        float f13 = d2;
                        path.cubicTo(f8, f2, f13, f12, d2, f11);
                        path.lineTo(f13, f5);
                    }
                    path.close();
                    return path;
                }
                d = amgVar.d(this);
            }
        }
        e = d;
        min = Math.min(d, lmgVar.q.d(this) / 2.0f);
        float min22 = Math.min(e, lmgVar.r.e(this) / 2.0f);
        amg amgVar32 = lmgVar.o;
        if (amgVar32 == null) {
        }
        amg amgVar42 = lmgVar.p;
        if (amgVar42 == null) {
        }
        float d32 = lmgVar.q.d(this);
        float e32 = lmgVar.r.e(this);
        if (lmgVar.h == null) {
        }
        f = d32 + d2;
        f2 = e2 + e32;
        path = new Path();
        if (min != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
        }
        path.moveTo(d2, e2);
        path.lineTo(f, e2);
        path.lineTo(f, f2);
        path.lineTo(d2, f2);
        path.lineTo(d2, e2);
        path.close();
        return path;
    }

    public w0d V(amg amgVar, amg amgVar2, amg amgVar3, amg amgVar4) {
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float d = amgVar != null ? amgVar.d(this) : 0.0f;
        if (amgVar2 != null) {
            f = amgVar2.e(this);
        }
        tng tngVar = (tng) this.c;
        w0d w0dVar = tngVar.g;
        if (w0dVar == null) {
            w0dVar = tngVar.f;
        }
        return new w0d(d, f, amgVar3 != null ? amgVar3.d(this) : w0dVar.d, amgVar4 != null ? amgVar4.e(this) : w0dVar.e);
    }

    public void W(String str) {
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.d;
        HashMap hashMap = (HashMap) this.a;
        lf2 lf2Var = (lf2) hashMap.get(str);
        if (lf2Var != null && lf2Var.c.isEmpty() && lf2Var.d.isEmpty()) {
            hashMap.remove(str);
            int i = lf2Var.a;
            boolean z = sparseBooleanArray.get(i);
            ((mf2) this.e).q(lf2Var, z);
            SparseArray sparseArray = (SparseArray) this.b;
            if (z) {
                sparseArray.remove(i);
                sparseBooleanArray.delete(i);
            } else {
                sparseArray.put(i, null);
                ((SparseBooleanArray) this.c).put(i, true);
            }
        }
    }

    public Path X(tmg tmgVar) {
        Path path;
        Path path2;
        Path p;
        ((Stack) this.d).push((tng) this.c);
        tng tngVar = new tng((tng) this.c);
        this.c = tngVar;
        s0(tngVar, tmgVar);
        if (!y() || !u0()) {
            this.c = (tng) ((Stack) this.d).pop();
            return null;
        }
        if (tmgVar instanceof lng) {
            lng lngVar = (lng) tmgVar;
            umg z = tmgVar.a.z(lngVar.o);
            if (z == null) {
                this.c = (tng) ((Stack) this.d).pop();
                return null;
            }
            if (!(z instanceof tmg)) {
                this.c = (tng) ((Stack) this.d).pop();
                return null;
            }
            path2 = X((tmg) z);
            if (path2 != null) {
                if (lngVar.h == null) {
                    lngVar.h = q(path2);
                }
                Matrix matrix = lngVar.n;
                if (matrix != null) {
                    path2.transform(matrix);
                }
                if (((tng) this.c).a.x != null && (p = p(tmgVar, tmgVar.h)) != null) {
                    path2.op(p, Path.Op.INTERSECT);
                }
                this.c = (tng) ((Stack) this.d).pop();
                return path2;
            }
            return null;
        }
        if (tmgVar instanceof wlg) {
            wlg wlgVar = (wlg) tmgVar;
            if (tmgVar instanceof gmg) {
                path = (Path) new png(((gmg) tmgVar).o).c;
                if (tmgVar.h == null) {
                    tmgVar.h = q(path);
                }
            } else {
                path = tmgVar instanceof lmg ? U((lmg) tmgVar) : tmgVar instanceof plg ? R((plg) tmgVar) : tmgVar instanceof ulg ? S((ulg) tmgVar) : tmgVar instanceof jmg ? T((jmg) tmgVar) : null;
            }
            if (path != null) {
                if (wlgVar.h == null) {
                    wlgVar.h = q(path);
                }
                Matrix matrix2 = wlgVar.n;
                if (matrix2 != null) {
                    path.transform(matrix2);
                }
                int i = ((tng) this.c).a.K;
                path.setFillType((i == 0 || i != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                path2 = path;
            }
            return null;
        }
        if (tmgVar instanceof fng) {
            fng fngVar = (fng) tmgVar;
            ArrayList arrayList = fngVar.n;
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float d = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((amg) fngVar.n.get(0)).d(this);
            ArrayList arrayList2 = fngVar.o;
            float e = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((amg) fngVar.o.get(0)).e(this);
            ArrayList arrayList3 = fngVar.p;
            float d2 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((amg) fngVar.p.get(0)).d(this);
            ArrayList arrayList4 = fngVar.q;
            if (arrayList4 != null && arrayList4.size() != 0) {
                f = ((amg) fngVar.q.get(0)).e(this);
            }
            if (((tng) this.c).a.J != 1) {
                float r = r(fngVar);
                if (((tng) this.c).a.J == 2) {
                    r /= 2.0f;
                }
                d -= r;
            }
            if (fngVar.h == null) {
                sng sngVar = new sng(this, d, e);
                B(fngVar, sngVar);
                Object obj = sngVar.j;
                RectF rectF = (RectF) obj;
                fngVar.h = new w0d(rectF.left, rectF.top, rectF.width(), ((RectF) obj).height());
            }
            path = new Path();
            B(fngVar, new sng(this, d + d2, e + f, path));
            Matrix matrix3 = fngVar.r;
            if (matrix3 != null) {
                path.transform(matrix3);
            }
            int i2 = ((tng) this.c).a.K;
            path.setFillType((i2 == 0 || i2 != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
            path2 = path;
        }
        return null;
        if (((tng) this.c).a.x != null) {
            path2.op(p, Path.Op.INTERSECT);
        }
        this.c = (tng) ((Stack) this.d).pop();
        return path2;
    }

    public void Y(w0d w0dVar) {
        Canvas canvas = (Canvas) this.a;
        if (((tng) this.c).a.y != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.2127f, 0.7151f, 0.0722f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT})));
            canvas.saveLayer(null, paint2, 31);
            dmg dmgVar = (dmg) ((ejg) this.b).z(((tng) this.c).a.y);
            i0(dmgVar, w0dVar);
            canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint3, 31);
            i0(dmgVar, w0dVar);
            canvas.restore();
            canvas.restore();
        }
        l0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0137, code lost:
    
        if (defpackage.yaa.P(new defpackage.y3k(r5, r6, r7, r14, r10, (defpackage.rq3) null), r3) != r11) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v7, types: [km5] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Iterable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object Z(int i, TvChannelData tvChannelData, o3k o3kVar, sq3 sq3Var) {
        s3k s3kVar;
        int i2;
        TvChannelVoteBody tvChannelVoteBody;
        int i3;
        TvChannelData tvChannelData2;
        int i4;
        v3k v3kVar;
        ?? r6;
        v3k v3kVar2;
        v3k v3kVar3;
        gv9<i3k> gv9Var;
        int i5;
        z3k z3kVar = (z3k) this.a;
        if (sq3Var instanceof s3k) {
            s3kVar = (s3k) sq3Var;
            int i6 = s3kVar.x;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                s3kVar.x = i6 - Integer.MIN_VALUE;
                Object obj = s3kVar.v;
                Object obj2 = lu3.a;
                i2 = s3kVar.x;
                int i7 = 1;
                if (i2 != 0) {
                    y6a.M(obj);
                    String iso2Alpha = ((Country) this.d).getIso2Alpha();
                    ?? r15 = o3kVar == o3k.a ? 1 : 0;
                    tvChannelVoteBody = new TvChannelVoteBody(iso2Alpha, r15);
                    i3 = i;
                    TvChannelVote tvChannelVote = new TvChannelVote(tvChannelData.a, i3, r15, 1000 * tvChannelData.c);
                    s3kVar.t = tvChannelData;
                    s3kVar.u = tvChannelVoteBody;
                    s3kVar.r = i3;
                    s3kVar.s = r15;
                    s3kVar.x = 1;
                    r3k r3kVar = z3kVar.a;
                    Object U = gz8.U(s3kVar, r3kVar.a, false, true, new mwj(8, r3kVar, tvChannelVote));
                    if (U != obj2) {
                        U = Unit.a;
                    }
                    if (U != obj2) {
                        U = Unit.a;
                    }
                    if (U != obj2) {
                        tvChannelData2 = tvChannelData;
                        i4 = r15;
                    }
                    return obj2;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        y6a.M(obj);
                        return Unit.a;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i4 = s3kVar.s;
                int i8 = s3kVar.r;
                tvChannelVoteBody = s3kVar.u;
                tvChannelData2 = s3kVar.t;
                y6a.M(obj);
                i3 = i8;
                v3kVar = (v3k) ((lec) this.c).d();
                if (v3kVar != null || (gv9Var = v3kVar.b) == null) {
                    r6 = km5.a;
                } else {
                    r6 = new ArrayList(k13.r(gv9Var, 10));
                    for (i3k i3kVar : gv9Var) {
                        if (i3kVar.a != i3) {
                            i5 = i7;
                        } else if (i4 != 0) {
                            i5 = i7;
                            i3kVar = i3k.a(i3kVar, i3kVar.d + i7, 0, o3k.a, 23);
                        } else {
                            i5 = i7;
                            i3kVar = i3k.a(i3kVar, 0, i3kVar.e + 1, o3k.b, 15);
                        }
                        r6.add(i3kVar);
                        i7 = i5;
                    }
                }
                yzc yzcVar = (yzc) this.b;
                v3kVar2 = (v3k) yzcVar.d();
                if (v3kVar2 == null) {
                    gv9 W = l6g.W(r6);
                    Country country = v3kVar2.a;
                    country.getClass();
                    W.getClass();
                    v3kVar3 = new v3k(country, W);
                } else {
                    v3kVar3 = null;
                }
                yzcVar.j(v3kVar3);
                TvType tvType = tvChannelData2.g;
                int i9 = tvChannelData2.a;
                s3kVar.t = null;
                s3kVar.u = null;
                s3kVar.r = i3;
                s3kVar.s = i4;
                s3kVar.x = 2;
                z3kVar.getClass();
            }
        }
        s3kVar = new s3k(this, sq3Var);
        Object obj3 = s3kVar.v;
        Object obj22 = lu3.a;
        i2 = s3kVar.x;
        int i72 = 1;
        if (i2 != 0) {
        }
        v3kVar = (v3k) ((lec) this.c).d();
        if (v3kVar != null) {
        }
        r6 = km5.a;
        yzc yzcVar2 = (yzc) this.b;
        v3kVar2 = (v3k) yzcVar2.d();
        if (v3kVar2 == null) {
        }
        yzcVar2.j(v3kVar3);
        TvType tvType2 = tvChannelData2.g;
        int i92 = tvChannelData2.a;
        s3kVar.t = null;
        s3kVar.u = null;
        s3kVar.r = i3;
        s3kVar.s = i4;
        s3kVar.x = 2;
        z3kVar.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzdod, com.google.android.gms.internal.ads.zzdcw
    public /* synthetic */ zzdcw a(zzfiy zzfiyVar) {
        this.b = zzfiyVar;
        return this;
    }

    public boolean a0() {
        umg z;
        int i = 0;
        if (((tng) this.c).a.j.floatValue() >= 1.0f && ((tng) this.c).a.y == null) {
            return false;
        }
        Canvas canvas = (Canvas) this.a;
        int floatValue = (int) (((tng) this.c).a.j.floatValue() * 256.0f);
        if (floatValue >= 0) {
            i = 255;
            if (floatValue <= 255) {
                i = floatValue;
            }
        }
        canvas.saveLayerAlpha(null, i, 31);
        ((Stack) this.d).push((tng) this.c);
        tng tngVar = new tng((tng) this.c);
        this.c = tngVar;
        String str = tngVar.a.y;
        if (str != null && ((z = ((ejg) this.b).z(str)) == null || !(z instanceof dmg))) {
            omg omgVar = ((tng) this.c).a;
            String str2 = omgVar.y;
            omgVar.y = null;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdod, com.google.android.gms.internal.ads.zzdcw
    public /* synthetic */ zzdcw b(zzfic zzficVar) {
        this.c = zzficVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdod
    public /* synthetic */ vng c(zzfic zzficVar) {
        this.c = zzficVar;
        return this;
    }

    public void c0() {
        try {
            lof lofVar = new lof(Q());
            try {
                gc2 l0 = lofVar.l0(lofVar.readInt());
                gc2 l02 = lofVar.l0(lofVar.readInt());
                Unit unit = Unit.a;
                lofVar.close();
                synchronized (this) {
                    l0.getClass();
                    this.c = l0;
                    l02.getClass();
                    this.d = l02;
                }
            } finally {
            }
        } finally {
            ((CountDownLatch) this.b).countDown();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdod
    public /* synthetic */ vng d(zzfiy zzfiyVar) {
        this.b = zzfiyVar;
        return this;
    }

    public void d0(pmg pmgVar, w0d w0dVar, w0d w0dVar2, f6f f6fVar) {
        if (w0dVar.d == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || w0dVar.e == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        if (f6fVar == null && (f6fVar = pmgVar.n) == null) {
            f6fVar = f6f.d;
        }
        s0((tng) this.c, pmgVar);
        if (y()) {
            tng tngVar = (tng) this.c;
            tngVar.f = w0dVar;
            if (!tngVar.a.o.booleanValue()) {
                w0d w0dVar3 = ((tng) this.c).f;
                j0(w0dVar3.b, w0dVar3.c, w0dVar3.d, w0dVar3.e);
            }
            t(pmgVar, ((tng) this.c).f);
            Canvas canvas = (Canvas) this.a;
            tng tngVar2 = (tng) this.c;
            if (w0dVar2 != null) {
                canvas.concat(s(tngVar2.f, w0dVar2, f6fVar));
                ((tng) this.c).g = pmgVar.o;
            } else {
                w0d w0dVar4 = tngVar2.f;
                canvas.translate(w0dVar4.b, w0dVar4.c);
            }
            boolean a0 = a0();
            t0();
            f0(pmgVar, true);
            if (a0) {
                Y(pmgVar.h);
            }
            q0(pmgVar);
        }
    }

    @Override // defpackage.ac3
    public Object e(Class cls) {
        if (!((Set) this.a).contains(oif.a(cls))) {
            pvd.y(cls, ".", "Attempting to request an undeclared dependency ");
            return null;
        }
        Object e = ((ac3) this.f).e(cls);
        if (!cls.equals(wgf.class)) {
            return e;
        }
        return new k2g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void e0(wmg wmgVar) {
        amg amgVar;
        String str;
        int indexOf;
        Set b;
        amg amgVar2;
        wmg z;
        Boolean bool;
        if (wmgVar instanceof emg) {
            return;
        }
        m0();
        if ((wmgVar instanceof umg) && (bool = ((umg) wmgVar).d) != null) {
            ((tng) this.c).h = bool.booleanValue();
        }
        if (wmgVar instanceof pmg) {
            pmg pmgVar = (pmg) wmgVar;
            d0(pmgVar, V(pmgVar.p, pmgVar.q, pmgVar.r, pmgVar.s), pmgVar.o, pmgVar.n);
        } else {
            boolean z2 = wmgVar instanceof lng;
            Bitmap bitmap = null;
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (z2) {
                lng lngVar = (lng) wmgVar;
                Canvas canvas = (Canvas) this.a;
                amg amgVar3 = lngVar.r;
                if ((amgVar3 == null || !amgVar3.g()) && ((amgVar2 = lngVar.s) == null || !amgVar2.g())) {
                    s0((tng) this.c, lngVar);
                    if (y() && (z = lngVar.a.z(lngVar.o)) != null) {
                        Matrix matrix = lngVar.n;
                        if (matrix != null) {
                            canvas.concat(matrix);
                        }
                        amg amgVar4 = lngVar.p;
                        float d = amgVar4 != null ? amgVar4.d(this) : 0.0f;
                        amg amgVar5 = lngVar.q;
                        canvas.translate(d, amgVar5 != null ? amgVar5.e(this) : 0.0f);
                        t(lngVar, lngVar.h);
                        boolean a0 = a0();
                        ((Stack) this.e).push(lngVar);
                        ((Stack) this.f).push(((Canvas) this.a).getMatrix());
                        if (z instanceof pmg) {
                            pmg pmgVar2 = (pmg) z;
                            w0d V = V(null, null, lngVar.r, lngVar.s);
                            m0();
                            d0(pmgVar2, V, pmgVar2.o, pmgVar2.n);
                            l0();
                        } else if (z instanceof cng) {
                            amg amgVar6 = lngVar.r;
                            if (amgVar6 == null) {
                                amgVar6 = new amg(100.0f, 9);
                            }
                            amg amgVar7 = lngVar.s;
                            if (amgVar7 == null) {
                                amgVar7 = new amg(100.0f, 9);
                            }
                            w0d V2 = V(null, null, amgVar6, amgVar7);
                            m0();
                            cng cngVar = (cng) z;
                            if (V2.d != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && V2.e != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                f6f f6fVar = cngVar.n;
                                if (f6fVar == null) {
                                    f6fVar = f6f.d;
                                }
                                s0((tng) this.c, cngVar);
                                tng tngVar = (tng) this.c;
                                tngVar.f = V2;
                                if (!tngVar.a.o.booleanValue()) {
                                    w0d w0dVar = ((tng) this.c).f;
                                    j0(w0dVar.b, w0dVar.c, w0dVar.d, w0dVar.e);
                                }
                                w0d w0dVar2 = cngVar.o;
                                tng tngVar2 = (tng) this.c;
                                if (w0dVar2 != null) {
                                    canvas.concat(s(tngVar2.f, w0dVar2, f6fVar));
                                    ((tng) this.c).g = cngVar.o;
                                } else {
                                    w0d w0dVar3 = tngVar2.f;
                                    canvas.translate(w0dVar3.b, w0dVar3.c);
                                }
                                boolean a02 = a0();
                                f0(cngVar, true);
                                if (a02) {
                                    Y(cngVar.h);
                                }
                                q0(cngVar);
                            }
                            l0();
                        } else {
                            e0(z);
                        }
                        ((Stack) this.e).pop();
                        ((Stack) this.f).pop();
                        if (a0) {
                            Y(lngVar.h);
                        }
                        q0(lngVar);
                    }
                }
            } else if (wmgVar instanceof bng) {
                bng bngVar = (bng) wmgVar;
                s0((tng) this.c, bngVar);
                if (y()) {
                    Matrix matrix2 = bngVar.n;
                    if (matrix2 != null) {
                        ((Canvas) this.a).concat(matrix2);
                    }
                    t(bngVar, bngVar.h);
                    boolean a03 = a0();
                    String language = Locale.getDefault().getLanguage();
                    Iterator it = bngVar.i.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        wmg wmgVar2 = (wmg) it.next();
                        if (wmgVar2 instanceof qmg) {
                            qmg qmgVar = (qmg) wmgVar2;
                            if (qmgVar.c() == null && ((b = qmgVar.b()) == null || (!b.isEmpty() && b.contains(language)))) {
                                Set f2 = qmgVar.f();
                                if (f2 != null) {
                                    if (g == null) {
                                        synchronized (vng.class) {
                                            HashSet hashSet = new HashSet();
                                            g = hashSet;
                                            hashSet.add("Structure");
                                            g.add("BasicStructure");
                                            g.add("ConditionalProcessing");
                                            g.add("Image");
                                            g.add("Style");
                                            g.add("ViewportAttribute");
                                            g.add("Shape");
                                            g.add("BasicText");
                                            g.add("PaintAttribute");
                                            g.add("BasicPaintAttribute");
                                            g.add("OpacityAttribute");
                                            g.add("BasicGraphicsAttribute");
                                            g.add("Marker");
                                            g.add("Gradient");
                                            g.add("Pattern");
                                            g.add("Clip");
                                            g.add("BasicClip");
                                            g.add("Mask");
                                            g.add("View");
                                        }
                                    }
                                    if (!f2.isEmpty() && g.containsAll(f2)) {
                                    }
                                }
                                Set m = qmgVar.m();
                                if (m == null) {
                                    Set n = qmgVar.n();
                                    if (n == null) {
                                        e0(wmgVar2);
                                        break;
                                    }
                                    n.isEmpty();
                                } else {
                                    m.isEmpty();
                                }
                            }
                        }
                    }
                    if (a03) {
                        Y(bngVar.h);
                    }
                    q0(bngVar);
                }
            } else if (wmgVar instanceof xlg) {
                xlg xlgVar = (xlg) wmgVar;
                s0((tng) this.c, xlgVar);
                if (y()) {
                    Matrix matrix3 = xlgVar.n;
                    if (matrix3 != null) {
                        ((Canvas) this.a).concat(matrix3);
                    }
                    t(xlgVar, xlgVar.h);
                    boolean a04 = a0();
                    f0(xlgVar, true);
                    if (a04) {
                        Y(xlgVar.h);
                    }
                    q0(xlgVar);
                }
            } else {
                if (wmgVar instanceof zlg) {
                    zlg zlgVar = (zlg) wmgVar;
                    Canvas canvas2 = (Canvas) this.a;
                    amg amgVar8 = zlgVar.r;
                    if (amgVar8 != null && !amgVar8.g() && (amgVar = zlgVar.s) != null && !amgVar.g() && (str = zlgVar.o) != null) {
                        f6f f6fVar2 = zlgVar.n;
                        if (f6fVar2 == null) {
                            f6fVar2 = f6f.d;
                        }
                        if (str.startsWith("data:") && str.length() >= 14 && (indexOf = str.indexOf(44)) >= 12 && ";base64".equals(str.substring(indexOf - 7, indexOf))) {
                            try {
                                byte[] decode = Base64.decode(str.substring(indexOf + 1), 0);
                                bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                            } catch (Exception unused) {
                            }
                        }
                        if (bitmap != null) {
                            w0d w0dVar4 = new w0d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, bitmap.getWidth(), bitmap.getHeight());
                            s0((tng) this.c, zlgVar);
                            if (y() && u0()) {
                                Matrix matrix4 = zlgVar.t;
                                if (matrix4 != null) {
                                    canvas2.concat(matrix4);
                                }
                                amg amgVar9 = zlgVar.p;
                                float d2 = amgVar9 != null ? amgVar9.d(this) : 0.0f;
                                amg amgVar10 = zlgVar.q;
                                float e = amgVar10 != null ? amgVar10.e(this) : 0.0f;
                                float d3 = zlgVar.r.d(this);
                                float d4 = zlgVar.s.d(this);
                                tng tngVar3 = (tng) this.c;
                                tngVar3.f = new w0d(d2, e, d3, d4);
                                if (!tngVar3.a.o.booleanValue()) {
                                    w0d w0dVar5 = ((tng) this.c).f;
                                    j0(w0dVar5.b, w0dVar5.c, w0dVar5.d, w0dVar5.e);
                                }
                                zlgVar.h = ((tng) this.c).f;
                                q0(zlgVar);
                                t(zlgVar, zlgVar.h);
                                boolean a05 = a0();
                                t0();
                                canvas2.save();
                                canvas2.concat(s(((tng) this.c).f, w0dVar4, f6fVar2));
                                canvas2.drawBitmap(bitmap, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new Paint(((tng) this.c).a.M != 3 ? 2 : 0));
                                canvas2.restore();
                                if (a05) {
                                    Y(zlgVar.h);
                                }
                            }
                        }
                    }
                } else if (wmgVar instanceof gmg) {
                    gmg gmgVar = (gmg) wmgVar;
                    if (gmgVar.o != null) {
                        s0((tng) this.c, gmgVar);
                        if (y() && u0()) {
                            tng tngVar4 = (tng) this.c;
                            if (tngVar4.c || tngVar4.b) {
                                Matrix matrix5 = gmgVar.n;
                                if (matrix5 != null) {
                                    ((Canvas) this.a).concat(matrix5);
                                }
                                Path path = (Path) new png(gmgVar.o).c;
                                if (gmgVar.h == null) {
                                    gmgVar.h = q(path);
                                }
                                q0(gmgVar);
                                u(gmgVar);
                                t(gmgVar, gmgVar.h);
                                boolean a06 = a0();
                                tng tngVar5 = (tng) this.c;
                                if (tngVar5.b) {
                                    int i = tngVar5.a.D;
                                    path.setFillType((i == 0 || i != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                    z(gmgVar, path);
                                }
                                if (((tng) this.c).c) {
                                    A(path);
                                }
                                h0(gmgVar);
                                if (a06) {
                                    Y(gmgVar.h);
                                }
                            }
                        }
                    }
                } else if (wmgVar instanceof lmg) {
                    lmg lmgVar = (lmg) wmgVar;
                    amg amgVar11 = lmgVar.q;
                    if (amgVar11 != null && lmgVar.r != null && !amgVar11.g() && !lmgVar.r.g()) {
                        s0((tng) this.c, lmgVar);
                        if (y() && u0()) {
                            Matrix matrix6 = lmgVar.n;
                            if (matrix6 != null) {
                                ((Canvas) this.a).concat(matrix6);
                            }
                            Path U = U(lmgVar);
                            q0(lmgVar);
                            u(lmgVar);
                            t(lmgVar, lmgVar.h);
                            boolean a07 = a0();
                            if (((tng) this.c).b) {
                                z(lmgVar, U);
                            }
                            if (((tng) this.c).c) {
                                A(U);
                            }
                            if (a07) {
                                Y(lmgVar.h);
                            }
                        }
                    }
                } else if (wmgVar instanceof plg) {
                    plg plgVar = (plg) wmgVar;
                    amg amgVar12 = plgVar.q;
                    if (amgVar12 != null && !amgVar12.g()) {
                        s0((tng) this.c, plgVar);
                        if (y() && u0()) {
                            Matrix matrix7 = plgVar.n;
                            if (matrix7 != null) {
                                ((Canvas) this.a).concat(matrix7);
                            }
                            Path R = R(plgVar);
                            q0(plgVar);
                            u(plgVar);
                            t(plgVar, plgVar.h);
                            boolean a08 = a0();
                            if (((tng) this.c).b) {
                                z(plgVar, R);
                            }
                            if (((tng) this.c).c) {
                                A(R);
                            }
                            if (a08) {
                                Y(plgVar.h);
                            }
                        }
                    }
                } else if (wmgVar instanceof ulg) {
                    ulg ulgVar = (ulg) wmgVar;
                    amg amgVar13 = ulgVar.q;
                    if (amgVar13 != null && ulgVar.r != null && !amgVar13.g() && !ulgVar.r.g()) {
                        s0((tng) this.c, ulgVar);
                        if (y() && u0()) {
                            Matrix matrix8 = ulgVar.n;
                            if (matrix8 != null) {
                                ((Canvas) this.a).concat(matrix8);
                            }
                            Path S = S(ulgVar);
                            q0(ulgVar);
                            u(ulgVar);
                            t(ulgVar, ulgVar.h);
                            boolean a09 = a0();
                            if (((tng) this.c).b) {
                                z(ulgVar, S);
                            }
                            if (((tng) this.c).c) {
                                A(S);
                            }
                            if (a09) {
                                Y(ulgVar.h);
                            }
                        }
                    }
                } else if (wmgVar instanceof bmg) {
                    bmg bmgVar = (bmg) wmgVar;
                    s0((tng) this.c, bmgVar);
                    if (y() && u0() && ((tng) this.c).c) {
                        Matrix matrix9 = bmgVar.n;
                        if (matrix9 != null) {
                            ((Canvas) this.a).concat(matrix9);
                        }
                        amg amgVar14 = bmgVar.o;
                        float d5 = amgVar14 == null ? 0.0f : amgVar14.d(this);
                        amg amgVar15 = bmgVar.p;
                        float e2 = amgVar15 == null ? 0.0f : amgVar15.e(this);
                        amg amgVar16 = bmgVar.q;
                        float d6 = amgVar16 == null ? 0.0f : amgVar16.d(this);
                        amg amgVar17 = bmgVar.r;
                        if (amgVar17 != null) {
                            f = amgVar17.e(this);
                        }
                        if (bmgVar.h == null) {
                            bmgVar.h = new w0d(Math.min(d5, d6), Math.min(e2, f), Math.abs(d6 - d5), Math.abs(f - e2));
                        }
                        Path path2 = new Path();
                        path2.moveTo(d5, e2);
                        path2.lineTo(d6, f);
                        q0(bmgVar);
                        u(bmgVar);
                        t(bmgVar, bmgVar.h);
                        boolean a010 = a0();
                        A(path2);
                        h0(bmgVar);
                        if (a010) {
                            Y(bmgVar.h);
                        }
                    }
                } else if (wmgVar instanceof kmg) {
                    kmg kmgVar = (kmg) wmgVar;
                    s0((tng) this.c, kmgVar);
                    if (y() && u0()) {
                        tng tngVar6 = (tng) this.c;
                        if (tngVar6.c || tngVar6.b) {
                            Matrix matrix10 = kmgVar.n;
                            if (matrix10 != null) {
                                ((Canvas) this.a).concat(matrix10);
                            }
                            if (kmgVar.o.length >= 2) {
                                Path T = T(kmgVar);
                                q0(kmgVar);
                                u(kmgVar);
                                t(kmgVar, kmgVar.h);
                                boolean a011 = a0();
                                if (((tng) this.c).b) {
                                    z(kmgVar, T);
                                }
                                if (((tng) this.c).c) {
                                    A(T);
                                }
                                h0(kmgVar);
                                if (a011) {
                                    Y(kmgVar.h);
                                }
                            }
                        }
                    }
                } else if (wmgVar instanceof jmg) {
                    jmg jmgVar = (jmg) wmgVar;
                    s0((tng) this.c, jmgVar);
                    if (y() && u0()) {
                        tng tngVar7 = (tng) this.c;
                        if (tngVar7.c || tngVar7.b) {
                            Matrix matrix11 = jmgVar.n;
                            if (matrix11 != null) {
                                ((Canvas) this.a).concat(matrix11);
                            }
                            if (jmgVar.o.length >= 2) {
                                Path T2 = T(jmgVar);
                                q0(jmgVar);
                                int i2 = ((tng) this.c).a.D;
                                T2.setFillType((i2 == 0 || i2 != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                u(jmgVar);
                                t(jmgVar, jmgVar.h);
                                boolean a012 = a0();
                                if (((tng) this.c).b) {
                                    z(jmgVar, T2);
                                }
                                if (((tng) this.c).c) {
                                    A(T2);
                                }
                                h0(jmgVar);
                                if (a012) {
                                    Y(jmgVar.h);
                                }
                            }
                        }
                    }
                } else if (wmgVar instanceof fng) {
                    fng fngVar = (fng) wmgVar;
                    s0((tng) this.c, fngVar);
                    if (y()) {
                        Matrix matrix12 = fngVar.r;
                        if (matrix12 != null) {
                            ((Canvas) this.a).concat(matrix12);
                        }
                        ArrayList arrayList = fngVar.n;
                        float d7 = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((amg) fngVar.n.get(0)).d(this);
                        ArrayList arrayList2 = fngVar.o;
                        float e3 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((amg) fngVar.o.get(0)).e(this);
                        ArrayList arrayList3 = fngVar.p;
                        float d8 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((amg) fngVar.p.get(0)).d(this);
                        ArrayList arrayList4 = fngVar.q;
                        if (arrayList4 != null && arrayList4.size() != 0) {
                            f = ((amg) fngVar.q.get(0)).e(this);
                        }
                        int K = K();
                        if (K != 1) {
                            float r = r(fngVar);
                            if (K == 2) {
                                r /= 2.0f;
                            }
                            d7 -= r;
                        }
                        if (fngVar.h == null) {
                            sng sngVar = new sng(this, d7, e3);
                            B(fngVar, sngVar);
                            RectF rectF = (RectF) sngVar.j;
                            fngVar.h = new w0d(rectF.left, rectF.top, rectF.width(), ((RectF) sngVar.j).height());
                        }
                        q0(fngVar);
                        u(fngVar);
                        t(fngVar, fngVar.h);
                        boolean a013 = a0();
                        B(fngVar, new rng(this, d7 + d8, e3 + f));
                        if (a013) {
                            Y(fngVar.h);
                        }
                    }
                }
            }
        }
        l0();
    }

    @Override // defpackage.ac3
    public vff f(oif oifVar) {
        if (((Set) this.e).contains(oifVar)) {
            return ((ac3) this.f).f(oifVar);
        }
        pvd.y(oifVar, ">>.", "Attempting to request an undeclared dependency Provider<Set<");
        return null;
    }

    public void f0(smg smgVar, boolean z) {
        if (z) {
            ((Stack) this.e).push(smgVar);
            ((Stack) this.f).push(((Canvas) this.a).getMatrix());
        }
        Iterator it = smgVar.a().iterator();
        while (it.hasNext()) {
            e0((wmg) it.next());
        }
        if (z) {
            ((Stack) this.e).pop();
            ((Stack) this.f).pop();
        }
    }

    @Override // defpackage.ac3
    public vff g(oif oifVar) {
        if (((Set) this.b).contains(oifVar)) {
            return ((ac3) this.f).g(oifVar);
        }
        pvd.y(oifVar, ">.", "Attempting to request an undeclared dependency Provider<");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x010b, code lost:
    
        if (((defpackage.tng) r12.c).a.o.booleanValue() != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010d, code lost:
    
        j0(r1, r2, r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0110, code lost:
    
        r4.reset();
        r4.preScale(r7, r6);
        r0.concat(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g0(cmg cmgVar, ong ongVar) {
        float f;
        w0d w0dVar;
        boolean a0;
        float f2;
        float f3;
        float f4;
        Canvas canvas = (Canvas) this.a;
        m0();
        Float f5 = cmgVar.u;
        float f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f5 != null) {
            if (Float.isNaN(f5.floatValue())) {
                float f7 = ongVar.c;
                if (f7 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || ongVar.d != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f = (float) Math.toDegrees(Math.atan2(ongVar.d, f7));
                }
            } else {
                f = cmgVar.u.floatValue();
            }
            float a = !cmgVar.p ? 1.0f : ((tng) this.c).a.f.a();
            this.c = H(cmgVar);
            Matrix matrix = new Matrix();
            matrix.preTranslate(ongVar.a, ongVar.b);
            matrix.preRotate(f);
            matrix.preScale(a, a);
            amg amgVar = cmgVar.q;
            float d = amgVar == null ? amgVar.d(this) : 0.0f;
            amg amgVar2 = cmgVar.r;
            float e = amgVar2 == null ? amgVar2.e(this) : 0.0f;
            amg amgVar3 = cmgVar.s;
            float d2 = amgVar3 == null ? amgVar3.d(this) : 3.0f;
            amg amgVar4 = cmgVar.t;
            float e2 = amgVar4 != null ? amgVar4.e(this) : 3.0f;
            w0dVar = cmgVar.o;
            if (w0dVar == null) {
                float f8 = d2 / w0dVar.d;
                float f9 = e2 / w0dVar.e;
                f6f f6fVar = cmgVar.n;
                if (f6fVar == null) {
                    f6fVar = f6f.d;
                }
                boolean equals = f6fVar.equals(f6f.c);
                e6f e6fVar = f6fVar.a;
                if (!equals) {
                    f8 = f6fVar.b == 2 ? Math.max(f8, f9) : Math.min(f8, f9);
                    f9 = f8;
                }
                matrix.preTranslate((-d) * f8, (-e) * f9);
                canvas.concat(matrix);
                w0d w0dVar2 = cmgVar.o;
                float f10 = w0dVar2.d * f8;
                float f11 = w0dVar2.e * f9;
                int ordinal = e6fVar.ordinal();
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 5) {
                            if (ordinal != 6) {
                                if (ordinal != 8) {
                                    if (ordinal != 9) {
                                        f3 = 0.0f;
                                        switch (e6fVar.ordinal()) {
                                            case 4:
                                            case 5:
                                            case 6:
                                                f4 = (e2 - f11) / 2.0f;
                                                f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f4;
                                                break;
                                            case 7:
                                            case 8:
                                            case 9:
                                                f4 = e2 - f11;
                                                f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f4;
                                                break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    f2 = d2 - f10;
                    f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f2;
                    switch (e6fVar.ordinal()) {
                    }
                }
                f2 = (d2 - f10) / 2.0f;
                f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f2;
                switch (e6fVar.ordinal()) {
                }
            } else {
                matrix.preTranslate(-d, -e);
                canvas.concat(matrix);
                if (!((tng) this.c).a.o.booleanValue()) {
                    j0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, d2, e2);
                }
            }
            a0 = a0();
            f0(cmgVar, false);
            if (a0) {
                Y(cmgVar.h);
            }
            l0();
        }
        f = 0.0f;
        if (!cmgVar.p) {
        }
        this.c = H(cmgVar);
        Matrix matrix2 = new Matrix();
        matrix2.preTranslate(ongVar.a, ongVar.b);
        matrix2.preRotate(f);
        matrix2.preScale(a, a);
        amg amgVar5 = cmgVar.q;
        if (amgVar5 == null) {
        }
        amg amgVar22 = cmgVar.r;
        if (amgVar22 == null) {
        }
        amg amgVar32 = cmgVar.s;
        if (amgVar32 == null) {
        }
        amg amgVar42 = cmgVar.t;
        if (amgVar42 != null) {
        }
        w0dVar = cmgVar.o;
        if (w0dVar == null) {
        }
        a0 = a0();
        f0(cmgVar, false);
        if (a0) {
        }
        l0();
    }

    @Override // defpackage.ac3
    public Object h(oif oifVar) {
        if (((Set) this.a).contains(oifVar)) {
            return ((ac3) this.f).h(oifVar);
        }
        pvd.y(oifVar, ".", "Attempting to request an undeclared dependency ");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h0(wlg wlgVar) {
        cmg cmgVar;
        String str;
        cmg cmgVar2;
        String str2;
        cmg cmgVar3;
        boolean z;
        int i;
        float f;
        float f2;
        float f3;
        ArrayList arrayList;
        int size;
        int i2;
        omg omgVar = ((tng) this.c).a;
        String str3 = omgVar.q;
        if (str3 == null && omgVar.r == null && omgVar.s == null) {
            return;
        }
        if (str3 != null) {
            umg z2 = wlgVar.a.z(str3);
            if (z2 != null) {
                cmgVar = (cmg) z2;
                str = ((tng) this.c).a.r;
                if (str != null) {
                    umg z3 = wlgVar.a.z(str);
                    if (z3 != null) {
                        cmgVar2 = (cmg) z3;
                        str2 = ((tng) this.c).a.s;
                        if (str2 != null) {
                            umg z4 = wlgVar.a.z(str2);
                            if (z4 != null) {
                                cmgVar3 = (cmg) z4;
                                z = wlgVar instanceof gmg;
                                float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                if (!z) {
                                    arrayList = new nng(this, ((gmg) wlgVar).o).a;
                                    f2 = 0.0f;
                                    i = 1;
                                } else if (wlgVar instanceof bmg) {
                                    bmg bmgVar = (bmg) wlgVar;
                                    amg amgVar = bmgVar.o;
                                    float d = amgVar != null ? amgVar.d(this) : 0.0f;
                                    amg amgVar2 = bmgVar.p;
                                    float e = amgVar2 != null ? amgVar2.e(this) : 0.0f;
                                    amg amgVar3 = bmgVar.q;
                                    float d2 = amgVar3 != null ? amgVar3.d(this) : 0.0f;
                                    amg amgVar4 = bmgVar.r;
                                    float e2 = amgVar4 != null ? amgVar4.e(this) : 0.0f;
                                    ArrayList arrayList2 = new ArrayList(2);
                                    float f5 = d2 - d;
                                    i = 1;
                                    float f6 = e2 - e;
                                    arrayList2.add(new ong(d, e, f5, f6));
                                    arrayList2.add(new ong(d2, e2, f5, f6));
                                    f2 = 0.0f;
                                    arrayList = arrayList2;
                                } else {
                                    i = 1;
                                    jmg jmgVar = (jmg) wlgVar;
                                    int length = jmgVar.o.length;
                                    if (length < 2) {
                                        arrayList = null;
                                        f2 = 0.0f;
                                    } else {
                                        ArrayList arrayList3 = new ArrayList();
                                        float[] fArr = jmgVar.o;
                                        ong ongVar = new ong(fArr[0], fArr[1], UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                        int i3 = 2;
                                        float f7 = 0.0f;
                                        float f8 = 0.0f;
                                        while (true) {
                                            f = ongVar.b;
                                            f2 = f4;
                                            f3 = ongVar.a;
                                            if (i3 >= length) {
                                                break;
                                            }
                                            float[] fArr2 = jmgVar.o;
                                            float f9 = fArr2[i3];
                                            float f10 = fArr2[i3 + 1];
                                            ongVar.a(f9, f10);
                                            arrayList3.add(ongVar);
                                            ongVar = new ong(f9, f10, f9 - f3, f10 - f);
                                            i3 += 2;
                                            f8 = f10;
                                            f7 = f9;
                                            f4 = f2;
                                        }
                                        if (jmgVar instanceof kmg) {
                                            float[] fArr3 = jmgVar.o;
                                            float f11 = fArr3[0];
                                            if (f7 != f11) {
                                                float f12 = fArr3[1];
                                                if (f8 != f12) {
                                                    ongVar.a(f11, f12);
                                                    arrayList3.add(ongVar);
                                                    ong ongVar2 = new ong(f11, f12, f11 - f3, f12 - f);
                                                    ongVar2.b((ong) arrayList3.get(0));
                                                    arrayList3.add(ongVar2);
                                                    arrayList3.set(0, ongVar2);
                                                }
                                            }
                                        } else {
                                            arrayList3.add(ongVar);
                                        }
                                        arrayList = arrayList3;
                                    }
                                }
                                if (arrayList == null && (size = arrayList.size()) != 0) {
                                    omg omgVar2 = ((tng) this.c).a;
                                    omgVar2.s = null;
                                    omgVar2.r = null;
                                    omgVar2.q = null;
                                    if (cmgVar != null) {
                                        g0(cmgVar, (ong) arrayList.get(0));
                                    }
                                    if (cmgVar2 != null && arrayList.size() > 2) {
                                        ong ongVar3 = (ong) arrayList.get(0);
                                        ong ongVar4 = (ong) arrayList.get(i);
                                        i2 = 1;
                                        while (i2 < size - 1) {
                                            i2++;
                                            ong ongVar5 = (ong) arrayList.get(i2);
                                            if (ongVar4.e) {
                                                float f13 = ongVar4.c;
                                                float f14 = ongVar4.d;
                                                float f15 = ongVar4.a;
                                                float f16 = f15 - ongVar3.a;
                                                float f17 = ongVar4.b;
                                                float f18 = ((f17 - ongVar3.b) * f14) + (f16 * f13);
                                                if (f18 == f2) {
                                                    f18 = ((ongVar5.a - f15) * f13) + ((ongVar5.b - f17) * f14);
                                                }
                                                if (f18 <= f2 && (f18 != f2 || (f13 <= f2 && f14 < f2))) {
                                                    ongVar4.c = -f13;
                                                    ongVar4.d = -f14;
                                                }
                                            }
                                            g0(cmgVar2, ongVar4);
                                            ongVar3 = ongVar4;
                                            ongVar4 = ongVar5;
                                        }
                                    }
                                    if (cmgVar3 == null) {
                                        g0(cmgVar3, (ong) arrayList.get(size - 1));
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            String str4 = ((tng) this.c).a.s;
                        }
                        cmgVar3 = null;
                        z = wlgVar instanceof gmg;
                        float f42 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        if (!z) {
                        }
                        if (arrayList == null) {
                            return;
                        }
                        omg omgVar22 = ((tng) this.c).a;
                        omgVar22.s = null;
                        omgVar22.r = null;
                        omgVar22.q = null;
                        if (cmgVar != null) {
                        }
                        if (cmgVar2 != null) {
                            ong ongVar32 = (ong) arrayList.get(0);
                            ong ongVar42 = (ong) arrayList.get(i);
                            i2 = 1;
                            while (i2 < size - 1) {
                            }
                        }
                        if (cmgVar3 == null) {
                        }
                    } else {
                        String str5 = ((tng) this.c).a.r;
                    }
                }
                cmgVar2 = null;
                str2 = ((tng) this.c).a.s;
                if (str2 != null) {
                }
                cmgVar3 = null;
                z = wlgVar instanceof gmg;
                float f422 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (!z) {
                }
                if (arrayList == null) {
                }
            } else {
                String str6 = ((tng) this.c).a.q;
            }
        }
        cmgVar = null;
        str = ((tng) this.c).a.r;
        if (str != null) {
        }
        cmgVar2 = null;
        str2 = ((tng) this.c).a.s;
        if (str2 != null) {
        }
        cmgVar3 = null;
        z = wlgVar instanceof gmg;
        float f4222 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (!z) {
        }
        if (arrayList == null) {
        }
    }

    @Override // defpackage.ac3
    public Set i(oif oifVar) {
        if (((Set) this.d).contains(oifVar)) {
            return ((ac3) this.f).i(oifVar);
        }
        pvd.y(oifVar, ">.", "Attempting to request an undeclared dependency Set<");
        return null;
    }

    public void i0(dmg dmgVar, w0d w0dVar) {
        float f;
        float f2;
        Canvas canvas = (Canvas) this.a;
        Boolean bool = dmgVar.n;
        if (bool == null || !bool.booleanValue()) {
            amg amgVar = dmgVar.p;
            float c = amgVar != null ? amgVar.c(this, 1.0f) : 1.2f;
            amg amgVar2 = dmgVar.q;
            float c2 = amgVar2 != null ? amgVar2.c(this, 1.0f) : 1.2f;
            f = c * w0dVar.d;
            f2 = c2 * w0dVar.e;
        } else {
            amg amgVar3 = dmgVar.p;
            f = amgVar3 != null ? amgVar3.d(this) : w0dVar.d;
            amg amgVar4 = dmgVar.q;
            f2 = amgVar4 != null ? amgVar4.e(this) : w0dVar.e;
        }
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        m0();
        tng H = H(dmgVar);
        this.c = H;
        H.a.j = Float.valueOf(1.0f);
        boolean a0 = a0();
        canvas.save();
        Boolean bool2 = dmgVar.o;
        if (bool2 != null && !bool2.booleanValue()) {
            canvas.translate(w0dVar.b, w0dVar.c);
            canvas.scale(w0dVar.d, w0dVar.e);
        }
        f0(dmgVar, false);
        canvas.restore();
        if (a0) {
            Y(w0dVar);
        }
        l0();
    }

    @Override // defpackage.ac3
    public vff j(Class cls) {
        return g(oif.a(cls));
    }

    public void j0(float f, float f2, float f3, float f4) {
        float f5 = f3 + f;
        float f6 = f4 + f2;
        g7h g7hVar = ((tng) this.c).a.p;
        if (g7hVar != null) {
            f += ((amg) g7hVar.e).d(this);
            f2 += ((amg) ((tng) this.c).a.p.b).e(this);
            f5 -= ((amg) ((tng) this.c).a.p.c).d(this);
            f6 -= ((amg) ((tng) this.c).a.p.d).e(this);
        }
        ((Canvas) this.a).clipRect(f, f2, f5, f6);
    }

    @Override // defpackage.ac3
    public nvd k(oif oifVar) {
        if (((Set) this.c).contains(oifVar)) {
            return ((ac3) this.f).k(oifVar);
        }
        pvd.y(oifVar, ">.", "Attempting to request an undeclared dependency Deferred<");
        return null;
    }

    @Override // defpackage.ac3
    public nvd l(Class cls) {
        return k(oif.a(cls));
    }

    public void l0() {
        ((Canvas) this.a).restore();
        this.c = (tng) ((Stack) this.d).pop();
    }

    public void m(b10 b10Var, scc sccVar, mij mijVar) {
        if (sccVar == null) {
            return;
        }
        if (mijVar.b(sccVar.a) != -1) {
            b10Var.A(sccVar, mijVar);
            return;
        }
        mij mijVar2 = (mij) ((awf) this.c).get(sccVar);
        if (mijVar2 != null) {
            b10Var.A(sccVar, mijVar2);
        }
    }

    public void m0() {
        ((Canvas) this.a).save();
        ((Stack) this.d).push((tng) this.c);
        this.c = new tng((tng) this.c);
    }

    public void n0() {
        ((mf2) this.e).i((HashMap) this.a);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.c;
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            ((SparseArray) this.b).remove(sparseBooleanArray.keyAt(i));
        }
        sparseBooleanArray.clear();
        ((SparseBooleanArray) this.d).clear();
    }

    public apf o() {
        joa joaVar;
        Context context;
        jt9 jt9Var;
        ic3 ic3Var;
        Context context2 = (Context) this.a;
        jt9 jt9Var2 = (jt9) this.b;
        jt9 jt9Var3 = new jt9(jt9Var2.a, jt9Var2.b, jt9Var2.c, jt9Var2.d, jt9Var2.e, jt9Var2.f, jt9Var2.g, jt9Var2.h, jt9Var2.i, jt9Var2.j, jt9Var2.k, jt9Var2.l, jt9Var2.m, new tl6(fcp.o0(((rl6) this.f).a)));
        mqi b = ypa.b(new gq9(29));
        mqi mqiVar = (mqi) this.c;
        if (mqiVar == null) {
            mqiVar = ypa.b(new sr8(this, 9));
        }
        mqi mqiVar2 = mqiVar;
        joa joaVar2 = (j3a) this.d;
        if (joaVar2 == null) {
            joaVar2 = ypa.b(new us9(0));
        }
        ic3 ic3Var2 = (ic3) this.e;
        if (ic3Var2 == null) {
            km5 km5Var = km5.a;
            ic3Var = new ic3(km5Var, km5Var, km5Var, km5Var, km5Var);
            joaVar = joaVar2;
            context = context2;
            jt9Var = jt9Var3;
        } else {
            joaVar = joaVar2;
            context = context2;
            jt9Var = jt9Var3;
            ic3Var = ic3Var2;
        }
        return new apf(new uof(context, jt9Var, b, mqiVar2, joaVar, ic3Var));
    }

    public String o0(String str, boolean z, boolean z2) {
        if (((tng) this.c).h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String replaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z) {
            replaceAll = replaceAll.replaceAll("^\\s+", "");
        }
        if (z2) {
            replaceAll = replaceAll.replaceAll("\\s+$", "");
        }
        return replaceAll.replaceAll("\\s{2,}", " ");
    }

    public Path p(tmg tmgVar, w0d w0dVar) {
        Path X;
        umg z = tmgVar.a.z(((tng) this.c).a.x);
        if (z == null) {
            String str = ((tng) this.c).a.x;
            return null;
        }
        qlg qlgVar = (qlg) z;
        ((Stack) this.d).push((tng) this.c);
        this.c = H(qlgVar);
        Boolean bool = qlgVar.o;
        boolean z2 = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z2) {
            matrix.preTranslate(w0dVar.b, w0dVar.c);
            matrix.preScale(w0dVar.d, w0dVar.e);
        }
        Matrix matrix2 = qlgVar.n;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        Iterator it = qlgVar.i.iterator();
        while (it.hasNext()) {
            wmg wmgVar = (wmg) it.next();
            if ((wmgVar instanceof tmg) && (X = X((tmg) wmgVar)) != null) {
                path.op(X, Path.Op.UNION);
            }
        }
        if (((tng) this.c).a.x != null) {
            w0d w0dVar2 = qlgVar.h;
            if (w0dVar2 == null) {
                w0dVar2 = q(path);
                qlgVar.h = w0dVar2;
            }
            Path p = p(qlgVar, w0dVar2);
            if (p != null) {
                path.op(p, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.c = (tng) ((Stack) this.d).pop();
        return path;
    }

    public void p0(mij mijVar) {
        hv9 hv9Var;
        b10 d = lv9.d();
        if (((hv9) this.b).isEmpty()) {
            m(d, (scc) this.e, mijVar);
            if (!Objects.equals((scc) this.f, (scc) this.e)) {
                m(d, (scc) this.f, mijVar);
            }
            if (!Objects.equals((scc) this.d, (scc) this.e) && !Objects.equals((scc) this.d, (scc) this.f)) {
                m(d, (scc) this.d, mijVar);
            }
        } else {
            int i = 0;
            while (true) {
                int size = ((hv9) this.b).size();
                hv9Var = (hv9) this.b;
                if (i >= size) {
                    break;
                }
                m(d, (scc) hv9Var.get(i), mijVar);
                i++;
            }
            if (!hv9Var.contains((scc) this.d)) {
                m(d, (scc) this.d, mijVar);
            }
        }
        this.c = d.c(true);
    }

    public void q0(tmg tmgVar) {
        if (tmgVar.b == null || tmgVar.h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (((Matrix) ((Stack) this.f).peek()).invert(matrix)) {
            w0d w0dVar = tmgVar.h;
            float f = w0dVar.b;
            float f2 = w0dVar.c;
            float c = w0dVar.c();
            w0d w0dVar2 = tmgVar.h;
            float f3 = w0dVar2.c;
            float c2 = w0dVar2.c();
            float d = tmgVar.h.d();
            w0d w0dVar3 = tmgVar.h;
            float[] fArr = {f, f2, c, f3, c2, d, w0dVar3.b, w0dVar3.d()};
            matrix.preConcat(((Canvas) this.a).getMatrix());
            matrix.mapPoints(fArr);
            float f4 = fArr[0];
            float f5 = fArr[1];
            RectF rectF = new RectF(f4, f5, f4, f5);
            for (int i = 2; i <= 6; i += 2) {
                float f6 = fArr[i];
                if (f6 < rectF.left) {
                    rectF.left = f6;
                }
                if (f6 > rectF.right) {
                    rectF.right = f6;
                }
                float f7 = fArr[i + 1];
                if (f7 < rectF.top) {
                    rectF.top = f7;
                }
                if (f7 > rectF.bottom) {
                    rectF.bottom = f7;
                }
            }
            tmg tmgVar2 = (tmg) ((Stack) this.e).peek();
            w0d w0dVar4 = tmgVar2.h;
            float f8 = rectF.left;
            float f9 = rectF.top;
            if (w0dVar4 == null) {
                tmgVar2.h = new w0d(f8, f9, rectF.right - f8, rectF.bottom - f9);
                return;
            }
            float f10 = rectF.right - f8;
            float f11 = rectF.bottom - f9;
            if (f8 < w0dVar4.b) {
                w0dVar4.b = f8;
            }
            if (f9 < w0dVar4.c) {
                w0dVar4.c = f9;
            }
            if (f8 + f10 > w0dVar4.c()) {
                w0dVar4.d = (f8 + f10) - w0dVar4.b;
            }
            if (f9 + f11 > w0dVar4.d()) {
                w0dVar4.e = (f9 + f11) - w0dVar4.c;
            }
        }
    }

    public float r(hng hngVar) {
        ung ungVar = new ung(this);
        B(hngVar, ungVar);
        return ungVar.f;
    }

    public void r0(tng tngVar, omg omgVar) {
        if (P(omgVar, 4096L)) {
            tngVar.a.k = omgVar.k;
        }
        if (P(omgVar, 2048L)) {
            tngVar.a.j = omgVar.j;
        }
        boolean P = P(omgVar, 1L);
        rlg rlgVar = rlg.c;
        if (P) {
            tngVar.a.b = omgVar.b;
            xmg xmgVar = omgVar.b;
            tngVar.b = (xmgVar == null || xmgVar == rlgVar) ? false : true;
        }
        if (P(omgVar, 4L)) {
            tngVar.a.c = omgVar.c;
        }
        if (P(omgVar, 6149L)) {
            k0(tngVar, true, tngVar.a.b);
        }
        if (P(omgVar, 2L)) {
            tngVar.a.D = omgVar.D;
        }
        if (P(omgVar, 8L)) {
            tngVar.a.d = omgVar.d;
            xmg xmgVar2 = omgVar.d;
            tngVar.c = (xmgVar2 == null || xmgVar2 == rlgVar) ? false : true;
        }
        if (P(omgVar, 16L)) {
            tngVar.a.e = omgVar.e;
        }
        if (P(omgVar, 6168L)) {
            k0(tngVar, false, tngVar.a.d);
        }
        if (P(omgVar, 34359738368L)) {
            tngVar.a.L = omgVar.L;
        }
        if (P(omgVar, 32L)) {
            omg omgVar2 = tngVar.a;
            amg amgVar = omgVar.f;
            omgVar2.f = amgVar;
            tngVar.e.setStrokeWidth(amgVar.b(this));
        }
        if (P(omgVar, 64L)) {
            omg omgVar3 = tngVar.a;
            Paint paint = tngVar.e;
            omgVar3.E = omgVar.E;
            int C = wt3.C(omgVar.E);
            if (C == 0) {
                paint.setStrokeCap(Paint.Cap.BUTT);
            } else if (C == 1) {
                paint.setStrokeCap(Paint.Cap.ROUND);
            } else if (C == 2) {
                paint.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (P(omgVar, 128L)) {
            omg omgVar4 = tngVar.a;
            Paint paint2 = tngVar.e;
            omgVar4.F = omgVar.F;
            int C2 = wt3.C(omgVar.F);
            if (C2 == 0) {
                paint2.setStrokeJoin(Paint.Join.MITER);
            } else if (C2 == 1) {
                paint2.setStrokeJoin(Paint.Join.ROUND);
            } else if (C2 == 2) {
                paint2.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (P(omgVar, 256L)) {
            tngVar.a.g = omgVar.g;
            tngVar.e.setStrokeMiter(omgVar.g.floatValue());
        }
        if (P(omgVar, 512L)) {
            tngVar.a.h = omgVar.h;
        }
        if (P(omgVar, 1024L)) {
            tngVar.a.i = omgVar.i;
        }
        Typeface typeface = null;
        if (P(omgVar, 1536L)) {
            omg omgVar5 = tngVar.a;
            Paint paint3 = tngVar.e;
            amg[] amgVarArr = omgVar5.h;
            if (amgVarArr == null) {
                paint3.setPathEffect(null);
            } else {
                int length = amgVarArr.length;
                int i = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i];
                float f = 0.0f;
                for (int i2 = 0; i2 < i; i2++) {
                    float b = omgVar5.h[i2 % length].b(this);
                    fArr[i2] = b;
                    f += b;
                }
                if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    paint3.setPathEffect(null);
                } else {
                    float b2 = omgVar5.i.b(this);
                    if (b2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        b2 = (b2 % f) + f;
                    }
                    paint3.setPathEffect(new DashPathEffect(fArr, b2));
                }
            }
        }
        if (P(omgVar, 16384L)) {
            float textSize = ((tng) this.c).d.getTextSize();
            tngVar.a.m = omgVar.m;
            tngVar.d.setTextSize(omgVar.m.c(this, textSize));
            tngVar.e.setTextSize(omgVar.m.c(this, textSize));
        }
        if (P(omgVar, 8192L)) {
            tngVar.a.l = omgVar.l;
        }
        if (P(omgVar, 32768L)) {
            if (omgVar.n.intValue() == -1 && tngVar.a.n.intValue() > 100) {
                omg omgVar6 = tngVar.a;
                omgVar6.n = Integer.valueOf(omgVar6.n.intValue() - 100);
            } else if (omgVar.n.intValue() != 1 || tngVar.a.n.intValue() >= 900) {
                tngVar.a.n = omgVar.n;
            } else {
                omg omgVar7 = tngVar.a;
                omgVar7.n = Integer.valueOf(omgVar7.n.intValue() + 100);
            }
        }
        if (P(omgVar, 65536L)) {
            tngVar.a.G = omgVar.G;
        }
        if (P(omgVar, 106496L)) {
            omg omgVar8 = tngVar.a;
            ArrayList arrayList = omgVar8.l;
            if (arrayList != null && ((ejg) this.b) != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    typeface = v(omgVar8.G, (String) it.next(), omgVar8.n);
                    if (typeface != null) {
                        break;
                    }
                }
            }
            if (typeface == null) {
                typeface = v(omgVar8.G, C.SERIF_NAME, omgVar8.n);
            }
            tngVar.d.setTypeface(typeface);
            tngVar.e.setTypeface(typeface);
        }
        if (P(omgVar, 131072L)) {
            omg omgVar9 = tngVar.a;
            Paint paint4 = tngVar.e;
            Paint paint5 = tngVar.d;
            omgVar9.H = omgVar.H;
            paint5.setStrikeThruText(omgVar.H == 4);
            paint5.setUnderlineText(omgVar.H == 2);
            paint4.setStrikeThruText(omgVar.H == 4);
            paint4.setUnderlineText(omgVar.H == 2);
        }
        if (P(omgVar, 68719476736L)) {
            tngVar.a.I = omgVar.I;
        }
        if (P(omgVar, 262144L)) {
            tngVar.a.J = omgVar.J;
        }
        if (P(omgVar, 524288L)) {
            tngVar.a.o = omgVar.o;
        }
        if (P(omgVar, CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE)) {
            tngVar.a.q = omgVar.q;
        }
        if (P(omgVar, 4194304L)) {
            tngVar.a.r = omgVar.r;
        }
        if (P(omgVar, 8388608L)) {
            tngVar.a.s = omgVar.s;
        }
        if (P(omgVar, 16777216L)) {
            tngVar.a.t = omgVar.t;
        }
        if (P(omgVar, 33554432L)) {
            tngVar.a.u = omgVar.u;
        }
        if (P(omgVar, 1048576L)) {
            tngVar.a.p = omgVar.p;
        }
        if (P(omgVar, 268435456L)) {
            tngVar.a.x = omgVar.x;
        }
        if (P(omgVar, 536870912L)) {
            tngVar.a.K = omgVar.K;
        }
        if (P(omgVar, 1073741824L)) {
            tngVar.a.y = omgVar.y;
        }
        if (P(omgVar, 67108864L)) {
            tngVar.a.v = omgVar.v;
        }
        if (P(omgVar, 134217728L)) {
            tngVar.a.w = omgVar.w;
        }
        if (P(omgVar, 8589934592L)) {
            tngVar.a.B = omgVar.B;
        }
        if (P(omgVar, 17179869184L)) {
            tngVar.a.C = omgVar.C;
        }
        if (P(omgVar, 137438953472L)) {
            tngVar.a.M = omgVar.M;
        }
    }

    public void s0(tng tngVar, umg umgVar) {
        boolean z = umgVar.b == null;
        omg omgVar = tngVar.a;
        Float valueOf = Float.valueOf(1.0f);
        Boolean bool = Boolean.TRUE;
        omgVar.t = bool;
        if (!z) {
            bool = Boolean.FALSE;
        }
        omgVar.o = bool;
        omgVar.p = null;
        omgVar.x = null;
        omgVar.j = valueOf;
        omgVar.v = rlg.b;
        omgVar.w = valueOf;
        omgVar.y = null;
        omgVar.z = null;
        omgVar.A = valueOf;
        omgVar.B = null;
        omgVar.C = valueOf;
        omgVar.L = 1;
        omg omgVar2 = umgVar.e;
        if (omgVar2 != null) {
            r0(tngVar, omgVar2);
        }
        ArrayList arrayList = ((zl1) ((ejg) this.b).b).b;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = ((zl1) ((ejg) this.b).b).b.iterator();
            while (it.hasNext()) {
                zd2 zd2Var = (zd2) it.next();
                if (pp4.p(zd2Var.a, umgVar)) {
                    r0(tngVar, zd2Var.b);
                }
            }
        }
        omg omgVar3 = umgVar.f;
        if (omgVar3 != null) {
            r0(tngVar, omgVar3);
        }
    }

    public void t(tmg tmgVar, w0d w0dVar) {
        Path p;
        if (((tng) this.c).a.x == null || (p = p(tmgVar, w0dVar)) == null) {
            return;
        }
        ((Canvas) this.a).clipPath(p);
    }

    public void t0() {
        int i;
        omg omgVar = ((tng) this.c).a;
        xmg xmgVar = omgVar.B;
        if (xmgVar instanceof rlg) {
            i = ((rlg) xmgVar).a;
        } else if (!(xmgVar instanceof slg)) {
            return;
        } else {
            i = omgVar.k.a;
        }
        Float f = omgVar.C;
        if (f != null) {
            i = w(f.floatValue(), i);
        }
        ((Canvas) this.a).drawColor(i);
    }

    public void u(tmg tmgVar) {
        xmg xmgVar = ((tng) this.c).a.b;
        if (xmgVar instanceof fmg) {
            x(true, tmgVar.h, (fmg) xmgVar);
        }
        xmg xmgVar2 = ((tng) this.c).a.d;
        if (xmgVar2 instanceof fmg) {
            x(false, tmgVar.h, (fmg) xmgVar2);
        }
    }

    public boolean u0() {
        Boolean bool = ((tng) this.c).a.u;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void x(boolean z, w0d w0dVar, fmg fmgVar) {
        float c;
        float f;
        float c2;
        float f2;
        float c3;
        float c4;
        float c5;
        float c6;
        umg z2 = ((ejg) this.b).z(fmgVar.a);
        if (z2 == null) {
            xmg xmgVar = fmgVar.b;
            tng tngVar = (tng) this.c;
            if (xmgVar != null) {
                k0(tngVar, z, xmgVar);
                return;
            } else if (z) {
                tngVar.b = false;
                return;
            } else {
                tngVar.c = false;
                return;
            }
        }
        boolean z3 = z2 instanceof vmg;
        rlg rlgVar = rlg.b;
        if (z3) {
            vmg vmgVar = (vmg) z2;
            String str = vmgVar.l;
            if (str != null) {
                D(vmgVar, str);
            }
            Boolean bool = vmgVar.i;
            Object[] objArr = bool != null && bool.booleanValue();
            tng tngVar2 = (tng) this.c;
            Paint paint = z ? tngVar2.d : tngVar2.e;
            if (objArr == true) {
                w0d w0dVar2 = tngVar2.g;
                if (w0dVar2 == null) {
                    w0dVar2 = tngVar2.f;
                }
                amg amgVar = vmgVar.m;
                c3 = amgVar != null ? amgVar.d(this) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                amg amgVar2 = vmgVar.n;
                c4 = amgVar2 != null ? amgVar2.e(this) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                amg amgVar3 = vmgVar.o;
                c5 = amgVar3 != null ? amgVar3.d(this) : w0dVar2.d;
                amg amgVar4 = vmgVar.p;
                if (amgVar4 != null) {
                    c6 = amgVar4.e(this);
                }
                c6 = f2;
            } else {
                f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                amg amgVar5 = vmgVar.m;
                c3 = amgVar5 != null ? amgVar5.c(this, 1.0f) : 0.0f;
                amg amgVar6 = vmgVar.n;
                c4 = amgVar6 != null ? amgVar6.c(this, 1.0f) : 0.0f;
                amg amgVar7 = vmgVar.o;
                c5 = amgVar7 != null ? amgVar7.c(this, 1.0f) : 1.0f;
                amg amgVar8 = vmgVar.p;
                if (amgVar8 != null) {
                    c6 = amgVar8.c(this, 1.0f);
                }
                c6 = f2;
            }
            float f3 = c4;
            float f4 = c5;
            float f5 = c6;
            float f6 = c3;
            m0();
            this.c = H(vmgVar);
            Matrix matrix = new Matrix();
            if (objArr == false) {
                matrix.preTranslate(w0dVar.b, w0dVar.c);
                matrix.preScale(w0dVar.d, w0dVar.e);
            }
            Matrix matrix2 = vmgVar.j;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            int size = vmgVar.h.size();
            if (size == 0) {
                l0();
                tng tngVar3 = (tng) this.c;
                if (z) {
                    tngVar3.b = false;
                    return;
                } else {
                    tngVar3.c = false;
                    return;
                }
            }
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            Iterator it = vmgVar.h.iterator();
            int i = 0;
            float f7 = -1.0f;
            while (it.hasNext()) {
                nmg nmgVar = (nmg) ((wmg) it.next());
                Float f8 = nmgVar.h;
                float floatValue = f8 != null ? f8.floatValue() : f2;
                if (i == 0 || floatValue >= f7) {
                    fArr[i] = floatValue;
                    f7 = floatValue;
                } else {
                    fArr[i] = f7;
                }
                m0();
                s0((tng) this.c, nmgVar);
                omg omgVar = ((tng) this.c).a;
                rlg rlgVar2 = (rlg) omgVar.v;
                if (rlgVar2 == null) {
                    rlgVar2 = rlgVar;
                }
                iArr[i] = w(omgVar.w.floatValue(), rlgVar2.a);
                i++;
                l0();
            }
            if ((f6 == f4 && f3 == f5) || size == 1) {
                l0();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            int i2 = vmgVar.k;
            if (i2 != 0) {
                if (i2 == 2) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (i2 == 3) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            Shader.TileMode tileMode2 = tileMode;
            l0();
            LinearGradient linearGradient = new LinearGradient(f6, f3, f4, f5, iArr, fArr, tileMode2);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            int floatValue2 = (int) (((tng) this.c).a.c.floatValue() * 256.0f);
            paint.setAlpha(floatValue2 >= 0 ? floatValue2 > 255 ? 255 : floatValue2 : 0);
            return;
        }
        if (!(z2 instanceof zmg)) {
            if (z2 instanceof mmg) {
                mmg mmgVar = (mmg) z2;
                omg omgVar2 = mmgVar.e;
                if (z) {
                    if (P(omgVar2, 2147483648L)) {
                        tng tngVar4 = (tng) this.c;
                        omg omgVar3 = tngVar4.a;
                        xmg xmgVar2 = mmgVar.e.z;
                        omgVar3.b = xmgVar2;
                        tngVar4.b = xmgVar2 != null;
                    }
                    if (P(mmgVar.e, 4294967296L)) {
                        ((tng) this.c).a.c = mmgVar.e.A;
                    }
                    if (P(mmgVar.e, 6442450944L)) {
                        tng tngVar5 = (tng) this.c;
                        k0(tngVar5, z, tngVar5.a.b);
                        return;
                    }
                    return;
                }
                if (P(omgVar2, 2147483648L)) {
                    tng tngVar6 = (tng) this.c;
                    omg omgVar4 = tngVar6.a;
                    xmg xmgVar3 = mmgVar.e.z;
                    omgVar4.d = xmgVar3;
                    tngVar6.c = xmgVar3 != null;
                }
                if (P(mmgVar.e, 4294967296L)) {
                    ((tng) this.c).a.e = mmgVar.e.A;
                }
                if (P(mmgVar.e, 6442450944L)) {
                    tng tngVar7 = (tng) this.c;
                    k0(tngVar7, z, tngVar7.a.d);
                    return;
                }
                return;
            }
            return;
        }
        zmg zmgVar = (zmg) z2;
        String str2 = zmgVar.l;
        if (str2 != null) {
            D(zmgVar, str2);
        }
        Boolean bool2 = zmgVar.i;
        Object[] objArr2 = bool2 != null && bool2.booleanValue();
        tng tngVar8 = (tng) this.c;
        Paint paint2 = z ? tngVar8.d : tngVar8.e;
        if (objArr2 == true) {
            amg amgVar9 = new amg(50.0f, 9);
            amg amgVar10 = zmgVar.m;
            float d = amgVar10 != null ? amgVar10.d(this) : amgVar9.d(this);
            amg amgVar11 = zmgVar.n;
            c = amgVar11 != null ? amgVar11.e(this) : amgVar9.e(this);
            amg amgVar12 = zmgVar.o;
            c2 = amgVar12 != null ? amgVar12.b(this) : amgVar9.b(this);
            f = d;
        } else {
            amg amgVar13 = zmgVar.m;
            float c7 = amgVar13 != null ? amgVar13.c(this, 1.0f) : 0.5f;
            amg amgVar14 = zmgVar.n;
            c = amgVar14 != null ? amgVar14.c(this, 1.0f) : 0.5f;
            amg amgVar15 = zmgVar.o;
            f = c7;
            c2 = amgVar15 != null ? amgVar15.c(this, 1.0f) : 0.5f;
        }
        float f9 = c;
        m0();
        this.c = H(zmgVar);
        Matrix matrix3 = new Matrix();
        if (objArr2 == false) {
            matrix3.preTranslate(w0dVar.b, w0dVar.c);
            matrix3.preScale(w0dVar.d, w0dVar.e);
        }
        Matrix matrix4 = zmgVar.j;
        if (matrix4 != null) {
            matrix3.preConcat(matrix4);
        }
        int size2 = zmgVar.h.size();
        if (size2 == 0) {
            l0();
            tng tngVar9 = (tng) this.c;
            if (z) {
                tngVar9.b = false;
                return;
            } else {
                tngVar9.c = false;
                return;
            }
        }
        int[] iArr2 = new int[size2];
        float[] fArr2 = new float[size2];
        Iterator it2 = zmgVar.h.iterator();
        int i3 = 0;
        float f10 = -1.0f;
        while (it2.hasNext()) {
            nmg nmgVar2 = (nmg) ((wmg) it2.next());
            Float f11 = nmgVar2.h;
            float floatValue3 = f11 != null ? f11.floatValue() : 0.0f;
            if (i3 == 0 || floatValue3 >= f10) {
                fArr2[i3] = floatValue3;
                f10 = floatValue3;
            } else {
                fArr2[i3] = f10;
            }
            m0();
            s0((tng) this.c, nmgVar2);
            omg omgVar5 = ((tng) this.c).a;
            rlg rlgVar3 = (rlg) omgVar5.v;
            if (rlgVar3 == null) {
                rlgVar3 = rlgVar;
            }
            iArr2[i3] = w(omgVar5.w.floatValue(), rlgVar3.a);
            i3++;
            l0();
        }
        if (c2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || size2 == 1) {
            l0();
            paint2.setColor(iArr2[size2 - 1]);
            return;
        }
        Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
        int i4 = zmgVar.k;
        if (i4 != 0) {
            if (i4 == 2) {
                tileMode3 = Shader.TileMode.MIRROR;
            } else if (i4 == 3) {
                tileMode3 = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode4 = tileMode3;
        l0();
        RadialGradient radialGradient = new RadialGradient(f, f9, c2, iArr2, fArr2, tileMode4);
        radialGradient.setLocalMatrix(matrix3);
        paint2.setShader(radialGradient);
        int floatValue4 = (int) (((tng) this.c).a.c.floatValue() * 256.0f);
        paint2.setAlpha(floatValue4 >= 0 ? floatValue4 > 255 ? 255 : floatValue4 : 0);
    }

    public boolean y() {
        Boolean bool = ((tng) this.c).a.t;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x022c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void z(tmg tmgVar, Path path) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        boolean z;
        boolean z2;
        float floor;
        float d;
        boolean a0;
        float f6;
        float f7;
        Canvas canvas = (Canvas) this.a;
        xmg xmgVar = ((tng) this.c).a.b;
        if (xmgVar instanceof fmg) {
            umg z3 = ((ejg) this.b).z(((fmg) xmgVar).a);
            if (z3 instanceof img) {
                img imgVar = (img) z3;
                Boolean bool = imgVar.p;
                boolean z4 = bool != null && bool.booleanValue();
                String str = imgVar.w;
                if (str != null) {
                    F(imgVar, str);
                }
                amg amgVar = imgVar.s;
                if (z4) {
                    f2 = amgVar != null ? amgVar.d(this) : 0.0f;
                    amg amgVar2 = imgVar.t;
                    f3 = amgVar2 != null ? amgVar2.e(this) : 0.0f;
                    amg amgVar3 = imgVar.u;
                    f4 = amgVar3 != null ? amgVar3.d(this) : 0.0f;
                    amg amgVar4 = imgVar.v;
                    f = amgVar4 != null ? amgVar4.e(this) : 0.0f;
                } else {
                    float c = amgVar != null ? amgVar.c(this, 1.0f) : 0.0f;
                    amg amgVar5 = imgVar.t;
                    float c2 = amgVar5 != null ? amgVar5.c(this, 1.0f) : 0.0f;
                    amg amgVar6 = imgVar.u;
                    float c3 = amgVar6 != null ? amgVar6.c(this, 1.0f) : 0.0f;
                    amg amgVar7 = imgVar.v;
                    float c4 = amgVar7 != null ? amgVar7.c(this, 1.0f) : 0.0f;
                    w0d w0dVar = tmgVar.h;
                    float f8 = w0dVar.b;
                    float f9 = w0dVar.d;
                    float f10 = (c * f9) + f8;
                    float f11 = w0dVar.c;
                    float f12 = w0dVar.e;
                    float f13 = c3 * f9;
                    f = c4 * f12;
                    f2 = f10;
                    f3 = (c2 * f12) + f11;
                    f4 = f13;
                }
                if (f4 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    return;
                }
                f6f f6fVar = imgVar.n;
                if (f6fVar == null) {
                    f6fVar = f6f.d;
                }
                m0();
                canvas.clipPath(path);
                tng tngVar = new tng();
                r0(tngVar, omg.a());
                tngVar.a.o = Boolean.FALSE;
                I(imgVar, tngVar);
                this.c = tngVar;
                w0d w0dVar2 = tmgVar.h;
                Matrix matrix = imgVar.r;
                if (matrix != null) {
                    canvas.concat(matrix);
                    Matrix matrix2 = new Matrix();
                    if (imgVar.r.invert(matrix2)) {
                        w0d w0dVar3 = tmgVar.h;
                        float f14 = w0dVar3.b;
                        float f15 = w0dVar3.c;
                        float c5 = w0dVar3.c();
                        z = true;
                        w0d w0dVar4 = tmgVar.h;
                        z2 = false;
                        float f16 = w0dVar4.c;
                        float c6 = w0dVar4.c();
                        float d2 = tmgVar.h.d();
                        w0d w0dVar5 = tmgVar.h;
                        f5 = f2;
                        float[] fArr = {f14, f15, c5, f16, c6, d2, w0dVar5.b, w0dVar5.d()};
                        matrix2.mapPoints(fArr);
                        float f17 = fArr[0];
                        float f18 = fArr[1];
                        RectF rectF = new RectF(f17, f18, f17, f18);
                        for (int i = 2; i <= 6; i += 2) {
                            float f19 = fArr[i];
                            if (f19 < rectF.left) {
                                rectF.left = f19;
                            }
                            if (f19 > rectF.right) {
                                rectF.right = f19;
                            }
                            float f20 = fArr[i + 1];
                            if (f20 < rectF.top) {
                                rectF.top = f20;
                            }
                            if (f20 > rectF.bottom) {
                                rectF.bottom = f20;
                            }
                        }
                        float f21 = rectF.left;
                        float f22 = rectF.top;
                        w0dVar2 = new w0d(f21, f22, rectF.right - f21, rectF.bottom - f22);
                        float floor2 = (((float) Math.floor((w0dVar2.b - f5) / f4)) * f4) + f5;
                        float c7 = w0dVar2.c();
                        d = w0dVar2.d();
                        w0d w0dVar6 = new w0d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, f);
                        a0 = a0();
                        for (floor = (((float) Math.floor((w0dVar2.c - f3) / f)) * f) + f3; floor < d; floor += f) {
                            float f23 = floor2;
                            while (f23 < c7) {
                                w0dVar6.b = f23;
                                w0dVar6.c = floor;
                                m0();
                                if (((tng) this.c).a.o.booleanValue()) {
                                    f6 = d;
                                    f7 = floor2;
                                } else {
                                    f6 = d;
                                    f7 = floor2;
                                    j0(w0dVar6.b, w0dVar6.c, w0dVar6.d, w0dVar6.e);
                                }
                                w0d w0dVar7 = imgVar.o;
                                if (w0dVar7 != null) {
                                    canvas.concat(s(w0dVar6, w0dVar7, f6fVar));
                                } else {
                                    Boolean bool2 = imgVar.q;
                                    boolean z5 = (bool2 == null || bool2.booleanValue()) ? z : z2;
                                    canvas.translate(f23, floor);
                                    if (!z5) {
                                        w0d w0dVar8 = tmgVar.h;
                                        canvas.scale(w0dVar8.d, w0dVar8.e);
                                    }
                                }
                                Iterator it = imgVar.i.iterator();
                                while (it.hasNext()) {
                                    e0((wmg) it.next());
                                }
                                l0();
                                f23 += f4;
                                d = f6;
                                floor2 = f7;
                            }
                        }
                        if (a0) {
                            Y(imgVar.h);
                        }
                        l0();
                        return;
                    }
                }
                f5 = f2;
                z = true;
                z2 = false;
                float floor22 = (((float) Math.floor((w0dVar2.b - f5) / f4)) * f4) + f5;
                float c72 = w0dVar2.c();
                d = w0dVar2.d();
                w0d w0dVar62 = new w0d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, f);
                a0 = a0();
                while (floor < d) {
                }
                if (a0) {
                }
                l0();
                return;
            }
        }
        canvas.drawPath(path, ((tng) this.c).d);
    }

    @Override // defpackage.v4o
    /* renamed from: zza */
    public Object zzh() {
        String str = (String) this.a;
        zzemh zzemhVar = (zzemh) this.b;
        String str2 = (String) this.c;
        WebView webView = (WebView) this.d;
        String str3 = (String) this.e;
        zzemi zzemiVar = (zzemi) this.f;
        if (TextUtils.isEmpty("Google")) {
            a70.p("Name is null or empty");
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            a70.p("Version is null or empty");
            return null;
        }
        zzfwa zzfwaVar = new zzfwa("Google", str);
        zzfvz j = zzemf.j("javascript");
        zzfvr l = zzemf.l(zzemhVar.a);
        zzfvz zzfvzVar = zzfvz.NONE;
        if (j == zzfvzVar) {
            int i = zze.zza;
            zzo.zzi("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (l == null) {
            String valueOf = String.valueOf(zzemhVar);
            int i2 = zze.zza;
            zzo.zzi("Omid html session error; Unable to parse creative type: ".concat(valueOf));
            return null;
        }
        zzfvz j2 = zzemf.j(str2);
        if (l == zzfvr.VIDEO && j2 == zzfvzVar) {
            String valueOf2 = String.valueOf(str2);
            int i3 = zze.zza;
            zzo.zzi("Omid html session error; Video events owner unknown for video creative: ".concat(valueOf2));
            return null;
        }
        zzfvo zzfvoVar = new zzfvo(zzfwaVar, webView, str3, "", zzfvp.HTML);
        zzfvn a = zzfvn.a(l, zzemf.k(zzemiVar.a), j, j2, true);
        if (zzfvk.a.a) {
            return new zzeml(new zzfvq(a, zzfvoVar, UUID.randomUUID().toString()), zzfvoVar);
        }
        a70.r("Method called before OM SDK activation");
        return null;
    }

    @Override // defpackage.z7p, com.google.android.gms.internal.ads.zzhcv
    public /* synthetic */ void zzb(Object obj) {
        final fl flVar = (fl) this.a;
        final String str = (String) this.b;
        final List list = (List) this.c;
        final SortedSet sortedSet = (SortedSet) this.d;
        final b2p b2pVar = (b2p) this.e;
        final WebViewInitData webViewInitData = (WebViewInitData) obj;
        ((l6n) this.f).k.post(new Runnable() { // from class: y8p
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                sx2 sx2Var;
                mun munVar;
                l6n l6nVar = (l6n) vng.this.f;
                b7p b7pVar = l6nVar.f;
                t6o t6oVar = l6nVar.c;
                gbo gboVar = l6nVar.b;
                boolean d = l6nVar.j.d();
                WebViewInitData webViewInitData2 = webViewInitData;
                if (!d) {
                    WebView webView = webViewInitData2.webView;
                    p03 p03Var = webViewInitData2.omidInitializer.c;
                    ViewGroup viewGroup = gboVar.a;
                    HashSet hashSet = new HashSet(gboVar.c);
                    Boolean enableOmidJsManagedSessions = webViewInitData2.initData.enableOmidJsManagedSessions();
                    if (enableOmidJsManagedSessions == null || !enableOmidJsManagedSessions.booleanValue() || p03Var == null) {
                        mqn mqnVar = l6nVar.a;
                        l8o l8oVar = webViewInitData2.omidInitializer;
                        new n8o();
                        oun ounVar = new oun(mqnVar, webView, l8oVar, viewGroup);
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            ounVar.d((as8) it.next());
                        }
                        munVar = ounVar;
                    } else {
                        munVar = new mun(p03Var, viewGroup);
                        Iterator it2 = hashSet.iterator();
                        while (it2.hasNext()) {
                            munVar.d((as8) it2.next());
                        }
                    }
                    gboVar.d = munVar;
                    l6nVar.j = new e2p(munVar);
                }
                nxn nxnVar = (nxn) l6nVar.j.g();
                nxnVar.n(null);
                fl flVar2 = flVar;
                gl glVar = (gl) flVar2;
                hpo hpoVar = glVar.d;
                if (hpoVar != null) {
                    sx2Var = new sx2();
                    sx2Var.b = new ArrayList(1);
                    sx2Var.a = new Handler(Looper.getMainLooper());
                    sx2Var.c = hpoVar;
                } else {
                    sx2Var = null;
                }
                SortedSet sortedSet2 = sortedSet;
                tf tfVar = (sortedSet2 == null || sortedSet2.isEmpty() || sx2Var != null) ? null : new tf(2, 21, "Unable to handle cue points, no content progress provider configured.", null);
                if (tfVar != null) {
                    l6nVar.h.v(new zjo(tfVar, glVar.j));
                    return;
                }
                ViewGroup viewGroup2 = gboVar.a;
                mqn mqnVar2 = l6nVar.a;
                f0o f0oVar = new f0o(webViewInitData2.webView, viewGroup2);
                c0l c0lVar = new c0l(t6oVar);
                Context context = l6nVar.g;
                boolean booleanValue = ((Boolean) b2pVar.h(Boolean.FALSE)).booleanValue();
                String str2 = str;
                cjn cjnVar = new cjn(str2, mqnVar2, f0oVar, gboVar, list, new mvn(str2, mqnVar2, c0lVar, gboVar), sx2Var, new c7o(str2, mqnVar2, viewGroup2, b7pVar), nxnVar, c0lVar, b7pVar, context, booleanValue, sortedSet2);
                nxn nxnVar2 = cjnVar.g;
                String str3 = cjnVar.b;
                nxnVar2.zzf(str3);
                ArrayList arrayList = cjnVar.c;
                arrayList.add(nxnVar2);
                c0l c0lVar2 = cjnVar.d;
                ((List) c0lVar2.b).add(nxnVar2);
                JavaScriptMessage$MsgChannel javaScriptMessage$MsgChannel = JavaScriptMessage$MsgChannel.adsManager;
                rmn rmnVar = new rmn(cjnVar);
                mqn mqnVar3 = cjnVar.a;
                mqnVar3.c(str3, javaScriptMessage$MsgChannel, rmnVar);
                mqnVar3.c(str3, JavaScriptMessage$MsgChannel.nativeUi, new gnn());
                JavaScriptMessage$MsgChannel javaScriptMessage$MsgChannel2 = JavaScriptMessage$MsgChannel.videoDisplay1;
                z0o z0oVar = cjnVar.h;
                mqnVar3.c(str3, javaScriptMessage$MsgChannel2, z0oVar);
                mqnVar3.c(str3, JavaScriptMessage$MsgChannel.videoDisplay2, z0oVar);
                mqnVar3.c(str3, JavaScriptMessage$MsgChannel.displayContainer, new vmn(cjnVar, 0));
                mqnVar3.c(str3, JavaScriptMessage$MsgChannel.activityMonitor, cjnVar.f);
                gmn gmnVar = new gmn(cjnVar);
                vdb vdbVar = mqnVar3.b;
                ((Set) vdbVar.i).add(gmnVar);
                if (vdbVar.a) {
                    gmnVar.zza();
                }
                Context applicationContext = cjnVar.e.getApplicationContext();
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application != null) {
                    tgn tgnVar = new tgn(application);
                    cjnVar.o = tgnVar;
                    ((ArrayList) tgnVar.c).add(cjnVar);
                }
                if (cjnVar.s != null) {
                    ((ArrayList) cjnVar.s.b).add(new pon(mqnVar3, cjnVar.t, str3));
                    sx2 sx2Var2 = cjnVar.s;
                    ((Handler) sx2Var2.a).removeCallbacksAndMessages(null);
                    sx2Var2.Q();
                }
                ((List) c0lVar2.b).add(cjnVar);
                Object obj2 = glVar.j;
                for (zg zgVar : l6nVar.i) {
                    ah ahVar = zgVar.a;
                    List list2 = (List) c0lVar2.b;
                    Object obj3 = ahVar.p;
                    wi5 wi5Var = ahVar.a;
                    if (obj3 != obj2) {
                        cjnVar.g();
                    } else {
                        ahVar.p = null;
                        ahVar.u = cjnVar;
                        list2.add(zgVar);
                        list2.add((uf) wi5Var.b);
                        arrayList.add(zgVar);
                        arrayList.add((wf) wi5Var.c);
                        try {
                            Object obj4 = ahVar.e;
                            List list3 = cjnVar.r;
                            m3p m3pVar = q3p.b;
                            v4p v4pVar = v4p.e;
                            if (list3 == null) {
                                if (v4pVar == null) {
                                    throw new NullPointerException("Both parameters are null");
                                }
                                list3 = v4pVar;
                            }
                            ahVar.z = new kg(obj4, m6k.D(list3));
                            ahVar.x();
                        } catch (RuntimeException e) {
                            ahVar.r(e, "onAdsManagerLoaded");
                        }
                    }
                }
                sen b = t6oVar.b(str2);
                qen s = ((uen) b.b).s();
                r9n r9nVar = (r9n) s.r(5);
                r9nVar.d(s);
                pen penVar = (pen) r9nVar;
                pen s2 = qen.s();
                s2.g(System.currentTimeMillis());
                penVar.d((qen) s2.c());
                b.b();
                ((uen) b.b).D((qen) penVar.c());
                ((gl) flVar2).a.getClass();
                e8p.b.addListener(new vlo(27, l6nVar, str2), b7pVar);
            }
        });
    }

    public /* synthetic */ vng(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
    }

    public vng(Context context) {
        this.a = context.getApplicationContext();
        this.b = jt9.o;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = new rl6();
    }

    @Override // com.google.android.gms.internal.ads.zzdod, com.google.android.gms.internal.ads.zzdcw
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public fvn zzh() {
        zzioe.b(zzdjp.class, (zzdjp) this.d);
        zzioe.b(zzdcz.class, (zzdcz) this.e);
        zzioe.b(zzesg.class, (zzesg) this.f);
        new zzczr();
        new zzfnc();
        new zzdbu();
        return new fvn((uun) this.a, new zzeay(), (zzdjp) this.d, (zzdcz) this.e, new zzeqk(), (zzesg) this.f, (zzfiy) this.b, (zzfic) this.c);
    }

    @Override // defpackage.z7p, com.google.android.gms.internal.ads.zzhcv
    public void zza(Throwable th) {
        ((l6n) this.f).h.v(new zjo(new tf(1, 1, "Error initializing the SDK", null)));
    }
}
