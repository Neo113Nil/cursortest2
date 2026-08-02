package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.navi;

import DN.a;
import WZ.t;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.R$id;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.universalwidgets.databinding.ItemNaviBinding;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.OpenNestedPageExtKt;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.ObjectItemVO;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.UWDeeplink;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 *2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001*B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ#\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00022\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR\u001e\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/navi/UniversalObjectNaviViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "setRoot", "()V", "onViewInVisibleBounds", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemVO;Ll20/d;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "", "dp4", "I", "", "shadowRadius", "F", "cornerRadius", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemVO;", "Ll20/d;", "Lru/ozon/app/android/universalwidgets/databinding/ItemNaviBinding;", "binding", "Lru/ozon/app/android/universalwidgets/databinding/ItemNaviBinding;", "Landroid/graphics/drawable/shapes/RoundRectShape;", "roundRectShape", "Landroid/graphics/drawable/shapes/RoundRectShape;", "Landroid/graphics/drawable/ShapeDrawable;", "tileClDrawable", "Landroid/graphics/drawable/ShapeDrawable;", "Landroid/graphics/drawable/LayerDrawable;", "tileCardDrawable", "Landroid/graphics/drawable/LayerDrawable;", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UniversalObjectNaviViewHolder extends k<ObjectItemVO> {

    @NotNull
    private final ItemNaviBinding binding;
    private final float cornerRadius;
    private final int dp4;
    private d info;
    private ObjectItemVO item;

    @NotNull
    private final ComposerReferences ref;

    @NotNull
    private final RoundRectShape roundRectShape;
    private final float shadowRadius;

    @NotNull
    private final LayerDrawable tileCardDrawable;

    @NotNull
    private final ShapeDrawable tileClDrawable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalObjectNaviViewHolder(@NotNull View containerView, @NotNull ComposerReferences ref) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(ref, "ref");
        this.ref = ref;
        int i11 = 4;
        this.dp4 = ResourceExtKt.toPx(4);
        this.shadowRadius = ResourceExtKt.toPxF(4);
        this.cornerRadius = ResourceExtKt.toPxF(16);
        ItemNaviBinding bind = ItemNaviBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        float[] fArr = new float[8];
        for (int i12 = 0; i12 < 8; i12++) {
            fArr[i12] = this.cornerRadius;
        }
        RoundRectShape roundRectShape = new RoundRectShape(fArr, null, null);
        this.roundRectShape = roundRectShape;
        ShapeDrawable shapeDrawable = new ShapeDrawable(roundRectShape);
        this.tileClDrawable = shapeDrawable;
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(roundRectShape);
        shapeDrawable2.getPaint().setShadowLayer(this.shadowRadius, 0.0f, 0.0f, getContext().getColor(UniColors.GRAPHIC_QUATERNARY.getResId()));
        shapeDrawable2.getPaint().setAlpha(ThemeExtKt.isDarkThemeActive(getContext()) ? 170 : 70);
        this.binding.tileCard.setLayerType(1, shapeDrawable2.getPaint());
        Unit unit = Unit.f71690a;
        LayerDrawable layerDrawable = new LayerDrawable(new ShapeDrawable[]{shapeDrawable2});
        int i13 = this.dp4;
        layerDrawable.setLayerInset(0, i13, i13, i13, i13);
        this.tileCardDrawable = layerDrawable;
        ItemNaviBinding itemNaviBinding = this.binding;
        setRoot();
        itemNaviBinding.tileLl.setOnClickListener(new a(this, i11));
        itemNaviBinding.tileLl.setBackground(shapeDrawable);
        itemNaviBinding.tileLl.setClipToOutline(true);
        itemNaviBinding.tileCard.setBackground(layerDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$5$lambda$4(UniversalObjectNaviViewHolder universalObjectNaviViewHolder, View view) {
        ObjectItemVO objectItemVO = universalObjectNaviViewHolder.item;
        if (objectItemVO != null) {
            UWDeeplink deeplink = objectItemVO.getDeeplink();
            if (deeplink != null) {
                OpenNestedPageExtKt.navigate$default(deeplink, universalObjectNaviViewHolder.ref, "UniversalObjectNaviViewHolder", null, 4, null);
            }
            t tokenizedEvent = objectItemVO.getTokenizedEvent();
            if (tokenizedEvent != null) {
                TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(universalObjectNaviViewHolder.ref.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
            }
        }
    }

    private final void setRoot() {
        this.binding.getConstraintLayout().setTag(R$id.skip_composer_default_widget_background, Unit.f71690a);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        t tokenizedEvent;
        super.onViewInVisibleBounds();
        ObjectItemVO objectItemVO = this.item;
        if (objectItemVO == null || (tokenizedEvent = objectItemVO.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.ref.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ObjectItemVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        if (item.getDesignType() == ObjectItemVO.DesignTypeVO.Type.NAVI_2_G) {
            this.tileClDrawable.getPaint().setColor(ThemeExtKt.themeColor(getContext(), R$attr.layerFloor1));
        } else {
            this.tileClDrawable.getPaint().setColor(ThemeExtKt.themeColor(getContext(), R$attr.layerOverlayParanja));
        }
        if ((item.getImage() == null || item.getImage().length() == 0) && item.getTitle() == null) {
            View itemView = this.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            ViewExtKt.gone(itemView);
            return;
        }
        this.item = item;
        this.info = info;
        View itemView2 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        ViewExtKt.show(itemView2);
        ItemNaviBinding itemNaviBinding = this.binding;
        ImageView tileImageIv = itemNaviBinding.tileImageIv;
        Intrinsics.checkNotNullExpressionValue(tileImageIv, "tileImageIv");
        ImageViewExtKt.load$default(tileImageIv, item.getImage(), null, null, null, null, false, null, 126, null);
        AppCompatTextView tileTitleTv = itemNaviBinding.tileTitleTv;
        Intrinsics.checkNotNullExpressionValue(tileTitleTv, "tileTitleTv");
        TextViewExtKt.setTextOrGone(tileTitleTv, item.getTitle());
        itemNaviBinding.tileTitleTv.setTextColor(ThemeExtKt.themeColor(getContext(), R$attr.textPrimary));
    }
}
