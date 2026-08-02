package com.vk.utils.vectordrawable.internal.element;

import android.graphics.Canvas;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.epx;
import xsna.j5g;

/* compiled from: ElementHolderImpl.kt */
@Keep
/* loaded from: classes6.dex */
public final class ElementHolderImpl implements ElementHolder {
    private final List<ClipPathElement> clipPathElements;
    private final List<GroupElement> groupElements;
    private final List<PathElement> pathElements;

    public ElementHolderImpl() {
        this.groupElements = new ArrayList();
        this.pathElements = new ArrayList();
        this.clipPathElements = new ArrayList();
    }

    @Override // com.vk.utils.vectordrawable.internal.element.ElementHolder
    public void addClipPath(ClipPathElement clipPathElement) {
        getClipPathElements().add(clipPathElement);
    }

    @Override // com.vk.utils.vectordrawable.internal.element.ElementHolder
    public void addGroup(GroupElement groupElement) {
        getGroupElements().add(groupElement);
    }

    @Override // com.vk.utils.vectordrawable.internal.element.ElementHolder
    public void addPath(PathElement pathElement) {
        getPathElements().add(pathElement);
    }

    @Override // com.vk.utils.vectordrawable.internal.element.ElementHolder
    public void draw(Canvas canvas) {
        Iterator<T> it = getClipPathElements().iterator();
        while (it.hasNext()) {
            canvas.clipPath(((ClipPathElement) it.next()).getPath());
        }
        Iterator<T> it2 = getGroupElements().iterator();
        while (it2.hasNext()) {
            ((GroupElement) it2.next()).draw(canvas);
        }
        Iterator<T> it3 = getPathElements().iterator();
        while (it3.hasNext()) {
            ((PathElement) it3.next()).draw(canvas);
        }
    }

    @Override // com.vk.utils.vectordrawable.internal.element.ElementHolder
    public ClipPathElement findClipPath(String str) {
        Object obj;
        Iterator<T> it = getClipPathElements().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((ClipPathElement) obj).getName(), str)) {
                break;
            }
        }
        ClipPathElement clipPathElement = (ClipPathElement) obj;
        if (clipPathElement != null) {
            return clipPathElement;
        }
        Iterator<T> it2 = getGroupElements().iterator();
        while (it2.hasNext()) {
            ClipPathElement findClipPath = ((GroupElement) it2.next()).findClipPath(str);
            if (findClipPath != null) {
                return findClipPath;
            }
        }
        return null;
    }

    @Override // com.vk.utils.vectordrawable.internal.element.ElementHolder
    public GroupElement findGroup(String str) {
        Object obj;
        Iterator<T> it = getGroupElements().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((GroupElement) obj).getName(), str)) {
                break;
            }
        }
        GroupElement groupElement = (GroupElement) obj;
        if (groupElement != null) {
            return groupElement;
        }
        Iterator<T> it2 = getGroupElements().iterator();
        while (it2.hasNext()) {
            GroupElement findGroup = ((GroupElement) it2.next()).findGroup(str);
            if (findGroup != null) {
                return findGroup;
            }
        }
        return null;
    }

    @Override // com.vk.utils.vectordrawable.internal.element.ElementHolder
    public PathElement findPath(String str) {
        Object obj;
        Iterator<T> it = getPathElements().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((PathElement) obj).getName(), str)) {
                break;
            }
        }
        PathElement pathElement = (PathElement) obj;
        if (pathElement != null) {
            return pathElement;
        }
        Iterator<T> it2 = getGroupElements().iterator();
        while (it2.hasNext()) {
            PathElement findPath = ((GroupElement) it2.next()).findPath(str);
            if (findPath != null) {
                return findPath;
            }
        }
        return null;
    }

    @Override // com.vk.utils.vectordrawable.internal.element.ElementHolder
    public List<ClipPathElement> getClipPathElements() {
        return this.clipPathElements;
    }

    @Override // com.vk.utils.vectordrawable.internal.element.ElementHolder
    public List<GroupElement> getGroupElements() {
        return this.groupElements;
    }

    @Override // com.vk.utils.vectordrawable.internal.element.ElementHolder
    public PathElement getOnlyPath() {
        return (PathElement) j5g.a0(getPathElements());
    }

    @Override // com.vk.utils.vectordrawable.internal.element.ElementHolder
    public List<PathElement> getPathElements() {
        return this.pathElements;
    }

    @Override // com.vk.utils.vectordrawable.internal.element.ElementHolder
    public void scaleAllStrokeWidth(float f) {
        Iterator<T> it = getGroupElements().iterator();
        while (it.hasNext()) {
            ((GroupElement) it.next()).scaleAllStrokeWidth(f);
        }
        Iterator<T> it2 = getPathElements().iterator();
        while (it2.hasNext()) {
            ((PathElement) it2.next()).setStrokeRatio(f);
        }
    }

    public ElementHolderImpl(ElementHolder elementHolder) {
        this();
        Iterator<T> it = elementHolder.getGroupElements().iterator();
        while (it.hasNext()) {
            getGroupElements().add(new GroupElement((GroupElement) it.next()));
        }
        Iterator<T> it2 = elementHolder.getPathElements().iterator();
        while (it2.hasNext()) {
            getPathElements().add(new PathElement((PathElement) it2.next()));
        }
        Iterator<T> it3 = elementHolder.getClipPathElements().iterator();
        while (it3.hasNext()) {
            getClipPathElements().add(new ClipPathElement((ClipPathElement) it3.next()));
        }
    }
}
