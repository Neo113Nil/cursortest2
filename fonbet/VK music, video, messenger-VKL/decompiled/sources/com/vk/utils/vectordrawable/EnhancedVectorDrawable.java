package com.vk.utils.vectordrawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.LruCache;
import androidx.annotation.Keep;
import com.unity3d.services.UnityAdsConstants;
import com.vk.utils.vectordrawable.internal.element.ClipPathElement;
import com.vk.utils.vectordrawable.internal.element.GroupElement;
import com.vk.utils.vectordrawable.internal.element.PathElement;
import com.vk.utils.vectordrawable.internal.element.Shape;
import java.io.IOException;
import java.util.Stack;
import kotlin.NoWhenBranchMatchedException;
import org.xmlpull.v1.XmlPullParserException;
import xsna.epx;
import xsna.flr0;
import xsna.fy2;
import xsna.glr0;
import xsna.iq90;
import xsna.ozl;
import xsna.qlr0;
import xsna.t8d;
import xsna.uju;

/* compiled from: EnhancedVectorDrawable.kt */
@Keep
/* loaded from: classes6.dex */
public final class EnhancedVectorDrawable extends Drawable implements qlr0 {
    public static final a Companion;
    private static final String TAG;
    private int height;
    private int left;
    private final int resId;
    private final Resources resources;
    private final Matrix scaleMatrix;
    private float scaleRatio;
    private final Shape shape;
    private float strokeRatio;
    private int top;
    private int width;

    /* compiled from: EnhancedVectorDrawable.kt */
    public static final class a {
    }

