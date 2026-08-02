package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views;

import Sc.InterfaceC4008j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.constraintlayout.widget.d;
import androidx.core.view.Y;
import com.google.android.gms.internal.mlkit_common.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.TileGrid2Constants;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.TileGrid2BannerVO;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.universalwidgets.R$id;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.utils.helper.TileGrid2BannerTouchHelper;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000§\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u00017\b\u0001\u0018\u0000 S2\u00020\u0001:\u0001SB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ#\u0010\u000e\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010$\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R*\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R0\u00101\u001a\u0010\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0006\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020;0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001b\u0010C\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020D0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010=R\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010KR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u000b\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010QR\u0018\u0010R\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010Q¨\u0006T"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/TileGrid2BannerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "bindContent", "()V", "bindBadges", "Landroid/view/View;", "badge", "", "automatizationId", "setBadgeContentDescIfNeed", "(Landroid/view/View;Ljava/lang/String;)V", "bindImage", "bindRatio", "bindTile", "", "bottomPadding", "bindBottomPadding", "(I)V", "Landroid/view/MotionEvent;", "ev", "", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/view/accessibility/AccessibilityNodeInfo;", "info", "onInitializeAccessibilityNodeInfo", "(Landroid/view/accessibility/AccessibilityNodeInfo;)V", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2BannerVO;", "item", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "bind", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2BannerVO;Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;)V", "boundItem", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2BannerVO;", "Lkotlin/Function0;", "onImageLoaded", "Lkotlin/jvm/functions/Function0;", "getOnImageLoaded", "()Lkotlin/jvm/functions/Function0;", "setOnImageLoaded", "(Lkotlin/jvm/functions/Function0;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "Lkotlin/jvm/functions/Function1;", "getOnAction", "()Lkotlin/jvm/functions/Function1;", "setOnAction", "(Lkotlin/jvm/functions/Function1;)V", "ru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/TileGrid2BannerView$imagePikazonCallback$1", "imagePikazonCallback", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/TileGrid2BannerView$imagePikazonCallback$1;", "", "Lru/ozon/app/android/composer/view/multiframebinder/BindStep;", "bindSteps", "Ljava/util/List;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/utils/helper/TileGrid2BannerTouchHelper;", "touchHelper$delegate", "LSc/j;", "getTouchHelper", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/utils/helper/TileGrid2BannerTouchHelper;", "touchHelper", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$RoundedCorners;", "imageTransformations", "Landroidx/appcompat/widget/AppCompatImageView;", "imageView", "Landroidx/appcompat/widget/AppCompatImageView;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "text", "Landroidx/constraintlayout/widget/Guideline;", "badgesGuideline", "Landroidx/constraintlayout/widget/Guideline;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "extraBadge", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class TileGrid2BannerView extends ConstraintLayout {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final BadgeView badge;

    @NotNull
    private final Guideline badgesGuideline;

    @NotNull
    private final List<BindStep> bindSteps;
    private TileGrid2BannerVO boundItem;
    private BadgeView extraBadge;

    @NotNull
    private final TileGrid2BannerView$imagePikazonCallback$1 imagePikazonCallback;

    @NotNull
    private final List<ImageTransformation.RoundedCorners> imageTransformations;

    @NotNull
    private final AppCompatImageView imageView;
    private Function1<? super AtomAction, Unit> onAction;
    private Function0<Unit> onImageLoaded;

    @NotNull
    private final TextAtomV2View text;

    @NotNull
    private final TextAtomV2View title;

    /* renamed from: touchHelper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j touchHelper;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/TileGrid2BannerView$Companion;", "", "<init>", "()V", "create", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/TileGrid2BannerView;", "context", "Landroid/content/Context;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TileGrid2BannerView create(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new TileGrid2BannerView(context, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ TileGrid2BannerView(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$15(TileGrid2BannerView tileGrid2BannerView, View view) {
        AtomAction atomAction;
        Function1<? super AtomAction, Unit> function1;
        TileGrid2BannerVO tileGrid2BannerVO = tileGrid2BannerView.boundItem;
        if (tileGrid2BannerVO == null || (atomAction = tileGrid2BannerVO.getAtomAction()) == null || (function1 = tileGrid2BannerView.onAction) == null) {
            return;
        }
        function1.invoke(atomAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindBadges() {
        TestInfo testInfo;
        TestInfo testInfo2;
        TileGrid2BannerVO tileGrid2BannerVO = this.boundItem;
        if (tileGrid2BannerVO == null) {
            return;
        }
        if (tileGrid2BannerVO.getExtraBadgeDTO() != null && this.extraBadge == null) {
            bindBadges$initAndConfigureExtraBadge(this);
        }
        BadgeHolderKt.bindOrGone(this.badge, tileGrid2BannerVO.getBadgeDTO(), this.onAction);
        BadgeView badgeView = this.badge;
        BadgeDTO badgeDTO = tileGrid2BannerVO.getBadgeDTO();
        String str = null;
        setBadgeContentDescIfNeed(badgeView, (badgeDTO == null || (testInfo2 = badgeDTO.getTestInfo()) == null) ? null : testInfo2.getAutomatizationId());
        BadgeView badgeView2 = this.extraBadge;
        if (badgeView2 != null) {
            BadgeHolderKt.bindOrGone(badgeView2, tileGrid2BannerVO.getExtraBadgeDTO(), this.onAction);
        }
        BadgeView badgeView3 = this.extraBadge;
        if (badgeView3 != null) {
            int i11 = Y.f42258g;
            if (!badgeView3.isLaidOut() || badgeView3.isLayoutRequested()) {
                badgeView3.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.TileGrid2BannerView$bindBadges$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        Intrinsics.checkNotNullParameter(view, "view");
                        view.removeOnLayoutChangeListener(this);
                        view.setVisibility(view.getMeasuredWidth() >= TileGrid2Constants.INSTANCE.getBannerExtraBadgeMinWidth() ? 0 : 8);
                    }
                });
            } else {
                badgeView3.setVisibility(badgeView3.getMeasuredWidth() >= TileGrid2Constants.INSTANCE.getBannerExtraBadgeMinWidth() ? 0 : 8);
            }
        }
        BadgeView badgeView4 = this.extraBadge;
        BadgeDTO extraBadgeDTO = tileGrid2BannerVO.getExtraBadgeDTO();
        if (extraBadgeDTO != null && (testInfo = extraBadgeDTO.getTestInfo()) != null) {
            str = testInfo.getAutomatizationId();
        }
        setBadgeContentDescIfNeed(badgeView4, str);
    }

    private static final void bindBadges$initAndConfigureExtraBadge(TileGrid2BannerView tileGrid2BannerView) {
        Context context = tileGrid2BannerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
        ConstraintLayout.b a11 = a.a(badgeView, R$id.bannerExtraBadge, -2, -2);
        a11.f41598E = 1.0f;
        a11.f41603J = 2;
        a11.f41616W = true;
        badgeView.setLayoutParams(a11);
        tileGrid2BannerView.addView(badgeView);
        d dVar = new d();
        dVar.p(tileGrid2BannerView);
        TileGrid2Constants tileGrid2Constants = TileGrid2Constants.INSTANCE;
        ConstraintLayoutExtensionsKt.topToParent(dVar, badgeView, tileGrid2Constants.getBannerBadgeOuterMargin());
        ConstraintLayoutExtensionsKt.endToStart(dVar, badgeView, tileGrid2BannerView.badge, tileGrid2Constants.getBannerBadgeInnerMargin());
        dVar.Z(badgeView.getId(), 7, tileGrid2Constants.getBannerBadgeOuterMargin());
        ConstraintSetExtKt.startToEnd$default(dVar, R$id.bannerExtraBadge, tileGrid2BannerView.badgesGuideline.getId(), 0, 4, null);
        dVar.f(tileGrid2BannerView);
        tileGrid2BannerView.extraBadge = badgeView;
    }

    private final void bindBottomPadding(int bottomPadding) {
        if (getPaddingBottom() != bottomPadding) {
            setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), bottomPadding);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindContent() {
        TileGrid2BannerVO tileGrid2BannerVO = this.boundItem;
        if (tileGrid2BannerVO == null) {
            return;
        }
        TextHolderKt.bindOrGone$default(this.title, tileGrid2BannerVO.getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.text, tileGrid2BannerVO.getText(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindImage() {
        TileGrid2BannerVO tileGrid2BannerVO = this.boundItem;
        if (tileGrid2BannerVO == null) {
            return;
        }
        bindRatio();
        this.imageView.setScaleType(tileGrid2BannerVO.getScaleType());
        ImageViewExtKt.load$default(this.imageView, tileGrid2BannerVO.getImageUrl(), this.imageTransformations, this.imagePikazonCallback, null, null, true, null, 88, null);
    }

    private final void bindRatio() {
        TileGrid2BannerVO tileGrid2BannerVO = this.boundItem;
        if (tileGrid2BannerVO == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.imageView.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        if (Intrinsics.d(((ConstraintLayout.b) layoutParams).f41600G, tileGrid2BannerVO.getRatio())) {
            return;
        }
        AppCompatImageView appCompatImageView = this.imageView;
        ViewGroup.LayoutParams layoutParams2 = appCompatImageView.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams2;
        bVar.f41600G = tileGrid2BannerVO.getRatio();
        appCompatImageView.setLayoutParams(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindTile() {
        TileGrid2BannerVO tileGrid2BannerVO = this.boundItem;
        if (tileGrid2BannerVO == null) {
            return;
        }
        bindBottomPadding(tileGrid2BannerVO.getBottomPadding());
    }

    private final TileGrid2BannerTouchHelper getTouchHelper() {
        return (TileGrid2BannerTouchHelper) this.touchHelper.getValue();
    }

    private final void setBadgeContentDescIfNeed(View badge, String automatizationId) {
        if (badge == null || automatizationId == null) {
            return;
        }
        badge.setContentDescription(automatizationId);
    }

    public final void bind(@NotNull TileGrid2BannerVO item, @NotNull FrameBinder frameBinder) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(frameBinder, "frameBinder");
        this.boundItem = item;
        frameBinder.bind(this.bindSteps, item.getViewItemKey());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (getTouchHelper().dispatchTouchEventToBadges(ev, this.badge, this.extraBadge)) {
            return true;
        }
        return super.dispatchTouchEvent(ev);
    }

    public final Function0<Unit> getOnImageLoaded() {
        return this.onImageLoaded;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        super.onInitializeAccessibilityNodeInfo(info);
        if (info != null) {
            TileGrid2BannerVO tileGrid2BannerVO = this.boundItem;
            info.setText(tileGrid2BannerVO != null ? tileGrid2BannerVO.getAccesibilityTileID() : null);
        }
    }

    public final void setOnAction(Function1<? super AtomAction, Unit> function1) {
        this.onAction = function1;
    }

    public final void setOnImageLoaded(Function0<Unit> function0) {
        this.onImageLoaded = function0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.TileGrid2BannerView$imagePikazonCallback$1] */
    private TileGrid2BannerView(Context context) {
        super(context);
        this.imagePikazonCallback = new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.TileGrid2BannerView$imagePikazonCallback$1
            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadFailed(Exception exc) {
                PikazonLoaderCallback.DefaultImpls.onLoadFailed(this, exc);
            }

            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadSuccessful(Drawable resource) {
                Function0<Unit> onImageLoaded;
                if (resource == null || (onImageLoaded = TileGrid2BannerView.this.getOnImageLoaded()) == null) {
                    return;
                }
                onImageLoaded.invoke();
            }
        };
        this.bindSteps = C7714v.b0(new TileGrid2BannerView$bindSteps$1(this), new TileGrid2BannerView$bindSteps$2(this), new TileGrid2BannerView$bindSteps$3(this), new TileGrid2BannerView$bindSteps$4(this));
        this.touchHelper = LazyUtilsKt.unsafeLazy(TileGrid2BannerView$touchHelper$2.INSTANCE);
        TileGrid2Constants tileGrid2Constants = TileGrid2Constants.INSTANCE;
        this.imageTransformations = C7714v.a0(new ImageTransformation.RoundedCorners((int) tileGrid2Constants.getContainerCornerRadius(), ImageTransformation.RoundedCorners.CornerType.TOP));
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, 0);
        bVar.f41636i = 0;
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        appCompatImageView.setLayoutParams(bVar);
        addView(appCompatImageView);
        this.imageView = appCompatImageView;
        int i11 = 0;
        int i12 = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, i11, i12, defaultConstructorMarker);
        textAtomV2View.setId(R$id.bannerTitle);
        textAtomV2View.setTextIsSelectable(false);
        textAtomV2View.setVisibility(8);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, -2);
        bVar2.f41638j = appCompatImageView.getId();
        bVar2.f41640k = R$id.bannerText;
        bVar2.f41656t = 0;
        bVar2.f41658v = 0;
        ((ViewGroup.MarginLayoutParams) bVar2).topMargin = tileGrid2Constants.getBannerContentTopMargin();
        bVar2.setMarginStart(tileGrid2Constants.getBannerContentHorizontalMargin());
        bVar2.setMarginEnd(tileGrid2Constants.getBannerContentHorizontalMargin());
        bVar2.f41617X = true;
        bVar2.f41604K = 2;
        bVar2.f41599F = 0.0f;
        textAtomV2View.setLayoutParams(bVar2);
        addView(textAtomV2View);
        this.title = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, i11, i12, defaultConstructorMarker);
        textAtomV2View2.setId(R$id.bannerText);
        textAtomV2View2.setTextIsSelectable(false);
        textAtomV2View2.setVisibility(8);
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(0, -2);
        bVar3.f41638j = R$id.bannerTitle;
        bVar3.f41640k = R$id.bannerButton;
        bVar3.f41656t = 0;
        bVar3.f41658v = 0;
        ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin = tileGrid2Constants.getBannerButtonTopMargin();
        bVar3.f41662z = 0;
        bVar3.setMarginStart(tileGrid2Constants.getBannerContentHorizontalMargin());
        bVar3.setMarginEnd(tileGrid2Constants.getBannerContentHorizontalMargin());
        bVar3.f41660x = tileGrid2Constants.getBannerContentTopMargin();
        bVar3.f41617X = true;
        textAtomV2View2.setLayoutParams(bVar3);
        addView(textAtomV2View2);
        this.text = textAtomV2View2;
        Guideline guideline = new Guideline(context);
        guideline.setId(View.generateViewId());
        ConstraintLayout.b bVar4 = new ConstraintLayout.b(-2, -2);
        bVar4.f41615V = 1;
        bVar4.f41620a = tileGrid2Constants.getBannerBadgeOuterMargin();
        guideline.setLayoutParams(bVar4);
        addView(guideline);
        this.badgesGuideline = guideline;
        BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
        ConstraintLayout.b a11 = a.a(badgeView, R$id.bannerBadge, -2, -2);
        a11.f41616W = true;
        a11.f41636i = 0;
        a11.f41658v = 0;
        a11.f41655s = guideline.getId();
        a11.f41598E = 1.0f;
        ((ViewGroup.MarginLayoutParams) a11).topMargin = tileGrid2Constants.getBannerBadgeOuterMargin();
        a11.setMarginEnd(tileGrid2Constants.getBannerBadgeOuterMargin());
        badgeView.setLayoutParams(a11);
        addView(badgeView);
        this.badge = badgeView;
        setOnClickListener(new FX.a(this, 9));
    }
}
