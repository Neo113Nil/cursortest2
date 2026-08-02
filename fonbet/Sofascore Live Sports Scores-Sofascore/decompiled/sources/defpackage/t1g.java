package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.sofascore.results.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class t1g {
    public static t1g g;
    public WeakHashMap a;
    public final WeakHashMap b = new WeakHashMap(0);
    public TypedValue c;
    public boolean d;
    public ox9 e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static final s1g h = new s1g(6);

    public static synchronized t1g b() {
        t1g t1gVar;
        synchronized (t1g.class) {
            t1gVar = g;
            if (t1gVar == null) {
                t1gVar = new t1g();
                g = t1gVar;
            }
        }
        return t1gVar;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (t1g.class) {
            s1g s1gVar = h;
            s1gVar.getClass();
            int i2 = (31 + i) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) s1gVar.c(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public static void h(Drawable drawable, a08 a08Var, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = a08Var.b;
            if (!z && !a08Var.a) {
                drawable.clearColorFilter();
                return;
            }
            PorterDuffColorFilter porterDuffColorFilter = null;
            ColorStateList colorStateList = z ? (ColorStateList) a08Var.c : null;
            PorterDuff.Mode mode = a08Var.a ? (PorterDuff.Mode) a08Var.d : f;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = e(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilter);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cd A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable a(int i, Context context) {
        Drawable newDrawable;
        LayerDrawable j;
        TypedValue typedValue = this.c;
        if (typedValue == null) {
            typedValue = new TypedValue();
            this.c = typedValue;
        }
        context.getResources().getValue(i, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            nkb nkbVar = (nkb) this.b.get(context);
            if (nkbVar != null) {
                WeakReference weakReference = (WeakReference) nkbVar.c(j2);
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        newDrawable = constantState.newDrawable(context.getResources());
                    } else {
                        nkbVar.h(j2);
                    }
                }
            }
            newDrawable = null;
        }
        if (newDrawable != null) {
            return newDrawable;
        }
        if (this.e != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                j = new LayerDrawable(new Drawable[]{c(R.drawable.abc_cab_background_internal_bg, context), c(2131230995, context)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                j = ox9.j(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                j = ox9.j(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                j = ox9.j(this, context, R.dimen.abc_star_small);
            }
            if (j != null) {
                return j;
            }
            j.setChangingConfigurations(typedValue.changingConfigurations);
            synchronized (this) {
                try {
                    Drawable.ConstantState constantState2 = j.getConstantState();
                    if (constantState2 == null) {
                        return j;
                    }
                    nkb nkbVar2 = (nkb) this.b.get(context);
                    if (nkbVar2 == null) {
                        nkbVar2 = new nkb((Object) null);
                        this.b.put(context, nkbVar2);
                    }
                    nkbVar2.g(new WeakReference(constantState2), j2);
                    return j;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        j = null;
        if (j != null) {
        }
    }

    public final synchronized Drawable c(int i, Context context) {
        return d(i, false, context);
    }

    public final synchronized Drawable d(int i, boolean z, Context context) {
        Drawable a;
        try {
            if (!this.d) {
                this.d = true;
                Drawable c = c(R.drawable.abc_vector_test, context);
                if (c == null || (!(c instanceof gmk) && !"android.graphics.drawable.VectorDrawable".equals(c.getClass().getName()))) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            a = a(i, context);
            if (a == null) {
                a = context.getDrawable(i);
            }
            if (a != null) {
                a = g(context, i, z, a);
            }
            if (a != null) {
                fb5.a(a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }

    public final synchronized ColorStateList f(int i, Context context) {
        ColorStateList colorStateList;
        zwh zwhVar;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (zwhVar = (zwh) weakHashMap.get(context)) == null) ? null : (ColorStateList) gz8.C(zwhVar, i);
        if (colorStateList == null) {
            ox9 ox9Var = this.e;
            if (ox9Var != null) {
                colorStateList2 = ox9Var.l(i, context);
            }
            if (colorStateList2 != null) {
                WeakHashMap weakHashMap2 = this.a;
                if (weakHashMap2 == null) {
                    weakHashMap2 = new WeakHashMap();
                    this.a = weakHashMap2;
                }
                zwh zwhVar2 = (zwh) weakHashMap2.get(context);
                if (zwhVar2 == null) {
                    zwhVar2 = new zwh(0);
                    this.a.put(context, zwhVar2);
                }
                zwhVar2.a(i, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable g(Context context, int i, boolean z, Drawable drawable) {
        boolean z2;
        int round;
        ColorStateList f2 = f(i, context);
        PorterDuff.Mode mode = null;
        if (f2 != null) {
            Drawable mutate = drawable.mutate();
            mutate.setTintList(f2);
            if (this.e != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                mutate.setTintMode(mode);
            }
            return mutate;
        }
        ox9 ox9Var = this.e;
        int i2 = R.attr.colorControlNormal;
        if (ox9Var != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int c = wfj.c(R.attr.colorControlNormal, context);
                PorterDuff.Mode mode2 = xb0.b;
                ox9.q(findDrawableByLayerId, c, mode2);
                ox9.q(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), wfj.c(R.attr.colorControlNormal, context), mode2);
                ox9.q(layerDrawable.findDrawableByLayerId(android.R.id.progress), wfj.c(R.attr.colorControlActivated, context), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int b = wfj.b(R.attr.colorControlNormal, context);
                PorterDuff.Mode mode3 = xb0.b;
                ox9.q(findDrawableByLayerId2, b, mode3);
                ox9.q(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), wfj.c(R.attr.colorControlActivated, context), mode3);
                ox9.q(layerDrawable2.findDrawableByLayerId(android.R.id.progress), wfj.c(R.attr.colorControlActivated, context), mode3);
                return drawable;
            }
        }
        ox9 ox9Var2 = this.e;
        boolean z3 = false;
        if (ox9Var2 != null) {
            PorterDuff.Mode mode4 = xb0.b;
            if (!ox9.b(i, (int[]) ox9Var2.b)) {
                if (ox9.b(i, (int[]) ox9Var2.d)) {
                    i2 = R.attr.colorControlActivated;
                } else {
                    boolean b2 = ox9.b(i, (int[]) ox9Var2.e);
                    i2 = android.R.attr.colorBackground;
                    if (b2) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i == 2131231015) {
                        round = Math.round(40.8f);
                        i2 = android.R.attr.colorForeground;
                        z2 = true;
                        if (z2) {
                            Drawable mutate2 = drawable.mutate();
                            mutate2.setColorFilter(xb0.c(wfj.c(i2, context), mode4));
                            if (round != -1) {
                                mutate2.setAlpha(round);
                            }
                            z3 = true;
                        }
                    } else if (i != R.drawable.abc_dialog_material_background) {
                        z2 = false;
                        i2 = 0;
                        round = -1;
                        if (z2) {
                        }
                    }
                }
            }
            z2 = true;
            round = -1;
            if (z2) {
            }
        }
        if (z3 || !z) {
            return drawable;
        }
        return null;
    }
}
