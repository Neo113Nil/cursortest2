package ru.ozon.app.android.abtool.presentation.abvariants.recycler;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.presentation.abvariants.recycler.VariantsAdapter;
import ru.ozon.app.android.abtool.utils.IntExtKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/abtool/presentation/abvariants/recycler/RoundedCornersItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "radius", "", "top", "bottom", "Landroid/graphics/drawable/GradientDrawable;", "createRoundedDrawable", "(FZZ)Landroid/graphics/drawable/GradientDrawable;", "Landroid/graphics/Canvas;", "canvas", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Landroid/content/Context;", "", "bgColor$delegate", "LSc/j;", "getBgColor", "()I", "bgColor", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RoundedCornersItemDecoration extends RecyclerView.n {

    /* renamed from: bgColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j bgColor;

    @NotNull
    private final Context context;

    public RoundedCornersItemDecoration(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.bgColor = k.b(new RoundedCornersItemDecoration$bgColor$2(this));
    }

    private final GradientDrawable createRoundedDrawable(float radius, boolean top, boolean bottom) {
        float[] fArr = new float[8];
        if (top) {
            fArr[0] = radius;
            fArr[1] = radius;
            fArr[2] = radius;
            fArr[3] = radius;
        }
        if (bottom) {
            fArr[4] = radius;
            fArr[5] = radius;
            fArr[6] = radius;
            fArr[7] = radius;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadii(fArr);
        gradientDrawable.setColor(getBgColor());
        return gradientDrawable;
    }

    private final int getBgColor() {
        return ((Number) this.bgColor.getValue()).intValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDrawOver(canvas, parent, state);
        int childCount = parent.getChildCount();
        int childCount2 = parent.getChildCount();
        int i11 = 0;
        while (i11 < childCount2) {
            View childAt = parent.getChildAt(i11);
            if (parent.getChildViewHolder(childAt) instanceof VariantsAdapter.VariantViewHolder) {
                childAt.setBackground(createRoundedDrawable(IntExtKt.getDp(16), i11 == 1, i11 == childCount + (-2)));
            }
            i11++;
        }
    }
}
