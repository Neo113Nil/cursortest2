package ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.descriptionTitle;

import D40.a;
import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.expandable.ExpandableTextAtomView;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.expandable.ExpandableTextHolderKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f0\u0013J\b\u0010\u0015\u001a\u00020\u000fH\u0002R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/descriptionTitle/SelectionItemDescriptionTitleView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "titleView", "Lru/ozon/uni/android/atom/text/expandable/ExpandableTextAtomView;", "getTitleView", "()Lru/ozon/uni/android/atom/text/expandable/ExpandableTextAtomView;", "guideline", "Landroidx/constraintlayout/widget/Guideline;", "statusView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "bind", "", "item", "Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/descriptionTitle/DescriptionTitleVO;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "centerStatusView", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectionItemDescriptionTitleView extends ConstraintLayout {

    @NotNull
    private final Guideline guideline;

    @NotNull
    private final BadgeView statusView;

    @NotNull
    private final ExpandableTextAtomView titleView;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.descriptionTitle.SelectionItemDescriptionTitleView$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<d, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
            invoke2(dVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(d updateConstraints) {
            Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
            ConstraintSetExtKt.startToStart$default(updateConstraints, SelectionItemDescriptionTitleView.this.getTitleView().getId(), 0, 0, 4, null);
            ConstraintSetExtKt.topToTop$default(updateConstraints, SelectionItemDescriptionTitleView.this.getTitleView().getId(), 0, 0, 4, null);
            ConstraintSetExtKt.bottomToBottom$default(updateConstraints, SelectionItemDescriptionTitleView.this.getTitleView().getId(), 0, 0, 4, null);
            ConstraintSetExtKt.endToStart$default(updateConstraints, SelectionItemDescriptionTitleView.this.getTitleView().getId(), SelectionItemDescriptionTitleView.this.statusView.getId(), 0, 4, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionItemDescriptionTitleView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        ExpandableTextAtomView expandableTextAtomView = new ExpandableTextAtomView(context, null, 0, 0, 14, null);
        expandableTextAtomView.setId(R$id.selectionItemDescriptionTitleEt);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41605L = 0;
        expandableTextAtomView.setLayoutParams(bVar);
        addView(expandableTextAtomView);
        this.titleView = expandableTextAtomView;
        Guideline guideline = new Guideline(context);
        ConstraintLayout.b a11 = a.a(guideline, R$id.selectionItemDescriptionGuideline, -1, -2);
        a11.f41615V = 0;
        guideline.setLayoutParams(a11);
        guideline.a(0);
        addView(guideline);
        this.guideline = guideline;
        BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
        ConstraintLayout.b a12 = com.google.android.gms.internal.mlkit_common.a.a(badgeView, R$id.selectionItemDescriptionBadge, 0, -2);
        a12.f41636i = guideline.getId();
        a12.f41642l = guideline.getId();
        a12.f41658v = 0;
        a12.f41599F = 0.5f;
        a12.setMarginEnd(Dimens.INSTANCE.getDP_16());
        badgeView.setLayoutParams(a12);
        addView(badgeView);
        this.statusView = badgeView;
        ConstraintLayoutExtKt.updateConstraints(this, new AnonymousClass1());
    }

    private final void centerStatusView() {
        int lineHeight = (this.titleView.getLineHeight() / 2) + this.titleView.getPaddingTop();
        ViewGroup.LayoutParams layoutParams = this.guideline.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f41620a = lineHeight;
        this.guideline.setLayoutParams(bVar);
    }

    public final void bind(@NotNull DescriptionTitleVO item, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        ExpandableTextHolderKt.bind$default(this.titleView, item.getText(), null, 2, null);
        BadgeHolderKt.bindOrGone(this.statusView, item.getStatus(), onAction);
        if (item.getStatus() != null) {
            centerStatusView();
        }
    }

    @NotNull
    public final ExpandableTextAtomView getTitleView() {
        return this.titleView;
    }
}
