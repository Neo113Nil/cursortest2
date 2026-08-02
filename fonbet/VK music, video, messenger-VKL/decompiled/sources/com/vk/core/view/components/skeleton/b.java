package com.vk.core.view.components.skeleton;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.skeleton.a;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VkShimmerArea.kt */
/* loaded from: classes17.dex */
public final class b {
    public static final void a(View view, a aVar, com.vk.core.view.shimmer.b bVar, Rect rect, int[] iArr) {
        rect.setEmpty();
        if (aVar instanceof a.c) {
            bVar.setBounds(0, 0, view.getWidth(), view.getHeight());
            return;
        }
        if (aVar instanceof a.C0863a) {
            ViewGroup viewGroup = ((a.C0863a) aVar).a;
            viewGroup.offsetRectIntoDescendantCoords(view, rect);
            bVar.setBounds(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
        } else {
            if (!(aVar instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            Rect rect2 = ((a.b) aVar).a;
            view.getLocationOnScreen(iArr);
            rect.offset(rect2.left - iArr[0], rect2.top - iArr[1]);
            bVar.setBounds(rect2);
        }
    }
}
