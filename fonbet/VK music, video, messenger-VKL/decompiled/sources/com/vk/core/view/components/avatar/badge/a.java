package com.vk.core.view.components.avatar.badge;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.util.SizeF;
import com.vk.core.view.components.avatar.badge.VkAvatarBadge;
import xsna.aar0;
import xsna.hbh0;

/* compiled from: IconBadge.kt */
/* loaded from: classes17.dex */
public final class a extends d {
    public final Drawable c;
    public final boolean d;
    public final SizeF e;

    public /* synthetic */ a(Drawable drawable, boolean z, VkAvatarBadge.Alignment alignment, String str, int i) {
        this(drawable, z, alignment, (SizeF) null, (i & 16) != 0 ? null : str);
    }

    public static SizeF g(Context context, float f) {
        return f < 40.0f ? h(12, 12, context) : f < 56.0f ? h(16, 16, context) : f < 72.0f ? h(20, 20, context) : h(24, 24, context);
    }

    public static final SizeF h(int i, int i2, Context context) {
        return new SizeF(hbh0.a(context, i), hbh0.a(context, i2));
    }

    @Override // com.vk.core.view.components.avatar.badge.d
    public final void c(Context context, aar0 aar0Var, Canvas canvas) {
        Drawable drawable = this.c;
        if (drawable != null) {
            SizeF sizeF = this.e;
            if (sizeF == null) {
                sizeF = g(context, aar0Var.a);
            }
            float f = 2;
            drawable.setBounds((int) ((-sizeF.getWidth()) / f), (int) ((-sizeF.getHeight()) / f), (int) (sizeF.getWidth() / f), (int) (sizeF.getHeight() / f));
            drawable.draw(canvas);
        }
    }

    @Override // com.vk.core.view.components.avatar.badge.d
    public final Path f(Context context, aar0 aar0Var) {
        if (!this.d) {
            return null;
        }
        SizeF sizeF = this.e;
        if (sizeF == null) {
            sizeF = g(context, aar0Var.a);
        }
        Path path = new Path();
        float a = hbh0.a(context, 4.0f);
        SizeF sizeF2 = new SizeF(sizeF.getWidth() + a, sizeF.getHeight() + a);
        float f = 2;
        path.addOval((-sizeF2.getWidth()) / f, (-sizeF2.getHeight()) / f, sizeF2.getWidth() / f, sizeF2.getHeight() / f, Path.Direction.CW);
        return path;
    }

    public a(Drawable drawable, boolean z, VkAvatarBadge.Alignment alignment, SizeF sizeF, String str) {
        super(alignment, str);
        this.c = drawable;
        this.d = z;
        this.e = sizeF;
    }
}
