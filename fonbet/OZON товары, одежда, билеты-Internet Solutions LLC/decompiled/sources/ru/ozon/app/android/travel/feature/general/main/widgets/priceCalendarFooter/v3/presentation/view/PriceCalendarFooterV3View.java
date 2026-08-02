package ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v3.presentation.view;

import FO.b;
import Sc.InterfaceC4008j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v3.presentation.PriceCalendarFooterV3VO;
import ru.ozon.app.android.travel.molecules.view.buttonsRow.ButtonsRowVO;
import ru.ozon.app.android.travel.molecules.view.buttonsRow.ButtonsRowView;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010!\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v3/presentation/view/PriceCalendarFooterV3View;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v3/presentation/PriceCalendarFooterV3VO;", "item", "", "hasPlaceholders", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "bind", "(Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v3/presentation/PriceCalendarFooterV3VO;ZLkotlin/jvm/functions/Function1;)V", "showLoader", "()V", "hideLoader", "contentContainer", "Landroid/widget/LinearLayout;", "Lru/ozon/app/android/travel/molecules/view/buttonsRow/ButtonsRowView;", "buttonsRow", "Lru/ozon/app/android/travel/molecules/view/buttonsRow/ButtonsRowView;", "Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable$delegate", "LSc/j;", "getBackgroundDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable", "Landroid/view/ViewGroup;", "getContentView", "()Landroid/view/ViewGroup;", "contentView", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PriceCalendarFooterV3View extends LinearLayout {

    /* renamed from: backgroundDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j backgroundDrawable;

    @NotNull
    private final ButtonsRowView buttonsRow;

    @NotNull
    private final LinearLayout contentContainer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceCalendarFooterV3View(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        linearLayout.setShowDividers(2);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.getPaint().setColor(0);
        shapeDrawable.setIntrinsicHeight(UiExtKt.toPx(8, context));
        linearLayout.setDividerDrawable(shapeDrawable);
        this.contentContainer = linearLayout;
        ButtonsRowView buttonsRowView = new ButtonsRowView(context, null, 0, 0, 14, null);
        buttonsRowView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        buttonsRowView.setVisibility(8);
        this.buttonsRow = buttonsRowView;
        this.backgroundDrawable = LazyUtilsKt.unsafeLazy(PriceCalendarFooterV3View$backgroundDrawable$2.INSTANCE);
        setOrientation(1);
        addView(linearLayout);
        addView(buttonsRowView);
    }

    private final GradientDrawable getBackgroundDrawable() {
        return (GradientDrawable) this.backgroundDrawable.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showLoader$lambda$7$lambda$6(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void bind(@NotNull PriceCalendarFooterV3VO item, boolean hasPlaceholders, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        PriceCalendarFooterV3VO.Content content = item.getContent();
        ButtonsRowVO buttonsRow = content.getButtonsRow();
        Object[] objArr = buttonsRow != null;
        setVisibility((hasPlaceholders || objArr != false) != false ? 0 : 8);
        this.contentContainer.setVisibility(hasPlaceholders ? 0 : 8);
        this.buttonsRow.setVisibility(objArr != false ? 0 : 8);
        if (buttonsRow != null) {
            this.buttonsRow.bind(buttonsRow, actionHandler);
        }
        String backgroundColor = content.getBackgroundColor();
        Drawable drawable = null;
        if (backgroundColor != null) {
            int px = content.getTopRadius().getPx();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            float pxF = ResourceExtKt.toPxF(px, context);
            GradientDrawable backgroundDrawable = getBackgroundDrawable();
            if (pxF == 0.0f) {
                backgroundDrawable.setCornerRadius(0.0f);
            } else {
                backgroundDrawable.setCornerRadii(new float[]{pxF, pxF, pxF, pxF, 0.0f, 0.0f, 0.0f, 0.0f});
            }
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Integer parseColor = styleParser.parseColor(context2, backgroundColor);
            backgroundDrawable.setColor(parseColor != null ? ColorStateList.valueOf(parseColor.intValue()) : null);
            drawable = backgroundDrawable;
        }
        setBackground(drawable);
    }

    @NotNull
    public final ViewGroup getContentView() {
        return this.contentContainer;
    }

    public final void hideLoader() {
        ButtonsRowView buttonsRowView = this.buttonsRow;
        int childCount = buttonsRowView.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = buttonsRowView.getChildAt(i11);
            if (childAt instanceof ButtonV3View) {
                ((ButtonV3View) childAt).hideLoader();
                childAt.setOnTouchListener(null);
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void showLoader() {
        ButtonsRowView buttonsRowView = this.buttonsRow;
        int childCount = buttonsRowView.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = buttonsRowView.getChildAt(i11);
            if (childAt instanceof ButtonV3View) {
                childAt.setOnTouchListener(new b(2));
                ((ButtonV3View) childAt).showLoader();
            }
        }
    }
}
