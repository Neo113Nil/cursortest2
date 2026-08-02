package ru.ozon.app.android.travel.molecules.view.stepListWithScaleMolecule;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.stepListWithScaleMolecule.adapter.StepListWithScaleMoleculeAdapter;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/stepListWithScaleMolecule/StepListWithScaleMoleculeView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "stepsAdapter", "Lru/ozon/app/android/travel/molecules/view/stepListWithScaleMolecule/adapter/StepListWithScaleMoleculeAdapter;", "bind", "", "item", "Lru/ozon/app/android/travel/molecules/view/stepListWithScaleMolecule/StepListWithScaleMoleculeVO;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StepListWithScaleMoleculeView extends RecyclerView {

    @NotNull
    private final StepListWithScaleMoleculeAdapter stepsAdapter;

    public /* synthetic */ StepListWithScaleMoleculeView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void bind(@NotNull StepListWithScaleMoleculeVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.stepsAdapter.submitList(item.getSteps());
        int paddingLeft = item.getPaddingLeft();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px = ResourceExtKt.toPx(paddingLeft, context);
        int paddingRight = item.getPaddingRight();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ViewExtKt.updatePadding$default(this, px, 0, ResourceExtKt.toPx(paddingRight, context2), 0, 10, null);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context3, item.getBackgroundColor());
        if (parseColor == null) {
            setBackground(null);
        } else {
            setBackgroundColor(parseColor.intValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepListWithScaleMoleculeView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        StepListWithScaleMoleculeAdapter stepListWithScaleMoleculeAdapter = new StepListWithScaleMoleculeAdapter();
        this.stepsAdapter = stepListWithScaleMoleculeAdapter;
        setAdapter(stepListWithScaleMoleculeAdapter);
        setLayoutManager(new LinearLayoutManager(context));
        setItemAnimator(null);
    }
}
