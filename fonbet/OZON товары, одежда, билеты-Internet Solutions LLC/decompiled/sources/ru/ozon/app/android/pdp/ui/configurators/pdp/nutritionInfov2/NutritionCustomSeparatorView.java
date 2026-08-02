package ru.ozon.app.android.pdp.ui.configurators.pdp.nutritionInfov2;

import B3.D;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import gk0.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J*\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/nutritionInfov2/NutritionCustomSeparatorView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "setNutrients", "", "nutrients", "", "Lru/ozon/app/android/pdp/ui/configurators/pdp/nutritionInfov2/NutritionItem;", "parentBackground", "", "shapeDrawable", "color", "view", "Landroid/view/View;", "isLeftCornerRadius", "", "isRightCornerRadius", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NutritionCustomSeparatorView extends LinearLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NutritionCustomSeparatorView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void shapeDrawable(String color, View view, boolean isLeftCornerRadius, boolean isRightCornerRadius) {
        GradientDrawable b11 = D.b(0);
        float dpf_12 = isLeftCornerRadius ? Dimens.INSTANCE.getDPF_12() : 0.0f;
        float dpf_122 = isRightCornerRadius ? Dimens.INSTANCE.getDPF_12() : 0.0f;
        float dpf_123 = isRightCornerRadius ? Dimens.INSTANCE.getDPF_12() : 0.0f;
        float dpf_124 = isLeftCornerRadius ? Dimens.INSTANCE.getDPF_12() : 0.0f;
        b11.setCornerRadii(new float[]{dpf_12, dpf_12, dpf_122, dpf_122, dpf_123, dpf_123, dpf_124, dpf_124});
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        b11.setColor(styleParser.parseColor(context, color, UniColors.LAYER_FLOOR_1.getResId()));
        view.setBackground(b11);
    }

    public final void setNutrients(@NotNull List<NutritionItem> nutrients, String parentBackground) {
        int i11;
        Intrinsics.checkNotNullParameter(nutrients, "nutrients");
        shapeDrawable(parentBackground, this, true, true);
        removeAllViews();
        int i12 = 0;
        int i13 = 0;
        for (NutritionItem nutritionItem : nutrients) {
            int i14 = i13 + 1;
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(i12, -1, 1.0f));
            Dimens dimens = Dimens.INSTANCE;
            linearLayout.setPadding(dimens.getDP_4(), dimens.getDP_10(), dimens.getDP_4(), dimens.getDP_10());
            q qVar = q.f64554a;
            TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.i(N.b(TextAtomV2View.class), getContext());
            if (textAtomV2View == null) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
            }
            TextHolderKt.bind$default(textAtomV2View, nutritionItem.getTitle(), null, 2, null);
            TextAtomV2View textAtomV2View2 = (TextAtomV2View) qVar.i(N.b(TextAtomV2View.class), getContext());
            if (textAtomV2View2 == null) {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                textAtomV2View2 = new TextAtomV2View(context2, null, 0, 6, null);
            }
            TextHolderKt.bindOrGone$default(textAtomV2View2, nutritionItem.getSubtitle(), null, 2, null);
            shapeDrawable(nutritionItem.getBackgroundColor(), linearLayout, i13 == 0, i13 == nutrients.size() - 1 || nutrients.size() == 1);
            linearLayout.addView(textAtomV2View);
            linearLayout.addView(textAtomV2View2);
            addView(linearLayout);
            if (nutritionItem.equals(C7714v.X(nutrients))) {
                i11 = 0;
            } else {
                View view = new View(getContext());
                view.setLayoutParams(new LinearLayout.LayoutParams(dimens.getDP_4(), -1));
                i11 = 0;
                view.setBackgroundColor(0);
                addView(view);
            }
            i12 = i11;
            i13 = i14;
        }
    }

    public /* synthetic */ NutritionCustomSeparatorView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NutritionCustomSeparatorView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(0);
    }
}
