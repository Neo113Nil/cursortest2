package ru.ozon.app.android.cml.delivery.molecules.secureDeal.presentation;

import Bi.b;
import D40.d;
import Gp.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.common.ext.CommonControlSettingsExtKt;
import ru.ozon.app.android.cml.delivery.common.ext.Dimens;
import ru.ozon.app.android.cml.delivery.molecules.secureDeal.data.SecureDealMoleculeDTO;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.disclaimer.DisclaimerView;
import ru.ozon.uni.android.atom.selectionControls.ToggleView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.selectionControls.toggle.ToggleDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.disclaimer.DSDisclaimerHolderKt;
import ru.ozon.uni.atoms.v3.holders.selectionControls.ToggleHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000±\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0005*\u0001H\b\u0000\u0018\u0000 K2\u00020\u0001:\u0001KB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u0006*\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fj\u0002`\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\u001f\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u001e2\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fj\u0002`\u0012¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010#\u001a\u00020\u00112\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010!¢\u0006\u0004\b#\u0010$J-\u0010%\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fj\u0002`\u0012¢\u0006\u0004\b%\u0010\u0015R0\u0010(\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0017\u0010D\u001a\u00020C8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006L"}, d2 = {"Lru/ozon/app/android/cml/delivery/molecules/secureDeal/presentation/SecureDealMoleculeView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/uni/atoms/data/common/Paddings;", "resolveMarginValue", "(Lru/ozon/uni/atoms/data/common/Paddings;)I", "Lru/ozon/app/android/cml/delivery/molecules/secureDeal/data/SecureDealMoleculeDTO;", "dto", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "bind", "(Lru/ozon/app/android/cml/delivery/molecules/secureDeal/data/SecureDealMoleculeDTO;Lkotlin/jvm/functions/Function1;)V", "bindMargins", "(Lru/ozon/app/android/cml/delivery/molecules/secureDeal/data/SecureDealMoleculeDTO;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", "bindTitle", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "Lru/ozon/uni/atoms/data/selectionControls/toggle/ToggleDTO;", "bindToggle", "(Lru/ozon/uni/atoms/data/selectionControls/toggle/ToggleDTO;)V", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "bindIconButton", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lkotlin/jvm/functions/Function1;)V", "", "dtos", "bindSubtitle", "(Ljava/util/List;)V", "bindBottomBlock", "Landroid/view/MotionEvent;", "", "onToggleTouchEvent", "Lkotlin/jvm/functions/Function1;", "getOnToggleTouchEvent", "()Lkotlin/jvm/functions/Function1;", "setOnToggleTouchEvent", "(Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTv", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "iconButtonView", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "Landroid/view/View$OnTouchListener;", "onToggleStateChangedListener", "Landroid/view/View$OnTouchListener;", "Lru/ozon/uni/android/atom/selectionControls/ToggleView;", "toggleView", "Lru/ozon/uni/android/atom/selectionControls/ToggleView;", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "subtitleLayout", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "Landroidx/constraintlayout/widget/Barrier;", "bottomAtomsBarrier", "Landroidx/constraintlayout/widget/Barrier;", "Lru/ozon/uni/android/atom/disclaimer/DisclaimerView;", "disclaimerView", "Lru/ozon/uni/android/atom/disclaimer/DisclaimerView;", "Lru/ozon/uni/android/cell/CellView;", "cellView", "Lru/ozon/uni/android/cell/CellView;", "getCellView", "()Lru/ozon/uni/android/cell/CellView;", "ru/ozon/app/android/cml/delivery/molecules/secureDeal/presentation/SecureDealMoleculeView$backgroundOutlineProvider$1", "backgroundOutlineProvider", "Lru/ozon/app/android/cml/delivery/molecules/secureDeal/presentation/SecureDealMoleculeView$backgroundOutlineProvider$1;", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SecureDealMoleculeView extends ConstraintLayout {

    @NotNull
    private final SecureDealMoleculeView$backgroundOutlineProvider$1 backgroundOutlineProvider;

    @NotNull
    private final Barrier bottomAtomsBarrier;

    @NotNull
    private final CellView cellView;

    @NotNull
    private final DisclaimerView disclaimerView;

    @NotNull
    private final IconButtonV3View iconButtonView;

    @SuppressLint({"ClickableViewAccessibility"})
    @NotNull
    private final View.OnTouchListener onToggleStateChangedListener;
    private Function1<? super MotionEvent, Boolean> onToggleTouchEvent;

    @NotNull
    private final VerticalAtomsLayout subtitleLayout;

    @NotNull
    private final TextAtomV2View titleTv;

    @NotNull
    private final ToggleView toggleView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int titleId = View.generateViewId();
    private static final int iconId = View.generateViewId();
    private static final int toggleId = View.generateViewId();
    private static final int descriptionId = View.generateViewId();
    private static final int bottomBarrierId = View.generateViewId();
    private static final int disclaimerId = View.generateViewId();
    private static final int cellId = View.generateViewId();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/cml/delivery/molecules/secureDeal/presentation/SecureDealMoleculeView$Companion;", "", "<init>", "()V", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ SecureDealMoleculeView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onToggleStateChangedListener$lambda$4(SecureDealMoleculeView secureDealMoleculeView, View view, MotionEvent motionEvent) {
        Function1<? super MotionEvent, Boolean> function1 = secureDealMoleculeView.onToggleTouchEvent;
        if (function1 == null) {
            return false;
        }
        Intrinsics.f(motionEvent);
        return function1.invoke(motionEvent).booleanValue();
    }

    private final int resolveMarginValue(Paddings paddings) {
        if (paddings == null) {
            return 0;
        }
        int px = paddings.getPx();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return ResourceExtKt.toPx(px, context);
    }

    public final void bind(@NotNull SecureDealMoleculeDTO dto, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        setContentDescription(CommonControlSettingsExtKt.getAutomatizationId(dto.getCommonControlSettings()));
        bindMargins(dto);
        bindTitle(dto.getTitle());
        bindToggle(dto.getToggle());
        bindIconButton(dto.getTitleIconButton(), actionHandler);
        bindSubtitle(dto.getSubtitle());
        bindBottomBlock(dto, actionHandler);
    }

    public final void bindBottomBlock(@NotNull SecureDealMoleculeDTO dto, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        DisclaimerView disclaimerView = this.disclaimerView;
        Object bottomBlock = dto.getBottomBlock();
        DSDisclaimerHolderKt.bindOrGone(disclaimerView, bottomBlock instanceof DisclaimerDTO ? (DisclaimerDTO) bottomBlock : null, actionHandler);
        CellView cellView = this.cellView;
        Object bottomBlock2 = dto.getBottomBlock();
        CellHolderKt.bindOrGone(cellView, bottomBlock2 instanceof CellDTO ? (CellDTO) bottomBlock2 : null, actionHandler);
    }

    public final void bindIconButton(IconButtonV3DTO dto, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        IconButtonV3HolderKt.bindOrGone(this.iconButtonView, dto, actionHandler);
    }

    public final void bindMargins(@NotNull SecureDealMoleculeDTO dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(resolveMarginValue(dto.getLeftMargin()), resolveMarginValue(dto.getTopMargin()), resolveMarginValue(dto.getRightMargin()), resolveMarginValue(dto.getBottomMargin()));
        setLayoutParams(marginLayoutParams);
    }

    public final void bindSubtitle(List<TextDTO> dtos) {
        AtomsAdapter adapter = this.subtitleLayout.getAdapter();
        if (adapter != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (dtos == null) {
                dtos = K.f71697a;
            }
            adapter.bind(context, dtos);
        }
    }

    public final void bindTitle(@NotNull TextDTO dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        TextHolderKt.bind$default(this.titleTv, dto, null, 2, null);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void bindToggle(@NotNull ToggleDTO dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        this.toggleView.setOnTouchListener(null);
        ToggleHolderKt.bind$default(this.toggleView, dto, null, 2, null);
        this.toggleView.setOnTouchListener(this.onToggleStateChangedListener);
    }

    @NotNull
    public final CellView getCellView() {
        return this.cellView;
    }

    public final void setOnToggleTouchEvent(Function1<? super MotionEvent, Boolean> function1) {
        this.onToggleTouchEvent = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [android.view.ViewOutlineProvider, ru.ozon.app.android.cml.delivery.molecules.secureDeal.presentation.SecureDealMoleculeView$backgroundOutlineProvider$1] */
    public SecureDealMoleculeView(@NotNull final Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        AttributeSet attributeSet2 = null;
        int i12 = 0;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, attributeSet2, i12, 6, null);
        int i13 = titleId;
        ConstraintLayout.b d11 = b.d(textAtomV2View, i13, -2, -2);
        d11.f41636i = 0;
        d11.f41656t = 0;
        int i14 = iconId;
        d11.f41657u = i14;
        Dimens dimens = Dimens.INSTANCE;
        ((ViewGroup.MarginLayoutParams) d11).topMargin = dimens.getDp16();
        d11.setMarginStart(dimens.getDp16());
        d11.f41603J = 2;
        d11.f41598E = 0.0f;
        textAtomV2View.setLayoutParams(d11);
        textAtomV2View.setTextIsSelectable(false);
        this.titleTv = textAtomV2View;
        IconButtonV3View iconButtonV3View = new IconButtonV3View(context, attributeSet2, i12, 0, 14, null);
        ConstraintLayout.b c11 = d.c(iconButtonV3View, i14, -2, -2);
        c11.f41636i = 0;
        c11.f41655s = i13;
        int i15 = toggleId;
        c11.f41657u = i15;
        ((ViewGroup.MarginLayoutParams) c11).topMargin = dimens.getDp16();
        c11.setMarginStart(dimens.getDp4());
        iconButtonV3View.setLayoutParams(c11);
        this.iconButtonView = iconButtonV3View;
        this.onToggleStateChangedListener = new a(this, 0);
        int i16 = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        ToggleView toggleView = new ToggleView(context, attributeSet2, i12, i16, defaultConstructorMarker);
        toggleView.setId(i15);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41636i = 0;
        bVar.f41658v = 0;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = dimens.getDp16();
        bVar.setMarginEnd(dimens.getDp16());
        toggleView.setLayoutParams(bVar);
        this.toggleView = toggleView;
        VerticalAtomsLayout verticalAtomsLayout = new VerticalAtomsLayout(context, attributeSet2, i12, i16, defaultConstructorMarker);
        int i17 = descriptionId;
        verticalAtomsLayout.setId(i17);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, -2);
        bVar2.f41638j = i13;
        bVar2.f41656t = 0;
        bVar2.f41657u = i15;
        int i18 = bottomBarrierId;
        bVar2.f41640k = i18;
        ((ViewGroup.MarginLayoutParams) bVar2).topMargin = dimens.getDp4();
        bVar2.setMarginStart(dimens.getDp16());
        bVar2.f41662z = dimens.getDp16();
        verticalAtomsLayout.setLayoutParams(bVar2);
        verticalAtomsLayout.setAdapter(new AtomsAdapter(null, null, null, null, 15, null));
        this.subtitleLayout = verticalAtomsLayout;
        Barrier barrier = new Barrier(context);
        barrier.setId(i18);
        barrier.setLayoutParams(new ConstraintLayout.b(-2, -2));
        barrier.setReferencedIds(new int[]{disclaimerId, cellId});
        barrier.f(2);
        this.bottomAtomsBarrier = barrier;
        int i19 = 0;
        DisclaimerView disclaimerView = new DisclaimerView(context, null, 0, i19, 14, null);
        disclaimerView.setId(View.generateViewId());
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(0, -2);
        ((ViewGroup.MarginLayoutParams) bVar3).topMargin = dimens.getDp12();
        ((ViewGroup.MarginLayoutParams) bVar3).leftMargin = dimens.getDp16();
        ((ViewGroup.MarginLayoutParams) bVar3).rightMargin = dimens.getDp16();
        ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin = dimens.getDp16();
        bVar3.f41638j = i17;
        bVar3.f41642l = 0;
        bVar3.f41656t = 0;
        bVar3.f41658v = 0;
        disclaimerView.setLayoutParams(bVar3);
        disclaimerView.setVisibility(8);
        this.disclaimerView = disclaimerView;
        CellView cellView = new CellView(context, null, 0, i19, null, 30, null);
        cellView.setId(View.generateViewId());
        ConstraintLayout.b bVar4 = new ConstraintLayout.b(0, -2);
        ((ViewGroup.MarginLayoutParams) bVar4).topMargin = dimens.getDp12();
        ((ViewGroup.MarginLayoutParams) bVar4).leftMargin = dimens.getDp16();
        ((ViewGroup.MarginLayoutParams) bVar4).rightMargin = dimens.getDp16();
        ((ViewGroup.MarginLayoutParams) bVar4).bottomMargin = dimens.getDp16();
        bVar4.f41638j = i17;
        bVar4.f41642l = 0;
        bVar4.f41656t = 0;
        bVar4.f41658v = 0;
        cellView.setLayoutParams(bVar4);
        cellView.setVisibility(8);
        this.cellView = cellView;
        ?? r32 = new ViewOutlineProvider(context) { // from class: ru.ozon.app.android.cml.delivery.molecules.secureDeal.presentation.SecureDealMoleculeView$backgroundOutlineProvider$1
            private final float radius;

            {
                this.radius = ResourceExtKt.toPxF(CornerRadius.RADIUS_600.getPx(), context);
            }

            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                if (view == null || outline == null) {
                    return;
                }
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.radius);
            }
        };
        this.backgroundOutlineProvider = r32;
        setClipToOutline(true);
        setOutlineProvider(r32);
        setBackgroundColor(ResourceExtKt.color(context, R$color.layer_floor_1));
        addView(textAtomV2View);
        addView(iconButtonV3View);
        addView(toggleView);
        addView(verticalAtomsLayout);
        addView(barrier);
        addView(disclaimerView);
        addView(cellView);
    }
}