    /* compiled from: EnhancedVectorDrawable.kt */
    public static final class b extends Drawable.ConstantState {
        public b() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            EnhancedVectorDrawable enhancedVectorDrawable = EnhancedVectorDrawable.this;
            return new EnhancedVectorDrawable(enhancedVectorDrawable.resources, enhancedVectorDrawable.resId);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return resources != null ? new EnhancedVectorDrawable(resources, EnhancedVectorDrawable.this.resId) : newDrawable();
        }
    }

    static {
        a aVar = new a();
        Companion = aVar;
        TAG = aVar.getClass().getSimpleName();
    }

    public EnhancedVectorDrawable(Context context, int i) {
        this(context.getResources(), i);
    }

    private final void buildScaleMatrix() {
        Matrix matrix = this.scaleMatrix;
        matrix.reset();
        matrix.postTranslate((this.width / 2.0f) - (this.shape.getViewportWidth() / 2.0f), (this.height / 2.0f) - (this.shape.getViewportHeight() / 2.0f));
        float min = Math.min(this.width / this.shape.getViewportWidth(), this.height / this.shape.getViewportHeight());
        this.scaleRatio = min;
        matrix.postScale(min, min, this.width / 2.0f, this.height / 2.0f);
    }

    private final Shape buildShape(int i) throws Resources.NotFoundException {
        flr0.a aVar;
        flr0.a aVar2;
        Resources resources = this.resources;
        fy2 fy2Var = flr0.a;
        Shape shape = (Shape) ((LruCache) fy2Var.b).get(Integer.valueOf(i));
        if (shape != null) {
            return new Shape(shape);
        }
        XmlResourceParser xml = resources.getXml(i);
        uju ujuVar = new uju();
        iq90 iq90Var = new iq90();
        t8d t8dVar = new t8d();
        Shape shape2 = new Shape(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 64, null);
        Stack stack = new Stack();
        try {
            try {
                PathElement pathElement = null;
                ClipPathElement clipPathElement = null;
                for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                    String name = xml.getName();
                    if (eventType == 2) {
                        flr0.a.Companion.getClass();
                        flr0.a[] values = flr0.a.values();
                        int length = values.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                aVar = null;
                                break;
                            }
                            aVar = values[i2];
                            if (epx.f(aVar.h(), name)) {
                                break;
                            }
                            i2++;
                        }
                        int i3 = aVar == null ? -1 : flr0.b.$EnumSwitchMapping$0[aVar.ordinal()];
                        if (i3 == -1) {
                            continue;
                        } else if (i3 == 1) {
                            shape2 = new glr0().q0(xml);
                        } else if (i3 == 2) {
                            stack.push(ujuVar.q0(xml));
                        } else if (i3 == 3) {
                            pathElement = iq90Var.q0(xml);
                        } else {
                            if (i3 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            clipPathElement = t8dVar.q0(xml);
                        }
                    } else if (eventType == 3) {
                        flr0.a.Companion.getClass();
                        flr0.a[] values2 = flr0.a.values();
                        int length2 = values2.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length2) {
                                aVar2 = null;
                                break;
                            }
                            aVar2 = values2[i4];
                            if (epx.f(aVar2.h(), name)) {
                                break;
                            }
                            i4++;
                        }
                        int i5 = aVar2 == null ? -1 : flr0.b.$EnumSwitchMapping$0[aVar2.ordinal()];
                        if (i5 == -1) {
                            continue;
                        } else if (i5 == 1) {
                            shape2.buildTransformMatrices();
                        } else if (i5 == 2) {
                            GroupElement groupElement = (GroupElement) stack.pop();
                            if (stack.isEmpty()) {
                                groupElement.setParent(null);
                                shape2.addGroup(groupElement);
                            } else {
                                groupElement.setParent((GroupElement) stack.peek());
                                ((GroupElement) stack.peek()).addGroup(groupElement);
                            }
                        } else if (i5 != 3) {
                            if (i5 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (clipPathElement == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            if (stack.isEmpty()) {
                                shape2.addClipPath(clipPathElement);
                            } else {
                                ((GroupElement) stack.peek()).addClipPath(clipPathElement);
                            }
                        } else {
                            if (pathElement == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            if (stack.isEmpty()) {
                                shape2.addPath(pathElement);
                            } else {
                                ((GroupElement) stack.peek()).addPath(pathElement);
                            }
                            shape2.appendToFullPath(pathElement.getPath());
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (XmlPullParserException e2) {
                e2.printStackTrace();
            }
            xml.close();
            ((LruCache) fy2Var.b).put(Integer.valueOf(i), shape2);
            return new Shape(shape2);
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }

    private final int dp(float f) {
        return (int) (this.resources.getDisplayMetrics().density * f);
    }

    private final void scaleAllPaths() {
        this.shape.scaleAllPaths(this.scaleMatrix);
    }

    private final void scaleAllStrokes() {
        float min = Math.min(this.width / this.shape.getWidth(), this.height / this.shape.getHeight());
        this.strokeRatio = min;
        this.shape.scaleAllStrokeWidth(min);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        setAlpha(this.shape.getAlpha());
        int i = this.left;
        if (i == 0 && this.top == 0) {
            this.shape.draw(canvas);
            return;
        }
        float f = this.top;
        int save = canvas.save();
        canvas.translate(i, f);
        try {
            this.shape.draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // xsna.qlr0
    public VectorPath findPath(String str) {
        return this.shape.findPath(str);
    }

    public final AnimationTarget findTarget$rich_vector_release(String str) {
        if (epx.f(this.shape.getName(), str)) {
            return this.shape;
        }
        GroupElement findGroup = this.shape.findGroup(str);
        if (findGroup != null) {
            return findGroup;
        }
        PathElement findPath = this.shape.findPath(str);
        return findPath != null ? findPath : this.shape.findClipPath(str);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return new b();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return dp(this.shape.getHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return dp(this.shape.getWidth());
    }

    public VectorPath getOnlyPath() {
        return this.shape.getOnlyPath();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final float getPixelSize() {
        if (this.shape.getWidth() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || this.shape.getHeight() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || this.shape.getViewportHeight() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || this.shape.getViewportWidth() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 1.0f;
        }
        return Math.min(this.shape.getViewportWidth() / dp(this.shape.getWidth()), this.shape.getViewportHeight() / dp(this.shape.getHeight()));
    }

    @Override // xsna.qlr0
    public void invalidatePath() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (rect.width() == 0 || rect.height() == 0) {
            return;
        }
        this.left = rect.left;
        this.top = rect.top;
        this.width = rect.width();
        this.height = rect.height();
        buildScaleMatrix();
        scaleAllPaths();
        scaleAllStrokes();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.shape.setAlpha(i);
    }

    public EnhancedVectorDrawable(Resources resources, int i) throws Resources.NotFoundException {
        Shape shape;
        this.scaleRatio = 1.0f;
        this.strokeRatio = 1.0f;
        this.scaleMatrix = new Matrix();
        this.resources = resources;
        this.resId = i;
        if (i != 0) {
            shape = buildShape(i);
        } else {
            Shape.Companion.getClass();
            shape = Shape.EMPTY;
        }
        this.shape = shape;
        setBounds(0, 0, dp(shape.getWidth()), dp(shape.getHeight()));
    }

    public EnhancedVectorDrawable(EnhancedVectorDrawable enhancedVectorDrawable) {
        this.scaleRatio = 1.0f;
        this.strokeRatio = 1.0f;
        this.scaleMatrix = new Matrix();
        this.resources = enhancedVectorDrawable.resources;
        this.resId = enhancedVectorDrawable.resId;
        Shape shape = new Shape(enhancedVectorDrawable.shape);
        this.shape = shape;
        setBounds(0, 0, dp(shape.getWidth()), dp(shape.getHeight()));
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    @ozl
    public void setTintList(ColorStateList colorStateList) {
    }

    @Override // android.graphics.drawable.Drawable
    @ozl
    public void setTintMode(PorterDuff.Mode mode) {
    }
}
