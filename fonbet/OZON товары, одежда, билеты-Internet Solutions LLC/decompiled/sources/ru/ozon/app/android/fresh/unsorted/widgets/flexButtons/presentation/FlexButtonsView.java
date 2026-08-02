package ru.ozon.app.android.fresh.unsorted.widgets.flexButtons.presentation;

import B90.t0;
import Sc.o;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.widgets.flexButtons.data.FlexButtonsDTO;
import ru.ozon.app.android.fresh.unsorted.widgets.flexButtons.domain.FlexButtonsVO;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\"\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\u0012J\b\u0010\u0014\u001a\u00020\u000eH\u0002J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u0007H\u0002J\b\u0010\u001e\u001a\u00020\fH\u0002R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/flexButtons/presentation/FlexButtonsView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "buttonsList", "", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "bind", "", "item", "Lru/ozon/app/android/fresh/unsorted/widgets/flexButtons/domain/FlexButtonsVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "recalculateUnevenWeights", "applyButtonLayoutParams", "button", "arrangement", "Lru/ozon/app/android/fresh/unsorted/widgets/flexButtons/data/FlexButtonsDTO$ButtonsArrangement;", "setupSpacers", "spacers", "Lru/ozon/app/android/fresh/unsorted/widgets/flexButtons/domain/FlexButtonsVO$Spacers;", "getOrCreateButton", "index", "createButton", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FlexButtonsView extends LinearLayout {

    @NotNull
    private final List<ButtonV3View> buttonsList;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FlexButtonsDTO.ButtonsArrangement.values().length];
            try {
                iArr[FlexButtonsDTO.ButtonsArrangement.EVEN_SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FlexButtonsDTO.ButtonsArrangement.UNEVEN_SPREAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FlexButtonsDTO.ButtonsArrangement.NO_SPREAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ FlexButtonsView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void applyButtonLayoutParams(ButtonV3View button, FlexButtonsDTO.ButtonsArrangement arrangement) {
        ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[arrangement.ordinal()];
        if (i11 == 1) {
            layoutParams2.weight = 1.0f;
            layoutParams2.width = 0;
        } else if (i11 == 2) {
            layoutParams2.weight = 1.0f;
            layoutParams2.width = -2;
            post(new t0(this, 4));
        } else {
            if (i11 != 3) {
                throw new o();
            }
            layoutParams2.weight = 0.0f;
            layoutParams2.width = -2;
        }
        button.setLayoutParams(layoutParams2);
    }

    private final ButtonV3View createButton() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ButtonV3View buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        buttonV3View.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        return buttonV3View;
    }

    private final ButtonV3View getOrCreateButton(int index) {
        if (index < this.buttonsList.size()) {
            return this.buttonsList.get(index);
        }
        ButtonV3View createButton = createButton();
        this.buttonsList.add(createButton);
        addView(createButton);
        return createButton;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recalculateUnevenWeights() {
        Iterator<T> it = this.buttonsList.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 += ((ButtonV3View) it.next()).getMeasuredWidth();
        }
        for (ButtonV3View buttonV3View : this.buttonsList) {
            ViewGroup.LayoutParams layoutParams = buttonV3View.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 == null) {
                return;
            }
            layoutParams2.weight = buttonV3View.getMeasuredWidth() / i11;
            layoutParams2.width = 0;
            buttonV3View.setLayoutParams(layoutParams2);
        }
    }

    private final void setupSpacers(FlexButtonsVO.Spacers spacers) {
        setPadding(spacers.getLeft(), spacers.getTop(), spacers.getRight(), spacers.getBottom());
    }

    public final void bind(@NotNull FlexButtonsVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        setupSpacers(item.getSpacers());
        Iterator<T> it = this.buttonsList.iterator();
        while (it.hasNext()) {
            ViewExtKt.gone((ButtonV3View) it.next());
        }
        int i11 = 0;
        for (Object obj : item.getButtons()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            ButtonV3DTO buttonV3DTO = (ButtonV3DTO) obj;
            ButtonV3View orCreateButton = getOrCreateButton(i11);
            orCreateButton.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = orCreateButton.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginEnd(i11 == item.getButtons().size() + (-1) ? 0 : item.getSpacers().getBetweenButtons());
            orCreateButton.setLayoutParams(marginLayoutParams);
            ButtonV3HolderKt.bind(orCreateButton, buttonV3DTO, actionHandler);
            applyButtonLayoutParams(orCreateButton, item.getButtonsArrangement());
            i11 = i12;
        }
        if (item.getButtons().size() < this.buttonsList.size()) {
            removeViews(item.getButtons().size(), this.buttonsList.size() - item.getButtons().size());
            this.buttonsList.subList(item.getButtons().size(), this.buttonsList.size()).clear();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexButtonsView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.buttonsList = new ArrayList();
        setOrientation(0);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setGravity(17);
    }
}
