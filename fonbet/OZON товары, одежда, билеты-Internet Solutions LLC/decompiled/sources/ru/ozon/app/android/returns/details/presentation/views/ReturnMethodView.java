package ru.ozon.app.android.returns.details.presentation.views;

import Cm.e;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.R$drawable;
import ru.ozon.app.android.returns.common.presentation.untils.TextAppearanceHelper;
import ru.ozon.app.android.uikit.view.atoms.select.SelectView;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u00103\u001a\u0002042\u0006\u00105\u001a\u000206J\b\u00107\u001a\u000204H\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020$¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010+\u001a\u00020,¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010/\u001a\u000200¢\u0006\b\n\u0000\u001a\u0004\b1\u00102¨\u00068"}, d2 = {"Lru/ozon/app/android/returns/details/presentation/views/ReturnMethodView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "titleMarginStart", "subtitleMarginTop", "linkBtnMarginStart", "marginVertical", "marginHorizontal", "constraintLayoutContainer", "Landroidx/constraintlayout/widget/ConstraintLayout;", "iconBadge", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getIconBadge", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "titleTextAtom", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "getTitleTextAtom", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "subtitleTextAtom", "getSubtitleTextAtom", "linkBtn", "Lru/ozon/uni/android/uikit/view/atoms/buttons/borderless/SmallBorderlessButtonView;", "getLinkBtn", "()Lru/ozon/uni/android/uikit/view/atoms/buttons/borderless/SmallBorderlessButtonView;", "infoVerticalAtomsLayout", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "getInfoVerticalAtomsLayout", "()Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "disclaimerSingleAtom", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "getDisclaimerSingleAtom", "()Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "dateSlotListRv", "Landroidx/recyclerview/widget/RecyclerView;", "getDateSlotListRv", "()Landroidx/recyclerview/widget/RecyclerView;", "timeSlotSv", "Lru/ozon/app/android/uikit/view/atoms/select/SelectView;", "getTimeSlotSv", "()Lru/ozon/app/android/uikit/view/atoms/select/SelectView;", "timeSlotConfirmBtn", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/SmallButtonView;", "getTimeSlotConfirmBtn", "()Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/SmallButtonView;", "changeVisibility", "", "isVisible", "", "setupConstraints", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnMethodView extends LinearLayout {

    @NotNull
    private final ConstraintLayout constraintLayoutContainer;

    @NotNull
    private final RecyclerView dateSlotListRv;

    @NotNull
    private final SingleAtom disclaimerSingleAtom;

    @NotNull
    private final BadgeView iconBadge;

    @NotNull
    private final VerticalAtomsLayout infoVerticalAtomsLayout;

    @NotNull
    private final SmallBorderlessButtonView linkBtn;
    private final int linkBtnMarginStart;
    private final int marginHorizontal;
    private final int marginVertical;
    private final int subtitleMarginTop;

    @NotNull
    private final TextAtomView subtitleTextAtom;

    @NotNull
    private final SmallButtonView timeSlotConfirmBtn;

    @NotNull
    private final SelectView timeSlotSv;
    private final int titleMarginStart;

    @NotNull
    private final TextAtomView titleTextAtom;

    public /* synthetic */ ReturnMethodView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void setupConstraints() {
        ConstraintLayout constraintLayout = this.constraintLayoutContainer;
        d b11 = e.b(constraintLayout);
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(b11, this.iconBadge);
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(b11, this.iconBadge);
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(b11, this.titleTextAtom);
        ConstraintSetExtKt.layoutConstraintStartToEndOf(b11, this.titleTextAtom, this.iconBadge);
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(b11, this.titleTextAtom);
        ConstraintSetExtKt.layoutConstraintEndToEndOf(b11, this.subtitleTextAtom, this.titleTextAtom);
        ConstraintSetExtKt.layoutConstraintStartToStartOf(b11, this.subtitleTextAtom, this.titleTextAtom);
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(b11, this.subtitleTextAtom, this.titleTextAtom);
        ConstraintSetExtKt.layoutConstraintStartToEndOf(b11, this.linkBtn, this.iconBadge);
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(b11, this.linkBtn, this.subtitleTextAtom);
        ConstraintSetExtKt.layoutConstraintEndToEndOf(b11, this.infoVerticalAtomsLayout, this.titleTextAtom);
        ConstraintSetExtKt.layoutConstraintStartToStartOf(b11, this.infoVerticalAtomsLayout, this.titleTextAtom);
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(b11, this.infoVerticalAtomsLayout, this.linkBtn);
        b11.f(constraintLayout);
    }

    public final void changeVisibility(boolean isVisible) {
        this.dateSlotListRv.setVisibility(isVisible ? 0 : 8);
        this.timeSlotSv.setVisibility(isVisible ? 0 : 8);
        this.timeSlotConfirmBtn.setVisibility(isVisible ? 0 : 8);
    }

    @NotNull
    public final RecyclerView getDateSlotListRv() {
        return this.dateSlotListRv;
    }

    @NotNull
    public final SingleAtom getDisclaimerSingleAtom() {
        return this.disclaimerSingleAtom;
    }

    @NotNull
    public final BadgeView getIconBadge() {
        return this.iconBadge;
    }

    @NotNull
    public final VerticalAtomsLayout getInfoVerticalAtomsLayout() {
        return this.infoVerticalAtomsLayout;
    }

    @NotNull
    public final SmallBorderlessButtonView getLinkBtn() {
        return this.linkBtn;
    }

    @NotNull
    public final TextAtomView getSubtitleTextAtom() {
        return this.subtitleTextAtom;
    }

    @NotNull
    public final SmallButtonView getTimeSlotConfirmBtn() {
        return this.timeSlotConfirmBtn;
    }

    @NotNull
    public final SelectView getTimeSlotSv() {
        return this.timeSlotSv;
    }

    @NotNull
    public final TextAtomView getTitleTextAtom() {
        return this.titleTextAtom;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnMethodView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = UiExtKt.toPx(8, context);
        this.titleMarginStart = px;
        int px2 = UiExtKt.toPx(4, context);
        this.subtitleMarginTop = px2;
        int px3 = UiExtKt.toPx(8, context);
        this.linkBtnMarginStart = px3;
        int px4 = UiExtKt.toPx(12, context);
        this.marginVertical = px4;
        int px5 = UiExtKt.toPx(16, context);
        this.marginHorizontal = px5;
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        this.constraintLayoutContainer = constraintLayout;
        BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
        badgeView.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41600G = "1:1";
        int i12 = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
        int marginEnd = bVar.getMarginEnd();
        int i13 = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        bVar.setMarginStart(px5);
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = i12;
        bVar.setMarginEnd(marginEnd);
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = i13;
        badgeView.setLayoutParams(bVar);
        constraintLayout.addView(badgeView);
        this.iconBadge = badgeView;
        TextAtomView textAtomView = new TextAtomView(context, null, 0, 6, null);
        textAtomView.setId(View.generateViewId());
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(-2, -2);
        bVar2.setMarginStart(px);
        bVar2.setMarginEnd(px5);
        bVar2.f41598E = 0.0f;
        bVar2.f41616W = true;
        textAtomView.setLayoutParams(bVar2);
        TextAppearanceHelper textAppearanceHelper = TextAppearanceHelper.INSTANCE;
        textAppearanceHelper.setStyle(textAtomView, R$style.TextStyle_Body_L_Bold);
        textAtomView.setTextColor(ThemeExtKt.themeColor(context, R$attr.textPrimary));
        constraintLayout.addView(textAtomView);
        this.titleTextAtom = textAtomView;
        TextAtomView textAtomView2 = new TextAtomView(context, null, 0, 6, null);
        textAtomView2.setId(View.generateViewId());
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(-2, -2);
        bVar3.setMargins(((ViewGroup.MarginLayoutParams) bVar3).leftMargin, px2, ((ViewGroup.MarginLayoutParams) bVar3).rightMargin, ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin);
        bVar3.f41598E = 0.0f;
        bVar3.f41616W = true;
        textAtomView2.setLayoutParams(bVar3);
        textAppearanceHelper.setStyle(textAtomView2, R$style.TextStyle_Body_L);
        textAtomView2.setTextColor(ThemeExtKt.themeColor(context, R$attr.textSecondary));
        constraintLayout.addView(textAtomView2);
        this.subtitleTextAtom = textAtomView2;
        SmallBorderlessButtonView smallBorderlessButtonView = new SmallBorderlessButtonView(context, null, 0, 6, null);
        smallBorderlessButtonView.setId(View.generateViewId());
        ConstraintLayout.b bVar4 = new ConstraintLayout.b(-2, -2);
        bVar4.setMarginStart(px3);
        bVar4.setMarginEnd(px5);
        smallBorderlessButtonView.setLayoutParams(bVar4);
        constraintLayout.addView(smallBorderlessButtonView);
        this.linkBtn = smallBorderlessButtonView;
        VerticalAtomsLayout verticalAtomsLayout = new VerticalAtomsLayout(context, null, 0, 6, null);
        verticalAtomsLayout.setId(View.generateViewId());
        ConstraintLayout.b bVar5 = new ConstraintLayout.b(0, -2);
        bVar5.setMargins(((ViewGroup.MarginLayoutParams) bVar5).leftMargin, px4, ((ViewGroup.MarginLayoutParams) bVar5).rightMargin, ((ViewGroup.MarginLayoutParams) bVar5).bottomMargin);
        verticalAtomsLayout.setLayoutParams(bVar5);
        constraintLayout.addView(verticalAtomsLayout);
        this.infoVerticalAtomsLayout = verticalAtomsLayout;
        SingleAtom singleAtom = new SingleAtom(context, null, 0, 0, 14, null);
        singleAtom.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(px5, px4, px5, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        singleAtom.setLayoutParams(layoutParams);
        this.disclaimerSingleAtom = singleAtom;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, px4, 0, 0);
        recyclerView.setLayoutParams(layoutParams2);
        recyclerView.setPadding(px5, 0, px5, 0);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setClipChildren(false);
        recyclerView.setClipToPadding(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        this.dateSlotListRv = recyclerView;
        SelectView selectView = new SelectView(context, null, 0, 6, null);
        selectView.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(px5, px4, px5, 0);
        selectView.setLayoutParams(layoutParams3);
        selectView.setBackgroundResource(R$drawable.bg_time_slot_select);
        this.timeSlotSv = selectView;
        SmallButtonView smallButtonView = new SmallButtonView(context, null, 0, 6, null);
        smallButtonView.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.setMargins(px5, px4, 0, 0);
        smallButtonView.setLayoutParams(layoutParams4);
        this.timeSlotConfirmBtn = smallButtonView;
        setId(View.generateViewId());
        setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        setOrientation(1);
        addView(constraintLayout);
        setupConstraints();
        addView(singleAtom);
        addView(recyclerView);
        addView(selectView);
        addView(smallButtonView);
    }
}
