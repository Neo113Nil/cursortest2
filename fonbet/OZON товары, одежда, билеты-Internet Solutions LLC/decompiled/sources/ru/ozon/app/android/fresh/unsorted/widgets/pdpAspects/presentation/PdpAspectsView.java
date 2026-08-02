package ru.ozon.app.android.fresh.unsorted.widgets.pdpAspects.presentation;

import Bi.b;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_common.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.R$id;
import ru.ozon.app.android.fresh.unsorted.widgets.pdpAspects.domain.PdpAspectsVO;
import ru.ozon.app.android.fresh.unsorted.widgets.pdpAspects.presentation.recyclerview.AspectItemDecorator;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 -2\u00020\u0001:\u0001-B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0017\u0010)\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/presentation/PdpAspectsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/domain/PdpAspectsVO$SpacersVO;", "spacers", "", "setupSpacers", "(Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/domain/PdpAspectsVO$SpacersVO;)V", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/domain/PdpAspectsVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/domain/PdpAspectsVO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/presentation/recyclerview/AspectItemDecorator;", "itemsDecorator$delegate", "LSc/j;", "getItemsDecorator", "()Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/presentation/recyclerview/AspectItemDecorator;", "itemsDecorator", "Landroidx/recyclerview/widget/LinearLayoutManager;", "horizontalLayoutManager$delegate", "getHorizontalLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "horizontalLayoutManager", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "dotView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "badgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "Landroidx/recyclerview/widget/RecyclerView;", "aspectsListView", "Landroidx/recyclerview/widget/RecyclerView;", "getAspectsListView", "()Landroidx/recyclerview/widget/RecyclerView;", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PdpAspectsView extends ConstraintLayout {

    @NotNull
    private final RecyclerView aspectsListView;

    @NotNull
    private final BadgeView badgeView;

    @NotNull
    private final TextAtomV2View dotView;

    /* renamed from: horizontalLayoutManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j horizontalLayoutManager;

    /* renamed from: itemsDecorator$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j itemsDecorator;

    @NotNull
    private final TextAtomV2View titleView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final OzonSpannableString DOT_SEPARATOR = OzonSpannableStringKt.toOzonSpannableString("•");
    private static final int RIGHT_TEXT_MARGIN = UiExtKt.toPx(6);
    private static final int DEFAULT_BG_COLOR = UniColors.LAYER_FLOOR_1.getResId();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.fresh.unsorted.widgets.pdpAspects.presentation.PdpAspectsView$1, reason: invalid class name */
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
            updateConstraints.E(new int[]{PdpAspectsView.this.titleView.getId(), PdpAspectsView.this.dotView.getId(), PdpAspectsView.this.badgeView.getId()}, null, 2);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/presentation/PdpAspectsView$Companion;", "", "<init>", "()V", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ PdpAspectsView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final LinearLayoutManager getHorizontalLayoutManager() {
        return (LinearLayoutManager) this.horizontalLayoutManager.getValue();
    }

    private final AspectItemDecorator getItemsDecorator() {
        return (AspectItemDecorator) this.itemsDecorator.getValue();
    }

    private final void setupSpacers(PdpAspectsVO.SpacersVO spacers) {
        TextAtomV2View textAtomV2View = this.titleView;
        ViewGroup.LayoutParams layoutParams = textAtomV2View.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = spacers.getHorizontalTitle();
        marginLayoutParams.topMargin = spacers.getVerticalTitle();
        textAtomV2View.setLayoutParams(marginLayoutParams);
        BadgeView badgeView = this.badgeView;
        ViewGroup.LayoutParams layoutParams2 = badgeView.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.leftMargin = spacers.getHorizontalDot();
        marginLayoutParams2.rightMargin = spacers.getHorizontalTitle();
        badgeView.setLayoutParams(marginLayoutParams2);
        TextAtomV2View textAtomV2View2 = this.dotView;
        ViewGroup.LayoutParams layoutParams3 = textAtomV2View2.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
        marginLayoutParams3.leftMargin = spacers.getHorizontalDot() + RIGHT_TEXT_MARGIN;
        textAtomV2View2.setLayoutParams(marginLayoutParams3);
        RecyclerView recyclerView = this.aspectsListView;
        ViewGroup.LayoutParams layoutParams4 = recyclerView.getLayoutParams();
        if (layoutParams4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
        marginLayoutParams4.topMargin = spacers.getVerticalTitle();
        recyclerView.setLayoutParams(marginLayoutParams4);
        this.aspectsListView.setPadding(0, spacers.getTopAspects(), 0, spacers.getBottomAspects());
    }

    public final void bind(@NotNull PdpAspectsVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        TextHolderKt.bind$default(this.titleView, item.getTitle(), null, 2, null);
        BadgeHolderKt.bindOrGone(this.badgeView, item.getBadge(), actionHandler);
        if (item.getBadge() == null) {
            ViewExtKt.gone(this.dotView);
        } else {
            TextHolderKt.bind$default(this.dotView, TextDTO.copy$default(item.getTitle(), DOT_SEPARATOR, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null), null, 2, null);
        }
        getItemsDecorator().changeOffsets(item.getSpacers().getLeftAspects(), item.getSpacers().getBetweenAspects());
        setupSpacers(item.getSpacers());
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackgroundColor(styleParser.parseColor(context, item.getBackgroundColor(), DEFAULT_BG_COLOR));
    }

    @NotNull
    public final RecyclerView getAspectsListView() {
        return this.aspectsListView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdpAspectsView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.itemsDecorator = k.b(PdpAspectsView$itemsDecorator$2.INSTANCE);
        this.horizontalLayoutManager = k.b(new PdpAspectsView$horizontalLayoutManager$2(context));
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.pdpAspectsTitleView, -2, -2);
        d11.f41636i = 0;
        d11.f41598E = 0.0f;
        textAtomV2View.setLayoutParams(d11);
        textAtomV2View.setTextIsSelectable(false);
        addView(textAtomV2View);
        this.titleView = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d12 = b.d(textAtomV2View2, R$id.pdpAspectsDotView, -2, -2);
        int i12 = R$id.pdpAspectsTitleView;
        d12.f41636i = i12;
        d12.f41642l = i12;
        textAtomV2View2.setLayoutParams(d12);
        textAtomV2View2.setTextIsSelectable(false);
        addView(textAtomV2View2);
        this.dotView = textAtomV2View2;
        BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
        ConstraintLayout.b a11 = a.a(badgeView, R$id.pdpAspectsBadgeView, -2, -2);
        int i13 = R$id.pdpAspectsDotView;
        a11.f41636i = i13;
        a11.f41642l = i13;
        badgeView.setLayoutParams(a11);
        addView(badgeView);
        this.badgeView = badgeView;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.pdpAspectsRecyclerView);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41638j = R$id.pdpAspectsTitleView;
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        recyclerView.setLayoutParams(bVar);
        recyclerView.setLayoutManager(getHorizontalLayoutManager());
        recyclerView.setOverScrollMode(2);
        recyclerView.setNestedScrollingEnabled(false);
        addView(recyclerView);
        this.aspectsListView = recyclerView;
        setLayoutParams(new ConstraintLayout.b(-1, -2));
        ConstraintLayoutExtKt.updateConstraints(this, new AnonymousClass1());
        recyclerView.addItemDecoration(getItemsDecorator());
    }
}
