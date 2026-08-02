package ru.ozon.app.android.fresh.main.widgets.catalogShelf.presentation.row.optimized;

import BP.a;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.core.view.Y;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.R$drawable;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.app.android.fresh.main.widgets.catalogShelf.presentation.row.CatalogShelfItemVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.image.ImageAspectRatio;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.holders.badge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 )2\u00020\u0001:\u0001)B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0013\u0010\u0011\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u0013\u0010\u0012\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ+\u0010\u0018\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f0\u0015¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogShelf/presentation/row/optimized/CatalogShelfItemViewNew;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroidx/constraintlayout/widget/d;", "", "setConstraintsProductIv", "(Landroidx/constraintlayout/widget/d;)V", "setConstraintsBackgroundIv", "setConstraintsProductTitleTv", "setConstraintsSoldBadge", "setConstraintsAdvBadge", "Lru/ozon/app/android/fresh/main/widgets/catalogShelf/presentation/row/CatalogShelfItemVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bindOrGone", "(Lru/ozon/app/android/fresh/main/widgets/catalogShelf/presentation/row/CatalogShelfItemVO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/android/atom/image/Image;", "productIv", "Lru/ozon/uni/android/atom/image/Image;", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "productTitleTv", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "Landroid/view/View;", "backgroundV", "Landroid/view/View;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "advBadge", "Lru/ozon/uni/android/atom/badge/BadgeView;", "Lru/ozon/uni/android/uikit/view/atoms/badge/BadgeView;", "soldBadge", "Lru/ozon/uni/android/uikit/view/atoms/badge/BadgeView;", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogShelfItemViewNew extends ConstraintLayout {

    @NotNull
    private final BadgeView advBadge;

    @NotNull
    private final View backgroundV;

    @NotNull
    private final Image productIv;

    @NotNull
    private final TextAtomView productTitleTv;

    @NotNull
    private final ru.ozon.uni.android.uikit.view.atoms.badge.BadgeView soldBadge;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int MARGIN_4 = UiExtKt.toPx(4);
    private static final int MARGIN_12 = UiExtKt.toPx(12);
    private static final int MARGIN_16 = UiExtKt.toPx(16);
    private static final int TITLE_HEIGHT = UiExtKt.toPx(32);
    private static final int SMALL_SCREEN_IMAGE = UiExtKt.toPx(82);
    private static final int MEDIUM_SCREEN_IMAGE = UiExtKt.toPx(96);
    private static final int LARGE_SCREEN_IMAGE = UiExtKt.toPx(101);
    private static final int DEFAULT_SCREEN_IMAGE = UiExtKt.toPx(114);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.fresh.main.widgets.catalogShelf.presentation.row.optimized.CatalogShelfItemViewNew$1, reason: invalid class name */
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
            CatalogShelfItemViewNew.this.setConstraintsProductIv(updateConstraints);
            CatalogShelfItemViewNew.this.setConstraintsBackgroundIv(updateConstraints);
            CatalogShelfItemViewNew.this.setConstraintsProductTitleTv(updateConstraints);
            CatalogShelfItemViewNew.this.setConstraintsSoldBadge(updateConstraints);
            CatalogShelfItemViewNew.this.setConstraintsAdvBadge(updateConstraints);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogShelf/presentation/row/optimized/CatalogShelfItemViewNew$Companion;", "", "<init>", "()V", "", "IMAGE_ALPHA_HALF", "F", "IMAGE_ALPHA_FULL", "ELEVATION_1F", "ELEVATION_2F", "ROTATION", "", "MAX_LINES", "I", "ADV_ROTATION", "CONSTRAINT_LAYOUT_WIDTH", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ CatalogShelfItemViewNew(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindOrGone$lambda$10(CatalogShelfItemVO catalogShelfItemVO, Function1 function1, View view) {
        AtomAction action = catalogShelfItemVO.getAction();
        if (action != null) {
            function1.invoke(action);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setConstraintsAdvBadge(d dVar) {
        ConstraintSetExtKt.topToTop(dVar, this.advBadge.getId(), this.backgroundV.getId(), MARGIN_16);
        ConstraintSetExtKt.startToStart(dVar, this.advBadge.getId(), this.backgroundV.getId(), MARGIN_4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setConstraintsBackgroundIv(d dVar) {
        ConstraintSetExtKt.topToTop(dVar, this.backgroundV.getId(), this.productIv.getId(), MARGIN_12);
        ConstraintSetExtKt.startToStart$default(dVar, this.backgroundV.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(dVar, this.backgroundV.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.bottomToBottom$default(dVar, this.backgroundV.getId(), 0, 0, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setConstraintsProductIv(d dVar) {
        ConstraintSetExtKt.topToTop$default(dVar, this.productIv.getId(), 0, 0, 4, null);
        int id2 = this.productIv.getId();
        int i11 = MARGIN_4;
        ConstraintSetExtKt.startToStart(dVar, id2, 0, i11);
        ConstraintSetExtKt.endToEnd(dVar, this.productIv.getId(), 0, i11);
        ConstraintSetExtKt.bottomToTop$default(dVar, this.productIv.getId(), this.productTitleTv.getId(), 0, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setConstraintsProductTitleTv(d dVar) {
        int id2 = this.productTitleTv.getId();
        int id3 = this.productIv.getId();
        int i11 = MARGIN_4;
        ConstraintSetExtKt.topToBottom(dVar, id2, id3, i11);
        ConstraintSetExtKt.startToStart(dVar, this.productTitleTv.getId(), this.backgroundV.getId(), i11);
        ConstraintSetExtKt.endToEnd(dVar, this.productTitleTv.getId(), this.backgroundV.getId(), i11);
        ConstraintSetExtKt.bottomToBottom(dVar, this.productTitleTv.getId(), 0, MARGIN_12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setConstraintsSoldBadge(d dVar) {
        ConstraintSetExtKt.topToTop$default(dVar, this.soldBadge.getId(), this.productIv.getId(), 0, 4, null);
        ConstraintSetExtKt.startToStart$default(dVar, this.soldBadge.getId(), this.productIv.getId(), 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(dVar, this.soldBadge.getId(), this.productIv.getId(), 0, 4, null);
        ConstraintSetExtKt.bottomToBottom$default(dVar, this.soldBadge.getId(), this.productIv.getId(), 0, 4, null);
    }

    public final void bindOrGone(CatalogShelfItemVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        if (item == null) {
            ViewExtKt.removeSelf(this);
            return;
        }
        setVisibility(0);
        ImageViewExtKt.load$default(this.productIv, item.getImage(), null, null, null, null, false, null, 126, null);
        TextAtomHolderKt.bind$default(this.productTitleTv, TextAtom.copy$default(item.getTitle(), null, null, null, 2, null, null, null, 119, null), null, 2, null);
        BadgeHolderKt.bindOrGone$default(this.soldBadge, item.getSoldOut(), null, 2, null);
        ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt.bindOrGone(this.advBadge, item.getAdvBadgeV2(), actionHandler);
        if (item.getSoldOut() != null) {
            this.productIv.setAlpha(0.5f);
            setEnabled(false);
            this.soldBadge.setEnabled(false);
        } else {
            this.productIv.setAlpha(1.0f);
            setEnabled(true);
        }
        setOnClickListener(new a(item, actionHandler));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatalogShelfItemViewNew(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        Image image = new Image(context, null, 0, 6, null);
        image.setId(R$id.productIv);
        image.setElevation(1.0f);
        image.setRatio(ImageAspectRatio.RATIO_1_1);
        image.setLayoutParams(new ConstraintLayout.b(0, -1));
        this.productIv = image;
        TextAtomView textAtomView = new TextAtomView(context, null, 0, 6, null);
        textAtomView.setId(R$id.productTitleTv);
        textAtomView.setTextIsSelectable(false);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, TITLE_HEIGHT);
        textAtomView.setMaxLines(2);
        textAtomView.setEllipsize(TextUtils.TruncateAt.END);
        textAtomView.setGravity(81);
        textAtomView.setLayoutParams(bVar);
        this.productTitleTv = textAtomView;
        View view = new View(context);
        view.setId(R$id.backgroundV);
        view.setBackgroundResource(R$drawable.catalog_shelf_product_background);
        view.setLayoutParams(new ConstraintLayout.b(0, 0));
        this.backgroundV = view;
        q qVar = q.f64554a;
        final BadgeView badgeView = (BadgeView) qVar.i(N.b(BadgeView.class), context);
        badgeView = badgeView == null ? new BadgeView(context, null, 0, 0, 14, null) : badgeView;
        badgeView.setId(R$id.advBadgeV2);
        badgeView.setVisibility(8);
        badgeView.setElevation(2.0f);
        int i13 = Y.f42258g;
        if (!badgeView.isLaidOut() || badgeView.isLayoutRequested()) {
            badgeView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.fresh.main.widgets.catalogShelf.presentation.row.optimized.CatalogShelfItemViewNew$advBadge$lambda$5$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    Intrinsics.checkNotNullParameter(view2, "view");
                    view2.removeOnLayoutChangeListener(this);
                    BadgeView.this.setRotation(-90.0f);
                    BadgeView.this.setPivotX(0.0f);
                    BadgeView badgeView2 = BadgeView.this;
                    badgeView2.setTranslationY(badgeView2.getTranslationY() + BadgeView.this.getWidth());
                }
            });
        } else {
            badgeView.setRotation(-90.0f);
            badgeView.setPivotX(0.0f);
            badgeView.setTranslationY(badgeView.getTranslationY() + badgeView.getWidth());
        }
        this.advBadge = badgeView;
        ru.ozon.uni.android.uikit.view.atoms.badge.BadgeView badgeView2 = (ru.ozon.uni.android.uikit.view.atoms.badge.BadgeView) qVar.i(N.b(ru.ozon.uni.android.uikit.view.atoms.badge.BadgeView.class), context);
        badgeView2 = badgeView2 == null ? new ru.ozon.uni.android.uikit.view.atoms.badge.BadgeView(context, null, 0, 6, null) : badgeView2;
        badgeView2.setId(R$id.soldBadge);
        badgeView2.setVisibility(8);
        badgeView2.setRotation(340.0f);
        badgeView2.setElevation(2.0f);
        this.soldBadge = badgeView2;
        int i14 = context.getResources().getDisplayMetrics().widthPixels;
        if (i14 >= 0 && i14 < 360) {
            image.setMaxWidth(SMALL_SCREEN_IMAGE);
        } else if (360 <= i14 && i14 < 376) {
            image.setMaxWidth(MEDIUM_SCREEN_IMAGE);
        } else if (376 > i14 || i14 >= 415) {
            image.setMaxWidth(DEFAULT_SCREEN_IMAGE);
        } else {
            image.setMaxWidth(LARGE_SCREEN_IMAGE);
        }
        addView(view);
        addView(image);
        addView(badgeView2);
        addView(textAtomView);
        addView(badgeView);
        setPadding(0, 0, 0, MARGIN_4);
        ConstraintLayoutExtKt.updateConstraints(this, new AnonymousClass1());
    }
}
