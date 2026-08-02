package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import androidx.core.content.res.k;
import androidx.core.content.res.n;
import androidx.core.graphics.g;
import com.facebook.react.uimanager.ViewProps;
import com.twilio.voice.EventKeys;
import java.util.ArrayDeque;
import java.util.ArrayList;
import n0.AbstractC5597a;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import z.C6900a;

/* loaded from: classes.dex */
public class g extends androidx.vectordrawable.graphics.drawable.f {

    /* renamed from: j, reason: collision with root package name */
    public static final PorterDuff.Mode f23559j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public h f23560b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuffColorFilter f23561c;

    /* renamed from: d, reason: collision with root package name */
    public ColorFilter f23562d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f23563e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23564f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable.ConstantState f23565g;

    /* renamed from: h, reason: collision with root package name */
    public final Matrix f23566h;

    /* renamed from: i, reason: collision with root package name */
    public final Rect f23567i;
    private final float[] mTmpFloats;

    public static class b extends f {
        public b() {
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f23591a = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.mNodes = androidx.core.graphics.g.d(string2);
            }
            this.f23592b = n.g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (n.h(xmlPullParser, "pathData")) {
                TypedArray i10 = n.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.STYLEABLE_VECTOR_DRAWABLE_CLIP_PATH);
                f(i10, xmlPullParser);
                i10.recycle();
            }
        }

        public b(b bVar) {
            super(bVar);
        }
    }

    public static abstract class e {
        public e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    public static class h extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public int f23611a;

        /* renamed from: b, reason: collision with root package name */
        public C0413g f23612b;

        /* renamed from: c, reason: collision with root package name */
        public ColorStateList f23613c;

        /* renamed from: d, reason: collision with root package name */
        public PorterDuff.Mode f23614d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f23615e;

        /* renamed from: f, reason: collision with root package name */
        public Bitmap f23616f;

        /* renamed from: g, reason: collision with root package name */
        public ColorStateList f23617g;

        /* renamed from: h, reason: collision with root package name */
        public PorterDuff.Mode f23618h;

        /* renamed from: i, reason: collision with root package name */
        public int f23619i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f23620j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f23621k;

        /* renamed from: l, reason: collision with root package name */
        public Paint f23622l;
        int[] mCachedThemeAttrs;

        public h(h hVar) {
            this.f23613c = null;
            this.f23614d = g.f23559j;
            if (hVar != null) {
                this.f23611a = hVar.f23611a;
                C0413g c0413g = new C0413g(hVar.f23612b);
                this.f23612b = c0413g;
                if (hVar.f23612b.f23599e != null) {
                    c0413g.f23599e = new Paint(hVar.f23612b.f23599e);
                }
                if (hVar.f23612b.f23598d != null) {
                    this.f23612b.f23598d = new Paint(hVar.f23612b.f23598d);
                }
                this.f23613c = hVar.f23613c;
                this.f23614d = hVar.f23614d;
                this.f23615e = hVar.f23615e;
            }
        }

        public boolean a(int i10, int i11) {
            return i10 == this.f23616f.getWidth() && i11 == this.f23616f.getHeight();
        }

        public boolean b() {
            return !this.f23621k && this.f23617g == this.f23613c && this.f23618h == this.f23614d && this.f23620j == this.f23615e && this.f23619i == this.f23612b.getRootAlpha();
        }

        public void c(int i10, int i11) {
            if (this.f23616f == null || !a(i10, i11)) {
                this.f23616f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                this.f23621k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f23616f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f23622l == null) {
                Paint paint = new Paint();
                this.f23622l = paint;
                paint.setFilterBitmap(true);
            }
            this.f23622l.setAlpha(this.f23612b.getRootAlpha());
            this.f23622l.setColorFilter(colorFilter);
            return this.f23622l;
        }

        public boolean f() {
            return this.f23612b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f23612b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f23611a;
        }

        public boolean h(int[] iArr) {
            boolean g10 = this.f23612b.g(iArr);
            this.f23621k |= g10;
            return g10;
        }

        public void i() {
            this.f23617g = this.f23613c;
            this.f23618h = this.f23614d;
            this.f23619i = this.f23612b.getRootAlpha();
            this.f23620j = this.f23615e;
            this.f23621k = false;
        }

        public void j(int i10, int i11) {
            this.f23616f.eraseColor(0);
            this.f23612b.b(new Canvas(this.f23616f), i10, i11, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new g(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new g(this);
        }

        public h() {
            this.f23613c = null;
            this.f23614d = g.f23559j;
            this.f23612b = new C0413g();
        }
    }

    public g() {
        this.f23564f = true;
        this.mTmpFloats = new float[9];
        this.f23566h = new Matrix();
        this.f23567i = new Rect();
        this.f23560b = new h();
    }

    public static int a(int i10, float f10) {
        return (i10 & 16777215) | (((int) (Color.alpha(i10) * f10)) << 24);
    }

    public static g b(Resources resources, int i10, Resources.Theme theme) {
        g gVar = new g();
        gVar.f23558a = k.f(resources, i10, theme);
        gVar.f23565g = new i(gVar.f23558a.getConstantState());
        return gVar;
    }

    public static PorterDuff.Mode f(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public Object c(String str) {
        return this.f23560b.f23612b.f23610p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f23558a;
        if (drawable == null) {
            return false;
        }
        AbstractC5597a.b(drawable);
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public final void d(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        h hVar = this.f23560b;
        C0413g c0413g = hVar.f23612b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c0413g.f23602h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z10 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f23580b.add(cVar);
                    if (cVar.getPathName() != null) {
                        c0413g.f23610p.put(cVar.getPathName(), cVar);
                    }
                    hVar.f23611a = cVar.f23593c | hVar.f23611a;
                    z10 = false;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f23580b.add(bVar);
                    if (bVar.getPathName() != null) {
                        c0413g.f23610p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f23611a = bVar.f23593c | hVar.f23611a;
                } else if (EventKeys.EVENT_GROUP.equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f23580b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        c0413g.f23610p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f23611a = dVar2.f23589k | hVar.f23611a;
                }
            } else if (eventType == 3 && EventKeys.EVENT_GROUP.equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z10) {
            throw new XmlPullParserException("no path defined");
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f23558a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f23567i);
        if (this.f23567i.width() <= 0 || this.f23567i.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f23562d;
        if (colorFilter == null) {
            colorFilter = this.f23561c;
        }
        canvas.getMatrix(this.f23566h);
        this.f23566h.getValues(this.mTmpFloats);
        float abs = Math.abs(this.mTmpFloats[0]);
        float abs2 = Math.abs(this.mTmpFloats[4]);
        float abs3 = Math.abs(this.mTmpFloats[1]);
        float abs4 = Math.abs(this.mTmpFloats[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(2048, (int) (this.f23567i.width() * abs));
        int min2 = Math.min(2048, (int) (this.f23567i.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        Rect rect = this.f23567i;
        canvas.translate(rect.left, rect.top);
        if (e()) {
            canvas.translate(this.f23567i.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f23567i.offsetTo(0, 0);
        this.f23560b.c(min, min2);
        if (!this.f23564f) {
            this.f23560b.j(min, min2);
        } else if (!this.f23560b.b()) {
            this.f23560b.j(min, min2);
            this.f23560b.i();
        }
        this.f23560b.d(canvas, colorFilter, this.f23567i);
        canvas.restoreToCount(save);
    }

    public final boolean e() {
        return isAutoMirrored() && AbstractC5597a.f(this) == 1;
    }

    public void g(boolean z10) {
        this.f23564f = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f23558a;
        return drawable != null ? AbstractC5597a.d(drawable) : this.f23560b.f23612b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f23558a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f23560b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f23558a;
        return drawable != null ? AbstractC5597a.e(drawable) : this.f23562d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f23558a != null) {
            return new i(this.f23558a.getConstantState());
        }
        this.f23560b.f23611a = getChangingConfigurations();
        return this.f23560b;
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f23558a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f23560b.f23612b.f23604j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f23558a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f23560b.f23612b.f23603i;
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f23558a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public final void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        h hVar = this.f23560b;
        C0413g c0413g = hVar.f23612b;
        hVar.f23614d = f(n.g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList c10 = n.c(typedArray, xmlPullParser, theme, "tint", 1);
        if (c10 != null) {
            hVar.f23613c = c10;
        }
        hVar.f23615e = n.a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f23615e);
        c0413g.f23605k = n.f(typedArray, xmlPullParser, "viewportWidth", 7, c0413g.f23605k);
        float f10 = n.f(typedArray, xmlPullParser, "viewportHeight", 8, c0413g.f23606l);
        c0413g.f23606l = f10;
        if (c0413g.f23605k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f10 <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        c0413g.f23603i = typedArray.getDimension(3, c0413g.f23603i);
        float dimension = typedArray.getDimension(2, c0413g.f23604j);
        c0413g.f23604j = dimension;
        if (c0413g.f23603i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        c0413g.setAlpha(n.f(typedArray, xmlPullParser, "alpha", 4, c0413g.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            c0413g.f23608n = string;
            c0413g.f23610p.put(string, c0413g);
        }
    }

    public PorterDuffColorFilter i(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f23558a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f23558a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f23558a;
        return drawable != null ? AbstractC5597a.h(drawable) : this.f23560b.f23615e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f23558a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        h hVar = this.f23560b;
        if (hVar == null) {
            return false;
        }
        if (hVar.g()) {
            return true;
        }
        ColorStateList colorStateList = this.f23560b.f23613c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f23558a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f23563e && super.mutate() == this) {
            this.f23560b = new h(this.f23560b);
            this.f23563e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f23558a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.f23558a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h hVar = this.f23560b;
        ColorStateList colorStateList = hVar.f23613c;
        if (colorStateList == null || (mode = hVar.f23614d) == null) {
            z10 = false;
        } else {
            this.f23561c = i(this.f23561c, colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z10;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f23558a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f23558a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f23560b.f23612b.getRootAlpha() != i10) {
            this.f23560b.f23612b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f23558a;
        if (drawable != null) {
            AbstractC5597a.j(drawable, z10);
        } else {
            this.f23560b.f23615e = z10;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f23558a;
        if (drawable != null) {
            AbstractC5597a.n(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f23558a;
        if (drawable != null) {
            AbstractC5597a.o(drawable, colorStateList);
            return;
        }
        h hVar = this.f23560b;
        if (hVar.f23613c != colorStateList) {
            hVar.f23613c = colorStateList;
            this.f23561c = i(this.f23561c, colorStateList, hVar.f23614d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f23558a;
        if (drawable != null) {
            AbstractC5597a.p(drawable, mode);
            return;
        }
        h hVar = this.f23560b;
        if (hVar.f23614d != mode) {
            hVar.f23614d = mode;
            this.f23561c = i(this.f23561c, hVar.f23613c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f23558a;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f23558a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public static class i extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f23623a;

        public i(Drawable.ConstantState constantState) {
            this.f23623a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f23623a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f23623a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            g gVar = new g();
            gVar.f23558a = (VectorDrawable) this.f23623a.newDrawable();
            return gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            g gVar = new g();
            gVar.f23558a = (VectorDrawable) this.f23623a.newDrawable(resources);
            return gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            g gVar = new g();
            gVar.f23558a = (VectorDrawable) this.f23623a.newDrawable(resources, theme);
            return gVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f23558a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f23562d = colorFilter;
            invalidateSelf();
        }
    }

    public static abstract class f extends e {

        /* renamed from: a, reason: collision with root package name */
        public String f23591a;

        /* renamed from: b, reason: collision with root package name */
        public int f23592b;

        /* renamed from: c, reason: collision with root package name */
        public int f23593c;
        protected g.b[] mNodes;

        public f() {
            super();
            this.mNodes = null;
            this.f23592b = 0;
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            g.b[] bVarArr = this.mNodes;
            if (bVarArr != null) {
                g.b.h(bVarArr, path);
            }
        }

        public g.b[] getPathData() {
            return this.mNodes;
        }

        public String getPathName() {
            return this.f23591a;
        }

        public void setPathData(g.b[] bVarArr) {
            if (androidx.core.graphics.g.b(this.mNodes, bVarArr)) {
                androidx.core.graphics.g.k(this.mNodes, bVarArr);
            } else {
                this.mNodes = androidx.core.graphics.g.f(bVarArr);
            }
        }

        public f(f fVar) {
            super();
            this.mNodes = null;
            this.f23592b = 0;
            this.f23591a = fVar.f23591a;
            this.f23593c = fVar.f23593c;
            this.mNodes = androidx.core.graphics.g.f(fVar.mNodes);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f23558a;
        if (drawable != null) {
            AbstractC5597a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f23560b;
        hVar.f23612b = new C0413g();
        TypedArray i10 = n.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.STYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY);
        h(i10, xmlPullParser, theme);
        i10.recycle();
        hVar.f23611a = getChangingConfigurations();
        hVar.f23621k = true;
        d(resources, xmlPullParser, attributeSet, theme);
        this.f23561c = i(this.f23561c, hVar.f23613c, hVar.f23614d);
    }

    public g(h hVar) {
        this.f23564f = true;
        this.mTmpFloats = new float[9];
        this.f23566h = new Matrix();
        this.f23567i = new Rect();
        this.f23560b = hVar;
        this.f23561c = i(this.f23561c, hVar.f23613c, hVar.f23614d);
    }

    public static class c extends f {

        /* renamed from: d, reason: collision with root package name */
        public androidx.core.content.res.d f23568d;

        /* renamed from: e, reason: collision with root package name */
        public float f23569e;

        /* renamed from: f, reason: collision with root package name */
        public androidx.core.content.res.d f23570f;

        /* renamed from: g, reason: collision with root package name */
        public float f23571g;

        /* renamed from: h, reason: collision with root package name */
        public float f23572h;

        /* renamed from: i, reason: collision with root package name */
        public float f23573i;

        /* renamed from: j, reason: collision with root package name */
        public float f23574j;

        /* renamed from: k, reason: collision with root package name */
        public float f23575k;

        /* renamed from: l, reason: collision with root package name */
        public Paint.Cap f23576l;

        /* renamed from: m, reason: collision with root package name */
        public Paint.Join f23577m;
        private int[] mThemeAttrs;

        /* renamed from: n, reason: collision with root package name */
        public float f23578n;

        public c() {
            this.f23569e = 0.0f;
            this.f23571g = 1.0f;
            this.f23572h = 1.0f;
            this.f23573i = 0.0f;
            this.f23574j = 1.0f;
            this.f23575k = 0.0f;
            this.f23576l = Paint.Cap.BUTT;
            this.f23577m = Paint.Join.MITER;
            this.f23578n = 4.0f;
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.e
        public boolean a() {
            return this.f23570f.i() || this.f23568d.i();
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.e
        public boolean b(int[] iArr) {
            return this.f23568d.j(iArr) | this.f23570f.j(iArr);
        }

        public final Paint.Cap e(int i10, Paint.Cap cap) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        public final Paint.Join f(int i10, Paint.Join join) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray i10 = n.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.STYLEABLE_VECTOR_DRAWABLE_PATH);
            h(i10, xmlPullParser, theme);
            i10.recycle();
        }

        public float getFillAlpha() {
            return this.f23572h;
        }

        public int getFillColor() {
            return this.f23570f.e();
        }

        public float getStrokeAlpha() {
            return this.f23571g;
        }

        public int getStrokeColor() {
            return this.f23568d.e();
        }

        public float getStrokeWidth() {
            return this.f23569e;
        }

        public float getTrimPathEnd() {
            return this.f23574j;
        }

        public float getTrimPathOffset() {
            return this.f23575k;
        }

        public float getTrimPathStart() {
            return this.f23573i;
        }

        public final void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.mThemeAttrs = null;
            if (n.h(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f23591a = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.mNodes = androidx.core.graphics.g.d(string2);
                }
                this.f23570f = n.e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f23572h = n.f(typedArray, xmlPullParser, "fillAlpha", 12, this.f23572h);
                this.f23576l = e(n.g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f23576l);
                this.f23577m = f(n.g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f23577m);
                this.f23578n = n.f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f23578n);
                this.f23568d = n.e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f23571g = n.f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f23571g);
                this.f23569e = n.f(typedArray, xmlPullParser, "strokeWidth", 4, this.f23569e);
                this.f23574j = n.f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f23574j);
                this.f23575k = n.f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f23575k);
                this.f23573i = n.f(typedArray, xmlPullParser, "trimPathStart", 5, this.f23573i);
                this.f23592b = n.g(typedArray, xmlPullParser, "fillType", 13, this.f23592b);
            }
        }

        public void setFillAlpha(float f10) {
            this.f23572h = f10;
        }

        public void setFillColor(int i10) {
            this.f23570f.k(i10);
        }

        public void setStrokeAlpha(float f10) {
            this.f23571g = f10;
        }

        public void setStrokeColor(int i10) {
            this.f23568d.k(i10);
        }

        public void setStrokeWidth(float f10) {
            this.f23569e = f10;
        }

        public void setTrimPathEnd(float f10) {
            this.f23574j = f10;
        }

        public void setTrimPathOffset(float f10) {
            this.f23575k = f10;
        }

        public void setTrimPathStart(float f10) {
            this.f23573i = f10;
        }

        public c(c cVar) {
            super(cVar);
            this.f23569e = 0.0f;
            this.f23571g = 1.0f;
            this.f23572h = 1.0f;
            this.f23573i = 0.0f;
            this.f23574j = 1.0f;
            this.f23575k = 0.0f;
            this.f23576l = Paint.Cap.BUTT;
            this.f23577m = Paint.Join.MITER;
            this.f23578n = 4.0f;
            this.mThemeAttrs = cVar.mThemeAttrs;
            this.f23568d = cVar.f23568d;
            this.f23569e = cVar.f23569e;
            this.f23571g = cVar.f23571g;
            this.f23570f = cVar.f23570f;
            this.f23592b = cVar.f23592b;
            this.f23572h = cVar.f23572h;
            this.f23573i = cVar.f23573i;
            this.f23574j = cVar.f23574j;
            this.f23575k = cVar.f23575k;
            this.f23576l = cVar.f23576l;
            this.f23577m = cVar.f23577m;
            this.f23578n = cVar.f23578n;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.g$g, reason: collision with other inner class name */
    public static class C0413g {

        /* renamed from: q, reason: collision with root package name */
        public static final Matrix f23594q = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        public final Path f23595a;

        /* renamed from: b, reason: collision with root package name */
        public final Path f23596b;

        /* renamed from: c, reason: collision with root package name */
        public final Matrix f23597c;

        /* renamed from: d, reason: collision with root package name */
        public Paint f23598d;

        /* renamed from: e, reason: collision with root package name */
        public Paint f23599e;

        /* renamed from: f, reason: collision with root package name */
        public PathMeasure f23600f;

        /* renamed from: g, reason: collision with root package name */
        public int f23601g;

        /* renamed from: h, reason: collision with root package name */
        public final d f23602h;

        /* renamed from: i, reason: collision with root package name */
        public float f23603i;

        /* renamed from: j, reason: collision with root package name */
        public float f23604j;

        /* renamed from: k, reason: collision with root package name */
        public float f23605k;

        /* renamed from: l, reason: collision with root package name */
        public float f23606l;

        /* renamed from: m, reason: collision with root package name */
        public int f23607m;

        /* renamed from: n, reason: collision with root package name */
        public String f23608n;

        /* renamed from: o, reason: collision with root package name */
        public Boolean f23609o;

        /* renamed from: p, reason: collision with root package name */
        public final C6900a f23610p;

        public C0413g() {
            this.f23597c = new Matrix();
            this.f23603i = 0.0f;
            this.f23604j = 0.0f;
            this.f23605k = 0.0f;
            this.f23606l = 0.0f;
            this.f23607m = 255;
            this.f23608n = null;
            this.f23609o = null;
            this.f23610p = new C6900a();
            this.f23602h = new d();
            this.f23595a = new Path();
            this.f23596b = new Path();
        }

        public static float a(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        public void b(Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            c(this.f23602h, f23594q, canvas, i10, i11, colorFilter);
        }

        public final void c(d dVar, Matrix matrix, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            d dVar2 = dVar;
            dVar2.f23579a.set(matrix);
            dVar2.f23579a.preConcat(dVar2.f23588j);
            canvas.save();
            int i12 = 0;
            while (i12 < dVar2.f23580b.size()) {
                e eVar = (e) dVar2.f23580b.get(i12);
                if (eVar instanceof d) {
                    c((d) eVar, dVar2.f23579a, canvas, i10, i11, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar2, (f) eVar, canvas, i10, i11, colorFilter);
                }
                i12++;
                dVar2 = dVar;
            }
            canvas.restore();
        }

        public final void d(d dVar, f fVar, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            float f10 = i10 / this.f23605k;
            float f11 = i11 / this.f23606l;
            float min = Math.min(f10, f11);
            Matrix matrix = dVar.f23579a;
            this.f23597c.set(matrix);
            this.f23597c.postScale(f10, f11);
            float e10 = e(matrix);
            if (e10 == 0.0f) {
                return;
            }
            fVar.d(this.f23595a);
            Path path = this.f23595a;
            this.f23596b.reset();
            if (fVar.c()) {
                this.f23596b.setFillType(fVar.f23592b == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f23596b.addPath(path, this.f23597c);
                canvas.clipPath(this.f23596b);
                return;
            }
            c cVar = (c) fVar;
            float f12 = cVar.f23573i;
            if (f12 != 0.0f || cVar.f23574j != 1.0f) {
                float f13 = cVar.f23575k;
                float f14 = (f12 + f13) % 1.0f;
                float f15 = (cVar.f23574j + f13) % 1.0f;
                if (this.f23600f == null) {
                    this.f23600f = new PathMeasure();
                }
                this.f23600f.setPath(this.f23595a, false);
                float length = this.f23600f.getLength();
                float f16 = f14 * length;
                float f17 = f15 * length;
                path.reset();
                if (f16 > f17) {
                    this.f23600f.getSegment(f16, length, path, true);
                    this.f23600f.getSegment(0.0f, f17, path, true);
                } else {
                    this.f23600f.getSegment(f16, f17, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f23596b.addPath(path, this.f23597c);
            if (cVar.f23570f.l()) {
                androidx.core.content.res.d dVar2 = cVar.f23570f;
                if (this.f23599e == null) {
                    Paint paint = new Paint(1);
                    this.f23599e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f23599e;
                if (dVar2.h()) {
                    Shader f18 = dVar2.f();
                    f18.setLocalMatrix(this.f23597c);
                    paint2.setShader(f18);
                    paint2.setAlpha(Math.round(cVar.f23572h * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(g.a(dVar2.e(), cVar.f23572h));
                }
                paint2.setColorFilter(colorFilter);
                this.f23596b.setFillType(cVar.f23592b == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f23596b, paint2);
            }
            if (cVar.f23568d.l()) {
                androidx.core.content.res.d dVar3 = cVar.f23568d;
                if (this.f23598d == null) {
                    Paint paint3 = new Paint(1);
                    this.f23598d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f23598d;
                Paint.Join join = cVar.f23577m;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f23576l;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f23578n);
                if (dVar3.h()) {
                    Shader f19 = dVar3.f();
                    f19.setLocalMatrix(this.f23597c);
                    paint4.setShader(f19);
                    paint4.setAlpha(Math.round(cVar.f23571g * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(g.a(dVar3.e(), cVar.f23571g));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f23569e * min * e10);
                canvas.drawPath(this.f23596b, paint4);
            }
        }

        public final float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot(fArr[0], fArr[1]);
            float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float a10 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max(hypot, hypot2);
            if (max > 0.0f) {
                return Math.abs(a10) / max;
            }
            return 0.0f;
        }

        public boolean f() {
            if (this.f23609o == null) {
                this.f23609o = Boolean.valueOf(this.f23602h.a());
            }
            return this.f23609o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f23602h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f23607m;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f23607m = i10;
        }

        public C0413g(C0413g c0413g) {
            this.f23597c = new Matrix();
            this.f23603i = 0.0f;
            this.f23604j = 0.0f;
            this.f23605k = 0.0f;
            this.f23606l = 0.0f;
            this.f23607m = 255;
            this.f23608n = null;
            this.f23609o = null;
            C6900a c6900a = new C6900a();
            this.f23610p = c6900a;
            this.f23602h = new d(c0413g.f23602h, c6900a);
            this.f23595a = new Path(c0413g.f23595a);
            this.f23596b = new Path(c0413g.f23596b);
            this.f23603i = c0413g.f23603i;
            this.f23604j = c0413g.f23604j;
            this.f23605k = c0413g.f23605k;
            this.f23606l = c0413g.f23606l;
            this.f23601g = c0413g.f23601g;
            this.f23607m = c0413g.f23607m;
            this.f23608n = c0413g.f23608n;
            String str = c0413g.f23608n;
            if (str != null) {
                c6900a.put(str, this);
            }
            this.f23609o = c0413g.f23609o;
        }
    }

    public static class d extends e {

        /* renamed from: a, reason: collision with root package name */
        public final Matrix f23579a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f23580b;

        /* renamed from: c, reason: collision with root package name */
        public float f23581c;

        /* renamed from: d, reason: collision with root package name */
        public float f23582d;

        /* renamed from: e, reason: collision with root package name */
        public float f23583e;

        /* renamed from: f, reason: collision with root package name */
        public float f23584f;

        /* renamed from: g, reason: collision with root package name */
        public float f23585g;

        /* renamed from: h, reason: collision with root package name */
        public float f23586h;

        /* renamed from: i, reason: collision with root package name */
        public float f23587i;

        /* renamed from: j, reason: collision with root package name */
        public final Matrix f23588j;

        /* renamed from: k, reason: collision with root package name */
        public int f23589k;

        /* renamed from: l, reason: collision with root package name */
        public String f23590l;
        private int[] mThemeAttrs;

        public d(d dVar, C6900a c6900a) {
            super();
            f bVar;
            this.f23579a = new Matrix();
            this.f23580b = new ArrayList();
            this.f23581c = 0.0f;
            this.f23582d = 0.0f;
            this.f23583e = 0.0f;
            this.f23584f = 1.0f;
            this.f23585g = 1.0f;
            this.f23586h = 0.0f;
            this.f23587i = 0.0f;
            Matrix matrix = new Matrix();
            this.f23588j = matrix;
            this.f23590l = null;
            this.f23581c = dVar.f23581c;
            this.f23582d = dVar.f23582d;
            this.f23583e = dVar.f23583e;
            this.f23584f = dVar.f23584f;
            this.f23585g = dVar.f23585g;
            this.f23586h = dVar.f23586h;
            this.f23587i = dVar.f23587i;
            this.mThemeAttrs = dVar.mThemeAttrs;
            String str = dVar.f23590l;
            this.f23590l = str;
            this.f23589k = dVar.f23589k;
            if (str != null) {
                c6900a.put(str, this);
            }
            matrix.set(dVar.f23588j);
            ArrayList arrayList = dVar.f23580b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Object obj = arrayList.get(i10);
                if (obj instanceof d) {
                    this.f23580b.add(new d((d) obj, c6900a));
                } else {
                    if (obj instanceof c) {
                        bVar = new c((c) obj);
                    } else {
                        if (!(obj instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) obj);
                    }
                    this.f23580b.add(bVar);
                    Object obj2 = bVar.f23591a;
                    if (obj2 != null) {
                        c6900a.put(obj2, bVar);
                    }
                }
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.e
        public boolean a() {
            for (int i10 = 0; i10 < this.f23580b.size(); i10++) {
                if (((e) this.f23580b.get(i10)).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.e
        public boolean b(int[] iArr) {
            boolean z10 = false;
            for (int i10 = 0; i10 < this.f23580b.size(); i10++) {
                z10 |= ((e) this.f23580b.get(i10)).b(iArr);
            }
            return z10;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray i10 = n.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.STYLEABLE_VECTOR_DRAWABLE_GROUP);
            e(i10, xmlPullParser);
            i10.recycle();
        }

        public final void d() {
            this.f23588j.reset();
            this.f23588j.postTranslate(-this.f23582d, -this.f23583e);
            this.f23588j.postScale(this.f23584f, this.f23585g);
            this.f23588j.postRotate(this.f23581c, 0.0f, 0.0f);
            this.f23588j.postTranslate(this.f23586h + this.f23582d, this.f23587i + this.f23583e);
        }

        public final void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.mThemeAttrs = null;
            this.f23581c = n.f(typedArray, xmlPullParser, ViewProps.ROTATION, 5, this.f23581c);
            this.f23582d = typedArray.getFloat(1, this.f23582d);
            this.f23583e = typedArray.getFloat(2, this.f23583e);
            this.f23584f = n.f(typedArray, xmlPullParser, ViewProps.SCALE_X, 3, this.f23584f);
            this.f23585g = n.f(typedArray, xmlPullParser, ViewProps.SCALE_Y, 4, this.f23585g);
            this.f23586h = n.f(typedArray, xmlPullParser, ViewProps.TRANSLATE_X, 6, this.f23586h);
            this.f23587i = n.f(typedArray, xmlPullParser, ViewProps.TRANSLATE_Y, 7, this.f23587i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f23590l = string;
            }
            d();
        }

        public String getGroupName() {
            return this.f23590l;
        }

        public Matrix getLocalMatrix() {
            return this.f23588j;
        }

        public float getPivotX() {
            return this.f23582d;
        }

        public float getPivotY() {
            return this.f23583e;
        }

        public float getRotation() {
            return this.f23581c;
        }

        public float getScaleX() {
            return this.f23584f;
        }

        public float getScaleY() {
            return this.f23585g;
        }

        public float getTranslateX() {
            return this.f23586h;
        }

        public float getTranslateY() {
            return this.f23587i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f23582d) {
                this.f23582d = f10;
                d();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f23583e) {
                this.f23583e = f10;
                d();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f23581c) {
                this.f23581c = f10;
                d();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f23584f) {
                this.f23584f = f10;
                d();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f23585g) {
                this.f23585g = f10;
                d();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f23586h) {
                this.f23586h = f10;
                d();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f23587i) {
                this.f23587i = f10;
                d();
            }
        }

        public d() {
            super();
            this.f23579a = new Matrix();
            this.f23580b = new ArrayList();
            this.f23581c = 0.0f;
            this.f23582d = 0.0f;
            this.f23583e = 0.0f;
            this.f23584f = 1.0f;
            this.f23585g = 1.0f;
            this.f23586h = 0.0f;
            this.f23587i = 0.0f;
            this.f23588j = new Matrix();
            this.f23590l = null;
        }
    }
}
