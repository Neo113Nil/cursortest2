package com.vk.utils.vectordrawable.internal.element;

import android.graphics.Canvas;
import android.graphics.Matrix;
import androidx.annotation.Keep;
import com.vk.utils.vectordrawable.AnimationTarget;
import java.util.Iterator;
import java.util.List;
import xsna.zcl;

/* compiled from: GroupElement.kt */
@Keep
/* loaded from: classes6.dex */
public final class GroupElement implements ElementHolder, AnimationTarget {
    private final /* synthetic */ ElementHolder $$delegate_0;
    private final Matrix finalTransformMatrix;
    private final String name;
    private final Matrix originalTransformMatrix;
    private GroupElement parent;
    private float pivotX;
    private float pivotY;
    private float rotation;
    private final Matrix scaleMatrix;
    private float scaleX;
    private float scaleY;
    private float translateX;
    private float translateY;

    public GroupElement(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, GroupElement groupElement, ElementHolder elementHolder) {
        this.$$delegate_0 = elementHolder;
        this.name = str;
        this.parent = groupElement;
        this.pivotX = f;
        this.pivotY = f2;
        this.rotation = f3;
        this.scaleX = f4;
        this.scaleY = f5;
        this.translateX = f6;
        this.translateY = f7;
        this.scaleMatrix = new Matrix();
        this.originalTransformMatrix = new Matrix();
        this.finalTransformMatrix = new Matrix();
    }

    private final void invalidateTransforms() {
        this.finalTransformMatrix.set(this.originalTransformMatrix);
        this.finalTransformMatrix.postConcat(this.scaleMatrix);
        Iterator<T> it = getGroupElements().iterator();
        while (it.hasNext()) {
            ((GroupElement) it.next()).scaleAllPaths(this.scaleMatrix);
        }
        Iterator<T> it2 = getPathElements().iterator();
        while (it2.hasNext()) {
            ((PathElement) it2.next()).transform(this.finalTransformMatrix);
        }
        Iterator<T> it3 = getClipPathElements().iterator();
        while (it3.hasNext()) {
            ((ClipPathElement) it3.next()).transform(this.finalTransformMatrix);
        }
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

    public final void buildTransformMatrix() {
        Matrix matrix = this.originalTransformMatrix;
        matrix.reset();
        matrix.postScale(this.scaleX, this.scaleY, this.pivotX, this.pivotY);
        matrix.postRotate(this.rotation, this.pivotX, this.pivotY);
        matrix.postTranslate(this.translateX, this.translateY);
        GroupElement groupElement = this.parent;
        if (groupElement != null) {
            this.originalTransformMatrix.postConcat(groupElement.originalTransformMatrix);
        }
        Iterator<T> it = getGroupElements().iterator();
        while (it.hasNext()) {
            ((GroupElement) it.next()).buildTransformMatrix();
        }
        invalidateTransforms();
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

    @Override // com.vk.utils.vectordrawable.internal.element.ElementHolder
    public List<ClipPathElement> getClipPathElements() {
        return this.$$delegate_0.getClipPathElements();
    }

    @Override // com.vk.utils.vectordrawable.internal.element.ElementHolder
    public List<GroupElement> getGroupElements() {
        return this.$$delegate_0.getGroupElements();
    }

    public final String getName() {
        return this.name;
    }

    @Override // com.vk.utils.vectordrawable.internal.element.ElementHolder
    public PathElement getOnlyPath() {
        return this.$$delegate_0.getOnlyPath();
    }

    public final GroupElement getParent() {
        return this.parent;
    }

    @Override // com.vk.utils.vectordrawable.internal.element.ElementHolder
    public List<PathElement> getPathElements() {
        return this.$$delegate_0.getPathElements();
    }

    public final float getPivotX() {
        return this.pivotX;
    }

    public final float getPivotY() {
        return this.pivotY;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final float getTranslateX() {
        return this.translateX;
    }

    public final float getTranslateY() {
        return this.translateY;
    }

    public final void scaleAllPaths(Matrix matrix) {
        this.scaleMatrix.set(matrix);
        invalidateTransforms();
    }

    @Override // com.vk.utils.vectordrawable.internal.element.ElementHolder
    public void scaleAllStrokeWidth(float f) {
        this.$$delegate_0.scaleAllStrokeWidth(f);
    }

    public final void setParent(GroupElement groupElement) {
        this.parent = groupElement;
    }

    public final void setPivotX(float f) {
        this.pivotX = f;
        buildTransformMatrix();
    }

    public final void setPivotY(float f) {
        this.pivotY = f;
        buildTransformMatrix();
    }

    public final void setRotation(float f) {
        this.rotation = f;
        buildTransformMatrix();
    }

    public final void setScaleX(float f) {
        this.scaleX = f;
        buildTransformMatrix();
    }

    public final void setScaleY(float f) {
        this.scaleY = f;
        buildTransformMatrix();
    }

    public final void setTranslateX(float f) {
        this.translateX = f;
        buildTransformMatrix();
    }

    public final void setTranslateY(float f) {
        this.translateY = f;
        buildTransformMatrix();
    }

    public String toString() {
        return "GroupElement(name=" + this.name + ", parent=" + this.parent + ", pivotX=" + this.pivotX + ", pivotY=" + this.pivotY + ", rotation=" + this.rotation + ", scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", translateX=" + this.translateX + ", translateY=" + this.translateY + ", scaleMatrix=" + this.scaleMatrix + ", originalTransformMatrix=" + this.originalTransformMatrix + ", finalTransformMatrix=" + this.finalTransformMatrix + ", groupElements=" + getGroupElements() + ", pathElements=" + getPathElements() + ", clipPathElements=" + getClipPathElements() + ')';
    }

    public /* synthetic */ GroupElement(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, GroupElement groupElement, ElementHolder elementHolder, int i, zcl zclVar) {
        this(str, f, f2, f3, f4, f5, f6, f7, (i & 256) != 0 ? null : groupElement, (i & 512) != 0 ? new ElementHolderImpl() : elementHolder);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GroupElement(GroupElement groupElement) {
        this(r1, r2, r3, r4, r5, r6, r7, r8, r0 != null ? new GroupElement(r0) : null, new ElementHolderImpl(groupElement));
        String str = groupElement.name;
        float f = groupElement.pivotX;
        float f2 = groupElement.pivotY;
        float f3 = groupElement.rotation;
        float f4 = groupElement.scaleX;
        float f5 = groupElement.scaleY;
        float f6 = groupElement.translateX;
        float f7 = groupElement.translateY;
        GroupElement groupElement2 = groupElement.parent;
        this.scaleMatrix.set(groupElement.scaleMatrix);
        this.originalTransformMatrix.set(groupElement.originalTransformMatrix);
        this.finalTransformMatrix.set(groupElement.finalTransformMatrix);
    }
}
