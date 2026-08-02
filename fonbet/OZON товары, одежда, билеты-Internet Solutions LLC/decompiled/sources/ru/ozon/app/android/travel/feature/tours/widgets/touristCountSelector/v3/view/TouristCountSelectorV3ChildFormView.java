package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.view;

import Im.a;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.tours.R$id;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.TouristCountSelectorV3ChildFormVO;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.room.adapter.chips.TouristCountSelectorV3ChipsAdapter;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.room.adapter.chips.TouristCountSelectorV3ChipsDecoration;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.room.adapter.chips.TouristCountSelectorV3ChipsScroller;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.controls.chip.ChipDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001dJ\u001a\u0010\u001e\u001a\u00020\u00112\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fJ\u0010\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u0007H\u0002J\b\u0010!\u001a\u00020\u0011H\u0002J\b\u0010\"\u001a\u00020\u0011H\u0002R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/view/TouristCountSelectorV3ChildFormView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "dp2", "dp12", "dp16", "onChildAgeSelected", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;", "", "chipsAdapter", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/adapter/chips/TouristCountSelectorV3ChipsAdapter;", "titleTv", "Landroidx/appcompat/widget/AppCompatTextView;", "subtitleTv", "ageBv", "Lru/ozon/uni/android/atom/badge/BadgeView;", "chipsRv", "Landroidx/recyclerview/widget/RecyclerView;", "bind", "item", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ChildFormVO;", "setupCallbacks", "scrollToSelectedItem", "selectedItemPosition", "addViews", "placeViews", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TouristCountSelectorV3ChildFormView extends ConstraintLayout {

    @NotNull
    private final BadgeView ageBv;

    @NotNull
    private final TouristCountSelectorV3ChipsAdapter chipsAdapter;

    @NotNull
    private final RecyclerView chipsRv;
    private final int dp12;
    private final int dp16;
    private final int dp2;
    private Function1<? super ChipDTO, Unit> onChildAgeSelected;

    @NotNull
    private final AppCompatTextView subtitleTv;

    @NotNull
    private final AppCompatTextView titleTv;

    public /* synthetic */ TouristCountSelectorV3ChildFormView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final void addViews() {
        addView(this.titleTv);
        addView(this.subtitleTv);
        addView(this.ageBv);
        addView(this.chipsRv);
    }

    private final void placeViews() {
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.startToStart(dVar, this.titleTv.getId(), 0, this.dp16);
        ConstraintSetExtKt.topToTop$default(dVar, this.titleTv.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToStart(dVar, this.titleTv.getId(), this.ageBv.getId(), this.dp16);
        dVar.C(this.titleTv.getId(), true);
        dVar.c0(0.0f, this.titleTv.getId());
        ConstraintSetExtKt.startToStart(dVar, this.subtitleTv.getId(), 0, this.dp16);
        ConstraintSetExtKt.topToBottom(dVar, this.subtitleTv.getId(), this.titleTv.getId(), this.dp2);
        ConstraintSetExtKt.endToStart(dVar, this.subtitleTv.getId(), this.ageBv.getId(), this.dp16);
        dVar.C(this.subtitleTv.getId(), true);
        dVar.c0(0.0f, this.subtitleTv.getId());
        ConstraintSetExtKt.topToTop$default(dVar, this.ageBv.getId(), this.titleTv.getId(), 0, 4, null);
        ConstraintSetExtKt.endToEnd(dVar, this.ageBv.getId(), 0, this.dp16);
        ConstraintSetExtKt.bottomToBottom$default(dVar, this.ageBv.getId(), this.subtitleTv.getId(), 0, 4, null);
        ConstraintSetExtKt.startToStart$default(dVar, this.chipsRv.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.topToBottom(dVar, this.chipsRv.getId(), this.subtitleTv.getId(), this.dp16);
        ConstraintSetExtKt.endToEnd$default(dVar, this.chipsRv.getId(), 0, 0, 4, null);
        dVar.f(this);
    }

    private final void scrollToSelectedItem(int selectedItemPosition) {
        RecyclerView.o layoutManager = this.chipsRv.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TouristCountSelectorV3ChipsScroller touristCountSelectorV3ChipsScroller = new TouristCountSelectorV3ChipsScroller(context);
        touristCountSelectorV3ChipsScroller.setTargetPosition(selectedItemPosition);
        layoutManager.startSmoothScroll(touristCountSelectorV3ChipsScroller);
    }

    public final void bind(@NotNull TouristCountSelectorV3ChildFormVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        AppCompatTextView appCompatTextView = this.titleTv;
        appCompatTextView.setText(item.getTitle().getText());
        StyleParser styleParser = StyleParser.INSTANCE;
        Integer parseTextStyle = styleParser.parseTextStyle(item.getTitle().getTypographyToken());
        if (parseTextStyle != null) {
            appCompatTextView.setTextAppearance(parseTextStyle.intValue());
        }
        Context context = appCompatTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        appCompatTextView.setTextColor(styleParser.parseColor(context, item.getTitle().getTextColor(), UniColors.TEXT_PRIMARY.getResId()));
        AppCompatTextView appCompatTextView2 = this.subtitleTv;
        appCompatTextView2.setText(item.getSubtitle().getText());
        Integer parseTextStyle2 = styleParser.parseTextStyle(item.getSubtitle().getTypographyToken());
        if (parseTextStyle2 != null) {
            appCompatTextView2.setTextAppearance(parseTextStyle2.intValue());
        }
        Context context2 = appCompatTextView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        appCompatTextView2.setTextColor(styleParser.parseColor(context2, item.getSubtitle().getTextColor(), UniColors.TEXT_SECONDARY.getResId()));
        BadgeHolderKt.bind$default(this.ageBv, item.getAgeBadge(), (Function1) null, 2, (Object) null);
        this.chipsAdapter.submitList(item.getAgeCategories());
        scrollToSelectedItem(item.getSelectedAgePosition());
    }

    public final void setupCallbacks(@NotNull Function1<? super ChipDTO, Unit> onChildAgeSelected) {
        Intrinsics.checkNotNullParameter(onChildAgeSelected, "onChildAgeSelected");
        this.onChildAgeSelected = onChildAgeSelected;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouristCountSelectorV3ChildFormView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp2 = ResourceExtKt.toPx(2, context);
        int px = ResourceExtKt.toPx(12, context);
        this.dp12 = px;
        this.dp16 = ResourceExtKt.toPx(16, context);
        TouristCountSelectorV3ChipsAdapter touristCountSelectorV3ChipsAdapter = new TouristCountSelectorV3ChipsAdapter(new TouristCountSelectorV3ChildFormView$chipsAdapter$1(this));
        this.chipsAdapter = touristCountSelectorV3ChipsAdapter;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R$id.touristCountSelectorV3FormTitleTv);
        appCompatTextView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.titleTv = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        appCompatTextView2.setId(R$id.touristCountSelectorV3FormSubtitleTv);
        appCompatTextView2.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.subtitleTv = appCompatTextView2;
        BadgeView badgeView = (BadgeView) q.f64554a.g(N.b(BadgeView.class), context);
        a.c(badgeView, R$id.touristCountSelectorV3FormAgeBv, -2, -2);
        this.ageBv = badgeView;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.touristCountSelectorV3ChipsRv);
        recyclerView.setLayoutParams(new ConstraintLayout.b(0, -2));
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.setAdapter(touristCountSelectorV3ChipsAdapter);
        recyclerView.addItemDecoration(new TouristCountSelectorV3ChipsDecoration(context));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setClipToPadding(false);
        recyclerView.setPadding(px, 0, px, 0);
        this.chipsRv = recyclerView;
        addViews();
        placeViews();
        setPadding(0, px, 0, 0);
    }
}
