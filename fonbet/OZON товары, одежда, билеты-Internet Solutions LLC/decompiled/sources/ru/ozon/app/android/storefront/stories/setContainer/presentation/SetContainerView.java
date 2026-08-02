package ru.ozon.app.android.storefront.stories.setContainer.presentation;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u001a\u001a\u00020\fH\u0002J\b\u0010\u001b\u001a\u00020\u0010H\u0002J\b\u0010\u001c\u001a\u00020\u0010H\u0002R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/storefront/stories/setContainer/presentation/SetContainerView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", SelectionItemFormDTO.TITLE_FIELD_NAME, "Landroidx/appcompat/widget/AppCompatTextView;", "getTitle", "()Landroidx/appcompat/widget/AppCompatTextView;", "selector", "Landroidx/recyclerview/widget/RecyclerView;", "getSelector", "()Landroidx/recyclerview/widget/RecyclerView;", "sets", "getSets", "dp8", "dp12", "dp16", "dp32", "dp160", "createTitle", "createSelector", "createSets", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SetContainerView extends LinearLayout {
    private final int dp12;
    private final int dp16;
    private final int dp160;
    private final int dp32;
    private final int dp8;

    @NotNull
    private final RecyclerView selector;

    @NotNull
    private final RecyclerView sets;

    @NotNull
    private final AppCompatTextView title;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SetContainerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final RecyclerView createSelector() {
        RecyclerView recyclerView = new RecyclerView(getContext());
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, this.dp32));
        recyclerView.setClipToPadding(false);
        int i11 = this.dp12;
        ViewExtKt.updatePadding$default(recyclerView, i11, 0, i11, 0, 10, null);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        addView(recyclerView);
        return recyclerView;
    }

    private final RecyclerView createSets() {
        RecyclerView recyclerView = new RecyclerView(getContext());
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, this.dp160));
        recyclerView.setClipToPadding(false);
        int i11 = this.dp12;
        int i12 = this.dp16;
        ViewExtKt.updatePadding(recyclerView, i11, i12, i11, i12);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        addView(recyclerView);
        return recyclerView;
    }

    private final AppCompatTextView createTitle() {
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i11 = this.dp16;
        layoutParams.setMargins(i11, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, i11, this.dp8);
        appCompatTextView.setLayoutParams(layoutParams);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setTextAppearance(appCompatTextView.getContext(), R$style.TextStyle_Head_M);
        Context context = appCompatTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        appCompatTextView.setTextColor(ThemeExtKt.themeColor(context, R$attr.textPrimary));
        ViewExtKt.gone(appCompatTextView);
        addView(appCompatTextView);
        return appCompatTextView;
    }

    @NotNull
    public final RecyclerView getSelector() {
        return this.selector;
    }

    @NotNull
    public final RecyclerView getSets() {
        return this.sets;
    }

    @NotNull
    public final AppCompatTextView getTitle() {
        return this.title;
    }

    public /* synthetic */ SetContainerView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetContainerView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp8 = ResourceExtKt.toPx(8, context);
        this.dp12 = ResourceExtKt.toPx(12, context);
        int px = ResourceExtKt.toPx(16, context);
        this.dp16 = px;
        this.dp32 = ResourceExtKt.toPx(32, context);
        this.dp160 = ResourceExtKt.toPx(160, context);
        setOrientation(1);
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        ViewExtKt.updatePadding$default(this, 0, px, 0, px, 5, null);
        this.title = createTitle();
        this.selector = createSelector();
        this.sets = createSets();
    }
}
