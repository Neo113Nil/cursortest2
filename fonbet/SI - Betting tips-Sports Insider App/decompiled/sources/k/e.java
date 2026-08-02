package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.a3;
import androidx.vectordrawable.graphics.drawable.h;
import androidx.vectordrawable.graphics.drawable.t;
import com.google.android.gms.internal.measurement.d5;
import kotlin.KotlinVersion;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends Drawable implements Drawable.Callback {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f18596t = 0;

    /* renamed from: a, reason: collision with root package name */
    public b f18597a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f18598b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f18599c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f18600d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18602f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f18604h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.core.widget.b f18605i;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public long f18606k;

    /* renamed from: l, reason: collision with root package name */
    public androidx.vectordrawable.graphics.drawable.d f18607l;

    /* renamed from: m, reason: collision with root package name */
    public b f18608m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f18609n;

    /* renamed from: o, reason: collision with root package name */
    public b f18610o;

    /* renamed from: p, reason: collision with root package name */
    public d5 f18611p;

    /* renamed from: s, reason: collision with root package name */
    public boolean f18613s;

    /* renamed from: e, reason: collision with root package name */
    public int f18601e = KotlinVersion.MAX_COMPONENT_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public int f18603g = -1;
    public int q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f18612r = -1;

    public e(b bVar, Resources resources) {
        i(new b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0272, code lost:
    
        r5.onStateChange(r5.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0279, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e c(Context context, Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int next;
        int next2;
        Context context2 = context;
        Resources resources2 = resources;
        String name = xmlResourceParser.getName();
        if (!name.equals("animated-selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid animated-selector tag " + name);
        }
        e eVar = new e(null, null);
        TypedArray f6 = f0.b.f(resources2, theme, attributeSet, l.b.f19290a);
        int i5 = 1;
        eVar.setVisible(f6.getBoolean(1, true), true);
        b bVar = eVar.f18610o;
        bVar.f18570d |= l.a.b(f6);
        int i10 = 2;
        bVar.f18575i = f6.getBoolean(2, bVar.f18575i);
        int i11 = 3;
        bVar.f18577l = f6.getBoolean(3, bVar.f18577l);
        bVar.f18589y = f6.getInt(4, bVar.f18589y);
        bVar.f18590z = f6.getInt(5, bVar.f18590z);
        boolean z5 = false;
        eVar.setDither(f6.getBoolean(0, bVar.f18587w));
        b bVar2 = eVar.f18597a;
        if (resources2 != null) {
            bVar2.f18568b = resources2;
            int i12 = resources2.getDisplayMetrics().densityDpi;
            if (i12 == 0) {
                i12 = 160;
            }
            int i13 = bVar2.f18569c;
            bVar2.f18569c = i12;
            if (i13 != i12) {
                bVar2.f18578m = false;
                bVar2.j = false;
            }
        } else {
            bVar2.getClass();
        }
        f6.recycle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next3 = xmlResourceParser.next();
            if (next3 == i5 || ((depth = xmlResourceParser.getDepth()) < depth2 && next3 == i11)) {
                break;
            }
            if (next3 == i10 && depth <= depth2) {
                if (xmlResourceParser.getName().equals("item")) {
                    TypedArray f10 = f0.b.f(resources2, theme, attributeSet, l.b.f19291b);
                    int resourceId = f10.getResourceId(z5 ? 1 : 0, z5 ? 1 : 0);
                    int resourceId2 = f10.getResourceId(i5, -1);
                    Drawable f11 = resourceId2 > 0 ? a3.d().f(context2, resourceId2) : null;
                    f10.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr = new int[attributeCount];
                    int i14 = z5 ? 1 : 0;
                    for (int i15 = i14; i15 < attributeCount; i15++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i15);
                        if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                            int i16 = i14 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i15, z5)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr[i14] = attributeNameResource;
                            i14 = i16;
                        }
                    }
                    int[] trimStateSet = StateSet.trimStateSet(iArr, i14);
                    if (f11 == null) {
                        do {
                            next2 = xmlResourceParser.next();
                        } while (next2 == 4);
                        if (next2 != 2) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (xmlResourceParser.getName().equals("vector")) {
                            f11 = new t();
                            f11.inflate(resources2, xmlResourceParser, attributeSet, theme);
                        } else {
                            f11 = l.a.a(resources, xmlResourceParser, attributeSet, theme);
                        }
                    }
                    if (f11 == null) {
                        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    b bVar3 = eVar.f18610o;
                    int a7 = bVar3.a(f11);
                    bVar3.H[a7] = trimStateSet;
                    bVar3.J.f(a7, Integer.valueOf(resourceId));
                } else if (xmlResourceParser.getName().equals("transition")) {
                    TypedArray f12 = f0.b.f(resources2, theme, attributeSet, l.b.f19292c);
                    int resourceId3 = f12.getResourceId(2, -1);
                    int resourceId4 = f12.getResourceId(1, -1);
                    int resourceId5 = f12.getResourceId(z5 ? 1 : 0, -1);
                    Drawable f13 = resourceId5 > 0 ? a3.d().f(context2, resourceId5) : null;
                    boolean z7 = f12.getBoolean(3, z5);
                    f12.recycle();
                    if (f13 == null) {
                        do {
                            next = xmlResourceParser.next();
                        } while (next == 4);
                        if (next != 2) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (xmlResourceParser.getName().equals("animated-vector")) {
                            f13 = new h(context2, z5 ? 1 : 0);
                            f13.inflate(resources2, xmlResourceParser, attributeSet, theme);
                        } else {
                            f13 = l.a.a(resources, xmlResourceParser, attributeSet, theme);
                        }
                    }
                    if (f13 == null) {
                        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    if (resourceId3 == -1 || resourceId4 == -1) {
                        break;
                    }
                    b bVar4 = eVar.f18610o;
                    int a10 = bVar4.a(f13);
                    long j = resourceId3;
                    long j6 = resourceId4;
                    long j10 = (j << 32) | j6;
                    long j11 = z7 ? 8589934592L : 0L;
                    long j12 = a10;
                    bVar4.I.a(j10, Long.valueOf(j12 | j11));
                    if (z7) {
                        bVar4.I.a((j6 << 32) | j, Long.valueOf(j12 | 4294967296L | j11));
                    }
                    context2 = context;
                    resources2 = resources;
                    i5 = 1;
                    z5 = false;
                    i10 = 2;
                    i11 = 3;
                } else {
                    context2 = context;
                    resources2 = resources;
                }
                i5 = 1;
                i10 = 2;
                i11 = 3;
            }
        }
        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z5) {
        boolean z7;
        Drawable drawable;
        boolean z10 = true;
        this.f18602f = true;
        long uptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.f18599c;
        if (drawable2 != null) {
            long j = this.j;
            if (j != 0) {
                if (j > uptimeMillis) {
                    drawable2.setAlpha(((255 - (((int) ((j - uptimeMillis) * 255)) / this.f18597a.f18589y)) * this.f18601e) / KotlinVersion.MAX_COMPONENT_VALUE);
                    z7 = true;
                    drawable = this.f18600d;
                    if (drawable == null) {
                        long j6 = this.f18606k;
                        if (j6 != 0) {
                            if (j6 > uptimeMillis) {
                                drawable.setAlpha(((((int) ((j6 - uptimeMillis) * 255)) / this.f18597a.f18590z) * this.f18601e) / KotlinVersion.MAX_COMPONENT_VALUE);
                                if (z5 && z10) {
                                    scheduleSelf(this.f18605i, uptimeMillis + 16);
                                    return;
                                }
                                return;
                            }
                            drawable.setVisible(false, false);
                            this.f18600d = null;
                            this.f18606k = 0L;
                        }
                    } else {
                        this.f18606k = 0L;
                    }
                    z10 = z7;
                    if (z5) {
                        return;
                    } else {
                        return;
                    }
                }
                drawable2.setAlpha(this.f18601e);
                this.j = 0L;
            }
        } else {
            this.j = 0L;
        }
        z7 = false;
        drawable = this.f18600d;
        if (drawable == null) {
        }
        z10 = z7;
        if (z5) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        b(theme);
        onStateChange(getState());
    }

    public final void b(Resources.Theme theme) {
        b bVar = this.f18597a;
        if (theme == null) {
            bVar.getClass();
            return;
        }
        bVar.c();
        int i5 = bVar.f18574h;
        Drawable[] drawableArr = bVar.f18573g;
        for (int i10 = 0; i10 < i5; i10++) {
            Drawable drawable = drawableArr[i10];
            if (drawable != null && drawable.canApplyTheme()) {
                drawableArr[i10].applyTheme(theme);
                bVar.f18571e |= drawableArr[i10].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            bVar.f18568b = resources;
            int i11 = resources.getDisplayMetrics().densityDpi;
            if (i11 == 0) {
                i11 = 160;
            }
            int i12 = bVar.f18569c;
            bVar.f18569c = i11;
            if (i12 != i11) {
                bVar.f18578m = false;
                bVar.j = false;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f18597a.canApplyTheme();
    }

    public final void d(Drawable drawable) {
        if (this.f18607l == null) {
            this.f18607l = new androidx.vectordrawable.graphics.drawable.d();
        }
        androidx.vectordrawable.graphics.drawable.d dVar = this.f18607l;
        dVar.f2789b = drawable.getCallback();
        drawable.setCallback(dVar);
        try {
            if (this.f18597a.f18589y <= 0 && this.f18602f) {
                drawable.setAlpha(this.f18601e);
            }
            b bVar = this.f18597a;
            if (bVar.C) {
                drawable.setColorFilter(bVar.B);
            } else {
                if (bVar.F) {
                    drawable.setTintList(bVar.D);
                }
                b bVar2 = this.f18597a;
                if (bVar2.G) {
                    drawable.setTintMode(bVar2.E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f18597a.f18587w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setAutoMirrored(this.f18597a.A);
            Rect rect = this.f18598b;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
            androidx.vectordrawable.graphics.drawable.d dVar2 = this.f18607l;
            Drawable.Callback callback = (Drawable.Callback) dVar2.f2789b;
            dVar2.f2789b = null;
            drawable.setCallback(callback);
        } catch (Throwable th2) {
            androidx.vectordrawable.graphics.drawable.d dVar3 = this.f18607l;
            Drawable.Callback callback2 = (Drawable.Callback) dVar3.f2789b;
            dVar3.f2789b = null;
            drawable.setCallback(callback2);
            throw th2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f18599c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f18600d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final void e() {
        boolean z5;
        Drawable drawable = this.f18600d;
        boolean z7 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f18600d = null;
            z5 = true;
        } else {
            z5 = false;
        }
        Drawable drawable2 = this.f18599c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f18602f) {
                this.f18599c.setAlpha(this.f18601e);
            }
        }
        if (this.f18606k != 0) {
            this.f18606k = 0L;
            z5 = true;
        }
        if (this.j != 0) {
            this.j = 0L;
        } else {
            z7 = z5;
        }
        if (z7) {
            invalidateSelf();
        }
    }

    public final Drawable f() {
        if (!this.f18604h && super.mutate() == this) {
            b bVar = new b(this.f18610o, this, null);
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            i(bVar);
            this.f18604h = true;
        }
        return this;
    }

    public final Drawable g() {
        if (!this.f18609n) {
            f();
            b bVar = this.f18608m;
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            this.f18609n = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f18601e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f18597a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z5;
        b bVar = this.f18597a;
        if (!bVar.f18585u) {
            bVar.c();
            bVar.f18585u = true;
            int i5 = bVar.f18574h;
            Drawable[] drawableArr = bVar.f18573g;
            int i10 = 0;
            while (true) {
                if (i10 >= i5) {
                    bVar.f18586v = true;
                    z5 = true;
                    break;
                }
                if (drawableArr[i10].getConstantState() == null) {
                    bVar.f18586v = false;
                    z5 = false;
                    break;
                }
                i10++;
            }
        } else {
            z5 = bVar.f18586v;
        }
        if (!z5) {
            return null;
        }
        this.f18597a.f18570d = getChangingConfigurations();
        return this.f18597a;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f18599c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f18598b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        b bVar = this.f18597a;
        if (bVar.f18577l) {
            if (!bVar.f18578m) {
                bVar.b();
            }
            return bVar.f18580o;
        }
        Drawable drawable = this.f18599c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        b bVar = this.f18597a;
        if (bVar.f18577l) {
            if (!bVar.f18578m) {
                bVar.b();
            }
            return bVar.f18579n;
        }
        Drawable drawable = this.f18599c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        b bVar = this.f18597a;
        if (bVar.f18577l) {
            if (!bVar.f18578m) {
                bVar.b();
            }
            return bVar.q;
        }
        Drawable drawable = this.f18599c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        b bVar = this.f18597a;
        if (bVar.f18577l) {
            if (!bVar.f18578m) {
                bVar.b();
            }
            return bVar.f18581p;
        }
        Drawable drawable = this.f18599c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f18599c;
        if (drawable != null && drawable.isVisible()) {
            b bVar = this.f18597a;
            if (bVar.f18582r) {
                return bVar.f18583s;
            }
            bVar.c();
            int i5 = bVar.f18574h;
            Drawable[] drawableArr = bVar.f18573g;
            r1 = i5 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i10 = 1; i10 < i5; i10++) {
                r1 = Drawable.resolveOpacity(r1, drawableArr[i10].getOpacity());
            }
            bVar.f18583s = r1;
            bVar.f18582r = true;
        }
        return r1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f18599c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        b bVar = this.f18597a;
        Rect rect2 = null;
        boolean z5 = false;
        if (!bVar.f18575i) {
            Rect rect3 = bVar.f18576k;
            if (rect3 != null || bVar.j) {
                rect2 = rect3;
            } else {
                bVar.c();
                Rect rect4 = new Rect();
                int i5 = bVar.f18574h;
                Drawable[] drawableArr = bVar.f18573g;
                for (int i10 = 0; i10 < i5; i10++) {
                    if (drawableArr[i10].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i11 = rect4.left;
                        if (i11 > rect2.left) {
                            rect2.left = i11;
                        }
                        int i12 = rect4.top;
                        if (i12 > rect2.top) {
                            rect2.top = i12;
                        }
                        int i13 = rect4.right;
                        if (i13 > rect2.right) {
                            rect2.right = i13;
                        }
                        int i14 = rect4.bottom;
                        if (i14 > rect2.bottom) {
                            rect2.bottom = i14;
                        }
                    }
                }
                bVar.j = true;
                bVar.f18576k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                z5 = true;
            }
        } else {
            Drawable drawable = this.f18599c;
            z5 = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.f18597a.A && getLayoutDirection() == 1) {
            int i15 = rect.left;
            rect.left = rect.right;
            rect.right = i15;
        }
        return z5;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(int i5) {
        androidx.core.widget.b bVar;
        if (i5 == this.f18603g) {
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f18597a.f18590z > 0) {
            Drawable drawable = this.f18600d;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.f18599c;
            if (drawable2 != null) {
                this.f18600d = drawable2;
                this.f18606k = this.f18597a.f18590z + uptimeMillis;
            } else {
                this.f18600d = null;
                this.f18606k = 0L;
            }
        } else {
            Drawable drawable3 = this.f18599c;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i5 >= 0) {
            b bVar2 = this.f18597a;
            if (i5 < bVar2.f18574h) {
                Drawable d10 = bVar2.d(i5);
                this.f18599c = d10;
                this.f18603g = i5;
                if (d10 != null) {
                    int i10 = this.f18597a.f18589y;
                    if (i10 > 0) {
                        this.j = uptimeMillis + i10;
                    }
                    d(d10);
                }
                if (this.j == 0 || this.f18606k != 0) {
                    bVar = this.f18605i;
                    if (bVar != null) {
                        this.f18605i = new androidx.core.widget.b(19, this);
                    } else {
                        unscheduleSelf(bVar);
                    }
                    a(true);
                }
                invalidateSelf();
                return true;
            }
        }
        this.f18599c = null;
        this.f18603g = -1;
        if (this.j == 0) {
        }
        bVar = this.f18605i;
        if (bVar != null) {
        }
        a(true);
        invalidateSelf();
        return true;
    }

    public final void i(b bVar) {
        this.f18597a = bVar;
        int i5 = this.f18603g;
        if (i5 >= 0) {
            Drawable d10 = bVar.d(i5);
            this.f18599c = d10;
            if (d10 != null) {
                d(d10);
            }
        }
        this.f18600d = null;
        this.f18608m = bVar;
        this.f18610o = bVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        b bVar = this.f18597a;
        if (bVar != null) {
            bVar.f18582r = false;
            bVar.f18584t = false;
        }
        if (drawable != this.f18599c || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f18597a.A;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    public final boolean j(boolean z5, boolean z7) {
        boolean visible = super.setVisible(z5, z7);
        Drawable drawable = this.f18600d;
        if (drawable != null) {
            drawable.setVisible(z5, z7);
        }
        Drawable drawable2 = this.f18599c;
        if (drawable2 != null) {
            drawable2.setVisible(z5, z7);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        e();
        d5 d5Var = this.f18611p;
        if (d5Var != null) {
            d5Var.V();
            this.f18611p = null;
            h(this.q);
            this.q = -1;
            this.f18612r = -1;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f18613s) {
            g();
            b bVar = this.f18610o;
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            this.f18613s = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f18600d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f18599c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i5) {
        b bVar = this.f18597a;
        int i10 = this.f18603g;
        int i11 = bVar.f18574h;
        Drawable[] drawableArr = bVar.f18573g;
        boolean z5 = false;
        for (int i12 = 0; i12 < i11; i12++) {
            Drawable drawable = drawableArr[i12];
            if (drawable != null) {
                boolean layoutDirection = drawable.setLayoutDirection(i5);
                if (i12 == i10) {
                    z5 = layoutDirection;
                }
            }
        }
        bVar.f18588x = i5;
        return z5;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i5) {
        Drawable drawable = this.f18600d;
        if (drawable != null) {
            return drawable.setLevel(i5);
        }
        Drawable drawable2 = this.f18599c;
        if (drawable2 != null) {
            return drawable2.setLevel(i5);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d1, code lost:
    
        if (h(r1) != false) goto L45;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onStateChange(int[] iArr) {
        d5 aVar;
        b bVar = this.f18610o;
        int f6 = bVar.f(iArr);
        if (f6 < 0) {
            f6 = bVar.f(StateSet.WILD_CARD);
        }
        int i5 = this.f18603g;
        if (f6 != i5) {
            d5 d5Var = this.f18611p;
            if (d5Var != null) {
                if (f6 != this.q) {
                    if (f6 == this.f18612r && d5Var.e()) {
                        d5Var.Q();
                        this.q = this.f18612r;
                        this.f18612r = f6;
                    } else {
                        i5 = this.q;
                        d5Var.V();
                    }
                }
                r2 = true;
            }
            this.f18611p = null;
            this.f18612r = -1;
            this.q = -1;
            b bVar2 = this.f18610o;
            int e7 = bVar2.e(i5);
            int e9 = bVar2.e(f6);
            if (e9 != 0 && e7 != 0) {
                long j = e9 | (e7 << 32);
                int longValue = (int) ((Long) bVar2.I.f(j)).longValue();
                if (longValue >= 0) {
                    boolean z5 = (((Long) bVar2.I.f(j)).longValue() & 8589934592L) != 0;
                    h(longValue);
                    Object obj = this.f18599c;
                    if (obj instanceof AnimationDrawable) {
                        aVar = new c((AnimationDrawable) obj, (((Long) bVar2.I.f(j)).longValue() & 4294967296L) != 0, z5);
                    } else if (obj instanceof h) {
                        aVar = new a((h) obj, 1);
                    } else if (obj instanceof Animatable) {
                        aVar = new a((Animatable) obj, 0);
                    }
                    aVar.U();
                    this.f18611p = aVar;
                    this.f18612r = i5;
                    this.q = f6;
                    r2 = true;
                }
            }
        }
        Drawable drawable = this.f18599c;
        return drawable != null ? drawable.setState(iArr) | r2 : r2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.f18599c || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i5) {
        if (this.f18602f && this.f18601e == i5) {
            return;
        }
        this.f18602f = true;
        this.f18601e = i5;
        Drawable drawable = this.f18599c;
        if (drawable != null) {
            if (this.j == 0) {
                drawable.setAlpha(i5);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z5) {
        b bVar = this.f18597a;
        if (bVar.A != z5) {
            bVar.A = z5;
            Drawable drawable = this.f18599c;
            if (drawable != null) {
                drawable.setAutoMirrored(z5);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        b bVar = this.f18597a;
        bVar.C = true;
        if (bVar.B != colorFilter) {
            bVar.B = colorFilter;
            Drawable drawable = this.f18599c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z5) {
        b bVar = this.f18597a;
        if (bVar.f18587w != z5) {
            bVar.f18587w = z5;
            Drawable drawable = this.f18599c;
            if (drawable != null) {
                drawable.setDither(z5);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f6, float f10) {
        Drawable drawable = this.f18599c;
        if (drawable != null) {
            drawable.setHotspot(f6, f10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i5, int i10, int i11, int i12) {
        Rect rect = this.f18598b;
        if (rect == null) {
            this.f18598b = new Rect(i5, i10, i11, i12);
        } else {
            rect.set(i5, i10, i11, i12);
        }
        Drawable drawable = this.f18599c;
        if (drawable != null) {
            drawable.setHotspotBounds(i5, i10, i11, i12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i5) {
        setTintList(ColorStateList.valueOf(i5));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        b bVar = this.f18597a;
        bVar.F = true;
        if (bVar.D != colorStateList) {
            bVar.D = colorStateList;
            this.f18599c.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f18597a;
        bVar.G = true;
        if (bVar.E != mode) {
            bVar.E = mode;
            this.f18599c.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z5, boolean z7) {
        boolean j = j(z5, z7);
        d5 d5Var = this.f18611p;
        if (d5Var != null && (j || z7)) {
            if (z5) {
                d5Var.U();
                return j;
            }
            jumpToCurrentState();
        }
        return j;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f18599c || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
