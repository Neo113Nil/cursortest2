package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import com.sports.insider.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a3 {

    /* renamed from: i, reason: collision with root package name */
    public static a3 f687i;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f688a;

    /* renamed from: b, reason: collision with root package name */
    public s.n f689b;

    /* renamed from: c, reason: collision with root package name */
    public s.o f690c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakHashMap f691d = new WeakHashMap(0);

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f692e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f693f;

    /* renamed from: g, reason: collision with root package name */
    public a0 f694g;

    /* renamed from: h, reason: collision with root package name */
    public static final PorterDuff.Mode f686h = PorterDuff.Mode.SRC_IN;
    public static final y2 j = new y2(6);

    public static synchronized a3 d() {
        a3 a3Var;
        synchronized (a3.class) {
            try {
                if (f687i == null) {
                    a3 a3Var2 = new a3();
                    f687i = a3Var2;
                    j(a3Var2);
                }
                a3Var = f687i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a3Var;
    }

    public static synchronized PorterDuffColorFilter h(int i5, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (a3.class) {
            y2 y2Var = j;
            y2Var.getClass();
            int i10 = (31 + i5) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) y2Var.c(Integer.valueOf(mode.hashCode() + i10));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i5, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public static void j(a3 a3Var) {
        if (Build.VERSION.SDK_INT < 24) {
            a3Var.a("vector", new z2(3));
            a3Var.a("animated-vector", new z2(2));
            a3Var.a("animated-selector", new z2(1));
            a3Var.a("drawable", new z2(0));
        }
    }

    public final void a(String str, z2 z2Var) {
        if (this.f689b == null) {
            this.f689b = new s.n(0);
        }
        this.f689b.put(str, z2Var);
    }

    public final synchronized void b(Context context, long j6, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                s.j jVar = (s.j) this.f691d.get(context);
                if (jVar == null) {
                    jVar = new s.j();
                    this.f691d.put(context, jVar);
                }
                jVar.h(j6, new WeakReference(constantState));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final Drawable c(Context context, int i5) {
        if (this.f692e == null) {
            this.f692e = new TypedValue();
        }
        TypedValue typedValue = this.f692e;
        context.getResources().getValue(i5, typedValue, true);
        long j6 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e7 = e(context, j6);
        if (e7 != null) {
            return e7;
        }
        LayerDrawable layerDrawable = null;
        if (this.f694g != null) {
            if (i5 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{f(context, R.drawable.abc_cab_background_internal_bg), f(context, 2131230800)});
            } else if (i5 == R.drawable.abc_ratingbar_material) {
                layerDrawable = a0.w(this, context, R.dimen.abc_star_big);
            } else if (i5 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = a0.w(this, context, R.dimen.abc_star_medium);
            } else if (i5 == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = a0.w(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j6, layerDrawable);
        }
        return layerDrawable;
    }

    public final synchronized Drawable e(Context context, long j6) {
        s.j jVar = (s.j) this.f691d.get(context);
        if (jVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) jVar.e(j6);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int b10 = t.a.b(jVar.f22561b, jVar.f22563d, j6);
            if (b10 >= 0) {
                Object[] objArr = jVar.f22562c;
                Object obj = objArr[b10];
                Object obj2 = s.k.f22564a;
                if (obj != obj2) {
                    objArr[b10] = obj2;
                    jVar.f22560a = true;
                }
            }
        }
        return null;
    }

    public final synchronized Drawable f(Context context, int i5) {
        return g(context, i5, false);
    }

    public final synchronized Drawable g(Context context, int i5, boolean z5) {
        Drawable k6;
        try {
            if (!this.f693f) {
                this.f693f = true;
                Drawable f6 = f(context, R.drawable.abc_vector_test);
                if (f6 == null || (!(f6 instanceof androidx.vectordrawable.graphics.drawable.t) && !"android.graphics.drawable.VectorDrawable".equals(f6.getClass().getName()))) {
                    this.f693f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            k6 = k(context, i5);
            if (k6 == null) {
                k6 = c(context, i5);
            }
            if (k6 == null) {
                k6 = context.getDrawable(i5);
            }
            if (k6 != null) {
                k6 = n(context, i5, z5, k6);
            }
            if (k6 != null) {
                z1.a(k6);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return k6;
    }

    public final synchronized ColorStateList i(Context context, int i5) {
        ColorStateList colorStateList;
        s.o oVar;
        WeakHashMap weakHashMap = this.f688a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (oVar = (s.o) weakHashMap.get(context)) == null) ? null : (ColorStateList) oVar.d(i5);
        if (colorStateList == null) {
            a0 a0Var = this.f694g;
            if (a0Var != null) {
                colorStateList2 = a0Var.x(context, i5);
            }
            if (colorStateList2 != null) {
                if (this.f688a == null) {
                    this.f688a = new WeakHashMap();
                }
                s.o oVar2 = (s.o) this.f688a.get(context);
                if (oVar2 == null) {
                    oVar2 = new s.o(0);
                    this.f688a.put(context, oVar2);
                }
                oVar2.a(i5, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    public final Drawable k(Context context, int i5) {
        int next;
        s.n nVar = this.f689b;
        if (nVar == null || nVar.isEmpty()) {
            return null;
        }
        s.o oVar = this.f690c;
        if (oVar != null) {
            String str = (String) oVar.d(i5);
            if ("appcompat_skip_skip".equals(str)) {
                return null;
            }
            if (str != null && this.f689b.get(str) == null) {
                return null;
            }
        } else {
            this.f690c = new s.o(0);
        }
        if (this.f692e == null) {
            this.f692e = new TypedValue();
        }
        TypedValue typedValue = this.f692e;
        Resources resources = context.getResources();
        resources.getValue(i5, typedValue, true);
        long j6 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e7 = e(context, j6);
        if (e7 != null) {
            return e7;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i5);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f690c.a(i5, name);
                z2 z2Var = (z2) this.f689b.get(name);
                if (z2Var != null) {
                    e7 = z2Var.a(context, xml, asAttributeSet, context.getTheme());
                }
                if (e7 != null) {
                    e7.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, j6, e7);
                }
            } catch (Exception e9) {
                io.sentry.android.core.w0.e("ResourceManagerInternal", "Exception while inflating drawable", e9);
            }
        }
        if (e7 == null) {
            this.f690c.a(i5, "appcompat_skip_skip");
        }
        return e7;
    }

    public final synchronized void l(Context context) {
        s.j jVar = (s.j) this.f691d.get(context);
        if (jVar != null) {
            jVar.b();
        }
    }

    public final synchronized void m(a0 a0Var) {
        this.f694g = a0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable n(Context context, int i5, boolean z5, Drawable drawable) {
        int i10;
        boolean z7;
        int round;
        ColorStateList i11 = i(context, i5);
        PorterDuff.Mode mode = null;
        if (i11 != null) {
            Drawable mutate = drawable.mutate();
            mutate.setTintList(i11);
            if (this.f694g != null && i5 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                mutate.setTintMode(mode);
            }
            return mutate;
        }
        if (this.f694g != null) {
            if (i5 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int c2 = y3.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = b0.f701b;
                a0.C(findDrawableByLayerId, c2, mode2);
                a0.C(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), y3.c(context, R.attr.colorControlNormal), mode2);
                a0.C(layerDrawable.findDrawableByLayerId(android.R.id.progress), y3.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i5 == R.drawable.abc_ratingbar_material || i5 == R.drawable.abc_ratingbar_indicator_material || i5 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int b10 = y3.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = b0.f701b;
                a0.C(findDrawableByLayerId2, b10, mode3);
                a0.C(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), y3.c(context, R.attr.colorControlActivated), mode3);
                a0.C(layerDrawable2.findDrawableByLayerId(android.R.id.progress), y3.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        a0 a0Var = this.f694g;
        boolean z10 = false;
        if (a0Var != null) {
            PorterDuff.Mode mode4 = b0.f701b;
            if (a0.l((int[]) a0Var.f680b, i5)) {
                i10 = R.attr.colorControlNormal;
            } else if (a0.l((int[]) a0Var.f682d, i5)) {
                i10 = R.attr.colorControlActivated;
            } else {
                if (a0.l((int[]) a0Var.f683e, i5)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else if (i5 == 2131230820) {
                    round = Math.round(40.8f);
                    i10 = 16842800;
                    z7 = true;
                    if (z7) {
                        Drawable mutate2 = drawable.mutate();
                        mutate2.setColorFilter(b0.c(y3.c(context, i10), mode4));
                        if (round != -1) {
                            mutate2.setAlpha(round);
                        }
                        z10 = true;
                    }
                } else if (i5 != R.drawable.abc_dialog_material_background) {
                    i10 = 0;
                    z7 = false;
                    round = -1;
                    if (z7) {
                    }
                }
                i10 = 16842801;
            }
            z7 = true;
            round = -1;
            if (z7) {
            }
        }
        if (z10 || !z5) {
            return drawable;
        }
        return null;
    }
}
