package ru.ozon.app.android.pdp.widgets.richContent.presentation.binderDelegate;

import Az.ViewOnClickListenerC2453a;
import WZ.t;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$drawable;
import ru.ozon.app.android.pdp.databinding.WidgetRichContentDoubleTileBinding;
import ru.ozon.app.android.pdp.databinding.WidgetRichContentTileBinding;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.ImageExtKt;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentVO;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.TileVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001JK\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/presentation/binderDelegate/RichContentDoubleTileBinderDelegate;", "", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/TileVO;", "item", "Lru/ozon/app/android/pdp/databinding/WidgetRichContentTileBinding;", "binding", "Lkotlin/Function0;", "Landroid/graphics/drawable/Drawable;", "backgroundColor", "Lkotlin/Function2;", "Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "", "onClickAction", "bindTile", "(Lru/ozon/app/android/pdp/widgets/richContent/presentation/TileVO;Lru/ozon/app/android/pdp/databinding/WidgetRichContentTileBinding;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)V", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface RichContentDoubleTileBinderDelegate {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void bindDoubleTile(@NotNull RichContentDoubleTileBinderDelegate richContentDoubleTileBinderDelegate, @NotNull WidgetRichContentDoubleTileBinding receiver, @NotNull RichContentVO.Item.DoubleTile item, @NotNull Function0<? extends Drawable> backgroundColor, @NotNull Function2<? super AtomAction, ? super t, Unit> onClickAction) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(onClickAction, "onClickAction");
            TileVO left = item.getLeft();
            WidgetRichContentTileBinding leftTileLL = receiver.leftTileLL;
            Intrinsics.checkNotNullExpressionValue(leftTileLL, "leftTileLL");
            bindTile(richContentDoubleTileBinderDelegate, left, leftTileLL, backgroundColor, onClickAction);
            if (item.getRight() == null) {
                LinearLayout constraintLayout = receiver.rightTileLL.getConstraintLayout();
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
                ViewExtKt.gone(constraintLayout);
                View rightV = receiver.rightV;
                Intrinsics.checkNotNullExpressionValue(rightV, "rightV");
                ViewExtKt.gone(rightV);
                return;
            }
            LinearLayout constraintLayout2 = receiver.rightTileLL.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
            ViewExtKt.show(constraintLayout2);
            View rightV2 = receiver.rightV;
            Intrinsics.checkNotNullExpressionValue(rightV2, "rightV");
            ViewExtKt.show(rightV2);
            TileVO right = item.getRight();
            WidgetRichContentTileBinding rightTileLL = receiver.rightTileLL;
            Intrinsics.checkNotNullExpressionValue(rightTileLL, "rightTileLL");
            bindTile(richContentDoubleTileBinderDelegate, right, rightTileLL, backgroundColor, onClickAction);
        }

        private static void bindTile(RichContentDoubleTileBinderDelegate richContentDoubleTileBinderDelegate, TileVO tileVO, WidgetRichContentTileBinding widgetRichContentTileBinding, Function0<? extends Drawable> function0, Function2<? super AtomAction, ? super t, Unit> function2) {
            ImageView richTileIV = widgetRichContentTileBinding.richTileIV;
            Intrinsics.checkNotNullExpressionValue(richTileIV, "richTileIV");
            ImageViewExtKt.load$default(richTileIV, tileVO.getImage(), null, null, Integer.valueOf(R$drawable.ic_m_gallery_rich_error), null, false, null, 118, null);
            ImageView richTileIV2 = widgetRichContentTileBinding.richTileIV;
            Intrinsics.checkNotNullExpressionValue(richTileIV2, "richTileIV");
            ImageExtKt.setImageParams$default(richTileIV2, tileVO.getImagePosition(), tileVO.getIsParandja(), function0, false, 8, null);
            TextAtomV2View richTileTitleTV = widgetRichContentTileBinding.richTileTitleTV;
            Intrinsics.checkNotNullExpressionValue(richTileTitleTV, "richTileTitleTV");
            TextHolderKt.bindOrGone$default(richTileTitleTV, tileVO.getTitle(), null, 2, null);
            TextAtomV2View richTileTextTV = widgetRichContentTileBinding.richTileTextTV;
            Intrinsics.checkNotNullExpressionValue(richTileTextTV, "richTileTextTV");
            TextHolderKt.bindOrGone$default(richTileTextTV, tileVO.getText(), null, 2, null);
            TextAtomV2View richTileTitleTV2 = widgetRichContentTileBinding.richTileTitleTV;
            Intrinsics.checkNotNullExpressionValue(richTileTitleTV2, "richTileTitleTV");
            ViewGroup.LayoutParams layoutParams = richTileTitleTV2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = tileVO.getTitleBottomMargin();
            richTileTitleTV2.setLayoutParams(layoutParams2);
            widgetRichContentTileBinding.getConstraintLayout().setOnClickListener(tileVO.getAction() != null ? new ViewOnClickListenerC2453a(2, function2, tileVO) : null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void bindTile$lambda$5$lambda$4$lambda$3(Function2 function2, TileVO tileVO, View view) {
            function2.invoke(tileVO.getAction(), tileVO.getTokenizedEvent());
        }
    }
}
