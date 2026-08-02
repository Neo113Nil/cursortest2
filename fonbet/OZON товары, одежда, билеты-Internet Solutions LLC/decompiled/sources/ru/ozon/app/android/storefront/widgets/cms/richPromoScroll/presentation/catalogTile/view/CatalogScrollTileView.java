package ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.presentation.catalogTile.view;

import BK.a;
import BK.c;
import Bi.b;
import Hj.C3143a;
import Sc.InterfaceC4008j;
import Sc.k;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.animation.ScaleAnimation;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.presentation.catalogTile.view.CatalogScrollTileView;
import ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.presentation.catalogTile.view.CatalogTile;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001)\b\u0001\u0018\u0000 /2\u00020\u0001:\u0001/B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0018\u001a\u00020\u000e*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0004\b\u001c\u0010\u0011R\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/catalogTile/view/CatalogScrollTileView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/catalogTile/view/CatalogTile$TileItemVO;", "tileVo", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "handler", "onTileClick", "(Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/catalogTile/view/CatalogTile$TileItemVO;Lkotlin/jvm/functions/Function1;)V", "bindBackground", "(Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/catalogTile/view/CatalogTile$TileItemVO;)V", "Landroid/view/View;", "", "fromScale", "toScale", "scaleAnimation", "(Landroid/view/View;FF)V", "onDetachedFromWindow", "()V", "bind", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/uni/android/atom/image/Image;", "image", "Lru/ozon/uni/android/atom/image/Image;", "Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/catalogTile/view/IslandDrawable;", "islandDrawable$delegate", "LSc/j;", "getIslandDrawable", "()Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/catalogTile/view/IslandDrawable;", "islandDrawable", "ru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/catalogTile/view/CatalogScrollTileView$tileOutlineProvide$1", "tileOutlineProvide", "Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/catalogTile/view/CatalogScrollTileView$tileOutlineProvide$1;", "Landroid/view/View$OnTouchListener;", "touchListener", "Landroid/view/View$OnTouchListener;", "Companion", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes2.dex */
public final class CatalogScrollTileView extends ConstraintLayout {

    @NotNull
    private static final float[] backgroundCorners;

    @NotNull
    private final Image image;

    /* renamed from: islandDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j islandDrawable;

    @NotNull
    private final CatalogScrollTileView$tileOutlineProvide$1 tileOutlineProvide;

    @NotNull
    private final TextAtomV2View title;

    @NotNull
    private final View.OnTouchListener touchListener;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final float DP_16 = ResourceExtKt.toPxF(16);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.presentation.catalogTile.view.CatalogScrollTileView$1, reason: invalid class name */
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
            ConstraintSetExtKt.startToStart$default(updateConstraints, CatalogScrollTileView.this.title.getId(), 0, 0, 4, null);
            ConstraintSetExtKt.topToTop$default(updateConstraints, CatalogScrollTileView.this.title.getId(), 0, 0, 4, null);
            ConstraintSetExtKt.endToEnd$default(updateConstraints, CatalogScrollTileView.this.title.getId(), 0, 0, 4, null);
            ConstraintSetExtKt.startToStart$default(updateConstraints, CatalogScrollTileView.this.image.getId(), 0, 0, 4, null);
            ConstraintSetExtKt.topToTop$default(updateConstraints, CatalogScrollTileView.this.image.getId(), 0, 0, 4, null);
            ConstraintSetExtKt.endToEnd$default(updateConstraints, CatalogScrollTileView.this.image.getId(), 0, 0, 4, null);
            ConstraintSetExtKt.bottomToBottom$default(updateConstraints, CatalogScrollTileView.this.image.getId(), 0, 0, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/catalogTile/view/CatalogScrollTileView$Companion;", "", "<init>", "()V", "CATALOG_SCROLL_TILE", "", "CATALOG_SCROLL_TILE_TITLE", "ZERO_PADDING", "", "DEFAULT_SCALE", "PRESS_SCALE", "CENTER_PIVOT", "SNEEZE_TIME", "", "DP_16", "backgroundCorners", "", "getBackgroundCorners", "()[F", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final float[] getBackgroundCorners() {
            return CatalogScrollTileView.backgroundCorners;
        }

        private Companion() {
        }
    }

