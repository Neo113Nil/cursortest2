package com.vk.avatarchange;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.vk.avatar.api.VKAvatarView;
import com.vk.avatar.api.border.AvatarBorderType;
import kotlin.LazyThreadSafetyMode;
import xsna.aq5;
import xsna.cn70;
import xsna.cq5;
import xsna.j5g;
import xsna.j9r0;
import xsna.l35;
import xsna.msy;
import xsna.r9r0;
import xsna.ts5;
import xsna.u9r0;
import xsna.wp5;

/* compiled from: CropAvatarView.kt */
/* loaded from: classes15.dex */
public final class CropAvatarView extends VKAvatarView implements ts5 {
    public static final /* synthetic */ int u = 0;
    public final Object s;
    public r9r0 t;

    public CropAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.s = msy.a(LazyThreadSafetyMode.NONE, new l35(9));
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final aq5 getAvatarBorderRepository() {
        return (aq5) this.s.getValue();
    }

    public final void e1(Bitmap bitmap, AvatarBorderType avatarBorderType) {
        cq5.b bVar = cq5.b.a;
        VKAvatarView.c1(this, avatarBorderType, bVar, 4);
        u9r0 config = getConfig();
        if (config != null) {
            j9r0 b = getAvatarBorderRepository().b(getContext(), u9r0.a(config, bVar), new wp5());
            b.getClass();
            r9r0 r9r0Var = (r9r0) j5g.a0(b.d);
            if (r9r0Var != null) {
                this.t = r9r0Var;
            }
        }
        int b2 = cn70.b(4);
        setPadding(b2, b2, b2, b2);
        setPostprocessingEnabled(false);
        setImageBitmap(bitmap);
    }

    @Override // com.vk.avatar.api.VKAvatarView, com.vk.imageloader.view.VKImageView, xsna.zjt, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        Path path;
        canvas.save();
        r9r0 r9r0Var = this.t;
        if (r9r0Var != null && (path = r9r0Var.a) != null) {
            canvas.clipPath(path);
        }
        super.onDraw(canvas);
        canvas.restore();
        r9r0 r9r0Var2 = this.t;
        if (r9r0Var2 != null) {
            r9r0Var2.b(getContext(), canvas);
        }
    }

    public void setMatrix(Matrix matrix) {
        setImageMatrix(matrix);
        invalidate();
    }

    @Override // xsna.ts5
    public View getView() {
        return this;
    }
}
