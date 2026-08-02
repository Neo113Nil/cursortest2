package com.vk.utils.vectordrawable.internal.element;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import androidx.annotation.Keep;
import com.unity3d.services.UnityAdsConstants;
import com.vk.utils.vectordrawable.AnimationTarget;
import java.util.Iterator;
import java.util.List;
import xsna.zcl;

/* compiled from: Shape.kt */
@Keep
/* loaded from: classes6.dex */
public final class Shape implements ElementHolder, AnimationTarget {
    public static final a Companion = new a();
    private static final Shape EMPTY = new Shape(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 64, null);
    private final /* synthetic */ ElementHolder $$delegate_0;
    private int alpha;
    private final Path fullPath;
    private final float height;
    private final String name;
    private final Matrix scaleMatrix;
    private final float viewportHeight;
    private final float viewportWidth;
    private final float width;

    /* compiled from: Shape.kt */
    public static final class a {
    }

    public Shape(String str, float f, float f2, int i, float f3, float f4, ElementHolder elementHolder) {
        this.$$delegate_0 = elementHolder;
        this.name = str;
        this.viewportWidth = f;
        this.viewportHeight = f2;
        this.alpha = i;
        this.width = f3;
        this.height = f4;
        this.fullPath = new Path();
        this.scaleMatrix = new Matrix();
    }

    @Override // com.vk.utils.vectordrawable.internal.element.ElementHolder
    public void addClipPath(ClipPathElement clipPathElement) {
        this.$$delegate_0.addClipPath(clipPathElement);
    }

    @Override // com.vk.utils.vectordrawable.internal.element.ElementHolder
    public void addGroup(GroupElement groupElement) {
        this.$$delegate_0.addGroup(groupElement);
    }

    @Override // com.vk.utils.vectordrawable.internal.element.ElementHolder
    public void addPath(PathElement pathElement) {
        this.$$delegate_0.addPath(pathElement);
    }

    public final void appendToFullPath(Path path) {
        this.fullPath.addPath(path);
    }

    public final void buildTransformMatrices() {
        Iterator<T> it = getGroupElements().iterator();
        while (it.hasNext()) {
            ((GroupElement) it.next()).buildTransformMatrix();
        }
    }

    @Override // com.vk.utils.vectordrawable.internal.element.ElementHolder
    public void draw(Canvas canvas) {
        this.$$delegate_0.draw(canvas);
    }

    @Override // com.vk.utils.vectordrawable.internal.element.ElementHolder
    public ClipPathElement findClipPath(String str) {
        return this.$$delegate_0.findClipPath(str);
    }

    @Override // com.vk.utils.vectordrawable.internal.element.ElementHolder
    public GroupElement findGroup(String str) {
        return this.$$delegate_0.findGroup(str);
    }

    @Override // com.vk.utils.vectordrawable.internal.element.ElementHolder
    public PathElement findPath(String str) {
        return this.$$delegate_0.findPath(str);
    }

    public final int getAlpha() {
        return this.alpha;
    }

    @Override // com.vk.utils.vectordrawable.internal.element.ElementHolder
    public List<ClipPathElement> getClipPathElements() {
        return this.$$delegate_0.getClipPathElements();
    }

    @Override // com.vk.utils.vectordrawable.internal.element.ElementHolder
    public List<GroupElement> getGroupElements() {
        return this.$$delegate_0.getGroupElements();
    }

    public final float getHeight() {
        return this.height;
    }

    public final String getName() {
        return this.name;
    }

    @Override // com.vk.utils.vectordrawable.internal.element.ElementHolder
    public PathElement getOnlyPath() {
        return this.$$delegate_0.getOnlyPath();
    }

    @Override // com.vk.utils.vectordrawable.internal.element.ElementHolder
    public List<PathElement> getPathElements() {
        return this.$$delegate_0.getPathElements();
    }

    public final float getViewportHeight() {
        return this.viewportHeight;
    }

    public final float getViewportWidth() {
        return this.viewportWidth;
    }

    public final float getWidth() {
        return this.width;
    }

    public final void scaleAllPaths(Matrix matrix) {
        this.scaleMatrix.set(matrix);
        Iterator<T> it = getGroupElements().iterator();
        while (it.hasNext()) {
            ((GroupElement) it.next()).scaleAllPaths(matrix);
        }
        Iterator<T> it2 = getPathElements().iterator();
        while (it2.hasNext()) {
            ((PathElement) it2.next()).transform(matrix);
        }
        Iterator<T> it3 = getClipPathElements().iterator();
        while (it3.hasNext()) {
            ((ClipPathElement) it3.next()).transform(matrix);
        }
    }

    @Override // com.vk.utils.vectordrawable.internal.element.ElementHolder
    public void scaleAllStrokeWidth(float f) {
        this.$$delegate_0.scaleAllStrokeWidth(f);
    }

    public final void setAlpha(int i) {
        this.alpha = i;
    }

    public String toString() {
        return "Shape(name=" + this.name + ", viewportWidth=" + this.viewportWidth + ", viewportHeight=" + this.viewportHeight + ", alpha=" + this.alpha + ", width=" + this.width + ", height=" + this.height + ", fullPath=" + this.fullPath + ", scaleMatrix=" + this.scaleMatrix + ", groupElements=" + getGroupElements() + ", pathElements=" + getPathElements() + ", clipPathElements=" + getClipPathElements() + ')';
    }

    public /* synthetic */ Shape(String str, float f, float f2, int i, float f3, float f4, ElementHolder elementHolder, int i2, zcl zclVar) {
        this(str, f, f2, i, f3, f4, (i2 & 64) != 0 ? new ElementHolderImpl() : elementHolder);
    }

    public Shape(Shape shape) {
        this(shape.name, shape.viewportWidth, shape.viewportHeight, shape.alpha, shape.width, shape.height, new ElementHolderImpl(shape));
        this.fullPath.set(shape.fullPath);
        this.scaleMatrix.set(shape.scaleMatrix);
    }
}
