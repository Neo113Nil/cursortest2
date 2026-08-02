package ru.ozon.app.android.returns.details.presentation.views;

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
import ru.ozon.app.android.returns.common.presentation.untils.TextAppearanceHelper;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lru/ozon/app/android/returns/details/presentation/views/ReturnItemsView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "subTitleContainerMarginTop", "orderLinkMarginStart", "marginHorizontal", "packingInstructionMarginTop", "subtitleTextSize", "", "titleTextSize", "orderLinkTextSize", "titleTextAtomView", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "getTitleTextAtomView", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "subtitleTextAtomView", "getSubtitleTextAtomView", "orderLinkSmallBorderlessButtonView", "Lru/ozon/uni/android/uikit/view/atoms/buttons/borderless/SmallBorderlessButtonView;", "getOrderLinkSmallBorderlessButtonView", "()Lru/ozon/uni/android/uikit/view/atoms/buttons/borderless/SmallBorderlessButtonView;", "packingInstructionSingleAtom", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "getPackingInstructionSingleAtom", "()Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "itemsRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getItemsRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "subTitleLinearLayout", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnItemsView extends LinearLayout {

    @NotNull
    private final RecyclerView itemsRecyclerView;
    private final int marginHorizontal;
    private final int orderLinkMarginStart;

    @NotNull
    private final SmallBorderlessButtonView orderLinkSmallBorderlessButtonView;
    private final float orderLinkTextSize;
    private final int packingInstructionMarginTop;

    @NotNull
    private final SingleAtom packingInstructionSingleAtom;
    private final int subTitleContainerMarginTop;

    @NotNull
    private final LinearLayout subTitleLinearLayout;

    @NotNull
    private final TextAtomView subtitleTextAtomView;
    private final float subtitleTextSize;

    @NotNull
    private final TextAtomView titleTextAtomView;
    private final float titleTextSize;

    public /* synthetic */ ReturnItemsView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    @NotNull
    public final RecyclerView getItemsRecyclerView() {
        return this.itemsRecyclerView;
    }

    @NotNull
    public final SmallBorderlessButtonView getOrderLinkSmallBorderlessButtonView() {
        return this.orderLinkSmallBorderlessButtonView;
    }

    @NotNull
    public final SingleAtom getPackingInstructionSingleAtom() {
        return this.packingInstructionSingleAtom;
    }

    @NotNull
    public final TextAtomView getSubtitleTextAtomView() {
        return this.subtitleTextAtomView;
    }

    @NotNull
    public final TextAtomView getTitleTextAtomView() {
        return this.titleTextAtomView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnItemsView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        int i13 = -UiExtKt.toPx(3, context);
        this.subTitleContainerMarginTop = i13;
        int px = UiExtKt.toPx(4, context);
        this.orderLinkMarginStart = px;
        int px2 = UiExtKt.toPx(16, context);
        this.marginHorizontal = px2;
        int px3 = UiExtKt.toPx(12, context);
        this.packingInstructionMarginTop = px3;
        float spF = UiExtKt.toSpF(14.0f);
        this.subtitleTextSize = spF;
        float spF2 = UiExtKt.toSpF(20.0f);
        this.titleTextSize = spF2;
        float spF3 = UiExtKt.toSpF(14.0f);
        this.orderLinkTextSize = spF3;
        TextAtomView textAtomView = new TextAtomView(context, null, 0, 6, null);
        textAtomView.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(px2, 0, px2, 0);
        textAtomView.setLayoutParams(layoutParams);
        TextAppearanceHelper textAppearanceHelper = TextAppearanceHelper.INSTANCE;
        textAppearanceHelper.setStyle(textAtomView, R$style.TextStyle_Head_M);
        textAtomView.setTextColorOrDefault(Integer.valueOf(ThemeExtKt.themeColor(context, R$attr.textPrimary)));
        textAtomView.setTextSize(spF2);
        this.titleTextAtomView = textAtomView;
        TextAtomView textAtomView2 = new TextAtomView(context, null, 0, 6, null);
        textAtomView2.setId(View.generateViewId());
        textAtomView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textAppearanceHelper.setStyle(textAtomView2, R$style.TextStyle_Head_M);
        textAtomView2.setTextColorOrDefault(Integer.valueOf(ThemeExtKt.themeColor(context, R$attr.textSecondary)));
        textAtomView2.setTextSize(spF);
        this.subtitleTextAtomView = textAtomView2;
        SmallBorderlessButtonView smallBorderlessButtonView = new SmallBorderlessButtonView(context, null, 0, 6, null);
        smallBorderlessButtonView.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        int i14 = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
        int marginEnd = layoutParams2.getMarginEnd();
        int i15 = ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
        layoutParams2.setMarginStart(px);
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = i14;
        layoutParams2.setMarginEnd(marginEnd);
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = i15;
        smallBorderlessButtonView.setLayoutParams(layoutParams2);
        smallBorderlessButtonView.setTextAppearance(R$style.TextStyle_Head_M);
        smallBorderlessButtonView.setTextColor(ThemeExtKt.themeColor(context, R$attr.textSecondary));
        smallBorderlessButtonView.setTextSize(spF3);
        this.orderLinkSmallBorderlessButtonView = smallBorderlessButtonView;
        SingleAtom singleAtom = new SingleAtom(context, null, 0, 0, 14, null);
        singleAtom.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(px2, px3, px2, 0);
        singleAtom.setLayoutParams(layoutParams3);
        this.packingInstructionSingleAtom = singleAtom;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(View.generateViewId());
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setClipChildren(false);
        recyclerView.setClipToPadding(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        this.itemsRecyclerView = recyclerView;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.setMargins(px2, i13, px2, 0);
        linearLayout.setLayoutParams(layoutParams4);
        linearLayout.addView(textAtomView2);
        linearLayout.addView(smallBorderlessButtonView);
        this.subTitleLinearLayout = linearLayout;
        setOrientation(1);
        addView(textAtomView);
        addView(linearLayout);
        addView(singleAtom);
        addView(recyclerView);
    }
}
