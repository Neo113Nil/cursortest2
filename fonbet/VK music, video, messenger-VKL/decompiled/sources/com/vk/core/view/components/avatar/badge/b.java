package com.vk.core.view.components.avatar.badge;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.util.SizeF;
import com.vk.core.view.components.avatar.badge.VkAvatarBadge;
import kotlin.LazyThreadSafetyMode;
import xsna.aar0;
import xsna.an10;
import xsna.hbh0;
import xsna.izs;
import xsna.msy;

/* compiled from: LiveBadge.kt */
/* loaded from: classes17.dex */
public final class b extends d {
    public static final Object h = msy.a(LazyThreadSafetyMode.NONE, new com.vk.movika.sdk.base.model.props.c(19));
    public final boolean c;
    public final izs<aar0, Float> d;
    public final izs<aar0, Float> e;
    public C0801b f;
    public Drawable g;

    /* compiled from: LiveBadge.kt */
    public static final class a {
        public static final SizeF a(int i, int i2) {
            Object obj = b.h;
            return new SizeF(i, i2);
        }
    }

    /* compiled from: LiveBadge.kt */
    /* renamed from: com.vk.core.view.components.avatar.badge.b$b, reason: collision with other inner class name */
    public static final class C0801b {
        public final int a;
        public final int b;
        public final float c;
        public final SizeF d;

        public C0801b(int i, int i2, float f, SizeF sizeF) {
            this.a = i;
            this.b = i2;
            this.c = f;
            this.d = sizeF;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return C0801b.class.equals(obj != null ? obj.getClass() : null) && this.a == ((C0801b) obj).a;
        }

        public final int hashCode() {
            return this.a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(VkAvatarBadge.Alignment alignment, boolean z, izs izsVar, izs izsVar2, int i) {
        super(alignment, null);
        alignment = (i & 1) != 0 ? VkAvatarBadge.Alignment.BottomCenter : alignment;
        izsVar = (i & 8) != 0 ? null : izsVar;
        izsVar2 = (i & 16) != 0 ? null : izsVar2;
        this.c = z;
        this.d = izsVar;
        this.e = izsVar2;
    }

    @Override // com.vk.core.view.components.avatar.badge.d
    public final void c(Context context, aar0 aar0Var, Canvas canvas) {
        C0801b c0801b;
        g(context, aar0Var);
        Drawable drawable = this.g;
        if (drawable == null || (c0801b = this.f) == null) {
            return;
        }
        SizeF sizeF = c0801b.d;
        float a2 = hbh0.a(context, sizeF.getWidth());
        float a3 = hbh0.a(context, sizeF.getHeight());
        izs<aar0, Float> izsVar = this.d;
        float floatValue = izsVar != null ? izsVar.invoke(aar0Var).floatValue() : aar0Var.b / 6.0f;
        drawable.setBounds(an10.b((-a2) / 2.0f), an10.b(((-a3) / 2.0f) - floatValue), an10.b(a2 / 2.0f), an10.b((a3 / 2.0f) - floatValue));
        drawable.draw(canvas);
    }

    @Override // com.vk.core.view.components.avatar.badge.d
    public final Path f(Context context, aar0 aar0Var) {
        if (!this.c) {
            return null;
        }
        g(context, aar0Var);
        C0801b c0801b = this.f;
        if (c0801b == null) {
            return null;
        }
        SizeF sizeF = c0801b.d;
        izs<aar0, Float> izsVar = this.d;
        float floatValue = izsVar != null ? izsVar.invoke(aar0Var).floatValue() : aar0Var.b / 6.0f;
        izs<aar0, Float> izsVar2 = this.e;
        float floatValue2 = izsVar2 != null ? izsVar2.invoke(aar0Var).floatValue() : hbh0.a(context, 2.0f);
        float a2 = hbh0.a(context, c0801b.c);
        float a3 = hbh0.a(context, sizeF.getWidth());
        float a4 = hbh0.a(context, sizeF.getHeight());
        Path path = new Path();
        float f = floatValue2 * 2.0f;
        SizeF sizeF2 = new SizeF(a3 + f, a4 + f);
        path.addRoundRect((-sizeF2.getWidth()) / 2.0f, ((-sizeF2.getHeight()) / 2.0f) - floatValue, sizeF2.getWidth() / 2.0f, (sizeF2.getHeight() / 2.0f) - floatValue, a2, a2, Path.Direction.CW);
        return path;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void g(Context context, aar0 aar0Var) {
        C0801b c0801b;
        float floor = (float) Math.floor(aar0Var.a);
        C0801b[] c0801bArr = (C0801b[]) h.getValue();
        int length = c0801bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                c0801b = c0801bArr[length];
                if (c0801b.a <= floor) {
                    break;
                } else if (i < 0) {
                    break;
                } else {
                    length = i;
                }
            }
            if (c0801b == null && !c0801b.equals(this.f)) {
                this.f = c0801b;
                this.g = context.getDrawable(c0801b.b);
            }
            return;
        }
        c0801b = null;
        if (c0801b == null) {
            return;
        }
        this.f = c0801b;
        this.g = context.getDrawable(c0801b.b);
    }
}
