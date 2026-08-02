package ru.ozon.app.android.travel.molecules.view.buttonsRow;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import gk0.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.ui.molecules.R$id;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonsDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J;\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000e2\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000b0\u0019j\u0002`\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010$\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001fH\u0002¢\u0006\u0004\b$\u0010%J-\u0010(\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020&2\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000b0\u0019j\u0002`\u001b¢\u0006\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/buttonsRow/ButtonsRowView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "clearLayout", "()V", "", "Landroid/view/View;", "views", "placeViews", "(Ljava/util/List;)V", "view", "Landroidx/constraintlayout/widget/ConstraintLayout$b;", "provideLayoutParams", "(Landroid/view/View;)Landroidx/constraintlayout/widget/ConstraintLayout$b;", "Lru/ozon/uni/atoms/data/controls/button/ButtonsDTO;", "buttons", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "prepareViews", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "Lru/ozon/uni/atoms/data/common/Paddings;", "topPadding", "bottomPadding", "horizontalPadding", "buttonsMargin", "applyOffsets", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "Lru/ozon/app/android/travel/molecules/view/buttonsRow/ButtonsRowVO;", "item", "bind", "(Lru/ozon/app/android/travel/molecules/view/buttonsRow/ButtonsRowVO;Lkotlin/jvm/functions/Function1;)V", "Landroidx/constraintlayout/helper/widget/Flow;", "flow", "Landroidx/constraintlayout/helper/widget/Flow;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ButtonsRowView extends ConstraintLayout {

    @NotNull
    private final Flow flow;

    public /* synthetic */ ButtonsRowView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final void applyOffsets(Paddings topPadding, Paddings bottomPadding, Paddings horizontalPadding, Paddings buttonsMargin) {
        int px = horizontalPadding.getPx();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px2 = ResourceExtKt.toPx(px, context);
        int px3 = topPadding.getPx();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int px4 = ResourceExtKt.toPx(px3, context2);
        int px5 = bottomPadding.getPx();
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        ViewExtKt.updatePadding(this, px2, px4, px2, ResourceExtKt.toPx(px5, context3));
        Flow flow = this.flow;
        int px6 = buttonsMargin.getPx();
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        flow.setHorizontalGap(ResourceExtKt.toPx(px6, context4));
    }

    private final void clearLayout() {
        if (Intrinsics.d(getChildAt(0), this.flow)) {
            if (getChildCount() > 1) {
                removeViewsInLayout(1, getChildCount() - 1);
            }
        } else {
            if (getChildCount() != 0) {
                removeViewsInLayout(0, getChildCount());
            }
            Flow flow = this.flow;
            addViewInLayout(flow, 0, flow.getLayoutParams(), true);
        }
    }

    private final void placeViews(List<? extends View> views) {
        int[] iArr = new int[views.size()];
        int i11 = 0;
        for (Object obj : views) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            View view = (View) obj;
            addViewInLayout(view, -1, provideLayoutParams(view), true);
            iArr[i11] = view.getId();
            i11 = i12;
        }
        this.flow.setReferencedIds(iArr);
        requestLayout();
        invalidate();
    }

    private final List<View> prepareViews(List<? extends ButtonsDTO> buttons, Function1<? super AtomAction, Unit> actionHandler) {
        ArrayList arrayList = new ArrayList();
        for (ButtonsDTO buttonsDTO : buttons) {
            if (buttonsDTO instanceof ButtonV3DTO) {
                ButtonV3View buttonV3View = (ButtonV3View) q.f64554a.i(N.b(ButtonV3View.class), getContext());
                if (buttonV3View == null) {
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
                }
                buttonV3View.setId(View.generateViewId());
                ButtonV3HolderKt.bind(buttonV3View, (ButtonV3DTO) buttonsDTO, actionHandler);
                arrayList.add(buttonV3View);
            } else if (buttonsDTO instanceof IconButtonV3DTO) {
                IconButtonV3View iconButtonV3View = (IconButtonV3View) q.f64554a.i(N.b(IconButtonV3View.class), getContext());
                if (iconButtonV3View == null) {
                    Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    iconButtonV3View = new IconButtonV3View(context2, null, 0, 0, 14, null);
                }
                iconButtonV3View.setId(View.generateViewId());
                IconButtonV3HolderKt.bind(iconButtonV3View, (IconButtonV3DTO) buttonsDTO, actionHandler);
                arrayList.add(iconButtonV3View);
            }
        }
        return arrayList;
    }

    private final ConstraintLayout.b provideLayoutParams(View view) {
        return view instanceof IconButtonV3View ? new ConstraintLayout.b(-2, -2) : new ConstraintLayout.b(0, -2);
    }

    public final void bind(@NotNull ButtonsRowVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        clearLayout();
        applyOffsets(item.getTopPadding(), item.getBottomPadding(), item.getHorizontalPadding(), item.getButtonsMargin());
        placeViews(prepareViews(item.getButtons(), actionHandler));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonsRowView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        Flow flow = new Flow(context);
        flow.setId(R$id.buttonsRowViewFlow);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41656t = 0;
        bVar.f41636i = 0;
        bVar.f41658v = 0;
        bVar.f41642l = 0;
        flow.setLayoutParams(bVar);
        flow.setOrientation(0);
        flow.setVerticalAlign(2);
        flow.setHorizontalStyle(2);
        this.flow = flow;
        addView(flow);
    }
}
