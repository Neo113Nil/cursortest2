package ru.ozon.fintech.features.pinpad.presentation.pinpad.pinbutton;

import G80.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/fintech/features/pinpad/presentation/pinpad/pinbutton/PinButtonView;", "Landroid/widget/FrameLayout;", "pinpad_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PinButtonView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final int f96130a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinButtonView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f96130a = getResources().getDimensionPixelSize(R.dimen.pin_button_size);
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        addView(imageView);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f9765c);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        Integer valueOf = resourceId == 0 ? null : Integer.valueOf(resourceId);
        if (valueOf != null) {
            imageView.setImageResource(valueOf.intValue());
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ThemeExtKt.tint(imageView, Integer.valueOf(obtainStyledAttributes.getColor(1, 0)));
        }
        obtainStyledAttributes.recycle();
        setClickable(true);
        setFocusable(true);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i11, int i12) {
        int i13 = this.f96130a;
        int resolveSize = View.resolveSize(i13, i11);
        int resolveSize2 = View.resolveSize(i13, i12);
        setMeasuredDimension(resolveSize, resolveSize2);
        measureChildren(View.MeasureSpec.makeMeasureSpec(resolveSize, LinearLayoutManager.INVALID_OFFSET), View.MeasureSpec.makeMeasureSpec(resolveSize2, LinearLayoutManager.INVALID_OFFSET));
    }
}
