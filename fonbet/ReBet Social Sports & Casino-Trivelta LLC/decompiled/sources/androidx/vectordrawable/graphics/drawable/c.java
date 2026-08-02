package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.core.content.res.k;
import androidx.core.content.res.n;
import java.util.ArrayList;
import n0.AbstractC5597a;
import org.xmlpull.v1.XmlPullParser;
import z.C6900a;

/* loaded from: classes.dex */
public class c extends f implements Animatable {

    /* renamed from: b, reason: collision with root package name */
    public C0412c f23543b;

    /* renamed from: c, reason: collision with root package name */
    public Context f23544c;

    /* renamed from: d, reason: collision with root package name */
    public ArgbEvaluator f23545d;

    /* renamed from: e, reason: collision with root package name */
    public d f23546e;

    /* renamed from: f, reason: collision with root package name */
    public Animator.AnimatorListener f23547f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f23548g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable.Callback f23549h;

    public class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            c.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            c.this.scheduleSelf(runnable, j10);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            c.this.unscheduleSelf(runnable);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f23548g);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.vectordrawable.graphics.drawable.b) arrayList.get(i10)).b(c.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f23548g);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.vectordrawable.graphics.drawable.b) arrayList.get(i10)).c(c.this);
            }
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.c$c, reason: collision with other inner class name */
    public static class C0412c extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public int f23552a;

        /* renamed from: b, reason: collision with root package name */
        public g f23553b;

        /* renamed from: c, reason: collision with root package name */
        public AnimatorSet f23554c;

        /* renamed from: d, reason: collision with root package name */
        public ArrayList f23555d;

        /* renamed from: e, reason: collision with root package name */
        public C6900a f23556e;

        public C0412c(Context context, C0412c c0412c, Drawable.Callback callback, Resources resources) {
            if (c0412c != null) {
                this.f23552a = c0412c.f23552a;
                g gVar = c0412c.f23553b;
                if (gVar != null) {
                    Drawable.ConstantState constantState = gVar.getConstantState();
                    if (resources != null) {
                        this.f23553b = (g) constantState.newDrawable(resources);
                    } else {
                        this.f23553b = (g) constantState.newDrawable();
                    }
                    g gVar2 = (g) this.f23553b.mutate();
                    this.f23553b = gVar2;
                    gVar2.setCallback(callback);
                    this.f23553b.setBounds(c0412c.f23553b.getBounds());
                    this.f23553b.g(false);
                }
                ArrayList arrayList = c0412c.f23555d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f23555d = new ArrayList(size);
                    this.f23556e = new C6900a(size);
                    for (int i10 = 0; i10 < size; i10++) {
                        Animator animator = (Animator) c0412c.f23555d.get(i10);
                        Animator clone = animator.clone();
                        String str = (String) c0412c.f23556e.get(animator);
                        clone.setTarget(this.f23553b.c(str));
                        this.f23555d.add(clone);
                        this.f23556e.put(clone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f23554c == null) {
                this.f23554c = new AnimatorSet();
            }
            this.f23554c.playTogether(this.f23555d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f23552a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public c() {
        this(null, null, null);
    }

    public static c a(Context context, int i10) {
        c cVar = new c(context);
        Drawable f10 = k.f(context.getResources(), i10, context.getTheme());
        cVar.f23558a = f10;
        f10.setCallback(cVar.f23549h);
        cVar.f23546e = new d(cVar.f23558a.getConstantState());
        return cVar;
    }

    public static void c(AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.b bVar) {
        animatedVectorDrawable.registerAnimationCallback(bVar.a());
    }

    public static boolean g(AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.b bVar) {
        return animatedVectorDrawable.unregisterAnimationCallback(bVar.a());
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f23558a;
        if (drawable != null) {
            AbstractC5597a.a(drawable, theme);
        }
    }

    public void b(androidx.vectordrawable.graphics.drawable.b bVar) {
        Drawable drawable = this.f23558a;
        if (drawable != null) {
            c((AnimatedVectorDrawable) drawable, bVar);
            return;
        }
        if (bVar == null) {
            return;
        }
        if (this.f23548g == null) {
            this.f23548g = new ArrayList();
        }
        if (this.f23548g.contains(bVar)) {
            return;
        }
        this.f23548g.add(bVar);
        if (this.f23547f == null) {
            this.f23547f = new b();
        }
        this.f23543b.f23554c.addListener(this.f23547f);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f23558a;
        if (drawable != null) {
            return AbstractC5597a.b(drawable);
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public final void d() {
        Animator.AnimatorListener animatorListener = this.f23547f;
        if (animatorListener != null) {
            this.f23543b.f23554c.removeListener(animatorListener);
            this.f23547f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f23558a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f23543b.f23553b.draw(canvas);
        if (this.f23543b.f23554c.isStarted()) {
            invalidateSelf();
        }
    }

    public final void e(String str, Animator animator) {
        animator.setTarget(this.f23543b.f23553b.c(str));
        C0412c c0412c = this.f23543b;
        if (c0412c.f23555d == null) {
            c0412c.f23555d = new ArrayList();
            this.f23543b.f23556e = new C6900a();
        }
        this.f23543b.f23555d.add(animator);
        this.f23543b.f23556e.put(animator, str);
    }

    public boolean f(androidx.vectordrawable.graphics.drawable.b bVar) {
        Drawable drawable = this.f23558a;
        if (drawable != null) {
            g((AnimatedVectorDrawable) drawable, bVar);
        }
        ArrayList arrayList = this.f23548g;
        if (arrayList == null || bVar == null) {
            return false;
        }
        boolean remove = arrayList.remove(bVar);
        if (this.f23548g.size() == 0) {
            d();
        }
        return remove;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f23558a;
        return drawable != null ? AbstractC5597a.d(drawable) : this.f23543b.f23553b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f23558a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f23543b.f23552a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f23558a;
        return drawable != null ? AbstractC5597a.e(drawable) : this.f23543b.f23553b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f23558a != null) {
            return new d(this.f23558a.getConstantState());
        }
        return null;
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f23558a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f23543b.f23553b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f23558a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f23543b.f23553b.getIntrinsicWidth();
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
        return drawable != null ? drawable.getOpacity() : this.f23543b.f23553b.getOpacity();
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

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f23558a;
        if (drawable != null) {
            AbstractC5597a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray i10 = n.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.STYLEABLE_ANIMATED_VECTOR_DRAWABLE);
                    int resourceId = i10.getResourceId(0, 0);
                    if (resourceId != 0) {
                        g b10 = g.b(resources, resourceId, theme);
                        b10.g(false);
                        b10.setCallback(this.f23549h);
                        g gVar = this.f23543b.f23553b;
                        if (gVar != null) {
                            gVar.setCallback(null);
                        }
                        this.f23543b.f23553b = b10;
                    }
                    i10.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, androidx.vectordrawable.graphics.drawable.a.STYLEABLE_ANIMATED_VECTOR_DRAWABLE_TARGET);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f23544c;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        e(string, e.a(context, resourceId2));
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f23543b.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f23558a;
        return drawable != null ? AbstractC5597a.h(drawable) : this.f23543b.f23553b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f23558a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f23543b.f23554c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f23558a;
        return drawable != null ? drawable.isStateful() : this.f23543b.f23553b.isStateful();
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
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f23558a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f23543b.f23553b.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        Drawable drawable = this.f23558a;
        return drawable != null ? drawable.setLevel(i10) : this.f23543b.f23553b.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f23558a;
        return drawable != null ? drawable.setState(iArr) : this.f23543b.f23553b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f23558a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f23543b.f23553b.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f23558a;
        if (drawable != null) {
            AbstractC5597a.j(drawable, z10);
        } else {
            this.f23543b.f23553b.setAutoMirrored(z10);
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
            this.f23543b.f23553b.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f23558a;
        if (drawable != null) {
            AbstractC5597a.o(drawable, colorStateList);
        } else {
            this.f23543b.f23553b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f23558a;
        if (drawable != null) {
            AbstractC5597a.p(drawable, mode);
        } else {
            this.f23543b.f23553b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f23558a;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f23543b.f23553b.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f23558a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f23543b.f23554c.isStarted()) {
                return;
            }
            this.f23543b.f23554c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f23558a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f23543b.f23554c.end();
        }
    }

    public c(Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f23558a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f23543b.f23553b.setColorFilter(colorFilter);
        }
    }

    public static class d extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f23557a;

        public d(Drawable.ConstantState constantState) {
            this.f23557a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f23557a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f23557a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            c cVar = new c();
            Drawable newDrawable = this.f23557a.newDrawable();
            cVar.f23558a = newDrawable;
            newDrawable.setCallback(cVar.f23549h);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            c cVar = new c();
            Drawable newDrawable = this.f23557a.newDrawable(resources);
            cVar.f23558a = newDrawable;
            newDrawable.setCallback(cVar.f23549h);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c();
            Drawable newDrawable = this.f23557a.newDrawable(resources, theme);
            cVar.f23558a = newDrawable;
            newDrawable.setCallback(cVar.f23549h);
            return cVar;
        }
    }

    public c(Context context, C0412c c0412c, Resources resources) {
        this.f23545d = null;
        this.f23547f = null;
        this.f23548g = null;
        a aVar = new a();
        this.f23549h = aVar;
        this.f23544c = context;
        if (c0412c != null) {
            this.f23543b = c0412c;
        } else {
            this.f23543b = new C0412c(context, c0412c, aVar, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
