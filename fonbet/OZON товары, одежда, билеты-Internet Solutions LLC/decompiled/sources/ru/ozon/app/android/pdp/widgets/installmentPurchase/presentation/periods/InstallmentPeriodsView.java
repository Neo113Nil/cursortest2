package ru.ozon.app.android.pdp.widgets.installmentPurchase.presentation.periods;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.pdp.utils.CornersConfig;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.utils.MarginItemDecoration;
import ru.ozon.app.android.pdp.widgets.installmentPurchase.presentation.InstallmentVO;
import ru.ozon.app.android.pdp.widgets.installmentPurchase.presentation.periods.recycler.InstallmentPeriodsAdapter;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u000eJ\u001c\u0010\u0015\u001a\u00020\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001aR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/periods/InstallmentPeriodsView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "periodsRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "currentBgColor", "", "leftGradient", "Landroid/view/View;", "rightGradient", "installmentPeriodsAdapter", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/periods/recycler/InstallmentPeriodsAdapter;", "setOnClickListener", "", "onClickListener", "Landroid/view/View$OnClickListener;", "setInstallmentPeriodsAdapter", "adapter", "submitList", "list", "", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/InstallmentVO$Periods$PeriodItem;", "backgroundColor", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InstallmentPeriodsView extends FrameLayout {
    private int currentBgColor;
    private InstallmentPeriodsAdapter installmentPeriodsAdapter;

    @NotNull
    private final View leftGradient;

    @NotNull
    private final RecyclerView periodsRecyclerView;

    @NotNull
    private final View rightGradient;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallmentPeriodsView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        final RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.installmentPeriodsRV);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        Dimens dimens = Dimens.INSTANCE;
        marginLayoutParams.bottomMargin = dimens.getDP_12();
        recyclerView.setLayoutParams(marginLayoutParams);
        recyclerView.addItemDecoration(new MarginItemDecoration(dimens.getDP_4(), dimens.getDP_12()));
        recyclerView.addOnItemTouchListener(new RecyclerView.y() { // from class: ru.ozon.app.android.pdp.widgets.installmentPurchase.presentation.periods.InstallmentPeriodsView$periodsRecyclerView$1$2
            @Override // androidx.recyclerview.widget.RecyclerView.s
            public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e11) {
                Intrinsics.checkNotNullParameter(rv, "rv");
                Intrinsics.checkNotNullParameter(e11, "e");
                if (e11.getAction() == 1 && RecyclerView.this.getScrollState() == 0) {
                    return RecyclerView.this.performClick();
                }
                return false;
            }
        });
        this.periodsRecyclerView = recyclerView;
        this.currentBgColor = ContextExtKt.parseColor(context, UniColors.BG_PRIMARY.getToken());
        View view = new View(context);
        view.setLayoutParams(new FrameLayout.LayoutParams(dimens.getDP_12(), dimens.getDP_24(), 8388611));
        GradientDrawable gradientDrawable = new GradientDrawable();
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        gradientDrawable.setOrientation(orientation);
        gradientDrawable.setColors(new int[]{this.currentBgColor, 0});
        view.setBackground(gradientDrawable);
        this.leftGradient = view;
        View view2 = new View(context);
        view2.setLayoutParams(new FrameLayout.LayoutParams(dimens.getDP_12(), dimens.getDP_24(), 8388613));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setOrientation(orientation);
        gradientDrawable2.setColors(new int[]{0, this.currentBgColor});
        view2.setBackground(gradientDrawable2);
        this.rightGradient = view2;
        setId(R$id.installmentPeriodsContainer);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams2.setMargins(dimens.getDP_16(), 0, dimens.getDP_16(), 0);
        setLayoutParams(marginLayoutParams2);
        setBackground(ContextExtKt.createRoundRectShape$default(context, dimens.getDPF_16(), CornersConfig.BOTTOM, 0, this.currentBgColor, null, 20, null));
        addView(recyclerView);
        addView(view);
        addView(view2);
    }

    public final void setInstallmentPeriodsAdapter(@NotNull InstallmentPeriodsAdapter adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.installmentPeriodsAdapter = adapter;
        this.periodsRecyclerView.setAdapter(adapter);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.periodsRecyclerView.setOnClickListener(onClickListener);
        this.leftGradient.setOnClickListener(onClickListener);
        this.rightGradient.setOnClickListener(onClickListener);
    }

    public final void submitList(@NotNull List<InstallmentVO.Periods.PeriodItem> list, @NotNull String backgroundColor) {
        Paint paint;
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = ContextExtKt.parseColor(context, backgroundColor);
        if (parseColor != this.currentBgColor) {
            this.currentBgColor = parseColor;
            Drawable background = getBackground();
            ShapeDrawable shapeDrawable = background instanceof ShapeDrawable ? (ShapeDrawable) background : null;
            if (shapeDrawable != null && (paint = shapeDrawable.getPaint()) != null) {
                paint.setColor(parseColor);
            }
            Drawable background2 = this.leftGradient.getBackground();
            GradientDrawable gradientDrawable = background2 instanceof GradientDrawable ? (GradientDrawable) background2 : null;
            if (gradientDrawable != null) {
                gradientDrawable.setColors(new int[]{parseColor, 0});
            }
            Drawable background3 = this.rightGradient.getBackground();
            GradientDrawable gradientDrawable2 = background3 instanceof GradientDrawable ? (GradientDrawable) background3 : null;
            if (gradientDrawable2 != null) {
                gradientDrawable2.setColors(new int[]{0, parseColor});
            }
        }
        InstallmentPeriodsAdapter installmentPeriodsAdapter = this.installmentPeriodsAdapter;
        if (installmentPeriodsAdapter != null) {
            installmentPeriodsAdapter.submitList(list);
        }
    }
}
