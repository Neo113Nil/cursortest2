package com.vk.im.reactions.api;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashSet;
import xsna.j5g;

/* compiled from: BigReactionAnimationsView.kt */
/* loaded from: classes2.dex */
public final class BigReactionAnimationsView extends View {
    public final LinkedHashSet<a> b;

    /* compiled from: BigReactionAnimationsView.kt */
    public interface a {
        void a(Canvas canvas);
    }

    public BigReactionAnimationsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new LinkedHashSet<>();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Iterator it = j5g.R0(this.b).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(canvas);
        }
    }
}
