package ru.ozon.app.android.universalwidgets.widgets.maxiTile.presentation.gallery;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.universalwidgets.widgets.maxiTile.presentation.gallery.MaxiTileGalleryAdapter;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/ColorDrawable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class MaxiTileGalleryAdapter$MaxiTileViewHolder$paranjaDrawable$2 extends AbstractC7737t implements Function0<ColorDrawable> {
    final /* synthetic */ MaxiTileGalleryAdapter.MaxiTileViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MaxiTileGalleryAdapter$MaxiTileViewHolder$paranjaDrawable$2(MaxiTileGalleryAdapter.MaxiTileViewHolder maxiTileViewHolder) {
        super(0);
        this.this$0 = maxiTileViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ColorDrawable invoke() {
        AppCompatImageView appCompatImageView;
        appCompatImageView = this.this$0.view;
        Context context = appCompatImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new ColorDrawable(ThemeExtKt.themeColor(context, R$attr.layerOverlayParanja));
    }
}
