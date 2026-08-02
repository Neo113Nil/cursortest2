package g0;

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
import androidx.viewpager2.widget.o;
import e6.r;
import io.sentry.android.core.w0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import s.n;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final a.a f9683a;

    /* renamed from: b, reason: collision with root package name */
    public static final s.l f9684b;

    /* renamed from: c, reason: collision with root package name */
    public static Paint f9685c;

    static {
        Trace.beginSection(m4.g.B("TypefaceCompat static init"));
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 31) {
            f9683a = new m();
        } else if (i5 >= 29) {
            f9683a = new l();
        } else if (i5 >= 28) {
            f9683a = new k();
        } else if (i5 >= 26) {
            f9683a = new j();
        } else {
            if (i5 >= 24) {
                Method method = i.f9693g;
                if (method == null) {
                    w0.m("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    f9683a = new i();
                }
            }
            f9683a = new h();
        }
        f9684b = new s.l(16);
        f9685c = null;
        Trace.endSection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Typeface a(Context context, f0.d dVar, Resources resources, int i5, String str, int i10, int i11, f0.j jVar, boolean z5) {
        Typeface build;
        FontFamily build2;
        Typeface typeface = null;
        int i12 = -3;
        if (dVar instanceof f0.g) {
            f0.g gVar = (f0.g) dVar;
            String str2 = gVar.f9287d;
            int i13 = 1;
            boolean z7 = false;
            Object[] objArr = 0;
            if (TextUtils.isEmpty(str2) || (build = c(str2)) == null) {
                ArrayList arrayList = gVar.f9284a;
                if (arrayList.size() == 1) {
                    build = c(((m0.d) arrayList.get(0)).f20114e);
                } else {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i14 = 0;
                        while (true) {
                            if (i14 >= arrayList.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= arrayList.size()) {
                                        break;
                                    }
                                    m0.d dVar2 = (m0.d) arrayList.get(i15);
                                    if (i15 == arrayList.size() - 1 && TextUtils.isEmpty(dVar2.f20115f)) {
                                        customFallbackBuilder.setSystemFallback(dVar2.f20114e);
                                        break;
                                    }
                                    String str3 = dVar2.f20114e;
                                    String str4 = dVar2.f20115f;
                                    Font d10 = d(c(str3));
                                    if (d10 == null) {
                                        w0.m("TypefaceCompat", "Unable identify the primary font for " + dVar2.f20114e + ". Falling back to provider font.");
                                        break;
                                    }
                                    if (TextUtils.isEmpty(str4)) {
                                        try {
                                            build2 = new FontFamily.Builder(androidx.core.view.c.a(d10).setFontVariationSettings(str4).build()).build();
                                        } catch (IOException unused) {
                                            w0.d("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                        }
                                    } else {
                                        build2 = new FontFamily.Builder(d10).build();
                                    }
                                    if (customFallbackBuilder == null) {
                                        customFallbackBuilder = new Typeface.CustomFallbackBuilder(build2);
                                    } else {
                                        customFallbackBuilder.addCustomFallback(build2);
                                    }
                                    i15++;
                                }
                                build = customFallbackBuilder.build();
                            } else {
                                if (c(((m0.d) arrayList.get(i14)).f20114e) == null) {
                                    break;
                                }
                                i14++;
                            }
                        }
                    }
                    build = null;
                }
            }
            if (build != null) {
                if (jVar != null) {
                    jVar.callbackSuccessAsync(build, null);
                }
                f9684b.d(b(resources, i5, str, i10, i11), build);
                return build;
            }
            Object[] objArr2 = !z5 ? jVar != null : gVar.f9286c != 0;
            int i16 = z5 ? gVar.f9285b : -1;
            Handler handler = f0.j.getHandler(null);
            h9.c cVar = new h9.c(26, z7);
            cVar.f10430b = jVar;
            ArrayList arrayList2 = gVar.f9284a;
            r rVar = new r(handler);
            io.sentry.util.network.b bVar = new io.sentry.util.network.b(5, cVar, rVar);
            int i17 = 24;
            if (objArr2 != true) {
                String a7 = m0.h.a(i11, arrayList2);
                Typeface typeface2 = (Typeface) m0.h.f20126a.c(a7);
                if (typeface2 != null) {
                    rVar.execute(new g8.a(i17, cVar, typeface2));
                    typeface = typeface2;
                } else {
                    m0.f fVar = new m0.f(objArr == true ? 1 : 0, bVar);
                    synchronized (m0.h.f20128c) {
                        try {
                            n nVar = m0.h.f20129d;
                            ArrayList arrayList3 = (ArrayList) nVar.get(a7);
                            if (arrayList3 != null) {
                                arrayList3.add(fVar);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(fVar);
                                nVar.put(a7, arrayList4);
                                m0.e eVar = new m0.e(a7, context, arrayList2, i11, 1);
                                ThreadPoolExecutor threadPoolExecutor = m0.h.f20127b;
                                m0.f fVar2 = new m0.f(i13, a7);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                b6.i iVar = new b6.i();
                                iVar.f3053b = eVar;
                                iVar.f3054c = fVar2;
                                iVar.f3055d = handler2;
                                threadPoolExecutor.execute(iVar);
                            }
                        } finally {
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
                }
                m0.d dVar3 = (m0.d) arrayList2.get(0);
                s.l lVar = m0.h.f20126a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{dVar3}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String a10 = m0.h.a(i11, DesugarCollections.unmodifiableList(arrayList5));
                Typeface typeface3 = (Typeface) m0.h.f20126a.c(a10);
                if (typeface3 != null) {
                    rVar.execute(new g8.a(i17, cVar, typeface3));
                    typeface = typeface3;
                } else if (i16 == -1) {
                    Object[] objArr3 = {dVar3};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = objArr3[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    m0.g b10 = m0.h.b(a10, context, DesugarCollections.unmodifiableList(arrayList6), i11);
                    bVar.k(b10);
                    typeface = b10.f20124a;
                } else {
                    try {
                        try {
                            try {
                                m0.g gVar2 = (m0.g) m0.h.f20127b.submit(new m0.e(a10, context, dVar3, i11, 0)).get(i16, TimeUnit.MILLISECONDS);
                                bVar.k(gVar2);
                                typeface = gVar2.f20124a;
                            } catch (InterruptedException e7) {
                                throw e7;
                            }
                        } catch (ExecutionException e9) {
                            throw new RuntimeException(e9);
                        } catch (TimeoutException unused2) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused3) {
                        ((r) bVar.f17177c).execute(new o(i12, 3, (h9.c) bVar.f17176b));
                    }
                }
            }
        } else {
            Typeface k6 = f9683a.k(context, (f0.e) dVar, resources, i11);
            if (jVar != null) {
                if (k6 != null) {
                    jVar.callbackSuccessAsync(k6, null);
                } else {
                    jVar.callbackFailAsync(-3, null);
                }
            }
            typeface = k6;
        }
        if (typeface != null) {
            f9684b.d(b(resources, i5, str, i10, i11), typeface);
        }
        return typeface;
    }

    public static String b(Resources resources, int i5, String str, int i10, int i11) {
        return resources.getResourcePackageName(i5) + '-' + str + '-' + i10 + '-' + i5 + '-' + i11;
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
        if (f9685c == null) {
            f9685c = new Paint();
        }
        f9685c.setTextSize(10.0f);
        f9685c.setTypeface(typeface);
        PositionedGlyphs shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f9685c);
        if (shapeTextRun.glyphCount() == 0) {
            return null;
        }
        return shapeTextRun.getFont(0);
    }
}
