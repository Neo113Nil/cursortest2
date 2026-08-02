package ru.ozon.app.android.travel.molecules.fragment.selector.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/molecules/fragment/selector/view/SelectorBottomSheetDialogView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "addViews", "()V", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "bindTitle", "(Ljava/lang/String;)V", "", "dp16", "I", "Landroidx/appcompat/widget/AppCompatTextView;", "titleTv", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroidx/recyclerview/widget/RecyclerView;", "selectorRv", "Landroidx/recyclerview/widget/RecyclerView;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectorBottomSheetDialogView extends LinearLayout {
    private final int dp16;

    @SuppressLint({"NestedScrollFlagNotApplied"})
    @NotNull
    private final RecyclerView selectorRv;

    @NotNull
    private final AppCompatTextView titleTv;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectorBottomSheetDialogView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(16, context);
        this.dp16 = px;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.leftMargin = px;
        layoutParams.bottomMargin = px;
        appCompatTextView.setLayoutParams(layoutParams);
        appCompatTextView.setTextAppearance(R$style.TextStyle_Body_L_Bold);
        this.titleTv = appCompatTextView;
        RecyclerView recyclerView = new RecyclerView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = px;
        recyclerView.setLayoutParams(layoutParams2);
        this.selectorRv = recyclerView;
        setOrientation(1);
        addViews();
    }

    private final void addViews() {
        addView(this.titleTv);
        addView(this.selectorRv);
    }

    public final void bindTitle(String title) {
        TextViewExtKt.setTextOrGone(this.titleTv, title);
    }
}
