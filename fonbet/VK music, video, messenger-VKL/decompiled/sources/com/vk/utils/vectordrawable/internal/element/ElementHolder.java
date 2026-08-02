package com.vk.utils.vectordrawable.internal.element;

import android.graphics.Canvas;
import androidx.annotation.Keep;
import java.util.List;

/* compiled from: ElementHolder.kt */
@Keep
/* loaded from: classes6.dex */
public interface ElementHolder {
    void addClipPath(ClipPathElement clipPathElement);

    void addGroup(GroupElement groupElement);

    void addPath(PathElement pathElement);

    void draw(Canvas canvas);

    ClipPathElement findClipPath(String str);

    GroupElement findGroup(String str);

    PathElement findPath(String str);

    List<ClipPathElement> getClipPathElements();

    List<GroupElement> getGroupElements();

    PathElement getOnlyPath();

    List<PathElement> getPathElements();

    void scaleAllStrokeWidth(float f);
}
