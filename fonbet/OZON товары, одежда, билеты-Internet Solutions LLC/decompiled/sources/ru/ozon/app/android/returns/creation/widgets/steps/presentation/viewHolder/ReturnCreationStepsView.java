package ru.ozon.app.android.returns.creation.widgets.steps.presentation.viewHolder;

import Sx.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.creation.widgets.steps.presentation.viewObject.Step;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ0\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00072\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u0012J\b\u0010\u0014\u001a\u00020\fH\u0002J$\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u0012H\u0002J$\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u0012H\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0007H\u0002¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/steps/presentation/viewHolder/ReturnCreationStepsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "addSteps", "", "steps", "", "Lru/ozon/app/android/returns/creation/widgets/steps/presentation/viewObject/Step;", "separatorColor", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "updateConstraints", "createIconView", "Lru/ozon/uni/android/atom/icon/IconView;", "step", "createTextView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "createSeparatorView", "Lru/ozon/app/android/returns/creation/widgets/steps/presentation/viewHolder/ReturnCreationStepsSeparatorView;", "color", "Companion", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnCreationStepsView extends ConstraintLayout {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int VERTICAL_MARGIN = ResourceExtKt.toPx(16);
    private static final int HORIZONTAL_MARGIN = ResourceExtKt.toPx(44);
    private static final int TITLE_TOP_MARGIN = ResourceExtKt.toPx(14);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/steps/presentation/viewHolder/ReturnCreationStepsView$Companion;", "", "<init>", "()V", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ ReturnCreationStepsView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final IconView createIconView(Step step, Function1<? super AtomAction, Unit> actionHandler) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        IconView iconView = new IconView(context, null, 0, 6, null);
        iconView.setId(View.generateViewId());
        IconHolderKt.bind(iconView, step.getIcon(), actionHandler);
        iconView.setOnClickListener(new a(3, step, actionHandler));
        return iconView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createIconView$lambda$5$lambda$4(Step step, Function1 function1, View view) {
        AtomActionDTO action;
        AtomAction atomAction;
        CommonControlSettings common = step.getCommon();
        if (common == null || (action = common.getAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(action, common.getTrackingInfo())) == null) {
            return;
        }
        function1.invoke(atomAction);
    }

    private final ReturnCreationStepsSeparatorView createSeparatorView(int color) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ReturnCreationStepsSeparatorView returnCreationStepsSeparatorView = new ReturnCreationStepsSeparatorView(context, null, 0, 6, null);
        returnCreationStepsSeparatorView.setId(View.generateViewId());
        returnCreationStepsSeparatorView.setColor(color);
        return returnCreationStepsSeparatorView;
    }

    private final TextAtomV2View createTextView(Step step, Function1<? super AtomAction, Unit> actionHandler) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(View.generateViewId());
        TextHolderKt.bind(textAtomV2View, step.getText(), actionHandler);
        textAtomV2View.setOnClickListener(new NV.a(4, step, actionHandler));
        return textAtomV2View;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createTextView$lambda$9$lambda$8(Step step, Function1 function1, View view) {
        AtomActionDTO action;
        AtomAction atomAction;
        CommonControlSettings common = step.getCommon();
        if (common == null || (action = common.getAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(action, common.getTrackingInfo())) == null) {
            return;
        }
        function1.invoke(atomAction);
    }

    private final void updateConstraints() {
        Iterable<View> children = ViewGroupExtKt.children(this);
        ArrayList arrayList = new ArrayList();
        for (View view : children) {
            if (view instanceof IconView) {
                arrayList.add(view);
            }
        }
        Iterable<View> children2 = ViewGroupExtKt.children(this);
        ArrayList arrayList2 = new ArrayList();
        for (View view2 : children2) {
            if (view2 instanceof TextAtomV2View) {
                arrayList2.add(view2);
            }
        }
        Iterable<View> children3 = ViewGroupExtKt.children(this);
        ArrayList arrayList3 = new ArrayList();
        for (View view3 : children3) {
            if (view3 instanceof ReturnCreationStepsSeparatorView) {
                arrayList3.add(view3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int P11 = C7714v.P(arrayList);
        if (P11 >= 0) {
            int i11 = 0;
            while (true) {
                int id2 = ((IconView) arrayList.get(i11)).getId();
                arrayList4.add(Integer.valueOf(id2));
                int id3 = i11 == 0 ? 0 : ((IconView) arrayList.get(i11 - 1)).getId();
                int id4 = i11 == C7714v.P(arrayList) ? 0 : ((IconView) arrayList.get(i11 + 1)).getId();
                int id5 = ((TextAtomV2View) arrayList2.get(i11)).getId();
                int i12 = id3 == 0 ? 6 : 7;
                int i13 = id4 == 0 ? 7 : 6;
                int i14 = id3 == 0 ? HORIZONTAL_MARGIN : 0;
                int i15 = id4 == 0 ? HORIZONTAL_MARGIN : 0;
                d dVar = new d();
                dVar.p(this);
                int i16 = VERTICAL_MARGIN;
                dVar.t(id2, 3, 0, 3, i16);
                dVar.t(id2, 6, id3, i12, i14);
                int i17 = id4;
                dVar.t(id2, 7, i17, i13, i15);
                dVar.t(id5, 3, id2, 4, TITLE_TOP_MARGIN);
                dVar.s(id5, 6, id2, 6);
                dVar.s(id5, 7, id2, 7);
                dVar.t(id5, 4, 0, 4, i16);
                if (i11 != C7714v.P(arrayList)) {
                    int id6 = ((ReturnCreationStepsSeparatorView) arrayList3.get(i11)).getId();
                    dVar.s(id6, 6, id2, 7);
                    dVar.s(id6, 3, id2, 3);
                    dVar.s(id6, 7, i17, 6);
                    dVar.s(id6, 4, i17, 4);
                }
                dVar.f(this);
                if (i11 == P11) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        d dVar2 = new d();
        dVar2.p(this);
        dVar2.E(C7714v.T0(arrayList4), null, 1);
        dVar2.f(this);
    }

    public final void addSteps(@NotNull List<Step> steps, int separatorColor, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        removeAllViews();
        int i11 = 0;
        for (Object obj : steps) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            Step step = (Step) obj;
            addView(createIconView(step, actionHandler));
            addView(createTextView(step, actionHandler));
            if (i11 != C7714v.P(steps)) {
                addView(createSeparatorView(separatorColor));
            }
            i11 = i12;
        }
        updateConstraints();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnCreationStepsView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
