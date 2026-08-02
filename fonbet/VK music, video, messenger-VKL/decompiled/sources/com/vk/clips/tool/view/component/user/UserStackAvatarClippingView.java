package com.vk.clips.tool.view.component.user;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import xsna.iah0;

/* compiled from: UserStackAvatarClippingView.kt */
/* loaded from: classes17.dex */
public final class UserStackAvatarClippingView extends FrameLayout {
    public Path b;

    public UserStackAvatarClippingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Path path = this.b;
        if (path == null) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        canvas.clipOutPath(path);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    public final Path getClippingOutPath() {
        return this.b;
    }

    public final void setClippingOutPath(Path path) {
        this.b = path;
        invalidate();
    }

    public UserStackAvatarClippingView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        Path path = new Path();
        path.addCircle(iah0.b(2.0f), iah0.b(18.0f), iah0.b(11.5f), Path.Direction.CW);
        setClippingOutPath(path);
    }
}
