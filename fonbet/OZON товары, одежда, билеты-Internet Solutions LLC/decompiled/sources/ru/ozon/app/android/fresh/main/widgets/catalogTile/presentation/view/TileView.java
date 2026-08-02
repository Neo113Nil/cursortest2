package ru.ozon.app.android.fresh.main.widgets.catalogTile.presentation.view;

import Bi.b;
import Hj.C3143a;
import Tv.c;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.app.android.fresh.main.widgets.catalogTile.presentation.CatalogTileVO;
import ru.ozon.app.android.fresh.main.widgets.catalogTile.presentation.view.TileView;
import ru.ozon.app.android.fresh.main.widgets.header.presentation.IslandDrawable;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u007f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001/\b\u0000\u0018\u0000 52\u00020\u0001:\u00015B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJE\u0010\u0014\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0018\u0010\u0011\u001a\u0014\u0012\b\u0012\u00060\u000ej\u0002`\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00100\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001c\u001a\u00020\u0010*\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ1\u0010 \u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00100\r¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00066"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/view/TileView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "", "viewId", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;ILandroid/util/AttributeSet;I)V", "Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO$TileVO;", "tileVo", "Lkotlin/Function1;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "", "onAnalyticClickEvent", "Lru/ozon/uni/atoms/af/AtomAction;", "handler", "onTileClick", "(Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO$TileVO;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "bindBackground", "(Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO$TileVO;)V", "Landroid/view/View;", "", "fromScale", "toScale", "scaleAnimation", "(Landroid/view/View;FF)V", "LWZ/l;", "tokenizedAnalytics", "bind", "(Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO$TileVO;LWZ/l;Lkotlin/jvm/functions/Function1;)V", "", "presetType", "setPresetTypeForImage", "(Ljava/lang/String;)V", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Landroid/widget/ImageView;", "image", "Landroid/widget/ImageView;", "Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/view/FavoriteBadgeView;", "badge", "Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/view/FavoriteBadgeView;", "ru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/view/TileView$tileOutlineProvider$1", "tileOutlineProvider", "Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/view/TileView$tileOutlineProvider$1;", "Landroid/view/View$OnTouchListener;", "touchListener", "Landroid/view/View$OnTouchListener;", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TileView extends ConstraintLayout {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final float DP_16F;

    @NotNull
    private static final float[] islandCorners;

    @NotNull
    private final FavoriteBadgeView badge;

    @NotNull
    private final ImageView image;

    @NotNull
    private final TileView$tileOutlineProvider$1 tileOutlineProvider;

    @NotNull
    private final TextAtomV2View title;

    @NotNull
    private final View.OnTouchListener touchListener;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/view/TileView$Companion;", "", "<init>", "()V", "", "DP_16F", "F", "getDP_16F", "()F", "DEFAULT_SCALE", "PRESS_SCALE", "CENTER_PIVOT", "", "SNEEZE_TIME", "J", "", "CATALOG_TILE_IMAGE", "Ljava/lang/String;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getDP_16F() {
            return TileView.DP_16F;
        }

        private Companion() {
        }
    }

    static {
        float pxF = UiExtKt.toPxF(16);
        DP_16F = pxF;
        islandCorners = new float[]{pxF, pxF, pxF, pxF, pxF, pxF, pxF, pxF};
    }

    public /* synthetic */ TileView(Context context, int i11, AttributeSet attributeSet, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i11, (i13 & 4) != 0 ? null : attributeSet, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$10(TileView tileView, CatalogTileVO.TileVO tileVO, l lVar, Function1 function1, View view) {
        tileView.onTileClick(tileVO, new TileView$bind$3$1(lVar), function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$8(TileView tileView, CatalogTileVO.TileVO tileVO, l lVar, Function1 function1, View view) {
        tileView.onTileClick(tileVO, new TileView$bind$2$1(lVar), function1);
    }

    private final void bindBackground(CatalogTileVO.TileVO tileVo) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackground(new IslandDrawable(0, styleParser.parseColor(context, tileVo.getBackgroundColor(), UniColors.BG_PRIMARY.getResId()), islandCorners, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    private final void onTileClick(CatalogTileVO.TileVO tileVo, Function1<? super t, Unit> onAnalyticClickEvent, Function1<? super AtomAction, Unit> handler) {
        t tokenizedEvent = tileVo.getTokenizedEvent();
        if (tokenizedEvent != null && onAnalyticClickEvent != null) {
            onAnalyticClickEvent.invoke(tokenizedEvent);
        }
        AtomAction action = tileVo.getAction();
        if (action != null) {
            handler.invoke(action);
        }
    }

    private final void scaleAnimation(View view, float f7, float f11) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(f7, f11, f7, f11, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(100L);
        scaleAnimation.setFillAfter(true);
        view.startAnimation(scaleAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean touchListener$lambda$6(TileView tileView, Context context, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            tileView.scaleAnimation(tileView, 1.0f, 0.96f);
            tileView.setForeground(new IslandDrawable(0, a.getColor(context, UniColors.LAYER_OVERLAY_PARANJA.getResId()), islandCorners, 0.0f, 0.0f, 0.0f, 0.0f));
            return false;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        }
        tileView.scaleAnimation(tileView, 0.96f, 1.0f);
        tileView.setForeground(null);
        return false;
    }

    public final void bind(@NotNull final CatalogTileVO.TileVO tileVo, @NotNull final l tokenizedAnalytics, @NotNull final Function1<? super AtomAction, Unit> handler) {
        Intrinsics.checkNotNullParameter(tileVo, "tileVo");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(handler, "handler");
        bindBackground(tileVo);
        ImageViewExtKt.load$default(this.image, tileVo.getImage(), null, null, null, null, false, null, 126, null);
        TextHolderKt.bindOrGone$default(this.title, tileVo.getTitle(), null, 2, null);
        CatalogTileVO.FavoriteBadge badge = tileVo.getBadge();
        if (badge != null) {
            this.badge.bind(badge, new TileView$bind$1$2(tokenizedAnalytics, handler), this.touchListener, new TileView$bind$1$1(this));
        }
        this.title.setOnClickListener(new View.OnClickListener() { // from class: Tv.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TileView.bind$lambda$8(TileView.this, tileVo, tokenizedAnalytics, handler, view);
            }
        });
        this.title.setOnTouchListener(this.touchListener);
        setOnClickListener(new View.OnClickListener() { // from class: Tv.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TileView.bind$lambda$10(TileView.this, tileVo, tokenizedAnalytics, handler, view);
            }
        });
        setOnTouchListener(this.touchListener);
        invalidate();
        requestLayout();
    }

    public final void setPresetTypeForImage(@NotNull String presetType) {
        Intrinsics.checkNotNullParameter(presetType, "presetType");
        this.image.setContentDescription("catalogTileImage; type_" + presetType);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.ViewOutlineProvider, ru.ozon.app.android.fresh.main.widgets.catalogTile.presentation.view.TileView$tileOutlineProvider$1] */
    public TileView(@NotNull Context context, int i11, AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.title, 0, -2);
        d11.f41628e = 0;
        d11.f41636i = 0;
        textAtomV2View.setLayoutParams(d11);
        TextViewExtKt.setTextCopyable(textAtomV2View, false);
        this.title = textAtomV2View;
        ImageView imageView = new ImageView(context);
        imageView.setId(R$id.image);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, 0);
        bVar.f41628e = 0;
        bVar.f41636i = 0;
        bVar.f41642l = 0;
        bVar.f41634h = 0;
        imageView.setLayoutParams(bVar);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        this.image = imageView;
        FavoriteBadgeView favoriteBadgeView = new FavoriteBadgeView(context, null, 0, 6, null);
        favoriteBadgeView.setId(R$id.badge);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(-2, -2);
        bVar2.f41628e = 0;
        bVar2.f41642l = 0;
        favoriteBadgeView.setVisibility(8);
        favoriteBadgeView.setLayoutParams(bVar2);
        this.badge = favoriteBadgeView;
        ?? r22 = new ViewOutlineProvider() { // from class: ru.ozon.app.android.fresh.main.widgets.catalogTile.presentation.view.TileView$tileOutlineProvider$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                TileView.Companion companion;
                int f7 = C3143a.f(view, "view", outline, "outline");
                int height = view.getHeight();
                companion = TileView.Companion;
                outline.setRoundRect(0, 0, f7, height, companion.getDP_16F());
            }
        };
        this.tileOutlineProvider = r22;
        this.touchListener = new c(0, this, context);
        setLayoutParams(new ConstraintLayout.b(0, 0));
        addView(imageView);
        addView(textAtomV2View);
        addView(favoriteBadgeView);
        setClipToOutline(true);
        setOutlineProvider(r22);
        setId(i11);
    }
}
