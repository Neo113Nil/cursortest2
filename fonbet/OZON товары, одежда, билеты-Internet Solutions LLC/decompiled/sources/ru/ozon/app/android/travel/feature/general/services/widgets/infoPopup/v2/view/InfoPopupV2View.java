package ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v2.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.af.layout.HorizontalAtomsLayout;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v2.presentation.InfoPopupV2VO;
import ru.ozon.app.android.travel.molecules.view.textInfoCells.TextInfoCellsView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomDecorator;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.HorizontalAtomsDecorator;
import ru.ozon.uni.atoms.af.VerticalAtomsDecorator;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.core.UniGradient;
import y7.k;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0002%&B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00170\u001bJ\u0012\u0010\u001d\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0017H\u0002J\b\u0010 \u001a\u00020\u0017H\u0002J\u0012\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020$H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v2/view/InfoPopupV2View;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp8", "", "dp12", "dp16", "imageView", "Lcom/google/android/material/imageview/ShapeableImageView;", "textCellsView", "Lru/ozon/app/android/travel/molecules/view/textInfoCells/TextInfoCellsView;", "cellsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "cellsView", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "buttonsAdapter", "verticalButtonsView", "horizontalButtonsView", "Lru/ozon/app/android/atoms/af/layout/HorizontalAtomsLayout;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v2/presentation/InfoPopupV2VO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "bindImage", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v2/presentation/InfoPopupV2VO$ImageInfo;", "setUpCellsView", "setUpButtonsView", "retrieveGradientColor", "Lru/ozon/uni/android/uikitsdk/Color;", "color", "", "ButtonsVerticalDecorator", "ButtonsHorizontalDecorator", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InfoPopupV2View extends LinearLayout {

    @NotNull
    private final AtomsAdapter buttonsAdapter;

    @NotNull
    private final AtomsAdapter cellsAdapter;

    @NotNull
    private final VerticalAtomsLayout cellsView;
    private final int dp12;
    private final int dp16;
    private final int dp8;

    @NotNull
    private final HorizontalAtomsLayout horizontalButtonsView;

    @NotNull
    private final ShapeableImageView imageView;

    @NotNull
    private final TextInfoCellsView textCellsView;

    @NotNull
    private final VerticalAtomsLayout verticalButtonsView;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v2/view/InfoPopupV2View$ButtonsHorizontalDecorator;", "Lru/ozon/uni/atoms/af/AtomDecorator;", "Lru/ozon/uni/atoms/af/HorizontalAtomsDecorator;", "context", "Landroid/content/Context;", "margin", "", "<init>", "(Landroid/content/Context;I)V", "modifyHorizontalLayoutParams", "Landroid/widget/LinearLayout$LayoutParams;", "lp", "data", "Lru/ozon/uni/atoms/data/AtomDTO;", "position", "last", "", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class ButtonsHorizontalDecorator extends AtomDecorator implements HorizontalAtomsDecorator {
        private final int margin;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ButtonsHorizontalDecorator(@NotNull Context context, int i11) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
            this.margin = i11;
        }

        @Override // ru.ozon.uni.atoms.af.HorizontalAtomsDecorator
        @NotNull
        public LinearLayout.LayoutParams modifyHorizontalLayoutParams(@NotNull LinearLayout.LayoutParams lp, @NotNull AtomDTO data, int position, boolean last) {
            Intrinsics.checkNotNullParameter(lp, "lp");
            Intrinsics.checkNotNullParameter(data, "data");
            setRight(lp, last ? 0 : this.margin);
            lp.width = last ? -1 : -2;
            return lp;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v2/view/InfoPopupV2View$ButtonsVerticalDecorator;", "Lru/ozon/uni/atoms/af/AtomDecorator;", "Lru/ozon/uni/atoms/af/VerticalAtomsDecorator;", "context", "Landroid/content/Context;", "margin", "", "<init>", "(Landroid/content/Context;I)V", "modifyVerticalLayoutParams", "Landroid/widget/LinearLayout$LayoutParams;", "lp", "data", "Lru/ozon/uni/atoms/data/AtomDTO;", "position", "last", "", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class ButtonsVerticalDecorator extends AtomDecorator implements VerticalAtomsDecorator {
        private final int margin;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ButtonsVerticalDecorator(@NotNull Context context, int i11) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
            this.margin = i11;
        }

        @Override // ru.ozon.uni.atoms.af.VerticalAtomsDecorator
        @NotNull
        public LinearLayout.LayoutParams modifyVerticalLayoutParams(@NotNull LinearLayout.LayoutParams lp, @NotNull AtomDTO data, int position, boolean last) {
            Intrinsics.checkNotNullParameter(lp, "lp");
            Intrinsics.checkNotNullParameter(data, "data");
            setBottom(lp, last ? 0 : this.margin);
            return lp;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoPopupV2View(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(8, context);
        this.dp8 = px;
        this.dp12 = ResourceExtKt.toPx(12, context);
        int px2 = ResourceExtKt.toPx(16, context);
        this.dp16 = px2;
        ShapeableImageView shapeableImageView = new ShapeableImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, ResourceExtKt.toPx(240, context));
        layoutParams.setMargins(px, px, px, px);
        shapeableImageView.setLayoutParams(layoutParams);
        shapeableImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        float pxF = ResourceExtKt.toPxF(16, context);
        k.a aVar = new k.a(new k());
        aVar.c(pxF);
        shapeableImageView.setShapeAppearanceModel(aVar.a());
        shapeableImageView.setBackground(new GradientDrawable());
        this.imageView = shapeableImageView;
        TextInfoCellsView textInfoCellsView = new TextInfoCellsView(context, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(px2, px, px2, px);
        textInfoCellsView.setLayoutParams(layoutParams2);
        textInfoCellsView.setNestedScrollingEnabled(false);
        this.textCellsView = textInfoCellsView;
        this.cellsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        VerticalAtomsLayout verticalAtomsLayout = new VerticalAtomsLayout(context, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(0, px, 0, px);
        verticalAtomsLayout.setLayoutParams(layoutParams3);
        this.cellsView = verticalAtomsLayout;
        this.buttonsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        VerticalAtomsLayout verticalAtomsLayout2 = new VerticalAtomsLayout(context, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.setMargins(px2, px2, px2, 0);
        verticalAtomsLayout2.setLayoutParams(layoutParams4);
        this.verticalButtonsView = verticalAtomsLayout2;
        HorizontalAtomsLayout horizontalAtomsLayout = new HorizontalAtomsLayout(context, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams5.setMargins(px2, px2, px2, 0);
        horizontalAtomsLayout.setLayoutParams(layoutParams5);
        this.horizontalButtonsView = horizontalAtomsLayout;
        setOrientation(1);
        addView(shapeableImageView);
        addView(textInfoCellsView);
        setUpCellsView();
        addView(verticalAtomsLayout);
        setUpButtonsView();
        addView(verticalAtomsLayout2);
        addView(horizontalAtomsLayout);
    }

    private final void bindImage(InfoPopupV2VO.ImageInfo item) {
        ImageViewExtKt.loadImageOrGone(this.imageView, item != null ? item.getLink() : null);
        String backgroundColor = item != null ? item.getBackgroundColor() : null;
        if (backgroundColor == null) {
            backgroundColor = "";
        }
        Color retrieveGradientColor = retrieveGradientColor(backgroundColor);
        if (retrieveGradientColor == null) {
            return;
        }
        Drawable background = this.imageView.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            retrieveGradientColor.applyTo(gradientDrawable);
        }
    }

    private final Color retrieveGradientColor(String color) {
        UniGradient gradientByToken = TokensExtKt.getGradientByToken(color);
        if (gradientByToken != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Color.Gradient gradient = TokensExtKt.toGradient(gradientByToken, context);
            if (gradient != null) {
                return gradient;
            }
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context2, color);
        if (parseColor != null) {
            return new Color.Solid(parseColor.intValue());
        }
        return null;
    }

    private final void setUpButtonsView() {
        VerticalAtomsLayout verticalAtomsLayout = this.verticalButtonsView;
        Context context = verticalAtomsLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        verticalAtomsLayout.setDecorator(new ButtonsVerticalDecorator(context, this.dp8));
        HorizontalAtomsLayout horizontalAtomsLayout = this.horizontalButtonsView;
        Context context2 = horizontalAtomsLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        horizontalAtomsLayout.setDecorator(new ButtonsHorizontalDecorator(context2, this.dp12));
    }

    private final void setUpCellsView() {
        this.cellsView.setAdapter(this.cellsAdapter);
    }

    public final void bind(@NotNull InfoPopupV2VO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        bindImage(item.getImageInfo());
        TextInfoCellsView.bindOrGone$default(this.textCellsView, item.getTextCells(), null, 2, null);
        this.cellsView.setVisibility(item.getAreCellsVisible() ? 0 : 8);
        AtomsAdapter atomsAdapter = this.cellsAdapter;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        atomsAdapter.bind(context, item.getCells());
        atomsAdapter.setOnAction(actionHandler);
        this.verticalButtonsView.setVisibility(item.getAreButtonsVisible() && !item.getAreButtonsHorizontal() ? 0 : 8);
        this.horizontalButtonsView.setVisibility(item.getAreButtonsVisible() && item.getAreButtonsHorizontal() ? 0 : 8);
        if (item.getAreButtonsHorizontal()) {
            this.horizontalButtonsView.setAdapter(this.buttonsAdapter);
            this.verticalButtonsView.setAdapter(null);
        } else {
            this.verticalButtonsView.setAdapter(this.buttonsAdapter);
            this.horizontalButtonsView.setAdapter(null);
        }
        AtomsAdapter atomsAdapter2 = this.buttonsAdapter;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        atomsAdapter2.bind(context2, item.getButtons());
        atomsAdapter2.setOnAction(actionHandler);
    }
}
