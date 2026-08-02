package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h extends k implements Animatable {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f2795g = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Context f2797c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.appcompat.widget.d f2798d = null;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f2799e = null;

    /* renamed from: f, reason: collision with root package name */
    public final d f2800f = new d(this);

    /* renamed from: b, reason: collision with root package name */
    public final e f2796b = new e();

    public h(Context context, int i5) {
        this.f2797c = context;
    }

    @Override // androidx.vectordrawable.graphics.drawable.k, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f2803a;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f2803a;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f2803a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        e eVar = this.f2796b;
        eVar.f2790a.draw(canvas);
        if (eVar.f2791b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f2803a;
        return drawable != null ? drawable.getAlpha() : this.f2796b.f2790a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f2803a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f2796b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f2803a;
        return drawable != null ? drawable.getColorFilter() : this.f2796b.f2790a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f2803a == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new f(this.f2803a.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f2803a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f2796b.f2790a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f2803a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f2796b.f2790a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f2803a;
        return drawable != null ? drawable.getOpacity() : this.f2796b.f2790a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        e eVar;
        XmlResourceParser animation;
        Animator a7;
        Drawable drawable = this.f2803a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int i5 = 1;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            eVar = this.f2796b;
            if (eventType == i5 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                XmlResourceParser xmlResourceParser = null;
                if ("animated-vector".equals(name)) {
                    TypedArray f6 = f0.b.f(resources, theme, attributeSet, a.f2781e);
                    int resourceId = f6.getResourceId(0, 0);
                    if (resourceId != 0) {
                        t a10 = t.a(resources, resourceId, theme);
                        if (a10 == null) {
                            throw new NullPointerException("Failed to load drawable");
                        }
                        a10.f2858f = false;
                        a10.setCallback(this.f2800f);
                        t tVar = eVar.f2790a;
                        if (tVar != null) {
                            tVar.setCallback(null);
                        }
                        eVar.f2790a = a10;
                    }
                    f6.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a.f2782f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(i5, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f2797c;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        if (Build.VERSION.SDK_INT >= 24) {
                            a7 = AnimatorInflater.loadAnimator(context, resourceId2);
                        } else {
                            Resources resources2 = context.getResources();
                            Resources.Theme theme2 = context.getTheme();
                            try {
                                try {
                                    animation = resources2.getAnimation(resourceId2);
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            } catch (IOException e7) {
                                e = e7;
                            } catch (XmlPullParserException e9) {
                                e = e9;
                            }
                            try {
                                a7 = a.a(context, resources2, theme2, animation, Xml.asAttributeSet(animation), null, 0);
                                animation.close();
                            } catch (IOException e10) {
                                e = e10;
                                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                notFoundException.initCause(e);
                                throw notFoundException;
                            } catch (XmlPullParserException e11) {
                                e = e11;
                                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                notFoundException2.initCause(e);
                                throw notFoundException2;
                            } catch (Throwable th3) {
                                th = th3;
                                xmlResourceParser = animation;
                                if (xmlResourceParser != null) {
                                    xmlResourceParser.close();
                                }
                                throw th;
                            }
                        }
                        a7.setTarget(eVar.f2790a.f2854b.f2843b.f2841o.get(string));
                        if (eVar.f2792c == null) {
                            eVar.f2792c = new ArrayList();
                            eVar.f2793d = new s.e(0);
                        }
                        eVar.f2792c.add(a7);
                        eVar.f2793d.put(a7, string);
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
            i5 = 1;
        }
        if (eVar.f2791b == null) {
            eVar.f2791b = new AnimatorSet();
        }
        eVar.f2791b.playTogether(eVar.f2792c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f2803a;
        return drawable != null ? drawable.isAutoMirrored() : this.f2796b.f2790a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f2803a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f2796b.f2791b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f2803a;
        return drawable != null ? drawable.isStateful() : this.f2796b.f2790a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f2803a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2803a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f2796b.f2790a.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.k, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i5) {
        Drawable drawable = this.f2803a;
        return drawable != null ? drawable.setLevel(i5) : this.f2796b.f2790a.setLevel(i5);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f2803a;
        return drawable != null ? drawable.setState(iArr) : this.f2796b.f2790a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i5) {
        Drawable drawable = this.f2803a;
        if (drawable != null) {
            drawable.setAlpha(i5);
        } else {
            this.f2796b.f2790a.setAlpha(i5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z5) {
        Drawable drawable = this.f2803a;
        if (drawable != null) {
            drawable.setAutoMirrored(z5);
        } else {
            this.f2796b.f2790a.setAutoMirrored(z5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2803a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f2796b.f2790a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i5) {
        Drawable drawable = this.f2803a;
        if (drawable != null) {
            ci.c.Y(drawable, i5);
        } else {
            this.f2796b.f2790a.setTint(i5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f2803a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f2796b.f2790a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f2803a;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f2796b.f2790a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z5, boolean z7) {
        Drawable drawable = this.f2803a;
        if (drawable != null) {
            return drawable.setVisible(z5, z7);
        }
        this.f2796b.f2790a.setVisible(z5, z7);
        return super.setVisible(z5, z7);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f2803a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        e eVar = this.f2796b;
        if (eVar.f2791b.isStarted()) {
            return;
        }
        eVar.f2791b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f2803a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f2796b.f2791b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
