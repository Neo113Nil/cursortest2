package com.vk.core.view.components.avatar.badge;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.avatar.badge.VkAvatarBadge;
import com.vkontakte.android.R;
import xsna.aar0;
import xsna.e3m;
import xsna.hbh0;

/* compiled from: WebOnlineBadge.kt */
/* loaded from: classes17.dex */
public final class e extends d {
    public final Context c;
    public final Paint d;

    public e(Context context, VkAvatarBadge.Alignment alignment, String str) {
        super(alignment, str);
        this.c = context;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        this.d = paint;
    }

    @Override // com.vk.core.view.components.avatar.badge.d
    public final void c(Context context, aar0 aar0Var, Canvas canvas) {
        float a = hbh0.a(this.c, aar0Var.a < 72.0f ? 8.0f : 10.0f);
        int f = e3m.f(R.attr.vk_ui_accent_green, context);
        Paint paint = this.d;
        paint.setColor(f);
        canvas.drawCircle(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, a / 2, paint);
    }

    @Override // com.vk.core.view.components.avatar.badge.d
    public final Path f(Context context, aar0 aar0Var) {
        float a = hbh0.a(context, 4.0f) + hbh0.a(this.c, aar0Var.a < 72.0f ? 8.0f : 10.0f);
        Path path = new Path();
        path.addCircle(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, a / 2, Path.Direction.CW);
        return path;
    }
}
