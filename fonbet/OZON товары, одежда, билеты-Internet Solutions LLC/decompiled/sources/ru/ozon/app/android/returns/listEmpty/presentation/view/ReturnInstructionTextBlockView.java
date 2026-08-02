package ru.ozon.app.android.returns.listEmpty.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.listEmpty.presentation.util.ReturnsTextBlockFooterBuilder;
import ru.ozon.app.android.returns.listEmpty.presentation.util.ReturnsTextBlockHeaderBuilder;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/returns/listEmpty/presentation/view/ReturnInstructionTextBlockView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "imageView", "Landroidx/appcompat/widget/AppCompatImageView;", "getImageView", "()Landroidx/appcompat/widget/AppCompatImageView;", "headerTextAtomView", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "getHeaderTextAtomView", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "textRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getTextRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "largeButtonView", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "getLargeButtonView", "()Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnInstructionTextBlockView extends LinearLayout {

    @NotNull
    private final TextAtomView headerTextAtomView;

    @NotNull
    private final AppCompatImageView imageView;

    @NotNull
    private final LargeButtonView largeButtonView;

    @NotNull
    private final RecyclerView textRecyclerView;

    public /* synthetic */ ReturnInstructionTextBlockView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    @NotNull
    public final TextAtomView getHeaderTextAtomView() {
        return this.headerTextAtomView;
    }

    @NotNull
    public final AppCompatImageView getImageView() {
        return this.imageView;
    }

    @NotNull
    public final LargeButtonView getLargeButtonView() {
        return this.largeButtonView;
    }

    @NotNull
    public final RecyclerView getTextRecyclerView() {
        return this.textRecyclerView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnInstructionTextBlockView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        ReturnsTextBlockHeaderBuilder returnsTextBlockHeaderBuilder = ReturnsTextBlockHeaderBuilder.INSTANCE;
        AppCompatImageView createHeaderImageView = returnsTextBlockHeaderBuilder.createHeaderImageView(context);
        this.imageView = createHeaderImageView;
        TextAtomView createHeaderTextAtomView = returnsTextBlockHeaderBuilder.createHeaderTextAtomView(context);
        this.headerTextAtomView = createHeaderTextAtomView;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(UiExtKt.toPx(4, context), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        recyclerView.setLayoutParams(layoutParams);
        recyclerView.setOverScrollMode(2);
        recyclerView.setVerticalScrollBarEnabled(false);
        recyclerView.setHorizontalScrollBarEnabled(false);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setClipChildren(false);
        recyclerView.setClipToPadding(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        this.textRecyclerView = recyclerView;
        LargeButtonView createLargeButtonView = ReturnsTextBlockFooterBuilder.INSTANCE.createLargeButtonView(context);
        this.largeButtonView = createLargeButtonView;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setOrientation(1);
        int px = UiExtKt.toPx(16, context);
        setPadding(px, px, px, px);
        addView(createHeaderImageView);
        addView(createHeaderTextAtomView);
        addView(recyclerView);
        addView(createLargeButtonView);
    }
}
