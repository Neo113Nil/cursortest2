package com.zoho.livechat.android.ui.customviews;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.shape.n;
import ia.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import od.AbstractC5886l;
import og.AbstractC5892d;
import og.k;
import og.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/zoho/livechat/android/ui/customviews/SalesIQFloatingActionButton;", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "cornerSizeInDp", "", "setCustomCornerRadius", "(F)V", "s", "F", "getCornerSizeInDp", "()F", "setCornerSizeInDp", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SalesIQFloatingActionButton extends FloatingActionButton {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public float cornerSizeInDp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SalesIQFloatingActionButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.cornerSizeInDp = 16.0f;
        setImageTintList(ColorStateList.valueOf(AbstractC5892d.h(context, Integer.valueOf(AbstractC5886l.f59909y2), 0.0f, 2, null)));
        setShapeAppearanceModel(new n().w().q(0, k.c(this.cornerSizeInDp)).m());
        setBackgroundTintList(ColorStateList.valueOf(AbstractC5892d.h(context, Integer.valueOf(AbstractC5886l.f59889t2), 0.0f, 2, null)));
        p.d(this, (int) (this.cornerSizeInDp / 2), null, 0, null, false, 30, null);
    }

    public final float getCornerSizeInDp() {
        return this.cornerSizeInDp;
    }

    public final void setCornerSizeInDp(float f10) {
        this.cornerSizeInDp = f10;
    }

    public final void setCustomCornerRadius(float cornerSizeInDp) {
        this.cornerSizeInDp = cornerSizeInDp;
        setShapeAppearanceModel(getShapeAppearanceModel().x(k.c(cornerSizeInDp)));
        p.d(this, (int) (cornerSizeInDp / 2), null, 0, null, false, 30, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SalesIQFloatingActionButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, c.f48196A);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
