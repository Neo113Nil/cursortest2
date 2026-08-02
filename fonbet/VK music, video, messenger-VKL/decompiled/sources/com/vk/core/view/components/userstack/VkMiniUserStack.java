package com.vk.core.view.components.userstack;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SizeF;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.R$styleable;
import com.vk.core.view.components.userstack.VkUserStack;
import java.util.List;
import xsna.ayv0;
import xsna.e3m;
import xsna.rl3;
import xsna.weu0;

/* compiled from: VkMiniUserStack.kt */
/* loaded from: classes17.dex */
public final class VkMiniUserStack extends FrameLayout {
    public VkUserStack.Size b;
    public final weu0 c;

    public VkMiniUserStack(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final boolean a() {
        weu0 weu0Var = this.c;
        float avatarSize = weu0Var.getAvatarSize();
        VkUserStack.Size size = this.b;
        getContext();
        boolean z = !(avatarSize == b.b(size));
        VkUserStack.Size size2 = this.b;
        getContext();
        weu0Var.setAvatarSize(b.b(size2));
        VkUserStack.Size size3 = this.b;
        getContext();
        weu0Var.setCutoutDiameter(b.d(size3));
        VkUserStack.Size size4 = this.b;
        getContext();
        weu0Var.setAvatarOffset(new SizeF(-b.a(size4), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        Context context = getContext();
        VkUserStack.Size size5 = this.b;
        getContext();
        weu0Var.setCounterFont(e3m.g(b.c(size5), context));
        return z;
    }

    public final Integer getCounter() {
        return this.c.getCounter();
    }

    public final VkUserStack.Size getSize() {
        return this.b;
    }

    public final void setAvatars(List<? extends ayv0> list) {
        this.c.setAvatars(list);
    }

    public final void setCounter(Integer num) {
        this.c.setCounter(num);
    }

    public final void setSize(VkUserStack.Size size) {
        this.b = size;
        if (a()) {
            this.c.a();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.ViewGroup, com.vk.core.view.components.userstack.VkMiniUserStack] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Enum] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VkMiniUserStack(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        VkUserStack.Size size = VkUserStack.Size.Medium;
        this.b = size;
        weu0 weu0Var = new weu0(context);
        weu0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        this.c = weu0Var;
        addView(weu0Var);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.t);
        ?? r8 = (Enum) rl3.S(obtainStyledAttributes.getInt(1, size.ordinal()), VkUserStack.Size.values());
        setSize(r8 != 0 ? r8 : size);
        setCounter(obtainStyledAttributes.hasValue(0) ? Integer.valueOf(obtainStyledAttributes.getInt(0, 0)) : null);
        obtainStyledAttributes.recycle();
        a();
    }
}
