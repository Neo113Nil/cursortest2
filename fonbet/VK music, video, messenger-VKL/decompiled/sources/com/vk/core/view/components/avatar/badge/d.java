package com.vk.core.view.components.avatar.badge;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Size;
import android.util.SizeF;
import com.vk.core.view.components.avatar.badge.VkAvatarBadge;
import kotlin.NoWhenBranchMatchedException;
import xsna.aar0;
import xsna.hbh0;
import xsna.rsr;

/* compiled from: VkAvatarDrawableBadge.kt */
/* loaded from: classes17.dex */
public abstract class d implements VkAvatarBadge {
    public final VkAvatarBadge.Alignment a;
    public final String b;

    /* compiled from: VkAvatarDrawableBadge.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkAvatarBadge.Alignment.values().length];
            try {
                iArr[VkAvatarBadge.Alignment.TopLeft.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkAvatarBadge.Alignment.TopRight.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkAvatarBadge.Alignment.BottomLeft.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VkAvatarBadge.Alignment.BottomRight.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VkAvatarBadge.Alignment.BottomCenter.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public d(VkAvatarBadge.Alignment alignment, String str) {
        this.a = alignment;
        this.b = str;
    }

    public static float d(VkAvatarBadge.Alignment alignment) {
        double d;
        int i = a.$EnumSwitchMapping$0[alignment.ordinal()];
        if (i == 1) {
            d = 135.0d;
        } else if (i == 2) {
            d = 45.0d;
        } else if (i == 3) {
            d = -135.0d;
        } else if (i == 4) {
            d = -45.0d;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            d = -90.0d;
        }
        return (float) Math.toRadians(d);
    }

    @Override // com.vk.core.view.components.avatar.badge.VkAvatarBadge
    public final void a(Context context, aar0 aar0Var, Canvas canvas) {
        PointF e = e(context, aar0Var);
        int save = canvas.save();
        try {
            canvas.translate(e.x, e.y);
            c(context, aar0Var, canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // com.vk.core.view.components.avatar.badge.VkAvatarBadge
    public final Path b(Context context, aar0 aar0Var) {
        Path f = f(context, aar0Var);
        if (f == null) {
            return null;
        }
        PointF e = e(context, aar0Var);
        f.offset(e.x, e.y);
        return f;
    }

    public abstract void c(Context context, aar0 aar0Var, Canvas canvas);

    public final PointF e(Context context, aar0 aar0Var) {
        float d = d(VkAvatarBadge.Alignment.BottomRight);
        float d2 = d(this.a);
        double d3 = d;
        float sin = (float) Math.sin(d3);
        float cos = (float) Math.cos(d3);
        double d4 = d2;
        float sin2 = (float) Math.sin(d4);
        float cos2 = (float) Math.cos(d4);
        float f = aar0Var.a;
        float f2 = aar0Var.a;
        int i = f < 36.0f ? 1 : f < 80.0f ? 2 : 3;
        Size g = rsr.g(aar0Var);
        float f3 = i * 2;
        SizeF sizeF = new SizeF((f2 * 0.7f) + g.getWidth() + f3, (f2 * 0.7f) + g.getHeight() + f3);
        Size g2 = rsr.g(aar0Var);
        PointF pointF = new PointF((sizeF.getWidth() - g2.getWidth()) / 2.0f, (sizeF.getHeight() - g2.getHeight()) / 2.0f);
        pointF.x = hbh0.a(context, pointF.x);
        float a2 = hbh0.a(context, pointF.y);
        float f4 = (cos2 / cos) * pointF.x;
        float f5 = (sin2 / sin) * a2;
        float f6 = aar0Var.b / 2;
        pointF.x = f4 + f6;
        pointF.y = f5 + f6;
        return pointF;
    }

    public abstract Path f(Context context, aar0 aar0Var);

    @Override // com.vk.core.view.components.avatar.badge.VkAvatarBadge
    public final String getTag() {
        return this.b;
    }
}
