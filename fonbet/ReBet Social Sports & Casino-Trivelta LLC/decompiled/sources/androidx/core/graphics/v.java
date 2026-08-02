package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.res.h;
import androidx.core.content.res.k;
import java.io.IOException;
import java.util.List;
import v0.i;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final C f19106a;

    /* renamed from: b, reason: collision with root package name */
    public static final z.j f19107b;

    /* renamed from: c, reason: collision with root package name */
    public static Paint f19108c;

    public static class a extends i.c {

        /* renamed from: a, reason: collision with root package name */
        public k.e f19109a;

        public a(k.e eVar) {
            this.f19109a = eVar;
        }

        @Override // v0.i.c
        public void a(int i10) {
            k.e eVar = this.f19109a;
            if (eVar != null) {
                eVar.f(i10);
            }
        }

        @Override // v0.i.c
        public void b(Typeface typeface) {
            k.e eVar = this.f19109a;
            if (eVar != null) {
                eVar.g(typeface);
            }
        }
    }

    static {
        K2.a.c("TypefaceCompat static init");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            f19106a = new B();
        } else if (i10 >= 29) {
            f19106a = new A();
        } else if (i10 >= 28) {
            f19106a = new z();
        } else if (i10 >= 26) {
            f19106a = new y();
        } else if (x.k()) {
            f19106a = new x();
        } else {
            f19106a = new w();
        }
        f19107b = new z.j(16);
        f19108c = null;
        K2.a.f();
    }

    public static Typeface a(Context context, Typeface typeface, int i10) {
        if (context != null) {
            return Typeface.create(typeface, i10);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, i.b[] bVarArr, int i10) {
        K2.a.c("TypefaceCompat.createFromFontInfo");
        try {
            return f19106a.b(context, cancellationSignal, bVarArr, i10);
        } finally {
            K2.a.f();
        }
    }

    public static Typeface c(Context context, CancellationSignal cancellationSignal, List list, int i10) {
        K2.a.c("TypefaceCompat.createFromFontInfoWithFallback");
        try {
            return f19106a.c(context, cancellationSignal, list, i10);
        } finally {
            K2.a.f();
        }
    }

    public static Typeface d(Context context, h.b bVar, Resources resources, int i10, String str, int i11, int i12, k.e eVar, Handler handler, boolean z10) {
        Typeface a10;
        if (bVar instanceof h.e) {
            h.e eVar2 = (h.e) bVar;
            Typeface i13 = i(eVar2);
            if (i13 != null) {
                if (eVar != null) {
                    eVar.d(i13, handler);
                }
                f19107b.put(f(resources, i10, str, i11, i12), i13);
                return i13;
            }
            a10 = v0.i.c(context, eVar2.b(), i12, !z10 ? eVar != null : eVar2.a() != 0, z10 ? eVar2.d() : -1, k.e.e(handler), new a(eVar));
        } else {
            a10 = f19106a.a(context, (h.c) bVar, resources, i12);
            if (eVar != null) {
                if (a10 != null) {
                    eVar.d(a10, handler);
                } else {
                    eVar.c(-3, handler);
                }
            }
        }
        if (a10 != null) {
            f19107b.put(f(resources, i10, str, i11, i12), a10);
        }
        return a10;
    }

    public static Typeface e(Context context, Resources resources, int i10, String str, int i11, int i12) {
        Typeface e10 = f19106a.e(context, resources, i10, str, i12);
        if (e10 != null) {
            f19107b.put(f(resources, i10, str, i11, i12), e10);
        }
        return e10;
    }

    public static String f(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }

    public static Typeface g(Resources resources, int i10, String str, int i11, int i12) {
        return (Typeface) f19107b.get(f(resources, i10, str, i11, i12));
    }

    public static Typeface h(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface create = Typeface.create(str, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create != null && !create.equals(create2)) {
                return create;
            }
        }
        return null;
    }

    public static Typeface i(h.e eVar) {
        Typeface build;
        Font.Builder fontVariationSettings;
        Font build2;
        FontFamily build3;
        Typeface h10;
        String c10 = eVar.c();
        if (!TextUtils.isEmpty(c10) && (h10 = h(c10)) != null) {
            return h10;
        }
        List b10 = eVar.b();
        int i10 = 0;
        if (b10.size() == 1) {
            return h(((v0.e) b10.get(0)).h());
        }
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        for (int i11 = 0; i11 < b10.size(); i11++) {
            if (h(((v0.e) b10.get(i11)).h()) == null) {
                return null;
            }
        }
        Typeface.CustomFallbackBuilder customFallbackBuilder = null;
        while (true) {
            if (i10 >= b10.size()) {
                break;
            }
            v0.e eVar2 = (v0.e) b10.get(i10);
            if (i10 == b10.size() - 1 && TextUtils.isEmpty(eVar2.i())) {
                customFallbackBuilder.setSystemFallback(eVar2.h());
                break;
            }
            Font j10 = j(h(eVar2.h()));
            if (j10 == null) {
                Log.w("TypefaceCompat", "Unable identify the primary font for " + eVar2.h() + ". Falling back to provider font.");
                return null;
            }
            if (TextUtils.isEmpty(eVar2.i())) {
                try {
                    k.a();
                    l.a();
                    fontVariationSettings = u.a(j10).setFontVariationSettings(eVar2.i());
                    build2 = fontVariationSettings.build();
                    build3 = i.a(build2).build();
                } catch (IOException unused) {
                    Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            } else {
                build3 = i.a(j10).build();
            }
            if (customFallbackBuilder == null) {
                customFallbackBuilder = j.a(build3);
            } else {
                customFallbackBuilder.addCustomFallback(build3);
            }
            i10++;
        }
        build = customFallbackBuilder.build();
        return build;
    }

    public static Font j(Typeface typeface) {
        PositionedGlyphs shapeTextRun;
        int glyphCount;
        Font font;
        if (f19108c == null) {
            f19108c = new Paint();
        }
        f19108c.setTextSize(10.0f);
        f19108c.setTypeface(typeface);
        shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f19108c);
        glyphCount = shapeTextRun.glyphCount();
        if (glyphCount == 0) {
            return null;
        }
        font = shapeTextRun.getFont(0);
        return font;
    }
}
