package ru.ozon.app.android.returns.list.presentation.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.molecules.DisclaimerContainer;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/returns/list/presentation/views/ReturnTotalView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "dp4", "dp16", "photosRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getPhotosRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "totalTableRecyclerView", "getTotalTableRecyclerView", "disclaimerContainer", "Lru/ozon/app/android/atoms/v3/molecules/DisclaimerContainer;", "getDisclaimerContainer", "()Lru/ozon/app/android/atoms/v3/molecules/DisclaimerContainer;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnTotalView extends LinearLayout {

    @NotNull
    private final DisclaimerContainer disclaimerContainer;
    private final int dp16;
    private final int dp4;

    @NotNull
    private final RecyclerView photosRecyclerView;

    @NotNull
    private final RecyclerView totalTableRecyclerView;

    public /* synthetic */ ReturnTotalView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    @NotNull
    public final DisclaimerContainer getDisclaimerContainer() {
        return this.disclaimerContainer;
    }

    @NotNull
    public final RecyclerView getPhotosRecyclerView() {
        return this.photosRecyclerView;
    }

    @NotNull
    public final RecyclerView getTotalTableRecyclerView() {
        return this.totalTableRecyclerView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnTotalView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(4, context);
        this.dp4 = px;
        int px2 = ResourceExtKt.toPx(16, context);
        this.dp16 = px2;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(View.generateViewId());
        setOrientation(0);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.setNestedScrollingEnabled(false);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMargins(px2, 0, px2, 0);
        recyclerView.setLayoutParams(marginLayoutParams);
        this.photosRecyclerView = recyclerView;
        RecyclerView recyclerView2 = new RecyclerView(context);
        recyclerView2.setId(View.generateViewId());
        setOrientation(1);
        recyclerView2.setLayoutManager(new LinearLayoutManager(context, 1, false));
        recyclerView2.setNestedScrollingEnabled(false);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams2.setMargins(0, px2, 0, 0);
        recyclerView2.setLayoutParams(marginLayoutParams2);
        this.totalTableRecyclerView = recyclerView2;
        DisclaimerContainer disclaimerContainer = new DisclaimerContainer(context, null, 0, 6, null);
        disclaimerContainer.setId(View.generateViewId());
        ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams3.setMargins(px2, px, px2, 0);
        disclaimerContainer.setLayoutParams(marginLayoutParams3);
        this.disclaimerContainer = disclaimerContainer;
        setOrientation(1);
        addView(recyclerView);
        addView(recyclerView2);
        addView(disclaimerContainer);
    }
}
