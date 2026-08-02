package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class x5k {
    public static final h5a a;
    public static final zmb b;
    public static Paint c;

    static {
        Trace.beginSection(h5a.U("TypefaceCompat static init"));
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            a = new c6k();
        } else if (i >= 29) {
            a = new b6k();
        } else if (i >= 28) {
            a = new a6k();
        } else {
            a = new z5k();
        }
        b = new zmb(16);
        c = null;
        Trace.endSection();
    }

    public static Typeface a(Context context, kg8 kg8Var, Resources resources, int i, String str, int i2, int i3, t6a t6aVar, boolean z) {
        Typeface G;
        Typeface build;
        FontFamily build2;
        int i4 = 27;
        int i5 = -3;
        if (kg8Var instanceof ng8) {
            ng8 ng8Var = (ng8) kg8Var;
            String str2 = ng8Var.d;
            Typeface typeface = null;
            int i6 = 1;
            char c2 = 0;
            if (TextUtils.isEmpty(str2) || (build = c(str2)) == null) {
                ArrayList arrayList = ng8Var.a;
                if (arrayList.size() == 1) {
                    build = c(((dg8) arrayList.get(0)).e);
                } else {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i7 = 0;
                        while (true) {
                            if (i7 >= arrayList.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                int i8 = 0;
                                while (true) {
                                    if (i8 >= arrayList.size()) {
                                        break;
                                    }
                                    dg8 dg8Var = (dg8) arrayList.get(i8);
                                    if (i8 == arrayList.size() - 1 && TextUtils.isEmpty(dg8Var.f)) {
                                        customFallbackBuilder.setSystemFallback(dg8Var.e);
                                        break;
                                    }
                                    String str3 = dg8Var.e;
                                    String str4 = dg8Var.f;
                                    Font d = d(c(str3));
                                    if (d == null) {
                                        break;
                                    }
                                    if (TextUtils.isEmpty(str4)) {
                                        build2 = new FontFamily.Builder(d).build();
                                    } else {
                                        try {
                                            build2 = new FontFamily.Builder(pz.a(d).setFontVariationSettings(str4).build()).build();
                                        } catch (IOException unused) {
                                        }
                                    }
                                    if (customFallbackBuilder == null) {
                                        customFallbackBuilder = new Typeface.CustomFallbackBuilder(build2);
                                    } else {
                                        customFallbackBuilder.addCustomFallback(build2);
                                    }
                                    i8++;
                                }
                                build = customFallbackBuilder.build();
                            } else {
                                if (c(((dg8) arrayList.get(i7)).e) == null) {
                                    break;
                                }
                                i7++;
                            }
                        }
                    }
                    build = null;
                }
            }
            if (build != null) {
                if (t6aVar != null) {
                    new Handler(Looper.getMainLooper()).post(new gjc(i4, t6aVar, build));
                }
                b.d(b(resources, i, str, i2, i3), build);
                return build;
            }
            boolean z2 = !z ? t6aVar != null : ng8Var.c != 0;
            int i9 = z ? ng8Var.b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            yia yiaVar = new yia(c2, 24);
            yiaVar.b = t6aVar;
            ArrayList arrayList2 = ng8Var.a;
            int i10 = 3;
            m10 m10Var = new m10(handler, 3);
            z41 z41Var = new z41(4, yiaVar, m10Var);
            if (!z2) {
                String a2 = jg8.a(i3, arrayList2);
                Typeface typeface2 = (Typeface) jg8.a.c(a2);
                if (typeface2 != null) {
                    m10Var.execute(new pyn(i10, yiaVar, typeface2));
                    typeface = typeface2;
                } else {
                    hg8 hg8Var = new hg8(z41Var, c2);
                    synchronized (jg8.c) {
                        try {
                            fhh fhhVar = jg8.d;
                            ArrayList arrayList3 = (ArrayList) fhhVar.get(a2);
                            if (arrayList3 != null) {
                                arrayList3.add(hg8Var);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(hg8Var);
                                fhhVar.put(a2, arrayList4);
                                gg8 gg8Var = new gg8(a2, context, arrayList2, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = jg8.b;
                                hg8 hg8Var2 = new hg8(a2, i6);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                lv4 lv4Var = new lv4();
                                lv4Var.c = gg8Var;
                                lv4Var.b = hg8Var2;
                                lv4Var.d = handler2;
                                threadPoolExecutor.execute(lv4Var);
                            }
                        } finally {
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    a70.p("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
                dg8 dg8Var2 = (dg8) arrayList2.get(0);
                zmb zmbVar = jg8.a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{dg8Var2}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String a3 = jg8.a(i3, Collections.unmodifiableList(arrayList5));
                Typeface typeface3 = (Typeface) jg8.a.c(a3);
                if (typeface3 != null) {
                    m10Var.execute(new pyn(i10, yiaVar, typeface3));
                    typeface = typeface3;
                } else if (i9 == -1) {
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = new Object[]{dg8Var2}[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    ig8 b2 = jg8.b(context, Collections.unmodifiableList(arrayList6), a3, i3);
                    z41Var.u(b2);
                    typeface = b2.a;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    ig8 ig8Var = (ig8) jg8.b.submit(new gg8(a3, context, dg8Var2, i3, 0)).get(i9, TimeUnit.MILLISECONDS);
                                    z41Var.u(ig8Var);
                                    typeface = ig8Var.a;
                                } catch (ExecutionException e) {
                                    throw new RuntimeException(e);
                                }
                            } catch (TimeoutException unused2) {
                                throw new InterruptedException("timeout");
                            }
                        } catch (InterruptedException e2) {
                            throw e2;
                        }
                    } catch (InterruptedException unused3) {
                        ((m10) z41Var.c).execute(new q61((yia) z41Var.b, i5, i6));
                    }
                }
            }
            G = typeface;
        } else {
            G = a.G(context, (lg8) kg8Var, resources, i3);
            if (t6aVar != null) {
                if (G != null) {
                    new Handler(Looper.getMainLooper()).post(new gjc(i4, t6aVar, G));
                } else {
                    t6aVar.p(-3);
                }
            }
        }
        if (G != null) {
            b.d(b(resources, i, str, i2, i3), G);
        }
        return G;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface create = Typeface.create(str, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create != null && !create.equals(create2)) {
                return create;
            }
        }
        return null;
    }

    public static Font d(Typeface typeface) {
        Paint paint = c;
        if (paint == null) {
            paint = new Paint();
            c = paint;
        }
        paint.setTextSize(10.0f);
        c.setTypeface(typeface);
        PositionedGlyphs shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, c);
        if (shapeTextRun.glyphCount() == 0) {
            return null;
        }
        return shapeTextRun.getFont(0);
    }
}
