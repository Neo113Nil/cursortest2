package ru.ozon.app.android.ugc.widgets.selectionsList.presentation;

import IW.a;
import Kk.C3531a;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.app.android.ugc.widgets.selectionsList.data.SelectionsListVI;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\r¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/presentation/EmptyView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$Background;", "background", "", "bindBackground", "(Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$Background;)V", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionsListItemVI$EmptyItem;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionsListItemVI$EmptyItem;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/android/atom/image/Image;", "backgroundImage$delegate", "LSc/j;", "getBackgroundImage", "()Lru/ozon/uni/android/atom/image/Image;", "backgroundImage", "Landroid/view/View;", "overlayView$delegate", "getOverlayView", "()Landroid/view/View;", "overlayView", "Lru/ozon/uni/android/atom/icon/IconView;", "iconView", "Lru/ozon/uni/android/atom/icon/IconView;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EmptyView extends ConstraintLayout {

    /* renamed from: backgroundImage$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j backgroundImage;

    @NotNull
    private final IconView iconView;

    /* renamed from: overlayView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j overlayView;

    @NotNull
    private final TextAtomV2View titleView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.backgroundImage = LazyUtilsKt.unsafeLazy(new EmptyView$backgroundImage$2(context, this));
        this.overlayView = LazyUtilsKt.unsafeLazy(new EmptyView$overlayView$2(context, this));
        IconView iconView = new IconView(context, null, 0, 6, null);
        ConstraintLayout.b a11 = C3531a.a(iconView, R$id.selectionEmptyIconView, -2, -2);
        a11.f41636i = 0;
        a11.f41640k = R$id.selectionEmptyTitleView;
        a11.f41656t = 0;
        a11.f41658v = 0;
        a11.f41604K = 2;
        iconView.setLayoutParams(a11);
        iconView.setZ(3.0f);
        addView(iconView);
        this.iconView = iconView;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(R$id.selectionEmptyTitleView);
        textAtomV2View.setTextIsSelectable(false);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41638j = iconView.getId();
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        bVar.f41642l = 0;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = Dimens.INSTANCE.getDP_8();
        textAtomV2View.setLayoutParams(bVar);
        textAtomV2View.setZ(3.0f);
        addView(textAtomV2View);
        this.titleView = textAtomV2View;
        setLayoutParams(new ConstraintLayout.b(-2, -2));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(SelectionTileView.INSTANCE.getCORNER_RADIUS());
        setBackground(gradientDrawable);
        setClipToOutline(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$7(SelectionsListVI.SelectionsListItemVI.EmptyItem emptyItem, Function1 function1, View view) {
        AtomAction action;
        SelectionsListVI.SelectionItemCommon selectionItemCommon = emptyItem.getSelectionItemCommon();
        if (selectionItemCommon == null || (action = selectionItemCommon.getAction()) == null) {
            return;
        }
        function1.invoke(action);
    }

    private final void bindBackground(SelectionsListVI.Background background) {
        if (background instanceof SelectionsListVI.Background.ImageWrapper) {
            ImageHolderKt.bind$default(getBackgroundImage(), ((SelectionsListVI.Background.ImageWrapper) background).getImage(), null, 2, null);
            return;
        }
        if (background instanceof SelectionsListVI.Background.ColorWrapper) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer parseColor = styleParser.parseColor(context, ((SelectionsListVI.Background.ColorWrapper) background).getColor());
            if (parseColor != null) {
                getBackgroundImage().setBackgroundColor(parseColor.intValue());
            }
        }
    }

    private final Image getBackgroundImage() {
        return (Image) this.backgroundImage.getValue();
    }

    private final View getOverlayView() {
        return (View) this.overlayView.getValue();
    }

    public final void bind(@NotNull SelectionsListVI.SelectionsListItemVI.EmptyItem item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        SelectionsListVI.Background background;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        setOnClickListener(new a(2, item, actionHandler));
        SelectionsListVI.SelectionItemCommon selectionItemCommon = item.getSelectionItemCommon();
        if (selectionItemCommon != null && (background = selectionItemCommon.getBackground()) != null) {
            bindBackground(background);
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, item.getOverlayColor());
        if (parseColor != null) {
            getOverlayView().setBackgroundColor(parseColor.intValue());
        }
        IconHolderKt.bind$default(this.iconView, item.getIcon(), null, 2, null);
        TextHolderKt.bind$default(this.titleView, item.getTitle(), null, 2, null);
    }
}
