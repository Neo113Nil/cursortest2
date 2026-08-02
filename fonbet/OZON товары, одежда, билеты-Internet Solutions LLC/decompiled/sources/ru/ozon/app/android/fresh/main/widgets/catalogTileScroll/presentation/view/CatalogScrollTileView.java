package ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.presentation.view;

import Bi.b;
import Hj.C3143a;
import WZ.l;
import WZ.t;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.animation.ScaleAnimation;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.data.AnimationType;
import ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.domain.CatalogTile;
import ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.domain.FavoriteBadgeVO;
import ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.presentation.CatalogTileAnimationsKt;
import ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.presentation.view.CatalogScrollTileView;
import ru.ozon.app.android.fresh.main.widgets.header.presentation.IslandDrawable;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u008d\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0007*\u00019\b\u0001\u0018\u0000 >2\u00020\u0001:\u0001>B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJW\u0010\u0017\u001a\u00020\u0011*\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\"\u0010\u0012\u001a\u001e\u0012\f\u0012\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00110\r2\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J9\u0010 \u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00192\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001c2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\"\u0010#J#\u0010(\u001a\u00020\u0011*\u00020$2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0011H\u0014¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0011H\u0014¢\u0006\u0004\b,\u0010+J7\u0010-\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00192\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001c2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e¢\u0006\u0004\b-\u0010!R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/presentation/view/CatalogScrollTileView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/presentation/view/FavoriteBadgeView;", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/domain/FavoriteBadgeVO;", "badgeVO", "Lkotlin/Function2;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onClickWithAnalytics", "Landroid/view/View$OnTouchListener;", "onTouchListener", "Lkotlin/Function0;", "defaultClickAction", "bindOrGone", "(Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/presentation/view/FavoriteBadgeView;Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/domain/FavoriteBadgeVO;Lkotlin/jvm/functions/Function2;Landroid/view/View$OnTouchListener;Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/domain/CatalogTile$TileItemVO;", "tileVo", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lkotlin/Function1;", "handler", "onTileClick", "(Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/domain/CatalogTile$TileItemVO;LWZ/l;Lkotlin/jvm/functions/Function1;)V", "bindBackground", "(Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/domain/CatalogTile$TileItemVO;)V", "Landroid/view/View;", "", "fromScale", "toScale", "scaleAnimation", "(Landroid/view/View;FF)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "bind", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/uni/android/atom/image/Image;", "image", "Lru/ozon/uni/android/atom/image/Image;", "badge", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/presentation/view/FavoriteBadgeView;", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/data/AnimationType;", "currentAnimationType", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/data/AnimationType;", "ru/ozon/app/android/fresh/main/widgets/catalogTileScroll/presentation/view/CatalogScrollTileView$tileOutlineProvide$1", "tileOutlineProvide", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/presentation/view/CatalogScrollTileView$tileOutlineProvide$1;", "touchListener", "Landroid/view/View$OnTouchListener;", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes12.dex */
public final class CatalogScrollTileView extends ConstraintLayout {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final float DP_16 = ResourceExtKt.toPxF(16);

    @NotNull
    private static final float[] backgroundCorners;

    @NotNull
    private final FavoriteBadgeView badge;

    @NotNull
    private AnimationType currentAnimationType;

    @NotNull
    private final Image image;

    @NotNull
    private final CatalogScrollTileView$tileOutlineProvide$1 tileOutlineProvide;

    @NotNull
    private final TextAtomV2View title;

    @NotNull
    private final View.OnTouchListener touchListener;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/presentation/view/CatalogScrollTileView$Companion;", "", "<init>", "()V", "", "CATALOG_SCROLL_TILE", "Ljava/lang/String;", "CATALOG_SCROLL_TILE_TITLE", "", "ZERO_PADDING", "F", "DEFAULT_SCALE", "PRESS_SCALE", "CENTER_PIVOT", "", "SNEEZE_TIME", "J", "DP_16", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
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

    private final void bindOrGone(FavoriteBadgeView favoriteBadgeView, FavoriteBadgeVO favoriteBadgeVO, Function2<? super t, ? super AtomAction, Unit> function2, View.OnTouchListener onTouchListener, Function0<Unit> function0) {
        if (favoriteBadgeVO == null) {
            favoriteBadgeView.setVisibility(8);
        } else {
            favoriteBadgeView.setVisibility(0);
            favoriteBadgeView.bind(favoriteBadgeVO, function2, onTouchListener, function0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTileClick(CatalogTile.TileItemVO tileVo, l tokenizedAnalytics, Function1<? super AtomAction, Unit> handler) {
        t tokenizedEvent = tileVo.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
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
    public static final boolean touchListener$lambda$6(CatalogScrollTileView catalogScrollTileView, Context context, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            catalogScrollTileView.scaleAnimation(catalogScrollTileView, 1.0f, 0.96f);
            catalogScrollTileView.setForeground(new IslandDrawable(0, a.getColor(context, UniColors.LAYER_OVERLAY_PARANJA.getResId()), backgroundCorners, 0.0f, 0.0f, 0.0f, 0.0f));
            return false;
        }
        if (action != 1 && action != 3) {
            return false;
        }
        catalogScrollTileView.scaleAnimation(catalogScrollTileView, 0.96f, 1.0f);
        catalogScrollTileView.setForeground(null);
        return false;
    }

    public final void bind(@NotNull final CatalogTile.TileItemVO tileVo, @NotNull final l tokenizedAnalytics, final Function1<? super AtomAction, Unit> handler) {
        Intrinsics.checkNotNullParameter(tileVo, "tileVo");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        bindBackground(tileVo);
        TextHolderKt.bindOrGone$default(this.title, tileVo.getTitle(), null, 2, null);
        ImageViewExtKt.load$default(this.image, tileVo.getImage(), null, null, null, null, false, null, 126, null);
        bindOrGone(this.badge, tileVo.getBadge(), new CatalogScrollTileView$bind$2(tokenizedAnalytics, handler), this.touchListener, new CatalogScrollTileView$bind$1(this));
        this.currentAnimationType = tileVo.getAnimationType();
        this.title.setOnClickListener(new View.OnClickListener() { // from class: Vv.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CatalogScrollTileView.this.onTileClick(tileVo, tokenizedAnalytics, handler);
            }
        });
        this.title.setOnTouchListener(this.touchListener);
        setOnClickListener(new View.OnClickListener() { // from class: Vv.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CatalogScrollTileView.this.onTileClick(tileVo, tokenizedAnalytics, handler);
            }
        });
        setOnTouchListener(this.touchListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnimationType animationType = this.currentAnimationType;
        if (animationType != AnimationType.NONE) {
            CatalogTileAnimationsKt.applyTileAnimation(this.image, animationType);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.image.clearAnimation();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.view.ViewOutlineProvider, ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.presentation.view.CatalogScrollTileView$tileOutlineProvide$1] */
    public CatalogScrollTileView(@NotNull final Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.title, -2, 0);
        d11.f41628e = 0;
        d11.f41636i = 0;
        d11.f41634h = 0;
        d11.f41598E = 0.0f;
        textAtomV2View.setLayoutParams(d11);
        TextViewExtKt.setTextCopyable(textAtomV2View, false);
        this.title = textAtomV2View;
        Image image = new Image(context, null, 0, 6, null);
        image.setId(R$id.image);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -1);
        bVar.f41628e = 0;
        bVar.f41636i = 0;
        bVar.f41642l = 0;
        bVar.f41634h = 0;
        image.setLayoutParams(bVar);
        this.image = image;
        FavoriteBadgeView favoriteBadgeView = new FavoriteBadgeView(context, null, 0, 6, null);
        favoriteBadgeView.setId(R$id.badge);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(-2, -2);
        bVar2.f41642l = 0;
        bVar2.f41628e = 0;
        favoriteBadgeView.setLayoutParams(bVar2);
        this.badge = favoriteBadgeView;
        this.currentAnimationType = AnimationType.NONE;
        ?? r22 = new ViewOutlineProvider() { // from class: ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.presentation.view.CatalogScrollTileView$tileOutlineProvide$1
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
        this.touchListener = new View.OnTouchListener() { // from class: Vv.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean z11;
                z11 = CatalogScrollTileView.touchListener$lambda$6(CatalogScrollTileView.this, context, view, motionEvent);
                return z11;
            }
        };
        setContentDescription("catalogScrollTile");
        textAtomV2View.setLocatorTag("catalogScrollTileTitle");
        setLayoutParams(new ConstraintLayout.b(0, 0));
        addView(image);
        addView(textAtomV2View);
        addView(favoriteBadgeView);
        setClipToOutline(true);
        setOutlineProvider(r22);
    }
}