    static {
        float[] fArr = new float[8];
        for (int i11 = 0; i11 < 8; i11++) {
            fArr[i11] = DP_16;
        }
        backgroundCorners = fArr;
    }

    public /* synthetic */ CatalogScrollTileView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void bindBackground(CatalogTile.TileItemVO tileVo) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackground(new IslandDrawable(0, styleParser.parseColor(context, tileVo.getBackgroundColor(), UniColors.BG_PRIMARY.getResId()), backgroundCorners, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    private final IslandDrawable getIslandDrawable() {
        return (IslandDrawable) this.islandDrawable.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTileClick(CatalogTile.TileItemVO tileVo, Function1<? super AtomAction, Unit> handler) {
        if (handler != null) {
            handler.invoke(tileVo.getAction());
        }
    }

    private final void scaleAnimation(View view, float f7, float f11) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(f7, f11, f7, f11, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(100L);
        scaleAnimation.setFillAfter(true);
        view.startAnimation(scaleAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean touchListener$lambda$3(CatalogScrollTileView catalogScrollTileView, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            catalogScrollTileView.scaleAnimation(catalogScrollTileView, 1.0f, 0.96f);
            catalogScrollTileView.setForeground(catalogScrollTileView.getIslandDrawable());
            return false;
        }
        if (action != 1 && action != 3) {
            return false;
        }
        catalogScrollTileView.scaleAnimation(catalogScrollTileView, 0.96f, 1.0f);
        catalogScrollTileView.setForeground(null);
        return false;
    }

    public final void bind(@NotNull final CatalogTile.TileItemVO tileVo, final Function1<? super AtomAction, Unit> handler) {
        Intrinsics.checkNotNullParameter(tileVo, "tileVo");
        bindBackground(tileVo);
        TextHolderKt.bindOrGone$default(this.title, tileVo.getTitle(), null, 2, null);
        ImageViewExtKt.load$default(this.image, tileVo.getImage(), null, null, null, null, false, null, 126, null);
        this.title.setOnClickListener(new View.OnClickListener() { // from class: BK.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CatalogScrollTileView.this.onTileClick(tileVo, handler);
            }
        });
        this.title.setOnTouchListener(this.touchListener);
        setOnClickListener(new c(this, tileVo, handler, 0));
        setOnTouchListener(this.touchListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.image.clearAnimation();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [android.view.ViewOutlineProvider, ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.presentation.catalogTile.view.CatalogScrollTileView$tileOutlineProvide$1] */
    public CatalogScrollTileView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        AttributeSet attributeSet2 = null;
        int i12 = 0;
        int i13 = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, attributeSet2, i12, i13, defaultConstructorMarker);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R.id.title, -2, 0);
        d11.f41598E = 0.0f;
        textAtomV2View.setLayoutParams(d11);
        TextViewExtKt.setTextCopyable(textAtomV2View, false);
        this.title = textAtomV2View;
        Image image = new Image(context, attributeSet2, i12, i13, defaultConstructorMarker);
        image.setId(R.id.image);
        image.setLayoutParams(new ConstraintLayout.b(0, -1));
        this.image = image;
        this.islandDrawable = k.b(CatalogScrollTileView$islandDrawable$2.INSTANCE);
        ?? r22 = new ViewOutlineProvider() { // from class: ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.presentation.catalogTile.view.CatalogScrollTileView$tileOutlineProvide$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                float f7;
                int f11 = C3143a.f(view, "view", outline, "outline");
                int height = view.getHeight();
                f7 = CatalogScrollTileView.DP_16;
                outline.setRoundRect(0, 0, f11, height, f7);
            }
        };
        this.tileOutlineProvide = r22;
        this.touchListener = new a(this, i12);
        setContentDescription("catalogScrollTile");
        textAtomV2View.setLocatorTag("catalogScrollTileTitle");
        setLayoutParams(new ConstraintLayout.b(0, 0));
        addView(image);
        addView(textAtomV2View);
        setClipToOutline(true);
        setOutlineProvider(r22);
        ConstraintLayoutExtKt.updateConstraints(this, new AnonymousClass1());
    }
}
