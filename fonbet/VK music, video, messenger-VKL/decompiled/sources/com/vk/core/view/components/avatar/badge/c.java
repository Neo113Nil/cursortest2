package com.vk.core.view.components.avatar.badge;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.util.SizeF;
import com.vk.core.view.components.avatar.badge.VkAvatarBadge;
import com.vkontakte.android.R;
import xsna.aar0;
import xsna.e3m;
import xsna.hbh0;

/* compiled from: MobileOnlineBadge.kt */
/* loaded from: classes17.dex */
public final class c extends d {
    public final Drawable c;

    public c(Context context, VkAvatarBadge.Alignment alignment) {
        super(alignment, null);
        Drawable drawable = context.getDrawable(R.drawable.vk_icon_online_mobile_12);
        this.c = drawable != null ? drawable.mutate() : null;
    }

    @Override // com.vk.core.view.components.avatar.badge.d
    public final void c(Context context, aar0 aar0Var, Canvas canvas) {
        Drawable drawable = this.c;
        if (drawable != null) {
            SizeF sizeF = aar0Var.a < 72.0f ? new SizeF(8.0f, 12.0f) : new SizeF(9.0f, 14.0f);
            int a = (int) hbh0.a(context, sizeF.getWidth());
            int a2 = (int) hbh0.a(context, sizeF.getHeight());
            drawable.setTint(e3m.f(R.attr.vk_ui_accent_green, context));
            drawable.setBounds((-a) / 2, (-a2) / 2, a / 2, a2 / 2);
            drawable.draw(canvas);
        }
    }

    @Override // com.vk.core.view.components.avatar.badge.d
    public final Path f(Context context, aar0 aar0Var) {
        SizeF sizeF = aar0Var.a < 72.0f ? new SizeF(8.0f, 12.0f) : new SizeF(9.0f, 14.0f);
        float f = 4;
        float a = hbh0.a(context, sizeF.getWidth() + f);
        float a2 = hbh0.a(context, sizeF.getHeight() + f);
        float a3 = sizeF.getWidth() > 8.0f ? hbh0.a(context, 4.5f) : hbh0.a(context, 6.0f);
        Path path = new Path();
        float f2 = 2;
        path.addRoundRect((-a) / f2, (-a2) / f2, a / f2, a2 / f2, a3, a3, Path.Direction.CW);
        return path;
    }
}
