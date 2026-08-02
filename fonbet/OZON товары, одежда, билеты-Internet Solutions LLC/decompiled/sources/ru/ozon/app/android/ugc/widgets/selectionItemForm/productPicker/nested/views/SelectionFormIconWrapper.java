package ru.ozon.app.android.ugc.widgets.selectionItemForm.productPicker.nested.views;

import B3.D;
import DQ.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.R$id;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.productPicker.SelectionFormProductPickerVO;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u000bH\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/productPicker/nested/views/SelectionFormIconWrapper;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "wasProductsEmpty", "", "action", "iconView", "Lru/ozon/uni/android/atom/icon/IconView;", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "bind", "addProductVO", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/productPicker/SelectionFormProductPickerVO$AddProductVO;", "updateViewSize", "isProductsEmpty", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class SelectionFormIconWrapper extends FrameLayout {
    private AtomAction action;

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final GradientDrawable backgroundDrawable;

    @NotNull
    private final IconView iconView;
    private boolean wasProductsEmpty;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SelectionFormIconWrapper(@NotNull Context context, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
        IconView iconView = new IconView(context, null, 0, 6, null);
        iconView.setId(R$id.reviewMediaPreviewIconView);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        iconView.setLayoutParams(layoutParams);
        this.iconView = iconView;
        GradientDrawable b11 = D.b(0);
        Dimens dimens = Dimens.INSTANCE;
        b11.setCornerRadius(dimens.getDPF_20());
        this.backgroundDrawable = b11;
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        setBackground(b11);
        setPadding(dimens.getDP_20(), 0, dimens.getDP_20(), 0);
        addView(iconView);
        setOnClickListener(new b(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(SelectionFormIconWrapper selectionFormIconWrapper, View view) {
        AtomAction atomAction = selectionFormIconWrapper.action;
        if (atomAction != null) {
            selectionFormIconWrapper.actionHandler.invoke(atomAction);
        }
    }

    private final void updateViewSize(boolean isProductsEmpty) {
        if (!isProductsEmpty) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = -1;
            setLayoutParams(layoutParams);
            ViewExtKt.updatePadding$default(this, 0, 0, 0, 0, 5, null);
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.height = -2;
        setLayoutParams(layoutParams2);
        Dimens dimens = Dimens.INSTANCE;
        ViewExtKt.updatePadding$default(this, 0, dimens.getDP_32(), 0, dimens.getDP_32(), 5, null);
    }

    public final void bind(@NotNull SelectionFormProductPickerVO.AddProductVO addProductVO) {
        Intrinsics.checkNotNullParameter(addProductVO, "addProductVO");
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, addProductVO.getBackgroundColor());
        if (parseColor != null) {
            this.backgroundDrawable.setColor(parseColor.intValue());
        }
        IconHolderKt.bind$default(this.iconView, addProductVO.getIcon(), null, 2, null);
        this.action = addProductVO.getAction();
        if (addProductVO.getIsProductsEmpty() != this.wasProductsEmpty) {
            this.wasProductsEmpty = addProductVO.getIsProductsEmpty();
            updateViewSize(addProductVO.getIsProductsEmpty());
        }
    }
}
