package ru.ozon.app.android.common.filterWidgets.filters.presentation.colorfilter.colors;

import CG.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.filterWidgets.filters.data.FiltersDTO;
import ru.ozon.app.android.storefront.filterWidgets.databinding.WidgetFiltersAspectsColorFilterItemColorBinding;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/colorfilter/colors/AspectsColorViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/storefront/filterWidgets/databinding/WidgetFiltersAspectsColorFilterItemColorBinding;", "binding", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "<init>", "(Lru/ozon/app/android/storefront/filterWidgets/databinding/WidgetFiltersAspectsColorFilterItemColorBinding;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$ColorAspect;", "item", "bind", "(Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$ColorAspect;)V", "Lru/ozon/app/android/storefront/filterWidgets/databinding/WidgetFiltersAspectsColorFilterItemColorBinding;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$ColorAspect;", "", "dp4", "I", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AspectsColorViewHolder extends RecyclerView.C {

    @NotNull
    private final WidgetFiltersAspectsColorFilterItemColorBinding binding;
    private final int dp4;
    private FiltersDTO.ColorAspect item;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AspectsColorViewHolder(@NotNull WidgetFiltersAspectsColorFilterItemColorBinding binding, @NotNull Function1<? super AtomAction, Unit> onAction) {
        super(binding.getConstraintLayout());
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.binding = binding;
        this.onAction = onAction;
        int px = UiExtKt.toPx(4);
        this.dp4 = px;
        binding.colorView.setOnClickListener(new a(this, 4));
        RoundedBorderSelectableLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = px;
        marginLayoutParams.topMargin = px;
        constraintLayout.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$3$lambda$1(AspectsColorViewHolder aspectsColorViewHolder, View view) {
        FiltersDTO.ColorAspect colorAspect = aspectsColorViewHolder.item;
        if (colorAspect != null) {
            aspectsColorViewHolder.onAction.invoke(AtomActionMapperKt.toAtomAction(colorAspect.getAction(), colorAspect.getTrackingInfo()));
        }
    }

    public final void bind(@NotNull FiltersDTO.ColorAspect item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        List<String> colors = item.getColors();
        ArrayList arrayList = new ArrayList();
        for (String str : colors) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = this.binding.getConstraintLayout().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer parseColor = styleParser.parseColor(context, str);
            if (parseColor != null) {
                arrayList.add(parseColor);
            }
        }
        WidgetFiltersAspectsColorFilterItemColorBinding widgetFiltersAspectsColorFilterItemColorBinding = this.binding;
        AspectColorFilterView aspectColorFilterView = widgetFiltersAspectsColorFilterItemColorBinding.colorView;
        aspectColorFilterView.setColors(arrayList);
        aspectColorFilterView.setAlpha(1.0f);
        TestInfo testInfo = item.getTestInfo();
        aspectColorFilterView.setContentDescription(testInfo != null ? testInfo.getAutomatizationId() : null);
        RoundedBorderSelectableLayout roundedBorderSelectableLayout = widgetFiltersAspectsColorFilterItemColorBinding.colorFilterRoot;
        Boolean isSelected = item.isSelected();
        roundedBorderSelectableLayout.setChecked(isSelected != null ? isSelected.booleanValue() : false);
        RoundedBorderSelectableLayout roundedBorderSelectableLayout2 = widgetFiltersAspectsColorFilterItemColorBinding.colorFilterRoot;
        TestInfo testInfo2 = item.getTestInfo();
        roundedBorderSelectableLayout2.setContentDescription(testInfo2 != null ? testInfo2.getAutomatizationId() : null);
    }
}
