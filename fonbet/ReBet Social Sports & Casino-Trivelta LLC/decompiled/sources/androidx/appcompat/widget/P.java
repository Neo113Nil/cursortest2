package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import l0.AbstractC5338c;
import n0.AbstractC5597a;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p.AbstractC6029a;
import z.C6907h;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: i, reason: collision with root package name */
    public static P f17063i;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f17065a;

    /* renamed from: b, reason: collision with root package name */
    public z.r f17066b;

    /* renamed from: c, reason: collision with root package name */
    public z.s f17067c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakHashMap f17068d = new WeakHashMap(0);

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f17069e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17070f;

    /* renamed from: g, reason: collision with root package name */
    public c f17071g;

    /* renamed from: h, reason: collision with root package name */
    public static final PorterDuff.Mode f17062h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j, reason: collision with root package name */
    public static final a f17064j = new a(6);

    public static class a extends z.j {
        public a(int i10) {
            super(i10);
        }

        public static int b(int i10, PorterDuff.Mode mode) {
            return ((i10 + 31) * 31) + mode.hashCode();
        }

        public PorterDuffColorFilter c(int i10, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) get(Integer.valueOf(b(i10, mode)));
        }

        public PorterDuffColorFilter d(int i10, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) put(Integer.valueOf(b(i10, mode)), porterDuffColorFilter);
        }
    }

    public interface b {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface c {
        Drawable a(P p10, Context context, int i10);

        ColorStateList b(Context context, int i10);

        boolean c(Context context, int i10, Drawable drawable);

        PorterDuff.Mode d(int i10);

        boolean e(Context context, int i10, Drawable drawable);
    }

    public static long d(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    public static PorterDuffColorFilter f(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return k(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized P g() {
        P p10;
        synchronized (P.class) {
            try {
                if (f17063i == null) {
                    P p11 = new P();
                    f17063i = p11;
                    o(p11);
                }
                p10 = f17063i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return p10;
    }

    public static synchronized PorterDuffColorFilter k(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter c10;
        synchronized (P.class) {
            a aVar = f17064j;
            c10 = aVar.c(i10, mode);
            if (c10 == null) {
                c10 = new PorterDuffColorFilter(i10, mode);
                aVar.d(i10, mode, c10);
            }
        }
        return c10;
    }

    public static void o(P p10) {
    }

    public static boolean p(Drawable drawable) {
        return (drawable instanceof androidx.vectordrawable.graphics.drawable.g) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    public static void v(Drawable drawable, Y y10, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z10 = y10.f17241d;
            if (z10 || y10.f17240c) {
                drawable.setColorFilter(f(z10 ? y10.f17238a : null, y10.f17240c ? y10.f17239b : f17062h, iArr));
            } else {
                drawable.clearColorFilter();
            }
        }
    }

    public final synchronized boolean a(Context context, long j10, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            C6907h c6907h = (C6907h) this.f17068d.get(context);
            if (c6907h == null) {
                c6907h = new C6907h();
                this.f17068d.put(context, c6907h);
            }
            c6907h.g(j10, new WeakReference(constantState));
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void b(Context context, int i10, ColorStateList colorStateList) {
        if (this.f17065a == null) {
            this.f17065a = new WeakHashMap();
        }
        z.s sVar = (z.s) this.f17065a.get(context);
        if (sVar == null) {
            sVar = new z.s();
            this.f17065a.put(context, sVar);
        }
        sVar.a(i10, colorStateList);
    }

    public final void c(Context context) {
        if (this.f17070f) {
            return;
        }
        this.f17070f = true;
        Drawable i10 = i(context, AbstractC6029a.f62883a);
        if (i10 == null || !p(i10)) {
            this.f17070f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    public final Drawable e(Context context, int i10) {
        if (this.f17069e == null) {
            this.f17069e = new TypedValue();
        }
        TypedValue typedValue = this.f17069e;
        context.getResources().getValue(i10, typedValue, true);
        long d10 = d(typedValue);
        Drawable h10 = h(context, d10);
        if (h10 != null) {
            return h10;
        }
        c cVar = this.f17071g;
        Drawable a10 = cVar == null ? null : cVar.a(this, context, i10);
        if (a10 != null) {
            a10.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, d10, a10);
        }
        return a10;
    }

    public final synchronized Drawable h(Context context, long j10) {
        C6907h c6907h = (C6907h) this.f17068d.get(context);
        if (c6907h == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c6907h.d(j10);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c6907h.h(j10);
        }
        return null;
    }

    public synchronized Drawable i(Context context, int i10) {
        return j(context, i10, false);
    }

    public synchronized Drawable j(Context context, int i10, boolean z10) {
        Drawable q10;
        try {
            c(context);
            q10 = q(context, i10);
            if (q10 == null) {
                q10 = e(context, i10);
            }
            if (q10 == null) {
                q10 = AbstractC5338c.getDrawable(context, i10);
            }
            if (q10 != null) {
                q10 = u(context, i10, z10, q10);
            }
            if (q10 != null) {
                I.b(q10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return q10;
    }

    public synchronized ColorStateList l(Context context, int i10) {
        ColorStateList m10;
        m10 = m(context, i10);
        if (m10 == null) {
            c cVar = this.f17071g;
            m10 = cVar == null ? null : cVar.b(context, i10);
            if (m10 != null) {
                b(context, i10, m10);
            }
        }
        return m10;
    }

    public final ColorStateList m(Context context, int i10) {
        z.s sVar;
        WeakHashMap weakHashMap = this.f17065a;
        if (weakHashMap == null || (sVar = (z.s) weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) sVar.e(i10);
    }

    public PorterDuff.Mode n(int i10) {
        c cVar = this.f17071g;
        if (cVar == null) {
            return null;
        }
        return cVar.d(i10);
    }

    public final Drawable q(Context context, int i10) {
        int next;
        z.r rVar = this.f17066b;
        if (rVar == null || rVar.isEmpty()) {
            return null;
        }
        z.s sVar = this.f17067c;
        if (sVar != null) {
            String str = (String) sVar.e(i10);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f17066b.get(str) == null)) {
                return null;
            }
        } else {
            this.f17067c = new z.s();
        }
        if (this.f17069e == null) {
            this.f17069e = new TypedValue();
        }
        TypedValue typedValue = this.f17069e;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long d10 = d(typedValue);
        Drawable h10 = h(context, d10);
        if (h10 != null) {
            return h10;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
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
                this.f17067c.a(i10, name);
                b bVar = (b) this.f17066b.get(name);
                if (bVar != null) {
                    h10 = bVar.a(context, xml, asAttributeSet, context.getTheme());
                }
                if (h10 != null) {
                    h10.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, d10, h10);
                }
            } catch (Exception e10) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e10);
            }
        }
        if (h10 == null) {
            this.f17067c.a(i10, "appcompat_skip_skip");
        }
        return h10;
    }

    public synchronized void r(Context context) {
        C6907h c6907h = (C6907h) this.f17068d.get(context);
        if (c6907h != null) {
            c6907h.a();
        }
    }

    public synchronized Drawable s(Context context, k0 k0Var, int i10) {
        try {
            Drawable q10 = q(context, i10);
            if (q10 == null) {
                q10 = k0Var.a(i10);
            }
            if (q10 == null) {
                return null;
            }
            return u(context, i10, false, q10);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void t(c cVar) {
        this.f17071g = cVar;
    }

    public final Drawable u(Context context, int i10, boolean z10, Drawable drawable) {
        ColorStateList l10 = l(context, i10);
        if (l10 != null) {
            Drawable r10 = AbstractC5597a.r(drawable.mutate());
            AbstractC5597a.o(r10, l10);
            PorterDuff.Mode n10 = n(i10);
            if (n10 != null) {
                AbstractC5597a.p(r10, n10);
            }
            return r10;
        }
        c cVar = this.f17071g;
        if ((cVar == null || !cVar.e(context, i10, drawable)) && !w(context, i10, drawable) && z10) {
            return null;
        }
        return drawable;
    }

    public boolean w(Context context, int i10, Drawable drawable) {
        c cVar = this.f17071g;
        return cVar != null && cVar.c(context, i10, drawable);
    }
}
