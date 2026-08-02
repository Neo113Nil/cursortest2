package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.presentation.decorator;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m10.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefrontcommonwidgets.utils.Dimens;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.presentation.TileGrid3ViewHolder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.presentation.data.TileGrid3VO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/presentation/decorator/TileGrid3Decorator;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/presentation/decorator/BaseGridOffsetColorDecorator;", "<init>", "()V", "Landroid/graphics/Rect;", "", "rightOffset", "", "updateOffsets", "(Landroid/graphics/Rect;I)V", "spanPosition", "outRect", "itemOffsetWithSpanPosition", "(ILandroid/graphics/Rect;)V", "Ljava/lang/Class;", "Landroidx/recyclerview/widget/RecyclerView$C;", "decoratedVhClass", "", "needDecorate", "(Ljava/lang/Class;)Z", "Lm10/l;", "adapter", "position", "", "getBackgroundColorToken", "(Lm10/l;I)Ljava/lang/String;", "topMargin", "I", "getTopMargin", "()I", "setTopMargin", "(I)V", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TileGrid3Decorator extends BaseGridOffsetColorDecorator {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int itemOffset = ResourceExtKt.toPx(2);
    private int topMargin = Dimens.INSTANCE.getDP_6();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/presentation/decorator/TileGrid3Decorator$Companion;", "", "<init>", "()V", "itemOffset", "", "getItemOffset", "()I", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getItemOffset() {
            return TileGrid3Decorator.itemOffset;
        }

        private Companion() {
        }
    }

    private final void updateOffsets(Rect rect, int i11) {
        BaseGridOffsetColorDecorator.updateRect$default(this, rect, null, Integer.valueOf(i11), Integer.valueOf(this.topMargin), null, 9, null);
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.presentation.decorator.BaseGridOffsetColorDecorator
    public String getBackgroundColorToken(@NotNull l adapter, int position) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        c b11 = adapter.b(position);
        TileGrid3VO tileGrid3VO = b11 instanceof TileGrid3VO ? (TileGrid3VO) b11 : null;
        if (tileGrid3VO == null) {
            return null;
        }
        return tileGrid3VO.getBackgroundColor();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.presentation.decorator.BaseGridOffsetColorDecorator
    public void itemOffsetWithSpanPosition(int spanPosition, @NotNull Rect outRect) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        if (spanPosition == 0 || spanPosition == 1) {
            updateOffsets(outRect, itemOffset);
        } else {
            if (spanPosition != 2) {
                return;
            }
            updateOffsets(outRect, 0);
        }
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.presentation.decorator.BaseGridOffsetColorDecorator
    public boolean needDecorate(@NotNull Class<? extends RecyclerView.C> decoratedVhClass) {
        Intrinsics.checkNotNullParameter(decoratedVhClass, "decoratedVhClass");
        return Intrinsics.d(decoratedVhClass, TileGrid3ViewHolder.class);
    }

    public final void setTopMargin(int i11) {
        this.topMargin = i11;
    }
}
