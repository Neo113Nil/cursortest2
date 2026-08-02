package ru.ozon.uni.android.component.sheet;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$id;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/uni/android/component/sheet/SheetTongueView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "bgColor", "Lru/ozon/uni/android/uikitsdk/Color$Solid;", "bgDrawable", "Landroid/graphics/drawable/GradientDrawable;", "onMeasure", "", "widthMeasureSpec", "", "heightMeasureSpec", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SheetTongueView extends View {

    @NotNull
    private final Color.Solid bgColor;

    @NotNull
    private final GradientDrawable bgDrawable;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SheetTongueView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Color.Solid solid = new Color.Solid(a.getColor(context, R$color.graphic_neutral));
        this.bgColor = solid;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(UiExtKt.toPxF(4));
        solid.applyTo(gradientDrawable);
        this.bgDrawable = gradientDrawable;
        setId(R$id.sheetDialogTongue);
        setBackground(gradientDrawable);
        setContentDescription("HandlerView");
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(UiExtKt.toPx(32), UiExtKt.toPx(4));
    }
}
