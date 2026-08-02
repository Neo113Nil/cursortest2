package com.sofascore.common.mvvm;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import com.ironsource.U3;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ao2;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001R*\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/sofascore/common/mvvm/UnderlinedToolbar;", "Landroidx/appcompat/widget/Toolbar;", "", U3.i.X, "V", "Z", "isUnderlined", "()Z", "setUnderlined", "(Z)V", "common_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UnderlinedToolbar extends Toolbar {
    public final Paint U;

    /* renamed from: V, reason: from kotlin metadata */
    public boolean isUnderlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnderlinedToolbar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        this.U = new Paint(1);
        setWillNotDraw(false);
        this.l = R.style.SpecificAndroidHeaderTitle;
        AppCompatTextView appCompatTextView = this.b;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(context, R.style.SpecificAndroidHeaderTitle);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        if (this.isUnderlined) {
            Context context = getContext();
            context.getClass();
            int s = ao2.s(1, context);
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.U;
            paint.setStyle(style);
            paint.setColor(getContext().getColor(R.color.k_40));
            paint.setStrokeWidth(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getHeight() - s, getWidth(), getHeight(), paint);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final void setUnderlined(boolean z) {
        this.isUnderlined = z;
        invalidate();
    }
}
